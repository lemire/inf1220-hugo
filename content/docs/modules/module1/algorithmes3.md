---
title: "Les algorithmes: les structures de contrôle"
weight: 7
---

# Les structures de contrôle

Les structures de contrôle sont au cœur de la conception d’algorithmes, car elles permettent de guider l’exécution en fonction de conditions ou de répéter des opérations sur des données. Elles offrent la flexibilité nécessaire pour traiter des situations dynamiques, comme des données de taille variable, et évitent la répétition inutile d’instructions. En combinant des branchements (choix conditionnels) et des boucles (répétitions), elles permettent de construire des solutions logiques et efficaces, adaptées à une grande variété de problèmes.

### Les structures de contrôle alternatives (l'embranchement)

On peut concevoir un algorithme qui ne comprend qu'une liste d'opérations simples (addition, soustraction, etc.). Cependant sans structures de contrôle, nous auront du mal à gérer les données dynamiques, par exemple un tableau qui peut contenir un nombre variable d'éléments, et on risque de devoir répéter beaucoup d'opérations.
Les structures de contrôle permettent à l'algorithme de faire des choix de traitement en fonction de conditions. On peut également parler de branchement, terme provenant des premiers ordinateurs où les sorties de cartes de contrôle correspondaient littéralement à des câbles menant à d'autres composantes de l'ordinateur. Une structure de contrôle correspond à l'action de tester des variables de contrôle et selon les résultats d'effectuer des opérations ou non. En pratique, ces structures correspondent à poser des questions avec la syntaxe suivante : SI conditions ALORS opérations FIN SI. Il peut y avoir plusieurs conditions dans une structure de contrôle et la logique booléenne est utilisée pour les construire. Par exemple, SI a est égal 0 ET b est égal 1 ALORS faire c FIN SI. 

Dans la notion de pseudo-code, il est également possible de faire une suite de structures de contrôle avec la syntaxe suivante : SI conditionA ALORS opérations SINON SI conditionB ALORS opérations SINON SI conditionC ALORS [et ainsi de suite] FIN SI. 


Considérons l'exemple suivant. Il s'agit d'un outil interactif qui t’aide à comprendre comment un algorithme utilise des conditions pour classer une personne selon son âge. Pour commencer, saisis un âge entier positif dans le champ prévu, par exemple «&nbsp;25&nbsp;». Ensuite, clique sur «&nbsp;Prochaine étape&nbsp;» pour exécuter l’algorithme étape par étape. À chaque clic, une ligne du pseudocode s’illumine, et un message explicatif apparaît dans la zone de journalisation en bas. Tu verras également l’état mis à jour : l’âge saisi et la catégorie déterminée (comme «&nbsp;Vous êtes un adulte&nbsp;»). Si tu veux recommencer, clique sur «&nbsp;Réinitialiser&nbsp;» pour effacer les résultats. Attention, l’âge doit être un nombre entier positif, sinon un message te demandera de corriger.

Cet outil vous permet de suivre le raisonnement de l’algorithme de manière claire. Le pseudocode, affiché à gauche, utilise une structure conditionnelle (SI, SINON SI, SINON) pour évaluer l’âge et assigner une catégorie : enfant (≤ 10 ans), adolescent (> 10 et < 18 ans), adulte (≥ 18 et < 65 ans) ou personne âgée (≥ 65 ans). En progressant dans les étapes, observe comment l’algorithme teste chaque condition et choisit la bonne catégorie. Lisez attentivement les messages du journal pour comprendre les décisions prises.

{{< webapp path="age.html" >}}


