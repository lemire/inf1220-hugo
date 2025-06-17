import java.io.*;

class Travail4 {
  public static void main(String[] args) throws IOException {
    File FichierALire = new File("partie1.txt");
    try (
      FileReader unFichier = new FileReader(FichierALire);
      BufferedReader leBuffer = new BufferedReader(unFichier);
    ) {
      // Nous avons les fichiers partie1.txt,
      // partie2.txt et partie3.txt.
      System.out.println("ligne: "+ leBuffer.readLine());
    } catch (FileNotFoundException exception) {
      System.out.println(" Fichier introuvable!");
    }
  }
}