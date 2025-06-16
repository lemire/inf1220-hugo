---
title: "Introduction aux types de base et à leurs opérateurs."
weight: 3
---

<h1><a id="top" name="top"></a>Module 2</h1><h2>Activité 2.3</h2><h2 class="partie2">Introduction aux types de base et à leurs opérateurs.</h2>

<p class="sommaire">Sommaire</p>
<ul>

<li><a href="#variableType">Les variables et les types</a></li>

<li><a href="#opérateurs">Les opérateurs de base</a></li>

</ul>

<p><a id="intro" name="variableType"></a></p>


<h1>Mise en garde pédagogique</h1>
<p>Si on prend un cours de Mandarin, on ne s'attend pas à comprendre tout le Mandarin lu ou écouté du premier coup ou même du deuxième. Il en va de même lorsqu'on étudie un langage de programmation, surtout s'il s'agit du premier langage de programmation appris. La première fois, la seconde fois, ou même la troisième fois que vous verrez un bout de code, il est parfaitement normal de ne pas le comprendre entièrement. C'est d'autant plus vrai que le langage Java a un syntaxe plutôt lourde avec beaucoup de mots réservés à la signification abstraite. Vous verrez beaucoup de mots comme "class", "public", "static", "void" dans ce cours. Si ça vous semble être du jargon, c'est parce que c'est exactement ce dont il s'agit. Monter un programme en Java n'est pas chose aisée, il faut comprendre que les "classes" vont dans des fichiers avec un nom correspondant à la classe, il faut comprendre que seule la méthode "public static void main(String[])" est exécutable, etc., etc. Il est impossible d'absorber tout ça en un jour, en une semaine ou même en quelques courtes semaines. Ça prend du temps avant de s'y retrouver.</p>

<p>Et c'est pire que vous pouvez peut-être l'imaginer. Même après avoir fait du Java pendant 30 années, on ne comprend pas tout. La grammaire, la syntaxe, est lourde, complexe, nuancée. C'est pire encore avec certains langages comme C++ que peu de gens au monde maîtrisent entièrement. Et même quand on comprend la syntaxe, comprendre ce que fait le code n'est pas toujours évident. Ce n'est pas parce qu'on connaît la grammaire française qu'on sait lire tous les textes en français.</p>


<p>C'est là que l'intérêt du concept de pseudo-code prend tout son sens. Au coeur de la programmation, on trouve l'écriture d'algorithmes, et un algorithme existe indépendamment du langage de programmation. Le pseudo-code l'illustre parfaitement.</p>
<p>Il n'est donc pas nécessaire, pour programmer, de tout savoir et de tout comprendre. Vous ne terminerez pas le cours INF 1220 avec une maîtrise intégrale du Java. Plusieurs aspects resteront mystérieux à vos yeux. C'est normal.</p>

<p>Utilisez donc l'approche suivante. Quand vous rencontrez un nouveau code Java, ne le prenez pas dans son ensemble tout d'un coup. Faites comme vous le feriez en français : lisez une ligne à la fois. N'insistez pas pour tout comprendre. Développez une intuition pour les variables, les méthodes, etc. Allez-y par étape ! Prenez votre temps ! Prenez des notes. </p>

<p>Il en va de même quand vous écrivez du code. Commencez par le plus simple, et progressez lentement, en prenant des notes, en vous laissant des commentaires. Souvent il est utile d'écrire le pseudo-code avant d'écrire le code en Java.</p>

<h1>Environnement de développement (rappel)</h1>


