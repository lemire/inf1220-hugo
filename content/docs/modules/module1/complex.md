---
title: "Complexité algorithmique"
weight: 9
---


# Complexité algorithmique

La plupart des problèmes ne sont pas fondamentalement difficiles, mais toutes les solutions
ne sont pas également efficaces. La complexité algorithmique fournit une mesure de cette efficacité.

La complexité algorithmique mesure le temps ou la mémoire qu’un algorithme nécessite en fonction de la taille de l’entrée (souvent notée \( n \)). Pour comparer les algorithmes, on utilise la notation grand-O (ou O-grande), qui donne un ordre de grandeur du nombre d’opérations à effectuer lorsque la taille des données augmente.

Comprendre la complexité algorithmique permet de choisir ou d’inventer des solutions efficaces, surtout pour de grandes quantités de données. Il est souvent utile de commencer par une solution simple (même lente), puis de chercher à l’optimiser en utilisant des structures de données ou des propriétés mathématiques adaptées.

### Notation grand-O

La notation \( O(f(n)) \) signifie que, pour des entrées de taille \( n \), l’algorithme effectue au plus un nombre d’opérations proportionnel à \( f(n) \) (à une constante près). On ne s’intéresse qu’au comportement pour de grandes valeurs de \( n \), et on ignore les détails d’implémentation ou les constantes cachées.

On considère souvent que l'accès à un élément d'un tableau par son index a une complexité \( O(1) \) puisqu'il s'agit d'une seul opération. Les operations arithmétique (+, -, etc.) ont 
aussi une complexité  \( O(1) \).

### Exemples d’algorithmes en \( O(n) \)

Un algorithme est en \( O(n) \) si le nombre d’opérations croît linéairement avec la taille de l’entrée. Par exemple, parcourir un tableau pour calculer la somme de ses éléments :

```pseudo
somme = 0
POUR i de 0 à n-1
    somme = somme + tableau[i]
FIN POUR
```

Ici, chaque élément est visité une seule fois, donc le temps d’exécution est proportionnel à \( n \).

### Exemples d’algorithmes en \( O(n^2) \)

Un algorithme est en \( O(n^2) \) si le nombre d’opérations croît comme le carré de la taille de l’entrée. C’est typique des algorithmes qui utilisent deux boucles imbriquées, comme la recherche de toutes les paires d’éléments dans un tableau :

```pseudo
POUR i de 0 à n-1
    POUR j de 0 à n-1
        faire quelque chose avec tableau[i] et tableau[j]
    FIN POUR
FIN POUR
```

Ici, pour chaque valeur de \( i \), on parcourt toutes les valeurs de \( j \), ce qui donne \( n \times n = n^2 \) opérations.

Un algorithme \( O(n^2) \) est plus *lent* qu'un algorithme \( O(n) \)  quand \( n \) est très grand.


### Recherche dans un tableau trié

Lorsqu’un tableau est trié, on peut utiliser la recherche dichotomique (ou recherche binaire) pour trouver rapidement un élément. Cette méthode consiste à comparer la valeur recherchée à l’élément du milieu du tableau : si la valeur est plus petite, on recommence la recherche dans la moitié gauche ; sinon, dans la moitié droite. On répète jusqu’à trouver l’élément ou à épuiser le tableau.

Voici un exemple de pseudocode pour la recherche binaire :

```pseudo
DEBUT
    debut ← 0
    fin ← n - 1
    TANT QUE debut ≤ fin
        milieu ← (debut + fin) // 2
        SI tableau[milieu] == valeur
            retourner VRAI
        SINON SI tableau[milieu] < valeur
            debut ← milieu + 1
        SINON
            fin ← milieu - 1
        FIN SI
    FIN TANT QUE
    retourner FAUX
FIN
```

Cet algorithme a une complexité en \( O(\log n) \), ce qui le rend très efficace pour les grands tableaux triés. 

Cela signifie que le nombre d’opérations nécessaires pour trouver (ou ne pas trouver) un élément ne croît pas proportionnellement à la taille du tableau, mais beaucoup plus lentement. Par exemple, pour un tableau de 1 000 000 d’éléments, la recherche binaire nécessite au maximum environ 20 comparaisons (car \( \log_2 1\,000\,000 \approx 20 \)), alors qu’une recherche linéaire pourrait en demander jusqu’à 1 000 000 dans le pire cas. Plus le tableau est grand, plus l’avantage de la recherche binaire est important.

