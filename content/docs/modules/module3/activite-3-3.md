---
title: "Activité 3.3"
weight: 3
---

<h1><a id="top" name="top"></a>Module 3</h1><h2>Activité 3.3</h2><h2 class="partie2">Les structures de données de base</h2>

<p class="sommaire">Sommaire</p>
<ul>

<li><a href="#section1">Les tableaux et matrices</a></li>

<li><a href="#section2">Les ArrayLists</a></li>

<li><a href="#section3">Autres structures de données</a></li>

</ul>

<p><a id="intro" name="section1"></a></p>

<h1>Les tableaux et matrices</h1>

<p>Jusqu'à présent, lorsque nous avons créé une variable, elle ne contenait qu'une seule donnée qui pouvait être une donnée primitive ou une référence vers un objet. En effet, dans la programmation orientée objet, certaines structures ont un nombre fixe d'objets : il s'agit des tableaux. Il en existe deux types : les tableaux à une dimension et les matrices à deux ou trois dimensions.</p>
<p>Les tableaux (array en anglais) sont très courants en programmation, car ils permettent d'organiser les données. À partir du moment où nous devons concevoir un programme devant manipuler un grand nombre de données, il devient intéressant pour nous de les rassembler dans des tableaux. Par exemple, pour un programme chargé d'organiser les nom et prénom des étudiants d'un cours, il ne serait pas efficace de déclarer une variable de type String pour chaque étudiant, car cela serait trop long. Par contre, les tableaux pourront nous aider à accélérer ce travail.</p>
<h2>Indices</h2>
<p>Un tableau est donc une liste de valeurs. Chacune d'entre elles est stockée dans le tableau à une position bien précise, appelée indice. Le tableau ci-dessous, nommé salaires, contient des nombres entiers. En Java, la première position dans le tableau est celle de l'indice 0. Le tableau des salaires possède 11 valeurs dont les indices vont de 0 à 10.</p>
 <table border="1" cellspacing="0" cellpadding="0"> 
    <tbody> 
      <tr> 
        <td width="37"> 
          <p style="text-align: center;">12</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">74</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">88</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">22</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">8</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">78</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">28</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">44</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">47</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">78</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">81</p> 
        </td> 
        <td width="60"><br /></td> 
        <td width="60"> 
          <p style="text-align: center;">Valeurs</p> 
        </td> 
      </tr> 
      <tr> 
        <td width="37"> 
          <p style="text-align: center;">0</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">1</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">2</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">3</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">4</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">5</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">6</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">7</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">8</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">9</p> 
        </td> 
        <td width="37"> 
          <p style="text-align: center;">10</p> 
        </td> 
        <td width="60"><br /></td> 
        <td width="60"> 
          <p style="text-align: center;">Indices</p> 
        </td> 
      </tr> 
    </tbody> 
  </table> 

<p>Pour accéder à une valeur du tableau, nous utilisons le nom du tableau suivi de l'indice entre crochets. Par exemple, pour accéder au cinquième salaire du tableau, il suffit d'écrire : salaire [4]. La valeur sera donc 8. L'expression salaire [4] a donc comme valeur 8. L'indice d'un tableau est un simple entier, il est donc possible d'utiliser des variables ou constantes entre crochets comme dans l'exemple ci-dessous :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #888888">// Tableau avec une pré-déclaration</span>
<span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> salaire <span style="color: #333333">=</span> <span style="color: #333333">{</span><span style="color: #0000DD; font-weight: bold">12</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">74</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">88</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">22</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">8</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">78</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">28</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">44</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">47</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">78</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">81</span><span style="color: #333333">};</span>

System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span>salaire<span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">4</span><span style="color: #333333">]);</span>
</pre></div>

<h2>Déclarer et utiliser les tableaux</h2>

<p>En Java, les tableaux sont des objets; donc, pour créer un nouveau tableau, il faudra utiliser l'opérateur new. La ligne de code suivante permet de créer un tableau de salaire horaire des 10 employés d'une entreprise.</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> salaire <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">];</span>
</pre></div>

<p>Cela signifie simplement que nous déclarons une variable dont le nom est salaire, dont le type est int[] (tableau d'entiers de type primitif int). Dans le cas de tableaux  contenant des nombres en utilisant des types de base (int, float, etc.), le contenu du tableau est initialisé avec des valeurs équivalent au zéro. Nous assignons ensuite un nouvel objet à cette variable. L'objet est un tableau de 10 entiers (int [10]). 
Il est donc à remarquer qu'un tableau contient plusieurs valeurs qui doivent toutes avoir le même type. Nous ne pourrions pas créer un tableau qui contiendrait des int et des double par exemple. De plus, la taille du tableau étant décidé et fixée lors de la déclaration, elle ne pourra pas changer. Nous avons par conséquent un tableau statique (rien à voir avec les classes statiques ou le mot réservé static).</p>

<iframe height="800px" width="100%" src="https://repl.it/@lemire/ex4?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>
<!-- <div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">AfficheTableau</span> <span style="color: #333333">{</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>

        <span style="color: #008800; font-weight: bold">final</span> <span style="color: #333399; font-weight: bold">int</span> MAX <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">;</span>

        <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> list <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[</span>MAX<span style="color: #333333">];</span>

        <span style="color: #888888">// Remplit le tableau</span>
        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> MAX<span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            list<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">=</span> i <span style="color: #333333">*</span> <span style="color: #0000DD; font-weight: bold">20</span><span style="color: #333333">;</span>
        <span style="color: #333333">}</span>

        <span style="color: #888888">// On change la quatrième valeur</span>
        list<span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">3</span><span style="color: #333333">]</span> <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">777</span><span style="color: #333333">;</span>

        <span style="color: #888888">// On affiche le contenu du tableau</span>
        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> MAX<span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">print</span><span style="color: #333333">(</span>list<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">+</span> <span style="background-color: #fff0f0">&quot; &quot;</span><span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
    <span style="color: #333333">}</span>

