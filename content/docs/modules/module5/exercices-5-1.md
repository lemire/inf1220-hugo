---
title: "Exercices 5.1"
weight: 3
---

<h1><a id="top" name="top"></a>Module 5</h1><h2>Exercices 5.1</h2><h2 class="partie2">Exercices sur l'héritage et le polymorphisme.</h2>

<h1>Questions/Réponses</h1>
<p>Veuillez répondre mentalement, sur papier ou bien en créant le code nécessaire pour répondre à ces questions avant de regarder la réponse.</p>


<p>Prenez note qu'<a href="https://rc-inf1220.teluq.ca/">il est permis d'utiliser le robot conversationnel du cours lors des exercises</a>. Cependant vous devriez vous entraîner à produire vos propres réponses.</p>

<h2>Réponses uniques?</h2>

<p>Les exercices comportent une solution vous permettant de comparer votre approche avec la nôtre. Il n'y a pas de solution unique aux problèmes en général. Vous pouvez arriver avec une solution qui est préférable ou moins bonne que celle que nous offrons. Pour faire ces questions, vous devez avoir fait toutes les lectures préalables. Vous disposez alors toujours des fondements nécessaires pour faire les exercices. Nous vous encourageons tout de même à faire vos propres recherches en complément de vos lectures. Dans certains cas, au sein de la solution que nous offrons, nous pouvons utiliser des notions techniques qui n'ont pas été vues directement dans le cours, mais qui devraient vous être facilement accessibles.</p>


<h2>Question 1</h2>
<p>Pourquoi le code suivant entraîne t-il une erreur à la compilation?</p>

```java
public class Test extends JFrame, Thread {

    String test;    

    public Test(String test) {
        this.test = test;
    }

    public void run() {
             System.out.println(test);
     }

}
```

<details><summary>Réponse</summary>
<p>En Java, il est impossible de faire de l'héritage multiple, il faut donc soit hériter de JFrame ou de Thread, mais pas les deux à la fois. Une façon de contourner le problème serait d'implémenter l'interface Runnable, puis de passer en paramètre cette classe à un thread.</p>
</details>

<h2>Question 2</h2>
<p>Voici ci dessous, une classe permettant de lire une image de type PNG et d'en extraire les occurrences de gradients de couleur :</p>

```java
public class PNGGradientExtractor {

    int[][] gradientMatrix;
    
    public PNGGradientExtractor(File file) {
        
        // Lit le fichier et charge
        loadImage(file);
        
    }
    
    public void loadImage(File file) {        
        //Charge l&#39;image et la met en format &quot;raw&quot; dans la matrice gradientMatrix
        return;
    }
    
    public HashMap getGradientMap() {
        // Retourne une hashmap avec l&#39;occurence de gradient dans l&#39;image
        return null;
    }
    
}
```

<p>À l'aide de l'héritage et des classes abstraites, veuillez implémenter les classes qui permettront de : a. Créer une classe abstraite GradientExtractor; b. Créer une classe GIFGradientExtractor; c. modifier PNGGradientExtractor pour tenir compte des changements précédent. Pour simplifier l'exercice, ce qui diffère le GIF du PNG est le chargement de l'image dans la matrice gradientMatrix. VOUS DEVEZ FAIRE SEULEMENT LA STRUCTURE (CLASSES ET MÉTHODES) SANS IMPLÉMENTATION!</p>

<details><summary>Réponse</summary>
<div>
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">abstract</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">GradientExtractor</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">protected</span> <span style="color: #333399; font-weight: bold">int</span> <span style="color: #333333">[][]</span> gradientMatrix<span style="color: #333333">;</span>
        
    <span style="color: #008800; font-weight: bold">public</span> HashMap <span style="color: #0066BB; font-weight: bold">getGradientMap</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        <span style="color: #888888">// Retourne une hashmap avec l&#39;occurence de gradient dans l&#39;image</span>
        <span style="color: #008800; font-weight: bold">return</span> <span style="color: #008800; font-weight: bold">null</span><span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">abstract</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">loadImage</span><span style="color: #333333">(</span>File file<span style="color: #333333">);</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">GIFGradientExtractor</span> <span style="color: #008800; font-weight: bold">extends</span> GradientExtractor <span style="color: #333333">{</span>
    

    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #0066BB; font-weight: bold">GIFGradientExtractor</span><span style="color: #333333">(</span>File file<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        <span style="color: #888888">// Lit le fichier et charge</span>
        loadImage<span style="color: #333333">(</span>file<span style="color: #333333">);</span>
        
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">loadImage</span><span style="color: #333333">(</span>File file<span style="color: #333333">)</span> <span style="color: #333333">{</span>        
        <span style="color: #888888">//Charge l&#39;image et la met en format &quot;raw&quot; dans la matrice gradientMatrix</span>
        <span style="color: #008800; font-weight: bold">return</span><span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">PNGGradientExtractor</span> <span style="color: #008800; font-weight: bold">extends</span> GradientExtractor <span style="color: #333333">{</span>
    

    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #0066BB; font-weight: bold">PNGGradientExtractor</span><span style="color: #333333">(</span>File file<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        <span style="color: #888888">// Lit le fichier et charge</span>
        loadImage<span style="color: #333333">(</span>file<span style="color: #333333">);</span>
        
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">loadImage</span><span style="color: #333333">(</span>File file<span style="color: #333333">)</span> <span style="color: #333333">{</span>        
        <span style="color: #888888">//Charge l&#39;image et la met en format &quot;raw&quot; dans la matrice gradientMatrix</span>
        <span style="color: #008800; font-weight: bold">return</span><span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>
</div>

<h2>Question 3</h2>
<p>Voici ci dessous, une classe permettant de calculer la regression linéaire d'une série temporelle d'entier :</p>

```java
public class SerieTemporelle {

    int[] serie;
    
    public SerieTemporelle(int[] serie) {
        this.serie = serie;
    }
    
    public void calculerRegressionLineaire() {
        
        //Calcul de la regression basé sur le code de : https://introcs.cs.princeton.edu/java/97data/LinearRegression.java.html
        int MAXN = 1000;
        double[] x = new double[MAXN];
        double[] y = new double[MAXN];
        
        // first pass: read in data, compute xbar and ybar
        double sumx = 0.0, sumy = 0.0, sumx2 = 0.0;
        for (int i = 0; i < serie.length; i++) {
            x[i] = i;
            y[i] = serie[i];
            sumx  += x[i];
            sumx2 += x[i] * x[i];
            sumy  += y[i];
        }
        double xbar = sumx / serie.length;
        double ybar = sumy / serie.length;

        // second pass: compute summary statistics
        double xxbar = 0.0, yybar = 0.0, xybar = 0.0;
        for (int i = 0; i < serie.length; i++) {
            xxbar += (x[i] - xbar) * (x[i] - xbar);
            yybar += (y[i] - ybar) * (y[i] - ybar);
            xybar += (x[i] - xbar) * (y[i] - ybar);
        }
        double beta1 = xybar / xxbar;
        double beta0 = ybar - beta1 * xbar;

        // print results
        System.out.println("y   = " + beta1 + " * x + " + beta0);

        // analyze results
        int df = serie.length - 2;
        double rss = 0.0;      // residual sum of squares
        double ssr = 0.0;      // regression sum of squares
        for (int i = 0; i < serie.length; i++) {
            double fit = beta1*x[i]+beta0;
            rss += (fit - y[i]) * (fit - y[i]);
            ssr += (fit - ybar) * (fit - ybar);
        }
        double R2    = ssr / yybar;
        double svar  = rss / df;
        double svar1 = svar / xxbar;
        double svar0 = svar/serie.length + xbar*xbar*svar1;
        
        System.out.println("R^2                 = " + R2);
        System.out.println("std error of beta_1 = " + Math.sqrt(svar1));
        System.out.println("std error of beta_0 = " + Math.sqrt(svar0));
        svar0 = svar * sumx2 / (serie.length * xxbar);
        System.out.println("std error of beta_0 = " + Math.sqrt(svar0));

        System.out.println("SSTO = " + yybar);
        System.out.println("SSE  = " + rss);
        System.out.println("SSR  = " + ssr);
        
    }
    
    public static void main(String[] args) {
        
        int[] serie = {100, 22, 55, 10, 5, 66, 71, 8, 91};
        SerieTemporelle serieTemporelle = new SerieTemporelle(serie);
        serieTemporelle.calculerRegressionLineaire();
       
    }
}
```

