---
title: "Le polymorphisme"
weight: 2
---

# Le polymorphisme


Le polymorphisme est la capacité d’un même nom de méthode à s’adapter à différents contextes, selon l’objet qui l’utilise. Cela permet de manipuler des objets de différentes classes de façon uniforme, sans se soucier de leur type précis. En Java, la machine virtuelle (JVM) choisit automatiquement la bonne méthode à exécuter selon la classe réelle de l’objet. On distingue trois formes principales de polymorphisme : ad hoc (surcharge), par héritage (redéfinition), et paramétrique (génériques). Chacune permet d’écrire du code plus flexible et réutilisable.

## Le polymorphisme ad hoc

Le polymorphisme ad hoc, aussi appelé surcharge de méthodes (overloading), consiste à définir plusieurs méthodes portant le même nom mais acceptant des paramètres différents (par leur nombre ou leur type). C’est la signature de la méthode qui change. Lorsqu’on appelle la méthode, Java choisit la version appropriée selon les arguments fournis. Par exemple, on peut écrire plusieurs méthodes `calculMoyenne` : l’une prenant un tableau d’entiers, l’autre un tableau de réels. Ce mécanisme permet d’adapter un même nom d’opération à différents types de données, ce qui rend le code plus lisible et modulaire. Dans d’autres langages comme C++, la surcharge permet aussi de redéfinir des opérateurs (par exemple, l’opérateur == pour comparer deux objets).

L’exemple suivant montre trois méthodes `ajouterGradient` dans la classe `MixageCouleur`, chacune acceptant des types de paramètres différents (entiers, flottants, ou un objet Color). Selon le type d’argument passé, la bonne méthode est appelée automatiquement.


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


## Le polymorphisme par héritage

Le polymorphisme par héritage, ou redéfinition de méthode (overriding), consiste à réécrire dans une sous-classe une méthode déjà définie dans la classe parente. Cela permet à chaque sous-classe de personnaliser le comportement hérité. Lorsqu’on manipule un objet via une référence de la classe parente, c’est toujours la version la plus spécifique (celle de la sous-classe) qui est exécutée. Ce mécanisme est au cœur de la programmation orientée objet, car il permet d’utiliser des collections d’objets variés de façon uniforme, tout en conservant leur comportement propre.

Dans l’exemple, la classe `CerclePointille` définit une méthode `dessiner` pour tracer un cercle en pointillé. La sous-classe `OvalePointille` redéfinit cette méthode pour dessiner un ovale pointillé. Même si on manipule un `OvalePointille` via une référence de type `CerclePointille`, c’est la méthode redéfinie qui sera appelée.

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

Notons l'utilisation de l'annotatio `@override` qui demande au compilateur Java de vérifier que nous avons bel et bien une forme de polymorphisme
par héritage.

Cette classe permet de tracer un cercle en pointillé dans une fenêtre appelée JFrame. Nous viendrons surcharger la méthode dessiner dans une sous-classe afin de permettre de tracer des ovales pointillés.

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

Dans cette dernière classe, nous avons donc redéfini la méthode afin de spécialiser la méthode dessiner. Même si nous faisons un *cast* de la classe en `CerclePointille` (`CerclePointille cercle = new OvalePointille(10)`), ce sera tout de même la méthode surchargée qui sera appelée.


Pour illustrer davantage le polymorphisme par héritage, considérons une application simulant des instruments de musique. Une superclasse Instrument définit une méthode jouer, que des sous-classes comme Guitare et Piano redéfinissent pour produire des sons spécifiques. En manipulant ces objets via une référence de type Instrument, le comportement propre à chaque sous-classe est préservé.


{{<inlineJava path="Instrument.java" lang="java">}}

public class Instrument {
    public void jouer() {
        System.out.println("L'instrument produit un son générique.");
    }
}

class Guitare extends Instrument {
    @Override
    public void jouer() {
        System.out.println("La guitare joue : Strum strum !");
    }
}

class Piano extends Instrument {
    @Override
    public void jouer() {
        System.out.println("Le piano joue : Pling pling !");
    }
}

public class Orchestre {
    public static void main(String[] args) {
        Instrument[] orchestre = new Instrument[3];
        orchestre[0] = new Guitare();
        orchestre[1] = new Piano();
        orchestre[2] = new Instrument();

        for (Instrument i : orchestre) {
            i.jouer();
        }

        // Exemple avec cast
        Instrument instrument = new Guitare();
        instrument.jouer(); // Affiche : La guitare joue : Strum strum !
    }
}
{{</inlineJava>}}


Dans cet exemple, la classe Instrument fournit une méthode jouer générique. Les sous-classes Guitare et Piano redéfinissent cette méthode pour produire des sons distincts. Dans la classe Orchestre, un tableau d’Instrument contient des instances des différentes sous-classes. En parcourant le tableau, la méthode jouer appelée sur chaque élément exécute l’implémentation spécifique à la sous-classe, affichant successivement "La guitare joue : Strum strum !", "Le piano joue : Pling pling !" et "L'instrument produit un son générique.". Même dans le cas du cast implicite (Instrument instrument = new Guitare()), la méthode de Guitare est invoquée, démontrant la puissance du polymorphisme par héritage pour gérer des comportements variés de manière uniforme.


## Polymorphisme paramétrique : les génériques

