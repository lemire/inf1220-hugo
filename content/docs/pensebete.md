---
title: "Pense-bête java"
weight: 8
---

# Fondamentaux de Java

## Types de données Java

| Type             | Exemple                     | Description                           |
|------------------|-----------------------------|---------------------------------------|
| byte / short / int / long | `-123`, `10`                    | Entiers de différentes tailles        |
| float / double   | `235.13`                      | Nombres à virgule flottante           |
| char             | `'U'`                         | Caractère unique                      |
| boolean          | `true`, `false`                 | Valeurs logiques                      |
| String           | `"Salutations de la Terre"`   | Chaînes de caractères                 |

## Instructions Java

| Instruction       | Syntaxe                                                                 |
|-------------------|-------------------------------------------------------------------------|
| if                | if (expression) { instructions } else if (expression) { instructions } else { instructions } |
| while             | while (expression) { instructions }                                     |
| do-while          | do { instructions } while (expression);                                 |
| for               | for (int i = 0; i < max; ++i) { instructions }                          |
| for each          | for (var : collection) { instructions }                                 |
| switch            | switch (expression) { case valeur: instructions break; case valeur2: instructions break; default: instructions } |
| try-catch         | try { instructions } catch (ExceptionType e1) { instructions } catch (Exception e2) { instructions } finally { instructions } |

## Conversions de données Java

| Conversion            | Syntaxe                                   |
|-----------------------|-------------------------------------------|
| Chaîne vers nombre    | int i = Integer.parseInt(str);<br>double d = Double.parseDouble(str); |
| Tout type vers chaîne | String s = String.valueOf(valeur);        |
| Numérique             | int i = (int) expression numérique;       |

## Méthodes de chaîne Java

| Méthode             | Description                                      |
|---------------------|--------------------------------------------------|
| s.length()          | Retourne la longueur de s                        |
| s.charAt(i)         | Extrait le i-ème caractère                       |
| s.substring(début, fin) | Extrait une sous-chaîne de début à fin-1     |
| s.toUpperCase()     | Retourne une copie en majuscules                 |
| s.toLowerCase()     | Retourne une copie en minuscules                 |
| s.indexOf(x)        | Retourne l’index de la première occurrence de x  |
| s.replace(ancien, nouveau) | Remplace les occurrences                   |
| s.split(regex)      | Divise la chaîne en jetons                       |
| s.trim()            | Supprime les espaces autour                      |
| s.equals(s2)        | Vrai si s est égal à s2                          |
| s.compareTo(s2)     | 0 si égaux, + si s > s2, - si s < s2             |

## Méthodes java.util.ArrayList

| Méthode             | Description                                      |
|---------------------|--------------------------------------------------|
| l.add(élément)      | Ajoute un élément à la liste                     |
| l.add(index, élément) | Ajoute un élément à l’index spécifié           |
| l.get(i)            | Retourne le i-ème élément                        |
| l.size()            | Retourne le nombre d’éléments                     |
| l.remove(i)         | Supprime le i-ème élément                        |
| l.remove(élément)   | Supprime la première occurrence de l’élément     |
| l.set(i, val)       | Place val à la position i                        |
| l.clear()           | Supprime tous les éléments                       |
| l.contains(élément) | Vrai si l’élément est dans la liste              |

## Méthodes java.util.HashMap

| Méthode              | Description                                      |
|----------------------|--------------------------------------------------|
| m.put(clé, valeur)   | Insère une valeur avec une clé                   |
| m.get(clé)           | Récupère la valeur associée à la clé             |
| m.containsKey(clé)   | Vrai si la clé existe                            |
| m.containsValue(valeur) | Vrai si la valeur existe                      |
| m.remove(clé)        | Supprime l’entrée associée à la clé              |
| m.size()             | Retourne le nombre d’entrées                     |
| m.clear()            | Supprime toutes les entrées                      |
| m.keySet()           | Retourne un ensemble des clés                    |
| m.values()           | Retourne une collection des valeurs              |

## Java Hello World

```java
import java.util.Date;

public class Hello {
  public static void main(String[] args) {
    System.out.println("Bonjour, le monde !");
    Date maintenant = new Date();
    System.out.println("Heure : " + maintenant);
  }
}
```

- Enregistrer dans `Hello.java`
- Compiler : `javac Hello.java`
- Exécuter : `java Hello`

## Opérateurs arithmétiques Java

| Opérateur  | Description          |
|------------|----------------------|
| x + y      | Addition             |
| x - y      | Soustraction         |
| x * y      | Multiplication       |
| x / y      | Division             |
| x % y      | Modulo               |
| ++x / x++  | Incrémentation       |
| --x / x--  | Décrémentation       |

*Raccourcis d’affectation : x op= y (ex. x += 1 incrémente x)*

## Opérateurs de comparaison Java

| Opérateur  | Description               |
|------------|---------------------------|
| x < y      | Inférieur                 |
| x <= y     | Inférieur ou égal         |
| x > y      | Supérieur                 |
| x >= y     | Supérieur ou égal         |
| x == y     | Égal                      |
| x != y     | Différent                 |

## Opérateurs booléens Java

| Opérateur  | Description  |
|------------|--------------|
| !x         | Non          |
| x && y     | Et           |
| x || y     | Ou           |

## Classes et objets

### Déclaration d’une classe
```java
public class NomClasse {
  // Attributs
  type attribut;

  // Constructeur
  public NomClasse(type param) {
    this.attribut = param;
  }

  // Méthode
  public type nomMéthode(type param) {
    return valeur;
  }
}
```

### Instanciation
```java
NomClasse objet = new NomClasse(param);
```

### Accès aux membres
- Attributs : `objet.attribut`
- Méthodes : `objet.nomMéthode(param)`

## Modificateurs d’accès

| Modificateur | Description                                      |
|--------------|--------------------------------------------------|
| public       | Accessible partout                               |
| protected    | Accessible dans le même paquet et sous-classes   |
| default      | Accessible dans le même paquet (si non spécifié) |
| private      | Accessible uniquement dans la classe             |

## Gestion des exceptions

### Lancer une exception
```java
throw new TypeException("Message d’erreur");
```

### Types courants d’exceptions
| Exception                | Description                              |
|--------------------------|------------------------------------------|
| NullPointerException     | Accès à un objet null                    |
| ArrayIndexOutOfBoundsException | Index hors limites d’un tableau   |
| IOException              | Erreur d’entrée/sortie                   |
| IllegalArgumentException | Argument invalide passé à une méthode    |

## Entrées/sorties simples

### Lecture depuis la console
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
String ligne = scanner.nextLine(); // Lit une ligne
int nombre = scanner.nextInt();   // Lit un entier
scanner.close();
```

### Écriture dans la console
```java
System.out.println("Texte avec saut de ligne");
System.out.print("Texte sans saut de ligne");
System.out.printf("Format : %s, %d", chaîne, entier);
```

## Boucles et tableaux

### Déclaration d’un tableau
```java
type[] tableau = new type[taille];
type[] tableau = {valeur1, valeur2, valeur3};
```

### Parcourir un tableau
```java
for (int i = 0; i < tableau.length; i++) {
  System.out.println(tableau[i]);
}
// Ou avec for-each
for (type élément : tableau) {
  System.out.println(élément);
}
```

## Bonnes pratiques

- Utiliser des noms de variables et de méthodes explicites.
- Commenter le code pour clarifier les intentions complexes.
- Fermer les ressources (comme Scanner ou fichiers) après usage.
- Préférer les collections (ArrayList, HashMap) aux tableaux pour les données dynamiques.
- Gérer les exceptions de manière appropriée pour éviter les plantages.
