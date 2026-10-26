public class RecursionActivities{
//Mathias Brook
  
  //Explore the output of these recursive functions
  
  public static void printThis(String str){
      if (str.length() != 0) {
        System.out.println(str);
        printThis(str.substring(1));
      }     
  }
  
  public static void printThis2(String str){  
      if (str.length() != 0) 
        printThis2(str.substring(1));
        System.out.println(str);
       
  }
  
    //Find the sum of all the digits in a number
  public static int FindDigitSum(int n){
      if (n != 0) {
         return n%10 + FindDigitSum(n/10);
      } 
      return 0;
  }
    
    //Find the nth value of the Fibonacci sequence
    public static int Fibonacci(int n){
    if(n == 1 && n != 0) return 1;
    else if (n != 0 && n != 1) return Fibonacci(n-1) + Fibonacci(n-2);
    return 0;
    }  
    //Find the sum of all the elements in an array recursively
    public static int sumUp(int[] nums){
      return helperSumUp(nums,0);
    }

    //Use this helper method to sum the array recursively
    public static int helperSumUp(int[] nums,int index){ 
      if (index < nums.length) {
         return nums[index] + helperSumUp(nums,index+1);
      } 
      return 0;
    }  

    public static void main(String[] args){
      int [] myNums = {3,7,-4,10,12,15};
      System.out.println(sumUp(myNums));
      printThis("APCS Rocks");
      printThis2("APCS Rocks");
      System.out.println(FindDigitSum(678452));
      System.out.println(Fibonacci(7));
    }
  }
    