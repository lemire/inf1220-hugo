---
title: "Module 2: Introduction au langage Java"
weight: 2
bookCollapseSection: true
---

# Module 2


> "The most disastrous thing that you can ever learn is your first programming language" - Alan Kay  

Avec le module 2, vous débuterez l’apprentissage du langage Java. Vous découvrirez ses concepts fondamentaux, tels que les variables, les boucles et les conditions. Des exercices pratiques vous permettront de coder vos premiers programmes simples. Ce module pose les bases essentielles pour les modules avancées à venir.

Java a été créé en 1991 par le canadien James Gosling et son équipe chez Sun Microsystems, initialement sous le nom de Oak pour des appareils embarqués. Renommé Java en 1995, il a été rendu public avec le slogan *Write Once, Run Anywhere*, grâce à sa machine virtuelle qui assure la portabilité du code. Acquis par Oracle en 2010, le langage continue d’évoluer avec des mises à jour régulières.
Son importance réside dans sa robustesse, sa sécurité et sa versatilité&nbsp;: il alimente des milliards d’appareils Android, des applications d’entreprise massives et des serveurs web. Java reste un pilier de l’industrie logicielle.


À travers des exemples concrets et des exercices pratiques, ce module montre comment les composants de la programmation s’assemblent pour créer des programmes cohérents et fonctionnels, jetant ainsi les bases d’un apprentissage solide.

Le module 2 aborde également la distinction entre les variables de classe et les variables locales, une notion essentielle pour organiser le code de manière claire et efficace. Les variables de classe, accessibles à l’échelle d’un programme ou d’un objet, facilitent la gestion des données globales, tandis que les variables locales, restreintes à un contexte spécifique, favorisent la clarté et la modularité du code. Grâce à des activités pratiques, notamment en Java, ce module permet de comprendre la portée et le cycle de vie des variables. En s’appuyant sur les exemples du manuel Java pas à pas et du site web du cours, il offre une opportunité de consolider les compétences en programmation tout en développant la capacité à concevoir des solutions logiques et bien structurées.

Le cours comprend aussi plusieurs exemples de code Java exécutable en ligne, comme cet exemple&nbsp;:


{{< javaRunner path="HelloWorld.java" lang="java" >}}

Ce programme Java, appelé HelloWorld, est un petit exemple qui affiche le message "Bonjour, INF 1220&nbsp;!" à l'écran. Imaginez une classe comme une boîte qui contient des instructions, et ici, notre boîte s'appelle HelloWorld. À l'intérieur, il y a une action spéciale nommée main, qui est comme la porte d'entrée du programme : c'est par là que tout commence quand vous lancez le code. La ligne public static void main(String[] args) crée cette porte d'entrée, et String[] args est juste un moyen de donner des informations supplémentaires au programme (on ne s'en sert pas ici). Ensuite, l'instruction System.out.println("Bonjour, INF 1220&nbsp;!"); est comme une commande qui dit à l'ordinateur d'écrire "Bonjour, INF 1220&nbsp;!" dans la console, un peu comme si vous écriviez sur une feuille. En gros, ce code est une première étape pour apprendre à donner des ordres simples à l'ordinateur avec Java&nbsp;!

Vous devriez pouvoir exécuter le code et prendre connnaissance du résultat. Vous pouvez aussi 
modifier le code, etc. À la fin du cours, vous serez capable de réaliser des tâches complexes avec la programmation Java.

## Au sujet du Java

Java est un langage de programmation orienté objet, conçu pour être à la fois simple à utiliser et puissant. Il est largement utilisé dans le développement d'applications d'entreprise, d'applications mobiles (surtout Android), et dans de nombreux autres domaines. Java est apprécié pour sa portabilité, sa robustesse et sa capacité à gérer des applications de grande envergure.

Java présente plusieurs avantages par rapport à d’autres langages de programmation :

- *Portabilité :* Grâce à la machine virtuelle Java (JVM), un programme Java peut être exécuté sur n’importe quelle plateforme disposant d’une JVM, sans modification du code source (« Write Once, Run Anywhere »).
- *Gestion automatique de la mémoire :* Le ramasse-miettes (garbage collector) libère automatiquement la mémoire inutilisée, ce qui réduit les risques de fuites de mémoire et simplifie la gestion des ressources.
- *Vaste écosystème :* Java dispose d’un grand nombre de bibliothèques, de frameworks et d’outils, facilitant le développement d’applications variées (web, mobile, entreprise, etc.).
- *Documentation et communauté :* La documentation est abondante et la communauté très active, ce qui facilite l’apprentissage et la résolution de problèmes.

Cependant, Java présente aussi certains inconvénients :

- *Performances parfois inférieures au code natif :* Les programmes Java peuvent être plus lents que ceux écrits en C ou C++, car ils s’exécutent sur la JVM et non directement sur le matériel. Java permet tout de même d'offrir une performance très supérieurs au JavaScript ou à Python.
- *Syntaxe parfois verbeuse :* Le code Java peut être plus long et moins concis que dans d’autres langages modernes comme Python ou Kotlin.
- *Nécessité d’installer la JVM :* Pour exécuter un programme Java, il faut installer la machine virtuelle Java, ce qui peut compliquer le déploiement sur certains systèmes.

En résumé, Java est un langage polyvalent, robuste et largement utilisé, mais il n’est pas toujours le plus adapté pour les applications nécessitant des performances maximales ou une grande concision syntaxique.

## Conseils génériques

Pour devenir un bon programmeur...

- Il faut comprendre les bases : maîtriser les concepts fondamentaux comme les variables, les boucles et les fonctions avant de passer à des sujets complexes.
- Il faut pratiquer régulièrement : il faut coder tous les jours pendant des mois afin de renforcer ses compétences et de gagner en aisance.
- Il faut lire du code : il faut explorer des exemples pour comprendre comment les autres structurent leurs programmes.
- Il faut écrire un code lisible : Il faut utiliser des noms de variables clairs et il faut commenter son code pour qu’il soit facile à comprendre.
- Il faut accepter les erreurs : les échecs sont des opportunités d’apprentissage, car ils font partie intégrante du processus.

## Objectifs du module

Ce module a pour objectif de vous donner une compréhension solide des bases de la programmation en Java, en insistant sur :

- La distinction entre les différents types de données (primitifs et objets), leur rôle et leur manipulation.
- La déclaration, l’utilisation et la portée des variables (locales, de classe, d’instance).
- L’utilisation des opérateurs et des classes enveloppes pour manipuler les données.
- La structuration du code à l’aide de méthodes (fonctions), leur définition, leur appel et leur utilité pour la réutilisation et la clarté du programme.
- Les fondements de la programmation orientée objet : classes, instances, constructeurs, et premières notions d’organisation du code.
- La lecture, l’écriture et la compréhension de programmes Java simples, en s’appuyant sur des exemples concrets et des exercices pratiques.
- Le développement de l’autonomie dans la résolution de problèmes, la lecture de code et la correction d’erreurs courantes.

À l’issue de ce module, vous serez capable de :
- Écrire et comprendre des programmes Java simples utilisant variables, types, opérateurs, méthodes et classes.
- Structurer votre code de façon claire et modulaire.
- Appliquer les bonnes pratiques de base pour progresser efficacement en programmation.



## Planification du temps

Nous vous suggérons de consacrer trois semaines au second module (environ 27 heures).  Vous aurez à lire deux chapitres dans le manuel,
nous vous suggérons d'en lire un par semaine pendant les deux premières semaines, en plus des lectures du site web.
Assurez-vous de remettre le second travail noté à la fin de la sixième semaine.

