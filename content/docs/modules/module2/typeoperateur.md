---
title: "Introduction aux types de base et à leurs opérateurs"
weight: 3
---

# Introduction aux types de base et à leurs opérateurs


## Mise en garde pédagogique

<p>Si on prend un cours de Mandarin, on ne s'attend pas à comprendre tout le Mandarin lu ou écouté du premier coup ou même du deuxième. Il en va de même lorsqu'on étudie un langage de programmation, surtout s'il s'agit du premier langage de programmation appris. La première fois, la seconde fois, ou même la troisième fois que vous verrez un bout de code, il est parfaitement normal de ne pas le comprendre entièrement. C'est d'autant plus vrai que le langage Java a un syntaxe plutôt lourde avec beaucoup de mots réservés à la signification abstraite. Vous verrez beaucoup de mots comme "class", "public", "static", "void" dans ce cours. Si ça vous semble être du jargon, c'est parce que c'est exactement ce dont il s'agit. Monter un programme en Java n'est pas chose aisée, il faut comprendre que les "classes" vont dans des fichiers avec un nom correspondant à la classe, il faut comprendre que seule la méthode "public static void main(String[])" est exécutable, etc., etc. Il est impossible d'absorber tout ça en un jour, en une semaine ou même en quelques courtes semaines. Ça prend du temps avant de s'y retrouver.</p>

<p>Et c'est pire que vous pouvez peut-être l'imaginer. Même après avoir fait du Java pendant 30 années, on ne comprend pas tout. La grammaire, la syntaxe, est lourde, complexe, nuancée. C'est pire encore avec certains langages comme C++ que peu de gens au monde maîtrisent entièrement. Et même quand on comprend la syntaxe, comprendre ce que fait le code n'est pas toujours évident. Ce n'est pas parce qu'on connaît la grammaire française qu'on sait lire tous les textes en français.</p>

<p>C'est là que l'intérêt du concept de pseudo-code prend tout son sens. Au coeur de la programmation, on trouve l'écriture d'algorithmes, et un algorithme existe indépendamment du langage de programmation. Le pseudo-code l'illustre parfaitement.</p>
<p>Il n'est donc pas nécessaire, pour programmer, de tout savoir et de tout comprendre. Vous ne terminerez pas le cours INF 1220 avec une maîtrise intégrale du Java. Plusieurs aspects resteront mystérieux à vos yeux. C'est normal.</p>

<p>Utilisez donc l'approche suivante. Quand vous rencontrez un nouveau code Java, ne le prenez pas dans son ensemble tout d'un coup. Faites comme vous le feriez en français : lisez une ligne à la fois. N'insistez pas pour tout comprendre. Développez une intuition pour les variables, les méthodes, etc. Allez-y par étape ! Prenez votre temps ! Prenez des notes. </p>

<p>Il en va de même quand vous écrivez du code. Commencez par le plus simple, et progressez lentement, en prenant des notes, en vous laissant des commentaires. Souvent il est utile d'écrire le pseudo-code avant d'écrire le code en Java.</p>

## Environnement de développement (rappel)

<p>Si vous devez compiler des classes Java sur votre PC, faites les choses simplement. Essayez d'utiliser les outils les plus élémentaires. Concentrez-vous sur le Java, et non pas sur les environnements et les outils. Une erreur fréquente des débutants est de perdre beaucoup de temps au sein de systèmes qu'ils ne maîtrisent pas à essayer de programmer dans un langage qu'ils ne maîtrisent pas. Il y faut y aller pas à pas.</p>

{{< youtube id="1ttHH5MlNug" >}}


## Les variables et les types

<p>Une variable permet de manipuler des données et des valeurs. Elle se caractérise par un nom et un type. Le nom sert à repérer un emplacement mémoire dans lequel la valeur de la variable sera stockée. Quant au type, il permet de déterminer la façon dont la valeur de la variable est traduite en code binaire, ainsi que la taille de son emplacement mémoire. Par exemple, le type "int" permet de stocker une valeur numérique de type entière  (ex. 1, 3, 33, 56, etc.). Une variable peut également stocker en mémoire l'instance d'un objet, par exemple une chaîne de caractères avec une instance de la classe "String" (ex. <tt>String exemple = "Exemple";</tt>). Voici un exemple de déclaration et assignation d'une valeur à une variable dans une classe :</p>