À chaque étape de la recherche binaire, on divise le nombre d’éléments restants par deux. Si on commence avec \( n \) éléments, après une comparaison il en reste \( n/2 \), puis \( n/4 \), puis \( n/8 \), etc. On répète ce processus jusqu’à ce qu’il ne reste qu’un seul élément à examiner.

On cherche donc le nombre d’étapes \( k \) tel que :
\[
\frac{n}{2^k} = 1
\]
En résolvant pour \( k \) :
\[
n = 2^k \implies k = \log_2 n
\]

Ainsi, le nombre maximal de comparaisons est proportionnel à \( \log_2 n \). C’est pourquoi on dit que la recherche binaire a une complexité en \( O(\log n) \).

### Tri

Le tri consiste à réorganiser les éléments d’un tableau ou d’une liste selon un ordre donné (par exemple, croissant). Un algorithme de tri naïf, comme le tri à bulles (bubble sort) ou le tri par insertion, compare chaque élément à tous les autres et échange leur position si nécessaire. Ces algorithmes effectuent environ \( n^2 \) comparaisons pour un tableau de taille \( n \), ce qui leur donne une complexité en \( O(n^2) \). Cela devient très lent dès que le nombre d’éléments augmente.


Pseudocode du tri à bulle:

```
POUR i de 0 à n-2
    POUR j de 0 à n-2-i
        SI tableau[j] > tableau[j+1] ALORS
            échanger tableau[j] et tableau[j+1]
        FIN SI
    FIN POUR
FIN POUR
```

Heureusement, il existe des algorithmes de tri plus efficaces. Par exemple, le tri fusion (merge sort) utilise une approche « diviser pour régner » : il divise le tableau en deux moitiés, trie chaque moitié récursivement, puis fusionne les deux moitiés triées en un seul tableau trié. Cette méthode réduit considérablement le nombre de comparaisons nécessaires et atteint une complexité en \( O(n \log n) \).

**Idée générale du merge sort :**
1. Si le tableau contient 0 ou 1 élément, il est déjà trié.
2. Sinon, on divise le tableau en deux parties de taille à peu près égale.
3. On trie récursivement chaque partie.
4. On fusionne les deux parties triées pour obtenir un tableau final trié.

Pseudocode du tri fusion:

```
FONCTION triFusion(tableau)
    SI taille(tableau) ≤ 1 ALORS
        retourner tableau
    FIN SI
    milieu ← taille(tableau) // 2
    gauche ← triFusion(tableau[0 .. milieu-1])
    droite ← triFusion(tableau[milieu .. fin])
    retourner fusionner(gauche, droite)
FIN FONCTION

FONCTION fusionner(gauche, droite)
    résultat ← tableau vide
    TANT QUE gauche et droite ne sont pas vides
        SI gauche[0] ≤ droite[0] ALORS
            ajouter gauche[0] à résultat
            retirer gauche[0] de gauche
        SINON
            ajouter droite[0] à résultat
            retirer droite[0] de droite
        FIN SI
    FIN TANT QUE
    ajouter le reste de gauche (s’il en reste) à résultat
    ajouter le reste de droite (s’il en reste) à résultat
    retourner résultat
FIN FONCTION
```

Le tri fusion est donc beaucoup plus rapide que les tris naïfs pour les grands tableaux, et il illustre l’intérêt des algorithmes efficaces en informatique.

### Table de hachage

Une table de hachage (ou « hash table ») est une structure de données qui permet d’associer des clés à des valeurs et d’accéder très rapidement à une valeur à partir de sa clé. Le principe repose sur l’utilisation d’une fonction de hachage qui transforme la clé (par exemple, un texte ou un nombre) en un indice de tableau. Les opérations d’insertion, de recherche et de suppression se font en temps moyen \( O(1) \), c’est-à-dire en temps constant, quelle que soit la taille de la table (si la fonction de hachage est bonne et la table bien dimensionnée). La table de hachage est efficace pour retrouver rapidement une information à partir d’une clé.

