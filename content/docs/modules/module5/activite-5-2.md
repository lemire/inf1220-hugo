---
title: "Le polymorphisme"
weight: 2
---

# Le polymorphisme


<p>Le polymorphisme est la capacité d’un même nom de méthode à s’adapter à différents contextes, selon l’objet qui l’utilise. Cela permet de manipuler des objets de différentes classes de façon uniforme, sans se soucier de leur type précis. En Java, la machine virtuelle (JVM) choisit automatiquement la bonne méthode à exécuter selon la classe réelle de l’objet. On distingue trois formes principales de polymorphisme : ad hoc (surcharge), par héritage (redéfinition), et paramétrique (génériques). Chacune permet d’écrire du code plus flexible et réutilisable.</p>

## Le polymorphisme ad hoc

<p>Le polymorphisme ad hoc, aussi appelé surcharge de méthodes (overloading), consiste à définir plusieurs méthodes portant le même nom mais acceptant des paramètres différents (par leur nombre ou leur type). C’est la signature de la méthode qui change. Lorsqu’on appelle la méthode, Java choisit la version appropriée selon les arguments fournis. Par exemple, on peut écrire plusieurs méthodes `calculMoyenne` : l’une prenant un tableau d’entiers, l’autre un tableau de réels. Ce mécanisme permet d’adapter un même nom d’opération à différents types de données, ce qui rend le code plus lisible et modulaire. Dans d’autres langages comme C++, la surcharge permet aussi de redéfinir des opérateurs (par exemple, l’opérateur == pour comparer deux objets).</p>

<p>L’exemple suivant montre trois méthodes `ajouterGradient` dans la classe `MixageCouleur`, chacune acceptant des types de paramètres différents (entiers, flottants, ou un objet Color). Selon le type d’argument passé, la bonne méthode est appelée automatiquement.</p>


{{<inlineJava path="MixageCouleur.java" lang="java">}}
import java.awt.Color;

public class MixageCouleur {
    
    int rouge = 0;
    int vert = 0;
    int bleu = 0;
    
    public MixageCouleur(int rouge, int vert, int bleu) {
        this.rouge = rouge;
        this.bleu = bleu;
        this.vert = vert;
    }
    
    public void ajouterGradient(int rouge, int vert, int bleu) {
        this.rouge += rouge;
        this.bleu += bleu;
        this.vert += vert;
    }
    
    public void ajouterGradient(float rouge, float vert, float bleu) {
        this.rouge += (int) rouge;
        this.bleu += (int) bleu;
        this.vert += (int) vert;
    }
    
    public void ajouterGradient(Color color) {
        this.rouge += color.getRed();
        this.bleu += color.getBlue();
        this.vert += color.getGreen();
    }
    
    public static void main(String[] args) {
        
        MixageCouleur mixeur = new MixageCouleur(100, 100, 100);
        
        mixeur.ajouterGradient(10, 5, 15);
        mixeur.ajouterGradient(Color.PINK);
        
    }
    
}
{{</inlineJava>}}

<p><a id="intro" name="section2"></a></p>

## Le polymorphisme par héritage

<p>Le polymorphisme par héritage, ou redéfinition de méthode (overriding), consiste à réécrire dans une sous-classe une méthode déjà définie dans la classe parente. Cela permet à chaque sous-classe de personnaliser le comportement hérité. Lorsqu’on manipule un objet via une référence de la classe parente, c’est toujours la version la plus spécifique (celle de la sous-classe) qui est exécutée. Ce mécanisme est au cœur de la programmation orientée objet, car il permet d’utiliser des collections d’objets variés de façon uniforme, tout en conservant leur comportement propre.</p>

<p>Dans l’exemple, la classe `CerclePointille` définit une méthode `dessiner` pour tracer un cercle en pointillé. La sous-classe `OvalePointille` redéfinit cette méthode pour dessiner un ovale pointillé. Même si on manipule un `OvalePointille` via une référence de type `CerclePointille`, c’est la méthode redéfinie qui sera appelée.</p>