{{<inlineJava path="Exemple1.java" lang="java" >}}
public class Exemple1 {

	public static void main(String[] args) {

		// Création d&#39;une variable de type int
		int entier = 33;

		// Création d&#39;une variable de type booléenne
		boolean test = false;

	}
}
{{</inlineJava>}}

<p>Il est important d'utiliser les guillemets droits (ASCII) <pre>"</pre> pour délimiter les chaînes de caractères. Certains environnements (comme le site Web du cours INF 1220 ou Microsoft Word) peuvent parfois convertir automatiquement les guillemets droits en guillemets à la française (« »). En tant que programmeur, c'est à vous de faire la correction lorsque vous recopiez le code informatique.</p>

### Les noms des variables

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

### La notion de type

<p>Lors de l'écriture d'un programme, le programmeur doit définir les variables. C'est ainsi que le programmeur explique à l'ordinateur la nature de chaque donnée. Cette explication passe par la notion de type. Le type d'une valeur permet de déterminer la nature de l'information stockée dans une variable. À chaque type sont associés les éléments suivants :</p> 
<ul> 
<li>Un code spécifique permettant de traduire l'information en binaire et réciproquement. </li> 
<li>Un ensemble d'opérations réalisables en fonction du type de variable utilisé; il est possible de diviser deux variables du type numérique alors qu'il est impossible de diviser deux variables de type caractère. </li> 
<li>Un intervalle de valeurs possibles qui dépendent du codage utilisé. Donc, à chaque type de variable correspond un nombre d'octets, et par conséquent, un nombre limité de valeurs différentes. </li> 
</ul> 
<p>En effet, un octet est un regroupement de 8 bits, et un bit ne peut être qu'un 0 ou un 1. Une donnée codée sur un octet peut prendre 256 valeurs. <br /></p> 

### Les types de base en Java

<p>Comme la plupart des langages de programmation, Java propose des types de base permettant la manipulation de valeurs numériques entières ou de caractères. En principe, comme le Java est un langage OO, tous les éléments devraient être des objets (ex. String, Serializer, HashMap, etc.). Or, à la création du langage, les concepteurs ont décidé de créer des types "non-objet" afin de faciliter l'usage et réduire la complexité pour les types de base. Ces types sont donc représentés par des mots-clés, prédéfinis par le langage. Ils sont également dits simples, car à un instant donné, ces types de variables ne peuvent contenir qu'une seule valeur. Le tableau ci-dessous représente les différents types en Java.</p>

| Type      | Désignation                                                                 | Domaine                                                                                         | Constantes                                                        | Opérations                           |
|-----------|-----------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|-------------------------------------------------------------------|--------------------------------------|
| entiers   | byte (8 bits)<br>short (16 bits)<br>int (32 bits)<br>long (64 bits)        | -128 à 127<br>-32768 à 32767<br>-2147483648 à 2147483647<br>-9223372036854775808 à 9223372036854775807 | 323 (décimale)<br>0xF2 (hexadécimale)<br>0777 (octale)<br>323l (long) | unaire : +, -<br>binaire : +, -, *, /, %                      |
| réels     | float (simple précision, 32 bits)<br>double (double précision, 64 bits)    | ±3.40282346638528860e+38<br>±1.40129846432481707e-45<br><br>±1.79769313486231570e+308<br>±4.94065645841246544e-324 | 2.f, .32f, 2.33f, 2e4f, 2.e4f, .3e4f<br>2., .32, 2.33, 2e4, 2.e4, .3e4 | unaire : +, -<br>binaire : +, -, *, /                |
| caractère | char                                                                        | codage Unicode (valeurs entières sur 16 bits)                                                    | 'a', 'A', '\n' (retour à la ligne), '\t' (tabulation)            |                                      |
| booléen   | boolean                                                                     | true, false                                                                                      | true, false                                                        | && (et logique), \|\| (ou logique), ! (négation) |

