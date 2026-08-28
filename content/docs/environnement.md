---
title: "Programmation Java en ligne"
weight: 2
---


# Programmation Java en ligne

Vous pouvez faire une grande partie des exercices et des travaux du cours en ligne, dans votre navigateur.
Pour commencer à programmer dans cet environnement Java en ligne, familiarisez-vous avec son interface intuitive. La page principale affiche une zone où vous pouvez ajouter des fichiers Java ou texte. Cliquez sur «&nbsp;Ajouter un fichier Java&nbsp;» pour créer un fichier avec l'extension .java, ou «&nbsp;Ajouter un fichier texte&nbsp;» pour un fichier .txt. Chaque fichier apparaît dans une boîte avec un champ pour le nom et un éditeur de texte. Pour les fichiers Java, l'éditeur offre une coloration syntaxique et des numéros de ligne, facilitant la lecture et l'écriture du code. Vous pouvez aussi sélectionner des exemples prédéfinis (comme «&nbsp;Bonjour le monde&nbsp;» ou «&nbsp;Fibonacci&nbsp;») via le menu déroulant «&nbsp;Exemples&nbsp;» pour charger automatiquement des fichiers modèles. Une fois vos fichiers prêts, cliquez sur «&nbsp;Exécuter&nbsp;» pour compiler et exécuter le code.

Lorsque vous exécutez votre programme, l'environnement tente de compiler et d'exécuter votre code. Le résultat s'affiche dans la zone «&nbsp;Résultat&nbsp;» en bas de la page. Si le programme s'exécute correctement, vous verrez la sortie attendue, comme du texte affiché par System.out.println. En cas d'erreur de compilation, le message d'erreur apparaît avec des détails précis, et les lignes problématiques dans vos fichiers Java sont surlignées en rouge dans l'éditeur. Passez la souris sur ces lignes pour voir le message d'erreur complet dans la barre d'état sous l'éditeur. Vous pouvez modifier le code directement dans l'éditeur et réexécuter pour tester vos corrections. Pour supprimer un fichier, cliquez sur le «&nbsp;×&nbsp;» en haut à droite de sa boîte.