<p>À l'aide du polymorphisme paramétrique (les templates), veuillez modifier le code afin de permettre des séries temporelles de plusieurs classes (ex. Double, Integer, etc.).</p>

<details><summary>Réponse</summary>
<div>

<p><a href="https://replit.com/@lemire/GummyCarpalAssembly#Main.java">Version repl.it</a></p>
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">SerieTemporelle</span><span style="color: #333333">&lt;</span>T<span style="color: #333333">&gt;</span>  <span style="color: #333333">{</span>
    
    T<span style="color: #333333">[]</span> serie<span style="color: #333333">;</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #0066BB; font-weight: bold">SerieTemporelle</span><span style="color: #333333">(</span>T<span style="color: #333333">[]</span> serie<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">serie</span> <span style="color: #333333">=</span> serie<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">calculerRegressionLineaire</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        
        <span style="color: #888888">//Calcul de la regression basé sur le code de : https://introcs.cs.princeton.edu/java/97data/LinearRegression.java.html</span>
        <span style="color: #333399; font-weight: bold">int</span> MAXN <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">1000</span><span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span><span style="color: #333333">[]</span> x <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">double</span><span style="color: #333333">[</span>MAXN<span style="color: #333333">];</span>
        <span style="color: #333399; font-weight: bold">double</span><span style="color: #333333">[]</span> y <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">double</span><span style="color: #333333">[</span>MAXN<span style="color: #333333">];</span>
        
        <span style="color: #888888">// first pass: read in data, compute xbar and ybar</span>
        <span style="color: #333399; font-weight: bold">double</span> sumx <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">,</span> sumy <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">,</span> sumx2 <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">=</span> i<span style="color: #333333">;</span>
            y<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">=</span> Double<span style="color: #333333">.</span><span style="color: #0000CC">parseDouble</span><span style="color: #333333">(</span>serie<span style="color: #333333">[</span>i<span style="color: #333333">].</span><span style="color: #0000CC">toString</span><span style="color: #333333">());</span>
            sumx  <span style="color: #333333">+=</span> x<span style="color: #333333">[</span>i<span style="color: #333333">];</span>
            sumx2 <span style="color: #333333">+=</span> x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">*</span> x<span style="color: #333333">[</span>i<span style="color: #333333">];</span>
            sumy  <span style="color: #333333">+=</span> y<span style="color: #333333">[</span>i<span style="color: #333333">];</span>
        <span style="color: #333333">}</span>
        <span style="color: #333399; font-weight: bold">double</span> xbar <span style="color: #333333">=</span> sumx <span style="color: #333333">/</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> ybar <span style="color: #333333">=</span> sumy <span style="color: #333333">/</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span>

        <span style="color: #888888">// second pass: compute summary statistics</span>
        <span style="color: #333399; font-weight: bold">double</span> xxbar <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">,</span> yybar <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">,</span> xybar <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            xxbar <span style="color: #333333">+=</span> <span style="color: #333333">(</span>x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> xbar<span style="color: #333333">)</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> xbar<span style="color: #333333">);</span>
            yybar <span style="color: #333333">+=</span> <span style="color: #333333">(</span>y<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> ybar<span style="color: #333333">)</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>y<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> ybar<span style="color: #333333">);</span>
            xybar <span style="color: #333333">+=</span> <span style="color: #333333">(</span>x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> xbar<span style="color: #333333">)</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>y<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> ybar<span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
        <span style="color: #333399; font-weight: bold">double</span> beta1 <span style="color: #333333">=</span> xybar <span style="color: #333333">/</span> xxbar<span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> beta0 <span style="color: #333333">=</span> ybar <span style="color: #333333">-</span> beta1 <span style="color: #333333">*</span> xbar<span style="color: #333333">;</span>

        <span style="color: #888888">// print results</span>
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;y   = &quot;</span> <span style="color: #333333">+</span> beta1 <span style="color: #333333">+</span> <span style="background-color: #fff0f0">&quot; * x + &quot;</span> <span style="color: #333333">+</span> beta0<span style="color: #333333">);</span>

        <span style="color: #888888">// analyze results</span>
        <span style="color: #333399; font-weight: bold">int</span> df <span style="color: #333333">=</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">-</span> <span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> rss <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">;</span>      <span style="color: #888888">// residual sum of squares</span>
        <span style="color: #333399; font-weight: bold">double</span> ssr <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">;</span>      <span style="color: #888888">// regression sum of squares</span>
        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            <span style="color: #333399; font-weight: bold">double</span> fit <span style="color: #333333">=</span> beta1<span style="color: #333333">*</span>x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">+</span> beta0<span style="color: #333333">;</span>
            rss <span style="color: #333333">+=</span> <span style="color: #333333">(</span>fit <span style="color: #333333">-</span> y<span style="color: #333333">[</span>i<span style="color: #333333">])</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>fit <span style="color: #333333">-</span> y<span style="color: #333333">[</span>i<span style="color: #333333">]);</span>
            ssr <span style="color: #333333">+=</span> <span style="color: #333333">(</span>fit <span style="color: #333333">-</span> ybar<span style="color: #333333">)</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>fit <span style="color: #333333">-</span> ybar<span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
        <span style="color: #333399; font-weight: bold">double</span> R2    <span style="color: #333333">=</span> ssr <span style="color: #333333">/</span> yybar<span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> svar  <span style="color: #333333">=</span> rss <span style="color: #333333">/</span> df<span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> svar1 <span style="color: #333333">=</span> svar <span style="color: #333333">/</span> xxbar<span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> svar0 <span style="color: #333333">=</span> svar<span style="color: #333333">/</span>serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">+</span> xbar<span style="color: #333333">*</span>xbar<span style="color: #333333">*</span>svar1<span style="color: #333333">;</span>
        
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;R^2                 = &quot;</span> <span style="color: #333333">+</span> R2<span style="color: #333333">);</span>
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;std error of beta_1 = &quot;</span> <span style="color: #333333">+</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">sqrt</span><span style="color: #333333">(</span>svar1<span style="color: #333333">));</span>
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;std error of beta_0 = &quot;</span> <span style="color: #333333">+</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">sqrt</span><span style="color: #333333">(</span>svar0<span style="color: #333333">));</span>
        svar0 = svar * sumx2 / (serie.length * xxbar);
        System.out.println("std error of beta_0 = " + Math.sqrt(svar0));

        System.out.println("SSTO = " + yybar);
        System.out.println("SSE  = " + rss);
        System.out.println("SSR  = " + ssr);
        
    }
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        Double<span style="color: #333333">[]</span> serie <span style="color: #333333">=</span> <span style="color: #333333">{</span><span style="color: #6600EE; font-weight: bold">100.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">22.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">55.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">10.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">5.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">66.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">71.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">8.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">91.0</span><span style="color: #333333">};</span>
        SerieTemporelle serieTemporelle <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> SerieTemporelle<span style="color: #333333">(</span>serie<span style="color: #333333">);</span>
        serieTemporelle<span style="color: #333333">.</span><span style="color: #0000CC">calculerRegressionLineaire</span><span style="color: #333333">();</span>
       
    <span style="color: #333333">}</span>
    
    
<span style="color: #333333">}</span>
</pre></div>

<p>À l'aide du polymorphisme paramétrique (les templates), veuillez modifier le code afin de permettre des séries temporelles de plusieurs classes (ex. Double, Integer, etc.).</p>

<details><summary>Réponse</summary>
<div>

