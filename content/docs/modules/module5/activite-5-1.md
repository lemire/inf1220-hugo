---
title: "L'héritage, les classes abstraites et les interfaces"
weight: 1
---


# L'héritage, les classes abstraites et les interfaces

L’héritage, les classes abstraites et les interfaces sont des concepts centraux de la programmation orientée objet en Java. Ils permettent de structurer le code. 
En utilisant correctement ces idées, on peut rendre les programmes plus modulaires, évolutifs et faciles à maintenir. Comprendre ces notions est essentiel pour concevoir des applications robustes et flexibles.


## L'héritage


Après avoir présenté les objets et les classes dans les leçons précédentes, nous abordons ici la notion d'héritage. Cette technique, appliquée à la programmation Java, permet de créer de nouvelles classes fondées sur celles qui existent déjà. Lorsque nous héritons d'une classe, nous réutilisons ses méthodes et champs, auxquels nous pouvons ajouter de nouveaux champs en vue de l'adapter à de nouvelles situations.


## Classe - superclasse - sous-classe

Pour illustrer ce concept, essayons de concevoir un jeu. Tous les jeux ont un nom, un but, un nombre de joueurs requis pour faire une partie, des règles à respecter… Nous pourrions donc envisager de créer une classe Jeu pour représenter les jeux. <br />Toutefois, les règles du jeu Tetris diffèrent de celles de Sudoku, et le nombre de joueurs d'une partie de football n'est pas le même que celui d'une partie de tennis… <br />Supposons que nous implantions une méthode jouer() pour la classe Jeu. Un joueur de tennis ne joue pas de la même façon qu'un joueur de football. Il est par conséquent impossible d'obtenir une implémentation de jouer() qui peut correspondre à tous les jeux.

L'héritage est un mécanisme qui permet de résoudre ce genre de problème. En fait, nous spécifions dans la classe Jeu, appelée superclasse, l'ensemble des comportements communs à tous les jeux sans fournir une implémentation. Nous créons ensuite des sous-classes qui fournissent pour chaque jeu une implémentation appropriée. D'une manière générale, le format de déclaration d'une sous-classe est le suivant&nbsp;:

```java  {style=github}
public class SousClasse extends SuperClasse {
    // les instructions

}
```

Pour signifier l'héritage, nous employons le mot clé <em>extends.</em> Nous créons ainsi une classe qui dérive d'une classe existante, qui portera le nom de <em>superclasse,</em> et la nouvelle classe sera nommée <em>sous-classe</em>.

Voici maintenant la façon de définir une classe Sudoku qui hérite de la superclasse Jeu&nbsp;:

```java  {style=github}
public class Sudoku extends Jeu {

    // ici nous définissons les champs et les méthodes
}
```

<p align="left">Dans l'exemple ci-dessus, la superclasse est la classe Jeu tandis que la sous-classe est la classe Sudoku. La sous-classe hérite automatiquement de tous les champs et de toutes méthodes de la superclasse. Voici quelques principes fondamentaux de l'héritage&nbsp;:</p> 
<ul> 
  <li>une sous-classe hérite de tous les membres de la superclasse. Les constructeurs n'étant pas considérés comme étant membres d'une classe, la sous-classe ne peut donc pas hériter des constructeurs de la superclasse; </li> 
  <li>la visibilité (<em>public ou private</em>) de n'importe quels membres de la superclasse est la même dans la sous-classe. Cela voudra dire que si une méthode ou un champ est déclaré <em>private</em> dans la superclasse, la sous-classe ne peut y avoir accès; </li> 
  <li>nous pouvons surcharger une méthode en réutilisant la même signature (nom de méthode et paramètres) et en utilisant l'annotation @override; </li> 
  <li>un autre type, <em>protected,</em> permet de cacher les champs et les méthodes de la superclasse, mais ses membres sont accessibles à la sous-classe; </li> 
  <li>nous pouvons aussi ajouter des méthodes et des champs <em>private</em> et <em>protected</em> à une sous-classe. </li> 
</ul> 

En Java, l'annotation @Override est utilisée pour indiquer qu'une méthode dans une sous-classe redéfinit ou remplace une méthode déclarée dans une superclasse ou une interface. Elle aide le compilateur à vérifier que la méthode respecte les règles de surcharge, comme avoir la même signature (nom, paramètres, type de retour) que la méthode d'origine. Si la méthode annotée ne correspond pas à une méthode de la superclasse, le compilateur génère une erreur, ce qui améliore la sécurité et la lisibilité du code. Bien que facultative, son utilisation est recommandée pour éviter des erreurs accidentelles, notamment lors de la maintenance ou de la refactorisation.

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


Voici la structure de quelques classes importantes en Java. Cette structure illustre les relations d'héritage entre plusieurs classes fondamentales de Java, mettant en évidence leur organisation hiérarchique. La classe Object constitue la racine de toutes les classes, servant de parent direct à des classes comme Throwable, AbstractCollection, AbstractMap, InputStream et OutputStream. La branche des exceptions, avec Throwable comme base, se divise en Exception et Error, où Exception donne naissance à RuntimeException pour les erreurs non vérifiées. Dans le domaine des collections, AbstractCollection mène à AbstractList, qui est elle-même étendue par ArrayList, tandis que AbstractMap est la base de HashMap. Pour les entrées/sorties, InputStream et OutputStream sont des classes abstraites dont dérivent respectivement FileInputStream et FileOutputStream. Cette hiérarchie reflète la conception modulaire de Java, facilitant la réutilisation du code et la spécialisation des fonctionnalités.

{{< mermaid >}}
classDiagram
    class Object {
        java.lang.Object
    }
    class Throwable {
        java.lang.Throwable
    }
    class Exception {
        java.lang.Exception
    }
    class RuntimeException {
        java.lang.RuntimeException
    }
    class Error {
        java.lang.Error
    }
    class AbstractCollection {
        java.util.AbstractCollection
    }
    class AbstractList {
        java.util.AbstractList
    }
    class AbstractMap {
        java.util.AbstractMap
    }
    class ArrayList {
        java.util.ArrayList
    }
    class HashMap {
        java.util.HashMap
    }
    class InputStream {
        java.io.InputStream
    }
    class OutputStream {
        java.io.OutputStream
    }
    class FileInputStream {
        java.io.FileInputStream
    }
    class FileOutputStream {
        java.io.FileOutputStream
    }

    Object <|-- Throwable
    Throwable <|-- Exception
    Throwable <|-- Error
    Exception <|-- RuntimeException

    Object <|-- AbstractCollection
    Object <|-- AbstractMap
    Object <|-- InputStream
    Object <|-- OutputStream

    AbstractCollection <|-- AbstractList
    AbstractList <|-- ArrayList
    AbstractMap <|-- HashMap

    InputStream <|-- FileInputStream
    OutputStream <|-- FileOutputStream
{{< /mermaid >}}


## Mot-clé instanceof et getClass()


L'opérateur instanceof en Java permet de vérifier si un objet est une instance d'une classe spécifique ou d'une de ses sous-classes. Il est utilisé pour tester le type d'un objet à l'exécution, ce qui est particulièrement utile dans des contextes où le polymorphisme est impliqué, comme avec des hiérarchies de classes ou des interfaces. Par exemple, si une variable est déclarée comme étant de type interface ou classe parente, instanceof peut déterminer si l'objet référencé appartient à une classe dérivée particulière. Cet opérateur renvoie true si l'objet est compatible avec le type spécifié, et false sinon. Cependant, il faut noter que instanceof retourne false pour un objet null, et son usage excessif peut indiquer un mauvais design orienté objet, car il peut contourner les avantages du polymorphisme.


Dans l'exemple suivant, instanceof vérifie si animal1 est un Chien (vrai, car c'est une instance de Chien) et si animal2 est un Chat (vrai). Il retourne false pour animal3, car null n'est pas une instance de quelque classe que ce soit.

{{<inlineJava path="Main.java">}}
class Animal {}
class Chien extends Animal {}
class Chat extends Animal {}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Chien();
        Animal animal2 = new Chat();
        Animal animal3 = null;

        System.out.println(animal1 instanceof Chien); // true
        System.out.println(animal1 instanceof Animal); // true
        System.out.println(animal1 instanceof Chat); // false
        System.out.println(animal2 instanceof Chat); // true
        System.out.println(animal3 instanceof Animal); // false
    }
}
{{</inlineJava>}}

Cette exemple illustre que dans un même fichier Java, nous pouvons avoir plusieurs classes tant qu'une seule classe est publique.
Ainsi il est possible de définir les classes Chien, Chat et Animal dans un seul fichier.


