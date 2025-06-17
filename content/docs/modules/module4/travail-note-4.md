---
title: "Travail noté 4"
weight: 4
---

# Travail noté 4 - Les flux d'entrées et de sorties


<p>Prenez note qu'<a href="https://rc-inf1220.teluq.ca/">il est permis d'utiliser le robot conversationnel du cours lors des travaux notés</a>. Cependant vous devez produire vos propres réponses et vos propres analyses.</p>

<p>Dans ce travail, nous allons vous demander d'accéder à un fichier, le lire les données que nous y trouvons, de valider les données lues selon des règles, et d'ensuite afficher le résultat sous un autre format.</p>

<p>Attention: Il est obligatoire, avant d'entreprendre ce travail, d'avoir fait les lectures et les exercices préparatoires. Une maîtrise des entrées et des sorties est nécessaire pour faire ce travail. Si vous n'avez pas fait les lectures et les exercices suggérés, en prenant le temps de relire autant de fois que nécessaire, et de travailler sur les exercices de manière sérieuse, il est possible que vous n'arriviez pas à faire ce travail et que vous ne réussissiez pas les questions d'examen.</p>


<h2>Planifiez bien votre temps !</h2>

<p>Certains étudiants trouvent difficile de travailler avec des entrées et des sorties dans un langage de programmation. Réservez-vous suffisamment de temps pour faire ce travail noté.</p>

<h2>Les reports de la date de fin de cours</h2>


<p><strong>Rappel</strong>: L'enseignant ne peut modifier votre date de fin de cours  peu importe votre situation. Le moment après la date de fin de cours où votre dossier est fermé et où vous recevez (éventuellement) un incomplet est géré par l'Université. Il est de votre responsabilité de bien planifier votre temps.  Si vous avez des problèmes personnels qui limitent vos progrès (maladie, deuil, etc.), il faut voir avec l'Université: les enseignants n'ont aucune prise sur les dates de fin, sur les dates d'examen, etc.</p>


<p>Votre date de fin de cours est inscrite dans votre dossier et vous pouvez la trouver sur le portail étudiant et sur la documentation qu'on vous a remise lors de votre inscription. Il est possible que votre examen ait lieu des semaines ou même des mois après votre date de fin de cours: cela ne constitue pas une extension de votre date de fin de cours. Tout travail remis après votre date de fin de cours pourra recevoir la note de zéro. En tout temps, la note « incomplet » peut être attribuée à un travail qui n'est pas remis après votre date de fin de cours, même si vous n'avez pas encore passé l'examen.</p>

<strong>Instructions de dépôt du travail notés :</strong>
<p>Vous devez absolument tester votre code et vous assurez qu'il fonctionne. Si vous remettez du code qui ne fonctionne pas, vous pourrez obtenir la note de zéro.</p>
<p>Vous devez remettre un fichier pdf contenant votre code et le déposer le travail sur le site de dépôt des travaux de la TÉLUQ : <a href="https://www.teluq.ca/depot-travaux-etudiant">http://www.teluq.ca/depot-travaux-etudiant</a>. Vous ne pouvez utiliser l'outil de dépôt qu'après le début de votre cours et avant la fin de votre cours, et seulement si vous avez été  inscript au cours. En aucun cas est-ce que nous pouvons recevoir vos travaux par courriel. Les travaux transmis par courriel au sein du cours INF 1220 ne seront pas corrigés et recevrons une note de zéro. Il pourrait n'y avoir aucun avertissement : le dépôt du travail dans les délais  est votre responsabilité. Si vous éprouvez des difficultés techniques avec l'outil de dépôt, vous devez joindre l'Université pour obtenir de l'aide. </p>
<p>Vous ne devez pas remettre votre code sous la forme de fichiers Java. Pour faciliter la correction, assurez-vous qu'on puisse copier-coller du texte à partir du document PDF.  Si votre document ne permet pas de copier-coller du texte, il pourra être refusé ou une note de zéro pourra être attribuée. Les travaux écrits à la main seront refusés. N'utilisez pas des saisies d'écran. Si vous avez beaucoup de code, répartissez-le en plusieurs pages de manière à rendre la lecture aisée. </p>

<p>On s'attend à ce que vous fassiez des recherches Internet pour réaliser ce travail. Les recherches en ligne font partie intégrante du développement logiciel.</p>


  <p>Attention: nous ne donnons jamais d'indice (à quiconque) sur les travaux notés au-delà de ce qui est déjà dans l'énoncé (ce serait inéquitable).</p>

<p>Pour faire ce travail, vous devez avoir les bases concernant la manipulation des chaînes de caractères et des structures de données en Java. Certains étudiants essaient d'aller trop vite et ils passent outre aux exercices de préparation des modules précédents. Vous devez avoir fait tous les exercices et vous assurer des les avoir bien compris. </p>

