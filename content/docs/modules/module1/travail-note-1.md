---
title: "Travail noté 1"
weight: 12
---

# Travail noté 1 - Les algorithmes

Ce cours d’introduction à la programmation exige une gestion rigoureuse du temps et une préparation approfondie. Les étudiants doivent soumettre leurs travaux notés avant la date de fin de cours, indiquée dans le portail étudiant, sans possibilité de report sauf en cas de circonstances exceptionnelles validées par l’Université. La charge de travail est estimée à neuf heures par semaine sur quinze semaines, et les travaux, d’un niveau comparable à ceux d’autres universités, nécessitent plusieurs heures par activité. Les consignes soulignent l’importance de lire attentivement les énoncés, de tester rigoureusement ses solutions et de consacrer plus de temps à la vérification qu’à la production initiale. L’utilisation du robot conversationnel du cours est autorisée, mais les réponses doivent être personnelles.

Les travaux doivent être soumis en format PDF via l’outil de dépôt officiel de la TÉLUQ, sans envoi par courriel, sous peine de note zéro. Les consignes de présentation insistent sur la clarté, la lisibilité et l’usage d’un français correct, avec des explications détaillées en prose. Les corrections, disponibles sous cinq à dix jours ouvrables, sont accessibles uniquement via le portail étudiant, où les étudiants trouveront leur note et une rétroaction. Aucune solution n’est fournie, et les travaux sont strictement individuels, tout échange sur les réseaux sociaux pouvant entraîner des sanctions graves, y compris l’exclusion.

Pour réussir, les étudiants doivent présenter des solutions claires, précises et testées, accompagnées d’explications factuelles. La rigueur dans l’analyse et la vérification est cruciale, tout comme la réalisation préalable des exercices préparatoires. Les travaux notés évaluent la capacité à comprendre des énoncés logiques et à raisonner abstraitement, sans points attribués pour l’effort seul. Les étudiants sont encouragés à poser des questions sur la matière, à tester leurs solutions avec diverses données et à relire leur travail avant soumission, en évitant de commencer sans une maîtrise solide des concepts

## Premier problème

<p>
Nous souhaitons un algorithme qui détermine si la somme des éléments d'un tableau de nombres positifs excède 100. Par ailleurs, nous souhaitons un algorithme efficace: l'algorithme doit accéder à aussi peu d'éléments du tableau que possible. Produisez un pseudo-code précis et expliquez votre solution. Vous pouvez expliquer le code sous la forme que  vous  souhaitez, tant que vos explications sont claires. Exécutez votre pseudo-code sur au moins 5 cas, incluant les deux cas suivants: le tableau [55,55,55,55] et le tableau [1,2,3,5,6].</p>

<p>Vous devez exécuter votre pseudo-code ligne-par-ligne en indiquant à chaque ligne quelle est la valeur de toutes les variables. Votre exécution doit être rigoureuse. Si l'algorithme effectue 50 opérations, votre exécution devrait comprendre 50 lignes. </p>

<p>Vous devez produire du pseudo-code: du code informatique (par ex. Java ou Python) n'est pas accepté. Votre pseudo-code doit être précis et lisible.</p>

<p>Si vous produisez un algorithme logiquement incorrect, vous pourrez obtenir la note de zéro pour cette question. Si vous omettez d'inclure un compte-rendu détaillé de l'exécution, vous pouvez obtenir la note de zéro.</p>

{{% hint info %}}

### Indices concernant le premier problème

Voici quelques indices concernant l'énoncé que vous pouvez prendre en compte pour vous aider. Un indice n'est jamais une question supplémentaire, un ajout à la question, ou une seconde partie. Un indice ne sert qu'à vous inspirer ou à vous aider.  Vous pouvez complètement ignorer les indices. Les indices ne visent qu'à vous aider si vous le souhaitez.
<ol>
<li><strong>Indice 1.</strong> Rendez-vous sur <a href="https://rc-inf1220.teluq.ca/">la page du robot conversationnel du cours</a> et saisissez l'énoncé dans la boîte de saisie: «&nbsp;<em>Nous souhaitons un algorithme qui détermine si la somme des éléments d’un tableau de nombres positifs excède 100. Par ailleurs, nous souhaitons un algorithme efficace: l’algorithme doit accéder à aussi peu d’éléments du tableau que possible. Produisez un pseudo-code précis et expliquez votre solution. Vous pouvez expliquer le code sous la forme que vous souhaitez, tant que vos explications sont claires. Exécutez votre pseudo-code sur au moins 5 cas, incluant les deux cas suivants: le tableau [55,55,55,55] et le tableau [1,2,3,5,6].</em>&nbsp;».</li>
<li><strong>Indice 2.</strong> Votre algorithme doit retourner soit vrai, soit faux.</li>
<li><strong>Indice 3.</strong> Votre algorithme doit fonctionner même si le tableau a une longueur de zéro.</li>
<li><strong>Indice 4.</strong> Votre algorithme doit fonctionner même si le tableau contient mille milliards d'éléments.</li>
<li><strong>Indice 5.</strong> Imaginez qu'on vous donne ce problème. On vous donne un tableau de grande taille (contenant, disons, un million d'éléments) contenant des valeurs positives et on vous demande de déterminer, le plus rapidement possible, si la somme des valeurs du tableau excède 100. Que feriez-vous? Expliquez de façon précise ce que vous feriez dans cette situation. (Il s'agit d'un indice pour vous aider à répondre à l'énoncé, pas une nouvelle question. Le tableau qu'on vous invite à imaginer n'est pas un second tableau ou un tableau supplémentaire par rapport à l'énoncé.) </li>
<li><strong>Indice 6.</strong> Commencez par le pseudo-code suivant qui calcule la somme des éléments d'un tableau. 