<p><a href="https://replit.com/@lemire/GummyCarpalAssembly#Main.java">Version repl.it</a></p>
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">SerieTemporelle</span><span style="color: #333333">&lt;</span>T<span style="color: #333333">&gt;</span>  <span style="color: #333333">{</span>
    
    T<span style="color: #333333">[]</span> serie<span style="color: #333333">;</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #0066BB; font-weight: bold">SerieTemporelle</span><span style="color: #333333">(</span>T<span style="color: #333333">[]</span> serie<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">serie</span> <span style="color: #333333">=</span> serie<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">calculerRegressionLineaire</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        
        <span style="color: #888888">//Calcul de la regression basé sur le code de : https://introcs.cs.princeton.edu/java/97data/LinearRegression.java.html</span>
        <span style="color: #333399; font-weight: bold">int</span> MAXN <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">1000</span><span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span><span style="color: #333333">[]</span> x <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">double</span><span style="color: #333333">[</span>MAXN<span style="color: #333333">];</span>
        <span style="color: #333399; font-weight: bold">double</span><span style="color: #333333">[]</span> y <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">double</span><span style="color: #333333">[</span>MAXN<span style="color: #333333">];</span>
        
        <span style="color: #888888">// first pass: read in data, compute xbar and ybar</span>
        <span style="color: #333399; font-weight: bold">double</span> sumx <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">,</span> sumy <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">,</span> sumx2 <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">=</span> i<span style="color: #333333">;</span>
            y<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">=</span> Double<span style="color: #333333">.</span><span style="color: #0000CC">parseDouble</span><span style="color: #333333">(</span>serie<span style="color: #333333">[</span>i<span style="color: #333333">].</span><span style="color: #0000CC">toString</span><span style="color: #333333">());</span>
            sumx  <span style="color: #333333">+=</span> x<span style="color: #333333">[</span>i<span style="color: #333333">];</span>
            sumx2 <span style="color: #333333">+=</span> x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">*</span> x<span style="color: #333333">[</span>i<span style="color: #333333">];</span>
            sumy  <span style="color: #333333">+=</span> y<span style="color: #333333">[</span>i<span style="color: #333333">];</span>
        <span style="color: #333333">}</span>
        <span style="color: #333399; font-weight: bold">double</span> xbar <span style="color: #333333">=</span> sumx <span style="color: #333333">/</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> ybar <span style="color: #333333">=</span> sumy <span style="color: #333333">/</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span>

        <span style="color: #888888">// second pass: compute summary statistics</span>
        <span style="color: #333399; font-weight: bold">double</span> xxbar <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">,</span> yybar <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">,</span> xybar <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            xxbar <span style="color: #333333">+=</span> <span style="color: #333333">(</span>x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> xbar<span style="color: #333333">)</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> xbar<span style="color: #333333">);</span>
            yybar <span style="color: #333333">+=</span> <span style="color: #333333">(</span>y<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> ybar<span style="color: #333333">)</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>y<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> ybar<span style="color: #333333">);</span>
            xybar <span style="color: #333333">+=</span> <span style="color: #333333">(</span>x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> xbar<span style="color: #333333">)</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>y<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> ybar<span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
        <span style="color: #333399; font-weight: bold">double</span> beta1 <span style="color: #333333">=</span> xybar <span style="color: #333333">/</span> xxbar<span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> beta0 <span style="color: #333333">=</span> ybar <span style="color: #333333">-</span> beta1 <span style="color: #333333">*</span> xbar<span style="color: #333333">;</span>

        <span style="color: #888888">// print results</span>
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;y   = &quot;</span> <span style="color: #333333">+</span> beta1 <span style="color: #333333">+</span> <span style="background-color: #fff0f0">&quot; * x + &quot;</span> <span style="color: #333333">+</span> beta0<span style="color: #333333">);</span>

        <span style="color: #888888">// analyze results</span>
        <span style="color: #333399; font-weight: bold">int</span> df <span style="color: #333333">=</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">-</span> <span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> rss <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">;</span>      <span style="color: #888888">// residual sum of squares</span>
        <span style="color: #333399; font-weight: bold">double</span> ssr <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">;</span>      <span style="color: #888888">// regression sum of squares</span>
        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            <span style="color: #333399; font-weight: bold">double</span> fit <span style="color: #333333">=</span> beta1<span style="color: #333333">*</span>x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">+</span> beta0<span style="color: #333333">;</span>
            rss <span style="color: #333333">+=</span> <span style="color: #333333">(</span>fit <span style="color: #333333">-</span> y<span style="color: #333333">[</span>i<span style="color: #333333">])</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>fit <span style="color: #333333">-</span> y<span style="color: #333333">[</span>i<span style="color: #333333">]);</span>
            ssr <span style="color: #333333">+=</span> <span style="color: #333333">(</span>fit <span style="color: #333333">-</span> ybar<span style="color: #333333">)</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>fit <span style="color: #333333">-</span> ybar<span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
        <span style="color: #333399; font-weight: bold">double</span> R2    <span style="color: #333333">=</span> ssr <span style="color: #333333">/</span> yybar<span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> svar  <span style="color: #333333">=</span> rss <span style="color: #333333">/</span> df<span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> svar1 <span style="color: #333333">=</span> svar <span style="color: #333333">/</span> xxbar<span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> svar0 <span style="color: #333333">=</span> svar<span style="color: #333333">/</span>serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">+</span> xbar<span style="color: #333333">*</span>xbar<span style="color: #333333">*</span>svar1<span style="color: #333333">;</span>
        
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;R^2                 = &quot;</span> <span style="color: #333333">+</span> R2<span style="color: #333333">);</span>
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;std error of beta_1 = &quot;</span> <span style="color: #333333">+</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">sqrt</span><span style="color: #333333">(</span>svar1<span style="color: #333333">));</span>
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;std error of beta_0 = &quot;</span> <span style="color: #333333">+</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">sqrt</span><span style="color: #333333">(</span>svar0<span style="color: #333333">));</span>
        svar0 = svar * sumx2 / (serie.length * xxbar);
        System.out.println("std error of beta_0 = " + Math.sqrt(svar0));

        System.out.println("SSTO = " + yybar);
        System.out.println("SSE  = " + rss);
        System.out.println("SSR  = " + ssr);
        
    }
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        Double<span style="color: #333333">[]</span> serie <span style="color: #333333">=</span> <span style="color: #333333">{</span><span style="color: #6600EE; font-weight: bold">100.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">22.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">55.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">10.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">5.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">66.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">71.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">8.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">91.0</span><span style="color: #333333">};</span>
        SerieTemporelle serieTemporelle <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> SerieTemporelle<span style="color: #333333">(</span>serie<span style="color: #333333">);</span>
        serieTemporelle<span style="color: #333333">.</span><span style="color: #0000CC">calculerRegressionLineaire</span><span style="color: #333333">();</span>
       
    <span style="color: #333333">}</span>
    
    
<span style="color: #333333">}</span>
</pre></div>

<p>À l'aide du polymorphisme paramétrique (les templates), veuillez modifier le code afin de permettre des séries temporelles de plusieurs classes (ex. Double, Integer, etc.).</p>

<details><summary>Réponse</summary>
<div>

