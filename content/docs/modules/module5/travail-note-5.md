---
title: "Travail noté 5"
weight: 4
---

<h1>Travail noté 5 - Héritage et polymorphisme</h1>


<p>Prenez note qu'<a href="https://rc-inf1220.teluq.ca/">il est permis d'utiliser le robot conversationnel du cours lors des travaux notés</a>. Cependant vous devez produire vos propres réponses et vos propres analyses.</p>

<p>Vous devez remettre ce travail dans 1 (seul) document pdf  et déposer celui-ci sur le site de dépôt des travaux de la TÉLUQ : <a href="https://www.teluq.ca/depot-travaux-etudiant">http://www.teluq.ca/depot-travaux-etudiant</a>. Vous ne pouvez utiliser l'outil de dépôt qu'après le début de votre cours et avant la fin de votre cours, et seulement si vous avez été  inscript au cours. En aucun cas est-ce que nous pouvons recevoir vos travaux par courriel. Les travaux transmis par courriel au sein du cours INF 1220 ne seront pas corrigés et recevrons une note de zéro. Il pourrait n'y avoir aucun avertissement : le dépôt du travail dans les délais  est votre responsabilité. Si vous éprouvez des difficultés techniques avec l'outil de dépôt, vous devez joindre l'Université pour obtenir de l'aide. </p>

<p>Avant de faire le travail, assurez-vous d'avoir fait tous les exercices et toutes les lectures. Posez des questions au besoin. Ne commencez le travail que lorsque vous êtes certain de bien maîtriser la matière.</p>

<p>Vous  devez remettre un fichier PDF contenant votre code. Vous ne devez pas inclure votre code Java en fichiers distincts.  Pour faciliter la correction, assurez-vous qu'on puisse copier-coller du texte à partir du document PDF.  Si votre document ne permet pas de copier-coller, il pourra être refusé ou une note de zéro pourra être attribuée. Les travaux écrits à la main seront refusés. N'utilisez pas des saisies d'écran.</p>

<p>On s'attend à ce que vous utilisiez l'Internet pour faire ce travail.</p>


<p>Si vous avez des questions sur le travail, vous pouvez communiquer avec <a href="https://www.teluq.ca/siteweb/univ/dlemire.html">le professeur responsable</a>. Attention: nous ne donnons jamais d'indice (à quiconque) sur les travaux notés au-delà de ce qui est déjà dans l'énoncé (ce serait inéquitable).</p>


<p> Le cours comprend plusieurs exemples avec solutions. Par contre, les solutions des travaux notés ne sont jamais transmises dans ce cours: si vous avez des questions sur vos résultats, vous pouvez poser des questions au professeur.  Assurez-vous de poser des questions précises, et prenez le temps de consulter la rétroaction du correcteur. (Indice: si vous demandez les solutions suite à la correction de votre travail, vous nous indiquez que vous n'avez pas bien lu les consignes.)</p>



<p>Les travaux au sein de ce cours sont des travaux individuels. Il est strictement défendu de discuter du travail noté avec quiconque. En particulier, des échanges au sein de réseaux sociaux (Facebook, etc.) concernant ce travail peuvent constituer une faute académique. Vous pourriez obtenir la note de zéro ou recevoir une sanction allant jusqu'à l'exclusion du programme dans lequel vous êtes inscrit si vous avez des discussions en ligne au sujet des travaux notés de ce cours.</p>

<h2>Les reports de la date de fin de cours</h2>


<p><strong>Rappel</strong>: le professeur ne peut pas modifier votre date de fin de cours  peu importe votre situation. Le moment après la date de fin de cours où votre dossier est fermé et où vous recevez (éventuellement) un incomplet est géré par l'Université. Il est de votre responsabilité de bien planifier votre temps.  Si vous avez des problèmes personnels qui limitent vos progrès (maladie, deuil, etc.), il faut voir avec l'Université: les professeurs n'ont aucune prise sur les dates de fin, sur les dates d'examen, etc. </p>

<p>Votre date de fin de cours est inscrite dans votre dossier et vous pouvez la trouver sur le portail étudiant et sur la documentation qu'on vous a remise lors de votre inscription. Il est possible que votre examen ait lieu des semaines ou même des mois après votre date de fin de cours: cela ne constitue pas une extension de votre date de fin de cours. Tout travail remis après votre date de fin de cours pourra recevoir la note de zéro. En tout temps, la note « incomplet » peut être attribuée à un travail qui n'est pas remis après votre date de fin de cours, même si vous n'avez pas encore passé l'examen.</p>

<h1>Question #1</h1>
<p>Voici le code suivant :</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">abstract</span> <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Animaux</span> <span style="color: #333333">{</span>
   <span style="color: #008800; font-weight: bold">abstract</span> <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">greeting</span><span style="color: #333333">();</span>
<span style="color: #333333">}</span>
<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Chat</span> <span style="color: #008800; font-weight: bold">extends</span> Animaux <span style="color: #333333">{</span>
   <span style="color: #555555; font-weight: bold">@Override</span>
   <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">greeting</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
      System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Meow!&quot;</span><span style="color: #333333">);</span>
   <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Chien</span> <span style="color: #008800; font-weight: bold">extends</span> Animaux <span style="color: #333333">{</span>
   <span style="color: #555555; font-weight: bold">@Override</span>
   <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">greeting</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
      System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Woof!&quot;</span><span style="color: #333333">);</span>
   <span style="color: #333333">}</span>
   
   <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">greeting</span><span style="color: #333333">(</span>Chien another<span style="color: #333333">)</span> <span style="color: #333333">{</span>
      System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Woooooooooof!&quot;</span><span style="color: #333333">);</span>
   <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">GrosChien</span> <span style="color: #008800; font-weight: bold">extends</span> Chien <span style="color: #333333">{</span>
   <span style="color: #555555; font-weight: bold">@Override</span>
   <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">greeting</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
      System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Woow!&quot;</span><span style="color: #333333">);</span>
   <span style="color: #333333">}</span>
   
   <span style="color: #555555; font-weight: bold">@Override</span>
   <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">greeting</span><span style="color: #333333">(</span>Chien another<span style="color: #333333">)</span> <span style="color: #333333">{</span>
      System<span style="color: #333333">.</span><span style="color: #0000CC">out</span><span style="color: #333333">.</span><span style="color: #0000CC">println</span><span style="color: #333333">(</span><span style="background-color: #fff0f0">&quot;Woooooowwwww!&quot;</span><span style="color: #333333">);</span>
   <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>

