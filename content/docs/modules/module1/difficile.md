---
title: "Les problèmes difficiles"
weight: 8
---


# Les problèmes difficiles

Dans un cours d’introduction à la programmation, la plupart des exercices se concentrent sur des problèmes dont les algorithmes sont relativement simples à concevoir, surtout si vous maîtrisez les bases de la programmation et des mathématiques. Ces problèmes, comme calculer une moyenne ou trier une liste, demandent souvent une compréhension des structures de contrôle (conditions et boucles) et une application directe de concepts logiques. Cependant, dans des contextes plus avancés, certains problèmes se révèlent bien plus complexes, non pas à cause de la programmation elle-même, mais en raison de la difficulté à trouver un algorithme efficace. Ces défis, qualifiés de «&nbsp;problèmes difficiles&nbsp;», nécessitent des approches créatives et parfois des compromis, car leurs solutions idéales peuvent être hors de portée avec les ressources informatiques actuelles.

Les problèmes difficiles se rencontrent fréquemment dans des domaines comme l’intelligence artificielle, l’optimisation ou la cryptographie. Par exemple, développer une intelligence artificielle capable de rivaliser avec un grand maître aux échecs exige non seulement de programmer des règles du jeu, mais aussi de concevoir un algorithme capable d’évaluer des millions de positions possibles en un temps raisonnable. Ce type de problème est complexe, car il combine une exploration stratégique (choisir les meilleurs coups) avec des contraintes de performance (limiter le temps de calcul). De même, des problèmes d’optimisation, comme déterminer le chemin le plus court pour un livreur effectuant plusieurs arrêts, peuvent sembler simples en théorie, mais deviennent rapidement ingérables à mesure que le nombre de destinations augmente, en raison du nombre exponentiel de combinaisons possibles.

Un exemple classique de problème difficile est le problème du voyageur de commerce (TSP, pour Traveling Salesman Problem). Ce problème consiste à trouver le chemin le plus court permettant à un voyageur de visiter une liste de villes exactement une fois avant de revenir à son point de départ. Pour un petit nombre de villes, il est possible d’énumérer toutes les permutations et de calculer la distance totale de chaque trajet. Cependant, avec seulement 20 villes, le nombre de trajets possibles dépasse les milliards, rendant une approche par force brute (tester toutes les combinaisons) impraticable, même sur des ordinateurs puissants. Ce problème est dit «&nbsp;NP-difficile&nbsp;», un terme technique que les informaticiens utilisent pour désigner un problème qu'il est difficile de résoudre rapidement en général. 

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

Ce pseudocode décrit une solution gloutonne au problème du voyageur de commerce (TSP), qui cherche un circuit visitant chaque ville d’une liste exactement une fois et revenant à la ville de départ, en minimisant la distance totale. Les entrées sont une liste de n villes (`villes[n]`) et une matrice `distances[n][n]` indiquant les distances entre chaque paire de villes. Une liste trajet est initialisée vide pour stocker l’ordre des villes. L’algorithme commence par choisir une ville de départ (par exemple, `villes[0]`), l’ajoute à trajet, et la marque comme visitée. Une boucle (TANT QUE toutes les villes ne sont pas visitées FAIRE) sélectionne à chaque étape la ville non visitée la plus proche de la dernière ville ajoutée à trajet, en consultant la matrice distances. Cette ville est ajoutée à trajet et marquée comme visitée. Une fois toutes les villes visitées, la ville de départ est ajoutée à la fin de trajet pour former un circuit fermé. La liste trajet est retournée comme résultat.

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


Cet exemple d'algorithme est un algorithme glouton.
Un algorithme glouton est une méthode algorithmique qui résout un problème en faisant à chaque étape le choix localement optimal, dans l’espoir que ces choix mènent à une solution globale optimale. Il privilégie la simplicité et la rapidité, mais ne garantit pas toujours la meilleure solution pour tous les problèmes, car il ne revient jamais en arrière pour réévaluer les décisions prises. Ce type d’algorithme est souvent utilisé pour des problèmes d’optimisation où une solution approximative est acceptable ou lorsque le problème possède une structure particulière, comme la propriété de sous-structure optimale ou la propriété gloutonne.

Considérons d'autres exemples de l'approche gloutonne.

-  Suppose que nous disposions d’un sac à dos de capacité limitée et d’objets ayant chacun un poids et une valeur. L’objectif est de maximiser la valeur totale des objets dans le sac, en autorisant des fractions d’objets. L'approche gloutonne dans ce cas consiste à d'abord trier les objets par rapport décroissant de leur rapport valeur/poids. Ensuite, il faut remplir le sac en prenant autant que possible de chaque objet dans cet ordre jusqu’à atteindre la capacité.
- Suppose que nous disposions d’un ensemble d’activités avec des heures de début et de fin, et l’objectif est de sélectionner le plus grand nombre d’activités compatibles (qui ne se chevauchent pas). Une approche gloutonne consiste à trier les activités par heure de fin croissante. Sélectionner la première activité, puis la prochaine activité compatible, et ainsi de suite.

Les approches gloutonnes donnent généralement une solution qui n'est pas optimale.

Dans le cadre de ce cours, vous ne serez pas confronté à des problèmes aussi complexes que le voyageur de commerce. Les exercices proposés viseront à renforcer votre compréhension des bases algorithmiques, comme les boucles, les conditions et la manipulation de données simples. Cependant, il est utile de connaître l’existence de ces problèmes difficiles pour apprécier la profondeur de l’informatique. Ils illustrent l’importance de l’efficacité algorithmique et des compromis dans la conception de solutions. En explorant des cas plus simples, vous poserez les fondations nécessaires pour, un jour, peut-être, relever ces défis plus ardus.
