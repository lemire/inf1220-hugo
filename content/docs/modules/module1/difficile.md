---
title: "Les problèmes difficiles"
weight: 8
---


# Les problèmes difficiles

Dans un cours d’introduction à la programmation, la plupart des exercices se concentrent sur des problèmes dont les algorithmes sont relativement simples à concevoir, surtout si vous maîtrisez les bases de la programmation et des mathématiques. Ces problèmes, comme calculer une moyenne ou trier une liste, demandent souvent une compréhension des structures de contrôle (conditions et boucles) et une application directe de concepts logiques. Cependant, dans des contextes plus avancés, certains problèmes se révèlent bien plus complexes, non pas à cause de la programmation elle-même, mais en raison de la difficulté à trouver un algorithme efficace. Ces défis, qualifiés de « problèmes difficiles », nécessitent des approches créatives et parfois des compromis, car leurs solutions idéales peuvent être hors de portée avec les ressources informatiques actuelles.

Les problèmes difficiles se rencontrent fréquemment dans des domaines comme l’intelligence artificielle, l’optimisation ou la cryptographie. Par exemple, développer une intelligence artificielle capable de rivaliser avec un grand maître aux échecs exige non seulement de programmer des règles du jeu, mais aussi de concevoir un algorithme capable d’évaluer des millions de positions possibles en un temps raisonnable. Ce type de problème est complexe, car il combine une exploration stratégique (choisir les meilleurs coups) avec des contraintes de performance (limiter le temps de calcul). De même, des problèmes d’optimisation, comme déterminer le chemin le plus court pour un livreur effectuant plusieurs arrêts, peuvent sembler simples en théorie, mais deviennent rapidement ingérables à mesure que le nombre de destinations augmente, en raison du nombre exponentiel de combinaisons possibles.

Un exemple classique de problème difficile est le problème du voyageur de commerce (TSP, pour Traveling Salesman Problem). Ce problème consiste à trouver le chemin le plus court permettant à un voyageur de visiter une liste de villes exactement une fois avant de revenir à son point de départ. Pour un petit nombre de villes, il est possible d’énumérer toutes les permutations et de calculer la distance totale de chaque trajet. Cependant, avec seulement 20 villes, le nombre de trajets possibles dépasse les milliards, rendant une approche par force brute (tester toutes les combinaisons) impraticable, même sur des ordinateurs puissants. Ce problème est dit « NP-difficile », un terme technique que les informaticiens utilisent pour désigner un problème qu'il est difficile de résoudre rapidement en général. 

Pour aborder le problème du voyageur de commerce, des algorithmes approchés, comme l’algorithme du plus proche voisin, sont souvent utilisés. Cet algorithme commence par une ville arbitraire, puis choisit à chaque étape la ville la plus proche non visitée, jusqu’à ce que toutes les villes soient incluses, avant de revenir à la ville de départ. Bien que cette méthode ne garantisse pas toujours le chemin le plus court, elle produit une solution acceptable dans un temps de calcul bien plus court que l’énumération complète. Voici un pseudocode pour cet algorithme&nbsp;:

```
Entrées :
  Liste de villes : villes[n]
  Matrice des distances : distances[n][n]

Sorties :
  Liste ordonnée des villes : trajet

Initialiser trajet comme une liste vide
Choisir une ville de départ (par exemple, villes[0]) et l’ajouter à trajet
Marquer la ville de départ comme visitée
TANT QUE toutes les villes ne sont pas visitées FAIRE
    Trouver la ville non visitée la plus proche de la dernière ville dans trajet
    Ajouter cette ville à trajet
    Marquer cette ville comme visitée
FIN TANT QUE
Ajouter la ville de départ à la fin de trajet pour boucler
RETOURNER trajet
```

Considérons une table (fictive) des distances entre certains villes du Québec.

| Ville      | Montréal | Québec | Laval | Gatineau | Longueuil |
|------------|----------|--------|-------|----------|-----------|
| Montréal   | -        | 250    | 20    | 200      | 15        |
| Québec     | 250      | -      | 240   | 450      | 245       |
| Laval      | 20       | 240    | -     | 210      | 30        |
| Gatineau   | 200      | 450    | 210   | -        | 210       |
| Longueuil  | 15       | 245    | 30    | 210      | -         |


Vous pouvez vérifier que le trajet suivant représente 910 km.

Montréal -> Gatineau -> Laval -> Québec -> Longueuil -> Montréal

Maintenant, exécutez l'algorithme du plus proche voisin avec l'application suivante&nbsp;:

{{< webapp path="tsp.html" >}}

Pouvez-vous obtenir une distance aussi courte que 910&nbsp;km&nbsp;;? Comment pourriez-vous modifier
le pseudocode pour obtenir toujours la distance la plus courte&nbsp;? C'est une question difficile.

Dans le cadre de ce cours, vous ne serez pas confronté à des problèmes aussi complexes que le voyageur de commerce. Les exercices proposés viseront à renforcer votre compréhension des bases algorithmiques, comme les boucles, les conditions et la manipulation de données simples. Cependant, il est utile de connaître l’existence de ces problèmes difficiles pour apprécier la profondeur de l’informatique. Ils illustrent l’importance de l’efficacité algorithmique et des compromis dans la conception de solutions. En explorant des cas plus simples, vous poserez les fondations nécessaires pour, un jour, peut-être, relever ces défis plus ardus.

## Complexité algorithmique

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
Il n'est pas garanti que la recherche se fasse en temps \( O(1) \).

