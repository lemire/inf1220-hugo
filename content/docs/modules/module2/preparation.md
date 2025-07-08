---
title: "Préparation de l’espace de travail"
weight: 10
---



# Préparation de l'espace de travail

Comme langage de support à l'introduction des concepts de programmation, nous utiliserons le langage Java. Tel que présenté dans l'introduction du cours, le langage Java est un langage interprété multi-plateforme où le code est pré-compilé dans un ensemble d'instructions intermédiaires (appelé Java bytecode), puis interprété sur chaque système d'exploitation à partir de la machine virtuelle Java. Celle-ci transforme alors le bytecode en instructions machine propre au système d'exploitation et aux processeurs spécifiques de l'ordinateur.

Si ce n'est pas déjà fait, il est maintenant temps de configurer un environnement de développement Java. Dans ce cours, vous pouvez utiliser l'environnement de programmation qui vous convient le mieux ou qui fonctionne bien pour vous. Vous n'avez pas à utiliser une approche spécifique.

Dans ce cours, vous devez être à même de choisir l'environnement qui vous convient le mieux. Cette démarche d'appropriation fait partie intégrante du cours. Nous n'offrons pas de soutien technique concernant les outils logiciels que vous choisissez d'installer sur vos ordinateurs. Nous vous invitons à procéder par essai/erreur et à faire les recherches nécessaires.

Quand vous testez un nouvel environnement, utilisez du code Java simple et bien testé. Si vous ne connaissez pas bien le Java, ne commencez pas à expérimenter avec la programmation tout en testant un nouvel environnement. Allez-y une étape à la fois.


## Utilisation d'un environnement de programmation en ligne

Plusieurs étudiants préfèrent un environnement de développement conventionnel, installé sur leur PC. D'autres étudiants peuvent avoir une préférence pour les environnements en ligne qui ne nécessitent aucune installation.

Au sein même du cours, nous mettons à votre disposition un environnement de développement entièrement en ligne, suffisant pour les travaux du cours. Vous pouvez y avoir accès [dès maintenant]({{< ref "/docs/environnement" >}}). Suivez le lien qui se trouve dans le menu du cours. Vous y trouverez des instructions.

### Autres systèmes en ligne

Outre le système inclut dans le cours, il y a plusieurs autres environnements en ligne, nous vous invitons à les explorer, en commençant par les suggestions suivantes :

