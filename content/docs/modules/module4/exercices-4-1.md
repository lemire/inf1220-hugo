---
title: Exercices sur les flux
weight: 3
---

# Exercices sur les flux

## Questions/réponses

Veuillez répondre mentalement, sur papier ou en créant le code nécessaire pour répondre à ces questions avant de regarder la réponse.

Si vous ne faites pas honnêtement les exercices et les lectures dans ce cours, il est possible que vous n’arriviez pas à faire les travaux notés et les examens.

Prenez note qu’il est permis d’utiliser le robot conversationnel du cours lors des exercices. Cependant, vous devriez vous entraîner à produire vos propres réponses.

## Réponses uniques ?

Les exercices comportent une solution vous permettant de comparer votre approche avec la nôtre. Il n’y a pas de solution unique aux problèmes en général. Vous pouvez arriver à une solution préférable ou moins bonne que celle que nous offrons. Pour répondre à ces questions, vous devez avoir fait toutes les lectures préalables. Vous disposez alors toujours des fondements nécessaires pour réaliser les exercices. Nous vous encourageons à faire vos propres recherches en complément des lectures. Dans certains cas, dans la solution que nous offrons, nous pouvons utiliser des notions techniques non vues directement dans le cours, mais qui devraient vous être facilement accessibles.

## Question 1

Le programme suivant permet-il de lire deux lignes entrées au clavier ?

