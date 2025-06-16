---
title: "Activité 5.2"
weight: 2
---

<h1><a id="top" name="top"></a>Module 5</h1><h2>Activité 5.2</h2><h2 class="partie2">Le polymorphisme</h2>

<p class="sommaire">Sommaire</p>
<ul>

<li><a href="#section1">Le polymorphisme ad hoc</a></li>
<li><a href="#section2">Le polymorphisme d'héritage</a></li>
<li><a href="#section3">Le polymorphisme paramétrique ou les génériques</a></li>

</ul>

<p>Le polymorphisme est la capacité d'une méthode de se comporter différemment en fonction de l'objet qui s'en sert. Le polymorphisme permet donc de manipuler des objets grâce à leurs méthodes sans que nous nous souciions de leur classe. La JVM se charge d'appeler la méthode adéquate dans la hiérarchie de classes issue de l'héritage. Il existe trois formes de polymorphisme : le polymorphisme ad hoc, le polymorphisme paramètré et le polymorphisme par héritage. Dans les prochaines sections, nous aborderons ces trois types de polymorphisme et leur usage.</p>

<p><a id="intro" name="section1"></a></p>

<h1>Le polymorphisme ad hoc</h1>

<p>Le polymorphisme ad hoc est une technique de programmation OO où plusieurs méthodes avec le même nom sont créées, mais possède des paramètres de méthode différents. Nous avons vu le polymorphisme ad hoc dans le cadre du module 2 sous un autre nom: surdéfinition des méthodes. La signature de la méthode est donc différente pour chacune d'elle. Ainsi, c'est la JVM à l'exécution du code qui redirige l'appel vers la bonne méthode de l'objet selon les types ou les objets passés en paramètres. Ce type de polymorphisme, appelé régulièrement polymorphisme overloading, est utile pour concevoir plusieurs mises en oeuvre d'un même algorithme avec des entrées de données de différents types. Par exemple, des méthodes "calculMoyenne" qui pourrait prendre un tableau d'entier ou bien un tableau de double en entrée. Dans d'autres langages que le Java tels que le C++, ce type de polymorphisme est utilisé pour construire des opérateurs pour une classe particulière. Par exemple, redéfinir l'opérateur égal (==) pour comparer deux cercles. Voici un exemple de polymorphisme ad hoc et son utilisation en Java:</p>


<iframe height="1000px" width="100%" src="https://repl.it/@lemire/ex15?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>

<!-- <div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">MixageCouleur</span> <span style="color: #333333">{</span>
    
    <span style="color: #333399; font-weight: bold">int</span> rouge <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
    <span style="color: #333399; font-weight: bold">int</span> vert <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
    <span style="color: #333399; font-weight: bold">int</span> bleu <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #0066BB; font-weight: bold">MixageCouleur</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> rouge<span style="color: #333333">,</span> <span style="color: #333399; font-weight: bold">int</span> vert<span style="color: #333333">,</span> <span style="color: #333399; font-weight: bold">int</span> bleu<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">rouge</span> <span style="color: #333333">=</span> rouge<span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">bleu</span> <span style="color: #333333">=</span> bleu<span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">vert</span> <span style="color: #333333">=</span> vert<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">ajouterGradient</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> rouge<span style="color: #333333">,</span> <span style="color: #333399; font-weight: bold">int</span> vert<span style="color: #333333">,</span> <span style="color: #333399; font-weight: bold">int</span> bleu<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">rouge</span> <span style="color: #333333">+=</span> rouge<span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">bleu</span> <span style="color: #333333">+=</span> bleu<span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">vert</span> <span style="color: #333333">+=</span> vert<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">ajouterGradient</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">float</span> rouge<span style="color: #333333">,</span> <span style="color: #333399; font-weight: bold">float</span> vert<span style="color: #333333">,</span> <span style="color: #333399; font-weight: bold">float</span> bleu<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">rouge</span> <span style="color: #333333">+=</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> rouge<span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">bleu</span> <span style="color: #333333">+=</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> bleu<span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">vert</span> <span style="color: #333333">+=</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> vert<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">ajouterGradient</span><span style="color: #333333">(</span>Color color<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">rouge</span> <span style="color: #333333">+=</span> color<span style="color: #333333">.</span><span style="color: #0000CC">getRed</span><span style="color: #333333">();</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">bleu</span> <span style="color: #333333">+=</span> color<span style="color: #333333">.</span><span style="color: #0000CC">getBlue</span><span style="color: #333333">();</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">vert</span> <span style="color: #333333">+=</span> color<span style="color: #333333">.</span><span style="color: #0000CC">getGreen</span><span style="color: #333333">();</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        MixageCouleur mixeur <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> MixageCouleur<span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">100</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">100</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">100</span><span style="color: #333333">);</span>
        
        <span style="color: #888888">// Appel de deux méthodes avec le même nom mais avec des paramètres différents</span>
        mixeur<span style="color: #333333">.</span><span style="color: #0000CC">ajouterGradient</span><span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">5</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">15</span><span style="color: #333333">);</span>
        mixeur<span style="color: #333333">.</span><span style="color: #0000CC">ajouterGradient</span><span style="color: #333333">(</span>Color<span style="color: #333333">.</span><span style="color: #0000CC">PINK</span><span style="color: #333333">);</span>
        
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>-->

