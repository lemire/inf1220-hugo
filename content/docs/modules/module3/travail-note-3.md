---
title: "Travail noté 3"
weight: 5
---

<h1>Travail noté 3 - Les structures de données, de contrôle et d'itération</h1>


<p>Prenez note qu'<a href="https://rc-inf1220.teluq.ca/">il est permis d'utiliser le robot conversationnel du cours lors des travaux notés</a>. Cependant vous devez produire vos propres réponses et vos propres analyses.</p>

<h2>Directives </h2>
<ul>
  <li>Les travaux notés testent en partie votre capacité à comprendre des énoncés logiques. Vous devez lire de manière attentive les consignes et les questions, et vous devez montrer que vous êtes capable de les interpréter et de faire preuve de raisonnement abstrait. En tant que programmeur Java, vous devez être capable de lire un énoncé et de le convertir en code Java sans nécessairement qu'on doive vous expliquer l'énoncé ou vous fournir des exemples. L'examen à la fin de ce cours peut contenir des questions qui comprennent un énoncé formel et logique que vous devez transcrire en code Java. </li>
  <li>On s'attend à ce que vous fassiez des recherches sur le Web afin de réaliser ce travail. La recherche sur le Web est une activité essentielle en développement logiciel.</li>
  <li>Vous  devez remettre un fichier PDF contenant votre code. Vous ne devez pas inclure votre code Java en fichiers distincts.  Pour faciliter la correction, assurez-vous qu'on puisse copier-coller du texte à partir du document PDF.  Si votre document ne permet pas de copier-coller du texte, il pourra être refusé ou une note de zéro pourra être attribuée. Les travaux écrits à la main seront refusés. N'utilisez pas des saisies d'écran. </li>
<li>Vous devez remettre ce travail sur le site de dépôt des travaux de la TÉLUQ : <a href="https://www.teluq.ca/depot-travaux-etudiant">http://www.teluq.ca/depot-travaux-etudiant</a>. Vous ne pouvez utiliser l'outil de dépôt qu'après le début de votre cours et avant la fin de votre cours, et seulement si vous avez été  inscript au cours. En aucun cas est-ce que nous pouvons recevoir vos travaux par courriel. Les travaux transmis par courriel au sein du cours INF 1220 ne seront pas corrigés et recevrons une note de zéro. Il pourrait n'y avoir aucun avertissement : le dépôt du travail dans les délais  est votre responsabilité. Si vous éprouvez des difficultés techniques avec l'outil de dépôt, vous devez joindre l'Université pour obtenir de l'aide. </li>
<li>Dans certains cas, vous n'arrivez pas à résoudre complètement le problème. Ce n'est pas grave! Tentez de vous rendre aussi loin que possible, et expliquez le mieux possible votre solution et ce qui vous embête.</li>
<li>Notez que nous ne fournissons pas les solutions suite à la remise du travail noté.</li>
<li>Le niveau de difficulté et l'ampleur des travaux est comparable aux autres cours d'introduction à la programmation offert au sein des universités québécoises.</li>
<li>Les travaux au sein de ce cours sont des travaux individuels. Il est strictement défendu de discuter du travail noté avec quiconque. En particulier, des échanges au sein de réseaux sociaux (Facebook, etc.) concernant ce travail peuvent constituer une faute académique. Vous pourriez obtenir la note de zéro ou recevoir une sanction allant jusqu'à l'exclusion du programme dans lequel vous êtes inscrit si vous avez des discussions en ligne au sujet des travaux notés de ce cours.</li>
</ul>

  <p>Si vous avez des questions sur le travail, vous pouvez communiquer avec <a href="https://www.teluq.ca/siteweb/univ/dlemire.html">le professeur responsable</a>. Attention: nous ne donnons jamais d'indice (à quiconque) sur les travaux notés au-delà de ce qui est déjà dans l'énoncé (ce serait inéquitable).</p>


<h2>Les reports de la date de fin de cours</h2>


