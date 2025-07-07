---
title: "Exemple : modèle de langue"
weight: 92
---

# Exemple : modèle de langue


{{% hint info %}}

Ce exemple est une application des notions du module. Il s'agit de matériel optionnel.

{{% /hint %}}

Pour illustrer l'utilisation des tableaux, considérons l'exemple suivant. Le code implémente un modèle de langue simple en Java qui calcule les probabilités de transition entre caractères ASCII dans une chaîne donnée, puis génère une séquence de 100 caractères à partir d'un caractère initial. Il utilise un tableau à deux dimensions double[][] transitions de taille 128x128 pour stocker les probabilités qu’un caractère ASCII (0-127) soit suivi d’un autre. Dans calculerTransitions, le programme compte les occurrences des paires de caractères consécutifs dans le texte d’entrée et normalise ces comptes pour obtenir des probabilités, stockées dans transitions[i][j], où i est le caractère courant et j le suivant. Lors de la génération dans genererCaractereSuivant, ce tableau est utilisé pour sélectionner aléatoirement le caractère suivant en fonction des probabilités associées au caractère courant. Cette application des tableaux à deux dimensions permet de modéliser efficacement les relations entre caractères, chaque cellule représentant une probabilité de transition, et facilite la génération de texte en s’appuyant sur une structure matricielle claire et organisée.

Le résultat est loin de pouvoir entre en compétition contre ChatGPT. Pourtant, le principe de base est le même. Vous pouvez tester le programme
suivant qui génère du texte qui est quasiment du français. Testez-le plusieur fois.

{{<inlineJava path="ModeleLangue.java" lang="java">}}

import java.util.Random;

public class ModeleLangue {
    private static final int ASCII_SIZE = 128; // Taille de la table ASCII (0-127)
    private double[][] transitions; // Matrice des probabilités de transition
    private Random random;

    // Constructeur qui calcule les probabilités de transition à partir d'une chaîne
    public ModeleLangue(String texte) {
        transitions = new double[ASCII_SIZE][ASCII_SIZE];
        random = new Random();
        calculerTransitions(texte);
    }

    // Calcule les probabilités de transition
    private void calculerTransitions(String texte) {
        // Compter les transitions
        int[][] compte = new int[ASCII_SIZE][ASCII_SIZE];
        int[] totalParCaractere = new int[ASCII_SIZE];

        // Parcourir la chaîne pour compter les transitions
        for (int i = 0; i < texte.length() - 1; i++) {
            char courant = texte.charAt(i);
            char suivant = texte.charAt(i + 1);
            // Vérifier que les caractères sont dans la plage ASCII
            if (courant < ASCII_SIZE && suivant < ASCII_SIZE) {
                compte[courant][suivant]++;
                totalParCaractere[courant]++;
            }
        }

        // Calculer les probabilités
        for (int i = 0; i < ASCII_SIZE; i++) {
            if (totalParCaractere[i] > 0) {
                for (int j = 0; j < ASCII_SIZE; j++) {
                    transitions[i][j] = (double) compte[i][j] / totalParCaractere[i];
                }
            }
        }
    }

    // Génère un caractère suivant basé sur les probabilités
    private char genererCaractereSuivant(char courant) {
        if (courant >= ASCII_SIZE) {
            return (char) random.nextInt(ASCII_SIZE); // Caractère hors plage
        }

        double somme = 0.0;
        for (double prob : transitions[courant]) {
            somme += prob;
        }

        // Si aucune transition n'existe, choisir un caractère aléatoire
        if (somme == 0.0) {
            return (char) random.nextInt(ASCII_SIZE);
        }

        // Sélection aléatoire basée sur les probabilités
        double r = random.nextDouble();
        double cumul = 0.0;
        for (int i = 0; i < ASCII_SIZE; i++) {
            cumul += transitions[courant][i];
            if (r <= cumul) {
                return (char) i;
            }
        }
        // En cas d'erreur (arrondi), retourner le dernier caractère possible
        return (char) (ASCII_SIZE - 1);
    }

    // Génère une séquence de longueur donnée à partir d'un caractère initial
    public String genererSequence(char debut, int longueur) {
        StringBuilder sequence = new StringBuilder();
        sequence.append(debut);
        char courant = debut;

        for (int i = 0; i < longueur - 1; i++) {
            courant = genererCaractereSuivant(courant);
            sequence.append(courant);
        }

        return sequence.toString();
    }

    public static void main(String[] args) {
        // Exemple de texte d'entraînement
        String texte = "bonjour le monde c'est un test simple pour modeller une langue en java";
        ModeleLangue modele = new ModeleLangue(texte);
        
        // Générer une séquence de 100 caractères à partir du caractère 'b'
        String sequence = modele.genererSequence('b', 100);
        System.out.println("Séquence générée : " + sequence);
    }
}
{{</inlineJava>}}

La méthode `calculerTransitions` joue un rôle central en analysant une chaîne de texte fournie pour construire une matrice de probabilités de transition entre caractères ASCII. Elle parcourt la chaîne caractère par caractère, en comptant les occurrences des paires consécutives (par exemple, combien de fois 'a' est suivi de 'b') dans un tableau temporaire `compte`. Ces comptes sont ensuite normalisés par le nombre total de transitions sortantes pour chaque caractère, produisant une matrice `transitions` où chaque cellule `[i][j]` indique la probabilité que le caractère `i` soit suivi du caractère `j`. Cette approche permet de capturer les motifs locaux dans le texte d’entrée, rendant le modèle capable de reproduire des séquences qui reflètent les caractéristiques statistiques du texte initial.

La méthode `genererCaractereSuivant` utilise la matrice de probabilités pour sélectionner le caractère suivant dans une séquence. À partir d’un caractère donné, elle examine les probabilités de transition associées dans la ligne correspondante de la matrice `transitions`. Une valeur aléatoire est générée pour choisir un caractère suivant selon une distribution pondérée par ces probabilités, via une technique de sélection par cumul. Si aucune transition n’est possible (par exemple, si le caractère n’a jamais été suivi dans le texte d’entraînement), un caractère aléatoire est retourné. Cette méthode illustre une application pratique des probabilités dans la génération de texte, où la structure matricielle permet un accès rapide et efficace aux données nécessaires pour simuler une chaîne de Markov.

Enfin, la méthode `genererSequence` orchestre la génération d’une séquence complète en appelant itérativement `genererCaractereSuivant`. Partant d’un caractère initial, elle construit une chaîne de la longueur souhaitée en ajoutant un caractère à la fois. Dans l’exemple du `main`, un texte d’entraînement est fourni, et une séquence de 100 caractères est générée à partir du caractère 'b'. Le modèle, bien que simple, démontre comment une structure de données comme un tableau à deux dimensions peut être utilisée pour modéliser des relations complexes, ici les transitions entre caractères, et produire des résultats qui imitent partiellement la structure du texte d’origine. Cette approche est une base pour des modèles de langage plus avancés, où des structures similaires sont étendues à des contextes plus larges, comme des mots ou des phrases.

Formellement, nous définissons une chaîne de Markov. Une chaîne de Markov est un modèle probabiliste utilisé pour décrire une séquence d'événements où la probabilité d'un état futur dépend uniquement de l'état actuel, et non des états précédents. Formellement, pour une séquence d'états \( X_1, X_2, \ldots, X_n \), une chaîne de Markov satisfait la propriété de Markov : \( P(X_{n+1} = j | X_n = i, X_{n-1}, \ldots, X_1) = P(X_{n+1} = j | X_n = i) \). 
