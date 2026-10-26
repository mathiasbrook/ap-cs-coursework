// Name: Mathias Brook
// Date: 9/26/23
    
import java.util.*;
  
public class PokerHand
{
   private static String list = "A23456789TJQK";
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the hand: ");
      String firstString = sc.nextLine();
      findStrength(firstString);
   }

   public static void findStrength(String deck)
   {
      int[] cards = new int[13];
      int max = 0;      
      for (int i = 0; i < deck.length(); i+=3){
         String temp = deck.substring(i,i+1);
         cards[list.indexOf(temp)]++;
      
      }

      for (int i = 0; i < cards.length-1; i++)
         max = Math.max(max,cards[i]);  
      System.out.println(max);
   }
}