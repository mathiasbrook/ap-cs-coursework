import java.util.*;
import java.io.*;

public class OwlAndFox {
   public static void main(String[] args){
      Scanner words = new Scanner(System.in);
      System.out.println("Enter text: ");
      int size = words.nextInt();
      for (; size > 0; size--) {
         String num = words.next();
         System.out.println(findNum(num));
      }
   }
   
   public static int findNum(String num) {
      int sum = 0;
      for (int i = 0; i < num.length(); i++) {
          sum += Integer.parseInt(num.substring(i,i+1));
      }
      int sum2 = 0;
      int num2 = Integer.parseInt(num)-1;
      for (; num2 > 0; num2--) {
         sum2 = 0;
         String temp = Integer.toString(num2);
         for (int j = 0; j < temp.length(); j++) {
            sum2 += Integer.parseInt(temp.substring(j,j+1));
         }
         if (sum2 == (sum-1)) break;
      }
      return num2;
   }
   
}