<p>Dans ce cours, nous n'offrons pas de soutien technique, notamment en ce qui a trait aux IDE comme IntelliJ ou Eclipse et leur fonctionnement sur votre ordinateur. La configuration de votre PC, l'installation de logiciels, etc. ne fait pas partie du cours. Il n'est pas nécessaire d'installer du logiciel pour suivre ce cours puisqu'on peut développer et exécuter du code Java en ligne (notamment avec repl.it). Pour être clair, cela signifie que le professeur ne vous aidera pas à installer un environnement, et il ne vous donnera pas un cours sur son utilisation. Si vous souhaitez installer un tel environnement, nous vous fournissons des éléments de départ, mais c'est à vous ensuite de vous les approprier. Il faut comprendre qu'il est très difficile de déboguer à distance les difficultés qu'un étudiant peut rencontrer au sein d'un environnement complexe, surtout quand cet étudiant ne fait que débuter. À l'échelle d'un cours entier, c'est tout simplement impossible de faire le travail avec tous les étudiants, tout en couvrant la matière du cours.</p>

<p>Si vous devez compiler des classes Java sur votre PC, faites les choses simplement. Essayez d'utiliser les outils les plus élémentaires. Concentrez-vous sur le Java, et non pas sur les environnements et les outils. Une erreur fréquente des débutants est de perdre beaucoup de temps au sein de systèmes qu'ils ne maîtrisent pas à essayer de programmer dans un langage qu'ils ne maîtrisent pas. Il y faut y aller pas à pas.</p>

<iframe width="672" height="378" src="https://www.youtube.com/embed/1ttHH5MlNug" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<h1>Les variables et les types</h1>

<p>Une variable permet de manipuler des données et des valeurs. Elle se caractérise par un nom et un type. Le nom sert à repérer un emplacement mémoire dans lequel la valeur de la variable sera stockée. Quant au type, il permet de déterminer la façon dont la valeur de la variable est traduite en code binaire, ainsi que la taille de son emplacement mémoire. Par exemple, le type "int" permet de stocker une valeur numérique de type entière  (ex. 1, 3, 33, 56, etc.). Une variable peut également stocker en mémoire l'instance d'un objet, par exemple une chaîne de caractères avec une instance de la classe "String" (ex. <tt>String exemple = "Exemple";</tt>). Voici un exemple de déclaration et assignation d'une valeur à une variable dans une classe :</p>

```java
public class Exemple1 {

public static void main(String[] args) {

// Création d&#39;une variable de type int
int entier = 33;

// Création d&#39;une variable de type booléenne
boolean test = false;

}
}
```


<p>Il est important d'utiliser les guillemets droits (ASCII) <pre>"</pre> pour délimiter les chaînes de caractères. Certains environnements (comme le site Web du cours INF 1220 ou Microsoft Word) peuvent parfois convertir automatiquement les guillemets droits en guillemets à la française (« »). En tant que programmeur, c'est à vous de faire la correction lorsque vous recopiez le code informatique.</p>

<h3>Les noms des variables</h3>

<p>Dans la déclaration des noms des variables, il est fortement conseillé d'utiliser des noms indicatifs. Il s'agit donc d'utiliser le nom qui évoque le mieux l'information stockée. 
Les contraintes suivantes sont à respecter dans l'écriture des noms de variables :</p>
<ul> 
<li>Le premier caractère d'une variable ne doit pas être un chiffre. </li> 
<li>Aucun espace ne peut être présent dans le nom. </li> 
<li>Un nom de variable qui contient une lettre majuscule est différent du même nom écrit en minuscule. </li> 
<li>Les caractères suivants : &amp;, {, }, [, ], #, %, \, ï, ¤, !, /, @,^, =, ', &lt;, &gt;, ; et , ne peuvent être utilisés dans l'écriture d'un nom de variable. Il est possible d'utiliser des caractères accentués (éù) ou même des caractères asiatiques or arabes. </li> 
<li>La norme de programmation veut que l'on commence une variable par une minuscule. S'il est nécessaire de décrire celle-ci avec plusieurs mots, nous vous suggérer d'utiliser une transition minuscule-majuscule pour séparer les mots. Exemple : "uneAutreVariable", "entierResultatMultiplication", etc.</li>
</ul> 

<p>Le nombre de lettres composant le nom d'une variable est indéfini. Néanmoins, l'objectif principal d'un nom de variable est de renseigner le programmeur sur son contenu.</p> 

