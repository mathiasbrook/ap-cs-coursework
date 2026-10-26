public class Unit2Practice{
   //Generate a random number of ints between 50 and 100,inclusive
   //From 1 to a random number between 20 and 30,inclusive 
   //Find the average.  Be sure to use double arithmetic
   public static double randomAverage(){
      int random = (int)((Math.random()*50)+50);
      double sum = 0;
      for (int i = 0; i < random; i++) {
         sum += (int)(Math.random()*10)+20;
      }
      return (double)(sum/random);   
   }
   //Determine if x is prime
   public static boolean isPrime(int x){
      boolean prime = true;
      for (int i = 2; i < x-1; i++) {
         if (x % i == 0) prime = false;
      }
      return prime;
   }
   //Count the number of primes between start and end, inclusive
   //You must call isPrime as part of your solution
   public static int countPrimes(int start,int end){
      int count = 0;
      while (start <= end) {
         if (isPrime(start) == true) count++;
         start++;
      }
      return count;
   }
   public static void main(String[] args){
      System.out.println("Average is "+ randomAverage());
      System.out.println("Is prime 30 " + isPrime(30));
      System.out.println("Is prime 29 " + isPrime(29));
      System.out.println("Count primes  31 to 97 " + countPrimes(31,97));
   
   
   
   }
}