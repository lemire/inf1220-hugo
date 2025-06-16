---
title: "Qu’est-ce qu’un langage de programmation orientée-objet?"
weight: 2
---

<h1><a id="top" name="top"></a>Module 2</h1><h2>Activité 2.2</h2><h2 class="partie2">Qu’est-ce qu’un langage de programmation orientée-objet?</h2>

<h1>Java pas à pas</h1>

<p>Nous utilisons un manuel d'introduction à la programmation Java intitulé Java pas à pas. Vous devez <a href="https://github.com/RobertGodin/JavaPasAPas/raw/master/JavaPasAPas.pdf">charger le document PDF</a>.</p>

<p><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/">Vous pouvez aussi acheter la version papier du manuel Java pas à pas chez Amazon</a>:</p>
<div><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/"><img src="https://m.media-amazon.com/images/I/61tnblFlmmL._SL1499_.jpg" width="250px" style="margin-left:auto; margin-right:auto;"></a></div>

<p>Nous vous invitons maintenant à lire les chapitres <em>Introduction à la programmation Java</em> et <em>Types et expressions Java</em> du manuel  Java pas à pas. Il est normal que vous ne compreniez peut-être pas tout à ce point-ci. Il y aura d'autres lectures, exercices et activités.</p>

<p>Plusieurs étudiants trouvent qu'il est plus aisé de faire les lectures dans le manuel Java pas à pas après avoir terminé la lecture du module sur notre site web. Vous pouvez choisir quand il vous convient le mieux d'utiliser le manuel Java pas à pas.</p>

<p>Si vous devez lire un document PDF, nous vous encourageons à charger le fichier sur votre machine et à l'ouvrir au sein d'un outil dédié (par ex. Adobe Acrobat). Il n'est pas très pratique de lire un document PDF au sein d'un navigateur web.</p>

<h3>Lecture dans le livre de référence (optionnel)</h3>

<p>Vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, le premier chapitre. Le manuel de Delannoy  est à son mieux comme manuel de référence. On vous invite à faire les lectures à et garder le manuel avec vous lors que vous étudiez si vous en avez fait l'acquisition. Le manuel de Delannoy n'est pas obligatoire.</p>

<h3>Vidéo suggérée</h3>