<p><a id="intro" name="section2"></a></p>

<h1>Le polymorphisme par héritage</h1>

<p>Le polymorphisme par héritage est en fait la surcharge de méthode (overriding) que nous avons vu précédemment. Il s'agit donc de re-implémenter une méthode qui a été déclarée dans une classe héritée. Elle peut se faire avec des classes abstraites ou non. Voici un exemple de polymorphisme par héritage :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.awt.Color</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.awt.Dimension</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.awt.EventQueue</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.awt.Graphics</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.awt.Graphics2D</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.awt.RenderingHints</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">javax.swing.JFrame</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">javax.swing.JPanel</span><span style="color: #333333">;</span>

<span style="color: #888888">/**</span>
<span style="color: #888888"> * Classe permettant de dessiner un cercle pointillé.</span>
<span style="color: #888888"> * </span>
<span style="color: #888888"> * @author cgouin</span>
<span style="color: #888888"> */</span>
<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">CerclePointille</span> <span style="color: #008800; font-weight: bold">extends</span> JPanel <span style="color: #333333">{</span>
    
    <span style="color: #888888">// Distance entre les points</span>
    <span style="color: #008800; font-weight: bold">protected</span> <span style="color: #008800; font-weight: bold">final</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">int</span> DISTANCE_ENTRE_POINT  <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">;</span>
    
    <span style="color: #008800; font-weight: bold">protected</span> <span style="color: #333399; font-weight: bold">float</span> rayon <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
    <span style="color: #008800; font-weight: bold">protected</span> <span style="color: #333399; font-weight: bold">int</span> posX <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
    <span style="color: #008800; font-weight: bold">protected</span> <span style="color: #333399; font-weight: bold">int</span> posY <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #0066BB; font-weight: bold">CerclePointille</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">float</span> rayon<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">rayon</span> <span style="color: #333333">=</span> rayon<span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">posX</span> <span style="color: #333333">=</span> posX<span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">posY</span> <span style="color: #333333">=</span> posY<span style="color: #333333">;</span>        
    <span style="color: #333333">}</span>

    <span style="color: #555555; font-weight: bold">@Override</span>
    <span style="color: #008800; font-weight: bold">protected</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">paintComponent</span><span style="color: #333333">(</span>Graphics g<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">super</span><span style="color: #333333">.</span><span style="color: #0000CC">paintComponent</span><span style="color: #333333">(</span>g<span style="color: #333333">);</span> <span style="color: #888888">//To change body of generated methods, choose Tools | Templates.</span>
        
        dessiner<span style="color: #333333">(</span>g<span style="color: #333333">);</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">dessiner</span><span style="color: #333333">(</span>Graphics g<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        <span style="color: #888888">//Calculer le périmètre</span>
        <span style="color: #333399; font-weight: bold">double</span> perimeter <span style="color: #333333">=</span> <span style="color: #333333">(</span>rayon <span style="color: #333333">*</span> <span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">)</span> <span style="color: #333333">*</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">PI</span><span style="color: #333333">;</span>
        
        <span style="color: #888888">//Calculer le nombre de point à dessiner</span>
        <span style="color: #333399; font-weight: bold">int</span> nbPoint <span style="color: #333333">=</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> <span style="color: #333333">(</span>perimeter <span style="color: #333333">/</span> DISTANCE_ENTRE_POINT<span style="color: #333333">);</span>
        
        <span style="color: #888888">//position de départ</span>
        <span style="color: #333399; font-weight: bold">int</span> x <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">getWidth</span><span style="color: #333333">()/</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">int</span> y <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">getHeight</span><span style="color: #333333">()/</span><span style="color: #0000DD; font-weight: bold">2</span> <span style="color: #333333">+</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> rayon<span style="color: #333333">;</span>
        
        Graphics2D g2d <span style="color: #333333">=</span> <span style="color: #333333">(</span>Graphics2D<span style="color: #333333">)</span> g<span style="color: #333333">;</span>
        
        g2d<span style="color: #333333">.</span><span style="color: #0000CC">setRenderingHint</span><span style="color: #333333">(</span>
            RenderingHints<span style="color: #333333">.</span><span style="color: #0000CC">KEY_ANTIALIASING</span><span style="color: #333333">,</span>
            RenderingHints<span style="color: #333333">.</span><span style="color: #0000CC">VALUE_ANTIALIAS_ON</span><span style="color: #333333">);</span>
        
        g2d<span style="color: #333333">.</span><span style="color: #0000CC">setColor</span><span style="color: #333333">(</span>Color<span style="color: #333333">.</span><span style="color: #0000CC">BLACK</span><span style="color: #333333">);</span>
        
        <span style="color: #888888">// Dessiner les points en calculant la rotation des points selon le centre de l&#39;axe avec x1 = x + rayon*cos(t) et y1 = y + rayon*cost(t);</span>
        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> nbPoint<span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            
            <span style="color: #333399; font-weight: bold">double</span> t <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">2</span> <span style="color: #333333">*</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">PI</span> <span style="color: #333333">*</span> i <span style="color: #333333">/</span> nbPoint<span style="color: #333333">;</span>
            
            <span style="color: #333399; font-weight: bold">int</span> x1 <span style="color: #333333">=</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">round</span><span style="color: #333333">(</span>x <span style="color: #333333">+</span> rayon <span style="color: #333333">*</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">cos</span><span style="color: #333333">(</span>t<span style="color: #333333">));</span>
            <span style="color: #333399; font-weight: bold">int</span> y1 <span style="color: #333333">=</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">round</span><span style="color: #333333">(</span>y <span style="color: #333333">+</span> rayon <span style="color: #333333">*</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">sin</span><span style="color: #333333">(</span>t<span style="color: #333333">));</span>
            g2d<span style="color: #333333">.</span><span style="color: #0000CC">fillOval</span><span style="color: #333333">(</span>x1 <span style="color: #333333">-</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> rayon<span style="color: #333333">,</span> y1 <span style="color: #333333">-</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> rayon<span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
      
        
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">private</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">create</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        JFrame f <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> JFrame<span style="color: #333333">();</span>
        f<span style="color: #333333">.</span><span style="color: #0000CC">setDefaultCloseOperation</span><span style="color: #333333">(</span>JFrame<span style="color: #333333">.</span><span style="color: #0000CC">EXIT_ON_CLOSE</span><span style="color: #333333">);</span>
        
        CerclePointille cercle <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> CerclePointille<span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">50</span><span style="color: #333333">);</span>
        
        cercle<span style="color: #333333">.</span><span style="color: #0000CC">setPreferredSize</span><span style="color: #333333">(</span><span style="color: #008800; font-weight: bold">new</span> Dimension<span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">300</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">300</span><span style="color: #333333">));</span>
              
        f<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span>cercle<span style="color: #333333">);</span>
        f<span style="color: #333333">.</span><span style="color: #0000CC">pack</span><span style="color: #333333">();</span>
        f<span style="color: #333333">.</span><span style="color: #0000CC">setVisible</span><span style="color: #333333">(</span><span style="color: #008800; font-weight: bold">true</span><span style="color: #333333">);</span>
        
        
        <span style="color: #888888">//panel.paintAll(panel.getGraphics());</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        EventQueue<span style="color: #333333">.</span><span style="color: #0000CC">invokeLater</span><span style="color: #333333">(</span><span style="color: #008800; font-weight: bold">new</span> Runnable<span style="color: #333333">()</span> <span style="color: #333333">{</span>

            <span style="color: #555555; font-weight: bold">@Override</span>
            <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">run</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
                create<span style="color: #333333">();</span>
            <span style="color: #333333">}</span>
        <span style="color: #333333">});</span>
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>

