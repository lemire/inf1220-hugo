---
title: "Rappel mathématique"
weight: 10
---

<div style="margin-left: 10px;">

<h1 id="h1sect1">1. Les propositions, les ensembles, les relations et les
nombres.</h1>

<p>Avant de commencer, il est conseillé, pour se familariser avec certaines
notations, de jeter un coup d'oeil sur le <a href="#tabannex">tableau des
symboles et abréviations usuels.</a> </p>

<p></p>
<h2>1.1. Les propositions</h2>

<p>Une proposition mathématique est un énoncé dont on peut dire sans ambiguïté
si elle est vraie ou si elle fausse. Le processus qui consiste à déterminer si
une proposition mathématique est vraie ou fausse est l&#x2019;objet du calcul
propositionnel ou calcul des propositions et fait partie de la logique
mathématique. Le résultat d&#x2019;un calcul propositionnel est donc
l&#x2019;attribution d&#x2019;une valeur de vérité à une proposition.</p>

<p>Ainsi, l'énoncé « Le cours INF1220 figure parmi les cours dispensés à la
TELUQ au trimestre d&#x2019;hiver 2021 » est une proposition mathématique et sa
valeur de vérité est « vrai ». la proposition «Le cours INF1220 est mon
meilleur cours » n'est pas une proposition mathématique. Dans notre contexte,
quand nous parlons de proposition, nous parlons de proposition mathématique.</p>

<h5>1.1.1. Table des valeurs de vérités des propositions</h5>
Tableau 1: Table de vérités et connecteurs logiques

| p | q | non p | p ou (inclusif) q | p ou (exclusif) q | p et q | p⇒q (p implique q) | p⇔q (p équivaut à q) |
|---|---|-------|-------------------|-------------------|--------|--------------------|----------------------|
| V | V | F     | V                 | F                 | V      | V                  | V                    |
| V | F | F     | V                 | V                 | F      | F                  | F                    |
| F | V | V     | V                 | V                 | F      | V                  | F                    |
| F | F | V     | F                 | F                 | F      | V                  | V                    |

<h2>1.2. Les ensembles</h2>


<p>Un ensemble est une collection d&#x2019;objets. Si on appelle E cette
collection, alors pour chacun de ces objets, on peut affirmer qu&#x2019;il
appartient à E.</p>

<p>On peut déterminer E en énumérant ses éléments, par exemple
E={<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>o</mi>
    <mn>1</mn>
  </msub>
</math>,<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>o</mi>
    <mn>2</mn>
  </msub>
</math>,&#x2026;} où <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>o</mi>
    <mi>i</mi>
  </msub>
</math>est un des objets de la collection (et où on admet que pour tout objet
de la collection, il y a un <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>o</mi>
    <mi>i</mi>
  </msub>
</math>qui lui soit identique). On dit alors qu&#x2019;on a défini E en
extension.</p>

<p>Un objet <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>o</mi>
    <mi>i</mi>
  </msub>
</math> est appelé un élément de E. On note
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>o</mi>
    <mi>i</mi>
  </msub>
</math>&#x2208;E.</p>

<p>Étant donné un objet arbitraire, c&#x2019;est-à-dire une chose quelconque,
on est capable de dire si oui ou non cette chose appartient à E. si nous notons
la chose en question o et qu&#x2019;elle n&#x2019;appartient pas à E, nous
traduisons cela par o&#x2209;E. </p>

<p>Une autre façon de déterminer un ensemble est de donner une propriété qui
caractérise ses éléments. Par exemple, la collection de toutes les personnes
qui sont inscrites à la TELUQ pour suivre le cours INF1220 pour le trimestre
d&#x2019;hiver 2021 à la date du 1er mars 2021 est un ensemble. Nous pouvons le
noter T. on convient dans ce cas d&#x2019;écrire T={o&#x2215;o est inscrit à la
TELUQ pour suivre le cours INF1220 pour le trimestre d&#x2019;hiver 2021 à la
date du 1er mars 2021}. Le symbole / (ou |) se lit « tel que ». « être inscrit
à la TELUQ pour suivre le cours INF1220 pour le trimestre d&#x2019;hiver 2021 à
la date du 1er mars 2021 » est la propriété caractéristique de
l&#x2019;ensemble T (ou des éléments de cet ensemble).</p>

<p>Les nombres entiers positifs forment un ensemble ; c&#x2019;est
l&#x2019;ensemble des entiers naturels. On le note N. N={0,1,&#x2026;..}</p>

<p>Un ensemble peut être fini, comme l&#x2019;ensemble T. Un ensemble peut être
infini, comme l&#x2019;ensemble N. On admet qu&#x2019;il existe un ensemble qui
ne contient aucun élément. On appelle cet ensemble, ensemble vide. On le note
couramment {} ou &#x2205;. Un singleton est un ensemble qui a un seul élément.
On admet aussi que si l&#x2019;on ajoute un élément d&#x2019;un ensemble E à ce
même ensemble E, on ne change par l&#x2019;ensemble E. On considère de ce fait,
qu&#x2019;un ensemble est donné par une collection distincte des objets qui le
constituent, c&#x2019;est-à-dire que ses éléments sont distincts. Le nombre des
éléments d&#x2019;un ensemble est appelé le cardinal de cet ensemble. Le
cardinal de l&#x2019;ensemble vide est par définition 0.</p>

<p>Deux ensembles sont égaux s&#x2019;ils ont exactement les mêmes éléments ou
si on peut prouver qu&#x2019;ils ont exactement les mêmes éléments. Par
l&#x2019;exemple, V={o/o est inscrit à la TELUQ pour suivre le cours INF1220
pour le trimestre d&#x2019;hiver 2022 à la date du 1er mars 2021} est un
ensemble vide. En effet, il n&#x2019;y a aucune inscription pour le cours
INF1220 à la TELUQ à cette date. Cependant, dire que cet ensemble est vide ne
signifie pas qu&#x2019;il n&#x2019;existe pas. Il existe, mais il n&#x2019;a
aucun élément. V={}.</p>

<h3>1.2.1. Opération sur les ensembles</h3>

<p>Soient deux ensembles A et B.</p>

<p>L&#x2019;intersection de A et B est un ensemble formé par les éléments qui
appartiennent à la fois à A et à B. On le note A&#x2229;B.</p>

<p>La réunion de A et de B est un ensemble formé par les éléments qui
appartiennent à A ou qui appartiennent à B. On le note A&#x222a;B.</p>

<p>La différence symétrique est un ensemble formé par les éléments de A qui
n&#x2019;appartiennent pas à B . On le note A&#x2216;B.</p>

<p>Le produit cartésien de A et de B est un ensemble formé de couples (a,b)
tels que a&#x2208;A et b&#x2208;B. On le note A×B.</p>

<h2>1.3. Relation binaire</h2>

<p>Une relation binaire R est un ensemble défini par la donnée de deux
ensembles A et B et d&#x2019;une règle qui permet d&#x2019;associer certains
éléments de A à certains éléments de B. R est un sous ensemble du produit
cartésien A×B de A et de B. La règle associée à une relation est aussi appelée
lien verbal. Le lien verbal est une proposition. On peut définir une relation
en compréhension par R={(a,b)&#x2208; A×B/ le lien verbal soit vérifié pour a
et b}. Au lieu de noter (a,b)&#x2208;R, on note simplement aRb et on lit a en
relation avec b. b est l&#x2019;image de a par la relation R et a est
l&#x2019;antécédent de b pour la relation R.</p>

<h3>1.3.1. Propriété d&#x2019;une relation binaire</h3>

<p>Soit R une relation binaire. Lorsque les ensembles de départ et
d&#x2019;arrivée sont identiques, c&#x2019;est-à-dire tous égaux à A, on dit
simplement que R est une relation définie sur A.</p>

