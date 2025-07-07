---
title: "Java pas à pas"
weight: 10
---

# Java pas à pas

Nous vous invitons maintenant à lire le chapitre  *Structures de contrôle* (chapitre 3)  du  manuel Java pas à pas par Robert Godin et Daniel Lemire. Le chapitre comprend plusieurs exemples et exercices. Vous devez compléter les exercices du manuel. Vous pouvez aussi exécuter certains exemples du manuel sur cette page.

{{<inlineJava path="ExemplesMath.java" lang="java" >}}
public class ExemplesMath {

  public static void main(String args[]) {
    System.out.println("Math.log(1.0)=" + Math.log(1.0));
    System.out.println("Math.exp(1.0)=" + Math.exp(1.0));
    System.out.println("Math.cos(0)=" + Math.cos(0));
    System.out.println("Math.sin(0)=" + Math.sin(0));
    System.out.println("Math.sqrt(4)=" + Math.sqrt(4));
  }
}
{{</inlineJava>}}


{{<inlineJava path="ExemplesString.java" lang="java" >}}
public class ExemplesString {

  public static void main(String args[]) {

    String string1 = "abc";
    String string2 = "def";
    String string3 = "abcdef";
    String string4 = new String("abcdef");

    // Tous les litéraux identiques (� la compilation) sont traduits
    // par une référence au même objet
    System.out.println(string3 == "abcdef"); // true
    System.out.println("abc" + "def" == "abcdef"); // true

    // Par contre, si le litéral est calculé à l'exécution, ce n'est pas le cas
    System.out.println(string1 + string2 == "abcdef"); // false

    // Le constructeur String produit toujours un objet différent de l'objet
    // correspondant au litéral
    System.out.println(string4 == "abcdef"); // false

    // La méthode intern() de la classe String permet de convertir
    // la référence à l'objet correspondant au litéral
    System.out.println((string1 + string2).intern() == "abcdef"); // true
    System.out.println(string4.intern() == "abcdef"); // true

    // La méthode equals() permet de comparer le contenu de l'objet plutôt que la référence
    System.out.println((string1 + string2).equals("abcdef")); // true
    System.out.println(string4.equals("abcdef")); // true
  }
}
{{</inlineJava>}}


{{<inlineJava path="ExempleZero.java" lang="java" >}}
public class ExempleZero {
  public static void main(String[] s) {
    double minus_zero = -0.0;
    double plus_zero = +0.0;
    System.out.println(minus_zero == plus_zero);
    System.out.println(1/minus_zero);
    System.out.println(1/plus_zero);
    System.out.println(1/minus_zero == 1/plus_zero);
    double n = 0.0 / 0.0;
    System.out.println(n);
    System.out.println(n == n);
  }
}
{{</inlineJava>}}


{{<inlineJava path="ExerciceForFor.java" lang="java" >}}
public class ExerciceForFor {
  public static void main(String args[]) {
    for (int compteur1 = 1; compteur1 <= 9; compteur1 = compteur1 + 1) {
      for (int compteur2 = 1; compteur2 <= compteur1; compteur2 = compteur2 + 1)
        System.out.print(compteur2);
      System.out.println();
    }
  }
}
{{</inlineJava>}}





Après la lecture du chapitre, répondez aux questions suivantes.

- Expliquez ce qu'est la structure de contrôle de type séquence en programmation Java. Donnez un exemple simple de code Java illustrant cette structure et expliquez pourquoi elle est considérée comme la structure de contrôle de base.
- Décrivez le fonctionnement de la boucle while en Java, en précisant sa syntaxe et les conditions nécessaires pour qu'elle s'exécute correctement. À l'aide d'un exemple de code, montrez comment utiliser une boucle while pour afficher les nombres de 1 à 10.
- Comparez les boucles for et while en termes de structure et d'utilisation en Java. Fournissez un exemple de code utilisant une boucle for pour calculer la somme des nombres pairs compris entre 1 et 100, et expliquez pourquoi la boucle for est particulièrement adaptée à ce type de tâche.
- Expliquez comment la structure if permet de prendre des décisions dans un programme Java. Écrivez un programme simple qui utilise une structure if-else pour déterminer si un nombre saisi par l'utilisateur (via la classe Scanner) est 
- Selon le chapitre, pourquoi est-il important de tester et de déboguer un programme Java ? Décrivez une méthode de test que vous pourriez utiliser pour vérifier le bon fonctionnement d'une boucle for qui affiche les multiples de 5 jusqu'à 50. Expliquez comment vous identifieriez et corrigeriez une erreur si la boucle affichait incorrectement les résultats.

Plusieurs étudiants trouvent qu'il est plus aisé de faire les lectures dans le manuel Java pas à pas après avoir terminé la lecture du module sur notre site web. Vous pouvez choisir quand il vous convient le mieux d'utiliser le manuel Java pas à pas.


Vous avez accès <a href="https://raw.githubusercontent.com/RobertGodin/JavaPasAPas/master/JavaPasAPas.pdf">au document PDF</a>. Si vous devez lire un document PDF, nous vous encourageons à charger le fichier sur votre machine et à l'ouvrir au sein d'un outil dédié (par ex. Adobe Acrobat). Il n'est pas très pratique de lire un document PDF au sein d'un navigateur web.


<a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/">Vous pouvez aussi acheter la version papier du manuel Java pas à pas chez Amazon</a>  pour une somme modeste&nbsp;:

<div><a href="https://www.amazon.ca/Java-pas-Introduction-programmation-langage/dp/B0CR7RW87Y/"><img src="https://m.media-amazon.com/images/I/61tnblFlmmL._SL1499_.jpg" width="250px" style="margin-left:auto; margin-right:auto;"></a></div>
