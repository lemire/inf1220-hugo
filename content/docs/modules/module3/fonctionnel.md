---
title: "La programmation fonctionnelle en Java"
weight: 5
---

# La programmation fonctionnelle en Java


La programmation fonctionnelle tire ses origines des mathématiques, en particulier du calcul lambda développé par Alonzo Church dans les années 1930. Ce formalisme a posé les bases théoriques pour décrire les calculs comme des fonctions pures, sans effets de bord. Dans les années 1950, John McCarthy a créé Lisp, le premier langage explicitement inspiré de ces idées, introduisant des concepts comme les fonctions de première classe. Les années 1980 ont vu l’émergence de langages comme Haskell, qui a mis l’accent sur les fonctions pures et l’évaluation paresseuse. 
L'évaluation paresseuse est une stratégie en programmation fonctionnelle où l'évaluation d'une expression est retardée jusqu'à ce que sa valeur soit réellement nécessaire. Cela permet d'optimiser les performances en évitant les calculs inutiles et de supporter des structures de données potentiellement infinies.
Depuis, la programmation fonctionnelle a influencé de nombreux langages modernes (Scala, Clojure, F#) et a été intégrée dans des langages impératifs comme Python, JavaScript et Java, en réponse à la nécessité de parallélisme et de code plus robuste.

Avant Java 8 (2014), la programmation fonctionnelle était absente ou limitée. Les programmeurs utilisaient des solutions comme les classes anonymes pour simuler des comportements fonctionnels, mais cela était verbeux. Avec Java 8, l’introduction des expressions lambda, de l’API Stream et des interfaces fonctionnelles (comme Function, Predicate) a marqué un tournant, permettant de manipuler les fonctions comme des objets de première classe et de traiter les données de manière déclarative. Les références de méthodes et les types fonctionnels ont renforcé cette approche. 

## Lambdas

Une fonction lambda, ou expression lambda, est une fonction anonyme concise définie sans nom, souvent utilisée pour des opérations simples et ponctuelles. Elle permet d'écrire du code plus compact, notamment dans des contextes où une fonction est passée en argument, comme pour des opérations de filtrage ou de tri. En Java, par exemple, les lambdas s'appuient sur les interfaces fonctionnelles, qui possèdent une unique méthode abstraite. Leur syntaxe est de la forme (paramètres) -> expression ou (paramètres) -> { instructions; } pour des blocs plus complexes.

Voici un exemple de code Java avec une méthode main utilisant une lambda pour trier une liste de chaînes par longueur :

{{<inlineJava path="ExempleLambda.java" lang="java">}}
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class ExempleLambda {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList("chat", "éléphant", "chien", "girafe");
        mots.sort((a, b) -> a.length() - b.length());
        System.out.println("Mots triés par longueur : " + mots);
    }
}
{{</inlineJava>}}

Ce code définit une liste de mots, utilise une lambda pour trier les éléments par longueur croissante, puis affiche le résultat. La lambda (a, b) -> a.length() - b.length() remplace une implémentation complète de Comparator.

En Java, les expressions lambda permettent de capturer des variables de leur portée environnante, mais cette capture est soumise à des règles strictes pour garantir la sécurité et la prévisibilité. Les lambdas peuvent accéder aux variables locales, aux paramètres de méthode, aux variables d'instance, aux variables statiques et aux références this ou super. 
Les variables locales et les paramètres de méthode doivent être final ou effectivement final (non modifiés après leur initialisation) pour être capturés par une lambda.  Par exemple, une variable locale int x = 10 peut être utilisée dans une lambda si elle n'est pas réassignée. En revanche, les variables d'instance et statiques de la classe englobante peuvent être librement accédées et modifiées.
Les lambdas capturent également la référence this de la classe englobante, permettant d'accéder à ses méthodes et champs d'instance. Contrairement aux classes anonymes, où this fait référence à l'instance de la classe anonyme, dans une lambda, this désigne l'instance de la classe englobante. Les lambdas ne créent pas de nouvelle portée pour this, ce qui simplifie leur sémantique. Cependant, les paramètres de la lambda ne peuvent pas avoir le même nom qu'une variable locale capturée pour éviter les ambiguïtés.
Sous le capot, la capture des variables locales se fait par référence à leur valeur (qui est constante en raison de la règle de finalité effective), tandis que les variables d'instance et statiques sont accessibles via une référence à l'objet ou à la classe englobante. 
Cela permet aux lambdas de modifier l'état mutable, comme une liste référencée par une variable locale effectivement final, ce qui peut compromettre la pureté fonctionnelle. Pour qu'une lambda soit une fonction pure, elle doit éviter de modifier ou de dépendre d'un état mutable externe et se limiter à ses paramètres d'entrée et à des données immuables.

