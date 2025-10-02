---
title: "Exercices sur les classes, les variables, les types et les opérateurs"
weight: 40
---


# Exercices sur les classes, les variables, les types et les opérateurs


Prenez en note chaque question. Tentez par vos propres moyens, mais avec l'aide de tout le matériel et de l'Internet, de résoudre le problème. Prévoyez jusqu'à 15 minutes de travail par question. Après avoir bien travaillé la question, consultez la réponse.

{{% hint info %}}

N'oubliez pas d'utiliser notre [pense-bête Java]({{< ref "/docs/pensebete" >}}) au besoin. Pour les mathématiques, 
vous pouvez faire référence à notre rappel sur [les principales notions mathématiques]({{< ref "/docs/extra/math" >}}) du cours.

{{% /hint %}}

N'allez pas trop vite. Il ne sert à rien de lire la question et d'immédiatement lire la réponse. Le but des exercices est de vous amener à travailler la matière. Si vous ne faites que regarder les solutions, vous n'apprenez pas grand chose. Oui, ça va plus vite, mais votre but ici n'est pas la rapidité.

<p>Prenez note qu'<a href="https://rc-inf1220.teluq.ca/">il est permis d'utiliser le robot conversationnel du cours lors des exercises</a>. Cependant vous devriez vous entraîner à produire vos propres réponses.</p>


{{% hint info %}}

## Réponses uniques ?

<p>Les exercices comportent une solution vous permettant de comparer votre approche avec la nôtre. Il n'y a pas de solution unique aux problèmes en général. Vous pouvez arriver avec une solution qui est préférable ou moins bonne que celle que nous offrons. Pour faire ces questions, vous devez avoir fait toutes les lectures préalables. Vous disposez alors toujours des fondements nécessaires pour faire les exercices. Nous vous encourageons tout de même à faire vos propres recherches en complément de vos lectures. Dans certains cas, au sein de la solution que nous offrons, nous pouvons utiliser des notions techniques qui n'ont pas été vues directement dans le cours, mais qui devraient vous être facilement accessibles.</p>

{{% /hint %}}


## Questions/Réponses

## Question 1

<p>En programmation orientée objet (comme le langage Java), quelle est la différence entre une classe et une instance?</p>
<details>
<summary>Réponse</summary>
Une classe est la description abstraite d'un concept. Une instance est la matérialisation en mémoire d'un concept. Par exemple, la classe Client et l'instance Client 11 Alice Bob.
</details>

## Question 2

<p>Vrai ou Faux : Le langage Java est un langage compilé en langage machine?</p>
<details>
<summary>Réponse</summary>
Vrai et Faux: c'est un langage interprété par une machine virtuelle, la JVM. La code est pré-compilé dans un langage intermédiaire, le bytecode. Par la suite, lors de l'exécution, le bytecode peut être compilé en langage machine. 
</details>


## Question 3
Comment est représenté <code>-1</code> en Java ?
<details><summary>Réponse</summary>
<p>En Java, les entiers sont représentés en binaire selon le format «&nbsp;complément à deux&nbsp;». Ainsi, <code>-1</code> est représenté par une suite de bits où tous les bits sont à 1. Par exemple, pour un <code>int</code> (32 bits), <code>-1</code> correspond à <code>0xFFFFFFFF</code> en hexadécimal, soit 32 bits à 1. </p>
</details>

## Question 4
Est-ce que <code>-0.0</code> est égal à <code>0.0</code> en Java ?
<details><summary>Réponse</summary>
<p>En Java, <code>-0.0 == 0.0</code> retourne <code>true</code> car la comparaison d’égalité (<code>==</code>) considère ces deux valeurs comme égales selon la norme IEEE 754. Cependant, il existe une différence binaire entre <code>-0.0</code> et <code>0.0</code> (le signe du zéro), ce qui peut être détecté avec certaines méthodes comme <code>Double.doubleToRawLongBits()</code> ou en utilisant <code>1.0 / -0.0</code> (qui donne <code>-Infinity</code>), alors que <code>1.0 / 0.0</code> donne <code>Infinity</code>.</p>
</details>