<span style="color: #333333">}</span>
</pre></div>-->

<p>Le résultat de l'exécution donnera ceci :</p> 
<pre><strong>0 20 40 777 80 100 120 140 160 180 </strong></pre>

<p>Cet exemple montre également une bonne utilisation des constantes. En effet, si nous voulons un tableau de taille 15, il n'y a qu'une ligne de code à changer, à savoir la valeur de la constante MAX. Les crochets utilisés pour accéder à un élément d'un tableau sont un opérateur Java comme + ou =. Cet opérateur a la plus haute priorité et sera donc exécuté en premier. 
L'opérateur d'indexation de tableau ([]) vérifie automatiquement si l'indice est correct, c'est-à-dire s'il est positif et est plus petit que la taille du tableau - 1. Si tel n'est pas le cas, il se produira une erreur d'exécution.</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> tableau <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">];</span>
tableau <span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">]</span> <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
tableau <span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">]</span> <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">;</span>
System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span> <span style="color: #333333">(</span>tableau <span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">]);</span>
<span style="color: #888888">//Appel dans un index hors du tableau</span>
System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span> <span style="color: #333333">(</span>tableau <span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">]);</span>
</pre></div>

<p>Erreur d'indice <br />L'exécution de ce code produira la sortie suivante à la console :</p> 
  <p><em>java.lang.ArrayIndexOutOfBoundsException: 2 at Test.main(Test.java:18)</em> <br /><em>Exception in thread &quot;main&quot;</em></p> 
  <p><br />Étant donné que le premier indice est de 0, il arrive souvent des erreurs d'indice trop élevé d'une position. Le programmeur doit donc être vigilant et s'assurer que les indices restent dans les limites du tableau. <br />La taille d'un tableau est régie par une variable d'instance de l'objet tableau appelée <em>length</em>. Donc, pour connaître la taille d'un tableau, il suffit de consulter le contenu de cette variable à l'aide de l'opérateur d'accès point.</p> 

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> tableau <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">5</span><span style="color: #333333">];</span>
System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span> <span style="color: #333333">(</span>tableau<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">);</span> <span style="color: #888888">// Affiche 5 à la console</span>
</pre></div>

<h2>Instanciation d'un tableau</h2>

<p>Nous pouvons instancier autrement un tableau. Il suffit de donner directement les valeurs qu'il contient. Nous affecterons une <em>liste d'initialisation</em> ou <em>initialisateur</em> au tableau. Les éléments du tableau sont repris entre des accolades et séparés par des virgules. Par exemple, pour créer le tableau ci-dessous, nous pourrions écrire :</p> 
 <!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><table><tr><td><pre style="margin: 0; line-height: 125%">1</pre></td><td><pre style="margin: 0; line-height: 125%">        <span style="color: #000080; font-weight: bold">int</span>[] tableau = {<span style="color: #0000FF">20</span>, <span style="color: #0000FF">17</span>, <span style="color: #0000FF">21</span>, <span style="color: #0000FF">19</span>, <span style="color: #0000FF">18</span>, <span style="color: #0000FF">20</span>};
</pre></td></tr></table></div>

  <p>Initialisateur <br />Nous ne pouvons utiliser une liste d'initialisation que pour la première déclaration. De plus, il faut impérativement la combiner avec la déclaration de la variable. Il est impossible de le faire en deux étapes. Par exemple, le code ci-dessous produit une erreur de compilation.</p> 
  <!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><table><tr><td><pre style="margin: 0; line-height: 125%">1
2</pre></td><td><pre style="margin: 0; line-height: 125%">        <span style="color: #000080; font-weight: bold">int</span>[] tab = <span style="color: #000080; font-weight: bold">new</span> <span style="color: #000080; font-weight: bold">int</span>[<span style="color: #0000FF">3</span>];
        tab = {<span style="color: #0000FF">1</span>, <span style="color: #0000FF">2</span>, <span style="color: #0000FF">3</span>};
</pre></td></tr></table></div>

  <p>Initialisateur : erreur de compilation </p> 
<pre>java.lang.Error: Unresolved compilation problem: </pre> 
<pre>        Array constants can only be used in initializers 
</pre> 

<h2>Passer des tableaux en paramètre</h2>
<p>Nous pouvons passer un tableau complet en paramètre à une méthode, car les tableaux ne sont rien d'autre que des objets. Il ne faut donc pas oublier que ce qui sera donné à la méthode n'est pas le tableau, ni une copie de celui-ci mais bien une copie de la référence vers le tableau. 
Nous pouvons bien entendu passer en paramètre un seul élément d'un tableau. S'il s'agit d'une donnée primitive, une copie de celle-ci sera passée en paramètre. S'il s'agit d'un objet, une copie de la référence sera passée en paramètre. 
La méthode ci-dessous déplace tous les éléments du tableau d'une position vers la droite.</p>
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">AfficheDeplacer</span> <span style="color: #333333">{</span>
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> tableau <span style="color: #333333">=</span> <span style="color: #333333">{</span><span style="color: #0000DD; font-weight: bold">11</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">22</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">33</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">44</span><span style="color: #333333">};</span>

        print<span style="color: #333333">(</span>tableau<span style="color: #333333">);</span>
        deplacerADroite<span style="color: #333333">(</span>tableau<span style="color: #333333">);</span>
        print<span style="color: #333333">(</span>tableau<span style="color: #333333">);</span>
    <span style="color: #333333">}</span>

    <span style="color: #008800; font-weight: bold">private</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">deplacerADroite</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> tableau<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #333399; font-weight: bold">int</span> last <span style="color: #333333">=</span> tableau<span style="color: #333333">[</span>tableau<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">-</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">];</span>

        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> tableau<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">-</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">;</span> i <span style="color: #333333">&gt;</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i<span style="color: #333333">--)</span> <span style="color: #333333">{</span>
            tableau<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">=</span> tableau<span style="color: #333333">[</span>i <span style="color: #333333">-</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">];</span>
        <span style="color: #333333">}</span>

        tableau<span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">]</span> <span style="color: #333333">=</span> last<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>

    <span style="color: #008800; font-weight: bold">private</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">print</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> tableau<span style="color: #333333">)</span> <span style="color: #333333">{</span>

        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> tableau<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">print</span><span style="color: #333333">(</span>tableau<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">+</span> <span style="background-color: #fff0f0">&quot; &quot;</span><span style="color: #333333">);</span>
        <span style="color: #333333">}</span>

        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">();</span>
    <span style="color: #333333">}</span>

