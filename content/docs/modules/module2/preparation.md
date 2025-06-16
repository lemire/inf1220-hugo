---
title: "Préparation de l’espace de travail"
weight: 1
---



<h1><a id="top" name="top"></a>Module 2</h1><h2>Activité 2.1</h2><h2 class="partie2">Préparation de l'espace de travail</h2><p class="sommaire">Sommaire</p><ul><li><a href="#enligne">Utilisation d'un environnement de programmation en ligne</a></li>
<li><a href="#JDK">Installation du Java Development Kit (JDK)</a></li>
<li><a href="#texte">Utilisation d'un éditeur de texte</a></li>
<li><a href="#IDEA">Installation de l'IDE IntelliJ IDEA</a></li>
<li><a href="#Netbeans">Installation de l'IDE Netbeans</a></li>
<li><a href="#Netbeans">Installation de l'IDE Eclipse</a></li>
<li><a href="#Prof">Qu'est-ce que le professeur utilise?</a></li>

</ul><p><a id="intro" name="JDK"></a></p>



<p>Comme langage de support à l'introduction des concepts de programmation, nous utiliserons le langage Java. Tel que présenté dans l'introduction du cours, le langage Java est un langage interprété multi-plateforme où le code est pré-compilé dans un ensemble d'instructions intermédiaires (appelé Java bytecode), puis interprété sur chaque système d'exploitation à partir de la machine virtuelle Java. Celle-ci transforme alors le bytecode en instructions machine propre au système d'exploitation et aux processeurs spécifiques de l'ordinateur.</p>

<p>Si ce n'est pas déjà fait, il est maintenant temps de configurer un environnement de développement Java. Dans ce cours, vous pouvez utiliser l'environnement de programmation qui vous convient le mieux ou qui fonctionne bien pour vous. Vous n'avez pas à utiliser une approche spécifique.</p>

<p>Dans ce cours vous devez faire preuve d'un minimum de débrouillardise. En particulier, vous devez être à même de choisir l'environnement qui vous convient le mieux. Cette démarche d'appropriation fait partie intégrante du cours. Nous n'offrons pas de soutien technique concernant les outils logiciels que vous choisissez d'installer sur vos ordinateurs. Nous vous invitons à procéder par essai/erreur et à faire les recherches nécessaires.</p>

<p>Quand vous testez un nouvel environnement, utilisez du code Java simple et bien testé. Si vous ne connaissez pas bien le Java, ne commencez pas à expérimenter avec la programmation tout en testant un nouvel environnement. Allez-y une étape à la fois.</p>




<h1>Utilisation d'un environnement de programmation en ligne</h1>

<p>Plusieurs étudiants préfèrent un environnement de développement conventionnel, installé sur leur PC. D'autres étudiants peuvent avoir une préférence pour les environnements en ligne qui ne nécessitent aucune installation.</p>

<p>Au sein même du cours, nous mettons à votre disposition un environnement de développement 
entièrement en ligne, suffisant pour les travaux du cours. Vous pouvez y avoir accès 
<a href="docs/environnement/">dès maintenant</a>. Suivez le lien qui se trouve dans le menu du cours.
</p>
<p> Il y a plusieurs environnements en ligne, nous vous invitons à les explorer, en commençant  par les suggestions suivantes :</p>

<ol>
<li><a href="https://repl.it">repl.it</a></li>
<li><a href="http://ideone.com">ideone</a></li>
</ol>

<p>Ces outils en ligne vous permettent de saisir votre code, dans le navigateur, et de l'exécuter par la suite. Vous pouvez faire une grande partie du cours en utilisant seulement un outil comme <a href="https://repl.it">repl.it</a>. En effet, le cours se concentre principalement sur la programmation de base. Les outils d'aide à la programmation sont moins importants. Nous ne ferons pas de grands projets dans ce cours qui nécessitent beaucoup de gestion de code.</p>

<p>La vidéo suivante illustre l'utilisation de <a href="https://repl.it">repl.it</a> (il n'est pas nécessaire d'écouter la narration en anglais pour comprendre): </p>
<iframe width="560" height="315" src="https://www.youtube.com/embed/kMqNSZPjBOY" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>


