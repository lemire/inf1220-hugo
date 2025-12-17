---
title: "Les flux de données: lecture dans des fichiers et autres"
weight: 2
---

# Les flux de données: lecture dans des fichiers et autres

<p>Nous avons couvert la façon d'afficher des données à l'écran et de lire des données à partir du clavier en utilisant les flux de données (streams) dans les leçons précédentes. Quand nous avons utilisé les méthodes System.out.print ou System.out.println pour afficher des données à l'écran, ces dernières ont été envoyées sur un flux de sortie (output stream). Nous nous servirons des flux d'entrée et de sortie pour lire et écrire des données dans un fichier texte. Mais auparavant, il nous faut savoir comment créer le fichier dans lequel ces données seront archivées.</p>

<p>Pour manipuler les flux d'entrée et de sortie, nous utilisons les classes du package java.io. Les données sont manipulées suivant deux principes : la lecture/écriture en flux binaire ou en flux texte. Le tableau ci-dessous représente les différents flux que nous pouvons manipuler ainsi que les classes abstraites de base, l'implémentation, les fichiers et les tampons d'entrée-sortie qui leur sont associés.</p>

|                      | Flux texte (lecture) | Flux texte (écriture) | Flux binaire (lecture) | Flux binaire (écriture) |
|----------------------|----------------------|-----------------------|------------------------|-------------------------|
| Classe abstraite de base | Reader               | Writer                | InputStream            | OutputStream            |
| Implémentation       | InputStreamReader    | PrintWriter           | DataInputStream        | DataOutputStream        |
| Fichier              | FileReader           | FileWriter            | FileInputStream        | FileOutputStream        |
| Buffer E/S           | BufferedReader       | BufferedWriter        | BufferedInputStream    | BufferedOutputStream    |
| Mémoire              |  StringReader        | StringWriter          | ByteArrayInputStream   | ByteArrayOutputStream   |

## La classe File

<p>Pour travailler avec les fichiers et les répertoires, nous utilisons la classe File. Un objet de cette classe peut représenter un fichier ou un répertoire.

Il est très important de savoir qu'il n'est pas nécessaire d'avoir physiquement le fichier ou le répertoire sur un disque avant d'utiliser la classe File. Pour utiliser cette classe, nous devons intégrer le package java.io.* dans notre programme.

La classe File dispose d'un constructeur qui prend en paramètre l'emplacement du fichier que nous voulons créer. Si cet emplacement n'est pas spécifié et que c'est seulement le nom du fichier qui est passé en paramètre, ce dernier est créé dans le répertoire par défaut.</p>

<p>Pour créer un fichier, nous appelons le constructeur de la classe File de la façon suivante :</p>

```java  {style=github}
File exempleFile1= new File ("fichier");

File exempleFile2= new File ("c:\exemple\unFichier.txt");
```

<p>Dans le premier cas, un objet <a href="https://docs.oracle.com/javase/8/docs/api/java/io/File.html">File</a>, agissant comme référence vers le fichier dans l'arborescence du système de fichier, et ce pour un fichier du nom "fichier" dans le répertoire courant ("." dans Linux/Mac OS) sera crée. Dans le deuxième cas, une référence vers le fichier sur le disque "C:", dossier "/exemple", fichier "unFichier.txt" sera créée (exemple pour Windows ...). À ce stade, aucun fichier n'est crée ou ouvert, il ne s'agit que d'une référence vers l'emplacement possible d'un fichier. Pour savoir si le fichier existe ou non, il est possible d'utiliser la méthode exists() :</p>

```java  {style=github}
File unFichier = new File("lefichier"); // création d'un objet fichier

if (!unFichier.exists()) {
    System.out.println("le fichier n'existe pas!");
}
```

<p>Pour créer un nouveau fichier sur un disque dur, il faut, dans un premier temps, créer l'objet File avec le nom du fichier voulu et, par la suite, utiliser la méthode createNewFile(), comme le montre le code ci-dessous :</p>

```java  {style=github}
File unFichier = new File("lefichier"); // création d'un objet fichier
if (unFichier.createNewFile()) {
       System.out.println("le fichier est créé!");
} else {
       System.out.println("le fichier ne pas être créé");
}
```

## Lecture d'un fichier

<h2>Lecture dans un fichier de bas niveau</h2>

<p>En informatique, on fait référence à une approche de <em>bas niveau</em> quand celle-ci demande au programmeur de tenir compte de plus de détails techniques. Les approche de bas niveau demandent plus d'effort, mais peuvent offrir plus de flexibilité.</p>

<p>Java possède deux classes, à savoir FileReader et File, qui nous permettent de lire un fichier texte de bas niveau. Pour cela, nous devons connaître le fichier que nous voulons lire. Pour cette leçon, nous avons choisi de lire le fichier unfichier.</p>

<p>Pour lire un fichier, nous devons d'abord construire un objet de type File (la classe File), qui prend comme paramètre le nom du fichier à lire. Ici, il s'agit de unfichier, et nous obtenons :</p>

```java  {style=github}
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

<p>Nous venons juste de créer une instance de l'objet FileReader permettant de lire le contenu d'un fichier. Cependant, la classe FileReader ne possède que des méthodes pouvant lire «&nbsp;en bas niveau&nbsp;», c'est-à-dire que la méthode read permet de lire caractère par caractère le contenu d'un fichier. Cette méthode peut lever une exception si, par exemple, nous ne pouvons accéder au disque dur ou si le fichier en question est protégé. Voici comment lire un caractère d'un fichier :</p>

```java  {style=github}
try {
    FileReader fichierALire = new FileReader("unfichier");
    char caractere = (char) fichierALire.read();
    System.out.print(caractere);
} catch (FileNotFoundException exception) {
    System.out.println("Il y a une erreur lors de la lecture: " + exception.getMessage());
}
```

<p>Avec tout ce que nous avons vu jusqu'à présent, nous ne pouvons écrire qu'un seul caractère à l'écran. À chaque appel de la méthode read, un caractère est lu. Pour lire un fichier en entier, il faut donc vérifier si la méthode read renvoie -1 car c'est cette valeur qui indique la fin d'un fichier. Le code ci-dessous montre comment nous pouvons procéder :</p>

```java  {style=github}
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

```java  {style=github}
fichierALire.close();
```

<h2>Lecture dans un fichier de haut niveau</h2>

<p>Nous venons de terminer la lecture de bas niveau d'un fichier. Nous abordons maintenant celle de haut niveau, car la classe FileReader n'est pas très efficace. En effet, elle pourrait s'avérer longue en raison du nombre impressionnant d'appels à la méthode read qu'elle devrait faire. La classe BufferedReader permet pour sa part de lire un fichier texte avec des fonctions de niveau supérieur. Avec ces fonctions, nous pouvons, par exemple, lire un fichier texte ligne par ligne.</p>



<p>Pour une lecture de haut niveau d'un fichier avec les fonctions de la classe BufferedReader, il faut créer un objet de type BufferedReader qui doit prendre en paramètre un type Reader et lui donner un objet FileReader. Pour ce faire, il faut d'abord créer le fichier à lire. Le code ci-dessous explique mieux la façon à suivre :</p>

```java  {style=github}
try {
    File FichierALire = new File("textfichier");
    FileReader unFichier = new FileReader(FichierALire);
    BufferedReader leBuffer = new BufferedReader(unFichier);
} catch (FileNotFoundException exception) {
    System.out.println(" Fichier introuvable!");
}
```

