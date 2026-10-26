//Name: Mathias Brook
public class Triangle extends Shape {

   public Triangle(Point vert1, Point vert2, Point vert3){ //creates a triangle with the 3 points provided in the constructor
      super(3);
      super.setPoint(0,vert1);
      super.setPoint(1,vert2);
      super.setPoint(2,vert3);
   }
   
   public double area(){ //calculates the area of a triangle by using the coordinate points
      Point[] temp = super.getPoints();
      Point vert1 = temp[0];
      Point vert2 = temp[1];
      Point vert3 = temp[2];
      return Math.abs(((vert2.getX()*vert3.getY())-(vert3.getX()*vert2.getY()))-((vert1.getX()*vert3.getY())-(vert3.getX()*vert1.getY()))+((vert1.getX()*vert2.getY())-(vert2.getX()*vert1.getY())))/2;
   }
   
   public static void main(String[] args){
   } 
}