<p>Soit A un ensemble et R une relation binaire définie sur A. R peut avoir les
propriétés suivantes :</p>

<h4>1.3.1.1. Reflexivité</h4>

<p>Soit A un ensemble et R une relation définie sur A.</p>

<p>R est réflexive si &#x2200;a&#x2208;A, aRa.</p>

<p>Exemple : la relation de divisibilité R dans N (aRb ssi a divise b) est
réflexive. </p>

<p>Question : donnez un autre exemple de relation réflexive.</p>
<details>
  <summary>Réponse</summary>
  <p>La relation d'ordre naturel R sur N définie par aRb ssi a inférieur ou égal à b est réflexive.</p>
</details>

<h4>1.3.1.2. Symétrie</h4>

<p>R est symétrique ssi &#x2200;a&#x2208;A, &#x2200;b&#x2208;B,
aRb&#x21d2;bRa.</p>

<p>Exemple : soit m&#x2208;N* . La relation R définie sur N par aRb ssi a et b
ont le même reste dans la division euclidienne par m est symétrique.</p>

<h4>1.3.1.3. Transitivité</h4>

<p>R est transitive ssi pour a, b, c &#x2208;A, aRb et bRc &#x21d2; aRc. La
relation d&#x2019;ordre naturel sur N est transitive. </p>

<p>Question: Donner un autre exemple de relation transitive.</p>
<details>
  <summary>Réponse</summary>
  <p>La relation de divisibilité R dans N définie par aRb ssi a divise b est transitive.</p>
</details>

<h4>1.3.1.4. Antisymétrie</h4>

<p>R est antisymétrique ssi pour a, b &#x2208; A, aRb et bRa &#x21d2; a=b. par
exemple soit E un ensemble, et P(E) l&#x2019;ensemble des parties de E. La
relation &#x2286; sur P(E) (définie par A en relation avec B ssi A&#x2286;B)
est une relation antisymétrique. </p>

<p>Question: Donnez un autre exemple de relation antisymétrique.</p>
<details>
  <summary>Réponse</summary>
  <p>La relation R de divisibilité dans N définie par aRb ssi a divise b est antisymétrique.</p>
</details>

<h3>1.3.2. Relation d&#x2019;équivalence</h3>

<p>Soit R une relation définie sur un ensemble A. R est une relation
d&#x2019;équivalence si R est à la fois réflexive, symétrique et transitive.
Soit m&#x2208;N*. La relation R définie sur Z par aRb ssi a et b ont le même
reste dans la division euclidienne par m est une relation
d&#x2019;équivalence.</p>

<h3>1.3.3. Relation d&#x2019;ordre</h3>

<p>Soit R une relation définie sur un ensemble A. R est une relation
d&#x2019;ordre ssi elle est à la fois réflexive, transitive et
antisymétrique.</p>

<p>Par exemple soit E un ensemble, et P(E) l&#x2019;ensemble des parties de E.
La relation &#x2286; sur P(E) est une relation d'ordre.</p>

<p>Soit R une relation d&#x2019;ordre sur A, a et b sont comparable ssi aRb ou
bRa. Si &#x2200; a, b &#x2208;A ; a et b sont toujours comparables, on dit que
R est une relation d&#x2019;ordre total. S&#x2019;il existe a, b tels que a et
b ne sont pas comparables, R est une relation d&#x2019;ordre partiel. Exemple,
la relation définie sur Z par aRb si a divise b (division euclidienne) est une
relation d&#x2019;ordre partiel car on ne peut pas comparer 2 et 5. </p>

<p>Question: Donner un autre exemple de relation d&#x2019;ordre partiel.</p>
<details>
  <summary>Réponse</summary>
  <p>Si E est un ensemble ayant au moins deux éléments a et b, la relation &#x2286; sur P(E) (définie par A en relation avec B ssi A&#x2286;B) est une relation d'ordre partiel car {a} et {b} sont deux éléments de P(E) qui ne sont pas comparables par &#x2286;.</p>
</details>

<p>La relation d&#x2019;ordre définie sur Z par aRb si a inférieur ou égal à b
est une relation d&#x2019;ordre total.</p>

<p>Une fonction est une relation où chaque élément de l&#x2019;ensemble de
départ a au plus une image dans l&#x2019;ensemble d&#x2019;arrivée. Dans ce
cas, si A est l&#x2019;ensemble de départ, B l&#x2019;ensemble
d&#x2019;arrivée, et si on note f la relation, on appelle domaine de f (noté
Dom(f) ou simplement Df) l&#x2019;ensemble des éléments de A ayant une image
par f. De même on appelle image de f et on note Im(f) l&#x2019;ensemble des
éléments de B ayant au moins un antécédent dans A.</p>

<h4>1.3.3.1. Ordre lexicographique</h4>

<p>Soit V un ensemble de symboles et L un ensemble défini par :</p>

<p>si v&#x2208;V, alors v&#x2208;L;</p>

<p>si l&#x2208;L et e&#x2208;L alors el et le appartiennent à L. </p>

<p>V est appelé vocabulaire et L est l&#x2019;ensemble des mots construits sur
ce vocabulaire. Un mot l de L s&#x2019;écrit
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>v</mi>
    <mi>n</mi>
  </msub>
</math>,&#x2026;,<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>v</mi>
    <mn>0</mn>
  </msub>
</math>, où <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>v</mi>
    <mi>i</mi>
  </msub>
</math>&#x2208;V. On peut remarquer que si V est l&#x2019;ensemble des 26
lettre de l&#x2019;alphabet française, alors L est l&#x2019;ensemble des mots
possibles de la langue française (si on assimile toutes les voyelles accentuées
à leur équivalent non accentué, c&#x2019;est-à-dire qu&#x2019;on laisse tomber
les accents) ; en fait L contient tous les mots de la langue française, mais
aussi des choses comme rrrrrrrrr sont des mots de&nbsp;L.</p>

<p>Question: Que vaut L si V est l&#x2019;ensemble des chiffres de 0 à 9 ?</p>
<details>
  <summary>Réponse</summary>
  <p>Voir plus bas.</p>
</details>

<p>On suppose que V est muni d&#x2019;une relation d&#x2019;ordre total notée
&#x2264; (avec l'ordre strict noté &lt;). Soit a et b deux éléments de L tels
que a=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>m</mi>
  </msub>
</math>,&#x2026;,<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mn>0</mn>
  </msub>
</math> et b=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mi>n</mi>
  </msub>
</math>,&#x2026;,<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mn>0</mn>
  </msub>
</math>. &#x2200;i&#x2208;N, <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>i</mi>
  </msub>
</math>, <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mi>i</mi>
  </msub>
</math>&#x2208;V. On pose p=min(m,n) le plus petit des deux entiers m et n. On
définit sur L la relation R par aRb ssi
(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>m</mi>
  </msub>
</math>&lt;<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mi>n</mi>
  </msub>
</math>) ou (<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>m</mi>
  </msub>
</math>=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mi>n</mi>
  </msub>
</math> et <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mrow>
      <mi>m</mi>
      <mo>&#x2212;</mo>
      <mn>1</mn>
    </mrow>
  </msub>
</math>&lt;<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mrow>
      <mi>n</mi>
      <mo>&#x2212;</mo>
      <mn>1</mn>
    </mrow>
  </msub>
</math>) ou (<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>m</mi>
  </msub>
</math>=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mi>n</mi>
  </msub>
</math> et <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mrow>
      <mi>m</mi>
      <mo>&#x2212;</mo>
      <mn>1</mn>
    </mrow>
  </msub>
</math>=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mrow>
      <mi>n</mi>
      <mo>&#x2212;</mo>
      <mn>1</mn>
    </mrow>
  </msub>
</math>et <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mrow>
      <mi>m</mi>
      <mo>&#x2212;</mo>
      <mn>2</mn>
    </mrow>
  </msub>
</math>&lt;<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mrow>
      <mi>n</mi>
      <mo>&#x2212;</mo>
      <mn>2</mn>
    </mrow>
  </msub>
</math>) ou &#x2026;ou (<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>m</mi>
  </msub>
