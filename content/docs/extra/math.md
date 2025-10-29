---
title: "Rappel mathématique"
weight: 11
---




# Rappel mathématique

Avant de commencer, il est conseillé, pour se familiariser avec certaines notations, de jeter un coup d'œil sur le [tableau des symboles et abréviations usuels](#annexe).

## 1. Les propositions, les ensembles, les relations et les nombres

Pour aborder les concepts mathématiques fondamentaux, il est essentiel de comprendre les notions de base qui sous-tendent la logique et la théorie des ensembles. Cette section introduit les propositions, les ensembles, les relations et les nombres, en posant les fondations nécessaires à une étude rigoureuse.

### 1.1. Les propositions

Une proposition mathématique est un énoncé dont on peut dire sans ambiguïté si elle est vraie ou fausse. Le processus qui consiste à déterminer si une proposition mathématique est vraie ou fausse est l’objet du calcul propositionnel ou calcul des propositions et fait partie de la logique mathématique. Le résultat d’un calcul propositionnel est donc l’attribution d’une valeur de vérité à une proposition.

Ainsi, l'énoncé «&nbsp;Le cours INF1220 figure parmi les cours dispensés à la TELUQ au trimestre d’hiver 2021&nbsp;» est une proposition mathématique et sa valeur de vérité est «&nbsp;vrai&nbsp;». La proposition «&nbsp;Le cours INF1220 est mon meilleur cours&nbsp;» n'est pas une proposition mathématique. Dans notre contexte, quand nous parlons de proposition, nous parlons de proposition mathématique.

#### 1.1.1. Table des valeurs de vérités des propositions

Tableau 1 : Table de vérités et connecteurs logiques

| \( p \) | \( q \) | \( \neg p \) | \( p \vee q \) | \( p \oplus q \) | \( p \wedge q \) | \( p \Rightarrow q \) | \( p \Leftrightarrow q \) |
|-------|-------|-------------|---------------|---------------|-------------|-----------------|---------------------|
| V     | V     | F           | V             | F             | V           | V               | V                   |
| V     | F     | F           | V             | V             | F           | F               | F                   |
| F     | V     | V           | V             | V             | F           | V               | F                   |
| F     | F     | V           | F             | F             | F           | V               | V                   |

Cette table de vérité présente les valeurs logiques des propositions \( p \), \( q \) et de plusieurs connecteurs logiques pour toutes leurs combinaisons possibles. La colonne \( \neg p \) indique la négation de \( p \), vraie lorsque \( p \) est faux. Le connecteur \( p \vee q \) (ou) est vrai si au moins l'une des propositions est vraie. Le ou exclusif \( p \oplus q \) est vrai uniquement si exactement une des propositions est vraie. Le et \( p \wedge q \) est vrai seulement si les deux propositions sont vraies. L'implication \( p \Rightarrow q \) est fausse uniquement si \( p \) est vrai et \( q \) est faux. Enfin, la biconditionnelle \( p \Leftrightarrow q \) est vraie lorsque \( p \) et \( q \) ont la même valeur logique. Chaque ligne correspond à une combinaison des valeurs de vérité de \( p \) et \( q \), illustrant ainsi le comportement de ces connecteurs.


### 1.2. Les ensembles

Un ensemble est une collection d’objets. Si on appelle \( E \) cette collection, alors pour chacun de ces objets, on peut affirmer qu’il appartient à \( E \). On peut déterminer \( E \) en énumérant ses éléments, par exemple \( E = \{ o_1, o_2, \dots \} \), où \( o_i \) est un des objets de la collection (et où on admet que pour tout objet de la collection, il y a un \( o_i \) qui lui soit identique). On dit alors qu’on a défini \( E \) en extension. Un objet \( o_i \) est appelé un élément de \( E \). On note \( o_i \in E \). 

Étant donné un objet arbitraire, c’est-à-dire une chose quelconque, on est capable de dire si oui ou non cette chose appartient à \( E \). Si nous notons la chose en question \( o \) et qu’elle n’appartient pas à \( E \), nous traduisons cela par \( o \notin E \).

Une autre façon de déterminer un ensemble est de donner une propriété qui caractérise ses éléments. Par exemple, la collection de toutes les personnes qui sont inscrites à la TELUQ pour suivre le cours INF1220 pour le trimestre d’hiver 2021 à la date du 1er mars 2021 est un ensemble. Nous pouvons le noter \( T \). On convient dans ce cas d’écrire \( T = \{ o \mid o \text{~est~inscrit} \} \). Le symbole \( \mid \) se lit «&nbsp;tel que&nbsp;». «&nbsp;Être inscrit à la TELUQ pour suivre le cours INF1220 pour le trimestre d’hiver 2021 à la date du 1er mars 2021&nbsp;» est la propriété caractéristique de l’ensemble \( T \) (ou des éléments de cet ensemble).

Les nombres entiers positifs forment un ensemble ; c’est l’ensemble des entiers naturels. On le note \( \mathbb{N} \). \( \mathbb{N} = \{ 0, 1, \dots \} \).

Un ensemble peut être fini, comme l’ensemble \( T \). Un ensemble peut être infini, comme l’ensemble \( \mathbb{N} \). On admet qu’il existe un ensemble qui ne contient aucun élément. On appelle cet ensemble, ensemble vide. On le note couramment \( \{ \} \) ou \( \emptyset \). Un singleton est un ensemble qui a un seul élément. On admet aussi que si l’on ajoute un élément d’un ensemble \( E \) à ce même ensemble \( E \), on ne change pas l’ensemble \( E \). On considère de ce fait, qu’un ensemble est donné par une collection distincte des objets qui le constituent, c’est-à-dire que ses éléments sont distincts. Le nombre des éléments d’un ensemble est appelé le cardinal de cet ensemble. Le cardinal de l’ensemble vide est par définition 0.

Deux ensembles sont égaux s’ils ont exactement les mêmes éléments ou si on peut prouver qu’ils ont exactement les mêmes éléments. Par exemple, \( V = \{ o \mid o \text{~est~inscrit} \} \) est un ensemble vide. En effet, il n’y a aucune inscription pour le cours INF1220 à la TELUQ à cette date. Cependant, dire que cet ensemble est vide ne signifie pas qu’il n’existe pas. Il existe, mais il n’a aucun élément. \( V = \{ \} \).

#### 1.2.1. Opération sur les ensembles