<p><strong>Rappel</strong>: le professeur ne peut pas modifier votre date de fin de cours  peu importe votre situation. Le moment après la date de fin de cours où votre dossier est fermé et où vous recevez (éventuellement) un incomplet est géré par l'Université. Il est de votre responsabilité de bien planifier votre temps.  Si vous avez des problèmes personnels qui limitent vos progrès (maladie, deuil, etc.), il faut voir avec l'Université: les professeurs n'ont aucune prise sur les dates de fin, sur les dates d'examen, etc.</p>


<p>Votre date de fin de cours est inscrite dans votre dossier et vous pouvez la trouver sur le portail étudiant et sur la documentation qu'on vous a remise lors de votre inscription. Il est possible que votre examen ait lieu des semaines ou même des mois après votre date de fin de cours: cela ne constitue pas une extension de votre date de fin de cours. Tout travail remis après votre date de fin de cours pourra recevoir la note de zéro. En tout temps, la note « incomplet » peut être attribuée à un travail qui n'est pas remis après votre date de fin de cours, même si vous n'avez pas encore passé l'examen.</p>
<h1>Question #1</h1>
<p>Écrivez un programme Java qui calcule la somme des nombres de 1 jusqu'à 10,000 (incluant 1 et 10,000) mais en omettant les nombres qui sont divisibles par trois et en omettant aussi les nombres dont le chiffre de la centaine est 2 ou 3 (par exemple 1201 ou 3313). Expliquez votre solution. Un travail remis sans explications suffisantes peut se voir attribué la note de zéro, sans droit de reprise. Vous devez justifier tous les qualifiants utilisés (private, public, protected, static): vous ne pouvez pas utiliser le mot-clé « static » sans le justifier.</p>

<p>Vous devez tester votre solution. Vous devez inclure la sortie (affichage) du code dans votre solution. Si remettez du code non-fonctionnel, vous pourrez recevoir la note de zéro!</p>

<p>Attention:  vous devez remettre votre travail sous la forme d'un seul fichier PDF (et non pas sous la forme de fichiers Java). </p> 

<ol>
<li>Cette question exige une maîtrise de l'arithmétique de base. Étant donné, par exemple, le nombre 1234, vous devriez pouvoir construire une expression mathématique élémentaire qui permet de trouver les centaines ('2'), les dizaines ('3') ou les milliers ('1'). Vous pouvez consulter le site d'aide aux devoirs <em>alloprof</em> à ce sujet: <a href="https://www.alloprof.qc.ca/fr/eleves/bv/mathematiques/les-positions-et-les-valeurs-des-nombres-m1017">Les positions et les valeurs des nombres</a>.</p>
<li>Les opérateurs / et % sont utiles pour ce problème. À ce point dans le cours, vous devriez être pleinement familier avec les opérateurs arithmétiques en Java. </p>
<li>Est-ce que la somme peut être représentée par une variable de type <tt>int</tt>? Assurez-vous de discuter ce point dans votre solution.</li>
</ol>

<p> Le cours comprend plusieurs exemples avec solutions. Par contre, les solutions des travaux notés ne sont jamais transmises dans ce cours: si vous avez des questions sur vos résultats, vous pouvez poser des questions au professeur.  Assurez-vous de poser des questions précises, et prenez le temps de consulter la rétroaction du correcteur. (Indice: si vous demandez les solutions suite à la correction de votre travail, vous nous indiquez que vous n'avez pas bien lu les consignes.)</p>


<p>Pour faciliter la correction, assurez-vous qu'on puisse copier-coller votre code à partir du document PDF. N'utilisez pas des saisies d'écran.Si le code de votre solution n'est pas du Java valable, s'il ne compile pas, une note de zéro pourra être attribuée. Pour réussir ce cours, vous devez être capable d'écrire du code Java fonctionnel et correct.</p>

<h1>Question #2</h1>

<p>Écrivez un programme Java qui affiche à l'écran toutes les chaînes de 4 caractères en ordre lexicographique (aussi appelé l'ordre du dictionnaire). Il doit afficher une chaîne de 4 caractères par ligne. Seuls les caractères a, b, c, d sont permis au sein des chaînes de caractères, mais vous pouvez réutiliser plus d'une fois un même caractère au sein d'une même chaîne. Au sein d'une même chaîne, le caractère 'b' doit toujours être immédiatement suivi du caractère 'a'. Une même chaîne ne peut comporter à la fois le caractère 'd' et le caractère 'a'. Votre programme doit se terminer en affichant à l'écran le nombre de chaînes de caractères affichées. Votre programme ne reçoit rien en entrée. Le code de votre programme ne doit pas comprendre les chaînes de caractères pré-calculées: il doit les générer lors de l'exécution. Votre programme ne devrait pas contenir plus de 200 courtes lignes de code.</p>

