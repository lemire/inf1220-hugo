---
title: "Activité 3.4"
weight: 6
---

<h1><a id="top" name="top"></a>Module 3</h1><h2>Activité 3.4</h2><h2 class="partie2">Les structures Try-Catch</h2>

<p class="sommaire">Sommaire</p>
<ul>

<li><a href="#section1">Les erreurs/exceptions en Java</a></li>

<li><a href="#section2">La structure Try-Catch</a></li>

<li><a href="#section3">Lancer des exceptions</a></li>

</ul>

<p><a id="intro" name="section1"></a></p>

<h1>Les erreurs/exceptions en Java</h1>

<p>La grande majorité des langages de programmation modernes peuvent générer des fautes à la compilation (par exemple l'oubli d'un ; à la fin d'une ligne de code) et à l'exécution. Dans le langage Java, lorsqu'il y a une faute à l'exécution, une exception ou une erreur particulière est générée par la machine virtuelle Java (JVM) : StackOverflowError, DataFormatException, etc. Il faut distinguer d'abord ce qu'est une exception et une erreur. Une erreur (les classes dérivées de <a href="https://docs.oracle.com/javase/8/docs/api/?java/lang/Error.html">Error</a>) est un événement grave que tout "bon" logiciel ne devrait pas "attraper" (avec le try-catch) et amener la fin de l'exécution du programme. Une exception (les classes dérivées de <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html">Exception</a>) est une faute qui peut être gérée, ou non, par le programme et que l'on peut qualifier de moins grave. 
</p>

<p>La gestion des erreurs et des exceptions par un programme permet d'ajouter de la fiabilité et de permettre à un programme à continuer de fonctionner malgré des erreurs internes ou externes. Cette gestion permet également de notifier les utilisateurs ou les développeurs de la génération d'une faute. Par exemple, si une application nécessite l'ouverture d'une communication TCP/IP entre le programme et un serveur externe, et que cette communication est coupée pour une raison externe à l'application (ex. perte du réseau). Il est alors raisonnable d'informer l'utilisateur et/ou de gérer cette exception, par exemple, en tentant après un certain délai une nouvelle connexion au serveur.</p>

<p><a id="intro" name="section2"></a></p>

<h1>La structure Try-Catch</h1>

<p>La structure try-catch permet "d'enrober" une partie du code dans une structure permettant de récupérer les erreurs ou fautes lancées par la JVM ou l'application et gérer celles-ci. Voici la structure générale d'un try-catch pour une exception et une erreur:</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">try</span> <span style="color: #333333">{</span>
    <span style="color: #888888">//Code ...</span>
<span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">catch</span> <span style="color: #333333">(</span>Exception e<span style="color: #333333">)</span> <span style="color: #333333">{</span>
    <span style="color: #888888">//Gestion de l&#39;exception</span>
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">try</span> <span style="color: #333333">{</span>
    <span style="color: #888888">//Code ...</span>
<span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">catch</span> <span style="color: #333333">(</span>Error e<span style="color: #333333">)</span> <span style="color: #333333">{</span>
    <span style="color: #888888">//Gestion de l&#39;erreur</span>
<span style="color: #333333">}</span>
</pre></div>

<p>Dans le code ci-dessus, la partie intérieure de la structure comprend le code susceptible de générer des fautes ou exception. La partie inférieure (après le catch) permet l'ajout de code pour gérer l'erreur ou l'exception. L'exemple ci-dessus présente la gestion d'une erreur système, par contre, comme nous l'avons mentionné auparavant, il est généralement déconseillé "d'attraper" les erreurs (et non les exceptions). Toutefois, il peut être utile d'attraper celles-ci, de les journaliser et d'ensuite cesser l'exécution du programme. Voici quelques exemples de façon de gérer les exceptions ou erreurs :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">try</span> <span style="color: #333333">{</span>
    <span style="color: #888888">//Code ...</span>
<span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">catch</span> <span style="color: #333333">(</span>Exception e<span style="color: #333333">)</span> <span style="color: #333333">{</span>
    
    <span style="color: #888888">// Vient imprimer l&#39;erreur dans la console/terminal. Il est d&#39;usage d&#39;imprimer l&#39;exception lorsque celle-ci est attrapée.</span>
    e<span style="color: #333333">.</span><span style="color: #0000CC">printStackTrace</span><span style="color: #333333">();</span>
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">try</span> <span style="color: #333333">{</span>
    <span style="color: #888888">//Code ...</span>
