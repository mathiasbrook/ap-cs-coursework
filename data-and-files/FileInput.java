import java.util.*;
import java.io.*;

public class FileInput{

   public static void main(String[] args) throws FileNotFoundException{
      String temp = "";
      File inFile = new File("DataText.txt");
      Scanner input = new Scanner(inFile);
      String[][] myData = new String[100][15];
      for (int i=0;i < myData.length;i++){
         if (input.hasNext()) temp=input.nextLine();
         myData[i]=temp.split("\t");
      }
      for (int i=0;i < myData.length;i++)
         System.out.println(Arrays.toString(myData[i]));
         
      
   }
}