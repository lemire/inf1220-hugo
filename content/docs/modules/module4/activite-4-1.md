---
title: "Activité 4.1"
weight: 1
---


<h1><a id="top" name="top"></a>Module 4</h1>
<h1>Java pas à pas</h1>




<p>Nous vous invitons maintenant à lire le chapitre <em>Traitement de fichiers</em> du manuel  Java pas à pas par Robert Godin et Daniel Lemire.   Vous trouverez <a href="https://github.com/RobertGodin/JavaPasAPas/blob/master/JavaPasAPas.pdf">le document PDF sur le site GitHub</a>. Pour enregistrer le PDF sur votre machine, cliquez sur le bouton « Download ». </p>

<p><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/">Vous pouvez aussi acheter la version papier du manuel Java pas à pas chez Amazon</a>:</p>
<div><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/"><img src="https://m.media-amazon.com/images/I/61tnblFlmmL._SL1499_.jpg" width="250px" style="margin-left:auto; margin-right:auto;"></a></div>


<p>Plusieurs étudiants trouvent qu'il est plus aisé de faire les lectures dans le manuel Java pas à pas après avoir terminé la lecture du module sur notre site web. Vous pouvez choisir quand il vous convient le mieux d'utiliser le manuel Java Pas à Pas.</p>


<p>Si vous devez lire un document PDF, nous vous encourageons à charger le fichier sur votre machine et à l'ouvrir au sein d'un outil dédié (par ex. Adobe Acrobat). Il n'est pas très pratique de lire un document PDF au sein d'un navigateur web.</p>



<h1>Commentaires constructifs</h1>
<p><a href="https://docs.google.com/forms/d/e/1FAIpQLSe8pU6ypxDsx-cZjcMURa6o2LRG8NODa3qYIcWLNGU2RcvaWQ/viewform">Vous pouvez, de manière anonyme, nous faire parvenir vos corrections lorsque vous trouvez des erreurs sur le site</a>. Nous apprécions toujours vos commentaires constructifs.</p>

<h2>Activité 4.1</h2><h2 class="partie2">Les flux de console</h2>
<p class="sommaire">Sommaire</p>
<ul>

<li><a href="#section1">La bibliothèque System</a></li>
</ul>

<p><a id="intro" name="section1"></a></p>

<h1>La bibliothèque System</h1>

<p>Les bibliothèques responsables de la gestion des éléments de bas niveau (écran, clavier, etc.), lesquelles nécessitent donc le système de l'ordinateur, s'appellent bibliothèques System. Dans les exemples précédents, nous avons utilisé amplement l'affichage à la console avec la méthode System.out.println(). Ainsi, la gestion de l'affichage d'un message à l'écran ou la saisie de valeurs au clavier font partie des fonctions requérant le système de l'ordinateur. C'est pourquoi leur nom commence toujours par « System ».</p>

<p>La librairie System est composée de deux sous-ensembles principaux: in et out. L'affichage est une opération de sortie et fait donc partie des éléments out de la classe System. Pour accéder au sous-ensemble out, on écrit System.out. Finalement, pour afficher à l'écran, nous faisons appel à la fonction print du sous-ensemble out.</p>

<h2>Afficher à la console</h2>

<p>Avant de développer des applications graphiques ou des applications web, il faut maîtriser les fichiers et la console. Nous avons utilisé la console à plusieurs reprises dans les activités précédentes. Il s'agit d'utiliser la sortie "out" de system et d'appeler les méthodes print (pas de retour de ligne automatique) ou println (retour de ligne automatique à la fin du texte). Plus particulièrement, l'instance "out" réfère à la classe <a href="https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html">PrintStream</a>, qui possède plus de méthodes d'impression que print et println. De plus, à partir de l'objet System, il est également possible de changer la modalité d'impression de System.out de la console (par défaut) vers, par exemple, un fichier, et ce en utilisant la méthode System.setOut( ). Nous verrons dans la prochaine activité comment rediriger les sorties vers un fichier à l'aide des flux de fichiers. Voici, donc des exemples de l'utilisation de System.out :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%">System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Imprimer une ligne&quot;</span><span style="color: #333333">);</span>

System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">print</span> <span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Imprimer des chaînes de caractères&quot;</span><span style="color: #333333">);</span>

System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">print</span> <span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;On peut additionner des String et d&#39;autres types grâce à l&#39;auto-boxing&quot;</span> <span style="color: #333333">+</span> <span style="color: #0000DD; font-weight: bold">5</span> <span style="color: #333333">+</span> <span style="background-color: #fff0f0">&quot;-&quot;</span> <span style="color: #333333">+</span> <span style="color: #0044DD">&#39;a&#39;</span><span style="color: #333333">);</span>

<span style="color: #888888">// Permet d&#39;ajouter un caractère à une sortie. Reviens à faire un print</span>
System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">append</span><span style="color: #333333">(</span><span style="color: #0044DD">&#39;c&#39;</span><span style="color: #333333">);</span>

