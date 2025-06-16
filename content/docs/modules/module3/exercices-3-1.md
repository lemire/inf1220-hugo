---
title: "Exercices 3.1"
weight: 4
---

<h1><a id="top" name="top"></a>Module 3</h1><h2>Exercice 3.1</h2><h2 class="partie2">Exercices sur les Structures de contrôle, les Structures itératives, les Structures de données</h2>

<h1>Questions/Réponses</h1>
<p>Veuillez répondre mentalement, sur papier ou bien en créant le code nécessaire pour répondre à ces questions avant de regarder la réponse.</p>
<p>Quand on vous demande de produire du code, vous devez le tester. C'est une erreur commune chez les étudiants: ils produisent rapidement du code en supposant qu'il est fonctionnel. Prenez le temps de vous relire, d'être attentif. Et testez votre code. Encore et encore.</p>



<p>Prenez note qu'<a href="https://rc-inf1220.teluq.ca/">il est permis d'utiliser le robot conversationnel du cours lors des exercises</a>. Cependant vous devriez vous entraîner à produire vos propres réponses.</p>

<h2>Réponses uniques?</h2>

<p>Les exercices comportent une solution vous permettant de comparer votre approche avec la nôtre. Il n'y a pas de solution unique aux problèmes en général. Vous pouvez arriver avec une solution qui est préférable ou moins bonne que celle que nous offrons. Pour faire ces questions, vous devez avoir fait toutes les lectures préalables. Vous disposez alors toujours des fondements nécessaires pour faire les exercices. Nous vous encourageons tout de même à faire vos propres recherches en complément de vos lectures. Dans certains cas, au sein de la solution que nous offrons, nous pouvons utiliser des notions techniques qui n'ont pas été vues directement dans le cours, mais qui devraient vous être facilement accessibles.</p>

<h2>Question 1</h2>
<p>Si x == true et que l'on utilise le code suivant, quel sera la sortie en ligne de commande?</p>
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">if</span><span style="color: #333333">(</span>x <span style="color: #333333">!=</span> <span style="color: #008800; font-weight: bold">true</span> <span style="color: #333333">&amp;&amp;</span> x <span style="color: #333333">==</span> <span style="color: #008800; font-weight: bold">true</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
    System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;AAA&quot;</span><span style="color: #333333">);</span>
<span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">else</span> <span style="color: #333333">{</span>
    System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;BBB&quot;</span><span style="color: #333333">);</span>
<span style="color: #333333">}</span>
</pre></div>
<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>Le résultat affiché sera BBB, car x != true donnera Faux et x == true donnera Vrai. Par définition, Faux ET Vrai = FAUX</p></div>
</div>

<h2>Question 2</h2>
<p>Le code suivant contient 5 erreurs, veuillez les identifier :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #333399; font-weight: bold">int</span> x <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">5</span><span style="color: #333333">;</span>

<span style="color: #008800; font-weight: bold">if</span><span style="color: #333333">((</span>x <span style="color: #333333">&gt;</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">)</span> <span style="color: #333333">&amp;&amp;</span> <span style="color: #333333">(</span>x <span style="color: #333333">=&lt;</span> <span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
     x <span style="color: #333333">=</span> <span style="background-color: #fff0f0">&quot;5&quot;</span><span style="color: #333333">;</span>
<span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">if</span> <span style="color: #333333">(</span>x <span style="color: #333333">!!=</span> <span style="color: #0000DD; font-weight: bold">5</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
     x <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">100</span><span style="color: #333333">;</span>
<span style="color: #333333">}</span> 
</pre></div>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>Voici les erreurs :</p>
<ul>
	<li>l'opérateur =< n'existe pas, c'est plutôt <=</li>
	<li>il manque une parenthèse ")" à la première ligne if (avant le })</li>
	<li>on ne peut assigner une String à un int</li>
	<li>en supposant que l'indentation est correcte, il manque le else pour } else if (</li>
	<li>l'opérateur !!= n'existe pas, c'est plutôt !=</li>
</ul>
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #333399; font-weight: bold">int</span> x <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">5</span><span style="color: #333333">;</span>

<span style="color: #008800; font-weight: bold">if</span><span style="color: #333333">((</span>x <span style="color: #333333">&gt;</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">)</span> <span style="color: #333333">&amp;&amp;</span> <span style="color: #333333">(</span>x <span style="color: #333333">&lt;=</span> <span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">))</span> <span style="color: #333333">{</span>
     x <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">5</span><span style="color: #333333">;</span>
<span style="color: #333333">}</span> <span style="color: #008800; font-weight: bold">else</span> <span style="color: #008800; font-weight: bold">if</span> <span style="color: #333333">(</span>x <span style="color: #333333">!=</span> <span style="color: #0000DD; font-weight: bold">5</span><span style="color: #333333">)</span> <span style="color: #333333">{</span>
     x <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">100</span><span style="color: #333333">;</span>
<span style="color: #333333">}</span> 
</pre></div>
</div>
</div>

<h2>Question 3</h2>
<p>Quelle est la différence entre une boucle while et une boucle do-while?</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>Le contrôle se fait au départ dans la boucle while alors que le contrôle se fait à la fin dans le do-while. Dans la boucle while, il y a donc un contrôle avant même de faire la première itération.</p></div>
</div>

<h2>Question 4</h2>
<p>Quelle sera la sortie d'affichage de ce block switch-case et pourquoi?</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #333399; font-weight: bold">int</span> index <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">switch</span> <span style="color: #333333">(</span>index<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">case</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">:</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">11</span><span style="color: #333333">);</span>
            <span style="color: #008800; font-weight: bold">break</span><span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">case</span> <span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">:</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">22</span><span style="color: #333333">);</span>
            <span style="color: #008800; font-weight: bold">break</span><span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">case</span> <span style="color: #0000DD; font-weight: bold">3</span><span style="color: #333333">:</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">33</span><span style="color: #333333">);</span>
            <span style="color: #008800; font-weight: bold">break</span><span style="color: #333333">;</span>
        <span style="color: #008800; font-weight: bold">default</span><span style="color: #333333">:</span>
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Default&quot;</span><span style="color: #333333">);</span>
            <span style="color: #008800; font-weight: bold">break</span><span style="color: #333333">;</span>