{{<inlineJava path="LambdaCaptureExample.java" lang="java">}}
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaCaptureExample {
    private int instanceVar = 100; // Variable d'instance
    private static int staticVar = 200; // Variable statique

    public void demonstrateLambdaCapture() {
        // Variable locale
        int localVar = 10; // Effectivement final
        // Liste mutable référencée par une variable locale
        List<Integer> mutableList = new ArrayList<>();

        // Lambda 1 : Capture d'une variable locale (pure)
        Function<Integer, Integer> pureLambda = x -> x + localVar;
        System.out.println("Lambda pure (5 + localVar) : " + pureLambda.apply(5)); // Affiche 15

        // Lambda 2 : Capture et modification d'une variable d'instance (non pure)
        Runnable instanceLambda = () -> {
            instanceVar += 50;
            System.out.println("Variable d'instance modifiée : " + instanceVar);
        };
        instanceLambda.run(); // Affiche 150

        // Lambda 3 : Capture et modification d'une variable statique (non pure)
        Runnable staticLambda = () -> {
            staticVar += 100;
            System.out.println("Variable statique modifiée : " + staticVar);
        };
        staticLambda.run(); // Affiche 300

        // Lambda 4 : Capture de 'this' pour accéder à une méthode d'instance
        Runnable thisLambda = () -> System.out.println("Accès via this, instanceVar : " + this.getInstanceVar());
        thisLambda.run(); // Affiche 150

        // Lambda 5 : Capture d'une liste mutable (non pure)
        Consumer<Integer> listLambda = x -> mutableList.add(x);
        listLambda.accept(42);
        System.out.println("Liste après ajout : " + mutableList); // Affiche [42]

        // Tentative de modification de localVar (invalide)
        // localVar = 20; // Erreur : localVar doit être final ou effectivement final
    }

    public int getInstanceVar() {
        return instanceVar;
    }

    public static void main(String[] args) {
        LambdaCaptureExample example = new LambdaCaptureExample();
        example.demonstrateLambdaCapture();
    }
}
{{</inlineJava>}}


Les lambdas sont utilisés à de multiples fins en Java. L’API Stream en Java pour effectuer un filtrage fonctionnel sur une liste de nombres. Considérons le prochain exemple. Le premier concept clé est la création d’une liste immuable avec Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8). Cette méthode transforme un tableau de nombres en une List fixe, qui ne peut pas être modifiée (par exemple, pas d’ajout ou de suppression d’éléments). Cette liste, nommée nombres, sert de point de départ pour le traitement. Ensuite, l’opération de filtrage repose sur l’API Stream, introduite en Java 8, qui permet de manipuler des collections de manière déclarative, en exprimant ce qu’on veut obtenir (ici, les nombres pairs) plutôt que comment le faire (comme avec une boucle traditionnelle). Ce paradigme fonctionnel rend le code plus concis et expressif. La méthode `filter()` crée un nouveau flux contenant uniquement les éléments satisfaisant une condition donnée, définie par une expression lambda qui retourne `true` ou `false`.

