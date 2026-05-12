---
title: "Entretien de suivi"
weight: 7
---

# Entretien de suivi

Vous devez être capable de produire ce code lorsque quelqu’un vous le demande de vive voix. Si vous ne maîtrisez pas la syntaxe du langage Java ou ses principaux concepts, vous devriez échouer le cours. Vous devez être capable de produire du code fonctionnel et correctement mis en forme. L’IA est interdite pendant l’entretien de suivi à moins d'indication contraire de la part de la personne qui vous encadre.
L’environnement ci-dessous vous permet de répondre aux questions de l’enseignant pendant votre entretien. Vous pouvez ajouter des fichiers Java, écrire votre code, puis l’exécuter. Aucun exemple préexistant n’est fourni : vous devez écrire votre propre code à partir des consignes données de vive voix.


  <style>
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
    <h1>Java en ligne — entretien</h1>
    <form id="runForm">
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
    const endpointUrl = new URL('{{<endpoint>}}', window.location.href);
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
    function addDefaultFile() {
      addFile('java', 'Allo.java', 'mettre le code ici');
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
      const controller = new AbortController();
      const timeoutId = setTimeout(() => controller.abort(), 30000);
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
          } else if (resultJson.status === 'compiling') {
            displayDiv.innerHTML = '<pre style="color:#c00;background:#ffe0e0;padding:12px;border-radius:6px;">' +
              (resultJson.error || '').replace(/\n/g, '<br>') + '</pre>';
            const errorText = resultJson.error || '';
            const errorRegex = /([\w./\\-]+\.java):(\d+): error: ([^\n]+)([\s\S]*?)(?=\n[\w./\\-]+\.java:|$)/g;
            let match;
            document.querySelectorAll('.file-block').forEach(block => {
              if (block._cm) {
                block._cm.operation(() => {
                  block._cm.getAllMarks().forEach(m => m.clear());
                });
              }
            });
            while ((match = errorRegex.exec(errorText)) !== null) {
              const [_, file, lineStr, msg, details] = match;
              const line = parseInt(lineStr, 10) - 1;
              document.querySelectorAll('.file-block').forEach(block => {
                const nameInput = block.querySelector('input[type=text]');
                if (nameInput && (nameInput.value.trim() === file || nameInput.value.trim().endsWith('/'+file) || nameInput.value.trim().endsWith('\\'+file))) {
                  if (block._cm) {
                    block._cm.operation(() => {
                      const mark = block._cm.markText({line, ch:0}, {line:line+1, ch:0}, {
                        className: 'cm-java-error',
                        title: (msg + (details ? details.replace(/\s+/g, ' ') : '')).trim()
                      });
                      const statusBar = block.querySelector('.java-status-bar');
                      if (statusBar) {
                        const errorMsg = (msg + (details ? details.replace(/\s+/g, ' ') : '')).trim();
                        if (!block._cm._javaErrorStatusListeners) block._cm._javaErrorStatusListeners = [];
                        block._cm._javaErrorStatusListeners.forEach(({line, handler}) => {
                          block._cm.off('cursorActivity', handler);
                        });
                        block._cm._javaErrorStatusListeners = [];
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
                        const lineHandle = block._cm.getLineHandle(line);
                        if (lineHandle) {
                          block._cm.addLineClass(lineHandle, 'wrap', 'cm-java-error-line');
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
      addDefaultFile();
    };
    fetch(javaVersionUrl).then(r => r.json()).then(data => {
      if (data.version) {
        document.getElementById('java-version').textContent = 'Java : ' + data.version;
      }
    });
  </script>