```java {style=github}
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

Oui, la classe Scanner avec en paramètre l’entrée de la console permet de lire des entrées au clavier. Le code fait la lecture de deux lignes de données au clavier.

Notez qu’on évite délibérément d’appeler scanner.close() puisque cela aurait pour conséquence la fermeture de System.in, ce qui n’est généralement pas souhaitable. La ressource System.in est automatiquement fermée à la fin du programme dans tous les cas, il n’est donc pas nécessaire de s’en préoccuper.

</details>

## Question 2

Que fait ce programme ?

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

Il prend chaque ligne saisie par l’utilisateur et l’écrit dans un fichier. Par ailleurs, notez que la variable ligne est inutilisée.

</details>

## Question 3

En supposant que vous avez les droits d’écriture et de lecture appropriés, créez un fichier séquentiel binaire (monFichier) dans un répertoire (monRepertoire) sur la racine. On suppose que le fichier et le répertoire n’existent pas déjà. Écrivez dans ce fichier les nombres entiers de 0 à 9.

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

## Question 4

Écrivez un programme qui affiche le contenu du fichier de l’exercice précédent, puis ajoute à ce fichier le double des entiers impairs de 0 à 9. Les noms de répertoire et de fichier devront être fournis par l’utilisateur qui les saisira au clavier.

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

## Question 5

En poursuivant avec le même exemple que les deux exercices précédents, écrivez un programme qui affiche le contenu du fichier, puis modifie ce fichier en remplaçant les nombres entiers impairs par leur double. Les noms de répertoire et de fichier devront être fournis par l’utilisateur qui les saisira au clavier.

Quelle est la différence entre cet exercice et l’exercice précédent du point de vue des types d’accès et des possibilités qui y sont liées ?

<details><summary>Réponse</summary>

```java  {style=github}
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
public class Exercice3M4 {
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

La différence réside en ceci que l’accès direct nous facilite la mise à jour du fichier. Si nous devions faire cette mise à jour lors d’un accès séquentiel, ce serait extrêmement laborieux (une solution consistant à utiliser un flux de sortie et un flux d’entrée en même temps). Il ne faut pas confondre cette mise à jour des données déjà présentes dans le fichier avec l’ajout de nouveaux éléments dans le même fichier, tel que ce qui est fait à l’exercice précédent par exemple.

</details>

## Question 6

Créez un fichier texte nommé unFichier dans le répertoire courant et écrivez-y « Bonjour, je suis bien créé ». Ce nom sera fourni par l’utilisateur sous forme de chaîne « unFichier.txt ».

<details><summary>Réponse</summary>

```java {style=github}
import java.io.*;
import java.util.Scanner;
public class Exercice4M4 {
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

## Question 7

Écrivez un code qui prend en paramètre le nom du fichier de l’exercice précédent (unFichier.txt) et affiche son chemin d’accès (c’est-à-dire le répertoire courant) ainsi que le contenu du fichier.

On suppose dans cet exercice qu’on reste dans le même répertoire courant qu’à l’exercice précédent.

<details><summary>Réponse</summary>

```java  {style=github}
import java.io.*;
import java.util.Scanner;
public class Exercice5M4 {
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

Écrivez un programme Java qui compte le nombre de voyelles dans une chaîne de caractères saisie par l’utilisateur.

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

Écrivez un programme Java qui lit un fichier texte ligne par ligne et affiche chaque ligne précédée de son numéro (exemple : 1: première ligne, 2: deuxième ligne, etc.).

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

Écrivez un programme Java qui demande à l’utilisateur un nom de fichier, puis affiche le nombre de caractères dans ce fichier.

<details><summary>Réponse</summary>

Il est possible de procéder caractère par caractère :

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

Il est possible de procéder plus rapidement :

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

## Question 11

Le code suivant lit un fichier texte ligne par ligne et concatène toutes les lignes dans une seule chaîne :

```java  {style=github}
import java.io.*;
String resultat = "";
BufferedReader reader = new BufferedReader(new FileReader("fichier.txt"));
String ligne;
while ((ligne = reader.readLine()) != null) {
    resultat = resultat + ligne;
}
reader.close();
```

Réécrivez ce code de façon plus performante. Expliquez pourquoi votre version est préférable.

<details><summary>Réponse</summary>

On peut utiliser un StringBuilder pour éviter de créer de nombreuses chaînes intermédiaires, ce qui améliore l’efficacité (temps et mémoire) :

```java  {style=github}
import java.io.*;
StringBuilder resultat = new StringBuilder();
BufferedReader reader = new BufferedReader(new FileReader("fichier.txt"));
String ligne;
while ((ligne = reader.readLine()) != null) {
    resultat.append(ligne);
}
reader.close();
```

Avec StringBuilder, on évite la création répétée de nouvelles chaînes à chaque itération, ce qui rend le code beaucoup plus rapide et économe en mémoire, surtout pour de gros fichiers.

</details>

## Question Y

Le code suivant lit un fichier caractère par caractère sans utiliser de buffer :

```java  {style=github}
import java.io.*;
FileReader reader = new FileReader("fichier.txt");
int c;
while ((c = reader.read()) != -1) {
    // Traitement du caractère c
}
reader.close();
```

Expliquez pourquoi ce code peut être lent pour de gros fichiers. Proposez une version optimisée utilisant un buffer, et expliquez pourquoi elle est préférable.

<details><summary>Réponse</summary>

Lire caractère par caractère sans buffer entraîne de nombreux accès disque, ce qui ralentit la lecture. Utiliser un BufferedReader permet de lire des blocs de caractères en mémoire, ce qui accélère le traitement :

```java  {style=github}
import java.io.*;
BufferedReader reader = new BufferedReader(new FileReader("fichier.txt"));
int c;
while ((c = reader.read()) != -1) {
    // Traitement du caractère c
}
reader.close();
```

Le BufferedReader réduit le nombre d’appels au système en lisant de grands blocs à la fois, ce qui améliore nettement la performance, surtout pour les gros fichiers.

</details>

## Question 12

Écrivez un programme Java qui utilise StringWriter pour construire une chaîne contenant des paires clé-valeur au format clé=valeur, puis utilise StringReader pour lire et afficher chaque ligne de cette chaîne.

<details><summary>Réponse</summary>

```java  {style=github}
import java.io.StringWriter;
import java.io.StringReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StringWriterReaderExample {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        try {
            writer.write("nom=Alice\n");
            writer.write("âge=30\n");
            writer.write("ville=Paris\n");
            String contenu = writer.toString();
            System.out.println("Contenu généré :\n" + contenu);

            StringReader reader = new StringReader(contenu);
            try (BufferedReader bufferedReader = new BufferedReader(reader)) {
                String ligne;
                System.out.println("Lecture des lignes :");
                while ((ligne = bufferedReader.readLine()) != null) {
                    System.out.println("Ligne : " + ligne);
                }
            }
        } catch (IOException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
```

StringWriter permet de construire une chaîne en mémoire en écrivant des lignes formatées, ici des paires clé-valeur. StringReader lit cette chaîne comme un flux, et BufferedReader facilite la lecture ligne par ligne. Cette approche est utile pour générer et parser des données textuelles sans accès disque, avec une gestion d’exceptions pour les erreurs potentielles.

</details>

## Question 13

Écrivez un programme Java qui utilise ByteArrayOutputStream pour écrire une séquence de bytes à partir d’une chaîne, puis ByteArrayInputStream pour lire et afficher ces bytes comme caractères.

<details><summary>Réponse</summary>

```java  {style=github}
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayStreamExample {
    public static void main(String[] args) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            String texte = "Test Java NIO";
            output.write(texte.getBytes());
            byte[] bytes = output.toByteArray();
            System.out.println("Taille des bytes écrits : " + bytes.length);

            ByteArrayInputStream input = new ByteArrayInputStream(bytes);
            System.out.print("Contenu lu : ");
            int octet;
            while ((octet = input.read()) != -1) {
                System.out.print((char) octet);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
```

ByteArrayOutputStream accumule les bytes d’une chaîne en mémoire, permettant de récupérer un tableau de bytes. ByteArrayInputStream lit ces bytes comme un flux, ici convertis en caractères pour l’affichage. Cette méthode est efficace pour manipuler des données binaires en mémoire, sans accès disque, avec une gestion d’exceptions pour les erreurs.

</details>

## Question 14

Écrivez un programme Java qui utilise ByteBuffer pour écrire une liste de 5 entiers dans un buffer, puis lire et afficher ces entiers dans l’ordre inverse.

<details><summary>Réponse</summary>

```java  {style=github}
import java.nio.ByteBuffer;

public class ByteBufferExample {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(20);
        int[] entiers = {10, 20, 30, 40, 50};
        
        for (int n : entiers) {
            buffer.putInt(n);
        }
        System.out.println("Entiers écrits : position = " + buffer.position());
        
        System.out.println("Lecture en ordre inverse :");
        for (int i = entiers.length - 1; i >= 0; i--) {
            buffer.position(i * 4);
            int valeur = buffer.getInt();
            System.out.println(valeur);
        }
    }
}
```

ByteBuffer stocke 5 entiers (4 octets chacun) dans un buffer de 20 octets. La méthode putInt écrit les entiers séquentiellement, et position(int) permet de repositionner le buffer pour lire chaque entier dans l’ordre inverse avec getInt. Cette approche montre l’efficacité des buffers pour manipuler des données en mémoire avec un contrôle précis, sans besoin d’accès disque.

</details>

## Question 15

Écrivez un programme Java qui utilise FileChannel pour écrire une chaîne dans un fichier texte, puis lire et afficher son contenu.

<details><summary>Réponse</summary>

```java  {style=github}
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileChannelExample {
    public static void main(String[] args) {
        Path chemin = Path.of("texte.txt");
        
        try (FileChannel canal = FileChannel.open(chemin, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            String texte = "Exemple FileChannel";
            ByteBuffer buffer = ByteBuffer.wrap(texte.getBytes(StandardCharsets.UTF_8));
            canal.write(buffer);
            System.out.println("Fichier écrit.");
        } catch (IOException e) {
            System.err.println("Erreur écriture : " + e.getMessage());
        }
        
        try (FileChannel canal = FileChannel.open(chemin, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            canal.read(buffer);
            buffer.flip();
            String contenu = StandardCharsets.UTF_8.decode(buffer).toString();
            System.out.println("Contenu lu : " + contenu);
        } catch (IOException e) {
            System.err.println("Erreur lecture : " + e.getMessage());
        }
    }
}
```

FileChannel permet d’écrire une chaîne dans un fichier via un ByteBuffer avec write, puis de lire le contenu avec read dans un buffer, converti en chaîne via UTF-8. L’utilisation de try-with-resources garantit la fermeture des canaux, et le buffer optimise les accès disque. Cette approche est performante pour les fichiers, surtout volumineux, par rapport aux flux traditionnels.

</details>

## Question 16

Écrivez un programme Java qui crée un fichier .properties avec des paires clé-valeur, puis lit et affiche une propriété spécifique demandée par l’utilisateur.

<details><summary>Réponse</summary>

```java  {style=github}
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.StringWriter;
import java.util.Properties;
import java.util.Scanner;
import java.io.IOException;

public class PropertiesExample {
    public static void main(String[] args) {
        Path chemin = Path.of("config.properties");
        Properties props = new Properties();
        
        try {
            props.setProperty("nom", "Alice");
            props.setProperty("âge", "30");
            StringWriter writer = new StringWriter();
            props.store(writer, "Config");
            Files.writeString(chemin, writer.toString());
            System.out.println("Fichier créé.");
        } catch (IOException e) {
            System.err.println("Erreur création : " + e.getMessage());
        }
        
        try (var reader = Files.newBufferedReader(chemin)) {
            props.load(reader);
            Scanner sc = new Scanner(System.in);
            System.out.print("Clé à lire : ");
            String clé = sc.nextLine();
            String valeur = props.getProperty(clé, "Clé non trouvée");
            System.out.println("Valeur : " + valeur);
        } catch (IOException e) {
            System.err.println("Erreur lecture : " + e.getMessage());
        }
    }
}
```

Le programme crée un fichier .properties avec Properties.store et Files.writeString, puis charge le fichier avec Properties.load. L’utilisateur entre une clé, et getProperty récupère la valeur correspondante ou un message par défaut. Cette approche utilise java.nio.file pour une gestion moderne des fichiers et Properties pour manipuler le format .properties sans dépendance externe.

</details>

## Question 17

Écrivez un programme Java qui utilise l’API java.net.http pour envoyer une requête HTTP GET à une URL donnée et afficher le code de statut et le corps de la réponse.

<details><summary>Réponse</summary>

```java  {style=github}
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class HttpGetExample {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .GET()
                .build();
        
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Code de statut : " + response.statusCode());
            System.out.println("Corps de la réponse :\n" + response.body());
        } catch (IOException | InterruptedException e) {
            System.err.println("Erreur requête : " + e.getMessage());
        }
    }
}
```

L’API java.net.http (introduite en Java 11) permet d’envoyer une requête GET à une URL avec HttpClient et HttpRequest. La réponse, obtenue via client.send, inclut le code de statut (par exemple, 200 pour succès) et le corps (ici, JSON). Cette méthode est plus moderne que HttpURLConnection, avec un support pour HTTP/2 et une gestion simplifiée des erreurs.

</details>

## Question 18

Le code suivant utilise HttpURLConnection pour envoyer une requête HTTP GET :

```java  {style=github}
import java.net.*;
import java.io.*;

URL url = new URL("https://example.com");
HttpURLConnection conn = (HttpURLConnection) url.openConnection();
conn.setRequestMethod("GET");
BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
String ligne;
StringBuilder resultat = new StringBuilder();
while ((ligne = reader.readLine()) != null) {
    resultat.append(ligne);
}
reader.close();
```

Expliquez pourquoi ce code peut être moins pratique que l’API java.net.http. Proposez une version optimisée utilisant HttpClient.

<details><summary>Réponse</summary>

HttpURLConnection est verbeux, manque de support natif pour HTTP/2, et nécessite une gestion manuelle des flux et des erreurs, ce qui complique le code. L’API java.net.http offre une syntaxe plus concise, un support pour HTTP/2, et une gestion simplifiée des requêtes asynchrones et des erreurs.

```java  {style=github}
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class HttpClientExample {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://example.com"))
                .GET()
                .build();
        
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Réponse : " + response.body());
        } catch (IOException | InterruptedException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
```

HttpClient réduit le code verbeux, gère automatiquement les flux et les fermetures, et permet une configuration flexible (par exemple, en-têtes ou requêtes asynchrones). Cette version est plus lisible et maintenable, avec une gestion d’erreurs centralisée.

</details>

## Question 19

Écrivez un programme Java qui lit une séquence d’entiers stockée dans un fichier binaire (où chaque entier occupe 4 octets) à l’aide de FileChannel et ByteBuffer, puis vérifie si toutes les valeurs sont positives (strictement supérieures à 0). Le programme doit afficher un message indiquant si toutes les valeurs sont positives ou lister les valeurs non positives trouvées.

<details><summary>Réponse</summary>

```java  {style=github}
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.IOException;
import java.util.ArrayList;

public class CheckPositiveIntegers {
    public static void main(String[] args) {
        Path chemin = Path.of("entiers.bin");
        
        try (FileChannel canal = FileChannel.open(chemin, StandardOpenOption.READ)) {
            long taille = canal.size();
            if (taille % 4 != 0) {
                System.out.println("Fichier invalide : taille non multiple de 4 octets.");
                return;
            }
            ByteBuffer buffer = ByteBuffer.allocate((int) taille);
            canal.read(buffer);
            buffer.flip();
            
            ArrayList<Integer> nonPositifs = new ArrayList<>();
            while (buffer.hasRemaining()) {
                int valeur = buffer.getInt();
                if (valeur <= 0) {
                    nonPositifs.add(valeur);
                }
            }
            
            if (nonPositifs.isEmpty()) {
                System.out.println("Toutes les valeurs sont positives.");
            } else {
                System.out.println("Valeurs non positives trouvées : " + nonPositifs);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        }
    }
}
```

Ce programme utilise FileChannel pour ouvrir un fichier binaire et ByteBuffer pour lire une séquence d’entiers (4 octets chacun). Après avoir chargé le contenu du fichier dans un buffer, il parcourt les entiers avec getInt et vérifie si chaque valeur est positive (> 0). Les valeurs non positives sont stockées dans une liste. À la fin, le programme affiche si toutes les valeurs sont positives ou liste les valeurs non conformes. L’utilisation de try-with-resources assure la fermeture du canal, et la vérification de la taille du fichier garantit que les données sont cohérentes. Cette approche est efficace pour lire des données binaires et vérifier des conditions sur des entiers.

</details>

## Question 20

Écrivez un programme Java qui lit une séquence d’entiers à partir d’un fichier texte, où les entiers sont séparés par des espaces (par exemple, "10 20 -5 30 0"), en utilisant l’API java.nio.file. Le programme doit vérifier si toutes les valeurs sont positives (strictement supérieures à 0) et afficher un message indiquant si toutes les valeurs sont positives ou lister les valeurs non positives trouvées.

<details><summary>Réponse</summary>

```java  {style=github}
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckPositiveIntegersText {
    public static void main(String[] args) {
        Path chemin = Path.of("entiers.txt");
        
        try {
            String contenu = Files.readString(chemin);
            List<Integer> entiers = Arrays.stream(contenu.trim().split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            
            List<Integer> nonPositifs = entiers.stream()
                    .filter(n -> n <= 0)
                    .collect(Collectors.toList());
            
            if (nonPositifs.isEmpty()) {
                System.out.println("Toutes les valeurs sont positives.");
            } else {
                System.out.println("Valeurs non positives trouvées : " + nonPositifs);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erreur : le fichier contient des données non valides : " + e.getMessage());
        }
    }
}
```

Ce programme utilise Files.readString de l’API java.nio.file pour lire le contenu d’un fichier texte (entiers.txt) contenant des entiers séparés par des espaces. La chaîne est divisée avec split("\\s+") pour gérer plusieurs espaces, et les valeurs sont converties en entiers via un flux avec map(Integer::parseInt). Un second flux filtre les valeurs non positives (≤ 0) dans une liste. Le programme affiche si toutes les valeurs sont positives ou liste les valeurs non conformes. Une gestion d’exceptions capture les erreurs d’entrée/sortie (IOException) et les erreurs de format (NumberFormatException) pour garantir la robustesse. Cette approche est concise et tire parti des flux Java pour un traitement fonctionnel des données textuelles.

</details>



Voici cinq questions supplémentaires sur la lecture de fichiers texte en Java, suivant le modèle du document fourni. Chaque question inclut un énoncé clair, un programme Java avec une solution, et une explication détaillée dans une section `<details><summary>Réponse</summary>`. Les questions sont conçues pour explorer différents aspects de la lecture de fichiers texte, en utilisant des approches variées (flux, `java.nio.file`, etc.) tout en respectant les directives de style (majuscule sur le premier mot des titres, usage limité des listes et caractères gras, français impeccable).

## Question 21

Écrivez un programme Java qui lit un fichier texte et compte le nombre total de lignes, de mots et de caractères (hors espaces et retours à la ligne). Le nom du fichier est saisi par l’utilisateur.

<details><summary>Réponse</summary>

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CompteTexte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du fichier : ");
        String nomFichier = scanner.nextLine();
        
