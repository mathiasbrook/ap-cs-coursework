//23105

import java.util.*;
import java.io.*;

public class CityList
{
  private ArrayList<City> cities = new ArrayList<City>();
  
  public void addList() throws FileNotFoundException{
      String temp = "";
      File inFile = new File("HealthyCities.txt");
      Scanner input = new Scanner(inFile);
      String[][] myData = new String[501][10];
      for (int i=0;i < myData.length;i++){
         if (input.hasNext()) temp=input.nextLine();
         myData[i]=temp.split("\t");
      }
      for (int i=1; i < myData.length; i++) {
         City x = new City(myData[i]);
         cities.add(x);
      }      
  }
  
  public int getSleepDeprivedPopulation(String city) {
   for (City x : cities) {
      if (x.getName().toLowerCase().equals(city.toLowerCase())) {
         double s = x.getSleepDeprived();
         double p = x.getPopulation();
         return (int)(s*(p/100)); 
      }
   }
   return 0;
  }
  public int getStateSleepDeprivedPopulation(String state) {
   int s = 0;
   for (City x: cities) {
      if (x.getState().toLowerCase().equals(state.toLowerCase()))
        s+=getSleepDeprivedPopulation(x.getName());
   }
   return s;
  }
  public String toString() {
   String temp = "";
   for (City x: cities)
      temp+= x + "\n";
   return temp;
  }
  
  public static void main(String[] args) throws FileNotFoundException{
   CityList city = new CityList();
   city.addList();
   System.out.println(city);
   System.out.println("Amount of sleep deprived people in Mesa: " + city.getSleepDeprivedPopulation("Mesa"));
   System.out.println("Amount of sleep deprived people in Arizona: " + city.getStateSleepDeprivedPopulation("AZ"));
  }
}
