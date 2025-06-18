---
title: "L'héritage, les classes abstraites et les interfaces"
weight: 1
---


# L'héritage, les classes abstraites et les interfaces

## Java pas à pas

<p>Nous vous invitons maintenant à lire le chapitre <em>Traitement de fichiers</em> du manuel Java pas à pas par Robert Godin et Daniel Lemire. Vous trouverez <a href="https://raw.githubusercontent.com/RobertGodin/JavaPasAPas/master/JavaPasAPas.pdf">le document PDF</a>.  </p>

<p><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/">Vous pouvez aussi acheter la version papier du manuel Java pas à pas chez Amazon</a>:</p>
<div><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/"><img src="https://m.media-amazon.com/images/I/61tnblFlmmL._SL1499_.jpg" width="250px" style="margin-left:auto; margin-right:auto;"></a></div>

<p>Plusieurs étudiants trouvent qu'il est plus aisé de faire les lectures dans le manuel Java pas à pas après avoir terminé la lecture du module sur notre site web. Vous pouvez choisir quand il vous convient le mieux d'utiliser le manuel Java pas à pas.</p>


<p>Si vous devez lire un document PDF, nous vous encourageons à charger le fichier sur votre machine et à l'ouvrir au sein d'un outil dédié (par ex. Adobe Acrobat). Il n'est pas très pratique de lire un document PDF au sein d'un navigateur web.</p>





<p> <p align="left" style="text-align: justify;">Après avoir présenté les objets et les classes dans les leçons précédentes, nous abordons ici la notion d'héritage, qui est essentielle à la programmation orientée objet, donc à l'apprentissage du langage Java. Cette technique très importante, appliquée à la programmation Java, permet de créer de nouvelles classes fondées sur celles qui existent déjà. Lorsque nous héritons d'une classe, nous réutilisons ses méthodes et champs, auxquels nous pouvons ajouter de nouveaux champs en vue de l'adapter à de nouvelles situations.</p> 

<p><a id="intro" name="section1"></a></p>

## Classe - superclasse - sous-classe
<p align="left" style="text-align: justify;">Pour illustrer ce concept, essayons de concevoir un jeu. Tous les jeux ont un nom, un but, un nombre de joueurs requis pour faire une partie, des règles à respecter… Nous pourrions donc envisager de créer une classe Jeu pour représenter les jeux. <br />Toutefois, les règles du jeu Tetris diffèrent de celles de Sudoku, et le nombre de joueurs d'une partie de football n'est pas le même que celui d'une partie de tennis… <br />Supposons que nous implantions une méthode jouer() pour la classe Jeu. Un joueur de tennis ne joue pas de la même façon qu'un joueur de football. Il est par conséquent impossible d'obtenir une implémentation de jouer() qui peut correspondre à tous les jeux.</p> 
<p align="left" style="text-align: justify;">L'héritage est un mécanisme qui permet de résoudre ce genre de problème. En fait, nous spécifions dans la classe Jeu, appelée superclasse, l'ensemble des comportements communs à tous les jeux sans fournir une implémentation. Nous créons ensuite des sous-classes qui fournissent pour chaque jeu une implémentation appropriée. D'une manière générale, le format de déclaration d'une sous-classe est le suivant :</p> 

```java  {style=github}
public class SousClasse extends SuperClasse {
    // les instructions

}
```

<p align="left">Pour signifier l'héritage, nous employons le mot clé <em>extends.</em> Nous créons ainsi une classe qui dérive d'une classe existante, qui portera le nom de <em>superclasse,</em> et la nouvelle classe sera nommée <em>sous-classe</em>.</p> 
<p align="left">Voici maintenant la façon de définir une classe Sudoku qui hérite de la superclasse Jeu :</p> 

```java  {style=github}
public class Sudoku extends Jeu {

    // ici nous définissons les champs et les méthodes
}
```

