---
title: "Les algorithmes"
weight: 5
---

# Les algorithmes

> *The etymology of program is pro ‘before’ + graphein ‘write’. I think of programming as making a plan that will be executed in the future, something that every human does from time to time. The hard part is that a computer has to execute the plan, and computers are incredibly stupid. Dealing with such stupidity requires more patience and determination than many people have.* (Peter Turney)

{{% hint warning %}}


## Préalables

Nous supposons dans ce cours que vous avez complété les mathématiques du collégial et que vous avez de bonnes aptitudes en ce qui a trait aux raisonnements formels. Dans ce premier module, vous aurez à exprimer la solution de certains problèmes en terme de variables, de boucles et d'embranchement. Il ne s'agit pas de notions avancées : vous devriez être familier avec ces notions. Les boucles font partie implicitement du calcul d'une somme ou d'un produit scalaire. Les variables en informatique sont une notion voisine des variables en algèbre. Les embranchements sont des notions de base en logique élémentaire. 

Nous supposons une maîtrise de ces notions. Vous êtes responsables de vous assurez que vous avez la préparation nécessaire pour suivre le cours INF 1220.

{{% /hint %}}


## Introduction

Le processus systématique de résolution d'un problème donné s'appelle algorithme. La notion d'algorithme formel est vue dans le cadre des cours de mathématiques du  secondaire, notamment dans le contexte de [la théorie des graphes](https://www.alloprof.qc.ca/fr/eleves/bv/mathematiques/la-chaine-de-poids-minimal-m1010) et des algorithmes d'optimisation. Comme point de départ dans le cours INF 1220, nous revisitons et approfondissons brièvement cette notion fondamentale.

Un algorithme est donc une suite d'actions pour répondre à un problème de traitement de l'information. Ces actions peuvent être mathématiques (ex. somme = a + b), de contrôles (ex. SI a > b ALORS) ou d'itérations (ex. TANT QUE a > b FAIRE). Pour décrire ces algorithmes, il existe également plusieurs formalismes, certains utiliseront des formalismes mathématiques alors que d'autres utiliseront des pseudo-codes. Encore là dans plusieurs formats pour représenter un pseudo-code, il n'existe pas de normes uniques! 

En cuisine, une recette est un exemple d'algorithme si celle-ci comporte une séquence d'instructions précises. Pouvoir rédiger de manière précise une recette afin que d'autres cuisiniers puissent reproduire la même séquence d'opération est de facto de la programmation informatique. Si vous avez fait l'expérience du manuel de recette de quelqu'un d'autre (par ex., votre grand-mère), vous avez peut-être découvert qu'il peut être difficile de suivre des consignes de quelqu'un d'autre surtout quand celles-ci ne sont pas suffisamment précises. Une recette de cuisine est du pseudo-code.

Avant l'invention du GPS, il était commun d'expliquer à des amis ou des parents comment se rendre à un lieu donné en suivant une série d'instructions. Il arrivait souvent, malheureusement, que ces instructions n'étaient pas assez précises et que les gens se perdent. Expliquer à quelqu'un comment se rendre à un lieu donné est un exemple de programmation informatique. Votre explication est du pseudo-code.

Il est essentiel de comprendre ce qu'est le pseudo-code: il s'agit d'une façon de décrire un algorithme afin que d'autres êtres humains puissent vous comprendre. Il faut donc interpréter le pseudo-code en utilisant son jugement humain de la même façon que vous interprétez tout autre texte ou discours. Pouvoir lire un algorithme, décrit en pseudo-code, est une compétence essentielle en informatique. Il faut être capable de comprendre d'autres informaticiens sans nécessairement exiger que ceux-ci utilisent du code informatique dans un langage particulier (par ex., Java). Programmer et faire de l'informatique exige de pouvoir bien communiquer avec les autres informaticiens indépendamment de langages de programmation spécifiques.