<p>Cette classe permet de tracer un cercle en pointillé dans une fenêtre appelée JFrame. Nous viendrons surcharger la méthode dessiner dans une sous-classe afin de permettre de tracer des ovales pointillés :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.awt.Color</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.awt.Dimension</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.awt.EventQueue</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.awt.Graphics</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.awt.Graphics2D</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.awt.RenderingHints</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">javax.swing.JFrame</span><span style="color: #333333">;</span>


<span style="color: #888888">/**</span>
<span style="color: #888888"> *</span>
<span style="color: #888888"> * @author cgouin</span>
<span style="color: #888888"> */</span>
<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">OvalePointille</span> <span style="color: #008800; font-weight: bold">extends</span> CerclePointille <span style="color: #333333">{</span>

    <span style="color: #008800; font-weight: bold">protected</span> <span style="color: #333399; font-weight: bold">float</span> rayonHorizontal <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #0066BB; font-weight: bold">OvalePointille</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">float</span> rayonVertical<span style="color: #333333">,</span> <span style="color: #333399; font-weight: bold">float</span> rayonHorizontal<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        <span style="color: #888888">//RayonVertical sera le Rayon</span>
        <span style="color: #008800; font-weight: bold">super</span><span style="color: #333333">(</span>rayonVertical<span style="color: #333333">);</span>
        
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">rayonHorizontal</span> <span style="color: #333333">=</span> rayonHorizontal<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #888888">//Surcharge ou polymorphisme par héritage</span>
    <span style="color: #555555; font-weight: bold">@Override</span>
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">dessiner</span><span style="color: #333333">(</span>Graphics g<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        <span style="color: #888888">//Calculer le périmètre</span>
        <span style="color: #333399; font-weight: bold">double</span> perimeter <span style="color: #333333">=</span> <span style="color: #333333">(</span>rayon <span style="color: #333333">*</span> <span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">)</span> <span style="color: #333333">*</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">PI</span><span style="color: #333333">;</span>
        
        <span style="color: #888888">//Calculer le nombre de point à dessiner</span>
        <span style="color: #333399; font-weight: bold">int</span> nbPoint <span style="color: #333333">=</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> <span style="color: #333333">(</span>perimeter <span style="color: #333333">/</span> DISTANCE_ENTRE_POINT<span style="color: #333333">);</span>
        
        <span style="color: #888888">//position de départ</span>
        <span style="color: #333399; font-weight: bold">int</span> x <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">getWidth</span><span style="color: #333333">()/</span><span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">int</span> y <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">getHeight</span><span style="color: #333333">()/</span><span style="color: #0000DD; font-weight: bold">2</span> <span style="color: #333333">+</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> rayon<span style="color: #333333">;</span>
        
        Graphics2D g2d <span style="color: #333333">=</span> <span style="color: #333333">(</span>Graphics2D<span style="color: #333333">)</span> g<span style="color: #333333">;</span>
        
        g2d<span style="color: #333333">.</span><span style="color: #0000CC">setRenderingHint</span><span style="color: #333333">(</span>
            RenderingHints<span style="color: #333333">.</span><span style="color: #0000CC">KEY_ANTIALIASING</span><span style="color: #333333">,</span>
            RenderingHints<span style="color: #333333">.</span><span style="color: #0000CC">VALUE_ANTIALIAS_ON</span><span style="color: #333333">);</span>
        
        g2d<span style="color: #333333">.</span><span style="color: #0000CC">setColor</span><span style="color: #333333">(</span>Color<span style="color: #333333">.</span><span style="color: #0000CC">BLACK</span><span style="color: #333333">);</span>
        
        <span style="color: #888888">// Dessiner les points en calculant la rotation des points selon le centre de l&#39;axe avec x1 = x + rayon*cos(t) et y1 = y + rayon*cost(t);</span>
        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> nbPoint<span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            
            <span style="color: #333399; font-weight: bold">double</span> t <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">2</span> <span style="color: #333333">*</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">PI</span> <span style="color: #333333">*</span> i <span style="color: #333333">/</span> nbPoint<span style="color: #333333">;</span>
            
            <span style="color: #888888">// Dessiner avec différent rayon pour tracer l&#39;oval</span>
            <span style="color: #333399; font-weight: bold">int</span> x1 <span style="color: #333333">=</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">round</span><span style="color: #333333">(</span>x <span style="color: #333333">+</span> rayonHorizontal <span style="color: #333333">*</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">cos</span><span style="color: #333333">(</span>t<span style="color: #333333">));</span>
            <span style="color: #333399; font-weight: bold">int</span> y1 <span style="color: #333333">=</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">round</span><span style="color: #333333">(</span>y <span style="color: #333333">+</span> rayon <span style="color: #333333">*</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">sin</span><span style="color: #333333">(</span>t<span style="color: #333333">));</span>
            
            g2d<span style="color: #333333">.</span><span style="color: #0000CC">fillOval</span><span style="color: #333333">(</span>x1 <span style="color: #333333">-</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> rayon<span style="color: #333333">,</span> y1 <span style="color: #333333">-</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">)</span> rayon<span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
        
    <span style="color: #333333">}</span>
   
    
    <span style="color: #008800; font-weight: bold">private</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">create</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        JFrame f <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> JFrame<span style="color: #333333">();</span>
        f<span style="color: #333333">.</span><span style="color: #0000CC">setDefaultCloseOperation</span><span style="color: #333333">(</span>JFrame<span style="color: #333333">.</span><span style="color: #0000CC">EXIT_ON_CLOSE</span><span style="color: #333333">);</span>
        
        OvalePointille ovale <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> OvalePointille<span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">50</span><span style="color: #333333">,</span><span style="color: #0000DD; font-weight: bold">30</span><span style="color: #333333">);</span>
        
        ovale<span style="color: #333333">.</span><span style="color: #0000CC">setPreferredSize</span><span style="color: #333333">(</span><span style="color: #008800; font-weight: bold">new</span> Dimension<span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">300</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">300</span><span style="color: #333333">));</span>
              
        f<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span>ovale<span style="color: #333333">);</span>
        f<span style="color: #333333">.</span><span style="color: #0000CC">pack</span><span style="color: #333333">();</span>
        f<span style="color: #333333">.</span><span style="color: #0000CC">setVisible</span><span style="color: #333333">(</span><span style="color: #008800; font-weight: bold">true</span><span style="color: #333333">);</span>
        
        
        <span style="color: #888888">//panel.paintAll(panel.getGraphics());</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        EventQueue<span style="color: #333333">.</span><span style="color: #0000CC">invokeLater</span><span style="color: #333333">(</span><span style="color: #008800; font-weight: bold">new</span> Runnable<span style="color: #333333">()</span> <span style="color: #333333">{</span>

            <span style="color: #555555; font-weight: bold">@Override</span>
            <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">run</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
                create<span style="color: #333333">();</span>
            <span style="color: #333333">}</span>
        <span style="color: #333333">});</span>
    <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>