Soient deux ensembles \( A \) et \( B \). L’intersection de \( A \) et \( B \) est un ensemble formé par les éléments qui appartiennent à la fois à \( A \) et à \( B \). On le note \( A \cap B \). L'union de \( A \) et de \( B \) est un ensemble formé par les éléments qui appartiennent à \( A \) ou qui appartiennent à \( B \). On le note \( A \cup B \). La différence symétrique est un ensemble formé par les éléments de \( A \) qui n’appartiennent pas à \( B \). On le note \( A \setminus B \). Le produit cartésien de \( A \) et de \( B \) est un ensemble formé de couples \( (a, b) \) tels que \( a \in A \) et \( b \in B \). On le note \( A \times B \).

### 1.3. Relation binaire

Une relation binaire \( R \) est un ensemble défini par la donnée de deux ensembles \( A \) et \( B \) et d’une règle qui permet d’associer certains éléments de \( A \) à certains éléments de \( B \). \( R \) est un sous-ensemble du produit cartésien \( A \times B \) de \( A \) et de \( B \). La règle associée à une relation est aussi appelée lien verbal. Le lien verbal est une proposition. On peut définir une relation en compréhension par \( R = \{ (a, b) \in A \times B \mid \text{le lien verbal soit vérifié pour } a \text{ et } b \} \). Au lieu de noter \( (a, b) \in R \), on note simplement \( a R b \) et on lit \( a \) en relation avec \( b \). \( b \) est l’image de \( a \) par la relation \( R \) et \( a \) est l’antécédent de \( b \) pour la relation \( R \).

#### 1.3.1. Propriété d’une relation binaire

Soit \( R \) une relation binaire. Lorsque les ensembles de départ et d’arrivée sont identiques, c’est-à-dire tous égaux à \( A \), on dit simplement que \( R \) est une relation définie sur \( A \).

Soit \( A \) un ensemble et \( R \) une relation binaire définie sur \( A \). \( R \) peut avoir les propriétés suivantes :

##### 1.3.1.1. Réflexivité

\( R \) est réflexive si \( \forall a \in A, a R a \).

Exemple : la relation de divisibilité \( R \) dans \( \mathbb{N} \) (\( a R b \) ssi \( a \) divise \( b \)) est réflexive.

Question : donnez un autre exemple de relation réflexive.

<details>
  <summary>Réponse</summary>
  La relation d'ordre naturel \( R \) sur \( \mathbb{N} \) définie par \( a R b \) ssi \( a \leq b \) est réflexive.
</details>

##### 1.3.1.2. Symétrie

\( R \) est symétrique ssi \( \forall a \in A, \forall b \in B, a R b \Rightarrow b R a \).

Exemple : soit \( m \in \mathbb{N}^* \). La relation \( R \) définie sur \( \mathbb{N} \) par \( a R b \) ssi \( a \) et \( b \) ont le même reste dans la division euclidienne par \( m \) est symétrique.

##### 1.3.1.3. Transitivité

\( R \) est transitive ssi pour \( a, b, c \in A \), \( a R b \) et \( b R c \Rightarrow a R c \). La relation d’ordre naturel sur \( \mathbb{N} \) est transitive.

Question : donner un autre exemple de relation transitive.

<details>
  <summary>Réponse</summary>
  La relation de divisibilité \( R \) dans \( \mathbb{N} \) définie par \( a R b \) ssi \( a \) divise \( b \) est transitive.
</details>

##### 1.3.1.4. Antisymétrie

\( R \) est antisymétrique ssi pour \( a, b \in A \), \( a R b \) et \( b R a \Rightarrow a = b \). Par exemple, soit \( E \) un ensemble, et \( P(E) \) l’ensemble des parties de \( E \). La relation \( \subseteq \) sur \( P(E) \) (définie par \( A \) en relation avec \( B \) ssi \( A \subseteq B \)) est une relation antisymétrique.

Question : donnez un autre exemple de relation antisymétrique.

<details>
  <summary>Réponse</summary>
  La relation \( R \) de divisibilité dans \( \mathbb{N} \) définie par \( a R b \) ssi \( a \) divise \( b \) est antisymétrique.
</details>

#### 1.3.2. Relation d’équivalence

Soit \( R \) une relation définie sur un ensemble \( A \). \( R \) est une relation d’équivalence si \( R \) est à la fois réflexive, symétrique et transitive. Soit \( m \in \mathbb{N}^* \). La relation \( R \) définie sur \( \mathbb{Z} \) par \( a R b \) ssi \( a \) et \( b \) ont le même reste dans la division euclidienne par \( m \) est une relation d’équivalence.

#### 1.3.3. Relation d’ordre

Soit \( R \) une relation définie sur un ensemble \( A \). \( R \) est une relation d’ordre ssi elle est à la fois réflexive, transitive et antisymétrique.

Par exemple, soit \( E \) un ensemble, et \( P(E) \) l’ensemble des parties de \( E \). La relation \( \subseteq \) sur \( P(E) \) est une relation d'ordre.

Soit \( R \) une relation d’ordre sur \( A \), \( a \) et \( b \) sont comparables ssi \( a R b \) ou \( b R a \). Si \( \forall a, b \in A \), \( a \) et \( b \) sont toujours comparables, on dit que \( R \) est une relation d’ordre total. S’il existe \( a, b \) tels que \( a \) et \( b \) ne sont pas comparables, \( R \) est une relation d’ordre partiel. Exemple, la relation définie sur \( \mathbb{Z} \) par \( a R b \) si \( a \) divise \( b \) (division euclidienne) est une relation d’ordre partiel car on ne peut pas comparer 2 et 5.

Question : donner un autre exemple de relation d’ordre partiel.

<details>
  <summary>Réponse</summary>
  Si \( E \) est un ensemble ayant au moins deux éléments \( a \) et \( b \), la relation \( \subseteq \) sur \( P(E) \) (définie par \( A \) en relation avec \( B \) ssi \( A \subseteq B \)) est une relation d'ordre partiel car \( \{a\} \) et \( \{b\} \) sont deux éléments de \( P(E) \) qui ne sont pas comparables par \( \subseteq \).
</details>

La relation d’ordre définie sur \( \mathbb{Z} \) par \( a R b \) si \( a \leq b \) est une relation d’ordre total.

Une fonction est une relation où chaque élément de l’ensemble de départ a au plus une image dans l’ensemble d’arrivée. Dans ce cas, si \( A \) est l’ensemble de départ, \( B \) l’ensemble d’arrivée, et si on note \( f \) la relation, on appelle domaine de \( f \) (noté \( \text{Dom}(f) \) ou simplement \( D_f \)) l’ensemble des éléments de \( A \) ayant une image par \( f \). De même, on appelle image de \( f \) et on note \( \text{Im}(f) \) l’ensemble des éléments de \( B \) ayant au moins un antécédent dans \( A \).

