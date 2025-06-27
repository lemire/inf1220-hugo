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

<p>Nous venons juste de créer une instance de l'objet FileReader permettant de lire le contenu d'un fichier. Cependant, la classe FileReader ne possède que des méthodes pouvant lire « en bas niveau », c'est-à-dire que la méthode read permet de lire caractère par caractère le contenu d'un fichier. Cette méthode peut lever une exception si, par exemple, nous ne pouvons accéder au disque dur ou si le fichier en question est protégé. Voici comment lire un caractère d'un fichier :</p>

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

## Path et Files

La lecture de fichiers en Java est une tâche courante qui a évolué avec les versions modernes du langage, notamment à partir de Java 7 avec l’introduction de l’API java.nio.file. Cette API, plus robuste et flexible que l’ancienne java.io, simplifie la gestion des fichiers et des répertoires. À partir de Java 21, les développeurs bénéficient d’une syntaxe encore plus concise grâce aux flux (Stream) et aux améliorations des performances, tout en conservant une gestion efficace des erreurs.

Un concept clé ici est l’utilisation de Path et Files. Un objet Path, créé via Path.of, représente un chemin dans le système de fichiers de manière portable, compatible avec différents systèmes d’exploitation. La classe Files, quant à elle, propose des méthodes statiques pour manipuler les fichiers, comme Files.lines, qui lit un fichier sous forme de flux de lignes. Ce flux permet de traiter les données de manière fonctionnelle, en utilisant des lambdas pour des opérations comme le filtrage ou la transformation.

{{<inlineJava path="Main.java" lang="java">}}
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

void main() {
  try {
    Path chemin = Path.of("Main.java");
    Files.lines(chemin)
          .forEach(ligne -> System.out.println("Lue : " + ligne));
  } catch (IOException e) {
    System.out.println("Erreur de lecture : " + e.getMessage());
  }
}

{{</inlineJava>}}

## Accès à l'Internet

*Dans ce cours, vous n'aurez pas à gérer des requêtes HTTP. Il est néanmoins nécessaire d'être familier avec le principle.
Prenez la peine de lire et d'exécuter les exemples suivants.*

Java permet aussi d'avoir accès à des ressources sur le web. Grâce à ses bibliothèques modernes, comme l'API HttpClient introduite dans Java 11, il est possible d'effectuer des requêtes HTTP de manière simple et efficace, facilitant la récupération de données depuis des serveurs distants.


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


Le programme Java suivant récupère et affiche les prévisions météo horaires pour Montréal en interrogeant l’API Open-Meteo. Il commence par définir les coordonnées géographiques de Montréal (latitude 45.5017, longitude -73.5673) et construit une URL pour demander les données de température et de précipitations horaires. À l’aide des classes HttpClient et HttpRequest du module java.net.http, il envoie une requête GET à l’API et récupère la réponse sous forme de chaîne JSON. Plutôt que d’utiliser une bibliothèque externe, le programme parse manuellement cette réponse en extrayant les tableaux de données (heures, températures et précipitations) à l’aide de manipulations de chaînes. Une méthode auxiliaire, extractArray, facilite cette extraction en isolant les tableaux JSON correspondant à chaque variable météo.

Une fois les données extraites, le programme utilise LocalDateTime et DateTimeFormatter pour traiter les horodatages au format UTC et les convertir en un format lisible (jour/mois/année heure:minute). Il parcourt ensuite les tableaux pour afficher les prévisions des 12 prochaines heures à partir de l’heure actuelle, en filtrant les données antérieures. Pour chaque heure valide, il affiche la date, la température (en °C) et les précipitations (en mm) avec un formatage précis. Une gestion d’exceptions basique capture les erreurs potentielles, comme des problèmes de connexion ou une réponse mal formée. Ce code est simple, évite les dépendances externes et illustre une approche directe pour interagir avec une API REST et traiter des données JSON.

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


## Performance

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
