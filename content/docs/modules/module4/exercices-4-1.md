---
title: "Exercices sur les flux"
weight: 3
---

# Exercices sur les flux

<h1>Questions/Réponses</h1>
<p>Veuillez répondre mentalement, sur papier ou bien en créant le code nécessaire pour répondre à ces questions avant de regarder la réponse.</p>

<p>Si vous ne faites pas honnêtement les exercices et les lectures dans ce cours, il est possible que vous n'arriviez pas alors à faire les travaux notés et les examens.</p>

<p>Prenez note qu'<a href="https://rc-inf1220.teluq.ca/">il est permis d'utiliser le robot conversationnel du cours lors des exercises</a>. Cependant vous devriez vous entraîner à produire vos propres réponses.</p>

<h2>Réponses uniques?</h2>

<p>Les exercices comportent une solution vous permettant de comparer votre approche avec la nôtre. Il n'y a pas de solution unique aux problèmes en général. Vous pouvez arriver avec une solution qui est préférable ou moins bonne que celle que nous offrons. Pour faire ces questions, vous devez avoir fait toutes les lectures préalables. Vous disposez alors toujours des fondements nécessaires pour faire les exercices. Nous vous encourageons tout de même à faire vos propres recherches en complément de vos lectures. Dans certains cas, au sein de la solution que nous offrons, nous pouvons utiliser des notions techniques qui n'ont pas été vues directement dans le cours, mais qui devraient vous être facilement accessibles.</p>

<h2>Question 1</h2>
<p>Le programme suivant permet-il de lire deux lignes entrées au clavier ?</p>

```java  {style=github}
import java.util.Scanner;
class TestIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("==> Taper deux lignes");
        System.out.print("?");
        String ligne1 = scanner.nextLine();
        System.out.print("?");
        String ligne2 = scanner.nextLine();
        System.out.println("==> Les deux lignes lues sont:\n==>  " + ligne1 + "\n==> " + ligne2);
    }
}
```

<details><summary>Réponse</summary>
<p>Oui, la classe Scanner avec en paramètre l'entrée de la console, permet de lire des entrées au clavier. Le code fait la lecture de deux lignes de données au clavier.</p>

<p>Notez qu'on évite délibérément d'appeler scanner.close() puisque cela aurait pour conséquence la <em>fermeture</em> de <tt>System.in</tt> ce qui n'est généralement pas souhaitable. La ressource  <tt>System.in</tt> est automatiquement <em>fermée</em> à la fin du programme dans tous les cas, il n'est donc pas nécessaire de s'en préoccuper.</p>
</details>

<h2>Question 2</h2>
<p>Que fait ce programme ?</p>

```java  {style=github}
import java.io.*;
import java.util.*;
class TestFichOut {
    public static void main(String[] args) {
        File fichier = new File("Lasortie.txt");
        try (
         FileOutputStream streamFich = new FileOutputStream(fichier);
         DataOutputStream d = new DataOutputStream(streamFich);
         PrintStream out = new PrintStream(d);
         Scanner sc = new Scanner(System.in);
        )
        {
            String ligne = "";
            System.out.println("==> Taper des lignes terminées  par ctrl-D");
            System.out.print("?");
            while(sc.hasNextLine()) {
                out.println("" + sc.nextLine());
                System.out.print("?");
            }
            System.out.println();
        } catch (java.io.IOException e) {
            System.out.println("Il y a une erreur de lecture ou  écriture");
        } finally {}
    }
}
```

<details><summary>Réponse</summary>
<p>Il prend chaque ligne saisie par l'utilisateur et il l'écrit dans un fichier. Par ailleurs, notez que la variable ligne est inutilisée.</p>
</details>

<h2>Question 3</h2>

<p>En supposant que vous avez les droits d’écriture et de lecture appropriés, créez un fichier séquentiel binaire (monFichier) dans un répertoire (monRepertoire) sur la racine. On suppose que le fichier et le répertoire n’existent pas déjà. Ecrire dans ce fichier les nombres entiers de 0 à 9.</p>

<details><summary>Réponse</summary>

```java  {style=github}
import java.io.*;
import java.nio.file.*;
public class Exercice1M4{
 public static void main(String args[]) throws IOException {
   String s = File.separator;
   File monRepertoire = new File(s + "monRepertoire");
   if (monRepertoire.mkdirs()) {
     System.out.println("*** répertoire créé correctement***");
     File monFichier = new File(monRepertoire, "monFichier");
     if (monFichier.createNewFile()) {
       System.out.println("***fichier créé correctement***");
        DataOutputStream sortie = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(monFichier)));
        for (int i = 0; i < 10; i++) {
          sortie.writeInt(i);
        }
       sortie.close();
     }
      else {
       System.out.println("***le fichier n'a pas été créé***");
     }
   }
   else{
     System.out.println("*** le répertoire n'a pas été créé**}");
   }
 }
}
```

