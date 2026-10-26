// Name: Mathias Brook
// Date: 9/18/23
    
import java.util.*;
  
public class AlphabetSpam
{
   private String text;
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter text: ");
      String text = sc.next();
      spamTest(text);
   }

   public static void spamTest(String text)
   {
      double whitespace = 0;
      double lowercase = 0;
      double uppercase = 0;
      double symbol = 0;
      for (int i = 0; i < text.length(); i++) {
         char temp = text.charAt(i);
         if (temp == 95) whitespace++; 
         if (temp >= 65 && temp <= 90) uppercase++;
         if (temp >= 97 && temp <= 122) lowercase++;         
         if (temp != 95 && ((temp >= 33 && temp <= 64) || (temp >= 91 && temp <= 96) || (temp >= 123 && temp <= 126))) symbol++;
      }
      
      System.out.println(whitespace/text.length());
      System.out.println(lowercase/text.length());
      System.out.println(uppercase/text.length());
      System.out.println(symbol/text.length());
   }
}