<span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">catch</span> <span style="color: #333333">(</span>Exception e<span style="color: #333333">)</span> <span style="color: #333333">{</span>
    
    <span style="color: #888888">// Vient imprimer l&#39;erreur dans la console/terminal. Il est d&#39;usage d&#39;imprimer l&#39;exception lorsque celle-ci est attrapée.</span>
    e<span style="color: #333333">.</span><span style="color: #0000CC">printStackTrace</span><span style="color: #333333">();</span>
    <span style="color: #888888">// Relance l&#39;erreur à l&#39;extérieur de la portée du try-catch. Peut-être utile dans certaines occcasions.</span>
    <span style="color: #008800; font-weight: bold">throw</span> e<span style="color: #333333">;</span>
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">try</span> <span style="color: #333333">{</span>
    <span style="color: #888888">//Code ...</span>
<span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">catch</span> <span style="color: #333333">(</span>Exception e<span style="color: #333333">)</span> <span style="color: #333333">{</span>
    
    <span style="color: #888888">// Vient imprimer l&#39;erreur dans la console/terminal. Il est d&#39;usage d&#39;imprimer l&#39;exception lorsque celle-ci est attrapée.</span>
    e<span style="color: #333333">.</span><span style="color: #0000CC">printStackTrace</span><span style="color: #333333">();</span>
    <span style="color: #888888">// Permet d&#39;arrêter l&#39;exécution du programme par la JVM. Le paramètre 1 indique en général l&#39;arrêt par une faute, alors que System.exit(0) est l&#39;arrêt normal d&#39;un programme.</span>
    System<span style="color: #333333">.</span><span style="color: #0000CC">exit</span><span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">);</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">try</span> <span style="color: #333333">{</span>
    <span style="color: #888888">//Code ...</span>
<span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">catch</span> <span style="color: #333333">(</span>Exception e<span style="color: #333333">)</span> <span style="color: #333333">{</span>
    
    <span style="color: #888888">// Vient imprimer l&#39;erreur dans un journal nommé &quot;Erreur.log&quot;.</span>
    Logger<span style="color: #333333">.</span><span style="color: #0000CC">getLogger</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Erreur.log&quot;</span><span style="color: #333333">).</span><span style="color: #0000CC">severe</span><span style="color: #333333">(</span>e<span style="color: #333333">.</span><span style="color: #0000CC">getMessage</span><span style="color: #333333">());</span>

<span style="color: #333333">}</span>
</pre></div>

<p>Il est également possible d'utiliser plusieurs catchs afin de mieux gérer le type d'exception. Dans l'exemple ci-dessous, l'exception de type NullPointerException sera "attrapée" avant l'Exception générale :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">try</span> <span style="color: #333333">{</span>
    String test <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">null</span><span style="color: #333333">;</span>
    test<span style="color: #333333">.</span><span style="color: #0000CC">charAt</span><span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">);</span>
<span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">catch</span> <span style="color: #333333">(</span>NullPointerException e<span style="color: #333333">)</span> <span style="color: #333333">{</span>
    <span style="color: #888888">// l&#39;accès à l&#39;objet test qui est null va lancer une exception de tytpe NullPointerException</span>
    e<span style="color: #333333">.</span><span style="color: #0000CC">printStackTrace</span><span style="color: #333333">();</span>
<span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">catch</span> <span style="color: #333333">(</span>Exception e<span style="color: #333333">)</span> <span style="color: #333333">{</span>
    e<span style="color: #333333">.</span><span style="color: #0000CC">printStackTrace</span><span style="color: #333333">();</span>
<span style="color: #333333">}</span>
</pre></div>

<p>Les erreurs et exceptions peuvent être causées par les développeurs ayant introduit des "bugs" dans leur logiciel, par exemple l'accès à un index hors de la taille d'un tableau ou bien une division par zéro. Elles peuvent également être lancées volontairement par les programmeurs dans certaines conditions (voir section suivante). Enfin, comme nous l'avions introduit plus tôt, les exceptions ou erreurs peuvent également être produites par des événements externes au programme et sont hors de contrôle des développeurs, par exemple un lien réseau perdu, l'entrée d'un caractère inconnu ou non géré par l'utilisateur (ex. symbole chinois), fichier corrompu, etc.</p>


<p><a id="intro" name="section3"></a></p>
<h1>Lancer des exceptions</h1>

