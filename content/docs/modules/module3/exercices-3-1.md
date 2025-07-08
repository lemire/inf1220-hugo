---
title: "Exercices sur les structures de contrôle, les structures de données, les structures itératives"
weight: 60
---

# Exercices sur les structures de contrôle, les structures de données, les structures itératives

## Questions/Réponses

Veuillez répondre mentalement, sur papier ou bien en créant le code nécessaire pour répondre à ces questions avant de regarder la réponse.
Certaines questions sont difficiles, et il est normal de ne pas toutes les réussir.

{{% hint info %}}

N'oubliez pas d'utiliser notre [pense-bête Java]({{< ref "/docs/pensebete" >}}) au besoin. Pour les mathématiques, 
vous pouvez faire référence à notre rappel sur [les principales notions mathématiques]({{< ref "/docs/extra/math" >}}) du cours.

{{% /hint %}}

<p>Quand on vous demande de produire du code, vous devez le tester. C'est une erreur commune chez les étudiants: ils produisent rapidement du code en supposant qu'il est fonctionnel. Prenez le temps de vous relire, d'être attentif. Et testez votre code. Encore et encore.</p>

<p>Prenez note qu'<a href="https://rc-inf1220.teluq.ca/">il est permis d'utiliser le robot conversationnel du cours lors des exercises</a>. Cependant vous devriez vous entraîner à produire vos propres réponses.</p>


{{% hint info %}}

## Réponses uniques ?

<p>Les exercices comportent une solution vous permettant de comparer votre approche avec la nôtre. Il n'y a pas de solution unique aux problèmes en général. Vous pouvez arriver avec une solution qui est préférable ou moins bonne que celle que nous offrons. Pour faire ces questions, vous devez avoir fait toutes les lectures préalables. Vous disposez alors toujours des fondements nécessaires pour faire les exercices. Nous vous encourageons tout de même à faire vos propres recherches en complément de vos lectures. Dans certains cas, au sein de la solution que nous offrons, nous pouvons utiliser des notions techniques qui n'ont pas été vues directement dans le cours, mais qui devraient vous être facilement accessibles.</p>
{{% /hint %}}


## Question 1

<p>Si x == true et que l'on utilise le code suivant, quel sera la sortie en ligne de commande?</p>

```java  {style=github}
if(x != true && x == true) {
    System.out.println("AAA");
} else {
    System.out.println("BBB");
}
```

<details><summary>Réponse</summary>
<p>Le résultat affiché sera BBB, car x != true donnera Faux et x == true donnera Vrai. Par définition, Faux ET Vrai = FAUX</p>
</details>

## Question 2

<p>Le code suivant contient 5 erreurs, veuillez les identifier :</p>

```java  {style=github}
int x = 5;

if((x > 1) && (x =< 10) {
     x = "5";
} if (x !!= 5) {
     x = 100;
} 
```

<details><summary>Réponse</summary>
<p>Voici les erreurs :</p>
<ul>
	<li>l'opérateur =< n'existe pas, c'est plutôt <=</li>
	<li>il manque une parenthèse ")" à la première ligne if (avant le })</li>
	<li>on ne peut assigner une String à un int</li>
	<li>en supposant que l'indentation est correcte, il manque le else pour } else if (</li>
	<li>l'opérateur !!= n'existe pas, c'est plutôt !=</li>
</ul>

```java  {style=github}
int x = 5;

if((x > 1) && (x <= 10)) {
     x = 5;
} else if (x != 5) {
     x = 100;
} 
```

</details>

## Question 3

<p>Quelle est la différence entre une boucle while et une boucle do-while?</p>

<details><summary>Réponse</summary>
<p>Le contrôle se fait au départ dans la boucle while alors que le contrôle se fait à la fin dans le do-while. Dans la boucle while, il y a donc un contrôle avant même de faire la première itération.</p>
</details>

## Question 4

<p>Quelle sera la sortie d'affichage de ce block switch-case et pourquoi?</p>

```java  {style=github}
int index = 10;
switch (index) {
        case 1:
            System.out.println(11);
            break;
        case 2:
            System.out.println(22);
            break;
        case 3:
            System.out.println(33);
            break;
        default:
            System.out.println("Default");
            break;
}
```

<details><summary>Réponse</summary>
<p>La sortie sera "Default", car la valeur de la variable index = 10 ne correspond à aucun des cas du switch. C'est donc le sous-bloc "Default" qui est exécuté.</p>
</details>

## Question 5

<p>Vrai ou faux: un tableau de type int[10] occupera 40 octets en mémoire parce qu'il y a 10 entiers (int) et que chaque entier occupe 4 octets (32 bits).</p>

<details><summary>Réponse</summary>
<p>Faux. Il est vrai qu'il y a 10 entiers (int) et que chaque entier occupe 4 octets. Cependant, Java doit aussi garder une trace de la longueur du tableau (10 éléments). Il y a aussi d'autres contraintes. Il serait plus juste de dire que le tableau va utiliser plus de 40 octets. </p>
</details>

## Question 6

<p>Supposons que dans un code, nous avons créé un tableau d'une dimension de 10 éléments (int[] tableau = new int[10]) et que nous accédons, suite à son instanciation, au 20e élément du tableau ( int x = tableau[20]), qu'adviendra-t-il?</p>

