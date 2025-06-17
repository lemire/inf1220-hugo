---
title: "Les structures de contrôle"
weight: 2
---


# Les structures de contrôle

<p>Les structures de contrôle permettent de contrôler des variables puis d'effectuer des actions basées sur le résultat du contrôle. Dans le langage Java, à l'exception de l'opération de contrôle à trois opérandes (vu précédemment dans le cours), il existe 2 formes de structure de contrôle : le if-else et le switch-case.</p>

<p><a id="intro" name="section1"></a></p>

## Le bloc d'instructions

<p dir="ltr" style="margin-right: 0px; ">Un bloc d'instructions est un groupe d'instructions rédigées entre deux accolades (<strong>{ }</strong>). Il exprime l'ordre d'exécution des différentes instructions. Il définit également le domaine de visibilité des variables incluses dans la déclaration. Un bloc d'instructions peut apparaître partout dans l'instruction. <br />Les instructions, comme les blocs d'instructions, peuvent être identifiées par une étiquette. Cette étiquette précédera l'instruction, ou fera partie du bloc d'instructions, et sera suivie du caractère <strong>:</strong></p> 
<blockquote dir="ltr" style="margin-right: 0px; "> 
<p dir="ltr" style="margin-right: 0px; "><br />Exemple: <br /><em>bloc1 : {</em></p> 
<p dir="ltr" style="margin-right: 0px; "><em>instruction_1 ;</em> <br /> <em>instruction_2 ;</em></p> 
<p dir="ltr" style="margin-right: 0px; ">...</p> 
<p dir="ltr" style="margin-right: 0px; "><em>instruction_n;</em><br /> <em>}</em></p> 
</blockquote> 


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

## Java pas à pas


<p>Nous vous invitons maintenant à lire le chapitre <em>Structures de contrôle</em> du manuel  Java Pas à Pas par Robert Godin et Daniel Lemire.  Vous devez charger le  <a href="https://raw.githubusercontent.com/RobertGodin/JavaPasAPas/master/JavaPasAPas.pdf">le document PDF</a>.</p>

<p><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/">Vous pouvez aussi acheter la version papier du manuel Java pas à pas chez Amazon</a>:</p>
<div><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/"><img src="https://m.media-amazon.com/images/I/61tnblFlmmL._SL1499_.jpg" width="250px" style="margin-left:auto; margin-right:auto;"></a></div>

<p>Plusieurs étudiants trouvent qu'il est plus aisé de faire les lectures dans le manuel Java pas à pas après avoir terminé la lecture du module sur notre site web. Vous pouvez choisir quand il vous convient le mieux d'utiliser le manuel Java Pas à Pas.</p>


<p>Si vous devez lire un document PDF, nous vous encourageons à charger le fichier sur votre machine et à l'ouvrir au sein d'un outil dédié (par ex. Adobe Acrobat). Il n'est pas très pratique de lire un document PDF au sein d'un navigateur web.</p>


### Lecture dans le livre de référence

<p>Pour aller plus en profondeur sur les structures de contrôle (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 5:</p>
<ul>
	<li>Section 1 : L'instruction If</li>
	<li>Section 2 : L'instruction switch</li>

</ul>
### Vidéos suggérées

<iframe width="560" height="315" src="https://www.youtube.com/embed/0rANfWRfc_c" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/ws0JqA7bPN0" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>