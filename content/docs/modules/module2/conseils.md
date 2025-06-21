---
title: "Recommandations"
weight: 7
---

# Recommandations

Il est important d'écrire du code lisible et bien documenté. Il s'agit d'un compétence 
nécessaire pour développer du logiciel en pratique.

## Importance de la lisibilité du code en Java
La lisibilité du code est essentielle en Java pour faciliter la maintenance et la collaboration.
Un code lisible réduit les erreurs et permet à d'autres développeurs (ou à vous-même dans le
futur) de comprendre rapidement l'intention du programme. Pour y parvenir, il faut adopter
des conventions de nommage claires et commenter judicieusement. Les normes de codage, 
comme celles définies par Oracle ou Google, standardisent la structure du code, rendant 
les projets cohérents. Une variable bien nommée, comme `nombreEtudiants` au lieu de `n`, 
et des commentaires explicatifs améliorent la compréhension.

## Normes d'écriture de code en Java
Les normes de codage en Java, comme les *Java Coding Conventions* d'Oracle, définissent 
des règles précises. Les noms de classes commencent par une majuscule et suivent le 
style *CamelCase* (ex. : `GestionEtudiants`). Les méthodes et variables utilisent 
*lowerCamelCase* (ex. : `calculerMoyenne`). Les constantes sont en majuscules avec des 
underscores (ex. : `MAX_ETUDIANTS`). L'indentation est de 4 espaces, et les accolades 
`{}` suivent des conventions strictes, généralement placées à la fin de la ligne d'ouverture. 
Respecter ces normes garantit un code uniforme.

## Comment commenter son code en Java
En Java, les commentaires servent à expliquer le code sans affecter son exécution. 
Il existe trois types de commentaires :  
- **Commentaire sur une ligne** : `//` pour des explications courtes.  
- **Commentaire multi-lignes** : `/* */` pour des blocs plus longs.  
- **Javadoc** : `/** */` pour documenter classes, méthodes ou variables, générant 
une documentation automatique. Les commentaires doivent être concis, pertinents et éviter 
de paraphraser le code. Par exemple, un commentaire comme `// Incrémente i` est inutile 
si le code dit `i++`, mais `// Calcule la moyenne des notes pour chaque étudiant` est utile.

## 4. Exemple de bonne pratique : nommage et commentaires
Voici un exemple de code Java bien écrit, respectant les normes et utilisant des commentaires 
utiles :

```java {style=github}
public class GestionEtudiants {
    // Nombre maximum d'étudiants dans le système
    private static final int MAX_ETUDIANTS = 100;

    /**
     * Calcule la moyenne des notes d'un étudiant.
     * @param notes Tableau des notes de l'étudiant
     * @return La moyenne des notes, ou 0 si le tableau est vide
     */
    public double calculerMoyenne(double[] notes) {
        if (notes.length == 0) {
            return 0.0;
        }
        double somme = 0.0;
        for (double note : notes) {
            somme += note; // Ajoute chaque note à la somme
        }
        return somme / notes.length;
    }
}
```

Ce code utilise des noms clairs (`calculerMoyenne`, `notes`), une constante bien nommée, et des commentaires Javadoc explicatifs.

## Exemple de mauvaise pratique : code illisible
Voici un exemple de code mal écrit, à éviter :

```java {style=github}
public class C {
    int x = 100;
    double m(double[] a) {
        // calcul
        double s = 0;
        for(int i=0;i<a.length;i++) s+=a[i];
        return a.length>0?s/a.length:0;
    }
}
```

Ce code utilise des noms de variables cryptiques (`C`, `x`, `m`, `a`), manque de commentaires 
clairs, et est mal indenté, rendant sa compréhension difficile.

## Structure et indentation
Une bonne indentation améliore la lisibilité. En Java, chaque niveau de bloc (méthodes, boucles, 
conditions) est indenté avec 4 espaces. Les accolades doivent être alignées, et chaque 
instruction est sur une nouvelle ligne. Par exemple :

```java {style=github}
if (condition) {
    // Action si condition vraie
    faireQuelqueChose();
} else {
    // Action alternative
    faireAutreChose();
}
```

Un code non indenté ou avec des instructions sur une seule ligne (ex. : `if (x) y(); z();`) 
est difficile à suivre.

## Utilisation des commentaires Javadoc
Les commentaires Javadoc sont essentiels pour documenter les API publiques. Ils doivent décrire le but de la classe ou de la méthode, les paramètres, la valeur de retour, et les exceptions possibles. Par exemple :

```java {style=github}
/**
 * Représente un étudiant avec un nom et une liste de notes.
 */
public class Etudiant {
    /**
     * Ajoute une note à la liste de l'étudiant.
     * @param note La note à ajouter (entre 0 et 20)
     * @throws IllegalArgumentException si la note est invalide
     */
    public void ajouterNote(double note) {
        if (note < 0 || note > 20) {
            throw new IllegalArgumentException("Note invalide");
        }
        // Logique d'ajout
    }
}
```

Un Javadoc clair aide à générer une documentation professionnelle. 
Par contre, il faut utilise son bon jugement. Il est parfois plus clair
de produire un code concis sans commentaires.