<span style="color: #333333">}</span>
</pre></div>
<h2>Tableaux d'objets</h2>

<p>Dans tous les exemples que nous avons vus jusqu'à présent, les tableaux contenaient uniquement des types primitifs. Dans la dernière partie de la section précédente, nous avons vu des tableaux qui pouvaient contenir des objets, ou plus précisément des références vers des objets. 
Il est possible de stocker des objets dans un tableau. La ligne de code suivant crée un tableau de 20 objets de type String.</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%">String<span style="color: #333333">[]</span> phrases <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> String<span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">20</span><span style="color: #333333">];</span>
</pre></div>

<h2>Quelques techniques utiles</h2>

<p>Nous sommes maintenant davantage en mesure de comprendre la signature de la méthode main. Nous voyons en paramètre un tableau de String. En réalité, lorsque nous lançons un programme Java, nous savons déjà que la méthode main sera automatiquement appelée, mais qu'il est possible de lui passer des paramètres. En fait, nous pouvons lui passer un tableau de String.

Nous donnons en fait à la méthode main une chaîne de caractères qui sera découpée en morceaux délimités par des espaces. Il est ensuite possible d'utiliser ces paramètres dans la méthode, comme l'illustre le programme suivant :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">if</span> <span style="color: #333333">(</span>args<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">!=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span>args<span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">]);</span>
        <span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">else</span> <span style="color: #333333">{</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">();</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Aucun argument sur la ligne de commande&quot;</span><span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>

<h3>Trier un ensemble de données</h3>

<p>L'atout principal de l'ordinateur est sa capacité de traiter très rapidement une immense quantité de données (par exemple, la recherche d'éléments dans un ensemble selon des contraintes choisies par l'utilisateur ou encore le tri d'éléments en fonction d'un critère déterminé). 
Le tri d'informations fait partie des nombreuses applications en informatique. Il y a n! (factoriel n) façons d'ordonner une collection de n éléments. Les données triées permettent une recherche d'informations plus efficace. Le choix d'un algorithme de tri est par conséquent un critère plus pertinent que la vitesse intrinsèque de l'ordinateur.</p>

<p>Un tri simple de données consiste à rechercher la valeur minimale d'un tableau ou sa valeur maximale. Grâce à un algorithme de recherche, nous assignons la valeur minimale à la première valeur, puis parcourons l'ensemble des valeurs pour tester si l'une d'entre elles est plus petite que la valeur minimale. Si tel est le cas, la valeur minimale est assignée à cette valeur, sinon, le tri se poursuit. </p>

