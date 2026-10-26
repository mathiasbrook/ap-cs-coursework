// Name: Mathias Brook
// Date: 9/8/23
    
import java.util.*;
  
public class DiceCup
{
   private int firstInt;
   private int secondInt;
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first value: ");
      int firstInt = sc.nextInt();
      System.out.println("Enter the second value: ");
      int secondInt = sc.nextInt();
      roll(firstInt, secondInt);
   }

   public static void roll(int firstInt, int secondInt)
   {
      for (int i = (Math.min(firstInt,secondInt))+1; i <= (Math.max(firstInt,secondInt)) + 1; i++) {
         System.out.println(i);
      }
   }
}