<details><summary>Réponse</summary>
<p>À l'exécution l'opération int x = tableau[20] va générer une erreur du type : java.lang.ArrayIndexOutOfBoundsException: 20, car nous tentons d'accéder à des index du tableau qui n'existe pas.</p>
</details>

## Question 7

<p>Est-ce possible de créer une structure de données de type ArrayList d'entier en utilisant la déclaration suivante : ArrayList<int> = new ArrayList<int>(); ?</p>

<details><summary>Réponse</summary>
<p>Le Java est un langage OO et même si le Java intègre des types de base (int, float, etc.) qui ne sont pas des objets.  L'objet ArrayList ne peut que contenir des objets. Il faut donc utiliser plutôt : ArrayList<Integer> = new ArrayList<Integer>(); où l'objet Integer est la version objet de int. Dans les dernières versions de Java, une mécanique de conversion automatique permet d'assigner des types à leur objet équivalent. Par exemple : Integer i = 5; ou bien :</p>

```java  {style=github}
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(5);
```

</details>

## Question 8

<p>Votre employeur vous demande créer une fonction en Java qui vous permettra de trouver dans un tableau à deux dimensions, un couple {clé,valeur}. Pour démarrer, vous avez le code suivant, veuillez créer une fonction trouver qui reçoit en paramètre la clé et retourne la valeur :</p>

```java  {style=github}
public class Dictionnaire {
    
    int[][] tableau2D = {{5,3},{2,5},{4,3},{8,10},{105,32},{55,34},{12,21},
        {15,51},{44,1},{6,3},{19,3},{65,13},{1235,1353},{51515,32143},
        {15155,3555}};
    
    public static void main(String[] args) {
        
        Dictionnaire dict = new Dictionnaire();              
        
        //Trouver la valeur associée à la clé
        //System.out.println("Valeur =" + dict.trouver(12));
    }
    
}
```

<details><summary>Réponse</summary>
<p>Voici le code</p>

```java  {style=github}
public class Dictionnaire {
    
    int[][] tableau2D = {{5,3},{2,5},{4,3},{8,10},{105,32},{55,34},{12,21},
        {15,51},{4,1},{6,3},{19,3},{65,13},{1235,1353},{51515,32143},
        {15155,3555}};
    
    /**
     * Fonction permettant de trouver une valeur à partir d'une clé
     * @param clef
     * @return valeur
     */
    int trouver(int clef) {
        // Initialiation de la variable valeur. Si la clef n'est pas trouvé alors on retourne -1.
        int valeur = -1;
        // Itération dans le tableau pour trouver le bon
        for(int i = 0; i < tableau2D.length; i++) {
            // Vérification de la cle avec l'index courant;
            if (tableau2D[i][0] == clef) {
                // Si oui, arrêter l'exécution et retourner la valeur.
                return tableau2D[i][1];
                // ou valeur = tableau2D[i][1]; break;
            }
        }
        return valeur;
    }
    
    public static void main(String[] args) {
        
        Dictionnaire dict = new Dictionnaire();              
        
        //Trouver la valeur associée à la clé
        System.out.println("Valeur =" + dict.trouver(12));
    }
    
}
```

</details>

## Question 9

<p>Montrer comment on peut trier un tableau d'entiers en Java.</p>

<details><summary>Réponse</summary>
<p>Le plus simple est d'utiliser la méthode Arrays.sort.</p>

```java  {style=github}
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    int[] tableauTest = {4, 6, 9, 1, 2, 76, 222, 5, 22};
    Arrays.sort(tableauTest);
    for (int i : tableauTest) {
      System.out.print(i + " ");
    } 
    System.out.println(); 
  }
}
```

</details>

## Question 10

<p>Veuillez créer une fonction, recevant un ArrayList en entrée, et qui retourne une nouvelle ArrayList avec les éléments inversés, i.e. le premier élément à la fin, le dernier élément en premier et ainsi de suite.  </p>

<details><summary>Réponse</summary>
<p>Voici une solution possible. Elle est grossièrement inefficace sur le plus du temps de calcul: vous pouvez sans doute faire mieux.</p>

```java  {style=github}
import java.util.ArrayList;

public class ArrayListUtils {
    
    public static ArrayList inverser(ArrayList liste) {
        
        ArrayList inverse = new ArrayList();
        
        for(Object o : liste) {
            
            inverse.add(0, o);
        }
        
        return inverse;
    }
    
    public static void main(String[] args) {
        
        ArrayList<String> test = new ArrayList<String>();
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.add("5");
        
        ArrayList<String> testInverse = ArrayListUtils.inverser(test);
        
        for(String s : testInverse) {
            
            System.out.print(s + " ");
        }
    }
    
}
```

