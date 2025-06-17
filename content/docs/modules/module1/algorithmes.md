---
title: "Les algorithmes"
weight: 5
---

# Les algorithmes

> *The etymology of program is pro ‘before’ + graphein ‘write’. I think of programming as making a plan that will be executed in the future, something that every human does from time to time. The hard part is that a computer has to execute the plan, and computers are incredibly stupid. Dealing with such stupidity requires more patience and determination than many people have.* (Peter Turney)

## Préalables

Nous supposons dans ce cours que vous avez complété les mathématiques du collégial et que vous avez de bonnes aptitudes en ce qui a trait aux raisonnements formels. Dans ce premier module, vous aurez à exprimer la solution de certains problèmes en terme de variables, de boucles et d'embranchement. Il ne s'agit pas de notions avancées : vous devriez être familier avec ces notions. Les boucles font partie implicitement du calcul d'une somme ou d'un produit scalaire. Les variables en informatique sont une notion voisine des variables en algèbre. Les embranchements sont des notions de base en logique élémentaire. 

Nous supposons une maîtrise de ces notions. Vous êtes responsables de vous assurez que vous avez la préparation nécessaire pour suivre le cours INF 1220.

## Introduction

Le processus systématique de résolution d'un problème donné s'appelle algorithme. La notion d'algorithme formel est vue dans le cadre des cours de mathématiques du  secondaire, notamment dans le contexte de [la théorie des graphes](https://www.alloprof.qc.ca/fr/eleves/bv/mathematiques/la-chaine-de-poids-minimal-m1010) et des algorithmes d'optimisation. Comme point de départ dans le cours INF 1220, nous revisitons et approfondissons brièvement cette notion fondamentale.

Un algorithme est donc une suite d'actions pour répondre à un problème de traitement de l'information. Ces actions peuvent être mathématiques (ex. somme = a + b), de contrôles (ex. SI a > b ALORS) ou d'itérations (ex. TANT QUE a > b FAIRE). Pour décrire ces algorithmes, il existe également plusieurs formalismes, certains utiliseront des formalismes mathématiques alors que d'autres utiliseront des pseudo-codes. Encore là dans plusieurs formats pour représenter un pseudo-code, il n'existe pas de normes uniques! 

En cuisine, une recette est un exemple d'algorithme si celle-ci comporte une séquence d'instructions précises. Pouvoir rédiger de manière précise une recette afin que d'autres cuisiniers puissent reproduire la même séquence d'opération est de facto de la programmation informatique. Si vous avez fait l'expérience du manuel de recette de quelqu'un d'autre (par ex., votre grand-mère), vous avez peut-être découvert qu'il peut être difficile de suivre des consignes de quelqu'un d'autre surtout quand celles-ci ne sont pas suffisamment précises. Une recette de cuisine est du pseudo-code.

Avant l'invention du GPS, il était commun d'expliquer à des amis ou des parents comment se rendre à un lieu donné en suivant une série d'instructions. Il arrivait souvent, malheureusement, que ces instructions n'étaient pas assez précises et que les gens se perdent. Expliquer à quelqu'un comment se rendre à un lieu donné est un exemple de programmation informatique. Votre explication est du pseudo-code.

Il est essentiel de comprendre ce qu'est le pseudo-code: il s'agit d'une façon de décrire un algorithme afin que d'autres êtres humains puissent vous comprendre. Il faut donc interpréter le pseudo-code en utilisant son jugement humain de la même façon que vous interprétez tout autre texte ou discours. Pouvoir lire un algorithme, décrit en pseudo-code, est une compétence essentielle en informatique. Il faut être capable de comprendre d'autres informaticiens sans nécessairement exiger que ceux-ci utilisent du code informatique dans un langage particulier (par ex., Java). Programmer et faire de l'informatique exige de pouvoir bien communiquer avec les autres informaticiens indépendamment de langages de programmation spécifiques.

Pour un programmeur d'expérience, s'exprimer à l'aide d'un pseudo-code est chose aisée. Pour le commun des mortels, c'est un peu plus difficile. La blague suivante illustre le problème.

> Une femme demande à son programmeur de mari : « Va au supermarché acheter une bouteille de lait. Et si ils ont des œufs, prends en 6 ». Le mari revient avec six bouteilles de lait. Sa femme lui demande pourquoi il a pris six bouteilles. « Parce qu'ils avaient des oeufs » répond-il.

Quand on rédige un pseudo-code, il faut tout spécifier, comme si on s'adressait à quelqu'un qui prend tout littéralement, sans aucun jugement. Pour devenir un programmeur, pour penser comme un programmeur, il faut s'habituer à rédiger des séquences d'instructions précises. La lecture et la rédaction de pseudo-codes relativement simples peut être une bonne pratique.

Le pseudocode est destiné à être lu par l'humain, et il peut être écrit de diverses manières tant que l'humain le comprend. Le cours ne vise pas à vous permettre de comprendre une syntaxe particulière de pseudocode,  mais bien le pseudocode en général.

### Qu'est-ce qu'un algorithme ?
Un **algorithme** est une suite finie et ordonnée d'instructions permettant de résoudre un problème ou d'accomplir une tâche spécifique. Il s'agit d'une méthode systématique, exprimée de manière précise, qui garantit un résultat correct lorsqu'elle est exécutée. Les algorithmes sont au cœur de l'informatique, car ils décrivent comment un programme doit fonctionner pour atteindre un objectif.

