---
title: "Exercices sur les classes et méthodes"
weight: 6
---

# Questions/Réponses

Veuillez répondre mentalement ou sur papier à ces questions avant de regarder la réponse.
Certaines questions sont difficiles, et il est normal de ne pas toutes les réussir.


{{% hint info %}}

N'oubliez pas d'utiliser notre [pense-bête Java]({{< ref "/docs/pensebete" >}}) au besoin. Pour les mathématiques, 
vous pouvez faire référence à notre rappel sur [les principales notions mathématiques]({{< ref "/docs/extra/math" >}}) du cours.

{{% /hint %}}

## Comment faire ces exercices ?

<p>N'allez pas trop vite. Il ne sert à rien de lire la question et d'immédiatement lire la réponse. Le but des exercices est de vous amener à travailler la matière. Si vous ne faites que regarder les solutions, vous n'apprenez pas grand chose. </p>


{{% hint info %}}

## Réponses uniques ?

<p>Les exercices comportent une solution vous permettant de comparer votre approche avec la nôtre. Il n'y a pas de solution unique aux problèmes en général. Vous pouvez arriver avec une solution qui est préférable ou moins bonne que celle que nous offrons. Pour faire ces questions, vous devez avoir fait toutes les lectures préalables. Vous disposez alors toujours des fondements nécessaires pour faire les exercices. Nous vous encourageons tout de même à faire vos propres recherches en complément de vos lectures. Dans certains cas, au sein de la solution que nous offrons, nous pouvons utiliser des notions techniques qui n'ont pas été vues directement dans le cours, mais qui devraient vous être facilement accessibles.</p>
{{% /hint %}}


## Question 1

