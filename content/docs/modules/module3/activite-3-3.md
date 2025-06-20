---
title: "Les structures de données de base"
weight: 4
---

# Les structures de données de base

Le langage Java possède toutes les stuctures de données nécessaires.
Faisons-en rapidement le tour.


## String

En Java, le type <code>String</code> représente une séquence de caractères. Il est très utilisé pour manipuler du texte : noms, messages, fichiers, etc. Une particularité essentielle à comprendre est que les objets de type <code>String</code> sont <strong>immuables</strong> : une fois créés, ils ne peuvent pas être modifiés. Toute opération qui semble modifier une chaîne (comme la concaténation, le remplacement ou la suppression de caractères) crée en réalité un nouvel objet <code>String</code> en mémoire, sans changer l’original.

Par exemple :

```java  {style=github}
String s = "Bonjour";
s = s + " le monde"; // Crée un nouvel objet String
```

Ici, la chaîne "Bonjour" n’est pas modifiée : une nouvelle chaîne "Bonjour le monde" est créée et la variable <code>s</code> pointe vers ce nouvel objet. L’ancienne chaîne reste inchangée (et sera éventuellement libérée par le ramasse-miettes).

Cette immuabilité rend les <code>String</code> sûres et efficaces pour le partage, mais peut entraîner des problèmes de performance si on fait beaucoup de modifications : dans ce cas, il vaut mieux utiliser <code>StringBuilder</code>.

## StringBuilder

Le type <code>StringBuilder</code> en Java permet de construire et de modifier efficacement des chaînes de caractères. Contrairement à la classe <code>String</code>, qui est immuable (chaque modification crée un nouvel objet), <code>StringBuilder</code> permet d’ajouter, de modifier ou de supprimer des caractères sans créer de nouveaux objets à chaque opération. Cela le rend particulièrement utile lorsqu’on doit faire de nombreuses modifications ou concaténations de chaînes, par exemple lors de la lecture d’un fichier ou la construction dynamique d’un texte.

L’utilisation de <code>StringBuilder</code> améliore considérablement les performances, surtout dans les boucles : concaténer des chaînes avec <code>+</code> dans une boucle crée à chaque fois une nouvelle chaîne, ce qui consomme beaucoup de mémoire et ralentit le programme. <code>StringBuilder</code> évite ce problème en travaillant sur une seule zone mémoire.

Exemple :

```java  {style=github}
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 5; i++) {
    sb.append("Ligne ").append(i).append("\n");
}
String resultat = sb.toString();
System.out.println(resultat);
```

Dans cet exemple, toutes les lignes sont ajoutées efficacement à la même chaîne. Pour des opérations répétées ou sur de gros volumes de texte, <code>StringBuilder</code> est donc le choix recommandé pour de bonnes performances.


## CharSequence et subSequence()

L’interface <code>CharSequence</code> représente une séquence de caractères lisible : elle est implémentée par plusieurs classes Java comme <code>String</code>, <code>StringBuilder</code> et <code>StringBuffer</code>. Cela permet d’écrire des méthodes qui acceptent n’importe quel type de séquence de caractères, et pas seulement des chaînes immuables.

La méthode <code>subSequence(int start, int end)</code> permet d’obtenir une portion (sous-séquence) de la séquence de caractères, allant de l’indice <code>start</code> (inclus) à <code>end</code> (exclu). C’est utile pour extraire une partie d’un texte sans créer une nouvelle chaîne si ce n’est pas nécessaire.

Exemple avec String :

```java  {style=github}
String texte = "Bonjour le monde";
CharSequence sousTexte = texte.subSequence(8, 14); // "le mon"
System.out.println(sousTexte);
```

Exemple avec StringBuilder :

```java  {style=github}
StringBuilder sb = new StringBuilder("abcdefg");
CharSequence sousSeq = sb.subSequence(2, 5); // "cde"
System.out.println(sousSeq);
```

Utiliser <code>CharSequence</code> rend le code plus flexible : on peut manipuler des chaînes, des buffers ou des builders de la même façon, et extraire facilement des sous-parties avec <code>subSequence()</code>. La méthode `subSequence` évite de faire une copie inutile.

## Les tableaux et matrices

