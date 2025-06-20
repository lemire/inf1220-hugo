---
title: "L'héritage, les classes abstraites et les interfaces"
weight: 1
---


# L'héritage, les classes abstraites et les interfaces

L’héritage, les classes abstraites et les interfaces sont des concepts centraux de la programmation orientée objet en Java. Ils permettent de structurer le code. 
En utilisant correctement ces idées, on peut rendre les programmes plus modulaires, évolutifs et faciles à maintenir. Comprendre ces notions est essentiel pour concevoir des applications robustes et flexibles.


## L'héritage


<p> <p align="left" style="text-align: justify;">Après avoir présenté les objets et les classes dans les leçons précédentes, nous abordons ici la notion d'héritage. Cette technique, appliquée à la programmation Java, permet de créer de nouvelles classes fondées sur celles qui existent déjà. Lorsque nous héritons d'une classe, nous réutilisons ses méthodes et champs, auxquels nous pouvons ajouter de nouveaux champs en vue de l'adapter à de nouvelles situations.</p> 

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


Prenons un autre exemple. Imaginons une application bancaire avec différents types de comptes : CompteEpargne et CompteCourant. Tous les comptes partagent des propriétés comme le solde et des opérations comme déposer ou retirer de l'argent, mais chaque type de compte a des règles spécifiques.


{{<inlineJava path="CompteBancaire.java">}}

class CompteBancaire {
    protected double solde;
    protected String titulaire;

    // Constructeur de la classe de base
    CompteBancaire(String titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + ". Nouveau solde : " + solde);
        }
    }

    void retirer(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
            System.out.println("Retrait de " + montant + ". Nouveau solde : " + solde);
        } else {
            System.out.println("Retrait impossible.");
        }
    }

    // Classe statique interne pour CompteEpargne
    static class CompteEpargne extends CompteBancaire {
        private double tauxInteret;

        CompteEpargne(String titulaire, double soldeInitial, double tauxInteret) {
            super(titulaire, soldeInitial);
            this.tauxInteret = tauxInteret;
        }

        void appliquerInteret() {
            double interet = solde * tauxInteret / 100;
            solde += interet;
            System.out.println("Intérêt de " + interet + " appliqué. Nouveau solde : " + solde);
        }
    }

    // Classe statique interne pour CompteCourant
    static class CompteCourant extends CompteBancaire {
        private double decouvertAutorise;

        CompteCourant(String titulaire, double soldeInitial, double decouvertAutorise) {
            super(titulaire, soldeInitial);
            this.decouvertAutorise = decouvertAutorise;
        }

        @Override
        void retirer(double montant) {
            if (montant > 0 && solde + decouvertAutorise >= montant) {
                solde -= montant;
                System.out.println("Retrait de " + montant + ". Nouveau solde : " + solde);
            } else {
                System.out.println("Retrait impossible (découvert dépassé).");
            }
        }
    }

    public static void main(String[] args) {
        CompteEpargne epargne = new CompteEpargne("Alice", 1000, 2.5);
        CompteCourant courant = new CompteCourant("Bob", 500, 200);

        epargne.deposer(500); // Dépôt de 500. Nouveau solde : 1500
        epargne.appliquerInteret(); // Intérêt de 37.5 appliqué. Nouveau solde : 1537.5
        courant.retirer(600); // Retrait de 600. Nouveau solde : -100
        courant.retirer(200); // Retrait impossible (découvert dépassé).
    }
}
{{</inlineJava>}}


Dans cet exemple, le système bancaire est modélisé en une seule classe CompteBancaire qui contient deux classes statiques internes : CompteEpargne et CompteCourant. Ces classes statiques simulent l'héritage en étendant la classe englobante CompteBancaire, qui définit les attributs et comportements communs (solde, titulaire, méthodes deposer et retirer). L'utilisation de classes statiques internes permet de regrouper toute la logique dans un seul fichier Java, tout en conservant une structure hiérarchique claire. Les classes CompteEpargne et CompteCourant héritent des fonctionnalités de CompteBancaire et ajoutent leurs comportements spécifiques : appliquerInteret pour CompteEpargne et une version redéfinie de retirer pour CompteCourant qui gère un découvert autorisé. Le programme est testé dans une méthode main qui crée des instances des deux types de comptes et montre leur comportement distinct.