</math>=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mi>n</mi>
  </msub>
</math> et <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mrow>
      <mi>m</mi>
      <mo xmlns="http://www.w3.org/1998/Math/MathML">&#x2212;</mo>
      <mn>1</mn>
    </mrow>
  </msub>
</math>=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mrow>
      <mi>n</mi>
      <mo>&#x2212;</mo>
      <mn>1</mn>
    </mrow>
  </msub>
</math> et &#x2026;et <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mrow>
      <mi>m</mi>
      <mo>&#x2212;</mo>
      <mi>p</mi>
      <mo>+</mo>
      <mn>1</mn>
    </mrow>
  </msub>
</math>=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mrow>
      <mi>n</mi>
      <mo>&#x2212;</mo>
      <mi>p</mi>
      <mo>+</mo>
      <mn>1</mn>
    </mrow>
  </msub>
</math> et <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mrow>
      <mi>m</mi>
      <mo xmlns="http://www.w3.org/1998/Math/MathML">&#x2212;p</mo>
    </mrow>
  </msub>
</math>&lt;<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mrow>
      <mi>n</mi>
      <mo>&#x2212;</mo>
      <mi>p</mi>
    </mrow>
  </msub>
</math> ) ou (<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>m</mi>
  </msub>
</math> =<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mi>n</mi>
  </msub>
</math> et <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mrow>
      <mi>m</mi>
      <mo xmlns="http://www.w3.org/1998/Math/MathML">&#x2212;</mo>
      <mn>1</mn>
    </mrow>
  </msub>
</math>=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mrow>
      <mi>n</mi>
      <mo>&#x2212;</mo>
      <mn>1</mn>
    </mrow>
  </msub>
</math> et &#x2026; et <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mn>0</mn>
  </msub>
</math>=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mrow>
      <mi>n</mi>
      <mo>&#x2212;</mo>
      <mi>m</mi>
    </mrow>
  </msub>
</math> si m &#x2264; n).</p>

<p>R est une relation d&#x2019;ordre totale sur L. R qui est aussi notée
&#x2264; et prolonge la relation &#x2264; de V est appelée l&#x2019;ordre
lexicographique sur L.</p>

<p>Si V est l'ensemble des chiffres de 0 à 9, l'ensemble L contient l'ensemble
des entiers naturels N. Il faut remarquer que sur cet ensemble L ordonné par
&#x2264;, 0 est différent par exemple de 00, ce qui n'est pas le cas dans
l'ensemble N muni de la relation d'ordre "naturelle" (la relation inférieure ou
égale). </p>

<p></p>

<h2>1.4. L&#x2019;ensemble des entiers naturels N et les autres ensembles de
nombre.</h2>

<p>Il faut noter que les entiers naturels forment un ensemble particuliers.
Pour illustrer le lien étroit qu&#x2019;il y a entre la théorie des ensembles
et les entiers naturels, il faut savoir qu&#x2019;on peut construire l'ensemble
des entiers naturels en procédant comme suit : 0=&#x2205;, 1=successeur de 0,
c'est à dire 1={0}, 2=successeur de 1, c'est à dire 2={0,1}, etc.</p>

<p>Commençons par voir de façon générale les lois de composition sur un
ensemble.</p>

<h3>1.4.1. Lois de composition dans un ensemble</h3>

<p>Soit E et G deux ensembles. Une loi de composition T dans l&#x2019;ensemble
E est une fonction de E×E vers G qui à tout couple ( a, b) d'éléments de E
associe un unique élément c de G tel que c=aTb.</p>

<p>Soit E un ensemble muni d'une loi T.</p>

<h4>1.4.1.1. Ensemble stable par une loi</h4>

<p>Si &#x2200;a,b&#x2208;E, a T b &#x2208; E, alors la loi T est interne sur E.
On dit aussi que E est stable par la loi T. On note (E,T) pour signifier que E
est muni de la loi interne T.</p>

<p>Par exemple l&#x2019;addition est interne à l&#x2019;ensemble des entiers
naturels N.</p>

<h4>1.4.1.2. Élément neutre pour une loi</h4>

<p>Un élément e de E est un élément neutre pour T ssi pour tout élément a de E
, aTe=eTa=a</p>

<p style="border: 2px solid #007BFF; padding: 10px;">Exemples&nbsp;: 0 est l'élément neutre pour l'addition + sur l'ensemble N des
entiers naturels : Pour tout entier naturel n, on a n+0=0+n=n.</p>

<p>Il en est de même pour 1 qui est l'élément neutre pour la multiplication ×
sur l'ensemble N des entiers naturels : Pour tout entier naturel n, on a
n×1=1×n=n.</p>

<p></p>

<p>Question: Existe t-il un élément neutre pour la division ÷ sur l'ensemble N
des entiers naturels?</p>
<details>
  <summary>Réponse</summary>
  <p>Non car malgré que pour tout n élément de N on ait n÷1=n, on n'a 1÷n=n que si n vaut 1.</p>
</details>

<p></p>

<p>Soit (E,T) un ensemble E muni d&#x2019;une loin interne T.</p>

<p>On a les propriétés suivantes :</p>

<h4>1.4.1.3. Associacitivité</h4>

<p>La loi T est associative si pour tous éléments a , b et c de E, (a T b)
&#x22a4; c = a &#x22a4;( b&#x22a4; c)=a &#x22a4;b&#x22a4; c</p>


<p style="border: 2px solid #007BFF;padding: 10px;">Exemple&nbsp;: l'addition + est associative sur N.</p>

<h4>1.4.1.4. Commutativité</h4>

<p>La loi &#x22a4; est commutative si pour tous éléments a et b de E, a
&#x22a4; b = b &#x22a4; a.</p>

<p style="border: 2px solid #007BFF;padding: 10px;">Exemple&nbsp;: l'addition + est commutative sur N.</p>

<h4>1.4.1.5. Symétrie</h4>

<p>Deux éléments a et b sont symétriques pour &#x22a4; si a &#x22a4; b = b
&#x22a4; a = e ( e étant l'élément neutre de E pour la loi &#x22a4;). Si tout
élément de e admet un symétrique pour la loi &#x22a4;, on dit que la loi
&#x22a4; est symétrisable.</p>

<h4>1.4.1.6. Distributivité</h4>

<p>&#x22a4; est distributive à gauche par rapport à une autre loi&#x22a5; si
pour tous éléments a, b, c de E, </p>

<p>a &#x22a4; (b &#x22a5; c) = (a &#x22a4; b )&#x22a5;( a&#x22a4; c)</p>

<p>&#x22a4; est distributive à droite par rapport à une autre loi &#x22a5; si
pour tous élément a, b, c de E, </p>

<p>(b &#x22a5; c) &#x22a4;a = (b &#x22a4;a) &#x22a5;( c&#x22a4; a)</p>

<p>&#x22a4; distributive pour &#x22a5; si et seulement si elle est distributive
à gauche et à droite par rapport à &#x22a5;.</p>

<p>La multiplication × dans N est distributive par rapport à l'addition + dans
N.</p>

<p>Dans la suite, on appellera opération les lois de composition dans
l&#x2019;ensemble N des entiers naturels. On note N* l&#x2019;ensemble N privée
du singleton {0}. N*=N&#x2216;{0}</p>

<p>L&#x2019;addition + et la multiplication × usuelles sont des opérations
internes sur N. c&#x2019;est-à-dire que N est stable par chacune de ces
opérations.</p>

<p>La soustraction &#x2212; et la division ÷ usuelles ne sont pas des
opérations internes dans N. C&#x2019;est le besoin d&#x2019;avoir des ensembles
stables pour ces opérations qui ont guidé le développement de nouveaux
ensembles de nombres. Ainsi, l&#x2019;ensemble des entiers rationnels (termes
que nous privilégions à entiers relatifs) Z est construit par symétrisation de
N; c&#x2019;est-à-dire que Z est construit de telle sorte que le symétrique par
+ d&#x2019;un entier naturel n soit dans Z. Q l&#x2019;ensemble des nombres
rationnels est construit sur la base d&#x2019;une relation d&#x2019;équivalence
définie sur Z par (a,b)R(c,d) ssi a×d=b×c ; on note a&#x2044;b=c&#x2044;d. De
façon générale, si x et y sont deux entiers rationnels, x&#x2044;y défini un
nombre rationnel si y&#x2260;0; x est le numérateur et y est le
dénominateur.</p>

<p>Soit x&#x2044;y un nombre rationnel. Si x/y peut s&#x2019;écrire sous la
forme a&#x2044;b où a est un entier rationnel et b une puissance de 10
(&#x2203;k&#x2208;N tel que b=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msup>
    <mn>10</mn>
    <mi>k</mi>
  </msup>
</math>), alors x/y est un nombre décimal. On note D l'ensemble des nombres
décimaux.</p>

<p>Disposant de Q, on peut construire l&#x2019;ensemble des nombres réels en
utilisant les coupures de Q, notion due à Cantor et Dedeking. Par exemple soit
C1=Q-&#x222a;{a&#x2208;Q+*. <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msup>
    <mi>a</mi>
    <mn>2</mn>
  </msup>
</math>&lt;2} et C2={a&#x2208;Q+*.
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msup>
    <mi>a</mi>
    <mn>2</mn>
  </msup>
</math>&gt;2}. C1 et C2 sont deux coupures de Q qui définissent le nombre
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msqrt>
    <mn>2</mn>
  </msqrt>