Le polymorphisme paramétrique, réalisé en Java par les génériques, permet de concevoir des classes et des méthodes capables de manipuler différents types d’objets sans nécessiter de code spécifique pour chaque type. Introduits dans Java 5, les génériques utilisent une syntaxe de « templates » pour définir des types paramétrés, notés par des lettres comme `<T>` ou `<U>`. Par exemple, la classe `ArrayList<T>` peut stocker des éléments de type `String`, `Integer` ou tout autre type spécifié lors de son instanciation, comme `ArrayList<String>` ou `ArrayList<Double>`. Cette approche rend le code plus flexible, car une seule implémentation peut être réutilisée pour divers types, tout en renforçant la sécurité du typage : les erreurs de type sont détectées à la compilation plutôt qu’à l’exécution.

Les génériques ne se limitent pas aux classes ; ils s’appliquent également aux méthodes. Une méthode générique, déclarée avec un paramètre de type comme `<T>`, peut opérer sur des objets de types variés tout en maintenant une logique commune. Par exemple, une méthode comparant deux objets peut être écrite pour accepter n’importe quel type, à condition que les objets implémentent la méthode `equals`. Les génériques permettent aussi de spécifier des contraintes, comme exiger qu’un type étende une classe ou implémente une interface, via la syntaxe `<T extends Comparable>`. Cette flexibilité réduit la duplication de code et facilite la maintenance, tout en garantissant que le compilateur vérifie la cohérence des types utilisés, évitant ainsi des erreurs courantes comme des conversions de type incorrectes.

Un autre avantage des génériques réside dans leur intégration avec les structures de données et les algorithmes. Avant leur introduction, les collections comme `ArrayList` stockaient des objets de type `Object`, obligeant à effectuer des conversions explicites (casts) pour récupérer les types d’origine, ce qui pouvait provoquer des erreurs à l’exécution. Avec les génériques, une `List<String>` garantit que seuls des `String` sont ajoutés, et les éléments récupérés sont directement utilisables comme `String` sans cast. Cependant, omettre la spécification du type, comme dans `ArrayList al = new ArrayList()`, revient à utiliser un type brut (*raw type*), ce qui désactive les vérifications de type et génère un avertissement à la compilation. Cette pratique, bien que possible pour la rétrocompatibilité, est déconseillée, car elle compromet la sécurité du code.


Pour illustrer davantage les génériques, considérons une application de gestion de paires de valeurs, où chaque paire contient deux éléments de types potentiellement différents. Une classe générique `Paire<T, U>` peut être définie pour stocker et manipuler ces éléments de manière type-sûre.

{{<inlineJava path="Paire.java" lang="java">}}

public class Paire<T, U> {
    private T premier;
    private U second;

    public Paire(T premier, U second) {
        this.premier = premier;
        this.second = second;
    }

    public T getPremier() {
        return premier;
    }

    public U getSecond() {
        return second;
    }

    public void afficherPaire() {
        System.out.println("Premier : " + premier + ", Second : " + second);
    }

    public static void main(String[] args) {
        Paire<String, Integer> paire1 = new Paire<>("Âge", 25);
        Paire<Double, String> paire2 = new Paire<>(3.14, "Pi");

        paire1.afficherPaire(); // Affiche : Premier : Âge, Second : 25
        paire2.afficherPaire(); // Affiche : Premier : 3.14, Second : Pi

        // Exemple d'erreur détectée à la compilation
        // Paire<String, Integer> erreur = new Paire<>("Test", "Chaîne"); // Erreur : second doit être Integer
    }
}
{{</inlineJava>}}


Dans cet exemple, la classe `Paire<T, U>` utilise deux paramètres de type, `T` et `U`, pour représenter respectivement le type du premier et du second élément. Lors de l’instanciation, on précise les types, comme `Paire<String, Integer>`, ce qui garantit que le premier élément est un `String` et le second un `Integer`. La méthode `afficherPaire` fonctionne avec n’importe quelle combinaison de types, et le compilateur vérifie que les types utilisés sont corrects. Si l’on tente d’instancier une `Paire<String, Integer>` avec un second élément de type `String`, le compilateur signale une erreur, illustrant la sécurité des génériques. Cet exemple montre comment les génériques permettent de créer des structures réutilisables tout en préservant la cohérence des types.

Considérons un autre exemple.



{{<inlineJava path="Chainon.java" lang="java">}}
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
{{</inlineJava>}}



L’exemple de la classe `Chainon<T>` montre une implémentation d’une liste chaînée générique, où chaque nœud contient une donnée de type `T` et un lien vers le nœud suivant. En instanciant `Chainon<String>`, on s’assure que tous les nœuds manipulent des `String`, et le compilateur interdit l’ajout d’autres types, comme des `Integer`. La boucle dans l’exemple illustre comment parcourir la liste pour afficher les données, produisant la sortie : "Veni", "Vidi", "Vici".

L’exemple de la méthode générique `equals<T, U>` démontre comment une méthode peut comparer deux objets de types différents en s’appuyant sur la méthode `equals` de la classe `Object`. Bien que fonctionnelle, cette méthode suppose que les types implémentent `equals` correctement, ce qui peut poser problème avec des types incompatibles. Dans l’exemple, comparer "allo" et "bonjour" retourne `false`, car les chaînes sont différentes.


Il est possible d'omettre le type. Dans un tel cas, Java va omettre la vérification de la classe, comme dans cet exemple.

```java  {style=github}
    ArrayList al = new ArrayList();
    al.add(1);
```

En écrivant `ArrayList al = new ArrayList()`, on perd les vérifications de type, permettant d’ajouter un `Integer` comme `al.add(1)`, mais cela peut entraîner des erreurs ultérieures si l’on tente de récupérer cet élément en supposant un autre type. Le compilateur émet un avertissement pour encourager l’usage des génériques, comme `ArrayList<Integer>`.

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