<p>Dans cette dernière classe, nous avons donc redéfini la méthode afin de spécialiser la méthode dessiner. Même si nous faisons un "cast" de la classe en CerclePointille (CerclePointille cercle = new OvalePointille(10)), ce sera tout de même la méthode surchargée qui sera appelée.</p>

<p><a id="intro" name="section3"></a></p>

<h1>Le polymorphisme paramétrique ou les génériques (templates)</h1>

<p>Le dernier type de polymorphisme abordé est celui paramétrique. En Java, ce type de paramétrique est en fait l'utilisation de génériques passées en paramètre à des fonctions. Pour ce faire, il est nécessaire d'utiliser la mécanique des templates. Les templates en Java permettent de construire des méthodes ou des classes avec des paramètres indéfinis à la conception et qui sont résolu à l'exécution. Par exemple, nous avons vu au début du cours les structures de type ArrayList. Celle-ci utilise les templates en ne définissant pas dès l'implémentation la classe d'objet pouvant être contenu dans la structure, celle-ci est résolu à l'exécution. Ainsi, il est possible de créer une ArrayList ainsi : ArrayList&lt;String&gt; ou bien ArrayList&lt;Double&gt; ou enfin ArrayList&lt;MaClasse&gt;. Les templates/génériques peuvent être utilisés dans la conception des classes ou bien dans la conception des méthodes (paramètres reçus ou retournés). La forme générale pour l'utilisation d'un générique dans une méthode est la suivante :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span><span style="color: #333333">|</span><span style="color: #008800; font-weight: bold">protected</span><span style="color: #333333">|</span><span style="color: #008800; font-weight: bold">private</span> <span style="color: #008800; font-weight: bold">static</span><span style="color: #333333">|</span><span style="color: #008800; font-weight: bold">final</span> <span style="color: #333333">&lt;</span>T<span style="color: #333333">&gt;</span> valeurDeRetour<span style="color: #333333">|</span><span style="color: #333399; font-weight: bold">void</span> nomDeMethode<span style="color: #333333">(</span>T unParametreGenerique<span style="color: #333333">)</span>  <span style="color: #333333">{</span>
       <span style="color: #888888">//Faire quelque chose avec unParametreGenerique </span>
<span style="color: #333333">}</span>
</pre></div>


