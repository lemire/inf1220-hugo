---
title: "Programmation Java en ligne"
weight: 2
---

  <style>
    /*.container { max-width: 900px; margin: 40px auto; background: #fff; border-radius: 8px; box-shadow: 0 2px 8px #0001; padding: 32px; }*/
    .files { margin-bottom: 24px; }
    .file-block { background: #f9f9f9; border: 1px solid #ddd; border-radius: 6px; padding: 16px; margin-bottom: 12px; position: relative; }
    label { display: block; font-weight: bold; margin-bottom: 4px; }
    input[type=text], textarea { width: 100%; padding: 8px; margin-bottom: 8px; border-radius: 4px; border: 1px solid #ccc; font-family: monospace; }
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
  <div class="container">
    <h1>Java en ligne</h1>
    <form id="runForm">
      <div style="display:flex; align-items:center; gap:16px; margin-bottom:18px;">
        <label for="example-select" style="font-weight:normal; color:#444;">Exemples :</label>
        <select id="example-select" style="padding:6px 12px; border-radius:4px; border:1px solid #ccc;">
          <option value="">Sélectionner un exemple...</option>
          <option value="ex1">Affichage d'un fichier texte (2 Java + 1 texte)</option>
          <option value="ex2">Bonjour le monde (simple)</option>
          <option value="ex3">Fibonacci (package, commentaires FR)</option>
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
      document.getElementById('result').textContent = 'Exécution en cours...';
      const resp = await fetch('{{<endpoint>}}', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ java_files, txt_files })
      });
      let resultText = await resp.text();
      let displayDiv = document.getElementById('result');
      try {
        const resultJson = JSON.parse(resultText);
        if (resultJson.status === 'ran_successfully') {
          displayDiv.innerHTML = '<pre style="color:#222;background:#e0ffe0;padding:12px;border-radius:6px;">' +
            (resultJson.output || '').replace(/\n/g, '<br>') + '</pre>';
          // Nettoie les erreurs précédentes
          document.querySelectorAll('.file-block').forEach(block => {
            if (block._cm) {
              block._cm.operation(() => {
                block._cm.getAllMarks().forEach(m => m.clear());
              });
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
        displayDiv.textContent = resultText;
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
      }
    };
  </script>
