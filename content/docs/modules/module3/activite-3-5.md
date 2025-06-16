---
title: "Activité 3.5"
weight: 7
---

<h1><a id="top" name="top"></a>Module 3</h1><h2>Activité 3.5</h2><h2 class="partie2">La récursivité</h2>

<p class="sommaire">Sommaire</p>
<ul>

<li><a href="#section1">Le concept de récursivité</a></li>

<li><a href="#section2">Des exemples d'utilisation de la récursivité</a></li>

</ul>

<p><a id="intro" name="section1"></a></p>

<h1>Le concept de récursivité</h1>



<p>La récursivité est un concept de programmation qui remonte aux premières années des langages de programmation (avec LISP et Algol'60). Il s'agit de faire un appel à la méthode/fonction dans la propre portée d'une méthode. Donc d'appeler, par exemple, la méthode calcul à l'intérieur même de la fonction calcul. En quelque sorte, la récursivité peut permettre de remplacer ou imiter des algorithmes itératifs, en faisant un nombre fini d'itérations sur une portion de code. Voici un exemple de récursivité :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">ExempleRecursivite</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        <span style="color: #333399; font-weight: bold">int</span> nb <span style="color: #333333">=</span> fibonacci<span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">);</span>
        
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;nb=&quot;</span> <span style="color: #333333">+</span> nb<span style="color: #333333">);</span>
        
    <span style="color: #333333">}</span>
    
    <span style="color: #888888">/**</span>
<span style="color: #888888">     * Calcul de la suite de fibonnaci avec la récursivité</span>
<span style="color: #888888">     * </span>
<span style="color: #888888">     * @param n</span>
<span style="color: #888888">     * @return </span>
<span style="color: #888888">     */</span>
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">int</span> <span style="color: #0066BB; font-weight: bold">fibonacci</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> n<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        <span style="color: #888888">// Si n == 0 alors on arrête les appels récursifs et on remonte le résultat.</span>
        <span style="color: #008800; font-weight: bold">if</span><span style="color: #333333">(</span>n <span style="color: #333333">&lt;=</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
            <span style="color: #008800; font-weight: bold">return</span> n<span style="color: #333333">;</span>
        <span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">else</span> <span style="color: #333333">{</span>
            <span style="color: #888888">// Addition des deux nombres de la suite, en allant de façon décroissante.</span>
            <span style="color: #008800; font-weight: bold">return</span> <span style="color: #0066BB; font-weight: bold">fibonacci</span><span style="color: #333333">(</span>n <span style="color: #333333">-</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">)</span> <span style="color: #333333">+</span> fibonacci<span style="color: #333333">(</span>n <span style="color: #333333">-</span> <span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
        
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>


<p>Toutefois, la récursivité est à utiliser avec précaution, car elle peut facilement provoquer une erreur de type StackOverflow ou OutOfMemory. C'est à dire, que l'appel répétitif d'une méthode à l'intérieur de sa propre méthode provoquera la multiplication de structures en mémoire (ex. variables, information sur les appels de méthode en soi, structures de données, etc.) et l'utilisation complète de la mémoire dédiée à la JVM par le système d'exploitation de l'ordinateur. Il faut donc être prudent avec l'appel récursif. Voici deux mauvais exemples, qui provoque l'erreur de type StackOverflowError ou l'erreur de type OutOfMemoryError : </p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">ExempleRecursivite</span> <span style="color: #333333">{</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>

        <span style="color: #888888">// Provoque un OutOfMemoryError</span>
        <span style="color: #888888">//long nb = boom(10);</span>
        
        <span style="color: #888888">// Provoque un StackOverflowError</span>
        recursivePrint<span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">100</span><span style="color: #333333">);</span>

    <span style="color: #333333">}</span>

    <span style="color: #888888">/**</span>
<span style="color: #888888">     * L&#39;appel de cette méthode provoque un OutOfMemoryError</span>
<span style="color: #888888">     *</span>
<span style="color: #888888">     * @param n</span>
<span style="color: #888888">     * @return</span>
<span style="color: #888888">     */</span>
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">long</span> <span style="color: #0066BB; font-weight: bold">boom</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">long</span> n<span style="color: #333333">)</span> <span style="color: #333333">{</span>

        <span style="color: #333399; font-weight: bold">long</span> a <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">10</span> <span style="color: #333333">*</span> n<span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">long</span> b <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">10</span> <span style="color: #333333">*</span> n<span style="color: #333333">;</span>

        ArrayList<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;</span> list <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> ArrayList<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;();</span>

        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> n<span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            list<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Prendre de la mémoire&quot;</span><span style="color: #333333">);</span>
        <span style="color: #333333">}</span>

        <span style="color: #008800; font-weight: bold">return</span> <span style="color: #0066BB; font-weight: bold">boom</span><span style="color: #333333">(</span>a <span style="color: #333333">+</span> b <span style="color: #333333">+</span> n<span style="color: #333333">);</span>

    <span style="color: #333333">}</span>
    
    <span style="color: #888888">/**</span>
<span style="color: #888888">     * L&#39;appel de cette méthode provoque un StackOverflowError</span>
<span style="color: #888888">     * @param num </span>
<span style="color: #888888">     */</span>
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">recursivePrint</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> num<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Number: &quot;</span> <span style="color: #333333">+</span> num<span style="color: #333333">);</span>

        <span style="color: #008800; font-weight: bold">if</span> <span style="color: #333333">(</span>num <span style="color: #333333">==</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
            <span style="color: #008800; font-weight: bold">return</span><span style="color: #333333">;</span>
        <span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">else</span> <span style="color: #333333">{</span>
            recursivePrint<span style="color: #333333">(++</span>num<span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
    <span style="color: #333333">}</span>

<span style="color: #333333">}</span>
</pre></div>

