import java.util.*;
import java.io.*;

public class CardTrick {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter text: ");
      for (int i = scan.nextInt(); i > 0; i--)
      {
         for (int x : sort(scan.nextInt()))
            System.out.print(x + " ");
      }
   }
   
   public static ArrayList<Integer> sort(int num) {
     ArrayList<Integer> cards = new ArrayList<Integer>(num);
     cards.add(num);
     for (int i = num-1; i > 0; i--) {
         cards.add(0,i);
         for (int j = 0; j < i; j++) {
            cards.add(0,cards.remove(cards.size()-1));
         }
     }
     return cards;
   }
}