</details>

<h2>Question 4</h2>

<p>Ecrire un programme qui affiche le contenu du fichier de l’exercice précédent, puis ajoute à ce fichier le double des entiers impairs de 0 à 9. Les noms de répertoire et de fichier devront être fournis par l’utilisateur qui les saisira au clavier.</p>

<details><summary>Réponse</summary>

```java  {style=github}
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
public class Exercice2M4 {
  public static void main(String[] args) throws IOException
  {
    String nomFichier, nomRepertoire;
    String s = File.separator;
    int n = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("donnez le nom du répertoire à lire : ");
    nomRepertoire = scanner.next();
    File monRepertoire = new File(s + nomRepertoire);
    if (monRepertoire.exists() && monRepertoire.isDirectory()) {
      scanner = new Scanner(System.in);
      // intentionellement, nous n'appelerons pas scanner.close afin de ne pas
      // fermer System.in inutilement.
      System.out.println("***ce répertoire existe***");
      System.out.print("donnez le nom du fichier à traiter : ");
      nomFichier = scanner.next();
      File monFichier = new File(monRepertoire, nomFichier);
      if (monFichier.exists()) {
        System.out.println("*** ce fichier existe et voici son contenu***");
        DataInputStream entree = new DataInputStream(new BufferedInputStream(new FileInputStream(monFichier)));
        boolean eof = false;
        while (!eof)
        {
          try
          {
            n = entree.readInt();
          }
          catch (EOFException e)
          {
            eof = true;
          }
          if (!eof)
            System.out.println(n);
        }
        entree.close();
        DataOutputStream sortie = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(monFichier, true)));
        for (int i = 0; i < 10; i++) {
          if (i % 2 >= 1) {
            sortie.writeInt(2 * i);
          }
        }
        sortie.close();
      }
      else {
        System.out.println("***ce fichier n'existe pas***");
      }
    }
    else {
      System.out.println("*** ce répertoire n'existe pas***");
    }
  }
}
```

</details>

<h2>Question 5</h2>

<p>En poursuivant avec le même exemple que les deux exercices précédents, écrire un programme qui affiche le contenu du fichier, puis modifie ce fichier en remplaçant les nombres entiers impairs par leur double. Les noms de répertoire et de fichier devront être fournis par l’utilisateur qui les saisira au clavier.</p>

<p>Quelle est la différence entre cet exercice et l’exercice précédent du point de vue des types d’accès et des possibilités qui y sont liées?</p>

<details><summary>Réponse</summary>

```java  {style=github}
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
public class Exercice3M4 // Exercice3M4
{
  public static void main(String args[]) throws IOException {
    String nomFichier, nomRepertoire, s = File.separator;
    int n = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("donnez le nom du répertoire à lire : ");
    nomRepertoire = scanner.next();
    File monRepertoire = new File(s + nomRepertoire);
    if (monRepertoire.exists() && monRepertoire.isDirectory()) {
      scanner = new Scanner(System.in);
      System.out.println("***ce répertoire existe***");
      System.out.print("donnez le nom du fichier à traiter : ");
      nomFichier = scanner.next();
      File monFichier = new File(monRepertoire, nomFichier);
      if (monFichier.exists()) {
        System.out.println("*** ce fichier existe et voici son contenu***");
        DataInputStream entree = new DataInputStream(new BufferedInputStream(new FileInputStream(monFichier)));
        boolean eof = false;
        while (!eof)
        {
          try
          {
            n = entree.readInt();
          }
          catch (EOFException e)
          {
            eof = true;
          }
          if (!eof)
            System.out.println(n);
        }
        entree.close();
        System.out.println("***il va maintenant être modifié si necessaire*** ");
        // DataOutputStream sortie = new DataOutputStream(newBufferedOutputStream(new
        // FileOutputStream(monFichier, true));
        RandomAccessFile sortie = new RandomAccessFile(s + nomRepertoire + s + nomFichier, "rw");
        long taille = sortie.length();
        int i = 0;
        do {
          sortie.seek(4 * i);
          n = sortie.readInt();
          if (n % 2 >= 1) {
            sortie.seek(4 * i);
            sortie.writeInt(2 * n);
            System.out.println(taille + "  l'ancienne valeur de n est: " + n + "  et la nouvelle valeur de n est:  " + 2 * n);
          }
          i = i + 1;
        } while (i * 4 < taille);
        sortie.close();
      } else {
        System.out.println("***ce fichier n'existe pas***");
      }
    } else {
      System.out.println("*** ce répertoire n'existe pas***");
    }
  }
}
```