<p>Jusqu'à présent, lorsque nous avons créé une variable, elle ne contenait qu'une seule donnée qui pouvait être une donnée primitive ou une référence vers un objet. En effet, dans la programmation orientée objet, certaines structures ont un nombre fixe d'objets : il s'agit des tableaux. Il en existe deux types : les tableaux à une dimension et les matrices à deux ou trois dimensions.</p>
<p>Les tableaux (array en anglais) sont très courants en programmation, car ils permettent d'organiser les données. À partir du moment où nous devons concevoir un programme devant manipuler un grand nombre de données, il devient intéressant pour nous de les rassembler dans des tableaux. Par exemple, pour un programme chargé d'organiser les nom et prénom des étudiants d'un cours, il ne serait pas efficace de déclarer une variable de type String pour chaque étudiant, car cela serait trop long. Par contre, les tableaux pourront nous aider à accélérer ce travail.</p>

### Indices

<p>Un tableau est donc une liste de valeurs. Chacune d'entre elles est stockée dans le tableau à une position bien précise, appelée indice. Le tableau ci-dessous, nommé salaires, contient des nombres entiers. En Java, la première position dans le tableau est celle de l'indice 0. Le tableau des salaires possède 11 valeurs dont les indices vont de 0 à 10.</p>

| 12 | 74 | 88 | 22 | 8 | 78 | 28 | 44 | 47 | 78 | 81 |   | Valeurs |
|----|----|----|----|---|----|----|----|----|----|----|---|---------|
| 0  | 1  | 2  | 3  | 4 | 5  | 6  | 7  | 8  | 9  | 10 |   | Indices |

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


Nous ne pouvons utiliser une liste d'initialisation que pour la première déclaration. De plus, il faut impérativement la combiner avec la déclaration de la variable. Il est impossible de le faire en deux étapes. Par exemple, le code ci-dessous produit une erreur de compilation.</p> 

```java  {style=github}
int[] tab = new int[3];
tab = {1, 2, 3};
```

<p>Initialisateur : erreur de compilation </p> 
<pre>java.lang.Error: Unresolved compilation problem: </pre> 
<pre>        Array constants can only be used in initializers 
</pre> 

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

|        | Colonne 0 | Colonne 1 | Colonne 2 | Colonne 3 |
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

|       | semaine 1 | semaine 2 | semaine 3 | semaine 4 |
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



|       | Semaine 1 | Semaine 2 | Semaine 3 | Semaine 4 |
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


Considérons l'exemple suivant. Le code implémente un modèle de langue simple en Java qui calcule les probabilités de transition entre caractères ASCII dans une chaîne donnée, puis génère une séquence de 100 caractères à partir d'un caractère initial. Il utilise un tableau à deux dimensions double[][] transitions de taille 128x128 pour stocker les probabilités qu’un caractère ASCII (0-127) soit suivi d’un autre. Dans calculerTransitions, le programme compte les occurrences des paires de caractères consécutifs dans le texte d’entrée et normalise ces comptes pour obtenir des probabilités, stockées dans transitions[i][j], où i est le caractère courant et j le suivant. Lors de la génération dans genererCaractereSuivant, ce tableau est utilisé pour sélectionner aléatoirement le caractère suivant en fonction des probabilités associées au caractère courant. Cette application des tableaux à deux dimensions permet de modéliser efficacement les relations entre caractères, chaque cellule représentant une probabilité de transition, et facilite la génération de texte en s’appuyant sur une structure matricielle claire et organisée.

{{<inlineJava path="ModeleLangue.java" lang="java">}}

import java.util.Random;

public class ModeleLangue {
    private static final int ASCII_SIZE = 128; // Taille de la table ASCII (0-127)
    private double[][] transitions; // Matrice des probabilités de transition
    private Random random;

    // Constructeur qui calcule les probabilités de transition à partir d'une chaîne
    public ModeleLangue(String texte) {
        transitions = new double[ASCII_SIZE][ASCII_SIZE];
        random = new Random();
        calculerTransitions(texte);
    }

    // Calcule les probabilités de transition
    private void calculerTransitions(String texte) {
        // Compter les transitions
        int[][] compte = new int[ASCII_SIZE][ASCII_SIZE];
        int[] totalParCaractere = new int[ASCII_SIZE];

        // Parcourir la chaîne pour compter les transitions
        for (int i = 0; i < texte.length() - 1; i++) {
            char courant = texte.charAt(i);
            char suivant = texte.charAt(i + 1);
            // Vérifier que les caractères sont dans la plage ASCII
            if (courant < ASCII_SIZE && suivant < ASCII_SIZE) {
                compte[courant][suivant]++;
                totalParCaractere[courant]++;
            }
        }

        // Calculer les probabilités
        for (int i = 0; i < ASCII_SIZE; i++) {
            if (totalParCaractere[i] > 0) {
                for (int j = 0; j < ASCII_SIZE; j++) {
                    transitions[i][j] = (double) compte[i][j] / totalParCaractere[i];
                }
            }
        }
    }

