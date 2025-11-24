---
title: "La récursivité"
weight: 80
---

# La récursivité

La récursivité est une technique fondamentale en informatique qui consiste pour une fonction à s’appeler elle-même afin de résoudre un problème en le divisant en sous-problèmes plus simples. Cette approche permet d’exprimer élégamment des solutions à des problèmes complexes, comme le calcul de suites, la recherche dans des structures arborescentes ou la résolution de certains algorithmes mathématiques. Comprendre la récursivité est essentiel pour progresser en algorithmique et en programmation.


## Le concept de récursivité

La récursivité est un concept de programmation qui remonte aux premières années des langages de programmation (avec LISP et Algol'60). Il s'agit de faire un appel à la méthode/fonction dans la propre portée d'une méthode. Donc d'appeler, par exemple, la méthode calcul à l'intérieur même de la fonction calcul. En quelque sorte, la récursivité peut permettre de remplacer ou imiter des algorithmes itératifs, en faisant un nombre fini d'itérations sur une portion de code. 


La suite de Fibonacci est une suite mathématique célèbre dans laquelle chaque terme est la somme des deux termes précédents. Elle commence généralement par 0 et 1, puis se poursuit ainsi : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... Cette suite apparaît dans de nombreux domaines des mathématiques, de l’informatique et même de la nature (croissance des plantes, spirales, etc.).

En programmation, le calcul des nombres de Fibonacci est un exemple classique pour illustrer la récursivité. La version récursive du calcul est élégante.



```java  {style=github}
public class ExempleRecursivite {
    public static void main(String[] args) {
        int nb = fibonacci(10);
        System.out.println("nb = " + nb);
    }
    
    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
```

Malheureusement, cette fonction est inefficace pour de grandes valeurs de `n`, car elle recalcule plusieurs fois les mêmes valeurs, ce qui entraîne une explosion du nombre d’appels récursifs et peut provoquer un dépassement de pile. Par exemple, calculer le 40e ou le 100e nombre de Fibonacci de façon récursive est très lent et peut faire planter le programme.

```java  {style=github}
public class ExempleRecursivite {
    public static void main(String[] args) {
        int nb = fibonacci(100);
        System.out.println("nb = " + nb);
    }
    
    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
```

Lorsque Java appelle une fonction, celle-ci dispose d'une certaine quantité de mémoire appelée pile (ou stack en anglais). La pile est une zone de la mémoire utilisée pour stocker les variables locales, les paramètres de la fonction et les informations nécessaires pour revenir à l’appelant une fois la fonction terminée. À chaque nouvel appel de fonction (y compris les appels récursifs), une nouvelle « trame d’activation » (ou frame) est ajoutée au sommet de la pile.

Lorsque la fonction se termine, sa trame d’activation est retirée de la pile et la mémoire correspondante est libérée. Si les appels de fonction s’enchaînent trop profondément (par exemple, dans une récursion mal contrôlée), la pile peut se remplir complètement, ce qui provoque une erreur appelée StackOverflowError. C’est pourquoi il est important de bien maîtriser la récursivité et de s’assurer que chaque fonction récursive possède un cas d’arrêt (ou condition de terminaison) pour éviter une croissance infinie de la pile.


Pour pallier ce problème, on privilégie une version itérative, qui utilise une simple boucle et deux variables pour mémoriser les deux derniers résultats. Cette approche est beaucoup plus efficace et permet de calculer rapidement des valeurs élevées de la suite de Fibonacci sans risque de débordement de pile. Dans l'exemple suivant, modifiez le nombre de Fibonacci calculé.

{{<inlineJava path="ExempleRecursivite.java" lang="java">}}
public class ExempleRecursivite {
    public static void main(String[] args) {
        long nb = fibonacci(10);
        System.out.println("nb = " + nb);
    }
    
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        long prev = 0;
        long current = 1;
        long result = 0;
        
        for (int i = 2; i <= n; i++) {
            result = prev + current;
            prev = current;
            current = result;
        }
        
        return result;
    }
}
{{</inlineJava>}}

Cependant, il faut aussi faire attention au type de variable utilisé (int, long, BigInteger) pour éviter les débordements lors du calcul de grands nombres.

La récursivité demeure utile par son élégance et sa simplicité. Prenons cet exemple où on trouve le plus grand diviseur commun de deux entiers, basée sur l'<a href="https://fr.wikipedia.org/wiki/Algorithme_d%27Euclide">algorithme d'Euclide</a>.

