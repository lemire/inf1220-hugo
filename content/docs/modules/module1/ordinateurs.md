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

- **Symboles terminaux** : Éléments de base du langage, comme des mots-clés, des opérateurs ou des caractères (par exemple, `if`, `+`, `1`).
- **Symboles non-terminaux** : Catégories ou abstractions représentant des structures du langage (par exemple, `<expression>`, `<instruction>`).
- **Règles de production** : Définissent comment un symbole non-terminal peut être remplacé par une combinaison de terminaux et/ou non-terminaux, sous la forme `<symbole> ::= définition`.
- **Méta-symboles** : BNF utilise `::=` pour indiquer une définition et `|` pour exprimer des alternatives.

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

Alan Kay a conçu le langage Smalltalk avec son équipe chez Xerox PARC dans les années 1970 pour explorer de nouvelles façons de rendre l’informatique plus accessible, flexible et intuitive. Sa motivation principale était de créer un environnement où les utilisateurs, y compris les enfants, pourraient manipuler des objets graphiques et apprendre à programmer de manière interactive. Il voulait que l’ordinateur devienne un « média personnel », aussi malléable qu’un carnet de notes, permettant l’expérimentation, la simulation et la construction de connaissances.

Smalltalk a été pensé comme un outil pédagogique, inspiré par les idées de Seymour Papert sur l’apprentissage par la manipulation et la découverte. Alan Kay cherchait à démocratiser la programmation et à rendre le logiciel aussi modulaire et réutilisable que les objets du monde réel, d’où l’accent mis sur les objets, les messages et l’interactivité.



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

La programmation orientée objet se diffuse ensuite dans de nombreux langages : C++ (1983) ajoute l’orienté objet au C, Java (1995) en fait un pilier de sa conception, Python, Ruby, C#, et bien d’autres adoptent ou s’inspirent de ces principes. La programmation orientée objet devient le paradigme dominant dans l’industrie logicielle, car on croit qu'elle facilite la modularité, la réutilisation et la maintenance du code.

Aujourd’hui, la programmation orientée objet est enseignée dans la plupart des cursus en informatique et reste au cœur du développement de logiciels complexes, bien qu’elle coexiste avec d’autres paradigmes (fonctionnel, procédural, etc.) dans les langages modernes.

