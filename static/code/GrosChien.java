public class GrosChien extends Chien {
   @Override
   public void greeting() {
      System.out.println("Woow!");
   }
   @Override
   public void greeting(Chien another) {
      System.out.println("Woooooowwwww!");
   }
}