{{<inlineJava path="ExempleLambdaFiltre.java" lang="java">}}
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExempleLambdaFiltre {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> nombresPairs = nombres.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Nombres pairs : " + nombresPairs);
    }
}
{{</inlineJava>}}

Dans cet exemple, nous utilisons les méthodes `stream` et `collect`.


- *stream()* : La méthode `stream()` convertit une collection (comme une liste) en un flux (Stream), une séquence d’éléments permettant un traitement séquentiel ou parallèle. Les opérations sur un flux sont paresseuses (exécutées uniquement lorsque nécessaire) et ne modifient pas la collection d’origine.
- *collect()* : La méthode `collect()` rassemble les éléments d’un flux dans une structure de données (par exemple, une liste) après application des opérations. Elle utilise souvent un collecteur, comme `Collectors.toList()`, pour spécifier le type de résultat. C’est une opération terminale qui déclenche l’exécution du flux.


La méthode `map()` transforme chaque élément d’un flux en appliquant une fonction, produisant un nouveau flux de même longueur avec les valeurs transformées.


{{<inlineJava path="Main.java" lang="java">}}
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4);
        List<Integer> nombresCarres = nombres.stream()
                                            .map(x -> x * x)
                                            .collect(Collectors.toList());
        System.out.println(nombresCarres); // Sortie : [1, 4, 9, 16]
    }
}
{{</inlineJava>}}


La méthode `reduce()` combine les éléments d’un flux en une seule valeur en appliquant une fonction prenant deux arguments : le résultat accumulé et l’élément suivant.


{{<inlineJava path="Main.java" lang="java">}}
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4);
        int produit = nombres.stream()
                            .reduce(1, (x, y) -> x * y);
        System.out.println(produit); // Sortie : 24
    }
}
{{</inlineJava>}}

La méthode `forEach()` applique une action à chaque élément d’un flux. C’est une opération terminale, souvent utilisée pour afficher des résultats ou effectuer des effets secondaires.



{{<inlineJava path="Main.java" lang="java">}}
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4);
        nombres.stream()
               .forEach(x -> System.out.println(x));
        // Sortie :
        // 1
        // 2
        // 3
        // 4
    }
}
{{</inlineJava>}}


La méthode `flatMap()` transforme chaque élément d’un flux en un flux d’éléments, puis aplatit ces flux en un seul flux. Elle est utile pour gérer des collections imbriquées.


{{<inlineJava path="Main.java" lang="java">}}
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> listes = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        List<Integer> aplatie = listes.stream()
                                     .flatMap(liste -> liste.stream())
                                     .collect(Collectors.toList());
        System.out.println(aplatie); // Sortie : [1, 2, 3, 4]
    }
}
{{</inlineJava>}}


La méthode `distinct()` supprime les doublons d’un flux, renvoyant un flux avec des éléments uniques (basé sur la méthode `equals()`).


{{<inlineJava path="Main.java" lang="java">}}
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 2, 3, 3, 4);
        List<Integer> uniques = nombres.stream()
                                       .distinct()
                                       .collect(Collectors.toList());
        System.out.println(uniques); // Sortie : [1, 2, 3, 4]
    }
}
{{</inlineJava>}}


La méthode `limit()` restreint un flux aux `n` premiers éléments, utile pour traiter un sous-ensemble de données.


{{<inlineJava path="Main.java" lang="java">}}
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> premiers = nombres.stream()
                                       .limit(3)
                                       .collect(Collectors.toList());
        System.out.println(premiers); // Sortie : [1, 2, 3]
    }
}
{{</inlineJava>}}


La méthode `sorted()` trie les éléments d’un flux selon leur ordre naturel ou un comparateur personnalisé.


{{<inlineJava path="Main.java" lang="java">}}
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(4, 1, 3, 2);
        List<Integer> tries = nombres.stream()
                                    .sorted((a, b) -> b - a)
                                    .collect(Collectors.toList());
        System.out.println(tries); // Sortie : [4, 3, 2, 1]
    }
}
{{</inlineJava>}}


