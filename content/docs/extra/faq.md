---
title: "FAQ"
weight: 9
---

### Question: Qu'est-ce que Java et pourquoi est-il utilisé ?

Réponse: Java est un langage de programmation orienté objet, populaire pour sa portabilité et sa robustesse. Il est utilisé pour développer des applications web, mobiles (comme Android), des logiciels d'entreprise et des jeux, car il fonctionne sur de nombreuses plateformes grâce à la machine virtuelle Java (JVM).

### Question: Comment installer Java sur mon ordinateur ?

Réponse: Pour installer Java, téléchargez le JDK (Java Development Kit) depuis le site officiel d'Oracle ou adoptez une version open-source comme OpenJDK. Suivez les instructions d'installation pour votre système (Windows, macOS ou Linux). Vérifiez l'installation en tapant `java -version` dans une invite de commande.

### Question: Quelle est la différence entre JDK, JRE et JVM ?

Réponse: Le JDK (Java Development Kit) inclut des outils pour développer des programmes Java. Le JRE (Java Runtime Environment) permet d'exécuter des applications Java. La JVM (Java Virtual Machine) est le moteur qui exécute le code Java compilé, inclus dans le JRE.

### Question: Pourquoi dois-je écrire `public static void main` dans mon programme ?

Réponse: La méthode `public static void main(String[] args)` est le point d'entrée d'un programme Java. Elle est requise pour que la JVM sache où commencer l'exécution. `public` la rend accessible, `static` permet de l'appeler sans créer d'objet, et `void` indique qu'elle ne retourne rien.

### Question: Qu'est-ce qu'une variable en Java et comment la déclarer ?

Réponse: Une variable stocke des données, comme des nombres ou du texte. Pour la déclarer, indiquez son type, son nom et, optionnellement, une valeur initiale, par exemple : `int nombre = 10;` pour un entier ou `String texte = "Bonjour";` pour du texte.

### Question: Comment afficher du texte dans la console en Java ?

Réponse: Utilisez la méthode `System.out.println()` pour afficher du texte dans la console. Par exemple, `System.out.println("Bonjour le monde !");` affiche "Bonjour le monde&nbsp;!" suivi d'un saut de ligne.

### Question: Qu'est-ce qu'une boucle en Java et à quoi sert-elle ?

Réponse: Une boucle exécute un bloc de code plusieurs fois. Par exemple, une boucle `for` comme `for (int i = 0; i < 5; i++) { System.out.println(i); }` affiche les nombres de 0 à 4. Les boucles sont utiles pour répéter des tâches, comme parcourir une liste.

### Question: C'est quoi une classe et un objet en Java ?

Réponse: Une classe est un modèle définissant des propriétés (attributs) et des comportements (méthodes). Un objet est une instance de cette classe. Par exemple, une classe `Voiture` peut définir une couleur et une méthode pour conduire, et un objet `maVoiture` est une voiture spécifique créée à partir de cette classe.

### Question: Pourquoi vois-je une erreur "NullPointerException" ?

Réponse: Une `NullPointerException` se produit quand vous essayez d'utiliser une variable ou un objet qui n'a pas été initialisé (sa valeur est `null`). Vérifiez si vous avez bien créé l'objet avec `new` ou si la variable a une valeur avant de l'utiliser.

### Question: Comment lire une entrée utilisateur en Java ?

Réponse: Utilisez la classe `Scanner` pour lire une entrée. Par exemple :

```java  {style=github}
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
System.out.println("Entrez votre nom : ");
String nom = scanner.nextLine();
```
Cela lit une ligne de texte entrée par l'utilisateur et la stocke dans la variable `nom`.

### Question: Pourquoi est-ce que le cours ne s'offre pas en vidéoconférence ?

Réponse: Nous nous ferons un plaisir de répondre à vos questions par courriel, mais nous n'offrons pas d'enseignement par vidéoconférence au sein du cours INF 1220. La plupart des universités québécoises ont offert des cours d'informatique en vidéoconférence (zoom, etc.) lors de la grande pandémie de 2020-2021. L'Université Laval offre plusieurs cours selon ce modèle. Ce n'est pas le modèle de l'Université TÉLUQ. La plupart de nos étudiants ne souhaitent pas se présenter à heure fixe pour une session de cours de trois heures en vidéoconférence. Il est indéniable que l'enseignement par vidéoconférence répond bien aux besoins de certains étudiants, mais il est déjà offert ailleurs et nous ne croyons pas qu'il répond aux besoins de nos étudiants.

