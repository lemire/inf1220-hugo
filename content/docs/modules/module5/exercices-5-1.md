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

```java  {style=github}
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

```java  {style=github}
public class PNGGradientExtractor {

    int[][] gradientMatrix;
    
    public PNGGradientExtractor(File file) {
        
        // Lit le fichier et charge
        loadImage(file);
        
    }
    
    public void loadImage(File file) {        
        //Charge l'image et la met en format "raw" dans la matrice gradientMatrix
        return;
    }
    
    public HashMap getGradientMap() {
        // Retourne une hashmap avec l'occurence de gradient dans l'image
        return null;
    }
    
}
```

<p>À l'aide de l'héritage et des classes abstraites, veuillez implémenter les classes qui permettront de : a. Créer une classe abstraite GradientExtractor; b. Créer une classe GIFGradientExtractor; c. modifier PNGGradientExtractor pour tenir compte des changements précédent. Pour simplifier l'exercice, ce qui diffère le GIF du PNG est le chargement de l'image dans la matrice gradientMatrix. VOUS DEVEZ FAIRE SEULEMENT LA STRUCTURE (CLASSES ET MÉTHODES) SANS IMPLÉMENTATION!</p>

<details><summary>Réponse</summary>
<div>

```java  {style=github}
public abstract class GradientExtractor {
    
    protected int [][] gradientMatrix;
        
    public HashMap getGradientMap() {
        // Retourne une hashmap avec l'occurence de gradient dans l'image
        return null;
    }
    
    public abstract void loadImage(File file);
    
}

public class GIFGradientExtractor extends GradientExtractor {
    
    public GIFGradientExtractor(File file) {
        
        // Lit le fichier et charge
        loadImage(file);
        
    }
    
    public void loadImage(File file) {        
        //Charge l'image et la met en format "raw" dans la matrice gradientMatrix
        return;
    }
    
}

public class PNGGradientExtractor extends GradientExtractor {
    
    public PNGGradientExtractor(File file) {
        
        // Lit le fichier et charge
        loadImage(file);
        
    }
    
    public void loadImage(File file) {        
        //Charge l'image et la met en format "raw" dans la matrice gradientMatrix
        return;
    }
    
}
```

</div>
</details>

<h2>Question 3</h2>
<p>Voici une classe permettant de calculer la regression linéaire d'une série temporelle d'entier&nbsp;:</p>

```java  {style=github}
public class SerieTemporelle {

    int[] serie;
    
    public SerieTemporelle(int[] serie) {
        this.serie = serie;
    }
    