<p>Voici une autre solution (n'oubliez pas 'import java.util.Collections').</p>

```java  {style=github}
ArrayList<String> test = new ArrayList<String>();
test.add("1");
test.add("2");
test.add("3");
test.add("4");
test.add("5");

Collections.reverse(test);
for(String s : test) {
    System.out.print(s + " ");
}
```

</details>

## Question 11

<p>Vous devez créer une méthode supplémentaire au code de la Question #10, permettant de fusionner deux ArrayList ensemble. Cette méthode prend deux ArrayLists en paramètre et retourne le nouvel ArrayList fusionné.</p>

<details><summary>Réponse</summary>
<p>La méthode addAll de la classe ArrayList permet de rapidement faire cette fusion :</p>

```java  {style=github}
import java.util.ArrayList;

public class ArrayListUtils {
    
    public static ArrayList inverser(ArrayList liste) {
        
        ArrayList inverse = new ArrayList();
        
        for(Object o : liste) {
            
            inverse.add(0, o);
        }
        
        return inverse;
    }
    
    public static ArrayList fusion(ArrayList a, ArrayList b) {
        
        // Permet de cloner la structure. Nécessite un cast
        ArrayList liste = (ArrayList) a.clone();
        
        // Ajouter l'ArrayList b à la fin de liste
        liste.addAll(b);
        
        return liste;
    }
    
    public static void main(String[] args) {
        
        ArrayList<String> test = new ArrayList<String>();
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.add("5");
        
        ArrayList<String> listFusion = ArrayListUtils.fusion(test, test);
        
        for(String s : listFusion) {
            
            System.out.print(s + " ");
        }
    }
    
}
```

</details>

## Question 12

<p>Veuillez écrire le code (classe et méthode(s)) permettant de faire afficher le texte suivant à la console. Vous ne pouvez utiliser qu'une seule fois la méthode System.out.println.</p>

<p>
###?###?###?###?###?###?###?###<br/>
???#???#???#???#???#???#???#???<br/>
??###?###?###?###?###?###?###??<br/>
?????#???#???#???#???#???#?????<br/>
????###?###?###?###?###?###????<br/>
???????#???#???#???#???#???????<br/>
??????###?###?###?###?###??????<br/>
?????????#???#???#???#?????????<br/>
????????###?###?###?###????????<br/>
???????????#???#???#???#???????<br/>
??????????###?###?###??????????<br/>
?????????????#???#?????????????<br/>
????????????###?###????????????<br/>
???????????????#???????????????<br/>
??????????????###??????????????<br/>
</p>

<details><summary>Réponse</summary>

```java  {style=github}
import java.util.ArrayList;
// solution par Francis Beauchemin-Côté 
public class Main {
	public static String trioMotif(String caractere1, String caractere2, int nombreCaractere1) {
		String motif = "";
		for (int i = 1; i <= nombreCaractere1; i++) { // On veut mettre le nombre de trio demandé.
			motif += caractere1 + caractere1 + caractere1; // Le premier argument est un String pour ne pas faire la somme en
			// int (si un char avait été utilisé). Donc + est une
			// concaténation.
			if (i != nombreCaractere1) { // On n’ajoute pas de motif de séparation après le dernier trio.
				motif += caractere2; // Comme motif est un String, la somme avec un char devient en fait une
				// concaténation. On utilise ici un String dans le but d'uniformiser et
				// simplifier l'utilisation.
			}
		}
		return motif;
	}

	public static String nbInter(String carac, int nombreInterrogation) { // Crée le String entourant
		// les motifs de trio.
		String chaine = "";
		for (int i = 1; i <= nombreInterrogation; i++) {
			chaine += carac;
		}
		return chaine;
	}

	public static void pyramide(String premierChar, String deuxiemeChar, int nombreDeLignes) {
		ArrayList < String > texte = new ArrayList < String > (); // Notre texte sera un vecteur de String.
		for (int i = 0; i < (nombreDeLignes + 1) / 2; i++) { // Comme c'est une division entière, la division ne prend que
			// le quotient entier.
			texte.add(nbInter(deuxiemeChar, 2 * i) + trioMotif(premierChar, deuxiemeChar, (nombreDeLignes + 1) / 2 - i) + nbInter(deuxiemeChar, 2 * i));
			texte.add(nbInter(deuxiemeChar, 2 * i) + trioMotif(deuxiemeChar, premierChar, (nombreDeLignes + 1) / 2 - i) + nbInter(deuxiemeChar, 2 * i));
		} // On imprime deux lignes à la fois! On ajuste le nombreDeLignes par + 1. Il y a
		// un nombre pair de motifs qui entourent les motifs avec les trios
		if (nombreDeLignes % 2 == 1) { // Comme on imprime un nombre pair de lignes, il faut retirer
			// la dernière dans le cas où le nombre de lignes est impair.
			texte.remove(nombreDeLignes); // Le rang du n+1 ième élément est n.
		}
		for (String e: texte) { // Affiche le texte à l'écran ligne par ligne.
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		pyramide("#", "?", 100);
	}
}
```

</details>

## Question 13

<p>Écrivez un programme efficace Java qui prend la chaîne de caractère «&nbsp;124213&nbsp;» et en extrait les nombres 1, 2, 4, 2, 1, 3.</p>

<details><summary>Réponse</summary>

```java  {style=github}
class Exemple {
  public static int[] extrait(String s) {
    int[] answer = new int[s.length()];
    for(int index = 0; index < s.length(); index++) {
      answer[index] = Character.digit(s.charAt(index), 10);
    }
    return answer;
  }

  public static void main(String[] args) {
    for(int x: extrait("124213")) {
      System.out.println(x);
    }
  }
}
```

</details>

## Question 14

<p>Qu’est-ce qui s’affiche à l’exécution du bout de code suivant :</p>

```java  {style=github}
public class Main {
  public static void main(String args[]) {
    if (true)
    if (false)
    if (true)         
        System.out.println("avant le premier else");
    else              
        System.out.println("après le premier else");
    if (true)         
        System.out.println("avant le second else");
    else              
        System.out.println("après le second else");
 }
}
```

<p>Expliquer pourquoi.</p>

<details><summary>Réponse</summary>
<p>Le code affiche «&nbsp;avant le second else&nbsp;».</p>
<p>En effet le second if est évalué à false, et toute l’instruction qui suit (y compris l’évaluation du else qui se rapporte au if de cette instruction) n’est pas exécutée ; l’instruction suivante c’est le tout dernier if, qui est évalué à true, et donc le else qui s’y rapporte n’est pas évalué.</p>
</details>

## Question 15

<p>Soit les deux bouts de code suivants :</p>

<p>a)</p>