### Question: J'ai remis ma solution sans explication. Ma solution était correcte, mais j'ai quand même obtenu zéro, est-ce normal&nbsp;?

Réponse: Oui, vous devez expliquer vos solutions.

### Question: J'ai terminé l'examen et je suis déçu de ma note. Est-ce que je peux avoir une explication de mon résultat ?

Réponse: Oui, suivez les consignes fournies par l'Université. Vous devez passer par les moyens sécurisés de l'Université.

### Question: Ma date de fin de cours était hier, et aujourd'hui, je n'arrive pas à déposer mon travail noté. Est-ce que je peux le transmettre par courriel ?

Réponse: Non. Si la date de fin de cours est passée, il est normal que vous ne puissiez pas déposer votre travail. Vous obtiendrez la note de zéro.

### Question: Il m'a fallu des heures pour compléter le module X et remettre le travail noté, est-ce normal ?

Réponse: Absolument. Il faut prévoir des dizaines d'heures par module (et donc par travail noté). Prévoyez entre 5 et 15 heures par semaine pendant 15 semaines pour compléter le cours.

### Question: Mon examen est dans trois mois, mais la date de fin de cours officiel est dans une semaine. Est-ce que cela signifie que j'ai trois mois supplémentaires pour remettre mes travaux ?

Réponse: Non. Tout travail remis après votre date de fin de cours peut recevoir la note de zéro.

### Question: Je n'ai pas reçu de lettre confirmant mon inscription au cours ?

Réponse: Dans ce cas, vous n'êtes pas reconnu comme étant inscrit au cours. Vérifiez auprès de l'Université. Vous devez avoir reçu une confirmation écrite concernant votre inscription. Bien que vous les receviez directement, les documents officiels sont aussi disponibles en cliquant sur l’onglet « Documents reçus » au sein du tableau de bord du portail étudiant.

### Question: J'ai besoin de plus de temps que prévu pour terminer le cours, on m'a dit que le professeur pouvait m'arranger ?

Réponse: Non. La date de fin de cours ainsi que le moment où votre dossier est fermé sont déterminés par l'Université.

### Question: J'ai été très malade et j'ai pris du retard, est-ce que vous pouvez me donner plus de temps ?

Réponse: Non. La date de fin de cours ainsi que le moment où votre dossier est fermé sont déterminés par l'Université.

### Question: Combien de temps faut-il investir dans ce cours ?

Réponse: Le temps nécessaire dépend de votre préparation individuelle, mais vous devriez prévoir environ 9 heures par semaine pendant quinze semaines. Les étudiants qui ont déjà de l'expérience en programmation peuvent aller beaucoup plus rapidement.

### Question: J'ai eu des difficultés personnelles, j'ai manqué de temps, est-ce que le professeur peut modifier ma date de fin de cours ?

Réponse: Non. Si vous devez reporter votre date de fin de cours, vous devez joindre l'Université.

### Question: J'ai du mal avec une question dans un des travaux, est-ce que je peux avoir un indice, une partie de la solution ?

Réponse: Non. Les travaux notés sont des travaux individuels. Assurez-vous de bien compléter les exercices et les lectures avant d'entreprendre les travaux notés.

### Question: Je dois passer l'examen le X, mais j'ai un empêchement, est-ce que vous pouvez déplacer l'examen ?

Réponse: Vous devez joindre l'Université.

### Question: Je viens de passer 35 heures sur la question X du travail noté Y, est-ce que vous pouvez me donner un indice ?

Réponse: Non. Ce serait inéquitable. Nous avons un grand volume d'étudiants avec un bon taux de succès (de bonnes notes) : nous savons donc que les travaux notés ne sont pas trop difficiles. Par contre, il arrive souvent que les étudiants ne fassent pas correctement tous les exercices et toutes les lectures préparatoires, croyant à tort qu'ils gagneront du temps en allant directement au travail noté. D'autres étudiants n'ont tout simplement pas la préparation suffisante : la programmation est un langage formel qui est difficile pour ceux qui n'ont pas acquis les bases en mathématiques.

Ceci étant dit, il est parfaitement normal de passer 35 heures sur un des modules. Il faut prévoir un total d'environ 135 heures (en moyenne) pour compléter le cours. Certains étudiants peuvent aller plus rapidement. Si vous partez de plus loin et qu'il vous manque des préalables (par exemple, mathématiques), il faut prévoir un peu plus de temps.