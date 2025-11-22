---
title: "Les ordinateurs et leurs langages"
weight: 4
---

# Court historique des langages de programmation

L’idée de programmer des machines remonte au 19e siècle, époque marquée par l’émergence des premières machines de calcul et d’automatisation. Dès 1801, les métiers à tisser Jacquard utilisaient des cartes perforées pour programmer des motifs textiles, préfigurant les concepts de codage. Cependant, c’est au milieu du 19e siècle qu’un jalon historique est posé avec les travaux d’Ada Lovelace (1815-1852) sur la machine analytique de Charles Babbage. Considérée comme la première programmeuse, elle rédigea des notes détaillées incluant un algorithme pour calculer les nombres de Bernoulli, démontrant qu’une machine pouvait exécuter des instructions complexes. Le langage Ada, créé dans les années 1980, rend hommage à cette contribution pionnière.

L’avènement des ordinateurs modernes dans les années 1940-1950 marque un tournant décisif. Les premiers langages de programmation apparaissent pour répondre aux besoins de calcul scientifique, commercial et logique. Parmi eux, FORTRAN (1954) facilite les calculs scientifiques, LISP (1958) introduit des concepts d’intelligence artificielle et de traitement symbolique, et COBOL (1959) s’impose dans la gestion des données commerciales. Ces langages, bien que rudimentaires comparés aux standards actuels, posent les bases des paradigmes de programmation modernes.

Le langage ALGOL (Algorithmic Language) est un langage de programmation développé à la fin des années 1950, conçu pour exprimer des algorithmes de manière claire et structurée. Créé par un comité international de chercheurs, dont John Backus et Peter Naur, ALGOL a été introduit avec sa première version, ALGOL 58, suivie par ALGOL 60, qui est devenue la plus influente. Son objectif était de fournir un langage universel pour décrire des algorithmes, à la fois pour la recherche scientifique et l’enseignement, tout en servant de base pour le développement de compilateurs ALGOL se distingue par plusieurs innovations. Il introduit une syntaxe formelle, décrite par la notation de Backus-Naur (BNF), qui permet de définir précisément la structure du langage. Il propose des concepts comme la programmation structurée, avec des blocs de code délimités, des boucles et des conditionnelles bien définies, ainsi que la récursivité. Contrairement à des langages comme FORTRAN, orientés vers le calcul numérique, ALGOL privilégie la lisibilité et la généralité, ce qui en fait un précurseur des langages modernes. Bien qu’ALGOL n’ait pas été largement adopté dans l’industrie, il a eu une influence majeure. Des langages comme Pascal, C et Simula en sont directement inspirés. Simula, en particulier, a étendu ALGOL en y intégrant les concepts de classes et d’objets, posant les bases de la programmation orientée objet. ALGOL reste ainsi une étape clé dans l’histoire de l’informatique, reconnu pour sa rigueur conceptuelle et son impact sur la conception des langages de programmation.


<details>
<summary>Notation de Backus-Naur</summary>


La notation de Backus-Naur (BNF) est une méthode formelle pour décrire la syntaxe d’un langage, qu’il s’agisse de langages de programmation, de protocoles ou de formats de données. Développée par John Backus et Peter Naur pour le langage ALGOL 60, elle définit les règles grammaticales d’un langage de manière précise et concise. BNF utilise des règles de production pour spécifier comment des symboles (terminaux et non-terminaux) peuvent être combinés pour former des constructions valides. Elle est essentielle pour concevoir des compilateurs et des analyseurs syntaxiques.

- *Symboles terminaux* : Éléments de base du langage, comme des mots-clés, des opérateurs ou des caractères (par exemple, `if`, `+`, `1`).
- *Symboles non-terminaux* : Catégories ou abstractions représentant des structures du langage (par exemple, `<expression>`, `<instruction>`).
- *Règles de production* : Définissent comment un symbole non-terminal peut être remplacé par une combinaison de terminaux et/ou non-terminaux, sous la forme `<symbole> ::= définition`.
- *Méta-symboles* : BNF utilise `::=` pour indiquer une définition et `|` pour exprimer des alternatives.

Une règle s’écrit ainsi :
```
<nom_du_symbole> ::= séquence_de_symboles | autre_séquence
```
- Le côté gauche (`<nom_du_symbole>`) est un non-terminal.
- Le côté droit décrit les combinaisons possibles de terminaux et non-terminaux.
- Le symbole `|` sépare les alternatives.

Par exemple, pour définir la syntaxe d’un nombre entier (composé de chiffres de 0 à 9) :
```
<chiffre> ::= "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
<nombre_entier> ::= <chiffre> | <chiffre> <nombre_entier>
```
- `<chiffre>` est un symbole terminal parmi `"0"`, `"1"`, ..., `"9"`.
- `<nombre_entier>` est soit un `<chiffre>`, soit un `<chiffre>` suivi d’un autre `<nombre_entier>` (permettant des nombres comme `42` ou `123`).
- La règle est récursive.

BNF permet de définir la syntaxe des langages de manière non ambiguë, facilitant la création d’analyseurs syntaxiques pour les compilateurs. Elle est utilisée pour des formats de données (par exemple, JSON) ou des protocoles réseau. Des variantes comme EBNF (Extended BNF) ajoutent des fonctionnalités comme la répétition ou les expressions optionnelles.

</details>

Au fil des décennies, les langages évoluent pour offrir plus d’abstraction, de flexibilité et d’accessibilité. Dans les années 1980 et 1990, des langages comme C++ (1983), Python (1991), Java (1995), JavaScript (1995) et PHP (1995) voient le jour, chacun répondant à des besoins spécifiques : performance pour C++, simplicité pour Python, portabilité pour Java, interactivité web pour JavaScript, ou développement web dynamique pour PHP. Aujourd’hui, ces langages dominent l’industrie, comme le montre le classement 2017 de l’IEEE Spectrum, qui reflète leur popularité et leur polyvalence.

Tous ces langages partagent un objectif commun : permettre aux programmeurs de décrire des solutions à des problèmes en s’éloignant progressivement des contraintes du matériel. Pour comprendre leur rôle, il est essentiel de se pencher sur le fonctionnement des ordinateurs.

## Programmation orientée objet

La programmation orientée objet trouve ses origines dans les années 1960 avec le langage Simula, développé en Norvège par Ole-Johan Dahl et Kristen Nygaard. Simula introduit les concepts de classes et d’objets pour modéliser des entités du monde réel, ouvrant la voie à une nouvelle façon de structurer les programmes.

Ole-Johan Dahl et Kristen Nygaard ont développé Simula dans les années 1960 avec pour motivation principale de créer un langage capable de modéliser et de simuler des systèmes complexes du monde réel. Travaillant au Centre de calcul norvégien à Oslo, ils cherchaient à résoudre des problèmes liés à la simulation de processus, notamment dans des domaines comme la recherche opérationnelle et la gestion de systèmes dynamiques. Leur objectif était de concevoir un outil permettant de représenter des entités concrètes (comme des objets physiques ou des processus) et leurs interactions de manière intuitive.

Simula, initialement conçu comme une extension du langage ALGOL, a introduit les concepts de classes et d’objets pour répondre à ce besoin. Nygaard, en particulier, était motivé par la nécessité de modéliser des systèmes où de multiples entités agissaient simultanément, comme dans les simulations de flux de trafic ou de réseaux de communication. Dahl, quant à lui, apportait une rigueur mathématique pour structurer ces idées dans un cadre formel. Leur vision était de rendre la programmation plus proche de la pensée humaine, en représentant les concepts du monde réel directement dans le code, ce qui a jeté les bases de la programmation orientée objet.

Dans les années 1980, le langage Smalltalk, conçu par Alan Kay et son équipe chez Xerox PARC, popularise la programmation orientée objet en mettant l’accent sur l’interaction entre objets, l’héritage et le message passing. Smalltalk influence profondément la conception des langages modernes.

Alan Kay a conçu le langage Smalltalk avec son équipe chez Xerox PARC dans les années 1970 pour explorer de nouvelles façons de rendre l’informatique plus accessible, flexible et intuitive. Sa motivation principale était de créer un environnement où les utilisateurs, y compris les enfants, pourraient manipuler des objets graphiques et apprendre à programmer de manière interactive. Il voulait que l’ordinateur devienne un «&nbsp;media personnel&nbsp;», aussi malléable qu’un carnet de notes, permettant l’expérimentation, la simulation et la construction de connaissances.

Smalltalk a été pensé comme un outil pédagogique, inspiré par les idées de Seymour Papert sur l’apprentissage par la manipulation et la découverte. Alan Kay cherchait à démocratiser la programmation et à rendre le logiciel aussi modulaire et réutilisable que les objets du monde réel, d’où l’accent mis sur les objets, les messages et l’interactivité.


Je vous invite à regarder la vidéo suivante par le père de la programmation orientée objet.

{{< youtube id="aYT2se94eU0" >}}


<details>
<summary>Transcription traduite en français
</summary>
0:40
Merci. Eh bien, je présume que la plupart d’entre vous ont veillé toute la nuit. Je n’imagine pas voir autant de programmeurs à huit heures du matin.

0:58
Je suppose que c’est la plus grande salle de bain dans laquelle j’ai jamais donné une conférence. C’était juste un test pour voir si vous pouviez me comprendre. En fait, je ne me comprends pas moi-même ici.

1:14
Je n’étais pas revenu à cette conférence depuis la première édition. Quand j’ai été invité à donner cette présentation, je me demandais si je devais accepter ou non, et quoi faire. Il m’est venu à l’esprit que cette conférence, à ce moment précis, se situe au cœur du vingt-cinquième anniversaire de Smalltalk.


1:58
L’interpréteur d’une page que j’ai écrit il y a quelques semaines, il y a vingt-cinq ans, et la première version fonctionnelle, réalisée quelques semaines plus tard, il y a vingt-cinq ans, placent cet événement à peu près au centre. Voyons si je peux afficher notre devise. Puis-je avoir la première diapositive, s’il vous plaît ? 

2:31
Je ne vais pas donner une conférence historique, car j’ai enfin rempli ces obligations lors de la conférence sur l’histoire des langages de programmation il y a quelques années. Mais j’ai pensé qu’il pourrait être intéressant, pour ceux qui n’ont pas programmé ces vingt-cinq ou trente dernières années, de faire un voyage de deux minutes. 

3:00
Ces images remontent à 1973 et 1974 chez Xerox PARC. Elles montrent certains des premiers enfants avec lesquels nous avons travaillé. La musique que vous entendrez dans cet extrait a été composée par un membre de notre groupe, Chris Jeffers. Elle s’appelle *The Happy Hacker*, au cas où vous voudriez un thème musical. Elle est jouée en synthèse FM en temps réel que nous avons développée pour l’ordinateur Alto.

3:29
C’est le précurseur des stations de travail et du Macintosh, sans aucun matériel de synthèse sonore supplémentaire, car pourquoi en avoir si votre ordinateur est bien conçu ?

3:48
Avant de lancer cet extrait, voyons, juste pour le plaisir, combien de personnes dans cette salle aujourd’hui ont participé à l’expérience Smalltalk chez Xerox PARC entre 1971 et 1983 environ. Pouvez-vous vous lever ? Voyons combien nous sommes. Y a-t-il quelqu’un sans cheveux gris ? Merci.

4:19
Bien, lançons cet extrait.


5:19
C’était l’état des choses il y a environ vingt-cinq ans. En introduction, j’ai essayé de trouver comment aborder cette conférence. J’ai fini par me souvenir d’un article de Dijkstra. Combien d’entre vous ont rencontré Dijkstra ? Vous savez probablement que l’arrogance en informatique se mesure en nano-Dijkstras.


5:58
Il a écrit un article intitulé *Sur le fait que l’Atlantique a deux rives*. Il parlait des différences entre les approches de l’informatique en Europe, surtout aux Pays-Bas, et aux États-Unis. Aux États-Unis, nous n’étions pas assez mathématiques. En Hollande, si vous êtes professeur titulaire, vous êtes nommé par la reine. Il y a beaucoup d’autres distinctions importantes entre ces deux cultures.

6:44
J’ai écrit une réponse intitulée *Sur le fait que la plupart des logiciels dans le monde sont écrits d’un seul côté de l’Atlantique*. Avec mon diplôme en mathématiques, j’expliquais que les ordinateurs forment une nouvelle forme de mathématiques. On ne peut pas les juger selon les mathématiques classiques. Ceux qui essaient se livrent à une forme d’autosatisfaction sans s’en rendre compte.

7:29
C’était une sorte de mathématiques pratiques, un équilibre entre créer des structures cohérentes, bien plus vastes que tout ce que les mathématiques classiques ont jamais envisagé, et gérer les mêmes problèmes que les mathématiques de grande échelle : convaincre qu’on a couvert tous les cas.

8:00
Un mathématicien nommé Euler a produit vingt gros volumes de spéculations, dont la plupart étaient justes, mais presque toutes ses preuves étaient erronées. De nombreux doctorats en mathématiques au dernier siècle ont consisté à examiner les livres d’Euler, démontrer qu’une preuve était mauvaise, supposer que son intuition était correcte et trouver une preuve plus convaincante. Le débogage existe aussi en mathématiques.

8:50
Le plus important dans le travail orienté objet ou tout type de programmation, c’est un mélange exquis entre beauté et praticité. Il n’y a aucune raison de sacrifier l’un ou l’autre. Ceux qui le font ne comprennent pas vraiment ce qu’est l’informatique. C’est comme dire que j’ai de grandes idées pour des peintures, mais je vais utiliser un pinceau sans peinture. Mes idées seront représentées par les gestes que je fais sur le papier. Ne dites pas ça à un artiste du vingtième siècle, il pourrait en faire une vidéo et l’exposer dans un musée.

9:45
J’avais du mal à décider de quoi parler. Les techniciens semblent toujours en savoir tellement. Mais il est intéressant de regarder ce qui se fait dans le monde sous le nom de programmation orientée objet. On m’a montré des morceaux de code très étranges au fil des années, y compris par des universitaires, qui disaient que c’était du code écrit dans un langage orienté objet.

10:26
J’ai inventé le terme *orienté objet*, et je peux vous dire que je n’avais pas C++ en tête.


10:43
J’ai beaucoup des mêmes sentiments à propos de Smalltalk que je vais essayer d’exprimer ici. Il y a une chose vraiment importante à propos de Smalltalk et de certains langages similaires dont nous devrions prêter une attention particulière. Cela n’a presque rien à voir avec la syntaxe ou la bibliothèque de superclasses accumulée, qui sont souvent considérées comme le langage lui-même, comme s’il avait été décrété par des dieux sur l’Olympe.

11:31
Je veux parler de ma réaction personnelle lorsque j’ai commencé à y réfléchir dans les années 1960. Plutôt que de faire une conférence historique, je vais essayer de voir si ces réactions et intuitions ont encore une place aujourd’hui.

12:08
Dans les années 1960, les choses étaient très mécaniques. Il y avait un sentiment de mécanisme simple, car les ordinateurs étaient aussi grands que cette salle. Celui sur lequel Ivan Sutherland a créé Sketchpad était l’un des derniers aux États-Unis à avoir son propre toit : c’était le bâtiment lui-même.

12:38
Mais les programmes étaient assez petits et avaient beaucoup en commun avec leurs ancêtres mathématiques. Une façon de penser à la sémantique des mathématiques basées sur la logique est comme des engrenages qui s’emboîtent. Tout doit s’adapter, et si tout est compatible à la fin, vous obtenez la rotation finale de l’arbre que vous voulez.

13:14
Une analogie pour ces programmes des années 1960 est une niche pour chien. Prenez des planches au hasard, un marteau, des clous, assemblez-les, et vous avez une structure qui tient debout. Vous n’avez besoin de savoir que planter un clou.

13:46
Quelqu’un pourrait regarder cette niche et dire : si nous pouvions l’agrandir d’un facteur cent, nous pourrions construire une cathédrale. Une niche de un mètre de haut donnerait un bâtiment de trente étages, ce qui serait impressionnant. On pourrait y accueillir beaucoup de monde.