<h3>La notion de type</h3> 
<p>Lors de l'écriture d'un programme, le programmeur doit définir les variables. C'est ainsi que le programmeur explique à l'ordinateur la nature de chaque donnée. Cette explication passe par la notion de type. Le type d'une valeur permet de déterminer la nature de l'information stockée dans une variable. À chaque type sont associés les éléments suivants :</p> 
<ul> 
<li>Un code spécifique permettant de traduire l'information en binaire et réciproquement. </li> 
<li>Un ensemble d'opérations réalisables en fonction du type de variable utilisé; il est possible de diviser deux variables du type numérique alors qu'il est impossible de diviser deux variables de type caractère. </li> 
<li>Un intervalle de valeurs possibles qui dépendent du codage utilisé. Donc, à chaque type de variable correspond un nombre d'octets, et par conséquent, un nombre limité de valeurs différentes. </li> 
</ul> 
<p>En effet, un octet est un regroupement de 8 bits, et un bit ne peut être qu'un 0 ou un 1. Une donnée codée sur un octet peut prendre 256 valeurs. <br /></p> 

<h3>Les types de base en Java</h3> 
<p>Comme la plupart des langages de programmation, Java propose des types de base permettant la manipulation de valeurs numériques entières ou de caractères. En principe, comme le Java est un langage OO, tous les éléments devraient être des objets (ex. String, Serializer, HashMap, etc.). Or, à la création du langage, les concepteurs ont décidé de créer des types "non-objet" afin de faciliter l'usage et réduire la complexité pour les types de base. Ces types sont donc représentés par des mots-clés, prédéfinis par le langage. Ils sont également dits simples, car à un instant donné, ces types de variables ne peuvent contenir qu'une seule valeur. Le tableau ci-dessous représente les différents types en Java.</p> 
<table border="1" cellpadding="0" width="750"> 
<tbody> 
<tr> 
<td> 
<p><strong>Type</strong></p> 
</td> 
<td> 
<p><strong>Désignation</strong></p> 
</td> 
<td> 
<p><strong>domaine</strong></p> 
</td> 
<td> 
<p><strong>Constantes</strong></p> 
</td> 
<td> 
<p><strong>Opérations</strong></p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>entiers</strong></p> 
</td> 
<td> 
<p><strong>byte</strong> entiers sur 8 bits <br /><strong>short</strong> entiers sur 16 bits <br /><strong>int</strong> entiers sur 32 bits <br /><strong>long</strong> entiers sur 64 bits</p> 
</td> 
<td> 
<p>-128 à 127 <br />-32768 à 32767 <br />-2147483648 à 2147483647 <br />-9223372036854775808 à 9223372036854775807</p> 
</td> 
<td> 
<p>323 constante décimale <br />0xF2 constante héxadécimale <br />0777 constante octale <br />323l constante &quot;long&quot;</p> 
</td> 
<td> 
<p>unaire : +, - <br />binaire : +, -, *, / %</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>réels</strong></p> 
</td> 
<td> 
<p><strong>float</strong> réels simple précision (32 bits) <br /><strong>double</strong> réels double précision (64bits)</p> 
</td> 
<td> 
<p>+- 3.40282346638528860e+38 <br />+- 1.40129846432481707e-45 <br /><br />+- 1.79769313486231570e+308 <br />+- 4.94065645841246544e-324</p> 
</td> 
<td> 
<p>2.f .32f 2.33f 2e4f 2.e4f .3e4f <br />2. .32 2.33 2e4 2.e4 .3e4</p> 
</td> 
<td> 
<p>unaire : +, - <br />binaire : +, -, *, / </p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>caractère</strong></p> 
</td> 
<td> 
<p><strong>char</strong></p> 
</td> 
<td> 
<p>codage Unicode (valeurs entières sur 16 bits)</p> 
</td> 
<td> 
<p>'a' 'A' <br />'\n' retour à la ligne <br />'\t' tabulation horizontale</p> 
</td> 
<td><br /></td> 
</tr> 
<tr> 
<td> 
<p><strong>booléen</strong></p> 
</td> 
<td> 
<p><strong>boolean</strong></p> 
</td> 
<td> 
<p>true false</p> 
</td> 
<td> 
<p>true false</p> 
</td> 
<td> 
<p>&amp;&amp; et logique <br />|| ou logique <br />! négation</p> 
</td> 
</tr> 
</tbody> 
</table> 
<p>N.B. Les chaînes de caractères ne correspondent pas à un type de données mais à une classe; ceci signifie qu'une chaîne de caractère est un objet possédant des attributs et des méthodes. Une chaîne peut donc être déclarée de la façon suivante :</p> 
<pre><strong><em>String s = "Chaîne de caractères";</em></strong></pre> 


