//Name: Mathias Brook

public class PrimeNumberSieve {

   public static void main(String[] args) {
      JagArrayList<Integer> PrimeNumbers = new JagArrayList<Integer>();
      for (int i = 0; i < 50000; i ++) {
         PrimeNumbers.add(i);
      }
      int count = 0;
      for (int x : PrimeNumbers) {
         if (x > 1 && isPrime(x))
            count++;
      }
      System.out.println(count);
   }
   
   public static boolean isPrime(int num) {
      for (int i = 2; i < num-1; i++)
         if (num % i == 0) return false;
      return true;
   }

} 