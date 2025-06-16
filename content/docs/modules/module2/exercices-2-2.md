---
title: "Exercices sur les classes et méthodes"
weight: 6
---

<h1>Questions/Réponses</h1>
<p>Veuillez répondre mentalement ou sur papier à ces questions avant de regarder la réponse.</p>

<p>Certains étudiants aiment utiliser une <a href="https://cheatography.com/sschaub/cheat-sheets/java-fundamentals/">Java Fundamentals Cheat Sheet</a> (anglais) pour garder à l'esprit la syntaxe.</p>

<h1>Comment faire ces exercices ?</h1>

<p>N'allez pas trop vite. Il ne sert à rien de lire la question et d'immédiatement lire la réponse. Le but des exercices est de vous amener à travailler la matière. Si vous ne faites que regarder les solutions, vous n'apprenez pas grand chose. </p>


<h2>Réponses uniques?</h2>

<p>Les exercices comportent une solution vous permettant de comparer votre approche avec la nôtre. Il n'y a pas de solution unique aux problèmes en général. Vous pouvez arriver avec une solution qui est préférable ou moins bonne que celle que nous offrons. Pour faire ces questions, vous devez avoir fait toutes les lectures préalables. Vous disposez alors toujours des fondements nécessaires pour faire les exercices. Nous vous encourageons tout de même à faire vos propres recherches en complément de vos lectures. Dans certains cas, au sein de la solution que nous offrons, nous pouvons utiliser des notions techniques qui n'ont pas été vues directement dans le cours, mais qui devraient vous être facilement accessibles.</p>


