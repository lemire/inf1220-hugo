---
title: "Les structures itératives"
weight: 30
---

# Les structures itératives


Les structures itératives permettent d'itérer un certain nombre de fois, basé sur des variables de contrôle. Elles permettent par exemple de chercher une valeur dans une structure de données (ex. un tableau d'entier), de lire un flux de données caractère par caractère, etc. Elles sont l'implémentation des "tant que", des "pour i de 1 à 10 faire", etc. Dans le langage Java, il existe trois structures itératives : le while, le for et le do-while.

## Incrémentation et décrémentation

L'incrémentation et la décrémentation sont des opérations fondamentales en programmation, notamment en Java, qui modifient la valeur d'une variable entière. L'incrémentation augmente la valeur de la variable d'une unité, par exemple en passant de 5 à 6. La décrémentation, à l'inverse, réduit la valeur de la variable d'une unité, par exemple de 5 à 4.

En Java, les expressions `i++`, `i+=1`, `i=i+1`, `++i`, `i--`, `i-=1`, `i=i-1` et `--i` modifient la valeur d'une variable entière `i`, mais leur fonctionnement varie. Pour l'incrémentation, `i++`, `i+=1` et `i=i+1` augmentent `i` de 1 ; `i++` est postfixe, retournant la valeur initiale avant l'incrémentation, tandis que `i+=1` et `i=i+1` appliquent l'incrémentation immédiatement, `i+=1` étant plus concis. L'expression `++i`, préfixe, incrémente `i` et retourne la nouvelle valeur. Pour la décrémentation, `i--`, `i-=1` et `i=i-1` réduisent `i` de 1 ; `i--` est postfixe, retournant la valeur initiale avant la décrémentation, tandis que `i-=1` et `i=i-1` appliquent la décrémentation directement, `i-=1` étant plus court. Enfin, `--i`, préfixe, décrémente `i` et retourne la nouvelle valeur. Le choix entre ces expressions dépend du moment où la valeur modifiée est utilisée dans une expression.

Une opération postfixe, comme `i++` ou `i--`, utilise la valeur initiale de la variable dans une expression avant de l'incrémenter ou de la décrémenter. Une opération préfixe, comme `++i` ou `--i`, modifie la valeur de la variable en premier, puis utilise la nouvelle valeur dans l'expression.


Voici un programme Java qui illustre les différences entre les opérations d'incrémentation et de décrémentation, préfixe et postfixe, ainsi que les formes alternatives.

{{<inlineJava path="IncrementDecrementDemo.java" lang="java" >}}

public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int i = 5;
        
        System.out.println("Valeur initiale de i : " + i);
        
        // Incrémentation
        System.out.println("\nIncrémentation :");
        System.out.println("i++ retourne : " + i++ + " (valeur après : " + i + ")");
        i = 5; // Réinitialisation
        System.out.println("++i retourne : " + ++i + " (valeur après : " + i + ")");
        i = 5; // Réinitialisation
        System.out.println("i += 1 donne : " + (i += 1) + " (valeur après : " + i + ")");
        i = 5; // Réinitialisation
        System.out.println("i = i + 1 donne : " + (i = i + 1) + " (valeur après : " + i + ")");
        
        // Décrémentation
        System.out.println("\nDécrémentation :");
        i = 5; // Réinitialisation
        System.out.println("i-- retourne : " + i-- + " (valeur après : " + i + ")");
        i = 5; // Réinitialisation
        System.out.println("--i retourne : " + --i + " (valeur après : " + i + ")");
        i = 5; // Réinitialisation
        System.out.println("i -= 1 donne : " + (i -= 1) + " (valeur après : " + i + ")");
        i = 5; // Réinitialisation
        System.out.println("i = i - 1 donne : " + (i = i - 1) + " (valeur après : " + i + ")");
    }
}

{{</inlineJava>}}


## La boucle while

L'instruction while (condition) permet d'exécuter les instructions dans sa portée, tant que la condition est vraie. Les instructions peuvent ne jamais s'exécuter si la condition n'est pas vérifiée dès l'entrée de la boucle.