<p>Expliquez votre solution. Un travail remis sans explications suffisantes peut se voir attribué la note de zéro, sans droit de reprise. Vous devez justifier tous les qualifiants utilisés (private, public, protected, static): vous ne pouvez pas utiliser le mot-clé « static » sans le justifier.</p>

<p>Vous devez tester votre solution et inclure la sortie (affichage) du code dans votre solution. </p>

<p>Vous devriez avoir vérifié que votre programme fonctionne. Si remettez du code non-fonctionnel, vous pourrez recevoir la note de zéro! Si le code de votre solution n'est pas du Java valable, s'il ne compile pas, une note de zéro pourra être attribuée. Pour réussir ce cours, vous devez être capable d'écrire du code Java fonctionnel et correct.</p>

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
<li>La consigne « le caractère 'b' doit toujours être immédiatement suivi du caractère 'a' »  vous indique si une chaîne de caractères peut se terminer par le caractère 'b'. Vous devez être capable de comprendre cet énoncé logique.</li>
<li>Certains étudiants ne distinguent pas « l'ordre alphabétique » de « l'ordre lexicographique ». L'ordre alphabétique est donné par a, b, c, d, etc. alors que l'ordre lexicographique est celui des mots dans le dictionnaire.</li>
</ol>


<p> <strong> Attention</strong> : Il n'y aura pas « d'indices » ou « d'exemples » personnalisés fournis à quiconque par le professeur concernant cette question ou toute autre question notée. Il est inutile de nous écrire pour demander des indices, des exemples, des bouts de code, etc.</p>


<h1>Question-boni</h1>
<p>Un point supplémentaire est octroyé aux étudiants qui réussissent cette question. Notez qu'il n'est pas possible d'avoir plus que 100% sur le travail noté. Elle est principalement destinée aux étudiants qui cherchent à relever un défi.</p>
<p>Écrivez une classe Java qui génère aléatoirement <a href="https://fr.wikipedia.org/wiki/Sudoku">un tableau de Sudoku</a>. Vous pouvez utiliser la méthode <tt>Random.nextInt</tt> et votre tableau doit avoir le type <tt>int[][]</tt>. Votre tableau doit compter 9 rangées et 9 colonnes. Dans chaque colonne, chacun des chiffres de 1 à 9 doit apparaître (une seule fois). Dans chaque rangée, chacun des chiffres de 1 à 9 doit apparaître une seule fois. Expliquez votre solution. Pour les fins de ce travail, nous n’exigeons pas que  chaque sous-grille de 3×3 contienne tous les chiffres de 1 à 9.</p>

<p>Il n'est pas requis que votre code soit rapide, mais votre programme doit compléter son travail dans un temps raisonnable (par exemple, moins de deux minutes).</p>


<h2>En terminant</h2>
<p>Dans plusieurs cas, vos travaux sont corrigés par un « correcteur ». Il est possible que vous puissiez identifier cette personne en examinant le document de rétroaction que vous recevez au sein du portail étudiant. Vous ne devriez jamais joindre cette personne. Cette personne n'a pas comme mandat de répondre à vos questions suite à la correction. Vos courriels seront ignorés. Il faut plutôt joindre la personne qui vous encadre au sein du cours.</p>
</div>
