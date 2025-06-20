---
title: "Recommandations"
weight: 9
---
# Recommandations

Pour aborder un problème algorithmique, adoptez une démarche structurée. Analysez d’abord le problème en le décomposant en étapes simples. Avant de coder, rédigez un pseudo-code ou un plan pour clarifier la logique. Cette préparation limite les erreurs et facilite la maintenance.

Privilégiez un code lisible avec des noms de variables explicites. Testez chaque étape avec des cas simples avant d’explorer des scénarios complexes. Cette validation progressive permet de repérer rapidement les anomalies et de garantir la robustesse de la solution.

Il faut toujours tester son code. 

## Illustration : importance des tests

Voici comment on peut illustrer l’importance des tests en Java avec une fonction de recherche binaire dans un tableau trié. Si on veut créer une fonction de recherche binaire, nous pouvons
commencer par écrire une fonction de test.



```java {style=github}
// Fonction de test
public static void tester() {
    int[] tab = {1, 3, 5, 7, 9, 11};
    System.out.println(rechercheBinaire(tab, 7));  // Doit afficher 3
    System.out.println(rechercheBinaire(tab, 1));  // Doit afficher 0
    System.out.println(rechercheBinaire(tab, 11)); // Doit afficher 5
    System.out.println(rechercheBinaire(tab, 4));  // Doit afficher -1
}
```


La fonction de test `tester()` permet de vérifier rapidement si la recherche binaire fonctionne comme prévu. En pratique, les programmeurs écrivent des tests plus détaillés et ils utilisent
des librairies logicielles dédiées. Néanmoins, l'idée générale demeure la même.

La première version contient un bogue classique (`gauche < droite` au lieu de `gauche <= droite`), ce qui fait échouer certains cas.

{{<inlineJava path="TestRechercheBinaire.java" lang="java" >}}
public class TestRechercheBinaire {
    // Version boguée de la recherche binaire
    public static int rechercheBinaire(int[] tab, int valeur) {
        int gauche = 0;
        int droite = tab.length - 1;
        while (gauche < droite) { // Erreur : devrait être <=
            int milieu = (gauche + droite) / 2;
            if (tab[milieu] == valeur) {
                return milieu;
            } else if (tab[milieu] < valeur) {
                gauche = milieu + 1;
            } else {
                droite = milieu - 1;
            }
        }
        return -1;
    }

    // Fonction de test
    public static void tester() {
        int[] tab = {1, 3, 5, 7, 9, 11};
        System.out.println(rechercheBinaire(tab, 7));  // Doit afficher 3
        System.out.println(rechercheBinaire(tab, 1));  // Doit afficher 0
        System.out.println(rechercheBinaire(tab, 11)); // Doit afficher 5
        System.out.println(rechercheBinaire(tab, 4));  // Doit afficher -1
    }

    public static void main(String[] args) {
        System.out.println("Tests avec version boguée :");
        tester();
    }

}
{{</inlineJava>}}

Après avoir constaté l’erreur grâce aux tests, on corrige la fonction et on vérifie que tous les cas passent. Cette démarche montre l’importance de toujours tester son code, même pour des algorithmes classiques.


{{<inlineJava path="TestRechercheBinaire.java" lang="java" >}}
public class TestRechercheBinaire {
    // Version corrigée
    public static int rechercheBinaire(int[] tab, int valeur) {
        int gauche = 0;
        int droite = tab.length - 1;
        while (gauche <= droite) { // Correction ici
            int milieu = (gauche + droite) / 2;
            if (tab[milieu] == valeur) {
                return milieu;
            } else if (tab[milieu] < valeur) {
                gauche = milieu + 1;
            } else {
                droite = milieu - 1;
            }
        }
        return -1;
    }
    // Fonction de test
    public static void tester() {
        int[] tab = {1, 3, 5, 7, 9, 11};
        System.out.println(rechercheBinaire(tab, 7));  // Doit afficher 3
        System.out.println(rechercheBinaire(tab, 1));  // Doit afficher 0
        System.out.println(rechercheBinaire(tab, 11)); // Doit afficher 5
        System.out.println(rechercheBinaire(tab, 4));  // Doit afficher -1
    }

    public static void main(String[] args) {
        System.out.println("Tests avec version boguée :");
        tester();
    }

}
{{</inlineJava>}}



## Illustration : plus long sous-tableau à somme divisible par  \( k \)

