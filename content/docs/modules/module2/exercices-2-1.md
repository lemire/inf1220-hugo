---
title: "Exercices sur les classes, les variables, les types et les opérateurs"
weight: 4
---

<!-- Ajoutez ici le contenu HTML des exercices 2.1 -->


<h1><a id="top" name="top"></a>Module 2</h1><h2>Exercice 2.1</h2><h2 class="partie2">Exercices sur les classes, les variables, les types et les opérateurs</h2>
<h1>Comment faire ces exercices ?</h1>

<p>Prenez en note chaque question. Tentez par vos propres moyens, mais avec l'aide de tout le matériel et de l'Internet, de résoudre le problème. Prévoyez jusqu'à 15 minutes de travail par question. Après avoir bien travaillé la question, consultez la réponse.</p>

<p>N'allez pas trop vite. Il ne sert à rien de lire la question et d'immédiatement lire la réponse. Le but des exercices est de vous amener à travailler la matière. Si vous ne faites que regarder les solutions, vous n'apprenez pas grand chose. Oui, ça va plus vite, mais votre but ici n'est pas la rapidité.</p>


<p>Prenez note qu'<a href="https://rc-inf1220.teluq.ca/">il est permis d'utiliser le robot conversationnel du cours lors des exercises</a>. Cependant vous devriez vous entraîner à produire vos propres réponses.</p>
<h2>Réponses uniques?</h2>

<p>Les exercices comportent une solution vous permettant de comparer votre approche avec la nôtre. Il n'y a pas de solution unique aux problèmes en général. Vous pouvez arriver avec une solution qui est préférable ou moins bonne que celle que nous offrons. Pour faire ces questions, vous devez avoir fait toutes les lectures préalables. Vous disposez alors toujours des fondements nécessaires pour faire les exercices. Nous vous encourageons tout de même à faire vos propres recherches en complément de vos lectures. Dans certains cas, au sein de la solution que nous offrons, nous pouvons utiliser des notions techniques qui n'ont pas été vues directement dans le cours, mais qui devraient vous être facilement accessibles.</p>



<h1>Questions/Réponses<h1>

<h2>Question 1</h2>
<p>En programmation orientée objet (comme le langage Java), quelle est la différence entre une classe et une instance?</p>
<details>
<summary>Réponse</summary>
Une classe est la description abstraite d'un concept. Une instance est la matérialisation en mémoire d'un concept. Par exemple, la classe Client et l'instance Client 11 Alice Bob.
</details>

<h2>Question 2</h2>
<p>Vrai ou Faux : Le langage Java est un langage compilé en langage machine?</p>
<details>
<summary>Réponse</summary>
Vrai et Faux: c'est un langage interprété par une machine virtuelle, la JVM. La code est pré-compilé dans un langage intermédiaire, le bytecode. Par la suite, lors de l'exécution, le bytecode peut être compilé en langage machine. 
</details>

<h2>Question 3</h2>
<p>Vrai ou Faux : Le mot-clé "static" permet de créer une seule variable en mémoire pour plusieurs instances d'un objet?</p>
<details>
<summary>Réponse</summary>
Vrai: le mot-clé static permet de créer une variable "pointant" vers une seule adresse en mémoire. Donc, si la classe Test possède une variable static, toutes les instances de la classe Test accèderont à la même variable en mémoire. Elles pourraient donc modifier cette valeur à tour de rôle.
</details>

<h2>Question 4</h2>
<p>Le code suivant est truffé d'erreurs. Veuillez énumérer les erreurs et les corriger.</p>

```java
public clas PleinErreurs {

    public  int entier = "Entier";
    public static String string = new String("string");
    
    public static void main(String[] args) {
        entier += 33;
        string = entier + string;
        System.out.println(string)
    }
    
}
```

<details>
<summary>Réponse</summary>
<ul>
	<li>Le mot clas : class</li>
	<li>Il manque le mot static devant la variable int entier</li>
	<li>On ne peut pas initialiser un int avec une chaîne de caractère. Mettre entier = 0;</li>
	<li>Ajouter un point-virgule à la fin du System.out.println</li>
</ul>

```java
public class PleinErreurs {

    public static int entier = 0;
    public static String string = new String("string");
    
    public static void main(String[] args) {
        entier += 33;
        string = entier + string;
        System.out.println(string);
    }
    
}
```
Le fait de faire : "entier + string" n'est pas une erreur. La JVM va convertir automatiquement le int en string suivant l'opération "+".
</details>

<h2>Question 5</h2>
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

```java
/**
 * Exemple question #5
 * @author cgouin
 */
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
```

</details>