```java  {style=github}
for (int j=0; j < 10; j++) {
  if (j>=5) {
    continue;
  }
  Instruction
}
```

<p>b)</p>

```java  {style=github}
for (int j=0; j < 10;j++) {
  if (j>=5) {
    break;
  }
  Instruction
}
```

<p>Que se passe-t-il dans chacun des cas quant à l’exécution de Instruction quand j vaut 5?</p>

<details><summary>Réponse</summary>
<p>En a) Instruction n’est pas exécutée et on passe au tour suivant, le 7eme tour de la boucle (i=6) où, comme lors des autres tours précédant i=5, Instruction sera exécutée.</p>

<p>En b) on sort de la boucle, Instruction ne sera plus jamais exécutée.</p>
</details>

## Question 16

<p>Soit les deux bouts de code suivants :</p>

<p>a)</p>

```java  {style=github}
label:
for (int i=0; i < 10;i++) {
  for (int j=0; j < 6; j++) {
    if (condition) {
      continue label;
    }
   Instruction1
   }
  Instruction2
}
```

<p>b)</p>

```java  {style=github}
for (int i=0; i < 10; i++) {
  for(int j=0; j < 6; j++) {
    if(condition) {
     continue ;
    }
    Instruction1
  }
  Instruction2
}
```

<p>Dans quel cas (quel bout de code et quelle condition) Instruction1 n'est pas exécuté? Y'a-t-il une situation où Instruction2 n'est pas exécuté? Si oui laquelle?</p>

<details><summary>Réponse</summary>
<p>Instruction1 n’est pas exécuté, dans tous les cas lorsque condition est vraie.</p>

<p>Instruction2 est toujours exécuté.</p>
</details>

## Question 17

<p>Soit le code suivant :</p>

```java  {style=github}
public class Main {
 public static void main(String[] args) {
   final int NBRE = 10;
   int i;
   double harmonique;
   harmonique = 0;
   System.out.println("somme des " + NBRE + " premiers termes de la série harmonique");
   for (i = 0; i < NBRE; i++) {
      harmonique += (double)1/(i+1);
   }
   System.out.println("Somme : " + harmonique);
 }
}
```

<p>Réécrire le même code en utilisant les syntaxes de l’instruction while et de l’instruction do…while.</p>

<details><summary>Réponse</summary>
<p>Instruction while.</p>

```java  {style=github}
public class Main {
 public static void main(String[] args) {
   final int NBRE = 10;
   int i=0;
   double harmonique;
   harmonique = 0;
   System.out.println("somme des " + NBRE + " premiers termes de la série harmonique");
   while (i < NBRE) {
     harmonique += (double)1/(i+1);
     i++;
   }
   System.out.println("Somme : " + harmonique);
 }
}
```

<p>Instruction do…while</p>

```java  {style=github}
public class Main {
 public static void main(String[] args) {
   final int NBRE = 10;
   int i = 0;
   double harmonique;
   harmonique = 0;
   System.out.println("somme des " + NBRE + " premiers termes de la série harmonique");
   do {
     harmonique += (double)1/(i+1);
     i++;
   } while (i < NBRE);
   System.out.println("Somme : " + harmonique);
 }
}
```

</details>

## Question 18

<p>Soit le code suivant :</p>

```java  {style=github}
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
        System.out.println("Donnez un nombre entier"); 
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   if (n>=10) {
     System.out.println("Le nombre vaut 10");
   } else if (n >= 100) {
     System.out.println("Le nombre vaut 100");
   } else if (n >= 1000) {
     System.out.println("Le nombre vaut 1000");
   } else {
     System.out.println("Le nombre  n'est pas une puissance de 10 ou il est plus grand que 1000");
   }
 }
}
```

<p>Réécrire le même programme avec l'instruction switch.</p>

<details><summary>Réponse</summary>

