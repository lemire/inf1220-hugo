---
title: "Java moderne"
weight: 75
---

# Java moderne

Le langage Java existe depuis des décennies. Pendant ce temps, les conventions
qu'utilisent les programmeurs ont évoluées. Nous vous encourageons à utiliser
un style plus moderne.



## Exemple 1

### Conventionel

{{<inlineJava path="Main.java" lang="java" >}}
class Point {
    private final double x;
    private final double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double x() {
        return x;
    }
    public double y() {
        return y;
    }
    public String toString() {
        return "Point[x=" + x + ", y=" + y + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Point p = new Point(3.0, 4.5);
        System.out.println(p);
    }
}
{{</inlineJava>}}

### Moderne


{{<inlineJava path="Main.java" lang="java" >}}
record Point(double x, double y) {}
void main() {
    Point p = new Point(3.0, 4.5);
    System.out.println(p);
}
{{</inlineJava>}}



## Exemple 2

### Conventionnel

{{<inlineJava path="Main.java" lang="java" >}}
public class Main {
    public static void main(String[] args) {
        String name = "Marie";
        int age = 37;
        String city = "Québec";
        String message = "Bonjour, je m'appelle " + name +
            ", j'ai " + age + " ans et j'habite à " +
            city + ".";
        System.out.println(message);
    }
}
{{</inlineJava>}}

### Moderne

{{<inlineJava path="Main.java" lang="java" >}}
void main() {
    String name = "Marie";
    int age = 37;
    String city = "Québec";
    String message = """
    Bonjour, je m'appelle %s,
    j'ai %d ans
    et j'habite à %s.
    """.formatted(name, age, city);
    System.out.println(message);
}
{{</inlineJava>}}

## Exemple 3

### Conventionnel
{{<inlineJava path="Main.java" lang="java" >}}
public class Main {
    public static void main(String[] args) {
        int jour = 3; // 1 = lundi, 2 = mardi, ..., 7 = dimanche
        String type;
        switch (jour) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                type = "Jour de semaine";
                break;
            case 6:
            case 7:
                type = "Fin de semaine";
                break;
            default:
                type = "Jour invalide";
                break;
        }
        System.out.println(type);
    }
}
{{</inlineJava>}}

### Moderne

{{<inlineJava path="Main.java" lang="java" >}}
void main() {
    int jour = 3;
    String type = switch (jour) {
        case 1, 2, 3, 4, 5 -> "Jour de semaine";
        case 6, 7           -> "Fin de semaine";
        default             -> "Jour invalide";
    };
    System.out.println(type);
}
{{</inlineJava>}}


## Exemple 4

### Conventionnel
{{<inlineJava path="Main.java" lang="java" >}}
class Livre {
    private final String titre;
    private final int annee;
    public Livre(String titre, int annee) {
        this.titre = titre;
        this.annee = annee;
    }
    public String getTitre() {
        return titre;
    }
    public int getAnnee() {
        return annee;
    }
    public String toString() {
        return "Livre{titre='" + titre + "', annee=" + annee + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Livre livre = new Livre("Le Petit Prince", 1943);
        System.out.println(livre);
    }
}
{{</inlineJava>}}


###  Moderne

{{<inlineJava path="Main.java" lang="java" >}}
record Livre(String titre, int annee) {}
void main() {
    Livre livre = new Livre("Le Petit Prince", 1943);
    System.out.println(livre);
}
{{</inlineJava>}}


### Exemple 5

### Conventionnel

{{<inlineJava path="Main.java" lang="java" >}}
public class Main {
    public static void main(String[] args) {
        String name = " Alice ";
        if (name != null) {
            if (!name.trim().isEmpty()) {
                System.out.println("Bonjour " + name.trim());
            } else {
                System.out.println("Bonjour inconnu");
            }
        } else {
            System.out.println("Bonjour inconnu");
        }
    }
}
{{</inlineJava>}}

(La méthode `trim()` retourne une chaîne après avoir éliminé les espaces avant et après la chaîne.)

### Moderne

{{<inlineJava path="Main.java" lang="java" >}}
void main() {
    var name = " Alice ";

    if (name == null || name.isBlank()) {
        System.out.println("Bonjour inconnu");
        return;
    }

    System.out.println("Bonjour " + name.strip());
}
{{</inlineJava>}}

(La méthode `isBlank()` vérifie si la chaîne est vide ou ne contient que des espaces.)


## Exemple 5

### Conventionel
{{<inlineJava path="Main.java" lang="java" >}}
public class Main {
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = square(a);
        System.out.println(b);
    }
}
{{</inlineJava>}}


### Moderne

{{<inlineJava path="Main.java" lang="java" >}}
int square(int x) {
    return x * x;
}
void main() {
    var a = 5;
    var b = square(a);

    System.out.println(b);
}
{{</inlineJava>}}

## Exemple 6

### Conventionel

{{<inlineJava path="Main.java" lang="java" >}}
public class Main {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        String message = "Bonjour, " + name + "! Vous avez " + age + " ans.";
        System.out.println(message);
    }
}
{{</inlineJava>}}

### Moderne
{{<inlineJava path="Main.java" lang="java" >}}
void main() {
    var name = "Alice";
    var age = 30;
    var message = "Bonjour, %s! Vous avez %d ans.".formatted(name, age);
    System.out.println(message);
}
{{</inlineJava>}}

## Exemple 7

### Conventionel
{{<inlineJava path="Main.java" lang="java" >}}
public class Main {
    public static void main(String[] args) {
        String json = "{\n"
            + "  \"nom\": \"Alice\",\n"
            + "  \"age\": 30,\n"
            + "  \"ville\": \"Montréal\"\n"
            + "}";
        System.out.println(json);
    }
}
{{</inlineJava>}}

### Moderne
{{<inlineJava path="Main.java" lang="java" >}}
void main() {
    var json = """
    {
    "nom": "Alice",
    "age": 30,
    "ville": "Montréal"
    }
    """;
    System.out.println(json);
}
{{</inlineJava>}}

## Exemple 8

### Conventionel
{{<inlineJava path="Main.java" lang="java" >}}
public class Main {
    public static void main(String[] args) {
        String jour = "lundi";
        String type;
        if (jour.equals("samedi") || jour.equals("dimanche")) {
            type = "fin de semaine";
        } else {
            type = "jour de semaine";
        }
        System.out.println(type);
    }
}
{{</inlineJava>}}

### Moderne
{{<inlineJava path="Main.java" lang="java" >}}
void main() {
    var jour = "lundi";
    var type = switch (jour) {
        case "samedi", "dimanche" -> "fin de semaine";
        default                   -> "jour de semaine";
    };
    System.out.println(type);
}
{{</inlineJava>}}
