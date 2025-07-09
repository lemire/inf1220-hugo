---
title: "Programmation Java en ligne"
weight: 2
---


# Programmation Java en ligne

Vous pouvez faire une grande partie des exercices et des travaux du cours en ligne, dans votre navigateur.
Pour commencer à programmer dans cet environnement Java en ligne, familiarisez-vous avec son interface intuitive. La page principale affiche une zone où vous pouvez ajouter des fichiers Java ou texte. Cliquez sur «&nbsp;Ajouter un fichier Java&nbsp;» pour créer un fichier avec l'extension .java, ou «&nbsp;Ajouter un fichier texte&nbsp;» pour un fichier .txt. Chaque fichier apparaît dans une boîte avec un champ pour le nom et un éditeur de texte. Pour les fichiers Java, l'éditeur offre une coloration syntaxique et des numéros de ligne, facilitant la lecture et l'écriture du code. Vous pouvez aussi sélectionner des exemples prédéfinis (comme «&nbsp;Bonjour le monde&nbsp;» ou «&nbsp;Fibonacci&nbsp;») via le menu déroulant «&nbsp;Exemples&nbsp;» pour charger automatiquement des fichiers modèles. Une fois vos fichiers prêts, cliquez sur «&nbsp;Exécuter&nbsp;» pour compiler et exécuter le code.

