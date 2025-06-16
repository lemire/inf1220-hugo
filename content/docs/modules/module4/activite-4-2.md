---
title: "Activité 4.2"
weight: 2
---

<h1><a id="top" name="top"></a>Module 4</h1><h2>Activité 4.2</h2><h2 class="partie2">Les flux de données: lecture dans des fichiers et autres</h2>

<p class="sommaire">Sommaire</p>
<ul>

<li><a href="#section1">Utilisation de la classe File</a></li>

<li><a href="#section2">Lire des fichiers</a></li>
<li><a href="#section3">Écrire dans des fichiers</a></li>


</ul>

<p>Nous avons couvert la façon d'afficher des données à l'écran et de lire des données à partir du clavier en utilisant les flux de données (streams) dans les leçons précédentes. Quand nous avons utilisé les méthodes System.out.print ou System.out.println pour afficher des données à l'écran, ces dernières ont été envoyées sur un flux de sortie (output stream). Nous nous servirons des flux d'entrée et de sortie pour lire et écrire des données dans un fichier texte. Mais auparavant, il nous faut savoir comment créer le fichier dans lequel ces données seront archivées.</p>

<p>Pour manipuler les flux d'entrée et de sortie, nous utilisons les classes du package java.io. Les données sont manipulées suivant deux principes : la lecture/écriture en flux binaire ou en flux texte. Le tableau ci-dessous représente les différents flux que nous pouvons manipuler ainsi que les classes abstraites de base, l'implémentation, les fichiers et les tampons d'entrée-sortie qui leur sont associés.</p>

<table border="1" cellpadding="0" width="538"> 
      <tbody> 
        <tr> 
          <td width="14%"><br /></td> 
          <td width="21%"> 
            <p style="text-align: center;"><strong>flux texte (lecture)</strong></p> 
          </td> 
          <td> 
            <p style="text-align: center;"><strong>flux texte (ecriture )</strong></p> 
          </td> 
          <td> 
            <p style="text-align: center;"><strong>flux binaire (lecture )</strong></p> 
          </td> 
          <td> 
            <p style="text-align: center;"><strong>flux binaire (ecriture)</strong></p> 
          </td> 
        </tr> 
        <tr> 
          <td width="14%"> 
            <p style="text-align: center;"><strong>classe Abstraite <br />de base</strong></p> 
          </td> 
          <td width="21%"> 
            <p style="text-align: center;">Reader</p> 
          </td> 
          <td> 
            <p style="text-align: center;">Writer</p> 
          </td> 
          <td> 
            <p style="text-align: center;">InputStream</p> 
          </td> 
          <td> 
            <p style="text-align: center;">OutputStream</p> 
          </td> 
        </tr> 
        <tr> 
          <td width="14%"> 
            <p style="text-align: center;"><strong>Implémentation</strong></p> 
          </td> 
          <td width="21%"> 
            <p style="text-align: center;">InputStreamReader</p> 
          </td> 
          <td> 
            <p style="text-align: center;">PrintWriter</p> 
          </td> 
          <td> 
            <p style="text-align: center;">DataInputStream</p> 
          </td> 
          <td> 
            <p style="text-align: center;">DataOutputStream</p> 
          </td> 
        </tr> 
        <tr> 
          <td width="14%"> 
            <p style="text-align: center;"><strong>Fichier</strong></p> 
          </td> 
          <td width="21%"> 
            <p style="text-align: center;">FileReader</p> 
          </td> 
          <td> 
            <p style="text-align: center;">FileWriter</p> 
          </td> 
          <td> 
            <p style="text-align: center;">FileInputStream</p> 
          </td> 
          <td> 
            <p style="text-align: center;">FileOutputStream</p> 
          </td> 
        </tr> 
        <tr> 
          <td width="14%"> 
            <p style="text-align: center;"><strong>Buffer E/S</strong></p> 
          </td> 
          <td width="21%"> 
            <p style="text-align: center;">BufferedReader</p> 
          </td> 
          <td> 
            <p style="text-align: center;">BufferedWriter</p> 
          </td> 
          <td> 
            <p style="text-align: center;">BufferedInputStream</p> 
          </td> 
          <td> 
            <p style="text-align: center;">BufferedOutputStream</p> 
          </td> 
        </tr> 
      </tbody> 
    </table> 

<p><a id="intro" name="section1"></a></p>

<h1>La classe File</h1>

<p>Pour travailler avec les fichiers et les répertoires, nous utilisons la classe File. Un objet de cette classe peut représenter un fichier ou un répertoire.