<span style="color: #333333">}</span>
</pre></div>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>La sortie sera "Default", car la valeur de la variable index = 10 ne correspond à aucun des cas du switch. C'est donc le sous-bloc "Default" qui est exécuté.</p></div>
</div>

<h2>Question 5</h2>
<p>Vrai ou faux: un tableau de type int[10] occupera 40 octets en mémoire parce qu'il y a 10 entiers (int) et que chaque entier occupe 4 octets (32 bits).</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>Faux. Il est vrai qu'il y a 10 entiers (int) et que chaque entier occupe 4 octets. Cependant, Java doit aussi garder une trace de la longueur du tableau (10 éléments). Il y a aussi d'autres contraintes. Il serait plus juste de dire que le tableau va utiliser plus de 40 octets. </p> </div>
</div>

<h2>Question 6</h2>
<p>Supposons que dans un code, nous avons créé un tableau d'une dimension de 10 éléments (int[] tableau = new int[10]) et que nous accédions, suite à son instanciation, au 20e élément du tableau ( int x = tableau[20]), qu'adviendra-t-il?</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>À l'exécution l'opération int x = tableau[20] va générer une erreur du type : java.lang.ArrayIndexOutOfBoundsException: 20, car nous tentons d'accéder à des index du tableau qui n'existe pas.</p></div>
</div>

<h2>Question 7</h2>
<p>Est-ce possible de créer une structure de données de type ArrayList d'entier en utilisant la déclaration suivante : ArrayList&lt;int&gt; = new ArrayList&lt;int&gt;(); ?</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>Le Java est un langage OO et même si le Java intègre des types de base (int, float, etc.) qui ne sont pas des objets.  L'objet ArrayList ne peut que contenir des objets. Il faut donc utiliser plutôt : ArrayList&lt;Integer&gt; = new ArrayList&lt;Integer&gt;(); où l'objet Integer est la version objet de int. Dans les dernières versions de Java, une mécanique de conversion automatique permet d'assigner des types à leur objet équivalent. Par exemple : Integer i = 5; ou bien :</p>
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%">ArrayList<span style="color: #333333">&lt;</span>Integer<span style="color: #333333">&gt;</span> list <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> ArrayList<span style="color: #333333">&lt;</span>Integer<span style="color: #333333">&gt;();</span>
list<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">5</span><span style="color: #333333">);</span>
</pre></div>
</div>
</div>

<h2>Question 8</h2>
<p>Votre employeur vous demande créer une fonction en Java qui vous permettra de trouver dans un tableau à deux dimensions, un couple {clé,valeur}. Pour démarrer, vous avez le code suivant, veuillez créer une fonction trouver qui reçoit en paramètre la clé et retourne la valeur :</p>

```java
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


<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>Voici le code</p>

```java
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

</div>
</div>

<h2>Question 9</h2>
<p>Montrer comment on peut trier un tableau d'entiers en Java.</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>Le plus simple est d'utiliser la méthode Arrays.sort.</p>
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.util.Arrays</span><span style="color: #333333">;</span>
<span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Main</span> <span style="color: #333333">{</span>
  <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
    <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> tableauTest <span style="color: #333333">=</span> <span style="color: #333333">{</span><span style="color: #0000DD; font-weight: bold">4</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">6</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">9</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">76</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">222</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">5</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">22</span><span style="color: #333333">};</span>
    Arrays<span style="color: #333333">.</span><span style="color: #0000CC">sort</span><span style="color: #333333">(</span>tableauTest<span style="color: #333333">);</span>
    <span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">:</span> tableauTest<span style="color: #333333">)</span> <span style="color: #333333">{</span>
      System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">print</span><span style="color: #333333">(</span>i <span style="color: #333333">+</span> <span style="background-color: #fff0f0">&quot; &quot;</span><span style="color: #333333">);</span>
    <span style="color: #333333">}</span> 
    System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">();</span> 
  <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>



</div>
</div>

<h2>Question 10</h2>
<p>Veuillez créer une fonction, recevant un ArrayList en entrée, et qui retourne une nouvelle ArrayList avec les éléments inversés, i.e. le premier élément à la fin, le dernier élément en premier et ainsi de suite.  </p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>Voici une solution possible. Elle est grossièrement inefficace sur le plus du temps de calcul: vous pouvez sans doute faire mieux.</p>
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.util.ArrayList</span><span style="color: #333333">;</span>