<p>Pour lire maintenant le fichier créé, nous devons utiliser la méthode readLine, qui le fait ligne par ligne et retourne null à la fin du fichier. Nous pouvons réaliser cela grâce au code ci-dessous :</p>

```java  {style=github}
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

## Écriture d'un fichier texte

<p>Nous aborderons maintenant l'écriture de données vers un fichier texte. Cette dernière sert à les stocker lorsque le programme ne s'exécute plus et en vue de pouvoir les récupérer plus tard ou les envoyer à d'autres personnes. Comme vous le verrez, l'écriture de fichiers texte est assez similaire à leur lecture. Pour écrire, nous allons utiliser les trois classes suivantes FileWriter, BufferedWriter et PrintWriter.</p>

<h2>Écriture de bas niveau</h2>

<p>Pour écrire dans un fichier, nous utilisons la classe FileWriter. Nous commençons par créer un objet File qui sera le fichier vers lequel nous désirons écrire. Par la suite, nous produirons l'objet FileWriter. Le fichier représenté par l'objet File sera créé s'il n'existe pas. Dans le cas contraire, le contenu de ce fichier sera complètement écrasé. La classe FileWriter offre des méthodes de bas niveau pour l'écriture. Nous trouvons plusieurs méthodes dont Write pour écrire un caractère, une partie de String ou enfin un String complet. Le code ci-dessous démontre comment écrire des données dans un fichier :</p>

```java  {style=github}
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

```java  {style=github}
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

```java  {style=github}
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

```java  {style=github}
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

## StringWriter et StringReader

StringWriter et StringReader sont des classes du package java.io en Java, conçues pour manipuler des données textuelles en mémoire sous forme de chaînes. StringWriter accumule les données écrites dans un StringBuffer interne, permettant de récupérer le contenu sous forme de String via toString() ou getBuffer(). Elle est utile pour générer du texte dynamiquement sans écrire directement dans un fichier ou un flux. StringReader lit des données à partir d’une String comme si elle provenait d’un flux, offrant une interface pratique pour parser ou traiter une chaîne comme un flux de caractères. Ces classes sont particulièrement adaptées pour des opérations intermédiaires, comme la conversion de données avant leur sérialisation ou désérialisation.

{{<inlineJava path="StringWriterReaderExample.java" lang="java">}}
import java.io.StringWriter;
import java.io.StringReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StringWriterReaderExample {
    public static void main(String[] args) {
        // Étape 1 : Utilisation de StringWriter pour créer une chaîne
        StringWriter writer = new StringWriter();
        writer.write("param1=valeur1\n");
        writer.write("param2=valeur2\n");
        writer.write("param3=valeur3\n");
        System.out.println("Contenu généré par StringWriter :\n" + writer.toString());

        // Étape 2 : Utilisation de StringReader pour lire la chaîne
        StringReader reader = new StringReader(writer.toString());
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            System.out.println("\nLecture ligne par ligne avec StringReader :");
            String ligne;
            while ((ligne = bufferedReader.readLine()) != null) {
                System.out.println("Ligne : " + ligne);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        }
    }
}
{{</inlineJava>}}


## Données binaries en mémoire


ByteArrayInputStream et ByteArrayOutputStream sont des classes du package java.io en Java, conçues pour manipuler des données binaires en mémoire. ByteArrayInputStream permet de lire un tableau de bytes (byte[]) comme un flux d’entrée, simulant une source de données sans accès au disque. Elle est utile pour tester, parser des données binaires ou réutiliser des bytes existants. ByteArrayOutputStream accumule les octets écrits dans un buffer interne, que l’on peut récupérer via toByteArray() ou convertir en chaîne. Cette classe est idéale pour générer des données binaires, comme des sérialisations ou des contenus à envoyer sur un réseau, sans écrire immédiatement sur un fichier. 

{{<inlineJava path="ByteArrayStreamExample.java" lang="java">}}
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets; // Recommandé pour spécifier les jeux de caractères

public class ByteArrayStreamExample {
    public static void main(String[] args) {
        // Étape 1 : Utilisation de ByteArrayOutputStream pour écrire des données
        // Utilisation de try-with-resources pour s'assurer que le flux est fermé automatiquement
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            String message = "Bonjour Java";
            outputStream.write(message.getBytes(StandardCharsets.UTF_8)); // Utiliser StandardCharsets
            outputStream.write(33); // Ajout d'un octet (caractère '!')

            byte[] bytesWritten = outputStream.toByteArray();
            System.out.println("Contenu de ByteArrayOutputStream (taille) : " + bytesWritten.length + " octets");
            System.out.println("Contenu écrit : " + new String(bytesWritten, StandardCharsets.UTF_8)); // Afficher le contenu écrit

            // Étape 2 : Utilisation de ByteArrayInputStream pour lire les données
            // ByteArrayInputStream n'a pas strictement besoin d'être fermé car il opère sur un tableau d'octets,
            // mais c'est une bonne pratique pour la cohérence ou s'il s'agissait d'un autre type de flux.
            try (ByteArrayInputStream inputStream = new ByteArrayInputStream(bytesWritten)) {
                System.out.println("\nLecture avec ByteArrayInputStream :");
                int byteRead;
                while ((byteRead = inputStream.read()) != -1) {
                    System.out.print((char) byteRead);
                }
                System.out.println();
            }
        } catch (IOException e) {
            // Capture des IOException potentielles lors des opérations de flux ou de l'encodage du jeu de caractères
            System.err.println("Une erreur s'est produite lors des opérations de flux : " + e.getMessage());
        }
    }
}
{{</inlineJava>}}



## Path et Files

La lecture de fichiers en Java est une tâche courante qui a évolué avec les versions modernes du langage, notamment à partir de Java 7 avec l’introduction de l’API java.nio.file. Cette API, plus robuste et flexible que l’ancienne java.io, simplifie la gestion des fichiers et des répertoires. À partir de Java 21, les développeurs bénéficient d’une syntaxe encore plus concise grâce aux flux (Stream) et aux améliorations des performances, tout en conservant une gestion efficace des erreurs.

Un concept clé ici est l’utilisation de Path et Files. Un objet Path, créé via Path.of, représente un chemin dans le système de fichiers de manière portable, compatible avec différents systèmes d’exploitation. La classe Files, quant à elle, propose des méthodes statiques pour manipuler les fichiers, comme Files.lines, qui lit un fichier sous forme de flux de lignes. Ce flux permet de traiter les données de manière fonctionnelle, en utilisant des lambdas pour des opérations comme le filtrage ou la transformation.

{{<inlineJava path="Main.java" lang="java">}}
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

void main() {
  try {
    Path chemin = Path.of("templates/index.html");
    Files.lines(chemin)
          .forEach(ligne -> System.out.println("Lue : " + ligne));
  } catch (IOException e) {
    System.out.println("Erreur de lecture : " + e.getMessage());
  }
}

{{</inlineJava>}}

Dans le prochain exemple, le programme lit le contenu d’un fichier config.txt en une seule chaîne avec Files.readString. L’objet Path est créé pour désigner le fichier, et la méthode Files.readString récupère son contenu directement, éliminant le besoin de boucler sur les lignes. Comme dans l’exemple précédent, une gestion d’exceptions via un bloc try-catch capture les erreurs potentielles, telles qu’un fichier introuvable ou des problèmes d’accès, assurant la robustesse du programme.

{{<inlineJava path="LectureConfig.java" lang="java">}}
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.NoSuchFileException;
import java.io.IOException;

public class LectureConfig {

    public static void main(String[] args) {
        // Chemin vers le fichier config.txt (ici placé dans le répertoire courant du projet)
        Path chemin = Path.of("config.txt");

        try {
            // Lecture complète du fichier en une seule String
            String contenu = Files.readString(chemin);

            // Affichage du contenu lu
            System.out.println("Contenu du fichier config.txt :");
            System.out.println(contenu);

            // Vous pouvez maintenant traiter la chaîne comme bon vous semble
            // par exemple : analyser des propriétés, parser du JSON, etc.

        } catch (NoSuchFileException e) {
            System.err.println("Erreur : le fichier config.txt n'existe pas à l'emplacement : " + chemin.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
{{</inlineJava>}}


## Fichiers *properties*

Le format de fichiers properties est un format de configuration simple et léger, nativement pris en charge par Java via la classe java.util.Properties. Il stocke des données sous forme de paires clé-valeur, où chaque ligne suit la syntaxe clé=valeur ou clé:valeur, avec la possibilité d’ajouter des commentaires commençant par # ou !.

```properties
# Configuration de l'application
# Date de dernière mise à jour : 28 juin 2025