Pour un programmeur d'expérience, s'exprimer à l'aide d'un pseudo-code est chose aisée. Pour le commun des mortels, c'est un peu plus difficile. La blague suivante illustre le problème.

> Une femme demande à son programmeur de mari : «&nbsp;Va au supermarché acheter une bouteille de lait. Et si ils ont des œufs, prends en 6&nbsp;». Le mari revient avec six bouteilles de lait. Sa femme lui demande pourquoi il a pris six bouteilles. «&nbsp;Parce qu'ils avaient des oeufs&nbsp;» répond-il.

Quand on rédige un pseudo-code, il faut tout spécifier, comme si on s'adressait à quelqu'un qui prend tout littéralement, sans aucun jugement. Pour devenir un programmeur, pour penser comme un programmeur, il faut s'habituer à rédiger des séquences d'instructions précises. La lecture et la rédaction de pseudo-codes relativement simples peut être une bonne pratique.

Le pseudocode est destiné à être lu par l'humain, et il peut être écrit de diverses manières tant que l'humain le comprend. Le cours ne vise pas à vous permettre de comprendre une syntaxe particulière de pseudocode,  mais bien le pseudocode en général.

### Qu'est-ce qu'un algorithme ?
Un *algorithme* est une suite finie et ordonnée d'instructions permettant de résoudre un problème ou d'accomplir une tâche spécifique. Il s'agit d'une méthode systématique, exprimée de manière précise, qui garantit un résultat correct lorsqu'elle est exécutée. Les algorithmes sont au cœur de l'informatique, car ils décrivent comment un programme doit fonctionner pour atteindre un objectif.