Après avoir utilisé l’outil, prends un moment pour réfléchir à la flexibilité de cet algorithme. Comment pourrais-tu le modifier pour ajouter de nouvelles catégories, comme «&nbsp;bébé&nbsp;» pour les âges de 0 à 2 ans, ou pour inclure des critères supplémentaires, comme une distinction entre «&nbsp;jeune adulte&nbsp;» et «&nbsp;adulte senior&nbsp;» ? Que se passerait-il si l’âge pouvait être négatif ou non entier ? Comment adapterais-tu le pseudocode pour gérer ces cas ? En explorant ces questions, tu commenceras à voir comment personnaliser un algorithme pour répondre à des besoins spécifiques, une étape essentielle pour devenir un programmeur créatif.

### Les structures de contrôle itératives (la boucle)

Il arrive régulièrement dans la résolution d'un problème qu'il est nécessaire de réaliser à plusieurs reprises une ou des opérations sur un ensemble de données. Par exemple, supposons qu'il est nécessaire de trouver le plus petit nombre dans un tableau d'entiers. Il sera forcément nécessaire d'itérer dans le tableau, une ligne à la fois, et de comparer les nombres entre eux. Pour ce faire, nous utiliserons deux éléments de syntaxe, soit le TANT QUE _ FAIRE ou bien le POUR TOUT _ FAIRE. Voici deux exemples de l'utilisation de ces deux approches :


<details>
<summary>Pseudocode 1 : Boucle POUR TOUT</summary>

```plaintext
Entrées :
Tableau d'entiers : tableau[100]

Sorties :
Entier minimum

minimum = tableau[0]
POUR TOUT Entier e de tableau FAIRE
    SI e < minimum ALORS
        minimum = e;
    FIN SI
FIN POUR TOUT
```

Ce pseudocode décrit un algorithme pour trouver la valeur minimale dans un tableau d’entiers de taille 100. L’algorithme commence par initialiser la variable minimum à la première valeur du tableau (tableau[0]), en supposant que le tableau n’est pas vide. Ensuite, une boucle (POUR TOUT Entier e de tableau FAIRE) parcourt chaque élément e du tableau. À chaque itération, si l’élément e est inférieur à la valeur actuelle de minimum, alors minimum est mis à jour avec la valeur de e (minimum = e). À la fin de la boucle, minimum contient la plus petite valeur du tableau, qui est retournée comme résultat.
</details>

<details>
<summary>Pseudocode 2 : Boucle TANT QUE</summary>

```plaintext
Entrées :
Tableau d'entiers : tableau[100]

Sorties :
Entier minimum

minimum = tableau[0]
Entier iterateur = 0;
TANT QUE iterateur < 100 FAIRE
    SI tableau[iterateur] < minimum ALORS
        minimum = tableau[iterateur];
    FIN SI
    iterateur = iterateur + 1;
FIN TANT QUE
```

Ce pseudocode décrit un algorithme pour trouver la valeur minimale dans un tableau d’entiers de taille 100. Une variable minimum est initialisée avec la première valeur du tableau (tableau[0]), supposant que le tableau n’est pas vide. Une variable iterateur est initialisée à 0 pour suivre la position dans le tableau. La boucle (TANT QUE iterateur < 100 FAIRE) parcourt le tableau tant que iterateur est inférieur à 100. À chaque itération, si l’élément à l’indice iterateur (tableau[iterateur]) est inférieur à minimum, alors minimum est mis à jour avec cette valeur. Ensuite, iterateur est incrémenté de 1 (iterateur = iterateur + 1) pour passer à l’élément suivant. À la fin de la boucle, minimum contient la plus petite valeur du tableau, qui est retournée.
</details>




### Composition

Dans la pratique, un algorithme peut comporter plusieurs structures de contrôle itératives, plusieurs structures de contrôle alternatives et plusieurs opérations. On peut les combiner de diverses manières. Il est possible, par exemple, d'avoir une boucle TANT QUE au sein d'une autre boucle TANT QUE.

```plaintext
TANT QUE x > 0 FAIRE
  TANT QUE x > 10 FAIRE
     x = x - 1
  FIN TANT QUE
FIN TANT QUE
```

