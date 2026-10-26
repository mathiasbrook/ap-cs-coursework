import java.util.HashMap;
import java.util.ArrayList;

public class HashingProblems{
   //Print the indexes of elements of the array that add to the target
   public static void findPairs(int[] nums, int target){
      HashMap<Integer, Integer> numbers = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
         if (numbers.containsKey((target - nums[i])))
            System.out.println(numbers.get((target - nums[i])) + " " + i);
         numbers.put(nums[i], i);
      }
   }
   //Print the indexes of all matching pairs of elements     
   public static void findMatches(int[] nums){
      HashMap<Integer, ArrayList<Integer>> numbers = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
         if (!numbers.containsKey(nums[i]))
            numbers.put(nums[i], new ArrayList<Integer>());
         numbers.get(nums[i]).add(i);
      }
      for (int key : numbers.keySet()) {
         ArrayList<Integer> matches = numbers.get(key);
         for (int i = 0; i < matches.size(); i++)
            for (int j = i + 1; j < matches.size(); j++)
               System.out.println(matches.get(i) + " " + matches.get(j));
      }
   }
  
   public static void findSubArray(int[] nums){
     HashMap<Integer, Integer> numbers = new HashMap<>();
      int sum = 0;
      for (int i = 0; i < nums.length; i++){
         sum += nums[i];
         if (numbers.containsKey(sum)){
            int start = numbers.get(sum) + 1;
            int end = i;
            for (int j = start; j < end+1; j++)
               System.out.print(nums[j] + " ");
            System.out.println();
            return;
         }
         numbers.put(sum, i);
      }
   }     
  

   public static void main(String[] args){
      int[] mynums = {1,9,4,3,7,8,15,12,2};
      int[] mynums1 ={1,3,-1,-4,2,9,5,-12,1,2,1,7,1,4,19,4};
      System.out.println("Target is 10");
      //Expected 0 1   or 3 4 or 5 8
      findPairs(mynums,10);
      System.out.println("Target is 15");
       //Expected 3 7    or  4  5 
      findPairs(mynums,15);
      System.out.println("Target is 20");
        //Expected 3 7    or  4  5 
      
      findPairs(mynums,20);
      //Expected  5 7
      findSubArray(mynums1);
      //Expected  3  -1 4 2 
      findMatches(mynums1);
      //0 8
      //0 10
      //0 12
      //8 10
      //8 12
      //10 12
      //4 9 
      //13 15
   }
}