L’algorithme d’Euclide est une méthode ancienne et très efficace pour calculer le plus grand commun diviseur (PGCD) de deux entiers. Le principe repose sur l’observation suivante : le PGCD de deux nombres \( a \) et \( b \) (avec \( a \geq b \)) est le même que le PGCD de \( b \) et du reste de la division de \( a \) par \( b \), soit \( a \bmod b \). On répète ce processus jusqu’à ce que le reste soit nul ; à ce moment, le PGCD est le dernier diviseur non nul. Cette approche permet de réduire rapidement la taille des nombres à chaque étape, ce qui rend l’algorithme très performant, même pour de grands entiers.

En Java, l’algorithme d’Euclide s’exprime naturellement de façon récursive : si le second nombre (\( q \)) est nul, on retourne le premier (\( p \)) ; sinon, on rappelle la fonction avec les arguments \( (q, p \bmod q) \). Cette simplicité et cette efficacité expliquent pourquoi l’algorithme d’Euclide est encore largement utilisé aujourd’hui, aussi bien dans les calculs mathématiques que dans des applications pratiques comme la cryptographie ou la simplification de fractions.


{{<inlineJava path="ExempleRecursivite.java" lang="java">}}
public class ExempleRecursivite {
    public static void main(String[] args) {
        System.out.println("Plus grand diviseur commun :" 
          + plusGrandCommunDiviseur(455,322) );
    }

    public static int plusGrandCommunDiviseur(int p, int q) {
        if (q == 0) {
            return p;            
        } else {         
            return plusGrandCommunDiviseur(q, p % q);
        }
    }
}
{{</inlineJava>}}


Une application intéressante de la récursivité est l'[algorithme de Heap](https://fr.wikipedia.org/wiki/Algorithme_de_Heap). Cet algorithme
peut générer toutes les permutations possibles d'une liste de départ. 

{{<inlineJava path="HeapPermutationLettres.java" lang="java">}}
import java.util.Arrays;

public class HeapPermutationLettres {

    public static void genererPermutations(char[] tableau) {
        generer(tableau, tableau.length);
    }

    private static void generer(char[] a, int n) {
        if (n == 1) {
            System.out.println(new String(a));
            return;
        }

        for (int i = 0; i < n; i++) {
            generer(a, n - 1);

            if (n % 2 == 0) {
                echanger(a, i, n - 1);
            } else {
                echanger(a, 0, n - 1);
            }
        }
    }

    private static void echanger(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        char[] lettres = {'A', 'B', 'C', 'D'};
        genererPermutations(lettres);
    }
}
{{</inlineJava>}}


Il est aussi possible de faire une version itérative de l'algorithme de Heap, mais celle-ci est
un peu moins élégante.

{{<inlineJava path="HeapPermutationIterative.java" lang="java">}}

import java.util.Arrays;

public class HeapPermutationIterative {

    public static void permuterIteratif(int[] a) {
        int n = a.length;

        // Tableau de contrôle c[] initialisé à 0 partout
        int[] c = new int[n];

        // Afficher la première permutation (l'originale)
        System.out.println(Arrays.toString(a));

        int i = 0;  // indice de contrôle
        while (i < n) {
            if (c[i] < i) {
                // Échange selon la parité de i
                if (i % 2 == 0) {
                    echanger(a, 0, i);
                } else {
                    echanger(a, c[i], i);
                }

                // Afficher la nouvelle permutation
                System.out.println(Arrays.toString(a));

                // Incrémenter le compteur à la position i
                c[i] += 1;

                // Remettre i à 0 pour repartir du début
                i = 0;
            } else {
                // Réinitialiser c[i] et passer à l’indice suivant
                c[i] = 0;
                i += 1;
            }
        }
    }

    private static void echanger(int[] tab, int x, int y) {
        int temp = tab[x];
        tab[x] = tab[y];
        tab[y] = temp;
    }

    // Test
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4};
        System.out.println("Permutations de " + Arrays.toString(tableau) + " :\n");
        permuterIteratif(tableau);
    }
}
{{</inlineJava>}}


## Lecture optionnelle dans le livre de référence (Delannoy)

<p>Pour aller plus en profondeur sur la récursivité (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 6:</p>
<ul>
	<li>Section 10 : La récursivité des méthodes</li>
</ul>

## Vidéos suggérées

{{< youtube id="o0sfEUuqy40" >}}

{{< youtube id="dfLPh1oWJNg" >}}

