---
title: "Les structures de données de base"
weight: 40
---

# Les structures de données de base

Le langage Java possède toutes les stuctures de données nécessaires.
Faisons-en rapidement le tour. En Java, les types de données sont organisés en deux grandes catégories : les types primitifs et les types référence. Les types primitifs, tels que int, double, float, long, short, byte, char et boolean, sont des types de base qui stockent directement des valeurs simples et ne sont pas des objets. Chaque type primitif possède une classe enveloppe correspondante (par exemple, Integer pour int, Double pour double) dans la catégorie des classes enveloppes. Ces classes permettent de représenter les primitifs sous forme d’objets, offrant des fonctionnalités supplémentaires comme l’utilisation dans des collections ou la conversion entre types.




Les types référence, quant à eux, incluent les objets tels que String, StringBuilder, ArrayList, HashMap, HashSet, PriorityQueue et Stack. Ces types, qui font partie des classes Java, sont utilisés pour manipuler des données complexes. Les classes enveloppes appartiennent également aux types référence, car elles sont des objets. Les types référence comme ArrayList et HashMap sont des collections génériques capables de stocker d’autres objets, y compris des instances de classes enveloppes ou d’autres types référence. Cette organisation permet une gestion flexible des données, avec des relations où les types primitifs sont enveloppés par leurs classes correspondantes, et les types référence servent de conteneurs ou de structures pour organiser et manipuler ces données.

Le diagramme suivant résume l'organisation des types que vous allez découvrir.




{{% hint info %}}

Dans ce cours, vous n'avez pas à maîtriser l'ensemble des structures de données. Néanmoins,
il est utile d'être familier avec les principales structures de données. Vous devriez
maîtriser les tableaux à une ou deux dimensions.

{{% /hint %}}

## Vue d'ensemble


{{<mermaid>}}
classDiagram
    %% Categories as containers
    class Types_Primitif {
        int
        double
        float
        long
        short
        byte
        char
        boolean
    }

    class Classes_Enveloppes {
        Integer
        Double
        Float
        Long
        Short
        Byte
        Character
        Boolean
    }

    class Tableaux {
        int[]
        Integer[]
        Float[]
        String[]
        int[][]
    }

    class Types_Reference {
        String
        StringBuilder
        ArrayList
        LinkedList
        HashMap
        HashSet
        LinkedHashMap
        LinkedHashSet
        TreeMap
        TreeSet
        PriorityQueue
        Stack
    }
    Classes_Enveloppes -->  Types_Reference : fait partie de
    Tableaux -->  Types_Reference : fait partie de

    %% Relationships
    Types_Primitif --> Classes_Enveloppes : enveloppe
  
    %% Reference Types relationships
    Types_Reference --> ArrayList : stocké dans
    Types_Reference --> HashMap : stocké dans
{{</mermaid>}}

Les types <code>String</code>, <code>StringBuilder</code> et <code>CharSequence</code> sont présentés
dans la section précédente : [Les chaînes de caractères (String)]({{< ref "/docs/modules/module3/activite-3-3-string" >}}).

## Les tableaux et matrices

<p>Jusqu'à présent, lorsque nous avons créé une variable, elle ne contenait qu'une seule donnée qui pouvait être une donnée primitive ou une référence vers un objet. En effet, dans la programmation orientée objet, certaines structures ont un nombre fixe d'objets : il s'agit des tableaux. Il en existe deux types : les tableaux à une dimension et les matrices à deux ou trois dimensions.</p>
<p>Les tableaux (array en anglais) sont très courants en programmation, car ils permettent d'organiser les données. À partir du moment où nous devons concevoir un programme devant manipuler un grand nombre de données, il devient intéressant pour nous de les rassembler dans des tableaux. Par exemple, pour un programme chargé d'organiser les nom et prénom des étudiants d'un cours, il ne serait pas efficace de déclarer une variable de type String pour chaque étudiant, car cela serait trop long. Par contre, les tableaux pourront nous aider à accélérer ce travail.</p>

### Indices

<p>Un tableau est donc une liste de valeurs. Chacune d'entre elles est stockée dans le tableau à une position bien précise, appelée indice. Le tableau ci-dessous, nommé salaires, contient des nombres entiers. En Java, la première position dans le tableau est celle de l'indice 0. Le tableau des salaires possède 11 valeurs dont les indices vont de 0 à 10.</p>

| Valeurs | 12 | 74 | 88 | 22 | 8 | 78 | 28 | 44 | 47 | 78 | 81 |
|---------|----|----|----|----|---|----|----|----|----|----|----|
| Indices | 0  | 1  | 2  | 3  | 4 | 5  | 6  | 7  | 8  | 9  | 10 |

<p>Pour accéder à une valeur du tableau, nous utilisons le nom du tableau suivi de l'indice entre crochets. Par exemple, pour accéder au cinquième salaire du tableau, il suffit d'écrire : salaire [4]. La valeur sera donc 8. L'expression salaire [4] a donc comme valeur 8. L'indice d'un tableau est un simple entier, il est donc possible d'utiliser des variables ou constantes entre crochets comme dans l'exemple ci-dessous :</p>

```java  {style=github}
// Tableau avec une pré-déclaration
int[] salaire = {12, 74, 88, 22, 8, 78, 28, 44, 47, 78, 81};

System.out.println(salaire[4]);
```


### Déclarer et utiliser les tableaux

<p>En Java, les tableaux sont des objets; donc, pour créer un nouveau tableau, il faudra utiliser l'opérateur new. La ligne de code suivante permet de créer un tableau de salaire horaire des 10 employés d'une entreprise.</p>

```java  {style=github}
int[] salaire = new int[10];
```