<p>Réalisation de l'algorithme « recherche du minimum » en Java :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">int</span> <span style="color: #0066BB; font-weight: bold">minimum</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> a<span style="color: #333333">[])</span> <span style="color: #333333">{</span>
        <span style="color: #333399; font-weight: bold">int</span> min <span style="color: #333333">=</span> a<span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">];</span>
        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> a<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            <span style="color: #008800; font-weight: bold">if</span> <span style="color: #333333">(</span>a<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">&lt;</span> min<span style="color: #333333">)</span> <span style="color: #333333">{</span>
                min <span style="color: #333333">=</span> a<span style="color: #333333">[</span>i<span style="color: #333333">];</span>
            <span style="color: #333333">}</span>
        <span style="color: #333333">}</span>
        <span style="color: #008800; font-weight: bold">return</span> min<span style="color: #333333">;</span>
<span style="color: #333333">}</span>
</pre></div>

<p>La recherche de la valeur maximale est très similaire : il suffit de changer le critère de comparaison.
La réalisation sous la forme d'une méthode Java est, par conséquent, aussi similaire :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">int</span> <span style="color: #0066BB; font-weight: bold">maximum</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> a<span style="color: #333333">[])</span> <span style="color: #333333">{</span>
        <span style="color: #333399; font-weight: bold">int</span> max <span style="color: #333333">=</span> a<span style="color: #333333">[</span><span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">];</span>
        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> a<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            <span style="color: #008800; font-weight: bold">if</span> <span style="color: #333333">(</span>a<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">&gt;</span> max<span style="color: #333333">)</span>
                max <span style="color: #333333">=</span> a<span style="color: #333333">[</span>i<span style="color: #333333">];</span>
        <span style="color: #333333">}</span>
        <span style="color: #008800; font-weight: bold">return</span> max<span style="color: #333333">;</span>
 <span style="color: #333333">}</span>
</pre></div>
<h2>Différents algorithmes de tri</h2>
<p>Les types de tri possibles sont les suivants :</p> 
  <ol type="1"> 
    <li>le <em>tri bulles (bubble sort);</em> </li> 
    <li>le <em>tri par sélection (selection sort);</em> </li> 
    <li>le <em>tri rapide (quicksort).</em> </li> 
  </ol> 
  <p><em>Des démonstrations de ces tris sont disponibles à l'adresse :</em></p> 
  <p><em><strong><a href="http://download.oracle.com/javase/tutorial/collections/algorithms/index.html">http://download.oracle.com/javase/tutorial/collections/algorithms/index.html</a></strong></em> (en anglais)</p></p>


<p>On peut trier un tableau facilement avec la méthode « sort » de la classe java.util.Arrays. <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html">La classe Arrays comprend plusieurs autres fonctions utiles</a>.</p>

<h2>Les tableaux à plusieurs dimensions (Matrices)</h2>

<p>Les tableaux que nous avons utilisés jusqu'à présent sont des tableaux à une seule dimension. Il suffit&nbsp;d'un seul indice pour&nbsp;identifier un&nbsp;élément de ces types de tableaux. Ce sont&nbsp;donc de simples listes de valeurs.</p> 
  <h2>Tableau à deux dimensions</h2> 
  <p>Un tableau à deux dimensions est&nbsp;un tableau avec des lignes et des colonnes. Contrairement à un tableau à une dimension, il faut&nbsp;utiliser deux indices pour accéder aux éléments des tableaux à deux dimensions. Le premier indice représente la ligne et le second, la colonne. La figure ci-dessous, &nbsp;nommée Tableau à deux dimensions, représente un tableau à deux dimensions.</p> 
  <p style="text-align: left;">&nbsp;Tableau 1. Tableau à deux dimensions</p> 
  <p> </p> 
  <table dir="ltr" border="1" cellspacing="2" bordercolor="#000000" cellpadding="7" width="538"> 
    <tbody> 
      <tr> 
        <td bgcolor="#ffffff" height="18" width="19%"> </td>
        <td bgcolor="#ffffff" height="18" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">Colonne 0</p></font></font></td> 
        <td bgcolor="#ffffff" height="18" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">Colonne 1</p></font></font></td> 
        <td bgcolor="#ffffff" height="18" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">Colonne 2</p></font></font></td> 
        <td bgcolor="#ffffff" height="18" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">Colonne 3</p></font></font></td> 
      </tr> 
      <tr> 
        <td bgcolor="#ffffff" width="19%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p style="text-align: center;">Ligne 0</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">11</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">12</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">12</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">4</p></font></font></td> 
      </tr> 
      <tr> 
        <td bgcolor="#ffffff" width="19%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p style="text-align: center;">Ligne 1</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">87</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">45</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">32</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">6</p></font></font></td> 
      </tr> 
      <tr> 
        <td bgcolor="#ffffff" width="19%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p style="text-align: center;">Ligne 2</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">64</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">56</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">22</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%" style="text-align: center;">55</td> 
      </tr> 
      <tr> 
        <td bgcolor="#ffffff" width="19%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p style="text-align: center;">Ligne 3</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">37</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">32</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">91</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">33</p></font></font></td> 
      </tr> 
      <tr> 
        <td bgcolor="#ffffff" width="19%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p style="text-align: center;">Ligne 4</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center" style="text-align: center;">93</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">35</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">54</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">43</p></font></font></td> 
      </tr> 
    </tbody> 
  </table> 
  <p> </p> 
  <p align="left"><br /></p> 
  <p>Pour avoir accès à un élément du tableau 1, il faut écrire tableau_1[Ligne][Colonne]. Ainsi :</p> 
  <p>tableau_1[Ligne 0][Colonne 0] = 11</p> 
  <p>tableau_1[Ligne 4][Colonne 2] = 54</p> 
  <p>tableau_1[Ligne 2][Colonne 1] = 56</p> 
  <p>....</p> 
  <h2>Création de&nbsp;tableaux à&nbsp;deux dimensions</h2> 
  <p>Pour&nbsp;déclarer un tableau à deux dimensions, il faut simplement écrire :</p> 
  <p><em>typededonnées NonDuTableau&nbsp;[nombreDeLignes][nombreDeColonne]</em></p> 
  <p>Plus concrètement, nous pouvons déclarer un tableau à deux dimensions pour inscrire des achats du mois&nbsp;en faisant :</p> 
  <!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><table><tr><td><pre style="margin: 0; line-height: 125%">1</pre></td><td><pre style="margin: 0; line-height: 125%"><span style="color: #000080; font-weight: bold">double</span> achats [][]; <span style="color: #008800; font-style: italic">//achats est ici un tableau à deux dimensions de type double des achats.</span>
