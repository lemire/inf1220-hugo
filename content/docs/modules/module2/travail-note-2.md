---
title: "Travail noté 2"
weight: 7
---

<h1>Travail noté 2 - Les types, opérateurs et méthodes</h1>

<p>Avant de faire le travail, assurez-vous d'avoir fait tous les exercices et toutes les lectures. Posez des questions au besoin. Ne commencez le travail que lorsque vous êtes certain de bien maîtriser la matière.</p>


<p>Prenez note qu'<a href="https://rc-inf1220.teluq.ca/">il est permis d'utiliser le robot conversationnel du cours lors des travaux notés</a>. Cependant vous devez produire vos propres réponses et vos propres analyses.</p>

<h2>Les reports de la date de fin de cours</h2>


<p><strong>Rappel</strong>: le professeur ne peut pas modifier votre date de fin de cours  peu importe votre situation. Le moment après la date de fin de cours où votre dossier est fermé et où vous recevez (éventuellement) un incomplet est géré par l'Université. Il est de votre responsabilité de bien planifier votre temps.  Si vous avez des problèmes personnels qui limitent vos progrès (maladie, deuil, etc.), il faut voir avec l'Université: les professeurs n'ont aucune prise sur les dates de fin, sur les dates d'examen, etc.</p>


<p>Votre date de fin de cours est inscrite dans votre dossier et vous pouvez la trouver sur le portail étudiant et sur la documentation qu'on vous a remise lors de votre inscription. Il est possible que votre examen ait lieu des semaines ou même des mois après votre date de fin de cours: cela ne constitue pas une extension de votre date de fin de cours. Tout travail remis après votre date de fin de cours pourra recevoir la note de zéro. En tout temps, la note « incomplet » peut être attribuée à un travail qui n'est pas remis après votre date de fin de cours, même si vous n'avez pas encore passé l'examen.</p>
<h2>Instructions de dépôt du travail noté :</h2>
<p>Vous devez remettre ce travail dans un fichier PDF et déposer celui-ci sur le site de dépôt des travaux de la TÉLUQ : <a href="https://www.teluq.ca/depot-travaux-etudiant">http://www.teluq.ca/depot-travaux-etudiant</a>. Vous ne pouvez utiliser l'outil de dépôt qu'après le début de votre cours et avant la fin de votre cours, et seulement si vous avez été  inscript au cours. En aucun cas est-ce que nous pouvons recevoir vos travaux par courriel. Les travaux transmis par courriel au sein du cours INF 1220 ne seront pas corrigés et recevrons une note de zéro. Il pourrait n'y avoir aucun avertissement : le dépôt du travail dans les délais  est votre responsabilité. Si vous éprouvez des difficultés techniques avec l'outil de dépôt, vous devez joindre l'Université pour obtenir de l'aide. </p>


<p>Attention: une fois le travail remis dans l'outil de dépôt, vous ne pourrez pas le modifier. Vérifiez bien votre travail avec soin avant de le remettre. Relisez-vous deux fois plutôt qu'une.</p>

<p>Vous ne devez pas remettre des fichiers distincts Java. Vous devez inclure votre code dans le fichier PDF. Pour faciliter la correction, assurez-vous qu'on puisse copier-coller votre code à partir du document PDF. Si votre document ne permet pas de copier-coller le code, il pourra être refusé ou une note de zéro pourra être attribuée. Les travaux écrits à la main seront refusés. N'utilisez pas des saisies d'écran. </p>

<p>On veut que vous présentiez et expliquiez votre code. On ne veut pas que lire votre code, on ne veut pas lire que du Java... on veut du texte suivi en lien avec le code.  Il est important de comprendre que nous ne corrigeons pas en premier à partir de votre code Java. Nous voulons vraiment lire vos explications en français. La présentation de votre code est importante. Votre analyse de votre code et du problème est essentielle. Vos réponses aux questions doivent être précises et claires.</p>

<p>Vous devez donc rédiger du texte pour vous expliquer en utilisant des phrases complètes, des paragraphes, et ainsi de suite. Si vous ne remettez que du code informatique comme réponse à une question, une note de zéro pourra être accordée.</p>

<p> Vous devez rédiger des réponses personnelles. Vous ne pouvez pas, par exemple, vous contenter de recopier une partie des notes de cours ou du texte trouvé sur Internet.</p>

<p>Ceci dit, vous n’avez pas à utiliser Microsoft Word pour générer votre document PDF. Tout outil logiciel qui génère des fichiers PDF de qualité fera le travail.</p>
  <p>On s'attend à ce que vous fassiez des recherches sur le Web afin de réaliser ce travail. La recherche sur le Web est une activité essentielle en développement logiciel.</p>


  <p>Si vous avez des questions sur le travail, vous pouvez communiquer avec <a href="https://www.teluq.ca/siteweb/univ/dlemire.html">le professeur responsable</a>. Attention: nous ne donnons jamais d'indice (à quiconque) sur les travaux notés au-delà de ce qui est déjà dans l'énoncé (ce serait inéquitable).</p>