<p>Un exemple classique de l'utilisation des templates est avec l'implémentation d'une méthode de comparaison (equals), recevant deux paramètres de classes inconnus :</p>



<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">TestGenerique</span> <span style="color: #333333">{</span>
    
    <span style="color: #888888">// Méthode equals à deux paramètres. La méthode equals à un paramètre existe déjà et est implémentée dans la SuperClasse Object</span>
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333333">&lt;</span>T<span style="color: #333333">&gt;</span> <span style="color: #333399; font-weight: bold">boolean</span> equals<span style="color: #333333">(</span>T a<span style="color: #333333">,</span> T b<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">return</span> a<span style="color: #333333">.</span><span style="color: #0000CC">equals</span><span style="color: #333333">(</span>b<span style="color: #333333">);</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        String allo <span style="color: #333333">=</span> <span style="background-color: #fff0f0">&quot;allo&quot;</span><span style="color: #333333">;</span>
        String bonjour <span style="color: #333333">=</span> <span style="background-color: #fff0f0">&quot;bonjour&quot;</span><span style="color: #333333">;</span>
        
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span>equals<span style="color: #333333">(</span>allo<span style="color: #333333">,</span> bonjour<span style="color: #333333">));</span>
        
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>

<p>Dans cet exemple, le type générique est déclaré en début de méthode (<T>). Celui-ci est en quelques sortes un "Joker" auquel on peut appliquer n'importe quelle classe. Toutefois, il faut faire attention, dans l'exemple précédent, comme tout les objets hérites de la superclasse Object, ceux-ci ont tous la méthode equals. Cela ne peut pas être le cas pour des méthodes spécifiques à des implémentations de classe particulière. Il est également possible d'utiliser deux génériques différents :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">TestGenerique</span> <span style="color: #333333">{</span>
    
    <span style="color: #888888">// Méthode equals à deux paramètres. La méthode equals à un paramètre existe déjà et est implémentée dans la SuperClasse Object</span>
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333333">&lt;</span>T<span style="color: #333333">,</span>U<span style="color: #333333">&gt;</span> <span style="color: #333399; font-weight: bold">boolean</span> equals<span style="color: #333333">(</span>T a<span style="color: #333333">,</span> U b<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">return</span> a<span style="color: #333333">.</span><span style="color: #0000CC">equals</span><span style="color: #333333">(</span>b<span style="color: #333333">);</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        String allo <span style="color: #333333">=</span> <span style="background-color: #fff0f0">&quot;allo&quot;</span><span style="color: #333333">;</span>
        String bonjour <span style="color: #333333">=</span> <span style="background-color: #fff0f0">&quot;bonjour&quot;</span><span style="color: #333333">;</span>
        
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span>equals<span style="color: #333333">(</span>allo<span style="color: #333333">,</span> bonjour<span style="color: #333333">));</span>
        
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>