</math>.<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msqrt>
    <mn>2</mn>
  </msqrt>
</math> &#x2209;Q et <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msqrt>
    <mn>2</mn>
  </msqrt>
</math> &#x2208;R. On peut, avec cette méthode de coupure, définir n'importe
quel nombre réel. On pose souvent I=R&#x2216;Q. On a les inclusions suivante :
N&#x2282;Z&#x2282;D&#x2282;Q&#x2282;R.</p>

<p>Soit a&#x2208;Z et b&#x2208;Z*. Il existe un unique couple d&#x2019;entier
rationnels (q, r)&#x2208;ZxN tel que a=b×q+r avec 0&#x2264;r&lt;|b|. On dit
dans ces conditions que q est le quotient et r est le reste de la division
euclidienne de a par b; a est le dividende et b est le diviseur. On peut
restreindre cette définition à N en remplaçant Z par N. On parle alors de
division euclidienne dans N. On dit que b divise a ou que b est un diviseur de
a lorsque r vaut 0.</p>

<h5>1.4.1.6.1. Nombre pair / impair.</h5>

<p>Soit n&#x2208;Z. n est un nombre pair ssi n est divisible par 2. 0 est un
nombre pair. Un nombre qui n'est pas pair est impair. On note parfois 2Z
(respectivement 2Z+1) l'ensemble des nombres entiers rationnels pairs
(respectivement impairs).</p>

<p>Remarques : si on remplace dans cette définition Z par N, alors on obtient
qu&#x2019;un entier naturel n&#x2208;N est pair ssi n est divisible par 2. Les
entiers naturels pairs sont ceux dont le chiffre des unités est pair. Les
entiers naturels impairs sont ceux dont le chiffre des unités est impair.</p>

<h5>1.4.1.6.2. Nombre premier.</h5>

<p>Soit n&#x2208;Z. n est un nombre premier ssi n a exactement quatre diviseurs
: -1,1, -n et n. 0 et 1 ne sont pas des nombres premiers. 2 est un nombre
premier.</p>

<p>Remarque : si on remplace dans cette définition Z par N, alors on obtient
qu&#x2019;un entier naturel n&#x2208;N est premier ssi n a exactement deux
diviseurs : 1 et n.</p>

<h5>1.4.1.6.3. Grammaire du nombre.</h5>

<p>Soit VN={0,1,2,3,4,5,6,7,8,9}. On peut générer les entiers naturels selon la
règle suivante :</p>

<p>Tout élément de VN est un nombre entier naturel.</p>

<p>Si a et b sont des nombres entiers naturels, alors ab est un nombre entier
naturel si a&#x2260;0.</p>

<p>Les éléments de VN sont aussi appelés les chiffres.</p>

<p>VZ=VN&#x222a;{-,+}</p>

<p>Tout entier naturel est un entier rationnel.</p>

<p>Si a est un entier naturel, &#x2212;a et +a sont des entiers rationnels</p>

<p>VQ=VZ&#x222a;{&#x2044; ,,}</p>

<p>Tout entier rationnel est un nombre rationnel.</p>

<p>Si a et b sont des entiers rationnels a,b est un nombre rationnel ; de plus
si b&#x2260;0, <math xmlns="http://www.w3.org/1998/Math/MathML">
  <mfrac>
    <mi>a</mi>
    <mi>b</mi>
  </mfrac>
</math> est un nombre rationnel.</p>

<p>Si a et b sont des nombres rationnels,
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <mfrac>
    <mi>a</mi>
    <mi>b</mi>
  </mfrac>
</math> est aussi un nombre rationnel si b&#x2260;0.</p>

<p>Les opérations + et × sont associatives et commutatives. Les opérations × et
÷ sont distributives par rapport aux opérations &#x2013; et +.</p>

<p>Lors de la simplification des expressions algébriques, il faut aller de la
gauche vers la droite, et en calculant d&#x2019;abord toutes les expressions
entre parenthèse () ou tout autre signe qui tient lieu de parenthèses (ça peut
être des crochets [ ] ou plus rarement des accolades {}). Les parenthèses ont
donc toujours la plus grande priorité. </p>

<p>Le tableau ci-dessous donne les régles de priorité.</p>

| Règles de priorité | Opérations | Abréviations |
|--------------------|------------|--------------|
| 1. L’intérieur des parenthèses doit être calculé. Lorsqu’il y a parenthèses, crochets et accolades, il faut simplifier prioritairement l’opération en débutant par les parenthèses intérieures : solutionner de l’intérieur vers l’extérieur. | Parenthèses (ou assimilées) | P |
| 2. Les nombres affectés d’exposants doivent être évalués. | Exponentiation | E |
| 3. Les divisions et les multiplications doivent être calculées. Ces deux opérations ont la même priorité. Elles sont évaluées dans l’ordre où elles apparaissent dans l’expression numérique établie, en se référant à la convention d’écriture indiquée plus loin. | Divisions<br>Multiplications | D<br>M |
| 4. Finalement, les additions et les soustractions doivent être calculées. Ces deux opérations ont la même priorité. Elles sont évaluées à partir de la gauche de l’expression numérique en allant vers la droite (convention d’écriture). | Additions<br>Soustractions | A<br>S |


<p></p>

<p>On peut se rappeler cet ordre de priorité avec l'acronyme mnémonique
PEDMAS.</p>

<p></p>

<p>Dans l'ensemble R des nombres réels, deux éléments de R symétriques pour
l'addition sont plus communément appelés opposés . Pour la multiplication on
parle d'inverses.</p>

<p></p>

<p>&#x2003;</p>

<h1>2. Notion de variables et fonctions élémentaires sur les nombres</h1>

<h2>2.1. La notion de variable</h2>