La méthode getClass(), définie dans la classe Object, retourne l'objet de type Class représentant la classe exacte de l'instance à l'exécution. Contrairement à instanceof, qui teste la compatibilité avec un type ou ses sous-types, getClass() fournit une information précise sur la classe réelle de l'objet, sans tenir compte de la hiérarchie d'héritage. Par exemple, appeler getClass() sur un objet permet d'obtenir des métadonnées sur sa classe, comme son nom ou ses méthodes, via l'API de réflexion de Java. Cette méthode est particulièrement utile dans des scénarios nécessitant une introspection, comme les frameworks de sérialisation ou de mapping. Toutefois, son utilisation doit être prudente, car elle peut rendre le code moins flexible en liant étroitement le comportement à des classes spécifiques.

Dans l'exemple suivant, getClass() est utilisé pour obtenir le nom de la classe exacte de chaque objet (Chien pour animal1, Chat pour animal2). La comparaison avec == montre que les classes sont différentes, et animal1.getClass() correspond exactement à Chien.class. Contrairement à instanceof, getClass() ne considère pas la hiérarchie d'héritage, mais la classe réelle de l'objet.

{{<inlineJava path="Main.java">}}
class Animal {}
class Chien extends Animal {}
class Chat extends Animal {}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Chien();
        Animal animal2 = new Chat();

        System.out.println(animal1.getClass().getSimpleName()); // Chien
        System.out.println(animal2.getClass().getSimpleName()); // Chat
        System.out.println(animal1.getClass() == animal2.getClass()); // false
        System.out.println(animal1.getClass() == Chien.class); // true
    }
}
{{</inlineJava>}}

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


### Conversion de type (cast)

La conversion de type, ou *cast* en anglais, désigne en Java l'opération qui consiste à transformer explicitement un objet d'un type en un autre type compatible, généralement dans le cadre d'une hiérarchie d'héritage. Cette opération est nécessaire lorsque l'on souhaite traiter un objet d'une classe plus générale (superclasse) comme un objet d'une classe plus spécifique (sous-classe), ou vice versa. Le *cast* permet ainsi d'accéder aux membres spécifiques de la sous-classe qui ne sont pas disponibles dans la superclasse. Il existe deux types principaux de *cast* : le *cast* descendant (*downcast*), qui convertit un type général en un type plus spécifique, et le *cast* ascendant (*upcast*), qui convertit un type spécifique en un type plus général, bien que ce dernier soit souvent implicite.

Le *cast* descendant est l'opération la plus courante et nécessite une syntaxe explicite, car elle peut entraîner des erreurs à l'exécution si l'objet n'est pas réellement une instance du type cible. Pour effectuer un *cast*, on utilise le nom de la classe cible entre parenthèses avant l'objet à convertir. Cependant, avant de procéder à un *cast* descendant, il est prudent de vérifier le type de l'objet avec l'opérateur *instanceof* pour éviter une exception de type *ClassCastException*. Le *cast* est particulièrement utile dans des contextes où le polymorphisme est utilisé, par exemple lorsque des objets de différentes sous-classes sont manipulés via une référence de la superclasse.


Imaginons une application de gestion d'animaux dans un zoo, où une classe *Animal* est la superclasse et *Lion* une sous-classe qui hérite d'*Animal*. La classe *Lion* possède une méthode spécifique *rugir()* qui n'existe pas dans *Animal*. Si nous avons une référence de type *Animal* pointant vers un objet *Lion*, un *cast* est nécessaire pour appeler *rugir()*.


{{<inlineJava path="Zoo.java">}}

class Animal {
    public void manger() {
        System.out.println("L'animal mange.");
    }
}

class Lion extends Animal {
    public void rugir() {
        System.out.println("Le lion rugit : Roooar !");
    }
}

public class Zoo {
    public static void main(String[] args) {
        // Upcast implicite : un Lion est assigné à une référence Animal
        Animal animal = new Lion();
        
        // Appel d'une méthode commune
        animal.manger(); // Affiche : L'animal mange.
        
        // Vérification avant cast descendant
        if (animal instanceof Lion) {
            // Cast explicite pour accéder à la méthode rugir()
            Lion lion = (Lion) animal;
            lion.rugir(); // Affiche : Le lion rugit : Roooar !
        } else {
            System.out.println("Cet animal n'est pas un lion.");
        }
        
        // Exemple avec un animal qui n'est pas un Lion
        Animal autreAnimal = new Animal();
        if (autreAnimal instanceof Lion) {
            Lion autreLion = (Lion) autreAnimal; // Ne sera pas exécuté
            autreLion.rugir();
        } else {
            System.out.println("Cet animal n'est pas un lion.");
        }
    }
}
{{</inlineJava>}}


Dans cet exemple, l'*upcast* est implicite lorsque nous assignons un objet *Lion* à une variable de type *Animal*. Cela ne pose aucun problème, car un *Lion* est un *Animal*. Cependant, pour appeler la méthode *rugir()*, qui est spécifique à *Lion*, nous devons effectuer un *cast* descendant explicite avec *(Lion)*. La vérification avec *instanceof* garantit que le *cast* est sûr, évitant une *ClassCastException*. Lors de l'exécution, le premier *cast* réussit et affiche "Le lion rugit : Roooar !", tandis que le second échoue car *autreAnimal* n'est pas un *Lion*, affichant "Cet animal n'est pas un lion.".

### Protection des membres

Nous connaissons déjà les mots-clés <em>public</em> et <em>private</em> qui sont utilisés pour indiquer si les membres d'une classe sont visibles ou non à l'extérieur de cette classe. Quand nous héritons d'une classe, tous les membres publics de la superclasse sont visibles pour les sous-classes, mais pas les membres privés. Ces membres privés sont des membres des sous-classes, mais nous ne pouvons pas accéder à ces membres privés directement à partir des sous-classes.

Java nous fournit une troisième option quant à la visibilité des membres d'une classe. Nous pouvons ainsi créer des membres protégés d'une classe avec le mot clé<em> protected</em>. Ainsi les membres <em>protected</em> de la superclasse sont visibles pour les sous-classes, mais pas pour les autres classes. Considérons l'exemple suivant&nbsp;:

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
Dans l'exemple ci-dessus, les méthodes <em>getnomdujeu</em> et <em>setnomdujeu</em> sont déclarées <em>protected</em> et donc visibles
 à la sous-classe Sudoku. Ces méthodes sont seulement visibles pour les classes qui héritent de la classe Jeu.

## Utilisation des mots-clés this et super dans une sous-classe


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

Quand nous voulons nous référer à un champ ou à une méthode qui appartient à une classe de base, nous utilisons le mot clé <em>super</em>. Cela fonctionne de la même façon qu'avec <em>this,</em> mais super renvoie à une instance de la classe de base au lieu de celle de la classe courante.

Considérons les deux classes suivantes&nbsp;:

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
<p>je joue au Sudoku :</p> 
<p>Niveau expert</p> 
<p>Ainsi, avec le mot clé <em>super</em>, nous appelons la méthode choixdejeu de la classe de base. Nous pouvons aussi utiliser ce mot clé dans un constructeur.</p> 

## Constructeur d'une classe héritée
Le constructeur de la classe dérivée (ou héritée) fait appel au constructeur de la superclasse au moment de la création d'un objet. (Le Sudoku est avant tout un jeu.) Cet appel au constructeur de la superclasse peut être implicite ou explicite. Dans ce dernier cas, le constructeur de la classe héritée exécutera la première instruction.

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

Cet exemple montre comment appeler le constructeur de la superclasse.

## Classes abstraites

Les classes abstraites permettent de créer des concepts de haut-niveau, ne pouvant être instanciés et rendant obligatoire la conception de sous-classes pour leur utilisation. Les classes abstraites sont donc souvent utilisées dans des API ou autres bibliothèques de code.  Afin de rendre possible la redéfinition de méthode par héritage, les méthodes d'une superclasse doivent être déclarées avec le modificateur <em>abstract</em>. Ainsi, une classe abstraite est une classe qui contient des méthodes abstraites. L'intérêt de ceci est de rendre la classe «&nbsp;héritable&nbsp;». <br />La sous-classe peut implémenter ou non les méthodes abstraites héritées. Si elles ne les implémentent pas, elle est elle-même une classe abstraite. <br />Une sous-classe dérivant d'une classe non abstraite peut définir des nouvelles méthodes abstraites, et par le fait même, devenir à leur tour abstraite.

<p>Remarque : Nous ne pouvons instancier des objets d'une classe abstraite. Ce sont des classes qui sont destinées à subir le processus d'héritage.</p> 



## Object

La classe `Object` est la superclasse de toutes les classes en Java. Cela signifie que chaque classe, même si elle n’hérite pas explicitement d’une autre classe, hérite automatiquement de `Object`. Cette classe fournit des méthodes fondamentales que tous les objets Java possèdent, comme `toString()` (pour obtenir une représentation textuelle de l’objet), `equals()` (pour comparer deux objets), et `hashCode()` (pour obtenir un code de hachage). Grâce à cette hiérarchie, il est possible de manipuler des collections d’objets de types variés, d’utiliser des tableaux de type `Object[]`, ou de passer n’importe quel objet à des méthodes qui attendent un paramètre de type `Object`.

