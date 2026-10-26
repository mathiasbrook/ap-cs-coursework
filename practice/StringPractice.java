public class StringPractice {

   public static void main(String[] args){
     System.out.println(alphabetize("One","Five","Seven"));
     System.out.println(alphabetize("One","Five","One"));
     System.out.println(reverse("hello"));
     System.out.println(makeASentence("Elephant","Tiger"));
     System.out.println(replaceAsterisk("You are a * friend","good"));
     System.out.println(findT("My tomato is very ripe",12));
     System.out.println(findT("My banana is very ripe",12));
     System.out.println(findT("My lemon is quite tart",12));
     System.out.println(isPrime(91));
     System.out.println(isPrime(45));
     System.out.println(isPrime(200));
     System.out.println(isPrime(7));

   }
   
   //Input is 3 Strings. Put the Strings in alphabetical order with spaces in between
   //If any of the Strings are the same, only put it in the answer String once
   //Example alphabetize("Hello","Sun","Apple") returns Apple Hello Sun
   //Example alphabetize("Hello","Sun","Sun") returns  Hello Sun
   public static String alphabetize(String str1,String str2,String str3){
     String order1 = str1;
     String order2 = str2;
     String order3 = str3;
     if (order1.compareTo(order2) > 0) {order1 = str2; order2 = str1;}
     str1 = order1;
     str2 = order2;
     str3 = order3;
     if (order2.compareTo(order3) > 0) {order2 = str3; order3 = str2;}
     str1 = order1;
     str2 = order2;
     str3 = order3;
     if (order2.compareTo(order3) > 0) {order1 = str3; order3 = str1;}
     str1 = order1;
     str2 = order2;
     str3 = order3;
     if (order1.compareTo(order2) > 0) {order1 = str2; order2 = str1;}
     order1 += " ";
     order2 += " ";
     order3 += " ";
     return order1 + order2 + order3;
   }

   //Input is a 5 character String
   //return the String reversed
   public static String reverse(String str){
      String temp = "";
      for (int i = 0; i < str.length(); i++) {
         temp = str.charAt(i) + temp;
      }
      return temp;
   }
   
   //Input is two strings
   //Return a sentence that says how many characters are in the two Strings combined
   //Example makeASentance("Elephant","Tiger") returns Elephant and Tiger have a total of 13 characters
   public static String makeASentence(String str1,String str2) {
      return str1 + " and " + str2 + " have a total of " + (str1.length()+str2.length()) + " characters";
   }
   //Input is a String with one asterisk and another string
   //Return a String with the asterisk replaced by the second String
   public static String replaceAsterisk(String str1,String str2){
      return str1.substring(0,str1.indexOf("*")) + str2 + str1.substring(str1.indexOf("*")+1);
   }
   
   //Input is a String and an int n
   //Return a String which is n characters long that starts with the first
   //lowercase t in the String
   //If there is no lowercase t in the String or there are not enough letters after
   //the lowercase t, return "Invalid Input"
   public static String findT(String str, int n) {
      return (str.indexOf("t")!=-1 && str.indexOf("t")+n <= str.length()) ? str.substring(str.indexOf("t"),str.indexOf("t")+n) : "Invalid Input";
   }
   
   //Not a String problem. Write a method to determine if a number less than 100 is prime
   //Return false if the input is negative or greater than 100
   //Return true if prime and false otherwise
   public static boolean isPrime(int n){
      if (n < 0 || n > 100) return false;
      if (n == 2 || n == 3 || n == 5 || n == 7) return true;
      return (n%2 != 0 && n%3 != 0 && n%5 != 0 && n%7 != 0) ? true : false;
   }
}