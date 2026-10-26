public class SchnallNumber{

//A number is a Schnall Number of the type a_b if the number is divisible by a
//and the sum of the digits is divisible by b
//For example, 1342, is a Schnall number of type 2_5 because 1342 is divisible by 2
//and 1+3+4+2 = 10 is divisible by 5
//You will write a class that will determine if a number is a Schnall number of a certain type

//Declare class variables here  
   
   private int one;
   private int two;

//Assign values here
   public SchnallNumber(int x,int y){
      one = x;
      two = y;
   }

//returns true if the number is a Schnall Number of the given type.  The method must work for 
//numbers 4 digits or fewer
   public boolean isSchnallNumber(int x){
      int a = x % 10;
      int b = x % 100 / 10;
      int c = x % 1000 / 100;
      int d = x % 10000 / 1000;
      if (x % one == 0 && (a+b+c+d) % two == 0) return true;
      return false;
   }

//Returns a string of the form "x is/is not a Schnall number of type a_b"
   public String result(int x){
      this.isSchnallNumber(x);
      return (true) ? x + " is a Schnall number of type" + one + "_" + two : x + " is not a Schnall number of type" + one + "_" + two;
   }

   public static void main(String[] args){
   SchnallNumber num1 = new SchnallNumber(2,5);
   System.out.println("Expected Output true " + num1.isSchnallNumber(1342));
   System.out.println("Expected Output 1342 is a Schnall number of type 2_5\n+ " + num1.result(1342));
   System.out.println("Expected Output false " + num1.isSchnallNumber(4557));
   System.out.println("Expected Output false " + num1.isSchnallNumber(4558));
   System.out.println("Expected Output false " + num1.isSchnallNumber(4745));
   System.out.println("Expected Output 4557 is not a Schnall number of type 2_5\n " + num1.result(4557));
   SchnallNumber num2 = new SchnallNumber(3,7);
   System.out.println("Expected Output 885 is a Schnall number of type 3_7\n " + num2.result(885));


   
   
   }
}