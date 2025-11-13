---
title: "Formattage du code Java"
weight: 3
---

## Formattage du code Java

Dans le cadre de ce cours, vous aurez à composer et remettre du code Java. Il est important
de bien mettre en forme le code Java.  Si vous préparez vos travaux avec Microsoft Word, celui-ci ne permet pas de mettre facilement le code en forme. À cette fin, vous pouvez insérer votre code Java dans la zone de texte
et copier ensuite le résultat dans votre logiciel de traitement de texte. Vous devez garder vos lignes de code courtes, ajuster la taille de la police de caractères au besoin. Consultez [nos conseils](/docs/modules/module2/conseils/) pour bien préparer votre code Java.


  <!-- Prism.js CSS (Default light theme for better Word compatibility) -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/themes/prism.min.css" rel="stylesheet" />

  <!-- Prism.js Core + Java plugin -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/components/prism-core.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/plugins/autoloader/prism-autoloader.min.js"></script>

  <link href="https://fonts.googleapis.com/css2?family=Fira+Code:wght@400;500&display=swap" rel="stylesheet">

<div id="warning" style="display: none; background: #ffcccc; color: #cc0000; padding: 10px; text-align: center; font-weight: bold;">Attention : Une ou plusieurs lignes dépassent 80 caractères !</div>

<div style="display: flex; flex-direction: column;">
  <div style="padding: 12px 20px; background: #007acc; color: white; font-weight: 600; font-size: 14px; display: flex; justify-content: space-between; align-items: center;">Écrivez ou collez du code Java ici</div>
  <textarea id="input" spellcheck="false" autofocus style="resize: none; font-family: 'Fira Code', 'Consolas', monospace; font-size: 15px; padding: 20px; border: none; outline: none; background: #ffffff; color: #000000; line-height: 1.5; height: 10cm;">// Exemple: Hello World
void main() {
    var nom = "Alice";
    System.out.println("Bonjour, " + nom + " ! 😊");
}
</textarea>
</div>

<div style="display: flex; flex-direction: column; flex: 1;">
  <div style="padding: 12px 20px; background: #007acc; color: white; font-weight: 600; font-size: 14px; display: flex; justify-content: space-between; align-items: center;">
    Résultat formaté
    <button style="background: #005a9e; color: white; border: none; padding: 5px 10px; cursor: pointer;  border-radius: 3px;" id="copyBtn">Copier</button>
  </div>
  <pre style="margin: 0; padding: 20px; overflow: auto; background: #ffffff; height: 15cm; "><code class="language-java" id="highlighted" style="height: 100%;font-size: 9pt; font-weight: bold; line-height: 1.0;"></code></pre>
</div>

<script>
  const input = document.getElementById('input');
  const highlighted = document.getElementById('highlighted');

  function update() {
    highlighted.textContent = input.value || ' '; // Prism needs at least one character
    Prism.highlightElement(highlighted);
    
    // Check for lines longer than 100 characters
    const lines = input.value.split('\n');
    const hasLongLine = lines.some(line => line.length > 80);
    const warning = document.getElementById('warning');
    warning.style.display = hasLongLine ? 'block' : 'none';
  }

  // Initial highlight
  update();

  // Live update as you type
  input.addEventListener('input', update);
  input.addEventListener('scroll', () => {
    document.querySelector('pre').scrollTop = input.scrollTop;
  });

  // Copy to clipboard by selecting the formatted text
  document.getElementById('copyBtn').addEventListener('click', () => {
    const highlighted = document.getElementById('highlighted');
    
    // Select the text
    const range = document.createRange();
    range.selectNodeContents(highlighted);
    const selection = window.getSelection();
    selection.removeAllRanges();
    selection.addRange(range);
    
    // Copy to clipboard
    try {
      document.execCommand('copy');
      alert('Texte sélectionné et copié dans le presse-papiers ! Vous pouvez maintenant coller dans votre logiciel de traitement de texte.');
    } catch (err) {
      console.error('Failed to copy: ', err);
      alert('Échec de la copie. Veuillez sélectionner le texte manuellement et le copier.');
    }
  });
</script>