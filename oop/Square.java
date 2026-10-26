//Name: Mathias Brook
public class Square extends Rectangle{

   public Square(Point vert1, int length){
      super(vert1,new Point(vert1.getX()+length,vert1.getY()+length)); //calls rectangle 2 point construtor with original vertex and the vertex modified based on length
   }
   
   public static void main(String[] args){
   } 
}