<p>Truc: Avec repl.it, vous pouvez ouvrir une console avec les touches ctrl-shift-s où vous pouvez exécuter des commandes comme « javac Main.java » et « java Main ».</p>

<p>Dans le cours, vous trouverez des exemples utilisant <a href="https://repl.it">repl.it</a>, mais l'utilisation de repl.it est optionnelle. Si repl.it ne fonctionne pas bien pour vous, utilisez autre chose.</p>

<p>Une des limites d'un environnement comme repl.it est qu'ils ne permettent pas la production d'interfaces graphiques. Ainsi, certains exemples ne peuvent fonctionner sous repl.it.</p>

<p>Notez bien: Certains des exemples <a href="https://repl.it">repl.it</a> comprennent plusieurs fichiers. Comme dans plusieurs interfaces, repl.it ne permet de voir le contenu que d'un seul fichier à la fois. Par contre, il vous permet de naviguer entre différents fichiers. Nous verrons dans ce cours que Java exige que les "classes" soient définies au sein de fichiers du même nom, ce qui implique souvent que nous utilisions plusieurs fichiers avec des noms prédéterminés. Cette contrainte en ce qui a trait aux fichiers n'est pas spécifique à repl.it. En Java, il y a un lien direct entre le nom des fichiers et leur contenu. Dans ce cours, vous devez faire preuve de débrouillardise et nous supposons que vous trouverez comment faire pour naviguer et voir les différents fichiers.  </p>

<h2>Instructions détaillées pour Repl.it</h2>
<p>Repl.it est une plateforme en ligne qui permet d’écrire, d’exécuter et de tester du code Java directement dans votre navigateur, sans avoir besoin d’installer un environnement de développement sur votre ordinateur. Pour commencer, accédez aux liens Repl.it fournis dans le cours. Cliquez sur un lien pour ouvrir le projet Java correspondant. Vous verrez une interface avec un éditeur de code à gauche, où le code est déjà chargé, et une console à droite pour afficher les résultats. Si vous n’êtes pas encore inscrit, créez un compte gratuit sur Repl.it en utilisant votre adresse e-mail ou un compte Google. Une fois connecté, vous pouvez modifier le code directement dans l’éditeur. Pour exécuter votre programme, cliquez sur le bouton vert « Run » en haut de la page. La console affichera les sorties ou les erreurs, ce qui vous permettra de vérifier si votre code fonctionne comme prévu.</p>

<p>Pour travailler efficacement sur Repl.it, familiarisez-vous avec ses fonctionnalités principales. Vous pouvez créer un nouveau fichier ou répertoire dans votre projet en cliquant sur l’icône « + » dans la barre latérale. Si vous modifiez le code fourni dans les liens du cours, assurez-vous de ne pas écraser les instructions ou les parties essentielles sans les comprendre. Avec un peu de pratique, Repl.it deviendra un outil puissant et intuitif pour développer vos compétences en programmation Java.</p>



<h1>Installation du <em>Java Development Kit</em> (JDK)</h1>




<h4>Système d'exploitation Microsoft Windows :</h4>

<p>Je vous suggère d'installer le JDK à partir du site https://adoptium.net/. La vidéo suivante illustre comment y arriver sous Windows en moins de deux minutes: </p>
<iframe width="672" height="378" src="https://www.youtube.com/embed/Tk6u3Wm___s" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>


<ol>
<li>Aller sur le site https://adoptium.net/. La version a peu d'importance;  choisir la dernière version disponible.</li>
<li>Une fois le fichier d'installation téléchargé, démarrer l'installation et suivre les différentes étapes d'installation.</li>
<li>Une fois le logiciel installé, la machine virtuelle Java (java.exe) et ses outils de compilation (javac.exe) auront été installés.</li></ol>
</ol>


<h4>macos</h4><p>Nous vous suggérons d'utiliser https://adoptium.net/ encore une fois.</p>


<h4>Linux Debian</h4>

<p>Si vous êtes un utilisateur de Linux et plus particulièrement de Debian (ou Ubuntu), vous savez probablement déjà utiliser les Debian Packages! Pour installer la JDK, il faut ouvrir l'invite de commande (la console...), se mettre en mode super-utilisateur (su) et exécuter la commande « apt-get install default-jdk ».</p>



