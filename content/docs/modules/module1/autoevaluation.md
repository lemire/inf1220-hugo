---
title: "Autoévaluation"
weight: 3
---

# Autoévaluation

Avant de débuter le cours, il est important de faire le point sur votre préparation.
Je vous invite donc à faire une autoévaluation.


## Connaissances technologiques

<p>Le cours ne nécessite pas une connaissance approfondie du fonctionnement des ordinateurs, mais il est utile d'avoir
    une certaine connaissance de base. Vous devriez savoir que les ordinateurs disposent d'un processeur, de mémoire, de
    disques, etc. et qu'ils fonctionnent à l'aide d'un système d'exploitation. Si vous ne vous êtes jamais intéressés à
    ces concepts de base, il peut être utile que vous preniez un peu de votre temps pour faire des recherches sur ces
    questions. Il peut être difficile de suivre ce cours si vous ne savez vraiment pas ce qu'est un processeur ou de la
    mémoire informatique.</p>

## Mathématiques

Pour pouvoir faire de l'informatique, il convient de connaître les mathématiques. 
La division euclidienne, par exemple, offre une perspective fondamentale sur la décomposition des nombres. Elle ne se limite pas à un calcul, mais exprime une relation entre un dividende, un diviseur, un quotient et un reste. Considérons \( 75 \div 8 \) : le quotient est \( 9 \) et le reste \( 3 \), car \( 8 \times 9 = 72 \) et \( 75 - 72 = 3 \). De même, pour \( 20 \div 6 \), le quotient est \( 3 \) et le reste \( 2 \). Le reste, toujours inférieur au diviseur, capture l’excédent d’une division imparfaite. Cette idée devient puissante lorsqu’on remarque, par exemple, que si \( x \div y \) laisse un reste de \( 1 \), alors \( x - 1 \) est un multiple de \( y \), révélant une propriété intrinsèque de divisibilité.
Les nombres se déclinent en catégories – entiers, réels, rationnels, irrationnels – chacune porteuse de propriétés distinctes. Le nombre \( \sqrt{2} \), réel et irrationnel, défie toute représentation fractionnaire, incarnant une rupture avec les nombres rationnels. Le théorème fondamental de l’arithmétique, quant à lui, établit que tout entier positif supérieur à \( 1 \) se factorise de manière unique en nombres premiers. Ainsi, \( 28 = 2^2 \times 7 \). Si \( x \) divise un nombre impair \( z \), alors \( x \) est nécessairement impair, car un diviseur pair engendrerait un résultat pair, contredisant l’hypothèse.
Les opérations algébriques, régies par un ordre de priorité, reflètent une logique de structuration des calculs. Les parenthèses redéfinissent cet ordre, comme dans \( (2 + 3) \times 5 = 25 \), où l’addition prime, contrairement à \( 2 + 3 \times 5 = 17 \), où la multiplication domine. Les exposants et les logarithmes sont un exemple de fonction inverse : nous avons que \( \log_3(81) = 4 \) car \( 3^4 = 81 \). 
La propriété \( \frac{\log x}{\log b} = \log_b x \) est fort utile.
La factorielle, comme \( 4! = 4 \times 3 \times 2 \times 1 = 24 \), quantifie les arrangements possibles. Pour la probabilité d’obtenir une somme de \( 7 \) avec deux dés, on recense les cas favorables \( (1,6), (2,5), (3,4), (4,3), (5,2), (6,1) \), soit 6, sur 36 résultats, donnant \( \frac{6}{36} = \frac{1}{6} \). 
On peut trier les objects selon différents orders. L’ordre lexicographique, appliqué à des nombres comme \( 3, 30, 4 \), les trie comme des chaînes \( 3, 30, 4 \), illustrant une logique de classement importée du langage.


<p><strong>Si vous n'avez pas fait les mathématiques du collégial ou pris un cours d'appoint équivalent, vous ne pouvez
        pas suivre INF 1220</strong>. Si on vous demande de suivre un cours d'appoint en mathématiques, vous devez
    suivre ce cours d'appoint <strong>avant</strong> de vous inscrire à INF 1220. Il est de votre responsabilité d'y
    voir.</p>

<p>Si vous avez réussi les mathématiques du collégial il y a trop longtemps, vous devez soit les réviser, soit prendre
    un cours d'appoint. On s'attend à ce que les étudiants de ce cours, et les étudiants qui adoptent un cheminement en
    informatique généralement, aient de longue date une aisance mathématique. Par exemple, si vous avez complété vos
    études secondaires au Québec récemment, on s'attend à ce que vous apparteniez aux profils Technico-Science ou
    Sciences Naturelles plutôt que Culture, Société et Technique.</p>

