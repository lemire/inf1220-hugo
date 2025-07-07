---
title: "Les chaînes de caractères (String)"
weight: 38
---

# String

En Java, le type <code>String</code> représente une séquence de caractères. Il est très utilisé pour manipuler du texte : noms, messages, fichiers, etc. Une particularité essentielle à comprendre est que les objets de type <code>String</code> sont <strong>immuables</strong> : une fois créés, ils ne peuvent pas être modifiés. Toute opération qui semble modifier une chaîne (comme la concaténation, le remplacement ou la suppression de caractères) crée en réalité un nouvel objet <code>String</code> en mémoire, sans changer l’original.

Par exemple :

```java  {style=github}
String s = "Bonjour";
s = s + " le monde"; // Crée un nouvel objet String
```

Ici, la chaîne "Bonjour" n’est pas modifiée : une nouvelle chaîne "Bonjour le monde" est créée et la variable <code>s</code> pointe vers ce nouvel objet. L’ancienne chaîne reste inchangée (et sera éventuellement libérée par le ramasse-miettes).

Cette immuabilité rend les <code>String</code> sûres et efficaces pour le partage, mais peut entraîner des problèmes de performance si on fait beaucoup de modifications : dans ce cas, il vaut mieux utiliser <code>StringBuilder</code>.


En Java, les chaînes de caractères (<code>String</code>) sont représentées en mémoire selon l’encodage UTF-16. Cela signifie que chaque élément du tableau interne d’une chaîne est un « code unit » de 16 bits (un <code>char</code> Java), mais tous les caractères Unicode ne tiennent pas forcément dans un seul <code>char</code>.

L’UTF-16 est un encodage qui permet de représenter tous les caractères Unicode. La plupart des caractères courants (latin, accentués, etc.) sont codés sur un seul <code>char</code> (16 bits), mais certains caractères spéciaux ou emojis, appelés « supplémentaires », nécessitent deux <code>char</code> consécutifs (appelés une paire de substitution ou surrogate pair).

La méthode <code>charAt(int index)</code> retourne le <code>char</code> à la position donnée dans la chaîne, mais ce <code>char</code> ne correspond pas toujours à un caractère complet pour l’utilisateur. Si la chaîne contient un caractère supplémentaire (hors du plan multilingue de base), <code>charAt</code> peut retourner seulement une partie de ce caractère (un des deux éléments de la paire de substitution).

Pour manipuler correctement les caractères Unicode, il faut utiliser les méthodes <code>codePointAt</code>, <code>codePoints()</code> ou les classes de l’API <code>Character</code>, qui tiennent compte des paires de substitution et permettent de traiter chaque caractère Unicode comme une entité logique.

```java  {style=github}
String s = "A😊B";
System.out.println(s.length());      // Affiche 4 (car 😊 occupe deux char)
System.out.println(s.charAt(1));     // Affiche un char de la paire surrogate, pas le smiley complet
System.out.println(s.codePointAt(1));// Affiche le code Unicode complet du smiley
```

Ainsi, il faut être vigilant lors du traitement de chaînes contenant des emojis ou des caractères spéciaux, car la longueur d’une chaîne (length) et l’accès par <code>charAt</code> ne correspondent pas toujours au nombre réel de caractères.


Utilisez l'application suivante pour explorer la représentation des chaînes de caractères en format UTF-16. Vous pouvez taper des caractères et voir comment la chaîne de caractère est représentée en mémoire.

{{< webapp path="unicode.html" >}}


Voici un exemple en Java qui illustre la plupart des propriétés et méthodes de la classe String.

