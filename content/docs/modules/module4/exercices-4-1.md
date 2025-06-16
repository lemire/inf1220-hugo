---
title: "Exercices 4.1"
weight: 3
---

<h1><a id="top" name="top"></a>Module 4</h1><h2>Exercices 4.1</h2><h2 class="partie2">Exercices sur les flux</h2>

<h1>Questions/Réponses</h1>
<p>Veuillez répondre mentalement, sur papier ou bien en créant le code nécessaire pour répondre à ces questions avant de regarder la réponse.</p>

<p>Si vous ne faites pas honnêtement les exercices et les lectures dans ce cours, il est possible que vous n'arriviez pas alors à faire les travaux notés et les examens.</p>


<p>Prenez note qu'<a href="https://rc-inf1220.teluq.ca/">il est permis d'utiliser le robot conversationnel du cours lors des exercises</a>. Cependant vous devriez vous entraîner à produire vos propres réponses.</p>

<h2>Réponses uniques?</h2>

<p>Les exercices comportent une solution vous permettant de comparer votre approche avec la nôtre. Il n'y a pas de solution unique aux problèmes en général. Vous pouvez arriver avec une solution qui est préférable ou moins bonne que celle que nous offrons. Pour faire ces questions, vous devez avoir fait toutes les lectures préalables. Vous disposez alors toujours des fondements nécessaires pour faire les exercices. Nous vous encourageons tout de même à faire vos propres recherches en complément de vos lectures. Dans certains cas, au sein de la solution que nous offrons, nous pouvons utiliser des notions techniques qui n'ont pas été vues directement dans le cours, mais qui devraient vous être facilement accessibles.</p>

<h2>Question 1</h2>
<p>Le programme suivant permet-il de lire deux lignes entrées au clavier ?</p>
<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>import</span> java<span style='color:#808030; '>.</span>util<span style='color:#808030; '>.</span>Scanner<span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>class</span> TestIn <span style='color:#800080; '>{</span>
    <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#800000; font-weight:bold; '>void</span> <span style='color:#400000; '>main</span><span style='color:#808030; '>(</span><span style='color:#603000; '>String</span><span style='color:#808030; '>[</span><span style='color:#808030; '>]</span> args<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
        Scanner scanner <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> Scanner <span style='color:#808030; '>(</span>System<span style='color:#808030; '>.</span>in<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        System<span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#800000; '>"</span><span style='color:#0000e6; '>==> Taper deux lignes</span><span style='color:#800000; '>"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        System<span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#800000; '>"</span><span style='color:#0000e6; '>?</span><span style='color:#800000; '>"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#603000; '>String</span> ligne1 <span style='color:#808030; '>=</span> scanner<span style='color:#808030; '>.</span>nextLine<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        System<span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#800000; '>"</span><span style='color:#0000e6; '>?</span><span style='color:#800000; '>"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#603000; '>String</span> ligne2 <span style='color:#808030; '>=</span> scanner<span style='color:#808030; '>.</span>nextLine<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        System<span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#800000; '>"</span><span style='color:#0000e6; '>==> Les deux lignes lues sont:</span><span style='color:#0f69ff; '>\n</span><span style='color:#0000e6; '>==>  </span><span style='color:#800000; '>"</span> <span style='color:#808030; '>+</span> ligne1 <span style='color:#808030; '>+</span> <span style='color:#800000; '>"</span><span style='color:#0f69ff; '>\n</span><span style='color:#0000e6; '>==> </span><span style='color:#800000; '>"</span> <span style='color:#808030; '>+</span> ligne2<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>


<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>Oui, la classe Scanner avec en paramètre l'entrée de la console, permet de lire des entrées au clavier. Le code fait la lecture de deux lignes de données au clavier.</p>

<p>Notez qu'on évite délibérément d'appeler scanner.close() puisque cela aurait pour conséquence la <em>fermeture</em> de <tt>System.in</tt> ce qui n'est généralement pas souhaitable. La ressource  <tt>System.in</tt> est automatiquement <em>fermée</em> à la fin du programme dans tous les cas, il n'est donc pas nécessaire de s'en préoccuper.</p></div>
</div>

<h2>Question 2</h2>
<p>Que fait ce programme ?</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.io.*</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.util.*</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">TestFichOut</span> <span style="color: #333333">{</span>
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        File fichier <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> File<span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Lasortie.txt&quot;</span><span style="color: #333333">);</span>
        <span style="color: #008800; font-weight: bold">try</span> <span style="color: #333333">(</span>
         FileOutputStream streamFich <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> FileOutputStream<span style="color: #333333">(</span>fichier<span style="color: #333333">);</span>
         DataOutputStream d <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> DataOutputStream<span style="color: #333333">(</span>streamFich<span style="color: #333333">);</span>
         PrintStream out <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> PrintStream<span style="color: #333333">(</span>d<span style="color: #333333">);</span>
         Scanner sc <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> Scanner<span style="color: #333333">(</span>System<span style="color: #333333">.</span><span style="color: #0000CC">in</span><span style="color: #333333">);</span>
        <span style="color: #333333">)</span>
        <span style="color: #333333">{</span>
            String ligne <span style="color: #333333">=</span> <span style="background-color: #fff0f0">&quot;&quot;</span><span style="color: #333333">;</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;==&gt; Taper des lignes terminées  par ctrl-D&quot;</span><span style="color: #333333">);</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">print</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;?&quot;</span><span style="color: #333333">);</span>
            <span style="color: #008800; font-weight: bold">while</span><span style="color: #333333">(</span>sc<span style="color: #333333">.</span><span style="color: #0000CC">hasNextLine</span><span style="color: #333333">())</span> <span style="color: #333333">{</span>
                out<span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;&quot;</span> <span style="color: #333333">+</span> sc<span style="color: #333333">.</span><span style="color: #0000CC">nextLine</span><span style="color: #333333">());</span>
                System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">print</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;?&quot;</span><span style="color: #333333">);</span>
            <span style="color: #333333">}</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">();</span>
        <span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">catch</span> <span style="color: #333333">(</span>java<span style="color: #333333">.</span><span style="color: #0000CC">io</span><span style="color: #333333">.</span><span style="color: #0000CC">IOException</span> e<span style="color: #333333">)</span> <span style="color: #333333">{</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Il y a une erreur de lecture ou  écriture&quot;</span><span style="color: #333333">);</span>
        <span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">finally</span> <span style="color: #333333">{}</span>
    <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>