    // Génère un caractère suivant basé sur les probabilités
    private char genererCaractereSuivant(char courant) {
        if (courant >= ASCII_SIZE) {
            return (char) random.nextInt(ASCII_SIZE); // Caractère hors plage
        }

        double somme = 0.0;
        for (double prob : transitions[courant]) {
            somme += prob;
        }

        // Si aucune transition n'existe, choisir un caractère aléatoire
        if (somme == 0.0) {
            return (char) random.nextInt(ASCII_SIZE);
        }

        // Sélection aléatoire basée sur les probabilités
        double r = random.nextDouble();
        double cumul = 0.0;
        for (int i = 0; i < ASCII_SIZE; i++) {
            cumul += transitions[courant][i];
            if (r <= cumul) {
                return (char) i;
            }
        }
        // En cas d'erreur (arrondi), retourner le dernier caractère possible
        return (char) (ASCII_SIZE - 1);
    }

    // Génère une séquence de longueur donnée à partir d'un caractère initial
    public String genererSequence(char debut, int longueur) {
        StringBuilder sequence = new StringBuilder();
        sequence.append(debut);
        char courant = debut;

        for (int i = 0; i < longueur - 1; i++) {
            courant = genererCaractereSuivant(courant);
            sequence.append(courant);
        }

        return sequence.toString();
    }

    public static void main(String[] args) {
        // Exemple de texte d'entraînement
        String texte = "bonjour le monde c'est un test simple pour modeller une langue en java";
        ModeleLangue modele = new ModeleLangue(texte);
        
        // Générer une séquence de 100 caractères à partir du caractère 'b'
        String sequence = modele.genererSequence('b', 100);
        System.out.println("Séquence générée : " + sequence);
    }
}
{{</inlineJava>}}


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

Une ArrayList est une structure de données de type "Collection", similaire à un tableau, mais avec une taille indéfinie. Bref, comme une liste d'items, sa taille change au fur et à mesure de l'ajout ou du retrait d'éléments et s'utilise à la façon d'un tableau grâce à la méthode get(i), où i est l'index du tableau. L'objet ArrayList possède un ensemble de méthodes permettant de manipuler les données (ex. get, remove, isEmpty, toArray). De plus, les ArrayList utilisent le système de template (à voir en détail un peu plus loin), qui permet de créer des ArrayList pour un type d'Objet en particulier, par exemple : "`ArrayList<String>`, `ArrayList<Double>`, `ArrayList<ArrayList<Integer>>`" (Oui c'est possible ... pour simuler une matrice par exemple),etc. Voici un exemple d'instanciation et d'utilisation d'une ArrayList.



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

<p>En conclusion, les ArrayList sont des structures de données utiles. Vous verrez dans la suite du cours plusieurs utilisations des ArrayList.</p>

<p><a id="intro" name="section3"></a></p>

## Autres structures de données

### Stack (Pile)

Une <strong>Stack</strong> (ou pile) est une structure de données fondamentale qui fonctionne selon le principe « dernier arrivé, premier sorti » (LIFO : Last In, First Out). Cela signifie que le dernier élément ajouté à la pile sera le premier à en sortir. Les opérations principales sont <code>push</code> (empiler), <code>pop</code> (dépiler) et <code>peek</code> (regarder le sommet sans retirer). Les piles sont utilisées dans de nombreux contextes : gestion des appels de fonctions, annulation d’actions, analyse d’expressions, etc.

En Java, la classe <code>Stack</code> permet d’utiliser facilement cette structure : on peut y empiler des objets de tout type, puis les dépiler dans l’ordre inverse de leur ajout. Voici un exemple simple :

```java  {style=github}
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
```

Dans cet exemple, on empile trois entiers ; le <code>pop()</code> retire et retourne le dernier ajouté (30), puis <code>peek()</code> permet de consulter le sommet (20) sans le retirer.

### HashMap (Table de hachage)

Une <strong>HashMap</strong> est une structure de données qui associe des clés à des valeurs. Elle permet de retrouver très rapidement une valeur à partir de sa clé, grâce à une fonction de hachage qui transforme la clé en un index. Les <code>HashMap</code> sont très utiles pour stocker des associations uniques, comme des noms d’étudiants et leurs notes, ou des mots et leurs définitions.

Une caractéristique importante : si on ajoute plusieurs fois la même clé, la nouvelle valeur écrase l’ancienne. Par exemple, si on fait <code>map.put("clé", 1)</code> puis <code>map.put("clé", 2)</code>, la valeur associée à "clé" sera 2. Si on cherche une clé qui n’est pas présente, <code>get</code> retourne <code>null</code> (ou lève une exception si on utilise <code>getOrDefault</code> ou <code>get</code> sur des types primitifs).

Voici un exemple d’utilisation :

```java  {style=github}
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
```

Dans cet exemple, la note d’Alice est d’abord 85, puis remplacée par 90. La recherche d’une clé absente ("Charlie") retourne <code>null</code>.

### PriorityQueue (File de priorité)

Une <strong>PriorityQueue</strong> (file de priorité) est une structure de données qui permet de toujours extraire l’élément ayant la plus haute priorité (par défaut, le plus petit selon l’ordre naturel). Contrairement à une file classique (FIFO), la PriorityQueue trie automatiquement ses éléments selon leur priorité. Elle est très utilisée pour la gestion de files d’attente avec priorités, les algorithmes de plus court chemin (Dijkstra), ou la planification de tâches.

En Java, la classe <code>PriorityQueue</code> permet d’ajouter des éléments avec <code>add</code> ou <code>offer</code>, et d’extraire le plus prioritaire avec <code>poll</code> (qui le retire) ou <code>peek</code> (qui le consulte sans le retirer). Par défaut, les éléments sont triés dans l’ordre croissant, mais on peut fournir un comparateur personnalisé.

Voici un exemple simple :

```java  {style=github}
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
```

Dans cet exemple, les entiers sont extraits dans l’ordre croissant. On peut aussi utiliser des objets et définir l’ordre de priorité avec un comparateur.

## Lambdas

Une fonction lambda, ou expression lambda, est une fonction anonyme concise définie sans nom, souvent utilisée pour des opérations simples et ponctuelles. Elle permet d'écrire du code plus compact, notamment dans des contextes où une fonction est passée en argument, comme pour des opérations de filtrage ou de tri. En Java, par exemple, les lambdas s'appuient sur les interfaces fonctionnelles, qui possèdent une unique méthode abstraite. Leur syntaxe est de la forme (paramètres) -> expression ou (paramètres) -> { instructions; } pour des blocs plus complexes.

Voici un exemple de code Java avec une méthode main utilisant une lambda pour trier une liste de chaînes par longueur :

{{<inlineJava path="ExempleLambda.java" lang="java">}}
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class ExempleLambda {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList("chat", "éléphant", "chien", "girafe");
        mots.sort((a, b) -> a.length() - b.length());
        System.out.println("Mots triés par longueur : " + mots);
    }
}
{{</inlineJava>}}

