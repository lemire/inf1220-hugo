---
title: "Les algorithmes"
weight: 5
---

<!-- Ajoutez ici le contenu HTML de l'activité 1.2 -->

<h2 class="partie2">Les algorithmes</h2>

<blockquote><em>The etymology of program is pro ‘before’ + graphein ‘write’. I think of programming as making a plan that will be executed in the future, something that every human does from time to time. The hard part is that a computer has to execute the plan, and computers are incredibly stupid. Dealing with such stupidity requires more patience and determination than many people have.</em> (Peter Turney)</blockquote>



<p><a id="prealables" ></a></p>
<h2>Préalables</h2>

<p>Nous supposons dans ce cours que vous avez complété les mathématiques du collégial et que vous avez de bonnes aptitudes en ce qui a trait aux raisonnements formels. Dans ce premier module, vous aurez à exprimer la solution de certains problèmes en terme de variables, de boucles et d'embranchement. Il ne s'agit pas de notions avancées : vous devriez être familier avec ces notions. Les boucles font partie implicitement du calcul d'une somme ou d'un produit scalaire. Les variables en informatique sont une notion voisine des variables en algèbre. Les embranchements sont des notions de base en logique élémentaire. </p>

<p>Nous supposons une maîtrise de ces notions. Vous êtes responsables de vous assurez que vous avez la préparation nécessaire pour suivre le cours INF 1220.</p>
<p><a id="intro" ></a></p>
<h2>Introduction</h2>

<p>Le processus systématique de résolution d'un problème donné s'appelle algorithme. La notion d'algorithme formel est vue dans le cadre des cours de mathématiques du  secondaire, notamment dans le contexte de <a href="https://www.alloprof.qc.ca/fr/eleves/bv/mathematiques/la-chaine-de-poids-minimal-m1010">la théorie des graphes</a> et des algorithmes d'optimisation. Comme point de départ dans le cours INF 1220, nous revisitons et approfondissons brièvement cette notion fondamentale.</p>

<p>Un algorithme est donc une suite d'actions pour répondre à un problème de traitement de l'information. Ces actions peuvent être mathématiques (ex. somme = a + b), de contrôles (ex. SI a > b ALORS) ou d'itérations (ex. TANT QUE a > b FAIRE). Pour décrire ces algorithmes, il existe également plusieurs formalismes, certains utiliseront des formalismes mathématiques alors que d'autres utiliseront des pseudo-codes. Encore là dans plusieurs formats pour représenter un pseudo-code, il n'existe pas de normes uniques! </p>

<p>En cuisine, une recette est un exemple d'algorithme si celle-ci comporte une séquence d'instructions précises. Pouvoir rédiger de manière précise une recette afin que d'autres cuisiniers puissent reproduire la même séquence d'opération est de facto de la programmation informatique. Si vous avez fait l'expérience du manuel de recette de quelqu'un d'autre (par ex., votre grand-mère), vous avez peut-être découvert qu'il peut être difficile de suivre des consignes de quelqu'un d'autre surtout quand celles-ci ne sont pas suffisamment précises. Une recette de cuisine est du pseudo-code.</p>

<p>Avant l'invention du GPS, il était commun d'expliquer à des amis ou des parents comment se rendre à un lieu donné en suivant une série d'instructions. Il arrivait souvent, malheureusement, que ces instructions n'étaient pas assez précises et que les gens se perdent. Expliquer à quelqu'un comment se rendre à un lieu donné est un exemple de programmation informatique. Votre explication est du pseudo-code.</p>

<p>Il est essentiel de comprendre ce qu'est le pseudo-code: il s'agit d'une façon de décrire un algorithme afin que d'autres êtres humains puissent vous comprendre. Il faut donc interpréter le pseudo-code en utilisant son jugement humain de la même façon que vous interprétez tout autre texte ou discours. Pouvoir lire un algorithme, décrit en pseudo-code, est une compétence essentielle en informatique. Il faut être capable de comprendre d'autres informaticiens sans nécessairement exiger que ceux-ci utilisent du code informatique dans un langage particulier (par ex., Java). Programmer et faire de l'informatique exige de pouvoir bien communiquer avec les autres informaticiens indépendamment de langages de programmation spécifiques.</p>


<p>Pour un programmeur d'expérience, s'exprimer à l'aide d'un pseudo-code est chose aisée. Pour le commun des mortels, c'est un peu plus difficile. La blague suivante illustre le problème.</p>

<blockquote>Une femme demande à son programmeur de mari : « Va au supermarché acheter une bouteille de lait. Et si ils ont des œufs, prends en 6 ». Le mari revient avec six bouteilles de lait. Sa femme lui demande pourquoi il a pris six bouteilles. « Parce qu'ils avaient des oeufs » répond-il.</blockquote>

<p>Quand on rédige un pseudo-code, il faut tout spécifier, comme si on s'adressait à quelqu'un qui prend tout littéralement, sans aucun jugement. Pour devenir un programmeur, pour penser comme un programmeur, il faut s'habituer à rédiger des séquences d'instructions précises. La lecture et la rédaction de pseudo-codes relativement simples peut être une bonne pratique.</p>

<p>Le pseudocode est destiné à être lu par l'humain, et il peut être écrit de diverses manières tant que l'humain le comprend. Le cours ne vise pas à vous permettre de comprendre une syntaxe particulière de pseudocode,  mais bien le pseudocode en général.</p>




