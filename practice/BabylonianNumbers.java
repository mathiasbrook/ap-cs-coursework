// Name: Mathias Brook
// Date: 10/16/23

import java.util.*;
import java.io.*;

public class BabylonianNumbers
{
   public static void main(String[] args)
   {
      Scanner nums = new Scanner(System.in);
      System.out.println("Enter text: ");
      int size = Integer.valueOf(nums.nextLine());
      String temp = nums.nextLine();
      for (int i = 0; i < size; i++) {
         System.out.println(convert(temp));
         temp = nums.nextLine();
      }
   }
   public static int convert(String num) {
      ArrayList<Integer> temp = new ArrayList<Integer>();
      for (int i = 0; i < num.length(); i++) {
         if (i == 0 && num.length() > 1 && num.charAt(i) == ',') {
            temp.add(0);
            num = num.substring(i+1);
            i = -1;
         }
         else if (i != 0 && num.charAt(i) == ',' && num.charAt(i-1) != ',') {
            temp.add(Integer.valueOf(num.substring(0,i)));
            num = num.substring(i+1);
            i = -1;
         }
         else if (i == 0 && num.length() == 1 && num.charAt(i) == ',') {
            temp.add(0);
            temp.add(0);
            num = "";
         }
      }
      if (num.length() > 0) temp.add(Integer.valueOf(num));
      int sum = 0;
      int size = temp.size()-1;
      for (int i = 0; i < temp.size(); i++) {  
         sum += temp.get(i)*Math.pow(60,size);
         size--;
      }
      return sum;
   }
}