<p>Cela signifie simplement que nous déclarons une variable dont le nom est salaire, dont le type est int[] (tableau d'entiers de type primitif int). Dans le cas de tableaux contenant des nombres en utilisant des types de base (int, float, etc.), le contenu du tableau est initialisé avec des valeurs équivalent au zéro. Nous assignons ensuite un nouvel objet à cette variable. L'objet est un tableau de 10 entiers (int [10]). 
Il est donc à remarquer qu'un tableau contient plusieurs valeurs qui doivent toutes avoir le même type. Nous ne pourrions pas créer un tableau qui contiendrait des int et des double par exemple. De plus, la taille du tableau étant décidé et fixée lors de la déclaration, elle ne pourra pas changer. Nous avons par conséquent un tableau statique (rien à voir avec les classes statiques ou le mot réservé static).</p>

{{<inlineJava path="Main.java" lang="java">}}
public class Main {

    public static void main(String[] args) {

        final int MAX = 10;

        int[] list = new int[MAX];

        // Remplit le tableau
        for (int i = 0; i < MAX; i++) {
            list[i] = i * 20;
        }

        // On change la quatrième valeur
        list[3] = 777;

        // On affiche le contenu du tableau
        for (int i = 0; i < MAX; i++) {
            System.out.print(list[i] + " ");
        }
    }

}
{{</inlineJava>}}



<p>Le résultat de l'exécution donnera ceci :</p> 
<pre><strong>0 20 40 777 80 100 120 140 160 180 </strong></pre>

<p>Cet exemple montre également une bonne utilisation des constantes. En effet, si nous voulons un tableau de taille 15, il n'y a qu'une ligne de code à changer, à savoir la valeur de la constante MAX. Les crochets utilisés pour accéder à un élément d'un tableau sont un opérateur Java comme + ou =. Cet opérateur a la plus haute priorité et sera donc exécuté en premier. 
L'opérateur d'indexation de tableau ([]) vérifie automatiquement si l'indice est correct, c'est-à-dire s'il est positif et est plus petit que la taille du tableau - 1. Si tel n'est pas le cas, il se produira une erreur d'exécution.</p>

```java  {style=github}
int[] tableau = new int[2];
tableau [0] = 0;
tableau [1] = 1;
System.out.println (tableau [1]);
//Appel dans un index hors du tableau
System.out.println (tableau [2]);
```

<p>Erreur d'indice <br />L'exécution de ce code produira la sortie suivante à la console :</p> 
<p><em>java.lang.ArrayIndexOutOfBoundsException: 2 at Test.main(Test.java:18)</em> <br /><em>Exception in thread "main"</em></p> 
<p><br />Étant donné que le premier indice est de 0, il arrive souvent des erreurs d'indice trop élevé d'une position. Le programmeur doit donc être vigilant et s'assurer que les indices restent dans les limites du tableau. <br />La taille d'un tableau est régie par une variable d'instance de l'objet tableau appelée <em>length</em>. Donc, pour connaître la taille d'un tableau, il suffit de consulter le contenu de cette variable à l'aide de l'opérateur d'accès point.</p> 

```java  {style=github}
int[] tableau = new int[5];
System.out.println (tableau.length); // Affiche 5 à la console
```

## Instanciation d'un tableau

<p>Nous pouvons instancier autrement un tableau. Il suffit de donner directement les valeurs qu'il contient. Nous affecterons une <em>liste d'initialisation</em> ou <em>initialisateur</em> au tableau. Les éléments du tableau sont repris entre des accolades et séparés par des virgules. Par exemple, pour créer le tableau ci-dessous, nous pourrions écrire :</p> 

```java  {style=github}
int[] tableau = {20, 17, 21, 19, 18, 20};
```

### Initialisateur


Nous ne pouvons utiliser une liste d'initialisation que pour la première déclaration. 

```java  {style=github}
int[] tab = {1, 2, 3};
```


Il faut impérativement la combiner avec la déclaration de la variable. Il est impossible de le faire en deux étapes. Par exemple, le code ci-dessous produit une erreur de compilation.

```java  {style=github}
int[] tab = new int[3];
tab = {1, 2, 3};
```

<p>Initialisateur : erreur de compilation </p> 
<pre>java.lang.Error: Unresolved compilation problem: </pre> 
<pre>        Array constants can only be used in initializers 
</pre> 


Si vous utilisez la syntaxe `var`, vous devez déclarer le type du tableau comme suit.

```java  {style=github}
var tab = new int[]{1, 2, 3};
```


### Passer des tableaux en paramètre

<p>Nous pouvons passer un tableau complet en paramètre à une méthode, car les tableaux ne sont rien d'autre que des objets. Il ne faut donc pas oublier que ce qui sera donné à la méthode n'est pas le tableau, ni une copie de celui-ci mais bien une copie de la référence vers le tableau. 
Nous pouvons bien entendu passer en paramètre un seul élément d'un tableau. S'il s'agit d'une donnée primitive, une copie de celle-ci sera passée en paramètre. S'il s'agit d'un objet, une copie de la référence sera passée en paramètre. 
La méthode ci-dessous déplace tous les éléments du tableau d'une position vers la droite.</p>

```java  {style=github}
public class AfficheDeplacer {
    public static void main(String[] args) {
        int[] tableau = {11, 22, 33, 44};

        print(tableau);
        deplacerADroite(tableau);
        print(tableau);
    }

    private static void deplacerADroite(int[] tableau) {
        int last = tableau[tableau.length - 1];

        for (int i = tableau.length - 1; i > 0; i--) {
            tableau[i] = tableau[i - 1];
        }

        tableau[0] = last;
    }

    private static void print(int[] tableau) {

        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }

        System.out.println();
    }

}
```

### Tableaux d'objets

<p>Dans tous les exemples que nous avons vus jusqu'à présent, les tableaux contenaient uniquement des types primitifs. Dans la dernière partie de la section précédente, nous avons vu des tableaux qui pouvaient contenir des objets, ou plus précisément des références vers des objets. 
Il est possible de stocker des objets dans un tableau. La ligne de code suivant crée un tableau de 20 objets de type String.</p>

```java  {style=github}
String[] phrases = new String[20];
```

### Quelques techniques utiles

<p>Nous sommes maintenant davantage en mesure de comprendre la signature de la méthode main. Nous voyons en paramètre un tableau de String. En réalité, lorsque nous lançons un programme Java, nous savons déjà que la méthode main sera automatiquement appelée, mais qu'il est possible de lui passer des paramètres. En fait, nous pouvons lui passer un tableau de String.

Nous donnons en fait à la méthode main une chaîne de caractères qui sera découpée en morceaux délimités par des espaces. Il est ensuite possible d'utiliser ces paramètres dans la méthode, comme l'illustre le programme suivant :</p>

```java  {style=github}
public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println(args[0]);
        } else {
            System.out.println();
            System.out.println("Aucun argument sur la ligne de commande");
        }
}
```

### Trier un ensemble de données

<p>L'atout principal de l'ordinateur est sa capacité de traiter très rapidement une immense quantité de données (par exemple, la recherche d'éléments dans un ensemble selon des contraintes choisies par l'utilisateur ou encore le tri d'éléments en fonction d'un critère déterminé). 
Le tri d'informations fait partie des nombreuses applications en informatique. Il y a n! (factoriel n) façons d'ordonner une collection de n éléments. Les données triées permettent une recherche d'informations plus efficace. Le choix d'un algorithme de tri est par conséquent un critère plus pertinent que la vitesse intrinsèque de l'ordinateur.</p>

<p>Un tri simple de données consiste à rechercher la valeur minimale d'un tableau ou sa valeur maximale. Grâce à un algorithme de recherche, nous assignons la valeur minimale à la première valeur, puis parcourons l'ensemble des valeurs pour tester si l'une d'entre elles est plus petite que la valeur minimale. Si tel est le cas, la valeur minimale est assignée à cette valeur, sinon, le tri se poursuit. </p>

<p>Réalisation de l'algorithme « recherche du minimum » en Java :</p>

```java  {style=github}
public static int minimum(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
}
```


<p>La recherche de la valeur maximale est très similaire : il suffit de changer le critère de comparaison.
La réalisation sous la forme d'une méthode Java est, par conséquent, aussi similaire :</p>

```java  {style=github}
public static int maximum(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
}
```




En Java, le tri est une opération courante pour ordonner des collections d’objets, comme des listes ou des tableaux. La bibliothèque standard propose plusieurs méthodes de tri, notamment via la classe Collections (pour les collections) et la classe Arrays (pour les tableaux). Ces méthodes s’appuient souvent sur l’interface Comparator pour définir un ordre personnalisé, surtout lorsque les objets ne suivent pas un ordre naturel (comme les chaînes ou les nombres) ou lorsque l’ordre par défaut ne convient pas.

L’interface Comparator définit une méthode abstraite, compare(T o1, T o2), qui retourne :

- Une valeur négative si o1 doit précéder o2.
- Zéro si o1 et o2 sont équivalents dans l’ordre.
- Une valeur positive si o1 doit suivre o2.


Ce cas montre comment trier une liste de chaînes en utilisant un comparator pour inverser l’ordre alphabétique naturel.

{{<inlineJava path="TriInverse.java" lang="java">}}
import java.util.Arrays;
import java.util.Comparator;

public class TriInverse {
    public static void main(String[] args) {
        String[] mots = {"banane", "pomme", "ananas", "cerise"};
        Arrays.sort(mots, Comparator.reverseOrder());
        System.out.println("Mots triés en ordre alphabétique inverse : " + Arrays.toString(mots));
    }
}
{{</inlineJava>}}



Le prochain code Java illustre une manière simple et claire de trier une liste de mots en fonction de leur longueur, de la plus courte à la plus longue. Le programme commence par importer des outils Java essentiels : Arrays pour créer des listes, List pour gérer une collection de données, et Comparator pour définir une règle de tri personnalisée. Une classe spéciale, LongueurComparator, est créée pour comparer deux mots en soustrayant la longueur du premier mot de celle du second, ce qui permet de les classer par ordre de taille. Dans la méthode principale (main), une liste de mots ("chat", "éléphant", "chien", "girafe") est initialisée, puis triée à l’aide de cette règle de comparaison. Enfin, le programme affiche la liste triée, montrant les mots dans l’ordre suivant : "chat", "chien", "girafe", "éléphant".

{{<inlineJava path="ExempleLongueur.java" lang="java">}}
import java.util.Arrays;
import java.util.Comparator;

public class ExempleLongueur {
    // Nouvelle classe Comparator
    static class LongueurComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            return a.length() - b.length();
        }
    }

    public static void main(String[] args) {
        String[] mots = {"chat", "éléphant", "chien", "girafe"};
        Arrays.sort(mots, new LongueurComparator());
        System.out.println("Mots triés par longueur : " + Arrays.toString(mots));
    }
}
{{</inlineJava>}}


Cet exemple illustre la notion de classe statique. Une classe statique en Java est une classe imbriquée (définie à l'intérieur d'une autre classe) déclarée avec le mot-clé static. Elle est associée à la classe englobante plutôt qu'à une instance spécifique de cette classe. Cela signifie qu'elle peut être utilisée sans instancier la classe englobante, et elle ne peut accéder qu'aux membres statiques (variables ou méthodes) de la classe englobante.

{{<inlineJava path="Voiture.java" lang="java">}}
public class Voiture {
    private static String marque = "Toyota";
    
    // Classe statique imbriquée
    public static class Moteur {
        private int puissance;
        
        public Moteur(int puissance) {
            this.puissance = puissance;
        }
        
        public void afficherDetails() {
            System.out.println("Marque de la voiture : " + marque);
            System.out.println("Puissance du moteur : " + puissance + " chevaux");
        }
    }
    
    public static void main(String[] args) {
        // Création d'une instance de la classe statique sans instancier Voiture
        Voiture.Moteur moteur = new Voiture.Moteur(150);
        moteur.afficherDetails();
    }
}
{{</inlineJava>}}

On peut aussi régler ce problème avec une classe anonyme. Une classe anonyme en Java est une classe sans nom, définie et instanciée en une seule expression. Elle est généralement utilisée pour fournir une implémentation ponctuelle d'une interface ou pour étendre une classe, souvent dans des situations où une implémentation unique et temporaire est nécessaire. Les classes anonymes sont couramment utilisées avec des interfaces comme Comparator, Runnable, ou des écouteurs d'événements. En voici un exemple&nbsp;:

{{<inlineJava path="ExempleLongueur.java" lang="java">}}
import java.util.Arrays;
import java.util.Comparator;

public class ExempleLongueur {
    public static void main(String[] args) {
        String[] mots = {"chat", "éléphant", "chien", "girafe"};
        
        // Utilisation d'une classe anonyme pour implémenter Comparator
        Arrays.sort(mots, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        });
        
        System.out.println("Mots triés par longueur : " + Arrays.toString(mots));
    }
}
{{</inlineJava>}}



## Les tableaux à plusieurs dimensions (Matrices)

<p>Les tableaux que nous avons utilisés jusqu'à présent sont des tableaux à une seule dimension. Il suffit d'un seul indice pour identifier un élément de ces types de tableaux. Ce sont donc de simples listes de valeurs.</p> 

### Tableau à deux dimensions

<p>Un tableau à deux dimensions est un tableau avec des lignes et des colonnes. Contrairement à un tableau à une dimension, il faut utiliser deux indices pour accéder aux éléments des tableaux à deux dimensions. Le premier indice représente la ligne et le second, la colonne. La figure ci-dessous, nommée Tableau à deux dimensions, représente un tableau à deux dimensions.</p>
<p style="text-align: left;"> Tableau 1. Tableau à deux dimensions</p>

| Ligne  | Colonne 0 | Colonne 1 | Colonne 2 | Colonne 3 |
|--------|-----------|-----------|-----------|-----------|
| Ligne 0| 11        | 12        | 12        | 4         |
| Ligne 1| 87        | 45        | 32        | 6         |
| Ligne 2| 64        | 56        | 22        | 55        |
| Ligne 3| 37        | 32        | 91        | 33        |
| Ligne 4| 93        | 35        | 54        | 43        |

<p>Pour avoir accès à un élément du tableau 1, il faut écrire tableau_1[Ligne][Colonne]. Ainsi :</p> 
<p>tableau_1[Ligne 0][Colonne 0] = 11</p> 
<p>tableau_1[Ligne 4][Colonne 2] = 54</p> 
<p>tableau_1[Ligne 2][Colonne 1] = 56</p> 
<p>....</p> 

### Création de tableaux à deux dimensions

<p>La première dimension spécifie que le tableau contient cinq éléments et représente les cinq lignes achats.  La seconde dimension spécifie que chacun de ces cinq éléments est formé d'un tableau de type double de quatre éléments qui représente les colonnes d'achats.</p>

