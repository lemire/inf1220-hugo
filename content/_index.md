---
title: "Accueil"
---

# Mot de bienvenue


{{< youtube id="sCuxwhZWX0s" >}}

C’est avec plaisir que je vous accueille dans ce cours d’introduction à la programmation. J’ai conçu ce cours pour ceux qui souhaitent entamer des études universitaires en informatique. Au terme de ce cours, vous serez familier
avec tous les concepts essentiels en programmation. Vous aurez aussi acquis une compétence en programmation Java. Si
vous avez déjà une certaine expertise en programmation, ce cours vous permettra d'en approfondir les fondements.


Il existe plusieurs langages de programmation. Au sein du cours INF 1220, nous utilisons le langage Java. Le Java est un des langages les plus utilisés dans l'industrie et un des plus recherchés par les employeurs. Sur le populaire réseau GitHub, le langage Java est un des cinq langages de programmation les plus utilisés. L'index TIOBE classe aussi le Java comme étant l'un des cinq langages de programmation les plus populaires. Plusieurs grandes entreprises utilisent Java au sein de leur infrastructure. Un des grands utilisateurs de Java est Google. Le Java (et les langages associés, par exemple Kotlin) est le langage de prédilection pour le développement d'applications mobiles sur la plateforme Android. Le Java est une composante essentielle du réseau social X. L'entreprise Uber traite de nombreuses données en temps réel, en gardant la trace des chauffeurs et des demandes de transport entrantes avec Java. Le site LinkedIn utilise Java pour l'analyse et la recherche des données. En fait, LinkedIn est principalement écrit en Java, avec quelques éléments créés en C++. Le système de paiement PayPal utilise Java pour son site web et ses applications. Comme PayPal, Netflix utilise Java pour un grand éventail de fonctions. Amazon utilise Java pour ses services, ses systèmes distribués et une grande partie de son infrastructure e-commerce. Plusieurs logiciels populaires tels que IntelliJ IDEA, CLion, RapidMiner, etc. sont écrits en Java. Plusieurs jeux sont aussi écrits en Java, comme la version originale de MineCraft. Il suffit de consulter un site de recherche d'emploi pour voir à quel point le Java est en demande au sein d'une vaste gamme d'entreprises. Des grandes entreprises comme Desjardins utilisent Java pour leur infrastructure. Le Java offre un bon compromis entre la performance et la sécurité. C'est aussi un langage qui évolue rapidement, et qui se met continuellement à jour.


![Intro Java](/comics/introjava.jpg)


L'approche pédagogique du cours repose sur la pratique. Dans ce cours, vous écrirez beaucoup de code, que ce soit en
pseudo-code ou en Java. Nous avons inclus un grand nombre d'exercices et d'exemples, à la fois dans le manuel Java pas à
pas et sur le site web du cours.

## Présentation du cours

De nos jours, l'informatique est devenue omniprésente dans notre quotidien. Que ce soit à partir de nos téléphones intelligents, nos montres, nos véhicules ou dans notre maison, des systèmes ordinés nous aident à réaliser des tâches ou à nous divertir. Ces systèmes sont tous à des degrés divers (selon leur complexité) programmés à l'aide de langages de programmation : du système embarqué du micro-onde aux systèmes d'exploitation de nos tablettes. Au cours du 21e siècle, savoir programmer et être apte à lire du code sera un atout important sur le marché du travail, plusieurs utilisent le terme littératie numérique.

Le cours INF1220 : Introduction à la programmation est un cours universitaire de premier cycle permettant aux étudiants d'apprendre les bases de la programmation, c'est-à-dire : comment analyser un problème d'un point de vue informatique, de modéliser une solution sous forme d'algorithmes, puis d'apprendre à mettre en œuvre cet algorithme dans un langage de programmation (dans le cadre du cours le langage Java). Afin de mettre en œuvre une solution dans un langage de programmation, il est alors nécessaire de comprendre et mettre en pratique un ensemble de concepts :

- variables et constantes,
- types de données (du moins dans les langages typés),
- fonctions/méthodes,
- structures de contrôle,
- structures itératives et récursion,
- structures de données de base (tableaux, listes),
- écriture/lecture à des flux (lignes de commandes, fichiers).

De plus, la plupart des langages de programmation modernes sont ou incluent des aspects orientés objet. Comme le langage Java est un langage orienté objet, ce cours d’introduction présente également les concepts de base de la programmation orientée objet (OO), soit :

- classes vs. instances,
- héritage simple et multiple,
- polymorphisme.

Le cours est divisé en 5 modules avec un ensemble d'activités introduisant les éléments de programmation. Des exercices pratiques et des travaux notés viennent évaluer vos connaissances, pour enfin terminer le cours avec un examen final. Chaque module se termine par un travail noté.


Le site du cours vous permet d'exécuter du code Java directement dans votre 
navigateur&nbsp;: 

{{<inlineJava path="Main.java" lang="java" >}}
void main() {
    var nom = "Alice";
    System.out.println("Bonjour, " + nom + " ! 😊");
}
{{</inlineJava>}}

La compilation et l'exécution d'un programme Java peut prendre quelques secondes.

## Microsoft 365


Nous vous demandons d'installer [Microsoft 365, incluant Microsoft Teams](https://www.teluq.ca/site/etudes/office365.php). Si vous
rencontrez des difficultés, communiquez avec [support@teluq.ca](mailto:support@teluq.ca).

## Courriel

Si vous nous écrivez, n'oubliez pas d'ajouter `[INF1220]` dans l'objet de votre message.

## Manuel

