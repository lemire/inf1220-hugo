---
title: "GitHub"
weight: 1
---



# GitHub (optionnel)

<a href="https://github.com">GitHub</a> est un site où les programmeurs partagent leur code et travaillent de manière collaborative sur des projets de programmation. Si vous créez un compte et <a href="https://www.youtube.com/watch?v=hPfgekYUKgk">apprenez à utiliser Git</a>, vous pourrez y partager votre code, ou contribuer au code d'autres projets. C'est une excellente manière de développer un portfolio afin d'impressionner les employeurs potentiels. <a href="https://github.com/lemire">Vous  trouverez le professeur responsable du cours sur GitHub</a>. Encore une fois, tout s'y déroule en anglais, mais si vous ne maîtrisez pas l'anglais, vous aurez du mal à faire carrière en informatique.


## Création d’un compte sur github

GitHub, lancé en 2008, est une plateforme qui a révolutionné la collaboration dans le développement logiciel en s’appuyant sur Git, un système de contrôle de version créé par Linus Torvalds en 2005. Pour commencer, la première étape consiste à se créer un compte. Rendez-vous sur le site officiel de GitHub et cliquez sur l'option pour créer un compte. Remplissez les champs requis : une adresse e-mail, un mot de passe et un nom d’utilisateur unique. GitHub vous demandera de vérifier votre adresse e-mail via un code envoyé par courriel. Une fois cette étape complétée, vous pouvez personnaliser votre profil et choisir un plan, gratuit ou payant, selon vos besoins. Historiquement, GitHub a démocratisé l’accès au contrôle de version, rendant les projets open source plus accessibles, comme en témoigne son acquisition par Microsoft en 2018, qui a amplifié son influence.

## Installation et configuration de git

Avant d’utiliser GitHub, il faut installer Git localement. Git, conçu pour gérer les versions du noyau Linux après l’échec de solutions comme BitKeeper, est un outil décentralisé permettant de suivre les modifications dans le code. Téléchargez Git depuis son site officiel ou via un gestionnaire de paquets (par exemple, apt sur Ubuntu ou brew sur macOS). Une fois installé, configurez votre identité avec les commandes git config --global user.name "Votre Nom" et git config --global user.email "votre@email.com". Ces informations lieront vos contributions à votre compte GitHub. 

## Utilisation de git sur windows

Pour les utilisateurs de Windows, Git peut être installé via le programme « [GitHub Desktop](https://desktop.github.com/download/) », disponible sur le site officiel de Git. Ce paquet inclut Git Bash, une interface en ligne de commande simulant un environnement Unix, ainsi qu’une interface graphique optionnelle. Après l’installation, ouvrez Git Bash ou l’invite de commande Windows. Les commandes Git (comme git clone, git add, git commit) fonctionnent de manière identique à celles des autres systèmes. Cependant, prenez garde aux différences dans la gestion des fins de ligne : Windows utilise CRLF, contrairement à LF sur Unix. Pour éviter des problèmes, exécutez git config --global core.autocrlf true afin que Git convertisse automatiquement les fins de ligne lors des commits et checkouts. Historiquement, l’adoption de Git sur Windows a été facilitée par ces outils, rendant le contrôle de version accessible même dans un écosystème traditionnellement moins orienté vers la ligne de commande.

# Création d’un dépôt sur github

Un dépôt, ou « repository », est l’espace où sont stockés les fichiers d’un projet et leur historique. Sur GitHub, cliquez sur « New repository » depuis votre tableau de bord. Donnez un nom au dépôt, choisissez sa visibilité (public ou privé) et, si vous débutez, cochez l’option pour inclure un fichier README. Ce fichier sert souvent de vitrine pour décrire le projet. Historiquement, les dépôts GitHub ont permis de centraliser des projets décentralisés, facilitant la collaboration mondiale. En arrière-plan, GitHub utilise Git pour gérer les versions, mais ajoute une interface graphique et des outils comme les pull requests, qui n’existent pas dans Git seul.

# Clonage et premières modifications locales

Pour travailler sur un projet, commencez par cloner le dépôt sur votre machine avec la commande git clone <URL-du-dépôt>, où l’URL est fournie par GitHub. Cela crée une copie locale du dépôt. Naviguez dans le dossier cloné avec cd <nom-du-dépôt>. Vous pouvez maintenant modifier des fichiers ou en ajouter. Utilisez git add <fichier> pour indiquer les fichiers modifiés à inclure dans le prochain commit, puis git commit -m "Description des changements" pour enregistrer ces modifications. Théoriquement, un commit est un instantané immuable, lié à ses prédécesseurs par des hachages SHA-1, garantissant l’intégrité de l’historique.

# Synchronisation avec github

Pour envoyer vos modifications vers GitHub, utilisez git push origin main, où « main » est la branche principale (parfois appelée « master » dans des projets plus anciens). Si d’autres contributeurs ont modifié le dépôt entre-temps, vous devrez peut-être récupérer leurs changements avec git pull pour résoudre d’éventuels conflits. Historiquement, cette synchronisation a résolu les problèmes de collaboration rencontrés dans les projets des années 1990, où les développeurs s’échangeaient des patchs par e-mail. GitHub, en centralisant les dépôts, a simplifié ce processus tout en préservant la décentralisation inhérente à Git.

# Collaboration via branches et pull requests

Git excelle dans la gestion des branches, permettant à plusieurs développeurs de travailler sur des fonctionnalités distinctes sans interférer. Créez une branche avec git branch <nom-de-la-branche> et passez-y avec git checkout <nom-de-la-branche> (ou combinez les deux avec git checkout -b <nom-de-la-branche>). Une fois vos modifications terminées, poussez la branche vers GitHub (git push origin <nom-de-la-branche>) et ouvrez une pull request sur l’interface de GitHub. Les pull requests, introduites par GitHub, formalisent l’examen et l’intégration des contributions. Théoriquement, les branches sont des pointeurs vers des commits, permettant une exploration parallèle de l’historique sans affecter la branche principale.

# Perspective historique et théorique

Git et GitHub incarnent une évolution majeure dans la gestion de code. Git, né d’une nécessité pratique pour Linux, a introduit un modèle décentralisé robuste, contrastant avec les systèmes centralisés comme SVN. GitHub, en ajoutant une couche sociale et collaborative, a transformé Git en un outil universel, utilisé bien au-delà du développement logiciel, par exemple pour des projets d’écriture ou de données. Théoriquement, Git repose sur des principes de cryptographie (hachages) et de théorie des graphes, garantissant traçabilité et cohérence. Ensemble, ils ont redéfini la collaboration, rendant les contributions transparentes et traçables, comme le montrent des projets emblématiques comme TensorFlow ou Linux.


# Site du manuel


Si ce n'est pas déjà fait, vous pouvez consulter le [code source des exemples du manuel
sur GitHub](https://github.com/RobertGodin/JavaPasAPas). Prenez en connaissance. Pouvez-vous
naviguer dans les fichiers? Pouvez-vous charger le code sur votre machine&nbsp;?

# Exercice pratique

Pour consolider vos connaissances, essayez cet exercice : créez un compte GitHub, configurez Git localement, puis créez un dépôt nommé « mon-premier-projet ». Ajoutez un fichier README.md avec une brève description. Clonez le dépôt, créez une branche appelée « feature », ajoutez un fichier texte avec un court message, commitez et poussez la branche vers GitHub. Enfin, ouvrez une pull request pour fusionner vos changements dans la branche principale. Si vous rencontrez des difficultés, consultez la documentation officielle de GitHub ou les tutoriels disponibles sur leur site.