Comprendre le rôle de `Object` est essentiel pour maîtriser l’héritage, le polymorphisme et la gestion des collections en Java. Par exemple, lorsqu’on utilise des structures de données génériques ou qu’on souhaite sérialiser des objets, la connaissance des méthodes héritées de `Object` permet d’écrire du code plus flexible et réutilisable. Il est aussi courant de redéfinir certaines de ces méthodes dans ses propres classes pour adapter leur comportement aux besoins spécifiques de l’application.


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

### Classes abstraites AbstractList et AbstractMap

Dans le cadre des collections Java, les classes abstraites `AbstractList` et `AbstractMap` jouent un rôle central dans la hiérarchie du Java Collections Framework, défini dans le paquetage `java.util`. Ces classes, qui étendent directement ou indirectement la classe `Object`, servent de pont entre les interfaces `List` et `Map` et leurs implémentations concrètes comme `ArrayList` et `HashMap`. Elles fournissent des implémentations partielles des comportements définis par leurs interfaces respectives, facilitant ainsi la création de nouvelles classes concrètes par héritage. Cette section explore le rôle de ces classes abstraites, leur utilisation dans la conception des collections, et leur importance dans le contexte de l’héritage et du polymorphisme.

#### Rôle et fonctionnement d’AbstractList

La classe `AbstractList` est une classe abstraite qui implémente l’interface `List`, elle-même une sous-interface de `Collection`. Elle fournit une implémentation squelettique des méthodes requises pour une liste ordonnée, où les éléments sont accessibles par leur indice et où les doublons sont autorisés. En héritant de `AbstractCollection`, `AbstractList` réutilise les fonctionnalités génériques des collections tout en ajoutant des méthodes spécifiques aux listes, comme l’accès par indice (`get(int index)`) et la modification d’éléments (`set(int index, E element)`). Cependant, certaines méthodes clés, comme `get` et `size`, restent abstraites, obligeant les sous-classes concrètes à les implémenter.

L’objectif d’`AbstractList` est de réduire la charge de travail pour les développeurs créant leurs propres implémentations de `List`. Par exemple, une classe concrète comme `ArrayList` étend `AbstractList` et fournit des implémentations spécifiques pour `get` et `size`, utilisant un tableau interne redimensionnable. De même, une classe personnalisée peut hériter d’`AbstractList` pour créer une liste avec un comportement spécifique, tout en réutilisant les méthodes génériques comme `add` ou `remove`. Cette approche illustre l’héritage, où la superclasse abstraite définit un cadre commun, tandis que les sous-classes spécialisent le comportement.

Voici un exemple d’une classe personnalisée qui étend `AbstractList` pour gérer une liste de scores dans un jeu de Sudoku, avec un comportement restreint (lecture seule pour simplifier) :

{{<inlineJava path="ListeScores.java">}}
import java.util.AbstractList;

public class ListeScores extends AbstractList<Integer> {
    private final Integer[] scores;
    private final int taille;

    public ListeScores(Integer[] scores) {
        this.scores = scores;
        this.taille = scores.length;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= taille) {
            throw new IndexOutOfBoundsException("Index : " + index);
        }
        return scores[index];
    }

    @Override
    public int size() {
        return taille;
    }

    public static void main(String[] args) {
        ListeScores scores = new ListeScores(new Integer[]{150, 200, 180});
        System.out.println("Score à l'index 1 : " + scores.get(1)); // Affiche 200
        System.out.println("Taille : " + scores.size()); // Affiche 3
        for (Integer score : scores) {
            System.out.println(score);
        }
    }
}
{{</inlineJava>}}


Dans cet exemple, `ListeScores` étend `AbstractList` et implémente les méthodes abstraites `get` et `size`. Les autres méthodes de `List`, comme l’itération via la boucle `for-each`, sont héritées de `AbstractList`, qui fournit une implémentation basée sur ces deux méthodes. Cet exemple montre comment `AbstractList` simplifie la création d’une liste personnalisée en réduisant le nombre de méthodes à implémenter, tout en garantissant la conformité avec l’interface `List`.

#### Rôle et fonctionnement d’AbstractMap

La classe `AbstractMap` est une classe abstraite qui implémente l’interface `Map`, définissant une structure de données associant des clés uniques à des valeurs. Elle fournit une implémentation partielle des méthodes de `Map`, comme `put`, `get`, `containsKey` ou `entrySet`, en s’appuyant sur une méthode abstraite clé : `entrySet`, qui doit être implémentée par les sous-classes. En centralisant les comportements communs des mappings, `AbstractMap` permet aux développeurs de créer des implémentations personnalisées de `Map` sans réécrire la logique générique.

Comme pour `AbstractList`, `AbstractMap` est conçue pour être étendue par des classes concrètes, telles que `HashMap` ou `TreeMap`. Par exemple, `HashMap` étend `AbstractMap` et implémente `entrySet` en utilisant une table de hachage, tandis que `TreeMap` utilise un arbre binaire équilibré pour trier les clés. Cette hiérarchie repose sur l’héritage : `AbstractMap` définit un comportement générique, et les sous-classes fournissent des implémentations optimisées pour des cas d’utilisation spécifiques. De plus, `AbstractMap` permet de créer des mappings immuables ou personnalisés avec un effort réduit.

Voici un exemple d’une classe personnalisée qui étend `AbstractMap` pour gérer un mapping des joueurs aux niveaux atteints dans un jeu de Sudoku :

{{<inlineJava path="NiveauxJoueurs.java">}}
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class NiveauxJoueurs extends AbstractMap<String, Integer> {
    private final Set<Map.Entry<String, Integer>> entrees;

    public NiveauxJoueurs() {
        entrees = new HashSet<>();
        entrees.add(new AbstractMap.SimpleEntry<>("Alice", 3));
        entrees.add(new AbstractMap.SimpleEntry<>("Bob", 5));
    }

    @Override
    public Set<Map.Entry<String, Integer>> entrySet() {
        return entrees;
    }

    public static void main(String[] args) {
        NiveauxJoueurs niveaux = new NiveauxJoueurs();
        System.out.println("Niveau d'Alice : " + niveaux.get("Alice")); // Affiche 3
        System.out.println("Contient Bob ? " + niveaux.containsKey("Bob")); // Affiche true
        for (Map.Entry<String, Integer> entree : niveaux.entrySet()) {
            System.out.println(entree.getKey() + " : " + entree.getValue());
        }
    }
}
{{</inlineJava>}}

Dans cet exemple, `NiveauxJoueurs` étend `AbstractMap` et implémente la méthode abstraite `entrySet`, qui retourne un ensemble d’entrées clé-valeur. Les autres méthodes de `Map`, comme `get` et `containsKey`, sont héritées de `AbstractMap` et fonctionnent automatiquement grâce à l’implémentation d’`entrySet`. Cet exemple illustre comment `AbstractMap` permet de créer un mapping personnalisé avec un minimum de code, tout en respectant le contrat de l’interface `Map`.

La boucle `for` sur `niveaux.entrySet()` illustre comment il est possible d'itérer sur les clé/valeur d'une classe de type `AbstractMap`. Le
mécanisme est similaire à l'itération sur les tableaux.

Les classes `AbstractList` et `AbstractMap` incarnent les principes de l’héritage et de l’abstraction en Java. En tant que classes abstraites, elles ne peuvent pas être instanciées directement, mais elles servent de superclasses pour des implémentations concrètes. Leur rôle est double : elles réduisent la duplication de code en fournissant des implémentations génériques, et elles garantissent que les sous-classes respectent les contrats des interfaces `List` et `Map`. Cette conception modulaire permet aux développeurs de se concentrer sur les aspects spécifiques de leurs implémentations, tout en bénéficiant d’une base robuste.

Dans le contexte du Java Collections Framework, `AbstractList` et `AbstractMap` facilitent l’extensibilité. Par exemple, un développeur peut créer une liste ou un mapping avec des contraintes spécifiques (comme une liste immuable ou un mapping synchronisé) en étendant ces classes, sans réimplémenter les fonctionnalités communes. De plus, leur intégration dans la hiérarchie des collections, où `ArrayList` et `HashMap` en sont des sous-classes, illustre comment l’héritage et le polymorphisme permettent de manipuler des collections de manière générique, en utilisant les types d’interface (`List`, `Map`) plutôt que les implémentations concrètes.



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

