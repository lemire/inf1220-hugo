---

title: "Exercices sur les exceptions et la récursivité"
weight: 8
---

# Exercices sur les exceptions et la récursivité

## Questions/Réponses

<p>Veuillez répondre mentalement, sur papier ou bien en créant le code nécessaire pour répondre à ces questions avant de regarder la réponse.</p>
<p>Quand on vous demande de produire du code, vous devez le tester. C'est une erreur commune chez les étudiants: ils produisent rapidement du code en supposant qu'il est fonctionnel. Prenez le temps de vous relire, d'être attentif. Et testez votre code. Encore et encore.</p>

<p>Prenez note qu'<a href="https://rc-inf1220.teluq.ca/">il est permis d'utiliser le robot conversationnel du cours lors des exercises</a>. Cependant vous devriez vous entraîner à produire vos propres réponses.</p>

## Réponses uniques?

<p>Les exercices comportent une solution vous permettant de comparer votre approche avec la nôtre. Il n'y a pas de solution unique aux problèmes en général. Vous pouvez arriver avec une solution qui est préférable ou moins bonne que celle que nous offrons. Pour faire ces questions, vous devez avoir fait toutes les lectures préalables. Vous disposez alors toujours des fondements nécessaires pour faire les exercices. Nous vous encourageons tout de même à faire vos propres recherches en complément de vos lectures. Dans certains cas, au sein de la solution que nous offrons, nous pouvons utiliser des notions techniques qui n'ont pas été vues directement dans le cours, mais qui devraient vous être facilement accessibles.</p>

## Question 1

Expliquez ce qu'est la récursivité en Java. Donnez un exemple simple de fonction récursive qui calcule la factorielle d'un nombre.

<details><summary>Réponse</summary>
<p>La récursivité est une technique où une fonction s'appelle elle-même pour résoudre un problème en le divisant en sous-problèmes plus simples. Exemple :</p>

```java  {style=github}
int factorielle(int n) {
    if (n <= 1) return 1;
    else return n * factorielle(n - 1);
}
```
</details>

## Question 2

Qu'est-ce qu'une exception en Java ? Donnez un exemple de code qui attrape une exception lors d'une division par zéro.

<details><summary>Réponse</summary>
<p>Une exception est un mécanisme qui permet de gérer les erreurs ou situations inattendues lors de l'exécution d'un programme. Exemple :</p>

```java  {style=github}
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Division par zéro !");
}
```
</details>

## Question 3

Que se passera-t-il si vous placez l'instruction <code>return</code> dans le bloc « try » ou « catch » ? Le bloc « finally » s'exécutera-t-il ?

<details><summary>Réponse</summary>
<p>Oui, le bloc <code>finally</code> s'exécutera toujours, même si un <code>return</code> est exécuté dans le bloc <code>try</code> ou <code>catch</code>. Exemple :</p>

```java  {style=github}
public int exemple() {
    try {
        return 1;
    } catch (Exception e) {
        return 2;
    } finally {
        System.out.println("Bloc finally exécuté");
    }
}
```
<p>Le message du bloc <code>finally</code> sera affiché avant que la méthode ne retourne sa valeur.</p>
</details>

## Question 4

Écrivez une fonction récursive qui calcule la somme des éléments d'un tableau d'entiers.

<details><summary>Réponse</summary>

```java  {style=github}
int somme(int[] t, int n) {
    if (n == 0) return 0;
    else return t[n-1] + somme(t, n-1);
}
// Appel : somme(t, t.length)
```
</details>

## Question 5

