---
title: "La récursivité"
weight: 7
---

# La récursivité

La récursivité est une technique fondamentale en informatique qui consiste pour une fonction à s’appeler elle-même afin de résoudre un problème en le divisant en sous-problèmes plus simples. Cette approche permet d’exprimer élégamment des solutions à des problèmes complexes, comme le calcul de suites, la recherche dans des structures arborescentes ou la résolution de certains algorithmes mathématiques. Comprendre la récursivité est essentiel pour progresser en algorithmique et en programmation.

## Le concept de récursivité

<p>La récursivité est un concept de programmation qui remonte aux premières années des langages de programmation (avec LISP et Algol'60). Il s'agit de faire un appel à la méthode/fonction dans la propre portée d'une méthode. Donc d'appeler, par exemple, la méthode calcul à l'intérieur même de la fonction calcul. En quelque sorte, la récursivité peut permettre de remplacer ou imiter des algorithmes itératifs, en faisant un nombre fini d'itérations sur une portion de code. Voici un exemple de récursivité :</p>

```java  {style=github}
public class ExempleRecursivite {
    public static void main(String[] args) {
        int nb = fibonacci(10);
        System.out.println("nb=" + nb);
    }
    
    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
```

<p>Toutefois, la récursivité est à utiliser avec précaution, car elle peut facilement provoquer une erreur de type StackOverflow ou OutOfMemory. C'est à dire, que l'appel répétitif d'une méthode à l'intérieur de sa propre méthode provoquera la multiplication de structures en mémoire (ex. variables, information sur les appels de méthode en soi, structures de données, etc.) et l'utilisation complète de la mémoire dédiée à Java par le système d'exploitation de l'ordinateur. Il faut donc être prudent avec l'appel récursif. Voici deux mauvais exemples, qui provoque l'erreur de type StackOverflowError ou l'erreur de type OutOfMemoryError : </p>

```java  {style=github}
public class ExempleRecursivite {
    public static void main(String[] args) {

        // Provoque un OutOfMemoryError
        //long nb = boom(10);
        
        // Provoque un StackOverflowError
        recursivePrint(100);

    }

    public static long boom(long n) {
        long a = 10 * n;
        long b = 10 * n;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            list.add("Prendre de la mémoire");
        }
        return boom(a + b + n);
    }
    
    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);
        if (num == 0) {
            return;
        } else {
            recursivePrint(++num);
        }
    }
}
```

<br/>

## Des exemples d'utilisation de la récursivité

<p>La récursivité peut être bien utile dans des cas où il faut appliquer la technique "diviser pour régner", surtout pour le traitement de données. Un exemple bien connu est le tri-fusion (merge sort) qui utilise la récursivité pour diviser un tableau en deux récursivement jusqu'à atteindre des couples. Puis, l'algorithme tri le couple min-max et retourne le résultat plus haut. Ensuite, une fusion des données s'opère pour trier un par un les minimum de chaque sous-tableau dans le tableau original. Voici le tri-fusion : </p>

```java  {style=github}
public class ExempleRecursivite {

    public static void main(String[] args) {
        
        int[] tableau = {2,5,7,4,6,12,1,55};
       
        triFusion(tableau);
        
        for(int i : tableau) {
            System.out.print(i + " ");
        }
    }

    public static void triFusion(int[] data) {
        
        // Si il n'y a qu'une donnée dans le tableau, alors on la retourne.
        if (data.length <= 1) {
            return;               
        }
        
        // Diviser le tableau en deux tableau d'une même longueur si possible
        int[] a = new int[data.length / 2];        
        int[] b = new int[data.length - a.length];
        
        //Copier les données dans les deux tableaux
        for (int i = 0; i < data.length; i++) {
            if (i < a.length) {
                a[i] = data[i];
            } else {
                b[i - a.length] = data[i];
            }
        }

        // Appel du tri sur les deux moitiés de tableau
        triFusion(a);                              
        triFusion(b);                              

        // Les compteurs de ai et bi
        int ai = 0;                                
        int bi = 0;                                
        
        while (ai + bi < data.length) {            
            if (bi >= b.length || (ai < a.length && a[ai] < b[bi])) {
                data[ai + bi] = a[ai]; 
                
                ai++;
                
            } else {
                data[ai + bi] = b[bi]; 
                bi++;
            }
        }
    }

}
```

<br/>

<p>Voici un autre exemple, avec une façon d'utiliser la récursivité pour trouver le plus grand diviseur commun de deux entiers, basée sur l'<a href="https://fr.wikipedia.org/wiki/Algorithme_d%27Euclide">algorithme d'Euclide</a> :</p>




{{<inlineJava path="ExempleRecursivite.java" lang="java">}}
public class ExempleRecursivite {
    public static void main(String[] args) {
        System.out.println("Plus grand diviseur commun :" 
          + plusGrandCommunDiviseur(455,322) );
    }

    public static int plusGrandCommunDiviseur(int p, int q) {
        if (q == 0) {
            return p;            
        } else {         
            return plusGrandCommunDiviseur(q, p % q);
        }
    }
}
{{</inlineJava>}}


### Lecture optionnelle dans le livre de référence (Delannoy)

<p>Pour aller plus en profondeur sur la récursivité (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 6:</p>
<ul>
	<li>Section 10 : La récursivité des méthodes</li>
</ul>

### Vidéos

<iframe width="560" height="315" src="https://www.youtube.com/embed/o0sfEUuqy40" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/dfLPh1oWJNg" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

---

Ce format respecte vos instructions : conversion des sections contenant des éléments HTML en Markdown avec ```java, préservation du contenu non-codé, et application d'un style français impeccable avec des majuscules limitées et une utilisation minimale de listes ou de gras.