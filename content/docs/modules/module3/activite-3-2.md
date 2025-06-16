---
title: "Les structures itératives"
weight: 3
---

# Les structures itératives


<p>Les structures itératives permettent d'itérer un certain nombre de fois, basé sur des variables de contrôle. Elles permettent par exemple de chercher une valeur dans une structure de données (ex. un tableau d'entier), de lire un flux de données caractère par caractère, etc. Elles sont l'implémentation des "tant que", des "pour i de 1 à 10 faire", etc. Dans le langage Java, il existe trois structures itératives : le while, le for et le do-while.</p>

<p><a id="intro" name="section1"></a></p>

<h1>La boucle while</h1>

<p>L'instruction while (condition) permet d'exécuter les instructions dans sa portée, tant que la condition est vraie. Les instructions peuvent ne jamais s'exécuter si la condition n'est pas vérifiée dès l'entrée de la boucle.</p>


<iframe height="400px" width="100%" src="https://repl.it/@lemire/nex1?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>

<p>Il est possible de terminer une itération, ou la boucle entière, grâce à deux instructions : continue et break. L'instruction continue permet de sauter toutes les instructions qui suivent et revenir au début de la boucle. Ainsi, le programme suivant arrêtera l'itération à i == 3:</p>

{{<inlineJava path="ExecutionIteration.java" lang="java" >}}
public class ExecutionIteration {

    public static void main(String arg[]) {
        int i = 1;

        // Itération tant que i est inférieur ou égal à 4
        while (i <= 4) {
            if(i==3) {
                  break;
            }       
            System.out.print("*");
            i++;
        }
    }
}
{{</inlineJava>}}

<p>D'autre part, le mot-clé "continue" permet de "sauter" une partie de l'exécution du code d'une structure d'itération pour commencer une nouvelle itération. Ainsi, dans le code suivant, les nombres impairs ne seront pas affichés car l'exécution de la ligne System.out ne sera pas atteinte par la JVM :</p>

<iframe height="800px" width="100%" src="https://repl.it/@lemire/ex1?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>


<p><a id="intro" name="section2"></a></p>

<h1>La boucle for</h1>

<p>L'instruction for (initialisation; test_fin; itération) permet de répéter les instructions dans la portée en utilisant plusieurs valeurs pour certaines variables. Ces variables sont déclarées et initialisées dans l'expression init (plusieurs variables peuvent être séparées par des virgules). La fin de l'itération est indiquée par l'expression test_fin. L'expression itération est exécutée au début de chaque nouvelle itération (après la première). Voici un exemple de boucle for en réutilisant l'exemple précédent pour la boucle while :</p> 

```java  {style=github}
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
```

<p>Nous n'avons pas encore vu les structures de données de base en programmation (ex. tableau, list, etc.) et le sujet sera abordé un peu plus loin, mais la structure d'itération for permet également de simplifier l'itération dans ce type de structure. Voici un exemple avec une chaîne de caractères :</p>

<iframe height="800px" width="100%" src="https://repl.it/@lemire/ex2?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>


<p><a id="intro" name="section3"></a></p>

<h1>La boucle do-while</h1>

<p>La boucle do-while est similaire à la boucle while, à la différence que le contrôle de valeurs se fait à la fin de l'itération du corps de la structure. Le do-while peut donc être utilisé à d'autres fins. Voici un exemple :</p>

{{<inlineJava path="ExecutionIteration.java" lang="java" >}}
public class ExecutionIteration {

    public static void main(String arg[]) {
        int i = 1;

        do {       
            System.out.print("*");
            i++;
        }  while (i <= 4);
    }
}
{{</inlineJava>}}

<p><a id="intro" name="section4"></a></p>

<h1>Utilisation des structures d'itération</h1>

<p>Les structures (ou boucles) d'itération sont utiles à plusieurs fins : analyser une suite de données, vérifier l'état d'un capteur, trouver une donnée dans une structure, etc. Il est possible d'imbriquer des boucles (et des structures de contrôle), mais attention à la complexité algorithmique (ex. le temps de calcul), l'espace mémoire généré, etc. Par exemple, supposons que nous voulons dénombrer la quantité d'un nombre entier donné (supposons 4) dans un tableau. Il sera nécessaire de faire une passe complète sur le tableau, donc de lire N données pour tableau d'une longueur de N. Ce qui correspond à une complexité algorithmique de O(N):</p>

{{<inlineJava path="ExecutionIteration.java" lang="java" >}}
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

<p>Maintenant, supposons que nous voulons faire la même chose, mais pour chacune des valeurs du tableau. La complexité algorithme devient quadratique, i.e. O(N^2), car nous devons maintenant pour N données, faire N passe dans le tableau. Pour un tableau de 10 données, il s'agit de 100 itérations totales, mais pour un tableau de 1000 données, il s'agit de 1 million d'itérations! : </p>

<iframe height="800px" width="100%" src="https://repl.it/@lemire/ex3?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>
<h2>Lecture dans le livre de référence</h2>

<p>Pour aller plus en profondeur sur les structures d'itération (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy le chapitre 5.</p>


<h2>Vidéo</h2>

<iframe width="560" height="315" src="https://www.youtube.com/embed/oHOXE9h3t_A" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>