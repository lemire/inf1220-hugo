---
title: "Méthodes et constructeurs"
weight: 5
---

# La conception de méthodes/fonctions et leur appel

La conception de méthodes (ou fonctions) est un pilier de la programmation structurée et orientée objet. Une méthode permet d’isoler une opération ou un calcul précis, de lui donner un nom, et de la réutiliser à volonté dans différents contextes du programme. Cela favorise la clarté, la maintenance et la réutilisabilité du code. Lorsqu’on appelle une méthode, on peut lui transmettre des informations (paramètres) et récupérer un résultat (valeur de retour). En Java, chaque méthode appartient à une classe : elle définit le comportement que les objets de cette classe peuvent adopter ou les opérations qu’ils peuvent effectuer. Bien concevoir ses méthodes, c’est donc apprendre à découper un problème en sous-tâches logiques, à nommer clairement les opérations, et à limiter la duplication de code.



## Les méthodes

<p>Dans la plupart des langages de programmation modernes, il est possible de subdiviser le code en plusieurs sections appelées méthodes ou fonctions (le terme méthode est spécifique au langage Java, mais le terme fonction peut-être également utilisé). L'avantage est double, ces méthodes permettent une meilleure lecture du code et permet de généraliser et réutiliser des portions de code fréquent. De plus, en programmation orientée objet, l'utilisation de méthodes est parfois appelée un passage de message. Ainsi, une classe peut offrir différentes méthodes à l'application qui peuvent être appelées en envoyant à celle-ci un message et des paramètres (ou non). De plus, la bibliothèque de code standard de Java, appelé <em>Application programming interface</em> (API), fournit plusieurs classes utiles telles que des structures de données (ex. ArrayList, Hashmap), des types avancés (ex. les chaînes de caractères String ou StringBuffer), des outils de gestion de flux de données (ex. pour l'écriture et la lecture dans les fichiers (ex. FileReader, FileInputStream). Chacune des classes de l'API offre un ensemble de méthodes pouvant être appelées pour une tâche ou un traitement donné. Voici un exemple d'appel de méthode avec la classe String : </p>

{{<inlineJava path="ExempleMethode.java" lang="java" >}}
public class ExempleMethode {
    
    public static void main(String[] args) {
        String texte = "Veni, vidi";        
        texte = texte.concat(", vici");
        System.out.println(texte);
        String autreTexte =  "J&#39;aime les patates";
        System.out.println("Textes égaux ? :" 
          + texte.equals(autreTexte));               

    }

}
{{</inlineJava>}}

Avec les versions plus récentes de Java (Java 26 et mieux), il est possible d'omettre le nom
de la classe comme ceci:


{{<inlineJava path="ExempleMethode.java" lang="java" >}}
void main() {
    System.out.println("Bonjour, le monde !");
    int x = 5;
    int y = 10;
    int sum = x + y;
    System.out.println("La somme de " + x + " et " 
      + y + " est : " + sum);
}
{{</inlineJava>}}

Par contre, cette nouvelle syntaxe ne s'applique que dans des cas simples. En pratique,
il est quasiment toujours nécessaire de spécifier le nom de la classe.

### La définition d'une méthode/fonction simple

<p>Une méthode est une suite d'instructions englobées dans un bloc {} permettant de réaliser une opération donnée. De façon générale, la syntaxe d'une méthode est la suivante :</p> 

```java  {style=github}
public static typeretourné nomdelafonction(la liste des paramètrés){
        //instructions 
}
```


<p>Vous trouverez ci-dessous la description de la définition de la méthode précédente :</p> 
<ol>
<li><p><em>public</em> : tout programme Java a accès à cette fonction. Nous verrons plus loin d'autres types d'accès (protected, private).</p> </li>

<li> <p><em>static</em> : indique que la fonction que nous avons définie est statique, c'est-à-dire qu'elle peut être appelée sans la création d'une instance de la classe dans laquelle elle est définie. Si le mot-clé static n'est pas utilisé, alors il faut créer une instance de la classe où la méthode est définie. À ce moment, la méthode sera appelée pour l'instance de la classe spécifique. Pour pouvoir appeler une fonction qui n'est pas <em>static</em>, il faut absolument disposer d'une instance de la classe. Une fonction qui est <em>static</em> peut être appelée sans instance de la classe.  </p> </li>