<p>N.B. Les chaînes de caractères ne correspondent pas à un type de données mais à une classe; ceci signifie qu'une chaîne de caractère est un objet possédant des attributs et des méthodes. Une chaîne peut donc être déclarée de la façon suivante :</p>

```java {style=github}
String s = "Chaîne de caractères";
```


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


### Mot-clé var

En Java, le mot-clé var permet de déclarer des variables locales avec une inférence de type, introduite dans Java 10. Il simplifie le code en évitant de spécifier explicitement le type d'une variable lorsque celui-ci peut être déduit par le compilateur à partir de l'expression d'initialisation. Cela améliore la lisibilité, surtout pour les types complexes comme les collections ou les classes génériques, tout en maintenant la sûreté du typage statique. Cependant, var ne peut être utilisé que pour des variables locales dans des blocs de code, comme les méthodes ou les blocs d'initialisation, et nécessite une initialisation immédiate. Il ne peut pas être utilisé pour les champs de classe, les paramètres de méthode ou les types de retour. De plus, son usage doit rester clair pour éviter de nuire à la compréhension du code.

{{<inlineJava path="VarExample.java" lang="java">}}
import java.util.ArrayList;

public class VarExample {
    public static void main(String[] args) {
        var message = "Bonjour, Java!";
        var numbers = new ArrayList<Integer>();
        numbers.add(42);

        System.out.println(message);
        System.out.println("Premier élément: " + numbers.get(0));
    }
}
{{</inlineJava>}}

## Les types Record

En Java, les records, introduits dans Java 14 comme fonctionnalité expérimentale et finalisés dans Java 16, permettent de définir des classes immuables de manière concise pour représenter des données. Un record déclare automatiquement des champs privés finaux, un constructeur, et tous les autres champs requis réduisant ainsi le code répétitif. Ils sont idéaux pour les objets de transfert de données (DTO) ou les structures de données simples. Les records ne peuvent pas être modifiés après leur création, et leurs champs doivent être initialisés via le constructeur généré.

{{<inlineJava path="RecordExample.java" lang="java">}}
import java.util.ArrayList;

public class RecordExample {
    public static void main(String[] args) {
        var personne = new Personne("Alice", 30);
        var listePersonnes = new ArrayList<Personne>();
        listePersonnes.add(personne);

        System.out.println(personne);
        System.out.println("Première personne: " 
		 + listePersonnes.get(0).nom());
    }
}

record Personne(String nom, int age) {}
{{</inlineJava>}}

### Les blocs de texte


Les blocs de texte (text blocks) en Java, introduits avec Java 15 , permettent de définir des chaînes de caractères multilignes de manière plus lisible et concise. Ils sont particulièrement utiles pour représenter des chaînes complexes comme du JSON, du HTML, du SQL ou tout autre contenu textuel nécessitant des retours à la ligne, sans avoir à utiliser des concaténations ou des caractères d'échappement.

{{<inlineJava path="TextBlockExample.java" lang="java">}}
public class TextBlockExample {
    public static void main(String[] args) {
        // Requête SQL avec un bloc de texte
        String sqlQuery = """
            SELECT id, nom, email
            FROM utilisateurs
            WHERE actif = true
            ORDER BY nom;
            """;
        System.out.println("Requête SQL :\n" + sqlQuery);

        // JSON avec un bloc de texte et formatage
        String nom = "Alice";
        int age = 30;
        String json = """
            {
                "nom": "%s",
                "age": %d,
                "actif": true
            }
            """.formatted(nom, age);
        System.out.println("JSON :\n" + json);
    }
}
{{</inlineJava>}}

### Les nombres à virgule flottante

