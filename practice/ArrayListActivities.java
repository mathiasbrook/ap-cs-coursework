import java.util.ArrayList;

public class ArrayListActivities{

   private ArrayList<Integer> myNums = new ArrayList<Integer>();
   private ArrayList<String> myStrings = new ArrayList<String>();

//Take the input as arrays and create the class variables that are ArrayLists
   public ArrayListActivities(int[] nums, String[] words){
      for (int x:nums)
         myNums.add(x);
      for (String x:words)
         myStrings.add(x);
   }

//Remove all the even numbers from the number ArrayList
   public void removeEven(){
      for (int i = myNums.size()-1; i >= 0; i--) {
         if (myNums.get(i) % 2 == 0) myNums.remove(i);  
      }
   }

//Randomly set one element of the String ArrayList to "bamboozled"
//Return the replaced element
   public String bamboozled(){
      int random = (int)(Math.random()*myStrings.size());
      String temp = myStrings.get(random);
      myStrings.set(random,"bamboozled");
      return temp;
   }

//Replace all elements of the ArrayList of Strings that start with capital letters with the
//same word in all lowercase.  Count the number of words changed.
   public int changeToLower(){
      int count = 0;
      for (int i = 0; i < myStrings.size(); i++) {
         if (myStrings.get(i) != myStrings.get(i).toLowerCase()) {
            count++;
            myStrings.set(i,myStrings.get(i).toLowerCase()); 
         }
      }
      return count;
   }
   
   public static void main(String[] args){
      int[] numbers = {0,1,2,5,6,7,8,9,10,42,43,80};
      String[] teapot ={"I","am","a","Little","Teapot","short","And","Stout"};
      ArrayListActivities myTest = new ArrayListActivities(numbers,teapot);
      myTest.removeEven();
      System.out.println(myTest.myNums);
      System.out.println(myTest.changeToLower());
      System.out.println(myTest.myStrings);
      System.out.println(myTest.bamboozled());
      System.out.println(myTest.myStrings);
      }
      
   
}   
