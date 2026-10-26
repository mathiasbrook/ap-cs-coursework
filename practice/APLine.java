//Name: Mathias Brook

public class APLine{


//Declare class variable here (2 points)
//a,b and c should be stored as integers 
//a b and c represent the constants in the equation
//ax + by + c = 0  
   private int a;
   private int b;
   private int c; 

   public APLine(int mya,int myb,int myc){
    //Assign values here (1 point)
      a = mya;
      b = myb;
      c = myc;
   }

   //Calculate slope and return the value
   //The formula for slope is -a/b (3 points)
   public double getSlope(){
    double sa = a;
    double sb = b;
    return ((-1*sa)/sb);
    
   }
     
   //return true if (x,y) is on the line, false otherwise 
   //Plug in x and y into the equation ax + by + c = 0
   //and determine whether it is equal to 0 (2 points)
   public boolean isOnLine(int x,int y){
     return ((a*x)+(b*y)+c == 0) ? true : false;
     
   }
   
  
   //You can assume that x and y are positive
   //If x and y are on the line
    //Return the equation of the line in point slope form
    //if x = 3 and y = 4 and the slope is 2.0
    //then point/slope form is (y - 4)=2.0(x-3)
   //If x and y are not on the line, return "Unknown";
   public String getEquation(int x,int y){
     if (isOnLine(x,y) == true) {
      return "(y" + -1*y + ")=" + getSlope() + "(x" + -1*x + ")";
     }
     return "Unknown";
      
       
         
   
   
   }
   //Write a method to determine whether a year is a leap year (3 points)  
    
    public static boolean isLeapYear(int year) 
     {
    if (year % 100 == 0 && year % 400 == 0) return true;
    if (year % 4 == 0 && year % 100 != 0) return true;
    return false;
}
     
   public static void main(String[] args){
     //Test scripts
     APLine myLine1 = new APLine(2,6,-12);
     APLine myLine2 = new APLine(3,1,-8);
    
     //getEquation Test
     System.out.println("Expected (y-5)=-3.0(x-1)   Output " + myLine2.getEquation(1,5));
     System.out.println("Expected Output Unknown  Output " + myLine2.getEquation(2,3));
     
     
     //Slope Test
     System.out.println("Expected Output -0.3333333333333333  Output " + myLine1.getSlope());
     
     //isOnLine Test
     System.out.println("Expected Output true  Output " + myLine1.isOnLine(3,1));
     System.out.println("Expected Output false  Output " + myLine1.isOnLine(5,-2));
     
     //Leap Year tests
     System.out.println("Expected Output false Output " + isLeapYear(1999));
     System.out.println("Expected Output false Output " + isLeapYear(1900));
     System.out.println("Expected Output true Output " + isLeapYear(2000));
     System.out.println("Expected Output true Output " + isLeapYear(2008));


     
     
      
      
      
   }
}