Lorsque vous exécutez votre programme, l'environnement tente de compiler et d'exécuter votre code. Le résultat s'affiche dans la zone «&nbsp;Résultat&nbsp;» en bas de la page. Si le programme s'exécute correctement, vous verrez la sortie attendue, comme du texte affiché par System.out.println. En cas d'erreur de compilation, le message d'erreur apparaît avec des détails précis, et les lignes problématiques dans vos fichiers Java sont surlignées en rouge dans l'éditeur. Passez la souris sur ces lignes pour voir le message d'erreur complet dans la barre d'état sous l'éditeur. Vous pouvez modifier le code directement dans l'éditeur et réexécuter pour tester vos corrections. Pour supprimer un fichier, cliquez sur le «&nbsp;×&nbsp;» en haut à droite de sa boîte.


  <style>
    /*.container { max-width: 900px; margin: 40px auto; background: #fff; border-radius: 8px; box-shadow: 0 2px 8px #0001; padding: 32px; }*/
    .files { margin-bottom: 24px; }
    .file-block { background: #f9f9f9; border: 1px solid #ddd; border-radius: 6px; padding: 16px; margin-bottom: 12px; position: relative; }
    java-runner-container label { display: block; font-weight: bold; margin-bottom: 4px; }
    java-runner-container input[type=text], textarea { width: 100%; padding: 8px; margin-bottom: 8px; border-radius: 4px; border: 1px solid #ccc; font-family: monospace; }
    .file-type { margin-bottom: 8px; }
    button { background: #1976d2; color: #fff; border: none; border-radius: 4px; padding: 8px 16px; font-size: 1em; cursor: pointer; margin-right: 8px; }
    button.remove { background: #e53935; }
    #result { background: #222; color: #eee; padding: 16px; border-radius: 6px; margin-top: 24px; white-space: pre-wrap; font-family: monospace; }
    .add-btns { margin-bottom: 16px; }
    .add-btns button.add-file {
      background: #e0e0e0;
      color: #333;
      border: 1px solid #ccc;
      margin-right: 0;
      margin-left: 0;
      font-weight: normal;
    }
    .add-btns button.add-file:active, .add-btns button.add-file:focus {
      background: #d0d0d0;
    }
    button.remove {
      display: none;
    }
    .file-block .remove-x {
      position: absolute;
      top: 8px;
      right: 10px;
      color: #888;
      background: none;
      border: none;
      font-size: 1.2em;
      cursor: pointer;
      padding: 0 6px;
      line-height: 1;
      z-index: 2;
      transition: color 0.2s;
    }
    .file-block .remove-x:hover {
      color: #c00;
    }
    /* Ajoute le style pour le surlignage d'erreur Java dans CodeMirror */
    .cm-java-error {
      background: #ffe0e0 !important;
      border-bottom: 2px dotted #c00;
      cursor: pointer;
    }
    .cm-java-error-line {
      background: #fff0f0 !important;
    }
  </style>


  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.16/codemirror.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.16/theme/eclipse.min.css">
  <div class="java-runner-container">
    <h1>Java en ligne</h1>
    <form id="runForm">
      <div style="display:flex; align-items:center; gap:16px; margin-bottom:18px;">
        <label for="example-select" style="font-weight:normal; color:#444;">Exemples :</label>
        <select id="example-select" style="padding:6px 12px; border-radius:4px; border:1px solid #ccc;">
          <option value="">Sélectionner un exemple...</option>
          <option value="ex1">Affichage d'un fichier texte (2 Java + 1 texte)</option>
          <option value="ex2">Bonjour le monde (simple)</option>
          <option value="ex3">Fibonacci (package, commentaires FR)</option>
          <option value="ex4">Mario</option>
          <option value="ex5">Chargement des articles du blogue de Daniel Lemire</option>
        </select>
      </div>
      <div id="files" class="files"></div>
      <div style="display:flex; align-items:center; gap:12px; margin-bottom:0; margin-top:12px;">
        <button type="submit">Exécuter</button>
        <div class="add-btns" style="margin:0;">
          <button type="button" class="add-file" onclick="addFile('java')">Ajouter un fichier Java</button>
          <button type="button" class="add-file" onclick="addFile('txt')">Ajouter un fichier texte</button>
        </div>
      </div>
    </form>
    <div id="result"></div>
    <div style="text-align:center; margin-top:32px; color:#888;">(c) Daniel Lemire</div>
    <div id="java-version" style="text-align:center; margin-top:8px; color:#888;"></div>
  </div>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.16/codemirror.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.16/mode/clike/clike.min.js"></script>
  <script>
    let fileCount = 0;
    function addFile(type, initialName = '', initialContent = '') {
      const filesDiv = document.getElementById('files');
      const block = document.createElement('div');
      block.className = 'file-block';
      const isJava = type === 'java';
      const codeId = `code_${fileCount}`;
      block.innerHTML = `
        <button type="button" class="remove-x" title="Retirer" onclick="this.parentElement.remove()">×</button>
        <div class="file-type">Type : <b>${isJava ? 'Java' : 'Texte'}</b></div>
        <label>Nom du fichier</label>
        <input type="text" name="${type}_name_${fileCount}" placeholder="${isJava ? 'Main.java' : 'fichier.txt'}" required value="${initialName}">
        <label>Contenu</label>
        ${isJava
          ? `<textarea id="${codeId}" name="${type}_content_${fileCount}" rows="6"></textarea>`
          : `<textarea name="${type}_content_${fileCount}" rows="6" required>${initialContent}</textarea>`}
        ${isJava ? '<div class="java-status-bar" style="margin-top:4px;font-size:0.95em;color:#c00;min-height:1.2em;"></div>' : ''}
      `;
      filesDiv.appendChild(block);
      if (isJava) {
        const editor = CodeMirror.fromTextArea(document.getElementById(codeId), {
          mode: "text/x-java",
          theme: "eclipse",
          lineNumbers: true,
          indentUnit: 4,
          tabSize: 4,
          autofocus: fileCount === 0
        });
        editor.setValue(initialContent);
        block._cm = editor;
      }
      fileCount++;
    }
    document.getElementById('runForm').onsubmit = async function(e) {
      e.preventDefault();
      const java_files = [], txt_files = [];
      const data = new FormData(this);
      // Synchronise les contenus CodeMirror dans les textarea cachés
      document.querySelectorAll('.file-block').forEach(block => {
        const type = block.querySelector('.file-type b').textContent === 'Java' ? 'java' : 'txt';
        const nameInput = block.querySelector('input[type=text]');
        let content;
        if (type === 'java' && block._cm) {
          content = block._cm.getValue();
          // Met à jour le textarea caché pour éviter l'erreur de validation
          block.querySelector('textarea').value = content;
        } else {
          content = block.querySelector('textarea').value;
        }
        if (type === 'java') {
          java_files.push({ name: nameInput.value, content });
        } else {
          txt_files.push({ name: nameInput.value, content });
        }
      });
      let resultDiv = document.getElementById('result');
      resultDiv.textContent = 'Exécution en cours';
      let dots = 0;
      let execAnim = setInterval(function() {
        dots = (dots + 1) % 4;
        resultDiv.textContent = 'Exécution en cours' + '.'.repeat(dots);
      }, 500);
      // Ajout d'un timeout de 30 secondes à la requête fetch
      const controller = new AbortController();
      const timeoutId = setTimeout(() => controller.abort(), 30000); // 30 000 ms = 30 s
      try {
        const resp = await fetch('{{<endpoint>}}', {
          method: 'POST',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify({ java_files, txt_files }),
          signal: controller.signal
        });
        clearTimeout(timeoutId);
        if (!resp.ok && resp.status !== 400) {
          throw new Error(`Erreur HTTP ${resp.status} : ${resp.statusText}`);
        }
        let resultText = await resp.text();
        clearInterval(execAnim);
        let displayDiv = document.getElementById('result');
        try {
          const resultJson = JSON.parse(resultText);
          if (resultJson.status === 'ran_successfully') {
            displayDiv.innerHTML = '<pre style="color:#222;background:#e0ffe0;padding:12px;border-radius:6px;">' +
              (resultJson.output || '').replace(/\n/g, '<br>') + '</pre>';
            // Nettoie les erreurs précédentes
            document.querySelectorAll('.file-block').forEach(block => {
              if (block._cm && block.querySelector('.file-type b').textContent === 'Java') {
                block._cm.operation(() => {
                  // Nettoie les marques de texte
                  block._cm.getAllMarks().forEach(m => m.clear());
                  // Nettoie la classe cm-java-error-line pour toutes les lignes
                  block._cm.eachLine(lineHandle => {
                    block._cm.removeLineClass(lineHandle, 'wrap', 'cm-java-error-line');
                  });
                });
                // Nettoie les anciens listeners
                if (block._cm._javaErrorStatusListeners) {
                  block._cm._javaErrorStatusListeners.forEach(({line, handler}) => {
                    block._cm.off('cursorActivity', handler);
                  });
                  block._cm._javaErrorStatusListeners = [];
                }
                const statusBar = block.querySelector('.java-status-bar');
                if (statusBar) {
                  statusBar.textContent = '';
                  statusBar.style.visibility = 'hidden';
                }
              }
            });
          } else if (resultJson.status === 'compiling') {
            displayDiv.innerHTML = '<pre style="color:#c00;background:#ffe0e0;padding:12px;border-radius:6px;">' +
              (resultJson.error || '').replace(/\n/g, '<br>') + '</pre>';
            // Parse et surligne les erreurs dans CodeMirror
            const errorText = resultJson.error || '';
            // Regexp pour extraire : NomFichier.java:ligne: ...\n message
            // Modifié pour supporter les chemins (ex: ca/teluq/informatique/Fibo.java)
            const errorRegex = /([\w./\\-]+\.java):(\d+): error: ([^\n]+)([\s\S]*?)(?=\n[\w./\\-]+\.java:|$)/g;
            let match;
            // Pour chaque éditeur, nettoie les erreurs précédentes
            document.querySelectorAll('.file-block').forEach(block => {
              if (block._cm) {
                block._cm.operation(() => {
                  block._cm.getAllMarks().forEach(m => m.clear());
                });
              }
            });
            while ((match = errorRegex.exec(errorText)) !== null) {
              const [_, file, lineStr, msg, details] = match;
              const line = parseInt(lineStr, 10) - 1; // CodeMirror est 0-based
              // Trouve le bloc correspondant au fichier
              document.querySelectorAll('.file-block').forEach(block => {
                const nameInput = block.querySelector('input[type=text]');
                // Compare le nom du fichier avec ou sans chemin
                if (nameInput && (nameInput.value.trim() === file || nameInput.value.trim().endsWith('/'+file) || nameInput.value.trim().endsWith('\\'+file))) {
                  if (block._cm) {
                    block._cm.operation(() => {
                      // Surligne la ligne
                      const mark = block._cm.markText({line, ch:0}, {line:line+1, ch:0}, {
                        className: 'cm-java-error',
                        title: (msg + (details ? details.replace(/\s+/g, ' ') : '')).trim()
                      });
                      // Ajoute gestion du survol pour afficher l'erreur dans la status bar
                      const statusBar = block.querySelector('.java-status-bar');
                      if (statusBar) {
                        const errorMsg = (msg + (details ? details.replace(/\s+/g, ' ') : '')).trim();
                        // Nettoie les anciens listeners
                        if (!block._cm._javaErrorStatusListeners) block._cm._javaErrorStatusListeners = [];
                        block._cm._javaErrorStatusListeners.forEach(({line, handler}) => {
                          block._cm.off('cursorActivity', handler);
                        });
                        block._cm._javaErrorStatusListeners = [];
                        // Ajoute un listener pour afficher l'erreur au survol de la ligne
                        const handler = function(cm) {
                          const pos = cm.getCursor();
                          if (pos.line === line) {
                            statusBar.textContent = errorMsg;
                          } else {
                            statusBar.textContent = '';
                          }
                        };
                        block._cm.on('cursorActivity', handler);
                        block._cm._javaErrorStatusListeners.push({line, handler});
                        // Ajoute aussi un survol direct (pour la souris)
                        const lineHandle = block._cm.getLineHandle(line);
                        if (lineHandle) {
                          block._cm.addLineClass(lineHandle, 'wrap', 'cm-java-error-line');
                          // Ajoute un event sur le DOM
                          setTimeout(() => {
                            const lines = block._cm.display.lineDiv.querySelectorAll('.cm-java-error-line');
                            lines.forEach(domLine => {
                              domLine.onmouseenter = () => { statusBar.textContent = errorMsg; };
                              domLine.onmouseleave = () => { statusBar.textContent = ''; };
                            });
                          }, 10);
                        }
                      }
                    });
                  }
                }
              });
            }
          } else {
            displayDiv.textContent = JSON.stringify(resultJson, null, 2);
          }
        } catch (e) {
          clearInterval(execAnim);
          displayDiv.textContent = resultText;
        }
      } catch (error) {
        clearTimeout(timeoutId);
        clearInterval(execAnim);
        let displayDiv = document.getElementById('result');
        if (error.name === 'AbortError') {
          displayDiv.textContent = 'Erreur : délai d’attente dépassé (30 secondes).';
        } else {
          displayDiv.textContent = 'Erreur lors de la requête : ' + error;
        }
      }
    };
    window.onload = () => {
      addFile('java', 'Bonjour.java', 'void main() {\n    System.out.println("Bonjour le monde!");\n}');
    };
    fetch('{{<endpoint>}}/../java-version').then(r => r.json()).then(data => {
      if (data.version) {
        document.getElementById('java-version').textContent = 'Java : ' + data.version;
      }
    });
    function clearFiles() {
      document.getElementById('files').innerHTML = '';
      fileCount = 0;
    }
    document.getElementById('example-select').onchange = function() {
      const v = this.value;
      clearFiles();
      if (v === 'ex1') {
        addFile('java', 'ProgrammeAffichageFichier.java',
`public class ProgrammeAffichageFichier {
    public static void main(String[] args) {
        String nomFichier = "fichier.txt";
        UtilitaireLectureFichier lecteur = new UtilitaireLectureFichier();
        lecteur.afficherContenuFichier(nomFichier);
    }
}`);
        addFile('java', 'UtilitaireLectureFichier.java',
`import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class UtilitaireLectureFichier {
    public void afficherContenuFichier(String nomFichier) {
        try (BufferedReader lecteur = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}`);
        addFile('txt', 'fichier.txt', 'Bonjour la vie');
      } else if (v === 'ex2') {
        addFile('java', 'Bonjour.java',
`public class Bonjour {
    public static void main(String[] args) {
        System.out.println("Bonjour le monde!");
    }
}`);
      } else if (v === 'ex3') {
        addFile('java', 'ca/teluq/informatique/Fibo.java',
`package ca.teluq.informatique;
public class Fibo {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        // Affiche les 10 premiers termes
        for (int i = 0; i < 10; i++) {
            System.out.println("F(" + i + ") = " + fibonacci(i));
        }
    }
}`);
      } else if(v == 'ex5') {
                addFile('java', 'RssFeedReader.java',
`import java.io.InputStream;
import java.net.URL;
import java.net.HttpURLConnection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
public class RssFeedReader {
    public static void main(String[] args) {
        try {
            // Connexion au flux RSS
            String rssUrl = "https://lemire.me/blog/feed/";
            URL url = new URL(rssUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            // Vérification de la réponse
            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                System.out.println("Erreur : Code de réponse " + responseCode);
                return;
            }
            // Parsing du XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputStream inputStream = connection.getInputStream();
            Document doc = builder.parse(inputStream);
            doc.getDocumentElement().normalize();
            // Extraction des informations du channel
            NodeList channelList = doc.getElementsByTagName("channel");
            if (channelList.getLength() > 0) {
                Element channel = (Element) channelList.item(0);
                String channelTitle = getElementValue(channel, "title");
                String channelDescription = getElementValue(channel, "description");
                String channelLink = getElementValue(channel, "link");
                System.out.println("Flux RSS : " + channelTitle);
                System.out.println("Description : " + channelDescription);
                System.out.println("Lien : " + channelLink);
                System.out.println("Articles :");
            }
            // Extraction des items (articles)
            NodeList itemList = doc.getElementsByTagName("item");
            for (int i = 0; i < itemList.getLength(); i++) {
                Element item = (Element) itemList.item(i); 
                String title = getElementValue(item, "title");
                String link = getElementValue(item, "link");
                String pubDate = getElementValue(item, "pubDate");
                System.out.println("Article " + (i + 1) + ":");
                System.out.println("  Titre : " + title);
                System.out.println("  Lien : " + link);
                System.out.println("  Date de publication : " + pubDate);
                System.out.println();
            }
            inputStream.close();
            connection.disconnect();
        } catch (Exception e) {
            System.out.println("Erreur lors de la récupération du flux RSS : " + e.getMessage());
            e.printStackTrace();
        }
    }
    // Méthode utilitaire pour extraire la valeur d'un élément
    private static String getElementValue(Element parent, String tagName) {
        NodeList nodeList = parent.getElementsByTagName(tagName);
        if (nodeList.getLength() > 0 && nodeList.item(0).getFirstChild() != null) {
            return nodeList.item(0).getFirstChild().getNodeValue();
        }
        return "";
    }
}`);
      } else if (v === 'ex4') {
        addFile('java', 'Mario.java',
`void main() {
        System.out.println("☀️ ☁️ ☁️ ☁️ ☁️ ☁️ ☁️ ☁️ ☁️ ☁️");
        System.out.println("☁️ ☁️ ☁️ ☁️ ☁️ ☁️ ☁️ ☁️ ☁️ ☁️");
        System.out.println("☁️ ☁️ ☁️ ☁️ ☁️ ☁️ ☁️ ☁️ ☁️ ☁️");
        System.out.println("    🟨 🟨 🟨    💰 💰 💰    🟨 ");
        System.out.println("                💰 💰 💰       ");
        System.out.println("🟫     🟫        🟫       🟫");
        System.out.println("🟫 👨‍🚒 🟫 🟫 🐢 🟫 🟫 🍄 🟫 🟫");
        System.out.println("🟫 🟫 🟫 🟫 🟫 🟫 🟫 🟫 🟫 🟫");
}`);}
    };
  </script>



## Description des exemples

- Affichage d'un fichier texte: Cet exemple comprend deux classes Java, ProgrammeAffichageFichier et UtilitaireLectureFichier, accompagnées d’un fichier texte fichier.txt contenant la phrase "Bonjour la vie". Le programme lit ce fichier à l’aide d’un BufferedReader et affiche son contenu ligne par ligne dans la console. La classe UtilitaireLectureFichier encapsule la logique de lecture et gère les exceptions d’entrée/sortie (IOException) pour signaler toute erreur, comme un fichier introuvable, garantissant une exécution robuste.
- Bonjour le monde : L’exemple propose une classe simple nommée Bonjour, qui constitue une version classique du programme "Hello World" en Java. La méthode main utilise la fonction System.out.println pour afficher le message "Bonjour le monde !" dans la console. Ce code illustre la structure minimale d’un programme Java exécutable, idéal pour les débutants apprenant les bases de la syntaxe et de la sortie console.
- Fibonacci : La classe Fibo, placée dans le paquetage ca.teluq.informatique, implémente une fonction récursive fibonacci pour calculer les termes de la suite de Fibonacci. Le programme affiche les dix premiers termes (de F(0) à F(9)) en bouclant sur la fonction et en montrant chaque résultat. Cet exemple démontre l’utilisation de la récursivité en Java, bien que cette approche puisse être inefficace pour de grands nombres en raison de calculs redondants.
- Mario : L’exemple Mario utilise des caractères Unicode pour créer une représentation graphique inspirée du jeu Super Mario dans la console. La méthode main affiche une scène avec des nuages, un soleil, des blocs, des pièces, un personnage, une tortue et un champignon. Ce programme montre comment manipuler des caractères spéciaux pour produire un affichage visuel simple, offrant une approche ludique de la sortie console.
- Chargement des articles du blogue de Daniel Lemire : La classe RssFeedReader illustre la récupération et le traitement d’un flux RSS à partir de l’URL https://lemire.me/blog/feed/. Elle établit une connexion HTTP, parse le XML avec DocumentBuilder, puis extrait les informations du canal (titre, description, lien) et des articles (titre, lien, date de publication). Les données sont affichées dans la console, avec une gestion des erreurs pour les problèmes de connexion ou de parsing, démontrant ainsi l’interaction avec des données web en Java.

## Conseils

Pour optimiser votre expérience, suivez ces conseils. Assurez-vous que les noms de fichiers Java correspondent au nom de la classe publique qu'ils contiennent (par exemple, Main.java pour public class Main). Si vous utilisez des packages, indiquez le chemin correct dans le nom du fichier, comme ca/teluq/informatique/Fibo.java pour un fichier dans le package ca.teluq.informatique. Testez d'abord avec les exemples fournis pour comprendre comment l'environnement gère les entrées et sorties. Si vous travaillez avec des fichiers texte, comme dans l'exemple d'affichage de fichier, vérifiez que le nom du fichier texte correspond à celui utilisé dans votre code Java. Enfin, consultez la version de Java affichée en bas de la page pour vous assurer que votre code est compatible. Cet environnement est idéal pour apprendre et tester des programmes Java simples sans installer de logiciel.

L'environnement est limité pour les besoins du cours. Nous vous suggérons de n'inclure qu'une seule classe ayant une méthode `main`. Par ailleurs, vous ne pouvez pas construire d'interface graphiques ou de serveurs web. L'environnement ne permet pas non plus d'exécuter des programmes
arbitraires. L'exécution doit être brève et ne pas nécessiter trop de mémoire.