{{<inlineJava path="ExempleString.java" lang="java">}}
// Programme pour démontrer les principales méthodes de la classe String en Java
public class ExempleString {
    public static void main(String[] args) {
        // Déclaration et initialisation de chaînes
        String texte = "Bonjour le Monde !";
        String autreTexte = "bonjour le monde !";
        String vide = "";
        String avecEspaces = "   Texte avec espaces   ";

        // 1. Longueur de la chaîne
        // La méthode length() retourne le nombre de caractères
        System.out.println("Longueur de texte : " + texte.length());

        // 2. Vérification si la chaîne est vide
        // isEmpty() retourne true si la chaîne est vide
        System.out.println("La chaîne vide est-elle vide ? " + vide.isEmpty());
        System.out.println("La chaîne texte est-elle vide ? " + texte.isEmpty());

        // 3. Conversion en majuscules et minuscules
        // toUpperCase() et toLowerCase() pour changer la casse
        System.out.println("Texte en majuscules : " + texte.toUpperCase());
        System.out.println("Texte en minuscules : " + texte.toLowerCase());

        // 4. Comparaison de chaînes
        // equals() compare le contenu, equalsIgnoreCase() ignore la casse
        System.out.println("Les chaînes sont-elles égales ? " + texte.equals(autreTexte));
        System.out.println("Égalité en ignorant la casse : " + texte.equalsIgnoreCase(autreTexte));

        // 5. Recherche dans la chaîne
        // contains() vérifie la présence d'une sous-chaîne
        // indexOf() retourne la position de la première occurrence
        System.out.println("Contient 'Monde' ? " + texte.contains("Monde"));
        System.out.println("Position de 'le' : " + texte.indexOf("le"));
        System.out.println("Dernière position de 'o' : " + texte.lastIndexOf("o"));

        // 6. Extraction de sous-chaînes
        // substring() extrait une partie de la chaîne
        System.out.println("Sous-chaîne (0,7) : " + texte.substring(0, 7));
        System.out.println("Sous-chaîne à partir de 8 : " + texte.substring(8));

        // 7. Remplacement
        // replace() et replaceAll() pour modifier le contenu
        System.out.println("Remplacer 'Monde' par 'Univers' : " + texte.replace("Monde", "Univers"));
        System.out.println("Remplacer espaces par '_' : " + texte.replaceAll("\\s", "_"));

        // 8. Suppression des espaces
        // trim() supprime les espaces au début et à la fin
        // strip() est similaire mais gère plus de types d'espaces (Java 11+)
        System.out.println("Après trim : '" + avecEspaces.trim() + "'");
        System.out.println("Après strip : '" + avecEspaces.strip() + "'");

        // 9. Concaténation
        // concat() ou l'opérateur + pour joindre des chaînes
        String nouvelleChaine = texte.concat(" Bienvenue !");
        System.out.println("Après concaténation : " + nouvelleChaine);

        // 10. Vérification du début et de la fin
        // startsWith() et endsWith() pour vérifier les préfixes/suffixes
        System.out.println("Commence par 'Bon' ? " + texte.startsWith("Bon"));
        System.out.println("Finit par '!' ? " + texte.endsWith("!"));

        // 11. Conversion en tableau de caractères
        // toCharArray() convertit la chaîne en tableau de char
        char[] caracteres = texte.toCharArray();
        System.out.println("Premier caractère : " + caracteres[0]);

        // 12. Formatage
        // String.format() pour créer des chaînes formatées
        String formate = String.format("Texte: %s, Longueur: %d", texte, texte.length());
        System.out.println("Chaîne formatée : " + formate);

        // 13. Division de la chaîne
        // split() divise la chaîne en un tableau selon un délimiteur
        String[] mots = texte.split("\\s+");
        System.out.println("Nombre de mots : " + mots.length);
        for (String mot : mots) {
            System.out.println("Mot : " + mot);
        }

        // 14. Vérification des caractères
        // charAt() accède à un caractère à une position donnée
        System.out.println("Caractère à l'index 2 : " + texte.charAt(2));

        // 15. Comparaison lexicographique
        // compareTo() compare deux chaînes lexicographiquement
        System.out.println("Comparaison avec autreTexte : " + texte.compareTo(autreTexte));
        System.out.println("Comparaison en ignorant la casse : " + texte.compareToIgnoreCase(autreTexte));
    }
}
{{</inlineJava>}}