Exemples d'algorithmes dans la vie quotidienne :
- Une recette de cuisine (série d'étapes pour préparer un plat).
- Les instructions pour assembler un meuble.

En informatique, un algorithme peut, par exemple, trier une liste de nombres ou calculer le chemin le plus court entre deux points.

### Qu'est-ce que le pseudo-code ?
Le **pseudo-code** est une manière d'écrire un algorithme en utilisant un langage simplifié, proche du langage naturel, mais structuré comme un programme informatique. Il n'est pas destiné à être exécuté directement par un ordinateur, mais sert à décrire la logique d'un algorithme de manière claire et compréhensible, indépendamment d'un langage de programmation spécifique.

Le pseudo-code utilise des conventions comme :
- `SI`, `ALORS`, `SINON` pour les conditions.
- `POUR`, `TANT QUE` pour les boucles.
- Des instructions comme `écrire` ou `lire` pour les entrées/sorties.

Exemple de pseudo-code pour calculer la somme de deux nombres :

```
lire nombre1
lire nombre2
somme ← nombre1 + nombre2
écrire somme
```

Le pseudo-code permet aux programmeurs de planifier la logique avant de la traduire dans un langage comme Python, C++ ou Java.

En résumé, un algorithme est une méthode pour résoudre un problème, tandis que le pseudo-code est un outil pour exprimer cet algorithme de manière claire et universelle. Ces deux concepts sont essentiels pour concevoir des solutions informatiques efficaces.

<iframe width="560" height="315" src="https://www.youtube.com/embed/1ANpkDxJHo4" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

### Terminologie de base

Un algorithme prend habituellement des données et produit un résultat.  Par exemple, un algorithme cherchant à déterminer si un nombre est pair, pourra recevoir un nombre en paramètre et il pourra produire comme réponse une valeur Booléenne (vrai ou faux). Un même algorithme va donc généralement pouvoir être exécuté sur différentes données et pouvoir fournir des réponses différentes. En ce sens, une fonction (au sens mathématique) comme f(x) = a x + b peut être décrite comme étant un algorithme. Une fonction doit toujours produire la même valeur étant donnée les mêmes données. Un algorithme n'est pas limité de cette manière. Par exemple, un algorithme pourrait servir à choisir un nom aléatoirement au sein d'une liste. D'une exécution à l'autre, l'algorithme pourrait produire des valeurs différentes avec les mêmes données. 

La plupart des algorithmes en pratique sont itératifs. Une itération est la répétition d'un processus. Si vous devez teindre une clôture, vous allez peut-être teindre chaque planche une à une. Nous dirons alors que vous itérez sur les planches. Mais comment saurez-vous où vous êtes rendu si vous prenez une pause? Peut-être pourrez-vous poser un petit drapeau sur la planche que vous êtes en train de teindre. On dira alors que le drapeau est un itérateur, c'est-à-dire un indicateur de votre progrès dans votre itération. À chaque étape où vous déplacez le drapeau d'une planche à l'autre, nous pourrons dire que vous incrémentez la position du drapeau. Si jamais vous deviez faire un retour à la planche précédente, nous dirons que vous décrémentez le drapeau.
En informatique, nous n'utilisons pas de drapeaux physiques. Pour savoir où on est rendu, on utilise des compteurs, le plus souvent des valeurs entières. Quand on dit qu'on incrémente un entier, on veut généralement dire qu'on ajoute "1" à sa valeur.

Nous obtenons alors la notion de boucle: nous effectuons une tâche donnée tant qu'une condition n'est pas satisfaite. Cette vidéo présente le concept de boucle:

<iframe width="560" height="315" src="https://www.youtube.com/embed/HMlQEc6uPGU" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

En informatique on fait souvent référence à la notion d'impression à l'écran. Le plus souvent cela fait référence à l'affichage à l'écran d'un message ou d'un texte.

### Calcul de la moyenne

Pour illustrer la notion de pseudo-code, commençons par un exemple relativement simple.
Supposons que nous avons un tableau de notes (par ex., les notes 10.4, 12.6, 18.7, 5.0) et que nous désirons calculer la moyenne. On utilise le convention que si le tableau se nomme 'notes', alors la première note (par ex., 10.4) est notes[0], la seconde note est notes[1]... et ainsi de suite jusqu'à notes[3]. Évidemment, dans ce cas, on sait qu'il y'a 4 notes, mais il plus pratique d'écrire le pseudo-code de manière générale. On fera donc référence à la longueur du tableau (au nombre d'éléments qu'il contient) comme étant un paramètre. Pour visiter tous les éléments, on peut initialiser une valeur entière à 0, et l'incrémenter de 1 tant qu'elle demeure plus petite que la longueur du tableau.

{{< webapp path="moyenne.html" >}}

Observez comment on termine la boucle "TANT QUE" avec une ligne "FIN TANT QUE". Ce n'est pas nécessaire, mais vous devez être clair et précis quant au début et à la fin de vos opérations. On peut aussi indiquer le début et la fin d'une boucle avec l'indentation, ou tout autre moyen compris par les êtres humains.
L'expression "TANT QUE" est associée à une condition qui peut être vraie ou fausse. L'exécution se poursuit tant que l'expression est vraie, et elle se termine lorsque l'expression est fausse.

### Compter le nombre de voyelles d'un mot entrées au clavier

Exécutez ce pseudocode :

{{< webapp path="voyelles.html" >}}

Note: observez comment on termine la condition  "SI" avec une ligne "FIN SI".

Note: observez comment l'algorithme comprend comme consigne l'impression à l'écran d'un résultat. Il s'agit implicitement d'un résultat ou d'une conséquence de l'algorithme.

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