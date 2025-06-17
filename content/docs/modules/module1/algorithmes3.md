---
title: "Les algorithmes: les structures de contrôle"
weight: 7
---

# Les structures de contrôle

### Les structures de contrôle alternatives (l'embranchement)

On peut concevoir un algorithme qui ne comprend qu'une liste d'opérations simples (addition, soustraction, etc.). Cependant sans structures de contrôle, nous auront du mal à gérer les données dynamiques, par exemple un tableau qui peut contenir un nombre variable d'éléments, et on risque de devoir répéter beaucoup d'opérations.
Les structures de contrôle permettent à l'algorithme de faire des choix de traitement en fonction de conditions. On peut également parler de branchement, terme provenant des premiers ordinateurs où les sorties de cartes de contrôle correspondaient littéralement à des câbles menant à d'autres composantes de l'ordinateur. Une structure de contrôle correspond à l'action de tester des variables de contrôle et selon les résultats d'effectuer des opérations ou non. En pratique, ces structures correspondent à poser des questions avec la syntaxe suivante : SI conditions ALORS opérations FIN SI. Il peut y avoir plusieurs conditions dans une structure de contrôle et la logique booléenne est utilisée pour les construire. Par exemple, SI a est égal 0 ET b est égal 1 ALORS faire c FIN SI. 

Dans la notion de pseudo-code, il est également possible de faire une suite de structures de contrôle avec la syntaxe suivante : SI conditionA ALORS opérations SINON SI conditionB ALORS opérations SINON SI conditionC ALORS [et ainsi de suite] FIN SI. Voici un exemple d'utilisation des structures de contrôle plus riche :

{{< webapp path="age.html" >}}

### Les structures de contrôle itératives (la boucle)

Il arrive régulièrement dans la résolution d'un problème qu'il est nécessaire de réaliser à plusieurs reprises une ou des opérations sur un ensemble de données. Par exemple, supposons qu'il est nécessaire de trouver le plus petit nombre dans un tableau d'entiers. Il sera forcément nécessaire d'itérer dans le tableau, une ligne à la fois, et de comparer les nombres entre eux. Pour ce faire, nous utiliserons deux éléments de syntaxe, soit le TANT QUE _ FAIRE ou bien le POUR TOUT _ FAIRE. Voici deux exemples de l'utilisation de ces deux approches :

<div style="max-width: 800px; margin: 0 auto; background-color: #ffffff; padding: 24px; border-radius: 8px; box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);">

        # Exécution des Pseudocodes de Recherche du Minimum
        
        Cette page décrit l'exécution détaillée de deux pseudocodes qui trouvent le minimum dans un tableau d'entiers. Pour l'exemple, nous utilisons le tableau `tableau = [7, 3, 9, 1, 5]`.

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

## Les problèmes difficiles

Dans ce cours d'introduction à la programmation, vous n'aurez pas à résoudre des problèmes difficiles sur le plan algorithmique. C'est-à-dire que, le plus souvent, si vous  maîtrisez bien la programmation et les mathématiques, la conception de l'algorithme ne sera pas un obstacle.
Il faut savoir que ce n'est pas toujours le cas. Un petit nombre de problèmes rencontrés dans des situations réelles sont difficiles. Il est, par exemple, difficile de créer une intelligence artificielle capable de jouer aux échecs aussi bien que les grands maîtres. Parfois, même quand l'algorithme est facile à concevoir, mettre en oeuvre une solution efficace peut être très difficile.  Il est difficile d'optimiser le chemin que doit suivre un livreur qui a plusieurs livraisons à faire sans devoir énumérer toutes les possibilités. Encore une fois, dans le contexte de ce cours, nous n'exigerons pas que vos solutions soient particulièrement efficaces.

