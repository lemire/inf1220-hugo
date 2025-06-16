---
title: "Activité 3.2"
weight: 2
---

<h1><a id="top" name="top"></a>Module 3</h1><h2>Activité 3.2</h2><h2 class="partie2">Les structures itératives</h2>

<p class="sommaire">Sommaire</p>
<ul>

<li><a href="#section1">La boucle while</a></li>

<li><a href="#section2">La boucle for</a></li>

<li><a href="#section3">La boucle do-while</a></li>

<li><a href="#section4">Utilisation des structures d'itération</a></li>

</ul>

<p>Les structures itératives permettent d'itérer un certain nombre de fois, basé sur des variables de contrôle. Elles permettent par exemple de chercher une valeur dans une structure de données (ex. un tableau d'entier), de lire un flux de données caractère par caractère, etc. Elles sont l'implémentation des "tant que", des "pour i de 1 à 10 faire", etc. Dans le langage Java, il existe trois structures itératives : le while, le for et le do-while.</p>

<p><a id="intro" name="section1"></a></p>

<h1>La boucle while</h1>

<p>L'instruction while (condition) permet d'exécuter les instructions dans sa portée, tant que la condition est vraie. Les instructions peuvent ne jamais s'exécuter si la condition n'est pas vérifiée dès l'entrée de la boucle.</p>


<iframe height="400px" width="100%" src="https://repl.it/@lemire/nex1?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>

<p>Il est possible de terminer une itération, ou la boucle entière, grâce à deux instructions : continue et break. L'instruction continue permet de sauter toutes les instructions qui suivent et revenir au début de la boucle. Ainsi, le programme suivant arrêtera l'itération à i == 3:</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">ExecutionIteration</span> <span style="color: #333333">{</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String arg<span style="color: #333333">[])</span> <span style="color: #333333">{</span>
        <span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">;</span>

        <span style="color: #888888">// Itération tant que i est inférieur ou égal à 4</span>
        <span style="color: #008800; font-weight: bold">while</span> <span style="color: #333333">(</span>i <span style="color: #333333">&lt;=</span> <span style="color: #0000DD; font-weight: bold">4</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
            <span style="color: #008800; font-weight: bold">if</span><span style="color: #333333">(</span>i<span style="color: #333333">==</span><span style="color: #0000DD; font-weight: bold">3</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
                  <span style="color: #008800; font-weight: bold">break</span><span style="color: #333333">;</span>
            <span style="color: #333333">}</span>       
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">print</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;*&quot;</span><span style="color: #333333">);</span>
            i<span style="color: #333333">++;</span>
        <span style="color: #333333">}</span>
    <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>

<p>D'autre part, le mot-clé "continue" permet de "sauter" une partie de l'exécution du code d'une structure d'itération pour commencer une nouvelle itération. Ainsi, dans le code suivant, les nombres impairs ne seront pas affichés car l'exécution de la ligne System.out ne sera pas atteinte par la JVM :</p>

<iframe height="800px" width="100%" src="https://repl.it/@lemire/ex1?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>