<p><a href="https://replit.com/@lemire/GummyCarpalAssembly#Main.java">Version repl.it</a></p>
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">SerieTemporelle</span><span style="color: #333333">&lt;</span>T<span style="color: #333333">&gt;</span>  <span style="color: #333333">{</span>
    
    T<span style="color: #333333">[]</span> serie<span style="color: #333333">;</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #0066BB; font-weight: bold">SerieTemporelle</span><span style="color: #333333">(</span>T<span style="color: #333333">[]</span> serie<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">serie</span> <span style="color: #333333">=</span> serie<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">calculerRegressionLineaire</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        
        <span style="color: #888888">//Calcul de la regression basé sur le code de : https://introcs.cs.princeton.edu/java/97data/LinearRegression.java.html</span>
        <span style="color: #333399; font-weight: bold">int</span> MAXN <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">1000</span><span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span><span style="color: #333333">[]</span> x <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">double</span><span style="color: #333333">[</span>MAXN<span style="color: #333333">];</span>
        <span style="color: #333399; font-weight: bold">double</span><span style="color: #333333">[]</span> y <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">double</span><span style="color: #333333">[</span>MAXN<span style="color: #333333">];</span>
        
        <span style="color: #888888">// first pass: read in data, compute xbar and ybar</span>
        <span style="color: #333399; font-weight: bold">double</span> sumx <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">,</span> sumy <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">,</span> sumx2 <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">=</span> i<span style="color: #333333">;</span>
            y<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">=</span> Double<span style="color: #333333">.</span><span style="color: #0000CC">parseDouble</span><span style="color: #333333">(</span>serie<span style="color: #333333">[</span>i<span style="color: #333333">].</span><span style="color: #0000CC">toString</span><span style="color: #333333">());</span>
            sumx  <span style="color: #333333">+=</span> x<span style="color: #333333">[</span>i<span style="color: #333333">];</span>
            sumx2 <span style="color: #333333">+=</span> x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">*</span> x<span style="color: #333333">[</span>i<span style="color: #333333">];</span>
            sumy  <span style="color: #333333">+=</span> y<span style="color: #333333">[</span>i<span style="color: #333333">];</span>
        <span style="color: #333333">}</span>
        <span style="color: #333399; font-weight: bold">double</span> xbar <span style="color: #333333">=</span> sumx <span style="color: #333333">/</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> ybar <span style="color: #333333">=</span> sumy <span style="color: #333333">/</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span>

        <span style="color: #888888">// second pass: compute summary statistics</span>
        <span style="color: #333399; font-weight: bold">double</span> xxbar <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">,</span> yybar <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">,</span> xybar <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            xxbar <span style="color: #333333">+=</span> <span style="color: #333333">(</span>x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> xbar<span style="color: #333333">)</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> xbar<span style="color: #333333">);</span>
            yybar <span style="color: #333333">+=</span> <span style="color: #333333">(</span>y<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> ybar<span style="color: #333333">)</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>y<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> ybar<span style="color: #333333">);</span>
            xybar <span style="color: #333333">+=</span> <span style="color: #333333">(</span>x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> xbar<span style="color: #333333">)</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>y<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">-</span> ybar<span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
        <span style="color: #333399; font-weight: bold">double</span> beta1 <span style="color: #333333">=</span> xybar <span style="color: #333333">/</span> xxbar<span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> beta0 <span style="color: #333333">=</span> ybar <span style="color: #333333">-</span> beta1 <span style="color: #333333">*</span> xbar<span style="color: #333333">;</span>

        <span style="color: #888888">// print results</span>
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;y   = &quot;</span> <span style="color: #333333">+</span> beta1 <span style="color: #333333">+</span> <span style="background-color: #fff0f0">&quot; * x + &quot;</span> <span style="color: #333333">+</span> beta0<span style="color: #333333">);</span>

        <span style="color: #888888">// analyze results</span>
        <span style="color: #333399; font-weight: bold">int</span> df <span style="color: #333333">=</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">-</span> <span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> rss <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">;</span>      <span style="color: #888888">// residual sum of squares</span>
        <span style="color: #333399; font-weight: bold">double</span> ssr <span style="color: #333333">=</span> <span style="color: #6600EE; font-weight: bold">0.0</span><span style="color: #333333">;</span>      <span style="color: #888888">// regression sum of squares</span>
        <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
            <span style="color: #333399; font-weight: bold">double</span> fit <span style="color: #333333">=</span> beta1<span style="color: #333333">*</span>x<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">+</span> beta0<span style="color: #333333">;</span>
            rss <span style="color: #333333">+=</span> <span style="color: #333333">(</span>fit <span style="color: #333333">-</span> y<span style="color: #333333">[</span>i<span style="color: #333333">])</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>fit <span style="color: #333333">-</span> y<span style="color: #333333">[</span>i<span style="color: #333333">]);</span>
            ssr <span style="color: #333333">+=</span> <span style="color: #333333">(</span>fit <span style="color: #333333">-</span> ybar<span style="color: #333333">)</span> <span style="color: #333333">*</span> <span style="color: #333333">(</span>fit <span style="color: #333333">-</span> ybar<span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
        <span style="color: #333399; font-weight: bold">double</span> R2    <span style="color: #333333">=</span> ssr <span style="color: #333333">/</span> yybar<span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> svar  <span style="color: #333333">=</span> rss <span style="color: #333333">/</span> df<span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> svar1 <span style="color: #333333">=</span> svar <span style="color: #333333">/</span> xxbar<span style="color: #333333">;</span>
        <span style="color: #333399; font-weight: bold">double</span> svar0 <span style="color: #333333">=</span> svar<span style="color: #333333">/</span>serie<span style="color: #333333">.</span><span style="color: #0000CC">length</span> <span style="color: #333333">+</span> xbar<span style="color: #333333">*</span>xbar<span style="color: #333333">*</span>svar1<span style="color: #333333">;</span>
        
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;R^2                 = &quot;</span> <span style="color: #333333">+</span> R2<span style="color: #333333">);</span>
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;std error of beta_1 = &quot;</span> <span style="color: #333333">+</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">sqrt</span><span style="color: #333333">(</span>svar1<span style="color: #333333">));</span>
        System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;std error of beta_0 = &quot;</span> <span style="color: #333333">+</span> Math<span style="color: #333333">.</span><span style="color: #0000CC">sqrt</span><span style="color: #333333">(</span>svar0<span style="color: #333333">));</span>
        svar0 = svar * sumx2 / (serie.length * xxbar);
        System.out.println("std error of beta_0 = " + Math.sqrt(svar0));

        System.out.println("SSTO = " + yybar);
        System.out.println("SSE  = " + rss);
        System.out.println("SSR  = " + ssr);
        
    }
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        Double<span style="color: #333333">[]</span> serie <span style="color: #333333">=</span> <span style="color: #333333">{</span><span style="color: #6600EE; font-weight: bold">100.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">22.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">55.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">10.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">5.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">66.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">71.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">8.0</span><span style="color: #333333">,</span><span style="color: #6600EE; font-weight: bold">91.0</span><span style="color: #333333">};</span>
        SerieTemporelle serieTemporelle <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> SerieTemporelle<span style="color: #333333">(</span>serie<span style="color: #333333">);</span>
        serieTemporelle<span style="color: #333333">.</span><span style="color: #0000CC">calculerRegressionLineaire</span><span style="color: #333333">();</span>
       
    <span style="color: #333333">}</span>
    
    
<span style="color: #333333">}</span>
</pre></div>

<h2>Question 4</h2>
<p>À partir du code suivant, veuillez en extraire une classe supérieure qui sera héritée et deux interfaces :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">VoitureEssence</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">boolean</span> <span style="color: #0066BB; font-weight: bold">isRunning</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">return</span> <span style="color: #008800; font-weight: bold">false</span><span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">addGaz</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> litres<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">double</span> <span style="color: #0066BB; font-weight: bold">getSpeed</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">return</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">VoitureElectrique</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">boolean</span> <span style="color: #0066BB; font-weight: bold">isRunning</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">return</span> <span style="color: #008800; font-weight: bold">false</span><span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">chargeBattery</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> mah<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">double</span> <span style="color: #0066BB; font-weight: bold">getSpeed</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">return</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>

<details><summary>Réponse</summary>
<div>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Voiture</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">boolean</span> <span style="color: #0066BB; font-weight: bold">isRunning</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">return</span> <span style="color: #008800; font-weight: bold">false</span><span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">double</span> <span style="color: #0066BB; font-weight: bold">getSpeed</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">return</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">VoitureElectrique</span> <span style="color: #008800; font-weight: bold">extends</span> Voiture <span style="color: #008800; font-weight: bold">implements</span> MoteurElectrique <span style="color: #333333">{</span>
    
    
    <span style='color:#555555; font-weight: bold'>@Override</span>
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">chargeBattery</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> mah<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>
    
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">VoitureEssence</span> <span style="color: #008800; font-weight: bold">extends</span> Voiture <span style="color: #008800; font-weight: bold">implements</span> MoteurEssence <span style="color: #333333">{</span>
       
    <span style='color:#555555; font-weight: bold'>@Override</span>
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">addGaz</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> litres<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>

    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">interface</span> <span style="color: #BB0066; font-weight: bold">MoteurElectrique</span> <span style="color: #333333">{</span>

    <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">chargeBattery</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> mah<span style="color: #333333">);</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">interface</span> <span style="color: #BB0066; font-weight: bold">MoteurEssence</span> <span style="color: #333333">{</span>

    <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">addGaz</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> litres<span style="color: #333333">);</span>
    
<span style="color: #333333">}</span>
</pre></div>

