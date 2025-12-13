---
title: "Développement web"
weight: 4
---

# Développement web en Java

Le développement web en Java repose sur l’utilisation de technologies et de frameworks
 ermettant de créer des applications accessibles via un navigateur. Java est largement 
 utilisé côté serveur grâce à sa robustesse, sa portabilité et la richesse de son écosystème.


{{% hint info %}}

Dans ce cours, vous n'avez pas à maîtriser la programmation web. Nous vous présentons un exemple pour motiver votre apprentissage.

{{% /hint %}}


## Concepts de base

Un serveur web est un programme qui reçoit les requêtes des clients (navigateurs) et renvoie des réponses (pages HTML, données JSON, etc.). Le protocole de communication qui permet l’échange de données entre le navigateur (client) et le serveur web est le HTTP. Toutes les requêtes et réponses web transitent via HTTP ou HTTPS (version sécurisée).

Dans le protocole HTTP, les méthodes (ou « verbes ») définissent l’action à effectuer sur une ressource du serveur. Les principales méthodes sont :

- *GET* : Récupère une ressource ou des données depuis le serveur. Par exemple, accéder à une page web ou demander des informations via une API.
- *POST* : Envoie des données au serveur pour créer une nouvelle ressource ou déclencher un traitement (par exemple, soumettre un formulaire).
- *PUT* : Met à jour une ressource existante sur le serveur avec de nouvelles données.
- *DELETE* : Supprime une ressource du serveur.
- *PATCH* : Modifie partiellement une ressource existante.

Chaque méthode a un usage précis et permet de structurer les échanges entre le client (navigateur ou application) et le serveur de façon claire et standardisée. Par exemple, une API REST utilisera GET pour lire des données, POST pour en créer, PUT ou PATCH pour les modifier, et DELETE pour les supprimer.
La plupart des requêtes HTTP sont de type GET ou POST.


### HTML

Le HTML (HyperText Markup Language) est le langage de balisage standard utilisé pour structurer le contenu des pages web. Il permet de définir la hiérarchie des éléments (titres, paragraphes, listes, tableaux, images, liens, etc.) et d’organiser l’information de façon logique et accessible. Chaque élément HTML est représenté par des balises, généralement une balise ouvrante et une balise fermante, qui encadrent le contenu à afficher.

Le HTML est interprété par le navigateur, qui transforme la structure décrite en une page visuelle. Il est possible d’ajouter des attributs aux balises pour préciser leur apparence ou leur comportement (par exemple, l’attribut href pour les liens ou src pour les images). Le HTML est la base de toute page web, et il peut être enrichi par des feuilles de style CSS et des scripts JavaScript.

*Exemple de base :*

```html {style=github}
<!DOCTYPE html>
<html>
  <head>
    <title>Ma première page</title>
  </head>
  <body>
    <h1>Bienvenue sur mon site</h1>
    <p>Ceci est un paragraphe en HTML.</p>
    <a href="https://www.example.com">Un lien</a>
  </body>
</html>
```


### JavaScript

JavaScript est un langage de programmation exécuté principalement côté client, c’est-à-dire dans le navigateur web. Il permet de rendre les pages web interactives et dynamiques : gestion des événements (clics, saisies clavier), modification du contenu de la page sans rechargement, animations, validation de formulaires, etc. JavaScript est devenu un standard incontournable du développement web moderne.

Grâce à JavaScript, il est possible de manipuler le Document Object Model (DOM), c’est-à-dire la structure de la page HTML, pour ajouter, modifier ou supprimer des éléments à la volée. JavaScript peut aussi communiquer avec le serveur via des requêtes asynchrones (AJAX), ce qui permet de mettre à jour une partie de la page sans la recharger entièrement.

*Exemple simple :*

```html {style=github}
<button onclick="alert('Bonjour !')">Cliquez-moi</button>
```

*Exemple de modification du contenu :*

```html {style=github}
<p id="demo">Texte initial</p>
<script>
  document.getElementById('demo').innerText = 'Texte modifié par JavaScript';
</script>
```

