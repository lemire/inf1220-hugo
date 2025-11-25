---
title: "Travail noté 5"
weight: 4
---

# Travail noté 5 - Héritage et polymorphisme

Pour le cours INF1220, les travaux notés doivent être soumis sous forme d’un unique fichier PDF via l’outil de dépôt officiel de la TÉLUQ, avant la date de fin de cours indiquée sur le portail étudiant. Les soumissions par courriel ne sont pas acceptées et entraînent une note de zéro, tout comme les documents manuscrits, les saisies d’écran ou ceux ne permettant pas le copier-coller du code Java. L’utilisation du robot conversationnel du cours est autorisée, mais les réponses et analyses doivent être personnelles. Avant de commencer, il est crucial d’avoir complété toutes les lectures et exercices préparatoires et de maîtriser la matière, en posant des questions si nécessaire.

La date de fin de cours, fixée par l’Université, est non négociable par les enseignants, et tout travail soumis tardivement risque une note de zéro ou un «&nbsp;incomplet&nbsp;», même si l’examen a lieu plus tard. En cas de difficultés personnelles (maladie, deuil, etc.), les étudiants doivent contacter l’Université pour demander un report. Les problèmes techniques avec l’outil de dépôt doivent également être résolus via l’Université. Aucun indice supplémentaire ne sera fourni au-delà de l’énoncé pour garantir l’équité, et les étudiants sont responsables de planifier leur temps et de vérifier soigneusement leur travail avant soumission.

Les travaux sont strictement individuels, et tout échange, notamment sur les réseaux sociaux, est considéré comme une faute académique pouvant entraîner une note de zéro ou une exclusion du programme. Le fichier PDF doit contenir le code Java, intégré de manière à faciliter la correction, sans fichiers séparés. La préparation rigoureuse, incluant la maîtrise des concepts et la vérification du travail, est essentielle pour éviter les erreurs et répondre aux attentes du cours.



### Mettre en forme votre code Java

Nous vous demandons d'apporter une attention particulière à la mise en page de votre code Java. Une indentation cohérente, avec généralement quatre espaces par niveau, facilite la lecture et la compréhension du flux logique du programme. Veillez à aligner les accolades ouvrantes et fermantes, à espacer les opérateurs et les virgules de manière uniforme, et à limiter la longueur des lignes à environ 100 caractères pour éviter les retours à la ligne forcés. Nous vous suggérons de 
rédiger vos travaux en [MarkDown]({{< relref "/docs/modules/module2/markdown/" >}}). Si vous souhaitez utiliser un traitement de texte comme Microsoft Word, vous pouvez utiliser [notre outil de formattage]({{< relref "/docs/format/" >}}) pour améliorer l'apparence de votre code Java en générant une version colorée et syntaxiquement mise en évidence. Certains éditeurs vous permettent aussi de mettre en forme votre code automatiquement. Enfin, n'oubliez pas d'ajouter des commentaires clairs et concis pour expliquer les parties complexes, en les plaçant au-dessus des blocs de code concernés plutôt qu'en fin de ligne. Choisissez une police de caractères à taille fixe et suffisamment petite pour afficher 100 caractères par ligne. Le code informatique est mis en forme avec un interligne simple.


## Utilisation d'un environnement de programmation en ligne

Si vous avez utilisé notre [environnement de développement Java en ligne]({{< ref "/docs/environnement" >}}),
directement dans le site du cours, vous pouvez utiliser le bouton *partager* pour obtenir un URL pointant
vers votre code informatique exécutable. Nous vous encourageons à inclure cet URL dans votre travail noté
pour rendre la correction plus aisée.  Par ailleurs, vous pouvez ainsi prouver que votre code compile et
s'exécute. L'URL peut être un peu long, assurez-vous de le tester avant de remettre votre travail noté.


# Question #1

Veuillez expliquer en quelques phrases les résultats ou les erreurs suivantes lors de l'utilisation de ces classes dans la classe `TestAnimaux.java`.


{{< javaMultiRunner files="TestAnimaux.java;Animaux.java;Chat.java;Chien.java;GrosChien.java" >}}


# Question #2

En tant que programmeur, vous recevez le code suivant. Vous devez appliquer l'héritage afin que Cercle et Carré héritent à la fois de Forme et Resizable. Vous pouvez bien entendu modifier le code reçu. Utilisez votre bon jugement. Votre solution doit comprendre au moins une classe abstraite. Vous devez expliquer vos choix de manière détaillée: un travail remis avec des explications insuffisantes pourra se voir attribué la note de zéro, sans droit de reprise.


{{< javaMultiRunner files="TestCercle.java;Cercle.java;Carre.java;Resizable.java;Forme.java" >}}

# Question #3

À quoi servent les interfaces en Java ? Utilisez la question précédente (2) comme base de discussion. Maximum 5 phrases.




## En terminant
<p>Dans plusieurs cas, vos travaux sont corrigés par un «&nbsp;correcteur&nbsp;». Il est possible que vous puissiez identifier cette personne en examinant le document de rétroaction que vous recevez au sein du portail étudiant. Vous ne devriez jamais joindre cette personne. Cette personne n'a pas comme mandat de répondre à vos questions suite à la correction. Vos courriels seront ignorés. Il faut plutôt joindre la personne qui vous encadre au sein du cours.</p>

### Robot conversationnel – Questionnaire de retour sur expérience
<p>Qu’avez-vous pensé du robot conversationnel du cours? Votre avis compte pour nous. Nous vous invitons à compléter le
    <a href="https://forms.office.com/r/hUmgu60KuN" target="_blank" rel="noopener">questionnaire de retour sur expérience</a> (5 minutes). Nous vous remercions pour votre contribution à notre projet pilote.</p>