Considérons le problème suivant : trouver la longueur du plus long sous-tableau contigu dans un tableau d’entiers dont la somme est divisible par \( k \). Par exemple, pour le tableau \([4, 5, 0, -2, -3, 1]\) et \( k = 5 \), le sous-tableau \([5, 0, -2, -3]\) a une somme de \( 0 \), divisible par \( 5 \), et sa longueur est \( 4 \).

### Comprendre le problème

Avant de se lancer dans la programmation, il est essentiel de bien comprendre ce que l’on cherche à résoudre. Ici, le problème porte sur les sous-tableaux : il s’agit de séquences continues d’éléments dans un tableau. On veut trouver, parmi tous ces sous-tableaux, celui qui a la plus grande longueur et dont la somme des éléments est un multiple de \( k \).

Il est utile de se poser les questions suivantes :
- Qu’est-ce qu’un sous-tableau ? C’est une portion du tableau, prise sans sauter d’éléments (par exemple, les éléments d’indice 2 à 5).
- Que signifie « somme divisible par \( k \) » ? Cela veut dire que si on additionne tous les éléments du sous-tableau, le résultat est un multiple de \( k \) (par exemple, 15 est divisible par 5).
- Que veut dire « longueur maximale » ? On cherche le sous-tableau le plus long possible qui respecte la condition.

Il est important de bien lire l’énoncé, de reformuler le problème avec ses propres mots, et de donner un ou deux exemples concrets pour vérifier sa compréhension. Par exemple : « Si j’ai le tableau [4, 5, 0, -2, -3, 1] et \( k = 5 \), alors le sous-tableau [5, 0, -2, -3] a une somme de 0, qui est bien divisible par 5, et il contient 4 éléments. »

### Décomposer le problème

Décomposer un problème, c’est le diviser en étapes simples et logiques. Cela signifie :
- Identifier les opérations de base à effectuer (par exemple, additionner des éléments, vérifier si un nombre est divisible par \( k \), parcourir un tableau).
- Écrire ces étapes sous forme de liste ou de pseudo-code, sans se soucier tout de suite du langage de programmation.

Pour ce problème, une décomposition possible serait :
1. Parcourir toutes les positions de début possibles pour un sous-tableau.
2. Pour chaque position de début, parcourir toutes les positions de fin possibles.
3. Calculer la somme des éléments entre ces deux positions.
4. Vérifier si cette somme est divisible par \( k \).
5. Si oui, comparer la longueur de ce sous-tableau à la longueur maximale trouvée jusqu’ici, et mettre à jour si nécessaire.

Cette démarche permet de clarifier la logique avant de coder, d’éviter de se perdre dans les détails, et de s’assurer que chaque étape est comprise. Plus tard, on pourra chercher à optimiser la solution, mais il est important de commencer par une version simple et correcte.

### Solution naïve

La solution naïve consiste à tester toutes les possibilités, sans chercher à optimiser. Pour ce problème, cela veut dire : on va examiner tous les sous-tableaux possibles du tableau, un par un, et vérifier pour chacun si la somme de ses éléments est divisible par \( k \).

Concrètement, on utilise deux boucles : la première choisit le point de départ du sous-tableau, la seconde choisit le point d’arrivée. Pour chaque sous-tableau ainsi défini, on additionne ses éléments, puis on regarde si le résultat est un multiple de \( k \). Si c’est le cas, on regarde si ce sous-tableau est plus long que ceux trouvés précédemment, et on garde la plus grande longueur trouvée.

Cette méthode est facile à comprendre et à programmer, car elle suit directement l’énoncé : « regarder tous les cas possibles ». Mais elle est lente si le tableau est grand, car le nombre de sous-tableaux à tester augmente très vite (c’est ce qu’on appelle une complexité quadratique, ou \( O(n^2) \)).

Il est important de commencer par cette approche, car elle permet de bien comprendre la logique du problème avant de chercher à l’optimiser.