<p>Dans ce cours, il n'est pas nécessaire de devenir un expert dans les types du Java. Vous devez tout de même avoir les bases:</p>
<ol>
<li>Il y a plusieurs types pour représenter les entiers (byte, short, int, long) utilisant une quantité variable de mémoire, et pouvant représenter des nombres plus ou moins volumineux. À l'exception du type « char » qui peut être considéré comme un type représentant des entiers (de 0 à 65536), les types entiers en Java sont toujours signés (ils permettent de représenter à la fois les nombres positifs et négatifs). Notez qu'il y a toujours une valeur négative de plus grande amplitude que n'importe quelle valeur positive (par exemple, -128, -32768, -2147483648, etc.) ce qui signifie qu'on ne peut toujours prendre la valeur absolue d'un entier en Java dans le sens où, par exemple, la valeur 2147483648 ne peut pas être représentée par un « int » alors que -2147483648 est parfaitement légitime.  </li>
<li>Les types entiers n'ont qu'une seule valeur zéro. Les nombres à virgule flottantes ont deux zéros (-0 et +0). Nous avons que les valeurs zéros sont égales (+0 == -0). Par contre, les deux zéros sont distincts: 1/-0 donne l'infini négatif (1/-0.0 == Double.NEGATIVE_INFINITY) alors que 1/+0 donne l'infini positif (1/0.0 == Double.POSITIF_INFINITY).
</li>
<li>En informatique, on définit l'ensemble des nombres positifs comme étant les nombres plus grands que zéro. Les nombres négatifs sont les nombres plus petits que zéro. En Java, la fonction Math.signum retourne -1, 0 ou 1 selon que le nombre est négatif, nul ou positif.</li>
<li>En Java, on ne peut pas représenter les valeurs réelles. On utilise plutôt des nombres à virgule flottante. Ainsi donc, on peut utiliser des « double » pour consacrer 64 bits afin de représenter des nombres. On utilise alors la norme « binary64 » qui accorde 53 bits à la mantisse d'une représentation binaire. En d'autres mots, on peut pratiquement représenter n'importe quel nombre de la forme m x 2<sup>p</sup> tant que m n'excède pas 2<sup>53</sup>. En particulier, le type « double » en Java peut représenter tous les entiers (positifs et négatifs) qui n'excèdent pas une magnitude de 2<sup>53</sup>. Quand un nombre ne peut pas être  être représenté, Java va trouver le nombre à virgule flottante le plus proche. Si jamais nous arrivons exactement entre deux nombres à virgule flottante, comme c'est le cas avec le nombre 9000000000000002.5, Java va choisir le nombre le plus proche qui a une mantisse paire (ici 9000000000000002).</li>
</ol>