Une classe statique interne est une classe définie à l'intérieur d'une autre classe et déclarée avec le mot-clé static. Contrairement à une classe interne non statique, elle ne nécessite pas d'instance de la classe englobante pour être utilisée, ce qui la rend indépendante et adaptée pour organiser des sous-classes logiquement liées. Le mot-clé @Override est une annotation en Java qui indique qu'une méthode dans une sous-classe redéfinit une méthode de la superclasse. Dans l'exemple, CompteCourant utilise @Override pour redéfinir retirer, signalant au compilateur que cette méthode remplace celle de CompteBancaire. Cela améliore la lisibilité et permet au compilateur de vérifier que la méthode existe bien dans la superclasse, évitant des erreurs. La logique du code repose sur cette hiérarchie : CompteBancaire fournit une base générique, tandis que CompteEpargne et CompteCourant spécialisent le comportement. Lors de l'exécution, CompteEpargne applique des intérêts, et CompteCourant autorise des retraits jusqu'à une limite de découvert, démontrant comment l'héritage et le polymorphisme (via @Override) permettent des comportements adaptés tout en partageant du code commun.


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


En Java, le mot-clé this est une référence à l'instance actuelle de la classe dans laquelle il est utilisé. Il sert principalement à lever l'ambiguïté entre les variables d'instance et les paramètres ou variables locales ayant le même nom. Par exemple, dans un constructeur ou une méthode, si un paramètre porte le même nom qu'un attribut de la classe, this permet de spécifier que l'on fait référence à l'attribut de l'instance. De plus, this peut être utilisé pour appeler un autre constructeur de la même classe (via this()) ou pour passer l'instance actuelle comme argument à une méthode. Ce mot-clé est essentiel pour écrire un code clair et éviter des erreurs dans la gestion des variables, surtout dans des classes avec de nombreux attributs.

Un autre usage de this est de renforcer la lisibilité du code en explicitant que l'on manipule les membres de l'instance courante, même en l'absence d'ambiguïté. Par exemple, dans une méthode, écrire this.nom = nom; est plus explicite que nom = nom;, car cela indique clairement que l'attribut de l'instance est modifié. Cependant, this ne peut pas être utilisé dans des contextes statiques (comme les méthodes ou blocs static), car il se réfère à une instance spécifique, et les membres statiques appartiennent à la classe elle-même. Voici un exemple simple illustrant l'utilisation de this dans une classe Java pour gérer les attributs et appeler un autre constructeur.

{{<inlineJava path="Etudiant.java">}}
class Etudiant {
    String nom;
    int age;

    // Constructeur avec un seul paramètre
    Etudiant(String nom) {
        this(nom, 18); // Appelle l'autre constructeur avec un âge par défaut
    }

    // Constructeur avec deux paramètres
    Etudiant(String nom, int age) {
        this.nom = nom; // Utilise this pour distinguer l'attribut du paramètre
        this.age = age;
    }

    void afficherDetails() {
        System.out.println("Nom : " + this.nom + ", Âge : " + this.age);
    }

    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("Alice", 20);
        Etudiant etudiant2 = new Etudiant("Bob");

        etudiant1.afficherDetails(); // Nom : Alice, Âge : 20
        etudiant2.afficherDetails(); // Nom : Bob, Âge : 18
    }
}

{{</inlineJava>}}


Dans cet exemple, this est utilisé dans le constructeur pour assigner les valeurs des paramètres nom et age aux attributs de l'instance, évitant toute confusion. De plus, le constructeur à un seul paramètre utilise this(nom, 18) pour déléguer l'initialisation à l'autre constructeur, démontrant une autre facette de l'utilité de this. La méthode afficherDetails emploie this.nom pour accéder à l'attribut, bien que ce ne soit pas strictement nécessaire ici, afin d'améliorer la clarté du code.

Ainsi le mot clé <em>this</em> sert à nous référer à une instance courante de l'objet comme dans l'exemple ci-dessous.</p> 

```java  {style=github}
public class Sudoku {
    private int difficulte;

    public void setDifficulte(int diff) {
        this.difficulte = diff;
    }
}
```

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

<p dir="ltr" style="text-align: justify;">Après l'exécution de ce programme, nous aurons :</p> 
<p>je joue au SUDOKU :</p> 
<p>Niveau expert</p> 
<p>Ainsi, avec le mot clé <em>super</em>, nous appelons la méthode choixdejeu de la classe de base. Nous pouvons aussi utiliser ce mot clé dans un constructeur.</p> 