<p align="left">Dans l'exemple ci-dessus, la superclasse est la classe Jeu tandis que la sous-classe est la classe Sudoku. La sous-classe hérite automatiquement de tous les champs et de toutes méthodes de la superclasse. Voici quelques principes fondamentaux de l'héritage :</p> 
<ul> 
  <li>une sous-classe hérite de tous les membres de la superclasse. Les constructeurs n'étant pas considérés comme étant membres d'une classe, la sous-classe ne peut donc pas hériter des constructeurs de la superclasse; </li> 
  <li>la visibilité (<em>public ou private</em>) de n'importe quels membres de la superclasse est la même dans la sous-classe. Cela voudra dire que si une méthode ou un champ est déclaré <em>private</em> dans la superclasse, la sous-classe ne peut y avoir accès; </li> 
  <li>nous pouvons surcharger une méthode en réutilisant la même signature (nom de méthode et paramètres) et en utilisant l'annotation @override; </li> 
  <li>un autre type, <em>protected,</em> permet de cacher les champs et les méthodes de la superclasse, mais ses membres sont accessibles à la sous-classe; </li> 
  <li>nous pouvons aussi ajouter des méthodes et des champs <em>private</em> et <em>protected</em> à une sous-classe. </li> 
</ul> 

<p>En programmation OO, l'héritage est une mécanique utilisée régulièrement pour dériver une problématique en plusieurs solutions, dans le développement de bibliothèques de code, etc. Voici d'autres exemples où l'héritage peut être utilisé : </p>
<ul>
	<li>une classe LecteurMusique, et des sous-classes dérivées LecteurMP3, LecteurWave, LecteurMidi, etc.</li>
	<li>une classe AlgorithmeIA, une sous-classe AnalyseSerieTemporelle, puis des sous-sous-classes FuzzyCClustering, FastDynamicTimeWarping, etc.</li>
	<li>une classe Capteur, avec des sous-classes CapteurIR, CapteurMagnetique, etc.</li>
</ul>

<p>Voilà l'exemple pour les AlgorithmeAI en code, avec deux niveaux d'héritage :</p>

```java  {style=github}
public class AlgorithmeIA {
    
    /**
     * Constructeur
     */
    public AlgorithmeIA() {
        
    }
    
    public Object[] analyse(Object[] data) {
        
        // Faire un traitement ici et retourner des données classifiées ou bien des activités reconnues ...
        
        return null;
    }
    
}

public class AnalyseSerieTemporelle extends AlgorithmeIA {
    
    /**
     * Constructeur
     */
    public AnalyseSerieTemporelle() {
        
    }
    
    public Object[] analyse(Object[] data) {
        
        // Faire un traitement ici et retourner des données classifiées ou bien des activités reconnues ...
        
        return null;
    }
    
}

public class FastDynamicTimeWarping extends AnalyseSerieTemporelle {
    
    Double[] comparateur = null;
    
    /**
     * Constructeur
     */
    public FastDynamicTimeWarping(Double[] comparateur) {
        this.comparateur = comparateur;
    }
    
    public Object[] analyse(Object[] data) {
        
        // Faire oici le traitement pour le FastDynamicTimeWarping
        
        return null;
    }
    
}
```

<p>Nous verrons un peu plus loin une meilleure implémentation de cet exemple avec l'utilisation des classes abstraites.</p>

<p><a id="intro" name="section2"></a></p>
## Surcharge des méthodes
<p style="text-align: justify;">Si nous déclarons une méthode dans la sous-classe qui a la même signature que celle de la superclasse et qui est <em>public</em>, cette méthode sera dite <em>surchargée</em>. Cette technique permet de modifier une méthode de la superclasse et de l'adapter au besoin de la sous-classe.</p> 
<p style="text-align: justify;">Supposons que nous définissons notre classe Jeu, qui possède une méthode jouer. La superclasse qui représente tous les jeux possibles peut être définie de la manière suivante :</p> 

```java  {style=github}
public class Jeu {

    public void jouer() {
        //...
    }
}
```

<p style="text-align: justify;">Nous pouvons déclarer dans la classe Sudoku, une sous-classe qui hérite de la superclasse Jeu, à laquelle nous appliquons une implémentation de la méthode jouer :</p> 

```java  {style=github}
public class Sudoku extends Jeu {
    public void jouer() {
        System.out.println("Je viens de commencer le Sudoku niveau 1!");

    }
}
```