Par ailleurs les commentaires ne devraient pas simplement décrire le code. Dans de 
tels cas, les commentaires ajoutent du bruit, comme dans l'exemple suivant.
Par exemple, un commentaire comme `// Vérifie si la note est négative avant if (note < 0)` 
est redondant. Voici un mauvais exemple :

```java {style=github}
/**
 * Définit le nom de l'étudiant.
 * @param n Le nom à définir
 */
// Met le nom dans la variable nom
public void setNom(String n) {
    nom = n; // Assigne n à nom
}
```

Dans cet exemple, les commentaires répètent l'évidence et encombrent le code. 
En revanche, un commentaire expliquant pourquoi une méthode est conçue d'une certaine manière
 (ex. : contraintes spécifiques ou cas d'utilisation) est pertinent. 
 L'objectif est de commenter de manière stratégique pour maximiser la clarté sans alourdir 
 le code.

Considérons un autre exemple.
Écrire `// Boucle sur les éléments` avant une boucle `for` est inutile, car le code est explicite. En revanche, expliquer *pourquoi* une boucle est utilisée est pertinent. Mauvais exemple :

```java {style=github}
// Boucle sur i
for (int i = 0; i < 10; i++) {
    // Incrémente x
    x++;
}
```

Voici un meilleur exemple.

```java {style=github}
// Parcourt les 10 premières entrées pour initialiser le compteur
for (int i = 0; i < 10; i++) {
    compteurInitial++;
}
```

Avec les versions récentes de Java, je recommande d'utiliser MarkDown pour les 
commentaires, comme dans cet exemple&nbsp;:

```java {style=github}
/**
 * # Exemple
 *
 * Ceci est un commentaire en  **Markdown**.
 *
 * - Partie 1
 * - Partie 2
 * 
 * [Ceci est un lien](http://www.exemple.com/)
 */
public class Example {
    // Class implementation
}
```

Markdown est un langage de balisage léger conçu pour formater du texte de manière simple et lisible, tout en permettant une conversion facile vers du HTML. Il a été créé en 2004 par John Gruber, avec l’aide d’Aaron Swartz, dans le but de rendre l’écriture de documents structurés accessible à tous, sans complexité technique.
John Gruber, blogueur et développeur américain, a développé Markdown pour répondre au besoin d’un format de texte qui soit à la fois facile à lire en brut et simple à convertir en HTML pour le web. Aaron Swartz, programmeur et militant de l’Internet, a contribué à l’implémentation du premier convertisseur Markdown. Le nom « Markdown » évoque l’idée de « réduire » (mark down) la complexité du balisage traditionnel.


Markdown permet de structurer un texte avec des titres, des listes, des liens, des images, des citations, du code, etc., en utilisant une syntaxe intuitive :

- **Titres :** Utilisation du symbole `#` (un ou plusieurs) en début de ligne.
- **Listes :** Listes à puces avec `-`, `*` ou `+`, listes numérotées avec des chiffres suivis d’un point.
- **Liens :** `[texte du lien](URL)`
- **Images :** `![texte alternatif](URL)`
- **Texte en gras :** `**gras**` ou `__gras__`
- **Texte en italique :** `*italique*` ou `_italique_`
- **Citations :** `> citation`

Markdown est largement utilisé pour la documentation, les fichiers README, les blogs, et de nombreux outils collaboratifs (GitHub, GitLab, forums, etc.). Sa simplicité et sa portabilité en font un standard de facto pour la rédaction technique et pédagogique.

Testez votre compréhension du MarkDown avec l'outil suivant.

{{<webapp path="markdown.html">}}



## Organisation des classes
Une classe Java bien organisée suit un ordre logique : constantes, attributs,
 constructeurs, méthodes publiques, puis méthodes privées. Chaque section est 
 séparée par des lignes vides ou des commentaires. Exemple :

```java {style=github}
public class CompteBancaire {
    // Constantes
    private static final double SOLDE_MINIMUM = 0.0;

    // Attributs
    private double solde;

    // Constructeurs
    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    // Méthodes publiques
    public void deposer(double montant) {
        solde += montant;
    }
}
```

Une organisation chaotique rend le code difficile à naviguer.

## Maintenir la cohérence dans un projet
Dans un projet Java, tous les développeurs doivent suivre les mêmes conventions
pour garantir l'uniformité. Utiliser des outils comme Checkstyle ou SonarLint aide
à détecter les violations des normes (mauvaise indentation, noms non conformes). 
Par exemple, si une équipe décide que les noms de variables doivent toujours inclure 
le type (ex. : `listeEtudiants` au lieu de `etudiants`), cette règle doit être appliquée 
partout. Une cohérence rigoureuse réduit les frictions lors des révisions de code et 
améliore la qualité globale du projet.

En conclusion, écrire du code Java lisible nécessite des noms explicites, 
une indentation soignée, des commentaires pertinents, et le respect des normes. 
En évitant les pièges comme les noms cryptiques ou les commentaires inutiles, 
vous produisez un code clair, maintenable et professionnel.