<h2>Question 5</h2>
<p>Dans le code ci-dessous, quel est le type de polymorphisme utilisé?</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe1</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">(</span>String arg<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">(</span>StringBuffer arg<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>


<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Il s'agit du polymorphisme ad hoc.
</div>
</div>

<h2>Question 6</h2>
<p>Dans le code ci-dessous, quel est le type de polymorphisme utilisé?</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe1</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>

    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe2</span> <span style="color: #008800; font-weight: bold">extends</span> Classe1 <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>

    <span style="color: #333333">}</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span>  <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
             
        Classe2 uneClase <span style='color:#333333'>=</span> <span style='color:#008800; font-weight:bold'>new</span> Classe2<span style='color:#333333'>();</span>
        <span style='color:#333333'>((</span>Classe1<span style='color:#333333'>)</span> uneClase<span style='color:#333333'>).</span><span style='color:#0000CC'>uneMethode</span><span style='color:#333333'>();</span>
    <span style='color:#333333'>}</span>
    
<span style="color: #333333">}</span>
</pre></div>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Il s'agit du polymorphisme par héritage (ou d'héritage).
</div>
</div>


<h2>Question 7</h2>

<p>Considérons la classe Point suivante :</p>
<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Point <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> Point <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>int</span> abs<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>int</span> ord<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    x <span style='color:#808030; '>=</span> abs <span style='color:#800080; '>;</span> y <span style='color:#808030; '>=</span> ord <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>void</span> deplace <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>int</span> dx<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>byte</span> dy<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    x <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dx <span style='color:#800080; '>;</span> y <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dy <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>void</span> deplace <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>byte</span> dx<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>int</span> dy<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
   x <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dx <span style='color:#800080; '>;</span> y <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dy <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>int</span> x<span style='color:#808030; '>,</span> y<span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2023-01-14 17:33:30 UTC -->

<p></p>
<ol>
  <li>On voit que la classe Point a deux méthodes qui portent le même nom :
    Quelle technique est mise en &#x153;uvre pour y parvenir ici ?</li>
  <li>Quel est le résultat de la compilation de chacune des deux classes
    suivantes ? Expliquez chacun de ces résultats.</li>