L’héritage est utile pour modéliser des relations «&nbsp;est-un&nbsp;» (par exemple, un Chat est un Animal), mais il peut devenir lourd si la hiérarchie devient complexe ou si une classe doit combiner des comportements de plusieurs sources. Les interfaces, en revanche, modélisent des capacités ou des rôles («&nbsp;peut-faire&nbsp;»), comme «&nbsp;comparable&nbsp;» ou «&nbsp;sérialisable&nbsp;». Elles sont particulièrement adaptées aux bibliothèques Java standard, où des interfaces comme Comparable, Comparator, Runnable ou Serializable définissent des comportements que de nombreuses classes peuvent adopter. Voici des exemples concrets d’interfaces courantes en Java, avec du code pour illustrer leur utilité.

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


L’interface CharSequence est un exemple emblématique de la bibliothèque Java standard. Elle représente une séquence de caractères et est utilisée par des classes comme String, StringBuilder ou StringBuffer. Cette interface définit des méthodes pour accéder à une séquence de caractères de manière standardisée, sans imposer de structure interne. Les méthodes principales sont length(), charAt(int index), subSequence(int start, int end) et toString(). Cela permet à des classes variées de fournir un accès uniforme à leurs données sous forme de caractères, facilitant leur utilisation dans des API génériques, comme les expressions régulières ou les manipulations de texte.
Pour illustrer, voici une implémentation personnalisée de CharSequence qui représente une séquence de caractères inversée, utile par exemple pour des opérations où l’ordre des caractères doit être retourné.

```java {style=github}
public class ReverseCharSequence implements CharSequence {
    private final String sequence;

    public ReverseCharSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public int length() {
        return sequence.length();
    }

    @Override
    public char charAt(int index) {
        return sequence.charAt(sequence.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > length() || start > end) {
            throw new IndexOutOfBoundsException();
        }
        StringBuilder sub = new StringBuilder();
        for (int i = start; i < end; i++) {
            sub.append(charAt(i));
        }
        return new ReverseCharSequence(sub.toString());
    }

    @Override
    public String toString() {
        return new StringBuilder(this).toString();
    }
}
```

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


En Java, l'interface Cloneable est une interface marqueur, dépourvue de méthodes à implémenter, qui signale qu'un objet peut être cloné en utilisant la méthode clone() héritée de la classe Object. Pour qu'une classe soit clonable, elle doit implémenter Cloneable et redéfinir la méthode clone(), généralement en invoquant super.clone() pour créer une copie de l'objet. Si l'interface n'est pas implémentée, appeler clone() provoque une CloneNotSupportedException. Par défaut, clone() réalise une copie superficielle (shallow copy), qui duplique les champs de type primitif et les références d'objets, mais pas les objets référencés eux-mêmes. Pour une copie profonde (deep copy), il est nécessaire de cloner explicitement les objets imbriqués. Cette interface est essentielle pour contrôler la duplication d'objets tout en garantissant la cohérence des données.

Le rôle de la méthode clone() et de l'interface Cloneable est de fournir un mécanisme standard pour créer des copies d'objets de manière contrôlée. Ce processus est particulièrement utile dans des scénarios où l'on souhaite dupliquer un objet sans modifier l'original, par exemple pour préserver l'état initial d'un objet dans des opérations complexes ou pour implémenter des structures de données modifiables. La copie superficielle est suffisante pour les objets contenant uniquement des types primitifs ou des références immuables, mais pour des objets avec des champs complexes (comme des collections ou des objets modifiables), une copie profonde est souvent nécessaire pour éviter que l'original et la copie ne partagent les mêmes références. L'implémentation de Cloneable oblige le développeur à réfléchir au type de clonage requis et à personnaliser la méthode clone() en conséquence, assurant ainsi une gestion précise des copies. L'exemple de code ci-dessus illustre une implémentation simple de Cloneable avec une copie superficielle pour une classe Person.

{{<inlineJava path="Person.java">}}

