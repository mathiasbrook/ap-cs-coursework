//Name: Mathias Brook

import java.util.Scanner;

//Loop Activites with Nested Loops and Scanner Class
public class NestedLoopActivities{

//A perfect number is a number that is equal to the sum of its factors
//Not including itself
//For example 6 = 1+2+3
//Find Perfect Numbers between start and end
//Return a String of the form  -  The perfect numbers between start and end are 444 and 5678
   public static String findPerfect(int start,int end){
      String ans = "The perfect numbers between start and end are ";
      int number = 0;
      for (int j = start; j <= end; j++) {
         number = 0;
         for (int i = 1; i <= j; i++) {
            if (j % i == 0 && j != i) {
               number += i; 
            }
         }
         if (j == number) ans += j + " and ";
      }
      return ans.substring(0,ans.length()-5);
   }
  
//Takes a String as input
//and returns a String with each letter repeated a numbmer of times equal to its index
//That means the first letter will not be in the returned string
//Example   cat --> att
//Example   plum --> luummm
   public static String repeatAllLetters(String str){
      String temp = "";
      for (int i = 1; i < str.length(); i++) {
         temp += str.substring(i,i+1).repeat(i);
      }
      return temp;
   
   }

     //Get a list of positive numbers from the keyboard using a scanner
     //Stop collecting numbers when a negative number is entered
     //Return the average of numbers as a double
   public static double averageOfList(){
      Scanner scan = new Scanner(System.in);
      double sum = 0;
      int count = 0;
      int x = scan.nextInt();
      while (true) {  
         if (x < 0) break;
         sum += x;
         count ++;
         x = scan.nextInt();
      }
      return sum/count;
   }
   
    //Return a string which is asterisks in the following pattern Example n = 4
   //****
   //***  
   //**    
   //*
   //**
   //***
   //****           
   public static String stars(int n){
      String temp = "";
      String temp2 = "";
      int max = n;
      for (int i = n; i > 0; i--) {
         temp = "*".repeat(i);
         temp2 += "\n" + temp;
      }
      for (int i = 2; i <= n; i++) {
         temp = "*".repeat(i);
         temp2 += "\n" + temp;
      }
      return temp2;   
   }


   
   //Return a string which is asterisks in the following pattern Example n = 4
   //********
   //***  ***
   //**    **
   //*      *
   //**    **
   //***  ***
   //********
   public static String stars2(int n){
      String temp = "";
      String temp2 = "";
      int max = n;
      for (int i = n; i > 0; i--) {
         temp = "*".repeat(i);
         temp += " ".repeat((n-i)*2);
         temp += "*".repeat(i);
         temp2 += "\n" + temp;
      }
      for (int i = 2; i <= n; i++) {
         temp = "*".repeat(i);
         temp += " ".repeat((n-i)*2);
         temp += "*".repeat(i);
         temp2 += "\n" + temp;
         
      }
      return temp2;   
   }

   public static void main(String[] args){
      System.out.println(findPerfect(10,10000));
      System.out.println(stars(10));
      System.out.println(stars2(10));
      System.out.println("Average of List " + averageOfList());
      System.out.println("Repeating Letters " + repeatAllLetters("helicopter"));
     
   }
}


