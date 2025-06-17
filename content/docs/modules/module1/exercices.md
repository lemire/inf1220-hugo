---
title: Exercices sur les algorithmes
weight: 6
---


# Exercices sur les algorithmes et problèmes

La notion d'algorithme a été abordée implicitement dès les premiers cours de mathématiques, par exemple avec l'algorithme de la division longue. Ces exercices visent à vous faire décrire formellement un algorithme. La principale difficulté pour la plupart des étudiants réside dans la rigueur et la précision requises. Au-delà d’un certain point, il n’existe pas de lectures supplémentaires : la pratique est essentielle.

Il est permis d’utiliser le robot conversationnel du cours pour ces exercices ([voir ici](https://rc-inf1220.teluq.ca/)). Toutefois, entraînez-vous à produire vos propres réponses.

Comment procéder pour les exercices :

1. Lisez attentivement la question.
2. Cherchez une solution. Si vous ne trouvez pas immédiatement, consacrez 10 à 15 minutes à y réfléchir. Si le problème exact vous résiste, tentez une solution partielle. Pour cet exercice, vous devez produire du pseudo-code, et non du Java.
3. Rédigez votre solution avec précision, comme une suite de consignes qu’un enfant pourrait suivre.
4. Exécutez votre pseudo-code (voir l’exécution d’un pseudo-code à l’activité 1.2).
5. Consultez ensuite la ou les solutions proposées.
6. Assurez-vous de comprendre toutes les solutions. Posez des questions si nécessaire, en fournissant votre propre solution pour appuyer vos interrogations. Comprendre les solutions proposées est impératif.

Ces exercices sont obligatoires et ne doivent pas être survolés ou omis.

Pour lire les formules mathématiques sur le site du cours, utilisez un navigateur compatible avec MathML, comme Chrome, Edge, Firefox ou Safari.

Ces exercices sont conçus pour l’autoévaluation ; ils ne sont pas corrigés. Nous répondons cependant à vos questions sur la matière.

Les solutions à ces exercices ne sont pas uniques. Il existe plusieurs syntaxes possibles pour décrire un algorithme en pseudo-code. Cela ne signifie pas que toutes les solutions sont correctes. Un pseudo-code peut être erroné s’il ne décrit pas une solution logiquement correcte ou s’il manque de précision pour être considéré comme un algorithme. Un pseudo-code doit pouvoir être exécuté littéralement par un humain sans jugement, comme un automate.

Rappel : les mathématiques du collégial sont un préalable obligatoire à ce cours. Une aisance en algèbre, fonctions et arithmétique est nécessaire. Sans ces prérequis, réussir ce cours peut être difficile.

### Réponses uniques ?

Les exercices incluent une solution pour comparer votre approche à la nôtre. Il n’existe pas de solution unique ; votre solution peut être meilleure ou moins bonne que celle proposée.

### Exercice 1 : La somme d’un tableau

Dans la plupart des langages informatiques, un tableau correspond à un vecteur en algèbre linéaire, soit une série de nombres, comme <1,6,4,10>. Dans cet exercice, vous devez proposer un algorithme pour calculer la somme des nombres entiers d’un tableau à une dimension de longueur quelconque (de 0 à plus d’un million de nombres). Utilisez une structure d’itération (boucle) pour parcourir chaque nombre du tableau.

Pour manipuler le tableau, vous pouvez écrire « Récupérer le nombre à l’index i » (où i est une variable contenant l’index) ou utiliser une syntaxe proche des langages de programmation, par exemple : `Entier e = monTableau[i]`. Pour obtenir la longueur du tableau, utilisez « la taille de monTableau ».

Testez votre pseudo-code en l’appliquant ligne par ligne à un exemple, comme si vous étiez un robot. Prenez votre temps.

Si vous introduisez d’autres conventions de notation, soyez précis. Spécifiez le type de toutes vos variables et donnez explicitement des valeurs initiales, sauf si elles sont reçues en paramètre.

Concevez cet algorithme en pseudo-code, en utilisant des termes concis, explicatifs et cohérents.

<details>
<summary>Réponse</summary>

```
Entrée :
Tableau d’entiers monTableau de taille N

Variables :
Entier somme = 0 // La somme du tableau
Entier index = 0 // Index de l’élément du tableau

Sortie :
Entier somme

Algorithme sommeTableau :

TANT QUE index < taille de monTableau FAIRE
    somme = somme + monTableau[index] // Addition des nombres
    index = index + 1 // Incrémentation de l’index
FIN TANT QUE

retourne somme
```

</details>

### Exercice 2 : La recherche d’un entier

La recherche d’information dans une structure de données (tableau, graphe, arbre, etc.) est un domaine clé en informatique. Bien que les bases de données comme MySQL simplifient la recherche, il est souvent nécessaire de concevoir ses propres solutions. À partir de l’exercice 1, proposez un algorithme en pseudo-code pour vérifier si un entier (par exemple, un numéro de téléphone) est présent dans un tableau et retourner son index, ou -1 s’il est absent. Utilisez une structure itérative et une structure de contrôle (SI _ ALORS _ FINSI).

<details>
<summary>Réponse</summary>

```
Entrée :
Tableau d’entiers monTableau de taille N
Entier nombreATrouver

Variables :
Entier index = 0 // Index de l’élément du tableau

Sortie :
Index de l’entier ou -1 si non trouvé

Algorithme trouverEntier :

TANT QUE index < taille de monTableau FAIRE
    SI nombreATrouver est égal à monTableau[index] ALORS
        retourner index // Fin de l’algorithme
    FIN SI
    index = index + 1 // Incrémentation de l’index
FIN TANT QUE

retourner -1 // Nombre non trouvé
```

</details>

### Exercice 3

Additionnez tous les nombres naturels inférieurs à 1000 qui sont multiples de 3 ou de 5.

<details>
<summary>Réponse</summary>

Voici un algorithme inefficace. Vous pouvez faire mieux :

```
Variable entière i = 0
Variable entière somme = 0
TANT QUE i < 1000
    SI le reste de la division par 3 de i est zéro OU le reste de la division par 5 de i est zéro ALORS
        somme = somme + i
    i = i + 1
FIN TANT QUE
Retourne somme
```

</details>

### Exercice 4

Trouvez le plus grand nombre premier qui divise 317584931803.

<details>
<summary>Réponse</summary>

Voici un algorithme inefficace (effectuant plus d’opérations que nécessaire). Vous pouvez faire mieux :

```
Variable entière i = 1
Variable entière solution = 1
TANT QUE i < 317584931803
    SI le reste de la division de 317584931803 par i est zéro ALORS
        Variable entière j = 3
        Variable booléenne premier = vrai
        TANT QUE j < i
            SI le reste de la division de i par j est zéro ALORS
                premier = faux
            j = j + 1
        FIN TANT QUE
        SI premier ALORS
            solution = i
    i = i + 1
FIN TANT QUE
Retourne solution
```

Pour les curieux, voici une solution exécutable en Python ([voir ici](https://fr.wikipedia.org/wiki/Python_(langage))) :

```python
i = 1
solution = 1
while i < 317584931803:
    if 317584931803 % i == 0:
        j = 3
        premier = True
        while j < i:
            if i % j == 0:
                premier = False
            j = j + 1
        if premier:
            print(i, " est premier")
            solution = i
    i = i + 1
print(solution)
```

Vous pouvez supprimer la ligne `print(i, " est premier")` pour n’obtenir que la réponse finale. Notez que j commence à 3, car tout diviseur premier (sauf 2) est impair d’après le théorème fondamental de l’arithmétique.

</details>

### Exercice 5

Pour un entier positif x, trouvez le chiffre occupant la position des dizaines.

<details>
<summary>Réponse</summary>

```
Variable entière x

Divise x par 10, stocke le quotient dans la variable y

Divise y par 10, retourne le reste de la division
```

Exemple : si x est 531, le quotient de 531 divisé par 10 est 53, reste 1. Le quotient de 53 divisé par 10 est 5, reste 3.

</details>

### Exercice 6

Trouvez l’erreur dans le pseudo-code suivant :

```
Entrées :
Tableau R de longueur N
Valeur X

Sortie :
Est-ce que la valeur X se trouve dans le tableau R ?

Variables :
Itérateur i = 0

Tant que i <= N
    Si R[i] = X Alors retourne Vrai
    i = i + 1

retourne Faux
```

<details>
<summary>Réponse</summary>

L’itérateur i prend les valeurs de 0 à N, accédant ainsi à N+1 éléments du tableau R, ce qui provoque une erreur d’accès hors limites.

</details>

### Exercice 7

Soit P(x) = ax² + bx + c un polynôme du second degré à coefficients réels. Les racines se calculent via le discriminant A = b² - 4ac.

- Si A < 0, il n’y a pas de racine.
- Si A > 0, il existe deux racines : X1 = (-b - √A)/(2a) et X2 = (-b + √A)/(2a).
- Si A = 0, il existe une racine double : X1 = X2 = -b/(2a).

Écrivez un algorithme qui, pour un polynôme donné par ses coefficients, calcule le discriminant, affiche « ce polynôme n’a pas de racine dans R » si A < 0, et calcule les racines sinon.

<details>
<summary>Réponse</summary>

```
Algo pol

Entrée :
Nombres réels a, b, c // Coefficients du polynôme

Variables :
Nombres réels X1, X2, A // Racines et discriminant

Début
    A = b² - 4ac
    Si A < 0 Alors
        Afficher « ce polynôme n’a pas de racine dans R »
    Sinon
        Si A égale 0
            X1 = X2 = -b/(2a)
        Sinon // A > 0
            X1 = (-b - √A)/(2a)
            X2 = (-b + √A)/(2a)
        Fin Si
    Fin Si
Fin
```

</details>

### Exercice 8

Exécutez l’algorithme de l’exercice 7 pour P(x) = x² - 5x + 6, en présentant les résultats dans un tableau.

<details>
<summary>Réponse</summary>

|           |       | Initialisation | Étape 1 | Étape 2 | Étape 3 | Fin |
|-----------|-------|----------------|---------|---------|---------|-----|
| Entrée    | a     | 1              | 1       | 1       | 1       | 1   |
|           | b     | -5             | -5      | -5      | -5      | -5  |
|           | c     | 6              | 6       | 6       | 6       | 6   |
| Variables | X1    |                |         | 2       | 2       | 2   |
|           | X2    |                |         |         | 3       | 3   |
|           | A     |                | 1       | 1       | 1       | 1   |
| Sorties   | écran |                |         |         |         |     |

</details>

### Exercice 9

Pour un entier B > 1 et un nombre M, la représentation en base B de M s’obtient par division successive : M = B × Q₁ + R₁, puis Q₁ = B × Q₂ + R₂, jusqu’à un quotient inférieur à B. La représentation est Qₙ₋₁Rₙ…R₁. Si B > 10, les chiffres de 10 à B-1 sont notés A, B, C, etc. (par exemple, pour B = 16, 10 = A, 11 = B, etc.).

Écrivez un algorithme pour convertir un nombre M dans une base B ≥ 2 (B < 17). Affichez un message d’erreur si B < 2.

<details>
<summary>Réponse</summary>

```
Algo base

Entrée :
Nombre entier positif B // Base
Nombre entier positif M // Nombre à convertir

Variables :
Nombre entier q, r
Suite de caractères alphanumériques S

Début
    S = chaîne vide
    Si B < 2 Alors
        Afficher « entrez un entier supérieur ou égal à 2 »
    Sinon
        q = M
        Tant que q > 0
            r = q - (q ÷ B) × B
            au cas où r
                égal à 10 : ajouter A au début de S
                égal à 11 : ajouter B au début de S
                égal à 12 : ajouter C au début de S
                égal à 13 : ajouter D au début de S
                égal à 14 : ajouter E au début de S
                égal à 15 : ajouter F au début de S
                dans tous les autres cas : ajouter r au début de S
            q = q ÷ B
        Fin Tant que
    Fin Si
Fin
```

Voici l’équivalent en Python ([voir ici](https://www.python.org)) :

```python
def f(M, B):
    s = ""
    if B < 2:
        print("entrez un entier supérieur ou égal à 2")
        return
    q = M
    while q > 0:
        r = q - (q // B) * B
        if r == 10: s = "A" + s
        elif r == 11: s = "B" + s
        elif r == 12: s = "C" + s
        elif r == 13: s = "D" + s
        elif r == 14: s = "E" + s
        elif r == 15: s = "F" + s
        else: s = str(r) + s
        q = q // B
    return s
```

</details>

### Exercice 10

En utilisant l’algorithme Algo_base, qui retourne la représentation en base B d’un nombre M (S = Algo_base(B, M)), écrivez un algorithme qui teste la parité d’un nombre M et affiche « pair » ou « impair ».

<details>
<summary>Réponse</summary>

```
Algo parité

Entrée :
Nombre entier positif M // Nombre à tester

Variables :
Suite de caractères alphanumériques S

Début
    S = Algo_base(2, M)
    Si dernier caractère de S est égal au chiffre 0 Alors
        Afficher « pair »
    Sinon
        Afficher « impair »
    Fin Si
Fin
```

</details>

### Problèmes supplémentaires

Ce cours se concentre sur les bases de l’algorithmique et du pseudo-code. Si vous avez sérieusement résolu les exercices précédents, vous êtes prêt. Voici toutefois des problèmes supplémentaires :

1. Dans un tableau, vérifiez si le nombre 3 est immédiatement suivi du nombre 2.
2. Pour un tableau donné, vérifiez s’il est trié en ordre croissant.
3. Pour deux entiers positifs a et b, comptez les entiers dans l’intervalle [a, b] divisibles par 3.

Des vidéos sur l’algorithmique et le pseudo-code sont disponibles, comme celles de Loïc & Julien ([voir ici](https://www.youtube.com/playlist?list=PLdi5YpL19uBDkRVGWMeZ0ZhtUQKOW-hUZ)) ou d’autres auteurs.

Certains étudiants utilisent des logiciels comme AlgoBox ([voir ici](https://www.xm1math.net/algobox/)). Cela n’est pas nécessaire, car le pseudo-code doit être écrit dans vos propres mots. Si un logiciel vous aide, utilisez-le, mais vous devriez pouvoir écrire du pseudo-code manuellement, sans outils. C’est l’essence du pseudo-code : il est indépendant des syntaxes et des outils.