```java  {style=github}
public class SousTableauDivisibleNaif {
    public static int plusLongSousTableauDivisible(int[] tableau, int k) {
        int longueurMax = 0;
        for (int i = 0; i < tableau.length; i++) {
            int somme = 0;
            for (int j = i; j < tableau.length; j++) {
                somme += tableau[j];
                if (somme % k == 0) {
                    longueurMax = Math.max(longueurMax, j - i + 1);
                }
            }
        }
        return longueurMax;
    }

    public static void main(String[] args) {
        int[] test1 = {4, 5, 0, -2, -3, 1};
        assert plusLongSousTableauDivisible(test1, 5) == 4 : "Test 1 échoué";
        int[] test2 = {};
        assert plusLongSousTableauDivisible(test2, 3) == 0 : "Test 2 échoué";
        int[] test3 = {1, 2, 3};
        assert plusLongSousTableauDivisible(test3, 5) == 0 : "Test 3 échoué";
        System.out.println("Tests naïfs réussis");
    }
}
```

### Solution optimisée avec sommes préfixes

La solution optimisée repose sur une idée mathématique puissante : les sommes préfixes. Plutôt que de recalculer la somme de chaque sous-tableau à chaque fois (comme dans la solution naïve), on va mémoriser la somme des éléments depuis le début du tableau jusqu’à chaque position. Cela permet de calculer rapidement la somme de n’importe quel sous-tableau en faisant une simple soustraction.

Mais l’astuce la plus importante ici, c’est d’utiliser le fait que deux sommes préfixes qui ont le même reste lorsqu’on les divise par \( k \) indiquent qu’il existe un sous-tableau entre ces deux positions dont la somme est divisible par \( k \). Pourquoi ? Parce que si \( S_j \mod k = S_{i-1} \mod k \), alors la différence \( S_j - S_{i-1} \) est un multiple de \( k \).

Pour exploiter cela, on parcourt le tableau une seule fois :
- À chaque étape, on calcule la somme courante des éléments (somme préfixe).
- On calcule le reste de cette somme modulo \( k \) (en gérant les cas négatifs pour que le reste soit toujours positif).
- On utilise une table de hachage (HashMap) pour mémoriser le premier indice où chaque reste a été vu.
- Si on retrouve le même reste plus tard, cela veut dire qu’il existe un sous-tableau entre ces deux indices dont la somme est divisible par \( k \). On calcule alors la longueur de ce sous-tableau et on garde la plus grande longueur trouvée.

Cette méthode est très efficace : elle ne nécessite qu’un seul parcours du tableau (complexité linéaire \( O(n) \)), ce qui la rend adaptée même pour de très grands tableaux. C’est un exemple classique d’optimisation en algorithmique : on passe d’une solution simple mais lente à une solution plus subtile, mais beaucoup plus rapide, en utilisant des propriétés mathématiques et des structures de données adaptées.

```java {style=github}
import java.util.HashMap;
import java.util.Map;

public class SousTableauDivisibleOptimise {
    public static int plusLongSousTableauDivisible(int[] tableau, int k) {
        Map<Long, Integer> restes = new HashMap<>();
        restes.put(0L, -1); // Cas où le sous-tableau commence à l’indice 0
        long somme = 0;
        int longueurMax = 0;

        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
            long reste = ((somme % k) + k) % k; // Gérer les restes négatifs
            if (restes.containsKey(reste)) {
                longueurMax = Math.max(longueurMax, i - restes.get(reste));
            }
            restes.putIfAbsent(reste, i); // Stocker le premier indice du reste
        }
        return longueurMax;
    }

    public static void main(String[] args) {
        int[] test1 = {4, 5, 0, -2, -3, 1};
        assert plusLongSousTableauDivisible(test1, 5) == 4 : "Test 1 échoué";
        int[] test2 = {};
        assert plusLongSousTableauDivisible(test2, 3) == 0 : "Test 2 échoué";
        int[] test3 = {1, 2, 3};
        assert plusLongSousTableauDivisible(test3, 5) == 0 : "Test 3 échoué";
        int[] test4 = {-1, 2, -1};
        assert plusLongSousTableauDivisible(test4, 2) == 2 : "Test 4 échoué";
        int[] test5 = {3, 3, 3};
        assert plusLongSousTableauDivisible(test5, 3) == 3 : "Test 5 échoué";
        System.out.println("Tests optimisés réussis");
    }
}
```

### Améliorations et cas particuliers

La solution optimisée gère les restes négatifs et utilise des clés de type `Long` pour éviter les débordements avec de grandes sommes. Les tests incluent des cas variés : tableau vide, absence de sous-tableau valide, nombres négatifs et sous-tableaux entiers divisibles par \( k \). 

Cette approche illustre l’importance de passer d’une solution naïve à une solution optimisée en exploitant des propriétés mathématiques, tout en validant chaque étape avec des tests rigoureux.
