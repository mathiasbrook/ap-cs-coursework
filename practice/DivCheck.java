public class DivCheck{


//These methods review how you can use % to check divisibility.
//Can you make them shorter?


//This method checks whether n is divisible by d
   public static boolean check(int n,int d){
       return (n%d==0) ? true : false;
   }
  
//This method checks whether n is odd
   public static boolean checkOdd(int n){
       return (n%2==1) ? true : false;
   }
   
   public static void main(String[] args){
      System.out.println(check(10,3));
      System.out.println(check(10,2));
      System.out.println(check(18,3));
      System.out.println(checkOdd(18));
      System.out.println(checkOdd(15));
   }
}