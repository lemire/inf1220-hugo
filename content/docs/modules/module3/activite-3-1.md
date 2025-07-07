---
title: "Les structures de contrôle"
weight: 20
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

La portée des  variables déclarées au sein d'un bloc se limite à ce bloc. Il n'est pas possible de faire référence à la variable en 
dehors de ce bloc.


## La structure de contrôle if-else

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

## La structure de contrôle switch-case

<p>L'instruction de choix multiples <strong>switch</strong> permet d'effectuer un aiguillage sur plusieurs instructions, suivant la valeur retournée par une expression d'un des types suivants : 
char, byte, short, int, ainsi que leurs classes enveloppes (Character, Byte, Short, Integer), les énumérations (enum), et les chaînes de caractères (String). Lorsque la valeur de l'expression est connue, elle est comparée à chacune des valeurs indiquées par les clauses <strong>case</strong>, en séquence dans l'ordre d'apparition des clauses. Dès qu'une valeur indiquée par une clause est égale à la valeur calculée, le contrôle d'exécution est donné à la séquence d'instructions qui suit cette clause. Si aucune valeur ne correspond, le contrôle est donné à la clause <strong>default,</strong> si celle-ci existe, ou bien, l'instruction de choix multiples est considérée comme terminée.</p> 
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

Considérons un exemple avec une chaîne de caractères.

{{<inlineJava path="SwitchStringExemple.java" lang="java">}}
class SwitchStringExemple {
    public static void main(String[] args) {
        String jour = "Lundi";
        String typeJour;
        switch (jour) {
            case "Lundi":
            case "Mardi":
            case "Mercredi":
            case "Jeudi":
            case "Vendredi":
                typeJour = "Jour ouvrable";
                break;
            case "Samedi":
            case "Dimanche":
                typeJour = "Week-end";
                break;
            default:
                typeJour = "Jour invalide";
                break;
        }
        System.out.println(jour + " est un " + typeJour);
    }
}
{{</inlineJava>}}

Dans cet exemple, l'instruction switch évalue une chaîne de caractères représentant un jour de la semaine. Selon la valeur de jour, une variable typeJour est définie pour indiquer si c'est un jour ouvrable, un week-end ou un jour invalide. L'instruction break est utilisée pour éviter la traversée des cas.

Voici un exemple avec un enum.

{{<inlineJava path="GestionCouleurs.java" lang="java">}}
public class GestionCouleurs {
    // Définition de l'énumération
    enum Couleur {
        ROUGE,
        NOIR,
        BLEU
    }

    // Méthode utilisant l'enum avec un switch
    public static String decrireCouleur(Couleur couleur) {
        String description;
        switch (couleur) {
            case ROUGE:
                description = "Une couleur vive et chaleureuse";
                break;
            case NOIR:
                description = "Une couleur profonde et élégante";
                break;
            case BLEU:
                description = "Une couleur calme et apaisante";
                break;
            default:
                description = "Couleur inconnue";
                break;
        }
        return "La couleur " + couleur + " est : " + description;
    }

    // Méthode principale pour tester
    public static void main(String[] args) {
        // Variable de type Couleur
        Couleur maCouleur = Couleur.ROUGE;
        System.out.println(decrireCouleur(maCouleur));

        maCouleur = Couleur.NOIR;
        System.out.println(decrireCouleur(maCouleur));

        maCouleur = Couleur.BLEU;
        System.out.println(decrireCouleur(maCouleur));
    }
}
{{</inlineJava>}}


Dans le prochain exemple, une énumération Saison est définie avec quatre valeurs. L'instruction switch évalue une variable de type Saison et assigne une description textuelle à la variable description en fonction de la saison. Comme pour l'exemple précédent, break est utilisé pour terminer chaque cas.

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

Pour bien comprendre l'intérêt de la nouvelle syntaxe, reprenons l'exemple du taux de commission.
Voici la même fonction avec la nouvelle syntaxe.

{{<inlineJava path="SwitchExemple.java" lang="java">}}
class SwitchExemple {
    public static void main(String[] args) {
        int classe = 1;
        double tauxCommission = switch (classe) {
            case 1 -> 0.02;
            case 2 -> 0.035;
            case 3 -> 0.05;
            default -> 0.0;
        };
        System.out.println("Le taux de commission est : " + tauxCommission);
    }
}
{{</inlineJava>}}


Cet exemple montre comment la nouvelle syntaxe simplifie le code tout en conservant la même fonctionnalité.
Les différences entre la syntaxe traditionnelle et la nouvelle syntaxe des expressions switch résident principalement dans leur structure et leur comportement. Dans la syntaxe traditionnelle, le switch est une instruction qui exécute un bloc de code pour chaque clause case, nécessitant un break pour éviter la traversée des cas suivants (fall-through). Elle est verbeuse, car elle exige une variable temporaire pour stocker le résultat et des affectations explicites. En revanche, la nouvelle syntaxe utilise des flèches (->) pour associer directement une valeur ou un bloc à un cas, éliminant le besoin de break, car il n’y a pas de fall-through. De plus, le switch devient une expression qui renvoie une valeur, permettant une affectation directe, comme dans l’exemple où tauxCommission est initialisé en une ligne. La nouvelle syntaxe supporte également des cases multiples (séparés par des virgules) et le mot-clé yield pour renvoyer des valeurs depuis des blocs complexes, rendant le code plus concis, lisible et moins sujet aux erreurs.

### Lecture optionnelle dans le livre de référence (Delannoy)

<p>Pour aller plus en profondeur sur les structures de contrôle (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 5:</p>
<ul>
	<li>Section 1 : L'instruction If</li>
	<li>Section 2 : L'instruction switch</li>

</ul>

### Vidéos suggérées

{{< youtube id="0rANfWRfc_c" >}}

{{< youtube id="ws0JqA7bPN0" >}}