| Année | semaine 1 | semaine 2 | semaine 3 | semaine 4 |
|-------|-----------|-----------|-----------|-----------|
| 2010  | 11        | 123       | 455       | 4         |
| 2009  | 87        | 45        | 32        | 6         |
| 2008  | 64        | 56        | 22        | 55        |
| 2007  | 37        | 32        | 91        | 33        |
| 2006  | 93        | 35        | 54        | 43        |

<p>Pour déclarer un tableau à deux dimensions, il faut simplement écrire :</p> 
<p><em>typededonnées NonDuTableau [nombreDeLignes][nombreDeColonne]</em></p> 
<p>Plus concrètement, nous pouvons déclarer un tableau à deux dimensions pour inscrire des achats du mois en faisant :</p> 

```java  {style=github}
double achats [][]; //achats est ici un tableau à deux dimensions de type double des achats.
```

<p>Une fois que le tableau est déclaré, il faut le créer en utilisant le mot clé <em>new.</em></p> 
<p>Ainsi, pour créer les achats des quatre semaines du mois de juillet des cinq dernières années, nous allons faire :</p> 

```java  {style=github}
achats = new double [5][4];
```

<p>La première dimension spécifie que le tableau contient cinq éléments et représente les cinq lignes achats.  La seconde dimension spécifie que chacun de ces cinq éléments est formé d'un tableau de type double de quatre éléments qui représente les colonnes d'achats.</p> 
<p> </p> 



| Année | Semaine 1 | Semaine 2 | Semaine 3 | Semaine 4 |
|-------|-----------|-----------|-----------|-----------|
| 2010  | 11        | 123       | 455       | 4         |
| 2009  | 87        | 45        | 32        | 6         |
| 2008  | 64        | 56        | 22        | 55        |
| 2007  | 37        | 32        | 91        | 33        |
| 2006  | 93        | 35        | 54        | 43        |

<p> </p> 
<p><strong><u>Achats</u></strong></p> 
<p>Il faut noter ici que rien ne nous empêche de déclarer et de créer en même temps un tableau. Pour cela, il faut simplement faire :</p> 

```java  {style=github}
typeDeTableau [][] nomDuTableau = new typeDeTableau [nombreDeLigne][nombreDeColonne];
```

  <p>Ainsi dans le cas de Achats, nous pouvons écrire :</p> 

```java  {style=github}
double[][] Achats = new double [5][4];
```

  <p>Ainsi <em>Achats</em> est déclaré et créé simultanément.</p> 
 
### Manipulation d'un tableau à 2 dimensions

  <p>Pour accéder à un élément du tableau <em>Achats</em>, il faut écrire, par exemple :</p> 
  <p>Achats [0][0] = 11 pour l'élément à la ligne 0 colonne 0. Il est cependant important de noter que si nous avons des milliers d'éléments, cette façon de faire ne sera pas commode. Ainsi, avec deux boucles <em>for </em>imbriquées, nous pouvons accéder plus facilement aux éléments de Achats. La portion de programme suivant le montre facilement :</p> 

```java  {style=github}
int annees = 2010; // initialisation de l'année selon l'indice 0 du tableau Achats
      
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 4; j++) {
        System.out.println("Achats [" + i + "][" + j + "] =" + achats[i][j]);
    }
}
```

<p>Pour initialiser un tableau à deux dimensions, nous pouvons simplement écrire :</p> 

```java  {style=github}
typeDeTableau nomDuTableau [][] = { { }, {}, {}, etc...};
```

<p>Ainsi, pour un tableau composé des noms des étudiants et des cours qu'ils suivent peut être défini de la manière suivante :</p> 

```java  {style=github}
String etudiants[][] = { {"nom", "cours"}, {"nom", "cours"}, {"nom", "cours"}, {"nom", "cours"} etc...};
```

### Tableaux multidimensionnels

  <p>Java ne se limite pas seulement aux tableaux à deux dimensions. Nous pouvons aussi déclarer des tableaux à plus de deux dimensions. Pour déclarer un tableau à trois dimensions, par exemple, il suffit de faire : </p> 

```java  {style=github}
typedetableau [][][] nomdutableau = new [taille][taille][taille];
```

  <p>Plus concrètement, nous pouvons déclarer un tableau d'entiers comme :<br /></p> 

```java  {style=github}
int tableauEntier [][][] = new int [5][5][5];
```

  <p>Nous venons ainsi de créer un tableau d'entiers à trois dimensions. Pour initialiser un tel tableau, nous pouvons utiliser trois boucles <em>for</em>. À titre d'exemples, initialisons tous les éléments du tableau <em>tableauentier à 1 :</em></p> 

```java  {style=github}
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        for (int k = 0; k < 5; k++) {
            tableauEntier[i][j][k] = 1;
        }
    }
}
```

<p><a id="intro" name="section2"></a></p>

## Les ArrayLists

Une ArrayList est une structure de données, similaire à un tableau, mais avec une taille indéfinie. Bref, comme une liste d'items, sa taille change au fur et à mesure de l'ajout ou du retrait d'éléments et s'utilise à la façon d'un tableau grâce à la méthode get(i), où i est l'index du tableau. L'objet ArrayList possède un ensemble de méthodes permettant de manipuler les données (ex. get, remove, isEmpty, toArray). De plus, les ArrayList utilisent le système de template (à voir en détail un peu plus loin), qui permet de créer des ArrayList pour un type d'Objet en particulier, par exemple : "`ArrayList<String>`, `ArrayList<Double>`, `ArrayList<ArrayList<Integer>>`" (Oui c'est possible ... pour simuler une matrice par exemple),etc. Voici un exemple d'instanciation et d'utilisation d'une ArrayList.



{{<inlineJava path="Main.java" lang="java">}}
import java.util.*;

class Main {
  public static void main(String[] args) {
    	
    	
    	ArrayList<String> list = new ArrayList<String>();
        
    	//Permet d'ajout un élément
    	list.add("Valeur1");

    	//Permet de modifier une valeur à un index particulier
    	list.set(0, "Valeur2");
    	            
    	//Permet d'accéder à un élément
    	System.out.println(list.get(0));
    	            
    	//Permet de vérifier si la structure est vide ou non
    	System.out.println(list.isEmpty());
    	            
    	//Permet de retirer un élément
    	list.remove(0);
    	            
    	//Permet de retourner une version tableau de l'ArrayList. 
    	String[] tableau = new String[list.size()];
      for(int i = 0; i < list.size(); i++) {
        tableau[i] = (String)list.get(i);
      } 
      // Attention: list.toArray() retourne 
      // un object de type Object[]. The type
      // String[] n'est pas un sous-type du 
      // type Object[]. On ne peut donc pas faire:
      //
      // String[] tableau = list.toArray(); // Non!!!
  }
}
{{</inlineJava>}}

<p>Comme nous l'avions vu lors de la présentation de la structure d'itération while, il est possible d'itérer rapidement parmi les éléments d'une ArrayList. Pour ce faire, voici trois façons d'itérer parmi les éléments : </p>

```java  {style=github}
ArrayList<String> list = new ArrayList<String>();                        
list.add("Valeur1");

//Avec le traditionnel for
for(int i = 0; i < list.size();i++){
    System.out.println(list.get(i));
}

//Avec le for est un raccourci du compilateur. La variable s sera chaque élément de la liste
for(String s : list) {
    System.out.println(s);
}

//La méthode plus ancienne (Java 1.6) avec les itérateurs
Iterator<String> it = list.iterator();
while(it.hasNext()) {
    System.out.println(it.next());
}
```

Les structures de données dynamiques, comme StringBuilder ou ArrayList ne sont pas magiques. Elles augmentent leur capacité de la manière suivante.
En commençant avec un tableau ayant une capacité fixe, elles permettent d'ajouter des éléments jusqu'à ce que la capacité soit épuisée.
Elles allouent alors un nouveau tableau plus grand, elles y copient les éléments, et ainis de suite.
Pour comprendre le mécanisme, utilisez l'application suivante.

{{< webapp path="arraylist.html" >}}


Il est possible de mettre un ArrayList dans un ArrayList. Il devient alors possible de créer
des ArrayList qui soient multidimensionnels.

### Les tableaux dynamiques ont un coût amorti de \(O(1)\) ?


Ajouter de nouveaux éléments à un tableau dynamique, comme l'`ArrayList` de Java, a un temps constant espéré (\(O(1)\)) grâce à l'analyse amortie. Alors que la plupart des ajouts sont des opérations rapides en \(O(1)\), car elles placent simplement un élément dans un emplacement disponible du tableau sous-jacent, il arrive occasionnellement que le tableau atteigne sa capacité et doive être redimensionné. Ce redimensionnement implique la création d'un nouveau tableau, plus grand (généralement d'un facteur \(K > 1\)), et la copie de tous les éléments existants. Si la capacité actuelle est \(C\), et qu'il y a \(C\) éléments, leur copie vers le nouveau tableau de taille \(K \cdot C\) prend un temps \(O(C)\).


Pour comprendre pourquoi cela conduit à un temps amorti de \(O(1)\), considérons une séquence de \(N\) insertions à partir d'un tableau vide. Le coût total pour \(N\) insertions est la somme des coûts des insertions individuelles (chacune en \(O(1)\)) plus les coûts de toutes les opérations de redimensionnement. Les insertions individuelles ajoutent \(N \cdot O(1) = O(N)\) au coût total.

Concentrons-nous maintenant sur les coûts de redimensionnement. Les capacités auxquelles les redimensionnements se produisent sont approximativement \(1, K, K^2, K^3, \ldots, K^m\), où \(K^m\) est la plus petite puissance de \(K\) supérieure ou égale à \(N\).

Le coût de copie pour ces redimensionnements sera :
\(1 + K + K^2 + \ldots + K^{m-1}\) (en supposant une capacité initiale de 1 pour simplifier).

Ceci est la somme d'une série géométrique :
\(Coût_{copie} = \sum_{i=0}^{m-1} K^i = \frac{K^m - 1}{K - 1}\)

Puisque \(K^m \approx N\) (plus précisément, \(K^{m-1} < N \le K^m\)), le coût de copie est approximativement \(\frac{N}{K-1}\).

Par conséquent, le coût total pour \(N\) insertions est :
\(\mathrm{Coût\ Total} = O(N)\ \text{(pour les insertions)} + O\left(\frac{N}{K-1}\right)\ \text{(pour les copies)}\)