```text
Entrées :
Tableau de nombres positifs :  tableau

Variables :
Nombre entier : iterateur = 0;

Sorties :
Nombre : somme = 0;

TANT QUE iterateur < la longueur de tableau FAIRE
       somme = somme + tableau[iterateur];
       iterateur = iterateur + 1;
FIN TANT QUE
```

(Vous n'êtes pas obligé de partir de ce pseudo-code. Il s'agit d'un indice, d'une suggestion. Ce bout de pseudo-code n'introduit pas une question supplémentaire. Le tableau qu'on y trouve n'est pas un second tableau en plus de celui de l'énoncé.)
</li>
<li><strong>Indice 7.</strong> Ce n'est pas un problème de programmation Java, C#, C++ ou Python. Vous devez produire du pseudo-code qui est destiné à être lu et compris par un être humain. Il n'est pas nécessaire d'utiliser les constructions et types propres Java, C#, C++ ou Python. </li>
<li><strong>Indice 8.</strong> Beaucoup trop d'étudiants essaient de faire ce travail sans avoir fait tous les exercices sérieusement. Si vous avez analysé et compris les exercices préparatoires pour ce problème, vous ne devriez avoir aucune difficulté. Il est pratiquement impossible de ne pas arriver à faire ce problème en ayant fait tous les exercices solutionnés et en ayant bien compris toutes les solutions. Il est de votre responsabilité de faire tous les exercices.</li>
</ol>
{{% /hint %}}


## Second problème

Nous souhaitons afficher les nombres entiers de 0 jusqu'à 100 à l'écran (incluant 0 mais excluant 100), en affichant "Fizz" quand le nombre est divisible par 3 et "Buzz" quand le nombre est divisible par 5. 

```text
...
2
3 Fizz
4
5 Buzz
6 Fizz
...
```

Un étudiant nous a offert la solution suivante. Elle est incorrecte. Pour les fins de ce travail, vous pouvez ignorer  la mise en page de la sortie (polices de caractères, espaces, etc.). L'erreur de l'étudiant est logique et non pas cosmétique.

Expliquez l'erreur et offrez une version corrigée. Exécutez votre pseudo-code corrigé, ainsi que le pseudo-code original.  Expliquez les différences. <strong>Vous devez exécuter votre pseudo-code</strong>. Puisqu'il y a peut-être des dizaines d'itérations à calculer, vous pouvez résumer l'exécution sans aller dans chaque détail de chaque itération.

Votre explication de l'erreur doit être claire et limpide. Si vous ne montrez pas que vous avez bien compris l'erreur et que vous êtes capable de l'expliquez clairement, vous pourrez recevoir une note de zéro pour cette question.

```
Entrées :
Valeur maximale :  100;

Variables :
Nombre entier : iterateur = 0;

Sorties : à l'écran


TANT QUE iterateur < 100 FAIRE
       affiche la valeur de iterateur à l'écran
       SI iterateur est divisible par 3 ALORS
         affiche " Fizz"  à l'écran
       SINON SI iterateur est divisible par 5 ALORS
         affiche " Buzz"  à l'écran
       FIN SI
       change de ligne à l'écran
       iterateur = iterateur + 1
FIN TANT QUE
```

{{% hint info %}}


<p><strong>Indice.</strong> Rendez-vous sur <a href="https://rc-inf1220.teluq.ca/">la page du robot conversationnel du cours</a> et saisissez l'énoncé dans la boîte de saisie: «&nbsp;<em>Nous souhaitons afficher les nombres entiers de 0 jusqu'à 100 à l'écran (incluant 0 mais excluant 100), en affichant "Fizz" quand le nombre est divisible par 3 et "Buzz" quand le nombre est divisible par 5. Expliquez l'erreur dans ce pseudocode: TANT QUE iterateur < 100 FAIRE affiche la valeur de iterateur à l'écran SI iterateur est divisible par 3 ALORS affiche " Fizz" à l'écran SINON SI iterateur est divisible par 5 ALORS affiche " Buzz" à l'écran FIN SI change de ligne à l'écran iterateur = iterateur + 1 FIN TANT QUE</em>&nbsp;».</p>

{{< youtube id="4jReEOCImds" >}}


{{% /hint %}}



<p>Notez: le cours comprend plusieurs liens vers des vidéos et autres ressources externes. Ces ressources sont toujours optionnelles.</p>



## En terminant


<p>Dans plusieurs cas, vos travaux sont corrigés par un «&nbsp;correcteur&nbsp;». Il est possible que vous puissiez identifier cette personne en examinant le document de rétroaction que vous recevez au sein du portail étudiant. Vous ne devriez jamais joindre cette personne. Cette personne n'a pas comme mandat de répondre à vos questions suite à la correction. Vos courriels seront ignorés. Il faut plutôt joindre la personne qui vous encadre au sein du cours.</p>

<p>Il est inutile de nous écrire pour obtenir des indices, des exemples de solutions, des pistes de départ, etc. Dans ce cours, nous n'offrons aucun indice par courriel.</p>

<p>Il s'agit d'un travail noté individuel.</p>
</div>