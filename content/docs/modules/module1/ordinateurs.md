---
title: "Les ordinateurs et leurs langages"
weight: 4
---

# Court historique des langages de programmation

L’idée de programmer des machines remonte au 19e siècle, époque marquée par l’émergence des premières machines de calcul et d’automatisation. Dès 1801, les métiers à tisser Jacquard utilisaient des cartes perforées pour programmer des motifs textiles, préfigurant les concepts de codage. Cependant, c’est au milieu du 19e siècle qu’un jalon historique est posé avec les travaux d’Ada Lovelace (1815-1852) sur la machine analytique de Charles Babbage. Considérée comme la première programmeuse, elle rédigea des notes détaillées incluant un algorithme pour calculer les nombres de Bernoulli, démontrant qu’une machine pouvait exécuter des instructions complexes. Le langage Ada, créé dans les années 1980, rend hommage à cette contribution pionnière.

L’avènement des ordinateurs modernes dans les années 1940-1950 marque un tournant décisif. Les premiers langages de programmation apparaissent pour répondre aux besoins de calcul scientifique, commercial et logique. Parmi eux, FORTRAN (1954) facilite les calculs scientifiques, LISP (1958) introduit des concepts d’intelligence artificielle et de traitement symbolique, et COBOL (1959) s’impose dans la gestion des données commerciales. Ces langages, bien que rudimentaires comparés aux standards actuels, posent les bases des paradigmes de programmation modernes.

Au fil des décennies, les langages évoluent pour offrir plus d’abstraction, de flexibilité et d’accessibilité. Dans les années 1980 et 1990, des langages comme C++ (1983), Python (1991), Java (1995), JavaScript (1995) et PHP (1995) voient le jour, chacun répondant à des besoins spécifiques : performance pour C++, simplicité pour Python, portabilité pour Java, interactivité web pour JavaScript, ou développement web dynamique pour PHP. Aujourd’hui, ces langages dominent l’industrie, comme le montre le classement 2017 de l’IEEE Spectrum, qui reflète leur popularité et leur polyvalence.

Tous ces langages partagent un objectif commun : permettre aux programmeurs de décrire des solutions à des problèmes en s’éloignant progressivement des contraintes du matériel. Pour comprendre leur rôle, il est essentiel de se pencher sur le fonctionnement des ordinateurs.


## Java

L’idée de programmer des machines remonte au 19e siècle, époque marquée par l’émergence des premières machines de calcul et d’automatisation. Dès 1801, les métiers à tisser Jacquard utilisaient des cartes perforées pour programmer des motifs textiles, préfigurant les concepts de codage. Cependant, c’est au milieu du 19e siècle qu’un jalon historique est posé avec les travaux d’Ada Lovelace (1815-1852) sur la machine analytique de Charles Babbage. Considérée comme la première programmeuse, elle rédigea des notes détaillées incluant un algorithme pour calculer les nombres de Bernoulli, démontrant qu’une machine pouvait exécuter des instructions complexes. Le langage Ada, créé dans les années 1980, rend hommage à cette contribution pionnière.

L’avènement des ordinateurs modernes dans les années 1940-1950 marque un tournant décisif. Les premiers langages de programmation apparaissent pour répondre aux besoins de calcul scientifique, commercial et logique. Parmi eux, FORTRAN (1954) facilite les calculs scientifiques, LISP (1958) introduit des concepts d’intelligence artificielle et de traitement symbolique, et COBOL (1959) s’impose dans la gestion des données commerciales. Ces langages, bien que rudimentaires comparés aux standards actuels, posent les bases des paradigmes de programmation modernes.

Au fil des décennies, les langages évoluent pour offrir plus d’abstraction, de flexibilité et d’accessibilité. Dans les années 1980 et 1990, des langages comme C++ (1983), Python (1991), Java (1995), JavaScript (1995) et PHP (1995) voient le jour, chacun répondant à des besoins spécifiques : performance pour C++, simplicité pour Python, portabilité pour Java, interactivité web pour JavaScript, ou développement web dynamique pour PHP. Aujourd’hui, ces langages dominent l’industrie, comme le montre le classement 2017 de l’IEEE Spectrum, qui reflète leur popularité et leur polyvalence.



