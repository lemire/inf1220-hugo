---
title: "Les valeurs aléatoires"
weight: 42
---



# Génération de valeurs aléatoires


{{% hint info %}}

Vous n'avez pas à maîtriser la génération de valeurs aléatoires dans ce cours.

{{% /hint %}}

Pour tester des structures de données, il est utile de pouvoir générer des valeurs aléatoires. Le plus souvent en programmation logicielle, nous générons des valeurs pseudo-aléatoires. Une valeur pseudo-aléatoire semble aléatoire, mais elle est en réalité pré-déterminée. La classe `Random` en Java, située dans le paquetage `java.util`, permet de générer des nombres pseudo-aléatoires pour diverses applications, comme les simulations, les jeux ou les tests. Elle utilise un générateur de nombres pseudo-aléatoires basé sur une graine (seed), qui, si spécifiée, garantit la reproductibilité des séquences générées. Par défaut, `Random` utilise une graine dérivée de l’heure système pour produire des résultats différents à chaque exécution. La classe offre des méthodes comme `nextInt()`, `nextDouble()` ou `nextBoolean()` pour générer respectivement des entiers, des nombres à virgule flottante ou des booléens.


La génération de nombres pseudo-aléatoires repose sur un algorithme déterministe qui produit une séquence de valeurs à partir d’une graine initiale. Cette graine est un point de départ pour le générateur : si la même graine est utilisée, la séquence de nombres générés sera identique. Cela permet de reproduire des résultats, ce qui est particulièrement utile pour le débogage ou les tests. Par exemple, en fixant une graine avec `Random random = new Random(12345);`, chaque exécution du programme produira la même séquence de nombres.

Lorsque aucune graine n’est spécifiée, comme dans `Random random = new Random();`, la classe utilise une valeur par défaut, généralement basée sur l’heure système en nanosecondes. Cela donne l’impression d’une séquence aléatoire différente à chaque exécution. Cependant, comme les valeurs sont générées par un algorithme, elles ne sont pas véritablement aléatoires, mais pseudo-aléatoires, c’est-à-dire qu’elles suivent un schéma prévisible si la graine est connue.

La classe `Random` utilise un algorithme appelé *[Linear Congruential Generator](https://en.wikipedia.org/wiki/Linear_congruential_generator)* (LCG) ou une variante pour produire ses valeurs. Cet algorithme est rapide et adapté à la plupart des besoins en programmation, bien qu’il ne soit pas cryptographiquement sécurisé. Pour des applications nécessitant un haut niveau de sécurité (comme la génération de clés cryptographiques), il est préférable d’utiliser `java.security.SecureRandom`, qui est plus robuste mais plus lent.

Les méthodes principales de `Random` incluent :
- `nextInt(bound)` : génère un entier entre 0 (inclus) et `bound` (exclus).
- `nextInt()` : génère un entier sur toute la plage des entiers 32 bits.
- `nextDouble()` : génère un nombre à virgule flottante entre 0.0 (inclus) et 1.0 (exclus).
- `nextBoolean()` : génère une valeur booléenne (`true` ou `false`) avec une probabilité égale.


Voici un exemple qui génère des nombres aléatoires, illustrant l’utilisation d’une graine pour la reproductibilité.

{{<inlineJava path="GenerationAleatoire.java" lang="java">}}
import java.util.Random;

public class GenerationAleatoire {
    public static void main(String[] args) {
        // Avec une graine fixe pour reproductibilité
        Random random = new Random(12345);
        System.out.println("Cinq nombres entiers aléatoires entre 1 et 100 (graine fixe) :");
        for (int i = 0; i < 5; i++) {
            int nombre = random.nextInt(100) + 1; // Génère un nombre entre 0 et 99, puis ajoute 1
            System.out.println("Nombre " + (i + 1) + " : " + nombre);
        }

        // Sans graine, pour résultats différents à chaque exécution
        random = new Random();
        System.out.println("\nCinq nombres entiers aléatoires entre 1 et 100 (graine par défaut) :");
        for (int i = 0; i < 5; i++) {
            int nombre = random.nextInt(100) + 1;
            System.out.println("Nombre " + (i + 1) + " : " + nombre);
        }
    }
}
{{</inlineJava>}}

Voici un exemple qui génère des chaînes de caractères aléatoires, en sélectionnant des caractères à partir d’un ensemble prédéfini.

{{<inlineJava path="ChaineAleatoire.java" lang="java">}}
import java.util.Random;

public class ChaineAleatoire {
    public static void main(String[] args) {
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int longueur = 10;
        StringBuilder chaine = new StringBuilder();
        
        for (int i = 0; i < longueur; i++) {
            int index = random.nextInt(caracteres.length());
            chaine.append(caracteres.charAt(index));
        }
        
        System.out.println("Chaîne aléatoire générée : " + chaine.toString());
    }
}
{{</inlineJava>}}

Dans cet exemple, chaque caractère de la chaîne est choisi aléatoirement parmi ceux de la variable `caracteres`. La méthode `nextInt(caracteres.length())` génère un index aléatoire entre 0 et la longueur de la chaîne `caracteres` (exclus). Le caractère correspondant est ajouté à un `StringBuilder` pour construire la chaîne finale. L’utilisation de `StringBuilder` est préférable à la concaténation de `String` pour des raisons de performance, comme expliqué dans la section sur l’allocation de mémoire.