La méthode split de la classe String en Java est utilisée pour diviser une chaîne en un tableau de sous-chaînes en fonction d’un délimiteur spécifié, qui peut être une chaîne simple ou une *expression régulière*. Par exemple, `split("\\s+")` divise une chaîne sur un ou plusieurs espaces, tandis que `split(",")` utilise une virgule comme séparateur. L'expression `\\s+` signifie 'un ou plusieurs espaces.
Nous pourrions utiliser `split(";")` pour diviser sur un point-virgule.

{{% hint info %}}
Dans ce cours, nous ne présenterons pas la notion d'expression régulière davantage. Elle est traitée dans d'autres cours, notamment au sein du cours
INF 6460 Recherche et filtrage d'informations.
{{% /hint %}}


## StringBuilder

Le type <code>StringBuilder</code> en Java permet de construire et de modifier efficacement des chaînes de caractères. Contrairement à la classe <code>String</code>, qui est immuable (chaque modification crée un nouvel objet), <code>StringBuilder</code> permet d’ajouter, de modifier ou de supprimer des caractères sans créer de nouveaux objets à chaque opération. Cela le rend particulièrement utile lorsqu’on doit faire de nombreuses modifications ou concaténations de chaînes, par exemple lors de la lecture d’un fichier ou la construction dynamique d’un texte.

L’utilisation de <code>StringBuilder</code> améliore considérablement les performances, surtout dans les boucles : concaténer des chaînes avec <code>+</code> dans une boucle crée à chaque fois une nouvelle chaîne, ce qui consomme beaucoup de mémoire et ralentit le programme. <code>StringBuilder</code> évite ce problème en travaillant sur une seule zone mémoire.

Exemple :

```java  {style=github}
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 5; i++) {
    sb.append("Ligne ").append(i).append("\n");
}
String resultat = sb.toString();
System.out.println(resultat);
```

Dans cet exemple, toutes les lignes sont ajoutées efficacement à la même chaîne. Pour des opérations répétées ou sur de gros volumes de texte, <code>StringBuilder</code> est donc le choix recommandé pour de bonnes performances.


Voici un exemple en Java qui illustre la plupart des propriétés et méthodes de la classe StringBuilder.

