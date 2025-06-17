---
title: "Les algorithmes : conception et syntaxe"
weight: 6
---

# Les algorithmes : conception et syntaxe




## Concevoir un algorithme

Afin de concevoir un algorithme, il s'agit de bien analyser le problème en identifiant les entrées, les sorties et le traitement des données pour en arriver aux résultats escomptés. Il faut voir l'algorithme comme une solution pas à pas que n'importe quel programmeur pourrait reprendre et implémenter dans un langage spécifique tel que le Java, le C++ ou le Python. En général, pour concevoir un algorithme, il faut suivre les étapes suivantes :

Étape 1
- Lire et bien comprendre l’énoncé du problème à résoudre.
Étape 2
- Définir les résultats du problème, c'est-à-dire les sorties.
- Définir les données du problème, c'est-à-dire les entrées.
- Définir le traitement, c'est-à-dire les relations permettant d’obtenir les résultats à partir des données.
Étape 3
- Écrire l’algorithme en respectant la structure pseudo-code.

## Syntaxe d'un algorithme

Voici un aperçu des différents éléments pouvant être utilisés pour proposer une résolution à un problème sous la forme d'algorithme. Comme nous l'avions spécifié précédemment, il n'y a pas de normes strictes dans l'écriture d'un pseudo-code (en comparaison à un langage de programmation qui est stricte). L'essentiel est d'utiliser les structures présentées ci-bas, d'être concis et exact dans les instructions. S'il y a un doute sur la concision ou bien la compréhension d'une étape de l'algorithme, c'est peut-être que cette étape doit être subdivisée en plusieurs sous-étapes.

### Les Entrées, Variables et Sorties

Un algorithme commence par la déclaration des données en entrées, c'est à dire les données qui sont soit fournies d'emblée à l'algorithme (ex. un texte à déchiffrer, des données financières à analyser) ou bien fournies par un utilisateur (ex. via le clavier, souris, etc.).
Par la suite, il est nécessaire de déclarer les variables de travail de l'algorithme. Une variable a un nom et une valeur. Par exemple, la variable x peut avoir la valeur 1. La valeur d'une variable peut changer dans le temps. Ces variables sont utilisées essentiellement pour conserver des informations nécessaires au traitement effectué par l'algorithme. Les variables peuvent avoir plusieurs types... par exemple, une variable peut contenir des chaînes de caractères, d'autres variables peuvent ne contenir que des entiers, etc. 
Enfin, les sorties sont les données qui sont les résultats du traitement effectué par l'algorithme. Ces sorties sont retournées soit à l'utilisateur, soit à d'autres algorithmes. En effet, il est possible de diviser la résolution de problèmes complexes en plusieurs algorithmes qui peuvent "s'appeler" entre eux. Nous ferons plus tard le parallèle entre un algorithme et une fonction dans un langage de programmation.

### Les opérations

On décrit généralement un algorithme comme une liste d'opérations. Par exemple, on peut prendre deux nombres et les additionner. On peut ajouter 1 à la valeur d'une variable. Les opérations permises dépendent de notre modèle de calcul. On fait cependant souvent certaines hypothèses: on suppose que la plupart des opérations mathématique de bases sont supportées (addition, comparaison, multiplication, soustraction, etc.). 

Il y a plusieurs manières d'exprimer les opérations. Par exemple, la multiplication de deux variables peut s'exprimer avec les expressions `x * y`, *x y*, `x × y`, *x* × *y*, etc. Il y a plusieurs manières de noter ces opérations. Par exemple, l'expression `x ← 1` peut être utilisée pour assigner la valeur 1 à la variable `x`. On peut aussi tout simplement écrire `x = 1`. Dans un autre contexte, l'expression `x = 1` pourrait aussi désigner la comparaison (« est-ce que x vaut 1 ? »). 
En s'inspirant de certains langages de programmation, on peut aussi utiliser une expression telle que `x == 1` pour indiquer que nous faisons une comparaison avec la valeur 1 (et non une assignation).
L'important est que l'intention soit claire et précise pour l'être humain qui vous lit.




## Compter le nombre de voyelles d'un mot entrées au clavier

Exécutez ce pseudocode :

{{< webapp path="voyelles.html" >}}

Note: observez comment on termine la condition  "SI" avec une ligne "FIN SI".

Note: observez comment l'algorithme comprend comme consigne l'impression à l'écran d'un résultat. Il s'agit implicitement d'un résultat ou d'une conséquence de l'algorithme.