{{<inlineJava path="Main.java" lang="java" >}}
class Main {
    // Cette méthode imprimera 4 fois le char "😍"
    public static void main(String arg[]) {
        int i = 1;

        // Itération tant que i est inférieur ou égal à 4
        while (i <= 4) {       
            System.out.print("😍");
            i++;
        }
    }
}
{{</inlineJava>}}

Cet exemple illustre l’utilisation d’une boucle `while` en Java pour afficher quatre fois le caractère `😍`. Une variable `i` est initialisée à `1`, et la boucle `while (i <= 4)` exécute son bloc tant que `i` est inférieur ou égal à `4`. À chaque itération, `System.out.print("😍")` affiche un `😍` sans saut de ligne, et `i++` incrémente `i` de `1`. La boucle s’arrête lorsque `i` atteint `5`, après avoir affiché `😍😍😍😍`. Ce code montre comment une boucle `while` contrôle une répétition basée sur une condition, ici pour produire une séquence simple de caractères.


Il est possible de terminer une itération, ou la boucle entière, grâce à deux instructions : continue et break. L'instruction continue permet de sauter toutes les instructions qui suivent et revenir au début de la boucle. Ainsi, le programme suivant arrêtera l'itération à `i == 3`:

{{<inlineJava path="ExecutionIteration.java" lang="java" >}}
public class ExecutionIteration {

    public static void main(String arg[]) {
        int i = 1;

        // Itération tant que i est inférieur ou égal à 4
        while (i <= 4) {
            if(i==3) {
                  break;
            }       
            System.out.print("😍");
            i++;
        }
    }
}
{{</inlineJava>}}

D'autre part, le mot-clé `continue` permet de *sauter* une partie de l'exécution du code d'une structure d'itération pour commencer une nouvelle itération. Ainsi, dans le code suivant, les nombres impairs ne seront pas affichés car l'exécution de la ligne `System.out` ne sera pas atteinte&nbsp;:


{{<inlineJava path="Main.java" lang="java" >}}
public class Main {

    public static void main(String arg[]) {
        int i = 0;
        while (i != 4) {
            i++;
            if((i%2) != 0) {
                  continue;
            }       
            System.out.println(i);
        }
    }
}
{{</inlineJava>}}



## La boucle for


L'instruction `for (initialisation; test_fin; itération)` permet de répéter les instructions dans la portée en utilisant plusieurs valeurs pour certaines variables. Ces variables sont déclarées et initialisées dans l'expression `initialisation` (plusieurs variables peuvent être séparées par des virgules). La fin de l'itération est indiquée par l'expression `test_fin`. L'expression `itération` est exécutée au début de chaque nouvelle itération (après la première). Voici un exemple de boucle `for` en réutilisant l'exemple précédent pour la boucle `while`.

La boucle `for` est particulièrement adaptée lorsque le nombre d’itérations est connu à l’avance ou dépend d’une condition claire, comme parcourir un intervalle de valeurs. Dans l’initialisation, une variable (souvent appelée compteur) est déclarée et reçoit une valeur de départ, par exemple `int i = 0`. L’expression `test_fin` vérifie à chaque tour si la boucle doit continuer, par exemple `i < 10`. L’expression `itération` met à jour la variable après chaque exécution du bloc, souvent en l’incrémentant (`i++`). Cette structure concentre les trois aspects du contrôle de la boucle en une seule ligne, rendant le code compact et lisible.

Considérez cet exemple.

{{<inlineJava path="ExecutionIteration.java" lang="java" >}}
public class ExecutionIteration {
    // affiche 2 et 4
    public static void main(String arg[]) {
        // Itération tant que i est inférieur ou égal à 4
        for(int i = 1; i <= 4; i++) {

            if((i%2) != 0) {
                  continue;
            }
            System.out.println(i);
        }
    }
}
{{</inlineJava>}}


La boucle `for` du programme est configurée pour itérer sur les valeurs de `i` de 1 à 4, grâce à la déclaration `for(int i = 1; i <= 4; i++)`. À chaque itération, la condition `if((i%2) != 0)` vérifie si `i` est impair en calculant le reste de la division de `i` par 2 (via l’opérateur modulo `%`). Si `i` est impair (par exemple, 1 ou 3), la condition est vraie, et l’instruction `continue` est exécutée. L’instruction `continue` interrompt immédiatement l’itération courante et passe à la suivante, sans exécuter le reste du bloc de la boucle, ici l’instruction `System.out.println(i)`. Ainsi, les nombres impairs ne sont pas affichés, car leur itération est court-circuitée.