Nous utilisons un manuel d'introduction à la programmation Java intitulé *Java pas à pas* par Robert Godin et Daniel Lemire. Vous pouvez [charger le document PDF](https://raw.githubusercontent.com/RobertGodin/JavaPasAPas/master/JavaPasAPas.pdf) dès maintenant.

[Vous pouvez aussi acheter la version papier du manuel Java pas à pas chez Amazon](https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/) pour une somme modeste&nbsp;:

<div><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/"><img src="https://m.media-amazon.com/images/I/61tnblFlmmL._SL1499_.jpg" width="250px" style="margin-left:auto; margin-right:auto;"></a></div>

Amazon expédie normalement le manuel en environ trois jours.

Le manuel *Java pas à pas* commence à la base et vous fournit une introduction par étape. Chacun des cinq modules
du cours comprend des lectures obligatoires dans le manuel.

 Module         | Chapitres/Sections du manuel recommandés                        | Thème principal du manuel pour le module                |
|----------|----------------------------------------------------------------|---------------------------------------------------------|
| 1   | Chapitre 1 : Concepts de base                                  | Introduction, concepts fondamentaux, exercices de base  |
| 2 | Chapitre 2 : Introduction à Java<br>Chapitre 4 : Types/expressions | Types, expressions, bases de la programmation Java      |
| 3      | Chapitre 3 : Structures de contrôle                            | Structures de contrôle (conditions, boucles, etc.)      |
| 4      | Chapitre 9 : Traitement de fichiers                            | Fichiers, entrées/sorties, gestion de données           |
| 5        | Chapitres 5 à 8 : Graphisme 2D, animation, conception objet, jeu | Programmation objet, graphisme, animation, projet jeu   |


En appui à ces activités, le livre de Claude Delannoy, *Programmer en Java* est utilisé comme lecture d'appoint optionnelle. Si vous n'avez pas acheté le manuel lors de votre inscription, vous pouvez le commander en écrivant à l'adresse `didactique@teluq.ca`.



{{% hint warning %}}

## Intelligence artificielle


<p>Dans ce cours, l'utilisation de l'intelligence artificielle (<a href="https://grok.com">Grok</a>, <a href="https://gemini.google.com/app">Gemini</a>, etc.) est permise et même recommandée (mais optionnelle). Cependant, vous devez l'utiliser de manière responsable&nbsp;:</p>
<ul>
<li>Décrivez votre utilisation de l'IA.  Une utilisation de l'IA sans déclaration peut être considérée comme une forme de faute. Contrairement à ce que vous pourriez croire, déclarer votre utilisation de l'IA vous protège.</li>
<li>Expliquez votre démarche. Qu'est-ce que vous avez fait avec l'IA&nbsp;? Nous vous encourageons à inclure des copies des résultats de vos interactions avec l'IA.</li> 
<li>Assurez-vous de bien expliquer vos résultats, en vos propres mots.</li>
</ul>

<p>Vous devez toujours être capable d'expliquer pleinement vos solutions, sans aide.</p>

{{% /hint  %}}

{{% hint danger %}}


## Entretien de suivi

Que ce soit dans les travaux notés ou à l'examen, vous devez produire vos propres réponses. Vous devez pleinement
maîtriser ces réponses. Le cours se termine par un entretien de suivi obligatoire. Au cours de cet entretien, nous allons vérifier que vous êtes capable d'expliquer vos solutions de vive voix, sans aide. Un échec à l'entretien de suivi entraîne un échec au  cours. Il n'y a aucune possibilité  de reprise.

Suite à votre examen, **vous devez** prendre rendez-vous avec la personne qui vous encadre.
**Vous devez** vous identifier. Et **vous devrez** satisfaire la personne qui vous encadre
que vos réponses à l'examen sont les vôtres et que vous maîtrisez la matière.


{{% /hint  %}}

## Démarrage

Commencez le cours dès que vous êtes prêt après avoir lu les consignes. Il n’y a pas de contact de démarrage dans ce cours. Vous devez suivre le cours en ligne, en suivant les instructions du site web. Au fur et à mesure que vous progressez, vous prendrez connaissance des consignes ayant trait aux lectures, aux exercices et aux travaux à remettre.

Dans la documentation que vous avez reçu de l’Université, vous avez le nom de la personne qui vous encadre. Ce nom devrait aussi apparaître au sein du portail étudiant. Prenez bien en note le nom de cette personne et son adresse de courriel: vous pouvez lui écrire vos questions et commentaires.

Le cours INF 1220 est un cours en ligne. Vous devrez travailler sur un ordinateur connecté à Internet.


Terminez la lecture de cette page de présentation du cours.
Prenez ensuite le temps de vous familiariser avec le site du cours. Explorez bien le menu à gauche, puis le menu à droite. Quand vous aurez
bien fait tout le tour, commencez avec le premier module.



{{% hint info %}}
_Vous devez bien planifier votre temps._  En plus des travaux
notés, nous vous inviterons à résoudre une quinzaine de problèmes de programmation et de lire des dizaines de pages par semaine.
Le site du cours compte plus de **400 exemples de code Java** dont plus d'une centaine peuvent être exécutés directement en ligne.
Le site du cours compte aussi plus de **200 problèmes résolus** couvrant toute la matière du cours. Nous offrons aussi
des **dizaines de laboratoires interactifs en ligne**, directement dans le site web. 
Le manuel du cours **fait près de 300 pages**. Le site web du cours compte plus de **cent mille mots**. 
Nous vous suggérerons le visionnement
de plus de **50&nbsp;vidéos** en lien avec la matière du cours. Le cours nécessite 9&nbsp;heures de travail actif par semaine pendant quinze semaines. Si vous n'avez pas complété les mathématiques du collégial, il est possible que vous
deviez ajouter à ce travail des efforts de mise à niveau.
{{% /hint %}}

