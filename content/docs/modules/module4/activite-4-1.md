---
title: "Les flux de console"
weight: 1
---

# Les flux de console

Les programmes informatiques interagissent souvent avec l'utilisateur par le biais de la console, un environnement textuel permettant d'afficher des informations et de recueillir des données saisies au clavier. En Java, ces interactions s'appuient sur des mécanismes de bas niveau liés au système d'exploitation, qui gèrent les flux d'entrée et de sortie. Comprendre ces flux est essentiel pour maîtriser les bases de la programmation en console avant de passer à des interfaces plus complexes.

## La bibliothèque System

<p>Les bibliothèques responsables de la gestion des éléments de bas niveau (écran, clavier, etc.), lesquelles nécessitent donc le système de l'ordinateur, s'appellent bibliothèques System. Dans les exemples précédents, nous avons utilisé amplement l'affichage à la console avec la méthode System.out.println(). Ainsi, la gestion de l'affichage d'un message à l'écran ou la saisie de valeurs au clavier font partie des fonctions requérant le système de l'ordinateur. C'est pourquoi leur nom commence toujours par «&nbsp;System&nbsp;».</p>

<p>La librairie System est composée de deux sous-ensembles principaux : in et out. L'affichage est une opération de sortie et fait donc partie des éléments out de la classe System. Pour accéder au sous-ensemble out, on écrit System.out. Finalement, pour afficher à l'écran, nous faisons appel à la fonction print du sous-ensemble out.</p>

### Affichage dans la console

Avant de développer des applications graphiques ou des applications web, il faut maîtriser les fichiers et la console. Nous avons utilisé la console à plusieurs reprises dans les activités précédentes. Il s'agit d'utiliser la sortie `out` de `System` et d'appeler les méthodes print (pas de retour de ligne automatique) ou println (retour de ligne automatique à la fin du texte). Plus particulièrement, l'instance `out` réfère à la classe <a href="https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html">PrintStream</a>, qui possède plus de méthodes d'impression que print et println. De plus, à partir de l'objet System, il est également possible de changer la modalité d'impression de System.out de la console (par défaut) vers, par exemple, un fichier, et ce en utilisant la méthode System.setOut(). Nous verrons dans la prochaine activité comment rediriger les sorties vers un fichier à l'aide des flux de fichiers. Voici, donc des exemples de l'utilisation de `System.out`.

```java  {style=github}
System.out.println("Imprimer une ligne");

System.out.print("Imprimer des chaînes de caractères");

System.out.print("On peut additionner des String et d'autres types grâce à l'auto-boxing" + 5 + "-" + 'a');

System.out.append('c');

try {
    // Ici ça fonctionne
    System.out.write("Ça marche".getBytes());

    // Méthode permettant de fermer le flux
    System.out.close();

    // Ici ne s'imprime pas car le flux est fermé.
    System.out.write("Ça ne marche pas".getBytes());
} catch (IOException ex) {
    Logger.getLogger(AlgorithmeTri.class.getName()).log(Level.SEVERE, null, ex);
}
```

### Saisir des données au clavier

<p>Le langage Java a été principalement conçu pour le développement d'interface graphique (GUI) et d'interface web (JSP, Servlet, etc.). Toutefois, comme la majorité des langages de programmation, il supporte la saisie de données dans la console, grâce à "System.in" et des objets tels que <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html">Scanner</a>. Voici la façon de récupérer des saisies au clavier à partir du terminal/console :</p>

```java  {style=github}
// Instanciation de entree permettant de lire dans le InputStream correspondant à la console de l'OS(System.in)
Scanner entree = new Scanner(System.in);

// Récupérer les données jusqu'à la saisie d'un retour de chariot
String texte = entree.nextLine();
```

<p>La méthode nextInt() permet de lire un entier. Le code suivant illustre cette méthode :</p>

```java  {style=github}
Scanner entree = new Scanner(System.in);

int entier = entree.nextInt();
```

<p>La classe Scanner ne convient pas à la lecture des mots de passe à partir d'une console puisque ces derniers sont invisibles. Le langage de programmation Java SE 6 introduit une classe Console réservée à cet usage. Donc, pour lire un mot de passe, il faut utiliser le code suivant :</p>