<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">ArrayListUtils</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> ArrayList <span style="color: #0066BB; font-weight: bold">inverser</span><span style="color: #333333">(</span>ArrayList liste<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        ArrayList inverse <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> ArrayList<span style="color: #333333">();</span>
        
        <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span>Object o <span style="color: #333333">:</span> liste<span style="color: #333333">)</span> <span style="color: #333333">{</span>
            
            inverse<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">,</span> o<span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
        
        <span style="color: #008800; font-weight: bold">return</span> inverse<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        ArrayList<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;</span> test <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> ArrayList<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;();</span>
        test<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;1&quot;</span><span style="color: #333333">);</span>
        test<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;2&quot;</span><span style="color: #333333">);</span>
        test<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;3&quot;</span><span style="color: #333333">);</span>
        test<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;4&quot;</span><span style="color: #333333">);</span>
        test<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;5&quot;</span><span style="color: #333333">);</span>
        
        ArrayList<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;</span> testInverse <span style="color: #333333">=</span> ArrayListUtils<span style="color: #333333">.</span><span style="color: #0000CC">inverser</span><span style="color: #333333">(</span>test<span style="color: #333333">);</span>
        
        <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span>String s <span style="color: #333333">:</span> testInverse<span style="color: #333333">)</span> <span style="color: #333333">{</span>
            
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">print</span><span style="color: #333333">(</span>s <span style="color: #333333">+</span> <span style="background-color: #fff0f0">&quot; &quot;</span><span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>


Voici une autre solution (n'oubliez pas 'import java.util.Collections').

<pre style='color:#000000;background:#ffffff;'>    ArrayList<span style='color:#800080; '>&lt;</span><span style='color:#603000; '>String</span><span style='color:#800080; '>></span> test <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> ArrayList<span style='color:#800080; '>&lt;</span><span style='color:#603000; '>String</span><span style='color:#800080; '>></span><span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    test<span style='color:#808030; '>.</span>add<span style='color:#808030; '>(</span><span style='color:#800000; '>"</span><span style='color:#0000e6; '>1</span><span style='color:#800000; '>"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    test<span style='color:#808030; '>.</span>add<span style='color:#808030; '>(</span><span style='color:#800000; '>"</span><span style='color:#0000e6; '>2</span><span style='color:#800000; '>"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    test<span style='color:#808030; '>.</span>add<span style='color:#808030; '>(</span><span style='color:#800000; '>"</span><span style='color:#0000e6; '>3</span><span style='color:#800000; '>"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    test<span style='color:#808030; '>.</span>add<span style='color:#808030; '>(</span><span style='color:#800000; '>"</span><span style='color:#0000e6; '>4</span><span style='color:#800000; '>"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    test<span style='color:#808030; '>.</span>add<span style='color:#808030; '>(</span><span style='color:#800000; '>"</span><span style='color:#0000e6; '>5</span><span style='color:#800000; '>"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>

    Collections<span style='color:#808030; '>.</span><span style='color:#603000; '>reverse</span><span style='color:#808030; '>(</span>test<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#800000; font-weight:bold; '>for</span><span style='color:#808030; '>(</span><span style='color:#603000; '>String</span> s <span style='color:#800080; '>:</span> test<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
      System<span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>print<span style='color:#808030; '>(</span>s <span style='color:#808030; '>+</span> <span style='color:#800000; '>"</span><span style='color:#0000e6; '> </span><span style='color:#800000; '>"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#800080; '>}</span>
</pre>
</div>
</div>

<h2>Question 11</h2>
<p>Vous devez créer une méthode supplémentaire au code de la Question #10, permettant de fusionner deux ArrayList ensemble. Cette méthode prend deux ArrayLists en paramètre et retourne le nouvel ArrayList fusionné.</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div><p>La méthode addAll de la classe ArrayList permet de rapidement faire cette fusion :</p>
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.util.ArrayList</span><span style="color: #333333">;</span>


<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">ArrayListUtils</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> ArrayList <span style="color: #0066BB; font-weight: bold">inverser</span><span style="color: #333333">(</span>ArrayList liste<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        ArrayList inverse <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> ArrayList<span style="color: #333333">();</span>
        
        <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span>Object o <span style="color: #333333">:</span> liste<span style="color: #333333">)</span> <span style="color: #333333">{</span>
            
            inverse<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">,</span> o<span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
        
        <span style="color: #008800; font-weight: bold">return</span> inverse<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> ArrayList <span style="color: #0066BB; font-weight: bold">fusion</span><span style="color: #333333">(</span>ArrayList a<span style="color: #333333">,</span> ArrayList b<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        <span style="color: #888888">// Permet de cloner la structure. Nécessite un cast</span>
        ArrayList liste <span style="color: #333333">=</span> <span style="color: #333333">(</span>ArrayList<span style="color: #333333">)</span> a<span style="color: #333333">.</span><span style="color: #0000CC">clone</span><span style="color: #333333">();</span>
        
        <span style="color: #888888">// Ajouter l&#39;ArrayList b à la fin de liste</span>
        liste<span style="color: #333333">.</span><span style="color: #0000CC">addAll</span><span style="color: #333333">(</span>b<span style="color: #333333">);</span>
        
        <span style="color: #008800; font-weight: bold">return</span> liste<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        
        ArrayList<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;</span> test <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> ArrayList<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;();</span>
        test<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;1&quot;</span><span style="color: #333333">);</span>
        test<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;2&quot;</span><span style="color: #333333">);</span>
        test<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;3&quot;</span><span style="color: #333333">);</span>
        test<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;4&quot;</span><span style="color: #333333">);</span>
        test<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;5&quot;</span><span style="color: #333333">);</span>
        
        ArrayList<span style="color: #333333">&lt;</span>String<span style="color: #333333">&gt;</span> listFusion <span style="color: #333333">=</span> ArrayListUtils<span style="color: #333333">.</span><span style="color: #0000CC">fusion</span><span style="color: #333333">(</span>test<span style="color: #333333">,</span> test<span style="color: #333333">);</span>
        
        <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span>String s <span style="color: #333333">:</span> listFusion<span style="color: #333333">)</span> <span style="color: #333333">{</span>
            
            System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">print</span><span style="color: #333333">(</span>s <span style="color: #333333">+</span> <span style="background-color: #fff0f0">&quot; &quot;</span><span style="color: #333333">);</span>
        <span style="color: #333333">}</span>
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>
</pre></div>

</div>
</div>

<h2>Question 12</h2>

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

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>


<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">import</span> <span style="color: #0e84b5; font-weight: bold">java.util.ArrayList</span><span style="color: #333333">;</span>
<span style="color: #888888">// solution par Francis Beauchemin-Côté </span>
<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Main</span> <span style="color: #333333">{</span>
	<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> String <span style="color: #0066BB; font-weight: bold">trioMotif</span><span style="color: #333333">(</span>String caractere1<span style="color: #333333">,</span> String caractere2<span style="color: #333333">,</span> <span style="color: #333399; font-weight: bold">int</span> nombreCaractere1<span style="color: #333333">)</span> <span style="color: #333333">{</span>
		String motif <span style="color: #333333">=</span> <span style="background-color: #fff0f0">&quot;&quot;</span><span style="color: #333333">;</span>
		<span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;=</span> nombreCaractere1<span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span> <span style="color: #888888">// On veut mettre le nombre de trio demandé.</span>
			motif <span style="color: #333333">+=</span> caractere1 <span style="color: #333333">+</span> caractere1 <span style="color: #333333">+</span> caractere1<span style="color: #333333">;</span> <span style="color: #888888">// Le premier argument est un String pour ne pas faire la somme en</span>
			<span style="color: #888888">// int (si un char avait été utilisé). Donc + est une</span>
			<span style="color: #888888">// concaténation.</span>
			<span style="color: #008800; font-weight: bold">if</span> <span style="color: #333333">(</span>i <span style="color: #333333">!=</span> nombreCaractere1<span style="color: #333333">)</span> <span style="color: #333333">{</span> <span style="color: #888888">// On n’ajoute pas de motif de séparation après le dernier trio.</span>
				motif <span style="color: #333333">+=</span> caractere2<span style="color: #333333">;</span> <span style="color: #888888">// Comme motif est un String, la somme avec un char devient en fait une</span>
				<span style="color: #888888">// concaténation. On utilise ici un String dans le but d&#39;uniformiser et</span>
				<span style="color: #888888">// simplifier l&#39;utilisation.</span>
			<span style="color: #333333">}</span>
		<span style="color: #333333">}</span>
		<span style="color: #008800; font-weight: bold">return</span> motif<span style="color: #333333">;</span>
	<span style="color: #333333">}</span>

	<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> String <span style="color: #0066BB; font-weight: bold">nbInter</span><span style="color: #333333">(</span>String carac<span style="color: #333333">,</span> <span style="color: #333399; font-weight: bold">int</span> nombreInterrogation<span style="color: #333333">)</span> <span style="color: #333333">{</span> <span style="color: #888888">// Crée le String entourant</span>
		<span style="color: #888888">// les motifs de trio.</span>
		String chaine <span style="color: #333333">=</span> <span style="background-color: #fff0f0">&quot;&quot;</span><span style="color: #333333">;</span>
		<span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;=</span> nombreInterrogation<span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
			chaine <span style="color: #333333">+=</span> carac<span style="color: #333333">;</span>
		<span style="color: #333333">}</span>
		<span style="color: #008800; font-weight: bold">return</span> chaine<span style="color: #333333">;</span>
	<span style="color: #333333">}</span>

	<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">pyramide</span><span style="color: #333333">(</span>String premierChar<span style="color: #333333">,</span> String deuxiemeChar<span style="color: #333333">,</span> <span style="color: #333399; font-weight: bold">int</span> nombreDeLignes<span style="color: #333333">)</span> <span style="color: #333333">{</span>
		ArrayList <span style="color: #333333">&lt;</span> String <span style="color: #333333">&gt;</span> texte <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> ArrayList <span style="color: #333333">&lt;</span> String <span style="color: #333333">&gt;</span> <span style="color: #333333">();</span> <span style="color: #888888">// Notre texte sera un vecteur de String.</span>
		<span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> i <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> i <span style="color: #333333">&lt;</span> <span style="color: #333333">(</span>nombreDeLignes <span style="color: #333333">+</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">)</span> <span style="color: #333333">/</span> <span style="color: #0000DD; font-weight: bold">2</span><span style="color: #333333">;</span> i<span style="color: #333333">++)</span> <span style="color: #333333">{</span> <span style="color: #888888">// Comme c&#39;est une division entière, la division ne prend que</span>
			<span style="color: #888888">// le quotient entier.</span>
			texte<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span>nbInter<span style="color: #333333">(</span>deuxiemeChar<span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">2</span> <span style="color: #333333">*</span> i<span style="color: #333333">)</span> <span style="color: #333333">+</span> trioMotif<span style="color: #333333">(</span>premierChar<span style="color: #333333">,</span> deuxiemeChar<span style="color: #333333">,</span> <span style="color: #333333">(</span>nombreDeLignes <span style="color: #333333">+</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">)</span> <span style="color: #333333">/</span> <span style="color: #0000DD; font-weight: bold">2</span> <span style="color: #333333">-</span> i<span style="color: #333333">)</span> <span style="color: #333333">+</span> nbInter<span style="color: #333333">(</span>deuxiemeChar<span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">2</span> <span style="color: #333333">*</span> i<span style="color: #333333">));</span>
			texte<span style="color: #333333">.</span><span style="color: #0000CC">add</span><span style="color: #333333">(</span>nbInter<span style="color: #333333">(</span>deuxiemeChar<span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">2</span> <span style="color: #333333">*</span> i<span style="color: #333333">)</span> <span style="color: #333333">+</span> trioMotif<span style="color: #333333">(</span>deuxiemeChar<span style="color: #333333">,</span> premierChar<span style="color: #333333">,</span> <span style="color: #333333">(</span>nombreDeLignes <span style="color: #333333">+</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">)</span> <span style="color: #333333">/</span> <span style="color: #0000DD; font-weight: bold">2</span> <span style="color: #333333">-</span> i<span style="color: #333333">)</span> <span style="color: #333333">+</span> nbInter<span style="color: #333333">(</span>deuxiemeChar<span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">2</span> <span style="color: #333333">*</span> i<span style="color: #333333">));</span>
		<span style="color: #333333">}</span> <span style="color: #888888">// On imprime deux lignes à la fois! On ajuste le nombreDeLignes par + 1. Il y a</span>
		<span style="color: #888888">// un nombre pair de motifs qui entourent les motifs avec les trios</span>
		<span style="color: #008800; font-weight: bold">if</span> <span style="color: #333333">(</span>nombreDeLignes <span style="color: #333333">%</span> <span style="color: #0000DD; font-weight: bold">2</span> <span style="color: #333333">==</span> <span style="color: #0000DD; font-weight: bold">1</span><span style="color: #333333">)</span> <span style="color: #333333">{</span> <span style="color: #888888">// Comme on imprime un nombre pair de lignes, il faut retirer</span>
			<span style="color: #888888">// la dernière dans le cas où le nombre de lignes est impair.</span>
			texte<span style="color: #333333">.</span><span style="color: #0000CC">remove</span><span style="color: #333333">(</span>nombreDeLignes<span style="color: #333333">);</span> <span style="color: #888888">// Le rang du n+1 ième élément est n.</span>
		<span style="color: #333333">}</span>
		<span style="color: #008800; font-weight: bold">for</span> <span style="color: #333333">(</span>String <span style="color: #997700; font-weight: bold">e:</span> texte<span style="color: #333333">)</span> <span style="color: #333333">{</span> <span style="color: #888888">// Affiche le texte à l&#39;écran ligne par ligne.</span>
			System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span>e<span style="color: #333333">);</span>
		<span style="color: #333333">}</span>
	<span style="color: #333333">}</span>

	<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
		pyramide<span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;#&quot;</span><span style="color: #333333">,</span> <span style="background-color: #fff0f0">&quot;?&quot;</span><span style="color: #333333">,</span> <span style="color: #0000DD; font-weight: bold">100</span><span style="color: #333333">);</span>
	<span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>


</div>

</div>


<h2>Question 13</h2>

<p>Écrivez un programme efficace Java qui prend la chaîne de caractère « 124213 » et en extrait les nombres 1, 2, 4, 2, 1, 3.</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Exemple</span> <span style="color: #333333">{</span>
  <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> <span style="color: #0066BB; font-weight: bold">extrait</span><span style="color: #333333">(</span>String s<span style="color: #333333">)</span> <span style="color: #333333">{</span>
    <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[]</span> answer <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> <span style="color: #333399; font-weight: bold">int</span><span style="color: #333333">[</span>s<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">()];</span>
    <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> index <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span> index <span style="color: #333333">&lt;</span> s<span style="color: #333333">.</span><span style="color: #0000CC">length</span><span style="color: #333333">();</span> index<span style="color: #333333">++)</span> <span style="color: #333333">{</span>
      answer<span style="color: #333333">[</span>index<span style="color: #333333">]</span> <span style="color: #333333">=</span> Character<span style="color: #333333">.</span><span style="color: #0000CC">digit</span><span style="color: #333333">(</span>s<span style="color: #333333">.</span><span style="color: #0000CC">charAt</span><span style="color: #333333">(</span>index<span style="color: #333333">),</span> <span style="color: #0000DD; font-weight: bold">10</span><span style="color: #333333">);</span>
    <span style="color: #333333">}</span>
    <span style="color: #008800; font-weight: bold">return</span> answer<span style="color: #333333">;</span>
  <span style="color: #333333">}</span>

  <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
    <span style="color: #008800; font-weight: bold">for</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">int</span> <span style="color: #997700; font-weight: bold">x:</span> extrait<span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;124213&quot;</span><span style="color: #333333">))</span> <span style="color: #333333">{</span>
      System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span>x<span style="color: #333333">);</span>
    <span style="color: #333333">}</span>
  <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>


</div>

</div>

<h2>Question 14</h2>

<p>Qu&#x2019;est-ce qui s&#x2019;affiche à l&#x2019;exécution du bout de code
suivant :</p>
<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Main <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#bb7977; '>void</span> main<span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>String</span> args<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>true</span><span style='color:#808030; '>)</span>
    <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>false</span><span style='color:#808030; '>)</span>
    <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>true</span><span style='color:#808030; '>)</span>         
        <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"avant le premier else"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#800000; font-weight:bold; '>else</span>              
        <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"après le premier else"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span><span style='color:#800000; font-weight:bold; '>true</span><span style='color:#808030; '>)</span>         
        <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"avant le second else"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
    <span style='color:#800000; font-weight:bold; '>else</span>              
        <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"après le second else"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
 <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2021-04-23 17:56:50 UTC -->

