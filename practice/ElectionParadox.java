// Name: Mathias Brook
// Date: 11/30/23
    
import java.util.*;
  
public class ElectionParadox
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter text: ");
      int count = sc.nextInt();
      ArrayList<Integer> regions = new ArrayList<Integer>();
      for (int i = 0; i < count; i++) {
         int region = sc.nextInt();
         regions.add(region);
      }
      System.out.println(calc(regions));
   }
   public static int calc (ArrayList<Integer> regions) {
      int min;
      int sum = 0;
      int[] negRegion = new int[regions.size()/2+1];
      for (int i = 0; i < negRegion.length; i++) {
         min = regions.get(0);
         for (int j = 0; j < regions.size(); j++) {
            if (regions.get(j) < min)
               min = regions.get(j);
         }
         negRegion[i] = min;
         regions.remove(regions.indexOf(min));
      }
      for (int x : regions)
         sum += x;
      for (int x : negRegion)
         sum += x/2;
      return sum;
   }
}