<h1><a id="intro" name="texte"></a>Utilisation d'un éditeur de texte</h1>

<p>La plupart des langages de programmation s'utilisent avec des fichiers de texte. Le fichier n'est qu'une séquence de caractères sans autre structure particulière. L'outil le plus simple en programmation est donc le simple éditeur de texte. Comme le nom l'indique, l'éditeur de texte vise principalement à éditer des fichiers de texte. Notons que les traitements de texte (comme Word) ne sont pas fait pour éditer  des fichiers de texte. Par ailleurs, un éditeur de texte ne peut pas, par lui-même, compiler et exécuter des programmes. Il sert surtout à écrire le code.</p>

<p>Le meilleur éditeur de fichier texte est sans doute <a href="https://code.visualstudio.com">Visual Studio Code</a> (à ne pas confondre avec Visual Studio). Microsoft rend disponible <a href="https://code.visualstudio.com/docs/java/java-tutorial">un guide d'utilisation de Visual Studio Code avec java</a>.</p>

<p>Nous recommandons Visual Studio Code plutôt que l'utilisation d'un environnement comme IDEA, Eclipse ou NetBeans. L'utilisation d'un éditeur de texte combiné avec le JDK vous met davantage en charge du développement.</p>

<p><a id="intro" name="IDEA"></a></p><h1>Installation de l'IDE IntelliJ IDEA</h1>

<p>Lecture suggérée : <a href="https://fr.wikipedia.org/wiki/Environnement_de_développement">Environnement de développement</a></p>

<p>Vous pouvez installer l'IDE IntelliJ IDEA. L'utilisation d'un IDE n'est pas obligatoire, mais cela est recommandé. IntelliJ IDEA est un excellent choix.</p>

<ol>
<li>Rendez-vous sur <a href="https://www.jetbrains.com/idea/">https://www.jetbrains.com/idea/</a>.</li>
<li>Cliquez sur Download.</li>
<li>Sous "Community", cliquez sur Download. Cette version est gratuite.</li>
<li>L'enregistrement du programme d'installation devrait débuter. Suivez ensuite les consignes.</li>
</ol>


<p>Nous croyons que IntelliJ IDEA est supérieur aux autres IDE, étant plus élégant et convivial. Cependant, le choix vous appartient.</p>

<p>Notez que nous n'offrons pas de soutien technique pour les IDE dans ce cours. Si vous optez pour  IntelliJ IDEA, vous devrez vous en remettre au soutien technique et à la documentation de l'entreprise qui fournit le produit. Nous sommes là pour vous appuyer dans l'apprentissage de la programmation et du Java, mais pas dans l'utilisation d'un IDE spécifique.</p>