<p>Les types ont des limites qu'il faut connaître. En 2021, on pouvait lire ceci dans les journaux:</p>
<blockquote>
Le cours de l’action Berkshire Hathaway Inc de Warren Buffett est passé à plus de 400 000 $ par action de catégorie A. Mais l’impressionnante course de 41 ans de l’action pourrait bientôt s’arrêter brutalement si la bourse américaine Nasdaq ne met pas à niveau ses systèmes informatiques bientôt, a rapporté le Wall Street Journal. La raison en est que le cours de l’action Berkshire Hathaway est très proche du nombre le plus élevé que les ordinateurs du Nasdaq peuvent gérer. Le Nasdaq et quelques autres opérateurs du marché utilisent des systèmes 32 bits pour stocker les données en nombres binaires, qui comprennent des uns et des zéros. Par conséquent, le plus grand nombre possible est de deux à la 32e puissance moins un, soit 4 294 967 295. Les cours des actions sont généralement affichés jusqu’à quatre décimales, de sorte que le prix le plus élevé possible est de 429 496,7295 $, selon le rapport du WSJ.
</blockquote>


<h3>Lecture Wikipédia</h3>

Article <a href="https://fr.wikipedia.org/wiki/Virgule_flottante">Virgule flottante</a>.

<h3>Lecture dans le livre de référence</h3>

<p>Pour aller plus en profondeur sur les types (optionnel), vous pouvez  lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 3:</p>
<ul>
	<li>Section 1 : La notion de type</li>
	<li>Section 2 : Les types Entier</li>
<li>Section 3 : Les types flottants</li>
<li>Section 4 : Le type caractère</li>
<li>Section 5 : Le type booléen</li>
</ul>


<h3>Vidéos suggérées</h3>

<iframe width="560" height="315" src="https://www.youtube.com/embed/SvPGiy5UXRI" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/mtizhxkB-Zw" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<h3>La déclaration d'une variable dans une fonction.</h3> 
<p>La déclaration de la variable se fait de la même manière, quel que soit le type de donnée utilisé. Au cours de cette opération, le programmeur attribue le type et le nom de la variable. Pour déclarer une variable, il suffit d'écrire l'instruction selon la syntaxe suivante : <br /><strong>Type</strong> nomdelavariable; ou <strong>type</strong> nomdelavariable1, nomdelavariable2; où le type représente un des types définis au tableau précédent.</p>

<p>Quand plusieurs variables sont de même type, il faut les séparer par une virgule (,) (par contre, la norme ne recommande pas cette façon de déclarer les variables). Pour expliquer à l'ordinateur que l'instruction de déclaration est terminée pour le type donné, un point virgule (;) est placé obligatoirement à la fin de la ligne d'instruction.</p> 

<iframe height="800px" width="100%" src="https://replit.com/@lemire/exemple23?v=1&lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups"></iframe>

<h1><a id="opérateurs" name="opérateurs"></a>Les opérateurs de base</h1>

<p>Les opérateurs sont des symboles qui agissent sur des valeurs ou des variables. Ils permettent d'effectuer des opérations arithmétiques, de comparaison, logiques, etc. Les opérateurs sont très nombreux dans le langage Java. Nous allons nous limiter ici aux opérateurs de base.</p>

<h2>Les opérateurs arithmétiques</h2>

<p>Les opérateurs arithmétiques permettent d'effectuer des opérations mathématiques de base.</p>

<table border="1" cellpadding="0" width="750"> 
<tbody> 
<tr> 
<td> 
<p><strong>Opérateur</strong></p> 
</td> 
<td> 
<p><strong>Signification</strong></p> 
</td> 
<td> 
<p><strong>Exemple</strong></p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>+</strong></p> 
</td> 
<td> 
<p>Addition</p> 
</td> 
<td> 
<p>5 + 3 = 8</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>-</strong></p> 
</td> 
<td> 
<p>Soustraction</p> 
</td> 
<td> 
<p>5 - 3 = 2</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>*</strong></p> 
</td> 
<td> 
<p>Multiplication</p> 
</td> 
<td> 
<p>5 * 3 = 15</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>/</strong></p> 
</td> 
<td> 
<p>Division</p> 
</td> 
<td> 
<p>5 / 3 = 1.666...</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>%</strong></p> 
</td> 
<td> 
<p>Modulo (reste de la division)</p> 
</td> 
<td> 
<p>5 % 3 = 2</p> 
</td> 
</tr> 
</tbody> 
</table> 

