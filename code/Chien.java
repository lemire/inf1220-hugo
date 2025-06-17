public class Chien extends Animaux {
   @Override
   public void greeting() {
      System.out.println("Woof!");
   }
   public void greeting(Chien another) {
      System.out.println("Woooooooooof!");
   }
}