```java  {style=github}
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Donnez un nombre entier");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    switch(n)
    {
      case 10 :
      System.out.println("Le nombre vaut 10");
      break;
      case 100 :
      System.out.println("Le nombre vaut 100");
      break;
      case 1000 :
      System.out.println("Le nombre vaut 1000");
      break;
      default:
      System.out.println("Le nombre n'est pas une puissance de 10 ou il est plus grand que 1000");
      break;
    }
  }
}
```

</details>

## Question 19

<p>Étant donné le tableau <tt>String[] x = new String[10]</tt>, que vaut <tt>x[0]</tt>.</p>

<details><summary>Réponse</summary>
<p>En Java, les tableaux sont initialisées à une valeur nulle par défaut. Dans ce cas, <tt>x[0]</tt> prendra donc la valeur <tt>null</tt>. Cette valeur spéciale ne correspond pas à une instance de la classe String. On peut, par contre, assigner une valeur (<tt>x[0]="123"</tt>).</p>
</details>

## Question 20

<p>Énumérer toutes les paires d'entiers entre 0 et 1000 en ordre lexicographique.</p>

<details><summary>Réponse</summary>

```java  {style=github}
public class Liste {
  public static void main(String[] args) {
    for(int i = 0; i <= 1000; i++) {
      for(int j = 0; j <= 1000; j++) {
        System.out.println(i+" "+j);
      }
    }
  }
}
```

</details>

## Question 21

<p>Écrivez un programme Java qui trie le tableau de chaînes de caractères suivant : {"Pomme", "banane", "Cerise", "abricot", "Datte"}, en ignorant la casse (par exemple, "Pomme" et "pomme" doivent être traités de manière identique). Utilisez la méthode Arrays.sort avec une expression lambda pour effectuer un tri alphabétique insensible à la casse.</p>

<p>Une expression lambda est une fonctionnalité introduite dans Java 8 qui permet d'écrire du code plus concis pour représenter des fonctions anonymes. Elle est particulièrement utile lorsqu'une méthode attend une interface fonctionnelle (une interface avec une seule méthode abstraite). Dans le contexte du tri avec Arrays.sort, la lambda remplace une implémentation explicite d'un Comparator.Une lambda a la forme générale suivante : (paramètres) -> expression
La lambda (s1, s2) -> s1.compareToIgnoreCase(s2) signifie : s1 et s2 sont deux chaînes de caractères à comparer, la méthode compareToIgnoreCase est appelée pour déterminer l'ordre alphabétique sans tenir compte de la casse, le résultat de cette comparaison est retourné directement.</p>

<details><summary>Réponse</summary>

{{<inlineJava path="TriChainesSansCasse.java" lang="java" >}}
import java.util.Arrays;

public class TriChainesSansCasse {
    public static void main(String[] args) {
        String[] tableau = {"Pomme", "banane", "Cerise", "abricot", "Datte"};

        // Tri du tableau en ignorant la casse avec une lambda
        Arrays.sort(tableau, (s1, s2) -> s1.compareToIgnoreCase(s2));

        // Affichage du tableau trié
        System.out.println("Tableau trié :");
        for (String s : tableau) {
            System.out.println(s);
        }
    }
}
{{</inlineJava>}}


</details>

## Question 22

<p>Écrivez un programme Java qui affiche la somme des éléments d’un tableau d’entiers donné.</p>
<details><summary>Réponse</summary>

```java  {style=github}
int[] t = {1, 2, 3, 4, 5};
int somme = 0;
for (int v : t) {
    somme += v;
}
System.out.println("Somme : " + somme);
```

</details>

## Question 23

<p>Expliquez la différence entre une boucle <tt>for</tt> et une boucle <tt>while</tt> en Java, et donnez un exemple pour chacune.</p>
<details><summary>Réponse</summary>
<p>La boucle <tt>for</tt> est généralement utilisée quand on connaît le nombre d’itérations à l’avance ; la boucle <tt>while</tt> est utilisée quand on ne le connaît pas.</p>

```java  {style=github}
// Boucle for
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
// Boucle while
int j = 0;
while (j < 5) {
    System.out.println(j);
    j++;
}
```

</details>


## Question 24

<p>Quelle est la différence entre un tableau et une ArrayList en Java ?</p>
<details><summary>Réponse</summary>
<p>Un tableau a une taille fixe et ne peut pas être redimensionné après sa création. Une ArrayList est une structure de données dynamique qui peut changer de taille et offre des méthodes pratiques pour ajouter, supprimer ou rechercher des éléments.</p>
</details>

## Question 25

<p>Écrivez un programme Java qui affiche tous les éléments d’un tableau d’entiers dans l’ordre inverse.</p>
<details><summary>Réponse</summary>

```java  {style=github}
int[] t = {1, 2, 3, 4, 5};
for (int i = t.length - 1; i >= 0; i--) {
    System.out.println(t[i]);
}
```

</details>

## Question 26

<p>Qu'est-ce qu'une <code>HashMap</code> en Java ? Donnez un exemple simple d'utilisation pour associer des noms d'étudiants à leurs notes.</p>
<details><summary>Réponse</summary>
<p>Une <code>HashMap</code> est une structure de données qui associe des clés à des valeurs. Elle permet de retrouver rapidement une valeur à partir de sa clé. Exemple :</p>

