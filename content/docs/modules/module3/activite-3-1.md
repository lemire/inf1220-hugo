---
title: "Les structures de contrôle"
weight: 2
---


# Les structures de contrôle

Les structures de contrôle sont des outils essentiels en programmation : elles permettent de prendre des décisions et de répéter des actions selon certaines conditions. En Java, les structures de contrôle principales sont <strong>if-else</strong> et <strong>switch-case</strong> pour le choix, ainsi que les boucles (qui seront vues plus loin).

Une structure de contrôle permet d’exécuter différentes instructions selon la valeur d’une variable ou le résultat d’une expression logique. Cela rend les programmes dynamiques et capables de s’adapter à différentes situations.

## Le bloc d'instructions

Un <strong>bloc d'instructions</strong> est un ensemble d’instructions regroupées entre deux accolades (<code>{ }</code>). Il permet de définir clairement quelles instructions doivent être exécutées ensemble, par exemple dans un <code>if</code> ou une boucle. Les variables déclarées à l’intérieur d’un bloc ne sont visibles que dans ce bloc (on parle de portée ou « scope »).

On peut aussi donner un nom (une étiquette) à un bloc d’instructions, ce qui peut servir dans certains cas avancés (par exemple avec <code>break</code> ou <code>continue</code> étiquetés).

Exemple :

```java  {style=github}
bloc1: {
    instruction_1;
    instruction_2;
    // ...
    instruction_n;
}
```

Ce bloc nommé <code>bloc1</code> regroupe plusieurs instructions qui seront exécutées dans l’ordre.

<p><a id="intro" name="section2"></a></p>

## La structure de contrôle IF-ELSE

<p>Le branchement conditionnel (<strong>if</strong>) peut apparaître sous deux formes : avec ou sans clause <strong>else</strong>. Dans les deux cas, il s'agit d'un branchement booléen, c'est à dire que selon le contrôle (qui est au final une valeur booléenne, ex. i != 0) ou la valeur vraie permettra d'aller dans la portée de la structure ou non. </p> 
<p>La forme :</p>

```java  {style=github}
if (expression) {
            instruction1;
}
```

<p>s'exécute de la manière suivante : l'expression est évaluée; si le résultat renvoie le booléen <strong>true</strong>, alors l'instruction <em>instruction1</em> est exécutée, sinon le branchement conditionnel est terminé. <br /></p> 
  
<p> </p> 
<p>Considérons maintenant une forme avec <strong>if</strong> et <strong>else</strong>:</p> 

```java  {style=github}
if (expression) {
            instruction1;
} else {
            instruction2;
}
```

<br/>

<p>Dans ce dernier cas, la clause <strong>else</strong> se rapporte à l'instruction <strong>if</strong>,  c'est-à-dire que son bloc (instruction2) est exécuté si et seulement si l'expression <strong>expression</strong> est fausse.</p> 
<p>Ce qui est différent du programme : <br /> 

```java  {style=github}
if (expression1) {
            if (expression2) {
                instruction2;
            }
} else {
            instructionFin;
}
```
<p> </p> 

<p>Dans ce nouveau cas, la clause <strong>else</strong> se rapporte à l’expression <tt>if  (expression1)</tt> : son bloc (contenant <tt>instructionFin</tt>) est exécutée si et seulement si expression1  est fausse. Par ailleurs, dans ce dernier exemple, instruction2 est exécutée si et seulement si les valeurs expression1  et expression2 sont toutes les deux vraies.</p>
<p>&nbsp;</p> 
<p>Le programme suivant montre comment fonctionnent les instructions <em>if</em> et <em>else</em>. Ce programme montre la note obtenue par des personnes ayant terminé leur premier cours de Java.</p> 

```java  {style=github}
class IfElseDemontration {
    public static void main(String[] args) {
        int resultat = 76;
        char note;
        if (resultat >= 90) {
            note = 'A';
        } else if (resultat >= 80) {
            note = 'B';
        } else if (resultat >= 70) {
            note = 'C';
        } else if (resultat >= 60) {
            note = 'D';
        } else {
            note = 'F';
        }
        System.out.println("Note finale = " + note);
    }
}
```