## Autoévaluation (mathématiques)

<p>
    Faites l'autoévaluation mathématique suivante avant de continuer au sein du cours. Ces questions devraient être
    faciles, même évidentes, si vous avez une préparation adéquate.
</p>


{{< webapp path="mathquiz.html" >}}

<p>Si ces questions ne sont pas faciles pour vous, ne continuez pas dans ce cours!!! Vous devez soit réviser vos
    mathématiques de base, et peut-être suivre un cours d'appoint tout en poursuivant des études complémentaires sur une
    base autonome.</p>

<p>Certains étudiants qui n'ont pas la préparation suffisante décident de tout de même poursuivre dans le cours sans
    pour autant prévoir du temps supplémentaire pour l'étude de la matière vue au secondaire et au collégial.
    Malheureusement pour eux, ils se rendent souvent compte qu'ils vont faire face à des difficultés alors qu'il n'est
    plus possible d'abandonner le cours sans pénalité. Parfois, ces étudiants s'attendaient à tort que le cours leur
    permette de combler les failles dans leur préparation, ou bien alors ils ne prennent pas sérieusement nos
    avertissements. Soyez responsable et évitez donc les ennuis: assurez-vous d'avoir une préparation adéquate avant de
    poursuivre dans le cours !</p>

## Autoévaluation (aptitude en programmation)


Pour se préparer au cours INF 1220, il est crucial de développer une rigueur intellectuelle et une capacité à raisonner de manière abstraite, deux qualités indispensables à la programmation. Programmer ne se limite pas à écrire des lignes de code : c’est un exercice de pensée structurée qui exige de décomposer un problème en étapes logiques, de les traduire en instructions précises et de vérifier méticuleusement leur exactitude. Un programme fonctionne ou échoue sans demi-mesure, ce qui impose une discipline constante : écrire, tester, corriger, puis tester à nouveau. La patience et l’attention aux détails sont essentielles, car une simple erreur, comme une virgule mal placée, peut compromettre un programme entier. S’entraîner à résoudre des problèmes logiques, comme déterminer qui de Jean ou Pierre arrive en premier au travail dans un énoncé où Jean est immédiatement suivi par Pierre, aide à affûter cette précision. Si de tels énoncés semblent opaques ou exigent un effort disproportionné, il peut être utile de renforcer ses bases en logique avant d’aborder le cours.


# Question 1

*Jean et Pierre travaillent ensemble. Jean s'assure d'être toujours immédiatement suivi par Pierre quand ils arrivent au travail. Qui arrive le premier au travail ?*


{{< webapp path="jean.html" >}}


Si cet énoncé ne vous semble pas clair et que vous ne trouvez pas immédiatement la bonne réponse, il est probable que vous ne devriez pas suivre le cours INF 1220.

# Question 2

Supposons que vous disposiez d'un livre ayant des pages numérotées (1, 2, 3, ...). Vous souhaitez lire toutes les pages. Vous appliquez la recette suivante.

Vous disposez d'un calepin (effaçable) où vous pouvez écrire un nombre entier, et un seul nombre entier. Vous écrivez sur le calepin le nombre zéro (0). Vous passez ensuite à l'étape A.

- Étape A : Vous prenez le calepin, vous consultez le nombre qui y est écrit, vous lui ajoutez un, et vous écrivez le résultat sur le calepin. Par exemple, si la valeur lue est "0", vous la remplacez par "1". Vous passez ensuite à l'étape B.
- Étape B : Vous prenez le calepin, vous consultez le nombre qui y est écrit, vous allez à la page correspondante au nombre lu dans le livre, vous lisez la page en question. Vous passez ensuite à l'étape C.
- Étape C : Vous prenez le calepin, vous consultez le nombre qui y est écrit. Si le nombre lu excède le nombre de pages du livre, vous terminez la recette et vous fermez définitivement le livre. Autrement, vous retournez à l'étape A.


{{% hint info %}}
Essayez d'appliquer cette recette avec un livre comptant cinq pages. Que constatez-vous ?
{{% /hint %}}

Utilisez cette application pour explorer le problème.

{{< webapp path="lecture.html" >}}