</pre></td></tr></table></div>

  <p>Une fois que le tableau est déclaré, il faut le créer en utilisant le mot clé <em>new.</em></p> 
  <p>Ainsi, pour&nbsp;créer les achats des quatre semaines du mois de juillet des cinq dernières années, nous allons faire :</p> 
 <!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><table><tr><td><pre style="margin: 0; line-height: 125%">1</pre></td><td><pre style="margin: 0; line-height: 125%">achats = <span style="color: #000080; font-weight: bold">new</span> <span style="color: #000080; font-weight: bold">double</span> [<span style="color: #0000FF">5</span>][<span style="color: #0000FF">4</span>];
</pre></td></tr></table></div>
 
  <p>La première dimension spécifie que le&nbsp;tableau contient cinq éléments et représente les cinq lignes achats. &nbsp;La seconde dimension spécifie que chacun de ces&nbsp;cinq éléments est formé d'un tableau de type double de quatre éléments qui représente les colonnes d'achats.</p> 
  <p> </p> 
  <table dir="ltr" border="1" cellspacing="2" bordercolor="#000000" cellpadding="7" width="538"> 
    <tbody> 
      <tr> 
        <td bgcolor="#ffffff" height="18" width="19%"> </td>
        <td bgcolor="#ffffff" height="18" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">semaine 1</p></font></font></td> 
        <td bgcolor="#ffffff" height="18" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">semaine 2</p></font></font></td> 
        <td bgcolor="#ffffff" height="18" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">semaine 3</p></font></font></td> 
        <td bgcolor="#ffffff" height="18" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">semaine 4</p></font></font></td> 
      </tr> 
      <tr> 
        <td bgcolor="#ffffff" width="19%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p>2010</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">11</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">123</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">455</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">4</p></font></font></td> 
      </tr> 
      <tr> 
        <td bgcolor="#ffffff" width="19%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p>2009</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">87</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">45</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">32</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">6</p></font></font></td> 
      </tr> 
      <tr> 
        <td bgcolor="#ffffff" width="19%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p>2008</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">64</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">56</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">22</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"> 
          <p align="center">55</p> 
        </td> 
      </tr> 
      <tr> 
        <td bgcolor="#ffffff" width="19%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p>2007</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">37</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">32</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">91</p></font></font></td> 
        <td width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">33</p></font></font></td> 
      </tr> 
      <tr> 
        <td bgcolor="#ffffff" width="19%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p>2006</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">93</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">35</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">54</p></font></font></td> 
        <td bgcolor="#c0c0c0" width="20%"><font size="3" face="Calibri"><font size="3" face="Calibri"> 
              <p align="center">43</p></font></font></td> 
      </tr> 
    </tbody> 
  </table> 
  <p> </p> 
  <p><strong><u>Achats</u></strong></p> 
  <p>Il faut noter ici que rien ne nous empêche de déclarer et de créer en même temps un tableau. Pour cela, il faut simplement faire :</p> 
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><table><tr><td><pre style="margin: 0; line-height: 125%">1</pre></td><td><pre style="margin: 0; line-height: 125%">typeDeTableau [][] nomDuTableau = <span style="color: #000080; font-weight: bold">new</span> typeDeTableau [nombreDeLigne][nombreDeColonne];
</pre></td></tr></table></div>

  <p>Ainsi dans le&nbsp;cas de Achats, nous pouvons écrire :</p> 
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><table><tr><td><pre style="margin: 0; line-height: 125%">1</pre></td><td><pre style="margin: 0; line-height: 125%"><span style="color: #000080; font-weight: bold">double</span>[][] Achats = <span style="color: #000080; font-weight: bold">new</span> <span style="color: #000080; font-weight: bold">double</span> [<span style="color: #0000FF">5</span>][<span style="color: #0000FF">4</span>];<span style="color: #a61717; background-color: #e3d2d2"></span>
</pre></td></tr></table></div>

  <p>Ainsi <em>Achats</em> est déclaré et créé simultanément.</p> 
  <h2>Manipulation d'un tableau à 2 dimensions</h2> 
  <p>Pour accéder à un élément du tableau <em>Achats</em>, il faut écrire, par exemple&nbsp;:</p> 
  <p>Achats [0][0] = 11 pour l'élément à la ligne 0 colonne 0. Il est cependant important de noter que si nous avons des milliers d'éléments, cette façon de faire ne sera pas commode. Ainsi, avec deux boucles <em>for </em>imbriquées, nous pouvons accéder plus facilement aux éléments de Achats. La portion de&nbsp;programme suivant le montre facilement :</p> 
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><table><tr><td><pre style="margin: 0; line-height: 125%">1
2
3
4
5
6
7</pre></td><td><pre style="margin: 0; line-height: 125%">       <span style="color: #000080; font-weight: bold">int</span> annees = <span style="color: #0000FF">2010</span>; <span style="color: #008800; font-style: italic">// initialisation de l&#39;année selon l&#39;indice 0 du tableau Achats</span>
      
        <span style="color: #000080; font-weight: bold">for</span> (<span style="color: #000080; font-weight: bold">int</span> i = <span style="color: #0000FF">0</span>; i &lt; <span style="color: #0000FF">5</span>; i++) {
            <span style="color: #000080; font-weight: bold">for</span> (<span style="color: #000080; font-weight: bold">int</span> j = <span style="color: #0000FF">0</span>; j &lt; <span style="color: #0000FF">4</span>; j++) {
                System.<span style="color: #FF0000">out</span>.<span style="color: #FF0000">println</span>(<span style="color: #0000FF">&quot;Achats [&quot;</span> + i + <span style="color: #0000FF">&quot;][&quot;</span> + j + <span style="color: #0000FF">&quot;] =&quot;</span> + achats[i][j]);
            }
        }