{{<inlineJava path="ExempleStringBuilder.java" lang="java">}}
ublic class ExempleStringBuilder {
    public static void main(String[] args) {
        // Initialisation d'un StringBuilder avec une chaîne initiale
        StringBuilder sb = new StringBuilder("Bonjour le Monde !");
        StringBuilder vide = new StringBuilder();
        StringBuilder avecEspaces = new StringBuilder("   Texte avec espaces   ");

        // 1. Longueur et capacité
        // length() retourne le nombre de caractères, capacity() la taille du buffer
        System.out.println("Longueur de sb : " + sb.length());
        System.out.println("Capacité de sb : " + sb.capacity());

        // 2. Ajout de contenu
        // append() ajoute du contenu à la fin
        sb.append(" Bienvenue !");
        System.out.println("Après append : " + sb);

        // 3. Insertion
        // insert() insère du contenu à une position donnée
        sb.insert(7, "cher ");
        System.out.println("Après insert : " + sb);

        // 4. Remplacement
        // replace() remplace une portion de la chaîne
        sb.replace(8, 12, "monde");
        System.out.println("Après replace : " + sb);

        // 5. Suppression
        // delete() supprime une portion, deleteCharAt() supprime un caractère
        sb.delete(0, 7);
        System.out.println("Après delete : " + sb);
        sb.deleteCharAt(sb.length() - 1);
        System.out.println("Après deleteCharAt : " + sb);

        // 6. Inversion
        // reverse() inverse l'ordre des caractères
        sb.reverse();
        System.out.println("Après reverse : " + sb);
        sb.reverse(); // Remettre dans l'ordre initial
        System.out.println("Après second reverse : " + sb);

        // 7. Accès aux caractères
        // charAt() accède à un caractère, setCharAt() modifie un caractère
        System.out.println("Caractère à l'index 0 : " + sb.charAt(0));
        sb.setCharAt(0, 'C');
        System.out.println("Après setCharAt : " + sb);

        // 8. Extraction de sous-chaîne
        // substring() extrait une portion sans modifier l'original
        System.out.println("Sous-chaîne (0,5) : " + sb.substring(0, 5));
        System.out.println("Sous-chaîne à partir de 6 : " + sb.substring(6));

        // 9. Modification de la longueur
        // setLength() ajuste la longueur (tronque ou ajoute des caractères nuls)
        sb.setLength(10);
        System.out.println("Après setLength(10) : " + sb);
        sb.setLength(20); // Ajoute des caractères nuls
        System.out.println("Après setLength(20) : " + sb);

        // 10. Suppression des espaces
        // trimToSize() réduit la capacité au minimum nécessaire
        avecEspaces.trimToSize();
        System.out.println("Capacité après trimToSize : " + avecEspaces.capacity());

        // 11. Conversion en String
        // toString() convertit le StringBuilder en String
        String resultat = sb.toString();
        System.out.println("Conversion en String : " + resultat);

        // 12. Vérification si vide
        // Un StringBuilder est considéré vide si length() == 0
        System.out.println("Le StringBuilder vide est-il vide ? " + (vide.length() == 0));
        System.out.println("Le StringBuilder sb est-il vide ? " + (sb.length() == 0));

        // 13. Index de sous-chaîne
        // indexOf() et lastIndexOf() recherchent une sous-chaîne
        System.out.println("Position de 'monde' : " + sb.indexOf("monde"));
        System.out.println("Dernière position de 'e' : " + sb.lastIndexOf("e"));

        // 14. Ajout de différents types de données
        // append() peut ajouter des types variés (int, double, etc.)
        StringBuilder sb2 = new StringBuilder("Valeur : ");
        sb2.append(42).append(" et ").append(3.14);
        System.out.println("Ajout de types variés : " + sb2);

        // 15. Réinitialisation
        // setLength(0) vide le contenu
        sb.setLength(0);
        System.out.println("Après réinitialisation : " + sb);
    }
}
{{</inlineJava>}}


## CharSequence et subSequence()

L’interface <code>CharSequence</code> représente une séquence de caractères lisible : elle est implémentée par plusieurs classes Java comme <code>String</code>, <code>StringBuilder</code> et <code>StringBuffer</code>. Cela permet d’écrire des méthodes qui acceptent n’importe quel type de séquence de caractères, et pas seulement des chaînes immuables.

La méthode <code>subSequence(int start, int end)</code> permet d’obtenir une portion (sous-séquence) de la séquence de caractères, allant de l’indice <code>start</code> (inclus) à <code>end</code> (exclu). C’est utile pour extraire une partie d’un texte sans créer une nouvelle chaîne si ce n’est pas nécessaire.

Exemple avec String :

```java  {style=github}
String texte = "Bonjour le monde";
CharSequence sousTexte = texte.subSequence(8, 14); // "le mon"
System.out.println(sousTexte);
```

Exemple avec StringBuilder :

```java  {style=github}
StringBuilder sb = new StringBuilder("abcdefg");
CharSequence sousSeq = sb.subSequence(2, 5); // "cde"
System.out.println(sousSeq);
```

Utiliser <code>CharSequence</code> rend le code plus flexible : on peut manipuler des chaînes, des buffers ou des builders de la même façon, et extraire facilement des sous-parties avec <code>subSequence()</code>. La méthode `subSequence` évite de faire une copie inutile.




## Allocation de mémoire et ramasse-miettes

{{% hint info %}}

Comprendre l'allocation de mémoire et le ramasse-miettes n'est pas obligatoire dans ce cours.

{{% /hint %}}

