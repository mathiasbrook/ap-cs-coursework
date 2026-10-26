//Name: Mathias Brook
import java.util.HashMap;

public class EasyHashing{

   public static boolean anagram(String str1,String str2){
      if (str1.length() != str2.length())
         return false;
      HashMap<Character, Integer> string1 = new HashMap<>();
      HashMap<Character, Integer> string2 = new HashMap<>();
      for (int i = 0; i < str1.length(); i++) {
         string1.put(str1.charAt(i),Character.getNumericValue(str1.charAt(i)));
         string2.put(str2.charAt(i),Character.getNumericValue(str2.charAt(i)));
      }
      return string1.keySet().equals(string2.keySet());
   }

   public static void getCounts(int[] nums){
      HashMap<Integer, Integer> numbers = new HashMap<>();
      for (int x : nums) {
         numbers.put(x,x);
      }
      System.out.println(numbers.size());
   }
   public static boolean isSubset(int[] numsBig,int[] numsLittle){
      HashMap<Integer, Integer> numbers = new HashMap<>();
      for (int x : numsBig) {
         numbers.put(x,x);
      }
      for (int x : numsLittle) {
         if (!numbers.containsValue(x))
            return false;
      }
     return true;
   }
   public static void main(String[] args){
      String one = "apple";
      String two = "pleap";
      String three = "Pear";
      int[] myNums1 ={1,3,-1,-4,2,9,5,-12,1,2,1,7,1,4,19,4};
      int[] myNums2 = {-4,9,12};
      int[] myNums3 = {100,77,9};
      
      System.out.println(anagram(one,two));
      System.out.println(anagram(one,three));
      getCounts(myNums1);
      System.out.println(isSubset(myNums1,myNums2));
        System.out.println(isSubset(myNums1,myNums3));
      
      
      
   }
}