Étant donné que \(K\) est une constante supérieure à 1, \(\frac{1}{K-1}\) est également une constante.
Ainsi, \(\mathrm{Coût\ Total} = O(N) + O(N) = O(N)\).

Enfin, le coût amorti par opération est le coût total divisé par le nombre d'opérations :
\(\mathrm{Coût\ Amorti} = \frac{\mathrm{Coût\ Tota}l}{N} = \frac{O(N)}{N} = O(1)\).

Donc, tant que \(K > 1\), la complexité temporelle amortie pour ajouter un élément à un tableau dynamique reste \(O(1)\), car le coût total de la copie des éléments lors des redimensionnements est proportionnel au nombre total d'éléments insérés.


### Trier les ArrayList

Une ArrayList n’impose pas d’ordre particulier sur ses éléments : ils sont stockés dans l’ordre d’insertion. Cependant, il est très fréquent de vouloir trier les éléments qu’elle contient, par exemple par ordre alphabétique pour des chaînes de caractères ou par ordre croissant pour des nombres. Java fournit une méthode statique pratique dans la classe Collections pour effectuer ce tri : `Collections.sort()`. Cette méthode modifie directement l’ArrayList en réorganisant ses éléments selon leur ordre naturel (défini par l’interface Comparable que la plupart des classes standards implémentent).

Pour les types primitifs enveloppés (comme Integer, Double) ou les String, le tri fonctionne immédiatement. Si les éléments sont des objets personnalisés, il faudra soit que la classe implémente Comparable, soit fournir un Comparator personnalisé en second argument à `Collections.sort(list, comparator)`.

Voici un exemple simple de tri d’une ArrayList de chaînes et d’entiers.

{{<inlineJava path="ExempleTriArrayList.java">}}
import java.util.ArrayList;
import java.util.Collections;

public class ExempleTriArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banane");
        fruits.add("pomme");
        fruits.add("orange");
        fruits.add("kiwi");

        System.out.println("Avant tri : " + fruits);
        Collections.sort(fruits);
        System.out.println("Après tri : " + fruits);

        ArrayList<Integer> nombres = new ArrayList<>();
        nombres.add(45);
        nombres.add(12);
        nombres.add(78);
        nombres.add(34);

        System.out.println("Avant tri : " + nombres);
        Collections.sort(nombres);
        System.out.println("Après tri : " + nombres);
    }
}
{{</inlineJava>}}

Dans cet exemple, l’affichage avant tri respecte l’ordre d’ajout, tandis qu’après l’appel à `Collections.sort()`, les éléments sont réorganisés par ordre alphabétique pour les chaînes et par ordre numérique croissant pour les entiers. Notez que le tri est effectué en place : l’ArrayList originale est modifiée, aucune nouvelle liste n’est créée.

Si vous souhaitez obtenir une version triée sans modifier la liste originale, vous pouvez d’abord la copier (par exemple avec `new ArrayList<>(original)` ou avec `List.copyOf(original)` depuis Java 10) puis trier la copie. Pour un tri décroissant, il est possible d’utiliser `Collections.reverseOrder()` comme Comparator : `Collections.sort(list, Collections.reverseOrder())`. Ces opérations de tri ont une complexité de \( O(n \log n) \) en moyenne, ce qui reste très efficace même pour des listes de plusieurs milliers d’éléments.


### Recherche binaire sur un ArrayList ou un tableau

La recherche binaire est un algorithme efficace pour trouver un élément dans une collection qui est déjà triée. Elle fonctionne en divisant à chaque étape l’intervalle de recherche par deux, en comparant l’élément du milieu avec la valeur cherchée. Cela permet de réduire très rapidement l’espace de recherche. En Java, la classe <code>Collections</code> fournit une méthode <code>binarySearch</code> pour les <code>List</code> (comme <code>ArrayList</code>), et <code>Arrays</code> en propose une pour les tableaux primitifs ou d’objets.

En termes de complexité algorithmique, la recherche binaire elle-même s’exécute en \( O(\log n) \), où \( n \) est le nombre d’éléments dans la collection. Chaque étape élimine environ la moitié des éléments restants, ce qui rend l’algorithme beaucoup plus rapide qu’une recherche linéaire en \( O(n) \) pour de grandes tailles. Cependant, cela nécessite que la collection soit préalablement triée. Le tri, effectué par <code>Collections.sort()</code> pour une <code>ArrayList</code> ou <code>Arrays.sort()</code> pour un tableau, utilise une variante optimisée du tri fusion (TimSort pour les objets, Dual-Pivot Quicksort pour les primitifs), qui a une complexité de \( O(n \log n) \) dans le cas moyen et le pire cas. Ce coût initial du tri est amorti si de nombreuses recherches sont effectuées ensuite sur la même collection.

Si l’élément recherché est présent, <code>binarySearch</code> retourne son indice (≥ 0). S’il est absent, la méthode retourne une valeur négative correspondant à l’endroit où il pourrait être inséré pour conserver l’ordre (de la forme <code>(-point d’insertion - 1)</code>). Cela permet non seulement de détecter l’absence, mais aussi de connaître la position potentielle d’insertion. Lorsque des éléments dupliqués sont présents dans la collection triée, <code>binarySearch</code> retourne l’indice de l’une des occurrences (pas nécessairement la première ou la dernière, l’implémentation Java ne le garantit pas). La présence de doublons n’affecte pas la complexité de la recherche, qui reste en \( O(\log n) \), mais elle signifie que pour trouver toutes les occurrences ou la position exacte (première/dernière), il faudrait effectuer des recherches supplémentaires linéaires autour de l’indice trouvé.

Si on souhaite maintenir une collection sans doublons tout en utilisant la recherche binaire, il faut soit éviter les insertions de doublons manuellement, soit utiliser une structure comme <code>TreeSet</code> qui gère automatiquement l’unicité. Dans un <code>ArrayList</code> ou un tableau, rien n’empêche d’ajouter des éléments identiques avant le tri ; après tri, ils seront simplement adjacents.

Voici un exemple d’utilisation avec un <code>ArrayList</code> incluant des doublons :

{{<inlineJava path="ExempleRechercheBinaireList.java">}}
import java.util.ArrayList;
import java.util.Collections;

public class ExempleRechercheBinaireList {
    public static void main(String[] args) {
        ArrayList<Integer> nombres = new ArrayList<>();
        nombres.add(10);
        nombres.add(30);
        nombres.add(20);
        nombres.add(30); // Doublon intentionnel
        nombres.add(50);

        Collections.sort(nombres); // Trie : [10, 20, 30, 30, 50]

        int indice30 = Collections.binarySearch(nombres, 30);
        int indice25 = Collections.binarySearch(nombres, 25);

        System.out.println("Indice retourné pour 30 : " + indice30); // Affiche 2 (une des positions)
        System.out.println("Indice pour 25 : " + indice25); // Affiche -3 (position d'insertion serait 2)
        System.out.println(indice25 >= 0 ? "Présent" : "Absent");
    }
}
{{</inlineJava>}}


Et voici le même exemple avec un tableau :

{{<inlineJava path="ExempleRechercheBinaireTableau.java">}}
import java.util.Arrays;

public class ExempleRechercheBinaireTableau {
    public static void main(String[] args) {
        int[] nombres = {10, 50, 20, 30, 30}; // Doublon

        Arrays.sort(nombres); // Trie : [10, 20, 30, 30, 50]

        int indice30 = Arrays.binarySearch(nombres, 30);
        int indice25 = Arrays.binarySearch(nombres, 25);

        System.out.println("Indice retourné pour 30 : " + indice30); // Affiche 2 ou 3
        System.out.println("Indice pour 25 : " + indice25); // Affiche -3
    }
}
{{</inlineJava>}}


Dans les deux exemples, la collection doit être triée au préalable. La recherche de 30 retourne un indice valide parmi les doublons possibles, tandis que celle de 25 indique par une valeur négative qu’il n’est pas présent et où il pourrait être ajouté sans rompre l’ordre. Cette approche est idéale quand on effectue de nombreuses recherches sur une collection statique ou peu modifiée après le tri initial. Quand une valeur négative est retournée, nous pouvons obtenir la position
d'insertion à prenant la valeur absolue et en soustrayant 1. Ainsi, un index de -1 signifie que la position d'insertion est au tout début.

## Autres structures de données

### Stack (Pile)

Une <strong>Stack</strong> (ou pile) est une structure de données fondamentale qui fonctionne selon le principe « dernier arrivé, premier sorti » (LIFO : Last In, First Out). Cela signifie que le dernier élément ajouté à la pile sera le premier à en sortir. Les opérations principales sont <code>push</code> (empiler), <code>pop</code> (dépiler) et <code>peek</code> (regarder le sommet sans retirer). Les piles sont utilisées dans de nombreux contextes : gestion des appels de fonctions, annulation d’actions, analyse d’expressions, etc.

En Java, la classe <code>Stack</code> permet d’utiliser facilement cette structure : on peut y empiler des objets de tout type, puis les dépiler dans l’ordre inverse de leur ajout. Voici un exemple simple :

{{<inlineJava path="ExempleStack.java">}}
import java.util.Stack;

public class ExempleStack {
    public static void main(String[] args) {
        Stack<Integer> pile = new Stack<>();
        pile.push(10);
        pile.push(20);
        pile.push(30);
        System.out.println(pile.pop()); // Affiche 30
        System.out.println(pile.peek()); // Affiche 20 (sans dépiler)
    }
}
{{</inlineJava>}}

Dans cet exemple, on empile trois entiers ; le <code>pop()</code> retire et retourne le dernier ajouté (30), puis <code>peek()</code> permet de consulter le sommet (20) sans le retirer.

### HashMap (Table de hachage)

Une <strong>HashMap</strong> est une structure de données qui associe des clés à des valeurs. Elle permet de retrouver très rapidement une valeur à partir de sa clé, grâce à une fonction de hachage qui transforme la clé en un index. Les <code>HashMap</code> sont très utiles pour stocker des associations uniques, comme des noms d’étudiants et leurs notes, ou des mots et leurs définitions.