### XML

XML (Extensible Markup Language) est un autre format d’échange de données, plus structuré et verbeux que JSON. Il utilise des balises personnalisables pour décrire les données, ce qui le rend très flexible et adapté à des applications nécessitant une structure complexe, comme les documents ou les configurations. XML est largement dans les fichiers de configuration, en bureautique (Microsoft Word stocke ses données en XML) ou les formats de documents. Contrairement à JSON, XML supporte les attributs dans les balises et permet l’inclusion de métadonnées, mais sa syntaxe plus lourde peut compliquer son traitement.

Exemple de structure XML :

```xml {style=github}
<personne>
    <nom>Alice</nom>
    <age>30</age>
    <estEtudiant>false</estEtudiant>
    <competences>
        <competence>Java</competence>
        <competence>HTML</competence>
        <competence>JavaScript</competence>
    </competences>
</personne>
```

### CSS

Le CSS (Cascading Style Sheets) est un langage de style qui permet de contrôler l’apparence visuelle des pages web. Il sépare la présentation (couleurs, polices, marges, disposition, etc.) du contenu HTML, ce qui facilite la maintenance et la personnalisation des sites.
Un fichier CSS est composé de règles de style, chacune ciblant un ou plusieurs éléments HTML à l’aide de sélecteurs. La structure de base d’une règle CSS est :

```css {style=github}
sélecteur {
    propriété1: valeur1;
    propriété2: valeur2;
    /* ... */
}
```

- Le *sélecteur* indique quels éléments HTML seront affectés par la règle (par exemple, `body`, `h1`, `.container`).
- Les *propriétés* définissent les aspects visuels à modifier (couleur, police, marges, etc.), et chaque propriété est suivie de sa *valeur*.

Pour cibler une *classe* (attribut `class` dans le HTML), on utilise un point devant le nom de la classe dans le sélecteur. Par exemple, `.container` cible tous les éléments ayant `class="container"`.

*Exemple :*

```html {style=github}
<div class="message">Ceci est un message</div>
```

```css {style=github}
.message {
    color: #d35400;
    font-weight: bold;
}
```

Ici, la règle `.message` s’applique à tous les éléments HTML ayant la classe `message`. On peut appliquer plusieurs classes à un même élément en les séparant par des espaces dans l’attribut `class`.

Les fichiers CSS peuvent être inclus dans une page HTML via la balise `<style>` dans le `<head>`, ou bien dans un fichier externe référencé par `<link rel="stylesheet" href="style.css">`. L’utilisation de classes permet de réutiliser facilement des styles sur plusieurs éléments et de structurer le design de façon modulaire et maintenable.

###  API REST

Une API REST (Representational State Transfer) est une interface qui permet à différentes applications de communiquer entre elles via le protocole HTTP, en utilisant des méthodes standard comme GET, POST, PUT et DELETE. Les API REST sont largement utilisées pour exposer des services web, car elles sont simples, flexibles et compatibles avec de nombreux langages et plateformes. Les données échangées entre le client et le serveur sont généralement au format JSON, ce qui facilite leur traitement côté navigateur ou application mobile.

Le principe de REST repose sur l’utilisation d’URL pour identifier les ressources (par exemple, /utilisateurs/123 pour accéder à l’utilisateur numéro 123) et sur l’utilisation des méthodes HTTP pour effectuer des opérations sur ces ressources (lecture, création, modification, suppression). Une API REST bien conçue est stateless (sans état côté serveur entre deux requêtes) et respecte des conventions claires pour la structure des URL et des réponses.

*Exemple d’appel à une API REST en JavaScript :*

```javascript {style=github}
fetch('https://api.exemple.com/utilisateurs/123')
  .then(response => response.json())
  .then(data => console.log(data));
```

Dans cet exemple, le client envoie une requête GET à l’URL de l’API, reçoit une réponse au format JSON, puis affiche les données reçues. Les API REST sont au cœur du développement web moderne, notamment pour les applications à architecture « front-end/back-end » séparée.

