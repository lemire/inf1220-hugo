---
title: "Travail noté 3"
weight: 110
---

# Travail noté 3 - Les structures de données, de contrôle et d'itération

Les travaux notés du cours INF1220 évaluent la capacité à comprendre des énoncés logiques et à les transcrire en code Java de manière autonome, une compétence essentielle testée également à l’examen final. Les étudiants doivent effectuer des recherches sur le web, une pratique courante en programmation, et soumettre leurs travaux sous forme de fichier PDF via l’outil de dépôt de la TÉLUQ, avant la date de fin de cours indiquée dans le portail étudiant. Les soumissions par courriel ne sont pas acceptées et entraînent une note de zéro, tout comme les documents manuscrits, les saisies d’écran ou ceux ne permettant pas le copier-coller du code. Les travaux, d’un niveau comparable à ceux d’autres universités québécoises, doivent inclure des explications claires et personnelles, l’utilisation du robot conversationnel du cours étant autorisée à condition de produire ses propres analyses.

La date de fin de cours, fixée par l’Université, est non négociable par les enseignants, et tout travail remis après cette date risque une note de zéro ou un «&nbsp;incomplet&nbsp;», même si l’examen a lieu plus tard. En cas de difficultés personnelles (maladie, deuil, etc.), les étudiants doivent s’adresser à l’Université pour demander un report. Si un problème technique survient avec l’outil de dépôt, l’Université doit être contactée pour assistance. Les travaux sont strictement individuels, et tout échange, notamment sur les réseaux sociaux, constitue une faute académique pouvant mener à une note de zéro ou à une exclusion du programme.

En cas d’incapacité à résoudre complètement un problème, les étudiants sont encouragés à expliquer leur démarche et leurs difficultés, mais aucune solution ne sera fournie après la correction. Aucun indice supplémentaire ne sera donné au-delà de l’énoncé pour garantir l’équité. La planification rigoureuse du temps est cruciale, car le dépôt dans les délais est de la responsabilité de l’étudiant. Les consignes insistent sur la nécessité de relire attentivement son travail avant soumission, car aucune modification n’est possible une fois le fichier déposé.



### Mettre en forme votre code Java

Nous vous demandons d'apporter une attention particulière à la mise en page de votre code Java. Une indentation cohérente, avec généralement quatre espaces par niveau, facilite la lecture et la compréhension du flux logique du programme. Veillez à aligner les accolades ouvrantes et fermantes, à espacer les opérateurs et les virgules de manière uniforme, et à limiter la longueur des lignes à environ 100 caractères pour éviter les retours à la ligne forcés. Nous vous suggérons de 
rédiger vos travaux en [MarkDown]({{< relref "/docs/modules/module2/markdown/" >}}). Si vous souhaitez utiliser un traitement de texte comme Microsoft Word, vous pouvez utiliser [notre outil de formattage]({{< relref "/docs/format/" >}}) pour améliorer l'apparence de votre code Java en générant une version colorée et syntaxiquement mise en évidence. Certains éditeurs vous permettent aussi de mettre en forme votre code automatiquement. Enfin, n'oubliez pas d'ajouter des commentaires clairs et concis pour expliquer les parties complexes, en les plaçant au-dessus des blocs de code concernés plutôt qu'en fin de ligne. Choisissez une police de caractères à taille fixe et suffisamment petite pour afficher 100 caractères par ligne. Le code informatique est mis en forme avec un interligne simple.


## Utilisation d'un environnement de programmation en ligne

Si vous avez utilisé notre [environnement de développement Java en ligne]({{< ref "/docs/environnement" >}}),
directement dans le site du cours, vous pouvez utiliser le bouton *partager* pour obtenir un URL pointant
vers votre code informatique exécutable. Nous vous encourageons à inclure cet URL dans votre travail noté
pour rendre la correction plus aisée.  Par ailleurs, vous pouvez ainsi prouver que votre code compile et
s'exécute.