<h2>Les opérateurs de comparaison</h2>

<p>Les opérateurs de comparaison permettent de comparer des valeurs entre elles. Ils retournent généralement un booléen (vrai ou faux).</p>

<table border="1" cellpadding="0" width="750"> 
<tbody> 
<tr> 
<td> 
<p><strong>Opérateur</strong></p> 
</td> 
<td> 
<p><strong>Signification</strong></p> 
</td> 
<td> 
<p><strong>Exemple</strong></p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>==</strong></p> 
</td> 
<td> 
<p>Égal à</p> 
</td> 
<td> 
<p>5 == 3 est faux</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>!=</strong></p> 
</td> 
<td> 
<p>Différent de</p> 
</td> 
<td> 
<p>5 != 3 est vrai</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>&gt;</strong></p> 
</td> 
<td> 
<p>Plus grand que</p> 
</td> 
<td> 
<p>5 &gt; 3 est vrai</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>&lt;</strong></p> 
</td> 
<td> 
<p>Plus petit que</p> 
</td> 
<td> 
<p>5 &lt; 3 est faux</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>&gt;=</strong></p> 
</td> 
<td> 
<p>Plus grand ou égal à</p> 
</td> 
<td> 
<p>5 &gt;= 3 est vrai</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>&lt;=</strong></p> 
</td> 
<td> 
<p>Plus petit ou égal à</p> 
</td> 
<td> 
<p>5 &lt;= 3 est faux</p> 
</td> 
</tr> 
</tbody> 
</table> 

<h2>Les opérateurs logiques</h2>

<p>Les opérateurs logiques permettent de combiner des expressions booléennes.</p>

<table border="1" cellpadding="0" width="750"> 
<tbody> 
<tr> 
<td> 
<p><strong>Opérateur</strong></p> 
</td> 
<td> 
<p><strong>Signification</strong></p> 
</td> 
<td> 
<p><strong>Exemple</strong></p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>&amp;&amp;</strong></p> 
</td> 
<td> 
<p>Et logique</p> 
</td> 
<td> 
<p>(5 &gt; 3) &amp;&amp; (8 &gt; 5) est vrai</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>||</strong></p> 
</td> 
<td> 
<p>Ou logique</p> 
</td> 
<td> 
<p>(5 &gt; 3) || (3 &gt; 8) est vrai</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>!</strong></p> 
</td> 
<td> 
<p>Négation</p> 
</td> 
<td> 
<p>!(5 &gt; 3) est faux</p> 
</td> 
</tr> 
</tbody> 
</table> 

<h2>Les opérateurs d'affectation</h2>

<p>Les opérateurs d'affectation permettent d'assigner des valeurs à des variables.</p>

<table border="1" cellpadding="0" width="750"> 
<tbody> 
<tr> 
<td> 
<p><strong>Opérateur</strong></p> 
</td> 
<td> 
<p><strong>Signification</strong></p> 
</td> 
<td> 
<p><strong>Exemple</strong></p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>=</strong></p> 
</td> 
<td> 
<p>Affectation simple</p> 
</td> 
<td> 
<p>int a = 5;</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>+=</strong></p> 
</td> 
<td> 
<p>Affectation par addition</p> 
</td> 
<td> 
<p>a += 3; // équivalent à a = a + 3;</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>-=</strong></p> 
</td> 
<td> 
<p>Affectation par soustraction</p> 
</td> 
<td> 
<p>a -= 2; // équivalent à a = a - 2;</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>*=</strong></p> 
</td> 
<td> 
<p>Affectation par multiplication</p> 
</td> 
<td> 
<p>a *= 4; // équivalent à a = a * 4;</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>/=</strong></p> 
</td> 
<td> 
<p>Affectation par division</p> 
</td> 
<td> 
<p>a /= 2; // équivalent à a = a / 2;</p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>%=</strong></p> 
</td> 
<td> 
<p>Affectation par modulo</p> 
</td> 
<td> 
<p>a %= 3; // équivalent à a = a % 3;</p> 
</td> 
</tr> 
</tbody> 
</table> 