Exemples d'algorithmes dans la vie quotidienne :
- Une recette de cuisine (série d'étapes pour préparer un plat).
- Les instructions pour assembler un meuble.

En informatique, un algorithme peut, par exemple, trier une liste de nombres ou calculer le chemin le plus court entre deux points.

### Qu'est-ce que le pseudo-code ?
Le *pseudo-code* est une manière d'écrire un algorithme en utilisant un langage simplifié, proche du langage naturel, mais structuré comme un programme informatique. Il n'est pas destiné à être exécuté directement par un ordinateur, mais sert à décrire la logique d'un algorithme de manière claire et compréhensible, indépendamment d'un langage de programmation spécifique.

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

{{< youtube id="1ANpkDxJHo4" >}}

### Logique booléenne

Un des fondements des algorithmes est la logique booléenne.

Voici la table de vérité des principaux opérateurs logiques :

| A     | B     | NON A | A ET B | A OU B |
|-------|-------|-------|--------|--------|
| vrai  | vrai  | faux  | vrai   | vrai   |
| vrai  | faux  | faux  | faux   | vrai   |
| faux  | vrai  | vrai  | faux   | vrai   |
| faux  | faux  | vrai  | faux   | faux   |

- **NON A** : l’inverse de A (négation)
- **A ET B** : vrai seulement si A et B sont vrais
- **A OU B** : vrai si au moins un des deux est vrai

#### Exemple 1 : Contrôle d’accès selon l’âge

```pseudo
lire age
SI age >= 18 ALORS
    écrire "Accès autorisé"
SINON
    écrire "Accès refusé"
FIN SI
```

Ce pseudocode décrit un algorithme simple de contrôle d’accès basé sur l’âge d’une personne. L’instruction lire age récupère une valeur (l’âge) entrée par l’utilisateur ou une source externe, stockée dans la variable age. Une structure conditionnelle (SI ... ALORS ... SINON) vérifie si age est supérieur ou égal à 18. Si la condition est vraie (age >= 18), l’algorithme affiche le message "Accès autorisé", indiquant que la personne est majeure et peut accéder à une ressource ou un lieu. Sinon, si age est inférieur à 18, il affiche "Accès refusé", signalant que l’accès est interdit. L’algorithme se termine après l’affichage.


#### Exemple 2 : Vérifier si un nombre est dans un intervalle

```pseudo
lire x
SI x >= 10 ET x <= 20 ALORS
    écrire "x est dans l'intervalle [10, 20]"
SINON
    écrire "x n'est pas dans l'intervalle"
FIN SI
```


Ce pseudocode décrit un algorithme qui vérifie si une valeur entrée se situe dans l’intervalle fermé [10, 20]. L’instruction lire x récupère une valeur (un nombre, supposé réel ou entier) entrée par l’utilisateur, stockée dans la variable x. Une structure conditionnelle (SI ... ALORS ... SINON) évalue si x satisfait deux conditions combinées par l’opérateur ET : x >= 10 (x est supérieur ou égal à 10) et x <= 20 (x est inférieur ou égal à 20). Si les deux conditions sont vraies, c’est-à-dire si x est dans l’intervalle [10, 20], l’algorithme affiche "x est dans l'intervalle [10, 20]". Sinon, si x est inférieur à 10 ou supérieur à 20, il affiche "x n'est pas dans l'intervalle". L’algorithme se termine après l’affichage.

{{< mermaid >}}
graph TD
    A[Lire x] --> B{x >= 10 ET x <= 20 ?}
    B -- Vrai --> C["x est dans l'intervalle"]
    B -- Faux --> D["x n'est pas dans l'intervalle"]
    C --> E[Fin]
    D --> E
  
{{< /mermaid >}}


#### Notation des programmeurs

Pour des raisons historiques, les programmeurs remplacent souvent ET par `&&`, OU par `||` et
NON par `!`. C'est le cas notamment en Java.

Utilisez l'application suivante pour tester votre compréhension.

{{< webapp path="bool.html" >}}


### La boucle

Un algorithme prend habituellement des données et produit un résultat.  Par exemple, un algorithme cherchant à déterminer si un nombre est pair, pourra recevoir un nombre en paramètre et il pourra produire comme réponse une valeur booléenne (vrai ou faux). Un même algorithme va donc généralement pouvoir être exécuté sur différentes données et pouvoir fournir des réponses différentes. En ce sens, une fonction (au sens mathématique) comme f(x) = a x + b peut être décrite comme étant un algorithme. Une fonction doit toujours produire la même valeur étant donnée les mêmes données. Un algorithme n'est pas limité de cette manière. Par exemple, un algorithme pourrait servir à choisir un nom aléatoirement au sein d'une liste. D'une exécution à l'autre, l'algorithme pourrait produire des valeurs différentes avec les mêmes données. 

La plupart des algorithmes en pratique sont itératifs. Une itération est la répétition d'un processus. Si vous devez teindre une clôture, vous allez peut-être teindre chaque planche une à une. Nous dirons alors que vous itérez sur les planches. Mais comment saurez-vous où vous êtes rendu si vous prenez une pause? Peut-être pourrez-vous poser un petit drapeau sur la planche que vous êtes en train de teindre. On dira alors que le drapeau est un itérateur, c'est-à-dire un indicateur de votre progrès dans votre itération. À chaque étape où vous déplacez le drapeau d'une planche à l'autre, nous pourrons dire que vous incrémentez la position du drapeau. Si jamais vous deviez faire un retour à la planche précédente, nous dirons que vous décrémentez le drapeau.
En informatique, nous n'utilisons pas de drapeaux physiques. Pour savoir où on est rendu, on utilise des compteurs, le plus souvent des valeurs entières. Quand on dit qu'on incrémente un entier, on veut généralement dire qu'on ajoute "1" à sa valeur.

Nous obtenons alors la notion de boucle: nous effectuons une tâche donnée tant qu'une condition n'est pas satisfaite. Cette vidéo présente le concept de boucle.


{{< youtube id="HMlQEc6uPGU" >}}


En informatique, on fait souvent référence à la notion d'impression à l'écran. Le plus souvent cela fait référence à l'affichage à l'écran d'un message ou d'un texte.


### Tableau

Un tableau est une structure de données qui permet de stocker plusieurs éléments, comme des nombres ou des chaînes de caractères, dans une seule variable. Ces éléments sont organisés séquentiellement et accessibles via un indice, un nombre entier qui indique leur position. Par exemple, dans un tableau nommé tableau, l’élément à la position 1 est noté `tableau[1]`, celui à la position 2 est `tableau[2]`, et ainsi de suite. La taille du 
tableau est normalement fixée et connue.


La numérotation des indices varie selon les langages de programmation ou les contextes. Dans de nombreux langages comme C, Java ou Python, les indices commencent à 0 : le premier élément est `tableau[0]`, le deuxième `tableau[1]`, etc. Cette convention, dite «&nbsp;base 0&nbsp;», est courante en informatique pour des raisons techniques liées à la gestion de la mémoire. Dans d’autres contextes, comme certaines notations mathématiques ou langages comme Lua, les indices débutent à 1, ce qui peut être plus intuitif pour des utilisateurs non techniques. Le choix de l’index de départ dépend donc du système utilisé, et il est crucial de connaître cette convention pour manipuler correctement les éléments d’un tableau. La convention utilisée est souvent
claire selon le contexte.

### Calcul de la moyenne

Pour illustrer la notion de pseudo-code, commençons par un exemple relativement simple.
Supposons que nous avons un tableau de notes (par ex., les notes 10.4, 12.6, 18.7, 5.0) et que nous désirons calculer la moyenne. On utilise le convention que si le tableau se nomme 'notes', alors la première note (par ex., 10.4) est notes[0], la seconde note est notes[1]... et ainsi de suite jusqu'à notes[3]. Évidemment, dans ce cas, on sait qu'il y'a 4 notes, mais il plus pratique d'écrire le pseudo-code de manière générale. On fera donc référence à la longueur du tableau (au nombre d'éléments qu'il contient) comme étant un paramètre. Pour visiter tous les éléments, on peut initialiser une valeur entière à 0, et l'incrémenter de 1 tant qu'elle demeure plus petite que la longueur du tableau.

{{< mermaid >}}
graph TD
    A[Début] --> B[Initialiser iterateur = 0, moyenne = 0]
    B --> C{iterateur < longueur de notes ?}
    C -- Vrai --> D["moyenne = moyenne + notes[iterateur]"]
    D --> E[iterateur = iterateur + 1]
    E --> C
    C -- Faux --> F[moyenne = moyenne / longueur de notes]
    F --> G[Afficher moyenne]
    G --> H[Fin]
{{< /mermaid >}}


Utilisez l'application suivante pour explorer l'exécution de l'algorithme.
Ce pseudocode calcule la moyenne de quatre nombres rationnels stockés dans un tableau notes. Une variable iterateur est initialisée à 0 pour parcourir le tableau, et une variable moyenne est initialisée à 0 pour accumuler la somme des éléments. La boucle (TANT QUE iterateur < la longueur de notes FAIRE) itère tant que iterateur est inférieur à la longueur du tableau (ici, 4). À chaque itération, l’élément `notes[iterateur]` est ajouté à moyenne, et iterateur est incrémenté de 1. Une fois la boucle terminée, la somme totale des éléments est stockée dans moyenne. Enfin, moyenne est divisée par la longueur du tableau (moyenne = moyenne / la longueur de notes) pour obtenir la moyenne arithmétique. Le résultat, un nombre rationnel, est la sortie.

{{< webapp path="moyenne.html" >}}

Observez comment on termine la boucle "TANT QUE" avec une ligne "FIN TANT QUE". Ce n'est pas nécessaire, mais vous devez être clair et précis quant au début et à la fin de vos opérations. On peut aussi indiquer le début et la fin d'une boucle avec l'indentation, ou tout autre moyen compris par les êtres humains.
L'expression "TANT QUE" est associée à une condition qui peut être vraie ou fausse. L'exécution se poursuit tant que l'expression est vraie, et elle se termine lorsque l'expression est fausse.