```java  {style=github}
// Ce code retourne un objet Console null si exécuté dans certains environnements.
// Nécessite d'être lancée dans un terminal/console de l'OS
Console uneConsole = System.console(); // définir une console

String nomUtilisateur = uneConsole.readLine(" Nom Utilisateur: "); // lire le nom utilisateur

char[] motDePasse = uneConsole.readPassword("Mot de Passe: "); // le mot de passe.
```

<h2>Vidéos</h2>

{{< youtube id="fa84_nrUrMw" >}}


## Recevoir des arguments en ligne de commande

En Java, la méthode `main` sert de point d'entrée pour exécuter un programme. Elle est déclarée avec la signature `public static void main(String[] args)`, où `args` est un tableau de chaînes de caractères (`String`) qui capture les arguments fournis lors du lancement du programme en ligne de commande. Par exemple, en exécutant `java MonProgramme arg1 arg2`, le tableau `args` contient `{"arg1", "arg2"}`. Cette fonctionnalité permet de passer des paramètres dynamiques au programme, comme des noms de fichiers, des options de configuration ou des valeurs numériques, sans modifier le code source. La méthode est `public` pour être accessible par la machine virtuelle Java (JVM), `static` pour être appelée sans instancier la classe, et ne retourne rien (`void`).

Le tableau `args` est toujours initialisé, même si aucun argument n’est fourni, auquel cas il est vide (`args.length == 0`). Les arguments sont séparés par des espaces dans la commande, et chaque argument est traité comme une chaîne. Si un argument contient un espace, il doit être entouré de guillemets (par exemple, `java MonProgramme "un argument"`). Pour des arguments non textuels, comme des nombres, une conversion explicite est nécessaire, par exemple avec `Integer.parseInt(args[0])`. Une gestion rigoureuse des arguments, comme vérifier leur nombre ou leur validité, est essentielle pour éviter des erreurs telles que des exceptions d’index hors limites ou des formats incorrects.

Voici un exemple qui affiche les arguments.

```java  {style=github}
public class AfficherArgs {
    public static void main(String[] args) {
        System.out.println("Nombre d'arguments : " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + " : " + args[i]);
        }
    }
}
```

Exécution : `java AfficherArgs test1 test2` affiche :

```
Nombre d'arguments : 2
Argument 0 : test1
Argument 1 : test2
```

Voici un exemple de conversion d’un argument en nombre.

```java  {style=github}
public class CalculCarre {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Veuillez fournir un seul nombre.");
            return;
        }
        try {
            int nombre = Integer.parseInt(args[0]);
            System.out.println("Le carré de " + nombre + " est " + (nombre * nombre));
        } catch (NumberFormatException e) {
            System.out.println("L'argument doit être un nombre entier.");
        }
    }
}
```

Exécution : `java CalculCarre 5` affiche :

```
Le carré de 5 est 25
```

Voici un exemple de vérification d’arguments multiples.

```java  {style=github}
public class Concatener {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Veuillez fournir au moins deux chaînes.");
            return;
        }
        String resultat = "";
        for (String arg : args) {
            resultat += arg + " ";
        }
        System.out.println("Concaténation : " + resultat.trim());
    }
}
```


Exécution : `java Concatener bonjour le monde` affiche :

```
Concaténation : bonjour le monde
```

Ces exemples montrent comment la méthode `main` permet de récupérer et traiter des arguments de manière flexible, tout en mettant en évidence l’importance de valider les entrées pour garantir la robustesse du programme.


Vous pouvez regarder la vidéo suivante pour en apprendre davantage sur ce mécanisme si vous le souhaitez.

{{< youtube id="BzFx1dszk4I" >}}


<p>Si vous utilisez repl.it, vous pouvez ouvrir une console avec les touches ctrl-shift-s où vous pouvez exécuter des commandes comme «&nbsp;javac Main.java&nbsp;» et «&nbsp;java Main arg1 arg2&nbsp;».</p>