<li>  <p><em>typeretourné</em> : c'est le type de la variable retournée par la fonction. Si la fonction ne retourne rien, il faut utiliser le mot clé <em>void.</em></p> </li>

<li>  <p><em>nomdelafonction</em> : Il faut choisir un nom assez explicite pour la fonction. Il faut également uniformiser la nomenclature des fonctions dans tout le programme afin d'en faciliter le débogage. Il est recommandé d'utiliser la convention <em>mixed-Case,</em> selon laquelle il est recommandé d'écrire le premier mot complètement en minuscule. Il existe plusieurs conventions et recommandations pour la nomenclature des différents éléments d'un programme, voici celle de l'entreprise Google pour le langage Java <a href="https://google.github.io/styleguide/javaguide.html#s5-naming">https://google.github.io/styleguide/javaguide.html#s5-naming</a></p> </li>

<li><p><em>la liste des paramètres</em> : La liste peut contenir plusieurs paramètres. Elle permet à Java de savoir quels types de paramètres sont reçus par la fonction, de même que leur nom. Alors, les instructions reçues par la fonction pourront utiliser ces paramètres comme des variables locales. Par contre, si la fonction n'accepte pas de paramètres, elle est définie ainsi :</p> </li>
</ol>

```java  {style=github}
public static typeretourné nomDeLaFonction(){
        //instructions 
}
```

<p>Voici un exemple présentant une classe avec deux types de méthode (static et non static) :</p>


{{<inlineJava path="TransformeurTexte.java">}}
public class TransformeurTexte {
    
    protected String texte = "";
    
    // Méthode pour inverser un texte
    public static String inverserTexte(String texte) {
        
        String texteRenverse = new String();
        
        for (char c : texte.toCharArray()) {
            texteRenverse = c + texteRenverse;
        }
        
        return texteRenverse;
        
    }

    public String getTexte() {
        return texte;
    }
    
    public void setTexte(String texteInstance) {
        this.texte = texteInstance;
    }
    
    public void transformerTexteEnHTML() {
        
        texte =  "&lt;html&gt;&lt;body&gt;&lt;p&gt;" + texte + "&lt;/p&gt;&lt;/body&gt;&lt;/html&gt;";
        
    }
    
    public static void main(String[] args) {
        
        String test = "ohohoh";
        
        System.out.println(inverserTexte(test));
        
        TransformeurTexte transformeur = new TransformeurTexte();
        transformeur.setTexte("Bonjour le monde!");
        transformeur.transformerTexteEnHTML();
        System.out.println(transformeur.getTexte());
        
    }
    
}
{{</inlineJava>}}

Dans la classe TransformeurTexte, la référence this est utilisée dans la méthode setTexte pour désigner l'instance actuelle de la classe. La référence this représente l'instance actuelle de la classe TransformeurTexte sur laquelle la méthode setTexte est appelée. La référence this ne peut être utilisée que dans un contexte non statique.


<p>Peu importe l'environnement que vous utilisez pour tester nos exemples, prenez la peine de vous familiariser avec celui-ci.</p>
<p>Prenez note que sur repl.it, la méthode <tt>main</tt> est définie dans une classe distincte appelée Main. La classe TransformateurTexte doit apparaître dans un fichier nommé TransformateurTexte.java selon les conventions propres au Java.</p>

### La structure d'une méthode

<p>Nous avons appris précédemment que la définition d'une fonction suivait le modèle général : typeretourné nomdelafonction(arg1,arg2…)</p>

<p>Si vous utilisez un type de retour autre que void dans le corps de la définition de la fonction, vous devez avoir l'expression retournée. Cela prend la forme suivante : "return expression;" La variable "expression" doit être du même type que le "typeretourné" par la fonction. Donc si typeretourné est int alors expression est de type int également.</p>

<p>Le programme ci-dessous illustre l'utilisation d'une fonction avec type retourné :</p>


