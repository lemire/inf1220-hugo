---
title: "Les exceptions"
weight: 7
---

# Les exceptions

En programmation, il est essentiel de pouvoir gérer les erreurs qui peuvent survenir lors de l’exécution d’un programme. Java propose un mécanisme puissant et structuré : les exceptions. Plutôt que de laisser le programme s’arrêter brutalement en cas de problème (comme une division par zéro ou l’ouverture d’un fichier inexistant), Java permet de « lancer » une exception. Cette exception peut alors être capturée et traitée, ce qui rend le code plus robuste, plus lisible et plus facile à maintenir.



## Les erreurs et exceptions en Java

La plupart des langages modernes distinguent deux types de fautes : celles détectées à la compilation (par exemple, l’oubli d’un point-virgule) et celles qui surviennent à l’exécution. En Java, lorsqu’une erreur se produit à l’exécution, la machine virtuelle Java (JVM) génère une exception ou une erreur. Il est important de distinguer :
- Une <strong>erreur</strong> (<code>Error</code>) : événement grave, souvent lié au système, que l’on ne cherche généralement pas à intercepter (ex. : manque de mémoire).
- Une <strong>exception</strong> (<code>Exception</code>) : situation inhabituelle ou fautive que le programme peut choisir de gérer (ex. : division par zéro, fichier absent).

Gérer les exceptions permet d’éviter que le programme ne s’arrête de façon inattendue et d’informer l’utilisateur ou le développeur de ce qui s’est passé. Par exemple, si une application perd la connexion réseau, elle peut afficher un message d’erreur et tenter de se reconnecter, plutôt que de planter.

## La structure try-catch

Pour gérer les exceptions, on utilise la structure <code>try-catch</code>. On place dans le bloc <code>try</code> le code susceptible de provoquer une erreur. Si une exception survient, le flux d’exécution passe dans le bloc <code>catch</code>, où l’on peut réagir de façon appropriée.

```java  {style=github}
try {
    // Code susceptible de générer une exception
} catch (Exception e) {
    // Code exécuté si une exception est levée
}
```

On peut aussi intercepter des erreurs, mais ce n’est généralement pas recommandé :

```java  {style=github}
try {
    // Code...
} catch (Error e) {
    // Gestion d’une erreur système
}
```

Dans le bloc <code>catch</code>, on peut :
- Afficher un message d’erreur
- Journaliser l’erreur
- Relancer l’exception (<code>throw e;</code>)
- Arrêter le programme (<code>System.exit(1);</code>)

Exemples :

```java  {style=github}
try {
    // ...
} catch (Exception e) {
    e.printStackTrace(); // Affiche la trace de l’erreur
}

try {
    // ...
} catch (Exception e) {
    e.printStackTrace();
    throw e; // Relance l’exception
}

try {
    // ...
} catch (Exception e) {
    e.printStackTrace();
    System.exit(1); // Arrête le programme
}

try {
    // ...
} catch (Exception e) {
    Logger.getLogger("Erreur.log").severe(e.getMessage()); // Journalise l’erreur
}
```

On peut utiliser plusieurs blocs <code>catch</code> pour gérer différents types d’exceptions :

```java  {style=github}
try {
    String test = null;
    test.charAt(0);
} catch (NullPointerException e) {
    // Gestion spécifique du cas où test est null
    e.printStackTrace();
} catch (Exception e) {
    // Gestion générale
    e.printStackTrace();
}
```

Les blocs <code>catch</code> sont évalués dans l’ordre : le premier qui correspond à l’exception levée sera exécuté.

Les exceptions peuvent être causées par :
- Des erreurs de programmation (ex. : accès à un index hors limites)
- Des événements extérieurs (ex. : fichier absent, réseau coupé)
- Des conditions prévues par le programmeur (qui peut lancer une exception volontairement)

## Lancer des exceptions

Pour signaler une situation anormale, un programmeur peut lancer une exception avec le mot-clé <code>throw</code> :

```java  {style=github}
throw new Exception();
throw new SQLException("Utilisateur inconnu");
```

Si l’exception n’est pas capturée, elle remonte la pile d’appels jusqu’à la méthode main, puis provoque l’arrêt du programme. On peut aussi déclarer qu’une méthode peut lancer une exception avec le mot-clé <code>throws</code> :

```java  {style=github}
public void maMethode() throws IOException {
    // ...
}
```

Voici un exemple illustrant la propagation d’une exception à travers plusieurs méthodes :

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

### Les exceptions vérifiées