<p>Les IDE ont la fâcheuse habitude d'automatiser plusieurs opérations ce qui ne pose pas de problème aux programmeurs expérimentés, mais qui est souvent déroutant pour les débutants. Les IDE vont souvent créer des répertoires, des « paquetages » et avoir différentes attentes quant à l'endroit où les différentes fonctions et classes doivent être. Le résultat net est que les étudiants sont souvent confrontés à des messages d'erreur qui les laissent perplexes après des modifications faites en utilisant l'interface graphique (par exemple, après le déplacement d'un fichier). Si vous utilisez un IDE, il faut apprendre à travailler selon les attentes de l'IDE. À terme, certains programmeurs trouvent que l'utilisation d'un IDE les rend plus productifs, mais quand on débute, l'IDE est un obstacle supplémentaire pour certains étudiants.</p>

<p><a id="intro" name="Netbeans"></a></p><h1>Installation de l'IDE Netbeans</h1>

<p>Si vous avez installé IntelliJ IDEA, il n'est sans doute pas nécessaire d'installer aussi Netbeans. Cependant, vous pouvez installer les deux, pour comparer.</p> 
<p>Cet IDE possède un éditeur visuel bien fait, stable et complet. Pour installer Netbeans (lors de la dernière mise à jour du cours, il s'agissait de la version Apache Netbeans 11; Depuis Janvier 2019, la gestion du projet Netbeans a passé de Oracle vers l'organisation Apache, vous pouvez utiliser les versions plus récentes sous Apache ainsi que la dernière version d'Oracle 8.2), vous devez suivre les étapes suivantes :</p><ol><li>Suivre le lien suivant: <a href="https://netbeans.apache.org/download/index.html">https://netbeans.apache.org/download/index.html</a></li><li>Télécharger la version "binaries" (déjà compilée).</li><li>Une fois le fichier .zip téléchargé, veuillez le décompresser dans un répertoire personnel. Ouvrez le répertoire ./netbeans/bin, les exécutables pour lancer Netbeans s'y trouvent.</li><li>Vous pouvez démarrer maintenant Netbeans. Au démarrage, vous pouvez spécifier dans quel répertoire vous voulez que vos projets de programmation soient « sauvegardés ». Par défaut, il s'agit de « C:\Users\VotreNomUtilisateur\Documents\NetBeansProjects ».</li></ol>


<p>Si vous optez pour NetBeans, vous devrez vous en remettre au soutien technique et à la documentation de l'entreprise qui fournit le produit.</p>

<p><a id="intro" name="Eclipse"></a></p><h1>Installation de l'IDE Eclipse</h1>

<p>Si vous avez installé IntelliJ IDEA ou Netbeans, il n'est sans doute pas nécessaire d'installer aussi Eclipse. Cependant, vous pouvez installer les trois, pour comparer.</p> 
<ol>
<li>Rendez-vous sur <a href="http://www.eclipse.org">http://www.eclipse.org</a>.</li>
<li>Cliquez sur Download. Il peut être nécessaire de cliquer sur Download à plus d'une reprise, alors que différentes pages sont chargées.</li>
<li>L'enregistrement du programme d'installation devrait débuter. Suivez ensuite les consignes.</li>
</ol>


[embed width="600" height="800"]https://www.youtube.com/embed/3vhLoQZOEzU[/embed]

<p>Si vous optez pour Eclipse, vous devrez vous en remettre au soutien technique et à la documentation de l'entreprise qui fournit le produit.</p>


<h1>Erreurs et avertissements</h1>

<p>Java pourra émettre certains messages lors de la compilation et de l'exécution de vos programmes. Il y a d'une part les messages d'erreur. Dans un tel cas, le programme ne peut être compilé ou exécuté. Il y a d'autre part les messages d'avertissement. Le plus souvent, on peut ignorer les messages d'avertissement. Ils servent avant tout à attirer l'attention du programmeur sur des problèmes potentiels, mais ils ne nuisent pas à la compilation et à l'exécution.</p>

<p>Il est important de faire la différence entre une erreur et un avertissement. Vous ne devez pas confondre les deux concepts lorsque vous programmez. Soyez précis!</p>

<p><a id="intro" name="Prof"></a></p><h1>Les choix du professeur</h1>

<p>Le cours INF 1220 est développé en utilisant en grande partie <a href="https://repl.it/">repl.it</a>. Bien que l'outil ne soit pas parfait, le fait de pouvoir travailler à partir de n'importe quelle machine
dotée d'un navigateur web, sans rien à configurer, est vraiment génial. Par ailleurs, l'aisance avec laquelle on peut partager du code fonctionnel est vraiment géniale. </p>


<p>Par ailleurs, s'il faut que je développe du code plus substantiel, j'utilise Visual Studio Code. <a href="https://github.com/lemire">Je suis actif au sein de plusieurs projets</a> et Visual Studio Code a plusieurs avantages. Il fonctionne pratiquement partout. Visual Studio Code me permet de "programmer" dans une multitude de langages, de LaTeX à Go en passant par Haskell, Markdown, C++, etc. Je peux facilement combiner Visual Studio Code a plusieurs autres outils. Je peux développer aussi bien sous docker qu'avec ssh, etc.  </p>


<p> Le programmeur qui peut travailler avec un simple éditeur de texte peut travailler quasiment partout, et dans tous les langages. Cela ne signifie pas qu'il faille pour autant éviter d'utiliser des outils: au contraire, les bons outils sont essentiels. </p>

<p>Lecture optionnelle: <a href="https://lemire.me/blog/2017/07/15/what-is-modern-programming/">What is “modern” programming?</a> (billet en anglais du professeur)</p>