<p><a id="intro" name="section2"></a></p>
<h1>Des exemples d'utilisation de la récursivité</h1>

<p>La récursivité peut être bien utile dans des cas où il faut appliquer la technique "diviser pour régner", surtout pour le traitement de données. Un exemple bien connu est le tri-fusion (merge sort) qui utilise la récursivité pour diviser un tableau en deux récursivement jusqu'à atteindre des couples. Puis, l'algorithme tri le couple min-max et retourne le résultat plus haut. Ensuite, une fusion des données s'opère pour trier un par un les minimum de chaque sous-tableau dans le tableau original. Voici le tri-fusion : </p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">ExempleRecursivite</span> <span style="color: #333333">{</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> tableau <span style="color: #333333">=</span> <span style="color: #333333">{</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">5</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">7</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">4</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">6</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">12</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">55</span><span style="color: #333333">};</span>
       
        triFusion<span style="color: #333333">(</span>tableau<span style="color: #333333">);</span>
        
        <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">:</span> tableau<span style="color: #333333">)</span> <span style="color: #333333">{</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">print</span><span style="color: #333333">(</span>i <span style="color: #333333">+</span> <span style="background-color: #fff0f0">&quot; &quot;</span><span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
    <span style="color: #333333">}</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">triFusion</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> data<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        <span style="color: #888888">// Si il n&#39;y a qu&#39;une donnée dans le tableau, alors on la retourne.</span>
        <span style="color: #008800; font-weight: bold">if</span> <span style="color: #333333">(</span>data<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">&lt;=</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
            <span style="color: #008800; font-weight: bold">return</span><span style="color: #333333">;</span>               
        <span style="color: #333333">}</span>
        
        <span style="color: #888888">// Diviser le tableau en deux tableau d&#39;une même longueur si possible</span>
        <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> a <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[</span>data<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">/</span> <span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">];</span>        
        <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> b <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[</span>data<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">-</span> a<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">];</span>
        
        <span style="color: #888888">//Copier les données dans les deux tableaux</span>
        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> data<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            <span style="color: #008800; font-weight: bold">if</span> <span style="color: #333333">(</span>i <span style="color: #333333">&lt;</span> a<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
                a<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">=</span> data<span style="color: #333333">[</span>i<span style="color: #333333">];</span>
            <span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">else</span> <span style="color: #333333">{</span>
                b<span style="color: #333333">[</span>i <span style="color: #333333">-</span> a<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">]</span> <span style="color: #333333">=</span> data<span style="color: #333333">[</span>i<span style="color: #333333">];</span>
            <span style="color: #333333">}</span>
        <span style="color: #333333">}</span>

        <span style="color: #888888">// Appel du tri sur les deux moitiés de tableau</span>
        triFusion<span style="color: #333333">(</span>a<span style="color: #333333">);</span>                              
        triFusion<span style="color: #333333">(</span>b<span style="color: #333333">);</span>                              

        <span style="color: #888888">// Les compteurs de ai et bi</span>
        <span style="color: #333399; font-weight: bold">int</span> ai <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>                                
        <span style="color: #333399; font-weight: bold">int</span> bi <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>                                
        
        <span style="color: #888888">// Fusionner les deux tableau. En itérant dans les deux moitiés de tableau et en classant alternativement le minimum de chaque moitié</span>
        <span style="color: #008800; font-weight: bold">while</span> <span style="color: #333333">(</span>ai <span style="color: #333333">+</span> bi <span style="color: #333333">&lt;</span> data<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>            
            <span style="color: #888888">// Si a[ai] est inférieur à b[bi] on place a[ai] dans le tableau original</span>
            <span style="color: #008800; font-weight: bold">if</span> <span style="color: #333333">(</span>bi <span style="color: #333333">&gt;=</span> b<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">||</span> <span style="color: #333333">(</span>ai <span style="color: #333333">&lt;</span> a<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">&amp;&amp;</span> a<span style="color: #333333">[</span>ai<span style="color: #333333">]</span> <span style="color: #333333">&lt;</span> b<span style="color: #333333">[</span>bi<span style="color: #333333">]))</span> <span style="color: #333333">{</span>
                data<span style="color: #333333">[</span>ai <span style="color: #333333">+</span> bi<span style="color: #333333">]</span> <span style="color: #333333">=</span> a<span style="color: #333333">[</span>ai<span style="color: #333333">];</span> 
                
                <span style="color: #888888">//incrémentation du compter ai</span>
                ai<span style="color: #333333">++;</span>
                
            <span style="color: #888888">// sinon c&#39;est b[bi]</span>
            <span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">else</span> <span style="color: #333333">{</span>
                data<span style="color: #333333">[</span>ai <span style="color: #333333">+</span> bi<span style="color: #333333">]</span> <span style="color: #333333">=</span> b<span style="color: #333333">[</span>bi<span style="color: #333333">];</span> 
                <span style="color: #888888">//incrémentation du compter bi</span>
                bi<span style="color: #333333">++;</span>
            <span style="color: #333333">}</span>
        <span style="color: #333333">}</span>
    <span style="color: #333333">}</span>

