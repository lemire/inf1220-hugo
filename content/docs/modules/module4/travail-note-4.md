---
title: "Travail noté 4"
weight: 6
---

# Travail noté 4 - Les flux d'entrées et de sorties

Ce travail noté du cours INF1220 requiert de lire un fichier, valider ses données selon des règles spécifiques et afficher les résultats dans un autre format, exigeant une maîtrise des entrées/sorties, des chaînes de caractères et des structures de données en Java. Avant de commencer, il est impératif d’avoir complété et compris les lectures et exercices préparatoires, car sans cette préparation, la réussite du travail et des questions d’examen est compromise. L’utilisation du robot conversationnel du cours est permise, mais les réponses et analyses doivent être personnelles. Les étudiants doivent planifier leur temps rigoureusement, car la manipulation des entrées/sorties peut être complexe, et les travaux doivent être soumis avant la date de fin de cours, disponible sur le portail étudiant, sans possibilité de report sauf validation par l’Université pour des raisons exceptionnelles (maladie, deuil, etc.).

Les travaux doivent être soumis sous forme de fichier PDF via l’outil de dépôt de la TÉLUQ, sans envoi par courriel, sous peine de note zéro. Le PDF doit permettre le copier-coller du code, être exempt de saisies d’écran ou de contenu manuscrit, et inclure du code testé et fonctionnel, car un code non fonctionnel peut entraîner une note de zéro. Les recherches sur Internet sont encouragées, mais aucun indice supplémentaire ne sera fourni au-delà de l’énoncé. La date de fin de cours, non négociable par les enseignants, marque la limite pour les soumissions, et tout travail remis tardivement risque une note de zéro ou un «&nbsp;incomplet&nbsp;», même si l’examen a lieu plus tard.

Les travaux sont strictement individuels, et tout échange, notamment sur les réseaux sociaux, constitue une faute académique pouvant entraîner une note de zéro ou une exclusion du programme. Les étudiants doivent répartir leur code sur plusieurs pages si nécessaire pour en faciliter la lecture et accompagner celui-ci d’explications claires. La responsabilité du dépôt dans les délais et de la résolution des problèmes techniques avec l’outil de dépôt incombe à l’étudiant, qui doit contacter l’Université en cas de difficulté. Une préparation sérieuse et une vérification rigoureuse du travail avant soumission sont essentielles pour éviter les erreurs et maximiser la réussite.



### Mettre en forme votre code Java


Nous vous demandons d'apporter une attention particulière à la mise en page de votre code Java. Une indentation cohérente, avec généralement quatre espaces par niveau, facilite la lecture et la compréhension du flux logique du programme. Veillez à aligner les accolades ouvrantes et fermantes, à espacer les opérateurs et les virgules de manière uniforme, et à limiter la longueur des lignes à environ 100 caractères pour éviter les retours à la ligne forcés. Vous pouvez utiliser un site comme <a href="https://tohtml.com">tohtml.com</a> pour améliorer l'apparence de votre code Java en générant une version colorée et syntaxiquement mise en évidence. Certains éditeurs vous permettent aussi de mettre en forme votre code automatiquement. Enfin, n'oubliez pas d'ajouter des commentaires clairs et concis pour expliquer les parties complexes, en les plaçant au-dessus des blocs de code concernés plutôt qu'en fin de ligne. Choisissez une police de caractères à taille fixe et suffisamment petite pour afficher 100 caractères par ligne. Le code informatique est mis en forme avec un interligne simple.


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
utiliser le système du site du cours.</p>

<strong>Fonctionnalités/classes demandées</strong>

Votre programme doit faire trois opérations spécifiques:

