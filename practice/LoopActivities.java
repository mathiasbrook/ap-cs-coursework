//Name: Mathias Brook

//Loop Practice 

public class LoopActivities{
    


   //Use a for loop to add all the numbers from 1 to n
   public static int addUpToN(int n){
      int newNumber = 0;
      for (int i = 0; i <= 30; i++) {
         newNumber += i;
      }
      return newNumber;
   }
   
   
   
   //Use a while loop to add all the numbers from 1 to n
   public static int addUpToNWhile(int n){
      int i = 0;
      int newNumber = 0;
      while (i <= 30) {
         newNumber += i;
         i++;
      }
      return newNumber;
   }

   
   //Add all the factors of n, excluding n, using a for loop
   public static int addFactors(int n){
      int number = 0;
      for (int i = 1; i <= n ; i++) {
         if (n % i == 0 && n != i) {
            number += i;
         }
      }
      return number;
   }
      
      
   //Add all the factors of n, excluding n, using a while loop
   public static int addFactorsWhile(int n){
      int number = 0;
      int i = 1;
      while (i <= n) {
         if (n % i == 0 && n != i) {
            number += i;
         }
         i++;
      }
      return number;
   }
      
      
      //Take a String as input and a number and return a new String which 
      //the string repeated n times using a for loop
   public static String repeatN(String str,int n){
      String newStr = str;
      for (int i = 0; i < n-1; i++) {
         newStr+=str;
      }
      return newStr;
   }
      
      //Take a String as input and a number and return a new String which 
      //the string repeated n times using a while loop
   public static String repeatNWhile(String str,int n){
      String newStr = str;
      int i = 0;
      while (i < n-1) {
         newStr+=str;
         i++;
      }
      return newStr;
   }
      
      //Count the number of numerals in a String
      //Example "I have 42 fish and 2 dogs and 3 cats"
      //The answer would be 4.
      //Hint:Use indexOf and the numbers String 
   public static int countNumerals(String str){
      String temp = "";
      for (int i = 0; i < str.length(); i++) {
         if ((int)str.charAt(i) > 47 && (int)str.charAt(i) < 58) {
            temp += str.charAt(i);
         }
      }
      return temp.length();
   }
        
        //Takes a String, a letter and a number as input
//Finds the letter in the String and returns a String where the letter is repeated n times
//Example  tomato,t,3  would return tttomattto
//Return the original String if the letter is not found
   public static String repeatLetter(String str,String letter,int n){
      String newStr = "";
      for (int i = 0; i < str.length(); i++) {
         newStr += str.charAt(i);
         if (str.charAt(i) == letter.charAt(0)) {
            for (int j = 0; j < n-1; j++) {
               newStr += str.charAt(i);
            }
         }
      }
      return newStr;
   
   }
      
      
          
      
      
   public static void main(String[] args){
      System.out.println("Sum of 1 to 30 " +addUpToN(30));
      System.out.println("Sum of 1 to 30 while loop "+addUpToNWhile(30));
      System.out.println("Sum of Factors " +addFactors(9));
      System.out.println("Sum of Factors while loop "+addFactorsWhile(9));
      System.out.println("Repeated String " + repeatN("hello",3));
      System.out.println("Repeated String While " + repeatNWhile("hello",3));
      System.out.println(repeatLetter("elephants love lettuce","l",4));
      System.out.println(repeatLetter("elephants love lettuce","e",2));
      System.out.println(repeatLetter("elephants love lettuce","q",2));
      System.out.println(countNumerals("123ABC69420"));
   }
}