<p> Le cours comprend plusieurs exemples avec solutions. Par contre, les solutions des travaux notés ne sont jamais transmises dans ce cours: si vous avez des questions sur vos résultats, vous pouvez poser des questions au professeur.  Assurez-vous de poser des questions précises, et prenez le temps de consulter la rétroaction du correcteur. (Indice: si vous demandez les solutions suite à la correction de votre travail, vous nous indiquez que vous n'avez pas bien lu les consignes.)</p>

<p>Les travaux au sein de ce cours sont des travaux individuels. Il est strictement défendu de discuter du travail noté avec quiconque. En particulier, des échanges au sein de réseaux sociaux (Facebook, etc.) concernant ce travail peuvent constituer une faute académique. Vous pourriez obtenir la note de zéro ou recevoir une sanction allant jusqu'à l'exclusion du programme dans lequel vous êtes inscrit si vous avez des discussions en ligne au sujet des travaux notés de ce cours.</p>

<h1>Question #1</h1>

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


<h2>Mettre en forme votre code Java</h2>


<p>Certains étudiants souhaitent publier leur code au sein de site web ou au sein de documents. Vous pouvez utiliser un site comme <a href="https://tohtml.com">tohtml.com</a> pour améliorer l'apparence de votre code Java. Certains éditeurs vous permettent aussi d'enjoliver votre code. </p>




<h1>Question #2</h1>



<p>Un programmeur souhaite représenter la valeur 10.000000000000001 en Java. Il a écrit le programme suivant. Exécutez le programme et expliquez le résultat. Une explication de deux lignes peut suffire.</p>
<pre style='color:#000000;background:#ffffff;'>class Main <span style='color:#800080; '>{</span>
  public <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#800000; font-weight:bold; '>void</span> <span style='color:#400000; '>main</span><span style='color:#808030; '>(</span><span style='color:#603000; '>String</span><span style='color:#808030; '>[</span><span style='color:#808030; '>]</span> args<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
   <span style='color:#800000; font-weight:bold; '>double</span> x <span style='color:#808030; '>=</span>  <span style='color:#008000; '>10.000000000000001</span><span style='color:#800080; '>;</span>
   System<span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span>x<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>

<iframe height="400px" width="100%" src="https://repl.it/@lemire/Q2?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>

<p>Indice 1 : La lecture complète des notes de cours est obligatoire comme préparation aux travaux notés.</p>

<p>Indice 2 : On vous invite à consulter l'article Wikipédia concernant <a href="https://fr.wikipedia.org/wiki/IEEE_754">la norme IEEE 754</a>.</p>

<p>Indice 3 : Essayez différentes valeurs pour voir ce qui se produit.</p>



<iframe width="560" height="315" src="https://www.youtube.com/embed/Gi-LtqUTfFo" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>




<h1>Question #3</h1>


<p>Quelle sera la valeur de 'a' après les lignes de code suivantes et pourquoi :</p>

```java
int i = 3;
int a = i++;
```

<h1>Question #4</h1>


<p>Quelle sera la valeur (de la variable chaine) affichée par la ligne System.out.println(chaine) du code ci-dessous et pourquoi ? Donner une réponse concise en quelques phrases.</p>

```java
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

<h1>Question #5</h1>

<p>Quelle sera la valeur de la variable entier à la fin du code suivant et pourquoi ?</p>

```java
boolean a = false;
boolean b = false;
        
        	
int entier = (!a && (b | !a)) ? 10 : 20;
```

<p>Indice: Assurez-vous de bien lire sur les opérateurs en Java avant de faire cette question.</p>

<h1>Question #6</h1>

Expliquez en détail la différence entre les deux mises en oeuvre suivantes. Votre explication doit inclure un exemple de code illustrant la différence entre les deux morceaux de code.


Premier code:

```java
public class Bonhomme {
  public static String nom;
  public Bonhomme(String n) {
    nom = n;
  }
}
```

Second code:

```java
public class Bonhomme {
  public String nom;
  public Bonhomme(String n) {
    nom = n;
  }
}
```


<h2>En terminant</h2>
<p>Dans plusieurs cas, vos travaux sont corrigés par un « correcteur ». Il est possible que vous puissiez identifier cette personne en examinant le document de rétroaction que vous recevez au sein du portail étudiant. Vous ne devriez jamais joindre cette personne. Cette personne n'a pas comme mandat de répondre à vos questions suite à la correction. Vos courriels seront ignorés. Il faut plutôt joindre la personne qui vous encadre au sein du cours.</p>