Il est très important de savoir qu'il n'est pas nécessaire d'avoir physiquement le fichier ou le répertoire sur un disque avant d'utiliser la classe File. Pour utiliser cette classe, nous devons intégrer le package java.io.* dans notre programme.

La classe File dispose d'un constructeur qui prend en paramètre l'emplacement du fichier que nous voulons créer. Si cet emplacement n'est pas spécifié et que c'est seulement le nom du fichier qui est passé en paramètre, ce dernier est créé dans le répertoire par défaut.</p>

<p>Pour créer un fichier, nous appelons le constructeur de la classe File de la façon suivante :</p>

```java
File exempleFile1= new File ("fichier");

File exempleFile2= new File ("c:\exemple\unFichier.txt");
```

<p>Dans le premier cas, un objet <a href="https://docs.oracle.com/javase/8/docs/api/java/io/File.html">File</a>, agissant comme référence vers le fichier dans l'arborescence du système de fichier, et ce pour un fichier du nom "fichier" dans le répertoire courant ("." dans Linux/Mac OS) sera crée. Dans le deuxième cas, une référence vers le fichier sur le disque "C:", dossier "/exemple", fichier "unFichier.txt" sera créée (exemple pour Windows ...). À ce stade, aucun fichier n'est crée ou ouvert, il ne s'agit que d'une référence vers l'emplacement possible d'un fichier. Pour savoir si le fichier existe ou non, il est possible d'utiliser la méthode exists() :</p>

```java
File unFichier = new File("lefichier"); // création d'un objet fichier

if (!unFichier.exists()) {
    System.out.println("le fichier n'existe pas!");
}
```

<p>Pour créer un nouveau fichier sur un disque dur, il faut, dans un premier temps, créer l'objet File avec le nom du fichier voulu et, par la suite, utiliser la méthode createNewFile(), comme le montre le code ci-dessous :</p>

```java
File unFichier = new File("lefichier"); // création d'un objet fichier
if (unFichier.createNewFile()) {
       System.out.println("le fichier est créé!");
} else {
       System.out.println("le fichier ne pas être créé");
}
```

<p><a id="intro" name="section2"></a></p>
<h1> Lecture d'un fichier</p>

<h2>Lecture dans un fichier de bas niveau</h2>

<p>En informatique, on fait référence à une approche de <em>bas niveau</em> quand celle-ci demande au programmeur de tenir compte de plus de détails techniques. Les approche de bas niveau demandent plus d'effort, mais peuvent offrir plus de flexibilité.</p>

<p>Java possède deux classes, à savoir FileReader et File, qui nous permettent de lire un fichier texte de bas niveau. Pour cela, nous devons connaître le fichier que nous voulons lire. Pour cette leçon, nous avons choisi de lire le fichier unfichier.</p>

<p>Pour lire un fichier, nous devons d'abord construire un objet de type File (la classe File), qui prend comme paramètre le nom du fichier à lire. Ici, il s'agit de unfichier, et nous obtenons :</p>

```java
try {
    FileReader fichierALire = new FileReader("unfichier");

    // ou bien en utilisant l'objet File dans le constructeur
    File file = new File("unFichier");
    fichierALire = new FileReader(file);
} catch (IOException exception) {
    System.out.println("Le fichier n'a pas été trouvé");
}
```

<p>Note: dans cet exemple, la variable fichierALire est déclarée comme étant de type FileReader lors de sa première utilisation. On ne peut déclarer une même variable qu'une seule fois. On peut cependant réassigner la variable à une autre valeur. Il est donc légal d'écrire "FileReader fichierALire = new ..." suivi de "fichierALire = new ..." (sans répéter le nom de la classe, FileReader). Par contre, il serait illégal en Java d'écrire "FileReader fichierALire = new ..." suivi de "FileReader fichierALire = new ..." dans le même contexte puisqu'on déclarerait la variable deux fois.
</p>

<p>Nous venons juste de créer une instance de l'objet FileReader permettant de lire le contenu d'un fichier. Cependant, la classe FileReader ne possède que des méthodes pouvant lire « en bas niveau », c'est-à-dire que la méthode read permet de lire caractère par caractère le contenu d'un fichier. Cette méthode peut lever une exception si, par exemple, nous ne pouvons accéder au disque dur ou si le fichier en question est protégé. Voici comment lire un caractère d'un fichier :</p>