# Paramètres de connexion à la base de données
db.host=localhost
db.port=3306
db.name=mabase
db.user=admin
db.password=secret

# Paramètres du serveur
server.url=https://monapp.com
server.port=8080
server.timeout=30

# Autres configurations
app.version=1.0.0
app.debug=false
app.language=fr
```


Ce programme illustre la création, la sauvegarde, et le chargement d'un tel fichier. Il exécute trois étapes : d’abord, il crée un fichier config.properties avec des paires clé-valeur initiales (comme application.nom=MonApp) en utilisant Files.writeString pour écrire le contenu généré par Properties.store. Ensuite, il lit ce fichier avec Files.readString, charge les propriétés dans un objet Properties, et affiche les paires clé-valeur. Enfin, il modifie les propriétés en ajoutant une nouvelle clé (nouveau.param) et en mettant à jour une existante (serveur.port), puis réécrit le fichier. Entre chaque étape, le programme lit et affiche le contenu brut du fichier pour montrer son état.

{{<inlineJava path="PropertiesReadWriteExample.java" lang="java">}}

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Properties;
import java.io.StringReader;
import java.io.StringWriter;

public class PropertiesReadWriteExample {
    public static void main(String[] args) {
        Path chemin = Path.of("config.properties");
        Properties props = new Properties();

        // Étape 1 : Création initiale du fichier properties
        try {
            props.setProperty("application.nom", "MonApp");
            props.setProperty("application.version", "1.0.0");
            props.setProperty("serveur.port", "8080");
            props.setProperty("serveur.hôte", "localhost");
            StringWriter writer = new StringWriter();
            props.store(writer, "Configuration initiale");
            String contenuInitial = writer.toString();
            Files.writeString(chemin, contenuInitial);
            System.out.println("Fichier créé avec succès : " + chemin.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Erreur lors de la création du fichier : " + e.getMessage());
            return;
        }

        // Lecture et affichage du contenu après création
        try {
            String contenu = Files.readString(chemin);
            System.out.println("\nContenu brut du fichier après création :\n" + contenu);
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture post-création : " + e.getMessage());
            return;
        }

        // Étape 2 : Lecture du fichier
        try {
            String contenu = Files.readString(chemin);
            props.clear();
            props.load(new StringReader(contenu));
            System.out.println("\nContenu du fichier après lecture (paires clé-valeur) :");
            props.forEach((clé, valeur) -> System.out.println(clé + ": " + valeur));
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
            return;
        }

        // Lecture et affichage du contenu avant modification
        try {
            String contenu = Files.readString(chemin);
            System.out.println("\nContenu brut du fichier avant modification :\n" + contenu);
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture pré-modification : " + e.getMessage());
            return;
        }

        // Étape 3 : Modification et réécriture
        try {
            props.setProperty("nouveau.param", "valeurAjoutée");
            props.setProperty("serveur.port", "9090");
            StringWriter writer = new StringWriter();
            props.store(writer, "Configuration mise à jour");
            String nouveauContenu = writer.toString();
            Files.writeString(chemin, nouveauContenu);
            System.out.println("\nFichier modifié avec succès : " + chemin.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Erreur lors de la modification : " + e.getMessage());
            return;
        }

        // Lecture et affichage du contenu après modification
        try {
            String contenu = Files.readString(chemin);
            System.out.println("\nContenu brut du fichier après modification :\n" + contenu);
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture post-modification : " + e.getMessage());
        }
    }
}
{{</inlineJava>}}


## UTF-8

Depuis Java 11, les accès texte aux fichiers, via des classes comme Files.readString ou Files.writeString de l’API java.nio.file, utilisent par défaut l’encodage UTF-8, remplaçant l’encodage par défaut de la plateforme. UTF-8 est un encodage de longueur variable qui représente les caractères Unicode, utilisant un à quatre octets par caractère : les caractères ASCII (0 à 127) sont codés sur un seul octet, tandis que les caractères non-ASCII, comme les accents ou les idéogrammes, nécessitent plus d’octets. En revanche, les chaînes de caractères en Java sont stockées en mémoire en UTF-16, où chaque caractère occupe généralement deux octets, même pour les caractères ASCII. Lorsqu’un fichier texte contenant uniquement des caractères ASCII est enregistré en UTF-8 avec Files.writeString, chaque caractère est écrit sur un octet, produisant un fichier plus compact. Par exemple, la chaîne "Bonjour" (7 caractères ASCII) génère un fichier de 7 octets en UTF-8, contre 14 octets si elle était enregistrée en UTF-16, où chaque caractère utilise deux octets. Cette différence illustre l’efficacité de l’UTF-8 pour les textes ASCII tout en assurant la compatibilité avec l’Unicode, contrairement à l’UTF-16 utilisé en interne par Java. Voici un exemple pour illustrer ce concept.


{{<inlineJava path="EncodageFichierTexte.java" lang="java">}}
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class EncodageFichierTexte {
    public static void main(String[] args) {
        String texteAscii = "Bonjour";
        String fichierUtf8 = "texte_utf8.txt";
        String fichierUtf16 = "texte_utf16.txt";
        
        // Écriture en UTF-8
        try {
            Files.writeString(Path.of(fichierUtf8), texteAscii, StandardCharsets.UTF_8);
            long tailleUtf8 = Files.size(Path.of(fichierUtf8));
            System.out.println("Taille du fichier UTF-8 (" + fichierUtf8 + ") : " + tailleUtf8 + " octets");
        } catch (IOException e) {
            System.err.println("Erreur lors de l’écriture en UTF-8 : " + e.getMessage());
        }
        
        // Écriture en UTF-16
        try {
            Files.writeString(Path.of(fichierUtf16), texteAscii, StandardCharsets.UTF_16);
            long tailleUtf16 = Files.size(Path.of(fichierUtf16));
            System.out.println("Taille du fichier UTF-16 (" + fichierUtf16 + ") : " + tailleUtf16 + " octets");
        } catch (IOException e) {
            System.err.println("Erreur lors de l’écriture en UTF-16 : " + e.getMessage());
        }
        
        // Vérification du contenu en lisant le fichier UTF-8
        try {
            String contenuUtf8 = Files.readString(Path.of(fichierUtf8), StandardCharsets.UTF_8);
            System.out.println("Contenu lu depuis le fichier UTF-8 : " + contenuUtf8);
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier UTF-8 : " + e.getMessage());
        }
        
        // Vérification du contenu en lisant le fichier UTF-16
        try {
            String contenuUtf16 = Files.readString(Path.of(fichierUtf16), StandardCharsets.UTF_16);
            System.out.println("Contenu lu depuis le fichier UTF-16 : " + contenuUtf16);
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier UTF-16 : " + e.getMessage());
        }
    }
}
{{</inlineJava>}}


## Boutisme


Le boutisme, ou endianness, désigne l’ordre dans lequel les octets d’une donnée multi-octets (comme un entier) sont stockés ou lus en mémoire. Il existe deux ordres principaux : big-endian, où l’octet de poids fort est stocké en premier, et little-endian, où l’octet de poids faible est stocké en premier. Par exemple, pour l’entier 258 (représenté en hexadécimal comme `00 00 01 02`), un système big-endian stocke les octets dans l’ordre `00 00 01 02`, tandis qu’un système little-endian les stocke comme `02 01 00 00`. Ce concept est crucial lors de la manipulation de fichiers binaires ou de communications réseau, car une mauvaise interprétation de l’ordre peut produire des résultats erronés.

En Java, des classes comme `DataOutputStream` utilisent par défaut l’ordre big-endian, mais `ByteBuffer` permet de spécifier l’ordre (big-endian ou little-endian) avec `ByteOrder`. Une mauvaise gestion du boutisme peut entraîner des erreurs lors de la lecture de données produites par un système avec un ordre différent. L’exemple suivant illustre ce problème en écrivant des entiers dans un fichier binaire en big-endian et en les lisant en supposant un ordre little-endian.


Voici un programme Java qui écrit trois entiers (100, 200, 300) dans un fichier binaire en utilisant l’ordre big-endian, puis lit ce fichier en supposant un ordre little-endian. 

{{<inlineJava path="ImpactBoutismeManuel.java" lang="java">}}
import java.io.*;

public class ImpactBoutismeManuel {
    public static void main(String[] args) {
        String nomFichier = "entiers_manuel.bin";
        
        // Écriture en big-endian
        try (DataOutputStream sortie = new DataOutputStream(new FileOutputStream(nomFichier))) {
            int[] entiers = {100, 200, 300};
            for (int valeur : entiers) {
                sortie.writeInt(valeur); // Big-endian par défaut
            }
            System.out.println("Entiers écrits (big-endian) : 100, 200, 300");
        } catch (IOException e) {
            System.err.println("Erreur lors de l’écriture : " + e.getMessage());
            return;
        }
        
        // Lecture en supposant little-endian avec conversion manuelle
        try (DataInputStream entree = new DataInputStream(new FileInputStream(nomFichier))) {
            System.out.println("Lecture en supposant little-endian (conversion manuelle) :");
            for (int i = 0; i < 3; i++) {
                byte[] octets = new byte[4];
                if (entree.read(octets) != 4) {
                    System.err.println("Erreur : données insuffisantes.");
                    return;
                }
                // Conversion manuelle : inverser les octets pour little-endian
                int valeur = ((octets[3] & 0xFF) << 24) |
                             ((octets[2] & 0xFF) << 16) |
                             ((octets[1] & 0xFF) << 8)  |
                             (octets[0] & 0xFF);
                System.out.println("Entier lu : " + valeur);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture : " + e.getMessage());
        }
    }
}
{{</inlineJava>}}


Ce programme illustre l’impact du boutisme sans utiliser ByteBuffer. Dans la phase d’écriture, DataOutputStream écrit les entiers 100, 200 et 300 dans un fichier binaire en big-endian. Par exemple, l’entier 100 (00 00 00 64 en hexadécimal) est stocké comme 00 00 00 64. Lors de la lecture, le programme lit chaque bloc de 4 octets avec DataInputStream et effectue une conversion manuelle pour interpréter les octets en little-endian. Pour cela, il inverse l’ordre des octets : l’octet 0 (le dernier en big-endian) devient le poids faible, et l’octet 3 (le premier) devient le poids fort. La formule ((octets[3] & 0xFF) << 24) | ... reconstruit l’entier en plaçant chaque octet à la bonne position. Ainsi, 00 00 00 64 est interprété comme 64 00 00 00, soit 1 677 721 600 en décimal.


## Accès à l'Internet


{{% hint info %}}

Dans ce cours, vous n'aurez pas à gérer des requêtes HTTP. Il est néanmoins nécessaire d'être familier avec le principle.
Prenez la peine de lire et d'exécuter les exemples suivants.

{{% /hint %}}


Java permet aussi d'avoir accès à des ressources sur le web. Grâce à ses bibliothèques modernes, comme l'API HttpClient introduite dans Java 11, il est possible d'effectuer des requêtes HTTP de manière simple et efficace, facilitant la récupération de données depuis des serveurs distants.
Le protocole HTTP (HyperText Transfer Protocol) est un protocole de communication utilisé pour transférer des données sur le web, permettant aux clients (comme les navigateurs) de demander des ressources à des serveurs.  HTTP est un protocole sans état fonctionnant en mode client-serveur : un client envoie une requête spécifiant une méthode, une URI, des en-têtes et parfois un corps, et le serveur répond avec un code de statut, des en-têtes et un corps. Par sans état, on veut dire que les requêtes sont traitées de manière indépendante et non comme une conversation continue.

La majorité des services web utilisent le format JSON.
JSON (JavaScript Object Notation) est un format léger d’échange de données, facile à lire et à écrire pour les humains et les machines. Il est basé sur une syntaxe dérivée des objets JavaScript, mais il est utilisé par de nombreux langages de programmation. JSON est particulièrement populaire pour transmettre des données entre un serveur et une application web, notamment dans les API REST. Un document JSON est constitué de paires clé/valeur, de tableaux et d’objets imbriqués. Il ne supporte que quelques types de données : chaînes de caractères, nombres, booléens, tableaux, objets et null. 

*Exemple de structure JSON :*

```json {style=github}
{
  "nom": "Alice",
  "age": 30,
  "estEtudiant": false,
  "competences": ["Java", "HTML", "JavaScript"]
}
```

*Exemple d’utilisation en JavaScript :*

```javascript {style=github}
const donnees = '{"nom": "Alice", "age": 30}';
const obj = JSON.parse(donnees);
console.log(obj.nom); // Affiche "Alice"
```

La vidéo suivante (optionnelle) explique comment les systèmes peuvent être optimisés pour traitement le JSON efficacement.

{{< youtube id="wlvKAT7SZIQ" >}}


Le programme Java suivant récupère et affiche les prévisions météo horaires pour Montréal en interrogeant l’API Open-Meteo, illustrant l’utilisation de l’API HTTP Client de Java 11 (java.net.http) et la manipulation de données JSON et temporelles. Les imports java.net.URI, java.net.http.HttpClient, java.net.http.HttpRequest et java.net.http.HttpResponse permettent de gérer les requêtes HTTP, tandis que java.time.LocalDateTime et java.time.format.DateTimeFormatter facilitent le traitement des horodatages. Le programme commence par définir les coordonnées géographiques de Montréal (latitude 45.5017, longitude -73.5673) et construit une URL pour demander les données horaires de température (temperature_2m) et de précipitations (precipitation). Ces imports et cette initialisation posent les bases pour une interaction réseau et une gestion efficace des données météorologiques.

Un HttpClient est créé avec HttpClient.newHttpClient(), offrant une configuration par défaut pour gérer les connexions HTTP. Une requête GET est construite via HttpRequest.newBuilder(), spécifiant l’URI de l’API Open-Meteo et la méthode GET, puis envoyée avec client.send(). La réponse, un JSON, est récupérée comme une chaîne grâce à HttpResponse.BodyHandlers.ofString(). Dans le contexte du protocole HTTP, cette requête GET récupère des données sans modifier la ressource serveur, et l’API Open-Meteo renvoie un JSON structuré contenant les prévisions. Le programme encapsule cette logique dans un bloc try-catch pour capturer les erreurs, comme les problèmes de connexion ou les réponses mal formées, démontrant une gestion basique mais essentielle des exceptions.

Le traitement du JSON repose sur une approche manuelle, sans bibliothèque externe. La méthode auxiliaire extractArray extrait les tableaux JSON pour les horaires (time), les températures (temperature_2m) et les précipitations (precipitation) en isolant les sous-chaînes entre crochets à partir des clés correspondantes. Cette méthode, bien que fonctionnelle, est sensible aux changements de structure du JSON, contrairement à des bibliothèques comme Jackson. Les données extraites sont divisées en tableaux de chaînes avec split(","), représentant les valeurs horaires. Cette étape illustre comment manipuler des données structurées issues d’une API REST, tout en mettant en lumière les limites d’un parsing manuel pour des applications complexes.

Une fois les données extraites, le programme utilise LocalDateTime et DateTimeFormatter pour traiter les horodatages au format UTC (yyyy-MM-dd'T'HH:mm) et les convertir en un format lisible (dd/MM/yyyy HH:mm). Une boucle parcourt les tableaux horaires, filtrant les prévisions antérieures à l’heure actuelle (LocalDateTime.now()) pour n’afficher que les 12 prochaines heures. Pour chaque heure valide, le programme affiche la date, la température (en °C) et les précipitations (en mm) avec un formatage précis via System.out.printf. Cette gestion temporelle permet de présenter des prévisions pertinentes, montrant l’importance des outils de la bibliothèque java.time pour les applications météorologiques.

{{<inlineJava path="WeatherForecast.java" lang="java">}}

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WeatherForecast {
    public static void main(String[] args) {
        // Coordonnées de Montréal
        double latitude = 45.5017;
        double longitude = -73.5673;
        String url = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude +
                     "&longitude=" + longitude + "&hourly=temperature_2m,precipitation";

        try {
            // Créer un client HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            // Envoyer la requête et obtenir la réponse
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            // Extraire les tableaux horaires
            String hourly = json.substring(json.indexOf("\"hourly\":{"));
            String times = extractArray(hourly, "\"time\":");
            String temperatures = extractArray(hourly, "\"temperature_2m\":");
            String precipitations = extractArray(hourly, "\"precipitation\":");

            // Formatter pour les dates
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");

            // Afficher les prévisions pour les 12 prochaines heures
            System.out.println("Prévisions météo pour Montréal (prochaines 12 heures) :");
            LocalDateTime now = LocalDateTime.now();
            String[] timeArray = times.split(",");
            String[] tempArray = temperatures.split(",");
            String[] precipArray = precipitations.split(",");
            int count = 0;

            for (int i = 0; i < timeArray.length && count < 12; i++) {
                String time = timeArray[i].replace("[\"","").replace("\"]","").replace("\"","");
                LocalDateTime forecastTime = LocalDateTime.parse(time, formatter);
                if (forecastTime.isAfter(now)) {
                    double temp = Double.parseDouble(tempArray[i].replace("[","").replace("]",""));
                    double precip = Double.parseDouble(precipArray[i].replace("[","").replace("]",""));
                    System.out.printf("%s : %.1f°C, Précipitations : %.1f mm%n",
                            forecastTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")),
                            temp, precip);
                    count++;
                }
            }
        } catch (Exception e) {
            System.err.println("Erreur lors de la récupération des données : " + e.getMessage());
        }
    }

    // Méthode pour extraire un tableau JSON spécifique
    private static String extractArray(String json, String key) {
        int start = json.indexOf(key) + key.length();
        int end = json.indexOf("]", start) + 1;
        return json.substring(start, end);
    }
}
{{</inlineJava>}}

Les méthodes **GET** et **POST** sont deux des principales méthodes du protocole HTTP, utilisées pour interagir avec des serveurs web. Elles définissent l’intention de la requête envoyée par un client (comme une application ou un navigateur) à un serveur. 
La méthode GET est utilisée pour récupérer des données d’un serveur sans modifier l’état de la ressource ciblée. Dans une requête GET, les paramètres sont généralement inclus dans l’URL, sous forme de chaîne de requête (par exemple, `?latitude=45.5017&longitude=-73.5673`), et aucun corps de requête n’est envoyé. GET est idempotente, c’est-à-dire que plusieurs requêtes identiques produisent le même résultat, et elle est souvent utilisée pour des opérations de lecture, comme récupérer des profils d’utilisateurs ou des prévisions météo. Dans le programme `WeatherForecast`, une requête GET est envoyée à l’API Open-Meteo pour obtenir des données JSON sur la température et les précipitations, illustrant comment GET est adapté pour des requêtes de données publiques ou statiques.
Dans l’API `HttpClient` de Java, une requête GET est construite avec 
```HttpRequest.newBuilder().GET().uri(URI.create(url)).build().``` 
Les en-têtes, comme `Accept: application/json`, peuvent être ajoutés pour spécifier le format de la réponse. Le serveur répond avec un code de statut (par exemple, 200 pour succès) et un corps contenant les données demandées, accessible via `HttpResponse.body()`. GET est idéal pour des scénarios où la sécurité des données n’est pas critique, car les paramètres dans l’URL sont visibles. Cependant, pour des données sensibles ou volumineuses, d’autres méthodes comme POST sont préférables, car GET est limité par la longueur maximale des URLs.
La méthode POST sert à envoyer des données au serveur pour créer ou modifier une ressource, comme soumettre un formulaire ou ajouter une entrée dans une base de données. Contrairement à GET, POST inclut un corps de requête contenant les données, souvent au format JSON ou formulaire, et les paramètres ne sont pas visibles dans l’URL, offrant une meilleure sécurité et une capacité à transmettre des données plus volumineuses. POST n’est pas idempotente : plusieurs requêtes identiques peuvent créer plusieurs ressources ou modifier l’état du serveur différemment. Dans le programme `HttpClientExample`, une requête POST envoie un JSON (`{"title": "Test", "body": "Test request"}`) à une API de test pour simuler la création d’une publication.
Avec l’API `HttpClient`, une requête POST est définie en utilisant 
```HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(jsonPayload)).uri(URI.create(url)).build(),``` 
avec un en-tête comme `Content-Type: application/json` pour indiquer le format du corps. Le serveur traite les données envoyées et répond avec un code de statut (par exemple, 201 pour une création réussie) et parfois un corps décrivant la ressource créée. POST est essentiel pour les interactions dynamiques, comme l’envoi de données utilisateur ou la mise à jour de ressources, mais il nécessite une attention particulière à la sécurité, notamment avec HTTPS, pour protéger les données transmises.
Considérons un autre exemple pour bien illustrer ces concepts.

{{<inlineJava path="HttpClientExample.java" lang="java">}}

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class HttpClientExample {
    public static void main(String[] args) {
        // Création du client HTTP
        HttpClient client = HttpClient.newBuilder()
                .build();

        try {
            // Exemple de requête GET
            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.github.com/users/octocat"))
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            HttpResponse<String> getResponse = client.send(getRequest, 
                    HttpResponse.BodyHandlers.ofString());
            
            System.out.println("GET Response Status: " + getResponse.statusCode());
            System.out.println("GET Response Body: " + getResponse.body());

            // Exemple de requête POST
            String jsonPayload = "{\"title\": \"Test\", \"body\": \"Test request\"}";
            HttpRequest postRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(jsonPayload, StandardCharsets.UTF_8))
                    .build();

            HttpResponse<String> postResponse = client.send(postRequest, 
                    HttpResponse.BodyHandlers.ofString());
            
            System.out.println("\nPOST Response Status: " + postResponse.statusCode());
            System.out.println("POST Response Body: " + postResponse.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
{{</inlineJava>}}

Le programme démontre deux cas d’usage : récupérer des données d’une API publique (GET) et simuler la création d’une ressource (POST). 
Le programme commence par créer un `HttpClient`, l’objet central pour gérer les connexions HTTP. La ligne 
```HttpClient client = HttpClient.newBuilder().build();``` 
initialise un client avec des paramètres par défaut, capable de gérer plusieurs requêtes tout en optimisant les connexions réseau (par exemple, via HTTP/1.1 ou HTTP/2). Dans le contexte HTTP, le client joue le rôle de l’initiateur des requêtes, envoyant des messages formatés au serveur. Le programme encapsule ensuite le code dans un bloc `try-catch` pour gérer les exceptions, comme les erreurs réseau ou les réponses invalides, qui sont courantes dans les communications HTTP en raison de la nature distribuée du web.

La première requête est une requête GET vers l’API GitHub (`https://api.github.com/users/octocat`). La construction de la requête utilise `HttpRequest.newBuilder()`, où l’URI est définie, un en-tête `Accept: application/json` est ajouté pour demander une réponse JSON, et la méthode `GET()` est spécifiée. En HTTP, GET est utilisé pour récupérer des données sans modifier la ressource, et l’en-tête `Accept` négocie le format de la réponse. La requête est envoyée avec `client.send()`, qui retourne un `HttpResponse` contenant le code de statut (par exemple, 200 pour succès) et le corps (un JSON décrivant l’utilisateur). Le programme affiche ces informations, illustrant comment HTTP structure les réponses pour fournir à la fois des métadonnées (code de statut, en-têtes) et des données utiles.