- [repl.it](https://repl.it)
- [ideone.com](http://ideone.com)

Ces outils en ligne vous permettent de saisir votre code, dans le navigateur, et de l'exécuter par la suite. Vous pouvez faire une grande partie du cours en utilisant seulement un outil comme [repl.it](https://repl.it). En effet, le cours se concentre principalement sur la programmation de base. Les outils d'aide à la programmation sont moins importants. Nous ne ferons pas de grands projets dans ce cours qui nécessitent beaucoup de gestion de code.

La vidéo suivante illustre l'utilisation de [repl.it](https://repl.it) (il n'est pas nécessaire d'écouter la narration en anglais pour comprendre) :

{{< youtube id="kMqNSZPjBOY" >}}

Truc : Avec repl.it, vous pouvez ouvrir une console avec les touches ctrl-shift-s où vous pouvez exécuter des commandes comme «&nbsp;javac Main.java&nbsp;» et «&nbsp;java Main&nbsp;».

Dans le cours, vous trouverez des exemples utilisant [repl.it](https://repl.it), mais l'utilisation de repl.it est optionnelle. Si repl.it ne fonctionne pas bien pour vous, utilisez autre chose.

Une des limites d'un environnement comme repl.it est qu'ils ne permettent pas la production d'interfaces graphiques. Ainsi, certains exemples ne peuvent fonctionner sous repl.it.

Notez bien : Certains des exemples [repl.it](https://repl.it) comprennent plusieurs fichiers. Comme dans plusieurs interfaces, repl.it ne permet de voir le contenu que d'un seul fichier à la fois. Par contre, il vous permet de naviguer entre différents fichiers. Nous verrons dans ce cours que Java exige que les "classes" soient définies au sein de fichiers du même nom, ce qui implique souvent que nous utilisions plusieurs fichiers avec des noms prédéterminés. Cette contrainte en ce qui a trait aux fichiers n'est pas spécifique à repl.it. En Java, il y a un lien direct entre le nom des fichiers et leur contenu. Dans ce cours, vous devez faire preuve de débrouillardise et nous supposons que vous trouverez comment faire pour naviguer et voir les différents fichiers.

### Instructions détaillées pour Repl.it

Repl.it est une plateforme en ligne qui permet d’écrire, d’exécuter et de tester du code Java directement dans votre navigateur, sans avoir besoin d’installer un environnement de développement sur votre ordinateur. Pour commencer, accédez aux liens Repl.it fournis dans le cours. Cliquez sur un lien pour ouvrir le projet Java correspondant. Vous verrez une interface avec un éditeur de code à gauche, où le code est déjà chargé, et une console à droite pour afficher les résultats. Si vous n’êtes pas encore inscrit, créez un compte gratuit sur Repl.it en utilisant votre adresse e-mail ou un compte Google. Une fois connecté, vous pouvez modifier le code directement dans l’éditeur. Pour exécuter votre programme, cliquez sur le bouton vert «&nbsp;Run&nbsp;» en haut de la page. La console affichera les sorties ou les erreurs, ce qui vous permettra de vérifier si votre code fonctionne comme prévu.

Pour travailler efficacement sur Repl.it, familiarisez-vous avec ses fonctionnalités principales. Vous pouvez créer un nouveau fichier ou répertoire dans votre projet en cliquant sur l’icône «&nbsp;+&nbsp;» dans la barre latérale. Si vous modifiez le code fourni dans les liens du cours, assurez-vous de ne pas écraser les instructions ou les parties essentielles sans les comprendre. Avec un peu de pratique, Repl.it deviendra un outil puissant et intuitif pour développer vos compétences en programmation Java.

## Installation du Java Development Kit (JDK)

### Système d'exploitation Microsoft Windows

Je vous suggère d'installer le JDK à partir du site [https://adoptium.net/](https://adoptium.net/). La vidéo suivante illustre comment y arriver sous Windows en moins de deux minutes :

{{< youtube id="Tk6u3Wm___s" >}}

1. Aller sur le site [https://adoptium.net/](https://adoptium.net/). Choisir la dernière version disponible.
2. Une fois le fichier d'installation téléchargé, démarrer l'installation et suivre les différentes étapes d'installation.
3. Une fois le logiciel installé, la machine virtuelle Java (java.exe) et ses outils de compilation (javac.exe) auront été installés.

### macOS

Nous vous suggérons d'utiliser [https://adoptium.net/](https://adoptium.net/) encore une fois.

### Linux Debian

Si vous êtes un utilisateur de Linux et plus particulièrement de Debian (ou Ubuntu), vous savez probablement déjà utiliser les Debian Packages ! Pour installer la JDK, il faut ouvrir l'invite de commande (la console...), se mettre en mode super-utilisateur (su) et exécuter la commande :

```sh
apt-get install default-jdk
```

## Utilisation d'un éditeur de texte

La plupart des langages de programmation s'utilisent avec des fichiers de texte. Le fichier n'est qu'une séquence de caractères sans autre structure particulière. L'outil le plus simple en programmation est donc le simple éditeur de texte. Comme le nom l'indique, l'éditeur de texte vise principalement à éditer des fichiers de texte. Notons que les traitements de texte (comme Word) ne sont pas faits pour éditer des fichiers de texte. Par ailleurs, un éditeur de texte ne peut pas, par lui-même, compiler et exécuter des programmes. Il sert surtout à écrire le code.

Le meilleur éditeur de fichier texte est sans doute [Visual Studio Code](https://code.visualstudio.com) (à ne pas confondre avec Visual Studio). Microsoft rend disponible [un guide d'utilisation de Visual Studio Code avec Java](https://code.visualstudio.com/docs/java/java-tutorial).

{{< youtube id="hN86e5-uYrc" >}}



## Environnement de développement

Un environnement de développement intégré (IDE) est un logiciel qui facilite la création, la gestion et le débogage de programmes en regroupant des outils essentiels comme un éditeur de code, un compilateur, un débogueur et des fonctionnalités de gestion de projet. Son rôle est d'améliorer la productivité des développeurs en offrant une interface unifiée, une autocomplétion, une détection d'erreurs en temps réel et une intégration avec des systèmes de contrôle de version. En Java, les IDE les plus populaires incluent IntelliJ IDEA, reconnu pour ses puissantes fonctionnalités d'analyse de code et son ergonomie, Eclipse, apprécié pour sa flexibilité et ses nombreux plugins, et NetBeans, qui se distingue par sa simplicité et son intégration native avec les outils Java. Ces IDE permettent de gérer efficacement des projets complexes tout en optimisant le flux de travail du développeur.



Il faut cependant être critique. Les IDE ont la fâcheuse habitude d'automatiser plusieurs opérations ce qui ne pose pas de problème aux programmeurs expérimentés, mais qui est souvent déroutant pour les débutants. Les IDE vont souvent créer des répertoires, des «&nbsp;paquetages&nbsp;» et avoir différentes attentes quant à l'endroit où les différentes fonctions et classes doivent être. Le résultat net est que les étudiants sont souvent confrontés à des messages d'erreur qui les laissent perplexes après des modifications faites en utilisant l'interface graphique (par exemple, après le déplacement d'un fichier). Si vous utilisez un IDE, il faut apprendre à travailler selon les attentes de l'IDE. À terme, certains programmeurs trouvent que l'utilisation d'un IDE les rend plus productifs, mais quand on débute, l'IDE est un obstacle supplémentaire pour certains étudiants.


### Installation de l'IDE IntelliJ IDEA


Vous pouvez installer l'IDE IntelliJ IDEA. 

1. Rendez-vous sur [https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/).
2. Cliquez sur Download.
3. Sous "Community", cliquez sur Download. Cette version est gratuite.
4. L'enregistrement du programme d'installation devrait débuter. Suivez ensuite les consignes.

Nous croyons que IntelliJ IDEA est supérieur aux autres IDE, étant plus élégant et convivial. Cependant, le choix vous appartient.

Notez que nous n'offrons pas de soutien technique pour les IDE dans ce cours. Si vous optez pour IntelliJ IDEA, vous devrez vous en remettre au soutien technique et à la documentation de l'entreprise qui fournit le produit. Nous sommes là pour vous appuyer dans l'apprentissage de la programmation et du Java, mais pas dans l'utilisation d'un IDE spécifique.

### Installation de l'IDE Netbeans

Si vous avez installé IntelliJ IDEA, il n'est sans doute pas nécessaire d'installer aussi Netbeans. Cependant, vous pouvez installer les deux, pour comparer.
Cet IDE possède un éditeur visuel bien fait, stable et complet. Pour installer Netbeans vous devez suivre les étapes suivantes :

1. Suivre le lien suivant : [https://netbeans.apache.org/download/index.html](https://netbeans.apache.org/download/index.html)
2. Télécharger la version "binaries" (déjà compilée).
3. Une fois le fichier .zip téléchargé, veuillez le décompresser dans un répertoire personnel. Ouvrez le répertoire ./netbeans/bin, les exécutables pour lancer Netbeans s'y trouvent.
4. Vous pouvez démarrer maintenant Netbeans. Au démarrage, vous pouvez spécifier dans quel répertoire vous voulez que vos projets de programmation soient «&nbsp;sauvegardés&nbsp;». Par défaut, il s'agit de «&nbsp;C:\Users\VotreNomUtilisateur\Documents\NetBeansProjects&nbsp;».

Si vous optez pour NetBeans, vous devrez vous en remettre au soutien technique et à la documentation de l'entreprise qui fournit le produit.

### Installation de l'IDE Eclipse

Si vous avez installé IntelliJ IDEA ou Netbeans, il n'est sans doute pas nécessaire d'installer aussi Eclipse. Cependant, vous pouvez installer les trois, pour comparer.

1. Rendez-vous sur [http://www.eclipse.org](http://www.eclipse.org)
2. Cliquez sur Download. Il peut être nécessaire de cliquer sur Download à plus d'une reprise, alors que différentes pages sont chargées.
3. L'enregistrement du programme d'installation devrait débuter. Suivez ensuite les consignes.

{{< youtube id="3vhLoQZOEzU" >}}

Si vous optez pour Eclipse, vous devrez vous en remettre au soutien technique et à la documentation de l'entreprise qui fournit le produit.


## Les choix du professeur

S'il faut que je développe du code, j'utilise Visual Studio Code. [Je suis actif au sein de plusieurs projets](https://github.com/lemire) et Visual Studio Code a plusieurs avantages. Il fonctionne pratiquement partout. Visual Studio Code me permet de "programmer" dans une multitude de langages, de LaTeX à Go en passant par Haskell, Markdown, C++, etc. Je peux facilement combiner Visual Studio Code à plusieurs autres outils. Je peux développer aussi bien sous docker qu'avec ssh, etc.

Je vous recommande fortement d'utilise Visual Studio Code plutôt qu'un IDE spécialisé.