<p>Expliquer pourquoi.</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div> <p>Le code affiche « avant le second else ».</p>
<p>En effet le second if est évalué à false, et toute l&#x2019;instruction qui
suit (y compris l&#x2019;évaluation du else qui se rapporte au if de cette
instruction) n&#x2019;est pas exécutée ; l&#x2019;instruction suivante
c&#x2019;est le tout dernier if, qui est évalué à true, et donc le else qui
s&#x2019;y rapporte n&#x2019;est pas évalué.</p>
</div>
</div>

<h2>Question 15</h2>


<p>Soit les deux bouts de code suivants :</p>

<p>a)</p>

<pre style='color:#000000;background:#ffffff;'>for (int j=0<span style='color:#808030; '>;</span> j &lt; 10<span style='color:#808030; '>;</span> j++) <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>j<span style='color:#808030; '>=</span><span style='color:#808030; '>=</span><span style='color:#008c00; '>5</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    <span style='color:#800000; font-weight:bold; '>continue</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  Instruction
<span style='color:#800080; '>}</span>
</pre>
<p>b)</p>
<pre style='color:#000000;background:#ffffff;'>for (int j=0<span style='color:#808030; '>;</span> j &lt; 10<span style='color:#808030; '>;</span>j++) <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>j<span style='color:#808030; '>=</span><span style='color:#808030; '>=</span><span style='color:#008c00; '>5</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    <span style='color:#800000; font-weight:bold; '>break</span><span style='color:#800080; '>;</span>
  <span style='color:#800080; '>}</span>
  Instruction
