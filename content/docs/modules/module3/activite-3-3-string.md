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
Nous donnons plus loin un [aperçu des expressions régulières](#les-expressions-régulières).
La notion n'est toutefois pas approfondie dans ce cours.
{{% /hint %}}


## Les principales méthodes de la classe String

La classe <code>String</code> offre plusieurs dizaines de méthodes. Les tableaux qui suivent
décrivent les plus courantes et indiquent, lorsque la question se pose, leur *complexité
algorithmique*, c'est-à-dire l'ordre de grandeur du nombre d'opérations effectuées.

Dans tout ce qui suit :

- \(n\) désigne la longueur de la chaîne sur laquelle la méthode est appelée ;
- \(m\) désigne la longueur de la chaîne passée en argument, lorsqu'il y en a une.

Rappelons qu'intuitivement \(O(1)\) signifie « un temps constant, indépendant de la taille de la chaîne »,
et que \(O(n)\) signifie « un temps proportionnel à la longueur de la chaîne ».

### Accéder au contenu

| Méthode | Description | Complexité |
| --- | --- | --- |
| `length()` | Nombre de `char` (unités de code UTF-16) de la chaîne. La valeur est stockée dans l'objet : elle n'est pas recalculée. | \(O(1)\) |
| `isEmpty()` | Vrai si la chaîne ne contient aucun caractère. Équivaut à `length() == 0`. | \(O(1)\) |
| `isBlank()` | Vrai si la chaîne est vide ou ne contient que des espaces. Il faut parcourir la chaîne. | \(O(n)\) |
| `charAt(int i)` | Le `char` à la position `i`. Un accès direct dans un tableau. Attention : ce n'est pas toujours un caractère complet (voir les paires de substitution). | \(O(1)\) |
| `codePointAt(int i)` | Le point de code Unicode complet commençant à la position `i`. | \(O(1)\) |
| `toCharArray()` | Copie la chaîne dans un nouveau tableau de `char`. | \(O(n)\) |
| `chars()`, `codePoints()` | Produisent un flux (`IntStream`) des unités de code ou des points de code. Créer le flux est immédiat ; le parcourir coûte \(O(n)\). | \(O(1)\) puis \(O(n)\) |
| `hashCode()` | Valeur de hachage utilisée par `HashMap` et `HashSet`. Elle est calculée une seule fois puis conservée dans l'objet. | \(O(n)\) au premier appel, \(O(1)\) ensuite |

### Comparer

| Méthode | Description | Complexité |
| --- | --- | --- |
| `equals(Object o)` | Compare le **contenu** de deux chaînes. C'est la bonne façon de comparer des chaînes : l'opérateur `==` compare les références, pas le texte. Si les longueurs diffèrent, la réponse est immédiate. | \(O(n)\) au pire |
| `equalsIgnoreCase(String s)` | Comme `equals`, mais sans tenir compte de la casse. | \(O(n)\) |
| `compareTo(String s)` | Comparaison lexicographique (ordre du dictionnaire selon les valeurs Unicode). Retourne un entier négatif, nul ou positif. Utilisée pour trier. | \(O(\min(n,m))\) |
| `compareToIgnoreCase(String s)` | Comme `compareTo`, sans tenir compte de la casse. | \(O(\min(n,m))\) |
| `startsWith(String p)`, `endsWith(String p)` | Vrai si la chaîne commence (ou se termine) par `p`. Une seule comparaison alignée : pas de recherche. | \(O(m)\) |
| `contentEquals(CharSequence cs)` | Compare le contenu avec n'importe quelle séquence de caractères, par exemple un `StringBuilder`. | \(O(n)\) |

### Rechercher

| Méthode | Description | Complexité |
| --- | --- | --- |
| `indexOf(int c)`, `lastIndexOf(int c)` | Position de la première (ou dernière) occurrence d'un caractère, ou `-1`. Un simple balayage. | \(O(n)\) |
| `indexOf(String s)`, `lastIndexOf(String s)` | Position de la première (ou dernière) occurrence d'une sous-chaîne, ou `-1`.  | \(O(n\,m)\)  |
| `indexOf(String s, int depart)` | Comme ci-dessus, mais la recherche commence à la position `depart`. Pratique pour énumérer toutes les occurrences. | idem |
| `contains(CharSequence cs)` | Vrai si la sous-chaîne apparaît. Équivaut à `indexOf(cs.toString()) >= 0` et hérite donc de son coût. | \(O(n\,m)\)  |

### Transformer

Toutes ces méthodes *retournent une nouvelle chaîne* : la chaîne d'origine n'est jamais modifiée.

| Méthode | Description | Complexité |
| --- | --- | --- |
| `substring(int a)`, `substring(int a, int b)` | Extrait les caractères de `a` (inclus) à `b` (exclu). Le contenu est *copié* : le coût est proportionnel à la longueur extraite. | \(O(b-a)\) |
| `concat(String s)` et l'opérateur `+` | Assemble deux chaînes dans une nouvelle chaîne. Concaténer dans une boucle est donc coûteux : préférez `StringBuilder`. | \(O(n+m)\) |
| `replace(char a, char b)` | Remplace toutes les occurrences d'un caractère par un autre. Un seul balayage. | \(O(n)\) |
| `replace(CharSequence a, CharSequence b)` | Remplace toutes les occurrences d'une sous-chaîne. Répète une recherche de sous-chaîne. | \(O(n\,m)\) au pire |
| `toUpperCase()`, `toLowerCase()` | Changement de casse, selon les règles de la langue courante (`Locale`). | \(O(n)\) |
| `trim()` | Retire les caractères de code inférieur ou égal à l'espace au début et à la fin. | \(O(n)\) |
| `strip()`, `stripLeading()`, `stripTrailing()` | Comme `trim()`, mais en reconnaissant tous les espaces Unicode. À privilégier (Java 11+). | \(O(n)\) |
| `repeat(int k)` | Répète la chaîne `k` fois. | \(O(n\,k)\) |
| `intern()` | Retourne l'exemplaire canonique de la chaîne, conservé dans une table interne de la JVM. À utiliser avec parcimonie. | \(O(n)\) |

### Découper et assembler

| Méthode | Description | Complexité |
| --- | --- | --- |
| `split(String regex)` | Découpe la chaîne selon une expression régulière et retourne un tableau. Java optimise le cas d'un séparateur d'un seul caractère ordinaire. | \(O(n)\) en pratique |
| `lines()` | Produit un flux des lignes de la chaîne. | \(O(n)\) au parcours |
| `String.join(sep, parties)` | Assemble des chaînes en les séparant par `sep`. Une seule allocation. | \(O(L)\), où \(L\) est la longueur totale |
| `String.format(modele, ...)` | Construit une chaîne formatée (`%s`, `%d`, `%.2f`, etc.). | \(O(L)\) |
| `String.valueOf(x)` | Convertit une valeur quelconque en chaîne. | dépend de `x` |

{{% hint info %}}
Dans ce cours, il n'est pas nécessaire de mémoriser ces complexités. Retenez surtout deux
choses : l'accès à un caractère (`charAt`) est immédiat, alors que presque toute autre
opération parcourt la chaîne au complet. C'est pourquoi il faut éviter de reconstruire
des chaînes à répétition à l'intérieur d'une boucle.
{{% /hint %}}


## La recherche de sous-chaîne : `indexOf`

La méthode `indexOf(String)` répond à une question simple : à quelle position le motif
apparaît-il dans le texte ? L'approche la plus directe consiste à essayer chaque position
possible, l'une après l'autre :

```java  {style=github}
// Recherche naïve : à ne pas utiliser en pratique, mais facile à comprendre.
static int rechercheNaive(String texte, String motif) {
    int n = texte.length(), m = motif.length();
    for (int position = 0; position + m <= n; position++) {
        int j = 0;
        while (j < m && texte.charAt(position + j) == motif.charAt(j)) {
            j++;
        }
        if (j == m) return position;   // le motif entier a concordé
    }
    return -1;
}
```

Sur du texte ordinaire, cette boucle s'arrête presque toujours dès la première lettre :
le coût est alors d'environ \(n\) comparaisons. Mais si le texte et le motif se
ressemblent beaucoup, chaque essai peut aller très loin avant d'échouer. Avec un texte
formé d'un million de `a` et un motif formé de 4096 `a` suivis d'un seul `b`, chacun des
\(n\) essais compare 4096 caractères avant d'échouer : on obtient \(n\,m\) comparaisons,
soit un comportement *quadratique*.

On pourrait croire que la bibliothèque standard de Java échappe à ce problème. Ce n'est
pas le cas : la mise en œuvre de `String.indexOf` est très optimisée. Mais elle a tout 
de même une complexité de \(n\,m\) comparaisons dans le pire des cas. Voir à ce sujet
[Java's String.indexOf can be slow (quadratic)](https://lemire.me/blog/2026/08/22/javas-string-indexof-can-be-slow-quadratic/).


{{% hint warning %}}
Conséquence pratique : si votre programme cherche dans un texte un motif fourni par
l'utilisateur, un motif très long peut suffire à le paralyser. La parade la plus simple
est de *refuser les motifs démesurément longs*.
{{% /hint %}}

### L'algorithme de Horspool

Peut-on faire mieux que d'essayer chaque position ? Oui, et l'idée est étonnamment simple.
Elle est due à Nigel Horspool (1980), qui a proposé une version simplifiée de l'algorithme
de Boyer-Moore. Les mises en œuvre efficaces de la recherche de sous-chaîne — dans les
bibliothèques standard de plusieurs langages, dans les éditeurs de texte, dans les outils
comme `grep` — reposent souvent sur cet algorithme ou sur l'un de ses proches parents.

L'algorithme de Horspool tient en deux observations :

1. *On compare le motif de la droite vers la gauche*, alors qu'on le fait glisser vers la
   droite.
2. Lorsqu'une comparaison échoue, on regarde le caractère du texte qui était aligné avec la
   *dernière* lettre du motif. Ce caractère nous dit de combien on peut glisser sans
   risquer de rater une occurrence : si ce caractère n'apparaît nulle part dans le motif,
   on peut glisser de toute la longueur du motif d'un seul coup.

On prépare donc, avant la recherche, une petite table de *décalage* : pour chaque
caractère `c`, `decalage[c]` vaut la distance entre la dernière occurrence de `c` dans le
motif (sa dernière lettre exclue) et la fin du motif ; et vaut la longueur du motif si `c`
n'y figure pas.

Voyons l'algorithme à l'œuvre sur un petit exemple.

<figure style="margin:1.6em 0;text-align:center;">
<svg viewBox="0 0 520 392" width="100%" style="max-width:520px;height:auto" role="img" aria-labelledby="horspool-t horspool-d" xmlns="http://www.w3.org/2000/svg">
<title id="horspool-t">Déroulement de l'algorithme de Horspool</title>
<desc id="horspool-d">Recherche du motif CADA dans le texte ABRACADABRA. Trois alignements successifs. À chaque essai, les caractères sont comparés de la droite vers la gauche ; en cas de désaccord, le motif glisse vers la droite d'un nombre de positions lu dans la table de décalage.</desc>
<rect x="0" y="0" width="520" height="392" fill="#ffffff" stroke="#e2e6ea" rx="6"/>
<defs><marker id="fl" viewBox="0 0 10 10" refX="9" refY="5" markerWidth="6" markerHeight="6" orient="auto-start-reverse"><path d="M 0 0 L 10 5 L 0 10 z" fill="#1f2a37"/></marker></defs>
<line x1="76" y1="34" x2="76" y2="284" stroke="#e6eaef" stroke-width="1" stroke-dasharray="3 4"/>
<line x1="106" y1="34" x2="106" y2="284" stroke="#e6eaef" stroke-width="1" stroke-dasharray="3 4"/>
<line x1="136" y1="34" x2="136" y2="284" stroke="#e6eaef" stroke-width="1" stroke-dasharray="3 4"/>
<line x1="166" y1="34" x2="166" y2="284" stroke="#e6eaef" stroke-width="1" stroke-dasharray="3 4"/>
<line x1="196" y1="34" x2="196" y2="284" stroke="#e6eaef" stroke-width="1" stroke-dasharray="3 4"/>
<line x1="226" y1="34" x2="226" y2="284" stroke="#e6eaef" stroke-width="1" stroke-dasharray="3 4"/>
<line x1="256" y1="34" x2="256" y2="284" stroke="#e6eaef" stroke-width="1" stroke-dasharray="3 4"/>
<line x1="286" y1="34" x2="286" y2="284" stroke="#e6eaef" stroke-width="1" stroke-dasharray="3 4"/>
<line x1="316" y1="34" x2="316" y2="284" stroke="#e6eaef" stroke-width="1" stroke-dasharray="3 4"/>
<line x1="346" y1="34" x2="346" y2="284" stroke="#e6eaef" stroke-width="1" stroke-dasharray="3 4"/>
<line x1="376" y1="34" x2="376" y2="284" stroke="#e6eaef" stroke-width="1" stroke-dasharray="3 4"/>
<line x1="406" y1="34" x2="406" y2="284" stroke="#e6eaef" stroke-width="1" stroke-dasharray="3 4"/>
<text x="14" y="53" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="12" font-weight="bold" font-style="normal" fill="#1f2a37">Texte</text>
<text x="91" y="27" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="normal" font-style="normal" fill="#98a2ae">0</text>
<rect x="76" y="34" width="30" height="30" rx="4" fill="#eaf1f9" stroke="#7d9cba" stroke-width="1.4"/>
<text x="91" y="54" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">A</text>
<text x="121" y="27" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="normal" font-style="normal" fill="#98a2ae">1</text>
<rect x="106" y="34" width="30" height="30" rx="4" fill="#eaf1f9" stroke="#7d9cba" stroke-width="1.4"/>
<text x="121" y="54" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">B</text>
<text x="151" y="27" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="normal" font-style="normal" fill="#98a2ae">2</text>
<rect x="136" y="34" width="30" height="30" rx="4" fill="#eaf1f9" stroke="#7d9cba" stroke-width="1.4"/>
<text x="151" y="54" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">R</text>
<text x="181" y="27" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="normal" font-style="normal" fill="#98a2ae">3</text>
<rect x="166" y="34" width="30" height="30" rx="4" fill="#eaf1f9" stroke="#7d9cba" stroke-width="1.4"/>
<text x="181" y="54" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">A</text>
<text x="211" y="27" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="normal" font-style="normal" fill="#98a2ae">4</text>
<rect x="196" y="34" width="30" height="30" rx="4" fill="#eaf1f9" stroke="#7d9cba" stroke-width="1.4"/>
<text x="211" y="54" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">C</text>
<text x="241" y="27" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="normal" font-style="normal" fill="#98a2ae">5</text>
<rect x="226" y="34" width="30" height="30" rx="4" fill="#eaf1f9" stroke="#7d9cba" stroke-width="1.4"/>
<text x="241" y="54" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">A</text>
<text x="271" y="27" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="normal" font-style="normal" fill="#98a2ae">6</text>
<rect x="256" y="34" width="30" height="30" rx="4" fill="#eaf1f9" stroke="#7d9cba" stroke-width="1.4"/>
<text x="271" y="54" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">D</text>
<text x="301" y="27" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="normal" font-style="normal" fill="#98a2ae">7</text>
<rect x="286" y="34" width="30" height="30" rx="4" fill="#eaf1f9" stroke="#7d9cba" stroke-width="1.4"/>
<text x="301" y="54" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">A</text>
<text x="331" y="27" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="normal" font-style="normal" fill="#98a2ae">8</text>
<rect x="316" y="34" width="30" height="30" rx="4" fill="#eaf1f9" stroke="#7d9cba" stroke-width="1.4"/>
<text x="331" y="54" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">B</text>
<text x="361" y="27" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="normal" font-style="normal" fill="#98a2ae">9</text>
<rect x="346" y="34" width="30" height="30" rx="4" fill="#eaf1f9" stroke="#7d9cba" stroke-width="1.4"/>
<text x="361" y="54" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">R</text>
<text x="391" y="27" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="normal" font-style="normal" fill="#98a2ae">10</text>
<rect x="376" y="34" width="30" height="30" rx="4" fill="#eaf1f9" stroke="#7d9cba" stroke-width="1.4"/>
<text x="391" y="54" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">A</text>
<path d="M 191 96 L 81 96" stroke="#1f2a37" stroke-width="1.4" fill="none" marker-end="url(#fl)"/>
<text x="204" y="100" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="10.5" font-weight="normal" font-style="italic" fill="#5b6470">on compare de droite à gauche</text>
<text x="14" y="129" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="12" font-weight="bold" font-style="normal" fill="#1f2a37">Essai 1</text>
<rect x="76" y="110" width="30" height="30" rx="4" fill="#f4f4f4" stroke="#c0c0c0" stroke-width="1.4"/>
<text x="91" y="130" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">C</text>
<rect x="106" y="110" width="30" height="30" rx="4" fill="#f4f4f4" stroke="#c0c0c0" stroke-width="1.4"/>
<text x="121" y="130" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">A</text>
<rect x="136" y="110" width="30" height="30" rx="4" fill="#ffdad6" stroke="#c0392b" stroke-width="1.4"/>
<text x="151" y="130" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">D</text>
<rect x="166" y="110" width="30" height="30" rx="4" fill="#d8f0d8" stroke="#3f8f3f" stroke-width="1.4"/>
<text x="181" y="130" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">A</text>
<circle cx="192" cy="114" r="7" fill="#1f2a37"/>
<text x="192" y="118" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="bold" fill="#ffffff">1</text>
<circle cx="162" cy="114" r="7" fill="#1f2a37"/>
<text x="162" y="118" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="bold" fill="#ffffff">2</text>
<text x="208" y="129" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="10.5" font-weight="bold" font-style="normal" fill="#b45309">décalage[A] = 2  →  on glisse de 2</text>
<text x="76" y="155" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="10.5" font-weight="normal" font-style="normal" fill="#5b6470">Désaccord : « D » ≠ « R ». En face de la fin du motif, le texte a « A ».</text>
<text x="14" y="201" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="12" font-weight="bold" font-style="normal" fill="#1f2a37">Essai 2</text>
<rect x="136" y="182" width="30" height="30" rx="4" fill="#f4f4f4" stroke="#c0c0c0" stroke-width="1.4"/>
<text x="151" y="202" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">C</text>
<rect x="166" y="182" width="30" height="30" rx="4" fill="#f4f4f4" stroke="#c0c0c0" stroke-width="1.4"/>
<text x="181" y="202" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">A</text>
<rect x="196" y="182" width="30" height="30" rx="4" fill="#ffdad6" stroke="#c0392b" stroke-width="1.4"/>
<text x="211" y="202" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">D</text>
<rect x="226" y="182" width="30" height="30" rx="4" fill="#d8f0d8" stroke="#3f8f3f" stroke-width="1.4"/>
<text x="241" y="202" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">A</text>
<circle cx="252" cy="186" r="7" fill="#1f2a37"/>
<text x="252" y="190" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="bold" fill="#ffffff">1</text>
<circle cx="222" cy="186" r="7" fill="#1f2a37"/>
<text x="222" y="190" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="bold" fill="#ffffff">2</text>
<text x="268" y="201" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="10.5" font-weight="bold" font-style="normal" fill="#b45309">décalage[A] = 2  →  on glisse de 2</text>
<text x="76" y="227" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="10.5" font-weight="normal" font-style="normal" fill="#5b6470">Désaccord : « D » ≠ « C ». En face de la fin du motif, le texte a « A ».</text>
<text x="14" y="273" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="12" font-weight="bold" font-style="normal" fill="#1f2a37">Essai 3</text>
<rect x="196" y="254" width="30" height="30" rx="4" fill="#d8f0d8" stroke="#3f8f3f" stroke-width="1.4"/>
<text x="211" y="274" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">C</text>
<rect x="226" y="254" width="30" height="30" rx="4" fill="#d8f0d8" stroke="#3f8f3f" stroke-width="1.4"/>
<text x="241" y="274" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">A</text>
<rect x="256" y="254" width="30" height="30" rx="4" fill="#d8f0d8" stroke="#3f8f3f" stroke-width="1.4"/>
<text x="271" y="274" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">D</text>
<rect x="286" y="254" width="30" height="30" rx="4" fill="#d8f0d8" stroke="#3f8f3f" stroke-width="1.4"/>
<text x="301" y="274" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="15" font-weight="bold" fill="#1f2a37">A</text>
<circle cx="312" cy="258" r="7" fill="#1f2a37"/>
<text x="312" y="262" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="bold" fill="#ffffff">1</text>
<circle cx="282" cy="258" r="7" fill="#1f2a37"/>
<text x="282" y="262" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="bold" fill="#ffffff">2</text>
<circle cx="252" cy="258" r="7" fill="#1f2a37"/>
<text x="252" y="262" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="bold" fill="#ffffff">3</text>
<circle cx="222" cy="258" r="7" fill="#1f2a37"/>
<text x="222" y="262" text-anchor="middle" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="9" font-weight="bold" fill="#ffffff">4</text>
<text x="328" y="273" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="11" font-weight="bold" font-style="normal" fill="#2f7d32">trouvé !</text>
<text x="76" y="299" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="10.5" font-weight="normal" font-style="normal" fill="#2f7d32">Les quatre caractères concordent : le motif est trouvé à la position 4.</text>
<text x="14" y="340" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="12" font-weight="bold" font-style="normal" fill="#1f2a37">Table de</text>
<text x="14" y="353" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="12" font-weight="bold" font-style="normal" fill="#1f2a37">décalage</text>
<rect x="76" y="328" width="58" height="30" rx="4" fill="#fff7ed" stroke="#e08b00" stroke-width="1.4"/>
<text x="105" y="348" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="13" font-weight="bold" fill="#1f2a37">C → 3</text>
<rect x="142" y="328" width="58" height="30" rx="4" fill="#fff7ed" stroke="#e08b00" stroke-width="1.4"/>
<text x="171" y="348" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="13" font-weight="bold" fill="#1f2a37">A → 2</text>
<rect x="208" y="328" width="58" height="30" rx="4" fill="#fff7ed" stroke="#e08b00" stroke-width="1.4"/>
<text x="237" y="348" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="13" font-weight="bold" fill="#1f2a37">D → 1</text>
<rect x="274" y="328" width="82" height="30" rx="4" fill="#fff7ed" stroke="#e08b00" stroke-width="1.4"/>
<text x="315" y="348" text-anchor="middle" font-family="ui-monospace,SFMono-Regular,Menlo,Consolas,monospace" font-size="13" font-weight="bold" fill="#1f2a37">autre → 4</text>
<text x="76" y="374" text-anchor="start" font-family="ui-sans-serif,system-ui,-apple-system,Helvetica,Arial,sans-serif" font-size="10.5" font-weight="normal" font-style="normal" fill="#5b6470">Décalages lus sur « CAD », soit le motif privé de sa dernière lettre.</text>
</svg>
<figcaption style="font-size:0.9em;color:#4b5563;margin-top:0.7em;">Recherche du motif « CADA » dans le texte « ABRACADABRA » avec l'algorithme de Horspool. Les pastilles numérotées donnent l'ordre des comparaisons.</figcaption>
</figure>

Trois alignements suffisent là où la recherche naïve en aurait essayé cinq. Surtout,
l'algorithme n'a jamais lu les caractères des positions 0 et 1 du texte : il les a
survolés. Sur un exemple aussi court le gain est modeste, mais il devient spectaculaire
quand le motif s'allonge, comme nous le verrons.

Voici une mise en œuvre complète en Java. Le programme compte les comparaisons afin de
rendre le travail effectué visible.

{{<inlineJava path="Horspool.java" lang="java">}}
import java.util.Arrays;

public class Horspool {

    // Compteur de comparaisons de caractères : sert uniquement à mesurer le travail.
    static long comparaisons = 0;

    /**
     * Construit la table de décalage.
     * decalage[c] indique de combien de positions on peut faire glisser le motif
     * lorsque c est le caractère du texte aligné avec la DERNIÈRE lettre du motif.
     */
    static int[] tableDecalage(String motif) {
        int m = motif.length();
        // Un char Java tient sur 16 bits : la table couvre tous les caractères possibles.
        int[] decalage = new int[Character.MAX_VALUE + 1];
        Arrays.fill(decalage, m);          // caractère absent du motif : saut maximal
        for (int i = 0; i < m - 1; i++) {  // la dernière lettre est volontairement exclue
            decalage[motif.charAt(i)] = m - 1 - i;
        }
        return decalage;
    }

    /** Position de la première occurrence de motif dans texte, ou -1 si absente. */
    static int indexOf(String texte, String motif) {
        int n = texte.length();
        int m = motif.length();
        if (m == 0) return 0;
        if (m > n) return -1;

        int[] decalage = tableDecalage(motif);
        int position = 0;                  // position du début du motif dans le texte
        while (position <= n - m) {
            // On compare de la DROITE vers la GAUCHE.
            int j = m - 1;
            while (j >= 0) {
                comparaisons++;
                if (motif.charAt(j) != texte.charAt(position + j)) break;
                j--;
            }
            if (j < 0) return position;    // toutes les lettres concordent : trouvé
            // Le caractère aligné avec la fin du motif décide de la taille du saut.
            position += decalage[texte.charAt(position + m - 1)];
        }
        return -1;
    }

    public static void main(String[] args) {
        // 1. Le petit exemple de la figure.
        String texte = "ABRACADABRA";
        comparaisons = 0;
        System.out.println("Position de \"CADA\" dans \"" + texte + "\" : "
            + indexOf(texte, "CADA")
            + "  (" + comparaisons + " comparaisons pour "
            + texte.length() + " caractères de texte)");
        System.out.println("Réponse de Java : " + texte.indexOf("CADA"));

        // 2. Cas favorable : le motif n'a aucune lettre en commun avec le texte.
        String grandTexte = "a".repeat(100_000);
        comparaisons = 0;
        int r1 = indexOf(grandTexte, "xyz");
        System.out.println("\nRecherche de \"xyz\" (absent) : résultat " + r1);
        System.out.println("  " + comparaisons + " comparaisons pour "
            + grandTexte.length() + " caractères : environ n/3.");

        // 3. Cas défavorable : le motif ne diffère du texte qu'à sa PREMIÈRE lettre.
        String motifDefavorable = "b" + "a".repeat(199);
        comparaisons = 0;
        int r2 = indexOf(grandTexte, motifDefavorable);
        System.out.println("\nRecherche de \"baaa...a\" (absent, 200 lettres) : résultat " + r2);
        System.out.println("  " + comparaisons + " comparaisons pour "
            + grandTexte.length() + " caractères : environ n × m.");
    }
}
{{</inlineJava>}}


Un algorithme qui lit tout le texte fait au moins \(n\) opérations. Horspool, lui, peut en
faire *moins* : c'est ce qu'on appelle un comportement *sous-linéaire*. La raison est
qu'il ne lit pas tous les caractères du texte ; il en saute.

Prenons le cas le plus net. Le motif est `xyz` (trois lettres) et le texte ne contient que
des `a`. À chaque essai :

- on compare la dernière lettre du motif, `z`, avec un caractère du texte, `a` : désaccord
  *dès la première comparaison* ;
- le caractère `a` n'apparaît pas dans le motif, donc `decalage['a']` vaut 3 : on glisse
  de trois positions d'un seul coup.

Chaque comparaison fait donc avancer de trois caractères. Pour un texte de \(n\)
caractères, il n'en faut que \(n/3\). Plus généralement, avec un motif de longueur \(m\)
dont les lettres sont rares dans le texte, le coût descend vers \(n/m\) comparaisons : plus
le motif est *long*, plus la recherche est *rapide*. C'est exactement l'inverse de la
recherche naïve. 
{{% hint info %}}
Il existe des algorithmes dont le pire cas est garanti linéaire, c'est-à-dire \(O(n+m)\) :
Knuth-Morris-Pratt (1977) et l'algorithme *Two-Way* de Crochemore et Perrin (1991), ce
dernier étant utilisé par plusieurs bibliothèques C. Ils ne sont toutefois pas toujours
plus rapides en pratique : sur du texte ordinaire, leur surcoût les rend souvent plus lents
qu'une recherche simple. Il n'existe pas de meilleur algorithme dans l'absolu, seulement
des compromis.
{{% /hint %}}

## Les expressions régulières

Une *expression régulière* (ou *regex*) est un petit langage qui sert à décrire une
*forme* de texte plutôt qu'un texte précis. Au lieu de chercher le mot exact « 2026-08-26 »,
on décrit « quatre chiffres, un tiret, deux chiffres, un tiret, deux chiffres ». Plusieurs
méthodes de `String` acceptent une expression régulière en argument.

Voici les éléments de syntaxe les plus courants. Attention : en Java, l'expression
régulière est écrite dans une chaîne de caractères, et la barre oblique inverse doit donc
être doublée. Pour exprimer « un chiffre », on écrit `\d` en notation regex, ce qui donne
`"\\d"` dans le code Java.

| Notation | Signification | Exemple |
| --- | --- | --- |
| `.` | n'importe quel caractère | `"a.c"` reconnaît `abc`, `axc` |
| `\d` | un chiffre | `"\\d\\d"` reconnaît `42` |
| `\w` | une lettre, un chiffre ou le trait de soulignement | `"\\w+"` reconnaît `nom_1` |
| `\s` | une espace, une tabulation, un saut de ligne | `"\\s+"` reconnaît une suite d'espaces |
| `[abc]` | l'un des caractères énumérés | `"[aeiou]"` reconnaît une voyelle |
| `[a-z]` | un caractère de l'intervalle | `"[A-Z]"` reconnaît une majuscule |
| `[^abc]` | tout **sauf** les caractères énumérés | `"[^0-9]"` reconnaît un non-chiffre |
| `?` | l'élément précédent, zéro ou une fois | `"colou?r"` reconnaît `color` et `colour` |
| `*` | l'élément précédent, zéro fois ou plus | `"ab*"` reconnaît `a`, `ab`, `abb` |
| `+` | l'élément précédent, une fois ou plus | `"\\d+"` reconnaît `7`, `2026` |
| `{n}`, `{n,m}` | un nombre précis de répétitions | `"\\d{4}"` reconnaît `2026` |
| `(...)` | un **groupe**, que l'on peut récupérer séparément | `"(\\d{4})-(\\d{2})"` |
| `a\|b` | l'un ou l'autre | `"chat\|chien"` |
| `^`, `$` | début, fin de la chaîne | `"^Bonjour"` |

Les méthodes concernées de la classe `String` sont les suivantes.

| Méthode | Description | Complexité |
| --- | --- | --- |
| `matches(String regex)` | Vrai si la chaîne **entière** correspond au motif. Attention : ce n'est pas une recherche partielle. | \(O(n)\) en général, exponentielle au pire |
| `replaceAll(String regex, String remplacement)` | Remplace toutes les portions qui correspondent au motif. | idem |
| `replaceFirst(String regex, String remplacement)` | Ne remplace que la première portion. | idem |
| `split(String regex)` | Découpe la chaîne aux endroits qui correspondent au motif. | idem |

Ces quatre méthodes *recompilent l'expression régulière à chaque appel*. Dans une boucle, il vaut donc mieux compiler le
motif une seule fois avec `Pattern.compile` et le réutiliser. La classe `Matcher` permet en
outre de récupérer les portions reconnues, ce que `String` ne sait pas faire.

{{<inlineJava path="ExempleExpressionsRegulieres.java" lang="java">}}
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExempleExpressionsRegulieres {
    public static void main(String[] args) {

        // 1. matches() : est-ce que TOUTE la chaîne correspond au motif ?
        //    Un code postal canadien : lettre, chiffre, lettre, espace optionnelle,
        //    chiffre, lettre, chiffre.
        String motifCodePostal = "[A-Z]\\d[A-Z] ?\\d[A-Z]\\d";
        System.out.println("\"H2X 1Y4\" est un code postal ? " + "H2X 1Y4".matches(motifCodePostal));
        System.out.println("\"BONJOUR\" est un code postal ? " + "BONJOUR".matches(motifCodePostal));

        // Attention : matches() exige que la chaîne ENTIÈRE corresponde.
        System.out.println("\"abc123\".matches(\"\\\\d+\") = " + "abc123".matches("\\d+"));

        // 2. replaceAll() : normaliser les espaces multiples.
        String phrase = "Le   chat    dort   au   soleil";
        System.out.println("Espaces normalisées : " + phrase.replaceAll("\\s+", " "));

        // Retirer tout ce qui n'est pas une lettre ou un chiffre.
        System.out.println("Nettoyage : " + "Tél. : (514) 987-3000".replaceAll("[^0-9]", ""));

        // 3. split() : découper selon un motif.
        String donnees = "pomme, banane ,cerise ,  datte";
        String[] fruits = donnees.split("\\s*,\\s*");   // virgule entourée d'espaces
        System.out.println("Découpage : " + Arrays.toString(fruits));

        // 4. Pattern et Matcher : pour EXTRAIRE les portions reconnues.
        //    Le motif est compilé une seule fois, ce qui est préférable dans une boucle.
        Pattern motifDate = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        String texte = "Remise le 2026-08-26, examen le 2026-12-15.";
        Matcher chercheur = motifDate.matcher(texte);
        while (chercheur.find()) {
            System.out.println("Date trouvée : " + chercheur.group()
                + "  (année " + chercheur.group(1)
                + ", mois " + chercheur.group(2)
                + ", jour " + chercheur.group(3) + ")");
        }
    }
}
{{</inlineJava>}}

{{% hint warning %}}
Le moteur d'expressions régulières de Java procède par *retour sur trace*
(*backtracking*) : quand une piste échoue, il revient en arrière et en essaie une autre.
Sur certains motifs, le nombre de pistes explose et le temps de calcul devient
exponentiel. L'exemple classique est le motif `(a+)+b` confronté à une chaîne formée
uniquement de `a` :

```java  {style=github}
// À NE PAS EXÉCUTER tel quel : le temps de calcul double à chaque « a » ajouté.
"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".matches("(a+)+b");
```

Comme pour `indexOf`, la leçon est la même : méfiez-vous des motifs et des textes fournis
par l'utilisateur. Ce défaut porte un nom, *ReDoS* (déni de service par expression
régulière).
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
public class ExempleStringBuilder {
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


## Vidéos suggérées


{{< youtube id="wvQQ5263pvI" >}}

{{< youtube id="EphmNLfZ2hM" >}}