<span style="color: #008800; font-weight: bold">try</span> <span style="color: #333333">{</span>
    <span style="color: #888888">// Permet d&#39;imprimer un tableau de byte dans le flux. Peut provoquer une exception, si il y a un problème avec le flux (fichier fermé).</span>
    <span style="color: #888888">// Ici ça fonction</span>
    System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">write</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Ça marche&quot;</span><span style="color: #333333">.</span><span style="color: #0000CC">getBytes</span><span style="color: #333333">());</span>

    <span style="color: #888888">// Méthode permettant de fermer le flux</span>
    System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">close</span><span style="color: #333333">();</span>

    <span style="color: #888888">// Ici ne s&#39;imprime pas car le flux est fermé.</span>
    System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">write</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Ça ne marche pas&quot;</span><span style="color: #333333">.</span><span style="color: #0000CC">getBytes</span><span style="color: #333333">());</span>
<span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">catch</span> <span style="color: #333333">(</span>IOException ex<span style="color: #333333">)</span> <span style="color: #333333">{</span>
    Logger<span style="color: #333333">.</span><span style="color: #0000CC">getLogger</span><span style="color: #333333">(</span>AlgorithmeTri<span style="color: #333333">.</span><span style="color: #0000CC">class</span><span style="color: #333333">.</span><span style="color: #0000CC">getName</span><span style="color: #333333">()).</span><span style="color: #0000CC">log</span><span style="color: #333333">(</span>Level<span style="color: #333333">.</span><span style="color: #0000CC">SEVERE</span><span style="color: #333333">,</span> <span style="color: #008800; font-weight: bold">null</span><span style="color: #333333">,</span> ex<span style="color: #333333">);</span>
<span style="color: #333333">}</span>
</pre></div>

<h2>Saisir des données au clavier</h2>

<p>Le langage Java a été principalement conçu pour le développement d'interface graphique (GUI) et d'interface Web (JSP, Servlet, etc.). Toutefois, comme la majorité des langages de programmation, il supporte la saisie de données dans la console, grâce à "System.in" et des objets tels que <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html">Scanner</a>. Voici la façon de récupérer des saisies au clavier à partir du terminal/console :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #888888">// Instanciation de entree permettant de lire dans le InputStream correspondant à la console de l&#39;OS(System.in)</span>
Scanner entree<span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> Scanner <span style="color: #333333">(</span>System<span style="color: #333333">.</span><span style="color: #0000CC">in</span><span style="color: #333333">);</span>

<span style="color: #888888">// Récupérer les données jusqu&#39;à la saisie d&#39;un retour de chariot</span>
String texte<span style="color: #333333">=</span> entree<span style="color: #333333">.</span><span style="color: #0000CC">nextLine</span><span style="color: #333333">();</span> 
</pre></div>

<p>La méthode nextInt () permet de lire un entier. Le code suivant illustre cette méthode :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%">Scanner entree <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> Scanner <span style="color: #333333">(</span>System<span style="color: #333333">.</span><span style="color: #0000CC">in</span><span style="color: #333333">);</span> 

<span style="color: #333399; font-weight: bold">int</span> entier<span style="color: #333333">=</span> entree<span style="color: #333333">.</span><span style="color: #0000CC">nextInt</span> <span style="color: #333333">();</span> 
</pre></div>

<p>La classe Scanner ne convient pas à la lecture des mots de passe à partir d'une console puisque ces derniers sont invisibles. Le langage de programmation Java SE 6 introduit une classe Console réservée à cet usage. Donc, pour lire un mot de passe, il faut utiliser le code suivant :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #888888">// Ce code retourne un objet Console null si exécuté dans certains environnements. </span>
<span style="color: #888888">// Nécessite d&#39;être lancée dans un terminal/console de l&#39;OS</span>
Console uneConsole <span style="color: #333333">=</span> System<span style="color: #333333">.</span><span style="color: #0000CC">console</span><span style="color: #333333">();</span> <span style="color: #888888">// définir une console</span>

String nomUtilisateur <span style="color: #333333">=</span> uneConsole<span style="color: #333333">.</span><span style="color: #0000CC">readLine</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot; Nom Utilisateur: &quot;</span><span style="color: #333333">);</span> <span style="color: #888888">// lire le nom utilisateur</span>

<span style="color: #333399; font-weight: bold">char</span><span style="color: #333333">[]</span> motDePasse <span style="color: #333333">=</span> uneConsole<span style="color: #333333">.</span><span style="color: #0000CC">readPassword</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Mot de Passe: &quot;</span><span style="color: #333333">);</span><span style="color: #888888">// le mot de passe.</span>
</pre></div>


<h2>Vidéos</h2>

<iframe width="560" height="315" src="https://www.youtube.com/embed/fa84_nrUrMw" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>


<h2>Recevoir des arguments en ligne de commande</h2>

<p>La méthode main en Java reçoit un tableau de String. Ainsi donc, si on lance un programme Java en ligne de commande (<tt>java MonProgramme arg1 arg2</tt>), la fonction main recevra les chaînes de caractère arg1 et arg2. Vous pouvez regarder la vidéo suivante pour en apprendre davantage sur ce mécanisme si vous le souhaitez.</p>

<iframe width="560" height="315" src="https://www.youtube.com/embed/BzFx1dszk4I?start=165" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>


<p>Si vous utilisez repl.it, vous pouvez ouvrir une console avec les touches ctrl-shift-s où vous pouvez exécuter des commandes comme « javac Main.java » et « java Main arg1 arg2 ».</p>