14:05
Les charpentiers se mettraient au travail pour agrandir cette niche d’un facteur cent. Mais, en tant qu’ingénieurs et scientifiques, nous savons que lorsqu’on agrandit quelque chose d’un facteur cent, sa masse augmente d’un facteur un million, et sa résistance, qui dépend principalement des sections transversales, n’augmente que d’un facteur dix mille. En agrandissant d’un facteur cent, la structure devient environ cent fois plus faible. Cette niche s’effondrerait en un tas de débris.

14:48
À ce moment, il y a deux choix. Le plus populaire est de dire que c’était l’objectif depuis le début, d’ajouter plus de débris, de recouvrir de calcaire et de prétendre qu’on voulait faire des pyramides, pas des cathédrales gothiques. Cela explique, je pense, une grande partie de la structure des systèmes d’exploitation modernes.

15:24
Ou vous pouvez proposer un nouveau concept. Les personnes intéressées par les structures complexes il y a de nombreuses années l’ont fait. Elles ont appelé cela l’architecture, littéralement la conception et la construction d’arches réussies, une interaction non linéaire et non évidente entre des matériaux simples pour obtenir des synergies inattendues et une multiplication des matériaux.

16:07
Il est remarquable que la quantité de matériaux dans la cathédrale de Chartres, une structure physique énorme, soit inférieure à celle utilisée pour le Parthénon. La raison est que Chartres est presque entièrement faite d’air et de verre. Tout est organisé avec ingéniosité dans une structure magnifique pour que l’ensemble ait beaucoup plus d’intégrité que chacune de ses parties.

16:37
C’est une autre voie à suivre. Une partie du message de la programmation orientée objet est que, à mesure que la complexité devient plus importante, l’architecture dominera toujours le matériau. Le triste constat est que les gens ne se sont pas intéressés à l’architecture pour sa beauté. Ils commencent à peine à s’y intéresser maintenant, forcés par Internet. C’est assez pathétique.

17:16
Je vais utiliser une métaphore pour cette conférence, tirée d’un merveilleux livre appelé *L’acte de création* d’Arthur Koestler. Koestler était un romancier devenu scientifique cognitif à la fin de sa vie. Il a écrit sur ce que pourrait être la créativité. Il a réalisé que l’apprentissage est un acte de création, car quelque chose de nouveau apparaît en vous.

17:59
Il utilisait la métaphore des pensées comme des fourmis rampant sur un plan, ici un plan rose. Sur un plan rose, vous pouvez avoir des objectifs, choisir des directions, avancer, mais vous êtes toujours dans le contexte rose.

18:22
Cela signifie que le progrès dans un contexte fixe est presque toujours une forme d’optimisation. Si vous trouvez quelque chose de nouveau, cela ne faisait pas partie des règles ou du contexte du plan rose. Les actes créatifs sortent généralement du contexte initial.

19:00
Même si vous avez été soigneusement éduqué par vos parents et l’école pendant des années, parfois, sous la douche, en jogging ou dans un moment d’inattention, une idée bleue surgit. Cette chose qui vous intriguait, que vous observiez, apparaît sous un jour complètement différent, comme si c’était autre chose.

19:33
Koestler disait que la réaction émotionnelle à cela prend trois formes : pour une blague, c’est *haha* ; pour la science, c’est *aha* ; pour l’art, c’est *ah*. Dans chaque cas, quelque chose de similaire se produit. Une blague vous mène sur un chemin, puis révèle qu’il s’agit d’autre chose, provoquant une explosion agressive. La science procure une sensation similaire, souvent accompagnée de rires, car la réponse était juste sous vos yeux, comme une blague. L’art nous rappelle que, quel que soit le contexte dans lequel nous pensons être, il y en a d’autres. L’art nous sort de notre contexte pour nous rendre conscients d’autres contextes.

20:34
C’est une métaphore simple, voire simpliste, mais elle servira pour cette conférence. Koestler a aussi souligné qu’il faut quelque chose de bleu pour avoir des pensées bleues. Cela échappe souvent à ceux qui se spécialisent à outrance. En se spécialisant, on se met dans un état mental où l’optimisation est à peu près tout ce qu’on peut faire. Il faut apprendre beaucoup de choses différentes pour commencer à entrevoir d’autres contextes.

21:17
Voici quelques déclics que j’ai eus au fil des ans. L’un d’eux, je pense, vous intéressera, car c’est la forme la plus ancienne connue de ce qu’on appelle l’abstraction de données. Cela remonte à avant 1961. J’étais dans l’Armée de l’Air en 1961, et je l’ai vu à ce moment-là, probablement un an plus tôt.

21:47
À l’époque, il n’y avait pas vraiment de systèmes d’exploitation. Le Commandement de l’entraînement aérien devait envoyer des bandes magnétiques avec divers types d’enregistrements d’une base aérienne à une autre. La question était de savoir comment gérer tous ces formats, autrefois des images de cartes, qui devenaient plus complexes avec l’arrivée des bandes.

22:19
Quelqu’un, probablement un engagé, car les officiers ne programmaient pas à l’époque, a eu l’idée suivante : sur la troisième partie de l’enregistrement, on mettra tous les enregistrements de ce type particulier ; sur la partie centrale, toutes les procédures qui savent gérer les formats de cette troisième partie ; et sur la première partie, des pointeurs vers ces procédures. Les dix premiers pointeurs seraient standardisés, comme la lecture, l’écriture des champs et l’impression, avec un vocabulaire standard pour les dix premiers, puis des pointeurs plus spécifiques ensuite.

23:14
Pour lire une bande en 1961, il suffisait de charger la partie avant d’un enregistrement dans la mémoire centrale et de sauter directement via les pointeurs vers les procédures. Comparez cela à ce que vous devez faire avec HTML sur Internet.

23:41
HTML sur Internet est un retour à l’âge des ténèbres, car il présuppose qu’un navigateur doit comprendre ses formats. C’est l’une des pires idées depuis MS-DOS. C’est vraiment honteux. Peut-être est-ce ce qui arrive quand des physiciens jouent avec des ordinateurs, je ne suis pas sûr.

24:13
Nous voyons ce qui arrive à Internet maintenant : il y a deux guerres en cours. Les guerres des navigateurs, qui sont totalement inutiles, sont soit une tentative de démontrer une incompréhension de la construction de systèmes complexes, soit une tentative encore plus grossière de s’approprier du territoire, ce que je suspecte de Microsoft.

24:42
Vous n’avez pas besoin d’un navigateur si vous suivez ce qu’un sergent d’état-major de l’Armée de l’Air savait faire en 1961. Il suffit de lire, tout devrait voyager avec ce dont il a besoin. Vous n’avez besoin de rien de plus complexe que quelque chose comme X Windows, en mieux, mais vous voulez distribuer toute la connaissance de ces choses.

25:15
Internet commence à aller dans cette direction, car les gens découvrent des formats HTML de plus en plus complexes et intraitables. C’est une erreur qui se répète à chaque génération, et ce n’est tout simplement pas la bonne façon de faire.

25:39
Cette programmation était faite avant l’existence des langages de haut niveau dans l’Armée de l’Air. Mais cette approche a été éliminée par COBOL quand ils ont standardisé sur COBOL.

26:01
Le Sketchpad d’Ivan Sutherland était immensément sophistiqué, presque stupéfiant dans sa conception. C’était un système orienté objet avec une notion réelle de classes et de sous-classes, et un polymorphisme encore plus fort que celui du Commandement de l’entraînement aérien.

26:43
J’avais vu cette idée trois ou quatre fois, mais ce n’est qu’en essayant de comprendre Simula que j’ai enfin saisi. Nous pensions que c’était censé être un Algol, mais c’était un amas de bandes, le premier Simula, modifié par Case Western Reserve et les inventeurs de Simula, Nygaard et Dahl, en Norvège, distribué avec une documentation incompréhensible en 1966.

27:19
En essayant de comprendre Simula, peut-être parce qu’une bonne idée étrange vue quatre fois sous différents costumes finit par faire impression, j’ai réalisé quelque chose.

27:41
Quand vous êtes confronté à quelque chose de nouveau, vous pouvez considérer cet avancement technologique comme une meilleure façon de faire ce que vous faites déjà, et l’utiliser pour continuer sur votre chemin, restant dans le plan rose. Ou vous pouvez dire que ce n’est pas une meilleure version de l’ancien, mais presque une nouvelle chose, et vous demander ce que cette nouvelle chose essaie d’être.

28:15
Si vous faites cela, il y a une chance d’obtenir un levier incroyable, plutôt que d’optimiser quelque chose qui ne peut pas l’être beaucoup. Simula venait du monde des structures de données et des procédures, avec cette saveur, si vous vouliez le voir ainsi. Mais il avait une manière de lier les états de votre calcul avec des procédures, ce qui était extrêmement utile et bien meilleur que ce qu’on appelait les variables propres dans Algol 60.

29:02
C’était une façon de le voir. Puis il y avait cette autre question : si c’était presque une nouvelle chose, de quel type de nouvelle chose s’agissait-il ? L’une de mes spécialités universitaires était la biologie moléculaire, avec un intérêt particulier pour la physiologie cellulaire et l’embryologie, aujourd’hui appelée morphogenèse.

29:27
Le livre *Molecular Biology of the Gene* venait de sortir en 1965, un ouvrage merveilleux, toujours en impression, bien que les seules mots communs entre cette édition et celle d’aujourd’hui soient probablement les articles comme *le* ou *et*. Même le mot *gène* y est encore, mais il signifie quelque chose de complètement différent maintenant.

29:58
Dans ce livre, Watson a réalisé le premier essai d’une créature vivante entière, la bactérie E. coli.

30:20
Si vous regardez à l’intérieur, la complexité est stupéfiante. Ces choses en forme de popcorn sont des molécules de protéines avec environ 5000 atomes. En éliminant les petites molécules comme l’eau, les ions calcium et potassium, qui constituent environ 70 % de la masse, il reste 30 % avec environ 120 millions de composants qui interagissent de manière informationnelle.

31:06
Chaque composant porte beaucoup d’informations. Une façon simple de voir cela est que ça fonctionne un peu comme Ops5 : il y a une correspondance de motifs, et des choses se produisent si les motifs sont appariés avec succès.

31:29
L’état impliqué représente environ cent giga-octets. Aujourd’hui, cela équivaut à une centaine d’ordinateurs de bureau, mais c’est toujours impressionnant comme quantité de calcul. Ce qui est peut-être le plus intéressant, c’est que la rapidité de ce calcul rivalise sérieusement avec celle des ordinateurs actuels.

32:04
Particulièrement en considérant que c’est fait en parallèle. Par exemple, l’une de ces choses de la taille d’un popcorn se déplace de sa propre longueur en deux nanosecondes. Si un atome était de la taille d’une balle de tennis, une de ces molécules de protéines serait de la taille d’une Volkswagen, se déplaçant de sa propre longueur en deux nanosecondes, soit environ 2,4 mètres à notre échelle.

32:37
Quelqu’un peut-il calculer quelle fraction de la vitesse de la lumière représente un déplacement de 2,4 mètres en deux nanosecondes ? Oui, quatre fois la vitesse de la lumière à cette échelle.

32:50
Si vous vous demandez pourquoi la chimie fonctionne, c’est à cause de l’agitation thermique incroyablement violente à cette échelle, qu’on ne peut même pas imaginer avec l’aide des ordinateurs. On ne voit rien à l’intérieur de ces choses tant qu’on ne les tue pas, car c’est un flou total d’activité.

33:16
Dans de bonnes conditions, il ne faut qu’environ 15 à 18 minutes pour qu’une de ces bactéries se duplique complètement. Bien plus est connu aujourd’hui. Ces bactéries, un cinq-centième de la taille des cellules de notre corps, qui ont environ 60 milliards de composants informationnels au lieu de 120 millions, montrent l’ampleur.

34:05
Nous avons entre 10^12 et 10^13 cellules dans notre corps, peut-être plus. Pourtant, il ne faut que cinquante divisions cellulaires pendant une grossesse de neuf mois pour faire un bébé.

34:20
En calculant, vous réalisez qu’il n’en faut qu’environ quarante. Les dix puissances supplémentaires sont là car, pendant le processus embryologique, de nombreuses cellules inadaptées à l’organisme sont éliminées. Les choses sont faites par surprolifération, test et élagage selon un plan beaucoup plus vaste.

34:53
Chacun de nous est intégré dans une biomasse énorme. Pour quelqu’un dont le contexte bleu pourrait être la biologie, un ordinateur ne pourrait pas être considéré comme particulièrement complexe, grand ou rapide.

35:17
Lent, petit, stupide : voilà ce que sont les ordinateurs. La question est : comment pouvons-nous les amener à réaliser leur destin ?

35:41
Nous utilisons une forme de technologie que Napoléon utilisait, rappelez-vous les sémaphores à travers la France. Le changement de perspective ici passe de la mécanique à autre chose.

36:01
Si vous prenez des niches pour chiens, elles ne s’agrandissent pas bien d’un facteur cent. Les horloges non plus. Mais les cellules s’agrandissent non pas d’un facteur cent, mais d’un facteur mille milliards. La question est : comment font-elles, et comment pourrions-nous adapter cette idée pour construire des systèmes complexes ?

36:34
C’est simple, mais même C++ n’a pas encore compris. Aucune idée n’est si simple et puissante qu’on ne puisse pas la faire mal comprendre par des millions de personnes.

36:56
Il ne faut absolument pas permettre que l’intérieur de l’un de ces éléments soit un facteur dans le calcul de l’ensemble. Ce n’est qu’une partie de l’histoire. La membrane cellulaire est là autant pour empêcher certaines choses d’entrer que pour retenir certaines choses à l’intérieur.

37:20
Une grande partie de notre confusion avec les objets vient du problème que, dans notre culture occidentale, nous avons un langage avec des noms et des verbes très durs. Nos mots de processus sont médiocres. Il nous est plus facile de penser à un objet.

37:42
Je m’excuse profondément depuis vingt ans d’avoir inventé le terme *orienté objet*, car dès qu’il a été mal appliqué, j’ai réalisé que j’aurais dû utiliser un terme beaucoup plus orienté vers les processus.

38:05
Les Japonais ont un mot intéressant, *ma*, qui désigne l’espace entre ce que nous appelons des objets, ce que nous ne voyons pas parce que nous sommes focalisés sur la *chose* plutôt que sur le processus. En japonais, il y a une manière plus orientée vers les processus de voir comment les choses se relient.

38:40
On peut le voir à la taille des mots utilisés pour exprimer quelque chose d’important. *Ma* est très court. Nous devons utiliser des mots comme *interstitiel* ou pire pour approcher ce dont parlent les Japonais.

39:00
Cette réalisation ne peut être attribuée à une personne en particulier. Elle est dans les germes de Sketchpad, dans le système de fichiers du Commandement de l’entraînement aérien, et dans Simula.

39:18
Une fois que vous avez encapsulé de manière à avoir une interface entre l’intérieur et l’extérieur, il est possible de faire en sorte qu’un objet agisse comme n’importe quoi. La raison est simple : ce que vous avez encapsulé est un ordinateur.

39:40
Vous avez fait quelque chose de puissant en informatique : prendre la chose puissante sur laquelle vous travaillez et ne pas la perdre en partitionnant votre espace de conception. C’est le défaut des langages de données et de procédures.

39:58
Je pense que la chose la plus pernicieuse à propos de langages comme C++ et Java est qu’ils croient aider le programmeur en ressemblant autant que possible à l’ancien paradigme. En réalité, ils nuisent terriblement au programmeur en rendant difficile la compréhension de ce qui est vraiment puissant dans cette nouvelle métaphore.

40:21
Les personnes travaillant sur des systèmes de partage de temps l’avaient déjà compris. La thèse de Butler Lampson en 1965 parlait de donner à chaque personne sur un système de partage de temps ce qu’on appelle maintenant une machine virtuelle, quelque chose d’aussi proche que possible de l’ordinateur physique, mais séparé pour chaque utilisateur.

40:56
UNIX avait cette idée, mais le plus gros problème était qu’un processus UNIX avait une surcharge d’environ deux mille octets juste pour exister. Il était très difficile dans UNIX de laisser un processus UNIX représenter simplement le nombre trois. Vous passiez de trois bits à quelques milliers d’octets, ce qui posait un problème d’échelle.

41:22
Une grande partie du problème est de décider que la métaphore biologique est celle qui prédominera au cours des vingt-cinq prochaines années, puis de s’y engager suffisamment pour qu’elle soit pratique à tous les niveaux d’échelle dont nous avons besoin.