<p>Rappelez-vous qu'une classe publique en Java doit toujours apparaître dans un fichier ayant un nom correspondant.</p>

<p>Veuillez expliquer en quelques phrases les résultats ou les erreurs suivantes lors de l'utilisation de ces classes :</p>

<div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Main</span> <span style="color: #333333">{</span>
   <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">static</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">main</span><span style="color: #333333">(</span>String<span style="color: #333333">[]</span> args<span style="color: #333333">)</span> <span style="color: #333333">{</span>
      Chat cat1 <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> Chat<span style="color: #333333">();</span>
      cat1<span style="color: #333333">.</span><span style="color: #0000CC">greeting</span><span style="color: #333333">();</span>
      Chien dog1 <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> Chien<span style="color: #333333">();</span>
      dog1<span style="color: #333333">.</span><span style="color: #0000CC">greeting</span><span style="color: #333333">();</span>
      GrosChien bigDog1 <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> GrosChien<span style="color: #333333">();</span>
      bigDog1<span style="color: #333333">.</span><span style="color: #0000CC">greeting</span><span style="color: #333333">();</span>
       
      Animaux animal1 <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> Chien <span style="color: #333333">();</span>
      animal1<span style="color: #333333">.</span><span style="color: #0000CC">greeting</span><span style="color: #333333">();</span>
      Animaux animal2 <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> Chien<span style="color: #333333">();</span>
      animal2<span style="color: #333333">.</span><span style="color: #0000CC">greeting</span><span style="color: #333333">();</span>
      Animaux animal3 <span style="color: #333333">=</span> <span style="color: #008800; font-weight: bold">new</span> GrosChien<span style="color: #333333">();</span>
      animal3<span style="color: #333333">.</span><span style="color: #0000CC">greeting</span><span style="color: #333333">();</span>
      
      Chien dog2 <span style="color: #333333">=</span> <span style="color: #333333">(</span>Chien<span style="color: #333333">)</span>animal2<span style="color: #333333">;</span>
      GrosChien bigDog2 <span style="color: #333333">=</span> <span style="color: #333333">(</span>GrosChien<span style="color: #333333">)</span>animal3<span style="color: #333333">;</span>
      Chien dog3 <span style="color: #333333">=</span> <span style="color: #333333">(</span>Chien<span style="color: #333333">)</span>animal3<span style="color: #333333">;</span>
      dog2<span style="color: #333333">.</span><span style="color: #0000CC">greeting</span><span style="color: #333333">(</span>dog3<span style="color: #333333">);</span>
      dog3<span style="color: #333333">.</span><span style="color: #0000CC">greeting</span><span style="color: #333333">(</span>dog2<span style="color: #333333">);</span>
      dog2<span style="color: #333333">.</span><span style="color: #0000CC">greeting</span><span style="color: #333333">(</span>bigDog2<span style="color: #333333">);</span>
      bigDog2<span style="color: #333333">.</span><span style="color: #0000CC">greeting</span><span style="color: #333333">(</span>dog2<span style="color: #333333">);</span>
      bigDog2<span style="color: #333333">.</span><span style="color: #0000CC">greeting</span><span style="color: #333333">(</span>bigDog1<span style="color: #333333">);</span>
      Chat cat2 <span style="color: #333333">=</span> <span style="color: #333333">(</span>Chat<span style="color: #333333">)</span>animal2<span style="color: #333333">;</span>
   <span style="color: #333333">}</span>
<span style="color: #333333">}</span>
</pre></div>





