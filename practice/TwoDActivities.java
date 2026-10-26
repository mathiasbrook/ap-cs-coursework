//Two Dimensional Array Activities
//In this activity, you will practice using an Integer Object
//which stores an integer value but can also be equal to null
//Name: Mathias Brook

public class TwoDActivities{

//Sum all the elements in the array
   public static int sumUp(Integer[][]  nums){
      int sum = 0;
      for (int r = 0; r < nums.length; r++) {
         for (int c = 0; c < nums[r].length; c++) {
            sum += nums[r][c];
         }
      }
      return sum;
   }
   
 //Create a String which is each row of the array on a separate line
   public static String printOut(Integer[][] nums){
      String print = "";
      if (nums == null) return null;
      for (int r = 0; r < nums.length; r++) {
         if (r != 0) print += "\n";
         for (int c = 0; c < nums[r].length; c++) {
            print += nums[r][c] + " ";
         }
      }
      return print;
   }
  
//Change an array by replacing the element in row r and column c with value n
//Check for bounds errors
   public static void replace(Integer[][] nums,int r,int c,int n){
      if (r < nums.length && c < nums[r].length) nums[r][c] = n;
   }
  
//Transpose an array by turning each row in turn into columns
   public static Integer[][] transpose(Integer[][] nums){
      Integer[][] transpose = new Integer[nums[0].length][nums.length];
      for (int c = 0; c < transpose[0].length; c++){
         for (int r = 0; r < transpose.length; r++){
            transpose[r][c] = nums[c][r];
         }
      }
      return transpose;
   }

//Fill an array with the numbers 1- row*col in a  row by col array in row-major order
//Example   rowMajor(2,3)
//  1 2 3 
//  4 5 6
   public static Integer[][] rowMajor(int row,int col){
      int increment = 1;
      Integer[][] array = new Integer[row][col];
      for (int r = 0; r < array.length; r++) {
      	for (int c = 0; c < array[0].length; c++) {
      		array[r][c] = increment++;
         }
      }
      return array;
   }
  
  
//Fill an array with the numbers 1- row*col in a  row by col array in column-major order
//Example   colMajor(2,3)
//  1 3 5 
//  2 4 6

   public static Integer[][] colMajor(int row,int col){
      int increment = 1;
      Integer[][] array = new Integer[row][col];
      for (int c = 0; c < array[0].length; c++) {
      	for (int r = 0; r < array.length; r++) {
            array[r][c] = increment++;
         }
      }
      return array;
   }
   
 //Create a two-dimensional array of Integers
 // from a one-dimensional array of ints in row major order.
//Of the given dimensions
 //Be careful to avoid bounds errors
 //If not all the elements fit in the new array, just ignore elements at the end of the array
 //Be sure to avoid bounds errors
 public static Integer[][] create2DRow(int[] myarray,int numRows,int numCols){
   Integer[][] array = new Integer[numRows][numCols];
   int index = 0;
   for (int r = 0; r < array.length; r++) {
   	for (int c = 0; c < array[0].length; c++) {
   		if (index < myarray.length) array[r][c] = myarray[index];
         index++;
      }
   }
   return array;
 } 
 
 //Create a two-dimensional array of Integers
 // from a one-dimensional array of ints in Column major order.
//Of the given dimensions
 //Be careful to avoid bounds errors
 //If not all the elements fit in the new array, just ignore elements at the end of the array
 //Be sure to avoid bounds errors
 public static Integer[][] create2DCol(int[] myarray,int numRows,int numCols){
   Integer[][] array = new Integer[numRows][numCols];
   int index = 0;
   for (int c = 0; c < array[0].length; c++) {
   	for (int r = 0; r < array.length; r++) {
   		if (index < myarray.length) array[r][c] = myarray[index];
         index++;
      }
   }
   return array;
 }
  
 //Replace all elements greater than max with null
 //From the two-D array
 //Then consolidate the non-null elements so they are in the first rows
 //Example  thisArray below
 //     3  8  4
 //     9  1 0
 //This array after running consolidate(thisArray,7)
 //     3  4  1
 //     0 null null
 //Remember this is a void method
 //so your method must change myArray
 public static void consolidate(Integer[][] myarray,int max){
   for (int r = 0; r < myarray.length; r++) {
   	for (int c = 0; c < myarray[0].length; c++) {
   		if (myarray[r][c] != null && myarray[r][c] > max) myarray[r][c] = null;
      }
   }
   for (int r = 0; r < myarray.length; r++) {
   	for (int c = 0; c < myarray[0].length; c++) {
         int tempC = c;
         int tempCR = 0;
         while (myarray[r][c] == null && tempC+1 < myarray[0].length) {
            if (myarray[r][tempC+1] != null) myarray[r][c] = myarray[r][tempC+1];
            if (myarray[r][tempC+1] != null) myarray[r][tempC+1] = null;
            tempC++;
         }
         while (myarray[r][c] == null && tempC+1 == myarray[0].length && r+1 < myarray.length && tempCR < myarray[r+1].length) {
            if (myarray[r+1][tempCR] != null) myarray[r][c] = myarray[r+1][tempCR];
            if (myarray[r+1][tempCR] != null) myarray[r+1][tempCR] = null;
            tempCR++;
         }
      }
   }
 }
   public static void main(String[] args){
      Integer[][]  array = {{1,4,7,-9},{8,-5,3,12}};
      System.out.println("Expected Sum  21 " + sumUp(array));
      replace(array,2,0,9);
      replace(array,1,3,9);
      replace(array,1,1,9);
      System.out.println(printOut(array));
      Integer[][] arrayT = transpose(array);
      System.out.println("Transposed Array  \n");
      System.out.println(printOut(arrayT));
      Integer[][]  rm34 = rowMajor(3,4);
      System.out.println("Row Major Array  \n");
      System.out.println(printOut(rm34));
      Integer[][]  cm34 = colMajor(3,4);
      System.out.println("Column Major Array  \n");
      System.out.println(printOut(cm34));
      int[] oneDArray= {20,5,7,-3,1,10,12,14};
      System.out.println("Create Row Major Array  \n");
      System.out.println(printOut(create2DRow(oneDArray,2,3)));
      System.out.println(printOut(create2DRow(oneDArray,3,4)));
      System.out.println("Create Column Major Array  \n");
      System.out.println(printOut(create2DCol(oneDArray,2,3)));
      System.out.println(printOut(create2DCol(oneDArray,3,4)));
      System.out.println(" ");
      array[0][1]=null;
      consolidate(array,6);
      System.out.println(printOut(array));
   }
}