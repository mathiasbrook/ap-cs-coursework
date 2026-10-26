public class StringDemo{

   public static void main(String[] args){
   
      String str1 = "Hello";
      String str2 = " World";
      String empty ="";
      
      int x = 2;
      int y = 3;
      
      System.out.println(str1 + str2);
      System.out.println(str1 + x);
      System.out.println(x+y);
      System.out.println(empty + x+y);
      
      //When building our output String, start with the empty String, then add 
      //Follow this example (using variables) for the lab
      
      String ans = "";
      ans = ans + 3;
      ans +=":";
      ans+=0;
      ans+=5;
      System.out.println(ans);
      
      String str = "";
      String add1 = "This";
      String add2 = "is";
      String add3 = "concatenated";
      int add4 = 3;
      str = add1 + " " + add2 + " a " + add3 + " string! #" + add4;
      System.out.println(str);
      
   }
}