```java
try {
    FileReader fichierALire = new FileReader("unfichier");
    char caractere = (char) fichierALire.read();
    System.out.print(caractere);
} catch (FileNotFoundException exception) {
    System.out.println("Il y a une erreur lors de la lecture: " + exception.getMessage());
}
```

<p>Avec tout ce que nous avons vu jusqu'à présent, nous ne pouvons écrire qu'un seul caractère à l'écran. À chaque appel de la méthode read, un caractère est lu. Pour lire un fichier en entier, il faut donc vérifier si la méthode read renvoie -1 car c'est cette valeur qui indique la fin d'un fichier. Le code ci-dessous montre comment nous pouvons procéder :</p>

```java
try {
    FileReader fichierALire = new FileReader("unfichier");
    int c = fichierALire.read();
    while (c != -1) {// tant que nous ne sommes pas à la fin du fichier
        System.out.print((char) c);
        c = fichierALire.read();
    }
} catch (IOException exception) {
    System.out.println("Il y a une erreur lors de la lecture: " + exception.getMessage());
}
```

<p>Pour terminer, il ne reste qu'à fermer le FileReader, en effet, lorsqu'un programme effectue une opération d'entrée-sortie, celui-ci doit demander de l'aide au système d'exploitation et ce dernier va mobiliser des ressources comme le disque dur. Une fois l'opération d'entrée-sortie terminée, vous devez le signaler pour que le système d'opération puisse libérer les ressources que vous n'utilisez plus. En Java, il suffit simplement de faire appel à la méthode close comme indiqué ci-dessous.</p>

```java
fichierALire.close();
```

<h2>Lecture dans un fichier de haut niveau</h2>

<p>Nous venons de terminer la lecture de bas niveau d'un fichier. Nous abordons maintenant celle de haut niveau, car la classe FileReader n'est pas très efficace. En effet, elle pourrait s'avérer longue en raison du nombre impressionnant d'appels à la méthode read qu'elle devrait faire. La classe BufferedReader permet pour sa part de lire un fichier texte avec des fonctions de niveau supérieur. Avec ces fonctions, nous pouvons, par exemple, lire un fichier texte ligne par ligne.</p>



<p>Pour une lecture de haut niveau d'un fichier avec les fonctions de la classe BufferedReader, il faut créer un objet de type BufferedReader qui doit prendre en paramètre un type Reader et lui donner un objet FileReader. Pour ce faire, il faut d'abord créer le fichier à lire. Le code ci-dessous explique mieux la façon à suivre :</p>

```java
try {
    File FichierALire = new File("textfichier");
    FileReader unFichier = new FileReader(FichierALire);
    BufferedReader leBuffer = new BufferedReader(unFichier);
} catch (FileNotFoundException exception) {
    System.out.println(" Fichier introuvable!");
}
```

<p>Pour lire maintenant le fichier créé, nous devons utiliser la méthode readLine, qui le fait ligne par ligne et retourne null à la fin du fichier. Nous pouvons réaliser cela grâce au code ci-dessous :</p>

```java
try {
    String uneligne = leBuffer.readLine();
    while (uneligne != null) {
        System.out.println(uneligne);
        uneligne = leBuffer.readLine();
    }
    leBuffer.close();
    unFichier.close();

} catch (IOException exception) {
    System.out.println("Il y a une erreur lors de la lecture: " + exception.getMessage());
}
```

<p><a id="intro" name="section3"></a></p>
<h1>Écriture d'un fichier texte</h1>

<p>Nous aborderons maintenant l'écriture de données vers un fichier texte. Cette dernière sert à les stocker lorsque le programme ne s'exécute plus et en vue de pouvoir les récupérer plus tard ou les envoyer à d'autres personnes. Comme vous le verrez, l'écriture de fichiers texte est assez similaire à leur lecture. Pour écrire, nous allons utiliser les trois classes suivantes FileWriter, BufferedWriter et PrintWriter.</p>

<h2>Écriture de bas niveau</h2>

<p>Pour écrire dans un fichier, nous utilisons la classe FileWriter. Nous commençons par créer un objet File qui sera le fichier vers lequel nous désirons écrire. Par la suite, nous produirons l'objet FileWriter. Le fichier représenté par l'objet File sera créé s'il n'existe pas. Dans le cas contraire, le contenu de ce fichier sera complètement écrasé. La classe FileWriter offre des méthodes de bas niveau pour l'écriture. Nous trouvons plusieurs méthodes dont Write pour écrire un caractère, une partie de String ou enfin un String complet. Le code ci-dessous démontre comment écrire des données dans un fichier :</p>

