//Name: Mathias Brook
public class Rectangle extends Shape {

   public Rectangle(Point vert1){ //creates a rectangle with 1 point provided in the constructor as a corner and the origin as a corner
      super(4);
      super.setPoint(0,new Point());
      super.setPoint(1,vert1);
      super.setPoint(2,new Point(0,vert1.getY()));
      super.setPoint(3,new Point(vert1.getX(),0));
   }
   
   public Rectangle(Point vert1, Point vert2){ //creates a rectangle with 2 points provided in the constructor as corners
      super(4);
      super.setPoint(0,vert1);
      super.setPoint(1,vert2);
      super.setPoint(2,new Point(vert1.getX(),vert2.getY()));
      super.setPoint(3,new Point(vert2.getX(),vert1.getY()));
   }
  
   public double area(){ //calculates the formula by getting the height and length from the difference in ordered pairs in the points
      Point[] temp = super.getPoints();
      Point vert1 = temp[0];
      Point vert2 = temp[1];
      int x = Math.abs(vert1.getX()-vert2.getX());
      int y = Math.abs(vert1.getY()-vert2.getY());
      return x*y;
   }
   
   public static void main(String[] args){
   } 
}