Le rôle de `continue` est donc de filtrer les itérations non désirées de manière concise. Dans cet exemple, lorsque `i` vaut 1, `1 % 2` donne 1, la condition `(i%2) != 0` est vraie, et `continue` saute directement à `i = 2`. Pour `i = 2`, `2 % 2` donne 0, la condition est fausse, `continue` est ignoré, et `System.out.println(2)` affiche `2`. Le même processus se répète pour `i = 3` (sauté via `continue`) et `i = 4` (affiché). En fin de compte, seules les valeurs paires, `2` et `4`, sont affichées, car `continue` a empêché l’exécution de l’affichage pour les valeurs impaires. Cet usage de `continue` simplifie le code en évitant des conditions imbriquées complexes, comme un `if` pour vérifier les nombres pairs.



Les structures de données de base en programmation, telles que les tableaux ou les listes, seront abordées plus tard. Voici néanmoins
un exemple typique de boucle sur un tableau.


{{<inlineJava path="Main.java" lang="java" >}}
public class Main {
    public static void main(String[] args) {
        String chaine = "veni vidi vici";
        int nbVoyelle = 0;
        char[] caracteres = chaine.toCharArray();
        for(int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            if(c == 'a' || c == 'e' || c == 'i' 
              || c == 'o' || c == 'u' || c == 'y') {
                  nbVoyelle++;
            }       
        }
        System.out.println(nbVoyelle);
    }
}
{{</inlineJava>}}

Cet exemple illustre l’utilisation d’une boucle `for` classique en Java pour compter les voyelles dans la chaîne `"veni vidi vici"`. Le programme convertit la chaîne en un tableau de caractères avec `toCharArray()`, puis parcourt chaque caractère à l’aide d’une boucle `for(int i = 0; i < caracteres.length; i++)`. À chaque itération, la variable `c` prend la valeur du caractère à l’index `i`, et une condition `if` vérifie si `c` est une voyelle (`a`, `e`, `i`, `o`, `u`, ou `y`). Si c’est le cas, la variable `nbVoyelle` est incrémentée. À la fin, `System.out.println(nbVoyelle)` affiche `6`, correspondant aux voyelles `e`, `i`, `i`, `i`, `i`, `i` trouvées dans la chaîne.
Cette syntaxe est un peu verbeuse.

La boucle `for` améliorée (ou "for-each") permet de  parcourir facilement les éléments d'une structure comme un tableau, simplifiant l'écriture du code pour traiter chaque élément individuellement.
Dans le prochain exemple, la boucle `for(char c : chaine.toCharArray())` parcourt chaque caractère, assignant successivement chaque caractère à la variable `c`. 

{{<inlineJava path="Main.java" lang="java" >}}
public class Main {

    public static void main(String arg[]) {

        String chaine = "veni vidi vici";
        int nbVoyelle = 0;
        for(char c : chaine.toCharArray()) {
            if(c ==  'a' || c == 'e' || c == 'i' 
              || c == 'o' || c == 'u' || c == 'y' ) {
                  nbVoyelle++;
            }       
        }
        System.out.println(nbVoyelle);
    }
}
{{</inlineJava>}}


## La boucle do-while

La boucle do-while est similaire à la boucle while, à la différence que le contrôle de valeurs se fait à la fin de l'itération du corps de la structure. Le do-while peut donc être utilisé à d'autres fins. Voici un exemple.

{{<inlineJava path="ExecutionIteration.java" lang="java" >}}
public class ExecutionIteration {

    public static void main(String arg[]) {
        int i = 1;

        do {       
            System.out.print("😍");
            i++;
        }  while (i <= 4);
    }
}
{{</inlineJava>}}