Lecture suggérée : [Problème du voyageur de commerce](https://fr.wikipedia.org/wiki/Probl%C3%A8me_du_voyageur_de_commerce)

## Vidéo suggérée

<iframe width="560" height="315" src="https://www.youtube.com/embed/kk6YbA5I-Iw" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

## Erreurs communes

Rédiger du pseudo-code n'a rien de sorcier, mais plusieurs étudiants font des erreurs. Voici quelques erreurs communes.

1. Certains étudiants rédigent du pseudo-code qui a l'air formel et correct, mais qui est en fait ambigu et inutilisable. Prenons cet exemple:

```
SI j'ai mal aux dos ALORS je prend des aspirines
OU
SI  j'ai faim ALORS je mange
```

Bien sûr, je n'ai utilisé que des expressions logiques. Des SI, des ALORS des OU. Mais qu'est-ce que ça signifie ? Par exemple, est-ce que je peux à la fois manger et prendre des aspirines dans ce scénario ? La réponse est subjective.

Votre pseudo-code doit être exécutable sans interprétation. Un pseudo-code n'est pas un texte à interprétation subjective.

Vous ne pouvez pas faire semblant d'écrire du pseudo-code en utilisant simplement les termes qu'on trouve fréquemment au sein des pseudo-codes. Ce n'est pas une question de syntaxe. On peut parfaitement écrire du pseudo-code sans jamais utiliser SI, TANT QUE, etc. Plusieurs étudiants obsèdent sur la syntaxe, croyant à tort que si on leur donne les bons termes, la bonne grammaire, ils trouveront comment comprendre ce qu'est un pseudo-code. Or, c'est justement le contraire de la leçon ici: nous voulons que vous compreniez que la syntaxe exacte est secondaire dans la pensée algorithmique.

Si vous avez fait vos mathématiques du collégial, vous avez appliqué maintes et maintes fois des algorithmes formels, en commençant par la division longue. Vous savez diviser 321321 par 13, n'est-ce pas ? Pour y arriver, vous utilisez un algorithme complexe (plus complexe que ce qu'on vous demande de concevoir dans ce cours). Or il n'y a pas besoin d'avoir une syntaxe particulière pour expliquer l'algorithme de la division longue. On peut l'expliquer en des termes parfaitement naturels en français.

Au bout du compte, si vous n'arrivez pas à exprimer des algorithmes simples en français, de manière précise, il ne sert à rien d'essayer d'apprendre à programmer en Java, en C# ou en Python. Il y a une compétence basique que vous devez avoir développée préalablement. Vous devez être capable de comprendre et de rédiger des consignes simples et claires (non subjectives). Si vous arrivez à faire des probabilités et de l'algèbre linéaire, vous devez avoir acquis une certaine pensée formelle. Nous vous demandons ici d'appliquer cette compétence de logique et de raisonnement formel. La syntaxe est secondaire. Il faut que vous puissiez être clair dans vos consignes peu importe les termes que vous utilisez. 

On peut être imprécis et incohérent en utilisant une syntaxe formelle, et on peut être précis et cohérent en utilisant du français usuel. Ce n'est pas parce que vous utilisez des expressions qui vous semblent précises que vous l'êtes. Vous devez avoir une idée précise en tête et vous devez l'exprimer avec précision.

2. Au sein d'une boucle (par ex., TANT QUE), les étudiants peuvent mettre par erreur une condition qui termine toujours le programme. Dans un tel cas, la boucle ne peut pas s'exécuter et elle est de facto brisée. Voici un exemple:

```
Variable iterateur (entier)

Variable minimum  = tableau[0] 

iterateur = 0
TANT QUE  iterateur < 100  FAIRE
     SI tableau[iterateur] < minimum ALORS
         retourner tableau[iterateur];
     SINON
         retourner minimum
     FIN SI
     iterateur = iterateur + 1;
FIN TANT QUE
```

Les instructions « retourner minimum » et « retourner tableau[iterateur] » terminent le pseudo-code.

Assurez-vous de bien comprendre que ce pseudo-code ne va consulter que la première valeur du tableau. Si vous avez une condition ou les deux branches (SI et SINON) retournent une valeur et terminent donc l'algorithme, votre algorithme ne procèdera pas plus loin. 