Le bouton «&nbsp;partager&nbsp;» copie un URL dans votre presse-papiers. Vous pouvez ensuite partager
cet URL avec quelqu'un d'autre pour qu'il puisse voir l'état de votre code informatique au moment
où vous avez appuyé sur le bouton «&nbsp;partager&nbsp;». Cette option est pratique notamment lors
de la remise de vos travaux notés. Avant de transmettre votre URL à quelqu'un d'autre, nous vous
encoourageons à le tester sur votre propre machine en le collant dans la barre d'adresse de votre navigateur.

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
      color: #6b6b6b;
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
    <h2>Java en ligne</h2>
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
          <option value="travail-note-2">Travail noté 2</option>
          <option value="travail-note-4">Travail noté 4</option>
        </select>
      </div>
      <div id="files" class="files"></div>
      <div style="display:flex; align-items:center; gap:12px; margin-bottom:0; margin-top:12px;">
        <button type="submit">Exécuter</button>
        <button type="button" id="shareBtn">Partager</button>
        <div class="add-btns" style="margin:0;">
          <button type="button" class="add-file" onclick="addFile('java')">Ajouter un fichier Java</button>
          <button type="button" class="add-file" onclick="addFile('txt')">Ajouter un fichier texte</button>
        </div>
      </div>
    </form>
    <div id="result"></div>
    <div style="text-align:center; margin-top:32px; color:#6b6b6b;">(c) Daniel Lemire</div>
    <div id="java-version" style="text-align:center; margin-top:8px; color:#6b6b6b;"></div>
  </div>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.16/codemirror.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.16/mode/clike/clike.min.js"></script>
  <script>
    let fileCount = 0;
    const endpointUrl = new URL('{{<endpoint>}}', window.location.href);
    const codeStoreBaseUrl = new URL('../code-store', endpointUrl).toString();
    const javaVersionUrl = new URL('../java-version', endpointUrl).toString();
    function addFile(type, initialName = '', initialContent = '') {
      const filesDiv = document.getElementById('files');
      const block = document.createElement('div');
      block.className = 'file-block';
      const isJava = type === 'java';
      const codeId = `code_${fileCount}`;
      block.innerHTML = `
        <button type="button" class="remove-x" title="Retirer" onclick="this.parentElement.remove()">×</button>
        <div class="file-type">Type : <b>${isJava ? 'Java' : 'Texte'}</b></div>
        <label for="name_${fileCount}">Nom du fichier</label>
        <input type="text" id="name_${fileCount}" name="${type}_name_${fileCount}" placeholder="${isJava ? 'Main.java' : 'fichier.txt'}" required value="${initialName}">
        <label for="${codeId}">Contenu</label>
        ${isJava
          ? `<textarea id="${codeId}" name="${type}_content_${fileCount}" rows="6"></textarea>`
          : `<textarea id="${codeId}" name="${type}_content_${fileCount}" rows="6" required>${initialContent}</textarea>`}
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
          autofocus: fileCount === 0,
          // Tab doit déplacer le focus plutôt qu'indenter (WCAG 2.1.2).
          extraKeys: {
            Tab: false,
            "Shift-Tab": false,
            Esc: function(c) { c.display.input.blur(); }
          }
        });
        editor.setValue(initialContent);
        const cmLabel = 'Éditeur de code Java';
        editor.getWrapperElement().setAttribute('role', 'group');
        editor.getWrapperElement().setAttribute('aria-label', cmLabel);
        if (editor.getInputField()) { editor.getInputField().setAttribute('aria-label', cmLabel); }
        block._cm = editor;
      }
      fileCount++;
    }
    function getCurrentFilesData() {
      const java_files = [], txt_files = [];
      document.querySelectorAll('.file-block').forEach(block => {
        const type = block.querySelector('.file-type b').textContent === 'Java' ? 'java' : 'txt';
        const nameInput = block.querySelector('input[type=text]');
        let content;
        if (type === 'java' && block._cm) {
          content = block._cm.getValue();
          const textarea = block.querySelector('textarea');
          if (textarea) {
            textarea.value = content;
          }
        } else {
          content = block.querySelector('textarea').value;
        }
        if (type === 'java') {
          java_files.push({ name: nameInput.value, content });
        } else {
          txt_files.push({ name: nameInput.value, content });
        }
      });
      return { java_files, txt_files };
    }
    function loadFilesFromStoredCode(code) {
      clearFiles();
      (code.java_files || []).forEach(file => {
        addFile('java', file.name, file.content);
      });
      (code.txt_files || []).forEach(file => {
        addFile('txt', file.name, file.content);
      });
    }
    function loadFilesFromLegacyPayload(json) {
      clearFiles();
      json.files.forEach(file => {
        addFile(file.type, file.name, file.content);
      });
    }
    function addDefaultFile() {
      addFile('java', 'Bonjour.java', 'void main() {\n    System.out.println("Bonjour le monde!");\n}');
    }
    document.getElementById('runForm').onsubmit = async function(e) {
      e.preventDefault();
      const { java_files, txt_files } = getCurrentFilesData();
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
        if (!resp.ok && resp.status !== 400 && resp.status !== 500) {
          throw new Error(`Erreur HTTP ${resp.status} : ${resp.statusText}`);
        }
        let resultText = await resp.text();
        clearInterval(execAnim);
        let displayDiv = document.getElementById('result');
        function escapeHtml(str) {
          if (str == null) return '';
          return String(str)
            .replace(/&/g, '&amp;')
            .replace(/</g, '&lt;')
            .replace(/>/g, '&gt;')
            .replace(/"/g, '&quot;')
            .replace(/'/g, '&#39;');
        }
        try {
          const resultJson = JSON.parse(resultText);
          if (resultJson.status === 'ran_successfully') {
            displayDiv.innerHTML = '<pre style="color:#222;background:#e0ffe0;padding:12px;border-radius:6px;">' +
              escapeHtml(resultJson.output || '').replace(/\n/g, '<br>') + escapeHtml(resultJson.stderr || '') + '</pre>';
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
          } else if (resultJson.status === 'error') {
            const errText = resultJson.stderr || resultJson.error || '';
            document.querySelectorAll('.file-block').forEach(block => {
              if (block._cm && block.querySelector('.file-type b').textContent === 'Java') {
                block._cm.operation(() => {
                  block._cm.getAllMarks().forEach(m => m.clear());
                  block._cm.eachLine(lineHandle => {
                    block._cm.removeLineClass(lineHandle, 'wrap', 'cm-java-error-line');
                  });
                });
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
            displayDiv.innerHTML =
              (resultJson.output
                ? '<pre style="color:#222;background:#e0ffe0;padding:12px;border-radius:6px;">' +
                  escapeHtml(resultJson.output).replace(/\n/g, '<br>') + '</pre>'
                : '') +
              '<pre style="color:#c00;background:#ffe0e0;padding:12px;border-radius:6px;">' +
              escapeHtml(errText).replace(/\n/g, '<br>') + '</pre>';
            // Surligne dans l'éditeur les lignes citées par la trace d'exécution
            const causeLines = errText.split('\n').filter(l => /Caused by:/.test(l));
            const errMsg = (causeLines.length
              ? causeLines[causeLines.length - 1].replace(/^.*Caused by:\s*/, '')
              : (errText.split('\n')[0] || 'Erreur d’exécution')).trim();
            const stackRegex = /\(([\w$-]+\.java):(\d+)\)/g;
            const seen = {};
            let frame;
            while ((frame = stackRegex.exec(errText)) !== null) {
              const file = frame[1], line = parseInt(frame[2], 10) - 1;
              if (line < 0 || seen[file + ':' + line]) continue;
              seen[file + ':' + line] = true;
              document.querySelectorAll('.file-block').forEach(block => {
                const nameInput = block.querySelector('input[type=text]');
                const nm = nameInput ? nameInput.value.trim() : '';
                if (block._cm && line < block._cm.lineCount() &&
                    (nm === file || nm.endsWith('/' + file) || nm.endsWith('\\' + file))) {
                  block._cm.operation(() => {
                    block._cm.markText({line: line, ch: 0}, {line: line + 1, ch: 0}, {
                      className: 'cm-java-error', title: errMsg
                    });
                    const lineHandle = block._cm.getLineHandle(line);
                    if (lineHandle) block._cm.addLineClass(lineHandle, 'wrap', 'cm-java-error-line');
                  });
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
    window.onload = async () => {
      const urlParams = new URLSearchParams(window.location.search);
      const shortjavacode = urlParams.get('shortjavacode');
      const javacode = urlParams.get('javacode');
      if (shortjavacode) {
        try {
          const resp = await fetch(codeStoreBaseUrl + '/' + encodeURIComponent(shortjavacode));
          if (!resp.ok) {
            throw new Error(`Erreur HTTP ${resp.status} : ${resp.statusText}`);
          }
          const resultJson = await resp.json();
          if (!resultJson.code) {
            throw new Error('Réponse code-store invalide');
          }
          loadFilesFromStoredCode(resultJson.code);
          return;
        } catch (e) {
          console.error('Impossible de charger shortjavacode', e);
        }
      }
      if (javacode) {
        try {
          const json = JSON.parse(decodeURIComponent(escape(atob(javacode))));
          loadFilesFromLegacyPayload(json);
          return;
        } catch (e) {
          console.error('Invalid javacode parameter', e);
        }
      }
      addDefaultFile();
    };
    fetch(javaVersionUrl).then(r => r.json()).then(data => {
      if (data.version) {
        document.getElementById('java-version').textContent = 'Java : ' + data.version;
      }
    });
    function showCopyUrlDialog(url) {
      const overlay = document.createElement('div');
      overlay.style.position = 'fixed';
      overlay.style.inset = '0';
      overlay.style.background = 'rgba(0,0,0,0.35)';
      overlay.style.display = 'flex';
      overlay.style.alignItems = 'center';
      overlay.style.justifyContent = 'center';
      overlay.style.zIndex = '9999';
      const modal = document.createElement('div');
      modal.style.background = '#fff';
      modal.style.padding = '16px';
      modal.style.borderRadius = '8px';
      modal.style.maxWidth = '680px';
      modal.style.width = '90%';
      modal.style.boxShadow = '0 6px 24px rgba(0,0,0,0.2)';
      const title = document.createElement('div');
      title.textContent = 'Copier l\'URL de partage';
      title.style.fontWeight = 'bold';
      title.style.marginBottom = '8px';
      const input = document.createElement('textarea');
      input.value = url;
      input.readOnly = true;
      input.style.width = '100%';
      input.style.height = '84px';
      input.style.fontFamily = 'monospace';
      input.style.marginBottom = '12px';
      const actions = document.createElement('div');
      actions.style.display = 'flex';
      actions.style.justifyContent = 'flex-end';
      actions.style.gap = '8px';
      const cancelBtn = document.createElement('button');
      cancelBtn.type = 'button';
      cancelBtn.textContent = 'Annuler';
      cancelBtn.style.background = '#9e9e9e';
      const copyBtn = document.createElement('button');
      copyBtn.type = 'button';
      copyBtn.textContent = 'Copier';
      const close = () => {
        document.body.removeChild(overlay);
      };
      cancelBtn.onclick = close;
      copyBtn.onclick = () => {
        input.select();
        input.setSelectionRange(0, 999999);
        try {
          const ok = document.execCommand('copy');
          if (ok) {
            close();
            return;
          }
        } catch (e) {
        }
        navigator.clipboard.writeText(url).then(() => {
          close();
        }).catch(() => {
        });
      };
      modal.appendChild(title);
      modal.appendChild(input);
      actions.appendChild(cancelBtn);
      actions.appendChild(copyBtn);
      modal.appendChild(actions);
      overlay.appendChild(modal);
      document.body.appendChild(overlay);
      input.focus();
      input.select();
      overlay.addEventListener('click', (event) => {
        if (event.target === overlay) {
          close();
        }
      });
    }
    document.getElementById('shareBtn').onclick = async () => {
      const { java_files, txt_files } = getCurrentFilesData();
      const files = [
        ...java_files.map(file => ({ ...file, type: 'java' })),
        ...txt_files.map(file => ({ ...file, type: 'txt' }))
      ];
      const json = { files };
      const encoded = btoa(unescape(encodeURIComponent(JSON.stringify(json))));
      let url = window.location.href.split('?')[0] + '?javacode=' + encodeURIComponent(encoded);
      try {
        const resp = await fetch(codeStoreBaseUrl, {
          method: 'POST',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify({ java_files, txt_files })
        });
        if (!resp.ok) {
          throw new Error(`Erreur HTTP ${resp.status} : ${resp.statusText}`);
        }
        const resultJson = await resp.json();
        if (!resultJson.id) {
          throw new Error('Réponse code-store invalide');
        }
        url = window.location.href.split('?')[0] + '?shortjavacode=' + encodeURIComponent(resultJson.id);
      } catch (err) {
        console.error('Erreur lors du stockage court du code', err);
      }
      navigator.clipboard.writeText(url).then(() => {
        alert('URL copiée dans le presse-papiers !');
      }).catch(err => {
        console.error('Erreur lors de la copie', err);
        showCopyUrlDialog(url);
      });
    };
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
}`);
       } else if (v === 'travail-note-4') {
        addFile('java', 'Travail4.java',
`import java.io.*;
import java.util.*;
public class Travail4 {
    public static void main(String[] args) {
        String filename = "partie1.txt";
        try {
          //
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static int[][] loadGrid(String filename) throws IOException {
        int[][] grid = new int[9][9];
        return grid;
    }
    private static boolean validateGrid(int[][] grid) {
        return true;
    }
    private static int[][] transposeGrid(int[][] grid) {
        int[][] transposed = new int[9][9];
        return transposed;
    }
    private static void printGrid(int[][] grid) {
    }
}`);
        addFile('txt', 'partie1.txt', '001 012 023 034 045 056 067 078 089 102 113 124 135 146 157 168 179 181 203 214 225 236 247 258 269 271 282 304 315 326 337 348 359 361 372 383 405 416 427 438 449 451 462 473 484 506 517 528 539 541 552 563 574 585 607 618 629 631 642 653 664 675 686 708 719 721 732 743 754 765 776 787 809 811 822 833 844 855 866 877 888');
        addFile('txt', 'partie2.txt', '016 112 214 319 417 511 618 713 815 027 129 221 328 425 523 626 722 824 033 138 235 332 436 534 631 737 839 048 141 243 347 449 545 644 746 842 059 157 252 351 454 556 655 758 853 065 164 266 363 462 568 667 769 861 074 173 279 376 471 577 672 775 878 081 186 288 385 483 582 689 784 887 092 195 297 394 498 599 693 791 893');
        addFile('txt', 'partie3.txt', '014 116 218 313 411 517 615 712 819 022 127 225 324 428 529 623 726 821 031 133 239 335 436 532 637 734 838 045 148 246 349 447 541 642 743 844 057 159 252 356 454 553 651 758 855 063 161 264 362 465 568 669 767 866 079 174 273 371 472 576 678 775 877 086 182 287 388 489 585 684 781 883 098 195 291 397 493 594 696 799 892');
      } else if (v === 'travail-note-2') {
        addFile('java', 'Cercle.java',
`public class Cercle {
}`);
        addFile('java', 'TestCercle.java',
`public class TestCercle {
    public static void main(String[] args) {
        // Test avec un rayon de 1
        Cercle c = new Cercle(1);
        System.out.println("Aire du cercle de rayon 1: " + c.aire());
        System.out.println("Périmètre du cercle de rayon 1: " + c.perimetre());
        // Test avec un rayon de 0
        Cercle c2 = new Cercle(0);
        System.out.println("Aire du cercle de rayon 0: " + c2.aire());
        System.out.println("Périmètre du cercle de rayon 0: " + c2.perimetre());
    }
}`);
      }
      }
  </script>