<iframe height="800px" width="100%" src="https://repl.it/@lemire/dog?lite=true" scrolling="no" frameborder="no" allowtransparency="true" allowfullscreen="true" sandbox="allow-forms allow-pointer-lock allow-popups allow-same-origin allow-scripts allow-modals"></iframe>

<h1>Question #2</h1>

<p>En tant que programmeur, vous recevez le code suivant. Vous devez appliquer l'héritage afin que Cercle et Carré héritent à la fois de Forme et Resizable. Vous pouvez bien entendu modifier le code reçu. Utilisez votre bon jugement. Votre solution doit comprendre au moins une classe abstraite. Vous devez expliquer vos choix de manière détaillée: un travail remis avec des explications insuffisantes pourra se voir attribué la note de zéro, sans droit de reprise.</p>

<!-- HTML generated using hilite.me --><div style="background: #ffffff; overflow:auto;width:auto;border:solid gray;border-width:.1em .1em .1em .8em;padding:.2em .6em;"><pre style="margin: 0; line-height: 125%"><span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Cercle</span> <span style="color: #333333">{</span>
    
    <span style="color: #333399; font-weight: bold">double</span> diametre <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #0066BB; font-weight: bold">Cercle</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">double</span> diametre<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">diametre</span> <span style="color: #333333">=</span> diametre<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">double</span> <span style="color: #0066BB; font-weight: bold">getPerimeter</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">return</span>  Math<span style="color: #333333">.</span><span style="color: #0000CC">PI</span> <span style="color: #333333">*</span> diametre<span style="color: #333333">;</span>
    <span style="color: #333333">}</span> 
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">resize</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">double</span> diametre<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">diametre</span> <span style="color: #333333">=</span> diametre;
    <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Carre</span> <span style="color: #333333">{</span>
    
    <span style="color: #333399; font-weight: bold">double</span> taille <span style="color: #333333">=</span> <span style="color: #0000DD; font-weight: bold">0</span><span style="color: #333333">;</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #0066BB; font-weight: bold">Carre</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">double</span> taille<span style="color: #333333">)</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">taille</span> <span style="color: #333333">=</span> taille<span style="color: #333333">;</span>
    <span style="color: #333333">}</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">double</span> <span style="color: #0066BB; font-weight: bold">getPerimeter</span><span style="color: #333333">()</span> <span style="color: #333333">{</span>
        <span style="color: #008800; font-weight: bold">return</span> taille<span style="color: #333333">*</span><span style="color: #0000DD; font-weight: bold">4</span><span style="color: #333333">;</span>
    <span style="color: #333333">}</span> 
    

     <span style="color: #008800; font-weight: bold">public</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">resize</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">double</span> taille<span style="color: #333333">)</span> <span style="color: #333333">{</span>
         <span style="color: #008800; font-weight: bold">this</span><span style="color: #333333">.</span><span style="color: #0000CC">taille</span> <span style="color: #333333">=</span> taille<span style="color: #333333">;</span>
     <span style="color: #333333">}</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">abstract</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Resizable</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">abstract</span> <span style="color: #333399; font-weight: bold">void</span> <span style="color: #0066BB; font-weight: bold">resize</span><span style="color: #333333">(</span><span style="color: #333399; font-weight: bold">double</span> d<span style="color: #333333">);</span>
    
<span style="color: #333333">}</span>

<span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">abstract</span> <span style="color: #008800; font-weight: bold">class</span> <span style="color: #BB0066; font-weight: bold">Forme</span> <span style="color: #333333">{</span>
    
    <span style="color: #008800; font-weight: bold">public</span> <span style="color: #008800; font-weight: bold">abstract</span> <span style="color: #333399; font-weight: bold">double</span> <span style="color: #0066BB; font-weight: bold">getPerimeter</span><span style="color: #333333">();</span>
<span style="color: #333333">}</span>


</div>

<p><a href="https://replit.com/@lemire/dog#Main.java">https://replit.com/@lemire/dog#Main.java</a></p>


<h1>Question #3</h1>

<p> À quoi servent les interfaces en Java ? Utilisez la question précédente (2) comme base de discussion. Maximum 5 phrases.</p>





<h2>En terminant</h2>
<p>Dans plusieurs cas, vos travaux sont corrigés par un « correcteur ». Il est possible que vous puissiez identifier cette personne en examinant le document de rétroaction que vous recevez au sein du portail étudiant. Vous ne devriez jamais joindre cette personne. Cette personne n'a pas comme mandat de répondre à vos questions suite à la correction. Vos courriels seront ignorés. Il faut plutôt joindre la personne qui vous encadre au sein du cours.</p>

<h3>Robot conversationnel – Questionnaire de retour sur expérience</h3>
<p>Qu’avez-vous pensé du robot conversationnel du cours? Votre avis compte pour nous. Nous vous invitons à compléter le
    <a href="https://forms.office.com/r/hUmgu60KuN" target="_blank" rel="noopener">questionnaire de retour sur expérience</a> (5 minutes). Nous vous remercions pour votre contribution à notre projet pilote.</p>