```java  {style=github}
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Classe permettant de dessiner un cercle pointillé.
 */
public class CerclePointille extends JPanel {
    
    // Distance entre les points
    protected final static int DISTANCE_ENTRE_POINT  = 10;
    
    protected float rayon = 0;
    protected int posX = 0;
    protected int posY = 0;

    public CerclePointille(float rayon) {
        this.rayon = rayon;
        this.posX = posX;
        this.posY = posY;        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        dessiner(g);
    }
    
    public void dessiner(Graphics g) {
        
        //Calculer le périmètre
        double perimeter = (rayon * 2) * Math.PI;
        
        //Calculer le nombre de point à dessiner
        int nbPoint = (int) (perimeter / DISTANCE_ENTRE_POINT);
        
        //position de départ
        int x = this.getWidth()/2;
        int y = this.getHeight()/2 + (int) rayon;
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor(Color.BLACK);
        
        for (int i = 0; i < nbPoint; i++) {
            
            double t = 2 * Math.PI * i / nbPoint;
            
            int x1 = (int) Math.round(x + rayon * Math.cos(t));
            int y1 = (int) Math.round(y + rayon * Math.sin(t));
            g2d.fillOval(x1 - (int) rayon, y1 - (int) rayon, 10, 10);
        }
      
        
    }
    
    private static void create() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CerclePointille cercle = new CerclePointille(50);
        
        cercle.setPreferredSize(new Dimension(300, 300));
              
        f.add(cercle);
        f.pack();
        f.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                create();
            }
        });
    }
    
}
```

<p>Cette classe permet de tracer un cercle en pointillé dans une fenêtre appelée JFrame. Nous viendrons surcharger la méthode dessiner dans une sous-classe afin de permettre de tracer des ovales pointillés :</p>

```java  {style=github}
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;

public class OvalePointille extends CerclePointille {

    protected float rayonHorizontal = 0;
    
    public OvalePointille(float rayonVertical, float rayonHorizontal) {
        
        //RayonVertical sera le Rayon
        super(rayonVertical);
        
        this.rayonHorizontal = rayonHorizontal;
    }
    
    //Surcharge ou polymorphisme par héritage
    @Override
    public void dessiner(Graphics g) {
        
        //Calculer le périmètre
        double perimeter = (rayon * 2) * Math.PI;
        
        //Calculer le nombre de point à dessiner
        int nbPoint = (int) (perimeter / DISTANCE_ENTRE_POINT);
        
        //position de départ
        int x = this.getWidth()/2;
        int y = this.getHeight()/2 + (int) rayon;
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor(Color.BLACK);
        
        for (int i = 0; i < nbPoint; i++) {
            
            double t = 2 * Math.PI * i / nbPoint;
            
            // Dessiner avec différent rayon pour tracer l'oval
            int x1 = (int) Math.round(x + rayonHorizontal * Math.cos(t));
            int y1 = (int) Math.round(y + rayon * Math.sin(t));
            
            g2d.fillOval(x1 - (int) rayon, y1 - (int) rayon, 10, 10);
        }
        
    }
   
    
    private static void create() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        OvalePointille ovale = new OvalePointille(50,30);
        
        ovale.setPreferredSize(new Dimension(300, 300));
              
        f.add(ovale);
        f.pack();
        f.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                create();
            }
        });
    }
}
```

<p>Dans cette dernière classe, nous avons donc redéfini la méthode afin de spécialiser la méthode dessiner. Même si nous faisons un "cast" de la classe en CerclePointille (CerclePointille cercle = new OvalePointille(10)), ce sera tout de même la méthode surchargée qui sera appelée.</p>

<p><a id="intro" name="section3"></a></p>

## Le polymorphisme paramétrique (génériques)

<p>Le polymorphisme paramétrique, ou utilisation de génériques, permet d’écrire des classes ou des méthodes qui fonctionnent avec différents types d’objets, sans dupliquer le code. En Java, cela se fait grâce aux « templates » (génériques). Par exemple, la classe `ArrayList<T>` peut contenir des éléments de n’importe quel type : `ArrayList<String>`, `ArrayList<Double>`, etc. On peut aussi écrire des méthodes génériques, comme une fonction `equals` qui compare deux objets de n’importe quel type. Les génériques rendent le code plus sûr (détection d’erreurs à la compilation) et plus réutilisable.</p>