<span style='color:#800080; '>}</span>
</pre>


<p>Que se passe-t-il dans chacun des cas quant à l&#x2019;exécution de
Instruction quand j vaut 5?</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>En a) Instruction n&#x2019;est pas exécutée et on passe au tour suivant, le
7eme tour de la boucle (i=6) où, comme lors des autres tours précédant i=5,
Instruction sera exécutée.</p>

<p>En b) on sort de la boucle, Instruction ne sera plus jamais exécutée.</p>
</div>
</div>

<h2>Question 16</h2>

<p>Soit les deux bouts de code suivants :</p>

<p>a)</p>

<pre style='color:#000000;background:#ffffff;'>label:
for (int i=0<span style='color:#808030; '>;</span> i &lt; 10<span style='color:#808030; '>;</span>i++) <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>for</span> <span style='color:#808030; '>(</span><span style='color:#bb7977; '>int</span> j<span style='color:#808030; '>=</span><span style='color:#008c00; '>0</span><span style='color:#800080; '>;</span> j <span style='color:#808030; '>&lt;</span> <span style='color:#008c00; '>6</span><span style='color:#800080; '>;</span> j<span style='color:#808030; '>+</span><span style='color:#808030; '>+</span><span style='color:#808030; '>)</span><span style='color:#800080; '>{</span>
    <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>condition<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
      <span style='color:#800000; font-weight:bold; '>continue</span> label<span style='color:#800080; '>;</span>
    <span style='color:#800080; '>}</span>
   Instruction1
   <span style='color:#800080; '>}</span>
  Instruction2