<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>Il prend chaque ligne saisie par l'utilisateur et il l'écrit dans un fichier. Par ailleurs, notez que la variable ligne est inutilisée.</p></div>
</div>

<h2>Question 3</h2>

<p>En supposant que vous avez les droits d&#x2019;écriture et de lecture
appropriés, créez un fichier séquentiel binaire (monFichier) dans un répertoire
(monRepertoire) sur la racine. On suppose que le fichier et le répertoire
n&#x2019;existent pas déjà. Ecrire dans ce fichier les nombres entiers de 0 à
9.</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>io</span><span style='color:#808030; '>.</span><span style='color:#800000; font-weight:bold; '>*</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>nio</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>file</span><span style='color:#808030; '>.</span><span style='color:#800000; font-weight:bold; '>*</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Exercice1M4<span style='color:#800080; '>{</span>
 <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#bb7977; '>void</span> main<span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>String</span> args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span> <span style='color:#800000; font-weight:bold; '>throws</span> <span style='color:#bb7977; font-weight:bold; '>IOException</span> <span style='color:#800080; '>{</span>
   <span style='color:#bb7977; font-weight:bold; '>String</span> s <span style='color:#808030; '>=</span> <span style='color:#bb7977; font-weight:bold; '>File</span><span style='color:#808030; '>.</span>separator<span style='color:#800080; '>;</span>
   <span style='color:#bb7977; font-weight:bold; '>File</span> monRepertoire <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>File</span><span style='color:#808030; '>(</span>s <span style='color:#808030; '>+</span> <span style='color:#0000e6; '>"monRepertoire"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>monRepertoire<span style='color:#808030; '>.</span>mkdirs<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
     <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"*** répertoire créé correctement***"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
     <span style='color:#bb7977; font-weight:bold; '>File</span> monFichier <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>File</span><span style='color:#808030; '>(</span>monRepertoire<span style='color:#808030; '>,</span> <span style='color:#0000e6; '>"monFichier"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
     <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>monFichier<span style='color:#808030; '>.</span>createNewFile<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"***fichier créé correctement***"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#696969; '>// DataOutputStream sortie = new DataOutputStream ( new FileOutputStream</span>
        <span style='color:#696969; '>// (monFichier)) ;</span>
        <span style='color:#bb7977; font-weight:bold; '>DataOutputStream</span> sortie <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>DataOutputStream</span><span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>BufferedOutputStream</span><span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>FileOutputStream</span><span style='color:#808030; '>(</span>monFichier<span style='color:#808030; '>)</span><span style='color:#808030; '>)</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#800000; font-weight:bold; '>for</span> <span style='color:#808030; '>(</span><span style='color:#bb7977; '>int</span> i <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span><span style='color:#800080; '>;</span> i <span style='color:#808030; '>&lt;</span> <span style='color:#008c00; '>10</span><span style='color:#800080; '>;</span> i<span style='color:#808030; '>+</span><span style='color:#808030; '>+</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
          sortie<span style='color:#808030; '>.</span>writeInt<span style='color:#808030; '>(</span>i<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#800080; '>}</span>
       sortie<span style='color:#808030; '>.</span>close<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
     <span style='color:#800080; '>}</span>
      <span style='color:#800000; font-weight:bold; '>else</span> <span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"***le fichier n'a pas été créé***"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
     <span style='color:#800080; '>}</span>
   <span style='color:#800080; '>}</span>
   <span style='color:#800000; font-weight:bold; '>else</span><span style='color:#800080; '>{</span>
     <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"*** le répertoire n'a pas été créé**}"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   <span style='color:#800080; '>}</span>
 <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2021-08-23 22:11:02 UTC -->