## La structure de contrôle SWITCH-CASE

<p>L'instruction de choix multiples <strong>switch</strong> permet d'effectuer un aiguillage sur plusieurs instructions, suivant la valeur retournée par une expression d'un des types suivants : <strong>char</strong>, <strong>byte</strong>, <strong>short</strong> ou <strong>int</strong>. Lorsque la valeur de l'expression est connue, elle est comparée à chacune des valeurs indiquées par les clauses <strong>case</strong>, en séquence dans l'ordre d'apparition des clauses. Dès qu'une valeur indiquée par une clause est égale à la valeur calculée, le contrôle d'exécution est donné à la séquence d'instructions qui suit cette clause. Si aucune valeur ne correspond, le contrôle est donné à la clause <strong>default,</strong> si celle-ci existe, ou bien, l'instruction de choix multiples est considérée comme terminée.</p> 
<p>L'instruction <strong>break</strong> permet d'arrêter l'instruction de choix multiples. Elle sera en général utilisée à la fin de la séquence d'instructions de chaque clause.</p> 


<p>Par exemple, la détermination d'une valeur paire ou impaire peut se faire par l'instruction suivante :</p>

```java  {style=github}
switch (i % 2) {
            case 0:
                System.out.println("C'est un nombre pair");
                break;
            case 1:
                System.out.println("C'est un nombre impair");
                break;
        }
```

<p style="text-align: left; ">Le programme suivant montre l'utilisation de l'instruction switch. Il s'agit ici d'une banque qui définit quatre catégories de classes afin de donner des commissions à ses employés. Pour la classe 1, nous avons un taux de commission de 2 %, de 3,5 % pour la classe 2, de 5 % pour la classe 3 et de 0 % pour la classe 4.</p> 
<p style="text-align: left; ">Voici le programme qui permet de réaliser cette opération :</p> 

```java  {style=github}
class SwitchExemple {
    public static void main(String[] args) {
        double TauxCommission;
        int cas = 1;
        switch (cas) {
            case 1:
                TauxCommission = 0.02;
                break;
            case 2:
                TauxCommission = 0.035;
                break;
            case 3:
                TauxCommission = 0.05;
                break;
            default:
                TauxCommission = 0.0;
                break;
        }
        System.out.println(" le taux de commission = " + TauxCommission);
    }
} 
```

La nouvelle syntaxe des expressions switch en Java, introduite avec Java 12 (JEP 325) et finalisée dans Java 14 (JEP 361), permet d'utiliser des flèches (->) pour rendre les instructions switch plus concises et de les transformer en expressions qui renvoient une valeur. Cette syntaxe améliore la lisibilité et réduit la verbosité par rapport au switch traditionnel.

{{<inlineJava path="SwitchExpressionExample.java" lang="java">}}
public class SwitchExpressionExample {
    public static void main(String[] args) {
        String mois = "Février";
        
        int jours = switch (mois) {
            case "Janvier", "Mars", "Mai", "Juillet", "Août", 
              "Octobre", "Décembre" -> 31;
            case "Avril", "Juin", "Septembre", "Novembre" -> 30;
            case "Février" -> {
                int annee = 2024; // Exemple d'année
                if (annee % 4 == 0 && (annee % 100 != 0 
                  || annee % 400 == 0)) {
                    yield 29; // Année bissextile
                } else {
                    yield 28;
                }
            }
            default -> 
              throw new IllegalArgumentException("Mois invalide : " + mois);
        };
        
        System.out.println("Le mois de " + mois + " a " + jours + " jours.");
    }
}
{{</inlineJava>}}

Observez le mot-clé `yield` utilisé dans les expressions switch  pour spécifier la valeur renvoyée par une branche d’un bloc switch lorsqu’une logique complexe nécessite plusieurs instructions.

### Lecture optionnelle dans le livre de référence (Delannoy)

<p>Pour aller plus en profondeur sur les structures de contrôle (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 5:</p>
<ul>
	<li>Section 1 : L'instruction If</li>
	<li>Section 2 : L'instruction switch</li>

</ul>

### Vidéos suggérées

{{< youtube id="0rANfWRfc_c" >}}

{{< youtube id="ws0JqA7bPN0" >}}