</pre></td></tr></table></div>

  <p>Pour initialiser un&nbsp;tableau à deux dimensions, nous pouvons simplement&nbsp;écrire :</p> 
 <!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><table><tr><td><pre style="margin: 0; line-height: 125%">1</pre></td><td><pre style="margin: 0; line-height: 125%">typeDeTableau nomDuTableau [][] =<span style="color: #a61717; background-color: #e3d2d2"> </span>{ { }, {}, {}, etc...};
</pre></td></tr></table></div>

  <p>Ainsi, pour un tableau composé des noms des étudiants et des cours qu'ils suivent peut être défini de la manière suivante :</p> 
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><table><tr><td><pre style="margin: 0; line-height: 125%">1</pre></td><td><pre style="margin: 0; line-height: 125%">String<span style="color: #a61717; background-color: #e3d2d2"> </span>etudiants[][] =<span style="color: #a61717; background-color: #e3d2d2"> </span>{ {<span style="color: #0000FF">&quot;nom&quot;</span>, <span style="color: #0000FF">&quot;cours&quot;</span>}, {<span style="color: #0000FF">&quot;nom&quot;</span>, <span style="color: #0000FF">&quot;cours&quot;</span>}, {<span style="color: #0000FF">&quot;nom&quot;</span>, <span style="color: #0000FF">&quot;cours&quot;</span>}, {<span style="color: #0000FF">&quot;nom&quot;</span>, <span style="color: #0000FF">&quot;cours&quot;</span>}<span style="color: #a61717; background-color: #e3d2d2"> </span>etc...};
</pre></td></tr></table></div>

  <h2>Tableaux multidimensionnels</h2> 
  <p>Java ne se limite pas seulement aux tableaux à deux dimensions. Nous pouvons aussi déclarer des tableaux à plus de deux dimensions. Pour déclarer un tableau à trois dimensions, par exemple, il suffit de faire : </p> 
  <!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><table><tr><td><pre style="margin: 0; line-height: 125%">1</pre></td><td><pre style="margin: 0; line-height: 125%">typedetableau [][][] nomdutableau = <span style="color: #000080; font-weight: bold">new</span> [taille][taille][taille];
</pre></td></tr></table></div>

  <p>Plus concrètement, nous pouvons déclarer un tableau d'entiers comme :<br /></p> 
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><table><tr><td><pre style="margin: 0; line-height: 125%">1</pre></td><td><pre style="margin: 0; line-height: 125%"><span style="color: #000080; font-weight: bold">int</span> tableauEntier [][][] = <span style="color: #000080; font-weight: bold">new</span> <span style="color: #000080; font-weight: bold">int</span> [<span style="color: #0000FF">5</span>][<span style="color: #0000FF">5</span>][<span style="color: #0000FF">5</span>];
</pre></td></tr></table></div>

  <p>Nous venons ainsi de créer un tableau d'entiers à trois dimensions. Pour initialiser un tel tableau, nous&nbsp;pouvons utiliser&nbsp;trois&nbsp;boucles <em>for</em>. À titre d'exemples, initialisons tous les éléments&nbsp;du tableau <em>tableauentier à 1 :</em></p> 
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><table><tr><td><pre style="margin: 0; line-height: 125%">1
2
3
4
5
6
7</pre></td><td><pre style="margin: 0; line-height: 125%">        <span style="color: #000080; font-weight: bold">for</span> (<span style="color: #000080; font-weight: bold">int</span> i = <span style="color: #0000FF">0</span>; i &lt; <span style="color: #0000FF">5</span>; i++) {
            <span style="color: #000080; font-weight: bold">for</span> (<span style="color: #000080; font-weight: bold">int</span> j = <span style="color: #0000FF">0</span>; j &lt; <span style="color: #0000FF">5</span>; j++) {
                <span style="color: #000080; font-weight: bold">for</span> (<span style="color: #000080; font-weight: bold">int</span> k = <span style="color: #0000FF">0</span>; k &lt; <span style="color: #0000FF">5</span>; k++) {
                    tableauEntier[i][j][k] = <span style="color: #0000FF">1</span>;
                }
            }
        }