<p>Pour ce qui est de l'utilisation des génériques dans la déclaration d'une classe, il est possible de lier l'instance d'une classe à un générique spécifique. Pour ce faire, il faut nommer le générique dans la déclaration de la classe (juste après le nom de la classe). Il est possible alors dans le corps de la déclaration de la classe d'utiliser le générique. La forme générale est : </p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span><span style="color: #333333">|</span><span style="color: #008800; font-weight: bold">protected</span><span style="color: #333333">|</span><span style="color: #008800; font-weight: bold">private</span> Class NomDeClasse<span style="color: #333333">&lt;</span>T<span style="color: #333333">&gt;</span> <span style="color: #333333">{</span>

      <span style="color: #888888">//Un exemple de constructeur</span>
      <span style="color: #008800; font-weight: bold">public</span> <span style="color: #0066BB; font-weight: bold">NomDeClasse</span><span style="color: #333333">(</span>T parametre<span style="color: #333333">)</span> <span style="color: #333333">{</span>
           <span style="color: #888888">//Faire quelque chose</span>
      <span style="color: #333333">}</span>

      <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">(</span>T parametre<span style="color: #333333">)</span> <span style="color: #333333">{</span>
           <span style="color: #888888">//Faire quelque chose</span>
      <span style="color: #333333">}</span>