<!--<div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">ExecutionIteration</span> <span style="color: #333333">{</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String arg<span style="color: #333333">[])</span> <span style="color: #333333">{</span>
        <span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>

        <span style="color: #888888">// Itération tant que i est inférieur ou égal à 4</span>
        <span style="color: #008800; font-weight: bold">while</span> <span style="color: #333333">(</span>i <span style="color: #333333">!=</span> <span style="color: #0000DD; font-weight: bold">4</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
            i<span style="color: #333333">++;</span>
            <span style="color: #008800; font-weight: bold">if</span><span style="color: #333333">((</span>i<span style="color: #333333">%</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">)</span> <span style="color: #333333">!=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
                  <span style="color: #008800; font-weight: bold">continue</span><span style="color: #333333">;</span>
            <span style="color: #333333">}</span>       
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span>i<span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
    <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>-->

<p><a id="intro" name="section2"></a></p>

<h1>La boucle for</h1>

<p>L'instruction for (initialisation; test_fin; itération) permet de répéter les instructions dans la portée en utilisant plusieurs valeurs pour certaines variables. Ces variables sont déclarées et initialisées dans l'expression init (plusieurs variables peuvent être séparées par des virgules). La fin de l'itération est indiquée par l'expression test_fin. L'expression itération est exécutée au début de chaque nouvelle itération (après la première). Voici un exemple de boucle for en réutilisant l'exemple précédent pour la boucle while :</p> 
<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> ExecutionIteration <span style='color:#800080; '>{</span>
    <span style='color:#696969; '>// affiche 2 et 4</span>
    <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#800000; font-weight:bold; '>void</span> <span style='color:#400000; '>main</span><span style='color:#808030; '>(</span><span style='color:#603000; '>String</span> <span style='color:#400000; '>arg</span><span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
        <span style='color:#696969; '>// Itération tant que i est inférieur ou égal à 4</span>
        <span style='color:#800000; font-weight:bold; '>for</span><span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>int</span> i <span style='color:#808030; '>=</span> <span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span> i <span style='color:#808030; '>&lt;</span><span style='color:#808030; '>=</span> <span style='color:#008c00; '>4</span><span style='color:#800080; '>;</span> i<span style='color:#808030; '>+</span><span style='color:#808030; '>+</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>

            <span style='color:#800000; font-weight:bold; '>if</span><span style='color:#808030; '>(</span><span style='color:#808030; '>(</span>i<span style='color:#808030; '>%</span><span style='color:#008c00; '>2</span><span style='color:#808030; '>)</span> <span style='color:#808030; '>!</span><span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
                  <span style='color:#800000; font-weight:bold; '>continue</span><span style='color:#800080; '>;</span>
            <span style='color:#800080; '>}</span>
            System<span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span>i<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#800080; '>}</span>
    <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>

<p>Nous n'avons pas encore vu les structures de données de base en programmation (ex. tableau, list, etc.) et le sujet sera abordé un peu plus loin, mais la structure d'itération for permet également de simplifier l'itération dans ce type de structure. Voici un exemple avec une chaîne de caractères :</p>

<iframe height="800px" width="100%" src="https://repl.it/@lemire/ex2?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>

<!--<div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">ExecutionIteration</span> <span style="color: #333333">{</span>


    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String arg<span style="color: #333333">[])</span> <span style="color: #333333">{</span>

        String chaine <span style="color: #333333">=</span> <span style="background-color: #fff0f0">&quot;veni vidi vici&quot;</span><span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">int</span> nbVoyelle <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>

        <span style="color: #888888">// Itération tant que i est inférieur ou égal à 4</span>
        <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">char</span> c <span style="color: #333333">=</span> chaine<span style="color: #333333">.</span><span style="color: #0000CC">toCharArray</span><span style="color: #333333">())</span>

            <span style="color: #008800; font-weight: bold">if</span><span style="color: #333333">(</span>c <span style="color: #333333">==</span>  <span style="color: #0044DD">&#39;a&#39;</span> <span style="color: #333333">||</span> c <span style="color: #333333">==</span> <span style="color: #0044DD">&#39;e&#39;</span> <span style="color: #333333">||</span> c <span style="color: #333333">==</span> <span style="color: #0044DD">&#39;i&#39;</span> <span style="color: #333333">||</span> c <span style="color: #333333">==</span> <span style="color: #0044DD">&#39;o&#39;</span> <span style="color: #333333">||</span> c <span style="color: #333333">==</span> <span style="color: #0044DD">&#39;u&#39;</span> <span style="color: #333333">||</span> c <span style="color: #333333">==</span> <span style="color: #0044DD">&#39;y&#39;</span> <span style="color: #333333">)</span> <span style="color: #333333">{</span>
                  nbVoyelle<span style="color: #333333">++;</span>
            <span style="color: #333333">}</span>       
        <span style="color: #333333">}</span>
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span>nbVoyelle<span style="color: #333333">);</span>
    <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>-->

<p><a id="intro" name="section3"></a></p>

<h1>La boucle do-while</h1>

<p>La boucle do-while est similaire à la boucle while, à la différence que le contrôle de valeurs se fait à la fin de l'itération du corps de la structure. Le do-while peut donc être utilisé à d'autres fins. Voici un exemple :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">ExecutionIteration</span> <span style="color: #333333">{</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String arg<span style="color: #333333">[])</span> <span style="color: #333333">{</span>
        <span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">;</span>

        <span style="color: #008800; font-weight: bold">do</span> <span style="color: #333333">{</span>       
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">print</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;*&quot;</span><span style="color: #333333">);</span>
            i<span style="color: #333333">++;</span>
        <span style="color: #333333">}</span>  <span style="color: #008800; font-weight: bold">while</span> <span style="color: #333333">(</span>i <span style="color: #333333">&lt;=</span> <span style="color: #0000DD; font-weight: bold">4</span><span style="color: #333333">);</span>
    <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>

<p><a id="intro" name="section4"></a></p>

<h1>Utilisation des structures d'itération</h1>

<p>Les structures (ou boucles) d'itération sont utiles à plusieurs fins : analyser une suite de données, vérifier l'état d'un capteur, trouver une donnée dans une structure, etc. Il est possible d'imbriquer des boucles (et des structures de contrôle), mais attention à la complexité algorithmique (ex. le temps de calcul), l'espace mémoire généré, etc. Par exemple, supposons que nous voulons dénombrer la quantité d'un nombre entier donné (supposons 4) dans un tableau. Il sera nécessaire de faire une passe complète sur le tableau, donc de lire N données pour tableau d'une longueur de N. Ce qui correspond à une complexité algorithmique de O(N):</p>
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">TrouverEntier</span> <span style="color: #333333">{</span>
    
        <span style="color: #008800; font-weight: bold">final</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">int</span> NOMBRE_A_TROUVER <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">4</span><span style="color: #333333">;</span>
    
        <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
            
            <span style="color: #333399; font-weight: bold">int</span> nombre <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
            <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> tableau <span style="color: #333333">=</span> <span style="color: #333333">{</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">3</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">6</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">4</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">6</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">8</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">};</span>
            
            <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> tableau<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
                
                <span style="color: #008800; font-weight: bold">if</span><span style="color: #333333">(</span>NOMBRE_A_TROUVER <span style="color: #333333">==</span> tableau<span style="color: #333333">[</span>i<span style="color: #333333">])</span> <span style="color: #333333">{</span>
                    nombre<span style="color: #333333">++;</span>
                <span style="color: #333333">}</span>
                
            <span style="color: #333333">}</span>
            
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Nombre :&quot;</span> <span style="color: #333333">+</span> nombre<span style="color: #333333">);</span>
            
        <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>