</pre></td></tr></table></div>

      </blockquote> 
    </blockquote> 
  </blockquote>

<p><a id="intro" name="section2"></a></p>
<h1>Les ArrayLists</h1>

<p>Une ArrayList est une structure de données de type "Collection", similaire à un tableau, mais avec une taille indéfinie. Bref, comme une liste d'items, sa taille change au fur et à mesure de l'ajout ou du retrait d'éléments et s'utilise à la façon d'un tableau grâce à la méthode get(i), où i est l'index du tableau. L'objet ArrayList possède un ensemble de méthodes permettant de manipuler les données (ex. get, remove, isEmpty, toArray). De plus, les ArrayList utilisent le système de template (à voir en détail un peu plus loin), qui permet de créer des ArrayList pour un type d'Objet en particulier, par exemple : "ArrayList&lt;String&gt;, ArrayList&lt;Double&gt;, ArrayList&lt;ArrayList&lt;Integer&gt;&gt;" (Oui c'est possible ... pour simuler une matrice par exemple),etc. Voici un exemple d'instanciation et d'utilisation d'une ArrayList.</p>

<iframe height="400px" width="100%" src="https://repl.it/@lemire/ArraysArraysArrays?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>

<p>Comme nous l'avions vu lors de la présentation de la structure d'itération while, il est possible d'itérer rapidement parmi les éléments d'une ArrayList. Pour ce faire, voici trois façons d'itérer parmi les éléments : </p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%">ArrayList<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;</span> list <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> ArrayList<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;();</span>                        
list<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Valeur1&quot;</span><span style="color: #333333">);</span>

<span style="color: #888888">//Avec le traditionnel for</span>
<span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> list<span style="color: #333333">.</span><span style="color: #0000CC">size</span><span style="color: #333333">();</span>i<span style="color: #333333">++){</span>
    System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span>list<span style="color: #333333">.</span><span style="color: #0000CC">get</span><span style="color: #333333">(</span>i<span style="color: #333333">));</span>
<span style="color: #333333">}</span>

<span style="color: #888888">//Avec le for est un raccourci du compilateur. La variable s sera chaque élément de la liste</span>
<span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span>String s <span style="color: #333333">:</span> list<span style="color: #333333">)</span> <span style="color: #333333">{</span>
    System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span>s<span style="color: #333333">);</span>
<span style="color: #333333">}</span>

<span style="color: #888888">//La méthode plus ancienne (Java 1.6) avec les itérateurs</span>
Iterator<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;</span> it <span style="color: #333333">=</span> list<span style="color: #333333">.</span><span style="color: #0000CC">iterator</span><span style="color: #333333">();</span>
<span style="color: #008800; font-weight: bold">while</span><span style="color: #333333">(</span>it<span style="color: #333333">.</span><span style="color: #0000CC">hasNext</span><span style="color: #333333">())</span> <span style="color: #333333">{</span>
    System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span>it<span style="color: #333333">.</span><span style="color: #0000CC">next</span><span style="color: #333333">());</span>
<span style="color: #333333">}</span>
</pre></div>

<p>En conclusion, les ArrayList sont des structures de données utiles. Vous verrez dans la suite du cours plusieurs utilisations des ArrayList.</p>

<p><a id="intro" name="section3"></a></p>
<h1>Autres structures de données</h1>

<p>Un algorithme est une «procédure systématique visant à résoudre un problème ou à atteindre une fin donnée, en particulier par un ordinateur».  La programmation de la solution d'un programme passe généralement par la conception (implicite ou explicite) d'un algorithme. Pour un problème comme celui du tri en ordre alphabétique d'une liste de termes, on peut recourir à plusieurs algorithmes différents. Certains algorithmes seront plus rapides, d'autres plus lents.</p>

<p>Comment alors comparer, dans l'absolu, les algorithmes entre eux? On pourrait, bien sûr, mettre en oeuvre différentes approches et comparer leur vitesse relative, une méthode parfaitement valable que l'on doit souvent adopter. Cependant, cette approche a ses limites sur le plan scientifique: on sait que différents programmeurs peuvent être plus ou moins astucieux ou expérimentés et adopter une approche plutôt qu'une autre. Il est tout simplement très difficile de comparer des algorithmes sur la base d'implémentations parce qu'elles peuvent varier en qualité.</p>