<p>Soit E et F deux ensembles, f une fonction de E vers F. En général, f est
donnée par une expression qui permet de déterminer l&#x2019;image d&#x2019;un
élément e quelconque de E. Cela se fait en remplaçant dans l&#x2019;expression
de f certains symbole par l&#x2019;élément e en question. Supposons par exemple
E=F =R et f la fonction qui a un nombre réel associe son produit par une
constante a et ajoute à ce produit une constante b. On a par exemple
f(2)=a×2+b. Ce qui change dans le calcul de l&#x2019;image d&#x2019;un élément
quelconque, ce ne sont pas les constantes a et b qui sont fixées une fois pour
toute pour la fonction f, mais la valeur de l&#x2019;élément. Il est commode de
représenter cet état de chose par un symbole auquel on substitue
l&#x2019;élément quand celui-ci devient connu. Ce symbole est donc la variable
associée à la fonction. Dans le cas de la fonction f ci-dessus, on écrira f(t)
= a×t + b. Et t est la variable dans cette expression. Cette variable
représente les éléments de l&#x2019;ensemble de départ. C&#x2019;est elle qui
varie quand on passe d&#x2019;un élément à un autre, on dit qu&#x2019;elle
parcourt l&#x2019;ensemble de départ, ou plus exactement le domaine de
définition de la fonction. Il est a noter que ce formalisme permet de décrire f
et de connaître ses propriétés mathématiques sans avoir besoin de calculer
l&#x2019;image de chaque élément de&nbsp;E.</p>

<p>Cette notion de variable en mathématique est assez proche de la notion de
variable en informatique, tout comme l&#x2019;est aussi la notion de fonction.
Ainsi, on peut remarquer que donner une valeur à une variable (en mathématique)
est similaire à affecter une valeur à une variable (en informatique).</p>

<p>Il convient aussi de bien remarquer que, même sans explicitement donner des
valeurs à a et b dans la fonction f ci-dessus, nous savons que ces symboles
représentent des constantes. Mais pour calculer la valeur (réelle) de
l&#x2019;image par f d&#x2019;un nombre réel, nous avons nécessairement besoin,
à ce moment-là, de connaître les valeurs de ces symboles qui sont constantes et
ne changeront donc plus une fois fixées. Là encore on peut remarquer que cette
notion de constante en mathématique est assez proche de la notion de constante
en informatique.</p>

<p></p>

<h2>2.2. Fonctions numériques élémentaires usuelles.</h2>



Tableau 3: Fonctions numériques élémentaires usuelles

| Nom | Expression | Principales propriétés | Exemples |
|-----|------------|------------------------|----------|
| Fonction puissance | <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math>(x)=<math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mi>x</mi><mi>a</mi></msup></math> | Partout où <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math> et <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>b</mi></msub></math> ont à la fois un sens et sont à la fois définies, on a <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mrow><mi>a</mi><mo>+</mo><mi>b</mi></mrow></msub></math>=<math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math>×<math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>b</mi></msub></math>.<br><br>Si a∈N, <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math> est définie sur R.<br><br>Si a∈Z, et a<0, <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math> est définie sur R*.<br><br>Si a∈Q, il faut distinguer deux cas :<br>- Si a=p/q avec q pair, alors <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math> est définie sur R+ si a≥0 et sur R*+ si a<0 <br>- Si a=p/q avec q impair, alors <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math> est définie sur R si a≥0 et sur R* si a<0.<br><br>Pour tout autre cas <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math> n’a de sens que si a≥0 et n’est définie que sur R*+ ; on a alors f(x)=<math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mi>e</mi><mrow><mi>a</mi><mi>ln</mi><mi>x</mi></mrow></msup></math>. | f(x)=<math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mi>x</mi><mrow><mo>-</mo><mn>2</mn><mo>/</mo><mn>3</mn></mrow></msup></math><br>f(x)=<math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mi>x</mi><mn>4</mn></msup></math><br>f(x)=<math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mi>x</mi><mrow><mn>1</mn><mo>/</mo><mn>3</mn></mrow></msup></math><br>f(x)=<math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mi>x</mi><mrow><mn>1</mn><mo>/</mo><mn>2</mn></mrow></msup></math>. |
| Fonction exponentielle | f(x)=<math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mi>e</mi><mi>x</mi></msup></math> | f(x)×f(y)=f(x+y). f est définie sur R. | |
| Fonction exponentielle de base a | <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math>(x)=<math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mi>a</mi><mi>x</mi></msup></math> | <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math> n’a de sens que si a>0. On a alors <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub><mo>(</mo><mi>x</mi><mo>)</mo><mo>×</mo><msub><mi>f</mi><mi>a</mi></msub><mo>(</mo><mi>y</mi><mo>)</mo><mo>=</mo><msub><mi>f</mi><mi>a</mi></msub><mo>(</mo><mi>x</mi><mo>+</mo><mi>y</mi><mo>)</mo></math> et <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math> est définie sur R. | f(x)=<math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mn>4</mn><mi>x</mi></msup></math> |
| Fonction logarithme | f(x)=ln(x) | f(x×y)=f(x)+f(y). f est définie sur R*+. | |
| Fonction logarithme de base a | <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math>(x)=<math xmlns="http://www.w3.org/1998/Math/MathML"><munderover><mo>-</mo><mrow><mi>ln</mi><mo>(</mo><mi>a</mi><mo>)</mo></mrow><mrow><mi>ln</mi><mo>(</mo><mi>x</mi><mo>)</mo></mrow></munderover></math> | <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math> a un sens ssi a>1. Si a=10, <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math> est le logarithme décimal, et noté simplement log. <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math> est définie sur R*+ là où elle a un sens (a>1). On a <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math>(x×y)=<math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math>(x)+<math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>f</mi><mi>a</mi></msub></math>(y). | |

<p></p>

<p></p>

<h2>2.3. Suites et séries numériques réelles</h2>

<p>Une suite numérique réelle est une application u : N&#x2192;R,
n&#x21a6;u(n). On note souvent u(n), l'image par n de u, plus simplement
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math>. La suite u est souvent notée
(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math>) <sub style="">n &#x2208;N</sub>.</p>

<p>Le terme <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math>s'apelle le terme général de la suite. Il arrive quelquefois qu'une
suite soit définie seulement sur une partie de N. Dans ce cas, on considère
qu'elle est définie partout sur N et qu'elle est nulle pour les termes pour
lesquels elle n'est pas explicitement définie. Par exemple, si on considère la
suite u définie par <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math>=1/n pour n&gt;0 sans d'autres précisions, on peut toujours supposer que
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mn>0</mn>
  </msub>
</math>=0. Une suite n'est interessante que s'il y a une façon de déterminer,
pour un entier n quelconque, le terme
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math>de la suite; on parle alors de suite logique. Une suite logique peut
être donnée par une expression
de<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math>en fonction de n; <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math>=f(n) ou f est une fonction avec Df=N. Une suite logique peut être
donnée par une relation entre les termes de la suite. Par exemple
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math>peut être une fonction de
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mrow>
      <mi>n</mi>
      <mo>&#x2212;</mo>
      <mn>1</mn>
    </mrow>
  </msub>
</math>; <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math>=f(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mrow>
      <mi>n</mi>
      <mo>&#x2212;</mo>
      <mn>1</mn>
    </mrow>
  </msub>
</math>) où f est une fonction et il y a au moins un terme de la suite connu
(il existe n0 tel que <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>no</mi>
  </msub>
</math> soit connu); dans ce cas on parle de suite recurrente. </p>

<p>Un exemple de suite est (suite de Fibonacci)
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mn>0</mn>
  </msub>
</math>=0 ,<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mn>1</mn>
  </msub>
</math> =1 et <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math>=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mrow>
      <mi>n</mi>
      <mo>&#x2212;</mo>
      <mn>1</mn>
    </mrow>
  </msub>
</math> + <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mrow>
      <mi>n</mi>
      <mo>&#x2212;</mo>
      <mn>2</mn>
    </mrow>
  </msub>
</math> pour n&#x2265;2.</p>

<p>Soit (<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math>) <sub style="">n &#x2208;N</sub> une suite.</p>