</div>
</div>

<h2>Question 4</h2>


<p>Ecrire un programme qui affiche le contenu du fichier de l&#x2019;exercice
précédent, puis ajoute à ce fichier le double des entiers impairs de 0 à 9. Les noms de
répertoire et de fichier devront être fournis par l&#x2019;utilisateur qui les
saisira au clavier.</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>io</span><span style='color:#808030; '>.</span><span style='color:#800000; font-weight:bold; '>*</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>nio</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>file</span><span style='color:#808030; '>.</span><span style='color:#800000; font-weight:bold; '>*</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>util</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>Scanner</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Exercice2M4 <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#bb7977; '>void</span> main<span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>String</span><span style='color:#808030; '>[</span><span style='color:#808030; '>]</span> args<span style='color:#808030; '>)</span> <span style='color:#800000; font-weight:bold; '>throws</span> <span style='color:#bb7977; font-weight:bold; '>IOException</span>
  <span style='color:#800080; '>{</span>
    <span style='color:#bb7977; font-weight:bold; '>String</span> nomFichier<span style='color:#808030; '>,</span> nomRepertoire<span style='color:#800080; '>;</span>
    <span style='color:#bb7977; font-weight:bold; '>String</span> s <span style='color:#808030; '>=</span> <span style='color:#bb7977; font-weight:bold; '>File</span><span style='color:#808030; '>.</span>separator<span style='color:#800080; '>;</span>
    <span style='color:#bb7977; '>int</span> n <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span><span style='color:#800080; '>;</span>
    <span style='color:#bb7977; font-weight:bold; '>Scanner</span> scanner <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>Scanner</span><span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>in<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"donnez le nom du répertoire à lire : "</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    nomRepertoire <span style='color:#808030; '>=</span> scanner<span style='color:#808030; '>.</span>next<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#bb7977; font-weight:bold; '>File</span> monRepertoire <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>File</span><span style='color:#808030; '>(</span>s <span style='color:#808030; '>+</span> nomRepertoire<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>monRepertoire<span style='color:#808030; '>.</span>exists<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span> <span style='color:#808030; '>&amp;</span><span style='color:#808030; '>&amp;</span> monRepertoire<span style='color:#808030; '>.</span>isDirectory<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
      scanner <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>Scanner</span><span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>in<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#696969; '>// intentionellement, nous n'appelerons pas scanner.close afin de ne pas</span>
      <span style='color:#696969; '>// fermer System.in inutilement.</span>
      <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"***ce répertoire existe***"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"donnez le nom du fichier à traiter : "</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      nomFichier <span style='color:#808030; '>=</span> scanner<span style='color:#808030; '>.</span>next<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#bb7977; font-weight:bold; '>File</span> monFichier <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>File</span><span style='color:#808030; '>(</span>monRepertoire<span style='color:#808030; '>,</span> nomFichier<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>monFichier<span style='color:#808030; '>.</span>exists<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
        <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"*** ce fichier existe et voici son contenu***"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#bb7977; font-weight:bold; '>DataInputStream</span> entree <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>DataInputStream</span><span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>BufferedInputStream</span><span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>FileInputStream</span><span style='color:#808030; '>(</span>monFichier<span style='color:#808030; '>)</span><span style='color:#808030; '>)</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#bb7977; '>boolean</span> eof <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>false</span><span style='color:#800080; '>;</span>
        <span style='color:#800000; font-weight:bold; '>while</span> <span style='color:#808030; '>(</span><span style='color:#808030; '>!</span>eof<span style='color:#808030; '>)</span>
        <span style='color:#800080; '>{</span>
          <span style='color:#800000; font-weight:bold; '>try</span>
          <span style='color:#800080; '>{</span>
            n <span style='color:#808030; '>=</span> entree<span style='color:#808030; '>.</span>readInt<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
          <span style='color:#800080; '>}</span>
          <span style='color:#800000; font-weight:bold; '>catch</span> <span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>EOFException</span> e<span style='color:#808030; '>)</span>
          <span style='color:#800080; '>{</span>
            eof <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>true</span><span style='color:#800080; '>;</span>
          <span style='color:#800080; '>}</span>
          <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span><span style='color:#808030; '>!</span>eof<span style='color:#808030; '>)</span>
            <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span>n<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#800080; '>}</span>
        entree<span style='color:#808030; '>.</span>close<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#bb7977; font-weight:bold; '>DataOutputStream</span> sortie <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>DataOutputStream</span><span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>BufferedOutputStream</span><span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>FileOutputStream</span><span style='color:#808030; '>(</span>monFichier<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>true</span><span style='color:#808030; '>)</span><span style='color:#808030; '>)</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#800000; font-weight:bold; '>for</span> <span style='color:#808030; '>(</span><span style='color:#bb7977; '>int</span> i <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span><span style='color:#800080; '>;</span> i <span style='color:#808030; '>&lt;</span> <span style='color:#008c00; '>10</span><span style='color:#800080; '>;</span> i<span style='color:#808030; '>+</span><span style='color:#808030; '>+</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
          <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>i <span style='color:#808030; '>%</span> <span style='color:#008c00; '>2</span> <span style='color:#808030; '>=</span><span style='color:#808030; '>=</span> <span style='color:#008c00; '>1</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
            sortie<span style='color:#808030; '>.</span>writeInt<span style='color:#808030; '>(</span><span style='color:#008c00; '>2</span> <span style='color:#808030; '>*</span> i<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
          <span style='color:#800080; '>}</span>
        <span style='color:#800080; '>}</span>
        sortie<span style='color:#808030; '>.</span>close<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#800080; '>}</span>
      <span style='color:#800000; font-weight:bold; '>else</span> <span style='color:#800080; '>{</span>
        <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"***ce fichier n'existe pas***"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#800080; '>}</span>
    <span style='color:#800080; '>}</span>
    <span style='color:#800000; font-weight:bold; '>else</span> <span style='color:#800080; '>{</span>
      <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"*** ce répertoire n'existe pas***"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#800080; '>}</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2021-05-18 13:50:42 UTC -->
</div>
</div>

<h2>Question 5</h2>

<p>En poursuivant avec le même exemple que les deux exercices précédents, écrire un programme qui affiche le contenu du fichier, puis modifie ce fichier en remplaçant les nombres entiers impairs par leur
double. Les noms de répertoire et de fichier devront être fournis par
l&#x2019;utilisateur qui les saisira au clavier.</p>

<p>Quelle est la différence entre cet exercice et l&#x2019;exercice précédent du point
de vue des types d&#x2019;accès et des possibilités qui y sont liées?</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>io</span><span style='color:#808030; '>.</span><span style='color:#800000; font-weight:bold; '>*</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>nio</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>file</span><span style='color:#808030; '>.</span><span style='color:#800000; font-weight:bold; '>*</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>util</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>Scanner</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Exercice3M4<span style='color:#696969; '>// Exercice3M4</span>
<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#bb7977; '>void</span> main<span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>String</span> args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span> <span style='color:#800000; font-weight:bold; '>throws</span> <span style='color:#bb7977; font-weight:bold; '>IOException</span> <span style='color:#800080; '>{</span>
    <span style='color:#bb7977; font-weight:bold; '>String</span> nomFichier<span style='color:#808030; '>,</span> nomRepertoire<span style='color:#808030; '>,</span> s <span style='color:#808030; '>=</span> <span style='color:#bb7977; font-weight:bold; '>File</span><span style='color:#808030; '>.</span>separator<span style='color:#800080; '>;</span>
    <span style='color:#bb7977; '>int</span> n <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span><span style='color:#800080; '>;</span>
    <span style='color:#bb7977; font-weight:bold; '>Scanner</span> scanner <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>Scanner</span><span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>in<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"donnez le nom du répertoire à lire : "</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    nomRepertoire <span style='color:#808030; '>=</span> scanner<span style='color:#808030; '>.</span>next<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#bb7977; font-weight:bold; '>File</span> monRepertoire <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>File</span><span style='color:#808030; '>(</span>s <span style='color:#808030; '>+</span> nomRepertoire<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>monRepertoire<span style='color:#808030; '>.</span>exists<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span> <span style='color:#808030; '>&amp;</span><span style='color:#808030; '>&amp;</span> monRepertoire<span style='color:#808030; '>.</span>isDirectory<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
      scanner <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>Scanner</span><span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>in<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"***ce répertoire existe***"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"donnez le nom du fichier à traiter : "</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      nomFichier <span style='color:#808030; '>=</span> scanner<span style='color:#808030; '>.</span>next<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#bb7977; font-weight:bold; '>File</span> monFichier <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>File</span><span style='color:#808030; '>(</span>monRepertoire<span style='color:#808030; '>,</span> nomFichier<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>monFichier<span style='color:#808030; '>.</span>exists<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
        <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"*** ce fichier existe et voici son contenu***"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#bb7977; font-weight:bold; '>DataInputStream</span> entree <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>DataInputStream</span><span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>BufferedInputStream</span><span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>FileInputStream</span><span style='color:#808030; '>(</span>monFichier<span style='color:#808030; '>)</span><span style='color:#808030; '>)</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#bb7977; '>boolean</span> eof <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>false</span><span style='color:#800080; '>;</span>
        <span style='color:#800000; font-weight:bold; '>while</span> <span style='color:#808030; '>(</span><span style='color:#808030; '>!</span>eof<span style='color:#808030; '>)</span>
        <span style='color:#800080; '>{</span>
          <span style='color:#800000; font-weight:bold; '>try</span>
          <span style='color:#800080; '>{</span>
            n <span style='color:#808030; '>=</span> entree<span style='color:#808030; '>.</span>readInt<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
          <span style='color:#800080; '>}</span>
          <span style='color:#800000; font-weight:bold; '>catch</span> <span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>EOFException</span> e<span style='color:#808030; '>)</span>
          <span style='color:#800080; '>{</span>
            eof <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>true</span><span style='color:#800080; '>;</span>
          <span style='color:#800080; '>}</span>
          <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span><span style='color:#808030; '>!</span>eof<span style='color:#808030; '>)</span>
            <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span>n<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#800080; '>}</span>
        entree<span style='color:#808030; '>.</span>close<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"***il va maintenant être modifié si necessaire*** "</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#696969; '>// DataOutputStream sortie = new DataOutputStream(newBufferedOutputStream(new</span>
        <span style='color:#696969; '>// FileOutputStream(monFichier, true)));</span>
        <span style='color:#bb7977; font-weight:bold; '>RandomAccessFile</span> sortie <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>RandomAccessFile</span><span style='color:#808030; '>(</span>s <span style='color:#808030; '>+</span> nomRepertoire <span style='color:#808030; '>+</span> s <span style='color:#808030; '>+</span> nomFichier<span style='color:#808030; '>,</span> <span style='color:#0000e6; '>"rw"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#bb7977; '>long</span> taille <span style='color:#808030; '>=</span> sortie<span style='color:#808030; '>.</span>length<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#bb7977; '>int</span> i <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span><span style='color:#800080; '>;</span>
        <span style='color:#800000; font-weight:bold; '>do</span> <span style='color:#800080; '>{</span>
          sortie<span style='color:#808030; '>.</span>seek<span style='color:#808030; '>(</span><span style='color:#008c00; '>4</span> <span style='color:#808030; '>*</span> i<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
          n <span style='color:#808030; '>=</span> sortie<span style='color:#808030; '>.</span>readInt<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
          <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>n <span style='color:#808030; '>%</span> <span style='color:#008c00; '>2</span> <span style='color:#808030; '>=</span><span style='color:#808030; '>=</span> <span style='color:#008c00; '>1</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
            sortie<span style='color:#808030; '>.</span>seek<span style='color:#808030; '>(</span><span style='color:#008c00; '>4</span> <span style='color:#808030; '>*</span> i<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
            sortie<span style='color:#808030; '>.</span>writeInt<span style='color:#808030; '>(</span><span style='color:#008c00; '>2</span> <span style='color:#808030; '>*</span> n<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
            <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out
                <span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span>taille <span style='color:#808030; '>+</span> <span style='color:#0000e6; '>"  l'ancienne valeur de n est: "</span> <span style='color:#808030; '>+</span> n <span style='color:#808030; '>+</span> <span style='color:#0000e6; '>"  et la nouvelle valeur de n est:  "</span> <span style='color:#808030; '>+</span> <span style='color:#008c00; '>2</span> <span style='color:#808030; '>*</span> n<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
          <span style='color:#800080; '>}</span>
          i <span style='color:#808030; '>=</span> i <span style='color:#808030; '>+</span> <span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span>
        <span style='color:#800080; '>}</span> <span style='color:#800000; font-weight:bold; '>while</span> <span style='color:#808030; '>(</span>i <span style='color:#808030; '>*</span> <span style='color:#008c00; '>4</span> <span style='color:#808030; '>&lt;</span> taille<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        sortie<span style='color:#808030; '>.</span>close<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#800080; '>}</span> <span style='color:#800000; font-weight:bold; '>else</span> <span style='color:#800080; '>{</span>
        <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"***ce fichier n'existe pas***"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#800080; '>}</span>
    <span style='color:#800080; '>}</span> <span style='color:#800000; font-weight:bold; '>else</span> <span style='color:#800080; '>{</span>
      <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"*** ce répertoire n'existe pas***"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#800080; '>}</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2021-05-18 13:48:23 UTC -->
<p>La différence réside en ceci que l&#x2019;accès direct nous facilite la mise
à jour du fichier. Si nous devrions faire cette mise à jour lors d&#x2019;un
accès séquentiel, ce serait extrêmement laborieux (une solution consistant à
utiliser un flux de sortie et un flux d&#x2019;entrée en même temps). Il ne
faut pas confondre cette mise à jour des données déjà présentes dans le fichier
avec l&#x2019;ajout de nouveaux éléments dans le même fichier tel que ce qui
est fait à l&#x2019;exercice précédent par exemple.</p>
</div>
</div>

<h2>Question 6</h2>

<p>Créez un fichier texte nommé unFichier dans le répertoire courant et écrivez-y  « Bonjour, je suis bien créé ». Ce nom sera fourni par l&#x2019;utilisateur
sous forme chaîne « unFichier.txt ».</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>io</span><span style='color:#808030; '>.</span><span style='color:#800000; font-weight:bold; '>*</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>util</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>Scanner</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Exercice4M4 <span style='color:#800080; '>{</span><span style='color:#696969; '>//Exercice4M4</span>
 <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#bb7977; '>void</span> main<span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>String</span> args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span> <span style='color:#800000; font-weight:bold; '>throws</span> <span style='color:#bb7977; font-weight:bold; '>IOException</span> <span style='color:#800080; '>{</span>
   <span style='color:#bb7977; font-weight:bold; '>String</span> nomFichier<span style='color:#800080; '>;</span>
   <span style='color:#bb7977; font-weight:bold; '>Scanner</span> scanner <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>Scanner</span><span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>in<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Donnez le nom du fichier a creer avec son extension .txt: "</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   nomFichier <span style='color:#808030; '>=</span> scanner<span style='color:#808030; '>.</span>next<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   <span style='color:#bb7977; font-weight:bold; '>PrintWriter</span> sortie <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>PrintWriter</span><span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>BufferedWriter</span><span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>FileWriter</span><span style='color:#808030; '>(</span>nomFichier<span style='color:#808030; '>)</span><span style='color:#808030; '>)</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   sortie<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>" Bonjour, je suis bien créé  "</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   sortie<span style='color:#808030; '>.</span>close<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"*** le fichier "</span> <span style='color:#808030; '>+</span> nomFichier <span style='color:#808030; '>+</span> <span style='color:#0000e6; '>" a été bien créé  "</span> <span style='color:#808030; '>+</span> <span style='color:#0000e6; '>"***"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
 <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2021-05-18 13:47:07 UTC -->
</div>
</div>

<h2>Question 7</h2>
<p>Ecrire un code qui prend en paramètre le nom du fichier de l&#x2019;exercice
précédent (unFichier.txt), et affiche son chemin d&#x2019;accès (c&#x2019;est-à-dire le
répertoire courant) ainsi que le contenu du fichier.</p>

<p>On suppose dans cet exercice qu&#x2019;on reste dans le même répertoire
courant qu&#x2019;à l'exercice précédent.</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>io</span><span style='color:#808030; '>.</span><span style='color:#800000; font-weight:bold; '>*</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>util</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>Scanner</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Exercice5M4 <span style='color:#800080; '>{</span><span style='color:#696969; '>// Exercice5M4</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#bb7977; '>void</span> main<span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>String</span> args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span> <span style='color:#800000; font-weight:bold; '>throws</span> <span style='color:#bb7977; font-weight:bold; '>IOException</span> <span style='color:#800080; '>{</span>
    <span style='color:#bb7977; font-weight:bold; '>String</span> nomFichier<span style='color:#808030; '>,</span> ligne<span style='color:#800080; '>;</span>
    <span style='color:#bb7977; font-weight:bold; '>Scanner</span> scanner <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>Scanner</span><span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>in<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Donnez le nom du fichier  : "</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    nomFichier <span style='color:#808030; '>=</span> scanner<span style='color:#808030; '>.</span>next<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#800000; font-weight:bold; '>try</span> <span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>BufferedReader</span> entree <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>BufferedReader</span><span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>FileReader</span><span style='color:#808030; '>(</span>nomFichier<span style='color:#808030; '>)</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
      <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"*** voici le contenu du fichier qui est situé dans le répertoire***</span><span style='color:#0f69ff; '>\n</span><span style='color:#0000e6; '> "</span>
          <span style='color:#808030; '>+</span> <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>getProperty<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"user.dir"</span><span style='color:#808030; '>)</span> <span style='color:#808030; '>+</span> <span style='color:#0000e6; '>"</span><span style='color:#0f69ff; '>\n</span><span style='color:#0000e6; '> "</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#800000; font-weight:bold; '>do</span> <span style='color:#800080; '>{</span>
        ligne <span style='color:#808030; '>=</span> entree<span style='color:#808030; '>.</span>readLine<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
        <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>ligne <span style='color:#808030; '>!</span><span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>null</span><span style='color:#808030; '>)</span>
          <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span>ligne<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#800080; '>}</span> <span style='color:#800000; font-weight:bold; '>while</span> <span style='color:#808030; '>(</span>ligne <span style='color:#808030; '>!</span><span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>null</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      entree<span style='color:#808030; '>.</span>close<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"</span><span style='color:#0f69ff; '>\n</span><span style='color:#0000e6; '>"</span> <span style='color:#808030; '>+</span> <span style='color:#0000e6; '>"*** fin du contenu ***"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#800080; '>}</span> <span style='color:#800000; font-weight:bold; '>catch</span> <span style='color:#808030; '>(</span>java<span style='color:#808030; '>.</span>io<span style='color:#808030; '>.</span><span style='color:#bb7977; font-weight:bold; '>IOException</span> e<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
      <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"le fichier n'existe pas"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#800080; '>}</span> <span style='color:#800000; font-weight:bold; '>finally</span> <span style='color:#800080; '>{</span>
    <span style='color:#800080; '>}</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2021-05-18 13:43:40 UTC --></div>
</div>