<h2>Question 6</h2>
<p>Quelle est la différence entre un int et un long ?</p>
<details>
<summary>Réponse</summary>
Un entier de type int sera alloué en mémoire à une taille de 32 bits. Sa valeur maximale absolue est donc de 2 147 483 647. L'entier de type long permet des valeurs plus grandes car il est alloué sur un espace de 64 bits (9 223 372 036 854 775 807).
</details>

<h2>Question 7</h2>
<p>Que fait le code suivant ? Calculer sur papier pour s'assurer de la compréhension, puis voir la réponse ci-dessous et exécuter le code.</p>

```java
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

<h2>Question 8</h2>
<p>Quelle sera la valeur de x dans le code suivant?</p>

```java
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

<h2>Question 9</h2>
<p>Expliquer pourquoi exercice1.resultat vaut 30 et non 80 à la fin de la méthode main. Que faudrait-il corriger dans le code suivant si on souhaite obtenir 80 ?</p>

```java
public class Exercice {
    protected int numeroExercice = 1;
    protected boolean reussi = false;
    protected static short resultat = 0;
    public static void main(String[] args) {
    }
}
```
<details>
<summary>Réponse</summary>
Il faut enlever le qualifiant static à l'attribut result.
</details>

<h2>Question 10</h2>
<p>Vous avez à créer une classe qui selon une constante de type nombre entier présente dans la classe, le code doit afficher le bon nombre de mots de la phrase suivante : "Veni vidi vici". Vous ne pouvez qu'utiliser les opérateurs vus dans la leçon précédente (truc: opérateur à trois opérandes).</p>
<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>


{{<inlineJava path="Main.java" lang="java" >}}
public class Main {
    
        // La constante qui détermine le nombre de mot;
        public static final int nombreDeMot = 3;
        
        public static final String veni = "Veni";
        public static final String vidi = "vidi";
        public static final String vici = "vici";
        
        public static void main(String[] args){
            
                String phrase = new String();
            
                phrase = (nombreDeMot == 3) ? veni + vidi + vici : (nombreDeMot == 2) ? veni + vidi : (nombreDeMot == 1) ? veni : "";
                
                System.out.println("Phrase : " + phrase);
        }                        
    
}
{{</inlineJava>}}


</div>



<h2>Question 11</h2>
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

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<p>Nom corrects : 1, 2, 4, 5, 6.</p>

<p>Noms conseillés : 5, 6. En effet à moins d&#x2019;avoir de sérieuses raisons
de faire autrement, il faut utiliser les minuscules pour les noms de variables
simples en java, et les majuscules pour articuler les noms de variables
composés comme monEntier.</p>

</div>
</div>



<h2>Question 12</h2>
<p>Soit les deux codes suivants :</p>

<p>1)</p>
```java
public class Main {
  public static void main(String[] args) {
    final int NOMBRE;                
    System.out.println((NOMBRE=10) + " Je suis un nombre final ");
  }
}
```


<p>2)</p>
```java
public class Main {
  public static void main(String[] args) {
    final int NOMBRE=0;                    
    System.out.println((NOMBRE=10) + "  Je suis un nombre final ");
  }
}
```

<p>Lequel renvoie une erreur ? Pourquoi n&#x2019;y a-t-il pas d&#x2019;erreur
dans celui qui s&#x2019;execute correctement ?</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<p>Le code 2) renvoie une erreur. Le code 1) ne renvoie pas d&#x2019;erreur,
puisque nous pouvons fixer la valeur d'une constante déclarée finale après dans la déclaration, mais une seule fois.</p>
</div>
</div>



<h2>Question 13</h2>

<p>Soit le code suivant :</p>
```java
public class Main {
  public static void main(String[] args) {
    int k, i;
    int myInt = k = (i = 5) * 2;
    System.out.println(myInt);
  }    
}
```
<!--Created using ToHtml.com on 2021-04-28 12:50:34 UTC -->

<p>Quel résultat est affiché à la console lors de l&#x2019;exécution ? Pourquoi
?</p>
<ol>
  <li>Une erreur</li>
  <li>10</li>
  <li>5</li>
</ol>


<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<p>Bonne réponse : 2.</p>

<p>Explication : (i=5) est une expression dont la résultat est la valeur
affectée à i, c&#x2019;est-à-dire 5. Ce résultat est multiplié par deux et
affecté à k, puis affecté à myInt.</p>
</div>
</div>




<h2>Question 14</h2>

Que fait le code suivant?

```java
int f(int x, int y) {
    x ^= y;
    y ^= x;
    x ^= y;
    return y;    
}
```

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<p>La fonction retourne la valeur qui était contenue dans la variable x au début de la fonction. 
<a href="https://fr.wikipedia.org/wiki/Permutation_(informatique)#En_utilisant_l%27opération_XOR">Voir l'article wikipédia sur les techniques de permutation en informatique</a>.
</p>