La deuxième requête est une requête POST vers une API de test (`https://jsonplaceholder.typicode.com/posts`). Une chaîne JSON (`{"title": "Test", "body": "Test request"}`) est préparée comme corps de la requête, et l’en-tête `Content-Type: application/json` indique au serveur que les données envoyées sont du JSON. La méthode `POST()` attache ce corps, encodé en UTF-8, à la requête. En HTTP, POST est utilisé pour créer ou modifier des ressources, et le corps transporte les données à traiter par le serveur. La requête est envoyée de manière similaire à la requête GET, et la réponse (code de statut et corps JSON) est affichée. Cette API de test simule la création d’une ressource, renvoyant un JSON avec un ID généré, ce qui reflète une pratique courante dans les API REST.


## Performance

{{% hint info %}}

Dans ce cours, vous n'avez pas à maîtriser la performance.
{{% /hint %}}


La performance est un enjeu crucial lorsqu’on manipule des fichiers ou des flux de données, surtout avec de grands volumes ou des opérations répétées. Un code inefficace peut entraîner des ralentissements importants, une consommation excessive de mémoire ou des blocages inutiles.

Lire ou écrire un fichier caractère par caractère est très lent. Il vaut mieux utiliser des tampons (buffers) pour traiter plusieurs caractères ou octets à la fois. C'est un peu comme essayer d'envoyer un message texte par quelqu'un caractère par caractère.