## Description des exemples

- Affichage d'un fichier texte: Cet exemple comprend deux classes Java, ProgrammeAffichageFichier et UtilitaireLectureFichier, accompagnées d’un fichier texte fichier.txt contenant la phrase "Bonjour la vie". Le programme lit ce fichier à l’aide d’un BufferedReader et affiche son contenu ligne par ligne dans la console. La classe UtilitaireLectureFichier encapsule la logique de lecture et gère les exceptions d’entrée/sortie (IOException) pour signaler toute erreur, comme un fichier introuvable, garantissant une exécution robuste.
- Bonjour le monde : L’exemple propose une classe simple nommée Bonjour, qui constitue une version classique du programme "Hello World" en Java. La méthode main utilise la fonction System.out.println pour afficher le message "Bonjour le monde !" dans la console. Ce code illustre la structure minimale d’un programme Java exécutable, idéal pour les débutants apprenant les bases de la syntaxe et de la sortie console.
- Fibonacci : La classe Fibo, placée dans le paquetage ca.teluq.informatique, implémente une fonction récursive fibonacci pour calculer les termes de la suite de Fibonacci. Le programme affiche les dix premiers termes (de F(0) à F(9)) en bouclant sur la fonction et en montrant chaque résultat. Cet exemple démontre l’utilisation de la récursivité en Java, bien que cette approche puisse être inefficace pour de grands nombres en raison de calculs redondants.
- Mario : L’exemple Mario utilise des caractères Unicode pour créer une représentation graphique inspirée du jeu Super Mario dans la console. La méthode main affiche une scène avec des nuages, un soleil, des blocs, des pièces, un personnage, une tortue et un champignon. Ce programme montre comment manipuler des caractères spéciaux pour produire un affichage visuel simple, offrant une approche ludique de la sortie console.
- Chargement des articles du blogue de Daniel Lemire : La classe RssFeedReader illustre la récupération et le traitement d’un flux RSS à partir de l’URL https://lemire.me/blog/feed/. Elle établit une connexion HTTP, parse le XML avec DocumentBuilder, puis extrait les informations du canal (titre, description, lien) et des articles (titre, lien, date de publication). Les données sont affichées dans la console, avec une gestion des erreurs pour les problèmes de connexion ou de parsing, démontrant ainsi l’interaction avec des données web en Java.
- Code initial pour le travail 2 du cours.
- Code initial pour le travail 4 du cours.

## Conseils

Pour optimiser votre expérience, suivez ces conseils. Assurez-vous que les noms de fichiers Java correspondent au nom de la classe publique qu'ils contiennent (par exemple, Main.java pour public class Main). Si vous utilisez des packages, indiquez le chemin correct dans le nom du fichier, comme ca/teluq/informatique/Fibo.java pour un fichier dans le package ca.teluq.informatique. Testez d'abord avec les exemples fournis pour comprendre comment l'environnement gère les entrées et sorties. Si vous travaillez avec des fichiers texte, comme dans l'exemple d'affichage de fichier, vérifiez que le nom du fichier texte correspond à celui utilisé dans votre code Java. Enfin, consultez la version de Java affichée en bas de la page pour vous assurer que votre code est compatible. Cet environnement est idéal pour apprendre et tester des programmes Java simples sans installer de logiciel.

L'environnement est limité pour les besoins du cours. Nous vous suggérons de n'inclure qu'une seule classe ayant une méthode `main`. Par ailleurs, vous ne pouvez pas construire d'interface graphiques ou de serveurs web. L'environnement ne permet pas non plus d'exécuter des programmes
arbitraires. L'exécution doit être brève et ne pas nécessiter trop de mémoire.