Cet exemple utilise une boucle `do-while` en Java pour afficher quatre fois le caractère `😍`. Une variable `i` est initialisée à `1`, et la boucle `do` exécute son bloc, qui affiche un `😍` avec `System.out.print("😍")` et incrémente `i` avec `i++`, avant de vérifier la condition `while (i <= 4)`. La boucle continue tant que `i` est inférieur ou égal à `4`, s’arrêtant lorsque `i` atteint `5`. La sortie est `😍😍😍😍`, car le bloc est exécuté quatre fois. Contrairement à une boucle `while`, la boucle `do-while` garantit au moins une exécution, mais ici, la condition assure exactement quatre itérations.

## Utilisation des structures d'itération

Les structures (ou boucles) d'itération sont utiles à plusieurs fins : analyser une suite de données, vérifier l'état d'un capteur, trouver une donnée dans une structure, etc. Il est possible d'imbriquer des boucles (et des structures de contrôle), mais attention à la complexité algorithmique (ex. le temps de calcul), l'espace mémoire généré, etc. Par exemple, supposons que nous voulons dénombrer la quantité d'un nombre entier donné (supposons 4) dans un tableau. Il sera nécessaire de faire une passe complète sur le tableau, donc de lire N données pour tableau d'une longueur de \( N \). Ce qui correspond à une complexité algorithmique de \( O(N) \).

{{<inlineJava path="TrouverEntier.java" lang="java" >}}
public class TrouverEntier {
        final static int NOMBRE_A_TROUVER = 4;
        public static void main(String[] args) {
            int nombre = 0;
            int[] tableau = {2,3,6,2,4,6,8,0,2,2};
            for(int i = 0; i < tableau.length; i++) {
                if(NOMBRE_A_TROUVER == tableau[i]) {
                    nombre++;
                }   
            }
            System.out.println("Nombre :" + nombre);
        }
}
{{</inlineJava>}}

Maintenant, supposons que nous voulons faire la même chose, mais pour chacune des valeurs du tableau. La complexité algorithme devient quadratique, i.e. \( O(N^2) \), car nous devons maintenant pour \( N \) données, faire \(  N \) passe dans le tableau. Pour un tableau de 10 données, il s'agit de 100 itérations totales, mais pour un tableau de 1000 données, il s'agit de 1 million d'itérations!


{{<inlineJava path="Main.java" lang="java" >}}
public class Main {  
        public static void main(String[] args) {
            int[] nombres = new int[10];
            int[] tableau = {2,3,6,2,4,6,8,0,2,2};
                  
            for(int i = 0; i < tableau.length; i++) {
                for(int j = 0; j < tableau.length; j++) {
                    if(i != j && tableau[i] == tableau[j]) {
                        nombres[i]++;
                    }
                }
                // Pour ajouter le nombre courant.
                nombres[i]++;
            }
            
            for(int i = 0; i < tableau.length; i++) {
                System.out.println("Entier : " + tableau[i] 
                 + " quantité : " + nombres[i]);
            }
        }
}
{{</inlineJava>}}


## Comment choisir le type d'une boucle

Le choix du type de boucle dépend du contexte du problème à résoudre et de la structure de votre code.

- Utilisez une boucle **for** lorsque vous connaissez à l’avance le nombre d’itérations à effectuer, par exemple pour parcourir un tableau ou répéter une action un nombre précis de fois. La boucle for est idéale pour les situations où l’on a un compteur ou un indice qui évolue de façon prévisible.

- Privilégiez une boucle **while** lorsque vous ne connaissez pas à l’avance le nombre d’itérations, mais que vous souhaitez répéter une action tant qu’une condition reste vraie. C’est le cas typique de la lecture d’entrées jusqu’à une valeur sentinelle, ou d’un processus qui doit s’arrêter dès qu’une condition est remplie.

- La boucle **do...while** est utile lorsque vous voulez que le bloc d’instructions soit exécuté au moins une fois, peu importe la condition (par exemple, afficher un menu et demander une saisie tant que l’utilisateur ne choisit pas de quitter).

En résumé : choisissez la boucle qui rend votre intention la plus claire et qui correspond le mieux à la logique du problème. Un code lisible et adapté au contexte est toujours préférable à une utilisation mécanique d’un seul type de boucle.


## Lecture optionnelle dans le livre de référence (Delannoy)

Pour aller plus en profondeur sur les structures d'itération (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy le chapitre 5.


### Vidéo

{{< youtube id="oHOXE9h3t_A" >}}