Ce code définit une liste de mots, utilise une lambda pour trier les éléments par longueur croissante, puis affiche le résultat. La lambda (a, b) -> a.length() - b.length() remplace une implémentation complète de Comparator.


Les lambdas sont utilisés à de multiples fins en Java. L’API Stream en Java pour effectuer un filtrage fonctionnel sur une liste de nombres. Considérons le prochain exemple. Le premier concept clé est la création d’une liste immuable avec Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8). Cette méthode transforme un tableau de nombres en une List fixe, qui ne peut pas être modifiée (par exemple, pas d’ajout ou de suppression d’éléments). Cette liste, nommée nombres, sert de point de départ pour le traitement. Ensuite, l’opération de filtrage repose sur l’API Stream, introduite en Java 8, qui permet de manipuler des collections de manière déclarative, en exprimant ce qu’on veut obtenir (ici, les nombres pairs) plutôt que comment le faire (comme avec une boucle traditionnelle). Ce paradigme fonctionnel rend le code plus concis et expressif.

{{<inlineJava path="ExempleLambdaFiltre.java" lang="java">}}
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExempleLambdaFiltre {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> nombresPairs = nombres.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Nombres pairs : " + nombresPairs);
    }
}
{{</inlineJava>}}


La programmation fonctionnelle est un paradigme de programmation qui met l'accent sur l'utilisation de fonctions pures, l'immutabilité des données et l'évitement des effets secondaires. Une fonction pure produit toujours le même résultat pour les mêmes entrées et n'altère pas l'état externe, ce qui facilite la prédiction et le débogage du code. En Java, bien que le langage soit principalement orienté objet, l'introduction de l'API Stream et des expressions lambda en Java 8 a permis d'intégrer des concepts fonctionnels. Ces outils permettent de manipuler des collections de données de manière déclarative, en exprimant ce que l'on veut accomplir (par exemple, filtrer ou transformer des données) plutôt que comment le faire étape par étape, comme dans une approche impérative. Cette approche améliore la lisibilité et la modularité du code, tout en favorisant des opérations comme le parallélisme sans effort explicite.