<h2>Les opérateurs ternaires</h2>

<p>L'opérateur ternaire est un opérateur conditionnel qui permet de simplifier l'écriture de certaines expressions.</p>

<table border="1" cellpadding="0" width="750"> 
<tbody> 
<tr> 
<td> 
<p><strong>Opérateur</strong></p> 
</td> 
<td> 
<p><strong>Signification</strong></p> 
</td> 
<td> 
<p><strong>Exemple</strong></p> 
</td> 
</tr> 
<tr> 
<td> 
<p><strong>?:</strong></p> 
</td> 
<td> 
<p>Si ... alors ... sinon</p> 
</td> 
<td> 
<p>int a = (b &gt; c) ? b : c;</p> 
</td> 
</tr> 
</tbody> 
</table> 

<h2>Priorité des opérateurs</h2>

<p>La priorité des opérateurs détermine l'ordre dans lequel les opérations sont effectuées dans une expression. Par exemple, dans l'expression <code>3 + 5 * 2</code>, la multiplication est effectuée avant l'addition en raison de la priorité des opérateurs.</p>

<p>Voici un tableau résumant la priorité des opérateurs que nous avons vus :</p>

<table border="1" cellpadding="0" width="750"> 
<tbody> 
<tr> 
<td> 
<p><strong>Niveau</strong></p> 
</td> 
<td> 
<p><strong>Opérateurs</strong></p> 
</td> 
<td> 
<p><strong>Exemple</strong></p> 
</td> 
</tr> 
<tr> 
<td> 
<p>1</p> 
</td> 
<td> 
<p>++ --</p> 
</td> 
<td> 
<p>a++ + ++a</p> 
</td> 
</tr> 
<tr> 
<td> 
<p>2</p> 
</td> 
<td> 
<p>* / %</p> 
</td> 
<td> 
<p>a * b / c</p> 
</td> 
</tr> 
<tr> 
<td> 
<p>3</p> 
</td> 
<td> 
<p>+ -</p> 
</td> 
<td> 
<p>a + b - c</p> 
</td> 
</tr> 
<tr> 
<td> 
<p>4</p> 
</td> 
<td> 
<p>&amp;&amp;</p> 
</td> 
<td> 
<p>a &amp;&amp; b</p> 
</td> 
</tr> 
<tr> 
<td> 
<p>5</p> 
</td> 
<td> 
<p>||</p> 
</td> 
<td> 
<p>a || b</p> 
</td> 
</tr> 
<tr> 
<td> 
<p>6</p> 
</td> 
<td> 
<p>?:</p> 
</td> 
<td> 
<p>a ? b : c</p> 
</td> 
</tr> 
<tr> 
<td> 
<p>7</p> 
</td> 
<td> 
<p>= += -= *= /= %=</p> 
</td> 
<td> 
<p>a = b + c</p> 
</td> 
</tr> 
</tbody> 
</table> 

<h2>Exercices</h2>

<p>Voici quelques exercices pour pratiquer ce que vous venez d'apprendre :</p>

<ol>
<li>Déclarez des variables de différents types et assignez-leur des valeurs.</li>
<li>Utilisez les opérateurs arithmétiques pour effectuer des calculs sur ces variables.</li>
<li>Comparez les variables entre elles en utilisant les opérateurs de comparaison.</li>
<li>Utilisez les opérateurs logiques pour combiner des expressions booléennes.</li>
<li>Utilisez l'opérateur ternaire pour simplifier une expression conditionnelle.</li>
<li>Pratiquez l'affectation de valeurs à des variables en utilisant les opérateurs d'affectation.</li>
</ol>

<p>Références :</p>
<ul>
<li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">Types de données (Oracle)</a></li>
<li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html">Opérateurs (Oracle)</a></li>
</ul>
