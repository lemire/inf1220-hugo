---
title: Exercices sur les algorithmes
weight: 11
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

Dans la plupart des langages informatiques, un tableau correspond à un vecteur en algèbre linéaire, soit une série de nombres, comme \(\langle 1,6,4,10 \rangle\). Dans cet exercice, vous devez proposer un algorithme pour calculer la somme des nombres entiers d’un tableau à une dimension de longueur quelconque (de 0 à plus d’un million de nombres). Utilisez une structure d’itération (boucle) pour parcourir chaque nombre du tableau.

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

La recherche d’information dans une structure de données (tableau, graphe, arbre, etc.) est un domaine clé en informatique. Bien que les bases de données comme MySQL simplifient la recherche, il est souvent nécessaire de concevoir ses propres solutions. À partir de l’exercice 1, proposez un algorithme en pseudo-code pour vérifier si un entier (par exemple, un numéro de téléphone) est présent dans un tableau et retourner son index, ou -1 s’il est absent. Utilisez une structure itérative et une structure de contrôle (SI _ ALORS _ FIN SI).

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

### Exercice 3 : Somme des multiples de 3 ou 5

Additionnez tous les nombres naturels inférieurs à \(1000\) qui sont multiples de \(3\) ou de \(5\).

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

### Exercice 4 : Plus grand diviseur premier

Trouvez le plus grand nombre premier qui divise \(317584931803\).

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

### Exercice 5 : Chiffre des dizaines

Pour un entier positif \(x\), trouvez le chiffre occupant la position des dizaines.

<details>
<summary>Réponse</summary>

```
Variable entière x

Divise x par 10, stocke le quotient dans la variable y

Divise y par 10, retourne le reste de la division
```

Exemple : si x est 531, le quotient de 531 divisé par 10 est 53, reste 1. Le quotient de 53 divisé par 10 est 5, reste 3.

</details>

### Exercice 6 : Erreur dans un pseudo-code

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

### Exercice 7 : Racines d’un polynôme du second degré

Soit \(P(x) = ax^2 + bx + c\) un polynôme du second degré à coefficients réels. Les racines se calculent via le discriminant \(A = b^2 - 4ac\).

- Si \(A < 0\), il n’y a pas de racine.
- Si \(A > 0\), il existe deux racines : \(X_1 = \frac{-b - \sqrt{A}}{2a}\) et \(X_2 = \frac{-b + \sqrt{A}}{2a}\).
- Si \(A = 0\), il existe une racine double : \(X_1 = X_2 = \frac{-b}{2a}\).

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

### Exercice 8 : Exécution de l’algorithme des racines

Exécutez l'algorithme de l'exercice 7 pour \(P(x) = x^2 - 5x + 6\), en présentant les résultats dans un tableau.

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

### Exercice 9 : Conversion de base

Pour un entier \(B > 1\) et un nombre \(M\), la représentation en base \(B\) de \(M\) s’obtient par division successive : \(M = B \times Q_1 + R_1\), puis \(Q_1 = B \times Q_2 + R_2\), jusqu’à un quotient inférieur à \(B\). La représentation est \(Q_{n-1}R_n\ldots R_1\). Si \(B > 10\), les chiffres de \(10\) à \(B-1\) sont notés \(A, B, C, \ldots\) (par exemple, pour \(B = 16\), \(10 = A\), \(11 = B\), etc.).

Écrivez un algorithme pour convertir un nombre \(M\) dans une base \(B ≥ 2\) (\(B < 17\)). Affichez un message d’erreur si \(B < 2\).

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

### Exercice 10 : Tester la parité en base 2

En utilisant l’algorithme Algo_base, qui retourne la représentation en base \(B\) d’un nombre \(M\) (\(S = \text{Algo\_base}(B, M)\)), écrivez un algorithme qui teste la parité d’un nombre \(M\) et affiche « pair » ou « impair ».

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

### Exercice 11 : Calcul de la factorielle

Écrivez un algorithme qui calcule la factorielle d’un entier positif \(n\) (\(n!\)).

<details>
<summary>Solution</summary>

```
Entrée :
Entier positif n

Variable :
Entier fact = 1
Entier i = 1

TANT QUE i \leq n FAIRE
    fact = fact \times i
    i = i + 1
FIN TANT QUE

Retourner fact
```

</details>

### Exercice 12 : Inverser un tableau

Proposez un algorithme pour inverser un tableau d’entiers de taille quelconque.

<details>
<summary>Solution</summary>