Le rôle des lambdas et de l'API Stream dans Java illustre bien l'influence de la programmation fonctionnelle. Les lambdas permettent de définir des fonctions anonymes concises, souvent utilisées pour implémenter des interfaces fonctionnelles (comme Predicate ou Function) dans des opérations comme le filtrage, le mappage ou le tri. Par exemple, dans une opération comme list.stream().filter(x -> x > 0).map(x -> x * 2).collect(Collectors.toList()), chaque étape est une transformation fonctionnelle qui ne modifie pas la liste initiale, respectant ainsi le principe d'immutabilité. L'API Stream prend en charge ces transformations en traitant les données comme un flux, où les opérations sont enchaînées et évaluées de manière paresseuse (lazy evaluation), ne s'exécutant qu'à la demande d'un résultat final. Cela réduit les calculs inutiles et permet une optimisation automatique, comme le traitement parallèle avec parallelStream().

Cependant, l'intégration de la programmation fonctionnelle en Java reste partielle, car le langage conserve une forte orientation objet. Les développeurs doivent être conscients des compromis : les lambdas et les streams rendent le code plus expressif, mais une utilisation excessive ou inappropriée peut nuire à la performance ou à la lisibilité, notamment dans des cas complexes. De plus, Java impose des contraintes, comme l'absence de fonctions de première classe (les lambdas sont des implémentations d'interfaces) et une gestion explicite de l'immutabilité. Malgré ces limitations, la programmation fonctionnelle en Java, via les streams et les lambdas, a transformé la manière dont les développeurs manipulent les données, encourageant des pratiques plus modernes et alignées sur les paradigmes fonctionnels tout en restant ancrées dans l'écosystème Java.


## Complexité algorithmique 

La complexité algorithmique mesure le coût (en temps ou en espace) des opérations selon la taille des données manipulées. Voici un survol de la complexité des principales opérations sur les structures de données abordées dans ce module :

### Tableaux (array)
- **Accès à un élément** : \(O(1)\) (accès direct par indice)
- **Modification d’un élément** : \(O(1)\)
- **Recherche d’une valeur** : \(O(n)\) dans le pire cas (il faut parcourir tout le tableau)
- **Insertion/Suppression** : \(O(n)\) (il faut déplacer les éléments suivants)

### ArrayList
- **Accès à un élément** : \(O(1)\)
- **Ajout à la fin** : \(O(1)\) en moyenne (amortie), mais \(O(n)\) lors d’un redimensionnement
- **Insertion/Suppression à une position donnée** : \(O(n)\) (déplacement des éléments)
- **Recherche d’une valeur** : \(O(n)\)

### Stack (Pile)
- **Ajout (push) ou retrait (pop) d’un élément** : \(O(1)\)
- **Accès au sommet** : \(O(1)\)

### HashMap
- **Insertion, suppression, recherche par clé** : \(O(1)\) en moyenne, \(O(n)\) dans le pire cas (rare)

### PriorityQueue
- **Ajout d’un élément** : \(O(\log n)\) (le nouvel élément est placé à la fin puis remonté)
- **Extraction du plus prioritaire (poll)** : \(O(\log n)\) (le dernier élément est placé en tête puis redescendu)
- **Consultation du plus prioritaire (peek)** : \(O(1)\)

### Opérations sur les streams et lambdas
- **Filtrage, transformation (map, filter, etc.)** : \(O(n)\), car chaque élément est traité une fois
- **Tri d’une liste** : \(O(n \log n)\) (par exemple, avec `Collections.sort()` ou `List.sort()`)

### Remarques pédagogiques
- Les opérations en \(O(1)\) sont dites « en temps constant » : leur durée ne dépend pas de la taille des données.
- Les opérations en \(O(n)\) sont « linéaires » : leur durée croît proportionnellement à la taille des données.
- Les opérations en \(O(n \log n)\) sont typiques des algorithmes de tri efficaces.
- Les structures comme HashMap sont très performantes pour la recherche par clé, mais moins adaptées pour le parcours ordonné.

En résumé, le choix de la structure de données influence fortement la performance des algorithmes. Il est essentiel de comprendre la complexité des opérations pour écrire du code efficace, surtout lorsque les ensembles de données deviennent volumineux.
### Lecture optionnelle dans le livre de référence (Delannoy)

<p>Pour aller plus en profondeur sur les structures de données(optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy les chapitres 7 et 22.</p>

## Vidéos

{{< youtube id="VdvUYGs17Ek" >}}

{{< youtube id="wvQQ5263pvI" >}}

{{< youtube id="EphmNLfZ2hM" >}}

{{< youtube id="ov3d4s5w_m0" >}}

{{< youtube id="eXYLsxQvIF4" >}}


