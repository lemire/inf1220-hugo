---
title: "Présentation du pseudocode"
weight: 9
---


# Guide pour présenter du pseudocode

Adoptez un style simple. Testez la lisibilité de votre pseudocode en le lisant à haute voix.

Voici un exemple de pseudocode difficile à comprendre.

```
entrée : un nombre
si mon nombre nombre > 0 alors "positif"
     autrement
    afficher "négatif ou zéro"
fin du code
```



Voici un bon exemple.

```
entrée : nombre
si nombre > 0 alors
    afficher "positif"
sinon
    afficher "négatif ou zéro"
fin si
```

## Indentation

L'indentation est utile pour montrer la structure hiérarchique (boucles, conditions, blocs). Utilisez systématiquement 2 à 4 espaces par niveau, vous pouvez aussi utiliser des tabulations. Ne mélangez pas espaces et tabulations.
 Indentez chaque bloc intérieur d'un niveau supplémentaire. Alignez les instructions de fin de bloc (comme "fin si" ou "fin pour") avec le début du bloc. Conservez une indentation cohérente dans tout le document.

```
pour i de 1 à 10 faire
    si i mod 2 = 0 alors
        afficher i + " est pair"
    fin si
fin pour
```

## Terminologie

Employez des termes en français ou en anglais courants, mais ne mélangez pas les langues. Utilisez des mots-clés simples et clairs&nbsp;:

- entrée, sortie
- si ... alors ... sinon ... fin si
- pour ... faire ... fin pour
- tant que ... faire ... fin tant que
- fonction ... retour ... fin fonction

Évitez les abréviations obscures.

## Commentaires

Insérez des commentaires avec un préfixe comme "//" ou "#" pour expliquer les parties complexes. Numérotez les lignes seulement pour des algorithmes longs ou des références.

Exemple :
```
fonction factorielle(n)  // Calcule n!
    si n <= 1 alors
        retour 1
    sinon
        retour n * factorielle(n-1)
    fin si
fin fonction
```

## Typographie

Utilisez une police à espacement fixe (comme Courier) dans les documents. Évitez les lignes trop longues. Séparez les sections logiques par des lignes vides.

```
entrée : nombre
si nombre > 0 alors
    afficher "positif"
sinon
    afficher "négatif ou zéro"
fin si

si nombre > 10 alors
    afficher "nombre plus grand que dix"
fin si
```