<h2>Question 1</h2>
<p>Proposez une classe Etudiant dont le constructeur prend en paramètre un identifiant (sous la forme d'un entier) et qui comprend une méthode monIdentifiant retournant l'identifiant en question.</p>
<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

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

</div>
</div>


<h2>Question 2</h2>
<p>Combien de constructeurs est-ce qu'une classe peut avoir en Java?</p>
<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>
Une classe Java peut avoir autant de constructeurs qu'on le souhaite.
</p>
</div>
</div>



<h2>Question 3</h2>
<p>Soit la classe suivante:</p>

```java
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

```java
    Patate z1 = new Patate(1);
    Patate z2 = new Patate(2);
    System.out.println(z1.nombre());
```
<div class="accordeon">
<p class="titre">Réponse</p>
<div><p>La valeur 2. Le mot-clef <tt>static</tt> indique que la classe Patate n'a qu'une variable y partagée par toutes les instances de la classe.</p></div>
</div>



<h2>Question 4</h2>
<p>Écrivez une classe nommée Somme comprenant une méthode nommée additionne qui additionne deux nombres et retourne le résultat.</p>
<div class="accordeon">
<p class="titre">Réponse</p>
<div><pre><code class="language-java">public class Somme {
  public int additionne(int a, int b) {
    return a +  b;
  }
}
</code></pre></div>
</div>


<h2>Question 5</h2>
<p>Expliquez pourquoi la méthode donne de cette classe va toujours retourner la valeur 2.</p>

```java
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

<div class="accordeon">

<p class="titre">Réponse</p>
<div>La valeur de la variable 'a' est passée à la méthode ajoute par valeur, c'est-à-dire que la méthode ajoute fait une copie de la variable 'a' et c'est cette variable locale qui est modifiée.
Ainsi donc, la méthode <tt>ajoute</tt> ne sert effectivement à rien.</div>
</div>




<h2>Question 6</h2>
<p>Expliquez pourquoi la méthode donne de cette classe va toujours retourner la valeur 3.</p>

```java
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


<div class="accordeon">

<p class="titre">Réponse</p>
<div>Cette fois-ci, la méthode ajoute reçoit un type qui n'est pas un type primitif (Variable) et va donc le recevoir par référence. C'est-à-dire que la variable 'x' n'est pas copiée. Quand la méthode ajoute modifie un attribut de la variable 'x', cette modification est visible hors de la fonction ajoute.</div>
</div>


<h2>Question 7</h2>
<p>Écrivez une classe Puissance qui comprend une méthode nommée deux qui prend un entier et retourne l'entier mis au carré.</p>



<div class="accordeon">

<p class="titre">Réponse</p>
<div><pre><code class="language-java">public class Puissance {
  public int deux(int a) {
    return a * a;
  }
}
</code></pre></div>
</div>



<h2>Question 8</h2>
<p>Expliquez pourquoi la méthode donne de cette classe va toujours retourner la valeur 2.</p>

```java
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


<div class="accordeon">

<p class="titre">Réponse</p>
<div>La méthode ajoute reçoit un type qui n'est pas un type primitif (Variable) et va donc le recevoir par référence. Par contre, la référence est immédiatement perdue et réassignée à une instance locale de la classe Variable. La méthode ajoute modifie donc une variable locale.</div>
</div>



<h2>Question 9</h2>

<p>Pourquoi le bout de code suivant va générer une erreur à la compilation ?</p>
<textarea rows="6" cols="56" style="margin-left:2em;">class T {
private float x ;
private static int n ;
public static float test(){
  return x*n;
  }
}</textarea>
<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<p>Une méthode statique ne peut accéder à un champ non statique comme la
méthode statique test() tente de le faire avec le champ non statique x.</p>
</div>
</div>



<h2>Question 10</h2>


<p>On admet que la classe A existe.</p>

<p>Que peut-on en déduire quant au(x)constructeur (s) de la classe A si
l&#x2019;instruction suivante génère une erreur de compilation ayant trait au(x) constructeur(s) de A ?</p>

<p>A a = new A () ;</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<p>A dispose d&#x2019;au moins un constructeur (non par défaut) et tous ses
constructeurs sont des constructeurs avec un argument.</p>
</div>
</div>



<h2>Question 11</h2>

<p>Est-ce qu'une méthode peut être à la fois <tt>static</tt> et <tt>private</tt> en java?<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

<p>Oui. La méthode ne peut être appelée que par les autres méthodes de la classe (soit les autres méthodes statiques ou les méthodes non-dynamiques).</p>

```java
class Main {
  public static void main(String[] args) {
    joe();
    System.out.println("Hello world!");
  }
  private static void joe() {}
}
```

</div>
</div>



<h2>Question 12</h2>

<p>Quelle est la visibilité des attributs au sein de cette classe :</p>

```java
public class Joe {
  public int x = 0;
  protected int y = 0;
  private int z = 0;
  int t = 0;
}
```

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
public (accessible de partout), protected (accessible des classes dérivées et des classes du même package), private (accessible seulement par la classe) et default (accessible seulement par les classes du même package).
</div>
</div>


<h2>Question 13</h2>

<p>Écrivez une classe représentant une valeur entière à laquelle je peux ajouter la valeur trois par l'entremise d'une méthode « public » nommée « patate ». La méthode doit retourner la valeur entière modifiée. Le constructeur doit me permettre d'initialiser la valeur entière. La classe doit n'avoir que des attributs «&nbsp;private&nbsp;».</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

```java
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

</div>
</div>


<h2>Question 14</h2>

<p>Écrivez une classe représentant une valeur entière. Cette classe doit n'avoir qu'une seule méthode appelée « additionne » qui prend comme paramètre une instance de la classe et qui retourne une nouvelle instance de la classe. L'instance retournée doit comprendre la somme des deux valeurs entières.</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>

```java
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

</div>
</div>

<h2>Allez plus loin?</h2>


<p>Plusieurs étudiants apprécient la plateforme <a href="https://www.jetbrains.com/academy/">Jetbrains Academy</a> pour aller plus loin et se pratiquer (en anglais seulement). Bien que Jetbrains Academy soit un service commercial, ils offrent une période d'essai sans frais. C'est sans aucune doute un excellent complément à notre cours.</p>

<p>Il y a aussi plusieurs manuels (en anglais) dédiés aux exercices que vous pouvez acquérir :</p>
<ol>
<li><a href="https://www.amazon.ca/Java-Coding-Problems-Programming-real-world/dp/1789801419/">Java Coding Problems: Improve your Java Programming skills by solving real-world coding challenges</a></li>
<li><a href="https://www.amazon.ca/Java-Cookbook-Problems-Solutions-Developers/dp/1492072583/">Java Cookbook: Problems and Solutions for Java Developers</a> </li>
</ol>

<p>Certains étudiants ne souhaitent pas dépenser davantage d'argent pour l'accès à des ressources supplémentaires. Et absolument rien ne vous y oblige. Nous offrons ces liens parce plusieurs étudiants considèrent que ces ressources supplémentaires sont utiles.</p>