Que se passe-t-il si une fonction récursive n'a pas de cas d'arrêt (condition d'arrêt) ?

<details><summary>Réponse</summary>
<p>La fonction s'appellera elle-même indéfiniment, ce qui provoquera une erreur de type <code>StackOverflowError</code> (dépassement de pile) en Java.</p>
</details>

## Question 6

Quelles sont les différences entre les exceptions vérifiées (checked) et non vérifiées (unchecked) en Java ?

<details><summary>Réponse</summary>
<p>Les exceptions vérifiées (checked) doivent être déclarées dans la signature de la méthode ou capturées avec un bloc <code>try/catch</code>. Elles héritent de <code>Exception</code> (sauf <code>RuntimeException</code>). Les exceptions non vérifiées (unchecked) héritent de <code>RuntimeException</code> et ne nécessitent pas d’être déclarées ni capturées explicitement.</p>
</details>

## Question 7

Que se passe-t-il si une exception n’est pas capturée dans un bloc <code>try/catch</code> ?

<details><summary>Réponse</summary>
<p>Si une exception n’est pas capturée, elle remonte la pile d’appels jusqu’à ce qu’un bloc <code>catch</code> la capture. Si aucune méthode ne la capture, le programme se termine avec un message d’erreur (stack trace).</p>
</details>

## Question 8

Comment créer sa propre exception personnalisée en Java ?

<details><summary>Réponse</summary>
<p>On crée une classe qui hérite de <code>Exception</code> (pour une exception vérifiée) ou de <code>RuntimeException</code> (pour une non vérifiée). Exemple :</p>

```java  {style=github}
class MonException extends Exception {
    public MonException(String message) {
        super(message);
    }
}
```
</details>

## Question 9

À quoi sert le mot-clé <code>throw</code> en Java ? Donnez un exemple d’utilisation.

<details><summary>Réponse</summary>
<p>Le mot-clé <code>throw</code> permet de lancer explicitement une exception. Exemple :</p>

```java  {style=github}
if (x < 0) {
    throw new IllegalArgumentException("x doit être positif");
}
```
</details>

## Question 10

Que se passe-t-il si on place plusieurs blocs <code>catch</code> à la suite d’un <code>try</code> ? Dans quel ordre sont-ils évalués ?

<details><summary>Réponse</summary>
<p>Les blocs <code>catch</code> sont évalués dans l’ordre d’apparition. Le premier bloc dont le type correspond à l’exception levée sera exécuté ; les autres seront ignorés. Il faut placer les exceptions les plus spécifiques avant les plus générales.</p>
</details>

## Question 11

Qu’est-ce que le ramasse-miettes (garbage collector) en Java ? Quels sont ses avantages et ses inconvénients par rapport à la gestion manuelle de la mémoire ?

<details><summary>Réponse</summary>
<p>Le ramasse-miettes (garbage collector) est un mécanisme automatique de la machine virtuelle Java (JVM) qui libère la mémoire occupée par les objets qui ne sont plus utilisés (inaccessibles). Il permet d’éviter les fuites de mémoire et les erreurs de libération (comme les doubles libérations en C), ce qui rend la gestion de la mémoire plus sûre et plus simple pour le programmeur.</p>
<p><b>Avantages :</b> simplifie la programmation, réduit les risques d’erreurs, améliore la robustesse et la sécurité des programmes.</p>
<p><b>Inconvénients :</b> le développeur a moins de contrôle sur le moment précis où la mémoire est libérée, et le ramasse-miettes peut provoquer des pauses imprévisibles dans l’exécution du programme, ce qui peut être gênant pour les applications temps réel ou très sensibles aux performances.</p>
</details>

## Question 12

Comment peut-on limiter le surcoût du ramasse-miettes (garbage collector) dans une application Java ? Donnez quelques bonnes pratiques pour réduire son impact sur les performances.

<details><summary>Réponse</summary>
<p>Pour limiter le surcoût du ramasse-miettes, il est conseillé de :</p>
<ul>
<li>Réduire la création d’objets temporaires inutiles (par exemple, réutiliser les objets ou utiliser des types primitifs quand c’est possible).</li>
<li>Privilégier les structures de données adaptées à l’usage (par exemple, préférer <code>StringBuilder</code> à la concaténation répétée de <code>String</code>).</li>
<li>Limiter la taille des objets et des collections pour éviter une consommation excessive de mémoire.</li>
<li>Pour les applications critiques, ajuster les paramètres de la JVM (options de tuning du garbage collector) selon le profil d’utilisation.</li>
</ul>
<p>En appliquant ces bonnes pratiques, on réduit la pression sur le ramasse-miettes et on améliore la réactivité et la performance globale de l’application.</p>
</details>

## Question 13

Qu’est-ce que l’encodage UTF-16 et pourquoi Java l’utilise-t-il pour représenter les chaînes de caractères (<code>String</code>) ?

<details><summary>Réponse</summary>
<p>L’UTF-16 est un encodage qui permet de représenter tous les caractères Unicode à l’aide de séquences de 16 bits (un ou deux <code>char</code>). Java utilise l’UTF-16 pour garantir la compatibilité avec l’ensemble des caractères internationaux, y compris les symboles, emojis et alphabets non latins. Cela permet de manipuler du texte multilingue de façon uniforme, mais implique que certains caractères occupent deux <code>char</code> au lieu d’un seul.</p>
</details>

## Question 14

Expliquez pourquoi la méthode <code>charAt(int index)</code> sur une <code>String</code> Java ne retourne pas toujours un caractère complet pour l’utilisateur. Donnez un exemple.

<details><summary>Réponse</summary>
<p>En UTF-16, certains caractères Unicode (comme les emojis ou des symboles rares) sont codés sur deux <code>char</code> (une paire de substitution). La méthode <code>charAt</code> retourne un seul <code>char</code> à l’index donné, qui peut ne représenter qu’une partie d’un caractère complet. Par exemple :</p>

```java  {style=github}
String s = "A😊B";
System.out.println(s.charAt(1)); // Retourne un char de la paire, pas le smiley complet
```
</details>

## Question 15

Comment peut-on parcourir correctement tous les caractères Unicode d’une <code>String</code> en Java, même ceux codés sur deux <code>char</code> ?

<details><summary>Réponse</summary>
<p>Pour parcourir tous les caractères Unicode (code points) d’une chaîne, il faut utiliser les méthodes <code>codePoints()</code> ou <code>codePointAt()</code> de la classe <code>String</code>, ou la classe <code>Character</code>. Par exemple :</p>

```java  {style=github}
String s = "A😊B";
s.codePoints().forEach(cp -> System.out.println(Character.toChars(cp)));
```
<p>Cette approche permet de traiter chaque caractère Unicode comme une entité logique, même s’il est codé sur deux <code>char</code>.</p>
</details>

## Question 16

Combien de mémoire une <code>String</code> Java utilise-t-elle par caractère ? Cette valeur est-elle toujours la même pour tous les caractères ?

<details><summary>Réponse</summary>
<p>En Java, chaque élément du tableau interne d’une <code>String</code> occupe 2 octets (16 bits), car il s’agit d’un <code>char</code> en UTF-16. Pour la plupart des caractères courants (latin, accentués, etc.), un caractère occupe donc 2 octets. Cependant, certains caractères Unicode (comme les emojis ou des symboles rares) nécessitent deux <code>char</code> (soit 4 octets) pour être représentés, car ils sont codés sur une paire de substitution (surrogate pair). Ainsi, la mémoire utilisée par caractère visible peut varier selon le caractère.</p>
</details>

## Question 17

Écrivez un programme Java qui prend une chaîne de caractères en entrée et affiche la valeur numérique (code Unicode) de chaque <code>char</code> de la chaîne.

<details><summary>Réponse</summary>

```java  {style=github}
import java.util.Scanner;

public class AfficheCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne : ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("Caractère : '" + c + "' | Code Unicode : " + (int) c);
        }
    }
}
```

Ce programme lit une chaîne au clavier et affiche, pour chaque <code>char</code>, sa valeur numérique (code Unicode en décimal).

</details>

## Question 18

Qu’est-ce qu’un stream en Java ? À quoi sert-il ?

<details><summary>Réponse</summary>
<p>Un stream est une séquence d’éléments sur laquelle on peut effectuer des opérations de traitement en chaîne (filter, map, etc.). Il permet de manipuler des collections de façon déclarative et fonctionnelle, souvent en une seule ligne de code.</p>
</details>

## Question 19

Expliquez le rôle de la méthode <code>filter</code> dans un stream Java. Donnez un exemple.

<details><summary>Réponse</summary>
<p><code>filter</code> permet de ne conserver que les éléments qui satisfont une condition (prédicat). Exemple :</p>

```java
List<Integer> l = List.of(1, 2, 3, 4);
l.stream().filter(x -> x % 2 == 0).forEach(System.out::println); // Affiche 2, 4
```
</details>

## Question 20

À quoi sert la méthode <code>map</code> dans un stream ? Donnez un exemple.

<details><summary>Réponse</summary>
<p><code>map</code> applique une fonction à chaque élément du stream et retourne un nouveau stream avec les résultats. Exemple :</p>

```java
List<String> noms = List.of("alice", "bob");
noms.stream().map(String::toUpperCase).forEach(System.out::println); // ALICE, BOB
```
</details>

## Question 21

Expliquez l’utilité de la méthode <code>limit</code> dans un stream Java.

<details><summary>Réponse</summary>
<p><code>limit</code> permet de ne traiter qu’un nombre maximum d’éléments du stream. Exemple :</p>

```java
Stream.iterate(0, n -> n + 1).limit(5).forEach(System.out::println); // 0 1 2 3 4
```
</details>

## Question 22

Que fait la méthode <code>distinct</code> sur un stream ? Donnez un exemple.

<details><summary>Réponse</summary>
<p><code>distinct</code> supprime les doublons du stream (en utilisant equals). Exemple :</p>

```java
List<Integer> l = List.of(1, 2, 2, 3);
l.stream().distinct().forEach(System.out::println); // 1 2 3
```
</details>

## Question 23

Quel est le rôle de la méthode <code>sorted</code> dans un stream Java ?

<details><summary>Réponse</summary>
<p><code>sorted</code> trie les éléments du stream selon l’ordre naturel ou un comparateur fourni. Exemple :</p>

```java
List<String> noms = List.of("bob", "alice");
noms.stream().sorted().forEach(System.out::println); // alice, bob
```
</details>

## Question 24

À quoi sert la méthode <code>collect</code> dans un stream ? Donnez un exemple d’utilisation avec <code>Collectors.toList()</code>.

<details><summary>Réponse</summary>
<p><code>collect</code> permet de rassembler les éléments du stream dans une collection ou une autre structure de données. Exemple :</p>

```java
List<Integer> pairs = List.of(1, 2, 3, 4).stream()
    .filter(x -> x % 2 == 0)
    .collect(Collectors.toList());
System.out.println(pairs); // [2, 4]
```
</details>

## Question 25

Expliquez la différence entre un stream et une collection en Java.

<details><summary>Réponse</summary>
<p>Une collection (List, Set, etc.) stocke des données en mémoire et permet d’y accéder plusieurs fois. Un stream est une vue temporaire sur ces données, qui permet de les traiter de façon déclarative : il ne stocke pas les données et ne peut être consommé qu’une seule fois.</p>
</details>

## Question 26

Donnez un exemple d’utilisation de <code>stream()</code> sur une liste de chaînes pour obtenir la liste des longueurs distinctes, triées, de ces chaînes.

<details><summary>Réponse</summary>

```java
List<String> mots = List.of("java", "code", "stream", "java");
List<Integer> longueurs = mots.stream()
    .map(String::length)
    .distinct()
    .sorted()
    .collect(Collectors.toList());
System.out.println(longueurs); // [4, 5, 6]
```
</details>