    public void calculerRegressionLineaire() {
        
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

{{<inlineJava path="SerieTemporelle.java" lang="java" >}}
public class SerieTemporelle<T>  {
    
    T[] serie;
    
    public SerieTemporelle(T[] serie) {
        this.serie = serie;
    }
    
    public void calculerRegressionLineaire() {
        
        int MAXN = 1000;
        double[] x = new double[MAXN];
        double[] y = new double[MAXN];
        
        // first pass: read in data, compute xbar and ybar
        double sumx = 0.0, sumy = 0.0, sumx2 = 0.0;
        for(int i = 0; i < serie.length; i++) {
            x[i] = i;
            y[i] = Double.parseDouble(serie[i].toString());
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
            double fit = beta1*x[i] + beta0;
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
        
        Double[] serie = {100.0,22.0,55.0,10.0,5.0,66.0,71.0,8.0,91.0};
        SerieTemporelle serieTemporelle = new SerieTemporelle(serie);
        serieTemporelle.calculerRegressionLineaire();
       
    }
    
}
{{</inlineJava>}}

</details>

<h2>Question 4</h2>
<p>À partir du code suivant, veuillez en extraire une classe supérieure qui sera héritée et deux interfaces :</p>

```java  {style=github}
public class VoitureEssence {
    
    public boolean isRunning() {
        return false;
    }
    
    public void addGaz(int litres) {
        
    }
    
    public double getSpeed() {
        return 0;
    }
    
}

public class VoitureElectrique {
    
    public boolean isRunning() {
        return false;
    }
    
    public void chargeBattery(int mah) {
        
    }
    
    public double getSpeed() {
        return 0;
    }
    
}
```

<details><summary>Réponse</summary>
<div>

```java  {style=github}
public class Voiture {
    
    public boolean isRunning() {
        return false;
    }
    
    public double getSpeed() {
        return 0;
    }
    
}

public class VoitureElectrique extends Voiture implements MoteurElectrique {
    
    @Override
    public void chargeBattery(int mah) {
        
    }
    
}

public class VoitureEssence extends Voiture implements MoteurEssence {
    
    @Override
    public void addGaz(int litres) {
        
    }
    
}

public interface MoteurElectrique {
    
    void chargeBattery(int mah);
    
}

public interface MoteurEssence {
    
    void addGaz(int litres);
    
}
```

</div>
</details>

<h2>Question 5</h2>
<p>Dans le code ci-dessous, quel est le type de polymorphisme utilisé?</p>

```java  {style=github}
public class Classe1 {
    
    public void uneMethode(String arg) {
        
    }
    
    public void uneMethode(StringBuffer arg) {
        
    }
    
}
```

<details><summary>Réponse</summary>
Il s'agit du polymorphisme ad hoc.
</details>

<h2>Question 6</h2>
<p>Dans le code ci-dessous, quel est le type de polymorphisme utilisé?</p>

```java  {style=github}
public class Classe1 {
    
    public void uneMethode() {

    }
    
}

public class Classe2 extends Classe1 {
    
    public void uneMethode() {

    }

    public static void main(String[] args) {
             
        Classe2 uneClase = new Classe2();
        ((Classe1) uneClase).uneMethode();
    }
    
}
```

<details><summary>Réponse</summary>
Il s'agit du polymorphisme par héritage (ou d'héritage).
</details>

<h2>Question 7</h2>

<p>Considérons la classe Point suivante :</p>

```java  {style=github}
public class Point {
    public Point (int abs, int ord) {
        x = abs; y = ord;
    }
    public void deplace (int dx, byte dy) {
        x += dx; y += dy;
    }
    public void deplace (byte dx, int dy) {
        x += dx; y += dy;
    }
    int x, y;
}
```

<p></p>
<ol>
  <li>On voit que la classe Point a deux méthodes qui portent le même nom :
    Quelle technique est mise en œuvre pour y parvenir ici ?</li>
  <li>Quel est le résultat de la compilation de chacune des deux classes
    suivantes ? Expliquez chacun de ces résultats.</li>
</ol>

```java  {style=github}
public class Test1 {
    public static void main (String args[]) {
        int n=1; byte b=1;
        Point a = new Point(n,n);
        a.deplace(b, b);
    }
}
```

```java  {style=github}
public class Test2 {
    public static void main (String args[]) {
        int n=1; byte b=1;
        Point a = new Point(n,n);
        a.deplace (2*b, b);
    }
}
```

<details><summary>Réponse</summary>

<ol>
  <li style="text-align:justify;">Il s’agit de la surdéfinition ou
    surcharge, car les deux méthodes ont des signatures différentes.</li>
  <li style="text-align:justify;">Test1 génère une erreur de compilation à
    cause de l’ambiguïté dans le choix de la méthode deplace à appeler.
    Cette ambiguïté est liée au fait que chacune des deux méthodes peut être
    appelée, compte tenu des conversions implicites de byte en int. Test2
    compile normalement, l’ambiguïté soulignée ci-dessus est levée par
    le fait que 2*b force d’office la conversion du premier paramètre
    réel en int, et donc c’est la méthode déplace (int dx, byte dy) qui
    est appelée.</li>
</ol>

</details>

<h2>Question 8</h2>

<p>On suppose qu’il existe une classe A dotée d’un constructeur
par défaut.</p>

<p>Soient les trois instructions suivantes :</p>

```java  {style=github}
A a = new A();
Object o = new Object();
o=a;
```

<p>A l’issue de ces trois instructions, on a :</p>
<ol>
  <li>deux variables de même type et contenant les mêmes références ;</li>
  <li>deux variables de type différent contenant les mêmes références ;</li>
  <li>deux variables de même type contenant des références différentes ;</li>
  <li>rien de tout cela car une erreur est générée.</li>
</ol>
<details><summary>Réponse</summary>

<p>Bonne réponse : 2. </p>
</details>


<h2>Question 9</h2>

<p>On dispose d’une interface I mettant en œuvre plusieurs méthodes. Soit</p>

```java  {style=github}
interface I {
    void methode1();
    void methode2();
    void methode3();
    void methode4();
}
```

<p style="text-align:justify;">On voudrait faire partager cette interface par
deux classes ClasseA et ClasseB pouvant être regroupées dans une classe de base
ClasseDeBase et partageant au moins une méthode (methodeDifferee) présente dans
cette classe de base mais non encore définie. De plus, ClasseA ne doit
implémenter que methode1 et methode2 de I, alors que ClasseB doit implémenter
methode3 et methode4 de I.</p>

<p>Un programmeur songe à la solution suivante :</p>

```java  {style=github}
abstract class ClasseDeBase {
    abstract public void methodeDifferee();
}

public class ClasseA extends ClasseDeBase implements I {
    public void methodeDifferee() {
        System.out.print("instructions de la méthode différée ici");
    }

    void methode1() {
        System.out.print("instructions de méthode1 ici");
    }

    void methode2() {
        System.out.print("instructions de méthode2 ici");
    }
}

public class ClasseB extends ClasseDeBase implements I {
    public void methodeDifferee() {
        System.out.print("instructions de la méthode différée ici");
    }
    void methode3() {
        System.out.print("instructions de méthode3 ici");
    }
    void methode4() {
        System.out.print("instructions de méthode4 ici");
    }
}
```

<details><summary>Réponse</summary>

Le problème avec la solution est que chacune des classes ClasseA et ClasseB doit impérativement implémenter toutes les méthodes de l’interface I, et pas seulement certaines.

Une solution c’est de faire implémenter l’interface plutôt par la classe abstraite ClasseDeBase. C’est-à-dire :

```java  {style=github}
abstract class ClasseDeBase implements I {
   abstract public void methodeDifferee();
   void methode1() {
        System.out.print("instructions même à redéfinir plus tard de méthode1 ici");
   }
   void methode2() {
       System.out.print("instructions même à redéfinir plus tard de méthode2 ici");
   }
   void methode3() {
       System.out.print("instructions même à redéfinir plus tard de méthode3 ici");
   }
   void methode4() {
       System.out.print("instructions même à redéfinir plus tard de méthode4 ici");
   }
}

public class ClasseA extends ClasseDeBase {
  public void methodeDifferee() {
       System.out.print("instructions de la méthode différée ici");
  }
  void methode1() {
       System.out.print("instructions de méthode1 ici");
  }
  void methode2() {
       System.out.print("instructions de méthode2 ici");
  }
}

public class ClasseB extends ClasseDeBase {
  public void methodeDifferee() {
       System.out.print("instructions de la méthode différée ici");
  }
  void methode3() {
       System.out.print("instructions de méthode3 ici");
  }
  void methode4() {
       System.out.print("instructions de méthode4 ici");
  }
}
```

</details>

## Question 10

On dispose de différentes classes d’animaux (Poissons, Reptiles, Oiseaux, Mammifères) qui partagent en commun la méthode seDeplace. On voudrait effectuer un traitement qui consiste juste pour chaque animal d’une classe à afficher comment il se déplace. Ainsi, pour un Poisson p, p.seDeplace doit afficher « je suis un poisson, je nage » ; un Reptile « je suis un reptile, je rampe » ; un Oiseau « je suis un oiseau, je vole » ; un Mammifère « je suis un mammifère, je marche, je vole et je nage ». Proposer une solution en utilisant un seul tableau d’objets.

<details><summary>Réponse</summary>

```java  {style=github}
public class Main {
      public static void main(String[] args) {
      Animaux[] tableau = new Animaux[4];
      tableau[0] = new Oiseaux();
      tableau[1] = new Poissons();
      tableau[2] = new Reptiles();
      tableau[3] = new Mammiferes();
      for(int i=0; i<tableau.length;i++) {
          tableau[i].seDeplace();
      }
}}

abstract class Animaux {
     abstract void seDeplace();
}

class Oiseaux extends Animaux {
   void seDeplace() {
       System.out.println("je suis un oiseau, je vole");
   }
}

class Poissons extends Animaux {
   void seDeplace() {
       System.out.println("je suis un poisson, je nage");
   }
}

class Reptiles extends Animaux {
   void seDeplace() {
       System.out.println("je suis un reptile, je rampe");
   }
}

class Mammiferes extends Animaux {
   void seDeplace() {
        System.out.println("je suis un mammifère, je nage, je vole ou je marche");
   }
}
```

</details>

