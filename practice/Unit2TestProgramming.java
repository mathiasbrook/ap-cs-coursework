 

public class Unit2TestProgramming
{ 
   public static void main(String[] args) {
      System.out.println("Expected Output 13 " + countVowels("The Apple is red and the banana is yellow"));  
      System.out.println("Expected Output 2 "+ countLeapYears(2000,2004));
      System.out.println("Expected Output 3 "+ countLeapYears(1900,1914));
      System.out.println("Expected Output a number between 15 and 300 " + sumRandom(15));
      System.out.println("Expected Output a double between 1 and 20 " + avgRandom(15));
   
       
   
   }
    
    
    //Write a method that counts the number of vowels in str,including upper and lower case and returns the count
   public static int countVowels(String str){
      String vowels = "aeiou";
      int count = 0;
      for (int j = 0; j < str.length(); j++) {
         for (int i = 0; i < vowels.length(); i++) {
            if (str.substring(j,j+1).toLowerCase().equals(vowels.substring(i,i+1))) count++;
         }
      }
      return count;
   }
    
    //Write a method to count the number of leap years from year1 to year2, inclusive
    //For example, if the input for year1 is 1994 and the input for year2 is 2002
    //Your method should count all the leap years from 1994 through 2002, including 1994 and 2002
    //You must use a loop and you must call the method isLeapYear()
   public static int countLeapYears(int year1,int year2){
    int count = 0;
    for (int i = year1; i <= year2; i++) {
      if (isLeapYear(i)) count++;
    }
    return count;
    
   }  
     
    //Write a method that will find the sum of n random integers between 1 and 20, inclusive
    //Because the numbers are random, your output will be vary
   public static int sumRandom(int n){
      int sum = 0;
      for (int i = 0; i < n; i++) {
         sum += (int)((Math.random()*19)+1);
      }
      return sum;  
   } 
     
      //Write a method that will find the average of n random integers between 1 and 20, inclusive
    //Because the numbers are random, your output will be vary
    //Remember to use double arithmetic
   public static double avgRandom(int n){
      double sum = 0;
      for (int i = 0; i < n; i++) {
         sum += (int)((Math.random()*19)+1);
      }
      return sum/n;
   }  
    
   public static boolean isLeapYear(int year)
   {
     //return false if the year is not divisible by 4
      if (year%4 != 0) 
         return false;
      //return false if year is divisible by 100 but not divisible by 400
      if (year%100 == 0 && year%400 !=0) 
         return false;
     //return true for all other years
      return true;
   }
}