Lorsque vous créez un objet  en Java, la mémoire nécessaire est automatiquement allouée dans une zone appelée le « tas » (heap). Contrairement à certains langages comme C ou C++, il n’est pas nécessaire de libérer explicitement la mémoire des objets qui ne sont plus utilisés. Java intègre un mécanisme appelé ramasse-miettes (ou garbage collector) qui se charge de détecter et de libérer automatiquement la mémoire occupée par les objets devenus inaccessibles. Il partage
cette caractéristique avec d'autres langages comme C#, JavaScript et Python.

Le ramasse-miettes fonctionne en arrière-plan : il identifie les objets qui ne sont plus référencés par aucune variable ou structure de données, puis récupère la mémoire correspondante pour la rendre disponible à de nouveaux objets. Cela simplifie la gestion de la mémoire et réduit les risques de fuites de mémoire (memory leaks) ou d’erreurs de libération (comme les double free en C).

Cependant, il est important de comprendre que la libération de la mémoire n’est pas instantanée : le ramasse-miettes intervient à des moments choisis par la machine virtuelle Java (JVM), ce qui peut parfois entraîner de légères pauses dans l’exécution du programme. Pour la plupart des applications, ce fonctionnement automatique est un avantage, car il permet de se concentrer sur la logique du programme sans se soucier de la gestion manuelle de la mémoire.

L’allocation de mémoire en Java est automatique et la libération est assurée par le ramasse-miettes, ce qui contribue à la robustesse et à la sécurité des programmes Java.

Par contre, le ramasse-miettes a des inconvénients : il peut provoquer des pauses imprévisibles dans l’exécution du programme, appelées «&nbsp;pauses de collecte&nbsp;», lorsque la JVM décide de libérer la mémoire. Ces pauses sont généralement courtes, mais peuvent devenir perceptibles dans des applications nécessitant une grande réactivité (jeux, systèmes temps réel, etc.). De plus, le développeur a moins de contrôle sur le moment précis où la mémoire est libérée, ce qui peut compliquer l’optimisation des performances dans certains cas particuliers. Enfin, le ramasse-miettes consomme lui-même des ressources processeur, ce qui peut avoir un effet sur l’efficacité globale du programme.

Malgré l'existence du ramasse-miettes, il faut donc tenter de minimiser l'allocation de mémoire.
Il faut éviter de créer des objets temporaires quand on peut réutiliser un objet déjà alloué.

Considérons l'exemple suivant.

{{<inlineJava path="ExempleAllocationMemoire.java" lang="java">}}

public class ExempleAllocationMemoire {
    public static void main(String[] args) {
        // Approche 1 : Création d'objets temporaires avec String
        long debut = System.nanoTime();
        String resultat = "";
        for (int i = 0; i < 10000; i++) {
            resultat += "itération " + i + "; ";
        }
        long fin = System.nanoTime();
        System.out.println("Temps avec String (ns) : " + (fin - debut));

        // Approche 2 : Réutilisation d'un objet avec StringBuilder
        debut = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builder.append("itération ").append(i).append("; ");
        }
        String resultatFinal = builder.toString();
        fin = System.nanoTime();
        System.out.println("Temps avec StringBuilder (ns) : " + (fin - debut));
    }
}
{{</inlineJava>}}


- Approche 1 (String) : À chaque itération, l’opérateur += crée un nouvel objet String, car les objets String sont immuables en Java. Cela génère de nombreux objets temporaires qui doivent être gérés par le ramasse-miettes, augmentant la charge mémoire et le temps d’exécution.
- Approche 2 (StringBuilder) : En utilisant StringBuilder, un seul objet est créé et modifié à chaque itération. Cela réduit considérablement le nombre d’allocations mémoire et la charge sur le ramasse-miettes, ce qui améliore les performances.





## Vidéos


{{< youtube id="wvQQ5263pvI" >}}

{{< youtube id="EphmNLfZ2hM" >}}