Notre façon de programmer continuer d'évoluer. Aujourd'hui, plusieurs des idées fortes de la méthode orientée objet (comme l'héritage) sont vues comme parfois trop contraignantes. Néanmoins, les langages populaires comme Python, C#, Java, etc. relèvent de l'orienté objet.

## Java

Java a été créé au début des années 1990 par James Gosling et son équipe chez Sun Microsystems. Le projet, initialement nommé « Oak », visait à développer un langage portable pour les appareils électroniques embarqués. En 1995, le langage est officiellement lancé sous le nom de Java, avec la promesse « écrire une fois, exécuter partout » (Write Once, Run Anywhere), grâce à la machine virtuelle Java (JVM) qui permet d’exécuter le même code sur différentes plateformes.



Java connaît un succès rapide, d’abord dans le développement d’applets pour le web, puis dans les applications d’entreprise avec la plateforme Java EE. Au fil des années, Java s’impose comme un standard pour le développement de logiciels robustes, portables et sécurisés, aussi bien côté serveur (applications web, systèmes bancaires, etc.) que côté client (applications de bureau, Android).

Le langage évolue régulièrement : Java 5 introduit les génériques et les annotations, Java 8 apporte les expressions lambda et l’API Stream, Java 9 les modules, et les versions récentes (Java 17, 21…) continuent d’ajouter des fonctionnalités modernes (pattern matching, records, virtual threads…).

En 2010, Oracle rachète Sun Microsystems et devient le principal responsable du développement de Java. Aujourd’hui, Java reste l’un des langages les plus utilisés au monde, soutenu par une vaste communauté et de nombreux outils open source. Il est omniprésent dans l’industrie, l’enseignement, le développement mobile (Android), le cloud et l’Internet des objets.



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


Vidéo (optionnelle)&nbsp;:

{{< youtube id="IT__Nrr3PNI" >}}



*Définition.* La programmation orientée objet est un paradigme de programmation qui organise le code autour d’« objets » représentant des entités du monde réel ou conceptuel. Chaque objet regroupe des données (attributs) et des comportements (méthodes) et interagit avec d’autres objets via des messages ou des appels de méthodes.

## Résumé de l’architecture des ordinateurs et de l’abstraction des langages


Tous ces langages partagent un objectif commun : permettre aux programmeurs de décrire des solutions à des problèmes en s’éloignant progressivement des contraintes du matériel. Pour comprendre leur rôle, il est essentiel de se pencher sur le fonctionnement des ordinateurs.

Les ordinateurs modernes s’appuient sur deux concepts fondamentaux : la machine de Turing, théorisée par Alan Turing, qui définit une machine capable d’exécuter n’importe quel algorithme, et l’architecture de von Neumann, qui structure les ordinateurs autour de quatre composantes principales. Premièrement, la mémoire stocke à la fois les données et les programmes, une innovation clé par rapport aux machines antérieures où les instructions étaient fixes. Deuxièmement, l’unité de contrôle orchestre l’exécution des instructions en suivant un séquençage précis. Troisièmement, l’unité arithmétique et logique effectue les calculs de base, comme les additions ou les comparaisons. Enfin, les interfaces d’entrée/sortie permettent d’interagir avec l’utilisateur ou d’autres systèmes, via des périphériques comme les claviers, écrans ou réseaux.

Dans un langage plus accessible, un ordinateur contemporain se compose de processeurs (CPU), de mémoire vive (RAM) pour les calculs temporaires, de stockage à long terme (disques durs ou SSD), de processeurs graphiques (GPU) pour le rendu visuel, et de cartes d’entrée/sortie pour la connectivité. La carte mère agit comme un chef d’orchestre, coordonnant les échanges entre ces éléments. Par exemple, lorsqu’un programme s’exécute, le CPU lit les instructions depuis la RAM, effectue les calculs nécessaires, et envoie les résultats vers la mémoire ou un périphérique de sortie, comme un écran.

Les processeurs se déclinent en plusieurs architectures. Dans les ordinateurs personnels, les puces x64 (ou x86-64), produites par Intel et AMD, dominent grâce à leur puissance et leur compatibilité. Dans les appareils mobiles, comme les smartphones, les processeurs ARM, plus économes en énergie, sont privilégiés. La mémoire vive repose sur la technologie DRAM, rapide mais volatile, tandis que le stockage à long terme utilise majoritairement la mémoire flash, comme dans les SSD, pour sa rapidité et sa fiabilité.

Les langages de programmation jouent un rôle crucial en traduisant des instructions humaines en commandes compréhensibles par ces composants matériels. Leur niveau d’abstraction varie : les langages de bas niveau, comme l’assembleur, sont proches du matériel et offrent un contrôle précis mais exigent une expertise technique. À l’opposé, les langages de haut niveau, comme Python ou Java, simplifient le développement en masquant les détails matériels, ce qui les rend plus accessibles et adaptés à des applications complexes, comme le développement web ou l’intelligence artificielle.

Dans ce cours, nous explorerons le langage Java, largement adopté dans l’industrie pour sa portabilité, sa robustesse et sa polyvalence. Utilisé dans des domaines variés, des applications mobiles Android aux systèmes d’entreprise, Java illustre parfaitement comment un langage de haut niveau peut répondre à des besoins modernes tout en s’appuyant sur les principes fondamentaux de l’informatique.

## Unités de mesures

Les ordinateurs et leurs composants sont caractérisés par différentes unités de mesure :

### Fréquence (vitesse du processeur)
- **Hertz (Hz)** : unité de fréquence, correspond à un cycle par seconde.
- **Kilohertz (kHz)** : 1 000 Hz.
- **Mégahertz (MHz)** : 1 000 000 Hz (un million de cycles/seconde).
- **Gigahertz (GHz)** : 1 000 000 000 Hz (un milliard de cycles/seconde).

La fréquence d’un processeur (ex : 3,2 GHz) indique combien d’opérations il peut effectuer par seconde.

### Temps
- **Seconde (s)** : unité de base du temps.
- **Milliseconde (ms)** : 1/1 000 de seconde (\(10^{-3}\) s).
- **Microseconde (µs)** : 1/1 000 000 de seconde (\(10^{-6}\) s).
- **Nanoseconde (ns)** : 1/1 000 000 000 de seconde (\(10^{-9}\) s).

Les temps d’accès à la mémoire ou d’exécution d’instructions sont souvent mesurés en nanosecondes ou microsecondes.

### Stockage et mémoire
- **Octet (B)** : unité de base, correspond à 8 bits.
- **Kilooctet (ko)** : 1 000 octets (notation décimale, SI).
- **Mégaoctet (Mo)** : 1 000 000 octets.
- **Gigaoctet (Go)** : 1 000 000 000 octets.
- **Téraoctet (To)** : 1 000 000 000 000 octets.

#### Préfixes binaires (norme IEC)
- **Kibioctet (Kio)** : 1 024 octets (\(2^{10}\)).
- **Mebioctet (Mio)** : 1 048 576 octets (\(2^{20}\)).
- **Gibioctet (Gio)** : 1 073 741 824 octets (\(2^{30}\)).

> **Remarque :** Les systèmes d’exploitation et les fabricants utilisent parfois les préfixes kilo, méga, giga pour désigner soit des puissances de 10 (décimal), soit des puissances de 2 (binaire). Par exemple, 1 Go peut désigner 1 000 000 000 octets (décimal) ou 1 073 741 824 octets (binaire). Les préfixes Kio, Mio, Gio sont utilisés pour lever cette ambiguïté.

Ces unités sont essentielles pour comprendre les performances, la capacité de stockage et la rapidité des ordinateurs modernes.

La vitesse de la lumière dans le vide est d’environ 299 792 458 mètres par seconde (environ 300 000 km/s). C’est la vitesse maximale à laquelle l’information ou l’énergie peut se déplacer dans l’univers selon la physique moderne. La lumière parcourt environ 29,98 centimètres (soit presque 30 cm) en une nanoseconde dans le vide. Autrement dit, en une nanoseconde (1 ns = 10⁻⁹ seconde), la lumière se déplace d’environ 30 cm.