<p>On désire donc une approche mathématique qui nous dise, avec précision, si tel ou tel algorithme est plus lent ou plus rapide qu'un autre. En pratique, la vitesse, au sens strict du terme, n'est pas une quantité qu'on peut mesurer sans implémentation. Par contre, on peut compter le nombre d'opérations que fait un algorithme. Par exemple, l'algorithme suivant fait exactement <i>n</i> opérations:</p>

<code>
Pour chaque élément de l'ensemble {1,...,n}:
  afficher l'élément
</code>

<p>On associera donc cet algorithme avec la fonction f(n) = n, c'est-à-dire qu'on compte le nombre d'opérations effectuées en fonction de la taille de l'ensemble sur lequel on travaille. </p>

<p>Ce qui nous intéresse c'est le comportement de l'algorithme lorsque la taille de l'ensemble augmente; il faut alors se rappeler le principe selon lequel les algorithmes doivent surtout être rapides lorsque les ensembles de données sont importants. Par exemple, pour n petit, faire 5n opérations est plus lent que faire n<sup>2</sup> opérations, mais pour n grand, le contraire est vrai. En pratique, on va sans doute préférer l'algorithme qui ne fait que 5n opérations parce que pour n=100, on fait alors 500 opérations contre 10000 opérations pour l'algorithme menant au calcul de n<sup>2</sup> opérations.</p>

<p>La stratégie généralement employée est donc de comparer les algorithmes lorsque n est très grand et de ne retenir que celui qui fait le moins d'opérations.</p>

<p>Malheureusement, la taille de l'ensemble n'est pas le seul facteur qui détermine le nombre d'opérations que va effectuer un algorithme. Par exemple, si on demande de trier les valeurs dans un vaste tableau dont les valeurs ont déjà été ordonnées, un algorithme de tri pourra s'exécuter plus rapidement que si les données sont pêle-mêle. Mais pour simplifier les choses dans ce cours, nous choisirons toujours le pire cas possible. Soyons pessimistes!</p>

<p>On cherche maintenant à regrouper les algorithmes dans de grandes classes. Le principe de base est que n et 5n sont des classes similaires: faire 5 fois plus d'opérations, peu importe la taille de l'ensemble de données initial, importe beaucoup moins que la différence qu'il peut y avoir entre n et n<sup>2</sup>.</p>

<p>Soit f(n) le nombre d'opérations effectuées par un algorithme; on dit que le temps mis par l'algorithme est O(g(n)) (ou bien f(n) est dans O(g(n))) et cela, s'il existe deux nombres M et n0 tels que f(n) &lt; M g(n) pour n &gt; n0.</p>

<p>Si f(n)= 2n+5, on a f(n) est dans O(n). En effet, si on pose M=3 et n0=5, alors f(n)=2n+5 &lt; M n pour n &gt; n0.</p>


<p>Si f(n)= 2n+5, on a f(n) est dans O(n<sup>2</sup>). En effet, si on pose M=1 et n0=3, alors f(n)=2n+5 &lt;= M n<sup>2</sup> pour n>n0.</p>




<p>Les grandes classes importantes sont O(1),  O(log n), O(n), O(n log n) et O(n<sup>2</sup>).</p>


<p>Lecture complémentaire : la <a href="https://fr.wikipedia.org/wiki/Théorie_de_la_complexité_(informatique_théorique)">Théorie de la complexité</a>.</p>

<p>L'API standard du langage Java offre plusieurs autres types de structure de données. D'ailleurs, la plupart des langages OO ou autres langages modernes offrent également le même genre de structure de données : C++ avec la STL, API .net de C#, Python, etc. Voici quelques exemples de structures de données utiles en Java et des tutoriaux (sites externes en anglais) sur leur utilisation:</p>
<ul>
	<li>Stack (ou pile en français). Permet d'empiler des items du genre "dernier ajouté, premier enlevé" : <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html">https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html</a> et <a href="https://www.tutorialspoint.com/java/java_stack_class.htm">https://www.tutorialspoint.com/java/java_stack_class.htm</a></li>
	<li>HashMap. Permet de créer une structure de données liant une clé (key) à une valeur (value). Très utile pour la recherche d'information en temps constant O(1), donc pas besoin d'itérer dans toute une liste (O(N) si en désordre, sinon O(log n) si classé). Cette structure de données utilise des fonctions de <a href="https://fr.wikipedia.org/wiki/Fonction_de_hachage">hachage</a> pour convertir la clé en un index dans un tableau : <a href="https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html">https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html</a> et <a href="https://www.tutorialspoint.com/java/java_hashmap_class.htm">https://www.tutorialspoint.com/java/java_hashmap_class.htm</a></li>
</ul>

<h2>Lecture dans le livre de référence</h2>

<p>Pour aller plus en profondeur sur les structures de données(optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy les chapitres 7 et 22.</p>

<h2>Vidéos</h2>

<iframe width="560" height="315" src="https://www.youtube.com/embed/VdvUYGs17Ek" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/wvQQ5263pvI" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/EphmNLfZ2hM" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/ov3d4s5w_m0" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/eXYLsxQvIF4" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>