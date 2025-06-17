---
title: "Exercices sur les classes et méthodes"
weight: 6
---

# Questions/Réponses

<p>Veuillez répondre mentalement ou sur papier à ces questions avant de regarder la réponse.</p>

<p>Certains étudiants aiment utiliser une <a href="https://cheatography.com/sschaub/cheat-sheets/java-fundamentals/">Java Fundamentals Cheat Sheet</a> (anglais) pour garder à l'esprit la syntaxe.</p>

## Comment faire ces exercices ?

<p>N'allez pas trop vite. Il ne sert à rien de lire la question et d'immédiatement lire la réponse. Le but des exercices est de vous amener à travailler la matière. Si vous ne faites que regarder les solutions, vous n'apprenez pas grand chose. </p>


## Réponses uniques?

<p>Les exercices comportent une solution vous permettant de comparer votre approche avec la nôtre. Il n'y a pas de solution unique aux problèmes en général. Vous pouvez arriver avec une solution qui est préférable ou moins bonne que celle que nous offrons. Pour faire ces questions, vous devez avoir fait toutes les lectures préalables. Vous disposez alors toujours des fondements nécessaires pour faire les exercices. Nous vous encourageons tout de même à faire vos propres recherches en complément de vos lectures. Dans certains cas, au sein de la solution que nous offrons, nous pouvons utiliser des notions techniques qui n'ont pas été vues directement dans le cours, mais qui devraient vous être facilement accessibles.</p>


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

<p>Écrivez une classe représentant une valeur entière à laquelle je peux ajouter la valeur trois par l'entremise d'une méthode « public » nommée « patate ». La méthode doit retourner la valeur entière modifiée. Le constructeur doit me permettre d'initialiser la valeur entière. La classe doit n'avoir que des attributs «&nbsp;private&nbsp;».</p>

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

<p>Écrivez une classe représentant une valeur entière. Cette classe doit n'avoir qu'une seule méthode appelée « additionne » qui prend comme paramètre une instance de la classe et qui retourne une nouvelle instance de la classe. L'instance retournée doit comprendre la somme des deux valeurs entières.</p>

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

## Allez plus loin?


<p>Plusieurs étudiants apprécient la plateforme <a href="https://www.jetbrains.com/academy/">Jetbrains Academy</a> pour aller plus loin et se pratiquer (en anglais seulement). Bien que Jetbrains Academy soit un service commercial, ils offrent une période d'essai sans frais. C'est sans aucune doute un excellent complément à notre cours.</p>

<p>Il y a aussi plusieurs manuels (en anglais) dédiés aux exercices que vous pouvez acquérir :</p>
<ol>
<li><a href="https://www.amazon.ca/Java-Coding-Problems-Programming-real-world/dp/1789801419/">Java Coding Problems: Improve your Java Programming skills by solving real-world coding challenges</a></li>
<li><a href="https://www.amazon.ca/Java-Cookbook-Problems-Solutions-Developers/dp/1492072583/">Java Cookbook: Problems and Solutions for Java Developers</a> </li>
</ol>

<p>Certains étudiants ne souhaitent pas dépenser davantage d'argent pour l'accès à des ressources supplémentaires. Et absolument rien ne vous y oblige. Nous offrons ces liens parce plusieurs étudiants considèrent que ces ressources supplémentaires sont utiles.</p>