{{<inlineJava path="NombreAleatoire.java" lang="java" >}}
public class NombreAleatoire {
    public static int getNombreAleatoire() {
        int num = (int)(Math.random() * 10) + 1;
        return num;
    }

    public static void main(String[] args) {
        int nombre = getNombreAleatoire();
        System.out.println("le nombre est " + nombre);
    }
}
{{</inlineJava>}}


<p>L'exemple de code ci-dessous présente une méthode avec plusieurs paramètres:</p>

{{<inlineJava path="Exercice.java" lang="java" >}}
public class Exercice {
    public static String fusionDeTexte(String texte1, String texte2) {
        return texte1 + "::" + texte2;   
    }
       
    public static void main(String[] args) {
        String bonjourTexte = "Bonjour";
        String hiTexte = "Hi";
        System.out.println(fusionDeTexte(bonjourTexte, hiTexte));
    }
    
}
{{</inlineJava>}}


<p>Nous pouvons catégoriser les fonctions de la façon suivante :</p> 
  <ul type="disc"> 
    <li>si la fonction ne retourne aucune valeur, alors on utilise le mot-clé <em>void</em> au lieu de <em>typeretourné;</em> </li> 
    <li>si la fonction retourne un type de valeur, ce type remplace <em>typeretourné</em> dans la définition de la fonction; </li> 
    <li>si la fonction ne reçoit aucun paramètre, on affiche des parenthèses vides au nom de la fonction; </li> 
    <li>si la fonction reçoit plusieurs paramètres, on place ces paramètres séparés par des virgules entre parenthèses après le nom de la fonction. </li> 
  </ul> 
  <p>En pratique, une fonction est très souvent une combinaison de deux des catégories ci-dessus. Si on veut qu'une fonction retourne plusieurs valeurs, on doit créer un nouveau type représentant une entité contenant toute l'information qu'on désire récupérer et on se sert de ce nouveau type comme type de retour.</p></p>

<p>Enfin, en Java les paramètres passés aux méthodes le sont par valeur lorsqu'il s'agit de type primaire, mais par référence lorsqu'il s'agit d'instance de classes, contrairement à d'autres langages (ex. C++). C'est à dire que si une méthode vient manipuler une instance d'un objet dans une méthode, alors cette valeur est également modifiée à l'extérieur de la portée (scope) de la méthode, car la valeur a été modifiée à l'adresse mémoire dans le programme. Toutefois, ce n'est pas le cas pour des paramètres type primaire (int, float, char, boolean, etc). En somme, les valeurs correspondant aux types primaires sont passées par valeur (la modification a une portée locale), mais pour le reste, c'est par référence et la modification a une portée qui excède la fonction. Voici un exemple pour illustrer le comportement du passage de paramètre en référence :</p>

{{<inlineJava path="Exercice.java">}}
public class Exercice {
    
    protected int compteur = 0;
   
    public static void mettreDesPointsExclamations(StringBuffer texte) {
        // On modifie le texte
        texte.insert(0, "!!!");
        texte.append("!!!");
        
    }
   
    public static void main(String[] args) {     
        StringBuffer test = new StringBuffer("Bonjour");
        System.out.println(test);
        mettreDesPointsExclamations(test);
        System.out.println(test);
    }
}
{{</inlineJava>}}

<p>Pour éviter des effets de bord difficiles à comprendre lors de modification de paramètres dans une fonction, il est possible d'éviter de modifier les valeurs des paramètres en faisant une copie locale comme dans cet exemple : </p>


{{<inlineJava path="Exercice.java">}}
public class Exercice {
    
    protected int compteur = 0;
   
    
    public static StringBuffer mettreDesPointsExclamations(StringBuffer texte) {
        StringBuffer copieLocal = new StringBuffer(texte.toString());
        copieLocal.insert(0, "!!!");
        copieLocal.append("!!!");
        return copieLocal;      
    }
   
    public static void main(String[] args) {
        StringBuffer test = new StringBuffer("Bonjour");
        System.out.println(test);
        StringBuffer texteModifie = mettreDesPointsExclamations(test);
        System.out.println(texteModifie);
    }
}
{{</inlineJava>}}