<span style='color:#800080; '>}</span>
</pre>

<p>b)</p>
<pre style='color:#000000;background:#ffffff;'>for (int i=0<span style='color:#808030; '>;</span> i &lt; 10<span style='color:#808030; '>;</span> i++) <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>for</span><span style='color:#808030; '>(</span><span style='color:#bb7977; '>int</span> j<span style='color:#808030; '>=</span><span style='color:#008c00; '>0</span><span style='color:#800080; '>;</span> j <span style='color:#808030; '>&lt;</span> <span style='color:#008c00; '>6</span><span style='color:#800080; '>;</span> j<span style='color:#808030; '>+</span><span style='color:#808030; '>+</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    <span style='color:#800000; font-weight:bold; '>if</span><span style='color:#808030; '>(</span>condition<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
     <span style='color:#800000; font-weight:bold; '>continue</span> <span style='color:#800080; '>;</span>
    <span style='color:#800080; '>}</span>
    Instruction1
  <span style='color:#800080; '>}</span>
  Instruction2
<span style='color:#800080; '>}</span>
</pre>

<p>Dans quel cas (quel bout de code et quelle condition) Instruction1 n'est pas
exécuté? Y'a-t-il une situation où Instruction2 n'est pas exécuté? Si oui
laquelle?</p>
<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Instruction1 n&#x2019;est pas exécuté, dans tous les cas lorsque condition
est vraie.</p>

<p>Instruction2 est toujours exécuté.</p>
</div>
</div>

<h2>Question 17</h2>