<p> Le cours comprend plusieurs exemples avec solutions. Par contre, les solutions des travaux notés ne sont jamais transmises dans ce cours: si vous avez des questions sur vos résultats, vous pouvez poser des questions au professeur.  Assurez-vous de poser des questions précises, et prenez le temps de consulter la rétroaction du correcteur. (Indice: si vous demandez les solutions suite à la correction de votre travail, vous nous indiquez que vous n'avez pas bien lu les consignes.)</p>


<p>Les travaux au sein de ce cours sont des travaux individuels. Il est strictement défendu de discuter du travail noté avec quiconque. En particulier, des échanges au sein de réseaux sociaux (Facebook, etc.) concernant ce travail peuvent constituer une faute académique. Vous pourriez obtenir la note de zéro ou recevoir une sanction allant jusqu'à l'exclusion du programme dans lequel vous êtes inscrit si vous avez des discussions en ligne au sujet des travaux notés de ce cours.</p>

<strong>Problème</strong>
<p>Dans un jeu de Sudoku, nous devons re-construire une grille comprenant 9 rangées et 9 colonnes. Chaque rangée et chaque colonne doit contenir tous les entiers de 1 à 9.</p>

<p>Vous devez créer un logiciel qui permet de charger des grilles de Sudoku à partir de fichiers, de manipuler les grilles (placements, vérifications), puis enfin de reproduire de nouveau les grilles soit à l'écran soit dans des fichiers. Les fichiers de Sudoku comportent une suite de triplets de chiffres séparés par des espaces, où chaque triplet correspond à : </p>
<ul>
        <li>x:  numéro de la ligne.</li>
        <li>y:  numéro de la colonne.</li>
        <li>z:  valeur</li>
</ul>
<p>En informatique, on numérote le plus souvent des colonnes et des rangées en commençant par zéro.</p>

<strong>Exemples&nbsp;:</strong>
<p>Contenu du fichier partie1.txt<br />
<code style="width:50%;white-space:pre-wrap">001 012 023 034 045 056 067 078 089 102 113 124 135 146 157 168 179 181 203 214 225 236 247 258 269 271 282 304 315 326 337 348 359 361 372 383 405 416 427 438 449 451 462 473 484 506 517 528 539 541 552 563 574 585 607 618 629 631 642 653 664 675 686 708 719 721 732 743 754 765 776 787 809 811 822 833 844 855 866 877 888 
</code>
<p>Contenu du fichier partie2.txt<br />
<code style="width:50%;white-space:pre-wrap">016 112 214 319 417 511 618 713 815 027 129 221 328 425 523 626 722 824 033 138 235 332 436 534 631 737 839 048 141 243 347 449 545 644 746 842 059 157 252 351 454 556 655 758 853 065 164 266 363 462 568 667 769 861 074 173 279 376 471 577 672 775 878 081 186 288 385 483 582 689 784 887 092 195 297 394 498 599 693 791 89
</code>

<p>Contenu du fichier partie3.txt<br />
<code style="width:50%;white-space:pre-wrap">014 116 218 313 411 517 615 712 819 022 127 225 324 428 529 623 726 821 031 133 239 335 436 532 637 734 838 045 148 246 349 447 541 642 743 844 057 159 252 356 454 553 651 758 855 063 161 264 362 465 568 669 767 866 079 174 273 371 472 576 678 775 877 086 182 287 388 489 585 684 781 883 098 195 291 397 493 594 696 799 892
</code>

<p>Dans ces exemples, les données ne sont pas nécessairement correctes. C'est votre travail de créer un programme qui peut traiter les erreurs.</p>

<p>Vous pouvez créer un tel fichier sur votre machine avec un éditeur de texte, vous pouvez
utiliser le système du site du cours,  ou vous pouvez utiliser <a href="https://repl.it/@lemire/hw?lite=true">le projet repl.it préconfiguré</a> où ces fichiers apparaissent déjà.</p>

<strong>Fonctionnalités/classes demandées</strong>

Votre programme doit faire trois opérations spécifiques:

<ol>
<li>Charger un fichier contenant des données selon le format spécifié (une suite de triplets de chiffres séparés par des espaces). Vous pouvez choisir l'approche que vous préférez. Le fichier peut être récupéré en ligne, par l'ouverture d'un fichier sur votre disque ou par l'entrée standard (<tt>stdin</tt>). Votre code doit gérer les erreurs de lecture.</li>
<li>Valider que le fichier correspond à un tableau Sudoku valable. C'est-à-dire qu'il doit correspondre à un tableau 9x9 où chaque chiffre de 1 à 9 apparaît une seule fois par colonne et une seule fois par rangée. Pour les fins de ce travail, nous n’exigeons pas que  chaque sous-grille de 3×3 contienne tous les chiffres de 1 à 9 (vous pouvez cependant faire cette vérification supplémentaire si vous le souhaitez). En cas d'erreur, votre programme doit générer une exception.</li>
<li>Votre programme doit ensuite appliquer une transposition au tableau correspondant à un calcul de <a href="https://fr.wikipedia.org/wiki/Matrice_transposée">matrice transposée</a> et afficher le résultat à l'écran. Au lieu de l'afficher à l'écran, vous (en tant que programmeur) pouvez l'enregistrer comme nouveau fichier ou utiliser un autre moyen de transmission. Choisissez l'approche qui vous plaît le plus en tant que programmeur. Vous devez tester votre solution avec plus d'une grille; en particulier, incluez une grille qui est asymétrique (qui n'est pas identique à sa transposée) dans vos tests. Donnez le résultat d'au moins deux tests différents, au-delà du fichier partie1.txt. Vous pouvez utiliser des saisies d'écran pour présenter vos résultats.</li>
</ol>



<p>Vous devez expliquer votre programme avec soin et en détail. Chaque fonction et chaque variable du programme doit être justifiée. Les qualifiants (static, public, protected et private) doivent être justifiés un par un: vous ne pouvez pas utiliser le mot-clé « static » sans le justifier. Si vous remettez votre code sans explications claires et sans tout justifier, une note de zéro pourra être attribuée, sans possibilité de reprise.</p>


<p>Si le code de votre solution n'est pas du Java valable, s'il ne compile pas, une note de zéro pourra être attribuée. Pour réussir ce cours, vous devez être capable d'écrire du code Java fonctionnel et correct.</p>


## En ligne sur le site du cours

Vous pouvez écrire votre programme directement sur le site du cours.

{{<javaMultiRunner files="Travail4.java;partie1.txt;partie2.txt;partie3.txt">}}

<h2>Repl.it</h2>
<p>Vous pouvez écrire votre programme en ligne avec repl.it.</p>

<iframe height="1000px" width="100%" src="https://repl.it/@lemire/hw?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>

<p>Vous avez un certain degré de liberté dans la réalisation de ce travail. Par exemple...</p>
<ul>
<li>Si ça vous plaît, vous pouvez offrir un choix à l'utilisateur. Est-ce qu'il souhaite avoir le résultat à l'écran, ou sur disque, ou autrement?</li>
<li>Si ça vous plaît, vous pouvez offrir à l'utilisateur de choisir où enregistrer le fichier sur disque.</li>
<li>Si ça vous plaît, vous pouvez offrir à l'utilisateur de choisir comment il souhaite que les données s'affichent à l'écran.</li>
</ul>

<p>Nous vous donnons cette liberté intentionnellement. Vous pouvez aller au plus simple, ou développer une solution sophistiquée. Vous pouvez utiliser un affichage des résultats élégant ou faire quelque chose de plus minimaliste. Pour les notes, seule les fonctions essentielles comptent. Ainsi donc, si vous faites une solution très complexe, vous n'aurez pas nécessairement plus de points.</p>

<p><strong>Note</strong> : En programmation, il est considéré comme étant disgracieux d'inclure directement dans votre code une adresse ou un chemin.</p>

<p><strong>Indice.</strong> Rendez-vous sur <a href="https://rc-inf1220.teluq.ca/">la page du robot conversationnel du cours</a> et saisissez l'énoncé dans la boîte de saisie: « <em>Dans un jeu de Sudoku, nous devons re-construire une grille comprenant 9 rangées et 9 colonnes. Chaque rangée et chaque colonne doit contenir tous les entiers de 1 à 9. Vous devez créer un logiciel qui permet de charger des grilles de Sudoku à partir de fichiers, de manipuler les grilles (placements, vérifications), puis enfin de reproduire de nouveau les grilles soit à l'écran soit dans des fichiers. Les fichiers de Sudoku comportent une suite de triplets de chiffres séparés par des espaces, où chaque triplet correspond à : x: numéro de la ligne, y: numéro de la colonne, z: valeur. Charger un fichier contenant des données selon le format spécifié (une suite de triplets de chiffres séparés par des espaces). Vous pouvez choisir l'approche que vous préférez. Le fichier peut être récupéré en ligne, par l'ouverture d'un fichier sur votre disque ou par l'entrée standard (stdin). Votre code doit gérer les erreurs de lecture. Valider que le fichier correspond à un tableau Sudoku valable. C'est-à-dire qu'il doit correspondre à un tableau 9x9 où chaque chiffre de 1 à 9 apparaît une seule fois par colonne et une seule fois par rangée. Pour les fins de ce travail, nous n’exigeons pas que chaque sous-grille de 3×3 contienne tous les chiffres de 1 à 9 (vous pouvez cependant faire cette vérification supplémentaire si vous le souhaitez). En cas d'erreur, votre programme doit générer une exception. Votre programme doit ensuite appliquer une transposition au tableau correspondant à un calcul de matrice transposée et afficher le résultat à l'écran.</em> ».</p>

<h2>En terminant</h2>
<p>Dans plusieurs cas, vos travaux sont corrigés par un « correcteur ». Il est possible que vous puissiez identifier cette personne en examinant le document de rétroaction que vous recevez au sein du portail étudiant. Vous ne devriez jamais joindre cette personne. Cette personne n'a pas comme mandat de répondre à vos questions suite à la correction. Vos courriels seront ignorés. Il faut plutôt joindre la personne qui vous encadre au sein du cours.</p>

</div>