### Surdéfinition de méthodes

<p>Ce qui distingue les méthodes dans une classe sont : le nom de la méthode, le type de retour (void ou autres) et ses paramètres. Il peut être utile d'avoir plusieurs méthodes avec le même nom, ayant sensiblement le même comportement/action mais dont les paramètres en entrées sont différents. Ceci permet de spécialiser certaines méthodes pour le traitement de certains types de données. Voici un exemple de surdéfinition de méthodes :</p>



{{<inlineJava path="FusionDonnees.java">}}
public class FusionDonnees {
    
    protected String texte = "";

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
    
    public String fusion(String autreTexte) {
                      
        return texte + "|+s|"+ autreTexte;
    }
    
    public String fusion(int entier) {
        return texte + "|+i|" + Integer.toString(entier);
    }
    
    public static void main(String[] args) {

        String hiTexte = "Hi";
        
        FusionDonnees fusionneur = new FusionDonnees();
        fusionneur.setTexte("Bonjour");
              
        System.out.println(fusionneur.fusion(hiTexte));
        System.out.println(fusionneur.fusion(13));
        
    }
    
}
{{</inlineJava>}}


### Signature d'une méthode

Chaque classe donnée ne peut avoir qu'une seule méthode ayant une certaine signature. La signature d'une méthode est la combinaison du nom de la méthode et de la liste (et l’ordre) des types de ses paramètres. Cela signifie que deux méthodes d’une même classe peuvent porter le même nom, à condition qu’elles aient des paramètres de types ou d’ordre différents : c’est la surcharge de méthodes (overloading). La signature ne tient pas compte du type de retour de la méthode ni des modificateurs d’accès (public, private, etc.).

```java {style=github}
void afficher(String message)
void afficher(int nombre)
void afficher(String message, int nombre)
```
Ici, chaque méthode a une signature différente, même si le nom est identique.

### Vidéos

{{< youtube id="IZ8wKErw0_Y" >}}

{{< youtube id="48wGbUfFtfM" >}}

{{< youtube id="FkB7N0w81Dk" >}}

{{< youtube id="zM_Qf07fEyc" >}}

### Lecture optionnelle dans le livre de référence (Delannoy)

<p>Pour aller plus en profondeur sur les méthodes/fonctions. Veuillez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 6:</p>
<ul>
	<li>Section 6 : Règles d'écriture des méthodes</li>
	<li>Section 7 : Champs et méthodes de classe</li>
<li>Section 8 : Surdéfinition de méthodes</li>
<li>Section 9 : Échange d'informations avec les méthodes</li>
</ul>

<p><a id="intro" name="section2"></a></p>

## Les constructeurs


<p>Pour les types élémentaires comme int et float, on peut créer une nouvelle instance, une nouvelle valeur directement par assignation: « float x = 1.0f; ». Les autres types (c'est-à-dire les instances de classe) sont définis par une classe Java et doivent être créés avec une fonction particulière appelée <em>constructeur</em>. Ces fonctions prennent le nom de la classe comme nom, ne possèdent pas de type de retour (void ou autre) et peuvent posséder plusieurs paramètres ou aucun. Il est également possible pour une même classe d'avoir plusieurs constructeurs avec des paramètres différents.  Les constructeurs sont appelées lors de la création d'une instance d'une classe à l'aide du mot-clé « new ». L'appel du mot-clé « new » retourne une nouvelle instance de la classe créée par l'entremise de l'appel d'un constructeur: par exemple, l'appel « MaClasse x = new MaClasse(1) » pourra appeler le constructeur « public MaClasse(int x) ». Toute instance d'une classe doit avoir été créée par l'appel d'un constructeur. Si une classe ne comprend aucun constructeur explicite, Java va y ajouter un constructeur implicite qui ne prend aucun paramètre. Le constructeur par défaut ne va pas apparaître dans votre code, Java s'en charge. Le constructeur doit initialiser (donner une valeur) aux attributs de la classe. Une fois que le constructeur s'est exécuté, l'instance de classe doit être utilisable. Voici un exemple de constructeurs et leur utilisation :</p>




{{<inlineJava path="Client.java" lang="java" >}}
public class Client {
    
    public static final String DEBUTLOG = "Client :";
    public static final String SEPARATEUR = "|*|";
    
    public int id;
    public String prenom;
    public String nom;
    public boolean clientActif;
    
    public Client() {
        id = (int)(Math.random() * 1000) - 1;
        prenom = "John";
        nom = "Doe";
        clientActif = false;
    }
    
    public Client(int id, String prenom, String nom) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        clientActif = true;
    }
    
    public static void main(String[] args) {
        
        Client unClient = new Client();
   
        Client unAutreClient = new Client(44, "Charlie", "Chaplin");

        
        System.out.println(Client.DEBUTLOG + unClient.id 
        + Client.SEPARATEUR + unClient.prenom 
        + Client.SEPARATEUR + unClient.nom);
        
        System.out.println(DEBUTLOG + unAutreClient.id 
        + Client.SEPARATEUR + unAutreClient.prenom 
        + Client.SEPARATEUR + unAutreClient.nom);
        
    }
    
}
{{</inlineJava>}}