```java  {style=github}
import java.util.HashMap;
HashMap<String, Integer> notes = new HashMap<>();
notes.put("Alice", 85);
notes.put("Bob", 92);
System.out.println(notes.get("Alice")); // Affiche 85
```
</details>

## Question 27

<p>Que se passe-t-il si on ajoute deux fois la même clé dans une <code>HashMap</code> en Java ? Par exemple :</p>

```java  {style=github}
HashMap<String, Integer> map = new HashMap<>();
map.put("clé", 1);
map.put("clé", 2);
```

Quelle sera la valeur associée à la clé <code>"clé"</code> ?</p>
<details><summary>Réponse</summary>
<p>La deuxième insertion écrase la première : la valeur associée à la clé <code>"clé"</code> sera 2. Une <code>HashMap</code> ne peut contenir qu'une seule valeur par clé ; si on ajoute une clé déjà existante, la nouvelle valeur remplace l'ancienne.</p>
</details>

## Question 28

<p>Comment utiliser une <code>Stack</code> en Java pour inverser l'ordre des éléments d'une liste ? Donnez un exemple de code qui empile les éléments d'un tableau d'entiers, puis les dépile pour les afficher dans l'ordre inverse.</p>
<details><summary>Réponse</summary>
<p>On peut utiliser une <code>Stack</code> pour inverser l'ordre des éléments : on empile chaque élément, puis on les dépile un à un (LIFO : Last In, First Out).</p>

```java  {style=github}
import java.util.Stack;
int[] t = {1, 2, 3, 4, 5};
Stack<Integer> pile = new Stack<>();
for (int x : t) {
    pile.push(x);
}
while (!pile.isEmpty()) {
    System.out.println(pile.pop());
}
```
</details>

## Question 29

Qu’est-ce que l’interface <code>CharSequence</code> en Java ? Donnez un exemple d’utilisation de la méthode <code>subSequence()</code> sur une chaîne de caractères.

<details><summary>Réponse</summary>
<p>L’interface <code>CharSequence</code> représente une séquence de caractères et est implémentée par <code>String</code>, <code>StringBuilder</code>, etc. La méthode <code>subSequence(start, end)</code> permet d’obtenir une sous-séquence de caractères.</p>

Exemple :</p>

```java  {style=github}
String texte = "Bonjour le monde";
CharSequence sousTexte = texte.subSequence(8, 14); // "le mon"
System.out.println(sousTexte);
```

On peut ainsi éviter de faire des copies.
</details>

## Question 30

Pourquoi est-il préférable d’utiliser <code>StringBuilder</code> plutôt que l’opérateur <code>+</code> pour concaténer des chaînes dans une boucle ? Donnez un exemple.

<details><summary>Réponse</summary>
<p><code>StringBuilder</code> permet de modifier une chaîne sans créer de nouveaux objets à chaque opération, ce qui améliore la performance, surtout dans les boucles. L’opérateur <code>+</code> de la classe String peut créer une nouvelle chaîne à chaque concaténation, ce qui est coûteux en mémoire et en temps.</p>

Exemple :</p>

```java  {style=github}
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 5; i++) {
    sb.append("Ligne ").append(i).append("\n");
}
System.out.println(sb.toString());
```
</details>

## Question 31

Quels sont les types et classes immuables en Java ? Donnez quelques exemples et expliquez pourquoi l’immuabilité peut être utile.

<details><summary>Réponse</summary>
<p>Un type ou une classe est dit <strong>immuable</strong> si son état ne peut pas être modifié après sa création. En Java, les principaux types et classes immuables sont :</p>
<ul>
  <li><code>String</code></li>
  <li>Les classes enveloppes des types primitifs : <code>Integer</code>, <code>Double</code>, <code>Boolean</code>, <code>Long</code>, <code>Short</code>, <code>Byte</code>, <code>Character</code>, <code>Float</code></li>
</ul>
<p>L’immuabilité facilite la programmation (pas de risque de modification imprévue), rend les objets sûrs à partager, et simplifie le raisonnement sur le code.</p>
</details>

## Question 32

Considérez le code suivant :

```java  {style=github}
public class Main {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
```

Qu’affichera ce programme ? Expliquez pourquoi.

<details><summary>Réponse</summary>
<p>Le premier affichage (<code>str1 == str2</code>) retournera <strong>true</strong> car les deux variables pointent vers la même chaîne littérale dans le pool de chaînes de Java. Le second (<code>str1 == str3</code>) retournera <strong>false</strong> car <code>str3</code> est un nouvel objet créé explicitement, différent de la chaîne littérale, même si leur contenu est identique. Pour comparer le contenu des chaînes, il faut utiliser <code>equals()</code> :</p>

```java  {style=github}
System.out.println(str1.equals(str3)); // true
```


En Java, les chaînes de caractères sont des objets particuliers : les chaînes littérales (comme "Java") sont stockées dans une zone spéciale appelée « pool de chaînes ». Quand on écrit deux fois la même chaîne littérale dans le code, Java réutilise le même objet pour économiser de la mémoire. C’est pourquoi <code>str1 == str2</code> retourne <strong>true</strong> : les deux variables pointent vers le même objet en mémoire.

