---
title: "Les exceptions"
weight: 6
---

# Les exceptions

## Les erreurs/exceptions en Java

<p>La grande majorité des langages de programmation modernes peuvent générer des fautes à la compilation (par exemple l'oubli d'un ; à la fin d'une ligne de code) et à l'exécution. Dans le langage Java, lorsqu'il y a une faute à l'exécution, une exception ou une erreur particulière est générée par la machine virtuelle Java (JVM) : StackOverflowError, DataFormatException, etc. Il faut distinguer d'abord ce qu'est une exception et une erreur. Une erreur (les classes dérivées de <a href="https://docs.oracle.com/javase/8/docs/api/?java/lang/Error.html">Error</a>) est un événement grave que tout "bon" logiciel ne devrait pas "attraper" (avec le try-catch) et amener la fin de l'exécution du programme. Une exception (les classes dérivées de <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html">Exception</a>) est une faute qui peut être gérée, ou non, par le programme et que l'on peut qualifier de moins grave. 
</p>

<p>La gestion des erreurs et des exceptions par un programme permet d'ajouter de la fiabilité et de permettre à un programme à continuer de fonctionner malgré des erreurs internes ou externes. Cette gestion permet également de notifier les utilisateurs ou les développeurs de la génération d'une faute. Par exemple, si une application nécessite l'ouverture d'une communication TCP/IP entre le programme et un serveur externe, et que cette communication est coupée pour une raison externe à l'application (ex. perte du réseau). Il est alors raisonnable d'informer l'utilisateur et/ou de gérer cette exception, par exemple, en tentant après un certain délai une nouvelle connexion au serveur.</p>

## La structure Try-Catch

<p>La structure try-catch permet "d'enrober" une partie du code dans une structure permettant de récupérer les erreurs ou fautes lancées par la JVM ou l'application et gérer celles-ci. Voici la structure générale d'un try-catch pour une exception et une erreur:</p>

```java  {style=github}
try {
    //Code ...
} catch (Exception e) {
    //Gestion de l'exception
}

try {
    //Code ...
} catch (Error e) {
    //Gestion de l'erreur
}
```

<p>Dans le code ci-dessus, la partie intérieure de la structure comprend le code susceptible de générer des fautes ou exception. La partie inférieure (après le catch) permet l'ajout de code pour gérer l'erreur ou l'exception. L'exemple ci-dessus présente la gestion d'une erreur système, par contre, comme nous l'avons mentionné auparavant, il est généralement déconseillé "d'attraper" les erreurs (et non les exceptions). Toutefois, il peut être utile d'attraper celles-ci, de les journaliser et d'ensuite cesser l'exécution du programme. Voici quelques exemples de façon de gérer les exceptions ou erreurs :</p>

```java  {style=github}
try {
    //Code ...
} catch (Exception e) {
    
    // Vient imprimer l'erreur dans la console/terminal. Il est d'usage d'imprimer l'exception lorsque celle-ci est attrapée.
    e.printStackTrace();
}

try {
    //Code ...
} catch (Exception e) {
    
    // Vient imprimer l'erreur dans la console/terminal. Il est d'usage d'imprimer l'exception lorsque celle-ci est attrapée.
    e.printStackTrace();
    // Relance l'erreur à l'extérieur de la portée du try-catch. Peut-être utile dans certaines occcasions.
    throw e;
}

try {
    //Code ...
} catch (Exception e) {
    
    // Vient imprimer l'erreur dans la console/terminal. Il est d'usage d'imprimer l'exception lorsque celle-ci est attrapée.
    e.printStackTrace();
    // Permet d'arrêter l'exécution du programme par la JVM. Le paramètre 1 indique en général l'arrêt par une faute, alors que System.exit(0) est l'arrêt normal d'un programme.
    System.exit(1);
    
}

try {
    //Code ...
} catch (Exception e) {
    
    // Vient imprimer l'erreur dans un journal nommé "Erreur.log".
    Logger.getLogger("Erreur.log").severe(e.getMessage());

}
```

<p>Il est également possible d'utiliser plusieurs catchs afin de mieux gérer le type d'exception. Dans l'exemple ci-dessous, l'exception de type NullPointerException sera "attrapée" avant l'Exception générale :</p>

```java  {style=github}
try {
    String test = null;
    test.charAt(0);
} catch (NullPointerException e) {
    // l'accès à l'objet test qui est null va lancer une exception de tytpe NullPointerException
    e.printStackTrace();
} catch (Exception e) {
    e.printStackTrace();
}
```

<p>Les erreurs et exceptions peuvent être causées par les développeurs ayant introduit des "bugs" dans leur logiciel, par exemple l'accès à un index hors de la taille d'un tableau ou bien une division par zéro. Elles peuvent également être lancées volontairement par les programmeurs dans certaines conditions (voir section suivante). Enfin, comme nous l'avions introduit plus tôt, les exceptions ou erreurs peuvent également être produites par des événements externes au programme et sont hors de contrôle des développeurs, par exemple un lien réseau perdu, l'entrée d'un caractère inconnu ou non géré par l'utilisateur (ex. symbole chinois), fichier corrompu, etc.</p>


## Lancer des exceptions

<p>Il est possible dans une application de lancer des exceptions dans le code en utilisant le mot-clé "throw" et le faisant suivant par l'instanciation d'un objet de type Exception ou ses sous-classes (l'héritage sera vu dans le prochain module) : NullPointerException, SQLException, etc. : </p>

```java  {style=github}
throw new Exception();

// Exemple d'exception pouvant être lié à des requêtes SQL
throw new SQLException("USER DOESN'T EXIST");
```

<p>Toutefois, une fois une exception lancée, il est nécessaire de la récupérée à un certain moment, sinon, elle remontera de méthode en méthode jusqu'à la méthode "main" et amènera l'arrêt du programme. Pour ce faire, il faut soit : attraper la faute dans une structure try-catch ou bien lancer l'exception à la méthode ayant invoqué la méthode où l'exception est lancée. Pour ce faire, il faut ajouter à la fin de la description d'une méthode/fonction, le mots-clé "throws". Il y a donc une hiérarchie d'appel de méthode et si l'exception n'est pas attrapée, celle-ci remontera les appels jusqu'au niveau supérieur, soit la méthode main. Voici un exemple pour illustrer cette remontée d'une exception : </p>



{{<inlineJava path="ExempleTryCatch.java" lang="java">}}
import java.time.DateTimeException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExempleTryCatch {

    public static void main(String[] args) {
        
        ExempleTryCatch ex = new ExempleTryCatch();
        
        try {   
            ex.deuxiemeMethode();
        } catch (Exception ex1) {
            Logger.getLogger(
                ExempleTryCatch.class.getName()).log(
                    Level.SEVERE, null, ex1);
        }
        
        try {
            ex.quatriemeMethode();
        } catch (Exception ex1) {
            Logger.getLogger(
                ExempleTryCatch.class.getName()).log(
                    Level.SEVERE, null, ex1);
        }
    }
    
    public void premiereMethode() throws NullPointerException {
        String test = null;
        test.charAt(0);
    }
    
    public void deuxiemeMethode() throws Exception {
        premiereMethode();
    }     
    
    public void troisiemeMethode() throws DateTimeException {
        throw new DateTimeException("Wrong Date Format");
    }        
    
    public void quatriemeMethode() throws Exception {
        troisiemeMethode();
    }  

}
{{</inlineJava>}}

### Lecture dans le livre de référence

<p>Pour aller plus en profondeur sur les structures try-catch (optionnel), vous pouvez lire le chapitre 10 dans <em>Programmer en Java</em> de Claude Delannoy.</p>
</ul>

### Vidéos

<iframe width="560" height="315" src="https://www.youtube.com/embed/UEISfoJaOyk" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