## Serveur web simpliste

Il arrive que l'on souhaite lancer rapidement un petit serveur web. Créez un fichier `ExempleServeurFichiersSimple.java``
avec le contenu suivant, compilez et exécutez-le dans un dossier. Si le port 8000 n'est pas utilisé sur votre ordinateur
vous aurez un serveur web fonctionnant sur votre machine. (Dans le cas contraire, remplacez le port 8000 par 8001 ou 8002.)


```java {style=github}
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.SimpleFileServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.file.Path;

public class ExempleServeurFichiersSimple {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        Path repertoireCourant = Path.of(".").toAbsolutePath();  // Répertoire courant

        HttpServer serveur = HttpServer.create(new InetSocketAddress(port), 0);
        serveur.createContext("/", SimpleFileServer.createFileHandler(repertoireCourant));
        serveur.start();

        System.out.println("Serveur démarré sur le port " + port + ", servant les fichiers depuis " 
            + repertoireCourant.toAbsolutePath());
        System.out.println("Accédez-y via http://localhost:" + port + "/");
    }
}
```

Ce code Java définit une classe simple nommée ExempleServeurFichiersSimple qui permet de lancer un serveur HTTP minimal capable de servir des fichiers statiques depuis le répertoire courant de l'application. Il utilise la bibliothèque intégrée com.sun.net.httpserver, qui fait partie du JDK et fournit une implémentation légère d'un serveur HTTP sans besoin de dépendances externes comme un serveur d'applications complet. La méthode main est le point d'entrée du programme, et elle configure tout le nécessaire pour démarrer le serveur rapidement.

Dans un premier temps, le code définit un port d'écoute sur 8000 et récupère le chemin absolu du répertoire courant à l'aide de Path.of(".").toAbsolutePath(). Cela signifie que le serveur servira tous les fichiers et sous-répertoires présents dans le dossier où le programme est exécuté. Ensuite, il crée une instance de HttpServer en la liant à l'adresse locale sur le port choisi, avec une file d'attente de connexions par défaut. Un contexte racine "/" est alors défini, associé à un handler spécialisé fourni par SimpleFileServer.createFileHandler, qui gère automatiquement la diffusion de fichiers statiques (HTML, images, CSS, etc.) depuis le répertoire spécifié.