<p>Maintenant, supposons que nous voulons faire la même chose, mais pour chacune des valeurs du tableau. La complexité algorithme devient quadratique, i.e. O(N^2), car nous devons maintenant pour N données, faire N passe dans le tableau. Pour un tableau de 10 données, il s'agit de 100 itérations totales, mais pour un tableau de 1000 données, il s'agit de 1 million d'itérations! : </p>

<iframe height="800px" width="100%" src="https://repl.it/@lemire/ex3?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>
<!--<div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">TrouverEntier</span> <span style="color: #333333">{</span>  
    
        <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
            
            <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> nombres <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">];</span>
            <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> tableau <span style="color: #333333">=</span> <span style="color: #333333">{</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">3</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">6</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">4</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">6</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">8</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">};</span>
                  
            <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> tableau<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
                
                <span style="color: #888888">// Itération dans le tableau pour compter les nombres égaux.</span>
                <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> j <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> j <span style="color: #333333">&lt;</span> tableau<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> j<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
                    
                    <span style="color: #008800; font-weight: bold">if</span><span style="color: #333333">(</span>i <span style="color: #333333">!=</span> j <span style="color: #333333">&amp;&amp;</span> tableau<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">==</span> tableau<span style="color: #333333">[</span>j<span style="color: #333333">])</span> <span style="color: #333333">{</span>
                        nombres<span style="color: #333333">[</span>i<span style="color: #333333">]++;</span>
                    <span style="color: #333333">}</span>
                <span style="color: #333333">}</span>
                
                <span style="color: #888888">// Pour ajouter le nombre courant.</span>
                nombres<span style="color: #333333">[</span>i<span style="color: #333333">]++;</span>
                
            <span style="color: #333333">}</span>
            
            <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> tableau<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
                System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Entier : &quot;</span> <span style="color: #333333">+</span> tableau<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">+</span> <span style="background-color: #fff0f0">&quot; quantité : &quot;</span> <span style="color: #333333">+</span> nombres<span style="color: #333333">[</span>i<span style="color: #333333">]);</span>
            <span style="color: #333333">}</span>
            
        <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>-->

<h2>Lecture dans le livre de référence</h2>

<p>Pour aller plus en profondeur sur les structures d'itération (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy le chapitre 5.</p>


<h2>Vidéo</h2>

<iframe width="560" height="315" src="https://www.youtube.com/embed/oHOXE9h3t_A" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>