public class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        try {
            Person person1 = new Person("Alice", 30);
            Person person2 = (Person) person1.clone();
            System.out.println("Original: " + person1);
            System.out.println("Clone: " + person2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
{{</inlineJava>}}


En Java, la copie d’un objet peut être superficielle (shallow copy) ou complète (deep copy), selon la manière dont les champs sont dupliqués. Une copie superficielle, réalisée par défaut via la méthode clone() de la classe Object, duplique les champs de type primitif et les références des objets imbriqués, mais pas les objets référencés eux-mêmes. Ainsi, l’original et la copie partagent les mêmes instances des objets imbriqués, ce qui peut entraîner des modifications involontaires si ces objets sont modifiés. En revanche, une copie complète crée une duplication indépendante de tous les objets imbriqués, garantissant que la copie et l’original n’ont aucune référence partagée. Cela nécessite une implémentation explicite dans clone(), en clonant récursivement les objets référencés. Le choix entre les deux dépend des besoins : une copie superficielle est plus légère mais risquée pour les objets modifiables, tandis qu’une copie complète est plus sûre mais plus coûteuse en ressources. Une copie superficielle (shallow copy) ou complète (deep copy) détermine si un objet cloné est une entité indépendante ou partage des références avec l’original.


{{<inlineJava path="Livre.java">}}
class Auteur implements Cloneable {
    private String nom;

    public Auteur(String nom) {
        this.nom = nom;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

class Livre implements Cloneable {
    private String titre;
    private Auteur auteur;

    public Livre(String titre, Auteur auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Livre copie = (Livre) super.clone(); // Copie superficielle
        copie.auteur = (Auteur) auteur.clone(); // Copie complète pour auteur
        return copie;
    }

    @Override
    public String toString() {
        return "Livre{titre='" + titre + "', auteur=" + auteur.getNom() + "}";
    }

    public static void main(String[] args) {
        try {
            Auteur auteur = new Auteur("Victor Hugo");
            Livre livre1 = new Livre("Les Misérables", auteur);
            Livre livre2 = (Livre) livre1.clone();

            System.out.println("Original: " + livre1);
            System.out.println("Copie: " + livre2);

            // Modification de l'auteur dans la copie
            livre2.auteur.setNom("Alexandre Dumas");
            System.out.println("Après modification:");
            System.out.println("Original: " + livre1);
            System.out.println("Copie: " + livre2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
{{</inlineJava>}}

En Java, l’implémentation de la méthode clone() dans une classe qui implémente l’interface Cloneable implique souvent la nécessité de redéfinir les méthodes equals() et hashCode() pour garantir une cohérence sémantique et un comportement correct. La méthode equals(), dans sa version par défaut de la classe Object, compare les références des objets, ce qui signifie que l’original et la copie ne seraient jamais égaux, même si leurs champs sont identiques. Redéfinir equals() permet de comparer le contenu des objets (par exemple, les valeurs de leurs champs), de sorte que l’original et une copie complète puissent être considérés comme égaux s’ils ont les mêmes données. Par ailleurs, le contrat de la méthode hashCode() exige que deux objets égaux selon equals() produisent le même code de hachage. Si equals() est redéfini pour tenir compte du contenu, hashCode() doit également être redéfini pour générer un code de hachage basé sur les mêmes champs utilisés dans equals(), afin d’assurer la cohérence dans des structures comme HashMap ou HashSet.
Reprenons notre exemple avec le livre pour illustrer cette idée.

{{<inlineJava path="Livre.java">}}
class Auteur implements Cloneable {
    private String nom;

    public Auteur(String nom) {
        this.nom = nom;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Auteur)) return false;
        Auteur autre = (Auteur) obj;
        return nom.equals(autre.nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

class Livre implements Cloneable {
    private String titre;
    private Auteur auteur;

    public Livre(String titre, Auteur auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Livre copie = (Livre) super.clone();
        copie.auteur = (Auteur) auteur.clone(); // Copie complète
        return copie;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Livre)) return false;
        Livre autre = (Livre) obj;
        return titre.equals(autre.titre) && auteur.equals(autre.auteur);
    }

    @Override
    public int hashCode() {
        int result = titre.hashCode();
        result = 31 * result + auteur.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Livre{titre='" + titre + "', auteur=" + auteur.getNom() + "}";
    }

    public static void main(String[] args) {
        try {
            Auteur auteur = new Auteur("Victor Hugo");
            Livre livre1 = new Livre("Les Misérables", auteur);
            Livre livre2 = (Livre) livre1.clone();

            // Vérification de l'égalité et du hashCode
            System.out.println("Original: " + livre1);
            System.out.println("Copie: " + livre2);
            System.out.println("equals: " + livre1.equals(livre2)); // true
            System.out.println("hashCode identique: " + (livre1.hashCode() == livre2.hashCode())); // true

            // Modification de la copie
            livre2.auteur.setNom("Alexandre Dumas");
            System.out.println("\nAprès modification de la copie:");
            System.out.println("Original: " + livre1);
            System.out.println("Copie: " + livre2);
            System.out.println("equals: " + livre1.equals(livre2)); // false
            System.out.println("hashCode identique: " + (livre1.hashCode() == livre2.hashCode())); // false

            // Utilisation dans une HashMap
            java.util.HashMap<Livre, String> map = new java.util.HashMap<>();
            map.put(livre1, "Original");
            System.out.println("\nRecherche dans HashMap:");
            System.out.println("Contient original: " + map.containsKey(livre1)); // true
            System.out.println("Contient copie avant modification: " + map.containsKey(livre2)); // false après modification
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
{{</inlineJava>}}

En Java, l'interface Iterable est utilisée pour indiquer qu'une classe peut être parcourue à l'aide d'une boucle for-each (boucle améliorée). Elle définit une méthode unique, iterator(), qui retourne un objet de type Iterator, permettant de parcourir les éléments de la collection ou de la structure de données. Implémenter Iterable est essentiel pour les classes personnalisées qui représentent des collections, comme des listes ou des ensembles, afin de les rendre compatibles avec les constructions de Java comme les boucles for-each ou les flux (Stream). Cela améliore la lisibilité et la réutilisabilité du code. Par exemple, une classe représentant une liste personnalisée peut implémenter Iterable pour permettre un accès séquentiel à ses éléments.



{{<inlineJava path="CustomList.java">}}
import java.util.Iterator;

public class CustomList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    @SuppressWarnings("unchecked")
    public CustomList(int capacity) {
        this.items = (T[]) new Object[capacity];
        this.size = 0;
    }

    public void add(T item) {
        if (size < items.length) {
            items[size++] = item;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public T next() {
                return items[currentIndex++];
            }
        };
    }

    public static void main(String[] args) {
        CustomList<String> list = new CustomList<>(5);
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        for (String name : list) {
            System.out.println(name);
        }
    }
}
{{</inlineJava>}}


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



### Interfaces Map et List dans les collections Java

Dans la programmation Java, les collections sont des structures de données permettant de stocker et de manipuler des ensembles d’objets. La bibliothèque standard Java fournit un ensemble de classes et d’interfaces dans le paquetage `java.util`, organisé autour du cadre des collections (Java Collections Framework). Deux interfaces fondamentales de ce cadre sont `Map` et `List`, qui définissent des comportements abstraits pour stocker et accéder à des données. Ces interfaces sont implémentées par des classes concrètes comme `HashMap` pour `Map` et `ArrayList` pour `List`. Comprendre la distinction entre ces interfaces et leurs implémentations est essentiel pour écrire du code flexible et maintenable, notamment dans le contexte de l’héritage et du polymorphisme.

#### Interface Map et son implémentation HashMap

L’interface `Map` définit une structure de données qui associe des clés uniques à des valeurs, permettant un accès rapide aux valeurs via leurs clés. Une `Map` ne garantit pas d’ordre spécifique pour ses entrées et interdit les clés dupliquées. Elle est particulièrement utile pour des cas comme la gestion de dictionnaires, la configuration d’applications ou l’indexation de données. L’interface `Map` est implémentée par plusieurs classes, dont `HashMap`, qui est l’implémentation la plus courante en raison de sa performance et de sa simplicité.

La classe `HashMap` étend la classe abstraite `AbstractMap`, qui elle-même implémente l’interface `Map`. Cette hiérarchie illustre l’héritage : `HashMap` hérite des comportements définis par `Map` et `AbstractMap`, tout en fournissant une implémentation concrète basée sur une table de hachage. Une `HashMap` offre des opérations (ajout, recherche, suppression) avec une complexité moyenne constante, à condition que les clés aient une bonne fonction de hachage. Cependant, elle n’est pas synchronisée, ce qui signifie qu’elle n’est pas thread-safe par défaut, et elle autorise des valeurs `null` pour les clés et les valeurs.

Voici un exemple illustrant l’utilisation de l’interface `Map` et de la classe `HashMap` pour gérer les scores des joueurs dans un jeu comme le Sudoku :

{{<inlineJava path="GestionScores.java">}}
import java.util.Map;
import java.util.HashMap;

public class GestionScores {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 150);
        scores.put("Bob", 200);
        scores.put("Alice", 180); // Remplace la valeur précédente pour "Alice"

        System.out.println("Score d'Alice : " + scores.get("Alice")); // Affiche 180
        System.out.println("Contient Bob ? " + scores.containsKey("Bob")); // Affiche true

        for (Map.Entry<String, Integer> entree : scores.entrySet()) {
            System.out.println(entree.getKey() + " : " + entree.getValue());
        }
    }
}
{{</inlineJava>}}

Dans cet exemple, la variable `scores` est déclarée comme étant de type `Map`, mais elle est instanciée avec une `HashMap`. Cette approche favorise la flexibilité, car le code peut facilement être modifié pour utiliser une autre implémentation de `Map`, comme `TreeMap` (qui trie les clés) ou `LinkedHashMap` (qui conserve l’ordre d’insertion), sans changer la logique du programme. La méthode `put` associe une clé à une valeur, `get` récupère une valeur à partir d’une clé, et l’itération sur les entrées affiche les paires clé-valeur. Cet exemple montre comment l’interface `Map` garantit un contrat commun, tandis que `HashMap` fournit une implémentation spécifique.

#### Interface List et son implémentation ArrayList

L’interface `List` définit une collection ordonnée d’éléments, où les éléments sont accessibles par leur indice et où les doublons sont autorisés. Une `List` est idéale pour des séquences de données, comme une liste de tâches, des historiques ou des collections d’objets à parcourir dans un ordre précis. L’interface `List` est implémentée par des classes comme `ArrayList`, qui est l’implémentation la plus utilisée grâce à sa rapidité pour l’accès par indice et sa gestion dynamique de la taille.

La classe `ArrayList` étend la classe abstraite `AbstractList`, qui implémente l’interface `List`. Comme pour `Map`, cette hiérarchie repose sur l’héritage : `ArrayList` hérite des comportements définis par `List` et `AbstractList`, tout en utilisant un tableau redimensionnable en interne pour stocker les éléments. Une `ArrayList` offre un accès rapide aux éléments par indice (complexité constante), mais l’insertion ou la suppression en milieu de liste peut être plus lente (complexité linéaire). Comme `HashMap`, elle n’est pas synchronisée et accepte les éléments `null`.

Voici un exemple illustrant l’utilisation de l’interface `List` et de la classe `ArrayList` pour gérer une liste de parties de Sudoku jouées par un utilisateur :

{{<inlineJava path="HistoriqueParties.java">}}
import java.util.List;
import java.util.ArrayList;

public class HistoriqueParties {
    public static void main(String[] args) {
        List<String> parties = new ArrayList<>();
        parties.add("Partie 1 : Niveau Facile");
        parties.add("Partie 2 : Niveau Moyen");
        parties.add(0, "Partie 3 : Niveau Difficile"); // Insère en tête

        System.out.println("Première partie : " + parties.get(0)); // Affiche Partie 3
        System.out.println("Taille de l'historique : " + parties.size()); // Affiche 3

        for (String partie : parties) {
            System.out.println(partie);
        }
    }
}
{{</inlineJava>}}


Dans cet exemple, la variable `parties` est déclarée comme étant de type `List`, mais instanciée avec une `ArrayList`. Cela permet de remplacer `ArrayList` par une autre implémentation de `List`, comme `LinkedList` (optimisée pour les insertions fréquentes), sans modifier le reste du code. La méthode `add` insère des éléments, `get` accède à un élément par son indice, et la boucle `for-each` parcourt les éléments dans l’ordre. Cet exemple montre comment l’interface `List` définit un comportement générique, tandis que `ArrayList` fournit une implémentation efficace pour la plupart des cas.


L’utilisation des interfaces `Map` et `List` plutôt que leurs implémentations concrètes (`HashMap`, `ArrayList`) est une bonne pratique en Java, car elle favorise la flexibilité et la maintenabilité du code. En déclarant une variable avec le type de l’interface, le code devient indépendant de l’implémentation sous-jacente, ce qui permet de changer facilement d’implémentation sans modifier la logique. Par exemple, si une application nécessite un ordre trié pour les clés d’une `Map`, on peut passer de `HashMap` à `TreeMap` en modifiant uniquement l’instanciation. De plus, cette approche est cohérente avec le principe du polymorphisme, où le type de la variable peut être plus général que le type de l’objet réel.



### Création de Map et List immuables en Java

Dans le cadre des collections Java, il est souvent utile de créer des structures de données immuables, c’est-à-dire des collections dont le contenu ne peut être modifié après leur création. Les collections immuables garantissent l’intégrité des données, réduisent les erreurs dans les applications multi-thread et simplifient le raisonnement sur le comportement du code. En Java, les interfaces `Map` et `List` peuvent être utilisées pour créer des collections immuables, soit via des méthodes de fabrique introduites dans Java 9 (paquetage `java.util`), soit via des approches alternatives comme `Collections.unmodifiableMap` et `Collections.unmodifiableList` pour les versions antérieures ou des cas spécifiques. 

#### Création d’une List immuable

Une `List` immuable est une liste dont les éléments ne peuvent être ni ajoutés, ni supprimés, ni modifiés après sa création. Depuis Java 9, la méthode statique `List.of` permet de créer facilement des listes immuables de taille fixe. Cette méthode est concise et garantit que la liste résultante est non modifiable, sans possibilité d’ajouter ou de supprimer des éléments, et sans accepter de valeurs `null` (sauf si explicitement spécifié avec `null`). Pour les versions antérieures à Java 9, la méthode `Collections.unmodifiableList` peut être utilisée pour envelopper une liste existante et la rendre immuable, bien que cette approche nécessite une étape supplémentaire.

Voici un exemple illustrant la création d’une `List` immuable pour stocker les niveaux de difficulté d’un jeu de Sudoku, utilisant `List.of` et `Collections.unmodifiableList` :

{{<inlineJava path="ListeNiveauxImmuable.java">}}
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListeNiveauxImmuable {
    public static void main(String[] args) {
        // Création avec List.of (Java 9 et supérieur)
        List<String> niveaux = List.of("Facile", "Moyen", "Difficile");
        System.out.println("Niveaux : " + niveaux);
        try {
            niveaux.add("Expert"); // Lève UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Impossible de modifier la liste immuable");
        }

        // Création avec Collections.unmodifiableList (toutes versions)
        List<String> niveauxModifiables = new ArrayList<>();
        niveauxModifiables.add("Facile");
        niveauxModifiables.add("Moyen");
        List<String> niveauxImmuables = Collections.unmodifiableList(niveauxModifiables);
        System.out.println("Niveaux immuables : " + niveauxImmuables);
        try {
            niveauxImmuables.add("Difficile"); // Lève UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Impossible de modifier la liste immuable");
        }

        // Attention : la liste originale reste modifiable
        niveauxModifiables.add("Expert");
        System.out.println("Niveaux immuables après modification originale : " + niveauxImmuables);
    }
}
{{</inlineJava>}}

Dans cet exemple, `List.of` crée une liste immuable contenant trois niveaux de difficulté. Toute tentative de modification (via `add`, `remove` ou `set`) lève une `UnsupportedOperationException`, garantissant l’immuabilité. Avec `Collections.unmodifiableList`, une `ArrayList` modifiable est d’abord créée, puis enveloppée dans une vue immuable. Cependant, il est important de noter que la liste originale (`niveauxModifiables`) reste modifiable, et toute modification de celle-ci se reflète dans la vue immuable, ce qui peut être une source d’erreurs si la liste originale n’est pas protégée. Cet exemple montre l’avantage de `List.of` pour sa simplicité et sa sécurité accrue.

#### Création d’une Map immuable

Une `Map` immuable est une structure associant des clés uniques à des valeurs, où ni les paires clé-valeur, ni les clés, ni les valeurs ne peuvent être modifiées après la création. Depuis Java 9, la méthode statique `Map.of` (et ses variantes comme `Map.ofEntries`) permet de créer des mappings immuables de manière concise. Comme pour `List.of`, ces mappings n’acceptent pas de clés ou de valeurs `null` (sauf si explicitement spécifié) et lèvent une `UnsupportedOperationException` en cas de tentative de modification. Pour les versions antérieures ou pour des cas où une `Map` existante doit être rendue immuable, `Collections.unmodifiableMap` offre une solution en enveloppant une `Map` existante.

Voici un exemple illustrant la création d’une `Map` immuable pour associer des joueurs à leurs scores dans un jeu de Sudoku, utilisant `Map.of` et `Collections.unmodifiableMap` :

{{<inlineJava path="MapScoresImmuable.java">}}
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class MapScoresImmuable {
    public static void main(String[] args) {
        // Création avec Map.of (Java 9 et supérieur)
        Map<String, Integer> scores = Map.of("Alice", 150, "Bob", 200, "Charlie", 180);
        System.out.println("Scores : " + scores);
        try {
            scores.put("David", 170); // Lève UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Impossible de modifier la map immuable");
        }

        // Création avec Collections.unmodifiableMap (toutes versions)
        Map<String, Integer> scoresModifiables = new HashMap<>();
        scoresModifiables.put("Alice", 150);
        scoresModifiables.put("Bob", 200);
        Map<String, Integer> scoresImmuables = Collections.unmodifiableMap(scoresModifiables);
        System.out.println("Scores immuables : " + scoresImmuables);
        try {
            scoresImmuables.put("Charlie", 180); // Lève UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Impossible de modifier la map immuable");
        }

        // Attention : la map originale reste modifiable
        scoresModifiables.put("David", 170);
        System.out.println("Scores immuables après modification originale : " + scoresImmuables);
    }
}
{{</inlineJava>}}


Dans cet exemple, `Map.of` crée une `Map` immuable associant des joueurs à leurs scores. Toute tentative de modification (via `put`, `remove` ou `clear`) lève une `UnsupportedOperationException`. Avec `Collections.unmodifiableMap`, une `HashMap` modifiable est créée, puis enveloppée dans une vue immuable. Comme pour `List`, la `Map` originale reste modifiable, et les modifications de celle-ci affectent la vue immuable, ce qui nécessite une gestion prudente de la `Map` originale. Cet exemple met en évidence la simplicité de `Map.of` pour créer des mappings immuables directement, comparée à l’approche plus verbeuse de `Collections.unmodifiableMap`.


Les méthodes `List.of` et `Map.of` produisent des collections immuables qui implémentent respectivement les interfaces `List` et `Map`, mais leurs classes concrètes internes (définies dans le JDK) ne sont pas accessibles directement et n’étendent pas publiquement `AbstractList` ou `AbstractMap`. Cependant, leur conception s’appuie sur les principes d’héritage et de polymorphisme, car elles respectent les contrats de ces interfaces, permettant leur utilisation dans tout code attendant un `List` ou un `Map`. En revanche, `Collections.unmodifiableList` et `Collections.unmodifiableMap` créent des vues qui enveloppent des implémentations existantes, comme `ArrayList` (qui étend `AbstractList`) ou `HashMap` (qui étend `AbstractMap`), et s’intègrent directement dans la hiérarchie des collections.

L’immuabilité est particulièrement utile dans des contextes où les données doivent rester constantes, comme les configurations d’un jeu ou les résultats d’un tournoi. Cependant, il est crucial de comprendre les limites des approches. Avec `List.of` et `Map.of`, l’immuabilité est absolue, mais ces méthodes sont limitées à un nombre fixe d’éléments (jusqu’à 10 pour `Map.of` sans `Map.ofEntries`). Avec `Collections.unmodifiableList` et `Collections.unmodifiableMap`, la flexibilité est plus grande, mais la dépendance à une collection modifiable sous-jacente peut introduire des vulnérabilités si cette dernière n’est pas protégée.


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

### Quelques interfaces importantes en Java

La table ci-dessous recense les principales interfaces de la bibliothèque standard de Java.

| Nom de l'interface | Package | Courte description |
|--------------------|---------|--------------------|
| Collection | java.util | Représente un groupe d'objets, base des structures de données comme les listes et ensembles. |
| List | java.util | Définit une collection ordonnée, permettant l'accès par index et les doublons. |
| Set | java.util | Représente une collection sans doublons, sans ordre garanti. |
| Map | java.util | Associe des clés uniques à des valeurs, sans doublons de clés. |
| Iterator | java.util | Permet de parcourir les éléments d'une collection séquentiellement. |
| Comparable | java.lang | Définit une méthode pour comparer des objets, utilisée pour le tri naturel. |
| Comparator | java.util | Fournit une comparaison personnalisée pour trier des objets. |
| Runnable | java.lang | Représente une tâche exécutable dans un thread, avec une méthode run(). |
| Callable | java.util.concurrent | Similaire à Runnable, mais peut retourner un résultat et lancer des exceptions. |
| Serializable | java.io | Indique qu'un objet peut être sérialisé pour être sauvegardé ou transmis. |
| Cloneable | java.lang | Marque une classe comme pouvant être clonée via la méthode clone(). |
| Closeable | java.io | Définit une ressource (comme un flux) pouvant être fermée via close(). |
| AutoCloseable | java.lang | Généralise Closeable pour la gestion automatique des ressources (try-with-resources). |
| EventListener | java.util | Interface de base pour les écouteurs d'événements dans les interfaces graphiques. |
| Consumer | java.util.function | Représente une opération acceptant un argument sans retourner de résultat. |
| Predicate | java.util.function | Définit une fonction qui teste une condition et retourne un booléen. |
| Supplier | java.util.function | Fournit une instance d'un type donné sans accepter d'argument. |
| Function | java.util.function | Représente une fonction transformant un argument en un résultat d'un autre type. |
| BiConsumer | java.util.function | Accepte deux arguments pour effectuer une opération sans retourner de résultat. |
| BiFunction | java.util.function | Transforme deux arguments en un résultat d'un type donné. |
| BiPredicate | java.util.function | Teste une condition sur deux arguments et retourne un booléen. |
| Optional | java.util | Encapsule un objet pouvant être null pour éviter les NullPointerException. |
| Stream | java.util.stream | Permet le traitement fonctionnel de collections via des opérations comme map et filter. |
| Deque | java.util | Définit une file à double extrémité, supportant l'ajout/retrait aux deux bouts. |
| NavigableMap | java.util | Étend Map pour des opérations basées sur l'ordre des clés, comme les recherches par proximité. |
| NavigableSet | java.util | Étend Set pour des opérations sur des ensembles ordonnés, comme les sous-ensembles. |

## Principe de substitution de Liskov

Le <strong>principe de substitution de Liskov</strong> (Liskov Substitution Principle, LSP) est un principe fondamental de la programmation orientée objet. Il stipule que toute classe dérivée (sous-classe) doit pouvoir être utilisée à la place de sa classe de base (super-classe) sans que cela ne provoque d’erreur ou de comportement inattendu. Autrement dit, un objet d’une sous-classe doit pouvoir remplacer un objet de la super-classe partout où celui-ci est attendu, et le programme doit continuer à fonctionner correctement.

Ce principe garantit la cohérence et la robustesse du code lors de l’utilisation de l’héritage et du polymorphisme.

Exemple en Java :

```java  {style=github}
class Animal {
    public void crier() {
        System.out.println("Un animal fait un bruit.");
    }
}

class Chien extends Animal {
    @Override
    public void crier() {
        System.out.println("Le chien aboie.");
    }
}

public class TestLiskov {
    public static void faireCrier(Animal a) {
        a.crier();
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        Chien chien = new Chien();
        faireCrier(animal); // Affiche : Un animal fait un bruit.
        faireCrier(chien);  // Affiche : Le chien aboie.
    }
}
```

Ici, la méthode faireCrier accepte un Animal : on peut lui passer un Chien sans problème, car Chien respecte le contrat d’Animal. C’est le principe de substitution de Liskov.


## Protection des données héritées
<p>Les trois modificateurs de portée qui réalisent l'encapsulation jouent simultanément un rôle dans la protection des données.</p> 



| Modificateur | Rôles |
|--------------|-------|
| private      | C'est le niveau de protection le plus fort. Les composants ne sont visibles qu'à l'intérieur de la classe : ils ne peuvent être modifiés que par des méthodes définies dans la classe prévues à cet effet. Les méthodes déclarées _private_ ne peuvent pas être en même temps déclarée _abstract_, car elles ne peuvent pas être redéfinies dans les classes filles. |
| protected    | Si une méthode ou une variable est déclarée _protected_, seules les méthodes présentes dans le même package que cette classe ou de ses sous-classes pourront y accéder. |
| public       | Ce modificateur stipule que la variable ou la méthode est visible par tous les autres objets. |
|              | Lorsqu'un membre de la classe n'est précédé d'aucun modificateur, il est accessible à toutes les classes du même package que la classe qui le définit. |



## Différence entre types primitifs et objets

En Java, il existe deux grandes catégories de types : les types primitifs (comme `int`, `double`, `char`, `boolean`, etc.) et les types objets (toutes les classes, y compris `String`, `Integer`, et toute classe que vous définissez). Les types primitifs représentent des valeurs simples et ne sont pas des objets : ils ne possèdent pas de méthodes et sont stockés directement en mémoire. Par exemple, une variable `int` contient directement la valeur numérique. À l’inverse, les objets sont des instances de classes, stockées sous forme de références (pointeurs) en mémoire. Une variable de type objet ne contient pas l’objet lui-même, mais une référence vers celui-ci. Cela a des conséquences sur la manipulation, la comparaison et la gestion de la mémoire. Par exemple, les collections Java (`ArrayList`, etc.) ne peuvent contenir que des objets, pas des types primitifs : il faut alors utiliser les classes enveloppes (`Integer` pour `int`, `Double` pour `double`, etc.).

## Différence entre == et equals

En Java, l’opérateur `==` compare les références pour les objets, c’est-à-dire s’il s’agit exactement du même objet en mémoire. Pour les types primitifs, `==` compare directement les valeurs (par exemple, `3 == 3` est vrai). Pour les objets, `==` ne compare pas le contenu, mais l’adresse mémoire. Pour comparer le contenu de deux objets, il faut utiliser la méthode `equals()`, qui peut être redéfinie dans chaque classe pour définir ce que signifie « égalité » pour ce type d’objet. 

Prenons l’exemple d’une classe `Point` :

```java  {style=github}
class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        return x == other.x && y == other.y;
    }
}

Point p1 = new Point(1, 2);
Point p2 = new Point(1, 2);
System.out.println(p1 == p2);      // false (références différentes)
System.out.println(p1.equals(p2)); // true  (contenu identique)
```

Ici, `p1` et `p2` sont deux objets différents en mémoire, donc `p1 == p2` est faux. Mais comme ils ont les mêmes coordonnées et que la méthode `equals` a été redéfinie, `p1.equals(p2)` est vrai.

*À propos des records :*

Depuis Java 16, les records simplifient la création de classes immuables destinées à contenir des données. Un record déclare automatiquement les méthodes `equals()`, `hashCode()` et `toString()` en fonction de ses composants. Ainsi, deux records avec les mêmes valeurs sont considérés comme égaux avec `equals`, et leur `hashCode` est cohérent avec leur contenu, sans avoir à redéfinir ces méthodes manuellement.

Exemple :

```java  {style=github}
record Point(int x, int y) {}

Point p1 = new Point(1, 2);
Point p2 = new Point(1, 2);
System.out.println(p1.equals(p2)); // true
System.out.println(p1.hashCode() == p2.hashCode()); // true
```

## hashCode et son utilisation

La méthode `hashCode()` est définie dans la classe `Object` et doit être redéfinie dans toute classe dont les instances seront utilisées comme clés dans des structures de données comme les tables de hachage (`HashMap`, `HashSet`). Le code de hachage est un entier calculé à partir du contenu de l’objet, permettant de répartir efficacement les objets dans des « buckets » pour accélérer la recherche. La règle fondamentale est : si deux objets sont égaux selon `equals()`, ils doivent avoir le même `hashCode()`. En revanche, deux objets avec le même `hashCode()` ne sont pas forcément égaux. Si vous redéfinissez `equals()`, il est donc essentiel de redéfinir aussi `hashCode()` pour garantir le bon fonctionnement des collections basées sur le hachage.

Exemple :

```java  {style=github}
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    MaClasse autre = (MaClasse) obj;
    return this.champ == autre.champ;
}

@Override
public int hashCode() {
    return Objects.hash(champ);
}
```

## Les classes enveloppes

En Java, les types primitifs (`int`, `double`, `char`, etc.) ne sont pas des objets et ne possèdent donc pas de méthodes. Pour pouvoir manipuler ces valeurs comme des objets (par exemple, dans les collections comme `ArrayList`), Java fournit des classes enveloppes (wrapper classes) pour chaque type primitif : `Integer` pour `int`, `Double` pour `double`, `Character` pour `char`, etc. Ces classes permettent d’encapsuler une valeur primitive dans un objet et offrent des méthodes utilitaires (conversion, comparaison, parsing, etc.).

Par exemple :

```java  {style=github}
int a = 5;
Integer b = Integer.valueOf(a); // Conversion d'un int en Integer
ArrayList<Integer> liste = new ArrayList<>();
liste.add(a); // Autoboxing automatique
```

Depuis Java 5, l’autoboxing et l’unboxing permettent de convertir automatiquement entre types primitifs et classes enveloppes :
- Autoboxing : conversion automatique d’un type primitif vers sa classe enveloppe (`int` → `Integer`)
- Unboxing : conversion automatique d’une classe enveloppe vers son type primitif (`Integer` → `int`)

Les classes enveloppes sont aussi utiles pour utiliser les méthodes `equals()` et `hashCode()` sur des valeurs numériques, ou pour gérer la valeur spéciale `null` (impossible avec un type primitif).

*Résumé des principales classes enveloppes :*

| Type primitif | Classe enveloppe |
|---------------|-----------------|
| boolean       | Boolean         |
| byte          | Byte            |
| char          | Character       |
| short         | Short           |
| int           | Integer         |
| long          | Long            |
| float         | Float           |
| double        | Double          |


Dans l'API Stream, la méthode `boxed()` permet de convertir un stream de types primitifs (comme `IntStream`, `DoubleStream`, etc.) en un stream d’objets correspondants (par exemple, de `int` vers `Integer`). Cela est nécessaire car de nombreuses méthodes de l’API Stream, comme `collect`, `map`, ou encore l’utilisation de collections (`List`, `Set`, etc.), attendent des objets et non des types primitifs. Par exemple, un `IntStream` ne peut pas être directement collecté dans une `List<Integer>` sans conversion, car une liste Java ne peut contenir que des objets. De plus, certaines opérations comme le tri personnalisé, l’utilisation de méthodes d’instance (par exemple, `Integer::compareTo`), ou l’application de méthodes génériques sur des streams nécessitent de manipuler des objets. La méthode `boxed()` effectue donc automatiquement l’autoboxing de chaque valeur primitive du stream, rendant possible l’utilisation de toute la richesse de l’API des objets Java.

*Exemple :*

```java  {style=github}
int[] tab = {1, 2, 3, 4};
List<Integer> liste = Arrays.stream(tab)
    .boxed() // Convertit chaque int en Integer
    .collect(Collectors.toList());
System.out.println(liste); // Affiche [1, 2, 3, 4]
```

## Composition


En Java, la composition est un principe de conception orientée objet où une classe contient une ou plusieurs instances d'autres classes comme attributs. La composition permet de construire des objets complexes en combinant des objets plus simples, favorisant la réutilisation et la modularité. Elle est souvent utilisée pour modéliser des relations où une entité est composée d'autres entités qui ne peuvent exister indépendamment.

Imaginons une classe Voiture qui est composée d'un moteur et de roues. Le moteur et les roues sont des parties intégrantes de la voiture, et leur existence dépend de celle de la voiture.

{{<inlineJava path="Main.java">}}

// Classe représentant un moteur
class Moteur {
    private String type;

    public Moteur(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void demarrer() {
        System.out.println("Le moteur de type " + type + " démarre.");
    }
}

// Classe représentant une roue
class Roue {
    private int taille;

    public Roue(int taille) {
        this.taille = taille;
    }

    public int getTaille() {
        return taille;
    }

    public void tourner() {
        System.out.println("La roue de taille " + taille + " pouces tourne.");
    }
}

// Classe représentant une voiture (composition)
class Voiture {
    private String marque;
    private Moteur moteur; // Composition : la voiture "a un" moteur
    private Roue[] roues;  // Composition : la voiture "a des" roues

    public Voiture(String marque, String typeMoteur, int tailleRoue) {
        this.marque = marque;
        this.moteur = new Moteur(typeMoteur); // Création de l'instance du moteur
        this.roues = new Roue[4]; // Création de 4 roues
        for (int i = 0; i < 4; i++) {
            this.roues[i] = new Roue(tailleRoue);
        }
    }

    public void conduire() {
        moteur.demarrer();
        for (Roue roue : roues) {
            roue.tourner();
        }
        System.out.println("La voiture " + marque + " roule.");
    }
}

// Classe principale pour tester
public class Main {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Toyota", "Essence", 17);
        voiture.conduire();
    }
}
{{</inlineJava>}}

## Notion avancée: Entity-component-system (optionnel)

L'Entity-component-system (ECS) est un motif architectural logiciel couramment utilisé dans le développement de jeux et les simulations. Il privilégie la composition plutôt que l'héritage, rendant les systèmes plus flexibles, évolutifs et performants. Dans l'ECS, les entités comprenent un indentifiant unique représentant des objets dans le monde; les composants sont des structures de données pures contenant des attributs (comme la position ou la santé); et les systèmes sont la logique qui opère sur les entités possédant des composants spécifiques.

Une application de l'ECS pourrait être dans un moteur de jeu 2D simple, tel qu'un roguelike basique où les entités comme les joueurs, les monstres et les objets sont composées de composants tels que Position, Vitesse, Santé et Rendu. Les systèmes traitent ensuite ces éléments: un système de mouvement met à jour les positions en fonction de la vitesse, un système de rendu dessine les entités dotées d'un composant de rendu, etc. Cela permet d'ajouter facilement de nouveaux comportements sans modifier les classes existantes.

Pour ajouter une fonctionnalité comme la santé, il suffit de créer un composant Santé et un système de dommages, sans sous-classer les entités.
Voici une implémentation basique de l'ECS en Java. Nous créons une simulation simple avec des entités qui peuvent se déplacer et être rendues. 

{{<inlineJava path="ECSDemo.java">}}
import java.util.*;

// Interface Component : Tous les composants étendent cela (interface marqueur pour la sécurité de type)
interface Component {}

// Exemples de composants
class Position implements Component {
    double x, y;

    Position(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Velocity implements Component {
    double dx, dy;

    Velocity(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }
}

class Renderable implements Component {
    String symbol;  // par exemple, "@" pour le joueur

    Renderable(String symbol) {
        this.symbol = symbol;
    }
}

// Entité : Juste un ID avec une map de composants
class Entity {
    private static int nextId = 0;
    final int id;
    private Map<Class<? extends Component>, Component> components = new HashMap<>();

    Entity() {
        this.id = nextId++;
    }

    <T extends Component> void addComponent(T component) {
        components.put(component.getClass(), component);
    }

    <T extends Component> T getComponent(Class<T> type) {
        return type.cast(components.get(type));
    }

    boolean hasComponent(Class<? extends Component> type) {
        return components.containsKey(type);
    }
}

// Interface System : Les systèmes traitent les entités
abstract class System {
    abstract void update(List<Entity> entities, double deltaTime);
}

// MovementSystem : Met à jour la position en fonction de la vitesse
class MovementSystem extends System {
    @Override
    void update(List<Entity> entities, double deltaTime) {
        for (Entity entity : entities) {
            if (entity.hasComponent(Position.class) && entity.hasComponent(Velocity.class)) {
                Position pos = entity.getComponent(Position.class);
                Velocity vel = entity.getComponent(Velocity.class);
                pos.x += vel.dx * deltaTime;
                pos.y += vel.dy * deltaTime;
                System.out.println("Entité " + entity.id + " déplacée à (" + pos.x + ", " + pos.y + ")");
            }
        }
    }
}

// RenderSystem : "Rend" en imprimant les symboles
class RenderSystem extends System {
    @Override
    void update(List<Entity> entities, double deltaTime) {
        for (Entity entity : entities) {
            if (entity.hasComponent(Position.class) && entity.hasComponent(Renderable.class)) {
                Position pos = entity.getComponent(Position.class);
                Renderable rend = entity.getComponent(Renderable.class);
                System.out.println("Rendu de " + rend.symbol + " à (" + pos.x + ", " + pos.y + ")");
            }
        }
    }
}

// Classe principale pour exécuter la simulation
public class ECSDemo {
    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<>();
        List<System> systems = new ArrayList<>();

        // Créer les systèmes
        systems.add(new MovementSystem());
        systems.add(new RenderSystem());

        // Créer une entité joueur
        Entity player = new Entity();
        player.addComponent(new Position(0, 0));
        player.addComponent(new Velocity(1, 1));
        player.addComponent(new Renderable("@"));
        entities.add(player);

        // Créer une entité objet statique (sans vitesse)
        Entity item = new Entity();
        item.addComponent(new Position(5, 5));
        item.addComponent(new Renderable("!"));
        entities.add(item);

        // Simuler les mises à jour (boucle de jeu)
        double deltaTime = 0.1;  // Pas de temps
        for (int i = 0; i < 5; i++) {
            System.out.println("Mise à jour " + (i + 1) + " :");
            for (System system : systems) {
                system.update(entities, deltaTime);
            }
            System.out.println();
        }
    }
}
{{</inlineJava>}}

Dans cet exemple, les entités sont de simples conteneurs pour les composants. Les composants contiennent uniquement des données (sans logique), comme Position, Velocity et Renderable. Les systèmes contiennent le comportement: MovementSystem traite les entités avec Position et Velocity, tandis que RenderSystem gère celles avec Position et Renderable. 

## Lecture optionnelle dans le livre de référence (Delannoy)

<p>Pour aller plus en profondeur (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 8:</p>
<ul>
	<li>Section 1 à 5</li>
	<li>Section 8 : Les membres protégés</li>
	<li>Section 10 : Classes et méthodes finales</li>
	<li>Section 11 : Les classes abstraites</li>
	<li>Section 12 : Les interfaces</li>
</ul>

## Vidéos suggérées

{{< youtube id="8TSVW7SV0KA" >}}

{{< youtube id="dd0_nYhtaKQ" >}}

{{< youtube id="M0hkhOoOIHg" >}}


<ol>
<li><a href="https://www.youtube.com/playlist?list=PLZbs1ERZ-TGVouVQxf5QAsocS1awCi6d3">Il y a une liste de vidéos sur l'héritage par Sam et al.</a> </li>
</ol>