<span style="color: #333333">}</span>
</pre></div>

<p>Voici un exemple de l'utilisation d'un générique dans l'implémentation d'une classe :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Chainon</span><span style="color: #333333">&lt;</span>T<span style="color: #333333">&gt;</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">protected</span> T donnee <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">null</span><span style="color: #333333">;</span>
    
    <span style="color: #008800; font-weight: bold">protected</span> Chainon<span style="color: #333333">&lt;</span>T<span style="color: #333333">&gt;</span> prochainChainon<span style="color: #333333">;</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #0066BB; font-weight: bold">Chainon</span><span style="color: #333333">(</span>T donnee<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">donnee</span> <span style="color: #333333">=</span> donnee<span style="color: #333333">;</span>      
        prochainChainon <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">null</span><span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">addChainon</span><span style="color: #333333">(</span>Chainon<span style="color: #333333">&lt;</span>T<span style="color: #333333">&gt;</span> chainon<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        prochainChainon <span style="color: #333333">=</span> chainon<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">removeChainon</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        prochainChainon <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">null</span><span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> Chainon<span style="color: #333333">&lt;</span>T<span style="color: #333333">&gt;</span> <span style="color: #0066BB; font-weight: bold">getNext</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">return</span> prochainChainon<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">boolean</span> <span style="color: #0066BB; font-weight: bold">hasNext</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">if</span> <span style="color: #333333">(</span>prochainChainon <span style="color: #333333">==</span> <span style="color: #008800; font-weight: bold">null</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
            <span style="color: #008800; font-weight: bold">return</span> <span style="color: #008800; font-weight: bold">false</span><span style="color: #333333">;</span>
        <span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">else</span> <span style="color: #333333">{</span>
            <span style="color: #008800; font-weight: bold">return</span> <span style="color: #008800; font-weight: bold">true</span><span style="color: #333333">;</span>
        <span style="color: #333333">}</span>            
    <span style="color: #333333">}</span>

    <span style="color: #008800; font-weight: bold">public</span> T <span style="color: #0066BB; font-weight: bold">getDonnee</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">return</span> donnee<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">setDonnee</span><span style="color: #333333">(</span>T donnee<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">donnee</span> <span style="color: #333333">=</span> donnee<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        Chainon<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;</span> chaine1 <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> Chainon<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;(</span><span style="background-color: #fff0f0">&quot;Veni&quot;</span><span style="color: #333333">);</span>
        Chainon<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;</span> chaine2 <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> Chainon<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;(</span><span style="background-color: #fff0f0">&quot;Vidi&quot;</span><span style="color: #333333">);</span>
        Chainon<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;</span> chaine3 <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> Chainon<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;(</span><span style="background-color: #fff0f0">&quot;Vici&quot;</span><span style="color: #333333">);</span>
        chaine1<span style="color: #333333">.</span><span style="color: #0000CC">addChainon</span><span style="color: #333333">(</span>chaine2<span style="color: #333333">);</span>
        chaine2<span style="color: #333333">.</span><span style="color: #0000CC">addChainon</span><span style="color: #333333">(</span>chaine3<span style="color: #333333">);</span>
        
        Chainon<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;</span> iterateur <span style="color: #333333">=</span> chaine1<span style="color: #333333">;</span>
        
        <span style="color: #888888">//Façon peu recommendé d&#39;utiliser le for ...</span>
        <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">boolean</span> iterate <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">true</span><span style="color: #333333">;</span> iterate <span style="color: #333333">==</span> <span style="color: #008800; font-weight: bold">true</span><span style="color: #333333">;)</span> <span style="color: #333333">{</span>
            
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span>iterateur<span style="color: #333333">.</span><span style="color: #0000CC">getDonnee</span><span style="color: #333333">());</span>
            
            <span style="color: #008800; font-weight: bold">if</span><span style="color: #333333">(</span>iterateur<span style="color: #333333">.</span><span style="color: #0000CC">hasNext</span><span style="color: #333333">())</span> <span style="color: #333333">{</span>
                iterateur <span style="color: #333333">=</span> iterateur<span style="color: #333333">.</span><span style="color: #0000CC">getNext</span><span style="color: #333333">();</span>
            <span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">else</span> <span style="color: #333333">{</span>
                iterate <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">false</span><span style="color: #333333">;</span>
            <span style="color: #333333">}</span>
        <span style="color: #333333">}</span> 
    <span style="color: #333333">}</span> 
