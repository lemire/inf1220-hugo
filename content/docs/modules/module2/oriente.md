---
title: "Création d'une classe en Java"
weight: 20
---


# Création d'une classe en Java

Créer une classe en Java, c’est définir un nouveau type d’objet qui regroupe à la fois des données (appelées attributs ou champs) et des comportements (appelés méthodes). Cette approche permet de modéliser des entités du monde réel ou conceptuel de façon structurée et réutilisable. Une classe sert de «&nbsp;plan&nbsp;» pour fabriquer des objets : chaque objet créé à partir d’une classe possède ses propres valeurs pour les attributs, mais partage les mêmes méthodes. La programmation orientée objet favorise ainsi la modularité, la clarté et la maintenance du code, car chaque classe peut être développée, testée et améliorée indépendamment des autres.

## Un premier programme

<p>
En Java, toutes parties d'un programme informatique doit donc être encapsulée dans une classe. Pour ce faire, il est donc nécessaire de créer un premier fichier de code source qui décrira une première classe et contiendra la description de la méthode "main", la méthode de démarrage (appelé parfois "bootstrap") du programme. Il est possible tout simplement d'utiliser le Bloc-Note avec Windows ou un autre éditeur de texte brut (<strong>ce n'est pas le cas de Microsoft Word!</strong>), d'écrire les lignes de code nécessaire à la création de la classe et de ses fonctions et d'enregistrer ce texte sous l'extension .java (dans l'exemple ci-dessous dans un fichier Main.java).  Voici un exemple d'une première classe qui imprimera dans l'invite de commande un texte de bienvenue.</p>


{{<inlineJava path="Bienvenue.java" lang="java" >}}
/* Ma première classe */
public class Bienvenue {
  public static void main(String args[]) {
    System.out.println("Bienvenue au sein du cours INF1220 !");
  }
}
{{</inlineJava>}}


</details>

<p>Vous devez choisir comment vous allez exécuter ce programme. Vous pouvez le faire sans IDE (avec Bloc-Note et un accès en ligne de commande), en ligne, avec IntelliJ IDEA, avec Netbeans. Vous pouvez même faire des expériences avec plus d'une approche et ne retenir que celle qui vous convient le mieux.</p>

<p>Nous reviendrons dans le cours sur les éléments de programmation nécessaires pour comprendre ce programme. Néanmoins, en voici l'essentiel:</p>
<ol>
<li>Les parties de code situées entre /* et */ sont des commentaires qui ne seront pas compilés. </li>

<li>La première instruction <tt>public class  Bienvenue</tt> indique que nous créons une classe publique (accessible à toutes autres parties du programme) qui se nomme <tt>Bienvenue</tt>. Cette classe doit être enregistrée dans un fichier portant le même nom et la même extension .java. Attention, Java différencie les majuscules et les minuscules. La classe <tt>Bienvenue</tt> est différente de la classe <tt>bienvenue</tt>, et le fichier <tt>bienvenue.java</tt> n'est pas l'équivalent du fichier <tt>Bienvenue.java</tt>. <strong>Important :</strong> La norme de programmation en Java est de toujours commencer un nom de classe par une majuscule. S'il y a plusieurs mots dans le nom de la classe, utiliser une majuscule au début de chaque mot. Par exemple, <tt>TexteBrute</tt> ou <tt>Encrypteur32Bits</tt>.</li>

<li>La classe Bienvenue doit être définie dans un fichier appelé <tt>Bienvenue.java</tt>. Le nom et l'emplacement des fichiers est important en Java.</li>

<li>Java étant un langage orienté objet, tout fichier source définit une classe, c'est-à-dire un objet possédant des champs et des méthodes. La définition de la classe se fait dans un bloc d'instructions contenu entre des accolades ouvrantes <tt>{</tt> et fermantes <tt>}</tt>. C'est ce que l'on appelle la portée. </li>

<li>Notre classe <tt>Bienvenue</tt> contient une unique méthode annoncée par l'instruction <tt>public static void main (String args[])</tt>. Il s'agit de la méthode principale d'un programme, celle qui sera exécutée lors du lancement par la machine virtuelle Java (JVM). Le nom et la déclaration de cette méthode ne peuvent pas être modifiés. Par exemple, la fonction "<tt>public static void main (int x)</tt>" ne sera pas interprétée comme la méthode principale de démarrage.</li>

<li>Pour définir une méthode, il faut donner une suite d'instructions situées entre deux nouvelles accolades. Dans le cas qui nous intéresse, la méthode "<tt>main</tt>" ne comporte qu'une seule instruction qui provoque l'affichage du message «<tt>Bienvenue au sein du cours INF 1220!</tt>», à savoir la méthode <tt>System.out.println</tt>. Les lignes contenant une instruction simple comme celle-ci doivent se terminer par un point-virgule.</li>
</ol>

<strong>Important</strong>: Le code en Java est généralement organisé en «&nbsp;classes&nbsp;». En Java, une classe doit être déclarée et définie dans un fichier qui porte son nom. Ainsi, si votre classe s'appelle "MonChat", vous devez l'enregistrer dans un fichier nommé MonChat.java.

<p><a id="intro" name="sansIDE"></a></p>

## Création d'une classe sans IDE

<p>Créez un fichier au format texte nommé Bienvenue.java et contenant le code suggéré. Le fichier source étant créé et enregistré, nous pouvons passer aux phases de compilation et d'exécution.</p>

<p>Si vous utilisez Windows, vous pouvez suivre cette vidéo&nbsp;:</p>

{{< youtube id="1ttHH5MlNug" >}}


#### Compilation

<p>Le compilateur Java est le programme javac.exe (ou simplement javac sous OSX et Linux) contenu dans le dossier bin du JDK. Pour compiler Bienvenue.java, il faut :</p>

<ol>
<li>ouvrir une invite de commande (sous windows) ou bien Terminal (macos et Linux); </li>

<li>se déplacer dans le dossier de travail dans la console en utilisant la commande cd qui permet de changer de répertoire (ex. "cd /INF1220"); </li>

<li>exécuter la commande "javac Bienvenue.java";</li>
</ol>

<p>Si tout s'est bien passé (c'est à dire qu'il n'y a pas eu d'erreur de compilation), vous obtiendrez dans le même dossier le nouveau fichier Bienvenue.class, qui est le résultat de la compilation. C'est le fichier intermédiaire qui contient le Bytecode et qui sera interprété par  la JVM</p>

<p>Malheureusement, plusieurs erreurs peuvent survenir. Voici quelques causes d'erreurs possibles.</p>

<ul>
<li>Votre environnement ne trouve pas le programme javac.exe. Il faut indiquer le chemin d'accès à ce programme. Pour éviter d'avoir à réécrire à chaque fois le chemin d'accès à javac et aux autres programmes du SDK, il est conseillé d'ajouter ce chemin dans le PATH en complétant le fichier autoexec.bat. </li>

<li>javac.exe s'exécute, mais ne trouve pas bienvenue.java. Le dossier actif de votre console/invite de commande n'est pas celui qui contient Bienvenue.java. Allez dans le bon dossier. </li>

<li>javac.exe s'exécute et trouve bienvenue.java, mais écrit un message d'erreur. Il s'agit en général d'une erreur dans le fichier source. Le message d'erreur vous donne une indication sur la nature de l'erreur et sur la ligne où elle s'est produite. Essayez de comprendre. Dans la plupart des cas, il s'agit :  (i) d'un point-virgule oublié à la fin d'une instruction simple; (ii) d'une faute de syntaxe;  (iii) d'une confusion majuscule/minuscule;  (iv) d'une accolade fermante oubliée. Il vous faut alors corriger l'erreur dans le fichier Bienvenue.java et recommencer la compilation.</li>
</ul>

<p>Prenez bien note des points suivants:</p>

<ol>
<li>Les programmes Java sont écrits dans des fichiers au format texte ayant l'extension «.java». Le nom du fichier (par exemple Bienvenue.java) doit correspondre au code: un fichier Java comporte généralement une déclaration «&nbsp;public class&nbsp;» qui détermine le nom du fichier. Ainsi donc si votre code Java contient la déclaration «&nbsp;public class Bienvenue&nbsp;» alors le fichier doit être nommé Bienvenue.java. La plupart des fichiers en Java ne contiennent qu'une seule «&nbsp;classe&nbsp;».</li>
<li>Un programme Java exécutable doit contenir une méthode nommée «&nbsp;main&nbsp;». Tous les fichiers Java n'ont pas une méthode « main&nbsp;», mais ceux qui en contiennent une peuvent souvent être exécutés.</li>
<li>Beaucoup des exemples dans le cours peuvent être recopiés et exécutés, mais vous devez choisir le bon nom de fichier (correspondant à la classe). Si vous modifiez du code, même très légèrement, et qu'il ne fonctionne plus, revenez en arrière. Il faut avoir beaucoup de rigueur pour programmer, vous ne pouvez pas juste modifier du code en suivant votre instinct et espérer que tout fonctionne. Vous devez apprendre et comprendre avant de pouvoir modifier du code.</li>
<li>Vous ne devez en aucun cas copier du code au sein d'autre code en espérant que tout fonctionne. Le copier-coller sans comprendre ce que l'on fait ne fonctionnera pas. Pour commencer, ne changez absolument rien, rien, au code. Copiez le code à l'identique, caractère par caractère.Tout doit être identique. Le nom de fichier, le nom de la classe, le nom des méthodes, etc.</li>
</ol>

#### Exécution

<p>Après la réussite de la compilation et la création du fichier Bienvenue.class, il faut l'exécuter avec l'interpréteur (la JVM) java.exe (java sous OSX et Linux). À partir de la console/invite de commande, il suffit d'exécuter la commande "java Bienvenue". Si tout se passe bien, on voit apparaître le message prévu : Bienvenue au cours INF 1220!  Sinon, il y a sans doute un problème de répertoire actif ou de chemin d'accès à java.exe</p>

## Vidéo suggérée


{{< youtube id="8nXAvKzqbw0" >}}





## Création d'une classe avec IntelliJ IDEA, sa compilation et son exécution

<p>Si vous avez installé l'IDE IntelliJ IDEA lors de l'activité précédente, vous pouvez maintenant l'utiliser pour écrire et exécuter du code Java.</p>



{{< youtube id="snX2j1HaOhc" >}}



<p>Après avoir lancé IntelliJ IDEA, suivez les consignes suivantes:</p>
<ol>
<li>Choisissez "Create New Project".</li>
<li>Choisissez "Java" et cliquez sur "Next".</li>
<li>Choisissez "Create project from template", puis "Command Line App" et cliquez sur "Next".</li>
<li>Choisissez un nom pour votre project ou utilisez le nom par défaut, puis cliquez sur "Next".</li>

<li>Vous trouverez alors un bout de code. Tapez <tt>System.out.println("Allo");</tt> en plein milieu du code,
remplaçant la ligne qui débute par <tt>//</tt>, entre les deux accolades.</li>
<li>Allez dans le menu "Run" et choisissez "Run Main".</li>
<li>Une console devrait s'ouvrir et vous devriez y voir le texte "Allo".</li>
</ol>
<p>L'IDE IntelliJ  permet, comme les autres IDE, l'ajout de nouvelles classes à un projet.</p>
<p>Tout comme les autres IDE, IntelliJ est difficile d'utilisation pour les débutants. Il expose le débutant à un environnement inutilement complexe. Néanmoins, plusieurs étudiants insistent pour utiliser des IDE. Nous
donnons ici la base, mais si vous souhaitez prendre cette approche, vous devrez apprendre à vous retrouver dans un environnement complexe qui n'est pas destiné aux débutants. Nous vous rappelons que nous n'offrons pas de soutien technique. Si vous avez du mal avec IntelliJ, c'est votre responsabilité de trouver l'information pertinente. L'utilisation IntelliJ est purement optionnelle.</p>

### Vidéo suggérée

(YouTube offre des sous-titres en français.)

{{< youtube id="vaa5gAi9Wko" >}}



<p>L'approche est essentiellement la même pour les autres IDE comme Eclipse et NetBeans. On créé un projet, on écrit son code, et on exécute. Tous les IDE peuvent vous aider à identifier vos erreurs de syntaxe.</p>


## Création d'une classe avec NetBeans, sa compilation et son exécution

<p>Si vous avez installé l'IDE Netbeans lors de l'activité précédente, il est maintenant le temps d'utiliser cet outil de développement très utile, permettant d'accélérer et de simplifier les étapes dans le développement d'une application. Voici les étapes pour réaliser l'équivalent de l'activité précédente.</p>

<ol>
<li>Pour créer un projet aller dans "File" (ou Fichier) et sélectionner "New Project" (Nouveau projet).</li>
<li>Choisir dans la fenêtre de type "Wizard", un projet de type Java (liste de gauche) et Java Application (liste de droite). Appuyer sur "Next" (Suivant).</li>
<li>Entre le nom du projet, par exemple "Exercice1" et assurer vous que la case "Create Main Class" soit cochée. Ceci va créer automatiquement une classe "Exercice1" avec une méthode "main". Appuyer sur "Finish" (Terminer).</li>
<li>Une fois le projet crée, celui-ci apparaît dans la liste des projets à gauche. Vous pouvez avoir plusieurs projets à la fois et naviguez entre les classes de ces projets via l'arborescence. La classe "Exercice1", qui a été auto-générée, apparaît dans la partie droite de la fenêtre de l'IDE.</li>
<li>Copier la ligne "System.out.println("Bienvenue au sein du cours INF1220 !");" et l'ajouter dans la portée de la fonction main. Enregistrer le fichier (via le menu) suite à la modification.</li>
<li>Nous allons maintenant compiler et exécuter cette classe et cette fonction main. Pour ce faire, faite un clique droit sur le fichier "Exercice1.java" dans le fenêtre de gauche et choisir l'option "Run File". L'IDE Netbeans va alors vérifier si le fichier a été modifié. Si c'est le cas (nous avons ajouté une ligne ...), il va compiler la classe (via javac), puis exécuter celle-ci automatique (via java). Le résultat de l'affichage à la console de l'opération System.out.println("Bienvenue au sein du cours INF1220 !"), apparaît dans la fenêtre de console au bas de l'IDE.</li>
<li>Vous pouvez également vous créer une seconde classe dans le projet en utilisant l'option du menu "File>New File". Choisir dans le fenêtre de type "Wizard", un fichier de catégorie Java et de type "Java Class". Appuyer sur "Next".</li>
<li>Choisir un nom de classe (différent de Exercice1), par exemple "AutreClasse", puis appuyer sur terminer. Vous pouvez dans la nouvelle classe recopier la fonction main de "Exercice1", puis compiler et exécuter celle-ci.</li>
</ol>

<p>Tout comme IntelliJ, l'utilisation de NetBeans est optionnelle. Ce n'est pas un environnement destiné aux débutants. Si vous choisissez d'utiliser NetBeans, c'est à vous de faire le travail d'assimilation nécessaire.</p>


### Vidéo suggérée


{{< youtube id="5j5z9BJCAW8" >}}




## Compiler et exécuter un petit jeu

Pour vérifier votre maîtrise de votre environnement, suivez les étapes suivantes.

- Crééez un nouveau fichier nommé `Pong.java`.
- Copiez dans le fichier le code suivant (comprenant la ligne `public class Pong ...`).
- Compilez le code (avec `javac Pong.java`).
- Exécutez le code (avec `java Pong`). Vous devriez voir apparaître un petit jeu de pong sur votre ordinateur.



{{< figure src="/pong.png" alt="Jeu Pong" >}}

Dans une console, vous pouvez obtenir le résultat souhaité avec ces commandes:

- `javac Pong.java`
- `java Pong`.

Puisque le programme ne comporte qu'une seule classe, vous pouvez aussi omettre la compilation 
et l'exécutez avec la commande.

- `java Pong.java`

Dans un tel scénario, le programme est compilé et exécuté dans une seule opération.


Voici le code à utiliser. À ce point-ci dans le cours, il est normal de ne pas comprendre
le contenu du programme. Le programme doit être exécuté sur un ordinateur avec un système
d'exploitation comme Windows, macOS ou Linux. Vous ne pouvez pas exécuter le programme
en ligne ou sur un serveur distant.

```java {style=github}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pong extends JPanel {

    // --- Constantes ---
    static final int W = 600, H = 400, BALL = 15;
    static final int PW = 15, PH = 80, AIH = 60, SPEED = 5;

    // --- État du jeu via records mutables simulés avec des tableaux ---
    int ballX = W/2, ballY = H/2;
    int velX = 3, velY = 3;
    int p1Y = 150, p2Y = 150;
    int score1 = 0, score2 = 0;
    boolean up, down;

    public Pong() {
        setPreferredSize(new Dimension(W, H));
        setBackground(Color.BLACK);
        setFocusable(true);

        // KeyListener en lambda (Java 21 : adapter anonyme simplifié)
        addKeyListener(new KeyAdapter() {
            @Override public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP   -> up   = true;
                    case KeyEvent.VK_DOWN -> down = true;
                }
            }
            @Override public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP   -> up   = false;
                    case KeyEvent.VK_DOWN -> down = false;
                }
            }
        });

        // Timer avec lambda au lieu d'implémenter ActionListener
        new Timer(10, e -> update()).start();
    }

    void update() {
        // Joueur 1
        if (up   && p1Y > 0)        p1Y -= SPEED;
        if (down && p1Y < H - PH)   p1Y += SPEED;

        // IA (joueur 2)
        if (velX > 0) {
            if (p2Y + AIH/2 < ballY && p2Y < H - AIH) p2Y += 3;
            else if (p2Y + AIH/2 > ballY && p2Y > 0)  p2Y -= 3;
        }

        // Déplacement balle
        ballX += velX;
        ballY += velY;

        // Rebond haut/bas
        if (ballY <= 0 || ballY >= H - BALL) velY = -velY;

        // Collision raquette 1
        if (ballX <= 35 && ballX >= 20 && ballY >= p1Y - BALL && ballY <= p1Y + PH) {
            if (velX < 0) velX = -velX;
            velX++;
        }

        // Collision raquette 2
        if (ballX >= 550 && ballX <= 565 && ballY >= p2Y - BALL && ballY <= p2Y + AIH) {
            if (velX > 0) velX = -velX;
            velX--;
        }

        // Points & reset
        if (ballX < 0)      { score2++; reset(); }
        if (ballX > W)      { score1++; reset(); }

        repaint();
    }

    void reset() {
        ballX = W/2 - BALL/2;
        ballY = H/2 - BALL/2;
        velX  = Math.random() > 0.5 ? 3 : -3;
        velY  = Math.random() > 0.5 ? 3 : -3;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillRect(20,  p1Y, PW, PH);           // Raquette 1
        g.fillRect(565, p2Y, PW, AIH);           // Raquette 2
        g.fillOval(ballX, ballY, BALL, BALL);    // Balle

        g.setColor(Color.GRAY);
        for (int i = 0; i < H; i += 20)
            g.fillRect(300, i, 2, 10);           // Ligne centrale

        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString(String.valueOf(score1), 220, 50);
        g.drawString(String.valueOf(score2), 360, 50);
    }

    public static void main(String[] args) {
        var frame = new JFrame("Pong");
        frame.add(new Pong());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
```


## Compiler et exécuter un jeu plus complexe

Pour vous assurer d'avoir bien compris, reprenez l'expérience avec un second jeu.
Créez un fichier `SpaceInvaders.java`. Compilez le programme et exécutez-le.

```java {style=github}
import javax.swing.*;
import javax.sound.sampled.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Space Invaders
 * Compile : javac SpaceInvaders.java
 * Exécute : java SpaceInvaders
 */
public class SpaceInvaders extends JPanel implements ActionListener, KeyListener {

    // ── Constantes ──────────────────────────────────────────────────────────
    static final int W = 800, H = 600;
    static final int PLAYER_SPEED = 5;
    static final int BULLET_SPEED = 10;
    static final int ENEMY_ROWS = 4, ENEMY_COLS = 11;
    static final int ENEMY_W = 36, ENEMY_H = 24;
    static final int ENEMY_GAP_X = 14, ENEMY_GAP_Y = 16;
    static final int ENEMY_STEP_DOWN = 16;
    static final int ENEMY_MOVE_INTERVAL = 40; // ticks entre chaque mouvement ennemi
    static final Color BG      = new Color(5, 5, 20);
    static final Color PLAYER_COLOR  = new Color(80, 220, 120);
    static final Color BULLET_COLOR  = new Color(255, 230, 50);
    static final Color ENEMY_BOMB_COLOR = new Color(255, 80, 80);
    static final Color[] ENEMY_COLORS = {
        new Color(255, 100, 200),
        new Color(120, 180, 255),
        new Color(255, 165, 60),
        new Color(160, 255, 160)
    };

    // ── État du jeu ──────────────────────────────────────────────────────────
    record Rect(int x, int y, int w, int h) {
        boolean intersects(Rect o) {
            return x < o.x + o.w && x + w > o.x && y < o.y + o.h && y + h > o.y;
        }
    }

    static class Entity {
        int x, y, w, h;
        boolean alive = true;
        Entity(int x, int y, int w, int h) { this.x=x; this.y=y; this.w=w; this.h=h; }
        Rect rect() { return new Rect(x, y, w, h); }
    }

    static class Player extends Entity {
        int lives = 3;
        int invincibleTicks = 0;
        Player() { super(W/2 - 20, H - 70, 40, 24); }
    }

    static class Bullet extends Entity {
        int dy;
        Bullet(int x, int y, int dy) { super(x, y, 4, 14); this.dy = dy; }
    }

    static class Enemy extends Entity {
        int row;
        Enemy(int x, int y, int row) { super(x, y, ENEMY_W, ENEMY_H); this.row = row; }
    }

    static class Barrier extends Entity {
        int health = 4;
        Barrier(int x, int y) { super(x, y, 64, 20); }
    }

    static class Star { int x, y, brightness; }

    // ── Moteur sonore (synthèse pure, aucun fichier) ─────────────────────────
    static final int SAMPLE_RATE = 44100;

    /** Joue un son dans un thread daemon — ne bloque jamais le jeu. */
    static void playSound(byte[] pcm) {
        Thread t = new Thread(() -> {
            try {
                AudioFormat fmt = new AudioFormat(SAMPLE_RATE, 8, 1, true, false);
                DataLine.Info info = new DataLine.Info(SourceDataLine.class, fmt);
                if (!AudioSystem.isLineSupported(info)) return;
                SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
                line.open(fmt, pcm.length);
                line.start();
                line.write(pcm, 0, pcm.length);
                line.drain();
                line.close();
            } catch (Exception ignored) {}
        });
        t.setDaemon(true);
        t.start();
    }

    /** Génère un son à partir de paramètres (onde carrée + sweep de fréquence). */
    static byte[] synth(double startHz, double endHz, double durationSec, double volume, boolean square) {
        int n = (int)(SAMPLE_RATE * durationSec);
        byte[] buf = new byte[n];
        for (int i = 0; i < n; i++) {
            double t   = (double) i / SAMPLE_RATE;
            double hz  = startHz + (endHz - startHz) * ((double) i / n);
            double val;
            if (square) {
                // onde carrée
                val = (Math.sin(2 * Math.PI * hz * t) >= 0) ? 1.0 : -1.0;
            } else {
                // onde sinusoïdale
                val = Math.sin(2 * Math.PI * hz * t);
            }
            // Enveloppe : fondu en fin
            double env = Math.min(1.0, (n - i) / (SAMPLE_RATE * 0.02));
            buf[i] = (byte)(val * env * volume * 127);
        }
        return buf;
    }

    /** Concatène deux tableaux PCM. */
    static byte[] concat(byte[] a, byte[] b) {
        byte[] r = new byte[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(b, 0, r, a.length, b.length);
        return r;
    }

    // Sons pré-générés
    static final byte[] SND_SHOOT    = synth(880, 220,  0.12, 0.5, true);
    static final byte[] SND_EXPLODE  = synth(200,  40,  0.25, 0.9, true);
    static final byte[] SND_HIT_PLAY = concat(synth(150, 80, 0.10, 0.8, true),
                                              synth(100, 50, 0.15, 0.7, true));
    static final byte[] SND_MARCH_A  = synth(160, 160,  0.06, 0.35, true);
    static final byte[] SND_MARCH_B  = synth(120, 120,  0.06, 0.35, true);
    static final byte[] SND_MARCH_C  = synth(100, 100,  0.06, 0.35, true);
    static final byte[] SND_MARCH_D  = synth( 80,  80,  0.06, 0.35, true);
    static final byte[] SND_VICTORY  = concat(
        concat(synth(523, 523, 0.12, 0.6, false), synth(659, 659, 0.12, 0.6, false)),
        concat(synth(784, 784, 0.12, 0.6, false), synth(1046,1046,0.20, 0.6, false)));
    static final byte[] SND_GAMEOVER = concat(
        concat(synth(300, 150, 0.20, 0.7, true), synth(150,  80, 0.20, 0.7, true)),
                synth( 80,  40, 0.40, 0.8, true));
    static final byte[] SND_BARRIER  = synth(300, 200,  0.07, 0.3, true);

    static final byte[][] MARCH = {SND_MARCH_A, SND_MARCH_B, SND_MARCH_C, SND_MARCH_D};

    // ── Champs ───────────────────────────────────────────────────────────────
    Player player;
    ArrayList<Bullet> playerBullets = new ArrayList<>();
    ArrayList<Bullet> enemyBullets  = new ArrayList<>();
    ArrayList<Enemy>  enemies       = new ArrayList<>();
    ArrayList<Barrier> barriers     = new ArrayList<>();
    ArrayList<Star>   stars         = new ArrayList<>();

    int  score       = 0;
    int  highScore   = 0;
    int  level       = 1;
    int  enemyDirX   = 1;         // direction horizontale des ennemis
    int  enemyTick   = 0;
    int  bombCooldown= 0;
    boolean gameOver = false;
    boolean win      = false;
    boolean started  = false;
    boolean[] keys   = new boolean[256];
    int  shootCooldown = 0;
    int  marchStep     = 0;   // index dans MARCH[]
    Random rng = new Random();

    // ── Constructeur ─────────────────────────────────────────────────────────
    SpaceInvaders() {
        setPreferredSize(new Dimension(W, H));
        setBackground(BG);
        setFocusable(true);
        addKeyListener(this);
        generateStars();
        initLevel();
        new Timer(16, this).start(); // ~60 fps
    }

    void generateStars() {
        stars.clear();
        for (int i = 0; i < 120; i++) {
            Star s = new Star();
            s.x = rng.nextInt(W);
            s.y = rng.nextInt(H);
            s.brightness = 60 + rng.nextInt(195);
            stars.add(s);
        }
    }

    void initLevel() {
        player = new Player();
        playerBullets.clear();
        enemyBullets.clear();
        enemies.clear();
        barriers.clear();
        enemyDirX = 1;
        enemyTick = 0;
        gameOver = false;
        win = false;
        shootCooldown = 0;

        // Créer les ennemis
        int startX = 80;
        int startY = 60;
        for (int r = 0; r < ENEMY_ROWS; r++)
            for (int c = 0; c < ENEMY_COLS; c++)
                enemies.add(new Enemy(
                    startX + c * (ENEMY_W + ENEMY_GAP_X),
                    startY + r * (ENEMY_H + ENEMY_GAP_Y),
                    r));

        // Créer les boucliers
        int[] bx = {80, 230, 380, 530, 680};
        for (int bxi : bx)
            barriers.add(new Barrier(bxi, H - 130));
    }

    // ── Boucle de jeu ────────────────────────────────────────────────────────
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!started || gameOver || win) { repaint(); return; }

        // Mouvement joueur
        if (keys[KeyEvent.VK_LEFT]  || keys[KeyEvent.VK_A]) player.x = Math.max(0, player.x - PLAYER_SPEED);
        if (keys[KeyEvent.VK_RIGHT] || keys[KeyEvent.VK_D]) player.x = Math.min(W - player.w, player.x + PLAYER_SPEED);

        // Tir joueur
        if ((keys[KeyEvent.VK_SPACE] || keys[KeyEvent.VK_UP]) && shootCooldown <= 0) {
            playerBullets.add(new Bullet(player.x + player.w/2 - 2, player.y - 14, -BULLET_SPEED));
            shootCooldown = 18;
            playSound(SND_SHOOT);
        }
        if (shootCooldown > 0) shootCooldown--;
        if (player.invincibleTicks > 0) player.invincibleTicks--;

        // Mouvement ennemis
        enemyTick++;
        int interval = Math.max(6, ENEMY_MOVE_INTERVAL - enemies.size() / 2 - (level - 1) * 4);
        if (enemyTick >= interval) {
            enemyTick = 0;
            playSound(MARCH[marchStep % 4]);
            marchStep++;
            boolean hitEdge = false;
            for (Enemy en : enemies)
                if ((enemyDirX > 0 && en.x + en.w + 8 >= W) || (enemyDirX < 0 && en.x - 8 <= 0))
                    { hitEdge = true; break; }
            if (hitEdge) {
                enemyDirX = -enemyDirX;
                for (Enemy en : enemies) en.y += ENEMY_STEP_DOWN;
            } else {
                int speed = 4 + level;
                for (Enemy en : enemies) en.x += enemyDirX * speed;
            }
        }

        // Tir ennemi
        if (bombCooldown-- <= 0 && !enemies.isEmpty()) {
            bombCooldown = Math.max(20, 60 - level * 5 - rng.nextInt(20));
            Enemy shooter = enemies.get(rng.nextInt(enemies.size()));
            enemyBullets.add(new Bullet(shooter.x + shooter.w/2 - 2, shooter.y + shooter.h, 5 + level));
        }

        // Déplacer les balles
        for (Bullet b : playerBullets) b.y += b.dy;
        for (Bullet b : enemyBullets)  b.y += b.dy;

        // Collisions balles joueur <-> ennemis
        Iterator<Bullet> bi = playerBullets.iterator();
        while (bi.hasNext()) {
            Bullet b = bi.next();
            if (b.y + b.h < 0) { bi.remove(); continue; }
            boolean hit = false;
            for (Enemy en : enemies) {
                if (en.alive && b.rect().intersects(en.rect())) {
                    en.alive = false;
                    score += (ENEMY_ROWS - en.row) * 10;
                    hit = true;
                    playSound(SND_EXPLODE);
                    break;
                }
            }
            if (hit) { bi.remove(); continue; }
            for (Barrier br : barriers) {
                if (br.health > 0 && b.rect().intersects(br.rect())) {
                    br.health--;
                    playSound(SND_BARRIER);
                    bi.remove(); break;
                }
            }
        }
        enemies.removeIf(en -> !en.alive);

        // Collisions balles ennemies <-> joueur / barrières
        Iterator<Bullet> ei = enemyBullets.iterator();
        while (ei.hasNext()) {
            Bullet b = ei.next();
            if (b.y > H) { ei.remove(); continue; }
            boolean hit = false;
            for (Barrier br : barriers) {
                if (br.health > 0 && b.rect().intersects(br.rect())) {
                    br.health--;
                    ei.remove(); hit = true; break;
                }
            }
            if (hit) continue;
            if (player.invincibleTicks <= 0 && b.rect().intersects(player.rect())) {
                player.lives--;
                player.invincibleTicks = 120;
                ei.remove();
                playSound(SND_HIT_PLAY);
                if (player.lives <= 0) {
                    gameOver = true;
                    if (score > highScore) highScore = score;
                    playSound(SND_GAMEOVER);
                }
            }
        }

        // Ennemis atteignent le bas
        for (Enemy en : enemies)
            if (en.y + en.h >= H - 60) {
                gameOver = true;
                if (score > highScore) highScore = score;
                playSound(SND_GAMEOVER);
                break;
            }

        // Victoire
        if (enemies.isEmpty()) {
            win = true;
            level++;
            highScore = Math.max(highScore, score);
            playSound(SND_VICTORY);
        }

        repaint();
    }

    // ── Rendu ────────────────────────────────────────────────────────────────
    @Override
    protected void paintComponent(Graphics g0) {
        super.paintComponent(g0);
        Graphics2D g = (Graphics2D) g0;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Fond étoilé
        for (Star s : stars) {
            int b = s.brightness;
            g.setColor(new Color(b, b, b));
            g.fillRect(s.x, s.y, 2, 2);
        }

        if (!started) { drawIntro(g); return; }

        // Barrières
        for (Barrier br : barriers) {
            if (br.health <= 0) continue;
            int alpha = 60 + br.health * 45;
            g.setColor(new Color(80, 200, 80, Math.min(255, alpha)));
            g.fillRoundRect(br.x, br.y, br.w, br.h, 8, 8);
            g.setColor(new Color(120, 255, 120, Math.min(255, alpha)));
            g.drawRoundRect(br.x, br.y, br.w, br.h, 8, 8);
        }

        // Ennemis
        for (Enemy en : enemies) {
            Color c = ENEMY_COLORS[en.row % ENEMY_COLORS.length];
            g.setColor(c);
            drawEnemy(g, en.x, en.y, en.row);
        }

        // Joueur
        boolean visible = player.invincibleTicks <= 0 || (player.invincibleTicks / 6) % 2 == 0;
        if (visible) {
            g.setColor(PLAYER_COLOR);
            drawPlayer(g, player.x, player.y, player.w, player.h);
        }

        // Balles joueur
        g.setColor(BULLET_COLOR);
        for (Bullet b : playerBullets) {
            g.fillRoundRect(b.x, b.y, b.w, b.h, 3, 3);
        }

        // Balles ennemies
        g.setColor(ENEMY_BOMB_COLOR);
        for (Bullet b : enemyBullets) {
            g.fillOval(b.x, b.y, b.w + 2, b.h / 2 + 4);
        }

        // HUD
        drawHUD(g);

        // Écrans de fin
        if (gameOver) drawOverlay(g, "GAME OVER", "Score : " + score, "Appuie sur R pour rejouer");
        if (win)      drawOverlay(g, "NIVEAU " + level + " !", "Score : " + score, "Appuie sur ENTRÉE pour continuer");
    }

    void drawPlayer(Graphics2D g, int x, int y, int w, int h) {
        // Corps principal
        int[] xp = {x + w/2, x + w, x + w - 6, x + 6, x};
        int[] yp = {y, y + h, y + h, y + h, y + h};
        g.fillPolygon(xp, yp, 5);
        // Canon
        g.fillRect(x + w/2 - 3, y - 10, 6, 12);
        // Cockpit
        g.setColor(new Color(180, 255, 210));
        g.fillOval(x + w/2 - 7, y + 4, 14, 10);
    }

    void drawEnemy(Graphics2D g, int x, int y, int row) {
        switch (row % 4) {
            case 0 -> { // Octopus
                g.fillOval(x + 6, y, 24, 18);
                g.setColor(BG);
                g.fillOval(x + 9, y + 4, 5, 5);
                g.fillOval(x + 22, y + 4, 5, 5);
                g.setColor(ENEMY_COLORS[0]);
                g.fillRect(x + 4, y + 14, 5, 5);
                g.fillRect(x + 27, y + 14, 5, 5);
            }
            case 1 -> { // Crab
                g.fillRoundRect(x + 4, y + 4, 28, 14, 6, 6);
                g.fillRect(x, y + 6, 8, 4);
                g.fillRect(x + 28, y + 6, 8, 4);
                g.setColor(BG);
                g.fillOval(x + 9, y + 6, 5, 5);
                g.fillOval(x + 22, y + 6, 5, 5);
            }
            case 2 -> { // Squid
                g.fillOval(x + 8, y + 2, 20, 16);
                g.fillRect(x + 10, y + 14, 4, 6);
                g.fillRect(x + 22, y + 14, 4, 6);
                g.setColor(BG);
                g.fillOval(x + 11, y + 5, 5, 5);
                g.fillOval(x + 20, y + 5, 5, 5);
            }
            default -> { // UFO mini
                g.fillOval(x + 4, y + 8, 28, 12);
                g.fillOval(x + 10, y + 2, 16, 12);
                g.setColor(BG);
                g.fillOval(x + 11, y + 9, 4, 4);
                g.fillOval(x + 21, y + 9, 4, 4);
            }
        }
    }

    void drawHUD(Graphics2D g) {
        g.setFont(new Font("Monospaced", Font.BOLD, 16));
        g.setColor(new Color(200, 230, 255));
        g.drawString("SCORE " + score, 10, 24);
        g.drawString("MEILLEUR " + highScore, W/2 - 70, 24);
        g.drawString("NIVEAU " + level, W - 100, 24);

        // Vies
        g.setColor(PLAYER_COLOR);
        g.drawString("♥ x" + player.lives, 10, 48);

        // Ligne du sol
        g.setColor(new Color(50, 120, 50));
        g.fillRect(0, H - 56, W, 2);
    }

    void drawOverlay(Graphics2D g, String title, String sub, String hint) {
        g.setColor(new Color(0, 0, 10, 180));
        g.fillRect(0, 0, W, H);

        g.setFont(new Font("Monospaced", Font.BOLD, 48));
        g.setColor(new Color(255, 220, 60));
        FontMetrics fm = g.getFontMetrics();
        g.drawString(title, (W - fm.stringWidth(title)) / 2, H/2 - 40);

        g.setFont(new Font("Monospaced", Font.PLAIN, 24));
        g.setColor(Color.WHITE);
        fm = g.getFontMetrics();
        g.drawString(sub, (W - fm.stringWidth(sub)) / 2, H/2 + 10);

        g.setFont(new Font("Monospaced", Font.ITALIC, 16));
        g.setColor(new Color(160, 200, 255));
        fm = g.getFontMetrics();
        g.drawString(hint, (W - fm.stringWidth(hint)) / 2, H/2 + 50);
    }

    void drawIntro(Graphics2D g) {
        g.setFont(new Font("Monospaced", Font.BOLD, 52));
        g.setColor(new Color(255, 220, 60));
        String t = "SPACE INVADERS";
        FontMetrics fm = g.getFontMetrics();
        g.drawString(t, (W - fm.stringWidth(t)) / 2, 160);

        g.setFont(new Font("Monospaced", Font.PLAIN, 18));
        g.setColor(Color.WHITE);
        String[] lines = {
            "← → ou A D  :  Déplacer",
            "ESPACE ou ↑  :  Tirer",
            "R            :  Recommencer",
            "",
            "Appuie sur ENTRÉE pour jouer"
        };
        int y = 260;
        for (String l : lines) {
            fm = g.getFontMetrics();
            g.drawString(l, (W - fm.stringWidth(l)) / 2, y);
            y += 32;
        }
    }

    // ── Entrées clavier ──────────────────────────────────────────────────────
    @Override public void keyPressed(KeyEvent e) {
        int k = e.getKeyCode();
        if (k < 256) keys[k] = true;

        if (!started && k == KeyEvent.VK_ENTER) { started = true; }
        if (gameOver && k == KeyEvent.VK_R) { score = 0; level = 1; initLevel(); started = true; }
        if (win && k == KeyEvent.VK_ENTER) { initLevel(); started = true; }
        if (k == KeyEvent.VK_R && !gameOver) { score = 0; level = 1; initLevel(); started = true; }
    }
    @Override public void keyReleased(KeyEvent e) { if (e.getKeyCode() < 256) keys[e.getKeyCode()] = false; }
    @Override public void keyTyped(KeyEvent e) {}

    // ── Main ─────────────────────────────────────────────────────────────────
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Space Invaders");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            SpaceInvaders game = new SpaceInvaders();
            frame.add(game);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            game.requestFocusInWindow();
        });
    }
}
```

### Lecture optionnelle dans le livre de référence (Delannoy) (optionnel)

<p>Vous pouvez lire dans <em>Programmer en Java</em> de Claude Delannoy, le premier chapitre. Le manuel de Delannoy  est à son mieux comme manuel de référence. On vous invite à faire les lectures à et garder le manuel avec vous lors que vous étudiez si vous en avez fait l'acquisition. Le manuel de Delannoy n'est pas obligatoire.</p>

## Vidéos suggérées

{{< youtube id="_l4pJ7HCrl4" >}}

{{< youtube id="cvpkw2ZN4Ps" >}}