<p style="text-align: justify;">Ici quand nous appelons la méthode jouer avec un objet de la classe Sudoku, le message suivant s'affiche alors :</p> 
<p style="text-align: justify;">Je viens de commencer le Sudoku niveau 1!</p> 
<p style="text-align: justify;"><br />Il faut noter qu'il faut trois conditions avant de réaliser cette opération :</p> 
<ul> 
  <li> 
    <div style="text-align: justify;">La méthode à surcharger doit être définie dans la superclasse; </div> 
  </li> 
  <li> 
    <div style="text-align: justify;">Cette méthode doit être définie <em>public</em>. Nous ne pouvons surcharger une méthode <em>private;</em> </div> 
  </li> 
  <li> 
    <div style="text-align: justify;">La méthode de la sous-classe doit avoir la même signature que celle de la superclasse, c'est-à-dire le même nom et les mêmes types de paramètres. </div> 
  </li> 
</ul> 
### Protection des membres
<p align="left" style="text-align: justify;">Nous connaissons déjà les mots clés <em>public</em> et <em>private</em> qui sont utilisés pour indiquer si les membres d'une classe sont visibles ou non à l'extérieur de cette classe. Quand nous héritons d'une classe, tous les membres publics de la superclasse sont visibles pour les sous-classes, mais pas les membres privés. Ces membres privés sont des membres des sous-classes, mais nous ne pouvons pas accéder à ces membres privés directement à partir des sous-classes.</p> 
<p align="left" style="text-align: justify;">Java nous fournit une troisième option quant à la visibilité des membres d'une classe. Nous pouvons ainsi créer des membres protégés d'une classe avec le mot clé<em> protected</em>. Ainsi les membres <em>protected</em> de la superclasse sont visibles pour les sous-classes, mais pas pour les autres classes. Considérons l'exemple suivant :</p> 

```java  {style=github}
class Jeu {
    private String nomdujeu;

    protected String getnomdujeu() {
        return this.nomdujeu;
    }

    protected void setnomdujeu(String nom) {
        this.nomdujeu = nom;
    }
}

public class Sudoku extends Jeu {
    public Sudoku() {
        setnomdujeu("Sudoku");
    }
}
```

<p style="text-align: justify;">Dans l'exemple ci-dessus, les méthodes <em>getnomdujeu</em> et <em>setnomdujeu</em> sont déclarées <em>protected</em> et donc visibles </p> 
<p style="text-align: justify;">à la sous-classe SUDOKU. Ces méthodes sont seulement visibles pour les classes qui héritent de la classe Jeu.</p> 
<p style="text-align: justify;"> </p> 

## Utilisation des mots clés this et super dans une sous-classe
<p style="text-align: justify;">Nous avons déjà vu dans les leçons précédentes que le mot clé <em>this</em> sert à nous référer à une instance courante de l'objet comme dans l'exemple ci-dessous.</p> 

```java  {style=github}
public class Sudoku {
    private int difficulte;

    public void setDifficulte(int diff) {
        this.difficulte = diff;
    }
}
```

<blockquote></blockquote> 
<p dir="ltr" style="text-align: justify;">Quand nous voulons nous référer à un champ ou à une méthode qui appartient à une classe de base, nous utilisons le mot clé <em>super</em>. Cela fonctionne de la même façon qu'avec <em>this,</em> mais super renvoie à une instance de la classe de base au lieu de celle de la classe courante.</p> 
<p dir="ltr" style="text-align: justify;">Considérons les deux classes suivantes :</p> 

```java  {style=github}
class Jeu {
    public void choixDeJeu() {
        System.out.println(" Niveau expert!");
    }
}

public class Sudoku extends Jeu {
    public void choixDeJeu() {
        System.out.println("je joue au Sudoku :");
        super.choixDeJeu();
    }
}
```

<blockquote></blockquote> 
<p dir="ltr" style="text-align: justify;">Après l'exécution de ce programme, nous aurons :</p> 
<p>je joue au SUDOKU :</p> 
<p>Niveau expert</p> 
<p>Ainsi, avec le mot clé <em>super</em>, nous appelons la méthode choixdejeu de la classe de base. Nous pouvons aussi utiliser ce mot clé dans un constructeur.</p> 

## Constructeur d'une classe héritée
<p><br />Le constructeur de la classe dérivée (ou héritée) fait appel au constructeur de la superclasse au moment de la création d'un objet. (Le SUDOKU est avant tout un jeu.) Cet appel au constructeur de la superclasse peut être implicite ou explicite. Dans ce dernier cas, le constructeur de la classe héritée exécutera la première instruction.</p> 

