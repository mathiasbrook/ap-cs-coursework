//Name:Mathias Brook

//Fun with Strings Practice with Strings 


public class FunWithStrings{

//Class Variable should be private
    
//Constructor
//Assign str to class variable
   private String master = "";

   public FunWithStrings(String str){
      master = str;
   }
   
//Removes number characters from the master string starting at st and returns the result.  
//Return null if start is greater than the length of the master string -1 or
//if start+number is greater than the length of the master string
//or if start or number are negative
   public String deleteNumber(int start,int number){
      if (start > master.length()-1 || start+number > master.length()-1 || start < 0 || number < 0) return null;
      return master.substring(0,start) + master.substring(start+number);
   }
   
//Remove all the characters between start and end, inclusive, from the masterString and returns the result. 
//If the values of end and start seem to be switched, ie end is less than start, then remove the characters from end
//to start inclusive 
//If start or end are negative
//or if start > length -1 or end + 1 > length -1 return null
   public String deleteRange(int start,int end){
      if ((start < 0 || end < 0)||(start > master.length()-1 || end + 1 > master.length()-1)) return null;
      return (end < start) ? master.substring(0,end) + master.substring(start+1) : master.substring(0,start) + master.substring(end+1);
   }
//Remove the first instance of str from the master string. Returns master string without the word
//If the word is not in the master string, just return the master string
   public String removeWord(String str){
      return (master.indexOf(str) == -1) ? master: master.substring(0,master.indexOf(str)) + master.substring(master.indexOf(str)+str.length());
   }
   
//Replace the first instance of str1 with str2 in the master string. Returns the result
//If the word is not in the master string, just return the master string
   public String replaceWord(String str1,String str2){
      return (master.indexOf(str1) == -1) ? master: master.substring(0,master.indexOf(str1)) + str2 + master.substring(master.indexOf(str1)+str1.length());
   }
   
//Return a String which is the first x characters and last x characters of the master string.  
//Returns null if x < 0 or x > length of the master string
   public String firstLast(int x){
      return (x < 0 || x > master.length()) ? null : master.substring(0,x) + master.substring(master.length()-x,master.length());
   }
//Return true if the numerical value of str is less than the length of the master string
//false otherwise
   public boolean checkSize(String str){
      return (master.length() > Integer.parseInt(str)) ? true : false;
   }
   
   //Return the masterString
   public String toString(){
      return master;
   }
   
   //Write your own tests.  For each method the following methods
   //write one test that returns null and one that returns a String
   // deleteNumber,deleteRange, firstLast
   //For checkSize, write one test that returns true and another that returns false
   //For removeWord and replace Word write one test each that returns the Master String and another
   //that changes the Master String 
   public static void main(String[] args){
      FunWithStrings test = new FunWithStrings("FunWithStrings!");
      System.out.println("Expected output - null - Actual "+test.deleteNumber(-1,3));
      System.out.println("Expected output - FhStrings! - Actual "+test.deleteNumber(1,5));
      
      System.out.println("Expected output - null - Actual "+test.deleteRange(1,20));
      System.out.println("Expected output - FunWhStrings! - Actual "+test.deleteRange(4,5));
      
      System.out.println("Expected output - null - Actual "+test.firstLast(17));
      System.out.println("Expected output - Fungs! - Actual "+test.firstLast(3));
      
      System.out.println("Expected output - true - Actual "+test.checkSize("3"));
      System.out.println("Expected output - false - Actual "+test.checkSize("15"));
      
      System.out.println("Expected output - ORIGINAL FunWithStrings! - Actual "+test);
      System.out.println("Expected output - MODIFIED FunWithStrings! to FunStrings! - Actual "+test.removeWord("With"));
      
      System.out.println("Expected output - ORIGINAL FunWithStrings! - Actual "+test);
      System.out.println("Expected output - MODIFIED FunWithStrings! to FunByStrings! - Actual "+test.replaceWord("With","By"));
   }
}