Ce pseudocode décrit une structure de boucles imbriquées qui modifie la valeur de la variable x jusqu'à ce qu'elle devienne inférieure ou égale à 0. La boucle externe (TANT QUE x > 0 FAIRE) continue tant que x est strictement positif. À l'intérieur, la boucle interne (TANT QUE x > 10 FAIRE) s'exécute uniquement si x est supérieur à 10, et dans ce cas, elle décrémente x de 1 à chaque itération (x = x - 1). Une fois que x devient inférieur ou égal à 10, la boucle interne s'arrête, mais la boucle externe ne se termine pas immédiatement, car elle vérifie seulement si x > 0. Cependant, comme il n'y a aucune instruction dans la boucle externe pour modifier x lorsque x ≤ 10, le programme entre dans une boucle infinie si x est compris entre 1 et 10 inclus. Si x est initialement supérieur à 10, il sera décrémenté jusqu'à atteindre 10, puis le programme se bloquera. Si x est initialement inférieur ou égal à 0, aucune des boucles ne s'exécute.

### La fin d'un algorithme

Un algorithme continue à s'exécuter tant qu'il reste des operations à faire. L'algorithme prend fin lorsque nous rencontrons la fin du pseudo-code ou lorsque le programmeur invoque la fin spécifiquement. Dans l'exemple suivant, le programmeur demander à ce que l'on cesse l'exécution dès que la valeur 5 est rencontrée.

```plaintext
x = 0
TANT QUE x < 10 ALORS
   ajoute un à x
   SI x == 5 ALORS TERMINE
FIN TANT QUE
AFFICHE x
```

La valeur x ne sera donc jamais affichée.

Il arrive aussi qu'un pseudo-code doit retourner une valeur. Par convention, dès que la valeur attendue est retournée, l'algorithme prend fin. Ainsi donc, dans le cas suivant, la valeur 5 sera retournée.

```plaintext
x = 0
TANT QUE x < 10 ALORS
   ajoute un à x
   SI x == 5 ALORS RETOURNE x
FIN TANT QUE
RETOURNE x
```

## Exécution d'un pseudo-code

Pour comprendre un pseudo-code que vous venez de recevoir, ou pour tester un pseudo-code que vous venez de créer, il est essentiel de l'exécuter. Quand on exécute un pseudo-code, on se contente de lire les consignes logiques.

Prenons un exemple:

```
Variable test = 0

TANT QUE test < 100
  test = test + 22
FIN TANT QUE

retourne test
```

{{< mermaid >}}

graph TD
    A[Début] --> B[Initialiser test = 0]
    B --> C{test < 100 ?}
    C -- Vrai --> D[test = test + 22]
    D --> C
    C -- Faux --> E[Retourner test]
    E --> F[Fin]
{{< /mermaid >}}


1. Je débute le pseudo-code avec la valeur 0 stockée dans la variable test.
2. J'entre dans la boucle TANT QUE.
3. J'ajoute 22 à la variable test, le résultat est 22.
4. J'entre dans la boucle TANT QUE.
5. J'ajoute 22 à la variable test, le résultat est 44.
6. J'entre dans la boucle TANT QUE.
7. J'ajoute 22 à la variable test, le résultat est 66.
8. J'entre dans la boucle TANT QUE.
9. J'ajoute 22 à la variable test, le résultat est 88.
10. J'entre dans la boucle TANT QUE.
11. J'ajoute 22 à la variable test, le résultat est 110.
12. Je quitte la boucle TANT QUE.
13. Je retourne la valeur stockée dans la variable test, soit 110.

Vous devez absolument être capable de faire de telles exécutions. Dans certains cas, votre pseudo-code va dépendre de paramètres: il faut alors exécuter le pseudo-code plus d'une fois, sur plusieurs cas de test. Dans certains cas, le pseudo-code peut prendre trop d'étapes pour qu'un humain puisse l'exécuter entièrement : vous devriez au moins en faire une partie.

## Vidéo suggérée



{{< youtube id="kk6YbA5I-Iw" >}}