```java  {style=github}
class Jeu {
    String nom;
    String description;
    String but;

    Jeu(String nom, String description, String but) {
        this.nom = nom;
        this.description = description;
        this.but = but;
    }
}

public class Sudoku extends Jeu {
    public Sudoku(String nom, String description, String but) {
        super(nom, description, but);

    }
}
```

<p>Cet exemple montre comment appeler le constructeur de la superclasse.</p>

<p><a id="intro" name="section2"></a></p>

## Classes abstraites
<p>Les classes Abstraites permettent de créer des concepts de haut-niveau, ne pouvant être instanciés et rendant obligatoire la conception de sous-classes pour leur utilisation. Les classes abstraites sont donc souvent utilisées dans des API ou autres bibliothèques de code.  Afin de rendre possible la redéfinition de méthode par héritage, les méthodes d'une superclasse doivent être déclarées avec le modificateur <em>abstract</em>. Ainsi, une classe abstraite est une classe qui contient des méthodes abstraites. L'intérêt de ceci est de rendre la classe « héritable ». <br />La sous-classe peut implémenter ou non les méthodes abstraites héritées. Si elles ne les implémentent pas, elle est elle-même une classe abstraite. <br />Une sous-classe dérivant d'une classe non abstraite peut définir des nouvelles méthodes abstraites, et par le fait même, devenir à leur tour abstraite.</p> 
<p>Remarque : Nous ne pouvons instancier des objets d'une classe abstraite. Ce sont des classes qui sont destinées à subir le processus d'héritage.</p> 

## Utilisation du modificateur final
<p>Il arrive que nous ne souhaitions pas offrir une possibilité d'héritage à une certaine classe. Dans ce cas, nous la définissons avec le mot clé <em>final</em>. <br />Si le mot clé <em>final</em> est utilisé dans la définition d'une méthode, celle-ci ne pourra plus être redéfinie par héritage. <br />Enfin, nous définissons une constante en écrivant <em>final</em> dans la déclaration de la variable.<br/> Voici un exemple d'utilisation d'une classe abstraite. Ici, la méthode analyse est abstraite et oblige donc les sous-classes à implémenter celle-ci :</p> 

```java  {style=github}
public abstract class AlgorithmeIA {
    
    Object[] data = null;
    
    public AlgorithmeIA(Object[] data) {
        this.data = data;
    }
    
    public abstract Object[] analyse();
    
}

public class FastDynamicTimeWarping extends AlgorithmeIA {

    public FastDynamicTimeWarping(Object[] data) {
        super(data);
    }
    
    // Implementation de la méthode abstraite de AlgorithmeIA
    @Override
    public Object[] analyse() {
        //Ajouter le code pour le traitement FDTW
        return null;
    }
    
}
```

<p><a id="intro" name="section3"></a></p>

## Les interfaces

<p>Dans certains langages, l'héritage multiple (quand une classe hérite de plusieurs autres classes) peut amener à des problèmes d'exécution ou de compilation sérieux. Ce problème est bien connu dans le langage C++, avec le problème du diamant.</p>

<p>Dans le problème du diamant, l'héritage multiple provoque un problème de résolution pour la surcharge de la méthode "equals" à la compilation. Ainsi, le compilateur ne peut savoir quelle méthode surcharger? Rectangle.equals ou bien Clickable.equals ? Pour éviter les problèmes d'héritage multiple, les concepteurs du langage Java ont empêché celui-ci et ils ont créé une autre mécanique, les interfaces (rien à voir les interfaces graphiques). Une interface peut, jusqu'à un certain point, ressembler à une classe abstraite, à la différence que toutes les méthodes sont "abstraites" (elles doivent donc être implémentées) et qu'elle ne possède pas de variables. Voici un exemple de déclaration d'une interface, tout comme les classes, la déclaration d'une interface doit être placée dans un fichier .java du même nom que l'interface : /p>

```java  {style=github}
public interface Clickable {
    
    public void clicked();
    
}
```