Les méthodes peuvent être enchaînées pour des opérations complexes. Par exemple, filtrer les nombres pairs, les mettre au carré, supprimer les doublons, limiter à deux éléments et trier en ordre décroissant :

{{<inlineJava path="Main.java" lang="java">}}
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6);
        List<Integer> resultat = nombres.stream()
                                       .filter(x -> x % 2 == 0)
                                       .map(x -> x * x)
                                       .distinct()
                                       .limit(2)
                                       .sorted((a, b) -> b - a)
                                       .collect(Collectors.toList());
        System.out.println(resultat); // Sortie : [16, 4]
    }
}
{{</inlineJava>}}

## Function, Predicate

En Java, les interfaces Function et Predicate font partie du package java.util.function, introduit avec Java 8 pour supporter la programmation fonctionnelle. L'interface `Function<T, R>` représente une fonction qui prend un argument de type `T` et produit un résultat de type `R`. Elle est utilisée pour transformer ou mapper des données, souvent dans des contextes comme les streams ou les lambdas. Par exemple, une Function peut convertir une chaîne en sa longueur ou transformer un objet en un autre type. Sa méthode principale est apply, qui exécute la transformation. Les Function peuvent être chaînées avec des méthodes comme andThen ou compose pour combiner des opérations. Ces interfaces rendent le code plus concis et déclaratif, facilitant les manipulations fonctionnelles dans un langage historiquement orienté objet.

En Java, la méthode `andThen` est une méthode de l'interface `Function<T, R>` qui permet de composer deux fonctions en séquence. Plus précisément, si vous avez une `Function<T, R>` (disons f1) et une autre `Function<R, V>` (disons f2), `f1.andThen(f2)` crée une nouvelle fonction qui applique d'abord f1 à l'entrée de type `T` pour produire un résultat de type `R`, puis applique f2 à ce résultat pour produire une sortie de type `V`. En d'autres termes, `andThen` définit une chaîne où le résultat de la première fonction devient l'entrée de la seconde.

{{<inlineJava path="ExempleAndThen.java" lang="java">}}
import java.util.function.Function;

public class ExempleAndThen {
    public static void main(String[] args) {
        // Première fonction : convertit une chaîne en sa longueur
        Function<String, Integer> longueurChaine = s -> s.length();
        
        // Deuxième fonction : multiplie un entier par 2
        Function<Integer, Integer> doubler = n -> n * 2;
        
        // Composition avec andThen : longueur, puis doubler
        Function<String, Integer> longueurPuisDoubler = longueurChaine.andThen(doubler);
        
        // Test
        String texte = "Bonjour";
        System.out.println("Résultat pour '" + texte + "' : " + longueurPuisDoubler.apply(texte));
    }
}
{{</inlineJava>}}


L'interface `Predicate<T>` représente une fonction qui prend un argument de type `T` et retourne un booléen, servant à tester une condition. Elle est couramment utilisée pour filtrer des données, notamment dans les streams avec la méthode filter. Sa méthode principale est test, qui évalue la condition. Les Predicate peuvent être combinés avec des méthodes comme and, or ou negate pour créer des conditions complexes. Par exemple, un Predicate peut vérifier si un nombre est pair ou si une chaîne dépasse une certaine longueur. Voici un exemple.