<p>La différence réside en ceci que l’accès direct nous facilite la mise à jour du fichier. Si nous devrions faire cette mise à jour lors d’un accès séquentiel, ce serait extrêmement laborieux (une solution consistant à utiliser un flux de sortie et un flux d’entrée en même temps). Il ne faut pas confondre cette mise à jour des données déjà présentes dans le fichier avec l’ajout de nouveaux éléments dans le même fichier tel que ce qui est fait à l’exercice précédent par exemple.</p>

</details>

<h2>Question 6</h2>

<p>Créez un fichier texte nommé unFichier dans le répertoire courant et écrivez-y  « Bonjour, je suis bien créé ». Ce nom sera fourni par l’utilisateur sous forme chaîne « unFichier.txt ».</p>

<details><summary>Réponse</summary>

```java  {style=github}
import java.io.*;
import java.util.Scanner;
public class Exercice4M4 { //Exercice4M4
 public static void main(String args[]) throws IOException {
   String nomFichier;
   Scanner scanner = new Scanner(System.in);
   System.out.print("Donnez le nom du fichier a creer avec son extension .txt: ");
   nomFichier = scanner.next();
   PrintWriter sortie = new PrintWriter(new BufferedWriter(new FileWriter(nomFichier)));
   sortie.println(" Bonjour, je suis bien créé  ");
   sortie.close();
   System.out.println("*** le fichier " + nomFichier + " a été bien créé  " + "***");
 }
}
```

</details>

<h2>Question 7</h2>
<p>Ecrire un code qui prend en paramètre le nom du fichier de l’exercice précédent (unFichier.txt), et affiche son chemin d’accès (c’est-à-dire le répertoire courant) ainsi que le contenu du fichier.</p>

<p>On suppose dans cet exercice qu’on reste dans le même répertoire courant qu’à l'exercice précédent.</p>

<details><summary>Réponse</summary>

```java  {style=github}
import java.io.*;
import java.util.Scanner;
public class Exercice5M4 { // Exercice5M4
  public static void main(String args[]) throws IOException {
    String nomFichier, ligne;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Donnez le nom du fichier  : ");
    nomFichier = scanner.next();
    try (BufferedReader entree = new BufferedReader(new FileReader(nomFichier));) {
      System.out.println("*** voici le contenu du fichier qui est situé dans le répertoire***\n " + System.getProperty("user.dir") + "\n ");
      do {
        ligne = entree.readLine();
        if (ligne != null)
          System.out.println(ligne);
      } while (ligne != null);
      entree.close();
      System.out.println("\n" + "*** fin du contenu ***");
    } catch (java.io.IOException e) {
      System.out.println("le fichier n'existe pas");
    } finally {
    }
  }
}
```

</details>



## Question 8

<p>Écrivez un programme Java qui compte le nombre de voyelles dans une chaîne de caractères saisie par l’utilisateur.</p>
<details><summary>Réponse</summary>

```java  {style=github}
import java.util.Scanner;
public class CompteVoyelles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int compteur = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiouy".indexOf(c) != -1) compteur++;
        }
        System.out.println("Nombre de voyelles : " + compteur);
    }
}
```

</details>

## Question 9

<p>Écrivez un programme Java qui lit un fichier texte ligne par ligne et affiche chaque ligne précédée de son numéro (exemple : 1: première ligne, 2: deuxième ligne, etc.).</p>
<details><summary>Réponse</summary>

```java  {style=github}
import java.io.*;
public class LireFichier {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("monfichier.txt"));
        String ligne;
        int num = 1;
        while ((ligne = br.readLine()) != null) {
            System.out.println(num + ": " + ligne);
            num++;
        }
        br.close();
    }
}
```

</details>

## Question 10

<p>Écrivez un programme Java qui demande à l’utilisateur un nom de fichier, puis affiche le nombre de caractères dans ce fichier.</p>
<details><summary>Réponse</summary>

Il est possible de procéder caractère par caractère&nbsp;:
```java  {style=github}
import java.io.*;
import java.util.Scanner;
public class CompteCaracteres {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nom du fichier : ");
        String nom = sc.nextLine();
        FileReader fr = new FileReader(nom);
        int compteur = 0;
        while (fr.read() != -1) compteur++;
        fr.close();
        System.out.println("Nombre de caractères : " + compteur);
    }
}
```

Il est possible de procéder plus rapidement&nbsp;:
```java  {style=github}
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FileSize {
    public static void main(String[] args) throws IOException {
        String filePath = "monfichier.txt";
        long size = Files.size(Paths.get(filePath));
        System.out.println("Nombre de caractères : " + size);
    }
}
```

</details>