## Constructeur d'une classe héritée
Le constructeur de la classe dérivée (ou héritée) fait appel au constructeur de la superclasse au moment de la création d'un objet. (Le SUDOKU est avant tout un jeu.) Cet appel au constructeur de la superclasse peut être implicite ou explicite. Dans ce dernier cas, le constructeur de la classe héritée exécutera la première instruction.

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
<p>Les classes abstraites permettent de créer des concepts de haut-niveau, ne pouvant être instanciés et rendant obligatoire la conception de sous-classes pour leur utilisation. Les classes abstraites sont donc souvent utilisées dans des API ou autres bibliothèques de code.  Afin de rendre possible la redéfinition de méthode par héritage, les méthodes d'une superclasse doivent être déclarées avec le modificateur <em>abstract</em>. Ainsi, une classe abstraite est une classe qui contient des méthodes abstraites. L'intérêt de ceci est de rendre la classe « héritable ». <br />La sous-classe peut implémenter ou non les méthodes abstraites héritées. Si elles ne les implémentent pas, elle est elle-même une classe abstraite. <br />Une sous-classe dérivant d'une classe non abstraite peut définir des nouvelles méthodes abstraites, et par le fait même, devenir à leur tour abstraite.</p> 
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

Et voici une variante avec les classes statiques.

{{<inlineJava path="VehiculeSystem.java">}}
class VehiculeSystem {
    // Interface statique interne
    static interface Vehicule {
        String getType();
    }

    // Classe statique interne Voiture
    static class Voiture implements Vehicule {
        @Override
        public String getType() {
            return "Voiture";
        }
    }

    // Classe statique interne Moto
    static class Moto implements Vehicule {
        @Override
        public String getType() {
            return "Moto";
        }
    }

    // Méthode main pour tester
    public static void main(String[] args) {
        Vehicule voiture = new Voiture();
        Vehicule moto = new Moto();
        System.out.println(voiture.getType()); // Affiche : Voiture
        System.out.println(moto.getType());   // Affiche : Moto
    }
}
{{</inlineJava>}}

### Héritage multiple

L’héritage multiple, qui permet à une classe d’hériter de plusieurs classes parentes, est une fonctionnalité disponible dans certains langages comme C++, mais absente en Java pour des raisons de simplicité et de sécurité. En Java, une classe ne peut étendre qu’une seule classe (héritage simple), ce qui évite des complexités et des ambiguïtés potentielles, notamment le problème du diamant. 

Le problème du diamant est une ambiguïté classique liée à l’héritage multiple, qui explique en partie pourquoi Java l’évite. Imaginons une classe D qui hérite de deux classes B et C, elles-mêmes héritant d’une classe commune A. Si A définit une méthode m(), et que B et C la redéfinissent différemment, quelle version de m() D doit-elle hériter ? Cette situation, appelée problème du diamant en raison de la forme en losange de la hiérarchie (A au sommet, B et C au milieu, D en bas), peut créer des conflits difficiles à résoudre. En C++, des mécanismes comme les classes virtuelles permettent de gérer ce problème, mais ils ajoutent de la complexité. Java évite cela en interdisant l’héritage multiple pour les classes, obligeant les développeurs à utiliser une hiérarchie claire et linéaire.

Pour contourner l’absence d’héritage multiple, Java propose des interfaces, qui peuvent être implémentées en nombre illimité par une classe, et la composition, où une classe inclut des instances d’autres classes pour réutiliser leurs fonctionnalités. Par exemple, une classe VehiculeAmphibie qui doit combiner les comportements d’un Bateau et d’une Voiture peut implémenter les interfaces Navigable et Roulable, chacune définissant des méthodes spécifiques. Si des attributs ou des méthodes communes sont nécessaires, la composition (inclure un Bateau et une Voiture comme attributs) est préférable à l’héritage. Cette approche, combinée aux méthodes par défaut des interfaces (depuis Java 8), permet de simuler les avantages de l’héritage multiple sans les inconvénients du problème du diamant, tout en gardant le code modulaire et maintenable.

En pratique, il est presque toujours préférable d'utiliser les interfaces plutôt que l'héritage.

## Les interfaces

En Java, une interface est un contrat qui définit un ensemble de méthodes abstraites (et parfois des méthodes par défaut ou statiques) qu’une classe doit implémenter. Contrairement à l’héritage, où une classe hérite directement des attributs et méthodes d’une superclasse, une interface se concentre sur ce qu’une classe doit faire, sans imposer comment elle le fait. Cela en fait une alternative pragmatique à l’héritage, car les interfaces permettent une flexibilité accrue, évitent les problèmes de l’héritage multiple (non supporté en Java pour les classes) et favorisent une conception modulaire. Une classe peut implémenter plusieurs interfaces, ce qui permet de combiner des comportements variés sans créer une hiérarchie rigide. De plus, les interfaces sont idéales pour définir des comportements standardisés (comme trier ou comparer) utilisés dans des contextes génériques, rendant le code plus réutilisable et maintenable.