En termes de complexité algorithmique, dans le cas moyen (avec une bonne fonction de hachage et un faible taux de collisions), les opérations principales sur une <code>HashMap</code> en Java sont extrêmement efficaces : l’insertion (<code>put</code>), la recherche (<code>get</code>), la suppression (<code>remove</code>) et la vérification d’existence (<code>containsKey</code>) s’exécutent en temps constant amorti, soit \( O(1) \). Cela signifie que le temps d’exécution ne dépend pas sensiblement de la taille de la map, tant que la distribution des hachages reste uniforme.

Dans le pire des cas, par exemple si la fonction de hachage produit de nombreuses collisions (toutes les clés se retrouvent dans le même bucket), ces opérations peuvent dégénérer en \( O(n) \), où \( n \) est le nombre d’éléments, car chaque bucket est alors géré comme une liste chaînée (ou un arbre équilibré à partir de Java 8 lorsque le bucket dépasse un certain seuil). Java utilise des arbres rouges-noirs dans ces cas pour limiter la complexité à \( O(log n) \) par bucket. En pratique, avec les implémentations standard de <code>hashCode()</code> et un facteur de charge raisonnable (par défaut 0m75), le cas moyen \( O(1) \) domine largement.

Une caractéristique importante : si on ajoute plusieurs fois la même clé, la nouvelle valeur écrase l’ancienne. Par exemple, si on fait <code>map.put("clé", 1)</code> puis <code>map.put("clé", 2)</code>, la valeur associée à *clé* sera 2. Si on cherche une clé qui n’est pas présente, <code>get</code> retourne <code>null</code> (ou lève une exception si on utilise <code>getOrDefault</code> ou <code>get</code> sur des types primitifs).

Voici un exemple d’utilisation.

{{<inlineJava path="ExempleHashMap.java">}}
import java.util.HashMap;
public class ExempleHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> notes = new HashMap<>();
        notes.put("Alice", 85);
        notes.put("Bob", 92);
        notes.put("Alice", 90); // Remplace la note précédente d'Alice
        System.out.println(notes.get("Alice")); // Affiche 90
        System.out.println(notes.get("Charlie")); // Affiche null (clé absente)
    }
}
{{</inlineJava>}}

Dans cet exemple, la note d’Alice est d’abord 85, puis remplacée par 90. La recherche d’une clé absente ("Charlie") retourne <code>null</code>.

### LinkedList (Liste chaînée)
Une <strong>LinkedList</strong> en Java est une implémentation de liste qui utilise une structure de *liste chaînée*. Chaque élément (appelé nœud) contient une référence vers l’élément précédent et vers l’élément suivant, ce qui permet une navigation dans les deux sens. Contrairement à <code>ArrayList</code>, qui repose sur un tableau redimensionnable, la <code>LinkedList</code> n’utilise pas de stockage contigu en mémoire.



Les <code>LinkedList</code> sont particulièrement efficaces pour les insertions et suppressions fréquentes au début ou au milieu de la liste, car ces opérations ne nécessitent pas de déplacement massif d’éléments&nbsp;: il suffit de modifier quelques références. En revanche, l’accès à un élément par son indice (opération <code>get(index)</code>) est coûteux, car il faut parcourir la liste à partir d’une extrémité (généralement la plus proche) jusqu’à atteindre la position demandée.


<div style="font-family: Arial, sans-serif; max-width: 600px; margin: 20px auto; padding: 20px; border: 1px solid #ccc; border-radius: 8px; background: #f9f9f9;">
  <div style="display: flex; flex-wrap: wrap; gap: 10px; margin-bottom: 20px; justify-content: center;">
    <input type="text" id="linkedlist-value" placeholder="Enter value" style="padding: 8px; width: 120px;">
    <button onclick="addFirst()" style="padding: 8px 12px; cursor: pointer;">Ajout au début</button>
    <button onclick="addLast()" style="padding: 8px 12px; cursor: pointer;">Ajout à la fin</button>
    <button onclick="removeFirst()" style="padding: 8px 12px; cursor: pointer;">Retirer le premier</button>
    <button onclick="removeLast()" style="padding: 8px 12px; cursor: pointer;">Retirer le dernier</button>
  </div>
  <div id="linkedlist-container" style="display: flex; justify-content: center; flex-wrap: wrap; gap: 12px; min-height: 60px; align-items: center;"></div>
</div>
<script>
// Simple doubly linked list implementation
class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
    this.prev = null;
  }
}
let head = null;
let tail = null;
function render() {
  const container = document.getElementById('linkedlist-container');
  container.innerHTML = '';
  if (!head) {
    return;
  }
  let current = head;
  while (current) {
    const nodeDiv = document.createElement('div');
    nodeDiv.style.cssText = `
      background: #4a90e2;
      color: white;
      padding: 10px 20px;
      border-radius: 6px;
      position: relative;
      min-width: 60px;
      text-align: center;
      display: inline-block;
    `;
    nodeDiv.textContent = current.value;
    if (current === head) {
      const headLabel = document.createElement('div');
      headLabel.textContent = 'tête';
      headLabel.style.cssText = `
        position: absolute;
        top: -20px;
        left: 50%;
        transform: translateX(-50%);
        font-size: 12px;
        background: #333;
        color: white;
        padding: 2px 6px;
        border-radius: 4px;
      `;
      nodeDiv.appendChild(headLabel);
    }
    container.appendChild(nodeDiv);
    if (current.next) {
      const arrow = document.createElement('div');
      arrow.textContent = '→';
      arrow.style.cssText = `
        font-size: 24px;
        color: #333;
        display: inline-block;
        margin: 0 4px;
      `;
      container.appendChild(arrow);
    }
    current = current.next;
  }
  // Add tail label on the last node (skip if only one node)
  if (tail && tail !== head) {
    const nodes = container.querySelectorAll('div[style*="background: #4a90e2"]');
    const lastNode = nodes[nodes.length - 1];
    const tailLabel = document.createElement('div');
    tailLabel.textContent = 'tail';
    tailLabel.style.cssText = `
      position: absolute;
      bottom: -20px;
      left: 50%;
      transform: translateX(-50%);
      font-size: 12px;
      background: #333;
      color: white;
      padding: 2px 6px;
      border-radius: 4px;
    `;
    lastNode.style.position = 'relative';
    lastNode.appendChild(tailLabel);
  }
}
function addFirst() {
  const input = document.getElementById('linkedlist-value');
  const value = input.value.trim();
  if (!value) return;
  const node = new Node(value);
  if (!head) {
    head = tail = node;
  } else {
    node.next = head;
    head.prev = node;
    head = node;
  }
  input.value = '';
  render();
}
function addLast() {
  const input = document.getElementById('linkedlist-value');
  const value = input.value.trim();
  if (!value) return;
  const node = new Node(value);
  if (!head) {
    head = tail = node;
  } else {
    node.prev = tail;
    tail.next = node;
    tail = node;
  }
  input.value = '';
  render();
}
function removeFirst() {
  if (!head) return;
  if (head === tail) {
    head = tail = null;
  } else {
    head = head.next;
    head.prev = null;
  }
  render();
}
function removeLast() {
  if (!head) return;
  if (head === tail) {
    head = tail = null;
  } else {
    tail = tail.prev;
    tail.next = null;
  }
  render();
}
// Initial render
render();
</script>


En termes de complexité algorithmique, les opérations principales sur une <code>LinkedList</code> en Java sont les suivantes : l’accès par indice (<code>get(index)</code>), la modification par indice (<code>set(index)</code>) et la recherche d’une valeur (<code>contains</code> ou <code>indexOf</code>) s’exécutent en \( O(n) \) dans le pire cas, car un parcours linéaire peut être nécessaire. L’ajout ou la suppression en début ou en fin de liste (<code>addFirst</code>, <code>addLast</code>, <code>removeFirst</code>, <code>removeLast</code>) est en \( O(1) \). L’insertion ou la suppression à une position donnée (si on dispose déjà de l’itérateur ou de l’indice) est également en \( O(1) \) pour la modification des liens, mais atteindre cette position coûte \( O(n) \) si on part de zéro.

En pratique, on préfère une <code>LinkedList</code> lorsque les opérations dominantes sont des ajouts/suppressions en début ou fin (par exemple pour implémenter une file ou une deque), ou quand on travaille beaucoup avec des itérateurs qui permettent des modifications locales efficaces. Pour un usage général de liste avec accès fréquent par indice, <code>ArrayList</code> reste largement supérieure.

Voici un exemple d’utilisation.
{{<inlineJava path="ExempleLinkedList.java">}}
import java.util.LinkedList;

public class ExempleLinkedList {
    public static void main(String[] args) {
        LinkedList<String> liste = new LinkedList<>();
        liste.add("Premier");
        liste.addFirst("Tout au début");
        liste.addLast("Tout à la fin");
        liste.add(1, "Inséré à l'indice 1");

        System.out.println(liste); // Affiche [Tout au début, Inséré à l'indice 1, Premier, Tout à la fin]

        liste.removeFirst();
        liste.removeLast();
        liste.remove("Premier");

        System.out.println(liste); // Affiche [Inséré à l'indice 1]
    }
}
{{</inlineJava>}}
Dans cet exemple, on voit comment les ajouts et suppressions aux extrémités ou à des positions spécifiques sont simples et efficaces. La liste finale ne contient plus que l’élément inséré au milieu après les diverses suppressions.