<p>L’exemple montre comment déclarer une méthode générique avec `<T>` ou une classe générique avec `<T>`. On peut aussi utiliser plusieurs paramètres génériques si besoin.</p>

```java  {style=github}
public class TestGenerique {
    
    public static <T> boolean equals(T a, T b) {
        return a.equals(b);
    }
    
    public static void main(String[] args) {
        
        String allo = "allo";
        String bonjour = "bonjour";
        
        System.out.println(equals(allo, bonjour));
        
    }
    
}
```

```java  {style=github}
public class TestGenerique {
    
    public static <T,U> boolean equals(T a, U b) {
        return a.equals(b);
    }
    
    public static void main(String[] args) {
        
        String allo = "allo";
        String bonjour = "bonjour";
        
        System.out.println(equals(allo, bonjour));
        
    }
    
}
```

```java  {style=github}
public class Chainon<T> {
    
    protected T donnee = null;
    
    protected Chainon<T> prochainChainon;
    
    public Chainon(T donnee) {
        this.donnee = donnee;      
        prochainChainon = null;
    }
    
    public void addChainon(Chainon<T> chainon) {
        prochainChainon = chainon;
    }
    
    public void removeChainon() {
        prochainChainon = null;
    }
    
    public Chainon<T> getNext() {
        return prochainChainon;
    }
    
    public boolean hasNext() {
        if (prochainChainon == null) {
            return false;
        } else {
            return true;
        }            
    }

    public T getDonnee() {
        return donnee;
    }

    public void setDonnee(T donnee) {
        this.donnee = donnee;
    }
    
    public static void main(String[] args) {
        
        Chainon<String> chaine1 = new Chainon<String>("Veni");
        Chainon<String> chaine2 = new Chainon<String>("Vidi");
        Chainon<String> chaine3 = new Chainon<String>("Vici");
        chaine1.addChainon(chaine2);
        chaine2.addChainon(chaine3);
        
        Chainon<String> iterateur = chaine1;
        
        //Façon peu recommendé d'utiliser le for ...
        for(boolean iterate = true; iterate == true;) {
            
            System.out.println(iterateur.getDonnee());
            
            if(iterateur.hasNext()) {
                iterateur = iterateur.getNext();
            } else {
                iterate = false;
            }
        } 
    } 
}
```

<p> Il est possible d'omettre le type. Dans un tel cas, Java va omettre la vérification de la classe, comme dans cet exemple:</p>

```java  {style=github}
    ArrayList al = new ArrayList();
    al.add(1);
```
<p>Dans un tel cas, Java peut émettre un avertissement à la compilation.</p>

## En résumé


Voici les trois formes principales de polymorphisme en Java, avec leur principe et un exemple concret pour chacune.

| Type de polymorphisme         | Description                                                                 | Exemple en Java                                  |
|------------------------------|-----------------------------------------------------------------------------|--------------------------------------------------|
| Ad hoc (surcharge)           | Plusieurs méthodes portent le même nom mais ont des paramètres différents.   | `void f(int x)` et `void f(double x)`            |
| Par héritage (redéfinition)  | Une méthode d’une classe parente est redéfinie dans une sous-classe.         | `@Override void dessiner()` dans une sous-classe  |
| Paramétrique (génériques)    | Une méthode ou une classe fonctionne avec différents types d’objets.         | `ArrayList<String>`, `public <T> void f(T x)`     |



### Lecture optionnelle dans le livre de référence (Delannoy)

<p>Pour aller plus en profondeur (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 8 et 21:</p>
<ul>
	<li>Chapitre 8 - Section 6 : Le polymorphisme</li>
	<li>Chapitre 21 - Section 1 : Notion de classe générique</li>
	<li>Chapitre 21 - Section 2 : Compilation du code générique</li>
	<li>Chapitre 21 - Section 3 : Méthode générique</li>
	<li>Chapitre 21 - Section 5 : Héritage et programmation générique</li>
</ul>




## Vidéos suggérées


{{<youtube id="CPxrEntMxsQ" >}}



<ol>
<li><a href="https://www.youtube.com/playlist?list=PLZbs1ERZ-TGXyZw164Y_Bye3SudSZB_Ry">Il y a une liste de vidéos sur le polymorphisme par Sam et al.</a> </li>
</ol>