## Question 5

<p>À l'aide d'une classe Java et en utilisant l'arithmétique entière, vous devez calculer la moyenne des tailles de 5 enfants, puis imprimer la moyenne à la console et l'écart à la moyenne pour chaque enfant:</p>
<ul>
	<li>Alice : 104 cm</li>
	<li>Bob : 80 cm</li>
	<li>Chuck : 76 cm</li>
	<li>Danielle : 110 cm</li>
	<li>Éloi : 102 cm</li>
</ul>
<details>
<summary>Réponse</summary>

{{<inlineJava path="CalculMoyenne.java" lang="java" >}}
public class CalculMoyenne {
   public static void main(String[] args) {
       int tailleAlice = 104;
       int tailleBob = 80;
       int tailleChuck = 76;
       int tailleDanielle = 110;
       int tailleEloi = 102;
       //Calculer la moyenne
       int moyenne = (tailleAlice + tailleBob + tailleChuck + tailleDanielle + tailleEloi) / 5;
       //Imprimer la moyenne
       System.out.println("Moyenne : " + moyenne);
       //Calcul des écart. Utilisation de la méthode Math.abs pour avoir la valeur absolue
       System.out.println("ECT Alice : " + Math.abs(tailleAlice - moyenne));
       System.out.println("ECT Bob : " + Math.abs(tailleBob - moyenne));
       System.out.println("ECT Chuck : " + Math.abs(tailleChuck - moyenne));
       System.out.println("ECT Danielle : " + Math.abs(tailleDanielle - moyenne));
       System.out.println("ECT Eloi : " + Math.abs(tailleEloi - moyenne));
   }
}
{{</inlineJava>}}


</details>

## Question 6

<p>Quelle est la différence entre un int et un long ?</p>
<details>
<summary>Réponse</summary>
Un entier de type int sera alloué en mémoire à une taille de 32 bits. Sa valeur maximale absolue est donc de 2 147 483 647. L'entier de type long permet des valeurs plus grandes car il est alloué sur un espace de 64 bits (9 223 372 036 854 775 807).
</details>

## Question 7

<p>Que fait le code suivant ? Calculer sur papier pour s'assurer de la compréhension, puis voir la réponse ci-dessous et exécuter le code.</p>

```java  {style=github}
public class Exercice {
    public static void main(String[] args) {
        int i = 33;
        int j = 44;
        int k = 55;
        i++;
        j--;
        i = -(k + i - j);
        i = i%2;
        System.out.println("Résultat:"+ i);  
    }
}
```
<details>
<summary>Réponse</summary>
Le résultat est 0. 1: i++ => i = 34; 2: j-- => j = 43; 3 : k + i - j = 46; 4: -46; 5: -46 % 2 = 0 (le reste de la division par 2. Comme 46 / 2 = 23. Il n'y a pas de reste);
</details>

## Question 8

<p>Quelle sera la valeur de x dans le code suivant?</p>

```java  {style=github}
public class Exercice {
    public static void main(String[] args) {
        int i = 11;
        int j = 22;
        long x = (i>=1) ? ++i : j++;
        System.out.println("x : " + x);
    }
}
```
<details>
<summary>Réponse</summary>
La réponse est 12 car l'opérateur à 3 opérandes "?:" vérifie si i est plus grand ou égal à 1 (c'est le cas), alors la valeur retournée est i pré-incrémenté de 1 : 12.
</details>


## Question 9
Quelle est la valeur de l’expression <code>0xA + 10</code> en Java ? Expliquez pourquoi.
<details><summary>Réponse</summary>
<p><code>0xA</code> représente 10 en décimal, donc <code>0xA + 10</code> vaut 20.</p>
</details>


## Question 36
Expliquez ce qu’est un débordement (overflow) lors d’un calcul avec des entiers en Java. Donnez un exemple de code qui provoque un débordement.
<details><summary>Réponse</summary>
<p>Un débordement se produit lorsqu’une opération arithmétique dépasse la valeur maximale ou minimale qu’un type peut représenter. Par exemple, un <code>int</code> en Java varie de -2 147 483 648 à 2 147 483 647. Si on additionne 1 à la valeur maximale, on « retourne » à la valeur minimale.</p>