## Question #1
<p>Écrivez un programme Java qui calcule la somme des nombres de 1 jusqu'à 10,000 (incluant 1 et 10,000) mais en omettant les nombres qui sont divisibles par trois et en omettant aussi les nombres dont le chiffre de la centaine est 2 ou 3 (par exemple 1201 ou 3313). Expliquez votre solution. Un travail remis sans explications suffisantes peut se voir attribué la note de zéro, sans droit de reprise. Vous devez justifier tous les qualifiants utilisés (private, public, protected, static): vous ne pouvez pas utiliser le mot-clé «&nbsp;static&nbsp;» sans le justifier.</p>

<p>Vous devez tester votre solution. Vous devez inclure la sortie (affichage) du code dans votre solution. Si remettez du code non-fonctionnel, vous pourrez recevoir la note de zéro!</p>

<p>Attention:  vous devez remettre votre travail sous la forme d'un seul fichier PDF (et non pas sous la forme de fichiers Java). </p> 

<ol>
<li>Cette question exige une maîtrise de l'arithmétique de base. Étant donné, par exemple, le nombre 1234, vous devriez pouvoir construire une expression mathématique élémentaire qui permet de trouver les centaines ('2'), les dizaines ('3') ou les milliers ('1'). Vous pouvez consulter le site d'aide aux devoirs <em>alloprof</em> à ce sujet: <a href="https://www.alloprof.qc.ca/fr/eleves/bv/mathematiques/les-positions-et-les-valeurs-des-nombres-m1017">Les positions et les valeurs des nombres</a>.</p>
<li>Les opérateurs / et % sont utiles pour ce problème. À ce point dans le cours, vous devriez être pleinement familier avec les opérateurs arithmétiques en Java. </p>
<li>Est-ce que la somme peut être représentée par une variable de type <tt>int</tt>? Assurez-vous de discuter ce point dans votre solution.</li>
</ol>



<p>Pour faciliter la correction, assurez-vous qu'on puisse copier-coller votre code à partir du document PDF. N'utilisez pas des saisies d'écran.Si le code de votre solution n'est pas du Java valable, s'il ne compile pas, une note de zéro pourra être attribuée. Pour réussir ce cours, vous devez être capable d'écrire du code Java fonctionnel et correct.</p>

## Question #2

<p>Écrivez un programme Java qui affiche à l'écran toutes les chaînes de 4 caractères en ordre lexicographique (aussi appelé l'ordre du dictionnaire). Il doit afficher une chaîne de 4 caractères par ligne. Seuls les caractères a, b, c, d sont permis au sein des chaînes de caractères, mais vous pouvez réutiliser plus d'une fois un même caractère au sein d'une même chaîne. Au sein d'une même chaîne, le caractère 'b' doit toujours être immédiatement suivi du caractère 'a'. Une même chaîne ne peut comporter à la fois le caractère 'd' et le caractère 'a'. Votre programme doit se terminer en affichant à l'écran le nombre de chaînes de caractères affichées. Votre programme ne reçoit rien en entrée. Le code de votre programme ne doit pas comprendre les chaînes de caractères pré-calculées: il doit les générer lors de l'exécution. Votre programme ne devrait pas contenir plus de 200 courtes lignes de code.</p>

<p>Expliquez votre solution. Un travail remis sans explications suffisantes peut se voir attribué la note de zéro, sans droit de reprise. Vous devez justifier tous les qualifiants utilisés (private, public, protected, static): vous ne pouvez pas utiliser le mot-clé «&nbsp;static&nbsp;» sans le justifier.</p>

<p>Vous devez tester votre solution et inclure la sortie (affichage) du code dans votre solution. </p>

<p>Vous devriez avoir vérifié que votre programme fonctionne. Si remettez du code non-fonctionnel, vous pourrez recevoir la note de zéro! Si le code de votre solution n'est pas du Java valable, s'il ne compile pas, une note de zéro pourra être attribuée. Pour réussir ce cours, vous devez être capable d'écrire du code Java fonctionnel et correct.</p>

{{% hint info %}}

<p>Il y a plusieurs façons de résoudre ce problème. Il n'y a pas de solution unique. Par contre, à partir de l'énoncé, vous devez être capable de calculer dans votre esprit la solution (celle-ci est unique) et vous devez donc être capable de vérifier que votre programme donne la solution correcte.</p>


