//Unit 1 Random number generator practice
//Name: Mathias Brook

public class RandomPractice{

   public static void main(String[] args){
      System.out.println(Math.random());
      System.out.println((int)Math.random());
      System.out.println((int)(Math.random()*10));
   //Write an expression that will generate and print the following random numbers
   //Test by running the program multiple times.
   // Integers between 1 and 20, inclusive
      System.out.println("Integer between 1 and 20");
      System.out.println((int)(Math.random()*20));
   
   //Integers between 0 and 50, inclusive
      System.out.println("Integer between 1 and 50");
      System.out.println((int)(Math.random()*50));
   
   //Integers between 0 and a, inclusive 
      int a = 30;
      System.out.println("Integer between 1 and a");
      System.out.println((int)(Math.random()*(a)));
   
   //A random odd integer from 1 to 99,inclusive.
      System.out.println("A random odd integer from 1 to 99");
      System.out.println(((int)(Math.random()*50)*2-1));
   //A random multiple of 4 from 16 to 100, inclusive
      System.out.println("A random multiple of 4 from 16 to 100");
      System.out.println(((int)(Math.random()*21)*4+16));
   }
   
   
   
   
   
   
   
   
}