```java
double[] notes = {95.5, 91.5, 78.5, 75.0, 81.50};
File fichier = new File("notes.txt");
try {
    FileWriter fichierEcriture = new FileWriter(fichier);

    for (double lanote : notes) {
        fichierEcriture.write(String.valueOf(lanote));
        fichierEcriture.write("\r\n");
    }
    fichierEcriture.close();
} catch (IOException exception) {
    System.out.println("Erreur lors de la lecture : " + exception.getMessage());
}
```

<h2>Écriture de haut niveau</h2>

<p>Les méthodes proposées par la classe FileWriter sont de bas niveau. Par contre, d'autres classes offrant des méthodes de plus haut niveau qui accélèrent et rendent plus facile l'écriture vers un fichier texte. Nous avons la classe BufferedWriter qui offre des méthodes de plus haut niveau et une écriture plus rapide et performante. Son fonctionnement est assez similaire à la celui de la classe BufferedReader.
La classe BufferedWriter permet d'avoir une écriture plus performante. Elle propose une méthode supplémentaire, newLine, qui ajoute un retour à la ligne. Le retour à la ligne dans un fichier texte dépend du système d'exploitation ( \r\n sous Windows, \n sous Unix, ...). Alors, il est préférable d'utiliser cette méthode qui peut être portable.</p>
<p>Il faut donc utiliser une autre classe en plus, par exemple la classe PrintWriter qui se comporte de manière semblable à la classe PrintStream dont l'objet System.out est une instance. Nous pouvons donc réécrire le programme précédent avec ces nouveaux objets pour obtenir une écriture de meilleur rendement.</p>

```java
double[] notes = {95.5, 91.5, 78.5, 75.0, 81.50};
File fichier = new File("notes.txt");

try {
    PrintWriter fichierAEcrire = new PrintWriter(new BufferedWriter(new FileWriter(fichier)));
    for (double lanote : notes) {
        fichierAEcrire.println(lanote);
    }
    fichierAEcrire.close();
} catch (IOException exception) {
    System.out.println("Erreur lors de la lecture : " + exception.getMessage());
}
```

<h2>Écriture d'un fichier texte avec PrintWriter</h2>

<p>Nous utilisons donc un PrintWriter (pour les méthodes de haut niveau) par-dessus un BufferedWriter (pour l'écriture rapide) sur un FileWriter (pour l'écriture vers un fichier texte). 
Il faut noter qu'avec la classe PrintWriter, nous pouvons utiliser des méthodes de haut niveau comme println qui ajoutent une ligne au fichier texte. Cependant, il existe d'autres méthodes très riches comme printf pour les sorties formatées par exemple. Le code ci-dessous montre comment utiliser PrintWriter :</p>

```java
PrintWriter sortie = null;
try {
    System.out.println("Plus grand diviseur commun :" + plusGrandCommunDiviseur(455,322) );
    File fichier = new File("fichier.txt");
    sortie = new PrintWriter(new BufferedWriter(new FileWriter(fichier)));
    sortie.println("Une ligne de texte");
} catch (IOException ex) {
    Logger.getLogger(ExempleRecursivite.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    sortie.close();
}
```


<h2>Approche simplifiée</h2>

<p>La gestion des cas d'exception et de la nécessité de fermer les fichiers avant de terminer la fonction est pénible. Heureusement, on peut faire mieux si on dispose d'une version récente de Java (Java 8 ou mieux). Toutes les classes nécessitant d'être fermée ("close") peuvent être déclarée dans le "try" comme ceci:</p>

```java
import java.io.*;

class MaClasse {
  public static void main(String[] args) throws IOException {
   File unFichier = new File("monfichier");
   try (
     BufferedReader leBuffer = new BufferedReader(new FileReader(unFichier));
    ) {
     System.out.println(leBuffer.readLine());
    } catch (FileNotFoundException exception) {
      System.out.println(" Fichier introuvable!");
    }
  }
}
```



<h2>Lecture dans le livre de référence</h2>

<p>Pour aller plus en profondeur sur les flux de fichier (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 20:</p>
<ul>
	<li>Section 1 : Fichier binaire</li>
	<li>Section 2 : Liste séquentielle d'un fichier binaire</li>
        <li>Section 3 : Accès direct à un fichier binaire</li>
        <li>Section 6 : La gestion des fichiers avec la classe File</li>
</ul>

<h2>Vidéo</h2>

<iframe width="560" height="315" src="https://www.youtube.com/embed/7hZVRDxpbCE" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>