Enfin, le serveur est lancé avec serveur.start(), ce qui le met en écoute permanente pour les requêtes entrantes. Des messages sont affichés dans la console pour confirmer le démarrage, indiquer le port utilisé, le répertoire servi et l'URL d'accès locale (http://localhost:8000/). Ce type de serveur est particulièrement utile pour des tests rapides, du développement local ou pour partager des fichiers temporairement sans configuration complexe, bien qu'il ne soit pas destiné à un usage en production en raison de ses limitations en termes de sécurité et de performances.

## Développement d'un serveur web simple

Pour développer un serveur web simple, nous pouvons utiliser Javalin.
Javalin est un framework web léger pour Java et Kotlin, conçu pour faciliter la création d’applications web. Il se distingue par sa simplicité d’utilisation, sa configuration minimale et sa rapidité de prise en main. Avec Javalin, il est possible de démarrer un serveur web en quelques lignes de code, de définir des routes HTTP (GET, POST, etc.), de gérer les requêtes et les réponses, et d’intégrer facilement des fonctionnalités comme le rendu de templates ou la gestion de fichiers statiques.

Pour faire des pages web, nous pouvons combiner Javaline avec un générateur de HTML. Nous utilisons
généralement une approche par *templates* (modèles).
Thymeleaf est un moteur de template moderne pour Java. Il permet de générer dynamiquement des pages HTML côté serveur, en injectant des variables et des structures de contrôle (conditions, boucles, etc.). Les templates Thymeleaf sont des fichiers HTML standards, enrichis de balises spécifiques (`th:text`, `th:if`, etc.), ce qui facilite leur édition et leur prévisualisation.

Concevons un petit jeu web où l'utilisateur devra deviner un nombre. Commençons par présenter 
le template thymeleaf:


```html {style=github}
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Jeu du cours INF 1220 : Devinez le nombre</title>
</head>
<body>
    <h1>Jeu du cours INF 1220</h1>
    <div class="subtitle">Devinez le nombre choisi par le serveur (entre 1 et 100).</div>
    <form method="post" action="/guess">
        <input type="number" name="guess" min="1" max="100" 
                 required placeholder="Votre nombre">
        <button type="submit">Deviner</button>
    </form>
    <div class="message" th:text="${message}"></div>
</body>
</html>
```

Ce code HTML est un exemple de template Thymeleaf utilisé pour générer dynamiquement une page web côté serveur. Les balises classiques du HTML sont enrichies d’attributs spécifiques à Thymeleaf, comme `th:text="${message}"`, qui permet d’afficher dynamiquement un message provenant du serveur (par exemple, pour indiquer si la proposition de l’utilisateur est trop haute, trop basse ou correcte). Grâce à cette approche, le même template peut être réutilisé pour différents états du jeu, en fonction des variables transmises par le serveur Java.

L’utilisation de Thymeleaf facilite la séparation entre la logique applicative (traitée en Java) et la présentation (gérée dans le template HTML). Les développeurs peuvent ainsi concevoir des pages web interactives et personnalisées, tout en gardant un code HTML lisible et modifiable par des non-programmeurs (par exemple, des designers ou des rédacteurs).


Dans le template Thymeleaf présenté, on retrouve plusieurs éléments HTML fondamentaux :

- `<html xmlns:th="http://www.thymeleaf.org" lang="fr">` : Balise racine qui indique le début du document HTML. L’attribut `xmlns:th` déclare l’espace de noms Thymeleaf pour activer ses fonctionnalités, et `lang="fr"` précise la langue du document.
- `<head>` : Contient les métadonnées de la page (non affichées directement à l’écran).
    - `<meta charset="UTF-8">` : Définit l’encodage des caractères en UTF-8, indispensable pour afficher correctement les caractères spéciaux et accentués.
    - `<title>` : Spécifie le titre de la page, affiché dans l’onglet du navigateur.
- `<body>` : Partie principale du document, qui contient tout le contenu visible par l’utilisateur.
    - `<h1>` : Titre principal de la page, utilisé ici pour afficher le nom du jeu.
    - `<div class="subtitle">` : Bloc de texte qui sert de sous-titre ou d’instruction à l’utilisateur.
    - `<form method="post" action="/guess">` : Formulaire HTML permettant à l’utilisateur de soumettre sa proposition. L’attribut `method="post"` indique que les données seront envoyées en POST, et `action="/guess"` précise l’URL de traitement côté serveur.
        - `<input type="number" name="guess" min="1" max="100" required placeholder="Votre nombre">` : Champ de saisie pour entrer un nombre entre 1 et 100. Les attributs `min`, `max` et `required` imposent des contraintes de validation côté navigateur.
        - `<button type="submit">` : Bouton pour envoyer le formulaire.
    - `<div class="message" th:text="${message}"></div>` : Bloc destiné à afficher dynamiquement un message (succès, erreur, indice) transmis par le serveur via Thymeleaf. L’attribut `th:text` est propre à Thymeleaf et permet d’injecter du texte calculé côté serveur.

Tournons nous maintenant vers notre code Java utilisant Javalin.

```java {style=github}
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinThymeleaf;
import io.javalin.http.Context;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class GuessNumberApp {
    public static void main(String[] args) {
        int port = 7070;
        Javalin app = Javalin.create(config -> {
            config.fileRenderer(new JavalinThymeleaf());
        }).start(port);

        app.get("/", GuessNumberApp::showGame);
        app.post("/guess", GuessNumberApp::handleGuess);
    }

    private static void showGame(Context ctx) {
        if (ctx.sessionAttribute("number") == null) {
            ctx.sessionAttribute("number", new Random().nextInt(100) + 1);
        }
        Map<String, Object> model = new HashMap<>();
        model.put("message", "");
        ctx.render("templates/game.html", model);
    }

    private static void handleGuess(Context ctx) {
        int number = ctx.sessionAttribute("number");
        int guess = Integer.parseInt(ctx.formParam("guess"));
        Map<String, Object> model = new HashMap<>();
        if (guess < number) {
            model.put("message", "Trop petit ! Essayez encore.");
        } else if (guess > number) {
            model.put("message", "Trop grand ! Essayez encore.");
        } else {
            model.put("message", "Bravo ! Vous avez trouvé le nombre. Un nouveau nombre a été choisi.");
            ctx.sessionAttribute("number", new Random().nextInt(100) + 1);
        }
        ctx.render("templates/game.html", model);
    }
}
```

Ce code Java met en œuvre un petit serveur web avec Javalin pour créer un jeu interactif « Devinez le nombre ». La classe principale `GuessNumberApp` configure le serveur sur le port 7070, active le moteur de templates Thymeleaf pour le rendu HTML, et définit deux routes : une pour afficher le jeu (`/`) et une pour traiter les propositions de l’utilisateur (`/guess`). L’utilisation de Javalin permet de démarrer le serveur et de gérer les requêtes HTTP en quelques lignes, rendant le développement web très accessible.

La méthode `showGame` initialise la session de l’utilisateur en choisissant un nombre aléatoire entre 1 et 100 s’il n’existe pas déjà, puis prépare un modèle (un dictionnaire de variables) transmis au template Thymeleaf pour afficher la page du jeu. La méthode `handleGuess` récupère la proposition envoyée par l’utilisateur via le formulaire, la compare au nombre à deviner, et met à jour le message affiché selon le résultat (trop petit, trop grand, ou trouvé). Si le nombre est trouvé, un nouveau nombre est choisi pour permettre de rejouer sans recharger la page.

Javalin utilise la notion de route. Une « route » dans le contexte d’un serveur web désigne l’association entre une URL (ou un motif d’URL) et une fonction qui sera exécutée lorsque cette URL est demandée par un client (navigateur ou application). Chaque route correspond à une action précise du serveur, comme afficher une page, traiter un formulaire ou fournir des données via une API. Par exemple, dans le code du jeu, la route `app.get("/", GuessNumberApp::showGame);` indique que lorsqu’un utilisateur accède à la racine du site (`/`) avec une requête GET, la méthode `showGame` sera appelée pour générer la page. De même, la route `app.post("/guess", GuessNumberApp::handleGuess);` traite les soumissions du formulaire de jeu envoyées en POST à l’URL `/guess`. Les routes permettent ainsi de structurer clairement le comportement du serveur en fonction des différentes actions attendues par les utilisateurs.

Notre fonction `handleGuess` reçoit un objet de type Context. Cet objet représente la requête HTTP en cours et fournit tous les outils nécessaires pour accéder aux données envoyées par l’utilisateur (comme les paramètres de formulaire), manipuler la session, et construire la réponse à renvoyer au client. Grâce à `Context`, on peut facilement lire les valeurs soumises, stocker des informations persistantes pour l’utilisateur (par exemple, le nombre à deviner), et rendre un template HTML avec des variables dynamiques. Cela simplifie grandement la gestion des interactions entre le serveur et le navigateur dans une application web Java.

Pour construire et lancer l'application, nous pouvons utiliser Maven. Maven est un outil de gestion de projet et d’automatisation de la compilation pour les projets Java. Il permet de décrire la structure du projet, les dépendances (bibliothèques externes comme Javalin ou Thymeleaf), les étapes de compilation, de test et de déploiement dans un fichier de configuration appelé `pom.xml`.
Grâce à Maven, il suffit d’une commande (`mvn package` ou `mvn exec:java`) pour télécharger automatiquement toutes les dépendances nécessaires, compiler le code source, exécuter les tests et lancer l’application. Cela simplifie grandement le développement, la maintenance et le partage de projets Java, en garantissant que tous les développeurs utilisent les mêmes versions de bibliothèques et une structure cohérente. 
Le fichier `pom.xml` (Project Object Model) est au cœur de Maven. Il contient des sections clés comme les coordonnées du projet (groupId, artifactId, version), les dépendances avec leurs versions spécifiques, et les plugins qui personnalisent le cycle de vie du build. Par exemple, pour une application web utilisant Javalin, on ajoute la dépendance `<dependency><groupId>io.javalin</groupId><artifactId>javalin</artifactId><version>5.6.3</version></dependency>` dans le `pom.xml`. Maven télécharge alors cette bibliothèque depuis un dépôt central comme Maven Central. Les plugins, comme le plugin `maven-compiler-plugin`, permettent de configurer des options comme la version de Java à utiliser. Cette centralisation des configurations facilite la reproductibilité et réduit les erreurs liées à des environnements de développement différents.
Maven offre également une gestion avancée des cycles de vie du projet, divisés en phases comme `compile`, `test`, `package` et `install`. Chaque phase exécute des tâches prédéfinies, mais vous pouvez les personnaliser via des plugins. Par exemple, avec le plugin `exec-maven-plugin`, vous pouvez exécuter directement votre application avec `mvn exec:java`. De plus, Maven supporte l’intégration avec des outils d’intégration continue comme Jenkins, permettant d’automatiser les déploiements. En structurant votre projet selon les conventions de Maven (dossiers `src/main/java` pour le code source et `src/test/java` pour les tests), vous gagnez en clarté et en compatibilité avec d’autres outils de l’écosystème Java, rendant votre application plus robuste et facile à maintenir. Une solution de recherche populaire à Maven est Gradle, un autre outil de build pour les projets Java. Gradle utilise un fichier de configuration nommé build.gradle, écrit en Groovy ou Kotlin, qui offre une syntaxe plus concise et flexible que le XML de Maven. Par exemple, pour ajouter Javalin, on écrit implementation 'io.javalin:javalin:5.6.3' dans build.gradle. Gradle est particulièrement apprécié pour sa performance, grâce à un mécanisme de cache et une exécution incrémentale des tâches. Il suit un modèle de tâches personnalisables, où des commandes comme gradle build ou gradle run gèrent la compilation, les tests et l’exécution. Gradle est également bien intégré avec les IDE comme IntelliJ IDEA et supporte les mêmes conventions de structure de projet que Maven, tout en offrant plus de souplesse pour les projets complexes ou multi-modules.

Je vous invite maintenant à [consulter l'application web complète](https://github.com/lemire/webdemo-inf1220) en ligne. [Vous pouvez la charger sur votre machine](https://github.com/lemire/webdemo-inf1220/archive/refs/heads/main.zip) et la déployer en suivant
les instructions.

Vous devriez pouvoir utiliser l'application web sur votre PC. Comment la rendre disponible sur le
web&nbsp;? Je recommande d'utiliser une approche par *container Docker*. Malheureusement, ce
sujet excède le cadre du présent cours.

## Questions de révision

1. Qu’est-ce qu’une route dans le contexte d’un serveur web avec Javalin ? Donnez un exemple de route et expliquez son rôle.
2. À quoi sert le moteur de templates Thymeleaf dans cette application ? Comment permet-il de séparer la logique et la présentation ?
3. Expliquez le rôle de l’objet Context dans la gestion d’une requête HTTP avec Javalin. Quelles sont ses principales utilisations dans le jeu « Devinez le nombre » ?
4. Pourquoi utilise-t-on Maven pour construire et lancer l’application Java ? Quels sont les avantages de cet outil pour la gestion des dépendances et du cycle de vie du projet ?
5. Modifiez le code du jeu pour limiter le nombre d’essais de l’utilisateur à 10. Que faudrait-il changer dans la gestion de la session et du modèle ?