        int lignes = 0;
        int mots = 0;
        int caracteres = 0;
        
        try (BufferedReader lecteur = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                lignes++;
                String[] motsLigne = ligne.trim().split("\\s+");
                if (!ligne.trim().isEmpty()) {
                    mots += motsLigne.length;
                }
                for (char c : ligne.toCharArray()) {
                    if (!Character.isWhitespace(c)) {
                        caracteres++;
                    }
                }
            }
            System.out.println("Nombre de lignes : " + lignes);
            System.out.println("Nombre de mots : " + mots);
            System.out.println("Nombre de caractères (hors espaces) : " + caracteres);
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        }
    }
}
```

Ce programme utilise `BufferedReader` pour lire un fichier texte ligne par ligne. Pour chaque ligne, il incrémente un compteur de lignes, divise la ligne en mots avec `split("\\s+")` pour compter les mots (en ignorant les lignes vides), et parcourt les caractères pour compter ceux qui ne sont pas des espaces. La gestion des exceptions avec `IOException` et l’utilisation de `try-with-resources` assurent une lecture robuste et une fermeture automatique du flux. Cette approche est efficace pour analyser le contenu textuel et fournit des statistiques précises.

</details>

## Question 22

Écrivez un programme Java qui lit un fichier texte et affiche uniquement les lignes contenant un mot spécifique saisi par l’utilisateur. Le programme doit être insensible à la casse.

<details><summary>Réponse</summary>

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Scanner;

public class FiltreLignes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du fichier : ");
        String nomFichier = scanner.nextLine();
        System.out.print("Entrez le mot à rechercher : ");
        String mot = scanner.nextLine().toLowerCase();
        
        try {
            String contenu = Files.readString(Path.of(nomFichier));
            String[] lignes = contenu.split("\n");
            int numeroLigne = 0;
            for (String ligne : lignes) {
                numeroLigne++;
                if (ligne.toLowerCase().contains(mot)) {
                    System.out.println(numeroLigne + ": " + ligne);
                }
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        }
    }
}
```

