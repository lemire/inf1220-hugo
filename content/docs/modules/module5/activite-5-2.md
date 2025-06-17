---
title: "Le polymorphisme"
weight: 2
---

# Le polymorphisme


<p>Le polymorphisme est la capacité d'une méthode de se comporter différemment en fonction de l'objet qui s'en sert. Le polymorphisme permet donc de manipuler des objets grâce à leurs méthodes sans que nous nous souciions de leur classe. La JVM se charge d'appeler la méthode adéquate dans la hiérarchie de classes issue de l'héritage. Il existe trois formes de polymorphisme : le polymorphisme ad hoc, le polymorphisme paramètré et le polymorphisme par héritage. Dans les prochaines sections, nous aborderons ces trois types de polymorphisme et leur usage.</p>

<p><a id="intro" name="section1"></a></p>

<h1>Le polymorphisme ad hoc</h1>

<p>Le polymorphisme ad hoc est une technique de programmation OO où plusieurs méthodes avec le même nom sont créées, mais possède des paramètres de méthode différents. Nous avons vu le polymorphisme ad hoc dans le cadre du module 2 sous un autre nom: surdéfinition des méthodes. La signature de la méthode est donc différente pour chacune d'elle. Ainsi, c'est la JVM à l'exécution du code qui redirige l'appel vers la bonne méthode de l'objet selon les types ou les objets passés en paramètres. Ce type de polymorphisme, appelé régulièrement polymorphisme overloading, est utile pour concevoir plusieurs mises en oeuvre d'un même algorithme avec des entrées de données de différents types. Par exemple, des méthodes "calculMoyenne" qui pourrait prendre un tableau d'entier ou bien un tableau de double en entrée. Dans d'autres langages que le Java tels que le C++, ce type de polymorphisme est utilisé pour construire des opérateurs pour une classe particulière. Par exemple, redéfinir l'opérateur égal (==) pour comparer deux cercles. Voici un exemple de polymorphisme ad hoc et son utilisation en Java:</p>


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

<h1>Le polymorphisme par héritage</h1>

<p>Le polymorphisme par héritage est en fait la surcharge de méthode (overriding) que nous avons vu précédemment. Il s'agit donc de re-implémenter une méthode qui a été déclarée dans une classe héritée. Elle peut se faire avec des classes abstraites ou non. Voici un exemple de polymorphisme par héritage :</p>

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
 * 
 * @author cgouin
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

/**
 *
 * @author cgouin
 */
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

<h1>Le polymorphisme paramétrique ou les génériques (templates)</h1>

<p>Le dernier type de polymorphisme abordé est celui paramétrique. En Java, ce type de paramétrique est en fait l'utilisation de génériques passées en paramètre à des fonctions. Pour ce faire, il est nécessaire d'utiliser la mécanique des templates. Les templates en Java permettent de construire des méthodes ou des classes avec des paramètres indéfinis à la conception et qui sont résolu à l'exécution. Par exemple, nous avons vu au début du cours les structures de type ArrayList. Celle-ci utilise les templates en ne définissant pas dès l'implémentation la classe d'objet pouvant être contenu dans la structure, celle-ci est résolu à l'exécution. Ainsi, il est possible de créer une ArrayList ainsi : ArrayList<String> ou bien ArrayList<Double> ou enfin ArrayList<MaClasse>. Les templates/génériques peuvent être utilisés dans la conception des classes ou bien dans la conception des méthodes (paramètres reçus ou retournés). La forme générale pour l'utilisation d'un générique dans une méthode est la suivante :</p>

```java  {style=github}
public|protected|private static|final <T> valeurDeRetour|void nomDeMethode(T unParametreGenerique)  {
       //Faire quelque chose avec unParametreGenerique 
}
```

<p>Un exemple classique de l'utilisation des templates est avec l'implémentation d'une méthode de comparaison (equals), recevant deux paramètres de classes inconnus :</p>

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

<p>Dans cet exemple, le type générique est déclaré en début de méthode (<T>). Celui-ci est en quelques sortes un "Joker" auquel on peut appliquer n'importe quelle classe. Toutefois, il faut faire attention, dans l'exemple précédent, comme tout les objets hérites de la superclasse Object, ceux-ci ont tous la méthode equals. Cela ne peut pas être le cas pour des méthodes spécifiques à des implémentations de classe particulière. Il est également possible d'utiliser deux génériques différents :</p>

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

<p>Pour ce qui est de l'utilisation des génériques dans la déclaration d'une classe, il est possible de lier l'instance d'une classe à un générique spécifique. Pour ce faire, il faut nommer le générique dans la déclaration de la classe (juste après le nom de la classe). Il est possible alors dans le corps de la déclaration de la classe d'utiliser le générique. La forme générale est : </p>

```java  {style=github}
public|protected|private Class NomDeClasse<T> {

      //Un exemple de constructeur
      public NomDeClasse(T parametre) {
           //Faire quelque chose
      }

      public void uneMethode(T parametre) {
           //Faire quelque chose
      }

}
```

<p>Voici un exemple de l'utilisation d'un générique dans l'implémentation d'une classe :</p>

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
