// Name: Mathias Brook
// Date: 11/30/23
    
import java.util.*;
  
public class CompoundWords
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter text. Enter # to end the scanner.");
      ArrayList<String> temp1 = new ArrayList<String>();
      for (int i = 0; i < 100; i++) {
         String temp = sc.next();
         if (!temp.equals("#"))
            temp1.add(temp);
         else
            break;
      }
      for (String x : process(temp1)) {
         System.out.println(x);
      }
      
   }
   public static ArrayList<String> process(ArrayList<String> temp) { 
      ArrayList<String> temp2  = new ArrayList<String>();
      for (int i = 0; i < temp.size(); i++)
         for (int j = 0; j < temp.size(); j++)
            if (j != i)
               temp2.add(temp.get(i)+temp.get(j));
      for (int i = temp2.size()-1; i >= 0; i--)
         for (int j = temp2.size()-1; j >= 0; j--)
            if (i != j && temp2.get(i).equals(temp2.get(j)))
               temp2.remove(j);
                        
      sort(temp2, 0, temp2.size()-1);
      
      return temp2;
      
   }
   public static boolean check(ArrayList<String> temp) {
      for(int k = 1; k < temp.size(); k++)
         if(temp.get(k-1).compareTo(temp.get(k)) > 0)
            return false;
      return true;
   }
   
   
   private static void sort(ArrayList<String> array, int first, int last)
   {
      int indexOfPivot;
      if (first < last)
      {
         indexOfPivot = rearrange(array, first, last);
         sort(array, first, indexOfPivot - 1);
         sort(array, indexOfPivot + 1, last);
      }
   }
   
   private static int rearrange(ArrayList<String> array, int first, int last)
   {
      int indexOfPivot = first;
      String pivot = array.get(first);
      first++;
      while (first <= last)
      { 
        if(array.get(first).compareTo(pivot) <= 0) {
           first++;              
        }
        else if(array.get(last).compareTo(pivot) >= 0) {
           last--;
        }
        else
        {
            swap(array,first,last);
        
        }
      }
      swap(array, last, indexOfPivot);
      indexOfPivot = last;
      return indexOfPivot;
   }
   private static void swap(ArrayList<String> array, int a, int b)
   {
      String temp = array.get(a);
      array.set(a,array.get(b));
      array.set(b,temp);
   }
   
}