<p>On apelle série numérique réelle de terme général
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math> , que l'on note &#x3a3;<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math>, la suite des sommes partielles
(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>S</mi>
    <mi>n</mi>
  </msub>
</math>) <sub style="">n &#x2208;N</sub> , où pour tout n&#x2208;N,
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>S</mi>
    <mi>n</mi>
  </msub>
</math>=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msubsup>
    <mo>&#x3a3;</mo>
    <mrow>
      <mi>k</mi>
      <mo>=</mo>
      <mn>0</mn>
    </mrow>
    <mi>n</mi>
  </msubsup>
  <msub>
    <mi>u</mi>
    <mi>k</mi>
  </msub>
</math>.</p>

<p>Par exemple la série de terme général
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>u</mi>
    <mi>n</mi>
  </msub>
</math>=1/n si n&#x2265;1 est définie par
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>S</mi>
    <mi>n</mi>
  </msub>
  <mo>=</mo>
  <msubsup>
    <mo>&#x3a3;</mo>
    <mrow>
      <mi>k</mi>
      <mo>=</mo>
      <mn>1</mn>
    </mrow>
    <mi>n</mi>
  </msubsup>
  <mn>1</mn>
  <mo>&#x2044;</mo>
  <mi>k</mi>
</math>.</p>

<h2>2.4. Matrices réelles</h2>

<p>Soient I et J deux ensembles. On appelle matrice à coefficients réels ou
encore matrice réelle toute application f : I×J &#x2192; R. Si l&#x2019;on
confond f à son image, alors on peut légitimement représenter une matrice f de
type I×J par une famille <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mrow>
      <mo>(</mo>
      <mi>f</mi>
      <mo>(</mo>
      <mi>i</mi>
      <mo>,</mo>
      <mi>j</mi>
      <mo>)</mo>
      <mo>)</mo>
    </mrow>
    <mrow>
      <mo>(</mo>
      <mi>i</mi>
      <mo>,</mo>
      <mi>j</mi>
      <mo>)</mo>
      <mo>&#x2208;</mo>
      <mi>I</mi>
      <mo>×</mo>
      <mi>J</mi>
    </mrow>
  </msub>
</math>. On pose plus simplement f(i,j)
=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>f</mi>
    <mi>ij</mi>
  </msub>
</math> et les <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>f</mi>
    <mi>ij</mi>
  </msub>
</math> sont appelés coefficients de la matrice. Un cas particulier important,
lorsque I={1,2,&#x2026;m} et J={1,2,&#x2026;n} on dit que f est une matrice de
type (m, n). Il est alors commode de représenter f par un tableau rectangulaire
du type f=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <mrow>
    <mo>(</mo>
    <mtable>
      <mtr>
        <mtd>
          <msub>
            <mi>a</mi>
            <mn>11</mn>
          </msub>
        </mtd>
        <mtd>
          <msub>
            <mi>a</mi>
            <mn>12</mn>
          </msub>
        </mtd>
        <mtd>
          <mo>.</mo>
          <mo>.</mo>
          <mo>.</mo>
        </mtd>
        <mtd>
          <msub>
            <mi>a</mi>
            <mrow>
              <mn>1</mn>
              <mi>n</mi>
            </mrow>
          </msub>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <msub>
            <mi>a</mi>
            <mn>21</mn>
          </msub>
        </mtd>
        <mtd>
          <msub>
            <mi>a</mi>
            <mn>22</mn>
          </msub>
        </mtd>
        <mtd>
          <mo>.</mo>
          <mo>.</mo>
          <mo>.</mo>
        </mtd>
        <mtd>
          <msub>
            <mi>a</mi>
            <mrow>
              <mn>2</mn>
              <mi>n</mi>
            </mrow>
          </msub>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mi></mi>
        </mtd>
        <mtd>
          <mi></mi>
        </mtd>
        <mtd>
          <mi></mi>
        </mtd>
        <mtd>
          <mi></mi>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mi></mi>
        </mtd>
        <mtd>
          <mi></mi>
        </mtd>
        <mtd>
          <mi></mi>
        </mtd>
        <mtd>
          <mi></mi>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <msub>
            <mi>a</mi>
            <mrow>
              <mi>m</mi>
              <mn>1</mn>
            </mrow>
          </msub>
        </mtd>
        <mtd>
          <msub>
            <mi>a</mi>
            <mrow>
              <mi>m</mi>
              <mn>2</mn>
            </mrow>
          </msub>
        </mtd>
        <mtd>
          <mi></mi>
        </mtd>
        <mtd>
          <msub>
            <mi>a</mi>
            <mi>mn</mi>
          </msub>
        </mtd>
      </mtr>
    </mtable>
    <mo>)</mo>
  </mrow>
</math>où <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>f</mi>
    <mi>ij</mi>
  </msub>
</math>=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>ij</mi>
  </msub>
</math>.</p>

<p>Lorsque m=n, la matrice f est dite carrée. Les termes
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mn>11</mn>
  </msub>
</math>,<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mn>22</mn>
  </msub>
</math>,&#x2026;, <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>nn</mi>
  </msub>
</math> sont appelés les termes diagonaux.</p>

<p>Une matrice carrée est dite triangulaire supérieure (respectivement
inférieure) si les termes situés en dessous (respectivement au-dessus) de la
diagonale sont tous nuls.</p>

<p>On a respectivement A =(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>ij</mi>
  </msub>
</math>) avec 1&#x2264;i&#x2264;n, 1&#x2264;j&#x2264;n et
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>ij</mi>
  </msub>
</math>=0 si i&gt;j (respectivement i&lt;j). </p>

<p style="border: 2px solid #007BFF; padding: 10px;">Exemples&nbsp;: A=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <mrow>
    <mo>(</mo>
    <mtable>
      <mtr>
        <mtd>
          <mn>1</mn>
        </mtd>
        <mtd>
          <mn>2</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>2</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
      </mtr>
    </mtable>
    <mo>)</mo>
  </mrow>
</math>, B=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <mrow>
    <mo>(</mo>
    <mtable>
      <mtr>
        <mtd>
          <mn>1</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mn>2</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
        <mtd>
          <mn>0</mn>
        </mtd>
      </mtr>
    </mtable>
    <mo>)</mo>
  </mrow>
</math>, alors A est triangulaire supérieure et B est triangulaire inférieure.</p>

<p>Une matrice carrée est diagonale si elle est à la fois triangulaire
supérieure et triangulaire inférieure.
A=(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>ij</mi>
  </msub>
</math>) avec 1&#x2264;i&#x2264;n, 1&#x2264;j&#x2264;n et
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>ij</mi>
  </msub>
</math>=0 si i&#x2260;j.</p>

<p>Dans la suite, on désigne par Mm,n( R ) l&#x2019;ensemble des matrices à m
lignes et n colonnes à coefficients réels.</p>

<h3>2.4.1. Adition de deux matrices</h3>

<p>Soit A=(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>ij</mi>
  </msub>
</math>) avec 1&#x2264;i&#x2264;m, 1&#x2264;j&#x2264;n et
B=(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mi>ij</mi>
  </msub>
</math>) avec 1&#x2264;i&#x2264;m, 1&#x2264;j&#x2264;n deux éléments de Mm,n( R
). On définit la somme C de A et de B par :</p>

<p>C=A+B et C=(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>c</mi>
    <mi>ij</mi>
  </msub>
</math>) avec 1&#x2264;i&#x2264;m, 1&#x2264;j&#x2264;n tels que
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>c</mi>
    <mi>ij</mi>
  </msub>
</math>=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>ij</mi>
  </msub>
</math>+<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mi>ij</mi>
  </msub>
</math>. C&#x2208;Mm,n( R ).</p>

<h3>2.4.2. Produit de deux matrices</h3>

<p>Soient A&#x2208;Mm,n( R ) avec 1&#x2264;i&#x2264;m, 1&#x2264;j&#x2264;n et
B&#x2208;Mn,p( R ) avec 1&#x2264;i&#x2264;n, 1&#x2264;j&#x2264;p.</p>