Les exceptions dites « vérifiées » (checked) sont des exceptions que le compilateur Java oblige à traiter explicitement, soit en les capturant avec un bloc try/catch, soit en les déclarant avec throws dans la signature de la méthode. Elles héritent de la classe Exception (mais pas de RuntimeException).

Un exemple classique d’exception checked est IOException, qui peut survenir lors de la lecture ou l’écriture de fichiers. Voici un exemple :

```java  {style=github}
import java.io.*;

public class ExempleChecked {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("fichier.txt"));
            String ligne = reader.readLine();
            System.out.println(ligne);
            reader.close();
        } catch (IOException e) {
            System.out.println("Erreur d'entrée/sortie : " + e.getMessage());
        }
    }
}
```

Dans cet exemple, FileReader et readLine peuvent lancer une IOException : le compilateur oblige à traiter cette exception.

On peut aussi propager l’exception à la méthode appelante avec throws :

```java  {style=github}
public void lireFichier(String nom) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(nom));
    String ligne = reader.readLine();
    reader.close();
}
```

Ici, la méthode signale qu’elle peut lancer une IOException, et c’est à l’appelant de la gérer.

### Les exceptions non vérifiées

Les exceptions non vérifiées (ou « unchecked ») héritent de la classe RuntimeException. Elles ne sont pas vérifiées par le compilateur : il n’est pas obligatoire de les capturer ni de les déclarer avec throws. Elles surviennent souvent lors d’erreurs de programmation (ex. : accès à un index hors limites, division par zéro, etc.).

Exemple classique : ArrayIndexOutOfBoundsException, qui se produit lorsqu’on tente d’accéder à un indice inexistant dans un tableau.

```java  {style=github}
public class ExempleUnchecked {
    public static void main(String[] args) {
        int[] t = {1, 2, 3};
        System.out.println(t[5]); // Provoque ArrayIndexOutOfBoundsException
    }
}
```

Dans cet exemple, aucune gestion d’exception n’est requise : si l’erreur survient, le programme s’arrête avec un message d’erreur.

### La clause finally

Le bloc <code>finally</code> permet d’exécuter du code qui sera toujours exécuté à la fin d’un bloc <code>try</code>, que l’exception soit levée ou non, et même si un <code>return</code> est rencontré dans le <code>try</code> ou le <code>catch</code>. Il est souvent utilisé pour libérer des ressources (fichiers, connexions, etc.).

Exemple :

```java  {style=github}
public class ExempleFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Début du try");
            int x = 10 / 0; // Provoque une exception
        } catch (ArithmeticException e) {
            System.out.println("Exception capturée");
        } finally {
            System.out.println("Bloc finally exécuté");
        }
        System.out.println("Après le try-catch-finally");
    }
}
```

Sortie attendue :

<pre>
Début du try
Exception capturée
Bloc finally exécuté
Après le try-catch-finally
</pre>


## La pile d’appels

La pile d’appels (ou « call stack ») est une structure de données interne utilisée par la machine virtuelle Java pour suivre l’enchaînement des appels de méthodes pendant l’exécution d’un programme. Chaque fois qu’une méthode est appelée, une nouvelle « case » (ou frame) est ajoutée au sommet de la pile ; quand la méthode se termine, cette case est retirée. Cela permet à Java de savoir où reprendre l’exécution après chaque appel de méthode.

Ce mécanisme est essentiel pour comprendre la gestion des exceptions et la récursivité. Lorsqu’une exception est levée, Java parcourt la pile d’appels de haut en bas pour trouver un bloc catch approprié. Si aucun n’est trouvé, le programme s’arrête et affiche la trace de la pile (stack trace), qui montre la séquence des appels ayant mené à l’erreur.

Exemple :

```java  {style=github}
public class ExemplePileAppels {
    public static void main(String[] args) {
        methodeA();
    }
    static void methodeA() {
        methodeB();
    }
    static void methodeB() {
        int x = 1 / 0; // Provoque une exception
    }
}
```

La trace d’erreur affichera :

<pre>
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at ExemplePileAppels.methodeB(ExemplePileAppels.java:9)
    at ExemplePileAppels.methodeA(ExemplePileAppels.java:6)
    at ExemplePileAppels.main(ExemplePileAppels.java:3)
</pre>

On voit que la pile d’appels retrace le chemin des méthodes jusqu’à l’origine de l’exception. Cela aide beaucoup à déboguer les programmes.

### Lecture optionnelle dans le livre de référence (Delannoy)

Pour aller plus en profondeur sur les structures try-catch (optionnel), vous pouvez lire le chapitre 10 dans <em>Programmer en Java</em> de Claude Delannoy.

### Vidéo

{{< youtube id="UEISfoJaOyk" >}}