Ce programme utilise `Files.readString` de l’API `java.nio.file` pour lire l’intégralité d’un fichier texte en une seule chaîne, puis divise cette chaîne en lignes avec `split("\n")`. Chaque ligne est vérifiée pour voir si elle contient le mot saisi (converti en minuscules pour une recherche insensible à la casse) à l’aide de `contains`. Les lignes correspondantes sont affichées avec leur numéro. La gestion des exceptions avec `IOException` garantit la robustesse, et l’approche est simple et adaptée aux fichiers de taille modérée.

</details>

## Question 23

Écrivez un programme Java qui lit un fichier texte et remplace toutes les occurrences d’un mot donné par un autre mot, puis affiche le contenu modifié. Les mots sont saisis par l’utilisateur, et le programme doit préserver la casse.

<details><summary>Réponse</summary>

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RemplaceMot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du fichier : ");
        String nomFichier = scanner.nextLine();
        System.out.print("Entrez le mot à remplacer : ");
        String ancienMot = scanner.nextLine();
        System.out.print("Entrez le nouveau mot : ");
        String nouveauMot = scanner.nextLine();
        
        StringBuilder contenuModifie = new StringBuilder();
        
        try (BufferedReader lecteur = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                String ligneModifiee = ligne.replaceAll("\\b" + ancienMot + "\\b", nouveauMot);
                contenuModifie.append(ligneModifiee).append("\n");
            }
            System.out.println("Contenu modifié :\n" + contenuModifie);
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        }
    }
}
```

Ce programme lit un fichier texte ligne par ligne avec `BufferedReader` et utilise `String.replaceAll` avec une expression régulière (`\\b` pour les limites de mot) afin de remplacer uniquement les occurrences exactes du mot saisi par le nouveau mot, en préservant la casse. Les lignes modifiées sont accumulées dans un `StringBuilder` pour une gestion efficace de la mémoire. Le contenu modifié est affiché à la fin. L’utilisation de `try-with-resources` et la gestion des exceptions assurent une exécution fiable.

</details>

## Question 24

Écrivez un programme Java qui lit un fichier texte et affiche les n premières lignes, où n est un nombre saisi par l’utilisateur. Si le fichier a moins de n lignes, toutes les lignes sont affichées.

<details><summary>Réponse</summary>

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AffichePremieresLignes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du fichier : ");
        String nomFichier = scanner.nextLine();
        System.out.print("Entrez le nombre de lignes à afficher : ");
        int n = scanner.nextInt();
        
        try (BufferedReader lecteur = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            int compte = 0;
            while ((ligne = lecteur.readLine()) != null && compte < n) {
                compte++;
                System.out.println(compte + ": " + ligne);
            }
            if (compte == 0) {
                System.out.println("Le fichier est vide.");
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        }
    }
}
```