</div>
</div>


<h2>Question 15</h2>

Que va afficher ce code à l'écran?

```java
class Main {
  public static void main(String[] args) {
    System.out.println(-1 >>> 4);
    System.out.println(-1 >>>> 4);
  }
}
```
<!--Created using ToHtml.com on 2021-04-28 13:08:51 UTC -->

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<p>-1 et 268435455.</p>
</div>
</div>

<h2>Question 16</h2>

Que calcule cette fonction?

```java
public static boolean f(int x, int y) {
    return (x^y) < 0;
}
```
<!--Created using ToHtml.com on 2022-12-05 15:11:08 UTC -->


<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>La fonction retourne la valeur vraie si et seulement si un seul des deux paramètres est négatif. Par exemple, f(-1,1) est vrai, f(2,2) et f(-1,-3) sont faux.</p>
</div>
</div>

<h2>Question 17</h2>

<p>Nous savons que la somme 1/2 + 1/4 + 1/8 +... donne la valeur unitaire.</p>

<p>Sachant qu'un type double en Java a une mantisse comportant 53 bits, que va afficher le programme suivant?</p>

```java
class Main {
  public static void main(String[] args) {
    double x = 0;
    double f = 1.0;
    for (int i = 0; i < 53; i++) {
      f /= 2;
      x += f;
    }
    System.out.println(x==1.0);
    f /= 2;
    x += f;
    System.out.println(x==1.0);
  }
}
```

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>false, true</p>
</div>
</div>




<h2>Question 18</h2>

<p>Vrai ou faux... si <tt>x</tt> est un entier (<tt>int</tt>) négatif, alors <tt>-x</tt> sera un entier positif. </p>


<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Faux. Définissez <tt>int x = -2147483648</tt>. Vous trouvez alors que <tt>-x == x</tt>.</p>
</div>
</div>

<h2>Question 19</h2>

<p>Quelle est la valeur de l'expression <tt>2083697005*101</tt> en Java?</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>L'expression <tt>2083697005*101</tt> est égale à 1. Cela s'explique par le fait que les entiers sont stockés avec 32 bits seulement et que la véritable valeur (210453397505) ne peut pas être représentée. Java tronque le résultat. </p>
</div>
</div>

<h2>Question 20</h2>

<p>Soit deux entiers positifs (<tt>int</tt>) <tt>x</tt> et <tt>y</tt>. Sachant que la moyenne des deux valeurs est aussi un  entier, donnez une expression qui calcule cette moyenne.</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>On peut la calculer avec l'expression <tt>y+(x - y)/2</tt>. Il pourrait être tentant d'utiliser l'expression <tt>(x + y)/2</tt>, mais cette dernière est incorrecte comme vous pouvez le vérifier avec ce programme:
 </p>
```java
class Main {
  public static void main(String[] args) {
    int x = 2147483647;
    int y = 2147483645;

    System.out.println((x+y)/2);
    System.out.println(y+(x - y)/2);
  }
}
```
<!--Created using ToHtml.com on 2021-04-28 18:01:19 UTC -->
</div>
</div>




<h2>Question 21</h2>

<p>Soit une chaîne de caractère en Java: <tt>String s = "123";</tt>. Comment puis-je modifier la valeur de cette chaîne de caractères?</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>En Java, les chaînes de caractères sont immutables, elles ne peuvent être modifiées. On ne peut donc pas modifier la valeur assigné à <tt>s</tt>. Par contre, on peut créer une nouvelle chaîne de caractères et réassigner la variable à cette nouvelle valeur (<tt>s = "1234";</tt>).
</div>
</div>


<h2>Question 22</h2>

<p>Expliquez la différence entre l'ensemble des nombres non négatifs, et l'ensemble des nombres positifs.</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>

En informatique, on définit l'ensemble des nombres positifs comme étant les nombres plus grands que zéro. Les nombres négatifs sont les nombres plus petits que zéro. Les nombres non négatifs sont donc les nombres positifs ou nuls.
</div>
</div>

<h2>Question 23</h2>

<p>Expliquez pourquoi 0.8825149536132812 est égal à 0.8825149536132813 en Java.</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>
 Dans le cas qui nous concerne, il n'est pas possible de distinguer 0.8825149536132812 et 0.8825149536132813, des nombres à 16 chiffres significatifs. En général, il est possible de représenter l'ensemble des nombres entre -10 à la puissance 308 et 10 à la puissance 308 avec 15 chiffres de précision, mais pas 16 chiffres de précision. Les nombres 0.8825149536132812 et 0.8825149536132813 sont représentés en nombre à virgule flottante comme étant  115673 fois 2 à la puissance -17 ce qui est le nombre 0.88251495361328125. 
</div>
</div>