**Idée générale :**
1. On applique une fonction de hachage à la clé pour obtenir un indice.
2. On stocke la valeur à cet indice dans un tableau.
3. En cas de « collision » (deux clés différentes qui donnent le même indice), on utilise une technique de résolution (chaînage, sondage linéaire, etc.).

Pseudocode d'une recherche dans une table de hachage (sans collision):

```pseudo
FONCTION rechercher(table, clé)
    indice ← hachage(clé)
    SI table[indice] == clé ALORS
        retourner VRAI
    SINON
        retourner FAUX
    FIN SI
FIN FONCTION
```

Pour mieux comprendre, testez l'application suivante. Saisissez des chaînes de caractères qui seront ajoutées à la table de hachage. Pouvez-vous créer une collision ?


{{< webapp path="hash.html" >}}

En Java, la classe `HashMap` que nous verrons plus loin dans le cours implémente une table de hachage. Par exemple :

```java {style=github}
import java.util.HashMap;

HashMap<String, Integer> dico = new HashMap<>();
dico.put("chat", 1);
dico.put("chien", 2);
System.out.println(dico.get("chat")); // Affiche 1
```

Les tables de hachage sont omniprésentes en informatique car elles rendent possible la recherche rapide dans de grands ensembles de données.

Imaginons que l’on souhaite stocker un ensemble de chaînes de caractères de différentes longueurs, par exemple « chat », « chien », « girafe », « lion ». Pour retrouver rapidement une chaîne, on peut utiliser une table de hachage où la fonction de hachage choisie est simplement la longueur de la chaîne. Ainsi, « chat » (4 lettres) sera stocké à l’indice 4, « chien » (5 lettres) à l’indice 5, « girafe » (6 lettres) à l’indice 6, et ainsi de suite. Pour rechercher une chaîne, il suffit de calculer sa longueur et d’aller directement à l’indice correspondant dans le tableau. Cette opération ne dépend pas du nombre total de chaînes stockées, ce qui explique pourquoi la recherche est dite « en temps constant » : on ne parcourt pas toute la table, on accède directement à la bonne case.

Cependant, ce choix de fonction de hachage est très simple et peut provoquer des « collisions » : deux chaînes de même longueur, comme « lion » et « chat », auraient le même indice. Dans ce cas, il faut une méthode pour gérer ces collisions, par exemple en stockant les deux chaînes dans une liste à cet indice. En pratique, les tables de hachage utilisent des fonctions de hachage beaucoup plus sophistiquées, capables de transformer n’importe quelle clé (texte, nombre, etc.) en un indice réparti de façon plus uniforme dans le tableau. L’objectif reste toujours de minimiser les collisions, car tant qu’il y en a peu, la recherche, l’insertion et la suppression restent très rapides et efficaces, même avec de très grands ensembles de données.

### Un problème résoluble en \( O(n^2) \) ou en \( O(n) \)

Prenons le problème suivant : « Trouver s’il existe deux éléments dans un tableau qui, additionnés, donnent une valeur cible. »

**Solution naïve (\( O(n^2) \)) :**

```pseudo
POUR i de 0 à n-1
    POUR j de i+1 à n-1
        SI tableau[i] + tableau[j] == cible
            retourner VRAI
        FIN SI
    FIN POUR
FIN POUR
retourner FAUX
```

Ici, on teste toutes les paires possibles, ce qui prend un temps quadratique.

**Solution optimisée (\( O(n) \)) :**

On peut résoudre ce problème en temps linéaire en utilisant une structure de données comme un ensemble (set) :

```pseudo
initialiser un ensemble vide
POUR chaque élément x du tableau
    SI (cible - x) est dans l’ensemble
        retourner VRAI
    AJOUTER x à l’ensemble
FIN POUR
retourner FAUX
```

Ici, chaque élément est traité une seule fois, et si la recherche dans l’ensemble se fait en temps constant (en moyenne) ou \( O(1) \), la solution est en \( O(n) \).
Dans la solution optimisée, la vérification « (cible - x) est dans l’ensemble » est cruciale.
Il n'est pas garanti que la recherche se fasse en temps \( O(1) \), mais c'est possible avec
une table de hachage.


{{< youtube id="ifvpTzpA59s" >}}