Une queue (file d'attente en français) est une structure de données linéaire qui suit le principe FIFO (First In, First Out) : le premier élément ajouté est le premier à être retiré. On peut la comparer à une file d'attente réelle, comme au supermarché : les clients qui arrivent en premier sont servis en premier. Les opérations principales sur une queue sont l'ajout d'un élément à la fin (enqueue, souvent appelée offer ou addLast) et le retrait de l'élément au début (dequeue, souvent appelée poll ou removeFirst). On peut aussi consulter l'élément au début sans le retirer (peek).



La LinkedList est particulièrement adaptée pour implémenter une queue parce qu'elle est doublement chaînée : chaque nœud possède une référence vers le suivant et vers le précédent. La classe maintient internement deux références directes : une vers le premier nœud (head) et une vers le dernier nœud (tail). Grâce à cela, les opérations typiques d'une queue sont  efficaces.

- L'ajout à la fin (enqueue) consiste à créer un nouveau nœud, le lier au nœud actuel en fin de liste, et mettre à jour la référence tail. Cela se fait en O(1).
- Le retrait au début (dequeue) consiste à détacher le nœud head, mettre à jour la référence head vers le suivant, et éventuellement ajuster tail si la liste devient vide. Cela se fait également en O(1).
- La consultation du début (peek) revient simplement à accéder à la donnée du nœud head, en O(1).

Aucun parcours de la liste n'est nécessaire pour ces opérations, ce qui rend LinkedList bien plus performante qu'une ArrayList pour cet usage (dans ArrayList, le retrait au début nécessiterait de décaler tous les éléments, en O(n)).

Voici un exemple concret d'utilisation de LinkedList comme queue.

{{<inlineJava path="ExempleQueueLinkedList.java">}}
import java.util.LinkedList;
import java.util.Queue;

public class ExempleQueueLinkedList {
    public static void main(String[] args) {
        Queue<String> file = new LinkedList<>();

        // Enqueue : ajout à la fin
        file.offer("Client 1");
        file.offer("Client 2");
        file.offer("Client 3");

        System.out.println("File actuelle : " + file); // [Client 1, Client 2, Client 3]

        // Peek : consulter le premier sans retirer
        System.out.println("Prochain à servir : " + file.peek()); // Client 1

        // Dequeue : retrait du premier
        String servi = file.poll();
        System.out.println("Servi : " + servi); // Client 1

        servi = file.poll();
        System.out.println("Servi : " + servi); // Client 2

        System.out.println("File restante : " + file); // [Client 3]
    }
}
{{</inlineJava>}}

Dans cet exemple, on traite les éléments dans l'ordre exact d'arrivée. On utilise les méthodes offer (ajout), peek (consultation) et poll (retrait) qui sont recommandées pour les queues, car elles retournent null ou false en cas de liste vide au lieu de lever une exception (contrairement à add, element et remove).

En résumé, grâce à sa structure doublement chaînée avec accès direct aux extrémités, LinkedList offre une implémentation naturelle et très efficace d'une queue FIFO, avec toutes les opérations principales en temps constant. C'est pourquoi elle est souvent choisie dans les scénarios où l'on simule des files d'attente, des buffers ou des traitements ordonnés.

### HashSet

Un <strong>HashSet</strong> est une structure de données qui stocke une collection d’éléments uniques, sans ordre particulier et sans duplication. Il repose sur une fonction de hachage qui transforme chaque élément en un index, permettant des opérations très rapides d’ajout, de recherche et de suppression. Les <code>HashSet</code> sont particulièrement utiles lorsqu’on veut conserver uniquement des valeurs distinctes, par exemple une liste de mots uniques dans un texte, ou les identifiants d’utilisateurs connectés.

En termes de complexité algorithmique, dans le cas moyen (avec une bonne fonction de hachage et un faible taux de collisions), les opérations principales sur un <code>HashSet</code> en Java sont extrêmement efficaces : l’ajout (<code>add</code>), la recherche (<code>contains</code>), la suppression (<code>remove</code>) et la vérification de taille s’exécutent en temps constant amorti, soit \( O(1) \). Cela signifie que le temps d’exécution reste pratiquement indépendant de la taille du set, tant que la distribution des hachages est uniforme.

Dans le pire des cas, si la fonction de hachage génère de nombreuses collisions (tous les éléments tombent dans le même bucket), ces opérations peuvent dégénérer en \( O(n) \), où \( n \) est le nombre d’éléments, car les buckets sont gérés comme des listes chaînées (ou convertis en arbres équilibrés à partir de Java 8 quand un bucket dépasse un certain seuil). Java utilise alors des arbres rouges-noirs pour ramener la complexité à \( O(\log n) \) par bucket. En pratique, grâce aux implémentations standard de <code>hashCode()</code> et à un facteur de charge raisonnable (par défaut 0.75), le comportement moyen en \( O(1) \) prédomine largement.

Une caractéristique importante : si on tente d’ajouter un élément déjà présent, l’opération échoue silencieusement et le set reste inchangé (la méthode <code>add</code> retourne <code>false</code>). Par exemple, ajouter deux fois la même chaîne de caractères n’aura aucun effet après la première insertion. La recherche d’un élément absent avec <code>contains</code> retourne simplement <code>false</code>.

Voici un exemple d’utilisation.

{{<inlineJava path="ExempleHashSet.java">}}
import java.util.HashSet;

public class ExempleHashSet {
    public static void main(String[] args) {
        HashSet<String> motsUniques = new HashSet<>();
        motsUniques.add("chat");
        motsUniques.add("chien");
        motsUniques.add("chat"); // Ignoré, déjà présent
        motsUniques.add("oiseau");

        System.out.println(motsUniques.contains("chat"));    // Affiche true
        System.out.println(motsUniques.contains("lapin"));   // Affiche false
        System.out.println(motsUniques);                     // Affiche par ex. [chat, chien, oiseau] (ordre non garanti)
    }
}
{{</inlineJava>}}


Dans cet exemple, le mot "chat" est ajouté une première fois, mais la seconde tentative est ignorée. La recherche de "lapin", absent du set, retourne <code>false</code>. L’affichage du set montre les éléments uniques, sans ordre prédéfini.


### TreeSet
Un **TreeSet** est une structure de données qui stocke une collection d’éléments uniques, triés selon un ordre naturel (défini par l’interface Comparable) ou un comparateur personnalisé, sans duplication possible. Il est particulièrement utile pour maintenir une liste ordonnée d’éléments distincts, comme des mots triés alphabétiquement dans un ensemble ou des identifiants uniques à ranger par ordre croissant.

En termes de complexité algorithmique, les opérations principales sur un **TreeSet** en Java s’exécutent en temps logarithmique, soit \( O(\log n) \), grâce à son implémentation interne basée sur un arbre rouge-noir (red-black tree). Cela concerne l’ajout (add), la recherche (contains), la suppression (remove) et d’autres opérations comme trouver le premier ou le dernier élément. Ce temps reste prévisible et équilibré, même pour de grandes collections, car l’arbre s’auto-équilibre.

Une caractéristique importante : tenter d’ajouter un élément déjà présent échoue silencieusement (la méthode add retourne false), et l’ensemble reste inchangé. De plus, les éléments doivent être comparables, sinon une exception est levée. Le TreeSet n’autorise pas les valeurs null, et l’ordre d’insertion n’est pas conservé – les éléments sont toujours itérés dans l’ordre trié.

Voici un exemple d’utilisation.

{{<inlineJava path="ExempleTreeSet.java">}}
import java.util.TreeSet;
public class ExempleTreeSet {
    public static void main(String[] args) {
        TreeSet<String> motsTries = new TreeSet<>();
        motsTries.add("chat");
        motsTries.add("chien");
        motsTries.add("chat"); // Ignoré, déjà présent
        motsTries.add("oiseau");
        motsTries.add("abeille");
        System.out.println(motsTries.contains("chien")); // Affiche true
        System.out.println(motsTries.contains("lapin")); // Affiche false
        System.out.println(motsTries); // Affiche par ex. [abeille, chat, chien, oiseau] (ordre trié)
    }
}
{{</inlineJava>}}

Dans cet exemple, "chat" n’est ajouté qu’une fois, et l’affichage montre les éléments triés alphabétiquement, indépendamment de l’ordre d’insertion.

### TreeMap
Un **TreeMap** est une structure de données qui associe des clés uniques à des valeurs, avec les clés triées selon un ordre naturel ou un comparateur personnalisé. Il permet de retrouver rapidement une valeur à partir de sa clé, tout en maintenant un ordre sur les clés. Les TreeMap sont idéaux pour des associations ordonnées, comme un dictionnaire avec mots triés et leurs définitions, ou des scores par joueur rangés par nom.

En termes de complexité algorithmique, comme pour le TreeSet, les opérations principales (put pour insertion, get pour recherche, remove pour suppression, containsKey pour vérification) s’exécutent en \( O(\log n) \), grâce à l’implémentation interne par un arbre rouge-noir. Cela garantit un bon équilibre et des performances stables.

Une caractéristique importante : les clés doivent être uniques et comparables ; ajouter une clé existante remplace la valeur associée. Le TreeMap n’autorise pas les clés null (mais accepte les valeurs null), et l’itération suit toujours l’ordre trié des clés. Si une clé absente est recherchée, get retourne null.

Voici un exemple d’utilisation.

{{<inlineJava path="ExempleTreeMap.java">}}
import java.util.TreeMap;
public class ExempleTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> notes = new TreeMap<>();
        notes.put("Alice", 85);
        notes.put("Bob", 92);
        notes.put("Alice", 90); // Remplace la note précédente d'Alice
        notes.put("Charlie", 78);
        System.out.println(notes.get("Bob")); // Affiche 92
        System.out.println(notes.get("David")); // Affiche null (clé absente)
        System.out.println(notes); // Affiche par ex. {Alice=90, Bob=92, Charlie=78} (clés triées)
    }
}
{{</inlineJava>}}

Dans cet exemple, la note d’Alice est mise à jour, et l’affichage montre les entrées ordonnées par clé alphabétique.


### LinkedHashMap (Table de hachage avec ordre d’insertion)
Une <strong>LinkedHashMap</strong> est une variante de <code>HashMap</code> qui conserve l’ordre d’insertion des éléments. Elle maintient en interne une liste chaînée doublement liée qui relie les entrées dans l’ordre où elles ont été ajoutées. Cela permet d’itérer sur la map en respectant cet ordre, ce qui n’est pas le cas avec une <code>HashMap</code> classique où l’ordre des éléments est imprévisible. Une <code>LinkedHashMap</code> peut également être configurée pour maintenir l’ordre d’accès (access-order) plutôt que l’ordre d’insertion, ce qui est particulièrement utile pour implémenter un cache LRU (Least Recently Used) : les éléments les plus récemment accédés sont placés en fin de liste et les plus anciens en début, facilitant leur suppression.

Comme elle hérite de <code>HashMap</code>, une <code>LinkedHashMap</code> offre les mêmes performances pour les opérations de base. L’insertion (<code>put</code>), la recherche (<code>get</code>), la suppression (<code>remove</code>) et la vérification d’existence (<code>containsKey</code>) sont en \( O(1) \) en moyenne, avec le même risque de dégénérescence en \( O(n) \) dans le pire cas en cas de collisions excessives. Le surcoût lié à la maintenance de la liste chaînée est négligeable : chaque opération reste amortie en temps constant. L’itération sur les clés, valeurs ou entrées est en \( O(n) \), mais suit fidèlement l’ordre choisi (insertion ou accès).