3. Certains étudiants construisent des boucles qui ne se terminent jamais. Dans une boucle TANT QUE, il faut s'assurer que la condition ne soit plus satisfaite pour ne pas avoir une boucle infinie. Consultez cet exemple :

```
iterateur = 0
TANT QUE  iterateur < 100  FAIRE
     SI iterateur < 10 ALORS
         ajouter un à itérateur
     FIN SI
FIN TANT QUE
```

Si vous testez votre pseudo-code, vous saurez éviter de telles erreurs.

4. Les étudiants vont aussi fréquemment utiliser des variables et des constructions qui ne sont pas définies et dont le sens doit être deviné. Voici un exemple:

```
Entier iterateur[tableau] = 0;
TANT QUE  iterateur[i] < 100  FAIRE
     SI tableau[iterateur] < minimum ALORS
         retourner iterateur[tableau];
     FIN SI
     iterateur = iterateur[tableau] + 1;
FIN POUR TOUT
```

Vous constaterez à la lecture de ce pseudo-code qu'il y a plusieurs conventions syntaxiques qui ne sont pas définies. Il y a plusieurs variables, mais il est difficile de connaître leur type et leurs relations. Assurez-vous donc de bien expliquer chaque variable et de bien définir votre syntaxe. Dans ce dernier exemple, que représente iterateur, iterateur[tableau], tableau[iterateur], etc.? Vous devez être précis. Souvent, nous avons un nombre limité de « types » pour les variables: nombres, entiers, chaînes de caractères. On utilise le plus souvent la convention t[i] pour désigner l'élément à l'index i du tableau t. Dans un tel cas, t doit être un tableau, i doit être une valeur entière. Vous être libre de concevoir vos propres conventions, mais vous devez être explicite et précis.

Si votre pseudo-code doit retourner une valeur, il faut que le pseudo-code le spécifie explicitement.

5. Si vous avez bien défini le type de vos variables, et toutes vos conventions syntaxiques, il vous reste maintenant à vous assurer que les valeurs de vos variables sont toujours spécifiées. Si vous dites que x est un nombre et que vous posez ensuite l'inéquation x > 1, nous ne pouvons en connaître la valeur que si x a reçu une valeur. Assurez-vous donc de donner une valeur initiale à toutes vos variables. En tout temps, dans votre pseudo-code, le lecteur doit pouvoir déterminer la valeur d'une variable donnée.

6. Parfois les étudiants manquent tout simplement de rigueur. Pour vérifiez si votre pseudo-code est rigoureux, appliquez-le sur un exemple concret comme si vous étiez un robot. Par exemple, si quelqu'un écrit le pseudo-code suivant « je prend chacune des valeurs du tableau, et je l'additionne à la valeur suivante dans le tableau »... vous pourriez alors prendre un tableau à titre d'exemple, comme [1,2,3] et tester l'instruction. Qu'est-ce que ça donnerait ? Je prend les valeurs une à une et je l'additionne à la valeur suivante dans le tableau. Je prend donc 1 et sa valeur suivante (1 + 2), ensuite 2 et sa valeur suivante (2 + 3), et ensuite 3 et sa valeur suivante... ? Je me rend compte que l'expression « la valeur suivante » n'est pas bien définie. Voici un autre exemple. Quelqu'un pourrait avoir comme pseudo-code « j'initialise la variable comme ayant comme valeur le premier élément du tableau ». Testons ce pseudo-code sur le tableau vide (de taille zéro). Nous constatons qu'il n'y a pas de premier élément&nbsp;! Donc si le tableau vide n'est pas exclu, nous avons un problème de rigueur. Voici un truc: testez toujours votre pseudo-code avec plusieurs exemples concrets. Prenez le temps d'appliquer les instructions de votre pseudo-code ligne par ligne, comme si vous étiez un robot. Pensez comme un ordinateur!

Nous vous invitons maintenant à passez aux premiers exercices du cours!