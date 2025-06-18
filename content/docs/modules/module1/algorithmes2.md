---
title: "Les algorithmes : conception et syntaxe"
weight: 6
---

# Les algorithmes : conception et syntaxe

Un algorithme est une méthode structurée pour résoudre un problème de manière systématique et efficace. Comparable à une recette culinaire, il fournit des instructions précises, exécutables pas à pas, pour transformer des données d’entrée en résultats attendus. Comprendre la conception et la syntaxe des algorithmes est essentiel pour tout programmeur souhaitant traduire une solution abstraite en code fonctionnel, quel que soit le langage utilisé.

## Concevoir un algorithme

Pour concevoir un algorithme, il convient d’analyser minutieusement le problème en identifiant les entrées, les sorties et les étapes de traitement nécessaires pour obtenir les résultats souhaités. Un algorithme se présente comme une suite logique d’instructions qu’un programmeur peut adapter à un langage comme Java, C++ ou Python. La démarche de conception suit généralement ces étapes :

Étape 1 : lire et comprendre l’énoncé du problème à résoudre.  
Étape 2 : définir les sorties (résultats attendus), les entrées (données initiales) et le traitement (relations permettant de passer des entrées aux sorties).  
Étape 3 : rédiger l’algorithme en pseudo-code, en respectant une structure claire et compréhensible.

## Syntaxe d’un algorithme

La syntaxe d’un algorithme repose sur des conventions souples, contrairement aux langages de programmation qui imposent des règles strictes. Le pseudo-code privilégie la clarté et la précision des instructions, en s’appuyant sur des structures standardisées. Si une étape semble ambiguë ou trop complexe, il est souvent préférable de la décomposer en sous-étapes pour en faciliter la compréhension.

### Les entrées, variables et sorties

Un algorithme débute par la déclaration des entrées, c’est-à-dire les données fournies directement (comme un texte à analyser ou des données financières) ou saisies par un utilisateur (via un clavier, une souris, etc.). Viennent ensuite les variables, qui portent un nom et une valeur, comme une variable `x` valant 1. Ces valeurs peuvent évoluer au fil du traitement. Les variables, utilisées pour stocker des informations intermédiaires, se déclinent en divers types : chaînes de caractères, entiers, nombres décimaux, etc. Enfin, les sorties correspondent aux résultats finaux du traitement, transmis à l’utilisateur ou à d’autres algorithmes. Un problème complexe peut en effet être résolu par plusieurs algorithmes interconnectés, un concept que nous relierons plus tard aux fonctions dans les langages de programmation.

### Les opérations

Un algorithme se décrit comme une séquence d’opérations, par exemple additionner deux nombres ou incrémenter une variable. Les opérations disponibles dépendent du modèle de calcul adopté, mais on presume généralement que les opérations mathématiques de base (addition, soustraction, multiplication, comparaison) sont prises en charge. 

Les notations varient selon les conventions. Une multiplication peut s’écrire `x * y`, `x × y` ou simplement `x y`. De même, pour assigner la valeur 1 à une variable `x`, on peut utiliser `x ← 1` ou `x = 1`. Cependant, dans certains contextes, `x = 1` pourrait indiquer une comparaison (« x vaut-il 1 ? »). Pour lever l’ambiguïté, une notation comme `x == 1` est parfois préférée pour les comparaisons, en s’inspirant de langages de programmation. L’essentiel reste que chaque opération soit exprimée de manière claire et sans équivoque pour le lecteur.


## Compter le nombre de voyelles d'un mot entrées au clavier

Exécutez ce pseudocode :

{{< webapp path="voyelles.html" >}}

Note: observez comment on termine la condition  "SI" avec une ligne "FIN SI".

Note: observez comment l'algorithme comprend comme consigne l'impression à l'écran d'un résultat. Il s'agit implicitement d'un résultat ou d'une conséquence de l'algorithme.