```
Entrée :
Tableau d’entiers T de taille N

Variables :
Entier i = 0
Entier j = N - 1

TANT QUE i < j FAIRE
    échanger T[i] et T[j]
    i = i + 1
    j = j - 1
FIN TANT QUE

Retourner T
```

</details>

### Exercice 13 : Compter les voyelles

Écrivez un algorithme qui compte le nombre de voyelles dans une chaîne de caractères donnée.

<details>
<summary>Solution</summary>

```
Entrée :
Chaîne de caractères S

Variable :
Entier compteur = 0
Entier i = 0

TANT QUE i < longueur de S FAIRE
    SI S[i] est une voyelle ALORS
        compteur = compteur + 1
    FIN SI
    i = i + 1
FIN TANT QUE

Retourner compteur
```

</details>

### Exercice 14 : Tester si un entier est un palindrome

Donnez un algorithme pour déterminer si un nombre entier est un palindrome (se lit de la même façon de gauche à droite et de droite à gauche).

<details>
<summary>Solution</summary>

```
Entrée :
Entier positif n

Variables :
Entier original = n
Entier renverse = 0

TANT QUE n > 0 FAIRE
    renverse = renverse \times 10 + (n \bmod 10)
    n = n // 10
FIN TANT QUE

SI original = renverse ALORS
    Retourner Vrai
SINON
    Retourner Faux
FIN SI
```

</details>

### Exercice 15 : Minimum et maximum d’un tableau

Écrivez un algorithme qui trouve le minimum et le maximum dans un tableau d’entiers.

<details>
<summary>Solution</summary>

```
Entrée :
Tableau d’entiers T de taille N

Variables :
Entier min = T[0]
Entier max = T[0]
Entier i = 1

TANT QUE i < N FAIRE
    SI T[i] < min ALORS
        min = T[i]
    FIN SI
    SI T[i] > max ALORS
        max = T[i]
    FIN SI
    i = i + 1
FIN TANT QUE

Retourner min, max
```

</details>


### Exercice 16
Expliquez la différence entre la complexité en temps et la complexité en espace d’un algorithme.

<details>
<summary>Solution</summary>

La complexité en temps mesure la quantité d’opérations ou le temps d’exécution d’un algorithme en fonction de la taille des données d’entrée. La complexité en espace mesure la quantité de mémoire supplémentaire nécessaire à l’algorithme pour fonctionner. Un algorithme peut être rapide (faible complexité en temps) mais utiliser beaucoup de mémoire (complexité en espace élevée), ou l’inverse.
</details>

### Exercice 17
Quel est le nombre maximal de comparaisons nécessaires pour rechercher un élément dans un tableau non trié de taille \( n \) ? Justifiez votre réponse.

<details>
<summary>Solution</summary>

Dans un tableau non trié de taille \( n \), il faut au pire comparer l’élément recherché à chaque élément du tableau, soit \( n \) comparaisons. Cela correspond à une recherche linéaire, de complexité \( O(n) \).
</details>

### Exercice 18
Pourquoi la recherche binaire n’est-elle applicable qu’aux tableaux triés ? Quelle est sa complexité en temps ?

<details>
<summary>Solution</summary>

La recherche binaire n’est applicable qu’aux tableaux triés, car elle repose sur le fait que l’on peut éliminer la moitié des éléments à chaque étape en comparant la valeur recherchée à l’élément du milieu. Si le tableau n’est pas trié, on ne peut pas savoir dans quelle moitié chercher. Sa complexité en temps est \( O(\log n) \).
</details>

### Exercice 19
Donnez un exemple d’algorithme ayant une complexité en \( O(n^2) \) et expliquez pourquoi.

<details>
<summary>Solution</summary>

Un exemple classique est le tri à bulles (bubble sort). Pour chaque élément, on compare avec tous les autres, ce qui fait environ \( n^2 \) comparaisons pour un tableau de taille \( n \). C’est pourquoi sa complexité est \( O(n^2) \).
</details>

### Exercice 20
Un algorithme de tri efficace comme le tri fusion (merge sort) a une complexité en \( O(n \log n) \). Expliquez ce que cela signifie et pourquoi c’est plus rapide qu’un tri naïf pour de grands tableaux.

<details>
<summary>Solution</summary>

Une complexité en \( O(n \log n) \) signifie que le nombre d’opérations croît plus vite que linéairement, mais beaucoup moins vite que quadratiquement. Par exemple, le tri fusion (merge sort) divise le tableau en deux à chaque étape (logarithmique) et traite chaque élément à chaque niveau de division (linéaire), d’où le \( n \log n \). Pour de grands tableaux, c’est beaucoup plus rapide qu’un tri naïf en \( O(n^2) \).
</details>