L’héritage est utile pour modéliser des relations « est-un » (par exemple, un Chat est un Animal), mais il peut devenir lourd si la hiérarchie devient complexe ou si une classe doit combiner des comportements de plusieurs sources. Les interfaces, en revanche, modélisent des capacités ou des rôles (« peut-faire »), comme « comparable » ou « sérialisable ». Elles sont particulièrement adaptées aux bibliothèques Java standard, où des interfaces comme Comparable, Comparator, Runnable ou Serializable définissent des comportements que de nombreuses classes peuvent adopter. Voici des exemples concrets d’interfaces courantes en Java, avec du code pour illustrer leur utilité.

L’interface Comparable est utilisée pour définir un ordre naturel pour les objets d’une classe, souvent pour le tri. Une classe qui implémente Comparable doit fournir la méthode compareTo, qui compare l’objet courant à un autre. Voici un exemple. 

{{<inlineJava path="Etudiant.java">}}
class Etudiant implements Comparable<Etudiant> {
    private String nom;
    private int age;

    Etudiant(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public int compareTo(Etudiant autre) {
        return Integer.compare(this.age, autre.age); // Tri par âge
    }

    @Override
    public String toString() {
        return nom + " (" + age + ")";
    }

    public static void main(String[] args) {
        Etudiant[] etudiants = {
            new Etudiant("Alice", 20),
            new Etudiant("Bob", 18),
            new Etudiant("Charlie", 22)
        };

        java.util.Arrays.sort(etudiants); // Trie grâce à compareTo
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }
}
{{</inlineJava>}}

En implémentant Comparable, la classe Etudiant définit un ordre naturel (ici, par âge). Cela permet d’utiliser des méthodes comme Arrays.sort ou Collections.sort sans code supplémentaire. Contrairement à l’héritage, où une classe de base pourrait imposer une structure rigide, Comparable ajoute une capacité de tri sans affecter la hiérarchie de la classe.

L’interface Comparator permet de définir des ordres de tri personnalisés, indépendamment de l’ordre naturel défini par Comparable. Elle est utile lorsque vous voulez trier des objets de différentes manières sans modifier leur classe.

{{<inlineJava path="Etudiant.java">}}
import java.util.Arrays;
import java.util.Comparator;

public class Etudiant {
    private String nom;
    private int age;

    public Etudiant(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return nom + " (" + age + ")";
    }

    private static class ComparateurParNom implements Comparator<Etudiant> {
        @Override
        public int compare(Etudiant e1, Etudiant e2) {
            return e1.getNom().compareTo(e2.getNom());
        }
    }

    public static void main(String[] args) {
        Etudiant[] etudiants = {
            new Etudiant("Charlie", 22),
            new Etudiant("Alice", 20),
            new Etudiant("Bob", 18)
        };

        Arrays.sort(etudiants, new ComparateurParNom());
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }
}
{{</inlineJava>}}

Ici, Comparator permet de trier les Etudiant par nom sans modifier la classe Etudiant. Cela illustre la flexibilité des interfaces : au lieu d’hériter d’une classe de base avec une méthode de tri fixe, on définit un comparateur externe. Cela est particulièrement utile pour des tris multiples (par nom, âge, etc.) ou pour des classes que vous ne pouvez pas modifier.


L’interface Serializable est une interface marqueur (sans méthode) qui indique qu’une classe peut être sérialisée, c’est-à-dire convertie en un flux d’octets pour être sauvegardée ou transmise.

{{<inlineJava path="Produit.java">}}
import java.io.*;

class Produit implements Serializable {
    private String nom;
    private double prix;

    Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit : " + nom + ", Prix : " + prix;
    }