41:48
Nous avons un tour que la biologie ne sait pas faire : nous pouvons extraire l’ADN des cellules. Cela permet de traiter la fibrose kystique beaucoup plus facilement qu’aujourd’hui. Les systèmes ont aussi une sorte de fibrose kystique.

42:07
Pour certains, la fibrose kystique est traitée aujourd’hui en les infectant avec un virus du rhume modifié, provoquant une infection pulmonaire. Le gène défectueux pour la fibrose kystique est dans ce virus, trop faible pour détruire les poumons comme une pneumonie, mais assez fort pour insérer une copie de ce gène dans chaque cellule des poumons.

42:34
C’est une manière très compliquée de reprogrammer l’ADN d’un organisme une fois qu’il est en marche.

42:51
Ce qui m’étonne, c’est que nous n’ayons pas vu plus de progrès. Par exemple, une des choses les plus surprenantes pour moi chez ceux qui travaillent sur Internet est que je ne connais personne – et j’espère que quelqu’un viendra me contredire après – qui ait réalisé qu’au minimum, chaque objet devrait avoir une URL.

43:19
Je crois que chaque objet sur Internet devrait avoir une adresse IP, car cela représente beaucoup mieux les abstractions réelles du matériel physique aux bits.

43:39
C’est une intuition précoce que les objets sont fondamentalement comme des serveurs. La notion de polymorphisme, autrefois appelée procédures génériques, est une façon de penser aux classes de ces serveurs.

44:00
Nous n’y avons pas encore vraiment fait face, mais nous devons construire ces choses, et bientôt il faudra les faire croître. Il est facile de faire grandir un bébé de quinze centimètres, il le fait environ dix fois dans sa vie sans jamais s’arrêter pour maintenance. Mais essayez de faire grandir un Boeing 747, et vous faites face à un problème incroyable, car il est dans un monde mécanique simpliste où le seul objectif était de fabriquer l’artefact, pas de le réparer, de le modifier ou de le faire vivre cent ans.

44:46
Combien de personnes ici utilisent encore un langage qui, dans le système de développement, vous force à développer en dehors du langage, à compiler, recharger et exécuter, même si c’est rapide comme Java Virtual Cafe ? Allez, avouez-le, nous pouvons organiser une réunion sous une tente texane plus tard.

45:23
Si vous y pensez, cela ne peut être qu’une impasse pour construire des systèmes complexes, où une grande partie de la construction consistera à essayer de comprendre les possibilités d’interopérabilité avec ce qui existe déjà.

45:45
J’ai joué un rôle mineur dans la conception de l’ARPANET. J’étais l’un des trente étudiants diplômés qui ont participé à des réunions de conception de systèmes pour formuler des principes de conception pour l’ARPANET il y a environ trente ans.

46:02
L’ARPANET est devenu Internet. Depuis qu’il a commencé à fonctionner autour de 1969 jusqu’à aujourd’hui, il s’est agrandi d’un facteur d’environ cent millions. C’est assez impressionnant, huit ordres de grandeur.

46:31
D’après ce que je sais, après avoir parlé à Larry Roberts récemment, il n’y a pas un seul atome physique dans l’Internet d’aujourd’hui qui était dans l’ARPANET original, ni une seule ligne de code.

46:53
Si nous avions eu des mainframes IBM dans l’ARPANET original, cela n’aurait pas été vrai. C’est un système qui s’est agrandi de cent millions, a changé chaque atome et chaque bit, et n’a jamais eu à s’arrêter.

47:11
C’est la métaphore que nous devons absolument appliquer à ce que nous considérons comme des choses plus petites. C’est pourquoi vos programmes sont si grands, pourquoi ils deviennent des pyramides au lieu de cathédrales gothiques.

47:40
Voici une autre grande source. Avec Simula, Lisp est certainement le plus grand langage des années 1960, avec autant, sinon plus, d’intuitions profondes.

48:05
Sur la page 13 de ce livre publié en 1962, il y a une demi-page de code qui est le modèle réflexif de Lisp écrit en lui-même. Tous les détails importants de la sémantique de Lisp et les directives pour créer un interpréteur Lisp sont dans cette demi-page.

48:29
C’est cet aspect méta-réflexif qui, pour moi, est la chose la plus triste à propos de ce qui arrive à Java. Quand Java est apparu, j’ai pensé qu’il légitimait quelque chose que beaucoup ne croyaient plus depuis longtemps : l’approche des codes intermédiaires multiplateformes, comme nous avions chez Xerox PARC. Ce n’est pas une nouvelle idée, elle remonte aux années 1960.

49:02
Mais en regardant Java, je me suis dit : comment peuvent-ils espérer survivre à tous les changements, modifications, adaptations et exigences d’interopérabilité sans un système méta, sans même pouvoir charger de nouvelles choses pendant l’exécution ?

49:37
Le fait que les gens aient adopté cela comme un grand espoir est probablement la chose la plus désolante pour moi, personnellement, depuis MS-DOS. Cela représente un véritable échec de la compréhension de la vue d’ensemble.

50:00
Cette notion de métaprogrammation peut être vue de différentes manières. Une implémentation particulière fait des choix pragmatiques, qui ne couvriront probablement pas tous les cas avec l’efficacité ou la richesse requise.

50:32
C’est une connaissance standard en programmation orientée objet : nous encapsulons pour cacher nos désordres, pour avoir différentes manières de traiter les mêmes concepts sans distraire le programmeur. Mais, comme les gens de Lisp et nous chez Xerox PARC l’avons découvert, cela s’applique aussi à la construction du langage lui-même.

51:03
Plus le langage peut voir ses propres structures, plus vous êtes libéré de la tyrannie d’une seule implémentation. C’est l’une des choses les plus critiques dont très peu de gens se préoccupent de manière pratique.

51:22
Une des raisons pour lesquelles ces questions méta seront importantes, au point que personne ne pourra les ignorer, est la question de l’interopérabilité sur Internet dans cinq ou dix ans.

51:40
Je ne crois pas que Microsoft pourra capturer Internet. Il est trop grand, trop de gens y apportent des idées, et les gens seront assez sophistiqués pour réaliser qu’une solution de type IBM ou Microsoft n’est ni nécessaire ni possible.

52:08
Cela signifie qu’il y aura des dizaines et des dizaines de systèmes d’objets différents, tous avec des sémantiques très similaires mais des détails pragmatiques très différents.

52:27
Si vous pensez à ce qu’est une URL, un message HTTP, un objet, ou un pointeur orienté objet, il devrait être clair que n’importe quel langage orienté objet peut internaliser ses propres pointeurs locaux vers n’importe quel objet dans le monde, peu importe où il a été créé. C’est tout l’intérêt de ne pas pouvoir voir à l’intérieur.

53:00
Une interopérabilité sémantique est possible presque immédiatement en adoptant simplement cette position. Cela va tout changer. Des choses comme Java Beans et CORBA ne suffiront pas, car à un moment donné, il faudra commencer à découvrir ce que les objets pensent pouvoir faire.

53:20
Cela mènera à un langage d’interface universel, qui n’est pas un langage de programmation en soi, mais plutôt un langage de prototypage permettant un échange profond d’informations sur ce que les objets pensent pouvoir faire, et permettant aux objets de faire des expériences avec d’autres objets de manière sûre pour voir comment ils répondent à divers messages. Ce sera crucial à automatiser dans les dix prochaines années.

53:57
Voici un excellent livre. Combien de personnes l’ont lu ? Quand ils l’ont écrit, je les ai appelés et j’ai dit : c’est le meilleur livre écrit depuis dix ans, mais pourquoi diable l’avoir écrit d’une manière si centrée sur Lisp, si fermée à un club ?

54:20
Ce livre est très difficile à lire si vous ne connaissez pas la culture Lisp ou la manière dont Scilos est fait. Il contient certaines des intuitions les plus profondes et pratiques sur la programmation orientée objet depuis de nombreuses années. Je vous le recommande vivement.

54:49
S’il y a des professeurs d’université ici qui veulent remporter le prochain prix Limoge, je le donnerai à quiconque réécrira ce livre pour que la communauté orientée objet générale puisse le comprendre. Ce serait un grand service à l’humanité.

55:08
Ce qui s’est passé dans la plupart du monde à partir des années 1970, c’est les types de données abstraits, une manière de penser centrée sur l’affectation. Quand j’ai fait cette diapositive, C++ n’était qu’un point à l’horizon. C’était comme MS-DOS : personne ne le prenait au sérieux, car qui tomberait pour une blague pareille ?

55:55
Mon histoire préférée sur C++ est chez Apple. Il y avait cet système d’exploitation, nommé par une coïncidence remarquable *Pink*.

56:06
Ce système avait deux caractéristiques intéressantes. La première, c’est qu’il devait toujours être terminé dans deux ans. Nous connaissons de grands concepteurs de systèmes d’exploitation, et je ne connais aucun bon système d’exploitation réalisé en deux ans, même par des gens dix fois plus intelligents que l’équipe de Pink.

56:35
L’autre chose, c’est qu’il devait être fait en C++ pour l’efficacité. Ne le faisons pas en Smalltalk, c’est trop lent. Eh bien, permettez-moi de vous dire qu’il n’y a rien de plus inefficace que de passer dix ans sur un système d’exploitation qui ne fonctionne jamais.

57:01
[Applaudissements]

57:08
Les pires sont ceux qui semblent fonctionner.

57:21
Prenons notre plan rose. Voici ma citation préférée de McLuhan : je ne sais pas qui a découvert l’eau, mais ce n’était pas un poisson. Il nous considérait comme les poissons, et l’eau comme nos structures de croyance, notre contexte.

57:39
Je crois que c’est la cause principale des difficultés dans notre domaine et dans l’humanité en général : adopter un seul point de vue et s’y engager comme à une religion. Cela s’est produit avec Smalltalk.

58:05
Schopenhauer, philosophe allemand du XIXe siècle, a dit que chaque idée passe par trois étapes. D’abord, elle est dénoncée comme l’œuvre de fous, ce que Swift appelait une confédération d’imbéciles. Ensuite, on remarque qu’elle était totalement évidente depuis le début. Enfin, le dénonciateur initial prétend l’avoir inventée. C’est là qu’elle entre dans sa phase religieuse.

58:47
Ce qui m’a le plus attristé avec Smalltalk, lorsqu’il est sorti de Xerox PARC, c’est qu’il a cessé de changer à bien des égards. À Xerox PARC, il y a eu quatre versions majeures, complètement différentes, sur environ dix ans, et des dizaines de versions significatives au sein de ces versions.

59:11
Ce que nous aimions le plus dans Smalltalk, ce n’était pas ce qu’il pouvait faire, mais le fait qu’il était un si bon véhicule pour amorcer la prochaine série d’idées sur la construction de systèmes. Quand Smalltalk est devenu commercial, ce processus s’est pratiquement arrêté.

59:31
Il y avait un livre, le célèbre *Blue Book* d’Adèle et Dave, qui contenait le code pour créer des interpréteurs Smalltalk et démarrer ce processus soi-même. Presque personne n’en a profité. Presque aucune université, presque aucune entreprise commerciale.

59:58
Ce qu’ils ont manqué, c’est, pour moi, la chose la plus profonde que je voudrais vous transmettre aujourd’hui : nous ne savons pas encore concevoir des systèmes. Ne transformons pas ce que nous ne savons pas en religion, pour l’amour de Dieu.

1:00:05
Ce que nous devons faire, c’est penser, penser et repenser à ce qui est important. Nos systèmes doivent nous permettre d’atteindre les prochains niveaux d’abstraction à mesure que nous les découvrons.

1:00:24
Ce dont je suis le plus fier à propos de Smalltalk, presque la seule chose dont je suis fier de mon point de vue, c’est qu’il a été si efficace pour se débarrasser de ses versions précédentes, jusqu’à ce qu’il sorte dans ce monde.

1:00:38
Une des raisons pour lesquelles nous nous sommes à nouveau impliqués dans Smalltalk, après seize ans sans travailler sur les langages de programmation, est que nous avons lancé il y a quelques années un projet appelé Squeak.

1:00:56
Ce n’est pas une tentative de donner au monde un Smalltalk gratuit, mais un mécanisme d’amorçage pour quelque chose de bien meilleur que Smalltalk. Quand vous jouerez avec Squeak, pensez-y de ce point de vue : détruisez-le en utilisant ses propres mécanismes pour obtenir une version suivante.

1:01:21
Cherchez les pensées bleues. Je cherchais une façon de conclure cette conférence, car je pourrais continuer indéfiniment. Je me suis souvenu d’une histoire. Je suis organiste, et la plupart des organistes ont un héros nommé E. Power Biggs.

1:01:49
Il a ravivé l’intérêt pour l’orgue, surtout tel qu’il était joué aux XVIIe et XVIIIe siècles, et a eu une énorme influence sur nous tous, organistes. Un bon ami à moi était son assistant pendant de nombreuses années dans les années 1940 et 1950. Il a maintenant plus de quatre-vingts ans.

1:02:07
Quand nous l’invitons à dîner, nous le faisons toujours raconter des histoires sur E. Power Biggs. L’orgue que Biggs avait à l’époque pour ses émissions était un petit orgue médiocre, ni poisson ni oiseau, dans un petit musée à Harvard appelé Bush-Reisinger.

1:02:30
Mais toutes sortes de musiques y étaient jouées. Un jour, cet assistant a dû remplacer Biggs. Il lui a demandé quelle pièce devait être jouée. Biggs a répondu qu’il avait programmé la *Pièce héroïque* de César Franck.

1:02:50
Si vous connaissez cette pièce, elle est faite pour les plus grands orgues jamais construits, les plus puissants, dans les plus grandes cathédrales, car c’est une œuvre symphonique pour orgue du XIXe siècle.

1:03:04
Biggs demandait à mon ami de jouer cela sur ce petit orgue minable. Il a dit : mais comment puis-je jouer ça là-dessus ? Biggs a répondu : joue-le simplement avec grandeur, joue-le avec grandeur.

1:03:26
La façon de rester avec l’avenir à mesure qu’il avance est de toujours jouer vos systèmes avec plus de grandeur qu’ils ne semblent en avoir maintenant. Merci.

</details>

Après avoir regardée la vidéo, vous je vous invite à réfléchir aux questions suivantes.

1. Comment l’analogie  entre la programmation orientée objet et l’architecture illustre-t-elle l’importance de concevoir des systèmes logiciels capables de gérer une complexité croissante ?
2. En quoi la métaphore des « pensées bleues » peut-elle vous inspirer à sortir des paradigmes établis pour innover ?

La programmation orientée objet se diffuse ensuite dans de nombreux langages : C++ (1983) ajoute l’orienté objet au C, Java (1995) en fait un pilier de sa conception, Python, Ruby, C#, et bien d’autres adoptent ou s’inspirent de ces principes. La programmation orientée objet devient le paradigme dominant dans l’industrie logicielle, car on croit qu'elle facilite la modularité, la réutilisation et la maintenance du code.

Aujourd’hui, la programmation orientée objet est enseignée dans la plupart des cursus en informatique et reste au cœur du développement de logiciels complexes, bien qu’elle coexiste avec d’autres paradigmes (fonctionnel, procédural, etc.) dans les langages modernes.