```java  {style=github}
int max = Integer.MAX_VALUE;
System.out.println(max);         // 2147483647
System.out.println(max + 1);     // -2147483648 (débordement)
```
</details>


## Question 11

<p>Parmi les noms suivants, quels sont les noms de variable corrects en java
(qui ne seront pas rejetés à la compilation)?</p>

<p>Lesquels sont conseillés ?</p>

<p>1) _176</p>

<p>2) $za21</p>

<p>3) 5var</p>

<p>4) A1234_</p>

<p>5) var</p>

<p>6) monEntier</p>

<p>7) &amp;var</p>

<details><summary>Réponse</summary>

<p>Nom corrects : 1, 2, 4, 5, 6.</p>

<p>Noms conseillés : 5, 6. En effet à moins d&#x2019;avoir de sérieuses raisons
de faire autrement, il faut utiliser les minuscules pour les noms de variables
simples en java, et les majuscules pour articuler les noms de variables
composés comme monEntier.</p>

</details>


## Question 12
Comment écrit-on un nombre en notation hexadécimale en Java ? Donnez un exemple et expliquez à quoi cela sert.
<details><summary>Réponse</summary>
<p>On utilise le préfixe <code>0x</code> pour écrire un nombre en hexadécimal. Exemple :</p>

```java  {style=github}
int x = 0xFF; // 255 en décimal
System.out.println(x); // Affiche 255
```
<p>La notation hexadécimale est utile pour manipuler des valeurs binaires, des couleurs, des adresses mémoire, etc.</p>
</details>


## Question 13

<p>Soit le code suivant :</p>

```java  {style=github}
public class Main {
  public static void main(String[] args) {
    int k, i;
    int myInt = k = (i = 5) * 2;
    System.out.println(myInt);
  }    
}
```

<p>Quel résultat est affiché à la console lors de l&#x2019;exécution ? Pourquoi
?</p>
<ol>
  <li>Une erreur</li>
  <li>10</li>
  <li>5</li>
</ol>

<details><summary>Réponse</summary>

<p>Bonne réponse : 2.</p>

<p>Explication : (i=5) est une expression dont la résultat est la valeur
affectée à i, c&#x2019;est-à-dire 5. Ce résultat est multiplié par deux et
affecté à k, puis affecté à myInt.</p>
</details>




## Question 14

Que fait le code suivant?

```java  {style=github}
int f(int x, int y) {
    x ^= y;
    y ^= x;
    x ^= y;
    return y;    
}
```

<details><summary>Réponse</summary>

<p>La fonction retourne la valeur qui était contenue dans la variable x au début de la fonction. 
<a href="https://fr.wikipedia.org/wiki/Permutation_(informatique)#En_utilisant_l%27opération_XOR">Voir l'article wikipédia sur les techniques de permutation en informatique</a>.
</p>

</details>


## Question 15

Que va afficher ce code à l'écran?

```java  {style=github}
class Main {
  public static void main(String[] args) {
    System.out.println(-1 >> 4);
    System.out.println(-1 >>> 4);
  }
}
```

<details><summary>Réponse</summary>

<p>-1 et 268435455.</p>
</details>

## Question 16

Que calcule cette fonction?

```java  {style=github}
public static boolean f(int x, int y) {
    return (x^y) < 0;
}
```


<details><summary>Réponse</summary>
<p>La fonction retourne la valeur vraie si et seulement si un seul des deux paramètres est négatif. Par exemple, f(-1,1) est vrai, f(2,2) et f(-1,-3) sont faux.</p>
</details>



## Question 18

<p>Vrai ou faux... si <tt>x</tt> est un entier (<tt>int</tt>) négatif, alors <tt>-x</tt> sera un entier positif. </p>


<details><summary>Réponse</summary>
<p>Faux. Définissez <tt>int x = -2147483648</tt>. Vous trouvez alors que <tt>-x == x</tt>.</p>
</details>

## Question 19