##### 1.3.3.1. Ordre lexicographique

Soit \( V \) un ensemble de symboles et \( L \) un ensemble défini par :

- si \( v \in V \), alors \( v \in L \);
- si \( l \in L \) et \( e \in L \), alors \( el \) et \( le \) appartiennent à \( L \).

\( V \) est appelé vocabulaire et \( L \) est l’ensemble des mots construits sur ce vocabulaire. Un mot \( l \) de \( L \) s’écrit \( v_n, \dots, v_0 \), où \( v_i \in V \). On peut remarquer que si \( V \) est l’ensemble des 26 lettres de l’alphabet français, alors \( L \) est l’ensemble des mots possibles de la langue française (si on assimile toutes les voyelles accentuées à leur équivalent non accentué, c’est-à-dire qu’on laisse tomber les accents) ; en fait, \( L \) contient tous les mots de la langue française, mais aussi des choses comme \( rrrrrrrrr \) sont des mots de \( L \).

Question : que vaut \( L \) si \( V \) est l’ensemble des chiffres de 0 à 9 ?

<details>
  <summary>Réponse</summary>
  Voir plus bas.
</details>

On suppose que \( V \) est muni d’une relation d’ordre total notée \( \leq \) (avec l'ordre strict noté \( < \)). Soit \( a \) et \( b \) deux éléments de \( L \) tels que \( a = a_m, \dots, a_0 \) et \( b = b_n, \dots, b_0 \). \( \forall i \in \mathbb{N} \), \( a_i, b_i \in V \). On pose \( p = \min(m, n) \) le plus petit des deux entiers \( m \) et \( n \). On définit sur \( L \) la relation \( R \) par \( a R b \) ssi

\[
(a_m < b_n) \text{ ou } (a_m = b_n \text{ et } a_{m-1} < b_{n-1}) \text{ ou } (a_m = b_n \text{ et } a_{m-1} = b_{n-1} \text{ et } a_{m-2} < b_{n-2}) \text{ ou } \dots
\]

\( R \) est une relation d’ordre totale sur \( L \). \( R \), qui est aussi notée \( \leq \) et prolonge la relation \( \leq \) de \( V \), est appelée l’ordre lexicographique sur \( L \).
Si \( V \) est l'ensemble des chiffres de 0 à 9, l'ensemble \( L \) contient l'ensemble des entiers naturels \( \mathbb{N} \). Il faut remarquer que sur cet ensemble \( L \) ordonné par \( \leq \), 0 est différent par exemple de 00, ce qui n'est pas le cas dans l'ensemble \( \mathbb{N} \) muni de la relation d'ordre "naturelle" (la relation inférieure ou égale).

### 1.4. L’ensemble des entiers naturels \( \mathbb{N} \) et les autres ensembles de nombres

Il faut noter que les entiers naturels forment un ensemble particulier. Pour illustrer le lien étroit qu’il y a entre la théorie des ensembles et les entiers naturels, il faut savoir qu’on peut construire l'ensemble des entiers naturels en procédant comme suit : \( 0 = \emptyset \), \( 1 = \text{successeur de } 0 \), c'est-à-dire \( 1 = \{0\} \), \( 2 = \text{successeur de } 1 \), c'est-à-dire \( 2 = \{0, 1\} \), etc.

Commençons par voir de façon générale les lois de composition sur un ensemble.

#### 1.4.1. Lois de composition dans un ensemble

Soit \( E \) et \( G \) deux ensembles. Une loi de composition \( T \) dans l’ensemble \( E \) est une fonction de \( E \times E \) vers \( G \) qui à tout couple \( (a, b) \) d'éléments de \( E \) associe un unique élément \( c \) de \( G \) tel que \( c = a T b \).

Soit \( E \) un ensemble muni d'une loi \( T \).

##### 1.4.1.1. Ensemble stable par une loi

Si \( \forall a, b \in E \), \( a T b \in E \), alors la loi \( T \) est interne sur \( E \). On dit aussi que \( E \) est stable par la loi \( T \). On note \( (E, T) \) pour signifier que \( E \) est muni de la loi interne \( T \).

Par exemple, l’addition est interne à l’ensemble des entiers naturels \( \mathbb{N} \).

##### 1.4.1.2. Élément neutre pour une loi

Un élément \( e \) de \( E \) est un élément neutre pour \( T \) ssi pour tout élément \( a \) de \( E \), \( a T e = e T a = a \).

> **Exemple** : 0 est l'élément neutre pour l'addition \( + \) sur l'ensemble \( \mathbb{N} \) des entiers naturels : pour tout entier naturel \( n \), on a \( n + 0 = 0 + n = n \).

Il en est de même pour 1 qui est l'élément neutre pour la multiplication \( \times \) sur l'ensemble \( \mathbb{N} \) des entiers naturels : pour tout entier naturel \( n \), on a \( n \times 1 = 1 \times n = n \).

Question : existe-t-il un élément neutre pour la division \( \div \) sur l'ensemble \( \mathbb{N} \) des entiers naturels ?

<details>
  <summary>Réponse</summary>
  Non, car malgré que pour tout \( n \) élément de \( \mathbb{N} \) on ait \( n \div 1 = n \), on n'a \( 1 \div n = n \) que si \( n \) vaut 1.
</details>

Soit \( (E, T) \) un ensemble \( E \) muni d’une loi interne \( T \).

On a les propriétés suivantes :

##### 1.4.1.3. Associativité

La loi \( T \) est associative si pour tous éléments \( a, b \) et \( c \) de \( E \), \( (a T b) T c = a T (b T c) = a T b T c \).

> **Exemple** : l'addition \( + \) est associative sur \( \mathbb{N} \).

##### 1.4.1.4. Commutativité

La loi \( T \) est commutative si pour tous éléments \( a \) et \( b \) de \( E \), \( a T b = b T a \).

> **Exemple** : l'addition \( + \) est commutative sur \( \mathbb{N} \).

##### 1.4.1.5. Symétrie

Deux éléments \( a \) et \( b \) sont symétriques pour \( T \) si \( a T b = b T a = e \) (\( e \) étant l'élément neutre de \( E \) pour la loi \( T \)). Si tout élément de \( E \) admet un symétrique pour la loi \( T \), on dit que la loi \( T \) est symétrisable.

##### 1.4.1.6. Distributivité

\( T \) est distributive à gauche par rapport à une autre loi \( \perp \) si pour tous éléments \( a, b, c \) de \( E \),

\[
a T (b \perp c) = (a T b) \perp (a T c)
\]

\( T \) est distributive à droite par rapport à une autre loi \( \perp \) si pour tous éléments \( a, b, c \) de \( E \),

\[
(b \perp c) T a = (b T a) \perp (c T a)
\]

\( T \) est distributive pour \( \perp \) si et seulement si elle est distributive à gauche et à droite par rapport à \( \perp \).

La multiplication \( \times \) dans \( \mathbb{N} \) est distributive par rapport à l'addition \( + \) dans \( \mathbb{N} \).

Dans la suite, on appellera opération les lois de composition dans l’ensemble \( \mathbb{N} \) des entiers naturels. On note \( \mathbb{N}^* \) l’ensemble \( \mathbb{N} \) privée du singleton \( \{0\} \). \( \mathbb{N}^* = \mathbb{N} \setminus \{0\} \).

L’addition \( + \) et la multiplication \( \times \) usuelles sont des opérations internes sur \( \mathbb{N} \). C’est-à-dire que \( \mathbb{N} \) est stable par chacune de ces opérations.

La soustraction \( - \) et la division \( \div \) usuelles ne sont pas des opérations internes dans \( \mathbb{N} \). C’est le besoin d’avoir des ensembles stables pour ces opérations qui ont guidé le développement de nouveaux ensembles de nombres. Ainsi, l’ensemble des entiers rationnels (termes que nous privilégions à entiers relatifs) \( \mathbb{Z} \) est construit par symétrisation de \( \mathbb{N} \); c’est-à-dire que \( \mathbb{Z} \) est construit de telle sorte que le symétrique par \( + \) d’un entier naturel \( n \) soit dans \( \mathbb{Z} \). \( \mathbb{Q} \), l’ensemble des nombres rationnels, est construit sur la base d’une relation d’équivalence définie sur \( \mathbb{Z} \) par \( (a, b) R (c, d) \) ssi \( a \times d = b \times c \); on note \( a / b = c / d \). De façon générale, si \( x \) et \( y \) sont deux entiers rationnels, \( x / y \) définit un nombre rationnel si \( y \neq 0 \); \( x \) est le numérateur et \( y \) est le dénominateur.

Soit \( x / y \) un nombre rationnel. Si \( x / y \) peut s’écrire sous la forme \( a / b \) où \( a \) est un entier rationnel et \( b \) une puissance de 10 (\( \exists k \in \mathbb{N} \) tel que \( b = 10^k \)), alors \( x / y \) est un nombre décimal. On note \( \mathbb{D} \) l'ensemble des nombres décimaux.

Disposant de \( \mathbb{Q} \), on peut construire l’ensemble des nombres réels en utilisant les coupures de \( \mathbb{Q} \), notion due à Cantor et Dedekind. Par exemple, soit \( C_1 = \mathbb{Q}^- \cup \{ a \in \mathbb{Q}^+ \mid a^2 < 2 \} \) et \( C_2 = \{ a \in \mathbb{Q}^+ \mid a^2 > 2 \} \). \( C_1 \) et \( C_2 \) sont deux coupures de \( \mathbb{Q} \) qui définissent le nombre \( \sqrt{2} \).

\[
\sqrt{2} \notin \mathbb{Q} \text{ et } \sqrt{2} \in \mathbb{R}.
\]

On peut, avec cette méthode de coupure, définir n'importe quel nombre réel. On pose souvent \( \mathbb{I} = \mathbb{R} \setminus \mathbb{Q} \). On a les inclusions suivantes :

\[
\mathbb{N} \subset \mathbb{Z} \subset \mathbb{D} \subset \mathbb{Q} \subset \mathbb{R}.
\]

Soit \( a \in \mathbb{Z} \) et \( b \in \mathbb{Z}^* \). Il existe un unique couple d’entiers rationnels \( (q, r) \in \mathbb{Z} \times \mathbb{N} \) tel que \( a = b \times q + r \) avec \( 0 \leq r < |b| \). On dit dans ces conditions que \( q \) est le quotient et \( r \) est le reste de la division euclidienne de \( a \) par \( b \); \( a \) est le dividende et \( b \) est le diviseur. On peut restreindre cette définition à \( \mathbb{N} \) en remplaçant \( \mathbb{Z} \) par \( \mathbb{N} \). On parle alors de division euclidienne dans \( \mathbb{N} \). On dit que \( b \) divise \( a \) ou que \( b \) est un diviseur de \( a \) lorsque \( r \) vaut 0.

##### 1.4.1.6. Nombre pair / impair

Soit \( n \in \mathbb{Z} \). \( n \) est un nombre pair ssi \( n \) est divisible par 2. 0 est un nombre pair. Un nombre qui n'est pas pair est impair. On note parfois \( 2\mathbb{Z} \) (respectivement \( 2\mathbb{Z} + 1 \)) l'ensemble des nombres entiers rationnels pairs (respectivement impairs).

Remarques : si on remplace dans cette définition \( \mathbb{Z} \) par \( \mathbb{N} \), alors on obtient qu’un entier naturel \( n \in \mathbb{N} \) est pair ssi \( n \) est divisible par 2. Les entiers naturels pairs sont ceux dont le chiffre des unités est pair. Les entiers naturels impairs sont ceux dont le chiffre des unités est impair.

##### 1.4.1.7. Nombre premier

Soit \( n \in \mathbb{Z} \). \( n \) est un nombre premier ssi \( n \) a exactement quatre diviseurs : \( -1, 1, -n \) et \( n \). 0 et 1 ne sont pas des nombres premiers. 2 est un nombre premier.

Remarque : si on remplace dans cette définition \( \mathbb{Z} \) par \( \mathbb{N} \), alors on obtient qu’un entier naturel \( n \in \mathbb{N} \) est premier ssi \( n \) a exactement deux diviseurs : 1 et \( n \).

##### 1.4.1.8. Grammaire du nombre

Soit \( V_N = \{0, 1, 2, 3, 4, 5, 6, 7, 8, 9\} \). On peut générer les entiers naturels selon la règle suivante :

- Tout élément de \( V_N \) est un nombre entier naturel.
- Si \( a \) et \( b \) sont des nombres entiers naturels, alors \( ab \) est un nombre entier naturel si \( a \neq 0 \).

Les éléments de \( V_N \) sont aussi appelés les chiffres.

\[
V_Z = V_N \cup \{-, +\}
\]

- Tout entier naturel est un entier rationnel.
- Si \( a \) est un entier naturel, \( -a \) et \( +a \) sont des entiers rationnels.
- Tout entier rationnel est un nombre rationnel.
- Si \( a \) et \( b \) sont des entiers rationnels, \( a, b \) est un nombre rationnel ; de plus, si \( b \neq 0 \), \( \frac{a}{b} \) est un nombre rationnel.
- Si \( a \) et \( b \) sont des nombres rationnels, \( \frac{a}{b} \) est aussi un nombre rationnel si \( b \neq 0 \).

Les opérations \( + \) et \( \times \) sont associatives et commutatives. Les opérations \( \times \) et \( \div \) sont distributives par rapport aux opérations \( - \) et \( + \).

Lors de la simplification des expressions algébriques, il faut aller de la gauche vers la droite, et en calculant d’abord toutes les expressions entre parenthèses \( () \) ou tout autre signe qui tient lieu de parenthèses (ça peut être des crochets \( [] \) ou plus rarement des accolades \( \{\} \)). Les parenthèses ont donc toujours la plus grande priorité.

Le tableau ci-dessous donne les règles de priorité.

| Règles de priorité | Opérations | Abréviations |
|--------------------|------------|--------------|
| 1. L’intérieur des parenthèses doit être calculé. Lorsqu’il y a parenthèses, crochets et accolades, il faut simplifier prioritairement l’opération en débutant par les parenthèses intérieures : solutionner de l’intérieur vers l’extérieur. | Parenthèses (ou assimilées) | P |
| 2. Les nombres affectés d’exposants doivent être évalués. | Exponentiation | E |
| 3. Les divisions et les multiplications doivent être calculées. Ces deux opérations ont la même priorité. Elles sont évaluées dans l’ordre où elles apparaissent dans l’expression numérique établie, en se référant à la convention d’écriture indiquée plus loin. | Divisions<br>Multiplications | D<br>M |
| 4. Finalement, les additions et les soustractions doivent être calculées. Ces deux opérations ont la même priorité. Elles sont évaluées à partir de la gauche de l’expression numérique en allant vers la droite (convention d’écriture). | Additions<br>Soustractions | A<br>S |

On peut se rappeler cet ordre de priorité avec l'acronyme mnémonique PEDMAS.

Dans l'ensemble \( \mathbb{R} \) des nombres réels, deux éléments de \( \mathbb{R} \) symétriques pour l'addition sont plus communément appelés opposés. Pour la multiplication, on parle d'inverses.

## 2. Notion de variables et fonctions élémentaires sur les nombres

Pour aborder la notion de variable et les fonctions élémentaires sur les nombres, il est essentiel de comprendre le cadre des fonctions mathématiques. Une fonction est une relation qui associe à chaque élément d’un ensemble de départ, appelé domaine, un unique élément d’un ensemble d’arrivée, appelé codomaine. Les nombres, qu’ils soient entiers, rationnels ou réels, forment souvent ces ensembles. Les fonctions élémentaires, comme les fonctions linéaires, polynomiales ou trigonométriques, sont construites à partir d’opérations simples (addition, multiplication, etc.) et jouent un rôle fondamental en mathématiques. L’introduction de la notion de variable permet de généraliser et de formaliser la description de ces fonctions, en représentant de manière abstraite les éléments du domaine. Ce formalisme est au cœur de l’étude des fonctions et de leurs propriétés.

### 2.1. La notion de variable

Soit \( E \) et \( F \) deux ensembles, \( f \) une fonction de \( E \) vers \( F \). En général, \( f \) est donnée par une expression qui permet de déterminer l’image d’un élément \( e \) quelconque de \( E \). Cela se fait en remplaçant dans l’expression de \( f \) certains symboles par l’élément \( e \) en question. Supposons par exemple \( E = F = \mathbb{R} \) et \( f \) la fonction qui à un nombre réel associe son produit par une constante \( a \) et ajoute à ce produit une constante \( b \). On a par exemple \( f(2) = a \times 2 + b \). Ce qui change dans le calcul de l’image d’un élément quelconque, ce ne sont pas les constantes \( a \) et \( b \) qui sont fixées une fois pour toutes pour la fonction \( f \), mais la valeur de l’élément. Il est commode de représenter cet état de chose par un symbole auquel on substitue l’élément quand celui-ci devient connu. Ce symbole est donc la variable associée à la fonction. Dans le cas de la fonction \( f \) ci-dessus, on écrira \( f(t) = a \times t + b \). Et \( t \) est la variable dans cette expression. Cette variable représente les éléments de l’ensemble de départ. C’est elle qui varie quand on passe d’un élément à un autre, on dit qu’elle parcourt l’ensemble de départ, ou plus exactement le domaine de définition de la fonction. Il est à noter que ce formalisme permet de décrire \( f \) et de connaître ses propriétés mathématiques sans avoir besoin de calculer l’image de chaque élément de \( E \).

Cette notion de variable en mathématique est assez proche de la notion de variable en informatique, tout comme l’est aussi la notion de fonction. Ainsi, on peut remarquer que donner une valeur à une variable (en mathématique) est similaire à affecter une valeur à une variable (en informatique).

Il convient aussi de bien remarquer que, même sans explicitement donner des valeurs à \( a \) et \( b \) dans la fonction \( f \) ci-dessus, nous savons que ces symboles représentent des constantes. Mais pour calculer la valeur (réelle) de l’image par \( f \) d’un nombre réel, nous avons nécessairement besoin, à ce moment-là, de connaître les valeurs de ces symboles qui sont constantes et ne changeront donc plus une fois fixées. Là encore, on peut remarquer que cette notion de constante en mathématique est assez proche de la notion de constante en informatique.

### 2.2. Fonctions numériques élémentaires usuelles

Tableau 3 : Fonctions numériques élémentaires usuelles

| Nom | Expression | Principales propriétés | Exemples d'expressions       |
|-----|------------|------------------------|------------------------------|
| Fonction puissance | \( f_a(x) = x^a \) | Partout où \( f_a \) et \( f_b \) ont à la fois un sens et sont à la fois définies, on a \( f_{a+b} = f_a \times f_b \).<br><br>Si \( a \in \mathbb{N} \), \( f_a \) est définie sur \( \mathbb{R} \).<br><br>Si \( a \in \mathbb{Z} \), et \( a < 0 \), \( f_a \) est définie sur \( \mathbb{R}^* \).<br><br>Si \( a \in \mathbb{Q} \), il faut distinguer deux cas :<br>- Si \( a = p/q \) avec \( q \) pair, alors \( f_a \) est définie sur \( \mathbb{R}^+ \) si \( a \geq 0 \) et sur \( \mathbb{R}^{*+} \) si \( a < 0 \).<br>- Si \( a = p/q \) avec \( q \) impair, alors \( f_a \) est définie sur \( \mathbb{R} \) si \( a \geq 0 \) et sur \( \mathbb{R}^* \) si \( a < 0 \).<br><br>Pour tout autre cas, \( f_a \) n’a de sens que si \( a \geq 0 \) et n’est définie que sur \( \mathbb{R}^{*+} \); on a alors \( f(x) = e^{a \ln x} \). | \( f(x) = x^4 \)<br>\( f(x) = x^{1/3} \)<br>\( f(x) = x^{1/2} \). |
| Fonction exponentielle | \( f(x) = e^x \) | \( f(x) \times f(y) = f(x + y) \). \( f \) est définie sur \( \mathbb{R} \). | |
| Fonction exponentielle de base \( a \) | \( f_a(x) = a^x \) | \( f_a \) n’a de sens que si \( a > 0 \). On a alors \( f_a(x) \times f_a(y) = f_a(x + y) \) et \( f_a \) est définie sur \( \mathbb{R} \). | \( f(x) = 4^x \) |
| Fonction logarithme | \( f(x) = \ln(x) \) | \( f(x \times y) = f(x) + f(y) \). \( f \) est définie sur \( \mathbb{R}^{*+} \). | |
| Fonction logarithme de base \( a \) | \( f_a(x) = \frac{\ln(x)}{\ln(a)} \) | \( f_a \) a un sens ssi \( a > 1 \). Si \( a = 10 \), \( f_a \) est le logarithme décimal, et noté simplement \( \log \). \( f_a \) est définie sur \( \mathbb{R}^{*+} \) là où elle a un sens (\( a > 1 \)). On a \( f_a(x \times y) = f_a(x) + f_a(y) \). | |

### 2.3. Suites et séries numériques réelles

Une suite numérique réelle est une application \( u : \mathbb{N} \to \mathbb{R} \), \( n \mapsto u(n) \). On note souvent \( u(n) \), l'image par \( n \) de \( u \), plus simplement \( u_n \). La suite \( u \) est souvent notée \( (u_n)_{n \in \mathbb{N}} \).

Le terme \( u_n \) s'appelle le terme général de la suite. Il arrive quelquefois qu'une suite soit définie seulement sur une partie de \( \mathbb{N} \). Dans ce cas, on considère qu'elle est définie partout sur \( \mathbb{N} \) et qu'elle est nulle pour les termes pour lesquels elle n'est pas explicitement définie. Par exemple, si on considère la suite \( u \) définie par \( u_n = 1/n \) pour \( n > 0 \) sans d'autres précisions, on peut toujours supposer que \( u_0 = 0 \). Une suite n'est intéressante que s'il y a une façon de déterminer, pour un entier \( n \) quelconque, le terme \( u_n \) de la suite; on parle alors de suite logique. Une suite logique peut être donnée par une expression de \( u_n \) en fonction de \( n \); \( u_n = f(n) \) où \( f \) est une fonction avec \( D_f = \mathbb{N} \). Une suite logique peut être donnée par une relation entre les termes de la suite. Par exemple, \( u_n \) peut être une fonction de \( u_{n-1} \); \( u_n = f(u_{n-1}) \) où \( f \) est une fonction et il y a au moins un terme de la suite connu (il existe \( n_0 \) tel que \( u_{n_0} \) soit connu); dans ce cas, on parle de suite récurrente.

Un exemple de suite est (suite de Fibonacci) \( u_0 = 0 \), \( u_1 = 1 \) et \( u_n = u_{n-1} + u_{n-2} \) pour \( n \geq 2 \).

Soit \( (u_n)_{n \in \mathbb{N}} \) une suite. On appelle série numérique réelle de terme général \( u_n \), que l'on note \( \sum u_n \), la suite des sommes partielles \( (S_n)_{n \in \mathbb{N}} \), où pour tout \( n \in \mathbb{N} \),

\[
S_n = \sum_{k=0}^n u_k.
\]

Par exemple, la série de terme général \( u_n = 1/n \) si \( n \geq 1 \) est définie par

\[
S_n = \sum_{k=1}^n \frac{1}{k}.
\]

### 2.4. Matrices réelles

Soient \( I \) et \( J \) deux ensembles. On appelle matrice à coefficients réels ou encore matrice réelle toute application \( f : I \times J \to \mathbb{R} \). Si l’on confond \( f \) à son image, alors on peut légitimement représenter une matrice \( f \) de type \( I \times J \) par une famille \( (f(i, j))_{(i, j) \in I \times J} \). On pose plus simplement \( f(i, j) = f_{ij} \) et les \( f_{ij} \) sont appelés coefficients de la matrice. Un cas particulier important, lorsque \( I = \{1, 2, \dots, m\} \) et \( J = \{1, 2, \dots, n\} \), on dit que \( f \) est une matrice de type \( (m, n) \). Il est alors commode de représenter \( f \) par un tableau rectangulaire du type

\[
f = \begin{pmatrix}
a_{11} & a_{12} & \dots & a_{1n} \\
a_{21} & a_{22} & \dots & a_{2n} \\
\vdots & \vdots & \ddots & \vdots \\
a_{m1} & a_{m2} & \dots & a_{mn}
\end{pmatrix}
\]

où \( f_{ij} = a_{ij} \).

Lorsque \( m = n \), la matrice \( f \) est dite carrée. Les termes \( a_{11}, a_{22}, \dots, a_{nn} \) sont appelés les termes diagonaux.
Une matrice carrée est dite triangulaire supérieure (respectivement inférieure) si les termes situés en dessous (respectivement au-dessus) de la diagonale sont tous nuls.
On a respectivement \( A = (a_{ij}) \) avec \( 1 \leq i \leq n \), \( 1 \leq j \leq n \) et \( a_{ij} = 0 \) si \( i > j \) (respectivement \( i < j \)).

> **Exemple** : \( A = \begin{pmatrix} 1 & 2 & 0 & 0 \\ 0 & 2 & 0 & 0 \\ 0 & 0 & 0 & 0 \\ 0 & 0 & 0 & 0 \end{pmatrix} \), \( B = \begin{pmatrix} 1 & 0 & 0 & 0 \\ 2 & 0 & 0 & 0 \\ 0 & 0 & 0 & 0 \\ 0 & 0 & 0 & 0 \end{pmatrix} \), alors \( A \) est triangulaire supérieure et \( B \) est triangulaire inférieure.

Une matrice carrée est diagonale si elle est à la fois triangulaire supérieure et triangulaire inférieure. \( A = (a_{ij}) \) avec \( 1 \leq i \leq n \), \( 1 \leq j \leq n \) et \( a_{ij} = 0 \) si \( i \neq j \).

Dans la suite, on désigne par \( M_{m,n}(\mathbb{R}) \) l’ensemble des matrices à \( m \) lignes et \( n \) colonnes à coefficients réels.

#### 2.4.1. Addition de deux matrices

Soit \( A = (a_{ij}) \) avec \( 1 \leq i \leq m \), \( 1 \leq j \leq n \) et \( B = (b_{ij}) \) avec \( 1 \leq i \leq m \), \( 1 \leq j \leq n \) deux éléments de \( M_{m,n}(\mathbb{R}) \). On définit la somme \( C \) de \( A \) et de \( B \) par :

\[
C = A + B \text{ et } C = (c_{ij}) \text{ avec } 1 \leq i \leq m, 1 \leq j \leq n \text{ tels que } c_{ij} = a_{ij} + b_{ij}.
\]

\( C \in M_{m,n}(\mathbb{R}) \).

#### 2.4.2. Produit de deux matrices

Soient \( A \in M_{m,n}(\mathbb{R}) \) avec \( 1 \leq i \leq m \), \( 1 \leq j \leq n \) et \( B \in M_{n,p}(\mathbb{R}) \) avec \( 1 \leq i \leq n \), \( 1 \leq j \leq p \).

Le produit \( C = (c_{ij}) \) avec \( 1 \leq i \leq m \), \( 1 \leq j \leq p \) de \( A \) et de \( B \) est la matrice définie par

\[
c_{ij} = \sum_{k=1}^n a_{ik} b_{kj}
\]

> **Exemple** : \( A = \begin{pmatrix} 1 & 2 & 3 \end{pmatrix} \) et \( B = \begin{pmatrix} 1 \\ 2 \\ 3 \end{pmatrix} \), \( A \times B = 14 \) et \( B \times A = \begin{pmatrix} 1 & 2 & 3 \\ 2 & 4 & 6 \\ 3 & 6 & 9 \end{pmatrix} \).

#### 2.4.3. Transposition

Soit \( A \in M_{m,n}(\mathbb{R}) \). \( A = (a_{ij}) \) avec \( 1 \leq i \leq m \), \( 1 \leq j \leq n \). On appelle transposée de \( A \) la matrice \( A^\top \in M_{n,m}(\mathbb{R}) \) définie par \( A^\top = (b_{ij}) \) où \( b_{ij} = a_{ji} \).

> **Exemple** : \( A = \begin{pmatrix} 1 & 2 & 3 \end{pmatrix} \) et \( B = \begin{pmatrix} 1 \\ 2 \\ 3 \end{pmatrix} \), alors \( A^\top = B \) et \( B^\top = A \).

Remarque : la transposée de la transposée d'une matrice est égale à cette matrice.

## 3. Variable aléatoire et fonction de variable aléatoire

Dans l’étude des probabilités, les phénomènes aléatoires occupent une place centrale, et leur analyse repose sur des outils mathématiques spécifiques. Un phénomène aléatoire est un événement dont l’issue n’est pas déterminée à l’avance, mais qui peut être décrite par un ensemble de résultats possibles, appelé univers ou espace des événements. Pour quantifier et modéliser ces résultats, on introduit la notion de variable aléatoire, qui permet d’associer des valeurs numériques aux issues d’un phénomène aléatoire. Cette approche facilite l’étude des propriétés statistiques et des comportements probables d’un système. Les variables aléatoires, qu’elles soient discrètes ou continues, sont au cœur des calculs probabilistes et servent de base à la définition de concepts plus avancés, comme les fonctions de variables aléatoires.

### 3.1. Variable aléatoire

Toute mesure d’une grandeur \( X \) dans un univers \( \Omega \) dont les valeurs dépendent du hasard est dite variable aléatoire. On distingue en général deux types de variable aléatoire : le type discret et le type continu.

#### 3.1.1. Variable aléatoire discrète

Une variable aléatoire \( X \) est dite discrète lorsque son ensemble de définition, c’est-à-dire l’ensemble de ses valeurs possibles noté \( X(\Omega) \), est un ensemble fini. Un élément de \( X(\Omega) \) est appelé un évènement élémentaire. Pour une variable aléatoire discrète \( X \), on définit les notions suivantes :

##### 3.1.1.1. Loi de probabilité

On appelle loi de probabilité ou encore loi de distribution de la variable aléatoire \( X \) la fonction définie par \( p : X(\Omega) \to [0, 1] \), \( x_i \mapsto p(X = x_i) = p_i \) où \( x_i \in X(\Omega) \). On rappelle que

1. \( \forall i, p_i \geq 0 \);
2. \( \sum_{x_i \in X(\Omega)} p_i = 1 \).

> **Exemple** : Une plante peut avoir de 0 à 4 fleurs avec les probabilités suivantes :

Tableau 4 : Exemple de distribution de probabilité

| Nombre de fleurs \( x_i \) | 0 | 1 | 2 | 3 | 4 |
|----------------------------|---|---|---|---|---|
| Probabilité \( p_i \)      | 2k | 1/8 | 1/8 | 3/8 | k |

Question : calculer \( k \) pour que ce tableau corresponde à une distribution de probabilité.

<details>
  <summary>Réponse</summary>
  \( k = 1/8 \) car la somme des probabilités doit donner 1.
</details>

##### 3.1.1.2. Fonction de répartition

On appelle fonction de répartition ou fonction cumulative de la variable aléatoire \( X \) la fonction \( F \) définie par \( F : X(\Omega) \to [0, 1] \), \( x_i \mapsto F(x_i) = p(X < x_i) = \sum_{x_j < x_i} p(X = x_j) \).

Remarque : certains ouvrages définissent \( F \) par \( F(x_i) = p(X \leq x_i) \).

Parmi les lois de probabilités discrètes, on peut citer : la loi uniforme sur \( [1, n] \). Elle est donnée par \( p(X = x) = 1/n \) avec \( x \in \{1, \dots, n\} \), la loi de Bernoulli de paramètre \( p \). Elle est donnée par \( p(X = x) = p^x q^{1-x} \) avec \( p + q = 1 \) et \( x \in \{0, 1\} \). Elle correspond au schéma succès/échec avec une probabilité de succès \( p \).

Étant données deux variables aléatoires \( X \) et \( Y \), on peut définir une variable aléatoire \( Z = (X, Y) \). \( Z \) est appelé variable aléatoire à deux dimensions ou couple de variables aléatoires.

Étant donnée une variable aléatoire \( X \) et une fonction \( g \) quelconque, on peut définir une autre variable aléatoire \( Y \) par \( Y = g(X) \). La détermination de la loi de \( Y \) se fait alors en prenant en considération la loi de \( X \) et le comportement de la fonction \( g \).

On peut utiliser une loi de probabilité connue pour, par exemple, générer des nombres aléatoires. Toutefois, il convient de noter qu'en raison du caractère déterministe des algorithmes informatiques, les nombres générés par les programmes informatiques sont pseudo-aléatoires.

## Annexe

Tableau 5 : Quelques abréviations et symboles usuels, ainsi que leur signification

| Symbole | Description | Exemple |
|---------|-------------|---------|
| ssi | Si et seulement si. Placé après une expression propositionnelle, exprime une condition nécessaire et suffisante pour que cette expression propositionnelle soit vraie. | Un nombre entier est pair ssi son dernier chiffre est pair. |
| \( \sum_{i=p}^n \) | Sommation de \( n - p + 1 \) termes indexés par \( i \), et \( i \) variant de \( p \) à \( n \). | \( \sum_{i=1}^n i \) désigne la somme des \( n \) premiers entiers naturels. Il convient alors de remarquer que le résultat de cette somme est identique à \( \sum_{i=0}^n i \) mais la sommation est différente puisque les deux sommations ont un nombre de termes différents. On peut avoir une double, une triple,... sommation avec deux, trois... indices \( ij \), \( ijk \),... chacun des indices variant à son tour. |
| \( \leq \) | Placé entre des termes, ce symbole signifie que le membre de gauche est plus petit ou égal au membre de droite (usage restreint). Mais plus généralement, il signifie que le membre de gauche est en relation avec le membre de droite ou lui est égal (usage élargi). | Pour l'ordre naturel sur l'ensemble des entiers naturels \( \mathbb{N} \), \( 1 \leq 2 \) et \( 2 \leq 2 \). Pour la relation de divisibilité dans \( \mathbb{N} \), c'est-à-dire \( a \) en relation avec \( b \) ssi \( a \) divise \( b \); \( 2 \leq 4 \) et \( 2 \leq 2 \), mais on ne peut pas comparer 2 et 5. |
| \( \geq \) | Placé entre des termes, ce symbole signifie que le membre de gauche est plus grand ou égal au membre de droite (usage restreint). Mais plus généralement, il signifie que le membre de gauche est en relation avec le membre de droite ou lui est égal (usage élargi). | Pour l'ordre naturel sur l'ensemble des entiers naturels \( \mathbb{N} \), \( 2 \geq 1 \) et \( 2 \geq 2 \). Pour la relation de divisibilité dans \( \mathbb{N} \), c'est-à-dire \( a \) en relation avec \( b \) ssi \( a \) divise \( b \); \( 4 \geq 2 \) et \( 2 \geq 2 \), mais on ne peut pas comparer 5 et 2. |
| \( < \) | Placé entre des termes, ce symbole signifie que le membre de gauche est strictement plus petit que le membre de droite (usage restreint). Mais plus généralement, il signifie que le membre de gauche est en relation avec le membre de droite et lui est différent (usage élargi). | Pour l'ordre naturel sur l'ensemble des entiers naturels \( \mathbb{N} \), \( 1 < 2 \). Pour la relation de divisibilité dans \( \mathbb{N} \), c'est-à-dire \( a \) en relation avec \( b \) ssi \( a \) divise \( b \); \( 2 < 4 \), mais on ne peut pas comparer 2 et 5. |
| \( > \) | Placé entre des termes, ce symbole signifie que le membre de gauche est strictement plus grand que le membre de droite (usage restreint). Mais plus généralement, il signifie que le membre de gauche est en relation avec le membre de droite et lui est différent (usage élargi). | Pour l'ordre naturel sur l'ensemble des entiers naturels \( \mathbb{N} \), \( 2 > 1 \). Pour la relation de divisibilité dans \( \mathbb{N} \), c'est-à-dire \( a \) en relation avec \( b \) ssi \( a \) divise \( b \); \( 4 > 2 \), mais on ne peut pas comparer 5 et 2. |
| \( \forall \) | Quantificateur universel. \( \forall a \) se lit pour tout \( a \)... | \( \forall a \in \mathbb{N}, a \geq 0 \) pour tout élément \( a \) de l'ensemble \( \mathbb{N} \), \( a \) est supérieur ou égal à 0. |
| \( \exists \) | Quantificateur existentiel. \( \exists a \) se lit il existe au moins un \( a \)... | \( \exists a \in \mathbb{N} \) tel que \( a \neq 0 \), il existe au moins un élément \( a \) de l'ensemble \( \mathbb{N} \) qui est différent de 0. |
| \( \in \) | C'est le symbole d'appartenance. \( a \in A \) signifie que \( a \) est un élément de l'ensemble \( A \). | Utilisé après un quantificateur, et une suite de symboles, il signifie que ces symboles sont éléments de l'ensemble qui suit. Par exemple : \( \forall a, b, c \in \mathbb{N} \) signifie pour tous éléments \( a, b \) et \( c \) de \( \mathbb{N} \). |
| \( \notin \) | C'est le symbole de non-appartenance. \( a \notin A \) signifie que \( a \) n'est pas un élément de l'ensemble \( A \). | \( -1 \notin \mathbb{N} \). |
| \( \subseteq \) | Placé entre deux ensembles, signifie que l'ensemble de gauche est inclus dans l'ensemble de droite ou lui est égal. | Si \( A \) et \( B \) sont deux ensembles, \( A \subseteq A \cup B \). |
| \( \subset \) | Placé entre deux ensembles, signifie que l'ensemble de gauche est strictement inclus dans l'ensemble de droite (et donc en est différent). | \( \mathbb{N} \subset \mathbb{Z} \). |
| \( \Rightarrow \) | Implication logique. Placé entre deux propositions, ce symbole indique que la proposition de gauche implique celle de droite. | \( p \Rightarrow q \) est faux ssi \( p \) est vrai et \( q \) faux. |
| \( \| \cdot \| \) | Valeur absolue. Si \( a \) est placé entre les deux barres, le résultat est le nombre positif \( a \) si \( a \) est positif et \( -a \) si \( a \) est négatif. \( |a| = a \) si \( a \geq 0 \) et \( |a| = -a \) si \( a \leq 0 \). | \( |-2| = |2| = 2 \). |