<h4>En résumé: Qu'est-ce qu'un algorithme ?</h4>
<p>Un <strong>algorithme</strong> est une suite finie et ordonnée d'instructions permettant de résoudre un problème ou d'accomplir une tâche spécifique. Il s'agit d'une méthode systématique, exprimée de manière précise, qui garantit un résultat correct lorsqu'elle est exécutée. Les algorithmes sont au cœur de l'informatique, car ils décrivent comment un programme doit fonctionner pour atteindre un objectif.</p>
<p>Exemples d'algorithmes dans la vie quotidienne :</p>
<ul>
    <li>Une recette de cuisine (série d'étapes pour préparer un plat).</li>
    <li>Les instructions pour assembler un meuble.</li>
</ul>
<p>En informatique, un algorithme peut, par exemple, trier une liste de nombres ou calculer le chemin le plus court entre deux points.</p>

<h4>En résumé: Qu'est-ce que le pseudo-code ?</h4>
<p>Le <strong>pseudo-code</strong> est une manière d'écrire un algorithme en utilisant un langage simplifié, proche du langage naturel, mais structuré comme un programme informatique. Il n'est pas destiné à être exécuté directement par un ordinateur, mais sert à décrire la logique d'un algorithme de manière claire et compréhensible, indépendamment d'un langage de programmation spécifique.</p>
<p>Le pseudo-code utilise des conventions comme :</p>
<ul>
    <li><code>SI</code>, <code>ALORS</code>, <code>SINON</code> pour les conditions.</li>
    <li><code>POUR</code>, <code>TANT QUE</code> pour les boucles.</li>
    <li>Des instructions comme <code>écrire</code> ou <code>lire</code> pour les entrées/sorties.</li>
</ul>
<p>Exemple de pseudo-code pour calculer la somme de deux nombres :</p>
<pre>
lire nombre1
lire nombre2
somme ← nombre1 + nombre2
écrire somme
        </pre>
<p>Le pseudo-code permet aux programmeurs de planifier la logique avant de la traduire dans un langage comme Python, C++ ou Java.</p>

<p>En résumé, un algorithme est une méthode pour résoudre un problème, tandis que le pseudo-code est un outil pour exprimer cet algorithme de manière claire et universelle. Ces deux concepts sont essentiels pour concevoir des solutions informatiques efficaces.</p>

<iframe width="560" height="315" src="https://www.youtube.com/embed/1ANpkDxJHo4" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>


<h4> Terminologie de base </h4>

<p>Un algorithme prend habituellement des données et produit un résultat.  Par exemple, un algorithme cherchant à déterminer si un nombre est pair, pourra recevoir un nombre en paramètre et il pourra produire comme réponse une valeur Booléenne (vrai ou faux). Un même algorithme va donc généralement pouvoir être exécuté sur différentes données et pouvoir fournir des réponses différentes. En ce sens, une fonction (au sens mathématique) comme f(x) = a x + b peut être décrite comme étant un algorithme. Une fonction doit toujours produire la même valeur étant donnée les mêmes données. Un algorithme n'est pas limité de cette manière. Par exemple, un algorithme pourrait servir à choisir un nom aléatoirement au sein d'une liste. D'une exécution à l'autre, l'algorithme pourrait produire des valeurs différentes avec les mêmes données. </p>



<p>La plupart des algorithmes en pratique sont itératifs. Une itération est la répétition d'un processus. Si vous devez teindre une clôture, vous allez peut-être teindre chaque planche une à une. Nous dirons alors que vous itérez sur les planches. Mais comment saurez-vous où vous êtes rendu si vous prenez une pause? Peut-être pourrez-vous poser un petit drapeau sur la planche que vous êtes en train de teindre. On dira alors que le drapeau est un itérateur, c'est-à-dire un indicateur de votre progrès dans votre itération. À chaque étape où vous déplacez le drapeau d'une planche à l'autre, nous pourrons dire que vous incrémentez la position du drapeau. Si jamais vous deviez faire un retour à la planche précédente, nous dirons que vous décrémentez le drapeau.</p>
<p>En informatique, nous n'utilisons pas de drapeaux physiques. Pour savoir où on est rendu, on utilise des compteurs, le plus souvent des valeurs entières. Quand on dit qu'on incrémente un entier, on veut généralement dire qu'on ajoute "1" à sa valeur.</p>

<p>Nous obtenons alors la notion de boucle: nous effectuons une tâche donnée tant qu'une condition n'est pas satisfaite. Cette vidéo présente le concept de boucle:</p>

<iframe width="560" height="315" src="https://www.youtube.com/embed/HMlQEc6uPGU" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>


<p>En informatique on fait souvent référence à la notion d'impression à l'écran. Le plus souvent cela fait référence à l'affichage à l'écran d'un message ou d'un texte.</p>

<h4> Calcul de la moyenne </h4>

<p>Pour illustrer la notion de pseudo-code, commençons par un exemple relativement simple.</p>
<p>Supposons que nous avons un tableau de notes (par ex., les notes 10.4, 12.6, 18.7, 5.0) et que nous désirons calculer la moyenne. On utilise le convention que si le tableau se nomme 'notes', alors la première note (par ex., 10.4) est notes[0], la seconde note est notes[1]... et ainsi de suite jusqu'à notes[3]. Évidemment, dans ce cas, on sait qu'il y'a 4 notes, mais il plus pratique d'écrire le pseudo-code de manière générale. On fera donc référence à la longueur du tableau (au nombre d'éléments qu'il contient) comme étant un paramètre. Pour visiter tous les éléments, on peut initialiser une valeur entière à 0, et l'incrémenter de 1 tant qu'elle demeure plus petite que la longueur du tableau.</p>

{{< webapp path="moyenne.html" >}}

<p>Observez comment on termine la boucle "TANT QUE" avec une ligne "FIN TANT QUE". Ce n'est pas nécessaire, mais vous devez être clair et précis quant au début et à la fin de vos opérations. On peut aussi indiquer le début et la fin d'une boucle avec l'indentation, ou tout autre moyen compris par les êtres humains.</p>
<p>L'expression "TANT QUE" est associée à une condition qui peut être vraie ou fausse. L'exécution se poursuit tant que l'expression est vraie, et elle se termine lorsque l'expression est fausse.</p>




<h4> Compter le nombre de voyelles d'un mot entrées au clavier </h4>

Exécutez ce pseudocode&nbsp;:

{{< webapp path="voyelles.html" >}}



<p>Note: observez comment on termine la condition  "SI" avec une ligne "FIN SI".</p>


<p>Note: observez comment l'algorithme comprend comme consigne l'impression à l'écran d'un résultat. Il s'agit implicitement d'un résultat ou d'une conséquence de l'algorithme.</p>

<h1><a id="concevoir" ></a></h1>
<h2> Concevoir un algorithme </h2>

<p>Afin de concevoir un algorithme, il s'agit de bien analyser le problème en identifiant les entrées, les sorties et le traitement des données pour en arriver aux résultats escomptés. Il faut voir l'algorithme comme une solution pas à pas que n'importe quel programmeur pourrait reprendre et implémenter dans un langage spécifique tel que le Java, le C++ ou le Python. En général, pour concevoir un algorithme, il faut suivre les étapes suivantes : </p>
Étape 1
<ul>
	<li>Lire et bien comprendre l’énoncé du problème à résoudre.</li>
</ul>
Étape 2
<ul>
<li>Définir les résultats du problème, c'est-à-dire les sorties.</li>

<li>Définir les données du problème, c'est-à-dire les entrées.</li>

<li>Définir le traitement, c'est-à-dire les relations permettant d’obtenir les résultats à partir des données.</li>
</ul>
Étape 3
<ul>
	<li>Écrire l’algorithme en respectant la structure pseudo-code.</li>
</ul>

<p><a id="syntaxe" ></a></p>
<h2> Syntaxe d'un algorithme </h2>

<p> Voici un aperçu des différents éléments pouvant être utilisés pour proposer une résolution à un problème sous la forme d'algorithme. Comme nous l'avions spécifié précédemment, il n'y a pas de normes strictes dans l'écriture d'un pseudo-code (en comparaison à un langage de programmation qui est stricte). L'essentiel est d'utiliser les structures présentées ci-bas, d'être concis et exact dans les instructions. S'il y a un doute sur la concision ou bien la compréhension d'une étape de l'algorithme, c'est peut-être que cette étape doit être subdivisée en plusieurs sous-étapes.

<h3> Les Entrées, Variables et Sorties </h3>

<p> Un algorithme commence par la déclaration des données en entrées, c'est à dire les données qui sont soit fournies d'emblée à l'algorithme (ex. un texte à déchiffrer, des données financières à analyser) ou bien fournies par un utilisateur (ex. via le clavier, souris, etc.).</p>
<p>Par la suite, il est nécessaire de déclarer les variables de travail de l'algorithme. Une variable a un nom et une valeur. Par exemple, la variable x peut avoir la valeur 1. La valeur d'une variable peut changer dans le temps. Ces variables sont utilisées essentiellement pour conserver des informations nécessaires au traitement effectué par l'algorithme. Les variables peuvent avoir plusieurs types... par exemple, une variable peut contenir des chaînes de caractères, d'autres variables peuvent ne contenir que des entiers, etc. </p>
<p>Enfin, les sorties sont les données qui sont les résultats du traitement effectué par l'algorithme. Ces sorties sont retournées soit à l'utilisateur, soit à d'autres algorithmes. En effet, il est possible de diviser la résolution de problèmes complexes en plusieurs algorithmes qui peuvent "s'appeler" entre eux. Nous ferons plus tard le parallèle entre un algorithme et une fonction dans un langage de programmation.</p>

<h3> Les opérations  </h3>

<p>On décrit généralement un algorithme comme une liste d'opérations. Par exemple, on peut prendre deux nombres et les additionner. On peut ajouter 1 à la valeur d'une variable. Les opérations permises dépendent de notre modèle de calcul. On fait cependant souvent certaines hypothèses: on suppose que la plupart des opérations mathématique de bases sont supportées (addition, comparaison, multiplication, soustraction, etc.). </p>

<p>Il y a plusieurs manières d'exprimer les opérations. Par exemple, la multiplication de deux variables peut s'exprimer avec les expressions <tt>x * y </tt>, <em>x y </em>, <tt>x &times; y </tt>, <em>x</em> &times; <em>y</em>, etc. Il y a plusieurs manières de noter ces opérations. Par exemple, l'expression <tt>x &larr; 1</tt> peut être utilisée pour assigner la valeur 1 à la variable <tt>x</tt>. On peut aussi tout simplement écrire <tt>x = 1</tt>. Dans un autre contexte, l'expression <tt>x = 1</tt> pourrait aussi désigner la comparaison (« est-ce que x vaut 1 ? »). 
En s'inspirant de certains langages de programmation, on peut aussi utiliser une expression telle que <tt>x == 1</tt> pour indiquer que nous faisons une comparaison avec la valeur 1 (et non une assignation).
L'important est que l'intention soit claire et précise pour l'être humain qui vous lit.</p>

<h3> Les structures de contrôle alternatives (l'embranchement)</h3>

<p>On peut concevoir un algorithme qui ne comprend qu'une liste d'opérations simples (addition, soustraction, etc.). Cependant sans structures de contrôle, nous auront du mal à gérer les données dynamiques, par exemple un tableau qui peut contenir un nombre variable d'éléments, et on risque de devoir répéter beaucoup d'opérations.</p>
<p>Les structures de contrôle permettent à l'algorithme de faire des choix de traitement en fonction de conditions. On peut également parler de branchement, terme provenant des premiers ordinateurs où les sorties de cartes de contrôle correspondaient littéralement à des câbles menant à d'autres composantes de l'ordinateur. Une structure de contrôle correspond à l'action de tester des variables de contrôle et selon les résultats d'effectuer des opérations ou non. En pratique, ces structures correspondent à poser des questions avec la syntaxe suivante : SI conditions ALORS opérations FIN SI. Il peut y avoir plusieurs conditions dans une structure de contrôle et la logique booléenne est utilisée pour les construire. Par exemple, SI a est égal 0 ET b est égal 1 ALORS faire c FIN SI. </p> 

<p>Dans la notion de pseudo-code, il est également possible de faire une suite de structures de contrôle avec la syntaxe suivante : SI conditionA ALORS opérations SINON SI conditionB ALORS opérations SINON SI conditionC ALORS [et ainsi de suite] FIN SI. Voici un exemple d'utilisation des structures de contrôle plus riche :</p>

{{< webapp path="age.html" >}}


<h3> Les structures de contrôle itératives (la boucle) </h3>

<p>Il arrive régulièrement dans la résolution d'un problème qu'il est nécessaire de réaliser à plusieurs reprises une ou des opérations sur un ensemble de données. Par exemple, supposons qu'il est nécessaire de trouver le plus petit nombre dans un tableau d'entiers. Il sera forcément nécessaire d'itérer dans le tableau, une ligne à la fois, et de comparer les nombres entre eux. Pour ce faire, nous utiliserons deux éléments de syntaxe, soit le TANT QUE _ FAIRE ou bien le POUR TOUT _ FAIRE. Voici deux exemples de l'utilisation de ces deux approches :
<div style="max-width: 800px; margin: 0 auto; background-color: #ffffff; padding: 24px; border-radius: 8px; box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);">
        <h1 style="font-size: 24px; font-weight: bold; margin-bottom: 16px; color: #1f2937;">Exécution des Pseudocodes de Recherche du Minimum</h1>
        <p style="margin-bottom: 16px; color: #4b5563;">
            Cette page décrit l'exécution détaillée de deux pseudocodes qui trouvent le minimum dans un tableau d'entiers. Pour l'exemple, nous utilisons le tableau <code>tableau = [7, 3, 9, 1, 5]</code>.
        </p>

<div style="background-color: #f9fafb; padding: 16px; border: 1px solid #e5e7eb; border-radius: 8px;">
    <!-- Pseudocode 1 -->
    <h2 style="font-size: 18px; font-weight: bold; color: #374151; margin-bottom: 12px;">Pseudocode 1 : Boucle POUR TOUT</h2>
    <pre style="background-color: #e6f4ea; padding: 12px; border: 1px solid #15803d; border-radius: 4px; font-family: monospace; font-size: 14px; color: #374151;">
Entrées :
Tableau d'entiers : tableau[100]

Sorties :
Entier minimum

minimum = tableau[0]
POUR TOUT Entier e de tableau FAIRE
    SI e < minimum ALORS
        minimum = e;
    FIN SI
FIN POUR TOUT
            </pre>

<h3 style="font-size: 16px; font-weight: bold; color: #374151; margin: 16px 0 12px;">Exécution détaillée (tableau = [7, 3, 9, 1, 5])</h3>

<div style="margin-bottom: 16px;">
    <h4 style="font-size: 14px; font-weight: bold; color: #374151; margin-bottom: 8px;">Initialisation</h4>
    <p style="color: #374151; font-size: 14px;">La variable est initialisée comme suit :</p>
    <ul style="list-style: disc; padding-left: 20px; color: #374151; font-size: 14px;">
        <li><code>tableau = [7, 3, 9, 1, 5]</code> (longueur = 5)</li>
        <li><code>minimum = tableau[0] = 7</code></li>
    </ul>
</div>

<div style="margin-bottom: 16px;">
    <h4 style="font-size: 14px; font-weight: bold; color: #374151; margin-bottom: 8px;">Boucle POUR TOUT</h4>
<p style="color: #374151; font-size: 14px;">La boucle itère sur chaque élément <code>e</code> du tableau :</p>

<div style="margin-bottom: 12px;">
    <p style="font-weight: bold; color: #374151; font-size: 14px;">Itération 1 (e = 7)</p>
    <ul style="list-style: disc; padding-left: 20px; color: #374151; font-size: 14px;">
        <li>Comparer <code>7 < 7</code> ? Non, <code>minimum</code> reste <code>7</code>.</li>
    </ul>
</div>

<div style="margin-bottom: 12px;">
    <p style="font-weight: bold; color: #374151; font-size: 14px;">Itération 2 (e = 3)</p>
    <ul style="list-style: disc; padding-left: 20px; color: #374151; font-size: 14px;">
        <li>Comparer <code>3 < 7</code> ? Oui, mettre à jour <code>minimum = 3</code>.</li>
    </ul>
</div>

<div style="margin-bottom: 12px;">
    <p style="font-weight: bold; color: #374151; font-size: 14px;">Itération 3 (e = 9)</p>
    <ul style="list-style: disc; padding-left: 20px; color: #374151; font-size: 14px;">
        <li>Comparer <code>9 < 3</code> ? Non, <code>minimum</code> reste <code>3</code>.</li>
    </ul>
</div>

<div style="margin-bottom: 12px;">
    <p style="font-weight: bold; color: #374151; font-size: 14px;">Itération 4 (e = 1)</p>
    <ul style="list-style: disc; padding-left: 20px; color: #374151; font-size: 14px;">
        <li>Comparer <code>1 < 3</code> ? Oui, mettre à jour <code>minimum = 1</code>.</li>
    </ul>
</div>

<div style="margin-bottom: 12px;">
    <p style="font-weight: bold; color: #374151; font-size: 14px;">Itération 5 (e = 5)</p>
    <ul style="list-style: disc; padding-left: 20px; color: #374151; font-size: 14px;">
        <li>Comparer <code>5 < 1</code> ? Non, <code>minimum</code> reste <code>1</code>.</li>
    </ul>
</div>
</div>

<div style="margin-bottom: 16px;">
    <h4 style="font-size: 14px; font-weight: bold; color: #374151; margin-bottom: 8px;">Résultat</h4>
    <p style="color: #15803d; font-size: 14px; font-weight: bold;">Le minimum du tableau est : 1</p>
</div>

<div style="margin-bottom: 16px;">
    <h4 style="font-size: 14px; font-weight: bold; color: #374151; margin-bottom: 8px;">Résumé des étapes</h4>
    <table style="width: 100%; border-collapse: collapse; font-size: 14px; color: #374151;">
        <tr style="background-color: #e6f4ea; border: 1px solid #15803d;">
            <th style="padding: 8px; border: 1px solid #15803d;">Itération</th>
            <th style="padding: 8px; border: 1px solid #15803d;">e</th>
            <th style="padding: 8px; border: 1px solid #15803d;">minimum</th>
        </tr>
        <tr style="border: 1px solid #e5e7eb;">
            <td style="padding: 8px; border: 1px solid #e5e7eb;">Initialisation</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">-</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">7</td>
        </tr>
        <tr style="border: 1px solid #e5e7eb;">
            <td style="padding: 8px; border: 1px solid #e5e7eb;">1</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">7</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">7</td>
        </tr>
        <tr style="border: 1px solid #e5e7eb;">
            <td style="padding: 8px; border: 1px solid #e5e7eb;">2</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">3</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">3</td>
        </tr>
        <tr style="border: 1px solid #e5e7eb;">
            <td style="padding: 8px; border: 1px solid #e5e7eb;">3</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">9</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">3</td>
        </tr>
        <tr style="border: 1px solid #e5e7eb;">
            <td style="padding: 8px; border: 1px solid #e5e7eb;">4</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">1</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">1</td>
        </tr>
        <tr style="border: 1px solid #e5e7eb;">
            <td style="padding: 8px; border: 1px solid #e5e7eb;">5</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">5</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">1</td>
        </tr>
    </table>
</div>

<!-- Pseudocode 2 -->
<h2 style="font-size: 18px; font-weight: bold; color: #374151; margin: 24px 0 12px;">Pseudocode 2 : Boucle TANT QUE</h2>
<pre style="background-color: #e6f4ea; padding: 12px; border: 1px solid #15803d; border-radius: 4px; font-family: monospace; font-size: 14px; color: #374151;">
Entrées :
Tableau d'entiers : tableau[100]

Sorties :
Entier minimum

minimum = tableau[0]
Entier iterateur = 0;
TANT QUE iterateur < 100 FAIRE
    SI tableau[iterateur] < minimum ALORS
        minimum = tableau[iterateur];
    FIN SI
    iterateur = iterateur + 1;
FIN TANT QUE
            </pre>

<h3 style="font-size: 16px; font-weight: bold; color: #374151; margin: 16px 0 12px;">Exécution détaillée (tableau = [7, 3, 9, 1, 5])</h3>

<div style="margin-bottom: 16px;">
    <h4 style="font-size: 14px; font-weight: bold; color: #374151; margin-bottom: 8px;">Initialisation</h4>
    <p style="color: #374151; font-size: 14px;">Les variables sont initialisées comme suit :</p>
    <ul style="list-style: disc; padding-left: 20px; color: #374151; font-size: 14px;">
        <li><code>tableau = [7, 3, 9, 1, 5]</code> (longueur = 5)</li>
        <li><code>minimum = tableau[0] = 7</code></li>
        <li><code>iterateur = 0</code></li>
    </ul>
</div>

<div style="margin-bottom: 16px;">
    <h4 style="font-size: 14px; font-weight: bold; color: #374151; margin-bottom: 8px;">Boucle TANT QUE</h4>
    <p style="color: #374151; font-size: 14px;">La boucle s'exécute tant que <code>iterateur < 5</code> :</p>

<div style="margin-bottom: 12px;">
    <p style="font-weight: bold; color: #374151; font-size: 14px;">Itération 1 (iterateur = 0)</p>
    <ul style="list-style: disc; padding-left: 20px; color: #374151; font-size: 14px;">
        <li>Accéder à <code>tableau[0] = 7</code></li>
        <li>Comparer <code>7 < 7</code> ? Non, <code>minimum</code> reste <code>7</code>.</li>
        <li>Incrémenter <code>iterateur = 0 + 1 = 1</code></li>
    </ul>
</div>

<div style="margin-bottom: 12px;">
    <p style="font-weight: bold; color: #374151; font-size: 14px;">Itération 2 (iterateur = 1)</p>
    <ul style="list-style: disc; padding-left: 20px; color: #374151; font-size: 14px;">
        <li>Accéder à <code>tableau[1] = 3</code></li>
        <li>Comparer <code>3 < 7</code> ? Oui, mettre à jour <code>minimum = 3</code>.</li>
        <li>Incrémenter <code>iterateur = 1 + 1 = 2</code></li>
    </ul>
</div>

<div style="margin-bottom: 12px;">
    <p style="font-weight: bold; color: #374151; font-size: 14px;">Itération 3 (iterateur = 2)</p>
    <ul style="list-style: disc; padding-left: 20px; color: #374151; font-size: 14px;">
        <li>Accéder à <code>tableau[2] = 9</code></li>
        <li>Comparer <code>9 < 3</code> ? Non, <code>minimum</code> reste <code>3</code>.</li>
        <li>Incrémenter <code>iterateur = 2 + 1 = 3</code></li>
    </ul>
</div>

<div style="margin-bottom: 12px;">
    <p style="font-weight: bold; color: #374151; font-size: 14px;">Itération 4 (iterateur = 3)</p>
    <ul style="list-style: disc; padding-left: 20px; color: #374151; font-size: 14px;">
        <li>Accéder à <code>tableau[3] = 1</code></li>
        <li>Comparer <code>1 < 3</code> ? Oui, mettre à jour <code>minimum = 1</code>.</li>
        <li>Incrémenter <code>iterateur = 3 + 1 = 4</code></li>
    </ul>
</div>

<div style="margin-bottom: 12px;">
    <p style="font-weight: bold; color: #374151; font-size: 14px;">Itération 5 (iterateur = 4)</p>
    <ul style="list-style: disc; padding-left: 20px; color: #374151; font-size: 14px;">
        <li>Accéder à <code>tableau[4] = 5</code></li>
        <li>Comparer <code>5 < 1</code> ? Non, <code>minimum</code> reste <code>1</code>.</li>
        <li>Incrémenter <code>iterateur = 4 + 1 = 5</code></li>
    </ul>
</div>

<p style="color: #374151; font-size: 14px;">Fin de la boucle : <code>iterateur = 5</code>, qui n’est pas inférieur à 5, donc sortie.</p>
</div>

<div style="margin-bottom: 16px;">
    <h4 style="font-size: 14px; font-weight: bold; color: #374151; margin-bottom: 8px;">Résultat</h4>
    <p style="color: #15803d; font-size: 14px; font-weight: bold;">Le minimum du tableau est : 1</p>
</div>

<div style="margin-bottom: 16px;">
    <h4 style="font-size: 14px; font-weight: bold; color: #374151; margin-bottom: 8px;">Résumé des étapes</h4>
    <table style="width: 100%; border-collapse: collapse; font-size: 14px; color: #374151;">
        <tr style="background-color: #e6f4ea; border: 1px solid #15803d;">
            <th style="padding: 8px; border: 1px solid #15803d;">Itération</th>
            <th style="padding: 8px; border: 1px solid #15803d;">iterateur</th>
            <th style="padding: 8px; border: 1px solid #15803d;">tableau[iterateur]</th>
            <th style="padding: 8px; border: 1px solid #15803d;">minimum</th>
        </tr>
        <tr style="border: 1px solid #e5e7eb;">
            <td style="padding: 8px; border: 1px solid #e5e7eb;">Initialisation</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">0</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">-</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">7</td>
        </tr>
        <tr style="border: 1px solid #e5e7eb;">
            <td style="padding: 8px; border: 1px solid #e5e7eb;">1</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">0</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">7</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">7</td>
        </tr>
        <tr style="border: 1px solid #e5e7eb;">
            <td style="padding: 8px; border: 1px solid #e5e7eb;">2</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">1</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">3</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">3</td>
        </tr>
        <tr style="border: 1px solid #e5e7eb;">
            <td style="padding: 8px; border: 1px solid #e5e7eb;">3</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">2</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">9</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">3</td>
        </tr>
        <tr style="border: 1px solid #e5e7eb;">
            <td style="padding: 8px; border: 1px solid #e5e7eb;">4</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">3</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">1</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">1</td>
        </tr>
        <tr style="border: 1px solid #e5e7eb;">
            <td style="padding: 8px; border: 1px solid #e5e7eb;">5</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">4</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">5</td>
            <td style="padding: 8px; border: 1px solid #e5e7eb;">1</td>
        </tr>
    </table>
</div>
</div>
</div>

<p>Une structure de contrôle itérative n'est pas distincte des structures de contrôle avec des SI ALORS. En effet les boucles et autres structures de contrôle itératives sont mise en oeuvre avec des SI ALORS et une ou plusieurs variables qui sont modifiées au sein de la boucle.</p>


<h3> Composition </h3>

<p>Dans la pratique, un algorithme peut comporter plusieurs structures de contrôle itératives, plusieurs structures de contrôle alternatives et plusieurs opérations. On peut les combiner de diverses manières. Il est possible, par exemple, d'avoir une boucle TANT QUE au sein d'une autre boucle TANT QUE.</p>

<pre style='color:#000000;background:#ffffff;'>TANT QUE x <span style='color:#808030; '>></span> <span style='color:#008c00; '>0</span> FAIRE
  TANT QUE x <span style='color:#808030; '>></span> <span style='color:#008c00; '>10</span> FAIRE
     x <span style='color:#808030; '>=</span> x <span style='color:#808030; '>-</span> <span style='color:#008c00; '>1</span>
  FIN TANT QUE
FIN TANT QUE
</pre>

<h3> La fin d'un algorithme </h3>

<p>Un algorithme continue à s'exécuter tant qu'il reste des operations à faire. L'algorithme prend fin lorsque nous rencontrons la fin du pseudo-code ou lorsque le programmeur invoque la fin spécifiquement. Dans l'exemple suivant, le programmeur demander à ce que l'on cesse l'exécution dès que la valeur 5 est rencontrée.</p>

<pre style='color:#000000;background:#ffffff;'>x <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span>
TANT QUE x <span style='color:#808030; '>&lt;</span> <span style='color:#008c00; '>10</span> ALORS
   ajoute un à x
   <span style='color:#000080; '>SI</span> x <span style='color:#808030; '>=</span><span style='color:#808030; '>=</span> <span style='color:#008c00; '>5</span> ALORS TERMINE
FIN TANT QUE
AFFICHE x
</pre>

<p>La valeur x ne sera donc jamais affichée.</p>

<p>Il arrive aussi qu'un pseudo-code doit retourner une valeur. Par convention, dès que la valeur attendue est retournée, l'algorithme prend fin. Ainsi donc, dans le cas suivant, la valeur 5 sera retournée.</p>

<pre style='color:#000000;background:#ffffff;'>x <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span>
TANT QUE x <span style='color:#808030; '>&lt;</span> <span style='color:#008c00; '>10</span> ALORS
   ajoute un à x
   <span style='color:#000080; '>SI</span> x <span style='color:#808030; '>=</span><span style='color:#808030; '>=</span> <span style='color:#008c00; '>5</span> ALORS RETOURNE x
FIN TANT QUE
RETOURNE x
</pre>
<!--Created using ToHtml.com on 2021-06-09 13:05:54 UTC -->

<p><a id="execute" ></a></p>
<h2>Exécution d'un pseudo-code</h2>

<p>Pour comprendre un pseudo-code que vous venez de recevoir, ou pour tester un pseudo-code que vous venez de créer, il est essentiel de l'exécuter. Quand on exécute un pseudo-code, on se contente de lire les consignes logiques.</p>

<p>Prenons un exemple:
<div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;">

```
Variable test = 0

TANT QUE test < 100
  test = test + 22
FIN TANT QUE

retourne test
```

</div>

<ol>
<li>Je débute le pseudo-code avec la valeur 0 stockée dans la variable test.</li>
<li>J'entre dans la boucle TANT QUE.</li>
<li>J'ajoute 22 à la variable test, le résultat est 22.</li>
<li>J'entre dans la boucle TANT QUE.</li>
<li>J'ajoute 22 à la variable test, le résultat est 44.</li>
<li>J'entre dans la boucle TANT QUE.</li>
<li>J'ajoute 22 à la variable test, le résultat est 66.</li>
<li>J'entre dans la boucle TANT QUE.</li>
<li>J'ajoute 22 à la variable test, le résultat est 88.</li>
<li>J'entre dans la boucle TANT QUE.</li>
<li>J'ajoute 22 à la variable test, le résultat est 110.</li>
<li>Je quitte la boucle TANT QUE.</li>
<li>Je retourne la valeur stockée dans la variable test, soit 110.</li>
</ol>

<p>Vous devez absolument être capable de faire de telles exécutions. Dans certains cas, votre pseudo-code va dépendre de paramètres: il faut alors exécuter le pseudo-code plus d'une fois, sur plusieurs cas de test. Dans certains cas, le pseudo-code peut prendre trop d'étapes pour qu'un humain puisse l'exécuter entièrement : vous devriez au moins en faire une partie.</p>



<a id="indecidable" ></a>
<a id="decidable" ></a>
<h2>Les problèmes difficiles</h2>


<p>Dans ce cours d'introduction à la programmation, vous n'aurez pas à résoudre des problèmes difficiles sur le plan algorithmique. C'est-à-dire que, le plus souvent, si vous  maîtrisez bien la programmation et les mathématiques, la conception de l'algorithme ne sera pas un obstacle.</p>
<p>Il faut savoir que ce n'est pas toujours le cas. Un petit nombre de problèmes rencontrés dans des situations réelles sont difficiles. Il est, par exemple, difficile de créer une intelligence artificielle capable de jouer aux échecs aussi bien que les grands maîtres. Parfois, même quand l'algorithme est facile à concevoir, mettre en oeuvre une solution efficace peut être très difficile.  Il est difficile d'optimiser le chemin que doit suivre un livreur qui a plusieurs livraisons à faire sans devoir énumérer toutes les possibilités. Encore une fois, dans le contexte de ce cours, nous n'exigerons pas que vos solutions soient particulièrement efficaces.</p>


<p>Lecture suggérée : <a href="https://fr.wikipedia.org/wiki/Problème_du_voyageur_de_commerce">Problème du voyageur de commerce
</a></p>

<h2>Vidéos suggérées</h2>


<iframe width="560" height="315" src="https://www.youtube.com/embed/kk6YbA5I-Iw" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/ahyfYdRvc3M" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/ae-2hgbiY6s" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/Y-hj8VWs5X8" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/yHUtYvvvjcc" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/rSfQgLGeHSI" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/uXJnIEpMlkk" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/pXQEF9-tiGg" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<p><a id="erreurs" ></a></p>
<h2>Erreurs communes</h2>

<p>Rédiger du pseudo-code n'a rien de sorcier, mais plusieurs étudiants font des erreurs. Voici quelques erreurs communes.</p>

<ol>
<li>Certains étudiants rédigent du pseudo-code qui a l'air formel et correct, mais qui est en fait ambigu et inutilisable. Prenons cet exemple:

<pre>
SI j'ai mal aux dos ALORS je prend des aspirines
OU
SI  j'ai faim ALORS je mange
</pre>

Bien sûr, je n'ai utilisé que des expressions logiques. Des SI, des ALORS des OU. Mais qu'est-ce que ça signifie ? Par exemple, est-ce que je peux à la fois manger et prendre des aspirines dans ce scénario ? La réponse est subjective.

Votre pseudo-code doit être exécutable sans interprétation. Un pseudo-code n'est pas un texte à interprétation subjective.

Vous ne pouvez pas faire semblant d'écrire du pseudo-code en utilisant simplement les termes qu'on trouve fréquemment au sein des pseudo-codes. Ce n'est pas une question de syntaxe. On peut parfaitement écrire du pseudo-code sans jamais utiliser SI, TANT QUE, etc. Plusieurs étudiants obsèdent sur la syntaxe, croyant à tort que si on leur donne les bons termes, la bonne grammaire, ils trouveront comment comprendre ce qu'est un pseudo-code. Or, c'est justement le contraire de la leçon ici: nous voulons que vous compreniez que la syntaxe exacte est secondaire dans la pensée algorithmique.

Si vous avez fait vos mathématiques du collégial, vous avez appliqué maintes et maintes fois des algorithmes formels, en commençant par la division longue. Vous savez diviser 321321 par 13, n'est-ce pas ? Pour y arriver, vous utilisez un algorithme complexe (plus complexe que ce qu'on vous demande de concevoir dans ce cours). Or il n'y a pas besoin d'avoir une syntaxe particulière pour expliquer l'algorithme de la division longue. On peut l'expliquer en des termes parfaitement naturels en français.

Au bout du compte, si vous n'arrivez pas à exprimer des algorithmes simples en français, de manière précise, il ne sert à rien d'essayer d'apprendre à programmer en Java, en C# ou en Python. Il y a une compétence basique que vous devez avoir développée préalablement. Vous devez être capable de comprendre et de rédiger des consignes simples et claires (non subjectives). Si vous arrivez à faire des probabilités et de l'algèbre linéaire, vous devez avoir acquis une certaine pensée formelle. Nous vous demandons ici d'appliquer cette compétence de logique et de raisonnement formel. La syntaxe est secondaire. Il faut que vous puissiez être clair dans vos consignes peu importe les termes que vous utilisez. 

On peut être imprécis et incohérent en utilisant une syntaxe formelle, et on peut être précis et cohérent en utilisant du français usuel. Ce n'est pas parce que vous utilisez des expressions qui vous semblent précises que vous l'êtes. Vous devez avoir une idée précise en tête et vous devez l'exprimer avec précision.
</li>

<li>Au sein d'une boucle (par ex., TANT QUE), les étudiants peuvent mettre par erreur une condition qui termine toujours le programme. Dans un tel cas, la boucle ne peut pas s'exécuter et elle est de facto brisée. Voici un exemple:

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%">Variable <span style="color: #333333"></span> iterateur <span style="color: #333333">(</span>entier<span style="color: #333333">)</span>


Variable minimum  = tableau[0] 


iterateur = 0</span>
TANT QUE  iterateur <span style="color: #333333">&lt;</span> <span style="color: #0000DD; font-weight: bold">100</span>  FAIRE
     SI tableau<span style="color: #333333">[</span>iterateur<span style="color: #333333">]</span> <span style="color: #333333">&lt;</span> minimum ALORS
         retourner tableau<span style="color: #333333">[</span>iterateur<span style="color: #333333">];</span>
     SINON
         retourner minimum
     FIN SI
     iterateur <span style="color: #333333">=</span> iterateur <span style="color: #333333">+</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">;</span>
FIN TANT QUE
</pre></div>


Les instructions « retourner minimum » et « retourner tableau<span style="color: #333333">[</span>iterateur<span style="color: #333333">];</span>» terminent le pseudo-code.

Assurez-vous de bien comprendre que ce pseudo-code ne va consulter que la première valeur du tableau. Si vous avez une condition ou les deux branches (SI et SINON) retournent une valeur et terminent donc l'algorithme, votre algorithme ne procèdera pas plus loin. </li>

<li>Certains étudiants construisent des boucles qui ne se terminent jamais. Dans une boucle TANT QUE, il faut s'assurer que la condition ne soit plus satisfaite pour ne pas avoir une boucle infinie. Consultez cet exemple :
<div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%">
iterateur = 0</span>
TANT QUE  iterateur <span style="color: #333333">&lt;</span> <span style="color: #0000DD; font-weight: bold">100</span>  FAIRE
     SI iterateur <span style="color: #333333">&lt;</span> 10 ALORS
         ajouter un à itérateur
     FIN SI
FIN TANT QUE
</pre></div>
<p>Si vous testez votre pseudo-code, vous saurez éviter de telles erreurs.</p>
</li>
<li>Les étudiants vont aussi fréquemment utiliser des variables et des constructions qui ne sont pas définies et dont le sens doit être deviné. Voici un exemple:
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%">Entier iterateur<span style="color: #333333">[</span>tableau<span style="color: #333333">]</span> <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
TANT QUE  iterateur<span style="color: #333333">[</span>i<span style="color: #333333">]</span> <span style="color: #333333">&lt;</span> <span style="color: #0000DD; font-weight: bold">100</span>  FAIRE
     SI tableau<span style="color: #333333">[</span>iterateur<span style="color: #333333">]</span> <span style="color: #333333">&lt;</span> minimum ALORS
         retourner iterateur<span style="color: #333333">[</span>tableau<span style="color: #333333">];</span>
     FIN SI
     iterateur <span style="color: #333333">=</span> iterateur<span style="color: #333333">[</span>tableau<span style="color: #333333">]</span> <span style="color: #333333">+</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">;</span>
FIN POUR TOUT
</pre></div>


<p>Vous constaterez à la lecture de ce pseudo-code qu'il y a plusieurs conventions syntaxiques qui ne sont pas définies. Il y a plusieurs variables, mais il est difficile de connaître leur type et leurs relations. Assurez-vous donc de bien expliquer chaque variable et de bien définir votre syntaxe. Dans ce dernier exemple, que représente iterateur, iterateur[tableau], tableau[iterateur], etc.? Vous devez être précis. Souvent, nous avons un nombre limité de « types » pour les variables: nombres, entiers, chaînes de caractères. Il convient, pour chaque variable, d'en préciser le type. Nous avons aussi des tableaux. On utilise le plus souvent la convention t[i] pour désigner l'élément à l'index i du tableau t. Dans un tel cas, t doit être un tableau, i doit être une valeur entière. Vous être libre de concevoir vos propres conventions, mais vous devez être explicite et précis.</p>

<p>Si votre pseudo-code doit retourner une valeur, il faut que le pseudo-code le spécifie explicitement.</p>

</li>

<li>Si vous avez bien défini le type de vos variables, et toutes vos conventions syntaxiques, il vous reste maintenant à vous assurer que les valeurs de vos variables sont toujours spécifiées. Si vous dites que x est un nombre et que vous posez ensuite l'inéquation x > 1, nous ne pouvons en connaître la valeur que si x a reçu une valeur. Assurez-vous donc de donner une valeur initiale à toutes vos variables. En tout temps, dans votre pseudo-code, le lecteur doit pouvoir déterminer la valeur d'une variable donnée.</li>


<li>Parfois les étudiants manquent tout simplement de rigueur. Pour vérifiez si votre pseudo-code est rigoureux, appliquez-le sur un exemple concret comme si vous étiez un robot. Par exemple, si quelqu'un écrit le pseudo-code suivant « je prend chacune des valeurs du tableau, et je l'additionne à la valeur suivante dans le tableau »... vous pourriez alors prendre un tableau à titre d'exemple, comme [1,2,3] et tester l'instruction. Qu'est-ce que ça donnerait ? Je prend les valeurs une à une et je l'additionne à la valeur suivante dans le tableau. Je prend donc 1 et sa valeur suivante (1 + 2), ensuite 2 et sa valeur suivante (2 + 3), et ensuite 3 et sa valeur suivante... ? Je me rend compte que l'expression « la valeur suivante » n'est pas bien définie. Voici un autre exemple. Quelqu'un pourrait avoir comme pseudo-code « j'initialise la variable comme ayant comme valeur le premier élément du tableau ». Testons ce pseudo-code sur le tableau vide (de taille zéro). Nous constatons qu'il n'y a pas de premier élément ! Donc si le tableau vide n'est pas exclu, nous avons un problème de rigueur. Voici un truc: testez toujours votre pseudo-code avec plusieurs exemples concrets. Prenez le temps d'appliquer les instructions de votre pseudo-code ligne par ligne, comme si vous étiez un robot. Pensez comme un ordinateur!</li>
</ol>


Nous vous invitons maintenant à passez aux premiers exercices du cours!