En revanche, lorsque l’on crée une chaîne avec <code>new String("Java")</code>, Java crée explicitement un nouvel objet, même si le contenu est identique à une chaîne littérale existante. Ainsi, <code>str1 == str3</code> retourne <strong>false</strong> car les deux variables pointent vers des objets différents.

Pour comparer le contenu de deux chaînes (et non leur emplacement en mémoire), il faut utiliser la méthode <code>equals()</code>. Cette méthode vérifie caractère par caractère si les deux chaînes ont le même contenu, ce qui est généralement ce que l’on souhaite en pratique.

</details>



## Question 33

<p>Nous savons que la somme 1/2 + 1/4 + 1/8 +... donne la valeur unitaire.</p>

<p>Sachant qu'un type double en Java a une mantisse comportant 53 bits, que va afficher le programme suivant?</p>

```java  {style=github}
class Main {
  public static void main(String[] args) {
    double x = 0;
    double f = 1.0;
    for (int i = 0; i < 53; i++) {
      f /= 2;
      x += f;
    }
    System.out.println(x==1.0);
    f /= 2;
    x += f;
    System.out.println(x==1.0);
  }
}
```

<details><summary>Réponse</summary>
<p>false, true</p>
</details>



## Question 34 (pour les experts !)

Considérons la décroissance radioactive d’un isotope. Supposons que nous ayons une quantité initiale de matière radioactive, et nous voulons modéliser comment sa masse diminue avec le temps en raison de la désintégration. Ce phénomène est courant en physique nucléaire, en médecine (pour les traitements par radiothérapie) et en datation au carbone.

La décroissance radioactive suit une loi où la vitesse de diminution de la masse \( N \) (nombre de particules ou masse restante) est proportionnelle à la masse actuelle. Mathématiquement, cela s’exprime comme :

\[
\frac{dN}{dt} = -\lambda N
\]

- \( N(t) \) : masse (ou nombre de particules) restante à l’instant \( t \).
- \( \lambda \) : constante de désintégration (spécifique à l’isotope, en \( \text{s}^{-1} \)).
- Le signe négatif indique que la masse diminue.

Cette équation différentielle décrit un taux de changement proportionnel à la quantité présente. Par exemple, pour le carbone-14, \( \lambda \approx 3.839 \times 10^{-12} \, \text{s}^{-1} \), mais pour simplifier, nous utiliserons une constante plus grande, comme \( \lambda = 0.1 \, \text{s}^{-1} \), pour observer une décroissance significative sur un intervalle court.

- **Condition initiale** : À \( t = 0 \), la masse initiale est \( N_0 = 100 \, \text{g} \).
- **Intervalle** : Nous modélisons sur \( t \) de 0 à 20 secondes.
- **Méthode** : Nous utiliserons la méthode d’Euler pour résoudre numériquement cette équation. La méthode d’Euler est une technique numérique simple pour résoudre des équations différentielles ordinaires en approximant la solution par des pas discrets. Elle repose sur l’idée que la dérivée d’une fonction donne la pente locale, permettant d’estimer la valeur suivante à partir de la valeur actuelle et d’un pas de temps \( h \). Pour une  équations différentielles ordinaires  de la forme \( \frac{dy}{dt} = f(t, y) \), la méthode calcule \( y_{n+1} = y_n + h \cdot f(t_n, y_n) \). 


Voici le pseudocode de la méthode d'Euler.

---

Entrée : 
- fonction \( f(x, y) \) (dérivée)
- \( x_0 \), \( y_0 \) (conditions initiales)
- \( x_f \) (valeur finale de \( x \))
- \( h \) (taille du pas)

Sortie : 
- liste des points \((x_i, y_i)\) approximant la solution

1. Initialiser \( x = x_0 \), \( y = y_0 \)
2. Initialiser une liste vide pour stocker les points \((x_i, y_i)\)
3. Ajouter le point \((x, y)\) à la liste
4. Tant que \( x < x_f \):
   - Calculer la pente : \( m = f(x, y) \)
   - Mettre à jour \( y \): \( y = y + h \cdot m \)
   - Mettre à jour \( x \): \( x = x + h \)
   - Ajouter le nouveau point \((x, y)\) à la liste
5. Retourner la liste des points

---


Écrivez un programme qui utilise la méthode d’Euler pour résoudre l’équation \( \frac{dN}{dt} = -0.1 N \), avec \( N(0) = 100 \), et affiche la masse restante à chaque pas de temps.

<details><summary>Réponse</summary>

{{<inlineJava path="DecroissanceRadioactive.java" lang="java" >}}

public class DecroissanceRadioactive {
    // Fonction représentant l'équation différentielle dN/dt = -lambda * N
    public static double dNdt(double N, double lambda) {
        return -lambda * N;
    }

