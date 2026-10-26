public class WordMatch{

   private String secret;

   public WordMatch(String word){
      secret = word;
   }
   
   public int scoreGuess(String guess){
      int count = 0;
      for (int i = 0; i < secret.length(); i++) {
         if (secret.substring(i).startsWith(guess)) count++;
      }
      return count*(guess.length()*guess.length());
   }
     
   public String findBetterGuess(String guess1,String guess2){
      int return1 = scoreGuess(guess1);
      int return2 = scoreGuess(guess2);
      if (return1 == return2) {
         return (guess1.compareTo(guess2) > guess2.compareTo(guess1)) ? guess1 : guess2;
      }
      return (return1 > return2) ? guess1 : guess2;
   }
     
   public static void main(String[] args){
      WordMatch game = new WordMatch("mississippi");
      WordMatch game2 = new WordMatch("aaaabb");
      WordMatch game3 = new WordMatch("concatenation");
      System.out.println("Expected 4  " + game.scoreGuess("i"));
      System.out.println("Expected 18  " + game.scoreGuess("iss"));
      System.out.println("Expected 36  " + game.scoreGuess("issipp"));
      System.out.println("Expected 121  " + game.scoreGuess("mississippi"));
      System.out.println("Expected 4  " + game2.scoreGuess("a"));
      System.out.println("Expected 12  " + game2.scoreGuess("aa"));
      System.out.println("Expected 18  " + game2.scoreGuess("aaa"));
      System.out.println("Expected 16  " + game2.scoreGuess("aabb"));
      System.out.println("Expected 0 " + game2.scoreGuess("c"));
      System.out.println("Expected 9 " + game3.scoreGuess("ten"));
      System.out.println("Expected 36 " + game3.scoreGuess("nation"));
      System.out.println("Expected nation " + game3.findBetterGuess("ten","nation"));
      System.out.println("Expected con " + game3.findBetterGuess("con","cat"));
      
   }
   
}