Par défaut, une <code>LinkedHashMap</code> utilise l’ordre d’insertion. Pour activer l’ordre d’accès, il suffit de passer <code>true</code> au paramètre <code>accessOrder</code> du constructeur. Dans ce mode, chaque appel à <code>get</code> ou <code>put</code> (si la clé existe déjà) déplace l’entrée correspondante en fin de liste. On peut aussi surcharger la méthode <code>removeEldestEntry</code> pour implémenter une politique d’éviction automatique quand la map atteint une taille maximale.

Voici un exemple d’utilisation.
{{<inlineJava path="ExempleLinkedHashMap.java">}}
import java.util.LinkedHashMap;
import java.util.Map;

public class ExempleLinkedHashMap {
    public static void main(String[] args) {
        // Ordre d'insertion classique
        LinkedHashMap<String, Integer> mapInsertion = new LinkedHashMap<>();
        mapInsertion.put("Alice", 85);
        mapInsertion.put("Bob", 92);
        mapInsertion.put("Charlie", 78);
        mapInsertion.put("Alice", 90); // Met à jour la valeur mais conserve la position d'insertion initiale

        System.out.println("Ordre d'insertion :");
        for (Map.Entry<String, Integer> entry : mapInsertion.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        // Affiche Alice, Bob, Charlie (Alice reste à sa position initiale)

        // LinkedHashMap en mode access-order pour un petit cache LRU
        LinkedHashMap<String, Integer> cache = new LinkedHashMap<>(3, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > 3; // Évite de dépasser 3 éléments
            }
        };

        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);
        cache.get("A"); // A devient le plus récemment utilisé
        cache.put("D", 4); // Déclenche l'éviction de l'élément le plus ancien (B)

        System.out.println("\nCache LRU après opérations : " + cache);
        // Affiche quelque chose comme {C=3, A=1, D=4} (B a été évincé)
    }
}
{{</inlineJava>}}
Dans le premier exemple, l’ordre affiché respecte strictement l’ordre d’insertion initial, même après mise à jour d’Alice. Dans le second, on voit comment le mode access-order et la surcharge de <code>removeEldestEntry</code> permettent de construire facilement un cache borné de type LRU. La <code>LinkedHashMap</code> est donc idéale quand on a besoin des performances d’une table de hachage tout en conservant un ordre déterministe sur les éléments.


### LinkedHashSet (Ensemble avec ordre d’insertion)
Un <strong>LinkedHashSet</strong> est une implémentation de l’interface <code>Set</code> qui combine les caractéristiques d’un <code>HashSet</code> (unicité des éléments et performances élevées) avec la conservation de l’ordre d’insertion des éléments. Contrairement à un <code>HashSet</code> classique où l’ordre d’itération est imprévisible, un <code>LinkedHashSet</code> maintient en interne une liste chaînée doublement liée qui relie les éléments dans l’ordre exact où ils ont été ajoutés. Cela garantit que l’itération (via un itérateur ou un for-each) restitue toujours les éléments dans cet ordre d’insertion, ce qui est particulièrement pratique quand on veut éviter les doublons tout en préservant une séquence déterministe.

En termes de performances, un <code>LinkedHashSet</code> hérite du comportement de <code>HashSet</code> : les opérations principales comme l’ajout (<code>add</code>), la suppression (<code>remove</code>) et la vérification d’existence (<code>contains</code>) sont en \( O(1) \) en moyenne, avec un risque de dégénérescence en \( O(n) \) dans le pire cas en cas de nombreuses collisions de hachage. Le surcoût induit par la maintenance de la liste chaînée reste constant et négligeable, si bien que les performances globales sont pratiquement identiques à celles d’un <code>HashSet</code>. L’itération sur l’ensemble est en \( O(n) \), mais suit fidèlement l’ordre d’insertion.

Un <code>LinkedHashSet</code> est idéal dans les situations où l’on a besoin d’un ensemble sans doublons mais avec un ordre prévisible, par exemple pour conserver une liste d’éléments uniques dans l’ordre d’apparition (comme des identifiants visités, des tags, ou des étapes d’un processus). À la différence de <code>TreeSet</code>, il ne trie pas les éléments selon leur ordre naturel ou un comparateur, mais conserve simplement l’ordre historique d’ajout.

Voici un exemple d’utilisation.
{{<inlineJava path="ExempleLinkedHashSet.java">}}
import java.util.LinkedHashSet;

public class ExempleLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> ensemble = new LinkedHashSet<>();
        ensemble.add("Pomme");
        ensemble.add("Banane");
        ensemble.add("Orange");
        ensemble.add("Pomme"); // Doublon ignoré, pas d'exception
        ensemble.add("Kiwi");

        System.out.println("Contenu dans l'ordre d'insertion :");
        for (String fruit : ensemble) {
            System.out.println(fruit);
        }
        // Affiche :
        // Pomme
        // Banane
        // Orange
        // Kiwi

        ensemble.remove("Banane");
        System.out.println("\nAprès suppression de Banane : " + ensemble);
        // Affiche [Pomme, Orange, Kiwi] (ordre préservé)
    }
}
{{</inlineJava>}}
Dans cet exemple, l’ajout du doublon "Pomme" est silencieusement ignoré, et l’ordre d’itération reste strictement celui des premières insertions. Après suppression, les éléments restants conservent leur position relative. Le <code>LinkedHashSet</code> offre ainsi un compromis élégant entre unicité rapide et ordre stable, sans le coût logarithmique d’un <code>TreeSet</code>.

### PriorityQueue (File de priorité)

Une <strong>PriorityQueue</strong> (file de priorité) est une structure de données qui permet de toujours extraire l’élément ayant la plus haute priorité (par défaut, le plus petit selon l’ordre naturel). Contrairement à une file classique (FIFO), la PriorityQueue trie automatiquement ses éléments selon leur priorité. Elle est très utilisée pour la gestion de files d’attente avec priorités, les algorithmes de plus court chemin (Dijkstra), ou la planification de tâches.

En Java, la classe <code>PriorityQueue</code> permet d’ajouter des éléments avec <code>add</code> ou <code>offer</code>, et d’extraire le plus prioritaire avec <code>poll</code> (qui le retire) ou <code>peek</code> (qui le consulte sans le retirer). Par défaut, les éléments sont triés dans l’ordre croissant, mais on peut fournir un comparateur personnalisé.

Voici un exemple simple :

{{<inlineJava path="ExemplePriorityQueue.java">}}
import java.util.PriorityQueue;

public class ExemplePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> file = new PriorityQueue<>();
        file.add(30);
        file.add(10);
        file.add(20);
        System.out.println(file.poll()); // Affiche 10 (le plus petit)
        System.out.println(file.peek()); // Affiche 20 (le prochain plus petit)
    }
}
{{</inlineJava>}}

Dans cet exemple, les entiers sont extraits dans l’ordre croissant. On peut aussi utiliser des objets et définir l’ordre de priorité avec un comparateur.

## Par valeur et par référence

Quand on passe une valeur en Java, il y a une différence fondamentale selon qu’il s’agit d’un type primitif ou d’un type référence, en raison de la manière dont Java gère les paramètres dans les méthodes.

Les types primitifs (int, double, float, long, short, byte, char, boolean) sont passés par valeur. Cela signifie que lorsqu’une variable de type primitif est passée à une méthode, une copie de sa valeur est transmise. Toute modification de cette valeur à l’intérieur de la méthode n’affecte pas la variable originale à l’extérieur de la méthode. Par exemple, si vous passez un int à une méthode et que la méthode modifie ce paramètre, la valeur de la variable initiale reste inchangée.

En revanche, les types référence (comme String, StringBuilder, ArrayList, HashMap, ou les classes enveloppes telles que Integer, Double ainsi que tous les tableaux) sont passés par référence, ou plus précisément, par copie de la référence. Cela signifie que la méthode reçoit une copie de l’adresse mémoire pointant vers l’objet. Si la méthode modifie l’état interne de l’objet (par exemple, en ajoutant un élément à un ArrayList), cette modification est visible à l’extérieur, car l’objet original est affecté. Cependant, si la méthode réassigne la référence à un nouvel objet (par exemple, en créant un nouveau StringBuilder), cela n’affecte pas la référence originale à l’extérieur de la méthode. En résumé, pour les types référence, les modifications internes aux objets sont persistantes, mais les réassignations de la référence ne le sont pas.

Il est préférable d'utiliser des exemples pour bien comprendre. Dans l'exemple suivant, la variable valeur n’est pas modifiée car une copie de sa valeur n’est pas modifiée car une copie de sa valeur est passée à la méthode.
{{<inlineJava path="Exemple.java" lang="java">}}

public class Exemple {
    public static void modifierValeur(int nombre) {
        nombre = 100;
        System.out.println("Valeur dans la méthode : " + nombre);
    }

    public static void main(String[] args) {
        int valeur = 10;
        System.out.println("Avant appel : " + valeur);
        modifierValeur(valeur);
        System.out.println("Après appel : " + valeur);
    }
}
{{</inlineJava>}}

Dans le prochain exemple, le tableau est modifié car la méthode accède à l’objet original via la copie de la référence.
{{<inlineJava path="Exemple.java" lang="java">}}
public class Exemple {
    public static void modifierTableau(int[] tableau) {
        tableau[0] = 999;
        System.out.println("Valeur dans la méthode : " + tableau[0]);
    }

    public static void main(String[] args) {
        int[] monTableau = {1, 2, 3};
        System.out.println("Avant appel : " + monTableau[0]);
        modifierTableau(monTableau);
        System.out.println("Après appel : " + monTableau[0]);
    }
}
{{</inlineJava>}}

Dans cet autre exemple, la modification interne de l’objet StringBuilder est visible à l’extérieur.
{{<inlineJava path="Exemple.java" lang="java">}}
public class Exemple {
    public static void modifierStringBuilder(StringBuilder sb) {
        sb.append(" monde");
        System.out.println("Valeur dans la méthode : " + sb);
    }

    public static void main(String[] args) {
        StringBuilder texte = new StringBuilder("Bonjour");
        System.out.println("Avant appel : " + texte);
        modifierStringBuilder(texte);
        System.out.println("Après appel : " + texte);
    }
}
{{</inlineJava>}}