    public static void main(String[] args) {
        Produit produit = new Produit("Ordinateur", 999.99);

        // Sérialisation
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("produit.ser"))) {
            oos.writeObject(produit);
            System.out.println("Produit sérialisé.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Désérialisation
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("produit.ser"))) {
            Produit produitDeserialise = (Produit) ois.readObject();
            System.out.println("Produit désérialisé : " + produitDeserialise);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
{{</inlineJava>}}

L'interface Serializable en Java est une interface marqueur, c'est-à-dire qu'elle ne définit aucune méthode, mais indique que les objets d'une classe peuvent être sérialisés, c'est-à-dire convertis en un flux de données (par exemple, pour être sauvegardés dans un fichier ou transmis via un réseau). Lorsqu'une classe implémente Serializable, le mécanisme de sérialisation de Java peut automatiquement sauvegarder l'état de ses champs non transitoires et non statiques. Cela est particulièrement utile dans des contextes comme la persistance d'objets ou la communication entre applications. Pour une gestion fine, les développeurs peuvent personnaliser le processus avec les méthodes writeObject et readObject ou utiliser l'attribut serialVersionUID pour assurer la compatibilité entre différentes versions d'une classe.

En Java, une interface peut inclure des méthodes statiques (depuis Java 8) et des champs statiques (qui sont implicitement public, static, et final, donc des constantes). Les méthodes statiques dans une interface sont utiles pour fournir des utilitaires liés au contrat de l’interface, tandis que les champs statiques définissent des valeurs constantes partagées par toutes les implémentations. Voici un exemple concret d’interface avec une méthode statique et un champ statique, suivi d’un exemple d’utilisation.


```java {style=github}
interface GestionStock {
    // Champ statique (constante)
    double TAXE_VENTE = 0.20; // 20% de taxe sur les ventes

    // Méthode abstraite à implémenter
    double calculerValeurStock(int quantite, double prixUnitaire);

    // Méthode statique pour calculer le prix avec taxe
    static double calculerPrixAvecTaxe(double prix) {
        return prix * (1 + TAXE_VENTE);
    }
}

class Produit implements GestionStock {
    private String nom;

    Produit(String nom) {
        this.nom = nom;
    }

    @Override
    public double calculerValeurStock(int quantite, double prixUnitaire) {
        return quantite * prixUnitaire;
    }

    public String getNom() {
        return nom;
    }
}

class TestGestionStock {
    public static void main(String[] args) {
        Produit produit = new Produit("Ordinateur");
        int quantite = 10;
        double prixUnitaire = 1000.0;

        // Calcul de la valeur du stock
        double valeurStock = produit.calculerValeurStock(quantite, prixUnitaire);
        System.out.println("Valeur du stock de " + produit.getNom() + " : " + valeurStock);

        // Utilisation de la méthode statique et du champ statique
        double prixAvecTaxe = GestionStock.calculerPrixAvecTaxe(prixUnitaire);
        System.out.println("Prix unitaire avec taxe (" + (GestionStock.TAXE_VENTE * 100) + "%) : " + prixAvecTaxe);
    }
}
```


### Instanciation anonyme

L’instanciation anonyme consiste à créer une instance d’une classe ou d’une interface sans lui donner de nom explicite, généralement pour une utilisation ponctuelle. En Java, cela sert souvent à fournir rapidement une implémentation d’une interface ou à redéfinir une méthode d’une classe abstraite, sans devoir écrire une classe séparée. Cette technique est très utilisée pour les interfaces fonctionnelles, comme ActionListener ou Comparator, notamment dans la programmation événementielle ou pour trier des collections.

L’avantage principal de l’instanciation anonyme est de rendre le code plus concis et lisible, surtout lorsqu’on n’a besoin de l’implémentation qu’à un seul endroit du programme. Cela évite de créer des classes supplémentaires inutiles et permet de garder le code lié à son contexte d’utilisation.


```java {style=github}
List<Integer> liste = Arrays.asList(5, 2, 9, 1);
Collections.sort(liste, new Comparator<Integer>() {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a; // ordre décroissant
    }
});
System.out.println(liste); // Affiche [9, 5, 2, 1]
```

Dans cet exemple, on crée un Comparator anonyme directement dans l’appel à Collections.sort, ce qui rend le code plus compact et facile à comprendre.


## Protection des données héritées
<p>Les trois modificateurs de portée qui réalisent l'encapsulation jouent simultanément un rôle dans la protection des données.</p> 



| Modificateur | Rôles |
|--------------|-------|
| private      | C'est le niveau de protection le plus fort. Les composants ne sont visibles qu'à l'intérieur de la classe : ils ne peuvent être modifiés que par des méthodes définies dans la classe prévues à cet effet. Les méthodes déclarées _private_ ne peuvent pas être en même temps déclarée _abstract_, car elles ne peuvent pas être redéfinies dans les classes filles. |
| protected    | Si une méthode ou une variable est déclarée _protected_, seules les méthodes présentes dans le même package que cette classe ou de ses sous-classes pourront y accéder. |
| public       | Ce modificateur stipule que la variable ou la méthode est visible par tous les autres objets. |
|              | Lorsqu'un membre de la classe n'est précédé d'aucun modificateur, il est accessible à toutes les classes du même package que la classe qui le définit. |



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