<p>Soit le code suivant :</p>
<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Main <span style='color:#800080; '>{</span>
 <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#bb7977; '>void</span> main<span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>String</span><span style='color:#808030; '>[</span><span style='color:#808030; '>]</span> args<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
   <span style='color:#800000; font-weight:bold; '>final</span> <span style='color:#bb7977; '>int</span> NBRE <span style='color:#808030; '>=</span> <span style='color:#008c00; '>10</span><span style='color:#800080; '>;</span>
   <span style='color:#bb7977; '>int</span> i<span style='color:#800080; '>;</span>
   <span style='color:#bb7977; '>double</span> harmonique<span style='color:#800080; '>;</span>
   harmonique <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span><span style='color:#800080; '>;</span>
   <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"somme des "</span> <span style='color:#808030; '>+</span> NBRE <span style='color:#808030; '>+</span> <span style='color:#0000e6; '>" premiers termes de la série harmonique"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   <span style='color:#800000; font-weight:bold; '>for</span> <span style='color:#808030; '>(</span>i <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span><span style='color:#800080; '>;</span> i <span style='color:#808030; '>&lt;</span> NBRE<span style='color:#800080; '>;</span> i<span style='color:#808030; '>+</span><span style='color:#808030; '>+</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
      harmonique <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> <span style='color:#808030; '>(</span><span style='color:#bb7977; '>double</span><span style='color:#808030; '>)</span><span style='color:#008c00; '>1</span><span style='color:#808030; '>/</span><span style='color:#808030; '>(</span>i<span style='color:#808030; '>+</span><span style='color:#008c00; '>1</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   <span style='color:#800080; '>}</span>
   <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Somme : "</span> <span style='color:#808030; '>+</span> harmonique<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
 <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2021-04-23 17:59:13 UTC -->

<p>Réecrire le même code en utilisant les syntaxes de l&#x2019;instruction
while et de l&#x2019;instruction do&#x2026;while.</p>
<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>Instruction while.</p>
<pre style='color:#000000;background:#ffffff;'><span style='color:#004a43; '>public</span> class Main <span style='color:#808030; '>{</span>
 <span style='color:#004a43; '>public</span> static void main<span style='color:#808030; '>(</span>String<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span> args<span style='color:#808030; '>)</span> <span style='color:#808030; '>{</span>
   final <span style='color:#800000; font-weight:bold; '>int</span> NBRE <span style='color:#808030; '>=</span> <span style='color:#008c00; '>10</span><span style='color:#696969; '>;</span>
   <span style='color:#800000; font-weight:bold; '>int</span> i<span style='color:#808030; '>=</span><span style='color:#008c00; '>0</span><span style='color:#696969; '>;</span>
   double harmonique<span style='color:#696969; '>;</span>
   harmonique <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span><span style='color:#696969; '>;</span>
   System.<span style='color:#800000; font-weight:bold; '>out</span>.println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"somme des "</span> <span style='color:#808030; '>+</span> NBRE <span style='color:#808030; '>+</span> <span style='color:#0000e6; '>" premiers termes de la série harmonique"</span><span style='color:#808030; '>)</span><span style='color:#696969; '>;</span>
   <span style='color:#004a43; '>while</span> <span style='color:#808030; '>(</span>i <span style='color:#808030; '>&lt;</span> NBRE<span style='color:#808030; '>)</span> <span style='color:#808030; '>{</span>
     harmonique <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> <span style='color:#808030; '>(</span>double<span style='color:#808030; '>)</span><span style='color:#008c00; '>1</span><span style='color:#808030; '>/</span><span style='color:#808030; '>(</span>i<span style='color:#808030; '>+</span><span style='color:#008c00; '>1</span><span style='color:#808030; '>)</span><span style='color:#696969; '>;</span>
     i<span style='color:#808030; '>+</span><span style='color:#808030; '>+</span><span style='color:#696969; '>;</span>
   <span style='color:#808030; '>}</span>
   System.<span style='color:#800000; font-weight:bold; '>out</span>.println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Somme : "</span> <span style='color:#808030; '>+</span> harmonique<span style='color:#808030; '>)</span><span style='color:#696969; '>;</span>
 <span style='color:#808030; '>}</span>
<span style='color:#808030; '>}</span>
</pre>

<p>Instruction do&#x2026;while</p>
<pre style='color:#000000;background:#ffffff;'><span style='color:#004a43; '>public</span> class Main <span style='color:#808030; '>{</span>
 <span style='color:#004a43; '>public</span> static void main<span style='color:#808030; '>(</span>String<span style='color:#808030; '>[</span><span style='color:#808030; '>]</span> args<span style='color:#808030; '>)</span> <span style='color:#808030; '>{</span>
   final <span style='color:#800000; font-weight:bold; '>int</span> NBRE <span style='color:#808030; '>=</span> <span style='color:#008c00; '>10</span><span style='color:#696969; '>;</span>
   <span style='color:#800000; font-weight:bold; '>int</span> i <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span><span style='color:#696969; '>;</span>
   double harmonique<span style='color:#696969; '>;</span>
   harmonique <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span><span style='color:#696969; '>;</span>
   System.<span style='color:#800000; font-weight:bold; '>out</span>.println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"somme des "</span> <span style='color:#808030; '>+</span> NBRE <span style='color:#808030; '>+</span> <span style='color:#0000e6; '>" premiers termes de la série harmonique"</span><span style='color:#808030; '>)</span><span style='color:#696969; '>;</span>
   do <span style='color:#808030; '>{</span>
     harmonique <span style='color:#808030; '>+</span><span style='color:#808030; '>=</span> <span style='color:#808030; '>(</span>double<span style='color:#808030; '>)</span><span style='color:#008c00; '>1</span><span style='color:#808030; '>/</span><span style='color:#808030; '>(</span>i<span style='color:#808030; '>+</span><span style='color:#008c00; '>1</span><span style='color:#808030; '>)</span><span style='color:#696969; '>;</span>
     i<span style='color:#808030; '>+</span><span style='color:#808030; '>+</span><span style='color:#696969; '>;</span>
   <span style='color:#808030; '>}</span> <span style='color:#004a43; '>while</span> <span style='color:#808030; '>(</span>i &lt; NBRE);</span>
   System.<span style='color:#800000; font-weight:bold; '>out</span>.println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Somme : "</span> <span style='color:#808030; '>+</span> harmonique<span style='color:#808030; '>)</span><span style='color:#696969; '>;</span>
 <span style='color:#808030; '>}</span>
<span style='color:#808030; '>}</span>
</pre>
<!--Created using ToHtml.com on 2021-05-18 17:20:22 UTC -->
</div>
</div>

<h2>Question 18</h2>

<p>Soit le code suivant :</p>
<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>util</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>Scanner</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Main <span style='color:#800080; '>{</span>
 <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#bb7977; '>void</span> main<span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>String</span><span style='color:#808030; '>[</span><span style='color:#808030; '>]</span> args<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
        <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Donnez un nombre entier"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span> 
   <span style='color:#bb7977; font-weight:bold; '>Scanner</span> scan <span style='color:#808030; '>=</span> new Scanner<span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>in<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   <span style='color:#bb7977; '>int</span> n <span style='color:#808030; '>=</span> scan<span style='color:#808030; '>.</span>nextInt<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>n<span style='color:#808030; '>=</span><span style='color:#808030; '>=</span><span style='color:#008c00; '>10</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
     <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Le nombre vaut 10"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   <span style='color:#800080; '>}</span> <span style='color:#800000; font-weight:bold; '>else</span> <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>n <span style='color:#808030; '>=</span><span style='color:#808030; '>=</span> <span style='color:#008c00; '>100</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
     <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Le nombre vaut 100"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   <span style='color:#800080; '>}</span> <span style='color:#800000; font-weight:bold; '>else</span> <span style='color:#800000; font-weight:bold; '>if</span> <span style='color:#808030; '>(</span>n <span style='color:#808030; '>=</span><span style='color:#808030; '>=</span> <span style='color:#008c00; '>1000</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
     <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Le nombre vaut 1000"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   <span style='color:#800080; '>}</span> <span style='color:#800000; font-weight:bold; '>else</span> <span style='color:#800080; '>{</span>
     <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Le nombre  n'est pas une puissance de 10 ou il est plus grand que 1000"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
   <span style='color:#800080; '>}</span>
 <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