| Version | Changement principal        | Année de sortie |
|---------|----------------------------|------------------|
| JDK 1.0 | Lancement initial          | 1996             |
| JDK 1.1 | Classes internes            | 1997             |
| J2SE 1.2 | API Swing                  | 1998             |
| J2SE 1.3 | Améliorations HotSpot      | 2000             |
| J2SE 1.4 | Assertions                 | 2002             |
| J2SE 5.0 | Génériques                 | 2004             |
| Java SE 6 | Performance JVM            | 2006             |
| Java SE 7 | Syntaxe try-with-resources | 2011             |
| Java SE 8 | Expressions lambda         | 2014             |
| Java SE 9 | Système de modules         | 2017             |
| Java SE 10 | Inférence de types         | 2018             |
| Java SE 11 | Client HTTP standard       | 2018             |
| Java SE 12 | Switch expressions         | 2019             |
| Java SE 13 | Blocs de texte             | 2019             |
| Java SE 14 | Records (aperçu)           | 2020             |
| Java SE 15 | Classes scellées           | 2020             |
| Java SE 16 | Records finalisés          | 2021             |
| Java SE 17 | Pattern matching           | 2021             |
| Java SE 18 | API vectorielle (aperçu)   | 2022             |
| Java SE 19 | Threads virtuels           | 2022             |
| Java SE 20 | Structured Concurrency     | 2023             |
| Java SE 21 | Sequenced Collections      | 2023             |
| Java SE 22 | Foreign Function API       | 2024             |
| Java SE 23 | Module import simplifié    | 2024             |
| Java SE 24 | Améliorations Loom         | 2025             |
| Java SE 25 | Finalisation Valhalla      | 2025             |
| Java SE 26 | Optimisations Leyden       | 2026             |


## Résumé de l’architecture des ordinateurs et de l’abstraction des langages


Tous ces langages partagent un objectif commun : permettre aux programmeurs de décrire des solutions à des problèmes en s’éloignant progressivement des contraintes du matériel. Pour comprendre leur rôle, il est essentiel de se pencher sur le fonctionnement des ordinateurs.

Les ordinateurs modernes s’appuient sur deux concepts fondamentaux : la machine de Turing, théorisée par Alan Turing, qui définit une machine capable d’exécuter n’importe quel algorithme, et l’architecture de von Neumann, qui structure les ordinateurs autour de quatre composantes principales. Premièrement, la mémoire stocke à la fois les données et les programmes, une innovation clé par rapport aux machines antérieures où les instructions étaient fixes. Deuxièmement, l’unité de contrôle orchestre l’exécution des instructions en suivant un séquençage précis. Troisièmement, l’unité arithmétique et logique effectue les calculs de base, comme les additions ou les comparaisons. Enfin, les interfaces d’entrée/sortie permettent d’interagir avec l’utilisateur ou d’autres systèmes, via des périphériques comme les claviers, écrans ou réseaux.

Dans un langage plus accessible, un ordinateur contemporain se compose de processeurs (CPU), de mémoire vive (RAM) pour les calculs temporaires, de stockage à long terme (disques durs ou SSD), de processeurs graphiques (GPU) pour le rendu visuel, et de cartes d’entrée/sortie pour la connectivité. La carte mère agit comme un chef d’orchestre, coordonnant les échanges entre ces éléments. Par exemple, lorsqu’un programme s’exécute, le CPU lit les instructions depuis la RAM, effectue les calculs nécessaires, et envoie les résultats vers la mémoire ou un périphérique de sortie, comme un écran.

Les processeurs se déclinent en plusieurs architectures. Dans les ordinateurs personnels, les puces x64 (ou x86-64), produites par Intel et AMD, dominent grâce à leur puissance et leur compatibilité. Dans les appareils mobiles, comme les smartphones, les processeurs ARM, plus économes en énergie, sont privilégiés. La mémoire vive repose sur la technologie DRAM, rapide mais volatile, tandis que le stockage à long terme utilise majoritairement la mémoire flash, comme dans les SSD, pour sa rapidité et sa fiabilité.

Les langages de programmation jouent un rôle crucial en traduisant des instructions humaines en commandes compréhensibles par ces composants matériels. Leur niveau d’abstraction varie : les langages de bas niveau, comme l’assembleur, sont proches du matériel et offrent un contrôle précis mais exigent une expertise technique. À l’opposé, les langages de haut niveau, comme Python ou Java, simplifient le développement en masquant les détails matériels, ce qui les rend plus accessibles et adaptés à des applications complexes, comme le développement web ou l’intelligence artificielle.

Dans ce cours, nous explorerons le langage Java, largement adopté dans l’industrie pour sa portabilité, sa robustesse et sa polyvalence. Utilisé dans des domaines variés, des applications mobiles Android aux systèmes d’entreprise, Java illustre parfaitement comment un langage de haut niveau peut répondre à des besoins modernes tout en s’appuyant sur les principes fondamentaux de l’informatique.


## Java pas à pas


<p>Nous vous invitons maintenant à lire le chapitre 1 du manuel  Java Pas à Pas.  Vous devez <a href="https://raw.githubusercontent.com/RobertGodin/JavaPasAPas/master/JavaPasAPas.pdf">charger le document PDF</a>. </p>


<p><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/">Vous pouvez aussi acheter la version papier du manuel Java pas à pas chez Amazon</a>:</p>
<div><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/"><img src="https://m.media-amazon.com/images/I/61tnblFlmmL._SL1499_.jpg" width="250px" style="margin-left:auto; margin-right:auto;"></a></div>
