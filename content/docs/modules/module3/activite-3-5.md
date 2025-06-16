---
title: "La récursivité"
weight: 7
---

# La récursivité

<h1>Le concept de récursivité</h1>

<p>La récursivité est un concept de programmation qui remonte aux premières années des langages de programmation (avec LISP et Algol'60). Il s'agit de faire un appel à la méthode/fonction dans la propre portée d'une méthode. Donc d'appeler, par exemple, la méthode calcul à l'intérieur même de la fonction calcul. En quelque sorte, la récursivité peut permettre de remplacer ou imiter des algorithmes itératifs, en faisant un nombre fini d'itérations sur une portion de code. Voici un exemple de récursivité :</p>

```java  {style=github}
public class ExempleRecursivite {
    
    public static void main(String[] args) {
        
        int nb = fibonacci(10);
        
        System.out.println("nb=" + nb);
        
    }
    
    /**
     * Calcul de la suite de fibonnaci avec la récursivité
     * 
     * @param n
     * @return 
     */
    public static int fibonacci(int n) {
        
        // Si n == 0 alors on arrête les appels récursifs et on remonte le résultat.
        if(n <= 1) {
            return n;
        } else {
            // Addition des deux nombres de la suite, en allant de façon décroissante.
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        
    }
    
}
```

<p>Toutefois, la récursivité est à utiliser avec précaution, car elle peut facilement provoquer une erreur de type StackOverflow ou OutOfMemory. C'est à dire, que l'appel répétitif d'une méthode à l'intérieur de sa propre méthode provoquera la multiplication de structures en mémoire (ex. variables, information sur les appels de méthode en soi, structures de données, etc.) et l'utilisation complète de la mémoire dédiée à la JVM par le système d'exploitation de l'ordinateur. Il faut donc être prudent avec l'appel récursif. Voici deux mauvais exemples, qui provoque l'erreur de type StackOverflowError ou l'erreur de type OutOfMemoryError : </p>

```java  {style=github}
public class ExempleRecursivite {

    public static void main(String[] args) {

        // Provoque un OutOfMemoryError
        //long nb = boom(10);
        
        // Provoque un StackOverflowError
        recursivePrint(100);

    }

    /**
     * L'appel de cette méthode provoque un OutOfMemoryError
     *
     * @param n
     * @return
     */
    public static long boom(long n) {

        long a = 10 * n;
        long b = 10 * n;

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            list.add("Prendre de la mémoire");
        }

        return boom(a + b + n);

    }
    
    /**
     * L'appel de cette méthode provoque un StackOverflowError
     * @param num 
     */
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

<p><a id="intro" name="section2"></a></p>
<h1>Des exemples d'utilisation de la récursivité</h1>

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
        
        // Fusionner les deux tableau. En itérant dans les deux moitiés de tableau et en classant alternativement le minimum de chaque moitié
        while (ai + bi < data.length) {            
            // Si a[ai] est inférieur à b[bi] on place a[ai] dans le tableau original
            if (bi >= b.length || (ai < a.length && a[ai] < b[bi])) {
                data[ai + bi] = a[ai]; 
                
                //incrémentation du compter ai
                ai++;
                
            // sinon c'est b[bi]
            } else {
                data[ai + bi] = b[bi]; 
                //incrémentation du compter bi
                bi++;
            }
        }
    }

}
```

<br/>

<p>Voici un autre exemple, avec une façon d'utiliser la récursivité pour trouver le plus grand diviseur commun de deux entiers, basée sur l'<a href="https://fr.wikipedia.org/wiki/Algorithme_d%27Euclide">algorithme d'Euclide</a> :</p>

```java  {style=github}
public class ExempleRecursivite {

    public static void main(String[] args) {
        
  
        System.out.println("Plus grand diviseur commun :" + plusGrandCommunDiviseur(455,322) );
      
    }

    /**
     * Fonction pour trouver le plus grand commun diviseur. Il s'agit de l'algorithme d'Euclide
     * @param p
     * @param q
     * @return 
     */
    public static int plusGrandCommunDiviseur(int p, int q) {
        // Si q est 0, il n'y a pas de diviseur commun
        if (q == 0) {
            return p;
            
        // Sinon, essayons avec le diviseur et le reste de la division de p et q (le modulo)
        } else {         
            return plusGrandCommunDiviseur(q, p % q);
        }
    }

}
```

<iframe height="800px" width="100%" src="https://repl.it/@lemire/ex6?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>

<h2>Lecture dans le livre de référence</h2>

<p>Pour aller plus en profondeur sur la récursivité (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 6:</p>
<ul>
	<li>Section 10 : La récursivité des méthodes</li>
</ul>

<h2>Vidéos</h2>

<iframe width="560" height="315" src="https://www.youtube.com/embed/o0sfEUuqy40" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/dfLPh1oWJNg" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

---

Ce format respecte vos instructions : conversion des sections contenant des éléments HTML en Markdown avec ```java, préservation du contenu non-codé, et application d'un style français impeccable avec des majuscules limitées et une utilisation minimale de listes ou de gras.