<!--Created using ToHtml.com on 2021-04-23 17:57:45 UTC -->

<p>Réécrire le même programme avec l'instruction switch.</p>
<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<pre style='color:#000000;background:#ffffff;'>
<span style='color:#800000; font-weight:bold; '>import</span><span style='color:#004a43; '> java</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>util</span><span style='color:#808030; '>.</span><span style='color:#004a43; '>Scanner</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Main <span style='color:#800080; '>{</span>
<span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#bb7977; '>void</span> main<span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>String</span><span style='color:#808030; '>[</span><span style='color:#808030; '>]</span> args<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
<span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Donnez un nombre entier"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#bb7977; font-weight:bold; '>Scanner</span> scan <span style='color:#808030; '>=</span> <span style='color:#800000; font-weight:bold; '>new</span> <span style='color:#bb7977; font-weight:bold; '>Scanner</span><span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>in<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#bb7977; '>int</span> n <span style='color:#808030; '>=</span> scan<span style='color:#808030; '>.</span>nextInt<span style='color:#808030; '>(</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>switch</span><span style='color:#808030; '>(</span>n<span style='color:#808030; '>)</span>
<span style='color:#800080; '>{</span>
<span style='color:#800000; font-weight:bold; '>case</span> <span style='color:#008c00; '>10</span> <span style='color:#808030; '>:</span>
<span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Le nombre vaut 10"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>break</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>case</span> <span style='color:#008c00; '>100</span> <span style='color:#808030; '>:</span>
<span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Le nombre vaut 100"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>break</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>case</span> <span style='color:#008c00; '>1000</span> <span style='color:#808030; '>:</span>
<span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Le nombre vaut 1000"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>break</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>default</span><span style='color:#808030; '>:</span>
<span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span><span style='color:#0000e6; '>"Le nombre n'est pas une puissance de 10 ou il est plus grand que 1000"</span><span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
<span style='color:#800000; font-weight:bold; '>break</span><span style='color:#800080; '>;</span>
<span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
<!--Created using ToHTML.com on 2023-08-07 21:42:00 UTC -->
</pre>
<!--Created using ToHtml.com on 2021-04-23 17:58:20 UTC --></div>
</div>



<h2>Question 19</h2>

<p>Étant donné le tableau <tt>String[] x = new String[10]</tt>, que vaut <tt>x[0]</tt>.</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<p>En Java, les tableaux sont initialisées à une valeur nulle par défaut. Dans ce cas, <tt>x[0]</tt> prendra donc la valeur <tt>null</tt>. Cette valeur spéciale ne correspond pas à une instance de la classe String. On peut, par contre, assigner une valeur (<tt>x[0]="123"</tt>).</p>
</div>
</div>


<h2>Question 20</h2>

<p>Énumérer toutes les paires d'entiers entre 0 et 1000 en ordre lexicographique.</p>

<div class="accordeon">
<p class="titre">Réponse<span class="iconeEtatAccordeon">&nbsp;</span></p>
<div>
<pre style='color:#000000;background:#ffffff;'><span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>class</span> Liste <span style='color:#800080; '>{</span>
  <span style='color:#800000; font-weight:bold; '>public</span> <span style='color:#800000; font-weight:bold; '>static</span> <span style='color:#bb7977; '>void</span> main<span style='color:#808030; '>(</span><span style='color:#bb7977; font-weight:bold; '>String</span><span style='color:#808030; '>[</span><span style='color:#808030; '>]</span> args<span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
    <span style='color:#800000; font-weight:bold; '>for</span><span style='color:#808030; '>(</span><span style='color:#bb7977; '>int</span> i <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span><span style='color:#800080; '>;</span> i <span style='color:#808030; '>&lt;</span><span style='color:#808030; '>=</span> <span style='color:#008c00; '>1000</span><span style='color:#800080; '>;</span> i<span style='color:#808030; '>+</span><span style='color:#808030; '>+</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
      <span style='color:#800000; font-weight:bold; '>for</span><span style='color:#808030; '>(</span><span style='color:#bb7977; '>int</span> j <span style='color:#808030; '>=</span> <span style='color:#008c00; '>0</span><span style='color:#800080; '>;</span> j <span style='color:#808030; '>&lt;</span><span style='color:#808030; '>=</span> <span style='color:#008c00; '>1000</span><span style='color:#800080; '>;</span> j<span style='color:#808030; '>+</span><span style='color:#808030; '>+</span><span style='color:#808030; '>)</span> <span style='color:#800080; '>{</span>
        <span style='color:#bb7977; font-weight:bold; '>System</span><span style='color:#808030; '>.</span>out<span style='color:#808030; '>.</span>println<span style='color:#808030; '>(</span>i<span style='color:#808030; '>+</span><span style='color:#0000e6; '>" "</span><span style='color:#808030; '>+</span>j<span style='color:#808030; '>)</span><span style='color:#800080; '>;</span>
      <span style='color:#800080; '>}</span>
    <span style='color:#800080; '>}</span>
  <span style='color:#800080; '>}</span>
<span style='color:#800080; '>}</span>
</pre>
</div>
</div>