<p> À moins de ne programmer qu'avec des types de base (int, float, etc.), vous n'avez pas le choix en Java: il faut appeler des constructeurs, ne serait-ce que les constructeurs par défaut.
Contrairement aux méthodes, les constructeurs doivent avoir le même nom que la classe et ils  ne renvoient aucune valeur explicitement. Pour une même instance de classe, le constructeur n’est appelé qu’une seule fois alors que les méthodes peuvent être appelées plusieurs fois.</p>

### Lecture optionnelle

<ul>
<li><a href="https://fr.wikipedia.org/wiki/Constructeur_(programmation)">Constructeur (programmation)</a> (Wikipédia)</li>

</ul>

### Est-ce qu'on doit toujours construire ses propres classes en Java?

<p>Le langage de programmation java vous incite à créer vos propres classes, avec des méthodes et des attributs correspondants à votre problème. Est-ce toujours nécessaire ou souhaitable?</p>

<p>La réponse est négative. Pour les problèmes simples qui peuvent être résolus avec une, deux ou trois petites fonctions statiques, il n'est souvent pas nécessaire ou souhaitable de créer une classe sur mesure. La règle d'or en programmation est que la solution la plus simple est la préférable.</p>

<p>Le langage de programmation Java est fortement axé sur la programmation orientée objet, mais cette stratégie de programmation ne doit pas être utilisée plus que nécessaire. Une solution comprenant plusieurs classes sur mesure n'est pas nécessairement meilleure. Plusieurs langages de programmation populaires comme le C, le Rust, le JavaScript conventionnel, le Go, etc. n'ont même pas de notion de classe. Il n'est donc pas nécessaire, quand on programme, de toujours créer des classes sur mesure.</p>

<p>Alors pourquoi est-ce qu'on vous demande d'en apprendre autant sur les classes, les constructeurs, etc.? Parce que c'est une technique de programmation répandue et parfois incontournable. En Java, si vous ne comprenez pas les notions de classe, méthode et constructeur, vous ne pourrez pas aller bien loin. Dès que les problèmes deviennent complexes, vous devrez créer des classes.</p>

<p>Concrètement, dans ce cours, vous ne serez jamais pénalisé si vous écrivez des programmes Java qui répondent aux consignes sans nécessairement créer plus de classes que nécessaire. Par contre, il est probable que vous ne pourrez pas réussir le cours si vous ne comprenez pas les notions de classe, constructeur et méthode.</p>

### Vidéos


{{< youtube id="cGpJ0o9z5GQ" >}}



<ol>
<li><a href="https://www.youtube.com/playlist?list=PLZbs1ERZ-TGWeJa5CqDPpNNmLhsIFEmkl">Il y a une liste de vidéos sur le sujet des constructeurs par Sam et al.</a></li>
</ol>

### Lecture optionnelle dans le livre de référence (Delannoy)

<p>Pour aller plus en profondeur sur les constructeurs (optionnel), vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, Chapitre 6:</p>
<ul>
	<li>Section 2 : La notion de constructeur</li>
</ul>