<ol>
<li>Charger un fichier contenant des données selon le format spécifié (une suite de triplets de chiffres séparés par des espaces). Vous pouvez choisir l'approche que vous préférez. Le fichier peut être récupéré en ligne, par l'ouverture d'un fichier sur votre disque ou par l'entrée standard (<tt>stdin</tt>). Votre code doit gérer les erreurs de lecture.</li>
<li>Valider que le fichier correspond à un tableau Sudoku valable. C'est-à-dire qu'il doit correspondre à un tableau 9x9 où chaque chiffre de 1 à 9 apparaît une seule fois par colonne et une seule fois par rangée. Pour les fins de ce travail, nous n’exigeons pas que  chaque sous-grille de 3×3 contienne tous les chiffres de 1 à 9 (vous pouvez cependant faire cette vérification supplémentaire si vous le souhaitez). En cas d'erreur, votre programme doit générer une exception.</li>
<li>Votre programme doit ensuite appliquer une transposition au tableau correspondant à un calcul de <a href="https://fr.wikipedia.org/wiki/Matrice_transposée">matrice transposée</a> et afficher le résultat à l'écran. Au lieu de l'afficher à l'écran, vous (en tant que programmeur) pouvez l'enregistrer comme nouveau fichier ou utiliser un autre moyen de transmission. Choisissez l'approche qui vous plaît le plus en tant que programmeur. Vous devez tester votre solution avec plus d'une grille; en particulier, incluez une grille qui est asymétrique (qui n'est pas identique à sa transposée) dans vos tests. Donnez le résultat d'au moins deux tests différents, au-delà du fichier partie1.txt. Vous pouvez utiliser des saisies d'écran pour présenter vos résultats.</li>
</ol>


Il n'y a pas de limites strictes quant à la longueur du code, mais nous vous encourageons fortement à vous limiter à moins de 300 lignes de code (au plus trois pages).


<p>Vous devez expliquer votre programme avec soin et en détail. Chaque fonction et chaque variable du programme doit être justifiée. Les qualifiants (static, public, protected et private) doivent être justifiés un par un: vous ne pouvez pas utiliser le mot-clé «&nbsp;static&nbsp;» sans le justifier. Si vous remettez votre code sans explications claires et sans tout justifier, une note de zéro pourra être attribuée, sans possibilité de reprise.</p>


<p>Si le code de votre solution n'est pas du Java valable, s'il ne compile pas, une note de zéro pourra être attribuée. Pour réussir ce cours, vous devez être capable d'écrire du code Java fonctionnel et correct.</p>


## En ligne sur le site du cours

Vous pouvez écrire votre programme directement sur le site du cours.

{{<javaMultiRunner files="Travail4.java;partie1.txt;partie2.txt;partie3.txt">}}


<p>Vous avez un certain degré de liberté dans la réalisation de ce travail. Par exemple...</p>
<ul>
<li>Si ça vous plaît, vous pouvez offrir un choix à l'utilisateur. Est-ce qu'il souhaite avoir le résultat à l'écran, ou sur disque, ou autrement?</li>
<li>Si ça vous plaît, vous pouvez offrir à l'utilisateur de choisir où enregistrer le fichier sur disque.</li>
<li>Si ça vous plaît, vous pouvez offrir à l'utilisateur de choisir comment il souhaite que les données s'affichent à l'écran.</li>
</ul>

<p>Nous vous donnons cette liberté intentionnellement. Vous pouvez aller au plus simple, ou développer une solution sophistiquée. Vous pouvez utiliser un affichage des résultats élégant ou faire quelque chose de plus minimaliste. Pour les notes, seule les fonctions essentielles comptent. Ainsi donc, si vous faites une solution très complexe, vous n'aurez pas nécessairement plus de points.</p>

<p><strong>Note</strong> : En programmation, il est considéré comme étant disgracieux d'inclure directement dans votre code une adresse ou un chemin.</p>


{{% hint info %}}

<p><strong>Indice.</strong> Rendez-vous sur <a href="https://rc-inf1220.teluq.ca/">la page du robot conversationnel du cours</a> et saisissez l'énoncé dans la boîte de saisie: «&nbsp;<em>Dans un jeu de Sudoku, nous devons re-construire une grille comprenant 9 rangées et 9 colonnes. Chaque rangée et chaque colonne doit contenir tous les entiers de 1 à 9. Vous devez créer un logiciel qui permet de charger des grilles de Sudoku à partir de fichiers, de manipuler les grilles (placements, vérifications), puis enfin de reproduire de nouveau les grilles soit à l'écran soit dans des fichiers. Les fichiers de Sudoku comportent une suite de triplets de chiffres séparés par des espaces, où chaque triplet correspond à : x: numéro de la ligne, y: numéro de la colonne, z: valeur. Charger un fichier contenant des données selon le format spécifié (une suite de triplets de chiffres séparés par des espaces). Vous pouvez choisir l'approche que vous préférez. Le fichier peut être récupéré en ligne, par l'ouverture d'un fichier sur votre disque ou par l'entrée standard (stdin). Votre code doit gérer les erreurs de lecture. Valider que le fichier correspond à un tableau Sudoku valable. C'est-à-dire qu'il doit correspondre à un tableau 9x9 où chaque chiffre de 1 à 9 apparaît une seule fois par colonne et une seule fois par rangée. Pour les fins de ce travail, nous n’exigeons pas que chaque sous-grille de 3×3 contienne tous les chiffres de 1 à 9 (vous pouvez cependant faire cette vérification supplémentaire si vous le souhaitez). En cas d'erreur, votre programme doit générer une exception. Votre programme doit ensuite appliquer une transposition au tableau correspondant à un calcul de matrice transposée et afficher le résultat à l'écran.</em>&nbsp;».</p>

{{% /hint %}}

<h2>En terminant</h2>
<p>Dans plusieurs cas, vos travaux sont corrigés par un «&nbsp;correcteur&nbsp;». Il est possible que vous puissiez identifier cette personne en examinant le document de rétroaction que vous recevez au sein du portail étudiant. Vous ne devriez jamais joindre cette personne. Cette personne n'a pas comme mandat de répondre à vos questions suite à la correction. Vos courriels seront ignorés. Il faut plutôt joindre la personne qui vous encadre au sein du cours.</p>

