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

