---
title: "Travail noté 2"
weight: 7
---

# Travail noté 2 - Les types, opérateurs et méthodes

Avant de commencer le travail noté, il est essentiel de maîtriser la matière en ayant complété toutes les lectures et exercices préparatoires, et de poser des questions si nécessaire. L’utilisation du robot conversationnel du cours est autorisée pour les travaux notés, mais les réponses et analyses doivent être personnelles. Les travaux doivent être soumis avant la date de fin de cours, inscrite dans le portail étudiant, sans possibilité de report, sauf en cas de situation exceptionnelle validée par l’Université. Toute soumission tardive peut entraîner une note de zéro ou un « incomplet », même si l’examen a lieu plus tard.

Les travaux doivent être remis sous forme de fichier PDF via l’outil de dépôt officiel de la TÉLUQ, sans envoi par courriel, sous peine de note zéro. Le document doit être clair, lisible, permettre le copier-coller du code, et inclure des explications détaillées en français sous forme de texte suivi, en évitant les saisies d’écran ou les travaux manuscrits. Les réponses doivent être précises, personnelles, et accompagnées d’analyses, sans se limiter à du code ou à des extraits recopiés. Une fois soumis, le travail ne peut être modifié, d’où l’importance de le relire attentivement.

Les travaux sont strictement individuels, et tout échange, notamment sur les réseaux sociaux, est considéré comme une faute académique pouvant mener à une note de zéro ou à une exclusion. La recherche sur le web est encouragée, mais aucun indice supplémentaire ne sera fourni au-delà de l’énoncé. La présentation, l’analyse et la clarté des explications sont prioritaires lors de la correction, qui valorise le raisonnement et la qualité du texte en français, plus que le code seul.
## Question #1

<p>Veuillez créer une classe et ses méthodes permettant de calculer le périmètre d'un cercle et l'aire de la surface délimitée par le cercle. Vous devez avoir 3 méthodes : 1 constructeur recevant un rayon, la méthode de calcul de l'aire et la méthode de calcul du périmètre. La classe doit se nommer <tt>Cercle</tt>.</p>

<p>On devrait pouvoir utiliser votre classe comme ceci :
</p>
<pre>
Cercle c = new Cercle(1);
System.out.println(c.aire());
System.out.println(c.perimetre());
</pre>
<p>(Le nom des méthodes aire et perimetre peut être différent si vous le souhaitez.)</p>



<p>Vous devez expliquer votre solution en détail, une solution insuffisamment expliquée pourra recevoir la note de zéro. Tous les qualifiants que vous utilisez (static, protected, private, public) doivent être justifiés: vous ne pouvez pas utiliser le mot-clé « static » sans le justifier. Les explications sont obligatoires. Toutes les fonctions et variables doivent être justifiées et expliquées. Prenez la peine de bien présenter votre code et de l'expliquer. Prenez le temps de réfléchir à ce qui se produit si un programmeur utilise un rayon de zéro ou un rayon négatif et expliquez comment votre code va se comporter dans de tels cas. Vous pouvez expliquer votre code comme vous le souhaitez, tant que vous êtes clair. Vous n'êtes pas obligé de mettre systématiquement des commentaires dans le code. Utilisez votre bon jugement afin de produire du code clair et facile à lire. Note: Il ne faut pas nous écrire pour nous demander d'expliquer ce que nous voulons dire par « expliquer ». </p>


<p>Si le code de votre solution n'est pas du Java valable, s'il ne compile pas, une note de zéro pourra être attribuée. Pour réussir ce cours, vous devez être capable d'écrire du code Java fonctionnel et correct.</p>

<ol>
<li>Votre classe n'a pas à inclure une méthode intitulée <tt>main</tt>. La méthode <tt>main</tt> est requise pour l'exécution d'un programme, mais n'est pas requise pour la compilation d'une classe. Toutes les classes Java doivent pouvoir compiler sans erreur, mais dans un projet logiciel, il peut n'y avoir qu'une seule fonction <tt>main</tt> (ou même aucune) et des milliers de classes.</li>

<li>Votre code doit contenir un constructeur. Un constructeur en Java est une fonction qui a le nom de la classe. Dans ce cas, puisque votre classe se nomme <tt>Cercle</tt>, le constructeur doit prendre le nom <tt>Cercle</tt>.</li>

<li>À part la méthode <tt>main</tt> que vous pouvez omettre, votre code ne devrait pas avoir besoin du mot-clé <tt>static</tt>.</li>
</ol>