Ce programme utilise `BufferedReader` pour lire un fichier texte ligne par ligne. Un compteur suit le nombre de lignes lues, et la lecture s’arrête lorsque n lignes ont été affichées ou que le fichier est épuisé. Chaque ligne est affichée avec son numéro. Si le fichier est vide, un message approprié est affiché. La gestion des exceptions avec `IOException` et l’utilisation de `try-with-resources` garantissent une exécution robuste. Cette approche est efficace et simple pour limiter l’affichage aux premières lignes.

</details>

## Question 25

Écrivez un programme Java qui lit un fichier texte et vérifie si son contenu est un palindrome (c’est-à-dire si le texte lu à l’envers est identique au texte original, en ignorant la casse, les espaces et la ponctuation).

<details><summary>Réponse</summary>

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Scanner;

public class VerifiePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du fichier : ");
        String nomFichier = scanner.nextLine();
        
        try {
            String contenu = Files.readString(Path.of(nomFichier));
            String nettoye = contenu.toLowerCase().replaceAll("[^a-z0-9]", "");
            String inverse = new StringBuilder(nettoye).reverse().toString();
            
            if (nettoye.equals(inverse)) {
                System.out.println("Le contenu du fichier est un palindrome.");
            } else {
                System.out.println("Le contenu du fichier n’est pas un palindrome.");
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        }
    }
}
```

Ce programme utilise `Files.readString` pour lire le contenu d’un fichier texte. Le texte est nettoyé en convertissant en minuscules et en supprimant tout caractère non alphanumérique avec `replaceAll("[^a-z0-9]", "")`. Un `StringBuilder` est utilisé pour inverser la chaîne nettoyée, et une comparaison vérifie si le texte est un palindrome. La gestion des exceptions avec `IOException` assure la robustesse. Cette approche est concise et adaptée pour vérifier des propriétés textuelles complexes comme les palindromes.

</details>


Voici une question sur le mappage en mémoire en Java, suivant le modèle du document initial. Elle inclut un énoncé clair, un programme Java utilisant le mappage en mémoire avec `FileChannel` et `MappedByteBuffer`, ainsi qu’une explication détaillée dans une section `<details><summary>Réponse</summary>`. La question respecte les directives de style : majuscule uniquement sur le premier mot du titre, usage limité des listes et caractères gras, et français impeccable.

## Question 26

Écrivez un programme Java qui utilise le mappage en mémoire pour lire un fichier binaire contenant une séquence d’entiers (4 octets chacun) et calcule la somme de ces entiers. Le nom du fichier est saisi par l’utilisateur, et le programme doit vérifier que la taille du fichier est un multiple de 4 octets pour garantir des données valides.

<details><summary>Réponse</summary>

```java
import java.nio.channels.FileChannel;
import java.nio.MappedByteBuffer;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.Scanner;

