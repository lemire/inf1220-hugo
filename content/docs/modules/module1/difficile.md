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


{{< youtube id="yqH11OHfN2U" >}}


Dans le cadre de ce cours, vous ne serez pas confronté à des problèmes aussi complexes que le voyageur de commerce. Les exercices proposés viseront à renforcer votre compréhension des bases algorithmiques, comme les boucles, les conditions et la manipulation de données simples. Cependant, il est utile de connaître l’existence de ces problèmes difficiles pour apprécier la profondeur de l’informatique. Ils illustrent l’importance de l’efficacité algorithmique et des compromis dans la conception de solutions. En explorant des cas plus simples, vous poserez les fondations nécessaires pour, un jour, peut-être, relever ces défis plus ardus.
