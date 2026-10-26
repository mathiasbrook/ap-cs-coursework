//Name: Mathias Brook
public class Point {

   private int x;
   private int y;   
  
   public Point() { //creates a point at the origin
      x = 0;
      y = 0;
   }
   
   public Point(int x_point,int y_point){ //creates a point with the two integers provided in the constructor
      x = x_point;
      y = y_point;
   }
      
   public String toString(){ //prints out the ordered pair of the point
      return "("+x+","+y+")";
   }
   
   public int getX(){ //returns the x position of the point
      return x;
   }
   
   public int getY(){ //returns the y position of the point
      return y;
   }
   
   public void moveUpDown(int delta) { //moves the point vertically
      y += delta;
   }
   
   public void moveRightLeft(int delta) { //moves the point horizontally
      x += delta;
   }
   
   public void reflectOverX() { //mirrors the point vertically
      y *= -1;
   }
   
   public void reflectOverY() { //mirrors the point horizontally
      x *= -1;
   }
   
   public static void main(String[] args){
   } 
}