<p>Il est possible dans une application de lancer des exceptions dans le code en utilisant le mot-clé "throw" et le faisant suivant par l'instanciation d'un objet de type Exception ou ses sous-classes (l'héritage sera vu dans le prochain module) : NullPointerException, SQLException, etc. : </p>

<!-- <div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">throw</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #0066BB; font-weight: bold">Exception</span><span style="color: #333333">();</span>

<span style="color: #888888">// Exemple d&#39;exception pouvant être lié à des requêtes SQL</span>
<span style="color: #008800; font-weight: bold">throw</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #0066BB; font-weight: bold">SQLException</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;USER DOESN&#39;T EXIST&quot;</span><span style="color: #333333">);</span>
</pre></div>

<p>Toutefois, une fois une exception lancée, il est nécessaire de la récupérée à un certain moment, sinon, elle remontera de méthode en méthode jusqu'à la méthode "main" et amènera l'arrêt du programme. Pour ce faire, il faut soit : attraper la faute dans une structure try-catch ou bien lancer l'exception à la méthode ayant invoqué la méthode où l'exception est lancée. Pour ce faire, il faut ajouter à la fin de la description d'une méthode/fonction, le mots-clé "throws". Il y a donc une hiérarchie d'appel de méthode et si l'exception n'est pas attrapée, celle-ci remontera les appels jusqu'au niveau supérieur, soit la méthode main. Voici un exemple pour illustrer cette remontée d'une exception : </p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.time.DateTimeException</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.util.logging.Level</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.util.logging.Logger</span><span style="color: #333333">;</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">ExempleTryCatch</span> <span style="color: #333333">{</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        ExempleTryCatch ex <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> ExempleTryCatch<span style="color: #333333">();</span>
        
        <span style="color: #008800; font-weight: bold">try</span> <span style="color: #333333">{</span>   
            ex<span style="color: #333333">.</span><span style="color: #0000CC">deuxiemeMethode</span><span style="color: #333333">();</span>
        <span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">catch</span> <span style="color: #333333">(</span>Exception ex1<span style="color: #333333">)</span> <span style="color: #333333">{</span>
            Logger<span style="color: #333333">.</span><span style="color: #0000CC">getLogger</span><span style="color: #333333">(</span>ExempleTryCatch<span style="color: #333333">.</span><span style="color: #0000CC">class</span><span style="color: #333333">.</span><span style="color: #0000CC">getName</span><span style="color: #333333">()).</span><span style="color: #0000CC">log</span><span style="color: #333333">(</span>Level<span style="color: #333333">.</span><span style="color: #0000CC">SEVERE</span><span style="color: #333333">,</span> <span style="color: #008800; font-weight: bold">null</span><span style="color: #333333">,</span> ex1<span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
        
        <span style="color: #008800; font-weight: bold">try</span> <span style="color: #333333">{</span>
            ex<span style="color: #333333">.</span><span style="color: #0000CC">quatriemeMethode</span><span style="color: #333333">();</span>
        <span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">catch</span> <span style="color: #333333">(</span>Exception ex1<span style="color: #333333">)</span> <span style="color: #333333">{</span>
            Logger<span style="color: #333333">.</span><span style="color: #0000CC">getLogger</span><span style="color: #333333">(</span>ExempleTryCatch<span style="color: #333333">.</span><span style="color: #0000CC">class</span><span style="color: #333333">.</span><span style="color: #0000CC">getName</span><span style="color: #333333">()).</span><span style="color: #0000CC">log</span><span style="color: #333333">(</span>Level<span style="color: #333333">.</span><span style="color: #0000CC">SEVERE</span><span style="color: #333333">,</span> <span style="color: #008800; font-weight: bold">null</span><span style="color: #333333">,</span> ex1<span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">premiereMethode</span><span style="color: #333333">()</span> <span style="color: #008800; font-weight: bold">throws</span> NullPointerException <span style="color: #333333">{</span>
        <span style="color: #888888">// Création d&#39;une faute</span>
        String test <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">null</span><span style="color: #333333">;</span>
        test<span style="color: #333333">.</span><span style="color: #0000CC">charAt</span><span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">);</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">deuxiemeMethode</span><span style="color: #333333">()</span> <span style="color: #008800; font-weight: bold">throws</span> Exception <span style="color: #333333">{</span>
        premiereMethode<span style="color: #333333">();</span>
    <span style="color: #333333">}</span>     
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">troisiemeMethode</span><span style="color: #333333">()</span> <span style="color: #008800; font-weight: bold">throws</span> DateTimeException <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">throw</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #0066BB; font-weight: bold">DateTimeException</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Wrong Date Format&quot;</span><span style="color: #333333">);</span>
    <span style="color: #333333">}</span>        
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">quatriemeMethode</span><span style="color: #333333">()</span> <span style="color: #008800; font-weight: bold">throws</span> Exception <span style="color: #333333">{</span>
        troisiemeMethode<span style="color: #333333">();</span>
    <span style="color: #333333">}</span>  

<span style="color: #333333">}</span>
</pre></div>-->


<iframe height="1000px" width="100%" src="https://repl.it/@lemire/ex5?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>

<h2>Lecture dans le livre de référence</h2>

<p>Pour aller plus en profondeur sur les structures try-catch (optionnel), vous pouvez lire le chapitre 10 dans <em>Programmer en Java</em> de Claude Delannoy.</p>
</ul>

<h2>Vidéos</h2>


<iframe width="560" height="315" src="https://www.youtube.com/embed/UEISfoJaOyk" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