Cette recette est erronée. Si vous êtes incapable de voir l'erreur rapidement, ou si ça vous demande beaucoup d'effort, il est possible que vous n'ayez pas de bonnes aptitudes pour la programmation et que le cours INF 1220 ne soit pas pour vous. Cela ne signifie pas que vous ne puissiez pas apprendre à programmer, mais le cours INF 1220 a été pensé en fonction d'étudiants qui ont un certain degré de préparation.

Si vous n'avez pas les aptitudes requises, le cours peut vous paraître inaccessible. Il est possible que vous deviez consacrer beaucoup plus que 9 heures par semaine pour réussir le cours. Vous devez garder à l'esprit que le cours INF 1220 est un cours d'informatique universitaire offert au sein d'un cursus scientifique menant à des diplômes en informatique.

## Maîtrise de l'anglais

<p>Le site web du cours, ses travaux, ses vidéos et ses exercices, ainsi que notre manuel (Java pas à pas) et notre
    manuel de référence sont tous en français. Par contre, l'anglais est un incontournable en informatique. De temps en
    temps, nous allons donc vous offrir des liens vers des ressources (optionnelles) en anglais.</p>

<p>Si vous ne maîtrisez pas l'anglais, vous devez savoir qu'il est essentiellement impossible de faire carrière ou
    d'avancer dans le domaine de l'informatique sans une maîtrise élémentaire de l'anglais.</p>

<p>L'informatique s'est développée d'abord et avant tout dans les pays anglophones (principalement la Grande-Bretagne et
    les États-Unis). La grande puissance Américaine domine le domaine de l'informatique. S'il est possible d'utiliser
    des ordinateurs sans maîtriser l'anglais, il n'est pas envisageable de développer du logiciel sans maîtriser
    l'anglais.</p>




## Un cours difficile ?

<p>Le cours est un cours d'informatique universitaire, il conçu de manière à vous préparer à suivre une formation plus
    poussée en informatique. Il ne s'agit donc pas d'un cours technique qui vise à vous former pour un travail pratique
    et immédiat. On ne cherche pas à apprendre la programmation le plus rapidement possible, mais bien à établir des
    bases solides en étudiant les principes de base comme la notion d'algorithme. Notre objectif premier est de vous
    préparer à des cours plus avancés en informatique. Il ne s'agit donc pas d'un cours grand public. Nous y utilisons
    une terminologie propre à l'informatique. Nous n'évitons pas les mathématiques. Le contenu du cours, la charge de
    travail, l'ampleur de travaux et la composition de l'examen sont comparables à ce que vous trouvez au sein de cours
    d'introduction à la programmation dans les universités québécoises. Il s'agit tout de même d'un cours
    d'introduction: si avez pris des cours de programmation auparavant, ou que vous avez une longue expérience avec la
    programmation informatique, ce cours n'est sans doute pas pour vous.</p>

<p>La quasi-totalité des nos étudiants au sein du cours INF 1220 viennent de trois programmes: développement logiciel
    (0127), informatique appliquée (4128) et majeure en informatique (6010).
    Sur 250 étudiants par année, il y a environ 5 échecs et 20 abandons. Nous travaillons continuellement pour améliorer
    le taux de réussite de nos étudiants, mais rien ne peut remplacer un engagement sérieux de la part des étudiants.
    Ceci étant dit, nous sommes fiers du fait que parmi les étudiants qui terminent le cours, la grande majorité
    apprécient beaucoup le cours. Il s'agit souvent d'un des cours les mieux évalués au sein de notre université.</p>
<p>Voici quelques commentaires de nos étudiants : </p>

<ol>
    <li><em>INF 1220 une vraie initiation au paradigme OO pour moi, et j'ai aussi réalisé que mon cours sur Udemy était
            insuffisant, voire médiocre...</em></li>
    <li><em>J'ai un bac en administration et ce cours est de loin le cours le plus difficile que j'ai suivi. Il a
            parfois fallu que je cherche longtemps sur Internet, et j'ai souvent été frustré par le Java, mais
            maintenant que j'ai terminé le cours, j'ai vraiment l'impression d'avoir appris à programmer.</em></li>
</ol>

<p>Le taux de réussite du cours est d'environ 80%. En d'autres termes, de tous les étudiants qui s'inscrivent et cheminent dans le cours, 80% auront la note de passage.</p>

<p>Nous croyons que si vous vous engagez pleinement dans le cours et que vous avez la préparation et les aptitudes
    nécessaires, vous serez satisfait de votre expérience.</p>