<ol>
<li>Nous ne donnons pas la sortie attendue délibérément : vous devez montrer que vous êtes capable d'interpréter des consignes formelles.</li>
<li>La compréhension des contraintes logiques et de leurs conséquences fait partie de la question. Vous devez être capable, à titre de programmeur, de bien interpréter des contraintes logiques. Vous ne devez donc pas nous demander d'interpréter la question pour vous.</li>
<li>Le résultat de votre programme doit être le même à chaque exécution.</li>
<li>Un caractère en Java a le type <tt>char</tt>.</li>
<li>Une chaîne de caractères en Java a le type <tt>String</tt>. Ce type est immutable: les objets, une fois créés, ne peuvent pas être modifiés.</li>
<li>Étant donné une chaîne de caractères <tt>s</tt>, on peut avoir accès au 3e caractère avec la syntaxe <tt>s.charAt(2)</tt>.</li>
<li>On peut créer une chaîne de caractères  à partir de deux caractères  <tt>c1</tt> et  <tt>c2</tt> avec la syntaxe  <tt>Character.toString(c1) + Character.toString(c2)</tt>. Attention: <tt>c1 + c2</tt> ne donne pas une nouvelle chaîne de caractères quand <tt>c1</tt> et  <tt>c2</tt> sont des char.</li>
<li>Le nombre total de chaînes affichées est une valeur déterminée mathématiquement, il sera le même pour toutes les solutions correctes de ce problème.</li>
<li>La consigne «&nbsp;le caractère 'b' doit toujours être immédiatement suivi du caractère 'a'&nbsp;»  vous indique si une chaîne de caractères peut se terminer par le caractère 'b'. Vous devez être capable de comprendre cet énoncé logique.</li>
<li>Certains étudiants ne distinguent pas «&nbsp;l'ordre alphabétique&nbsp;» de «&nbsp;l'ordre lexicographique&nbsp;». L'ordre alphabétique est donné par a, b, c, d, etc. alors que l'ordre lexicographique est celui des mots dans le dictionnaire.</li>
</ol>


<p> <strong> Attention</strong> : Il n'y aura pas  d'indices  ou  d'exemples  personnalisés fournis à quiconque concernant cette question ou toute autre question notée. </p>

{{% /hint %}}


## Question-boni
<p>Un point supplémentaire est octroyé aux étudiants qui réussissent cette question. Notez qu'il n'est pas possible d'avoir plus que 100% sur le travail noté. Elle est principalement destinée aux étudiants qui cherchent à relever un défi.</p>
<p>Écrivez une classe Java qui génère aléatoirement <a href="https://fr.wikipedia.org/wiki/Sudoku">un tableau de Sudoku</a>. Vous pouvez utiliser la méthode <tt>Random.nextInt</tt> et votre tableau doit avoir le type <tt>int[][]</tt>. Votre tableau doit compter 9 rangées et 9 colonnes. Dans chaque colonne, chacun des chiffres de 1 à 9 doit apparaître (une seule fois). Dans chaque rangée, chacun des chiffres de 1 à 9 doit apparaître une seule fois. Expliquez votre solution. Pour les fins de ce travail, nous n’exigeons pas que  chaque sous-grille de 3×3 contienne tous les chiffres de 1 à 9.</p>

<p>Il n'est pas requis que votre code soit rapide, mais votre programme doit compléter son travail dans un temps raisonnable (par exemple, moins de deux minutes).</p>


<h2>En terminant</h2>
<p>Dans plusieurs cas, vos travaux sont corrigés par un «&nbsp;correcteur&nbsp;». Il est possible que vous puissiez identifier cette personne en examinant le document de rétroaction que vous recevez au sein du portail étudiant. Vous ne devriez jamais joindre cette personne. Cette personne n'a pas comme mandat de répondre à vos questions suite à la correction. Vos courriels seront ignorés. Il faut plutôt joindre la personne qui vous encadre au sein du cours.</p>