public class SommeEntiersMappage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du fichier binaire : ");
        String nomFichier = scanner.nextLine();
        
        try (FileChannel canal = FileChannel.open(Path.of(nomFichier), StandardOpenOption.READ)) {
            long taille = canal.size();
            if (taille % 4 != 0) {
                System.out.println("Erreur : la taille du fichier n’est pas un multiple de 4 octets.");
                return;
            }
            
            MappedByteBuffer buffer = canal.map(FileChannel.MapMode.READ_ONLY, 0, taille);
            long somme = 0;
            while (buffer.hasRemaining()) {
                somme += buffer.getInt();
            }
            
            System.out.println("Somme des entiers : " + somme);
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        }
    }
}
```

Ce programme utilise le mappage en mémoire via `FileChannel` et `MappedByteBuffer` pour lire un fichier binaire contenant des entiers (4 octets chacun). Le fichier est ouvert avec `FileChannel.open` en mode lecture, et sa taille est vérifiée pour s’assurer qu’elle est un multiple de 4 octets, garantissant des données valides. La méthode `map` crée un `MappedByteBuffer` qui mappe le contenu du fichier directement en mémoire, permettant un accès rapide aux données. La somme des entiers est calculée en lisant chaque entier avec `getInt` jusqu’à ce que le buffer soit épuisé. L’utilisation de `try-with-resources` assure la fermeture du canal, et la gestion des exceptions avec `IOException` garantit la robustesse. Cette approche est particulièrement efficace pour les fichiers volumineux, car le mappage en mémoire réduit les accès disque en déléguant la gestion des données au système d’exploitation.

</details>