<span style="color: #333333">}</span>
</pre></div>

<br/>

<p>Voici un autre exemple, avec une façon d'utiliser la récursivité pour trouver le plus grand diviseur commun de deux entiers, basée sur l'<a href="https://fr.wikipedia.org/wiki/Algorithme_d%27Euclide">algorithme d'Euclide</a> :</p>

<!-- <div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">ExempleRecursivite</span> <span style="color: #333333">{</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
  
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Plus grand diviseur commun :&quot;</span> <span style="color: #333333">+</span> plusGrandCommunDiviseur<span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">455</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">322</span><span style="color: #333333">)</span> <span style="color: #333333">);</span>
      
    <span style="color: #333333">}</span>

    <span style="color: #888888">/**</span>
<span style="color: #888888">     * Fonction pour trouver le plus grand commun diviseur. Il s&#39;agit de l&#39;algorithme d&#39;Euclide</span>
<span style="color: #888888">     * @param p</span>
<span style="color: #888888">     * @param q</span>
<span style="color: #888888">     * @return </span>
<span style="color: #888888">     */</span>
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">int</span> <span style="color: #0066BB; font-weight: bold">plusGrandCommunDiviseur</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> p<span style="color: #333333">,</span> <span style="color: #333399; font-weight: bold">int</span> q<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #888888">// Si q est 0, il n&#39;y a pas de diviseur commun</span>
        <span style="color: #008800; font-weight: bold">if</span> <span style="color: #333333">(</span>q <span style="color: #333333">==</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
            <span style="color: #008800; font-weight: bold">return</span> p<span style="color: #333333">;</span>
            
        <span style="color: #888888">// Sinon, essayons avec le diviseur et le reste de la division de p et q (le modulo)</span>
        <span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">else</span> <span style="color: #333333">{</span>         
            <span style="color: #008800; font-weight: bold">return</span> <span style="color: #0066BB; font-weight: bold">plusGrandCommunDiviseur</span><span style="color: #333333">(</span>q<span style="color: #333333">,</span> p <span style="color: #333333">%</span> q<span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
    <span style="color: #333333">}</span>

<span style="color: #333333">}</span>
</pre></div>-->
<iframe height="800px" width="100%" src="https://repl.it/@lemire/ex6?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>

<h2>Lecture dans le livre de référence</h2>

<p>Pour aller plus en profondeur sur la récursivité (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 6:</p>
<ul>
	<li>Section 10 : La récursivité des méthodes</li>
</ul>

<h2>Vidéos</h2>

<iframe width="560" height="315" src="https://www.youtube.com/embed/o0sfEUuqy40" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/dfLPh1oWJNg" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