<iframe width="560" height="315" src="https://www.youtube.com/embed/5j5z9BJCAW8" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<h1>Un premier programme</h1>
<p>
En Java, toutes parties d'un programme informatique doit donc être encapsulée dans une classe. Pour ce faire, il est donc nécessaire de créer un premier fichier de code source qui décrira une première classe et contiendra la description de la méthode "main", la méthode de démarrage (appelé parfois "bootstrap") du programme. Il est possible tout simplement d'utiliser le Bloc-Note avec Windows ou un autre éditeur de texte brut (<strong>ce n'est pas le cas de Microsoft Word!</strong>), d'écrire les lignes de code nécessaire à la création de la classe et de ses fonctions et d'enregistrer ce texte sous l'extension .java (dans l'exemple ci-dessous dans un fichier Main.java).  Voici un exemple d'une première classe qui imprimera dans l'invite de commande un texte de bienvenue.</p>

<details><summary>Réponse</summary>

```java
/* Ma première classe */
public class Bienvenue {
  public static void main(String args[]) {
    System.out.println("Bienvenue au sein du cours INF1220 !");
  }
}
```

</details>

<p>Vous devez choisir comment vous allez exécuter ce programme. Vous pouvez le faire sans IDE (avec Bloc-Note et un accès en ligne de commande), avec repl.it en ligne, avec IntelliJ IDEA, avec Netbeans. Vous pouvez même faire des expériences avec plus d'une approche et ne retenir que celle qui vous convient le mieux.</p>

<p>Nous reviendrons dans le cours sur les éléments de programmation nécessaires pour comprendre ce programme. Néanmoins, en voici l'essentiel:</p>
<ol>
<li>Les parties de code situées entre /* et */ sont des commentaires qui ne seront pas compilés. </li>

<li>La première instruction <tt>public class  Bienvenue</tt> indique que nous créons une classe publique (accessible à toutes autres parties du programme) qui se nomme <tt>Bienvenue</tt>. Cette classe doit être enregistrée dans un fichier portant le même nom et la même extension .java. Attention, Java différencie les majuscules et les minuscules. La classe <tt>Bienvenue</tt> est différente de la classe <tt>bienvenue</tt>, et le fichier <tt>bienvenue.java</tt> n'est pas l'équivalent du fichier <tt>Bienvenue.java</tt>. <strong>Important :</strong> La norme de programmation en Java est de toujours commencer un nom de classe par une majuscule. S'il y a plusieurs mots dans le nom de la classe, utiliser une majuscule au début de chaque mot. Par exemple, <tt>TexteBrute</tt> ou <tt>Encrypteur32Bits</tt>.</li>

<li>La classe Bienvenue doit être définie dans un fichier appelé <tt>Bienvenue.java</tt>. Le nom et l'emplacement des fichiers est important en Java.</li>

<li>Java étant un langage orienté objet, tout fichier source définit une classe, c'est-à-dire un objet possédant des champs et des méthodes. La définition de la classe se fait dans un bloc d'instructions contenu entre des accolades ouvrantes <tt>{</tt> et fermantes <tt>}</tt>. C'est ce que l'on appelle la portée. </li>

<li>Notre classe <tt>Bienvenue</tt> contient une unique méthode annoncée par l'instruction <tt>public static void main (String args[])</tt>. Il s'agit de la méthode principale d'un programme, celle qui sera exécutée lors du lancement par la machine virtuelle Java (JVM). Le nom et la déclaration de cette méthode ne peuvent pas être modifiés. Par exemple, la fonction "<tt>public static void main (int x)</tt>" ne sera pas interprétée comme la méthode principale de démarrage.</li>

<li>Pour définir une méthode, il faut donner une suite d'instructions situées entre deux nouvelles accolades. Dans le cas qui nous intéresse, la méthode "<tt>main</tt>" ne comporte qu'une seule instruction qui provoque l'affichage du message «<tt>Bienvenue au sein du cours INF 1220!</tt>», à savoir la méthode <tt>System.out.println</tt>. Les lignes contenant une instruction simple comme celle-ci doivent se terminer par un point-virgule.</li>
</ol>

<strong>Important</strong>: Le code en Java est généralement organisé en « classes ». En Java, une classe doit être déclarée et définie dans un fichier qui porte son nom. Ainsi, si votre classe s'appelle "MonChat", vous devez l'enregistrer dans un fichier nommé MonChat.java.

<p><a id="intro" name="sansIDE"></a></p>

<h1>Création d'une classe sans IDE</h1>

<p>Créez un fichier au format texte nommé Bienvenue.java et contenant le code suggéré. Le fichier source étant créé et enregistré, nous pouvons passer aux phases de compilation et d'exécution.</p>

<p>Si vous utilisez Windows, vous pouvez suivre cette vidéo&nbsp;:</p>

<iframe width="672" height="378" src="https://www.youtube.com/embed/1ttHH5MlNug" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<h4>Compilation</h4>

<p>Le compilateur Java est le programme javac.exe (ou simplement javac sous OSX et Linux) contenu dans le dossier bin du JDK. Pour compiler Bienvenue.java, il faut :</p>

<ol>
<li>ouvrir une invite de commande (sous windows) ou bien Terminal (macos et Linux); </li>

<li>se déplacer dans le dossier de travail dans la console en utilisant la commande cd qui permet de changer de répertoire (ex. "cd /INF1220"); </li>

<li>exécuter la commande "javac Bienvenue.java";</li>
</ol>

<p>Si tout s'est bien passé (c'est à dire qu'il n'y a pas eu d'erreur de compilation), vous obtiendrez dans le même dossier le nouveau fichier Bienvenue.class, qui est le résultat de la compilation. C'est le fichier intermédiaire qui contient le Bytecode et qui sera interprété par  la JVM</p>

<p>Malheureusement, plusieurs erreurs peuvent survenir. Voici quelques causes d'erreurs possibles.</p>

<ul>
<li>Votre environnement ne trouve pas le programme javac.exe. Il faut indiquer le chemin d'accès à ce programme. Pour éviter d'avoir à réécrire à chaque fois le chemin d'accès à javac et aux autres programmes du SDK, il est conseillé d'ajouter ce chemin dans le PATH en complétant le fichier autoexec.bat. </li>

<li>javac.exe s'exécute, mais ne trouve pas bienvenue.java. Le dossier actif de votre console/invite de commande n'est pas celui qui contient Bienvenue.java. Allez dans le bon dossier. </li>

<li>javac.exe s'exécute et trouve bienvenue.java, mais écrit un message d'erreur. Il s'agit en général d'une erreur dans le fichier source. Le message d'erreur vous donne une indication sur la nature de l'erreur et sur la ligne où elle s'est produite. Essayez de comprendre. Dans la plupart des cas, il s'agit :  (i) d'un point-virgule oublié à la fin d'une instruction simple; (ii) d'une faute de syntaxe;  (iii) d'une confusion majuscule/minuscule;  (iv) d'une accolade fermante oubliée. Il vous faut alors corriger l'erreur dans le fichier Bienvenue.java et recommencer la compilation.</li>
</ul>

<p>Prenez bien note des points suivants:</p>

<ol>
<li>Les programmes Java sont écrits dans des fichiers au format texte ayant l'extension «.java». Le nom du fichier (par exemple Bienvenue.java) doit correspondre au code: un fichier Java comporte généralement une déclaration « public class » qui détermine le nom du fichier. Ainsi donc si votre code Java contient la déclaration « public class Bienvenue » alors le fichier doit être nommé Bienvenue.java. La plupart des fichiers en Java ne contiennent qu'une seule « classe ».</li>
<li>Un programme Java exécutable doit contenir une méthode nommée « main ». Tous les fichiers Java n'ont pas une méthode « main », mais ceux qui en contiennent une peuvent souvent être exécutés.</li>
<li>Beaucoup des exemples dans le cours peuvent être recopiés et exécutés, mais vous devez choisir le bon nom de fichier (correspondant à la classe). Si vous modifiez du code, même très légèrement, et qu'il ne fonctionne plus, revenez en arrière. Il faut avoir beaucoup de rigueur pour programmer, vous ne pouvez pas juste modifier du code en suivant votre instinct et espérer que tout fonctionne. Vous devez apprendre et comprendre avant de pouvoir modifier du code.</li>
<li>Vous ne devez en aucun cas copier du code au sein d'autre code en espérant que tout fonctionne. Le copier-coller sans comprendre ce que l'on fait ne fonctionnera pas. Pour commencer, ne changez absolument rien, rien, au code. Copiez le code à l'identique, caractère par caractère.Tout doit être identique. Le nom de fichier, le nom de la classe, le nom des méthodes, etc.</li>
</ol>
<h4>Exécution</h4>
<p>Après la réussite de la compilation et la création du fichier Bienvenue.class, il faut l'exécuter avec l'interpréteur (la JVM) java.exe (java sous OSX et Linux). À partir de la console/invite de commande, il suffit d'exécuter la commande "java Bienvenue". Si tout se passe bien, on voit apparaître le message prévu : Bienvenue au cours INF 1220!  Sinon, il y a sans doute un problème de répertoire actif ou de chemin d'accès à java.exe</p>

<h1>Création d'une classe avec repl.it</h1>

<p>Vous pouvez aussi utiliser repl.it. Dans ce cas, il suffit d'aller en ligne et d'utiliser l'interface graphique.</p>
<p>En général, vous pouvez créez vos propres programmes sur repl.it. Repl.it est une plateforme en ligne pour écrire et tester du code Java sans installation. Cliquez sur les liens Repl.it du cours pour ouvrir les projets Java. </p>

<p>Voici un exemple pertinent déjà en place:</p>
<iframe height="800px" width="100%" src="https://repl.it/@lemire/b1?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>

<p>Si vous utilisez <tt>repl.it</tt>, vous devez tenir compte que la classe contenant la fonction exécutable (<tt>main</tt>) doit être nommée <tt>Main</tt>, mais c'est un détail technique spécifique à <tt>repl.it</tt> qui ne change pas la nature de l'exercice.</p>

<h2>Vidéo suggérée</h2>

<iframe width="560" height="315" src="https://www.youtube.com/embed/8nXAvKzqbw0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>

<p><a id="intro" name="avecideone"></a></p>
<h1>Création d'une classe avec ideone.com </h1>

<p><a href="https://ideone.com/kWZuP3">Vous pouvez aussi utiliser ideone.com</a>. Le fonctionnement est similaire à repl.it. Encore une fois, vous devrez créer un compte gratuit.</p>

<p><a id="intro" name="avecIDEa"></a></p>

<h1>Création d'une classe avec IntelliJ IDEA, sa compilation et son exécution</h1>

<p>Si vous avez installé l'IDE IntelliJ IDEA lors de l'activité précédente, vous pouvez maintenant l'utiliser pour écrire et exécuter du code Java.</p>

<iframe width="728" height="410" src="https://www.youtube.com/embed/snX2j1HaOhc" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<p>Après avoir lancé IntelliJ IDEA, suivez les consignes suivantes:</p>
<ol>
<li>Choisissez "Create New Project".</li>
<li>Choisissez "Java" et cliquez sur "Next".</li>
<li>Choisissez "Create project from template", puis "Command Line App" et cliquez sur "Next".</li>
<li>Choisissez un nom pour votre project ou utilisez le nom par défaut, puis cliquez sur "Next".</li>

<li>Vous trouverez alors un bout de code. Tapez <tt>System.out.println("Allo");</tt> en plein milieu du code,
remplaçant la ligne qui débute par <tt>//</tt>, entre les deux accolades.</li>
<li>Allez dans le menu "Run" et choisissez "Run Main".</li>
<li>Une console devrait s'ouvrir et vous devriez y voir le texte "Allo".</li>
</ol>
<p>L'IDE IntelliJ  permet, comme les autres IDE, l'ajout de nouvelles classes à un projet.</p>
<p>Tout comme les autres IDE, IntelliJ est difficile d'utilisation pour les débutants. Il expose le débutant à un environnement inutilement complexe. Néanmoins, plusieurs étudiants insistent pour utiliser des IDE. Nous
donnons ici la base, mais si vous souhaitez prendre cette approche, vous devrez apprendre à vous retrouver dans un environnement complexe qui n'est pas destiné aux débutants. Nous vous rappelons que nous n'offrons pas de soutien technique. Si vous avez du mal avec IntelliJ, c'est votre responsabilité de trouver l'information pertinente. L'utilisation IntelliJ est purement optionnelle.</p>

<h2>Vidéo suggérée</h2>

<p>(YouTube offre des sous-titres en français.)

<iframe width="728" height="410" src="https://www.youtube.com/embed/vaa5gAi9Wko" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<p>L'approche est essentiellement la même pour les autres IDE comme Eclipse et NetBeans. On créé un projet, on écrit son code, et on exécute. Tous les IDE peuvent vous aider à identifier vos erreurs de syntaxe.</p>

<p><a id="intro" name="avecIDE"></a></p>

<h1>Création d'une classe avec NetBeans, sa compilation et son exécution</h1>

<p>Si vous avez installé l'IDE Netbeans lors de l'activité précédente, il est maintenant le temps d'utiliser cet outil de développement très utile, permettant d'accélérer et de simplifier les étapes dans le développement d'une application. Voici les étapes pour réaliser l'équivalent de l'activité précédente.</p>

<ol>
<li>Pour créer un projet aller dans "File" (ou Fichier) et sélectionner "New Project" (Nouveau projet).</li>
<li>Choisir dans la fenêtre de type "Wizard", un projet de type Java (liste de gauche) et Java Application (liste de droite). Appuyer sur "Next" (Suivant).</li>
<img src="http://inf1220-vw2.teluq.ca/files/2019/08/image_wizard_act2-2.png" alt="image_wizard_act2-2" width="400px"  class="alignnone size-medium wp-image-994" />
<li>Entre le nom du projet, par exemple "Exercice1" et assurer vous que la case "Create Main Class" soit cochée. Ceci va créer automatiquement une classe "Exercice1" avec une méthode "main". Appuyer sur "Finish" (Terminer).</li>
<img src="http://inf1220-vw2.teluq.ca/files/2019/08/image_ex1_act2-2.png" alt="image_ex1_act2-2" width="400px"  class="alignnone size-medium wp-image-996" />

<li>Une fois le projet crée, celui-ci apparaît dans la liste des projets à gauche. Vous pouvez avoir plusieurs projets à la fois et naviguez entre les classes de ces projets via l'arborescence. La classe "Exercice1", qui a été auto-générée, apparaît dans la partie droite de la fenêtre de l'IDE.</li>
<img src="http://inf1220-vw2.teluq.ca/files/2019/08/image_IDE_act2-2.png" alt="image_ide_act2-2" width="400px"  class="alignnone size-medium wp-image-992" />

<li>Copier la ligne "System.out.println("Bienvenue au sein du cours INF1220 !");" et l'ajouter dans la portée de la fonction main. Enregistrer le fichier (via le menu) suite à la modification.</li>
<img src="http://inf1220-vw2.teluq.ca/files/2019/08/image_printin_act2-2.png" alt="image_printin_act2-2" width="400px"  class="alignnone size-medium wp-image-993" />

<li>Nous allons maintenant compiler et exécuter cette classe et cette fonction main. Pour ce faire, faite un clique droit sur le fichier "Exercice1.java" dans le fenêtre de gauche et choisir l'option "Run File". L'IDE Netbeans va alors vérifier si le fichier a été modifié. Si c'est le cas (nous avons ajouté une ligne ...), il va compiler la classe (via javac), puis exécuter celle-ci automatique (via java). Le résultat de l'affichage à la console de l'opération System.out.println("Bienvenue au sein du cours INF1220 !"), apparaît dans la fenêtre de console au bas de l'IDE.</li>
<img src="http://inf1220-vw2.teluq.ca/files/2019/08/image_compil_act2-2.png" alt="image_compil_act2-2" width="400px" class="alignnone size-medium wp-image-995" />

<li>Vous pouvez également vous créer une seconde classe dans le projet en utilisant l'option du menu "File>New File". Choisir dans le fenêtre de type "Wizard", un fichier de catégorie Java et de type "Java Class". Appuyer sur "Next".</li>
<img src="http://inf1220-vw2.teluq.ca/files/2019/08/image_ex2_act2-2.png" alt="image_ex2_act2-2" width="400px"  class="alignnone size-full wp-image-997" />

<li>Choisir un nom de classe (différent de Exercice1), par exemple "AutreClasse", puis appuyer sur terminer. Vous pouvez dans la nouvelle classe recopier la fonction main de "Exercice1", puis compiler et exécuter celle-ci.</li>
</ol>

<p>Tout comme IntelliJ, l'utilisation de NetBeans est optionnelle. Ce n'est pas un environnement destiné aux débutants. Si vous choisissez d'utiliser NetBeans, c'est à vous de faire le travail d'assimilation nécessaire.</p>

<h2>Vidéos suggérées</h2>

<iframe width="560" height="315" src="https://www.youtube.com/embed/_l4pJ7HCrl4" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/cvpkw2ZN4Ps" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