<p>Le produit C=(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>c</mi>
    <mi>ij</mi>
  </msub>
</math>)avec 1&#x2264;i&#x2264;m, 1&#x2264;j&#x2264;p de A et de B est la
matrice définie par <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>c</mi>
    <mi>ij</mi>
  </msub>
  <msubsup>
    <mrow>
      <mo>=</mo>
      <mo>&#x3a3;</mo>
    </mrow>
    <mrow>
      <mi>k</mi>
      <mo>=</mo>
      <mn>1</mn>
    </mrow>
    <mi>n</mi>
  </msubsup>
  <msub>
    <mi>a</mi>
    <mi>ik</mi>
  </msub>
  <msub>
    <mi>b</mi>
    <mi>kj</mi>
  </msub>
</math></p>


<p style="border: 2px solid #007BFF;padding: 10px;">Exemple&nbsp;:A= <math xmlns="http://www.w3.org/1998/Math/MathML">
  <mrow>
    <mo>(</mo>
    <mtable>
      <mtr>
        <mtd>
          <mn>1</mn>
        </mtd>
        <mtd>
          <mn>2</mn>
        </mtd>
        <mtd>
          <mn>3</mn>
        </mtd>
      </mtr>
    </mtable>
    <mo>)</mo>
  </mrow>
</math> et B=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <mrow>
    <mo>(</mo>
    <mtable>
      <mtr>
        <mtd>
          <mn>1</mn>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mn>2</mn>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mn>3</mn>
        </mtd>
      </mtr>
    </mtable>
    <mo>)</mo>
  </mrow>
</math>, A×B=14 et B×A=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <mrow>
    <mo>(</mo>
    <mtable>
      <mtr>
        <mtd>
          <mn>1</mn>
        </mtd>
        <mtd>
          <mn>2</mn>
        </mtd>
        <mtd>
          <mn>3</mn>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mn>2</mn>
        </mtd>
        <mtd>
          <mn>4</mn>
        </mtd>
        <mtd>
          <mn>6</mn>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mn>3</mn>
        </mtd>
        <mtd>
          <mn>6</mn>
        </mtd>
        <mtd>
          <mn>9</mn>
        </mtd>
      </mtr>
    </mtable>
    <mo>)</mo>
  </mrow>
</math></p>

<h3>2.4.3. Transposition</h3>

<p>Soit A&#x2208;Mm,n( R ). A=(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>ij</mi>
  </msub>
</math>) avec 1&#x2264;i&#x2264;m, 1&#x2264;j&#x2264;n. On appelle transposée
de A la matrice <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msup>
    <mi>A</mi>
    <mo>&#x22a5;</mo>
  </msup>
</math>&#x2208;Mn,m( R ) définie par
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msup>
    <mi>A</mi>
    <mo>&#x22a5;</mo>
  </msup>
</math>=(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mi>ij</mi>
  </msub>
</math>) où <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>b</mi>
    <mi>ij</mi>
  </msub>
</math>=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>a</mi>
    <mi>ji</mi>
  </msub>
</math>.</p>

<p style="border: 2px solid #007BFF;padding: 10px;">Exemple&nbsp;:: A=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <mrow>
    <mo>(</mo>
    <mtable>
      <mtr>
        <mtd>
          <mn>1</mn>
        </mtd>
        <mtd>
          <mn>2</mn>
        </mtd>
        <mtd>
          <mn>3</mn>
        </mtd>
      </mtr>
    </mtable>
    <mo>)</mo>
  </mrow>
</math> et B=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <mrow>
    <mo>(</mo>
    <mtable>
      <mtr>
        <mtd>
          <mn>1</mn>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mn>2</mn>
        </mtd>
      </mtr>
      <mtr>
        <mtd>
          <mn>3</mn>
        </mtd>
      </mtr>
    </mtable>
    <mo>)</mo>
  </mrow>
</math>, alors <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msup>
    <mi>A</mi>
    <mo>&#x22a5;</mo>
  </msup>
</math>=B et <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msup>
    <mi>B</mi>
    <mo>&#x22a5;</mo>
  </msup>
</math>=A.</p>

<p>Remarque: La transposée de la transposée d'une matrice est égale à cette
matrice.</p>

<p></p>

<h1>3. Variable aléatoire et fonction de variable aléatoire</h1>

<h2>3.1. Variable aléatoire</h2>

<p>Toute mesure d&#x2019;une grandeur X dans un univers &#x3a9; dont les
valeurs dépendent du hasard est dite variable aléatoire. On distingue en
générale deux types de variable aléatoire. Le type discret et le type
continu.</p>

<h3>3.1.1. Variable aléatoire discrète.</h3>