Dans le prochain exemple, la réassignation de sb à un nouvel objet n’affecte pas la référence originale.
{{<inlineJava path="Exemple.java" lang="java">}}
public class Exemple {
    public static void reassignerStringBuilder(StringBuilder sb) {
        sb = new StringBuilder("Nouveau");
        System.out.println("Valeur dans la méthode : " + sb);
    }

    public static void main(String[] args) {
        StringBuilder texte = new StringBuilder("Original");
        System.out.println("Avant appel : " + texte);
        reassignerStringBuilder(texte);
        System.out.println("Après appel : " + texte);
    }
}
{{</inlineJava>}}

Dans ce dernier exemple, la réassignation dans la méthode crée un nouvel objet sans affecter la référence originale.
{{<inlineJava path="Exemple.java" lang="java">}}
public class Exemple {
    public static void modifierString(String texte) {
        texte = "Nouveau texte";
        System.out.println("Valeur dans la méthode : " + texte);
    }

    public static void main(String[] args) {
        String message = "Texte initial";
        System.out.println("Avant appel : " + message);
        modifierString(message);
        System.out.println("Après appel : " + message);
    }
}
{{</inlineJava>}}

De toute manière, une instance de la classe String ne peut pas être modifiée en Java.


## Complexité algorithmique
La complexité algorithmique mesure le coût (en temps ou en espace) des opérations selon la taille des données manipulées. Voici un survol de la complexité des principales opérations sur les structures de données abordées dans ce module :
### Tableaux (array)
- *Accès à un élément* : \(O(1)\) (accès direct par indice)
- *Modification d’un élément* : \(O(1)\)
- *Recherche d’une valeur* : \(O(n)\) dans le pire cas (il faut parcourir tout le tableau) ; \(O(\log n)\) avec recherche binaire si le tableau est trié
- *Insertion/Suppression* : \(O(n)\) (il faut déplacer les éléments suivants)
- *Tri* : \(O(n \log n)\) avec Arrays.sort() en Java
### ArrayList
- *Accès à un élément* : \(O(1)\)
- *Ajout à la fin* : \(O(1)\) en moyenne (amortie), mais \(O(n)\) lors d’un redimensionnement
- *Insertion/Suppression à une position donnée* : \(O(n)\) (déplacement des éléments)
- *Recherche d’une valeur* : \(O(n)\) ; \(O(\log n)\) avec recherche binaire si la liste est triée
- *Tri* : \(O(n \log n)\) avec Collections.sort() en Java
### Stack (Pile)
- *Ajout (push) ou retrait (pop) d’un élément* : \(O(1)\)
- *Accès au sommet* : \(O(1)\)
### LinkedList
- *Accès à un élément par indice* : \(O(n)\) (parcours depuis l’extrémité la plus proche)
- *Ajout/Suppression en début ou en fin* : \(O(1)\)
- *Insertion/Suppression à une position donnée* : \(O(n)\) pour atteindre la position + \(O(1)\) pour modifier les liens
- *Recherche d’une valeur* : \(O(n)\)
### HashMap
- *Insertion, suppression, recherche par clé* : \(O(1)\) en moyenne, mais les clés ne sont pas ordonnées
### LinkedHashMap
- *Insertion, suppression, recherche par clé* : \(O(1)\) en moyenne, les clés conservent l’ordre d’insertion (ou d’accès si configuré)
### HashSet
- *Insertion (add), suppression (remove), recherche (contains)* : \(O(1)\) en moyenne, mais les éléments ne sont pas ordonnés
### LinkedHashSet
- *Insertion (add), suppression (remove), recherche (contains)* : \(O(1)\) en moyenne, les éléments conservent l’ordre d’insertion
### TreeSet
- *Insertion (add), suppression (remove), recherche (contains)* : \(O(\log n)\) mais les éléments sont naturellement triés
### TreeMap
- *Insertion (put), suppression (remove), recherche par clé (get, containsKey)* : \(O(\log n)\) mais les clés sont naturellement triées
### PriorityQueue
- *Ajout d’un élément* : \(O(\log n)\) (le nouvel élément est placé à la fin puis remonté)
- *Extraction du plus prioritaire (poll)* : \(O(\log n)\) (le dernier élément est placé en tête puis redescendu)
- *Consultation du plus prioritaire (peek)* : \(O(1)\)
### Opérations sur les streams et lambdas
- *Filtrage, transformation (map, filter, etc.)* : \(O(n)\), car chaque élément est traité une fois
- *Tri d’une liste* : \(O(n \log n)\) (par exemple, avec `Collections.sort()` ou `List.sort()`)
### Remarques pédagogiques
- Les opérations en \(O(1)\) sont dites « en temps constant » : leur durée ne dépend pas de la taille des données.
- Les oprations en \(O(\log n)\) sont en temps logarithmique. 
- Les opérations en \(O(n)\) sont « linéaires » : leur durée peut croître proportionnellement à la taille des données.
- Les opérations en \(O(n \log n)\) dites linéarithmique, elle sont typiques des algorithmes de tri efficaces.

En résumé, le choix de la structure de données influence fortement la performance des algorithmes. Il est essentiel de comprendre la complexité des opérations pour écrire du code efficace, surtout lorsque les ensembles de données deviennent volumineux.



## Lecture optionnelle dans le livre de référence (Delannoy)

<p>Pour aller plus en profondeur sur les structures de données (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy les chapitres 7 et 22.</p>

## Vidéos

{{< youtube id="VdvUYGs17Ek" >}}

{{< youtube id="wvQQ5263pvI" >}}

{{< youtube id="EphmNLfZ2hM" >}}

{{< youtube id="ov3d4s5w_m0" >}}

{{< youtube id="eXYLsxQvIF4" >}}

## Questions de révision 



<details>
    <summary>Question 1 : Pourquoi les objets String sont-ils immuables en Java, et quelle est la conséquence lors d'une concaténation répétée ?</summary>
    <p>Réponse : L'immuabilité garantit la sécurité et permet le partage efficace des instances. Une concaténation répétée crée de nombreux objets temporaires, ce qui peut dégrader les performances et augmenter les allocations mémoire.</p>
</details>

<details>
    <summary>Question 2 : Dans quel cas faut-il préférer StringBuilder à String ?</summary>
    <p>Réponse : Lorsque l'on effectue de nombreuses modifications ou concaténations, car StringBuilder modifie la séquence en place sans créer de nouveaux objets à chaque opération.</p>
</details>

<details>
    <summary>Question 3 : En Java, les tableaux ont-ils une taille fixe ou dynamique ? Comment connaître leur taille ?</summary>
    <p>Réponse : Ils ont une taille fixe, définie à la création. La taille est accessible via la propriété length (exemple : tableau.length).</p>
</details>


<details>
    <summary>Question 4 : Quand passe-t-on un tableau en paramètre d'une méthode, qu'est-ce qui est réellement transmis ?</summary>
    <p>Réponse : Une copie de la référence vers le tableau est transmise, donc les modifications sur les éléments du tableau sont visibles à l'extérieur de la méthode.</p>
</details>

<details>
    <summary>Question 5 : Quelle est la différence principale entre ArrayList et LinkedList en termes d'accès par indice ?</summary>
    <p>Réponse : ArrayList offre un accès par indice en \( O(1) \) grâce à son tableau interne, tandis que LinkedList nécessite un parcours en \( O(n) \) car elle utilise des nœuds chaînés.</p>
</details>

<details>
    <summary>Question 6 : Pourquoi l'ajout en fin d'ArrayList est-il considéré comme \( O(1) \) amorti ?</summary>
    <p>Réponse : La plupart des ajouts sont rapides, mais un redimensionnement occasionnel coûte  \( O(n) \). L'analyse amortie répartit ce coût sur toutes les opérations pour obtenir \( O(1) \) en moyenne.</p>
</details>

<details>
    <summary>Question 7 : Quelle méthode utilise-t-on pour trier une ArrayList en Java ?</summary>
    <p>Réponse : Collections.sort(liste) pour l'ordre naturel, ou Collections.sort(liste, comparator) pour un ordre personnalisé.</p>
</details>

<details>
    <summary>Question 8 : Quelle est la complexité de la recherche binaire sur une liste triée ?</summary>
    <p>Réponse : \( O(\log n) \), car elle divise l'intervalle de recherche par deux à chaque étape.</p>
</details>

<details>
    <summary>Question 9 : Quel principe suit la structure Stack (pile) ?</summary>
    <p>Réponse : LIFO (Last In, First Out) : le dernier élément ajouté est le premier retiré.</p>
</details>

<details>
    <summary>Question 10 : Qu'est-ce qui distingue HashMap de TreeMap ?</summary>
    <p>Réponse : HashMap offre des opérations en \( O(1) \) en moyenne sans ordre sur les clés, tandis que TreeMap trie les clés et a une complexité \( O(\log n) \).</p>
</details>

<details>
    <summary>Question 11 : Quel avantage offre LinkedHashMap par rapport à HashMap ?</summary>
    <p>Réponse : Il conserve l'ordre d'insertion des éléments (ou d'accès si configuré), ce qui permet une itération prévisible.</p>
</details>

<details>
    <summary>Question 12 : Quelle structure garantit l'unicité des éléments tout en les maintenant triés ?</summary>
    <p>Réponse : TreeSet trie les éléments selon leur ordre naturel ou un comparateur et n'autorise pas les doublons.</p>
</details>

<details>
    <summary>Question 13 : Quel est le principe de fonctionnement d'une PriorityQueue ?</summary>
    <p>Réponse : Elle extrait toujours l'élément de plus haute priorité (par défaut le plus petit), en maintenant un ordre interne via un tas (heap).</p>
</details>

<details>
    <summary>Question 14 : En Java, comment les types primitifs et les types référence sont-ils passés en paramètres de méthodes ?</summary>
    <p>Réponse : Les primitifs sont passés par valeur (copie), les références par copie de la référence : les modifications internes à l'objet sont visibles, mais une réassignation de la référence ne l'est pas.</p>
</details>

<details>
    <summary>Question 15 : Quelle est la complexité typique des opérations d'insertion, recherche et suppression dans un HashSet ?</summary>
    <p>Réponse : \(O(1)\) en moyenne grâce à la fonction de hachage, bien que le pire cas puisse dégénérer en O(n) en cas de nombreuses collisions.</p>
</details>