<p>Quelle est la valeur de l'expression <tt>2083697005*101</tt> en Java?</p>

<details><summary>Réponse</summary>
<p>L'expression <tt>2083697005*101</tt> est égale à 1. Cela s'explique par le fait que les entiers sont stockés avec 32 bits seulement et que la véritable valeur (210453397505) ne peut pas être représentée. Java tronque le résultat. </p>
</details>

## Question 20

<p>Soit deux entiers positifs (<tt>int</tt>) <tt>x</tt> et <tt>y</tt>. Sachant que la moyenne des deux valeurs est aussi un  entier, donnez une expression qui calcule cette moyenne.</p>

<details><summary>Réponse</summary>
<p>On peut la calculer avec l'expression <tt>y+(x - y)/2</tt>. Il pourrait être tentant d'utiliser l'expression <tt>(x + y)/2</tt>, mais cette dernière est incorrecte comme vous pouvez le vérifier avec ce programme:
 </p>

```java  {style=github}
class Main {
  public static void main(String[] args) {
    int x = 2147483647;
    int y = 2147483645;

    System.out.println((x+y)/2);
    System.out.println(y+(x - y)/2);
  }
}
```

</details>





## Question 21

<p>Soit une chaîne de caractère en Java: <tt>String s = "123";</tt>. Comment puis-je modifier la valeur de cette chaîne de caractères?</p>

<details><summary>Réponse</summary>
<p>En Java, les chaînes de caractères sont immutables, elles ne peuvent être modifiées. On ne peut donc pas modifier la valeur assigné à <tt>s</tt>. Par contre, on peut créer une nouvelle chaîne de caractères et réassigner la variable à cette nouvelle valeur (<tt>s = "1234";</tt>).
</details>


## Question 22

<p>Expliquez la différence entre l'ensemble des nombres non négatifs, et l'ensemble des nombres positifs.</p>

<details><summary>Réponse</summary>
<p>

En informatique, on définit l'ensemble des nombres positifs comme étant les nombres plus grands que zéro. Les nombres négatifs sont les nombres plus petits que zéro. Les nombres non négatifs sont donc les nombres positifs ou nuls.
</details>

## Question 23

<p>Expliquez pourquoi 0.8825149536132812 est égal à 0.8825149536132813 en Java.</p>

<details><summary>Réponse</summary>
<p>
 Dans le cas qui nous concerne, il n'est pas possible de distinguer 0.8825149536132812 et 0.8825149536132813, des nombres à 16 chiffres significatifs. En général, il est possible de représenter l'ensemble des nombres entre -10 à la puissance 308 et 10 à la puissance 308 avec 15 chiffres de précision, mais pas 16 chiffres de précision. Les nombres 0.8825149536132812 et 0.8825149536132813 sont représentés en nombre à virgule flottante comme étant  115673 fois 2 à la puissance -17 ce qui est le nombre 0.88251495361328125. 
</details>


## Question 24

<p>Écrivez un code Java qui affiche tous les entiers pairs de 0 à 20 inclus.</p>
<details><summary>Réponse</summary>
<pre><code>for (int i = 0; i &lt;= 20; i += 2) {
    System.out.println(i);
}
</code></pre>
</details>

## Question 25

Quel sera le résultat de l'expression 1.0 / 0.0 ?

<details><summary>Réponse</summary>
<p>En Java, l'expression <code>1.0 / 0.0</code> retourne <code>Infinity</code> (l'infini positif), car la division par zéro avec des nombres à virgule flottante (double) ne provoque pas d'exception, mais retourne une valeur spéciale représentant l'infini.</p>
</details>

## Question 26

Quel sera le résultat de l'expression 1 / 0 ?

<details><summary>Réponse</summary>
<p>En Java, l'expression <code>1 / 0</code> provoque une erreur de type division par zéro, car la division entière par zéro n'est pas définie.</p>
</details>

## Question 27