<p>La classe qui implémente une interface est forcée d'implémenter la méthode déclarée. En échange, elle peut être "casté" dans l'interface et se faire passer pour l'interface. Il y a donc plusieurs usages aux interfaces tels que: émuler l'héritage multiple et obliger la déclaration de méthodes. Encore là, les interfaces sont régulièrement utilisées dans les API et les bibliothèques de code. Voici un exemple d'usage d'une interface :</p>

```java  {style=github}
public abstract class Rectangle {
    
    int largeur;
    int hauteur;
    
    public Rectangle(int largeur, int hauteur) {
        
    }
    
    public abstract void draw ;
    
    
}

public interface Clickable {
    
    public void clicked();
    
}

public class Button extends Rectangle implements Clickable {

    public Button(int largeur, int hauteur) {
        super(largeur, hauteur);
    }

    @Override
    public void clicked() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
```

<p><a id="intro" name="section4"></a></p>

## Protection des données héritées
<p>Les trois modificateurs de portée qui réalisent l'encapsulation jouent simultanément un rôle dans la protection des données.</p> 



| Modificateur | Rôles |
|--------------|-------|
| private      | C'est le niveau de protection le plus fort. Les composants ne sont visibles qu'à l'intérieur de la classe : ils ne peuvent être modifiés que par des méthodes définies dans la classe prévues à cet effet. Les méthodes déclarées _private_ ne peuvent pas être en même temps déclarée _abstract_, car elles ne peuvent pas être redéfinies dans les classes filles. |
| protected    | Si une méthode ou une variable est déclarée _protected_, seules les méthodes présentes dans le même package que cette classe ou de ses sous-classes pourront y accéder. |
| public       | Ce modificateur stipule que la variable ou la méthode est visible par tous les autres objets. |
|              | Lorsqu'un membre de la classe n'est précédé d'aucun modificateur, il est accessible à toutes les classes du même package que la classe qui le définit. |


## Classes scellées


Les classes scellées permettent de contrôler précisément quelles classes peuvent étendre une classe ou implémenter une interface. Voici deux exemples concrets pour illustrer leur utilisation.

### Exemple 1 : hiérarchie de formes géométriques

Dans cet exemple, une classe abstraite Forme est scellée et ne peut être étendue que par Cercle, Rectangle et Triangle.

```java  {style=github}
public abstract sealed class Forme permits Cercle, Rectangle, Triangle {
    public abstract double calculerAire();
}

public final class Cercle extends Forme {
    private final double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }
}

public final class Rectangle extends Forme {
    private final double longueur;
    private final double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerAire() {
        return longueur * largeur;
    }
}

public non-sealed class Triangle extends Forme {
    private final double base;
    private final double hauteur;

    public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public double calculerAire() {
        return (base * hauteur) / 2;
    }
}
```

### Exemple 2 : interface scellée pour types de véhicules

```java  {style=github}
public sealed interface Vehicule permits Voiture, Moto {
    String getType();
}

public final class Voiture implements Vehicule {
    @Override
    public String getType() {
        return "Voiture";
    }
}

public final class Moto implements Vehicule {
    @Override
    public String getType() {
        return "Moto";
    }
}

public class TestVehicule {
    public static void main(String[] args) {
        Vehicule voiture = new Voiture();
        Vehicule moto = new Moto();
        System.out.println(voiture.getType()); // Affiche : Voiture
        System.out.println(moto.getType());   // Affiche : Moto
    }
}
```


### Lecture optionnelle dans le livre de référence (Delannoy)

<p>Pour aller plus en profondeur (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 8:</p>
<ul>
	<li>Section 1 à 5</li>
	<li>Section 8 : Les membres protégés</li>
	<li>Section 10 : Classes et méthodes finales</li>
	<li>Section 11 : Les classes abstraites</li>
	<li>Section 12 : Les interfaces</li>
</ul>

## Vidéos



<iframe width="560" height="315" src="https://www.youtube.com/embed/8TSVW7SV0KA" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/dd0_nYhtaKQ" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/M0hkhOoOIHg" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<ol>
<li><a href="https://www.youtube.com/playlist?list=PLZbs1ERZ-TGVouVQxf5QAsocS1awCi6d3">Il y a une liste de vidéos sur l'héritage par Sam et al.</a> </li>
</ol>