{{<inlineJava path="FunctionPredicateExemples.java" lang="java">}}
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionPredicateExemples {
    public static void main(String[] args) {
        // Exemple 1 : Function pour transformer une chaîne en sa longueur
        Function<String, Integer> longueurChaine = s -> s.length();
        System.out.println("Longueur de 'Bonjour' : " + longueurChaine.apply("Bonjour"));

        // Exemple 2 : Function avec chaînage (convertir en majuscules puis prendre la longueur)
        Function<String, String> enMajuscules = String::toUpperCase;
        Function<String, Integer> majusculesPuisLongueur = enMajuscules.andThen(longueurChaine);
        System.out.println("Longueur de 'hello' après majuscules : " + majusculesPuisLongueur.apply("hello"));

        // Exemple 3 : Predicate pour vérifier si un nombre est pair
        Predicate<Integer> estPair = n -> n % 2 == 0;
        System.out.println("10 est pair : " + estPair.test(10));
        System.out.println("7 est pair : " + estPair.test(7));

        // Exemple 4 : Predicate avec combinaison (pair ET supérieur à 5)
        Predicate<Integer> superieurACinq = n -> n > 5;
        Predicate<Integer> pairEtSuperieurACinq = estPair.and(superieurACinq);
        System.out.println("8 est pair et > 5 : " + pairEtSuperieurACinq.test(8));
        System.out.println("4 est pair et > 5 : " + pairEtSuperieurACinq.test(4));

        // Exemple 5 : Utilisation de Function et Predicate dans un stream
        List<String> mots = Arrays.asList("Java", "est", "puissant");
        List<Integer> longueursFiltrees = mots.stream()
                                             .filter(s -> s.length() > 3) // Predicate
                                             .map(longueurChaine)         // Function
                                             .collect(Collectors.toList());
        System.out.println("Longueurs des mots de plus de 3 lettres : " + longueursFiltrees);
    }
}
{{</inlineJava>}}



## Conclusion 

La programmation fonctionnelle est un paradigme de programmation qui met l'accent sur l'utilisation de fonctions pures, l'immutabilité des données et l'évitement des effets secondaires. Une fonction pure produit toujours le même résultat pour les mêmes entrées et n'altère pas l'état externe, ce qui facilite la prédiction et le débogage du code. En Java, bien que le langage soit principalement orienté objet, l'introduction de l'API Stream et des expressions lambda en Java 8 a permis d'intégrer des concepts fonctionnels. Ces outils permettent de manipuler des collections de données de manière déclarative, en exprimant ce que l'on veut accomplir (par exemple, filtrer ou transformer des données) plutôt que comment le faire étape par étape, comme dans une approche impérative. Cette approche améliore la lisibilité et la modularité du code, tout en favorisant des opérations comme le parallélisme sans effort explicite.

Le rôle des lambdas et de l'API Stream dans Java illustre bien l'influence de la programmation fonctionnelle. Les lambdas permettent de définir des fonctions anonymes concises, souvent utilisées pour implémenter des interfaces fonctionnelles (comme Predicate ou Function) dans des opérations comme le filtrage, le mappage ou le tri. Par exemple, dans une opération comme list.stream().filter(x -> x > 0).map(x -> x * 2).collect(Collectors.toList()), chaque étape est une transformation fonctionnelle qui ne modifie pas la liste initiale, respectant ainsi le principe d'immutabilité. L'API Stream prend en charge ces transformations en traitant les données comme un flux, où les opérations sont enchaînées et évaluées de manière paresseuse (lazy evaluation), ne s'exécutant qu'à la demande d'un résultat final. Cela réduit les calculs inutiles et permet une optimisation automatique, comme le traitement parallèle avec parallelStream().

Cependant, l'intégration de la programmation fonctionnelle en Java reste partielle, car le langage conserve une forte orientation objet. Les développeurs doivent être conscients des compromis : les lambdas et les streams rendent le code plus expressif, mais une utilisation excessive ou inappropriée peut nuire à la performance ou à la lisibilité, notamment dans des cas complexes. De plus, Java impose des contraintes, comme l'absence de fonctions de première classe (les lambdas sont des implémentations d'interfaces) et une gestion explicite de l'immutabilité. Malgré ces limitations, la programmation fonctionnelle en Java, via les streams et les lambdas, a transformé la manière dont les développeurs manipulent les données, encourageant des pratiques plus modernes et alignées sur les paradigmes fonctionnels tout en restant ancrées dans l'écosystème Java.