Quelle est la différence entre <code>==</code> et <code>equals()</code> pour comparer deux chaînes de caractères en Java ?
<details><summary>Réponse</summary>
<p><code>==</code> compare les références (adresses en mémoire), alors que <code>equals()</code> compare le contenu des chaînes. Il faut utiliser <code>equals()</code> pour vérifier si deux chaînes ont le même texte.</p>
</details>

## Question 28

Que fait l’opérateur <code>+</code> lorsqu’il est utilisé avec des chaînes de caractères et des nombres en Java ? Donnez un exemple.
<details><summary>Réponse</summary>
<p>L’opérateur <code>+</code> concatène les chaînes et convertit automatiquement les nombres en chaînes si l’un des opérandes est une chaîne.</p>

Exemple :

```java  {style=github}
String s = "Valeur : " + 10 + 5; // "Valeur : 105"
```
</details>

## Question 29

Quelle est la valeur de l’expression <code>1 + 2 + "3" + 4 + 5</code> en Java ?
<details><summary>Réponse</summary>
<p>L’expression s’évalue de gauche à droite : <code>1 + 2</code> donne 3, puis <code>3 + "3"</code> donne "33" (concaténation), puis <code>"33" + 4</code> donne "334", puis <code>"334" + 5</code> donne "3345". La valeur finale est <strong>"3345"</strong>.</p>
</details>

## Question 30

Comment extraire une sous-chaîne d’une chaîne en Java ? Donnez un exemple avec <code>substring()</code>.
<details><summary>Réponse</summary>
<p>On utilise la méthode <code>substring(debut, fin)</code> pour obtenir une sous-chaîne allant de l’indice <code>debut</code> (inclus) à <code>fin</code> (exclu).</p>

Exemple :

```java  {style=github}
String texte = "Bonjour";
String sous = texte.substring(0, 3); // "Bon"
```
</details>

## Question 31

Comment vérifier si une chaîne commence ou se termine par un certain texte en Java ?
<details><summary>Réponse</summary>
<p>On utilise <code>startsWith()</code> pour vérifier le début, et <code>endsWith()</code> pour la fin.</p>

Exemple :

```java  {style=github}
String phrase = "Bonjour le monde";
System.out.println(phrase.startsWith("Bon")); // true
System.out.println(phrase.endsWith("monde")); // true
```
</details>



## Question 32

Qu’est-ce qu’une classe enveloppe (wrapper) en Java ? Donnez un exemple d’utilisation pour convertir une chaîne de caractères en entier.

<details><summary>Réponse</summary>
<p>Une classe enveloppe permet de manipuler un type primitif comme un objet. Exemple :</p>

```java  {style=github}
String s = "123";
int n = Integer.parseInt(s); // n vaut 123
```
</details>

## Question 33

Expliquez la différence entre <code>int</code> et <code>Integer</code> en Java. Dans quel cas doit-on utiliser <code>Integer</code> ?

<details><summary>Réponse</summary>
<p><code>int</code> est un type primitif, alors que <code>Integer</code> est une classe objet qui encapsule un int. /p>
</details>

## Question 34

Que vaut l’expression <code>new Integer(3) == new Integer(3)</code> en Java ? Expliquez pourquoi.

<details><summary>Réponse</summary>
<p>L’expression retourne <strong>false</strong>. Chaque appel à <code>new Integer(3)</code> crée un nouvel objet distinct en mémoire : les deux objets ont la même valeur mais ne sont pas le même objet. L’opérateur <code>==</code> compare les références (adresses) des objets, pas leur contenu. Pour comparer la valeur, il faut utiliser <code>equals()</code> :</p>

```java  {style=github}
System.out.println(new Integer(3).equals(new Integer(3))); // true
```
</details>




## Question 35

Quels sont, selon vous, les principaux avantages et inconvénients de Java par rapport à d’autres langages de programmation modernes ?

<details>
<summary>Réponse</summary>
<p><b>Avantages :</b> portabilité, gestion automatique de la mémoire (garbage collector), vaste écosystème de bibliothèques et frameworks, documentation abondante.</p>
<p><b>Inconvénients :</b> performances parfois inférieures au code natif (C/C++), syntaxe parfois verbeuse, nécessité d’installer la JVM.</p>
</details>