Notre façon de programmer continuer d'évoluer. Aujourd'hui, plusieurs des idées fortes de la méthode orientée objet (comme l'héritage) sont vues comme parfois trop contraignantes. Néanmoins, les langages populaires comme Python, C#, Java, etc. relèvent de l'orienté objet.


*Définition.* La programmation orientée objet est un paradigme de programmation qui organise le code autour d’«&nbsp;objets&nbsp;» représentant des entités du monde réel ou conceptuel. Chaque objet regroupe des données (attributs) et des comportements (méthodes) et interagit avec d’autres objets via des messages ou des appels de méthodes.


## Java

Java a été créé au début des années 1990 par James Gosling et son équipe chez Sun Microsystems. Le projet, initialement nommé «&nbsp;Oak&nbsp;», visait à développer un langage portable pour les appareils électroniques embarqués. En 1995, le langage est officiellement lancé sous le nom de Java, avec la promesse «&nbsp;écrire une fois, exécuter partout&nbsp;» (Write Once, Run Anywhere), grâce à la machine virtuelle Java (JVM) qui permet d’exécuter le même code sur différentes plateformes.

La JVM est un environnement d’exécution logiciel qui agit comme une couche d’abstraction entre le code Java compilé et le matériel ou le système d’exploitation de l’appareil sur lequel il s’exécute. Elle permet au même programme Java de fonctionner sur différentes plateformes (Windows, Linux, macOS, etc.) sans modification, à condition qu’une JVM spécifique à cette plateforme soit installée. Lorsque vous écrivez un programme en Java, il est d’abord compilé par le compilateur Java (javac) en un code intermédiaire appelé bytecode. Ce bytecode n’est pas du code machine directement exécutable par un processeur, mais un format standardisé compris par la JVM. La JVM lit le bytecode et le traduit en instructions spécifiques à la plateforme sur laquelle elle est installée.

Java connaît un succès rapide, d’abord dans le développement d’applets pour le web, puis dans les applications d’entreprise avec la plateforme Java EE. Au fil des années, Java s’impose comme un standard pour le développement de logiciels robustes, portables et sécurisés, aussi bien côté serveur (applications web, systèmes bancaires, etc.) que côté client (applications de bureau, Android).

Le langage évolue régulièrement : Java 5 introduit les génériques et les annotations, Java 8 apporte les expressions lambda et l’API Stream, Java 9 les modules, et les versions récentes (Java 17, 21…) continuent d’ajouter des fonctionnalités modernes (pattern matching, records, virtual threads…).

En 2010, Oracle rachète Sun Microsystems et devient le principal responsable du développement de Java. Aujourd’hui, Java reste l’un des langages les plus utilisés au monde, soutenu par une vaste communauté et de nombreux outils open source. Il est omniprésent dans l’industrie, l’enseignement, le développement mobile (Android), le cloud et l’Internet des objets.

Le langage Java est en pleine évolution. Certaines des techniques enseignées dans notre cours
ne fonctionnent pas avec des versions précédentes du Java.



| Version | Changement principal        | Année de sortie |
|---------|----------------------------|------------------|
| JDK 1.0 | Lancement initial          | 1996             |
| JDK 1.1 | Classes internes            | 1997             |
| J2SE 1.2 | API Swing                  | 1998             |
| J2SE 1.3 | Améliorations HotSpot      | 2000             |
| J2SE 1.4 | Assertions                 | 2002             |
| J2SE 5.0 | Génériques                 | 2004             |
| Java SE 6 | Performance JVM            | 2006             |
| Java SE 7 | Syntaxe try-with-resources | 2011             |
| Java SE 8 | Expressions lambda         | 2014             |
| Java SE 9 | Système de modules         | 2017             |
| Java SE 10 | Inférence de types         | 2018             |
| Java SE 11 | Client HTTP standard       | 2018             |
| Java SE 12 | Switch expressions         | 2019             |
| Java SE 13 | Blocs de texte             | 2019             |
| Java SE 14 | Records (aperçu)           | 2020             |
| Java SE 15 | Classes scellées           | 2020             |
| Java SE 16 | Records finalisés          | 2021             |
| Java SE 17 | Pattern matching           | 2021             |
| Java SE 18 | API vectorielle (aperçu)   | 2022             |
| Java SE 19 | Threads virtuels           | 2022             |
| Java SE 20 | Structured Concurrency     | 2023             |
| Java SE 21 | Sequenced Collections      | 2023             |
| Java SE 22 | Foreign Function API       | 2024             |
| Java SE 23 | Module import simplifié    | 2024             |
| Java SE 24 | Améliorations Loom         | 2025             |
| Java SE 25 | Finalisation Valhalla      | 2025             |
| Java SE 26 | Optimisations Leyden       | 2026             |


Je vous invite à regarder cette vidéo par l'inventeur du Java (activité optionnelle). J'inclus une transcription en français.

{{< youtube id="IT__Nrr3PNI" >}}


<details>
<summary>Transcription traduite en français
</summary>
Voici une conversation avec James Gosling, le fondateur et principal concepteur du langage de programmation Java, qui, selon de nombreux indices, est le langage de programmation le plus populaire au monde, ou du moins toujours parmi les deux ou trois premiers. Nous n’avions qu’un temps limité pour cette conversation, mais je suis sûr que nous discuterons à nouveau à plusieurs reprises dans ce podcast. Résumé rapide des sponsors : Public Goods, BetterHelp et ExpressVPN. Veuillez consulter ces sponsors dans la description pour obtenir une réduction et soutenir ce podcast. En aparté, permettez-moi de dire que Java est le langage avec lequel j’ai appris pour la première fois la programmation orientée objet et, avec elle, l’art et la science de l’ingénierie logicielle. Également, au début de mes études universitaires, j’ai suivi un cours sur la programmation concurrente avec Java. En repensant à cette époque, avant que je ne tombe amoureux des réseaux neuronaux, l’art du calcul parallèle était à la fois algorithmiquement et philosophiquement fascinant pour moi. Avant cela, le concept d’un ordinateur dans mon esprit était quelque chose qui fait une chose à la fois. L’idée que nous puissions créer une abstraction de parallélisme, où l’on pourrait faire plusieurs choses en même temps tout en garantissant stabilité et exactitude, était magnifique. Alors que certains à l’université prenaient des drogues pour élargir leur esprit, moi, je prenais des cours de programmation concurrente. Si vous appréciez ce contenu, abonnez-vous sur YouTube, donnez-lui cinq étoiles sur Apple Podcast, suivez sur Spotify, soutenez sur Patreon ou connectez-vous avec moi sur Twitter à @lexfridman. Comme d’habitude, je vais faire quelques minutes de publicités maintenant, sans publicités au milieu. J’essaie de rendre cela intéressant, mais je vous donne des horodatages, alors n’hésitez pas à passer, mais veuillez consulter les sponsors en cliquant sur les liens dans la description. C’est la meilleure façon de soutenir ce podcast.

Ce programme est sponsorisé par Public Goods, le guichet unique pour des produits ménagers abordables, durables et sains. Je prends leur huile de poisson et utilise leur brosse à dents, par exemple. Leurs produits ont souvent un design minimaliste noir et blanc que je trouve tout simplement magnifique. Certaines personnes demandent pourquoi je porte ce costume noir et cette cravate ; il y a une simplicité qui, pour moi, concentre mon esprit sur les éléments les plus importants de chaque instant de chaque jour, tirant uniquement sur le fil de l’essentiel dans tout ce que la vie a à m’offrir. Ce n’est pas une question de comment je parais, mais de comment je me sens. C’est ce que le design représente pour moi : créer une expérience consciente intérieure, pas un look extérieur. Quoi qu’il en soit, Public Goods plante un arbre pour chaque commande passée, ce qui est plutôt cool. Visitez publicgoods.com/lex ou utilisez le code LEX à la caisse pour obtenir 15 dollars de réduction sur votre première commande.

Ce programme est également sponsorisé par BetterHelp, écrit H-E-L-P. Consultez-le sur betterhelp.com/lex. Ils déterminent ce dont vous avez besoin et vous mettent en relation avec un thérapeute professionnel agréé en moins de 48 heures. J’ai discuté avec une personne là-bas et j’ai apprécié. Bien sûr, je parle aussi régulièrement à David Goggins ces jours-ci, qui n’est définitivement pas un thérapeute professionnel agréé, mais il m’aide à rencontrer ses démons et les miens, et à devenir à l’aise en leur présence. Chacun est différent, mais pour moi, je pense que la souffrance est essentielle à la création, mais on peut souffrir magnifiquement, d’une manière qui ne vous détruit pas. Je pense que la thérapie peut aider, quelle que soit la forme que prend cette thérapie, et je pense que BetterHelp est une option qui vaut la peine d’être essayée. Ils sont faciles, privés, abordables et disponibles dans le monde entier. Vous pouvez communiquer par texte à tout moment et programmer des sessions audio et vidéo hebdomadaires. Consultez-le sur betterhelp.com/lex.

Ce programme est également sponsorisé par ExpressVPN. Vous pouvez l’utiliser pour débloquer des films et des émissions uniquement disponibles dans d’autres pays. Je l’ai fait récemment avec Star Trek Discovery sur Netflix UK, principalement parce que je me demande ce que ça fait de vivre à Londres. Je pense à déménager de Boston vers un endroit où je pourrais construire l’entreprise dont j’ai toujours rêvé. Londres n’est probablement pas dans le top trois, mais dans le top dix, c’est sûr. Le choix numéro un actuellement est Austin, pour de nombreuses raisons dont je parlerai peut-être une autre fois. San Francisco, malheureusement, a chuté de la première place, mais reste dans la course. Si vous avez des conseils, faites-le-moi savoir. Quoi qu’il en soit, consultez ExpressVPN. Il vous permet de changer votre localisation dans près de 100 pays et il est super rapide. Allez sur expressvpn.com/lexpod pour obtenir trois mois supplémentaires d’ExpressVPN gratuitement.

Et maintenant, voici ma conversation avec James Gosling.

### Nombres irrationnels

J’ai lu quelque part que la racine carrée de deux est votre nombre irrationnel préféré. Je n’ai aucune idée d’où cela vient. Y a-t-il une part de vérité là-dedans ? Y a-t-il quelque chose en mathématiques ou dans les nombres que vous trouvez beau ?

Oh, eh bien, il y a beaucoup de choses en mathématiques qui sont vraiment belles. Vous savez, je me considérais comme vraiment bon en mathématiques, et ces jours-ci, je me considère comme vraiment mauvais en mathématiques. Je n’ai jamais vraiment eu un faible pour la racine carrée de deux, mais quand j’étais adolescent, il y avait ce livre intitulé *Le dictionnaire des nombres curieux et intéressants*, que pour une raison quelconque, j’ai lu en entier et presque mémorisé. Et j’ai commencé cette étrange habitude, quand je remplissais des chèques ou payais avec des cartes de crédit, de vouloir que le reçu totalise un nombre intéressant. Y a-t-il des nombres qui vous ont marqué, qui vous font vous sentir bien ?

Ils ont tous une histoire, et heureusement, je les ai pour la plupart oubliés. Comme 42 ? Eh bien, oui, celui-là, 42, est assez magique. Et les irrationnels ? Y a-t-il une histoire avec la racine carrée de deux quelque part ? Eh bien, c’est comme le seul nombre qui a détruit une religion. De quelle manière ? Eh bien, les pythagoriciens croyaient que tous les nombres étaient parfaits et que tout pouvait être représenté comme un nombre rationnel. À cette époque, une preuve est apparue montrant qu’il n’existait aucune fraction rationnelle dont la valeur était égale à la racine carrée de deux, et cela signifiait que rien dans ce monde n’est parfait, pas même les mathématiques. Eh bien, cela signifie que votre définition de parfait était imparfaite. Ensuite, il y a les théorèmes d’incomplétude de Gödel au 20e siècle qui ont encore tout ruiné pour tout le monde. Bien que le théorème de Gödel, la leçon que j’en tire, ce n’est pas qu’il y a des choses qu’on ne peut pas savoir, ce qu’il dit fondamentalement, mais que les gens veulent des réponses en noir et blanc, vrai ou faux. Mais si vous autorisez une logique à trois états, vrai, faux ou peut-être, alors la vie est belle. J’ai l’impression qu’il y a un parallèle avec le discours politique moderne quelque part là-dedans.

### Mathématiques et programmation

Avec votre amour précoce ou votre appréciation de la beauté des mathématiques, voyez-vous un parallèle entre ce monde et celui de la programmation ?

La programmation, c’est tout au sujet de la structure logique, de la compréhension des motifs qui émergent du calcul, de la compréhension, je veux dire, c’est souvent comme tracer un chemin à travers le graphe des possibilités pour trouver une route courte, c’est-à-dire trouver un programme court qui fait le travail. Mais sur le sujet des nombres irrationnels, voyez-vous la programmation comme fondamentalement désordonnée, peut-être contrairement aux mathématiques ? Je ne la considère pas comme désordonnée. Vous savez, vous regardez quelqu’un qui est bon en mathématiques faire des mathématiques, et souvent, c'est assez désordonné. Parfois, c'est un peu magique. Quand j’étais étudiant diplômé, l’un des étudiants, Jim Sax, avait cette réputation d’être une sorte de machine humaine de preuve de théorèmes ambulante et parlante. Si vous aviez un problème difficile avec quelque chose, vous pouviez l’aborder dans le couloir et dire « Jim », et il faisait cette chose amusante où il se redressait, ses yeux se déconcentraient un peu, il disait « hum », comme dans les films d’aujourd’hui, puis il se redressait et disait « n log n » et s’en allait. Et vous vous disiez, eh bien, d’accord, donc n log n est la réponse, comment est-il arrivé là ? À ce moment-là, il était déjà au bout du couloir. C’est juste l’oracle, la boîte noire qui vous donne la réponse, et ensuite vous devez trouver le chemin de la question à la réponse.

### Style de codage

Dans l’une des vidéos que j’ai vues, vous avez mentionné Don Knuth, du moins en recommandant son livre comme quelque chose que les gens devraient lire. Mais en termes de science informatique théorique, voyez-vous quelque chose de beau là-dedans qui vous a inspiré dans votre travail sur les langages de programmation, dans ce monde des algorithmes et de la complexité, et ces choses plus formelles et mathématiques ? Ou cela ne vous a-t-il pas vraiment marqué dans votre vie de programmeur ?

Cela m’a marqué assez clairement, car l’une des choses qui me tient à cœur, c’est de pouvoir regarder un morceau de code et me prouver à moi-même qu’il fonctionne. Par exemple, je me trouve en désaccord avec beaucoup de gens autour de moi sur des questions comme la manière de structurer un logiciel. Les ingénieurs logiciels deviennent très pointilleux sur la façon dont ils formatent les documents qui sont les programmes, où ils mettent les nouvelles lignes, les accolades, et tout le reste. Moi, j’ai tendance à opter pour un style très dense, pour minimiser l’espace blanc, pour maximiser la quantité que je peux voir d’un coup. J’aime pouvoir voir une fonction entière et comprendre ce qu’elle fait, plutôt que de devoir défiler, défiler, défiler et me souvenir. Je suis d’accord avec vous là-dessus. Mais les gens n’aiment pas ça. J’ai eu plusieurs fois des équipes d’ingénieurs qui ont organisé ce qui était effectivement une intervention. Ils m’invitaient à une réunion, tout le monde arrivait avant moi, et ils me regardaient tous en disant : « James, à propos de ton style de codage. »

Je suis un peu une personne étrange pour programmer, car je ne pense pas très bien verbalement. Je suis naturellement un lecteur lent. Ce que la plupart des gens appelleraient un penseur visuel. Donc, quand vous pensez à un programme, que voyez-vous ? Je vois des images. Quand je regarde un morceau de code sur une feuille de papier, il se transforme très rapidement en une image, presque comme une pièce de machinerie, avec ceci connecté à cela, comme des engrenages. Je les vois plus comme ça que comme la structure verbale ou lexicale des lettres. Donc, quand vous regardez le programme, c’est pourquoi vous voulez tout voir au même endroit, pour pouvoir le mapper à quelque chose de visuel, et ça saute de la page. Quelles sont les entrées, les sorties, que fait ce truc ? Obtenir une vision complète.

### Premier ordinateur

Pouvons-nous remonter dans vos souvenirs, accéder à votre mémoire à long terme ? Quel est le premier programme que vous ayez jamais écrit ?

Je n’ai aucune idée de ce qu’était le premier. Je sais sur quelle machine j’ai appris à programmer. C’était un PDP-8, à l’Université de Calgary. Vous souvenez-vous des spécifications ? Oh oui, la machine avait 4 Ko de RAM, des mots de 12 bits, la fréquence d’horloge était d’environ un tiers de mégahertz. Donc, on n’atteignait même pas le mégahertz. Aujourd’hui, on est environ 10 000 fois plus rapides. Était-ce une sorte de superordinateur, un ordinateur sérieux ? Non, le PDP-8i était la première chose que les gens appelaient un mini-ordinateur. Ils étaient assez peu coûteux pour qu’un laboratoire universitaire puisse peut-être se permettre d’en acheter un. Y avait-il du partage de temps, tout ça ? Il y avait effectivement un système d’exploitation à partage de temps pour cela, mais il n’était pas vraiment largement utilisé. La machine sur laquelle j’ai appris était cachée dans un coin reculé du centre informatique. Elle avait été achetée dans le cadre d’un projet de mise en réseau informatique, mais elle n’était pas beaucoup utilisée. Elle était juste là, et j’ai remarqué qu’elle était juste là, alors j’ai commencé à jouer avec, et personne ne semblait s’en soucier, alors j’ai continué. J’avais un clavier et un moniteur ? Oh, c’était bien avant que les moniteurs ne soient courants. C’était littéralement une télétype modèle 33, avec un lecteur de bande perforée. L’interface utilisateur n’était pas terrible. C’était le premier ordinateur construit avec des circuits intégrés, mais par circuits intégrés, je veux dire qu’ils avaient environ 10 ou 12 transistors sur une seule puce de silicium, pas les 10 ou 12 milliards que les machines ont aujourd’hui.

Qu’est-ce que ça faisait de travailler là-dessus ? Aviez-vous des intuitions sur la magie de l’amélioration exponentielle, de la loi de Moore, du potentiel de l’avenir qui était à portée de main ? Oh, c’était juste cool, un jouet. J’ai toujours aimé construire des choses, mais le problème avec la construction, c’est qu’il faut des pièces, du bois, des fils, des interrupteurs, des trucs comme ça, et ça coûte de l’argent. Là, vous pouviez construire des choses arbitrairement compliquées sans avoir besoin de matériaux physiques. Ça ne demandait pas d’argent. C’est une bonne manière de décrire la programmation. Si vous aimez construire des choses, c’est complètement accessible, vous n’avez besoin de rien, et n’importe qui, de n’importe où, peut construire quelque chose de vraiment cool. Oui, si vous avez accès à un ordinateur, vous pouvez construire toutes sortes de trucs fous. Et quand vous étiez quelqu’un comme moi, qui n’avait vraiment pas d’argent, je me souviens de convoiter l’achat d’un transistor. Quand je faisais des projets électroniques, ils étaient principalement réalisés en fouillant dans les poubelles pour trouver des déchets. L’un de mes gros butins était des racks de relais abandonnés à l’arrière d’un centre de commutation de la compagnie de téléphone. Oh, sympa, qu’en avez-vous fait ? J’ai construit une machine qui jouait au morpion. Bien sûr, avec des relais. Ce qui était vraiment difficile, c’est que tous les relais nécessitaient une tension spécifique, mais obtenir une alimentation qui fournissait cette tension était assez compliqué. Comme j’avais un tas de téléviseurs jetés, j’ai dû bricoler quelque chose qui n’était pas correct mais qui fonctionnait. Je faisais fonctionner ces relais à 300 volts, et aucune des connexions électriques n’était correctement scellée. Vous avez survécu à cette période de votre vie ? Oh, pour tant de raisons. Vous savez, il est assez courant pour les geeks adolescents de découvrir, oh, le thermite, c’est vraiment facile à faire.

Vous souvenez-vous d’un programme à Calgary que vous avez écrit, quelque chose qui se démarque, et en quel langage ? Eh bien, la plupart des programmes de taille significative étaient en code assembleur. En fait, avant d’apprendre l’assembleur, il y avait ce langage de programmation sur le PDP appelé Focal 5. Focal 5 était une sorte de Fortran très simplifié. Je me souviens d’avoir joué à construire des programmes qui faisaient des choses comme jouer au blackjack, au solitaire, ou pour une raison quelconque, les choses que j’aimais vraiment étaient celles où je traçais des graphiques, comme une fonction ou des données, et ensuite je les traçais. Et ça s’imprimait, pas sur un moniteur, mais sur une télétype, en utilisant quelque chose comme une machine à écrire pour tracer des fonctions.

Quand êtes-vous tombé amoureux de la programmation pour la première fois ? Quel était le premier langage de programmation, peut-être en tant qu’ingénieur logiciel sérieux, où vous avez pensé que c’était une chose magnifique ? Je n’ai jamais vraiment pensé qu’un langage particulier était magnifique, car pour moi, ce n’était jamais vraiment à propos du langage, mais de ce qu’on pouvait faire avec. Même aujourd’hui, les gens essaient de m’entraîner dans des débats sur des formes particulières de syntaxe pour ceci ou cela, et je suis comme, qui s’en soucie ? C’est à propos de ce que vous pouvez faire, pas de comment vous écrivez le mot. À l’époque, j’ai appris des langages comme PL/I, Fortran, Cobol, et au moment où les gens étaient prêts à m’embaucher pour faire des choses, c’était surtout du code assembleur, du code assembleur PDP, du code Fortran, et du code assembleur Control Data pour le CDC 6400, qui était, je suppose, un superordinateur précoce, même si ce superordinateur avait moins de puissance de calcul que mon téléphone, et de loin.

### Lisp

Vous avez également montré une appréciation pour le meilleur langage de tous les temps, que tout le monde considère comme étant Lisp. Eh bien, Lisp était définitivement sur ma liste des plus grands langages qui aient existé. Est-ce le numéro un ? Je ne le mettrais pas en numéro un maintenant. Est-ce les parenthèses ? Qu’aimez-vous et qu’aimez-vous moins dans Lisp ?

Eh bien, je suppose que la première chose à ne pas aimer, c’est qu’il y a tellement de parenthèses. Ce que j’aime, c’est que, malgré toutes ces parenthèses, on obtient une structure de langage intéressante. J’ai toujours pensé qu’il y avait une version plus conviviale de Lisp cachée quelque part, mais je n’ai jamais vraiment passé beaucoup de temps à y réfléchir. Plus haut dans la chaîne alimentaire pour moi, après Lisp, il y a Simula, que très peu de gens ont utilisé, mais qui, je pense, a eu une énorme influence. Simula, si je ne me trompe pas, est l’un des premiers langages fonctionnels ? Non, c’était le premier langage de programmation orienté objet. C’est là que les langages orientés objet ont vraiment pris forme. C’était aussi le langage où les coroutines sont apparues pour la première fois comme partie intégrante du langage, permettant un style de programmation que l’on pouvait considérer comme multi-threadé avec beaucoup de parallélisme. Il y avait des idées de parallélisme là-dedans. La première spécification de Simula, Simula 67, date de 1967. Les coroutines étaient presque des threads, mais elles n’avaient pas de véritable concurrence, donc on pouvait s’en sortir sans verrouillage complexe. Mais en termes de style de programmation, on pouvait écrire du code et le penser comme étant multi-threadé. Le modèle mental était très proche d’un modèle multi-threadé, et toutes sortes de problèmes pouvaient être abordées très différemment.

### Écrire une implémentation d’Emacs en C

Pour revenir au monde de Lisp un bref instant, à CMU, vous avez écrit une version d’Emacs qui, je pense, a eu un impact significatif sur l’histoire d’Emacs. Quelle était votre motivation à ce moment-là ?

C’était en 85 ou 86. J’utilisais Unix depuis quelques années, et la plupart des éditions se faisaient avec cet outil appelé Eddie, qui était une sorte d’ancêtre de vi. Était-ce un bon éditeur ? Pas un bon éditeur, sauf si votre dispositif d’entrée est une télétype, là c’est plutôt pas mal. C’était certainement plus humain que TECO, qui était courant dans l’univers DEC à l’époque. TECO, c’est le Text Editor and Corrector. L’Emacs original est sorti comme Editor MACroS. TECO avait une manière d’écrire des macros, et l’Emacs original de MIT a commencé comme une collection de macros pour TECO. Mais ensuite, le style Emacs est devenu populaire, d’abord à MIT, puis d’autres implémentations d’Emacs ont vu le jour, avec des bases de code entièrement différentes, mais dans le style philosophique de l’Emacs original.

Quelle était la philosophie d’Emacs, et d’ailleurs, toutes les implémentations étaient-elles toujours en C, et comment Lisp s’intègre-t-il dans l’histoire ? Non, le tout premier Emacs a été écrit comme un ensemble de macros pour l’éditeur de texte TECO. Le langage de macros de TECO était probablement le format le plus ridiculement obscur. Si vous regardiez un programme TECO sur une page, vous penseriez que ce sont juste des caractères aléatoires. Ça ressemble vraiment à du bruit de ligne, bien pire que LaTeX. Mais si vous utilisiez beaucoup TECO, ce que j’ai fait, TECO était complètement optimisé pour la frappe rapide au toucher. Il n’y avait presque pas de commandes à deux caractères, presque toutes étaient à un seul caractère. Chaque caractère sur le clavier était une commande distincte, et en fait, chaque caractère était généralement deux ou trois commandes, car vous aviez shift, control, et tout ça. C’était une manière de coder très densément. Ce qu’Emacs a fait principalement, c’est rendre cela visuel. Une façon de penser à TECO, c’est d’utiliser Emacs avec les yeux fermés, où vous devez maintenir un modèle mental de votre document. Vous devez vous dire, d’accord, le curseur est entre le « a » et le « e », et je veux les échanger, donc je fais ceci. C’est presque exactement l’ensemble de commandes d’Emacs, ou à peu près, mais en utilisant Emacs avec les yeux fermés.

Ce qu’Emacs a ajouté, c’est la capacité de voir visuellement ce que vous éditiez, sous une forme qui correspondait à votre document. Beaucoup de choses ont changé dans l’ensemble des commandes. Comme il était programmable, il était très flexible, vous pouviez ajouter de nouvelles commandes pour toutes sortes de choses. Ensuite, les gens ont réécrit Emacs plusieurs fois en Lisp. Il y en a eu un pour la machine Lisp à MIT, un pour Multics. Un été, j’ai eu un job d’été pour travailler sur le compilateur Pascal pour Multics. C’était la première fois que j’utilisais Emacs, pour écrire les compilateurs. J’ai passé trois mois intensifs à travailler sur ce compilateur Pascal, vivant pratiquement dans Emacs, celui écrit en MacLisp par Bernie Greenberg. J’ai pensé, wow, c’est une manière tellement meilleure d’éditer. Ensuite, je suis retourné à CMU, où nous avions un peu de tout, et comme je travaillais principalement dans l’univers Unix, et qu’Unix n’avait pas d’Emacs, j’ai décidé de régler ce problème.

J’ai donc écrit cette implémentation d’Emacs en C, car à l’époque, C était vraiment le seul langage qui fonctionnait sur Unix. Vous étiez à l’aise avec C aussi ? Oh oui, à ce moment-là, j’avais fait beaucoup de codage en C. C’était en 86. Ça fonctionnait assez bien pour que je puisse l’utiliser pour s’éditer lui-même en un mois ou deux. Ensuite, ça a pris le contrôle de l’université, ça s’est répandu, puis c’est mort. Et puis c’est sorti à l’extérieur, en grande partie parce qu’Unix a pris le contrôle de la communauté de recherche sur l’ARPANET. Emacs était en quelque sorte le meilleur éditeur disponible, il a pris le dessus. Il y a eu une brève période où j’avais des identifiants de connexion sur tous les hôtes non militaires de l’ARPANET, parce que les gens disaient : « Oh, pouvons-nous installer ça ? » et je disais : « Oui, mais vous aurez besoin d’aide. » À l’époque, la sécurité n’était pas une préoccupation, personne ne s’en souciait.

### Les débuts de l’Internet

Comment étaient les débuts de l’ARPANET et de l’Internet ? Pouviez-vous imaginer que l’Internet ressemblerait à ce qu’il est aujourd’hui ?

Certaines choses sont remarquablement inchangées. L’une des choses que j’ai remarquées très tôt, à Carnegie Mellon, c’est que beaucoup de vie sociale s’est centrée autour de l’ARPANET. Des choses comme organiser un déjeuner ou sortir en rendez-vous, tout était piloté par les médias sociaux. Entre les emails et les messages texte, car les messages texte faisaient partie de l’ARPANET très tôt. Il n’y avait pas de téléphones portables, mais vous étiez assis à un terminal, vous tapiez des trucs, essentiellement des emails ou des messages d’une ligne, comme un chat. Ma vie était devenue telle que je vivais sur les médias sociaux dès le milieu des années 80. Quand cela s’est transformé en Internet et que les médias sociaux ont explosé, je me suis dit : « Quel est le problème ? C’est juste une question d’échelle. » L’échelle est simplement stupéfiante, mais les fondamentaux, d’une certaine manière, ont à peine changé. Les technologies derrière le réseautage ont beaucoup changé, le moment décisif étant le passage de l’ARPANET à l’Internet, puis les gens ont commencé à faire évoluer, évoluer, évoluer. L’expansion qui s’est produite au début des années 90, et la manière dont tant d’intérêts établis ont combattu l’Internet… Qui ? Parce qu’on ne peut pas vraiment contrôler l’Internet. Les compagnies de télévision par câble, les diffuseurs, les compagnies de téléphone, au plus profond de leur être, détestaient l’Internet. C’était souvent drôle, car si vous pensez à une compagnie de câble, la plupart des employés ont pour mission de diffuser des émissions de télévision, des films, à leurs clients. Ils considèrent leur travail comme étant au service de leurs clients. Mais en montant dans la hiérarchie, cette vision change, car le véritable business des compagnies de câble a toujours été de vendre des globes oculaires aux annonceurs.

Cette vision d’une compagnie de câble ne se révélait pas à la plupart des gens qui y travaillaient. J’ai eu divers accrochages avec des compagnies de câble où l’on pouvait voir, dans les couches stratifiées de l’entreprise, cette vision que la raison d’avoir la télévision par câble est de capturer des globes oculaires. Les gens qui travaillaient dans les compagnies de téléphone ou de câble pensaient que leur travail était de fournir du contenu délicieux à leurs clients, et que les clients paieraient pour cela. Plus haut, ils voyaient cela comme une manière d’attirer des globes oculaires, puis de vendre ces globes oculaires collés à leur contenu aux annonceurs. L’Internet était donc une concurrence dans ce sens. Nous avions envoyé une proposition détaillée, à l’époque chez Sun, au début des années 90, qui disait essentiellement : avec les technologies Internet, n’importe qui peut devenir un fournisseur de contenu. Vous pourriez distribuer des films familiaux à vos parents ou cousins, n’importe où. N’importe qui peut devenir éditeur. Vous pensiez déjà à ça ? Oui, c’était au début des années 90. Nous pensions que ce serait génial, des choses comme des films familiaux, des essais d’enfants, des informations de supermarchés ou de restaurants. La réaction des compagnies de câble était : non, car alors nous sommes hors jeu.

Qu’est-ce qui fait que les entreprises ne voyaient pas de chemin vers des revenus ? Il y a une leçon là-dedans pour les grandes entreprises, écouter, anticiper les renégats, les gens qui pensent hors des sentiers battus comme vous, rédigeant des propositions sur ce que cela pourrait être. Si vous êtes dans une position où vous gagnez des tonnes d’argent avec un modèle commercial particulier, l’idée de sauter le fossé, vous savez, vous pouvez voir de nouveaux modèles plus efficaces émerger. Comme les appareils photo numériques par rapport aux appareils à pellicule. Pourquoi faire le saut quand vous gagnez tant d’argent avec la pellicule ? Chez Sun, l’un de nos gros clients était Kodak. J’ai beaucoup interagi avec des gens de Kodak, et ils avaient un gros groupe de recherche et développement sur les appareils photo numériques. Ils savaient que, en regardant les tendances, la qualité des appareils numériques s’améliorait, et les lignes allaient se croiser. Le moment où les lignes se croiseraient serait un effondrement de leur business, et ils le voyaient clairement. Le problème, c’est que jusqu’à ce qu’ils heurtent le mur, ils gagnaient des tonnes d’argent. Quand ils faisaient les calculs, ça n’avait jamais de sens de mener la charge.

### Elon Musk, Steve Jobs, Jeff Bezos

C’est là que le leadership visionnaire entre en jeu, non ? Quelqu’un doit arriver et dire : faisons le saut. Oui, mais c’est aussi prendre le coup. Vous pouvez dessiner tous les graphiques que vous voulez montrant que si nous sautons d’ici, sur notre trajectoire actuelle, nous allons vers une falaise. Si nous nous forçons à une transition proactive, nous pouvons être sur la prochaine vague, mais il y aura une période où nous serons dans un creux. Presque toujours, il y a un creux quand on traverse le fossé. Mais la manière dont fonctionnent les entreprises publiques, en rendant des comptes tous les trimestres, la seule chose qu’un PDG ne doit jamais faire, c’est prendre un gros coup sur un trimestre. Beaucoup de ces transitions impliquent un gros coup pendant un certain temps, un, deux, trois trimestres. Certaines entreprises, comme Tesla et Amazon, sont de très bons exemples d’entreprises qui prennent d’énormes coups, mais elles ont le luxe de pouvoir ignorer le marché boursier pendant un moment. Ce n’est pas vraiment vrai aujourd’hui, mais au début de ces deux entreprises, elles se fichaient des rapports trimestriels, elles se préoccupaient du nombre de clients satisfaits. Avoir le plus de clients satisfaits possible peut souvent être un ennemi des résultats financiers.

Comment font-elles pour que ça marche ? Amazon a opéré dans le négatif pendant longtemps, c’est comme investir dans l’avenir. Amazon, Google, Tesla, Facebook, beaucoup d’entre elles avaient ce qu’on pourrait appeler de l’argent patient, souvent parce qu’il y avait une figure centrale charismatique avec un gros bloc d’actions, et ils pouvaient simplement le faire. Sur ce sujet, vous avez eu l’occasion de travailler avec de grands leaders. Quelles sont vos pensées sur le leadership d’Elon Musk chez Tesla, de Jeff Bezos chez Amazon, tous ces gens avec de grandes quantités d’actions et une vision dans leur entreprise ? Ce sont des fondateurs, ou des gens arrivés très tôt, et Amazon a pris beaucoup de sauts. À l’époque, les gens critiquaient probablement : qu’est-ce que cette librairie ? Bezos avait une vision et la capacité de la suivre. Beaucoup de gens ont des visions, et la vision moyenne est complètement idiote, et vous vous écrasez et brûlez. Le taux d’échec et d’incendie de la Silicon Valley est assez élevé. Ils ne s’écrasent pas nécessairement parce que les idées étaient stupides, mais souvent, c’est juste une question de timing, de chance. Prenez des entreprises comme Tesla. Le Tesla original, avant Elon, allait à peu près bien, mais il les a conduits avec une vision vraiment forte. Il prenait des décisions qui étaient généralement assez bonnes. Le Model X était un peu une idée farfelue, mais il l’a fait audacieusement. Tant de gens se sont opposés aux portes en ailes de faucon. D’un point de vue technique, ces portes sont ridicules, un véritable désastre, mais elles sont exactement le symbole d’un grand leadership : vous avez une vision, et si vous faites quelque chose de stupide, faites-le vraiment stupide, et allez-y à fond.

Pour revenir un peu en arrière, à Steve Jobs. Il était un personnage similaire, avec une vision forte et très intelligent. Il n’était pas intelligent sur les aspects technologiques, mais sur la relation humaine entre les humains et les objets. Mais c’était un con. Pouvons-nous nous attarder là-dessus un peu ? Les gens disent qu’il était un con. Est-ce une caractéristique ou un défaut ? C’est la question. Prenez quelqu’un comme Steve, qui était vraiment dur avec les gens. Était-il inutilement dur, ou faisait-il simplement en sorte que les gens atteignent sa vision ? On pourrait le voir des deux façons. Les résultats racontent une histoire. Par ses manières de con, il a souvent poussé les gens à faire le meilleur travail de leur vie. J’ai passé plusieurs entretiens avec lui, j’ai eu diverses négociations avec lui. Même si, personnellement, je l’aimais, je n’aurais jamais pu travailler pour lui. Pourquoi ? Pouvez-vous mettre des mots sur la tension que vous pensez serait destructrice plutôt que constructive ? Il criait sur les gens, il les insultait. Vous n’aimez pas ça ? Non, je ne pense pas qu’il soit nécessaire de faire ça. Il y a pousser les gens à exceller, et puis il y a aller trop loin, et je pense qu’il était du mauvais côté de la ligne.

Je n’ai jamais travaillé pour Musk, je connais plusieurs personnes qui l’ont fait. Beaucoup ont dit, et ça apparaît beaucoup dans la presse, que Musk est un peu comme ça. Une des choses que je déteste dans la Silicon Valley ces jours-ci, c’est que beaucoup de succès fulgurants sont dirigés par des gens qui sont de vrais cons. Il semble y avoir cette mythologie, venue de Steve Jobs, que la raison de son succès était qu’il était super dur avec les gens. Dans certains milieux, les gens commencent à se dire : si je veux réussir, je dois être un vrai con. Pour moi, ça ne tient pas. Je connais beaucoup de gens qui réussissent et qui ne sont pas des cons, qui sont des gens parfaitement bien. Ils ont tendance à ne pas être sous les projecteurs. Le grand public, d’une manière ou d’une autre, élève les cons au statut de héros, parce qu’ils font des choses qui les mettent dans la presse.

### Travailler dur et intelligemment

Sur le côté des cons, il y a aussi, si je devais critiquer ce que j’ai vu dans la Silicon Valley, une résistance à travailler dur. Jobs et Musk poussent les gens à travailler vraiment dur. La question est de savoir s’il est possible de le faire gentiment. Ce qui me dérange, peut-être parce que je romantise la souffrance, c’est que je pense que travailler dur est essentiel pour accomplir quelque chose d’intéressant, vraiment dur. Dans le jargon de la Silicon Valley, c’est probablement trop dur. Cette idée qu’il faut travailler intelligemment, pas dur, me semble souvent dire qu’il faut être paresseux. Bien sûr, vous voulez travailler intelligemment, être le plus efficace possible, mais pour découvrir le chemin efficace, comme nous parlions des programmes courts, eh bien, l’idée de travailler intelligemment et dur, ce n’est pas l’un ou l’autre, c’est les deux. Les gens qui disent qu’il faut travailler intelligemment, pas dur, échouent presque toujours. Merci. C’est juste une recette pour le désastre. Il y a des contre-exemples, mais ce sont plus des gens qui ont bénéficié de la chance et du timing. Vous dites qu’on peut pousser les gens à travailler dur et à faire un travail incroyable sans être méchant. Google est un bon exemple. Le leadership de Google, à travers son histoire, a été un assez bon exemple de ne pas être méchant. Les jumeaux, Larry et Sergey, sont tous deux assez gentils. Sundar Pichai est très gentil. C’est une culture de gens qui travaillent vraiment, vraiment dur.

### Open source

Une question un peu tendue. Nous parlons d’Emacs, il semble que vous ayez fait un travail incroyable, mais en dehors de Java, certaines de vos réalisations n’ont pas été aussi populaires qu’elles auraient pu l’être à cause de problèmes de licences et d’open source. Quelles sont vos pensées sur tout ce désordre, sur l’open source maintenant, avec le recul ? Sur les licences, l’open source, pensez-vous que l’open source est une bonne chose, une mauvaise chose ? Avez-vous des regrets ? Avez-vous tiré des leçons de cette expérience ?

En général, je suis un grand fan de l’open source, de la manière dont il peut être utilisé pour construire des communautés, promouvoir le développement des choses, favoriser la collaboration. Tout cela est vraiment formidable. Quand l’open source devient une religion qui dit que tout doit être open source, je deviens un peu bizarre à ce sujet, car c’est un peu comme dire que tous les ingénieurs logiciels doivent faire vœu de pauvreté, comme si c’était contraire à l’éthique d’avoir de l’argent, de construire une entreprise. Une partie de moi y adhère un peu, parce que les gens qui gagnent des milliards de dollars grâce à un brevet qui est venu d’une idée fulgurante alors qu’ils étaient à moitié éveillés dans leur lit, c’est de la chance, bravo pour eux. Mais la manière dont cela explose parfois en quelque chose qui ressemble beaucoup à de l’exploitation, on voit beaucoup ça dans l’industrie pharmaceutique, avec des médicaments qui coûtent 100 dollars par jour. Ce qui me dérange avec l’open source, c’est quand quelque chose n’est pas open source et que, à cause de ça, c’est un produit moins bon. Par exemple, votre implémentation d’Emacs aurait pu être l’implémentation dominante. J’utilise Emacs, c’est mon IDE principal, je m’excuse auprès du monde, mais je l’aime toujours. J’aurais pu utiliser votre implémentation d’Emacs. Pourquoi ne le fais-je pas ? Vous utilisez GNU Emacs ? Je suppose que c’est celui par défaut sur Linux. Et à travers un étrange passage, il a commencé comme celui que j’ai écrit. Une partie de cela était parce que, dans les deux dernières années de mon doctorat, il est devenu clair pour moi que j’allais soit être M. Emacs pour toujours, soit obtenir mon diplôme. Je ne pouvais pas faire les deux.

Était-ce une décision difficile ? C’est fascinant de penser à vous comme à une figure publique, une trajectoire différente aurait pu se produire. Peut-être que j’aurais pu être fabuleusement riche aujourd’hui si j’étais devenu M. Emacs et qu’Emacs s’était transformé en une série d’applications de traitement de texte et toutes sortes de choses. J’ai une longue histoire de décisions financièrement sous-optimales parce que je ne voulais pas de cette vie. Je suis allé à l’école doctorale parce que je voulais obtenir mon diplôme. Être M. Emacs pendant un moment était amusant, puis ça a cessé de l’être. Quand ce n’était plus amusant, et que je ne pouvais pas payer mon loyer, j’ai décidé de choisir. J’ai contacté toutes les personnes que je connaissais sur l’ARPANET qui pourraient prendre en charge Emacs, et presque tout le monde a dit : j’ai un boulot à temps plein. J’ai finalement trouvé deux personnes dans un garage dans le New Jersey, avec un chien, qui étaient prêtes à prendre le relais, mais elles allaient devoir faire payer. Mon accord avec elles était qu’elles le rendraient gratuit pour les universités et les écoles, et elles ont dit d’accord. Ça a contrarié certaines personnes.

Il y a une tension avec M. Richard Stallman, sur cette question de logiciel libre, une sorte de focalisation dogmatique sur le fait que toute information doit être libre. Quelle est une manière intéressante de décrire le désaccord que vous avez eu avec Richard au fil des années ? Mon opposition de base est que, quand vous dites que l’information doit être libre, sous une forme vraiment extrême, cela se transforme en dire que toutes les personnes dont le travail est la production de tout, des films au logiciel, doivent faire vœu de pauvreté. Ça ne marche pas pour moi. Je ne veux pas être follement riche, je ne le suis pas, je m’en sors bien, je peux nourrir mes enfants. Je suis tout à fait d’accord avec vous. Ça me rend triste que parfois, la fermeture du code source, pour une raison ou une autre, entraîne la construction d’une bureaucratie, et parfois ça nuit au produit. Absolument, c’est toujours triste. Il y a un équilibre là-dedans, ce n’est pas du capitalisme rapace d’un côté, ni l’extrême opposé. Beaucoup du mouvement open source a été magique pour trouver un chemin pour gagner de l’argent, comme le service et le support. Il y a des manières un peu perverses, comme avec la loi Sarbanes-Oxley et diverses interprétations des principes comptables. Si une entreprise dépend d’un logiciel, souvent, les normes comptables disent que si vous n’avez pas de contrat de support, c’est mauvais. Donc, si vous avez une base de données, vous devez payer pour le support. Mais il y a une différence entre les contrats de support que les producteurs de bases de données open source facturent et ce que quelqu’un de véritablement rapace comme Oracle facture. C’est un équilibre.

### Java

Vous avez créé l’un des langages de programmation les plus populaires au monde, le langage avec lequel j’ai appris la programmation orientée objet. C’est un langage que beaucoup de gens utilisent dans de nombreux endroits et sur des millions d’appareils aujourd’hui, Java. La question absurde, mais pouvez-vous raconter l’histoire de l’origine de Java ?

Il y a longtemps, chez Sun, vers 1990, un groupe d’entre nous s’inquiétait du fait qu’il se passait des choses dans l’univers de l’informatique que l’industrie informatique ratait. Quelques-uns d’entre nous ont lancé ce projet chez Sun, qui a vraiment démarré en 1991. Il s’agissait de ce qui se passait en termes de matériel informatique, de processeurs, de réseautage, tout ça, en dehors de l’industrie informatique. Cela allait des premières lueurs des téléphones portables à l’époque, aux ascenseurs, locomotives, systèmes de contrôle de processus dans les usines, équipements audio et vidéo. Ils avaient tous des processeurs, et ils faisaient des choses avec. On avait l’impression qu’il se passait quelque chose là-dedans qu’on devait comprendre. C, C++ étaient déjà dans l’air. Oh non, C et C++ dominaient complètement l’univers à ce moment-là, tout était écrit en C et C++. Alors, d’où venait l’intuition qu’il y avait besoin d’une révolution ? Le besoin d’une révolution ne concernait pas un langage, c’était juste aussi simple et vague qu’il se passait des choses là dehors, et nous devons les comprendre.

Quelques-uns d’entre nous sont partis pour plusieurs voyages épiques, littéralement des voyages. On prenait l’avion, on allait au Japon, on visitait Toshiba, Sharp, Mitsubishi, Sony, et comme nous travaillions pour Sun, nous avions des gens prêts à nous présenter. Nous avons visité Samsung, un tas d’entreprises coréennes, nous sommes allés partout en Europe, chez Philips, Siemens, Thompson. Qu’avez-vous vu là-bas ? Pour moi, ce qui m’a marqué, c’est qu’ils faisaient toutes les choses informatiques habituelles que les gens faisaient 20 ans auparavant. Ce qui m’a vraiment sauté aux yeux, c’est qu’ils réinventaient le réseautage informatique, et ils faisaient toutes les erreurs que l’industrie informatique avait faites. Comme j’avais beaucoup travaillé dans le domaine du réseautage, on visitait une entreprise X, ils décrivaient leur truc de réseautage, et sans réfléchir, je pouvais leur dire les 25 choses qui allaient être des catastrophes complètes avec ce qu’ils faisaient. Je ne sais pas si ça a eu un impact sur eux, mais cette histoire de répéter les désastres de l’industrie informatique était là. On pensait qu’on pourrait peut-être faire quelque chose d’utile en les faisant avancer un peu, mais en même temps, nous avons appris beaucoup de ces entreprises d’électronique grand public.

En haut de la liste, il y avait leur vision de la relation avec le client comme sacrée. Ils n’étaient jamais prêts à faire des compromis sur la sécurité. Une chose qui m’a toujours rendu nerveux dans l’industrie informatique, c’est que les gens étaient prêts à faire des compromis sur la fiabilité pour obtenir des performances. Ils voulaient plus rapide, même si ça casse un peu plus souvent, ou peut-être qu’on le fait fonctionner un peu plus chaud que nécessaire. Ce qui me soufflait toujours, c’était la manière dont les gens chez Cray Supercomputers rendaient leur division super rapide en utilisant des approximations de Newton-Raphson, donc les bits les plus bas de a sur b étaient essentiellement des nombres aléatoires. Qu’est-ce qui pourrait mal tourner ? Juste comprendre comment clouer le dernier bit, s’assurer que si vous mettez une tranche de pain dans un grille-pain, ça ne va pas tuer le client ou mettre le feu à la maison.

Ce sont les principes qui inspiraient, mais comment, des jours où Java s’appelait Oak à cause d’un arbre devant la fenêtre, est-il devenu ce langage incroyablement puissant ? C’était un ensemble de choses. Après tout ça, nous avons décidé que la meilleure manière de comprendre les choses était de construire une démo, un prototype de quelque chose. Parce que c’était facile et amusant, nous avons décidé de construire un système de contrôle pour des appareils électroniques domestiques, TV, magnétoscope, ce genre de choses. En le construisant, nous avons découvert que certaines pratiques standard en programmation C nous gênaient vraiment. Ce n’était pas qu’on ne pouvait pas écrire le code pour faire ce qu’il fallait, mais dans le groupe, nous avions un gars dont le travail de haut niveau était d’être un homme d’affaires, un type de MBA, qui pensait aux plans d’affaires. Nous parlions des choses qui allaient mal ou bien, et en pensant aux exigences de sécurité, certains détails de bas niveau en C, comme les pointeurs nus. Au début des années 90, il était bien compris que la source numéro un des vulnérabilités de sécurité était les pointeurs, les bugs. Environ 50, 60, 70 % de toutes les vulnérabilités de sécurité étaient des bugs, et la grande majorité étaient des dépassements de tampon. On s’est dit : il faut réparer ça, il faut s’assurer que ça ne puisse pas arriver.

C’était le point de départ pour moi : ça ne peut pas continuer. Cette année, j’ai trouvé amusant un article, je ne sais plus quel magazine l’a publié, qui examinait toutes les vulnérabilités de sécurité dans Chrome, un énorme morceau de code C++. 60 ou 70 % de toutes les vulnérabilités de sécurité étaient des trucs stupides avec les pointeurs. J’ai pensé : 30 ans plus tard, on est encore là, et on veut juste pleurer. Attribueriez-vous la création de Java aux problèmes évidents de C ? C’était l’un des points déclencheurs. La concurrence était un gros problème. Quand vous interagissez avec des gens, la dernière chose que vous voulez voir, c’est que ça attend. Les problèmes liés au processus de développement logiciel, quand des erreurs se produisent, pouvez-vous récupérer ? Que pouvez-vous faire pour faciliter la création et l’élimination de structures de données complexes ? Que pouvez-vous faire pour résoudre l’un des problèmes les plus courants en C, les fuites de mémoire, et son jumeau maléfique, la mémoire libérée mais encore utilisée ? Quand j’y pensais au départ, je pensais en termes de problèmes de sécurité, mais j’ai fini par comprendre que ce n’était pas seulement une question de sécurité, mais de vélocité des développeurs.

Je suis devenu très religieux à ce sujet, car à ce moment-là, j’avais passé un temps fou à chasser des bugs mystérieux de pointeurs. Environ les deux tiers de mon temps en tant que développeur logiciel étaient consacrés à ça, car les bugs de pointeurs mystérieux sont les plus difficiles à trouver, car ils sont très statistiques. Ceux qui font mal, c’est une chance sur un million, mais ça crée une souffrance infinie, car quand vous faites un milliard d’opérations par seconde, une chance sur un million signifie que ça va arriver. Je suis devenu très religieux sur le fait de s’assurer que si quelque chose échoue, ça échoue immédiatement et visiblement. Une des choses qui a vraiment attiré beaucoup d’équipes de développement vers Java, c’était qu’on faisait fonctionner notre code deux fois plus vite. Vous parlez de l’ensemble du processus de développement, le débogage, tout ça ? Oui, si vous mesurez le temps depuis le moment où vous touchez le clavier jusqu’à ce que vous obteniez votre première démo, pas beaucoup de différence. Mais si vous regardez depuis le moment où vous touchez le clavier jusqu’à un logiciel solide que vous pouvez mettre en production, c’était beaucoup plus rapide. Ce que les gens ne réalisent pas souvent, c’est que les bugs difficiles à attraper ralentissent vraiment les choses. Mais aussi, une des choses que vous obtenez de la programmation orientée objet, c’est une méthodologie stricte sur ce que sont les interfaces entre les choses, et être vraiment clair sur la manière dont les parties se relient les unes aux autres.

Cela aide, car souvent, les gens contournent les côtés. Si vous avez construit quelque chose et que les gens l’utilisent, vous dites : je l’ai construit, vous l’utilisez comme ça. Ensuite, vous le changez d’une manière qui fait toujours ce que vous avez dit, mais différemment. Puis vous découvrez que quelqu’un là dehors contournait par un chemin détourné, et son code s’est cassé. Normalement, l’attitude est : idiot. Mais souvent, vous ne pouvez pas simplement leur taper sur la main et leur dire de ne pas faire ça, car c’est peut-être le système de réconciliation des comptes d’une banque, où un développeur a décidé : je suis paresseux, je vais passer par la porte dérobée, parce que le langage le permet. Vous ne pouvez même pas être en colère contre eux. Une des choses que j’ai faites, qui a contrarié beaucoup de gens, c’est que j’ai rendu impossible de passer par les portes dérobées. Le but était de dire : si l’interface ici n’est pas correcte, la mauvaise manière de gérer ça, c’est de passer par une porte dérobée. La bonne manière, c’est d’aller voir le développeur de ce truc et de dire : change l’interface, corrige-la. C’était une sorte d’ingénierie sociale, et les gens ont fini par découvrir que ça faisait vraiment une différence, surtout quand vous construisez des logiciels plus grands et complexes, avec beaucoup de gens qui travaillent dessus, et surtout quand ils couvrent plusieurs organisations. Avoir une clarté sur la manière dont ces choses sont structurées vous sauve la vie. Surtout, il y a tellement de logiciels qui sont fondamentalement intestables. Mieux vaut écrire du bon code dès le départ, plutôt que d’écrire du code médiocre et essayer de le réparer en cherchant les bugs par des tests.

### Machine virtuelle Java

L’une des idées les plus belles, philosophiquement et techniquement, est celle d’une machine virtuelle, la machine virtuelle Java (JVM). Comment l’idée de la JVM est-elle née ? Était-ce une idée radicale ? Cela me semble être une idée vraiment intéressante dans l’histoire de la programmation. Qu’est-ce que c’est ?

La machine virtuelle Java, on peut la voir de différentes manières, car elle a été soigneusement conçue pour être vue de différentes façons. Une vision, que la plupart des gens ne réalisent pas vraiment, est qu’on peut la voir comme une sorte d’encodage de l’arbre de syntaxe abstraite en notation polonaise inversée. Je ne sais pas si ça a du sens. Je pourrais l’expliquer, mais ça prendrait tout notre temps. Une autre manière de la penser, et celle qui est généralement expliquée, est que c’est comme l’ensemble d’instructions d’une machine abstraite conçue de telle sorte qu’on peut traduire cette machine abstraite vers une machine physique. La raison pour laquelle c’est important, c’est que, si vous remontez au début des années 90, quand nous parlions à toutes ces entreprises d’électronique grand public, les discussions avec les acheteurs étaient intéressantes. Si vous regardez comment ces appareils sont assemblés, ce sont de la tôle, des engrenages, des circuits imprimés, des condensateurs, des résistances, et tout ce que vous achetez a plusieurs sources. Vous pouvez acheter un condensateur ici ou là, et vous avez un marché, donc vous pouvez obtenir un prix décent. Mais les CPU, particulièrement au début des années 90, étaient tous différents et tous propriétaires. Si vous utilisiez une puce d’Intel, vous deviez être client d’Intel jusqu’à la fin des temps, car si vous écriviez un logiciel, il était lié à cette machine particulière. Cela rendait les acheteurs absolument fous, qu’ils soient soudés à cette décision, et qu’ils doivent la prendre avant que la première ligne de logiciel ne soit écrite.

C’est drôle que vous parliez des acheteurs, c’est une perspective. Il y a probablement beaucoup d’autres perspectives qui détestaient cette idée. Mais d’un point de vue technique, créer une couche d’abstraction agnostique de la machine sous-jacente, du point de vue du développeur, c’est brillant, non ? Oui, et en plus, il y a la question du temps. D’une génération à la prochaine, elles étaient toutes différentes, et il fallait souvent réécrire votre logiciel. Une des choses qui m’a vraiment pris un an de ma vie, c’est quand Sun est passé du processeur Motorola 68010 au 68020. Ils avaient plusieurs différences, et l’une d’elles nous a durement touchés. J’ai fini par être le gars en pointe sur le pire cas où l’architecture du nouveau cache d’instructions nous a fait mal.

Vous articulez un problème fondamental dans toute l’informatique, mais d’où tirez-vous le courage de penser qu’on peut vraiment résoudre ça ? Dans nos conversations avec tous ces vendeurs, ces problèmes ont commencé à apparaître. J’ai eu une sorte d’épiphanie, car ça me rappelait un job d’été que j’avais eu en école doctorale. À l’époque, j’avais deux directeurs de thèse, pour des raisons bizarres, Raj Reddy et Bob Sproul. Le département avait acheté un tas de stations de travail précoces d’une entreprise appelée Three Rivers Computer Company. Cette entreprise était composée d’ingénieurs électriciens qui voulaient faire le moins de logiciels possible. Ils savaient qu’ils auraient besoin de compilateurs, d’OS, et tout ça, mais ils ne voulaient pas le faire, et pour presque rien. Ils ont construit une machine dont l’ensemble d’instructions était littéralement le bytecode pour UCSD Pascal, le P-code. Nous avions un tas de logiciels écrits pour cette machine, et pour diverses raisons, l’entreprise ne se portait pas très bien. Nous voulions que ces logiciels tournent sur d’autres machines, principalement des VAX. Raj m’a demandé si je pouvais trouver un moyen de porter tout ce logiciel, de traduire des machines Perq vers les VAX. Je pense qu’il avait en tête quelque chose qui traduirait du Pascal vers du C. À l’époque, vous pouviez traduire en C, et si vous n’aimiez pas traduire en C, eh bien, vous traduisiez en C. C’était comme Henry Ford : n’importe quelle couleur, tant que c’est noir.

J’ai pensé que c’était vraiment difficile. En regardant les choses, je me suis dit : je parie que je pourrais réécrire le P-code en code assembleur VAX. J’ai commencé à réaliser que certaines propriétés du P-code rendaient ça vraiment facile, d’autres vraiment difficile. J’ai fini par écrire ce truc qui traduisait du P-code des Perq Three Rivers en code assembleur sur les VAX, et j’ai obtenu un code de meilleure qualité que le compilateur C. Tout est devenu vraiment rapide, vraiment facile. J’ai pensé que c’était un hack minable parce que j’étais paresseux, mais en fait, ça fonctionnait vraiment bien. J’ai essayé de convaincre les gens que c’était peut-être un bon sujet de thèse, mais personne n’était convaincu. Avancez de quelques années, et nous devions permettre de passer d’un microprocesseur bizarre à un autre totalement différent. Je me suis dit, peut-être en faisant quelque chose dans l’espace du P-code Pascal, je pourrais faire plusieurs traducteurs. J’ai passé du temps à réfléchir à ce qui avait fonctionné et ce qui n’avait pas fonctionné quand j’ai fait le traducteur P-code vers VAX. J’ai parlé à des gens impliqués dans Smalltalk, car Smalltalk utilisait aussi du bytecode. Puis je me suis dit : oui, je veux faire ça. Ça avait l’avantage qu’on pouvait soit l’interpréter, soit le compiler. Les interpréteurs sont généralement plus faciles à faire, mais pas aussi rapides qu’un compilateur. J’ai pensé : super, je peux encore être paresseux. Parfois, je pense que la plupart de mes bonnes idées sont motivées par la paresse. Elles sont souvent le résultat de la souffrance, mais d’une manière ou d’une autre, elles finissent par être de bonnes idées.

C’est ainsi que ça s’est fait. Ça s’est transformé en une position presque religieuse de ma part, ce qui m’a valu plusieurs autres conflits. Par exemple, la manière dont l’arithmétique fonctionnait. Il fut un temps où ce n’était pas toujours l’arithmétique en complément à deux. Certaines machines avaient une arithmétique en complément à un, comme presque tout ce qui était construit par CDC. Occasionnellement, il y avait des machines avec une arithmétique décimale. J’ai pensé : c’est fou. L’arithmétique entière en complément à deux a gagné, alors faisons juste ça. Un autre endroit où il y avait beaucoup de variabilité, c’était dans la manière dont les nombres à virgule flottante se comportaient, ce qui causait beaucoup de douleur dans l’industrie du logiciel. Vous ne pouviez pas faire une bibliothèque de calcul numérique qui fonctionnait sur CDC, puis sur une machine IBM, puis sur une machine DEC. À travers cette lutte, il y avait eu tout un travail sur les normes de virgule flottante, et cette chose appelée IEEE 754 est apparue, la norme de virgule flottante qui a pratiquement pris le contrôle de tout l’univers. À l’époque où je faisais Java, elle avait presque fini de conquérir l’univers, il restait quelques poches de résistants. J’ai pensé : il est important de pouvoir dire ce que deux plus deux signifie. J’ai eu des conflits avec des gens, car quelques machines n’implémentaient pas correctement IEEE 754. Bien sûr, ce sont des combats à court terme, je pense qu’à long terme, cette vision a triomphé. Les plus gros combats étaient avec Intel, car ils avaient fait des choses étranges avec l’arrondi, des choses étranges avec leurs fonctions transcendantales, ce qui pouvait devenir une explosion de bizarreries au nom de l’optimisation. Leurs problèmes avec les fonctions transcendantales étaient juste stupides, ils faisaient une réduction de plage pour le sinus et le cosinus en utilisant une valeur légèrement fausse pour pi.

### Android

Dans l’intérêt du temps, deux questions, une sur Android et une sur la vie. On pourrait parler pendant des heures, j’espère qu’on pourra reparler un jour, mais je dois vous poser une question sur Android et l’utilisation de Java là-dedans, car c’est l’un des nombreux endroits où Java a un impact énorme sur ce monde. De votre point de vue, y a-t-il des choses qui vous rendent heureux concernant la manière dont Java est utilisé dans le monde Android, et y a-t-il des choses que vous souhaiteriez différentes ?

Je ne sais pas comment faire une réponse courte à ça, mais je dois faire une réponse courte. Je suis heureux qu’ils l’aient fait. Java tournait sur les téléphones portables depuis plusieurs années à ce moment-là, et ça fonctionnait vraiment bien. Il y avait des choses dans la manière dont ils l’ont fait, en particulier diverses façons dont ils ont violé toutes sortes de contrats. Le gars qui a dirigé ça, Andy Rubin, a franchi beaucoup de lignes. Certaines lignes ont été franchies, ce qui a depuis explosé en d’énormes affaires judiciaires. Ils n’avaient pas besoin de faire ça, et en fait, ça aurait été tellement moins cher pour eux de ne pas franchir les lignes. Je suppose qu’ils n’anticipaient pas le succès de toute cette entreprise, ou pensez-vous qu’à ce moment-là, il était déjà clair que ça allait exploser ? J’ai fini par croire que peu importe ce qu’Andy faisait, ça allait exploser. Je commençais à le voir comme un fabricant de bombes. Certaines des meilleures choses dans ce monde viennent d’un peu d’explosion, et certaines des pires. Ça vous rend fier que Java soit dans des millions, peut-être des milliards d’appareils ? Eh bien, il était dans des milliards de téléphones avant qu’Android n’arrive. Je suis tout aussi fier de la manière dont les normes de cartes à puce ont adopté Java. Tout le monde impliqué là-dedans a fait un très bon travail, et c’est des milliards et des milliards. Les cartes SIM dans votre poche. J’ai été hors de ce monde pendant une décennie, donc je ne sais pas comment ça a évolué, mais c’est juste fou.

### Conseils

Sur ce sujet, encore une fois, il y a un million de choses techniques dont nous pourrions parler, mais permettez-moi de poser la vieille question philosophique absurde sur la vie. Quand vous regarderez en arrière sur votre vie, et que les gens parleront de vous dans 500 ans, quel héritage espérez-vous laisser ?

Que les gens n’aient pas peur de faire un saut dans l’inconnu. J’ai cette histoire bizarre de faire des trucs bizarres, et ça a plutôt bien marché. Je pense que certaines des choses les plus étranges que j’ai faites ont été les plus cool. Certaines se sont écrasées et ont brûlé, plus de la moitié de ce que j’ai fait s’est écrasé et a brûlé, ce qui a parfois été vraiment ennuyeux, mais vous avez continué. Même quand les choses s’écrasent et brûlent, vous apprenez au moins quelque chose. En guise de conseil, pour les développeurs, ingénieurs, scientifiques, ou simplement les jeunes qui vous admirent, quel conseil leur donneriez-vous sur la manière d’aborder leur vie ?

N’ayez pas peur du risque. C’est okay de faire des choses stupides une fois, peut-être même deux fois. Vous avez un passe pour la première ou la deuxième fois que vous faites quelque chose de stupide. La troisième ou quatrième fois, pas tellement. Très tôt, j’ai commencé à penser aux choix éthiques dans ma vie. Étant un grand fan de science-fiction, j’ai commencé à penser à presque chaque décision technique que je prends en termes de : est-ce que vous construisez Blade Runner ou Star Trek ? Quel futur préféreriez-vous vivre ? Eh bien, je préférerais certainement vivre dans l’univers de Star Trek. Ça ouvre tout un sujet sur l’IA, mais c’est une idée vraiment intéressante. Votre système d’IA préféré serait Data de Star Trek, et le moins préféré serait facilement Skynet.

Magnifiquement dit, je ne pense pas qu’il y ait une meilleure manière de conclure. James, je ne peux pas exprimer à quel point c’est un honneur de vous rencontrer, de vous parler. Merci beaucoup d’avoir perdu votre temps avec moi aujourd’hui. Pas une perte du tout, merci James.

Merci d’avoir écouté cette conversation avec James Gosling, et merci à nos sponsors Public Goods, BetterHelp et ExpressVPN. Veuillez consulter ces sponsors dans la description pour obtenir une réduction et soutenir ce podcast. Si vous appréciez ce contenu, abonnez-vous sur YouTube, donnez-lui cinq étoiles sur Apple Podcast, suivez sur Spotify, soutenez sur Patreon, ou connectez-vous avec moi sur Twitter à @lexfridman.

Et maintenant, permettez-moi de vous laisser avec quelques mots de James Gosling : l’une des choses les plus difficiles dans la vie, c’est de faire des choix. Merci d’avoir écouté et à la prochaine fois.
</details>

Après avoir regardé la vidéo, essayez de répondre aux questions suivantes.

1. Quelles étaient les motivations principales de James Gosling pour créer le langage Java, et comment les problèmes des langages comme C et C++ ont-ils influencé son développement ?
2. Comment Gosling explique-t-il l’importance de la machine virtuelle Java (JVM) pour résoudre les problèmes rencontrés par les entreprises d’électronique grand public dans les années 1990 ?

## Résumé de l’architecture des ordinateurs et de l’abstraction des langages


Tous ces langages partagent un objectif commun : permettre aux programmeurs de décrire des solutions à des problèmes en s’éloignant progressivement des contraintes du matériel. Pour comprendre leur rôle, il est essentiel de se pencher sur le fonctionnement des ordinateurs.

Les ordinateurs modernes s’appuient sur deux concepts fondamentaux : la machine de Turing, théorisée par Alan Turing, qui définit une machine capable d’exécuter n’importe quel algorithme, et l’architecture de von Neumann, qui structure les ordinateurs autour de quatre composantes principales. Premièrement, la mémoire stocke à la fois les données et les programmes, une innovation clé par rapport aux machines antérieures où les instructions étaient fixes. Deuxièmement, l’unité de contrôle orchestre l’exécution des instructions en suivant un séquençage précis. Troisièmement, l’unité arithmétique et logique effectue les calculs de base, comme les additions ou les comparaisons. Enfin, les interfaces d’entrée/sortie permettent d’interagir avec l’utilisateur ou d’autres systèmes, via des périphériques comme les claviers, écrans ou réseaux.

Dans un langage plus accessible, un ordinateur contemporain se compose de processeurs (CPU), de mémoire vive (RAM) pour les calculs temporaires, de stockage à long terme (disques durs ou SSD), de processeurs graphiques (GPU) pour le rendu visuel, et de cartes d’entrée/sortie pour la connectivité. La carte mère agit comme un chef d’orchestre, coordonnant les échanges entre ces éléments. Par exemple, lorsqu’un programme s’exécute, le CPU lit les instructions depuis la RAM, effectue les calculs nécessaires, et envoie les résultats vers la mémoire ou un périphérique de sortie, comme un écran.

Les processeurs se déclinent en plusieurs architectures. Dans les ordinateurs personnels, les puces x64 (ou x86-64), produites par Intel et AMD, dominent grâce à leur puissance et leur compatibilité. Dans les appareils mobiles, comme les smartphones, les processeurs ARM, plus économes en énergie, sont privilégiés. La mémoire vive repose sur la technologie DRAM, rapide mais volatile, tandis que le stockage à long terme utilise majoritairement la mémoire flash, comme dans les SSD, pour sa rapidité et sa fiabilité.

Les langages de programmation jouent un rôle crucial en traduisant des instructions humaines en commandes compréhensibles par ces composants matériels. Leur niveau d’abstraction varie : les langages de bas niveau, comme l’assembleur, sont proches du matériel et offrent un contrôle précis mais exigent une expertise technique. À l’opposé, les langages de haut niveau, comme Python ou Java, simplifient le développement en masquant les détails matériels, ce qui les rend plus accessibles et adaptés à des applications complexes, comme le développement web ou l’intelligence artificielle.

Dans ce cours, nous explorerons le langage Java, largement adopté dans l’industrie pour sa portabilité, sa robustesse et sa polyvalence. Utilisé dans des domaines variés, des applications mobiles Android aux systèmes d’entreprise, Java illustre parfaitement comment un langage de haut niveau peut répondre à des besoins modernes tout en s’appuyant sur les principes fondamentaux de l’informatique.

## API

Le terme <strong>API</strong> signifie « Application Programming Interface » (interface de programmation d’application). Une API est un ensemble organisé de classes, de méthodes et de conventions qui permet à des développeurs d’utiliser facilement des fonctionnalités sans avoir à connaître les détails internes de leur implémentation. En Java, on parle souvent de l’API standard (Java Standard Library), qui regroupe des milliers de classes prêtes à l’emploi pour manipuler des chaînes de caractères, des fichiers, des collections, des dates, des flux de données, etc.

Par exemple, l’<strong>API Stream</strong> introduite en Java 8 fournit des outils puissants pour traiter des collections de données de façon déclarative et fonctionnelle (filtrer, transformer, trier, agréger…). L’API Swing permet de créer des interfaces graphiques, l’API JDBC permet d’accéder à des bases de données, etc. Chaque API définit un « contrat » : si vous respectez la façon d’utiliser ses classes et méthodes, vous pouvez profiter de fonctionnalités avancées sans réinventer la roue.

En résumé, une API est une boîte à outils logicielle, conçue pour être utilisée par d’autres développeurs, qui facilite l’accès à des fonctionnalités complexes (réseau, interface graphique, traitement de données, etc.) tout en masquant les détails techniques.


## Taille des processeurs et des transistors

Les processeurs modernes sont construits à l'aide de milliards de transistors. Le transistor est l'unité
de base des circuits informatiques et il permet de réaliser les différentes opérations de calcul.
Nos processeurs modernes sont relativement petits, la plupart pouvant tenir sur le bout d'un doigt.
Les transistors sont très petits. Cliquez sur le bouton *Zoomer* pour vous faire une idée.



<div style="margin:auto; display:flex; flex-direction:column; align-items:center;">
  <div style="width:10cm; margin-bottom:10px; text-align:center; font-size:2em;">Zoom ×<span id="zoomval">1</span></div>
  <button id="zoombtn" style="width:10cm; margin-bottom:10px; font-size:2em;">Zoomer</button>
  <div style="width:10cm; height:10cm; border:1px solid #fff; background:#222; display:flex; align-items:center; justify-content:center;">
    <svg id="mysvg" width="10cm" height="10cm" viewBox="0 0 1000 1000" style="background:#222;"></svg>
  </div>
  <div id="labels" style="width:10cm; margin-top:20px; text-align:left;">
    <ol style="font-size:32px;">
      <li style="color:#888;">Processeur Intel (45 mm × 37,5 mm)</li>
      <li style="color:#ccc;">Grain de sel (~1 mm)</li>
      <li style="color:#8cf;">Cellule de peau (~35 µm)</li>
      <li style="color:#f44;">Globule rouge (~7,5 µm)</li>
      <li style="color:#F6BE00;">Mitochondrie (~2 µm)</li>
      <li style="color:#0f0;">Transistor moderne (~2,5 nm)</li>
    </ol>
  </div>
</div>

<script>
const info = document.getElementById('info');
const hint = document.getElementById('hint');
const svg = document.getElementById('mysvg');

let zoom = 1;
const zoomMax = 1000000;
const zoomInterval = 50; // ms (plus rapide)
let zoomTimer = null;

// Toutes les tailles sont des diamètres ou longueurs caractéristiques en mètres
const levels = [
  { name: "processeur Intel", width: 0.045, height: 0.0375, color: "#888", label: "Processeur Intel (45 mm × 37,5 mm)", type: "rect" },
  { name: "grain de sel", size: 1e-3, color: "#ccc", label: "Grain de sel (~1 mm)", type: "circle" },
  { name: "cellule de peau", size: 35e-6, color: "#8cf", label: "Cellule de peau (~35 µm)", type: "circle" },
  { name: "globule rouge", size: 7.5e-6, color: "#f44", label: "Globule rouge (~7,5 µm)", type: "circle" },
  { name: "mitochondrie", size: 2e-6, color: "#F6BE00", label: "Mitochondrie (~2 µm)", type: "circle" },
  { name: "transistor", size: 2.5e-9, color: "#0f0", label: "Transistor moderne (~2,5 nm)", type: "transistor" }
];

function drawSVG() {
  while (svg.firstChild) svg.removeChild(svg.firstChild);
  let centerX = 500, centerY = 500;
  levels.forEach(obj => {
    if (obj.type === "rect") {
      let w = obj.width * zoom * 1e4;
      let h = obj.height * zoom * 1e4;
      let rect = document.createElementNS("http://www.w3.org/2000/svg", "rect");
      rect.setAttribute("x", centerX - w/2);
      rect.setAttribute("y", centerY - h/2);
      rect.setAttribute("width", w);
      rect.setAttribute("height", h);
      rect.setAttribute("fill", obj.color);
      rect.setAttribute("stroke", "#fff");
      svg.appendChild(rect);
    } else if (obj.type === "circle") {
      let objPixelSize = obj.size * zoom * 1e4;
      let circ = document.createElementNS("http://www.w3.org/2000/svg", "circle");
      circ.setAttribute("cx", centerX);
      circ.setAttribute("cy", centerY);
      circ.setAttribute("r", objPixelSize / 2);
      circ.setAttribute("fill", obj.color);
      circ.setAttribute("stroke", "#fff");
      circ.setAttribute("stroke-width", 4);
      svg.appendChild(circ);
    } else if (obj.type === "transistor") {
      let objPixelSize = obj.size * zoom * 1e4;
      let rect = document.createElementNS("http://www.w3.org/2000/svg", "rect");
      rect.setAttribute("x", centerX-objPixelSize*3);
      rect.setAttribute("y", centerY-objPixelSize*2);
      rect.setAttribute("width", objPixelSize*6);
      rect.setAttribute("height", objPixelSize*4);
      rect.setAttribute("fill", obj.color);
      rect.setAttribute("stroke", "#fff");
      svg.appendChild(rect);
      let line = document.createElementNS("http://www.w3.org/2000/svg", "line");
      line.setAttribute("x1", centerX-objPixelSize*2);
      line.setAttribute("y1", centerY);
      line.setAttribute("x2", centerX+objPixelSize*2);
      line.setAttribute("y2", centerY);
      line.setAttribute("stroke", "#fff");
      line.setAttribute("stroke-width", objPixelSize*0.8);
      svg.appendChild(line);
    }
  });
  document.getElementById('zoomval').textContent = Math.round(zoom);
  // Sécurisé : ne pas utiliser hint si non défini
  var hintElem = document.getElementById('hint');
  if (hintElem) hintElem.textContent = "";
}

function startZoomTimer() {
  if (zoomTimer) clearInterval(zoomTimer);
  zoom = 1;
  drawSVG();
  zoomTimer = setInterval(() => {
    if (zoom < zoomMax) {
      zoom = Math.min(zoom * 1.10, zoomMax); // incrémentation de 10%
      drawSVG();
    } else {
      clearInterval(zoomTimer);
    }
  }, zoomInterval);
}

document.getElementById('zoombtn').addEventListener('click', startZoomTimer);

window.addEventListener('DOMContentLoaded', drawSVG);

</script>



## Unités de mesures

Les ordinateurs et leurs composants sont caractérisés par différentes unités de mesure :

### Fréquence (vitesse du processeur)
- *Hertz (Hz)* : unité de fréquence, correspond à un cycle par seconde.
- *Kilohertz (kHz)* : 1 000 Hz.
- *Mégahertz (MHz)* : 1 000 000 Hz (un million de cycles/seconde).
- *Gigahertz (GHz)* : 1 000 000 000 Hz (un milliard de cycles/seconde).

La fréquence d’un processeur (ex : 3,2 GHz) indique combien d’opérations il peut effectuer par seconde.

### Temps
- *Seconde (s)* : unité de base du temps.
- *Milliseconde (ms)* : 1/1 000 de seconde (\(10^{-3}\) s).
- *Microseconde (µs)* : 1/1 000 000 de seconde (\(10^{-6}\) s).
- *Nanoseconde (ns)* : 1/1 000 000 000 de seconde (\(10^{-9}\) s).

Les temps d’accès à la mémoire ou d’exécution d’instructions sont souvent mesurés en nanosecondes ou microsecondes.

### Stockage et mémoire
- *Octet (B)* : unité de base, correspond à 8 bits.
- *Kilooctet (ko)* : 1 000 octets (notation décimale, SI).
- *Mégaoctet (Mo)* : 1 000 000 octets.
- *Gigaoctet (Go)* : 1 000 000 000 octets.
- *Téraoctet (To)* : 1 000 000 000 000 octets.
- *Kibioctet (Kio)* : 1 024 octets (\(2^{10}\)).
- *Mebioctet (Mio)* : 1 048 576 octets (\(2^{20}\)).
- *Gibioctet (Gio)* : 1 073 741 824 octets (\(2^{30}\)).

> *Remarque :* Les systèmes d’exploitation et les fabricants utilisent parfois les préfixes kilo, méga, giga pour désigner soit des puissances de 10 (décimal), soit des puissances de 2 (binaire). Par exemple, 1 Go peut désigner 1 000 000 000 octets (décimal) ou 1 073 741 824 octets (binaire). Les préfixes Kio, Mio, Gio sont utilisés pour lever cette ambiguïté.

Ces unités sont essentielles pour comprendre les performances, la capacité de stockage et la rapidité des ordinateurs modernes.

La vitesse de la lumière dans le vide est d’environ 299 792 458 mètres par seconde (environ 300 000 km/s). C’est la vitesse maximale à laquelle l’information ou l’énergie peut se déplacer dans l’univers selon la physique moderne. La lumière parcourt environ 29,98 centimètres (soit presque 30 cm) en une nanoseconde dans le vide. Autrement dit, en une nanoseconde (1 ns = 10⁻⁹ seconde), la lumière se déplace d’environ 30 cm.


### Binaire

Les ordinateurs fonctionnent en binaire, c’est-à-dire qu’ils ne manipulent que deux états possibles : 0 et 1. Cette représentation repose sur le système de numération binaire, où chaque chiffre (bit) correspond à une puissance de 2. Un bit (binary digit) est l’unité d’information la plus petite : il peut valoir 0 ou 1. 

Un groupe de 8 bits forme un octet (byte), qui permet de représenter 256 valeurs différentes (de 0 à 255). Les ordinateurs stockent et traitent toutes les données (nombres, texte, images, sons) sous forme de suites de bits. Par exemple, le nombre décimal 5 s’écrit 101 en binaire : 

- 1 × 2² + 0 × 2¹ + 1 × 2⁰ = 4 + 0 + 1 = 5

Voici quelques exemples de conversion :

| Décimal | Binaire |
|---------|---------|
| 0       | 0000    |
| 1       | 0001    |
| 2       | 0010    |
| 3       | 0011    |
| 4       | 0100    |
| 5       | 0101    |
| 6       | 0110    |
| 7       | 0111    |
| 8       | 1000    |
| 9       | 1001    |

Chaque bit supplémentaire double le nombre de valeurs possibles. Ainsi, avec n bits, on peut représenter 2ⁿ valeurs différentes.

Utilisez l'application suivante pour explorer la représentation binaire.  Observez comment, par convention, le bit le plus
à gauche est le plus significatif. Que remarquez-vous au sujet des puissances de deux comme 2, 4, 8&nbsp;?

{{< webapp path="eightbits.html" >}}


#### Pourquoi le binaire ?

Le choix du binaire s’explique par la simplicité de la technologie électronique : il est facile de concevoir des circuits qui distinguent deux états (tension présente ou absente, aimantation positive ou négative, etc.). Cela rend les ordinateurs plus fiables et moins sensibles au bruit que s’ils utilisaient plus de deux états.

Les ordinateurs effectuent des opérations logiques (ET, OU, NON, OU exclusif) directement sur les bits. Ces opérations sont à la base de tous les calculs et traitements informatiques.

