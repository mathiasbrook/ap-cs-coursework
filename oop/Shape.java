//Name: Mathias Brook
public abstract class Shape {

   private Point[] vertices; //declares an array that contains all vertices of the shape

   public Shape(int n){ //creates the array of vertices based on the amount of vertices the shape has
      vertices = new Point[n];
   }
      
   public String toString(){ //prints out the order pairs of the shape
      String temp = "";
      for (Point pnt:vertices)
         temp += pnt + ",";
      return temp.substring(0,temp.length()-1); 
   }
   
   public void moveUpDown(int delta){ //moves the shape vertically
      for (Point pnt:vertices) {
         pnt.moveUpDown(delta);
      }
   }
   
   public void moveRightLeft(int delta){ //moves the shape horizontally
      for (Point pnt:vertices) {
         pnt.moveRightLeft(delta);
      }
   }
   
   public void reflectOverX(){ //mirrors the shape over the x axis (vertically)
      for (Point pnt:vertices) {
         pnt.reflectOverX();
      }
   }
   
   public void reflectOverY(){ //mirrors the shape over the y axis (horizontally)
      for (Point pnt:vertices) {
         pnt.reflectOverY();
      }
   }
   
   public void setPoint(int index,Point p) { //stores a point in the vertices array
      if (index < vertices.length && index >= 0) vertices[index] = p;  
   }
   
   public Point[] getPoints() { //returns an array containing all the vertices in the shape
      return vertices;
   }
   
   public abstract double area();
   
   public int compareTo(Shape that) { //compares an area from a shape to another shape greater means 1, less/equal means 0
      if (this.area() > that.area()) {
         return 1;   
      }
      return 0;
   }
    
   public static void main(String[] args){
   } 
}