Le standard IEEE 754 définit une représentation binaire pour les nombres à virgule flottante, largement utilisé dans les ordinateurs modernes. Un nombre à virgule flottante est structuré en trois parties : le **signe**, l'**exposant** et la **mantisse**. Par exemple, en simple précision (32 bits), 1 bit est alloué au signe (\( s \)), 8 bits à l'exposant (\( e \)) et 23 bits à la mantisse (\( m \)). Le nombre est exprimé par la formule suivante :

\[ (-1)^s \times 1.m \times 2^{e - \text{bias}} \]

où \( \text{bias} = 127 \) pour la simple précision. Le bit de signe détermine si le nombre est positif (\( s = 0 \)) ou négatif (\( s = 1 \)), l'exposant est stocké avec un décalage (bias) pour représenter des nombres très grands ou très petits, et la mantisse représente les chiffres significatifs normalisés (avec un 1 implicite pour les nombres normalisés).

Les types IEEE 754 existent en plusieurs formats, notamment la **simple précision** (32 bits) et la **double précision** (64 bits, avec 1 bit de signe, 11 bits d'exposant et 52 bits de mantisse). La précision est limitée par la taille de la mantisse, ce qui entraîne des erreurs d'arrondi pour les calculs nécessitant une grande précision. Par exemple, en simple précision, la plus petite valeur non nulle (nombre dénormalisé) est de l'ordre de \( 2^{-126} \), et la plus grande valeur est environ \( 2^{128} \). Les nombres dénormalisés, utilisés lorsque l'exposant est minimal, permettent de représenter des valeurs très proches de zéro, mais avec une précision réduite :

\[ (-1)^s \times 0.m \times 2^{-126} \]

Cependant, des phénomènes comme la perte de précision (par exemple, lors de soustractions de nombres proches) ou les erreurs d'arrondi peuvent affecter les calculs.

Le standard IEEE 754 gère également des cas spéciaux comme l'**infini**, les **NaN** (Not a Number) et les nombres **dénormalisés**. Par exemple, un exposant de \( e = 255 \) (tous les bits à 1) avec une mantisse nulle représente \( \pm \infty \), tandis qu'une mantisse non nulle indique un NaN. Ces cas sont essentiels pour gérer les erreurs mathématiques, comme la division par zéro. Le standard garantit une portabilité et une cohérence des calculs à virgule flottante sur différentes architectures, ce qui est crucial pour les applications scientifiques, les simulations numériques et les algorithmes d'apprentissage automatique, où la précision et la stabilité numérique sont critiques.

### Lecture optionnelle dans le livre de référence (Delannoy)

<p>Pour aller plus en profondeur sur les types (optionnel), vous pouvez  lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 3:</p>
<ul>
	<li>Section 1 : La notion de type</li>
	<li>Section 2 : Les types Entier</li>
<li>Section 3 : Les types flottants</li>
<li>Section 4 : Le type caractère</li>
<li>Section 5 : Le type booléen</li>
</ul>


### Vidéos suggérées


{{< youtube id="SvPGiy5UXRI" >}}

{{< youtube id="mtizhxkB-Zw" >}}

### La déclaration d'une variable dans une fonction.

<p>La déclaration de la variable se fait de la même manière, quel que soit le type de donnée utilisé. Au cours de cette opération, le programmeur attribue le type et le nom de la variable. Pour déclarer une variable, il suffit d'écrire l'instruction selon la syntaxe suivante : <br /><strong>Type</strong> nomdelavariable; ou <strong>type</strong> nomdelavariable1, nomdelavariable2; où le type représente un des types définis au tableau précédent.</p>

<p>Quand plusieurs variables sont de même type, il faut les séparer par une virgule (,) (par contre, la norme ne recommande pas cette façon de déclarer les variables). Pour expliquer à l'ordinateur que l'instruction de déclaration est terminée pour le type donné, un point virgule (;) est placé obligatoirement à la fin de la ligne d'instruction.</p> 

{{<inlineJava path="Main.java" lang="java">}}
public class Main {
    
    // Exemple de déclaration de variable de fonctions
    public static void main(String[] args) {
        String messageDeBienvenue = "Bienvenue à INF1220";
        String ajout = " de la TELUQ";
        int a,b,c;
        a = 3;
        b = 4;
        c = a + b;
        System.out.println(messageDeBienvenue + ajout);
    }

}
{{</inlineJava>}}


## Les opérateurs de base

<p>Les opérateurs sont des symboles qui agissent sur des valeurs ou des variables. Ils permettent d'effectuer des opérations arithmétiques, de comparaison, logiques, etc. Les opérateurs sont très nombreux dans le langage Java. Nous allons nous limiter ici aux opérateurs de base.</p>

### Les opérateurs arithmétiques

<p>Les opérateurs arithmétiques permettent d'effectuer des opérations mathématiques de base.</p>

| Opérateur | Signification                | Exemple         |
|-----------|------------------------------|-----------------|
| +         | Addition                     | 5 + 3 = 8       |
| -         | Soustraction                 | 5 - 3 = 2       |
| *         | Multiplication               | 5 * 3 = 15      |
| /         | Division                     | 5 / 3 = 1.666...|
| %         | Modulo (reste de la division)| 5 % 3 = 2       |

### Les opérateurs de comparaison

<p>Les opérateurs de comparaison permettent de comparer des valeurs entre elles. Ils retournent généralement un booléen (vrai ou faux).</p>

| Opérateur | Signification         | Exemple              |
|-----------|----------------------|----------------------|
| ==        | Égal à               | 5 == 3 est faux      |
| !=        | Différent de         | 5 != 3 est vrai      |
| >         | Plus grand que       | 5 > 3 est vrai       |
| <         | Plus petit que       | 5 < 3 est faux       |
| >=        | Plus grand ou égal à | 5 >= 3 est vrai      |
| <=        | Plus petit ou égal à | 5 <= 3 est faux      |

### Les opérateurs logiques

<p>Les opérateurs logiques permettent de combiner des expressions booléennes.</p>

| Opérateur | Signification | Exemple                        |
|-----------|--------------|---------------------------------|
| &&        | Et logique   | (5 > 3) && (8 > 5) est vrai     |
| \|\|      | Ou logique   | (5 > 3) || (3 > 8) est vrai     |
| !         | Négation     | !(5 > 3) est faux               |

### Les opérateurs d'affectation

<p>Les opérateurs d'affectation permettent d'assigner des valeurs à des variables.</p>

| Opérateur | Signification              | Exemple                        |
|-----------|---------------------------|--------------------------------|
| =         | Affectation simple        | int a = 5;                     |
| +=        | Affectation par addition  | a += 3; // a = a + 3;          |
| -=        | Affectation par soustraction | a -= 2; // a = a - 2;       |
| *=        | Affectation par multiplication | a *= 4; // a = a * 4;     |
| /=        | Affectation par division  | a /= 2; // a = a / 2;          |
| %=        | Affectation par modulo    | a %= 3; // a = a % 3;          |

### Les opérateurs ternaires

<p>L'opérateur ternaire est un opérateur conditionnel qui permet de simplifier l'écriture de certaines expressions.</p>

| Opérateur | Signification           | Exemple                    |
|-----------|------------------------|----------------------------|
| ?:        | Si ... alors ... sinon | int a = (b > c) ? b : c;   |

### Priorité des opérateurs

<p>Les expressions sont généralement évaluées de la gauche vers la droite, en suivant la priorité des opérations. La priorité des opérateurs détermine l'ordre dans lequel les opérations sont effectuées dans une expression. Par exemple, dans l'expression <code>3 + 5 * 2</code>, la multiplication est effectuée avant l'addition en raison de la priorité des opérateurs.</p>

<p>Voici un tableau résumant la priorité des opérateurs que nous avons vus :</p>

| Niveau | Opérateurs                | Exemple         |
|--------|---------------------------|-----------------|
| 1      | ++ --                     | a++ + ++a       |
| 2      | * / %                     | a * b / c       |
| 3      | + -                       | a + b - c       |
| 4      | &&                        | a && b          |
| 5      | \|\|                      | a || b          |
| 6      | ?:                        | a ? b : c       |
| 7      | = += -= *= /= %=          | a = b + c       |

Dans le cas où il s'agit de l'évaluation d'une valeur booléenne, Java évalue l'expression
de manière paresseuse, en faisant le moins de travail possible.
Il peut donc omettre l'évaluation d'une partie de l'expression. Par exemple, dans
l'expresson `true || a`, Java va passer outre à l'évaluation de l'expression `a` puisque
la réponse est nécessairement vraie.

Utilisez l'application pour voir si vous avez compris.

{{< webapp path="priority.html" >}}



## Exemple

Assurez-vous de bien comprendre cet exemple.

{{<inlineJava path="Main.java" lang="java">}}
public class Main {
    public static void main(String[] args) {
        // Déclaration de variables avec noms descriptifs
        int nombreEntier = 42;
        double nombreFlottant = 3.14159;
        boolean estPositif = nombreFlottant > 0;
        String messageResultat = "Résultat des calculs : ";

        // Opérations arithmétiques
        int somme = nombreEntier + 10;
        double produit = nombreFlottant * 2.0;
        int resteDivision = nombreEntier % 5;

        // Opérations de comparaison et logique
        boolean estGrand = nombreEntier > 40 && somme <= 100;
        boolean conditionOu = nombreEntier < 50 || !estPositif;

        // Opérateur ternaire pour déterminer le message
        String descriptionNombre = (nombreEntier % 2 == 0) ? 
		     "pair" : "impair";

        // Démonstration des zéros distincts et infinis (IEEE 754)
        double zeroPositif = 0.0;
        double zeroNegatif = -0.0;
        boolean zerosEgaux = (zeroPositif == zeroNegatif); // true
        double infiniPositif = 1.0 / zeroPositif; // +Infini
        double infiniNegatif = 1.0 / zeroNegatif; // -Infini

        // Affichage des résultats
        System.out.println(messageResultat);
        System.out.println("Nombre entier : " + 
		      nombreEntier + " est " + descriptionNombre);
        System.out.println("Somme : " + somme + 
		  ", Produit : " + produit + ", Reste : " + resteDivision);
        System.out.println("Est grand et dans la limite : " + estGrand);
        System.out.println("Condition OU : " + conditionOu);
        System.out.println("Zéros égaux (+0.0 == -0.0) : " + zerosEgaux);
        System.out.println("1.0/+0.0 = " + infiniPositif);
        System.out.println("1.0/-0.0 = " + infiniNegatif);
    }
}
{{</inlineJava>}}

## Les classes enveloppes des types primitifs

Les <strong>classes enveloppes</strong> (ou « wrapper classes ») permettent de manipuler les types primitifs (int, double, boolean, etc.) comme des objets. Chaque type primitif possède une classe enveloppe correspondante : <code>Integer</code> pour <code>int</code>, <code>Double</code> pour <code>double</code>, <code>Boolean</code> pour <code>boolean</code>, etc.

Exemples d’utilisation :

```java  {style=github}
// Création d’un Integer à partir d’un int
int a = 5;
Integer objA = Integer.valueOf(a);

// Conversion automatique (autoboxing)
Integer objB = 10; // Java convertit automatiquement int -> Integer

// Récupérer la valeur primitive (unboxing)
int b = objB; // Java convertit automatiquement Integer -> int


// Méthodes utilitaires
String s = "123";
int n = Integer.parseInt(s); // Convertit une chaîne en int
System.out.println(n + 1); // Affiche 124
```
Les classes enveloppes sont notamment utiles pour bénéficier de méthodes utilitaires (parsing, conversion, etc.). 
Par exemple, les classes enveloppes fournissent des méthodes pratiques pour :
- Convertir une chaîne de caractères en valeur numérique (parsing)
- Convertir une valeur numérique en chaîne de caractères
- Comparer des valeurs
- Obtenir des constantes utiles (valeurs maximales, minimales, etc.)

Exemples :

```java  {style=github}
// Parsing : convertir une chaîne en int
String s = "123";
int n = Integer.parseInt(s); // n vaut 123

// Conversion inverse : int vers String
int x = 42;
String str = Integer.toString(x); // str vaut "42"

// Comparaison
int a = 5, b = 8;
int res = Integer.compare(a, b); // renvoie -1 car a < b

// Constantes utiles
int max = Integer.MAX_VALUE;
int min = Integer.MIN_VALUE;
System.out.println("int max : " + max + ", int min : " + min);
```

Ces méthodes facilitent la manipulation et la conversion des données dans vos programmes Java.





Elles peuvent représenter une valeur, mais une fois cette valeur assignée,
elle peut pas être modifiée. Par exemple&nbsp;:

```java  {style=github}
Integer a = 5;
a = a + 1; // Cela crée un nouvel objet Integer, l’ancien n’est pas modifié
System.out.println(a); // Affiche 6
```

Ici, l’objet Integer initial contenant 5 n’est pas modifié : l’opération crée un nouvel objet contenant 6, et la variable a pointe vers ce nouvel objet. Les classes enveloppes sont donc immuables : leur valeur ne peut pas être changée après création.

Pour comparer la valeur de deux objets issus de classes enveloppes (comme Integer, Double, etc.), il ne faut pas utiliser l’opérateur <code>==</code>, qui compare les références (adresses en mémoire), mais la méthode <code>equals()</code>, qui compare le contenu (la valeur).

Exemple :

```java  {style=github}
Integer a = new Integer(5);
Integer b = new Integer(5);
System.out.println(a == b);      // false (références différentes)
System.out.println(a.equals(b)); // true  (valeurs identiques)
```

Dans cet exemple, <code>a == b</code> est faux car ce sont deux objets distincts, mais <code>a.equals(b)</code> est vrai car ils contiennent la même valeur.

## String et operateur '+'

En Java, le type <code>String</code> représente une séquence de caractères. Les objets String sont <strong>immuables</strong> : une fois créés, ils ne peuvent pas être modifiés. Toute opération qui semble modifier une chaîne (comme la concaténation) crée en réalité un nouvel objet String.

L’opérateur <code>+</code> permet de concaténer des chaînes facilement :

```java  {style=github}
String s1 = "Bonjour";
String s2 = " le monde";
String s3 = s1 + s2; // s3 vaut "Bonjour le monde"
```

Attention : pour comparer le contenu de deux chaînes, il ne faut pas utiliser <code>==</code> (qui compare les références), mais la méthode <code>equals()</code> :

```java  {style=github}
String a = "Java";
String b = new String("Java");
System.out.println(a == b);      // false (références différentes)
System.out.println(a.equals(b)); // true  (contenu identique)
```

Pour tester si une chaîne commence ou se termine par un certain texte, on peut utiliser <code>startsWith()</code> et <code>endsWith()</code> :

```java  {style=github}
String phrase = "Bonjour le monde";
System.out.println(phrase.startsWith("Bon")); // true
System.out.println(phrase.endsWith("monde")); // true
```

Il existe aussi d’autres méthodes utiles comme <code>substring()</code> (extraire une sous-chaîne), <code>toUpperCase()</code>, <code>toLowerCase()</code>, <code>length()</code>, etc.


On peut aussi concaténer une chaîne avec une valeur entière, un double ou tout autre type : Java convertit automatiquement la valeur en chaîne de caractères avant de faire la concaténation. Cela permet d’afficher facilement des résultats ou de construire dynamiquement des messages.

Exemples :

```java  {style=github}
int age = 25;
String message = "J'ai " + age + " ans."; // "J'ai 25 ans."

double prix = 19.99;
String ticket = "Prix : " + prix + " €"; // "Prix : 19.99 €"

boolean ok = true;
String etat = "Succès : " + ok; // "Succès : true"
```

Java convertit automatiquement les valeurs non String en chaîne lors de la concaténation avec l’opérateur <code>+</code> de gauche à droite.

## Exercices

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