<p>Attention: Vous devez remettre votre travail sous la forme d'un document PDF, et non comme un ensemble de fichiers Java. Pour faciliter la correction, assurez-vous qu'on puisse copier-coller du texte à partir du document PDF. N'utilisez pas des saisies d'écran.</p>

<p>Vidéo suggérée concernant le calcul de l'aire et du périmètre : </p>
<iframe width="560" height="315" src="https://www.youtube.com/embed/z9fvSc93azg" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<p>Vidéo suggérée concernant les classes et méthodes : </p>

<iframe width="560" height="315" src="https://www.youtube.com/embed/NXo2Pc1t2so" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>



<p><strong>Indice.</strong> Rendez-vous sur <a href="https://rc-inf1220.teluq.ca/">la page du robot conversationnel du cours</a> et saisissez l'énoncé dans la boîte de saisie: « <em>Veuillez créer une classe et ses méthodes permettant de calculer le périmètre d'un cercle et l'aire de la surface délimitée par le cercle. Vous devez avoir 3 méthodes : 1 constructeur recevant un rayon, la méthode de calcul de l'aire et la méthode de calcul du périmètre. La classe doit se nommer Cercle.</em> ».</p>


### Mettre en forme votre code Java


<p>Certains étudiants souhaitent publier leur code au sein de site web ou au sein de documents. Vous pouvez utiliser un site comme <a href="https://tohtml.com">tohtml.com</a> pour améliorer l'apparence de votre code Java. Certains éditeurs vous permettent aussi d'enjoliver votre code. </p>




## Question #2



<p>Un programmeur souhaite représenter la valeur 10.000000000000001 en Java. Il a écrit le programme suivant. Exécutez le programme et expliquez le résultat. Une explication de deux lignes peut suffire.</p>

{{<inlineJava path="Main.java" lang="java" >}}
class Main {
  public static void main(String[] args) {
   double x =  10.000000000000001;
   System.out.println(x);
  }
}
{{</inlineJava>}}

<p>Indice 1 : La lecture complète des notes de cours est obligatoire comme préparation aux travaux notés.</p>

<p>Indice 2 : On vous invite à consulter l'article Wikipédia concernant <a href="https://fr.wikipedia.org/wiki/IEEE_754">la norme IEEE 754</a>.</p>

<p>Indice 3 : Essayez différentes valeurs pour voir ce qui se produit.</p>



<iframe width="560" height="315" src="https://www.youtube.com/embed/Gi-LtqUTfFo" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>




## Question #3


<p>Quelle sera la valeur de 'a' après les lignes de code suivantes et pourquoi :</p>

```java  {style=github}
int i = 3;
int a = i++;
```

## Question #4


<p>Quelle sera la valeur (de la variable chaine) affichée par la ligne System.out.println(chaine) du code ci-dessous et pourquoi ? Donner une réponse concise en quelques phrases.</p>

```java  {style=github}
public class TestMethode {
    
    public static void test(String test)
    {
        test = test+test;
    } 
    
    public static void main(String[] args) {
        
        String chaine ="test";
        
        test(chaine);
        
        System.out.println(chaine);

    }
    
}
```

## Question #5

<p>Quelle sera la valeur de la variable entier à la fin du code suivant et pourquoi ?</p>

```java  {style=github}
boolean a = false;
boolean b = false;
        
        	
int entier = (!a && (b | !a)) ? 10 : 20;
```

<p>Indice: Assurez-vous de bien lire sur les opérateurs en Java avant de faire cette question.</p>

## Question #6

Expliquez en détail la différence entre les deux mises en oeuvre suivantes. Votre explication doit inclure un exemple de code illustrant la différence entre les deux morceaux de code.


Premier code:

```java  {style=github}
public class Bonhomme {
  public static String nom;
  public Bonhomme(String n) {
    nom = n;
  }
}
```

Second code:

```java  {style=github}
public class Bonhomme {
  public String nom;
  public Bonhomme(String n) {
    nom = n;
  }
}
```


## En terminant

<p>Dans plusieurs cas, vos travaux sont corrigés par un « correcteur ». Il est possible que vous puissiez identifier cette personne en examinant le document de rétroaction que vous recevez au sein du portail étudiant. Vous ne devriez jamais joindre cette personne. Cette personne n'a pas comme mandat de répondre à vos questions suite à la correction. Vos courriels seront ignorés. Il faut plutôt joindre la personne qui vous encadre au sein du cours.</p>
