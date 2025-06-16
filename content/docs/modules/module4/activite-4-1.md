
Voici le document avec les parties commençant par un commentaire de surlignage converties en Markdown, en respectant les directives de style (majuscule uniquement sur le premier mot des titres, français impeccable, usage limité des listes et caractères gras). Le contenu non lié aux extraits de code reste inchangé.

---
title: "Activité 4.1"
weight: 1
---

<h1><a id="top" name="top"></a>Module 4</h1>
<h1>Java pas à pas</h1>

<p>Nous vous invitons maintenant à lire le chapitre <em>Traitement de fichiers</em> du manuel Java pas à pas par Robert Godin et Daniel Lemire. Vous trouverez <a href="https://github.com/RobertGodin/JavaPasAPas/blob/master/JavaPasAPas.pdf">le document PDF sur le site GitHub</a>. Pour enregistrer le PDF sur votre machine, cliquez sur le bouton « Download ». </p>

<p><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/">Vous pouvez aussi acheter la version papier du manuel Java pas à pas chez Amazon</a>:</p>
<div><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/"><img src="https://m.media-amazon.com/images/I/61tnblFlmmL._SL1499_.jpg" width="250px" style="margin-left:auto; margin-right:auto;"></a></div>

<p>Plusieurs étudiants trouvent qu'il est plus aisé de faire les lectures dans le manuel Java pas à pas après avoir terminé la lecture du module sur notre site web. Vous pouvez choisir quand il vous convient le mieux d'utiliser le manuel Java pas à pas.</p>

<p>Si vous devez lire un document PDF, nous vous encourageons à charger le fichier sur votre machine et à l'ouvrir au sein d'un outil dédié (par ex. Adobe Acrobat). Il n'est pas très pratique de lire un document PDF au sein d'un navigateur web.</p>

<h1>Commentaires constructifs</h1>
<p><a href="https://docs.google.com/forms/d/e/1FAIpQLSe8pU6ypxDsx-cZjcMURa6o2LRG8NODa3qYIcWLNGU2RcvaWQ/viewform">Vous pouvez, de manière anonyme, nous faire parvenir vos corrections lorsque vous trouvez des erreurs sur le site</a>. Nous apprécions toujours vos commentaires constructifs.</p>

<h2>Activité 4.1</h2><h2 class="partie2">Les flux de console</h2>
<p class="sommaire">Sommaire</p>
<ul>
<li><a href="#section1">La bibliothèque System</a></li>
</ul>

<p><a id="intro" name="section1"></a></p>

<h1>La bibliothèque System</h1>

<p>Les bibliothèques responsables de la gestion des éléments de bas niveau (écran, clavier, etc.), lesquelles nécessitent donc le système de l'ordinateur, s'appellent bibliothèques System. Dans les exemples précédents, nous avons utilisé amplement l'affichage à la console avec la méthode System.out.println(). Ainsi, la gestion de l'affichage d'un message à l'écran ou la saisie de valeurs au clavier font partie des fonctions requérant le système de l'ordinateur. C'est pourquoi leur nom commence toujours par « System ».</p>

<p>La librairie System est composée de deux sous-ensembles principaux : in et out. L'affichage est une opération de sortie et fait donc partie des éléments out de la classe System. Pour accéder au sous-ensemble out, on écrit System.out. Finalement, pour afficher à l'écran, nous faisons appel à la fonction print du sous-ensemble out.</p>

<h2>Afficher à la console</h2>

<p>Avant de développer des applications graphiques ou des applications web, il faut maîtriser les fichiers et la console. Nous avons utilisé la console à plusieurs reprises dans les activités précédentes. Il s'agit d'utiliser la sortie "out" de system et d'appeler les méthodes print (pas de retour de ligne automatique) ou println (retour de ligne automatique à la fin du texte). Plus particulièrement, l'instance "out" réfère à la classe <a href="https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html">PrintStream</a>, qui possède plus de méthodes d'impression que print et println. De plus, à partir de l'objet System, il est également possible de changer la modalité d'impression de System.out de la console (par défaut) vers, par exemple, un fichier, et ce en utilisant la méthode System.setOut(). Nous verrons dans la prochaine activité comment rediriger les sorties vers un fichier à l'aide des flux de fichiers. Voici, donc des exemples de l'utilisation de System.out :</p>

```java
System.out.println("Imprimer une ligne");

System.out.print("Imprimer des chaînes de caractères");

System.out.print("On peut additionner des String et d'autres types grâce à l'auto-boxing" + 5 + "-" + 'a');

// Permet d'ajouter un caractère à une sortie. Reviens à faire un print
System.out.append('c');

try {
    // Permet d'imprimer un tableau de byte dans le flux. Peut provoquer une exception, si il y a un problème avec le flux (fichier fermé).
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

<h2>Saisir des données au clavier</h2>

<p>Le langage Java a été principalement conçu pour le développement d'interface graphique (GUI) et d'interface web (JSP, Servlet, etc.). Toutefois, comme la majorité des langages de programmation, il supporte la saisie de données dans la console, grâce à "System.in" et des objets tels que <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html">Scanner</a>. Voici la façon de récupérer des saisies au clavier à partir du terminal/console :</p>

```java
// Instanciation de entree permettant de lire dans le InputStream correspondant à la console de l'OS(System.in)
Scanner entree = new Scanner(System.in);

// Récupérer les données jusqu'à la saisie d'un retour de chariot
String texte = entree.nextLine();
```

<p>La méthode nextInt() permet de lire un entier. Le code suivant illustre cette méthode :</p>

```java
Scanner entree = new Scanner(System.in);

int entier = entree.nextInt();
```

<p>La classe Scanner ne convient pas à la lecture des mots de passe à partir d'une console puisque ces derniers sont invisibles. Le langage de programmation Java SE 6 introduit une classe Console réservée à cet usage. Donc, pour lire un mot de passe, il faut utiliser le code suivant :</p>

```java
// Ce code retourne un objet Console null si exécuté dans certains environnements.
// Nécessite d'être lancée dans un terminal/console de l'OS
Console uneConsole = System.console(); // définir une console

String nomUtilisateur = uneConsole.readLine(" Nom Utilisateur: "); // lire le nom utilisateur

char[] motDePasse = uneConsole.readPassword("Mot de Passe: "); // le mot de passe.
```

<h2>Vidéos</h2>

<iframe width="560" height="315" src="https://www.youtube.com/embed/fa84_nrUrMw" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<h2>Recevoir des arguments en ligne de commande</h2>

<p>La méthode main en Java reçoit un tableau de String. Ainsi donc, si on lance un programme Java en ligne de commande (<tt>java MonProgramme arg1 arg2</tt>), la fonction main recevra les chaînes de caractère arg1 et arg2. Vous pouvez regarder la vidéo suivante pour en apprendre davantage sur ce mécanisme si vous le souhaitez.</p>

<iframe width="560" height="315" src="https://www.youtube.com/embed/BzFx1dszk4I?start=165" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<p>Si vous utilisez repl.it, vous pouvez ouvrir une console avec les touches ctrl-shift-s où vous pouvez exécuter des commandes comme « javac Main.java » et « java Main arg1 arg2 ».</p>