</ol>

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Test1 <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#800000; font-weight:bold; '>void</span> main <span style='color:#808030; '>(</span>String args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span>
         <span style='color:#800080; '>{</span><span style='color:#800000; font-weight:bold; '>int</span> n<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span> <span style='color:#800000; font-weight:bold; '>byte</span> b<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span>
         Point a <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> Point<span style='color:#808030; '>(</span>n<span style='color:#808030; '>,</span>n<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
         a<span style='color:#808030; '>.</span>deplace<span style='color:#808030; '>(</span>b<span style='color:#808030; '>,</span> b<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2023-01-14 17:34:47 UTC -->

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Test2 <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#800000; font-weight:bold; '>void</span> main <span style='color:#808030; '>(</span>String args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
         <span style='color:#800000; font-weight:bold; '>int</span> n<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span> <span style='color:#800000; font-weight:bold; '>byte</span> b<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span>
         Point a <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> Point<span style='color:#808030; '>(</span>n<span style='color:#808030; '>,</span>n<span style='color:#808030; '>)</span> <span style='color:#800080; '>;</span>
         a<span style='color:#808030; '>.</span>deplace <span style='color:#808030; '>(</span><span style='color:#008c00; '>2</span><span style='color:#808030; '>*</span>b<span style='color:#808030; '>,</span> b<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<ol>
  <li style="text-align:justify;">Il s&#x2019;agit de la surdéfinition ou
    surcharge, car les deux méthodes ont des signatures différentes.</li>
  <li style="text-align:justify;">Test1 génère une erreur de compilation à
    cause de l&#x2019;ambiguïté dans le choix de la méthode deplace à appeler.
    Cette ambiguïté est liée au fait que chacune des deux méthodes peut être
    appelée, compte tenu des conversions implicites de byte en int. Test2
    compile normalement, l&#x2019;ambiguïté soulignée ci-dessus est levée par
    le fait que 2*b force d&#x2019;office la conversion du premier paramètre
    réel en int, et donc c&#x2019;est la méthode déplace (int dx, byte dy) qui
    est appelée.</li>
</ol>
</div>
</div>


<h2>Question 8</h2>

<p>On suppose qu&#x2019;il existe une classe A dotée d&#x2019;un constructeur
par défaut.</p>

<p>Soient les trois instructions suivantes :</p>

<pre style='color:#000000;background:#ffffff;'>A a = new A() <span style='color:#808030; '>;</span>
Object o = new Object()<span style='color:#808030; '>;</span>
o=a<span style='color:#808030; '>;</span>
</pre>

<p>A l&#x2019;issue de ces trois instructions, on a :</p>
<ol>
  <li>deux variables de même type et contenant les mêmes références ;</li>
  <li>deux variables de type différent contenant les mêmes références ;</li>
  <li>deux variables de même type contenant des références différentes ;</li>
  <li>rien de tout cela car une erreur est générée.</li>
</ol>
<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Bonne réponse : 2. </p>

</div>
</div>


<h2>Question 9</h2>

<p>On dispose d&#x2019;une interface I mettant en oeuvre plusieurs méthodes. Soit</p>

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>interface</span> I <span style='color:#800080; '>{</span>
  <span style='color:#bb7977; '>void</span> methode1<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode2<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode3<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode4<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>
</pre>

<p style="text-align:justify;">On voudrait faire partager cette interface par
deux classes ClasseA et ClasseB pouvant être regroupées dans une classe de base
ClasseDeBase et partageant au moins une méthode (methodeDifferee) présente dans
cette classe de base mais non encore définie. De plus, ClasseA ne doit
implementer que methode1 et methode2 de I, alors que ClasseB doit implémenter
methode3 et methode4 de I.</p>

<p>Un programmeur songe à la solution suivante :</p><pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>abstract</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseDeBase<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>abstract</span> <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>



<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseA <span style='color:#800000; font-weight:bold; '>extends</span> ClasseDeBase <span style='color:#800000; font-weight:bold; '>implements</span> I<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de la méthode différée ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>

<span style='color:#bb7977; '>void</span> methode1<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode1 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>

<span style='color:#bb7977; '>void</span> methode2<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode2 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>

 

<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseB <span style='color:#800000; font-weight:bold; '>extends</span> ClasseDeBase <span style='color:#800000; font-weight:bold; '>implements</span> I<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de la méthode différée ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#bb7977; '>void</span> methode3<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode3 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#bb7977; '>void</span> methode4<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode4 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre></div>

<h2>Question 5</h2>
<p>Dans le code ci-dessous, quel est le type de polymorphisme utilisé?</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe1</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">(</span>String arg<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">(</span>StringBuffer arg<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>


<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Il s'agit du polymorphisme ad hoc.
</div>
</div>

<h2>Question 6</h2>
<p>Dans le code ci-dessous, quel est le type de polymorphisme utilisé?</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe1</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>

    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe2</span> <span style="color: #008800; font-weight: bold">extends</span> Classe1 <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>

    <span style="color: #333333">}</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span>  <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
             
        Classe2 uneClase <span style='color:#333333'>=</span> <span style='color:#008800; font-weight:bold'>new</span> Classe2<span style='color:#333333'>();</span>
        <span style='color:#333333'>((</span>Classe1<span style='color:#333333'>)</span> uneClase<span style='color:#333333'>).</span><span style='color:#0000CC'>uneMethode</span><span style='color:#333333'>();</span>
    <span style='color:#333333'>}</span>
    
<span style="color: #333333">}</span>
</pre></div>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Il s'agit du polymorphisme par héritage (ou d'héritage).
</div>
</div>


<h2>Question 7</h2>

<p>Considérons la classe Point suivante :</p>
<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Point <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> Point <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>int</span> abs<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>int</span> ord<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    x <span style='color:#808030; '>=</span> abs <span style='color:#800080; '>;</span> y <span style='color:#808030; '>=</span> ord <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>void</span> deplace <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>int</span> dx<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>byte</span> dy<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    x <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dx <span style='color:#800080; '>;</span> y <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dy <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>void</span> deplace <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>byte</span> dx<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>int</span> dy<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
   x <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dx <span style='color:#800080; '>;</span> y <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dy <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>int</span> x<span style='color:#808030; '>,</span> y<span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2023-01-14 17:33:30 UTC -->

<p></p>
<ol>
  <li>On voit que la classe Point a deux méthodes qui portent le même nom :
    Quelle technique est mise en &#x153;uvre pour y parvenir ici ?</li>
  <li>Quel est le résultat de la compilation de chacune des deux classes
    suivantes ? Expliquez chacun de ces résultats.</li>
</ol>

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Test1 <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#800000; font-weight:bold; '>void</span> main <span style='color:#808030; '>(</span>String args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span>
         <span style='color:#800080; '>{</span><span style='color:#800000; font-weight:bold; '>int</span> n<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span> <span style='color:#800000; font-weight:bold; '>byte</span> b<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span>
         Point a <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> Point<span style='color:#808030; '>(</span>n<span style='color:#808030; '>,</span>n<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
         a<span style='color:#808030; '>.</span>deplace<span style='color:#808030; '>(</span>b<span style='color:#808030; '>,</span> b<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2023-01-14 17:34:47 UTC -->

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Test2 <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#800000; font-weight:bold; '>void</span> main <span style='color:#808030; '>(</span>String args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
         <span style='color:#800000; font-weight:bold; '>int</span> n<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span> <span style='color:#800000; font-weight:bold; '>byte</span> b<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span>
         Point a <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> Point<span style='color:#808030; '>(</span>n<span style='color:#808030; '>,</span>n<span style='color:#808030; '>)</span> <span style='color:#800080; '>;</span>
         a<span style='color:#808030; '>.</span>deplace <span style='color:#808030; '>(</span><span style='color:#008c00; '>2</span><span style='color:#808030; '>*</span>b<span style='color:#808030; '>,</span> b<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<ol>
  <li style="text-align:justify;">Il s&#x2019;agit de la surdéfinition ou
    surcharge, car les deux méthodes ont des signatures différentes.</li>
  <li style="text-align:justify;">Test1 génère une erreur de compilation à
    cause de l&#x2019;ambiguïté dans le choix de la méthode deplace à appeler.
    Cette ambiguïté est liée au fait que chacune des deux méthodes peut être
    appelée, compte tenu des conversions implicites de byte en int. Test2
    compile normalement, l&#x2019;ambiguïté soulignée ci-dessus est levée par
    le fait que 2*b force d&#x2019;office la conversion du premier paramètre
    réel en int, et donc c&#x2019;est la méthode déplace (int dx, byte dy) qui
    est appelée.</li>
</ol>
</div>
</div>


<h2>Question 8</h2>

<p>On suppose qu&#x2019;il existe une classe A dotée d&#x2019;un constructeur
par défaut.</p>

<p>Soient les trois instructions suivantes :</p>

<pre style='color:#000000;background:#ffffff;'>A a = new A() <span style='color:#808030; '>;</span>
Object o = new Object()<span style='color:#808030; '>;</span>
o=a<span style='color:#808030; '>;</span>
</pre>

<p>A l&#x2019;issue de ces trois instructions, on a :</p>
<ol>
  <li>deux variables de même type et contenant les mêmes références ;</li>
  <li>deux variables de type différent contenant les mêmes références ;</li>
  <li>deux variables de même type contenant des références différentes ;</li>
  <li>rien de tout cela car une erreur est générée.</li>
</ol>
<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Bonne réponse : 2. </p>

</div>
</div>


<h2>Question 9</h2>

<p>On dispose d&#x2019;une interface I mettant en oeuvre plusieurs méthodes. Soit</p>

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>interface</span> I <span style='color:#800080; '>{</span>
  <span style='color:#bb7977; '>void</span> methode1<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode2<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode3<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode4<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>
</pre>

<p style="text-align:justify;">On voudrait faire partager cette interface par
deux classes ClasseA et ClasseB pouvant être regroupées dans une classe de base
ClasseDeBase et partageant au moins une méthode (methodeDifferee) présente dans
cette classe de base mais non encore définie. De plus, ClasseA ne doit
implementer que methode1 et methode2 de I, alors que ClasseB doit implémenter
methode3 et methode4 de I.</p>

<p>Un programmeur songe à la solution suivante :</p><pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>abstract</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseDeBase<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>abstract</span> <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>



<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseA <span style='color:#800000; font-weight:bold; '>extends</span> ClasseDeBase <span style='color:#800000; font-weight:bold; '>implements</span> I<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de la méthode différée ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>

<span style='color:#bb7977; '>void</span> methode1<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode1 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>

<span style='color:#bb7977; '>void</span> methode2<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode2 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>

 

<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseB <span style='color:#800000; font-weight:bold; '>extends</span> ClasseDeBase <span style='color:#800000; font-weight:bold; '>implements</span> I<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de la méthode différée ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#bb7977; '>void</span> methode3<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode3 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#bb7977; '>void</span> methode4<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode4 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre></div>

<h2>Question 5</h2>
<p>Dans le code ci-dessous, quel est le type de polymorphisme utilisé?</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe1</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">(</span>String arg<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">(</span>StringBuffer arg<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>


<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Il s'agit du polymorphisme ad hoc.
</div>
</div>

<h2>Question 6</h2>
<p>Dans le code ci-dessous, quel est le type de polymorphisme utilisé?</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe1</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>

    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe2</span> <span style="color: #008800; font-weight: bold">extends</span> Classe1 <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>

    <span style="color: #333333">}</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span>  <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
             
        Classe2 uneClase <span style='color:#333333'>=</span> <span style='color:#008800; font-weight:bold'>new</span> Classe2<span style='color:#333333'>();</span>
        <span style='color:#333333'>((</span>Classe1<span style='color:#333333'>)</span> uneClase<span style='color:#333333'>).</span><span style='color:#0000CC'>uneMethode</span><span style='color:#333333'>();</span>
    <span style='color:#333333'>}</span>
    
<span style="color: #333333">}</span>
</pre></div>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Il s'agit du polymorphisme par héritage (ou d'héritage).
</div>
</div>


<h2>Question 7</h2>

<p>Considérons la classe Point suivante :</p>
<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Point <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> Point <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>int</span> abs<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>int</span> ord<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    x <span style='color:#808030; '>=</span> abs <span style='color:#800080; '>;</span> y <span style='color:#808030; '>=</span> ord <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>void</span> deplace <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>int</span> dx<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>byte</span> dy<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    x <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dx <span style='color:#800080; '>;</span> y <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dy <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>void</span> deplace <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>byte</span> dx<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>int</span> dy<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
   x <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dx <span style='color:#800080; '>;</span> y <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dy <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>int</span> x<span style='color:#808030; '>,</span> y<span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2023-01-14 17:33:30 UTC -->

<p></p>
<ol>
  <li>On voit que la classe Point a deux méthodes qui portent le même nom :
    Quelle technique est mise en &#x153;uvre pour y parvenir ici ?</li>
  <li>Quel est le résultat de la compilation de chacune des deux classes
    suivantes ? Expliquez chacun de ces résultats.</li>
</ol>

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Test1 <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#800000; font-weight:bold; '>void</span> main <span style='color:#808030; '>(</span>String args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span>
         <span style='color:#800080; '>{</span><span style='color:#800000; font-weight:bold; '>int</span> n<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span> <span style='color:#800000; font-weight:bold; '>byte</span> b<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span>
         Point a <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> Point<span style='color:#808030; '>(</span>n<span style='color:#808030; '>,</span>n<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
         a<span style='color:#808030; '>.</span>deplace<span style='color:#808030; '>(</span>b<span style='color:#808030; '>,</span> b<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2023-01-14 17:34:47 UTC -->

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Test2 <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#800000; font-weight:bold; '>void</span> main <span style='color:#808030; '>(</span>String args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
         <span style='color:#800000; font-weight:bold; '>int</span> n<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span> <span style='color:#800000; font-weight:bold; '>byte</span> b<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span>
         Point a <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> Point<span style='color:#808030; '>(</span>n<span style='color:#808030; '>,</span>n<span style='color:#808030; '>)</span> <span style='color:#800080; '>;</span>
         a<span style='color:#808030; '>.</span>deplace <span style='color:#808030; '>(</span><span style='color:#008c00; '>2</span><span style='color:#808030; '>*</span>b<span style='color:#808030; '>,</span> b<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<ol>
  <li style="text-align:justify;">Il s&#x2019;agit de la surdéfinition ou
    surcharge, car les deux méthodes ont des signatures différentes.</li>
  <li style="text-align:justify;">Test1 génère une erreur de compilation à
    cause de l&#x2019;ambiguïté dans le choix de la méthode deplace à appeler.
    Cette ambiguïté est liée au fait que chacune des deux méthodes peut être
    appelée, compte tenu des conversions implicites de byte en int. Test2
    compile normalement, l&#x2019;ambiguïté soulignée ci-dessus est levée par
    le fait que 2*b force d&#x2019;office la conversion du premier paramètre
    réel en int, et donc c&#x2019;est la méthode déplace (int dx, byte dy) qui
    est appelée.</li>
</ol>
</div>
</div>


<h2>Question 8</h2>

<p>On suppose qu&#x2019;il existe une classe A dotée d&#x2019;un constructeur
par défaut.</p>

<p>Soient les trois instructions suivantes :</p>

<pre style='color:#000000;background:#ffffff;'>A a = new A() <span style='color:#808030; '>;</span>
Object o = new Object()<span style='color:#808030; '>;</span>
o=a<span style='color:#808030; '>;</span>
</pre>

<p>A l&#x2019;issue de ces trois instructions, on a :</p>
<ol>
  <li>deux variables de même type et contenant les mêmes références ;</li>
  <li>deux variables de type différent contenant les mêmes références ;</li>
  <li>deux variables de même type contenant des références différentes ;</li>
  <li>rien de tout cela car une erreur est générée.</li>
</ol>
<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Bonne réponse : 2. </p>

</div>
</div>


<h2>Question 9</h2>

<p>On dispose d&#x2019;une interface I mettant en oeuvre plusieurs méthodes. Soit</p>

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>interface</span> I <span style='color:#800080; '>{</span>
  <span style='color:#bb7977; '>void</span> methode1<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode2<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode3<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode4<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>
</pre>

<p style="text-align:justify;">On voudrait faire partager cette interface par
deux classes ClasseA et ClasseB pouvant être regroupées dans une classe de base
ClasseDeBase et partageant au moins une méthode (methodeDifferee) présente dans
cette classe de base mais non encore définie. De plus, ClasseA ne doit
implementer que methode1 et methode2 de I, alors que ClasseB doit implémenter
methode3 et methode4 de I.</p>

<p>Un programmeur songe à la solution suivante :</p><pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>abstract</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseDeBase<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>abstract</span> <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>



<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseA <span style='color:#800000; font-weight:bold; '>extends</span> ClasseDeBase <span style='color:#800000; font-weight:bold; '>implements</span> I<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de la méthode différée ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>

<span style='color:#bb7977; '>void</span> methode1<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode1 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>

<span style='color:#bb7977; '>void</span> methode2<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode2 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>

 

<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseB <span style='color:#800000; font-weight:bold; '>extends</span> ClasseDeBase <span style='color:#800000; font-weight:bold; '>implements</span> I<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de la méthode différée ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#bb7977; '>void</span> methode3<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode3 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#bb7977; '>void</span> methode4<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode4 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre></div>

<h2>Question 5</h2>
<p>Dans le code ci-dessous, quel est le type de polymorphisme utilisé?</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe1</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">(</span>String arg<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">(</span>StringBuffer arg<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>


<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Il s'agit du polymorphisme ad hoc.
</div>
</div>

<h2>Question 6</h2>
<p>Dans le code ci-dessous, quel est le type de polymorphisme utilisé?</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe1</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>

    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe2</span> <span style="color: #008800; font-weight: bold">extends</span> Classe1 <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>

    <span style="color: #333333">}</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span>  <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
             
        Classe2 uneClase <span style='color:#333333'>=</span> <span style='color:#008800; font-weight:bold'>new</span> Classe2<span style='color:#333333'>();</span>
        <span style='color:#333333'>((</span>Classe1<span style='color:#333333'>)</span> uneClase<span style='color:#333333'>).</span><span style='color:#0000CC'>uneMethode</span><span style='color:#333333'>();</span>
    <span style='color:#333333'>}</span>
    
<span style="color: #333333">}</span>
</pre></div>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Il s'agit du polymorphisme par héritage (ou d'héritage).
</div>
</div>


<h2>Question 7</h2>

<p>Considérons la classe Point suivante :</p>
<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Point <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> Point <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>int</span> abs<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>int</span> ord<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    x <span style='color:#808030; '>=</span> abs <span style='color:#800080; '>;</span> y <span style='color:#808030; '>=</span> ord <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>void</span> deplace <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>int</span> dx<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>byte</span> dy<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    x <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dx <span style='color:#800080; '>;</span> y <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dy <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>void</span> deplace <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>byte</span> dx<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>int</span> dy<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
   x <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dx <span style='color:#800080; '>;</span> y <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dy <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>int</span> x<span style='color:#808030; '>,</span> y<span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2023-01-14 17:33:30 UTC -->

<p></p>
<ol>
  <li>On voit que la classe Point a deux méthodes qui portent le même nom :
    Quelle technique est mise en &#x153;uvre pour y parvenir ici ?</li>
  <li>Quel est le résultat de la compilation de chacune des deux classes
    suivantes ? Expliquez chacun de ces résultats.</li>
</ol>

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Test1 <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#800000; font-weight:bold; '>void</span> main <span style='color:#808030; '>(</span>String args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span>
         <span style='color:#800080; '>{</span><span style='color:#800000; font-weight:bold; '>int</span> n<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span> <span style='color:#800000; font-weight:bold; '>byte</span> b<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span>
         Point a <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> Point<span style='color:#808030; '>(</span>n<span style='color:#808030; '>,</span>n<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
         a<span style='color:#808030; '>.</span>deplace<span style='color:#808030; '>(</span>b<span style='color:#808030; '>,</span> b<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2023-01-14 17:34:47 UTC -->

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Test2 <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#800000; font-weight:bold; '>void</span> main <span style='color:#808030; '>(</span>String args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
         <span style='color:#800000; font-weight:bold; '>int</span> n<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span> <span style='color:#800000; font-weight:bold; '>byte</span> b<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span>
         Point a <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> Point<span style='color:#808030; '>(</span>n<span style='color:#808030; '>,</span>n<span style='color:#808030; '>)</span> <span style='color:#800080; '>;</span>
         a<span style='color:#808030; '>.</span>deplace <span style='color:#808030; '>(</span><span style='color:#008c00; '>2</span><span style='color:#808030; '>*</span>b<span style='color:#808030; '>,</span> b<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<ol>
  <li style="text-align:justify;">Il s&#x2019;agit de la surdéfinition ou
    surcharge, car les deux méthodes ont des signatures différentes.</li>
  <li style="text-align:justify;">Test1 génère une erreur de compilation à
    cause de l&#x2019;ambiguïté dans le choix de la méthode deplace à appeler.
    Cette ambiguïté est liée au fait que chacune des deux méthodes peut être
    appelée, compte tenu des conversions implicites de byte en int. Test2
    compile normalement, l&#x2019;ambiguïté soulignée ci-dessus est levée par
    le fait que 2*b force d&#x2019;office la conversion du premier paramètre
    réel en int, et donc c&#x2019;est la méthode déplace (int dx, byte dy) qui
    est appelée.</li>
</ol>
</div>
</div>


<h2>Question 8</h2>

<p>On suppose qu&#x2019;il existe une classe A dotée d&#x2019;un constructeur
par défaut.</p>

<p>Soient les trois instructions suivantes :</p>

<pre style='color:#000000;background:#ffffff;'>A a = new A() <span style='color:#808030; '>;</span>
Object o = new Object()<span style='color:#808030; '>;</span>
o=a<span style='color:#808030; '>;</span>
</pre>

<p>A l&#x2019;issue de ces trois instructions, on a :</p>
<ol>
  <li>deux variables de même type et contenant les mêmes références ;</li>
  <li>deux variables de type différent contenant les mêmes références ;</li>
  <li>deux variables de même type contenant des références différentes ;</li>
  <li>rien de tout cela car une erreur est générée.</li>
</ol>
<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Bonne réponse : 2. </p>

</div>
</div>


<h2>Question 9</h2>

<p>On dispose d&#x2019;une interface I mettant en oeuvre plusieurs méthodes. Soit</p>

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>interface</span> I <span style='color:#800080; '>{</span>
  <span style='color:#bb7977; '>void</span> methode1<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode2<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode3<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode4<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>
</pre>

<p style="text-align:justify;">On voudrait faire partager cette interface par
deux classes ClasseA et ClasseB pouvant être regroupées dans une classe de base
ClasseDeBase et partageant au moins une méthode (methodeDifferee) présente dans
cette classe de base mais non encore définie. De plus, ClasseA ne doit
implementer que methode1 et methode2 de I, alors que ClasseB doit implémenter
methode3 et methode4 de I.</p>

<p>Un programmeur songe à la solution suivante :</p><pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>abstract</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseDeBase<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>abstract</span> <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>



<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseA <span style='color:#800000; font-weight:bold; '>extends</span> ClasseDeBase <span style='color:#800000; font-weight:bold; '>implements</span> I<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de la méthode différée ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>

<span style='color:#bb7977; '>void</span> methode1<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode1 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>

<span style='color:#bb7977; '>void</span> methode2<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode2 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>

 

<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseB <span style='color:#800000; font-weight:bold; '>extends</span> ClasseDeBase <span style='color:#800000; font-weight:bold; '>implements</span> I<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de la méthode différée ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#bb7977; '>void</span> methode3<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode3 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#bb7977; '>void</span> methode4<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode4 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre></div>

<h2>Question 5</h2>
<p>Dans le code ci-dessous, quel est le type de polymorphisme utilisé?</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe1</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">(</span>String arg<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">(</span>StringBuffer arg<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>


<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Il s'agit du polymorphisme ad hoc.
</div>
</div>

<h2>Question 6</h2>
<p>Dans le code ci-dessous, quel est le type de polymorphisme utilisé?</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe1</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>

    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Classe2</span> <span style="color: #008800; font-weight: bold">extends</span> Classe1 <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">uneMethode</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>

    <span style="color: #333333">}</span>

    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span>  <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
             
        Classe2 uneClase <span style='color:#333333'>=</span> <span style='color:#008800; font-weight:bold'>new</span> Classe2<span style='color:#333333'>();</span>
        <span style='color:#333333'>((</span>Classe1<span style='color:#333333'>)</span> uneClase<span style='color:#333333'>).</span><span style='color:#0000CC'>uneMethode</span><span style='color:#333333'>();</span>
    <span style='color:#333333'>}</span>
    
<span style="color: #333333">}</span>
</pre></div>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Il s'agit du polymorphisme par héritage (ou d'héritage).
</div>
</div>


<h2>Question 7</h2>

<p>Considérons la classe Point suivante :</p>
<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Point <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> Point <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>int</span> abs<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>int</span> ord<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    x <span style='color:#808030; '>=</span> abs <span style='color:#800080; '>;</span> y <span style='color:#808030; '>=</span> ord <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>void</span> deplace <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>int</span> dx<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>byte</span> dy<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    x <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dx <span style='color:#800080; '>;</span> y <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dy <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>void</span> deplace <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>byte</span> dx<span style='color:#808030; '>,</span> <span style='color:#800000; font-weight:bold; '>int</span> dy<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
   x <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dx <span style='color:#800080; '>;</span> y <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> dy <span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  <span style='color:#800000; font-weight:bold; '>int</span> x<span style='color:#808030; '>,</span> y<span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2023-01-14 17:33:30 UTC -->

<p></p>
<ol>
  <li>On voit que la classe Point a deux méthodes qui portent le même nom :
    Quelle technique est mise en &#x153;uvre pour y parvenir ici ?</li>
  <li>Quel est le résultat de la compilation de chacune des deux classes
    suivantes ? Expliquez chacun de ces résultats.</li>
</ol>

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Test1 <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#800000; font-weight:bold; '>void</span> main <span style='color:#808030; '>(</span>String args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span>
         <span style='color:#800080; '>{</span><span style='color:#800000; font-weight:bold; '>int</span> n<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span> <span style='color:#800000; font-weight:bold; '>byte</span> b<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span>
         Point a <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> Point<span style='color:#808030; '>(</span>n<span style='color:#808030; '>,</span>n<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
         a<span style='color:#808030; '>.</span>deplace<span style='color:#808030; '>(</span>b<span style='color:#808030; '>,</span> b<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2023-01-14 17:34:47 UTC -->

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Test2 <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#800000; font-weight:bold; '>void</span> main <span style='color:#808030; '>(</span>String args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
         <span style='color:#800000; font-weight:bold; '>int</span> n<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span> <span style='color:#800000; font-weight:bold; '>byte</span> b<span style='color:#808030; '>=</span><span style='color:#008c00; '>1</span><span style='color:#800080; '>;</span>
         Point a <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> Point<span style='color:#808030; '>(</span>n<span style='color:#808030; '>,</span>n<span style='color:#808030; '>)</span> <span style='color:#800080; '>;</span>
         a<span style='color:#808030; '>.</span>deplace <span style='color:#808030; '>(</span><span style='color:#008c00; '>2</span><span style='color:#808030; '>*</span>b<span style='color:#808030; '>,</span> b<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<ol>
  <li style="text-align:justify;">Il s&#x2019;agit de la surdéfinition ou
    surcharge, car les deux méthodes ont des signatures différentes.</li>
  <li style="text-align:justify;">Test1 génère une erreur de compilation à
    cause de l&#x2019;ambiguïté dans le choix de la méthode deplace à appeler.
    Cette ambiguïté est liée au fait que chacune des deux méthodes peut être
    appelée, compte tenu des conversions implicites de byte en int. Test2
    compile normalement, l&#x2019;ambiguïté soulignée ci-dessus est levée par
    le fait que 2*b force d&#x2019;office la conversion du premier paramètre
    réel en int, et donc c&#x2019;est la méthode déplace (int dx, byte dy) qui
    est appelée.</li>
</ol>
</div>
</div>


<h2>Question 8</h2>

<p>On suppose qu&#x2019;il existe une classe A dotée d&#x2019;un constructeur
par défaut.</p>

<p>Soient les trois instructions suivantes :</p>

<pre style='color:#000000;background:#ffffff;'>A a = new A() <span style='color:#808030; '>;</span>
Object o = new Object()<span style='color:#808030; '>;</span>
o=a<span style='color:#808030; '>;</span>
</pre>

<p>A l&#x2019;issue de ces trois instructions, on a :</p>
<ol>
  <li>deux variables de même type et contenant les mêmes références ;</li>
  <li>deux variables de type différent contenant les mêmes références ;</li>
  <li>deux variables de même type contenant des références différentes ;</li>
  <li>rien de tout cela car une erreur est générée.</li>
</ol>
<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Bonne réponse : 2. </p>

</div>
</div>


<h2>Question 9</h2>

<p>On dispose d&#x2019;une interface I mettant en oeuvre plusieurs méthodes. Soit</p>

<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>interface</span> I <span style='color:#800080; '>{</span>
  <span style='color:#bb7977; '>void</span> methode1<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode2<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode3<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#bb7977; '>void</span> methode4<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>
</pre>

<p style="text-align:justify;">On voudrait faire partager cette interface par
deux classes ClasseA et ClasseB pouvant être regroupées dans une classe de base
ClasseDeBase et partageant au moins une méthode (methodeDifferee) présente dans
cette classe de base mais non encore définie. De plus, ClasseA ne doit
implementer que methode1 et methode2 de I, alors que ClasseB doit implémenter
methode3 et methode4 de I.</p>

<p>Un programmeur songe à la solution suivante :</p><pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>abstract</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseDeBase<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>abstract</span> <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>



<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseA <span style='color:#800000; font-weight:bold; '>extends</span> ClasseDeBase <span style='color:#800000; font-weight:bold; '>implements</span> I<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de la méthode différée ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>

<span style='color:#bb7977; '>void</span> methode1<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode1 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>

<span style='color:#bb7977; '>void</span> methode2<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode2 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>

 

<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> ClasseB <span style='color:#800000; font-weight:bold; '>extends</span> ClasseDeBase <span style='color:#800000; font-weight:bold; '>implements</span> I<span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#bb7977; '>void</span> methodeDifferee<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de la méthode différée ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style style='color:#bb7977; '>void</span> methode3<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode3 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#bb7977; '>void</span> methode4<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
       <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"instructions de méthode4 ici"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre></div>