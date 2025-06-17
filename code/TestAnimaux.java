public class TestAnimaux {
   public static void main(String[] args) {
      Chat cat1 = new Chat();
      cat1.greeting();
      Chien dog1 = new Chien();
      dog1.greeting();
      GrosChien bigDog1 = new GrosChien();
      bigDog1.greeting();
      
      Animaux animal1 = new Chien ();
      animal1.greeting();
      Animaux animal2 = new Chien();
      animal2.greeting();
      Animaux animal3 = new GrosChien();
      animal3.greeting();
      
      Chien dog2 = (Chien)animal2;
      GrosChien bigDog2 = (GrosChien)animal3;
      Chien dog3 = (Chien)animal3;
      dog2.greeting(dog3);
      dog3.greeting(dog2);
      dog2.greeting(bigDog2);
      bigDog2.greeting(dog2);
      bigDog2.greeting(bigDog1);
      Chat cat2 = (Chat)animal2;
   }
}
