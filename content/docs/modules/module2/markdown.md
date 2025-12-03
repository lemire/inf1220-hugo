---
title: "MarkDown"
weight: 76
---


# MarkDown

Les traitements de texte comme Microsoft Word ne sont pas destinés à l'écriture
technique avec du code informatique. Il est préférable d'utiliser une approche
telle que Markdown pour la rédaction technique.

Markdown est un langage de balisage léger conçu pour formater du texte de manière simple et lisible, tout en permettant une conversion facile vers du HTML. Il a été créé en 2004 par John Gruber, avec l’aide d’Aaron Swartz, dans le but de rendre l’écriture de documents structurés accessible à tous, sans complexité technique.
John Gruber, blogueur et développeur américain, a développé Markdown pour répondre au besoin d’un format de texte qui soit à la fois facile à lire en brut et simple à convertir en HTML pour le web. Aaron Swartz, programmeur et militant de l’Internet, a contribué à l’implémentation du premier convertisseur Markdown. Le nom *Markdown* évoque l’idée de « réduire » (mark down) la complexité du balisage traditionnel.


Markdown est largement utilisé pour la documentation, les fichiers README, les blogs, et de nombreux outils collaboratifs (GitHub, GitLab, forums, etc.). Sa simplicité et sa portabilité en font un standard de facto pour la rédaction technique et pédagogique.

Parmi les éléments fondamentaux de Markdown figurent les titres, qui organisent le contenu en hiérarchie. Pour créer un titre, il suffit de placer un ou plusieurs symboles dièse (#) au début d'une ligne, suivis d'un espace et du texte du titre. Un seul # produit un titre de niveau 1, le plus important, tandis que six # correspondent au niveau le plus bas. Cette méthode évite les balises fermantes et assure une lisibilité immédiate dans le texte source.

Les listes constituent un autre pilier de Markdown, permettant de présenter des informations de façon ordonnée ou non. Pour une liste à puces, on utilise des tirets (-), des astérisques (*) ou des plus (+) en début de ligne, suivis d'un espace. Les listes numérotées s'obtiennent en commençant par un chiffre suivi d'un point et d'un espace, comme 1. ou 2., et Markdown gère automatiquement la numérotation même si les chiffres saisis ne sont pas consécutifs. Les sous-listes s'emboîtent simplement en ajoutant une indentation de deux espaces ou plus.

<p>Markdown excelle également dans l'insertion de liens et d'images, rendant les documents interactifs et visuels. Un lien s'écrit sous la forme [texte affiché](URL), où le texte entre crochets apparaît cliquable et mène à l'adresse indiquée. Pour les images, la syntaxe est similaire mais précédée d'un point d'exclamation : ![texte alternatif](URL de l'image), le texte alternatif servant de description en cas d'échec de chargement ou pour l'accessibilité.</p>

<p>La mise en emphase du texte est gérée avec des symboles doubles ou simples pour le gras et l'italique. Entourer un mot ou une phrase de deux astérisques (**) ou de deux tirets bas (__) produit du texte en gras, tandis qu'un seul astérisque (*) ou tiret bas (_) génère de l'italique. Ces conventions évitent les conflits avec la ponctuation naturelle et permettent une combinaison, comme ***gras italique***.</p>

<p>Les citations en bloc ajoutent une dimension narrative ou référentielle, en préfixant les lignes avec un chevron (> ) suivi d'un espace. Cela indente le texte et le distingue visuellement, idéal pour les extraits, les témoignages ou les références. Des citations imbriquées sont possibles en ajoutant des chevrons supplémentaires.</p>

Pour insérer du code dans un document MarkDown, une convention
répandue est de débuter un bloc de code par trois guillemets inversés
(un accent grave) suivi du nom du langage de programmation (`java`).
Le bloc se termine avec trois guillemets inversés. Considérez cet exemple.

<pre>
## Introduction à Java (exemple)

Nous pouvous définir une variable en Java ainsi.

```java
int x = 1;
```

Notez les différents éléments de la syntaxe.

- Type
- Nom de variable
- Assignation d'une valeur

</pre>


En résumé, voici la syntaxe MarkDown.
- *Titres :* Utilisation du symbole `#` (un ou plusieurs) en début de ligne.
- *Listes :* Listes à puces avec `-`, `*` ou `+`, listes numérotées avec des chiffres suivis d’un point.
- *Liens :* `[texte du lien](URL)`
- *Images :* `![texte alternatif](URL)`
- *Texte en gras :* `**gras**` ou `__gras__`
- *Texte en italique :* `*italique*` ou `_italique_`
- *Citations :* `> citation`

Le MarkDown s'utilise à différentes fins. Vous pouvez créez un document MarkDown
avec l'extension `.md` comme dans `README.md`.


Testez votre compréhension du MarkDown avec l'outil suivant.

{{<webapp path="markdown.html">}}


## MarkDown en Java

Avec les versions récentes de Java, vous pouvez utiliser MarkDown pour les 
commentaires, comme dans cet exemple&nbsp;:

```java {style=github}
/**
 * # Exemple
 *
 * Ceci est un commentaire en  *Markdown*.
 *
 * - Partie 1
 * - Partie 2
 * 
 * [Ceci est un lien](http://www.exemple.com/)
 */
public class Example {
    // Class implementation
}
```


## Conversion de MarkDown en PDF

Vous pouvez convertir un fichier MarkDown en PDF à l'aide d'un plugin Visual Studio Code comme MarkDown PDF.

{{< youtube id="G3RuYho2zDA" >}}

Vous pouvez aussi utiliser les éditeurs MarkDown suivants qui vous permettent d'exporter
votre MarkDown en PDF.

- [marktext](https://marktext.me)
- [Typora](https://typora.io)
- [iA Writer](https://ia.net/writer)