    public static void main(String[] args) {
        // Paramètres
        double N0 = 100.0;    // Masse initiale (g)
        double lambda = 0.1;  // Constante de désintégration (s^-1)
        double t0 = 0.0;      // Temps initial (s)
        double tFin = 20.0;   // Temps final (s)
        double h = 0.1;       // Taille du pas (s)
        int etapes = (int) ((tFin - t0) / h); // Nombre d'étapes

        // Tableaux pour stocker t et N
        double[] t = new double[etapes + 1];
        double[] N = new double[etapes + 1];

        // Conditions initiales
        t[0] = t0;
        N[0] = N0;

        // Méthode d'Euler
        for (int i = 0; i < etapes; i++) {
            t[i + 1] = t[i] + h;
            N[i + 1] = N[i] + h * dNdt(N[i], lambda);
        }

        // Afficher les résultats
        System.out.println("Temps (s)\t Masse (g)");
        for (int i = 0; i <= etapes; i += 10) { // Affiche toutes les 10 étapes pour lisibilité
            System.out.printf("%.1f\t\t %.4f\n", t[i], N[i]);
        }
    }
}
{{</inlineJava>}}

</details>


## Question 35  (pour les experts !)

Décrivez le fonctionnement de l’algorithme de tri par insertion. Implémentez cet algorithme en Java pour trier un tableau d’entiers en ordre croissant. Votre programme doit afficher le tableau avant et après le tri.


<details><summary>Réponse</summary>
L’algorithme de tri par insertion parcourt un tableau élément par élément, en insérant chaque élément à sa position correcte dans la partie déjà triée. Pour chaque élément, il le compare avec les éléments précédents et le déplace vers la gauche jusqu’à ce qu’il soit à sa place.

Le programme Java ci-dessus implémente le tri par insertion. La méthode `insertionSort` prend un tableau d’entiers, utilise une boucle pour parcourir les éléments, et insère chaque élément à la bonne position en décalant les éléments plus grands. Le programme affiche le tableau avant et après le tri.

{{<inlineJava path="InsertionSort.java" lang="java" >}}
public class InsertionSort {
    // Méthode pour effectuer le tri par insertion
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        int[] tableau = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Tableau avant le tri :");
        for (int value : tableau) {
            System.out.print(value + " ");
        }
        insertionSort(tableau);
        System.out.println("\nTableau après le tri :");
        for (int value : tableau) {
            System.out.print(value + " ");
        }
    }
}
{{</inlineJava>}}

</details>

## Question 36  (pour les experts !)

Décrivez le fonctionnement de l’algorithme de tri à bulle. Implémentez cet algorithme en Java pour trier un tableau d’entiers en ordre croissant. Votre programme doit afficher le tableau avant et après le tri.



<details><summary>Réponse</summary>
Le tri à bulle parcourt répétitivement un tableau, comparant des éléments adjacents et les échangeant s’ils sont dans le mauvais ordre. À chaque itération, l’élément le plus grand de la portion non triée est placé à la fin, comme une bulle qui remonte.

Le programme Java ci-dessus implémente le tri à bulle. La méthode `bubbleSort` utilise deux boucles imbriquées pour comparer et échanger les éléments adjacents. Le programme affiche le tableau avant et après le tri.

{{<inlineJava path="BubbleSort.java" lang="java" >}}

public class BubbleSort {
    // Méthode pour effectuer le tri à bulle
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Échanger les éléments
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        int[] tableau = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Tableau avant le tri :");
        for (int value : tableau) {
            System.out.print(value + " ");
        }
        bubbleSort(tableau);
        System.out.println("\nTableau après le tri :");
        for (int value : tableau) {
            System.out.print(value + " ");
        }
    }
}
{{</inlineJava>}}

</details>

## Question 37  (pour les experts !)

Décrivez le principe de la recherche binaire dans un tableau trié. Implémentez cet algorithme en Java pour trouver l’indice d’un élément dans un tableau d’entiers trié en ordre croissant. Votre programme doit retourner l’indice de l’élément s’il est trouvé, ou -1 sinon, et afficher un message indiquant le résultat.

<details><summary>Réponse</summary>
La recherche binaire trouve un élément dans un tableau trié en divisant itérativement l’intervalle de recherche par deux. Elle compare l’élément cible avec l’élément central, puis restreint la recherche à la moitié inférieure ou supérieure selon le résultat. Le tableau doit être trié au préalable.

Le programme Java  implémente la recherche binaire. La méthode `binarySearch` prend un tableau trié et un élément cible, utilise une boucle pour ajuster les indices `debut` et `fin`, et retourne l’indice de l’élément ou -1 s’il n’est pas trouvé. Le programme affiche un message indiquant le résultat.


{{<inlineJava path="BinarySearch.java" lang="java" >}}
public class BinarySearch {
    // Méthode pour effectuer la recherche binaire
    public static int binarySearch(int[] arr, int target) {
        int debut = 0;
        int fin = arr.length - 1;
        while (debut <= fin) {
            int milieu = (debut + fin) / 2;
            if (arr[milieu] == target) {
                return milieu;
            } else if (arr[milieu] < target) {
                debut = milieu + 1;
            } else {
                fin = milieu - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        int[] tableau = {11, 12, 22, 25, 34, 64, 90};
        int cible = 25;
        int resultat = binarySearch(tableau, cible);
        if (resultat != -1) {
            System.out.println("Élément " + cible + " trouvé à l'indice : " + resultat);
        } else {
            System.out.println("Élément " + cible + " non trouvé dans le tableau.");
        }
    }
}
{{</inlineJava>}}


</details>