### Exercice 21

Alan Kay est considéré comme l’un des pères de la programmation orientée objet. Quelles étaient ses motivations principales lorsqu’il a conçu ce paradigme ? En quoi sa vision différait-elle de l’utilisation courante de la programmation orientée objet aujourd’hui ? Résumez brièvement ses objectifs et l’esprit original de la programmation orientée objet selon Kay.

<details>
<summary>Réponse</summary>
<p>Alan Kay a conçu la programmation orientée objet pour faciliter la création de systèmes logiciels modulaires, flexibles et évolutifs, inspirés par la biologie et la communication entre objets autonomes. Son objectif principal était de permettre à chaque « objet » d’être responsable de son propre état et de communiquer avec d’autres objets uniquement via des messages, favorisant ainsi l’encapsulation et l’indépendance des composants.</p>
<p>Pour Kay, la programmation orientée objet devait avant tout encourager l’émergence de systèmes dynamiques, adaptatifs et faciles à modifier, plutôt que de se limiter à la simple hiérarchie de classes et à l’héritage. Il insistait sur l’importance de la communication par messages et sur la capacité à faire évoluer les programmes sans tout réécrire.</p>
<p>De nos jours, la programmation orientée objet est souvent réduite à l’organisation du code et des données, alors que la vision originale de Kay mettait l’accent sur la modularité, la flexibilité et l’autonomie des objets. Sa conception visait à rendre la programmation plus naturelle, intuitive et proche du fonctionnement des systèmes vivants.</p>
</details>

### Exercice 22

Ole-Johan Dahl et Kristen Nygaard sont les créateurs du premier langage orienté objet, Simula. Quelles étaient leurs motivations principales lors de la création de ce langage ? Expliquez en quoi leur approche a influencé la programmation moderne.

<details>
<summary>Réponse</summary>
<p>Dahl et Nygaard ont conçu Simula pour faciliter la modélisation et la simulation de systèmes complexes, comme des réseaux, des usines ou des processus sociaux. Leur motivation était de représenter chaque entité du système par un « objet » autonome, regroupant données et comportements, afin de refléter la réalité de manière plus naturelle et modulaire.</p>
<p>Ils voulaient permettre l’encapsulation, la réutilisation du code grâce à l’héritage, et la création de structures hiérarchiques. Cette approche a posé les bases de la programmation orientée objet moderne, en rendant la conception de logiciels plus flexible, évolutive et adaptée à la complexité des systèmes réels.</p>
</details>

### Exercice 23

Qui est James Gosling et quel a été son rôle dans la création du langage Java ? Quelles étaient les motivations principales derrière la conception de Java ?

<details>
<summary>Réponse</summary>
<p>James Gosling est un informaticien canadien considéré comme le principal créateur du langage Java, développé chez Sun Microsystems dans les années 1990. Son objectif était de concevoir un langage portable, sécurisé, simple et adapté aux systèmes embarqués et aux réseaux. Java devait permettre d’écrire un programme une seule fois et de l’exécuter partout (« Write Once, Run Anywhere »), grâce à la machine virtuelle Java (JVM).</p>
</details>

### Exercice 24

Citez trois domaines ou secteurs industriels où Java est largement utilisé aujourd’hui. Expliquez brièvement pourquoi Java est apprécié dans ces contextes.

<details>
<summary>Réponse</summary>
<p>Java est largement utilisé dans :</p>
<ul>
<li><b>Le développement d’applications d’entreprise</b> (banques, assurances, télécommunications), grâce à sa robustesse, sa sécurité et la richesse de ses bibliothèques.</li>
<li><b>Le développement d’applications mobiles</b> (notamment Android), car Java est le langage principal pour Android et bénéficie d’un vaste écosystème.</li>
<li><b>Les systèmes embarqués et l’Internet des objets (IoT)</b>, où la portabilité et la fiabilité de Java sont des atouts majeurs.</li>
</ul>
</details>


Des vidéos sur l’algorithmique et le pseudo-code sont disponibles, comme [celles de Loïc & Julien](https://www.youtube.com/playlist?list=PLdi5YpL19uBDkRVGWMeZ0ZhtUQKOW-hUZ).



Certains étudiants utilisent des logiciels comme [AlgoBox](https://www.xm1math.net/algobox/). Cela n’est pas nécessaire, car le pseudo-code doit être écrit dans vos propres mots. Si un logiciel vous aide, utilisez-le, mais vous devriez pouvoir écrire du pseudo-code manuellement, sans outils. C’est l’essence du pseudo-code : il est indépendant des syntaxes et des outils.