<p>Proposez une classe Etudiant dont le constructeur prend en paramètre un identifiant (sous la forme d'un entier) et qui comprend une méthode monIdentifiant retournant l'identifiant en question.</p>
<details><summary>Réponse</summary>

{{<inlineJava path="Etudiant.java">}}
public class Etudiant {
  int mIdentifiant;
  public Etudiant(int identifiant) {
    mIdentifiant = identifiant;
  }

  public int monIdentifiant() {
    return mIdentifiant;
  }
}
{{</inlineJava>}}

</details>


## Question 2

<p>Combien de constructeurs est-ce qu'une classe peut avoir en Java?</p>
<details><summary>Réponse</summary><p>
Une classe Java peut avoir autant de constructeurs qu'on le souhaite.
</p>
</details>



## Question 3

<p>Soit la classe suivante:</p>

```java  {style=github}
public class Patate {
  static int y;
  public Patate(int x) {
    y = x;
  }

  public int nombre() {
    return y;
  }
}
```

<p>Que va afficher le code suivant:</p>

```java  {style=github}
    Patate z1 = new Patate(1);
    Patate z2 = new Patate(2);
    System.out.println(z1.nombre());
```
<details><summary>Réponse</summary><p>La valeur 2. Le mot-clef <tt>static</tt> indique que la classe Patate n'a qu'une variable y partagée par toutes les instances de la classe.</p></details>



## Question 4

<p>Écrivez une classe nommée Somme comprenant une méthode nommée additionne qui additionne deux nombres et retourne le résultat.</p>
<details><summary>Réponse</summary><pre><code class="language-java">public class Somme {
  public int additionne(int a, int b) {
    return a +  b;
  }
}
</code></pre></details>


## Question 5

<p>Expliquez pourquoi la méthode donne de cette classe va toujours retourner la valeur 2.</p>

```java  {style=github}
public class Somme {
  public void ajoute(int a) {
    a = a + 1;
  }
  public int donne() {
    int a = 2;
    ajoute(a);
    return a;
  }
}
```

<details><summary>Réponse</summary><div>La valeur de la variable 'a' est passée à la méthode ajoute par valeur, c'est-à-dire que la méthode ajoute fait une copie de la variable 'a' et c'est cette variable locale qui est modifiée.
Ainsi donc, la méthode <tt>ajoute</tt> ne sert effectivement à rien.</div></details>




## Question 6

<p>Expliquez pourquoi la méthode donne de cette classe va toujours retourner la valeur 3.</p>

```java  {style=github}
public class Variable {
  public int a = 2;

  public static void ajoute(Variable x) {
    x.a = x.a + 1;
  }

  public int donne() {
    Variable x = new Variable();
    ajoute(x);
    return x.a;
  }
}
```


<details><summary>Réponse</summary><div>Cette fois-ci, la méthode ajoute reçoit un type qui n'est pas un type primitif (Variable) et va donc le recevoir par référence. C'est-à-dire que la variable 'x' n'est pas copiée. Quand la méthode ajoute modifie un attribut de la variable 'x', cette modification est visible hors de la fonction ajoute.</div></details>


## Question 7

<p>Écrivez une classe Puissance qui comprend une méthode nommée deux qui prend un entier et retourne l'entier mis au carré.</p>



<details><summary>Réponse</summary><pre><code class="language-java">public class Puissance {
  public int deux(int a) {
    return a * a;
  }
}
</code></pre></details>



## Question 8

<p>Expliquez pourquoi la méthode donne de cette classe va toujours retourner la valeur 2.</p>

```java  {style=github}
public class Variable {
  public int a = 2;

  public static void ajoute(Variable x) {
    x = new Variable();
    x.a = x.a + 1;
  }

  public int donne() {
    Variable x = new Variable();
    ajoute(x);
    return x.a;
  }
}
```


<details><summary>Réponse</summary><div>La méthode ajoute reçoit un type qui n'est pas un type primitif (Variable) et va donc le recevoir par référence. Par contre, la référence est immédiatement perdue et réassignée à une instance locale de la classe Variable. La méthode ajoute modifie donc une variable locale.</div></details>



## Question 9

<p>Pourquoi le bout de code suivant va générer une erreur à la compilation ?</p>

```java {style=github}
class T {
  private float x ;
  private static int n ;
  public static float test(){
    return x*n;
  }
}
```
<details><summary>Réponse</summary>

<p>Une méthode statique ne peut accéder à un champ non statique comme la
méthode statique test() tente de le faire avec le champ non statique x.</p>
</details>



## Question 10


<p>On admet que la classe A existe.</p>

<p>Que peut-on en déduire quant au(x)constructeur (s) de la classe A si
l&#x2019;instruction suivante génère une erreur de compilation ayant trait au(x) constructeur(s) de A ?</p>

<p>A a = new A () ;</p>

<details><summary>Réponse</summary>

<p>A dispose d&#x2019;au moins un constructeur (non par défaut) et tous ses
constructeurs sont des constructeurs avec un argument.</p>
</details>



## Question 11

<p>Est-ce qu'une méthode peut être à la fois <tt>static</tt> et <tt>private</tt> en java?</p>
<details><summary>Réponse</summary>

<p>Oui. La méthode ne peut être appelée que par les autres méthodes de la classe (soit les autres méthodes statiques ou les méthodes non-dynamiques).</p>

{{<inlineJava path="Main.java" lang="java" >}}
class Main {
  public static void main(String[] args) {
    joe();
    System.out.println("Hello world!");
  }
  private static void joe() {}
}
{{</inlineJava>}}

</details>



## Question 12

<p>Quelle est la visibilité des attributs au sein de cette classe :</p>

```java  {style=github}
public class Joe {
  public int x = 0;
  protected int y = 0;
  private int z = 0;
  int t = 0;
}
```

<details><summary>Réponse</summary>
<div>public (accessible de partout), protected (accessible des classes dérivées et des classes du même package), private (accessible seulement par la classe) et default (accessible seulement par les classes du même package).</div>
</details>


## Question 13

<p>Écrivez une classe représentant une valeur entière à laquelle je peux ajouter la valeur trois par l'entremise d'une méthode «&nbsp;public&nbsp;» nommée «&nbsp;patate&nbsp;». La méthode doit retourner la valeur entière modifiée. Le constructeur doit me permettre d'initialiser la valeur entière. La classe doit n'avoir que des attributs «&nbsp;private&nbsp;».</p>

<details><summary>Réponse</summary>

```java  {style=github}
public class Entier {
  private int x = 0;
  public Entier(int m) {
    x = m;
  }
  public int patate() {
   x += 3;
   return x;
  }
}
```

</details>


## Question 14

<p>Écrivez une classe représentant une valeur entière. Cette classe doit n'avoir qu'une seule méthode appelée «&nbsp;additionne&nbsp;» qui prend comme paramètre une instance de la classe et qui retourne une nouvelle instance de la classe. L'instance retournée doit comprendre la somme des deux valeurs entières.</p>

<details><summary>Réponse</summary>

```java  {style=github}
public class Entier {
  private int x = 0;
  public Entier(int m) {
   x = m;
  }
  public Entier additionne(Entier z) {
    return new Entier(z.x + x);
  }
}
```

</details>

## Question 15

<p>Quelle est la différence entre <tt>public</tt>, <tt>private</tt> et <tt>protected</tt> pour un attribut ou une méthode en Java ?</p>
<details><summary>Réponse</summary>
<p><tt>public</tt> : accessible partout ; <tt>private</tt> : accessible uniquement dans la classe ; <tt>protected</tt> : accessible dans la classe et ses sous-classes (même dans d’autres packages).</p>
</details>

## Question 16
Considérez le code suivant :
```java {style=github}
void afficher(String message) {}
int afficher(int nombre) { return nombre; }
void afficher(String message, int nombre) {}
```
Décrivez la signature de la méthode `afficher(String message, int nombre)` et expliquez pourquoi ces trois méthodes peuvent coexister dans la même classe.

<details><summary>Réponse</summary>

La signature de la méthode `afficher(String message, int nombre)` est composée des types et de l'ordre des paramètres, à savoir `afficher(String, int)`. Ces trois méthodes peuvent coexister dans la même classe car elles ont des signatures différentes, c'est-à-dire un nombre ou un type de paramètres différent. En Java, la surcharge de méthode est permise tant que les signatures des méthodes sont différentes.
</details>


## Question 17
Pourquoi la signature d’une méthode ne tient-elle pas compte du type de retour ? Donnez un exemple où deux méthodes auraient le même nom et les mêmes paramètres mais des types de retour différents, et expliquez pourquoi cela pose problème.
<details><summary>Réponse</summary>

La signature d’une méthode ne tient pas compte du type de retour, car cela rendrait l’appel de la méthode ambigu pour le compilateur. Par exemple, si on écrivait :
```java {style=github}
int calculer(int x);
double calculer(int x);
```
Le compilateur ne saurait pas quelle version utiliser lors d’un appel comme `calculer(5)`, car le choix ne peut pas se faire uniquement sur le type de retour. C’est pourquoi Java interdit d’avoir deux méthodes avec le même nom et les mêmes paramètres, même si leur type de retour diffère.
</details>


## Question 18
Considérez l’expression suivante en Java :

```java {style=github}
bool = (1 + 3 == 2) || f(x) || f(x);
```

Combien de fois la fonction `f(x)` est-elle appelée lors de l’évaluation de cette expression ? Expliquez pourquoi.

<details><summary>Réponse</summary>

`f(x)` n’est appelée qu’une seule fois. En Java, l’opérateur logique `||` (OU logique) est évalué de façon « paresseuse » (short-circuit). Dès qu’une des conditions est vraie, les suivantes ne sont pas évaluées. Ici, `(1 + 3 == 2)` est faux, donc on évalue le premier `f(x)`. Si ce premier appel retourne vrai, le second `f(x)` n’est pas évalué. Si le premier retourne faux, alors le second est évalué. Mais dans tous les cas, au maximum un seul des deux appels à `f(x)` sera exécuté.
</details>


## Question 19

<p>Vrai ou Faux : Le mot-clé "static" permet de créer une seule variable en mémoire pour plusieurs instances d'un objet?</p>
<details>
<summary>Réponse</summary>
Vrai: le mot-clé static permet de créer une variable "pointant" vers une seule adresse en mémoire. Donc, si la classe Test possède une variable static, toutes les instances de la classe Test accèderont à la même variable en mémoire. Elles pourraient donc modifier cette valeur à tour de rôle.
</details>

## Question 20

<p>Le code suivant est truffé d'erreurs. Veuillez énumérer les erreurs et les corriger.</p>

```java  {style=github}
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

```java  {style=github}
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



## Question 21

<p>Expliquer pourquoi exercice1.resultat vaut 30 et non 80 à la fin de la méthode main. Que faudrait-il corriger dans le code suivant si on souhaite obtenir 80 ?</p>

```java  {style=github}
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



## Question 22

<p>Soit les deux codes suivants :</p>

<p>1)</p>

```java  {style=github}
public class Main {
  public static void main(String[] args) {
    final int NOMBRE;                
    System.out.println((NOMBRE=10) + " Je suis un nombre final ");
  }
}
```


<p>2)</p>

```java  {style=github}
public class Main {
  public static void main(String[] args) {
    final int NOMBRE=0;                    
    System.out.println((NOMBRE=10) + "  Je suis un nombre final ");
  }
}
```

<p>Lequel renvoie une erreur ? Pourquoi n&#x2019;y a-t-il pas d&#x2019;erreur
dans celui qui s&#x2019;execute correctement ?</p>

<details><summary>Réponse</summary>


<p>Le code 2) renvoie une erreur. Le code 1) ne renvoie pas d&#x2019;erreur,
puisque nous pouvons fixer la valeur d'une constante déclarée finale après dans la déclaration, mais une seule fois.</p>
</details>


## Question 23

<p>Vous avez à créer une classe qui selon une constante de type nombre entier présente dans la classe, le code doit afficher le bon nombre de mots de la phrase suivante : "Veni vidi vici". Vous ne pouvez qu'utiliser les opérateurs vus dans la leçon précédente (truc: opérateur à trois opérandes).</p>

<details><summary>Réponse</summary>


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


</details>

## Allez plus loin?


<p>Plusieurs étudiants apprécient la plateforme <a href="https://www.jetbrains.com/academy/">Jetbrains Academy</a> pour aller plus loin et se pratiquer (en anglais seulement). Bien que Jetbrains Academy soit un service commercial, ils offrent une période d'essai sans frais. C'est sans aucune doute un excellent complément à notre cours.</p>

<p>Il y a aussi plusieurs manuels (en anglais) dédiés aux exercices que vous pouvez acquérir :</p>
<ol>
<li><a href="https://www.amazon.ca/Java-Coding-Problems-Programming-real-world/dp/1789801419/">Java Coding Problems: Improve your Java Programming skills by solving real-world coding challenges</a></li>
<li><a href="https://www.amazon.ca/Java-Cookbook-Problems-Solutions-Developers/dp/1492072583/">Java Cookbook: Problems and Solutions for Java Developers</a> </li>
</ol>

<p>Certains étudiants ne souhaitent pas dépenser davantage d'argent pour l'accès à des ressources supplémentaires. Et absolument rien ne vous y oblige. Nous offrons ces liens parce plusieurs étudiants considèrent que ces ressources supplémentaires sont utiles.</p>