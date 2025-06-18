---
title: "Les erreurs communes"
weight: 9
---


# Erreurs communes

Rédiger du pseudo-code n'a rien de sorcier, mais plusieurs étudiants font des erreurs. Voici quelques erreurs communes.

1. Certains étudiants rédigent du pseudo-code qui a l'air formel et correct, mais qui est en fait ambigu et inutilisable. Prenons cet exemple: ` SI j'ai mal aux dos ALORS je prend des aspirines OU SI  j'ai faim ALORS je mange`. Bien sûr, je n'ai utilisé que des expressions logiques. Des SI, des ALORS des OU. Mais qu'est-ce que ça signifie ? Par exemple, est-ce que je peux à la fois manger et prendre des aspirines dans ce scénario ? La réponse est subjective. Votre pseudo-code doit être exécutable sans interprétation. Un pseudo-code n'est pas un texte à interprétation subjective. Vous ne pouvez pas faire semblant d'écrire du pseudo-code en utilisant simplement les termes qu'on trouve fréquemment au sein des pseudo-codes. Ce n'est pas une question de syntaxe. On peut parfaitement écrire du pseudo-code sans jamais utiliser SI, TANT QUE, etc. Plusieurs étudiants obsèdent sur la syntaxe, croyant à tort que si on leur donne les bons termes, la bonne grammaire, ils trouveront comment comprendre ce qu'est un pseudo-code. Or, c'est justement le contraire de la leçon ici: nous voulons que vous compreniez que la syntaxe exacte est secondaire dans la pensée algorithmique. On peut être imprécis et incohérent en utilisant une syntaxe formelle, et on peut être précis et cohérent en utilisant du français usuel. Ce n'est pas parce que vous utilisez des expressions qui vous semblent précises que vous l'êtes. Vous devez avoir une idée précise en tête et vous devez l'exprimer avec précision.

2. Au sein d'une boucle (par ex., TANT QUE), les étudiants peuvent mettre par erreur une condition qui termine toujours le programme. Dans un tel cas, la boucle ne peut pas s'exécuter et elle est de facto brisée. Voici un exemple. Les instructions « retourner minimum » et « retourner tableau[iterateur] » terminent le pseudo-code. Assurez-vous de bien comprendre que ce pseudo-code ne va consulter que la première valeur du tableau. Si vous avez une condition ou les deux branches (SI et SINON) retournent une valeur et terminent donc l'algorithme, votre algorithme ne procèdera pas plus loin. 

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



3. Certains étudiants construisent des boucles qui ne se terminent jamais. Dans une boucle TANT QUE, il faut s'assurer que la condition ne soit plus satisfaite pour ne pas avoir une boucle infinie. Consultez cet exemple. Si vous testez votre pseudo-code, vous saurez éviter de telles erreurs.

```
iterateur = 0
TANT QUE  iterateur < 100  FAIRE
     SI iterateur < 10 ALORS
         ajouter un à itérateur
     FIN SI
FIN TANT QUE
```


4. Les étudiants vont aussi fréquemment utiliser des variables et des constructions qui ne sont pas définies et dont le sens doit être deviné. Voici un exemple.  Vous constaterez à la lecture de ce pseudo-code qu'il y a plusieurs conventions syntaxiques qui ne sont pas définies. Il y a plusieurs variables, mais il est difficile de connaître leur type et leurs relations. Assurez-vous donc de bien expliquer chaque variable et de bien définir votre syntaxe. Dans ce dernier exemple, que représente iterateur, iterateur[tableau], tableau[iterateur], etc.? Vous devez être précis. Souvent, nous avons un nombre limité de « types » pour les variables: nombres, entiers, chaînes de caractères. On utilise le plus souvent la convention t[i] pour désigner l'élément à l'index i du tableau t. Dans un tel cas, t doit être un tableau, i doit être une valeur entière. Vous être libre de concevoir vos propres conventions, mais vous devez être explicite et précis. Si votre pseudo-code doit retourner une valeur, il faut que le pseudo-code le spécifie explicitement.

```
Entier iterateur[tableau] = 0;
TANT QUE  iterateur[i] < 100  FAIRE
     SI tableau[iterateur] < minimum ALORS
         retourner iterateur[tableau];
     FIN SI
     iterateur = iterateur[tableau] + 1;
FIN POUR TOUT
```


5. Si vous avez bien défini le type de vos variables, et toutes vos conventions syntaxiques, il vous reste maintenant à vous assurer que les valeurs de vos variables sont toujours spécifiées. Si vous dites que x est un nombre et que vous posez ensuite l'inéquation x > 1, nous ne pouvons en connaître la valeur que si x a reçu une valeur. Assurez-vous donc de donner une valeur initiale à toutes vos variables. En tout temps, dans votre pseudo-code, le lecteur doit pouvoir déterminer la valeur d'une variable donnée.

6. Parfois les étudiants manquent tout simplement de rigueur. Pour vérifiez si votre pseudo-code est rigoureux, appliquez-le sur un exemple concret comme si vous étiez un robot. Par exemple, si quelqu'un écrit le pseudo-code suivant « je prend chacune des valeurs du tableau, et je l'additionne à la valeur suivante dans le tableau »... vous pourriez alors prendre un tableau à titre d'exemple, comme [1,2,3] et tester l'instruction. Qu'est-ce que ça donnerait ? Je prend les valeurs une à une et je l'additionne à la valeur suivante dans le tableau. Je prend donc 1 et sa valeur suivante (1 + 2), ensuite 2 et sa valeur suivante (2 + 3), et ensuite 3 et sa valeur suivante... ? Je me rend compte que l'expression « la valeur suivante » n'est pas bien définie. Voici un autre exemple. Quelqu'un pourrait avoir comme pseudo-code « j'initialise la variable comme ayant comme valeur le premier élément du tableau ». Testons ce pseudo-code sur le tableau vide (de taille zéro). Nous constatons qu'il n'y a pas de premier élément&nbsp;! Donc si le tableau vide n'est pas exclu, nous avons un problème de rigueur. Voici un truc: testez toujours votre pseudo-code avec plusieurs exemples concrets. Prenez le temps d'appliquer les instructions de votre pseudo-code ligne par ligne, comme si vous étiez un robot. Pensez comme un ordinateur!

Nous vous invitons maintenant à passez aux premiers exercices du cours!