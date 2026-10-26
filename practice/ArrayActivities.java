public class ArrayActivities{

//Return a String which is  all the elements of an int array on one line
//with spaces in between
//Use a regular for loop
   public static String printOutFor(int[] nums){
      String ans = "";
      for (int i = 0; i < nums.length; i++) {
         ans+=nums[i]+" ";
      }
      return ans;
   }
   
//Return a String which is  all the elements of an int array on one line
//with spaces in between
//Use a for-each loop
   public static String printOutEach(int[] nums){
      String ans = "";
      for (int x:nums) {
         ans+=x+" ";
      }
      return ans;
   }
  
//Create and return an array of a random length from 1 to 20
//with integers randomly chosen from 1 to 10, inclusive
   public static int[] createRandom(){
      int[] random = new int[(int)(Math.random()*19)+1];
      for (int i = 0; i < random.length; i++) {
         random[i] = (int)((Math.random()*19)+1);
      }
      return random;
   }

//Return a random element of an array
   public static int returnRandom(int[] nums){
      return nums[(int)(Math.random()*nums.length)];
   }
  
//Swap the elements in the two given indices of the array
//Besure to check for index out of bounds errors
//If you would get one, don't change the array
   public static void exchange(int[] nums,int a,int b){
      if (a < nums.length && b < nums.length) {
         int placeholder = nums[a];
         nums[a] = nums[b];
         nums[b] = placeholder;
      }
   }  

//Count the number of elements in an array of integers
//That are greater than x
//Use a regular for loop
   public static int countGreaterThanFor(int[] nums,int x){
      int count = 0;
      for (int i = 0; i < nums.length; i++) {
         if (nums[i] > x) count++;
      }
      return count;
   }
   
//Count the number of elements in an array of integers
//That are greater than x
//Use a for-each loop
   public static int countGreaterThanEach(int[] nums,int x){
      int count = 0;
      for (int j:nums) {
         if (j > x) count++;
      }
      return count;
   }

 //Given an array of Strings, return a String
//which is all the elements concatenated together
//Use a regular for loop
   public static String makeOneStringFor(String[] str){
      String one = "";
      for (int i = 0; i < str.length; i++) {
         one += str[i];
      }
      return one;
   }   
   
   //Given an array of Strings, return a String
//which is all the elements concatenated together
//Use a for-each loop
   public static String makeOneStringEach(String[] str){
      String one = "";
      for (String x:str) {
         one += x;
      }
      return one;
   } 

//Calculate the sum of all the elements of an array
//Use a regular for loop
   public static int findSumFor(int[] nums){
      int sum = 0;
      for (int i = 0; i < nums.length; i++) {
         sum+=nums[i];
      }
      return sum;
   }
   
   //Calculate the sum of all the elements of an array
//Use a for-each loop
   public static int findSumEach(int[] nums){
      int sum = 0;
      for (int x:nums) {
         sum+=x;
      }
      return sum;
   }
   
//Find the index of the maximum value of an array
   public static int findMax(int[] nums){
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < nums.length; i++) {
         max = Math.max(max,nums[i]);
      }
      return max;
   
   }
   
//Find the index of the minimum value of an array
   public static int findMin(int[] nums){
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < nums.length; i++) {
         min = Math.min(min,nums[i]);
      }
      return min;
   }    
      
   
//Challenge
//Simulate a roll of two dice n times and count the number of times each roll occurs
//Return an array which has the number of times each roll occurred in the corresponding index
   public static int[] rollDice(int n){
      int[] counts = new int[13];
      
      for (int i = 0; i < n; i++) {
         int sum = 0;
         sum += (int)((Math.random()*6)+1);
         sum += (int)((Math.random()*6)+1);
         counts[sum]++;
         }
      
      return counts; 
   }
   
   public static void main(String[] args){ 
      int[] rando = createRandom();
      System.out.println("Random Array");
      System.out.println(printOutFor(rando));
      System.out.println("Random Element");
      System.out.println(returnRandom(rando));
          
      int[] myNums = {0,1,4,6,8,13,-5,10};
      System.out.println(printOutFor(myNums));
      System.out.println(printOutEach(myNums));
      exchange(myNums,2,4);
      System.out.println(printOutFor(myNums));
      exchange(myNums,8,3);
      System.out.println("Count Greater Than 5 For Loop");
      System.out.println(countGreaterThanFor(myNums,5));
      System.out.println("Count Greater Than 5 For-Each Loop");
      System.out.println(countGreaterThanEach(myNums,5));
      System.out.println("Sum For Loop");
      System.out.println(findSumFor(myNums));
      System.out.println("Sum For-Each Loop");
      System.out.println(findSumEach(myNums));
      System.out.println("Max");
      System.out.println(findMax(myNums));
      System.out.println("Min");
      System.out.println(findMin(myNums));
      String[] myWords = {"I ","love ","APCS."};
      System.out.println(makeOneStringFor(myWords));
      System.out.println(makeOneStringEach(myWords));
      int[] dice = rollDice(1000);
      for (int i = 2; i < 13;i++)
         System.out.println("Times that " + i + " was rolled was "+dice[i]);
   
      
      
   
   } 
   
}