---
title: "Gabarit pour les travaux notés 2, 3, 4 et 5"
weight: 78
---


# Gabarit pour les travaux notés 2, 3, 4 et 5

Les travaux notés 3, 4 et 5 comprennent du code que vous devez expliquer. Nous vous demandons de remettre des 
rapports comprenant du code  facile à consulter et bien expliqué. Pour vous aider, nous vous proposons le gabarit suivant.

## MarkDown

Nous vous suggérons de rédiger vos travaux notés avec  MarkDown plutôt qu'avec 
Microsoft Word. Vous
pouvez [copier une version MarkDown de ce gabarit](https://gist.githubusercontent.com/lemire/7300657e883f0a3c14a0ab83dab56bd0/raw/891c011873da4d782c903ed7eb16299b11686388/gabarit.md) dans votre espace de travail.
Nous vous suggérons d'utiliser Visual Studio Code pour convertir votre MarkDown
en PDF.

{{< youtube id="G3RuYho2zDA" >}}




## Travail noté 3 – INF 1220  
**Nom :** *Votre nom*  
**Prénom :** *Votre prénom*  
**Code permanent :** *ABCD12345678*  
**Date de remise :** 12 novembre 2025  

---

### Question #1 

#### Analyse préliminaire  

Expliquez comment vous allez attaquer le problème. Décomposez le problème en sous-problème et analysez chaque sous-problème. 

#### Code source (copiable)

Votre code source doit être aussi simple que possible, et il doit apparaître de façon lisible dans votre document. N'utilisez pas plus de 100 caractères
par ligne et optez pour une police de caractères à taille fixe suffisamment petite pour pouvoir afficher 100 caractères par ligne. La plupart des problèmes du cours peuvent être résolus avec un programme qui peut être présenté sur une seule page. Assurez-vous de bien formatter votre code. Vous pouvez utiliser 
[notre outil de formattage]({{< relref "/docs/format/" >}}) pour mettre en forme votre code.

```java
public class MonProgramme {

    // Méthode privée et statique
    private static boolean estExclu(int n) {
        // Divisible par 3 ?
        if (n % 3 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        long somme = 0;
        for (int i = 1; i <= 10000; i++) {
            if (!estExclu(i)) {
                somme += i;
            }
        }
        System.out.println("Somme finale : " + somme);
    }
}
```

> **Conseil** : Copiez-collez pour vérifier la compilation et l’exécution.



#### Sortie du programme  

Si c'est partinent décrivez la sortie du programme.

```
Somme finale : 25334000
```

#### Description du programme

Décrivez chaque fonction et variable de votre programme. Expliquez comment votre code résoud le problème.


### Question #2

...