<p>Une variable aléatoire X est dite discrète lorsque son ensemble de
définition, c&#x2019;est-à-dire l&#x2019;ensemble de ses valeurs possibles noté
X(&#x3a9;) est un ensemble fini.  Un élement de X(&#x3a9;) est appelé un évènement
élémentaire. Pour une variable aléatoire discrète X, on définit les notions
suivantes :</p>

<h4>3.1.1.1. Loi de probabilité.</h4>

<p>On appelle loi de probabilité ou encore loi de distribution de la variable
aléatoire X la fonction définie par p : X(&#x3a9;)&#x2192;[0, 1],
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>x</mi>
    <mi>i</mi>
  </msub>
</math>&#x21a6;p(X=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>x</mi>
    <mi>i</mi>
  </msub>
</math>)=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>p</mi>
    <mi>i</mi>
  </msub>
</math> où <math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>x</mi>
    <mi>i</mi>
  </msub>
</math>&#x2208;X(&#x3a9;). On rappelle que</p>
<ol>
  <li>&#x2200;i, <math xmlns="http://www.w3.org/1998/Math/MathML">
      <msub>
        <mi>p</mi>
        <mi>i</mi>
      </msub>
    </math>&#x2265;0;</li>
  <li><math xmlns="http://www.w3.org/1998/Math/MathML">
      <msub>
        <mrow>
          <mo>&#x3a3;</mo>
          <msub>
            <mi>p</mi>
            <mi>i</mi>
          </msub>
        </mrow>
        <mrow>
          <msub>
            <mi>x</mi>
            <mi>i</mi>
          </msub>
          <mo>&#x2208;</mo>
          <mi>X</mi>
          <mo>(</mo>
          <mi>&#x3a9;</mi>
          <mo>)</mo>
        </mrow>
      </msub>
    </math>=1</li>
</ol>

<div style="border: 2px solid #007BFF;padding: 10px;">
<p>Exemple&nbsp;: Une plante peut avoir de 0 à 4 fleurs avec les probabilités
suivantes :</p>
Tableau 4: Exemple de distribution de probabilité

| Nombre de fleurs <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>x</mi><mi>i</mi></msub></math> | 0 | 1 | 2 | 3 | 4 |
|---------------------------------------------------------------------------------------------|---|---|---|---|---|
| Probabilité <math xmlns="http://www.w3.org/1998/Math/MathML"><msub><mi>p</mi><mi>i</mi></msub></math> | 2k | 1/8 | 1/8 | 3/8 | k |
</div>

<p>Question: Calculer k pour que ce tableau corresponde à une distribution de
probabilité.</p>
<details>
  <summary>Réponse</summary>
  <p>k=1/8 car la somme des probabilités doit donner 1.</p>
</details>

<p></p>

<h4>3.1.1.2. Fonction de répartition</h4>

<p>On appelle fonction de répartition ou fonction cumulative de la variable
aléatoire X la fonction F définie par F : X(&#x3a9;)&#x2192;[0,1],
<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>x</mi>
    <mi>i</mi>
  </msub>
</math>&#x21a6;F(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>x</mi>
    <mi>i</mi>
  </msub>
</math>)=p(X&lt;<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>x</mi>
    <mi>i</mi>
  </msub>
</math>)=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mrow>
      <mo>&#x3a3;</mo>
      <mi>p</mi>
      <mo>(</mo>
      <mi>X</mi>
      <mo>=</mo>
      <msub>
        <mi>x</mi>
        <mi>j</mi>
      </msub>
      <mo>)</mo>
    </mrow>
    <mrow>
      <msub>
        <mi>x</mi>
        <mi>j</mi>
      </msub>
      <mo>&lt;</mo>
      <msub>
        <mi>x</mi>
        <mi>i</mi>
      </msub>
    </mrow>
  </msub>
</math>.</p>

<p>Remarque : Certains ouvrages définissent F par
F(<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mi>x</mi>
    <mi>i</mi>
  </msub>
</math>)=p(X<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msub>
    <mrow>
      <mo>&#x2264;</mo>
      <mi>x</mi>
    </mrow>
    <mi>i</mi>
  </msub>
</math>).</p>

<p>Parmi les lois de probabilités discrètes, on peut citer :La loi uniforme sur [1,n]. elle est données par p(X=x)=1/n avec
x&#x2208;{1,&#x2026;,n}, la loi de Bernoulli de paramètre p. elle est donnée par
p(X=x)=<math xmlns="http://www.w3.org/1998/Math/MathML">
  <msup>
    <mi>p</mi>
    <mi>x</mi>
  </msup>
  <msup>
    <mi>q</mi>
    <mrow>
      <mn>1</mn>
      <mo>&#x2212;</mo>
      <mi>x</mi>
    </mrow>
  </msup>
</math> avec p+q=1 et x&#x2208;{0,1}. Elle correspond au schéma succès/échec
avec une probabilité de succès p.</p>

<p>Étant données deux variables aléatoires X et Y on peut définir une variable
aléatoire Z=(X,Y). Z est appelé variable aléatoire à deux dimensions ou couple
de variables aléatoires.</p>

<p>Étant donnée une variable aléatoire X et une fonction g quelconque, on peut
définir une autre variable aléatoire Y par Y=g(X). La détermination de la loi
de Y se fait alors en prenant en considération la loi de X et le comportement
de la fonction g.</p>

<p>On peut utiliser une loi de probabilité connue pour, par exemple, générer
des nombres aléatoires. Toutefois, il convient de noter qu'en raison du
caractère déterministe des algorithmes informatiques, les nombres générés par
les programmes informatiques sont pseudo-aléatoires.</p>

<p></p>

<p></p>

<h1>4. Annexe</h1>
Tableau 5: Quelques abréviations et symboles usuels, ainsi que leur signification

| Symbole | Description | Exemple |
|---------|-------------|---------|
| ssi | Si et seulement si. Placé après une expression propositionnelle, exprime une condition nécessaire et suffisante pour que cette expression propositionnelle soit vraie. | Un nombre entier est pair ssi son dernier chiffre est pair. |
| <math xmlns="http://www.w3.org/1998/Math/MathML"><msubsup><mo>Σ</mo><mrow><mi>i</mi><mo>=</mo><mi>p</mi></mrow><mi>n</mi></msubsup></math> | Sommation de n-p+1 termes indexés par i, et i variant de p à n. | <math xmlns="http://www.w3.org/1998/Math/MathML"><msubsup><mo>Σ</mo><mrow><mi>i</mi><mo>=</mo><mn>1</mn></mrow><mi>n</mi></msubsup><mi>i</mi></math> désigne la somme des n premiers entiers naturels. Il convient alors de remarquer que le résultat de cette somme est identique à <math xmlns="http://www.w3.org/1998/Math/MathML"><msubsup><mo>Σ</mo><mrow><mi>i</mi><mo>=</mo><mn>0</mn></mrow><mi>n</mi></msubsup><mi>i</mi></math> mais la sommation est différente puisque les deux sommations ont un nombre de termes différents. On peut avoir une double, une triple,... sommation avec deux, trois... indices ij, ijk,... chacun des indices variant à son tour. |
| <math xmlns="http://www.w3.org/1998/Math/MathML"><mo>≤</mo></math> | Placé entre des termes, ce symbole signifie que le membre de gauche est plus petit ou égal au membre de droite (usage restreint). Mais plus généralement, il signifie que le membre de gauche est en relation avec le membre de droite ou lui est égal (usage élargi). | Pour l'ordre naturel sur l'ensemble des entiers naturels N, 1≤2 et 2≤2. Pour la relation de divisibilité dans N, c'est-à-dire a en relation avec b ssi a divise b ; 2≤4 et 2≤2, mais on ne peut pas comparer 2 et 5. |
| ≥ | Placé entre des termes, ce symbole signifie que le membre de gauche est plus grand ou égal au membre de droite (usage restreint). Mais plus généralement, il signifie que le membre de gauche est en relation avec le membre de droite ou lui est égal (usage élargi). | Pour l'ordre naturel sur l'ensemble des entiers naturels N, 2≥1 et 2≥2. Pour la relation de divisibilité dans N, c'est-à-dire a en relation avec b ssi a divise b ; 4≥2 et 2≥2, mais on ne peut pas comparer 5 et 2. |
| < | Placé entre des termes, ce symbole signifie que le membre de gauche est strictement plus petit que le membre de droite (usage restreint). Mais plus généralement, il signifie que le membre de gauche est en relation avec le membre de droite et lui est différent (usage élargi). | Pour l'ordre naturel sur l'ensemble des entiers naturels N, 1<2. Pour la relation de divisibilité dans N, c'est-à-dire a en relation avec b ssi a divise b ; 2<4, mais on ne peut pas comparer 2 et 5. |
| > | Placé entre des termes, ce symbole signifie que le membre de gauche est strictement plus grand que le membre de droite (usage restreint). Mais plus généralement, il signifie que le membre de gauche est en relation avec le membre de droite et lui est différent (usage élargi). | Pour l'ordre naturel sur l'ensemble des entiers naturels N, 2>1. Pour la relation de divisibilité dans N, c'est-à-dire a en relation avec b ssi a divise b ; 4>2, mais on ne peut pas comparer 5 et 2. |
| ∀ | Quantificateur universel. ∀ a se lit pour tout a... | ∀ a∈N, a≥0 pour tout élément a de l'ensemble N, a est supérieur ou égal à 0. |
| ∃ | Quantificateur existentiel. ∃ a se lit il existe au moins un a... | ∃ a∈N tel que a≠0, il existe au moins un élément a de l'ensemble N qui est différent de 0. |
| ∈ | C'est le symbole d'appartenance. a∈A signifie que a est un élément de l'ensemble A. | Utilisé après un quantificateur, et une suite de symboles, il signifie que ces symboles sont éléments de l'ensemble qui suit. Par exemple : ∀ a,b,c ∈N signifie pour tous éléments a, b et c de N. |
| ∉ | C'est le symbole de non-appartenance. a∉A signifie que a n'est pas un élément de l'ensemble A. | −1∉N. |
| ⊆ | Placé entre deux ensembles, signifie que l'ensemble de gauche est inclus dans l'ensemble de droite ou lui est égal. | Si A et B sont deux ensembles, A⊆A∪B. |
| ⊂ | Placé entre deux ensembles, signifie que l'ensemble de gauche est strictement inclus dans l'ensemble de droite (et donc en est différent). | N⊂Z. |
| ⇒ | Implication logique. Placé entre deux propositions, ce symbole indique que la proposition de gauche implique celle de droite. | p⇒q est faux ssi p est vrai et q faux. |
| \| \| | Valeur absolue. Si a est placé entre les deux barres, le résultat est le nombre positif a si a est positif et -a si a est négatif. \|a\|=a si a≥0 et \|a\|=−a si a≤0. | \|-2\|=\|2\|=2. |


</div>