<span style="color: #333333">}</span>
</pre></div>

<p> Il est possible d'omettre le type. Dans un tel cas, Java va omettre la vérification de la classe, comme dans cet exemple:</p>

<pre style='color:#000000;background:#ffffff;'>    ArrayList al = new ArrayList()<span style='color:#808030; '>;</span>
    al.add(1)<span style='color:#808030; '>;</span>
</pre>

<p>Dans un tel cas, Java peut émettre un avertissement à la compilation.</p>

<h2>Lecture dans le livre de référence</h2>

<p>Pour aller plus en profondeur (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 8 et 21:</p>
<ul>
	<li>Chapitre 8 - Section 6 : Le polymorphisme</li>
	<li>Chapitre 21 - Section 1 : Notion de classe générique</li>
	<li>Chapitre 21 - Section 2 : Compilation du code générique</li>
	<li>Chapitre 21 - Section 3 : Méthode générique</li>
	<li>Chapitre 21 - Section 5 : Héritage et programmation générique</li>
</ul>

<h2>Vidéos</h2>

<iframe width="560" height="315" src="https://www.youtube.com/embed/CPxrEntMxsQ" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>



<ol>
<li><a href="https://www.youtube.com/playlist?list=PLZbs1ERZ-TGXyZw164Y_Bye3SudSZB_Ry">Il y a une liste de vidéos sur le polymorphisme par Sam et al.</a> </li>
</ol>