Les requêtes HTTP ou les accès à des fichiers distants sont beaucoup plus lents que les accès en mémoire. Il faut donc limiter leur nombre et traiter les données efficacement.



Dans cet exemple, `BufferedReader` lit le fichier par blocs (c'est-à-dire plusieurs caractères à la fois), ce qui réduit considérablement le nombre d'accès disque et accélère la lecture, surtout pour les gros fichiers. Plutôt que de lire un caractère à la fois (ce qui serait très lent), le tampon (buffer) permet de charger une portion du fichier en mémoire, puis de traiter cette portion ligne par ligne ou caractère par caractère en mémoire vive, ce qui est bien plus efficace.

De la même façon, pour l'écriture, la classe `BufferedWriter` permet d'écrire dans un fichier par blocs, en accumulant les caractères dans un tampon avant de les écrire d'un coup sur le disque. Cela réduit le nombre d'opérations d'écriture physiques, ce qui améliore la performance.

Voici un exemple complet de lecture et d'écriture performantes avec `BufferedReader` et `BufferedWriter` :

```java {style=github}
import java.io.*;

public class ExempleBuffer {
    public static void main(String[] args) {
        // Lecture performante
        try (BufferedReader reader = new BufferedReader(new FileReader("entree.txt"))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            System.err.println("Erreur de lecture : " + e.getMessage());
        }

        // Écriture performante
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sortie.txt"))) {
            writer.write("Ceci est une ligne écrite rapidement grâce au buffer.\n");
            writer.write("Une autre ligne.\n");
        } catch (IOException e) {
            System.err.println("Erreur d'écriture : " + e.getMessage());
        }
    }
}
```

Utiliser `BufferedReader` et `BufferedWriter` est essentiel pour la performance lors de la lecture et l'écriture de fichiers texte en Java. Cela permet de traiter efficacement de grands volumes de données tout en minimisant les accès disque, ce qui accélère significativement les opérations d'entrée/sortie.

### Données binaires et performance

Pour les fichiers binaires (images, sons, vidéos, données structurées, etc.), le principe de la lecture/écriture en bloc reste tout aussi important. En Java, on utilise alors `BufferedInputStream` et `BufferedOutputStream` pour optimiser les opérations sur les flux binaires. Ces classes fonctionnent de façon similaire à leurs équivalents pour le texte, mais traitent des octets au lieu de caractères.

L'utilisation de buffers permet de lire ou d'écrire plusieurs kilo-octets d'un coup, ce qui réduit le nombre d'accès disque et améliore la rapidité, surtout pour les gros fichiers binaires.

Voici un exemple de copie performante d'un fichier binaire :

```java {style=github}
import java.io.*;

public class CopieBinaire {
    public static void main(String[] args) {
        try (
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("source.bin"));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("destination.bin"));
        ) {
            byte[] buffer = new byte[8192]; // 8 Ko
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la copie : " + e.getMessage());
        }
    }
}
```

Pour les fichiers binaires, il est essentiel d'utiliser des buffers pour garantir des performances optimales. Cela permet de manipuler efficacement de grandes quantités de données, tout en minimisant la sollicitation du disque dur.



#### FileChannel et Buffer


{{% hint info %}}
Dans ce cours, vous n'avez pas à maîtriser les FileChannel et les Buffer.
{{% /hint %}}

Les classes Buffer en Java, situées dans le package java.nio, sont des conteneurs pour manipuler des données brutes en mémoire, utilisées principalement pour des opérations d’entrée/sortie performantes. Un Buffer encapsule un tableau de données avec des métadonnées comme la position (index de la prochaine donnée à lire/écrire), la limite (fin des données valides) et la capacité (taille totale). Ces classes permettent des opérations comme put() pour écrire, get() pour lire, flip() pour basculer entre modes lecture/écriture, et clear() ou rewind() pour réinitialiser. Elles sont particulièrement utiles pour les applications nécessitant un traitement efficace de données binaires ou textuelles, comme les communications réseau ou la lecture/écriture de fichiers volumineux, offrant un contrôle granulaire par rapport aux flux traditionnels.

{{<inlineJava path="ByteBufferExample.java" lang="java">}}
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class ByteBufferExample {
    public static void main(String[] args) {
        // Création d’un ByteBuffer avec une capacité de 20 octets
        ByteBuffer buffer = ByteBuffer.allocate(20);
        
        // Écriture d’une chaîne dans le buffer
        String message = "Bonjour NIO";
        buffer.put(message.getBytes(StandardCharsets.UTF_8));
        System.out.println("Après écriture : position = " + buffer.position() + ", limite = " + buffer.limit());
        
        // Basculement en mode lecture
        buffer.flip();
        System.out.println("Après flip : position = " + buffer.position() + ", limite = " + buffer.limit());
        
        // Lecture et affichage des données
        System.out.print("Contenu lu : ");
        while (buffer.hasRemaining()) {
            System.out.print((char) buffer.get());
        }
        System.out.println();
        
        // Réinitialisation pour réutilisation
        buffer.clear();
        System.out.println("Après clear : position = " + buffer.position() + ", limite = " + buffer.limit());
    }
}
{{</inlineJava>}}

FileChannel est une classe du package java.nio.channels en Java, conçue pour des opérations d’entrée/sortie performantes sur des fichiers ou d’autres sources. Elle permet de lire, écrire, ou *mapper* des fichiers en mémoire à l’aide de buffers, tels que ByteBuffer, offrant un contrôle précis sur les positions et les tailles des données manipulées. Ouvert via des méthodes comme FileChannel.open ou à partir de flux comme FileInputStream.getChannel(), il est particulièrement adapté aux applications nécessitant une gestion efficace de fichiers volumineux ou des communications réseau.

Nous allons un programme Java qui utilise l’API java.nio pour créer un fichier, y écrire des données, puis effectuer un mappage en mémoire (*memory mapping*) avec FileChannel et MappedByteBuffer. Le mappage en mémoire permet d’accéder au contenu du fichier comme s’il s’agissait d’un tableau de bytes en mémoire, offrant des performances élevées pour les opérations de lecture et d’écriture, surtout pour les fichiers volumineux.
Le mappage est efficace pour les fichiers volumineux, car il évite de charger tout le contenu en mémoire à la fois.

{{<inlineJava path="MemoryMappedFileExample.java" lang="java">}}
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.MappedByteBuffer;
import java.io.IOException;

public class MemoryMappedFileExample {
    public static void main(String[] args) {
        Path chemin = Path.of("mapped_data.bin");
        int nombreEntiers = 10; // Nombre d’entiers à écrire
        int tailleFichier = nombreEntiers * 4; // 4 octets par int

        // Étape 1 : Création et écriture dans le fichier
        try (FileChannel canal = FileChannel.open(chemin, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)) {
            ByteBuffer buffer = ByteBuffer.allocate(tailleFichier);
            for (int i = 1; i <= nombreEntiers; i++) {
                buffer.putInt(i * 10); // Écriture des entiers 10, 20, ..., 100
            }
            buffer.flip();
            canal.write(buffer);
            System.out.println("Fichier créé avec succès : " + chemin.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Erreur lors de la création du fichier : " + e.getMessage());
            return;
        }

        // Étape 2 : Mappage en mémoire et manipulation
        try (FileChannel canal = FileChannel.open(chemin, StandardOpenOption.READ, StandardOpenOption.WRITE)) {
            // Mappage du fichier en mémoire
            MappedByteBuffer mappedBuffer = canal.map(FileChannel.MapMode.READ_WRITE, 0, tailleFichier);
            System.out.println("\nLecture des valeurs mappées :");
            
            // Lecture des 10 entiers
            for (int i = 0; i < nombreEntiers; i++) {
                int valeur = mappedBuffer.getInt();
                System.out.println("Position " + i + " : " + valeur);
            }
            
            // Modification de deux valeurs
            mappedBuffer.position(2 * 4); // Position pour le 3e entier (offset 8)
            mappedBuffer.putInt(999); // Remplace la valeur à la position 2
            mappedBuffer.position(5 * 4); // Position pour le 6e entier (offset 20)
            mappedBuffer.putInt(888); // Remplace la valeur à la position 5
            
            System.out.println("\nAprès modification des positions 2 et 5 :");
            mappedBuffer.position(0); // Retour au début pour relire
            for (int i = 0; i < nombreEntiers; i++) {
                int valeur = mappedBuffer.getInt();
                System.out.println("Position " + i + " : " + valeur);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors du mappage ou de la manipulation : " + e.getMessage());
        }
    }
}
{{</inlineJava>}}



MappedByteBuffer est conçu pour mapper un fichier directement en mémoire. Ses principales méthodes incluent get() et put() pour lire et écrire des données (octets, entiers, etc.) à la position actuelle du buffer, avec des variantes comme getInt() ou putInt() pour des types spécifiques. La méthode position(int) définit l’index courant pour les opérations, tandis que limit() et capacity() contrôlent la portée des données accessibles. La méthode flip() bascule le buffer du mode écriture au mode lecture, ajustant la limite à la position actuelle et réinitialisant la position à 0. force() synchronise les modifications avec le fichier sur disque, garantissant la persistance des changements. Enfin, load() charge le contenu mappé en mémoire physique pour optimiser les performances, et isLoaded() vérifie si le mappage est résident. 


### Création d'un chiffrier Excel (Microsoft)


À titre d'exemple, voici un  petit programme Java qui permet de créer un vrai fichier Excel (.xlsx) avec les
données de votre choix. En réalité, un fichier .xlsx n’est rien d’autre qu’une archive ZIP qui contient plusieurs fichiers au format texte avec des balises XML. Le programme va donc créer cette archive et écrire lui-même les fichiers XML nécessaires pour qu’Excel comprenne qu’il s’agit d’un classeur avec une feuille contenant des nombres.

Le programme part d'un tableau à deux dimensions (`double[][]`), et illustre  la gestion des fichiers avec FileOutputStream, l’utilisation de ZipOutputStream pour créer une archive ZIP, et même la construction de chaînes de caractères avec StringBuilder. 

ZipOutputStream est une classe spéciale de Java qui fonctionne comme un `OutputStream` classique, mais qui sait créer des fichiers ZIP (exactement comme quand vous faites « clic droit → compresser » sur votre ordinateur).  Au lieu d’écrire directement dans un fichier, on l’enveloppe autour d’un `FileOutputStream` : on obtient ainsi un flux qui comprend la structure d’une archive ZIP.  

Avec `ZipOutputStream`, on peut ajouter autant de fichiers que l’on veut dans un archive ZIP en appelant simplement `putNextEntry(new ZipEntry("nom/du/fichier.xml"))`, écrire le contenu avec les méthodes habituelles `write()`, puis fermer l’entrée avec `closeEntry()`.   C’est exactement ce que fait notre programme : il ajoute un par un tous les petits fichiers obligatoires à l’intérieur du .xlsx, et Java s’occupe automatiquement de compresser et d’organiser tout cela correctement.   Pour vous, c’est comme écrire plusieurs fichiers, mais ils finissent tous dans un seul fichier .xlsx que Excel sait ouvrir.

À la fin de l’exécution, vous obtenez un fichier `resultat.xlsx` valide, avec les nombres bien alignés dans les bonnes cellules (A1, B1, A2…). Nous vous invitons à faire l'exercice d'exécuter le fichier `MatriceVersExcel`. Pouvez-vous modifier les valeurs enregistrées&nbsp;?


```java {style=github}
import java.io.*;
import java.util.zip.*;

public class MatriceVersExcel {

    public static void main(String[] args) throws Exception {

        // Exemple de matrice — remplace par la tienne
        double[][] matrice = {
            {1.1, 2.2, 3.3},
            {4.4, 5.5, 6.6},
            {7.7, 8.8, 9.9},
            {10.0, 11.1, 12.2}
        };

        creerExcelDepuisMatrice(matrice, "resultat.xlsx");
        System.out.println("Fichier Excel créé avec succès : resultat.xlsx");
    }

    /** Crée un vrai fichier .xlsx à partir d’une matrice de double */
    public static void creerExcelDepuisMatrice(double[][] donnees, String nomFichier) throws IOException {
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(nomFichier))) {
            // Un fichier XLSX est un conteneur ZIP, qui doit contenir ces fichiers/dossiers minimums
            
            // Les deux premiers fichiers doivent être à la racine
            ajouterFichier(zip, "[Content_Types].xml", typesContenuXml());
            ajouterFichier(zip, "_rels/.rels", relationsRacine());
            
            // L'arborescence du classeur commence par 'xl/'
            ajouterDossier(zip, "xl/"); // Ajout de l'entrée de dossier pour la structure
            ajouterFichier(zip, "xl/workbook.xml", classeurXml());
            ajouterDossier(zip, "xl/_rels/"); // Ajout de l'entrée de dossier
            ajouterFichier(zip, "xl/_rels/workbook.xml.rels", relationsClasseur());
            ajouterDossier(zip, "xl/worksheets/"); // Ajout de l'entrée de dossier
            ajouterFichier(zip, "xl/worksheets/sheet1.xml", feuilleXml(donnees));
        }
    }

    private static void ajouterDossier(ZipOutputStream zip, String nom) throws IOException {
        zip.putNextEntry(new ZipEntry(nom));
        zip.closeEntry();
    }

    private static void ajouterFichier(ZipOutputStream zip, String nom, String contenu) throws IOException {
        // Le contenu de l'OpenXML doit être UTF-8
        zip.putNextEntry(new ZipEntry(nom));
        zip.write(contenu.getBytes("UTF-8"));
        zip.closeEntry();
    }

    private static String typesContenuXml() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
               "<Types xmlns=\"http://schemas.openxmlformats.org/package/2006/content-types\">\n" +
               "  <Default Extension=\"rels\" ContentType=\"application/vnd.openxmlformats-package.relationships+xml\"/>\n" +
               "  <Default Extension=\"xml\" ContentType=\"application/xml\"/>\n" +
               "  <Override PartName=\"/xl/workbook.xml\" ContentType=\"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml\"/>\n" +
               "  <Override PartName=\"/xl/worksheets/sheet1.xml\" ContentType=\"application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml\"/>\n" +
               "</Types>";
    }

    private static String relationsRacine() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
               "<Relationships xmlns=\"http://schemas.openxmlformats.org/package/2006/relationships\">\n" +
               "  <Relationship Id=\"rId1\" Type=\"http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument\" Target=\"xl/workbook.xml\"/>\n" +
               "</Relationships>";
    }

    // CORRIGÉ: Ajout de l'attribut 'xmlns:r' qui est nécessaire dans le 'workbook.xml' pour utiliser 'r:id'.
    private static String classeurXml() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + // Ajout de standalone="yes"
               "<workbook xmlns=\"http://schemas.openxmlformats.org/spreadsheetml/2006/main\" " +
               "xmlns:r=\"http://schemas.openxmlformats.org/officeDocument/2006/relationships\">\n" + // AJOUTÉ: l'attribut xmlns:r
               "  <sheets>\n" +
               "    <sheet name=\"Données\" sheetId=\"1\" r:id=\"rId1\"/>\n" +
               "  </sheets>\n" +
               "</workbook>";
    }

    private static String relationsClasseur() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
               "<Relationships xmlns=\"http://schemas.openxmlformats.org/package/2006/relationships\">\n" +
               "  <Relationship Id=\"rId1\" Type=\"http://schemas.openxmlformats.org/officeDocument/2006/relationships/worksheet\" Target=\"worksheets/sheet1.xml\"/>\n" +
               "</Relationships>";
    }

    private static String feuilleXml(double[][] donnees) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"); // Ajout de standalone="yes"
        sb.append("<worksheet xmlns=\"http://schemas.openxmlformats.org/spreadsheetml/2006/main\">\n");
        sb.append("  <sheetData>\n");

        for (int ligne = 0; ligne < donnees.length; ligne++) {
            sb.append("    <row r=\"").append(ligne + 1).append("\">\n");
            for (int col = 0; col < donnees[ligne].length; col++) {
                String cellule = colonneExcel(col + 1) + (ligne + 1);
                // Utilisation de Double.toString() ou String.valueOf() pour éviter la locale par défaut
                String valeurStr = Double.toString(donnees[ligne][col]); 
                sb.append("      <c r=\"").append(cellule).append("\"><v>")
                  .append(valeurStr).append("</v></c>\n");
            }
            sb.append("    </row>\n");
        }

        sb.append("  </sheetData>\n");
        sb.append("</worksheet>");
        return sb.toString();
    }

    private static String colonneExcel(int numero) {
        StringBuilder col = new StringBuilder();
        while (numero > 0) {
            int reste = (numero - 1) % 26;
            col.insert(0, (char) ('A' + reste));
            numero = (numero - 1) / 26;
        }
        return col.toString();
    }
}
```

Vous pourriez aussi générer des documents Microsoft Word ou en consulter le contenu.

### Conseils génériques

Il faut privilégier les lectures/écritures en bloc (bufferisées). Il faut limiter les accès réseau (en réduire le nombre). 

En contrepartie, il vaut mieux éviter de charger de très gros fichiers en une seule fois si ce n’est pas nécessaire (privilégier le traitement ligne par ligne ou par bloc). Votre ordinateur
est plus rapide s'il ne traite que de petites quantités de données à la fois (ex. 10 Ko plutôt que 10 Mo).


### Lecture optionnelle dans le livre de référence (Delannoy)

<p>Pour aller plus en profondeur sur les flux de fichier (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 20:</p>
<ul>
	<li>Section 1 : Fichier binaire</li>
	<li>Section 2 : Liste séquentielle d'un fichier binaire</li>
        <li>Section 3 : Accès direct à un fichier binaire</li>
        <li>Section 6 : La gestion des fichiers avec la classe File</li>
</ul>

## Vidéo



{{< youtube id="7hZVRDxpbCE" >}}
