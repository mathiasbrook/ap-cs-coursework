//Name______________________________ Date_____________
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
public class Lab01
{
   public static void main(String[] args) 
   {
      
      Display.openWorld("maps/school.map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
   // Construct the two robots
      Robot lisa = new Robot();
      Robot pete = new Robot(4,5,Display.SOUTH,0);
   //  Have Lisa bring the book to Pete   
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.pickBeeper();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.move();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.move();
      lisa.putBeeper();
   //  Have Peter take the book, drop it at (4,9) and then step to (5,9)   
      pete.pickBeeper();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.turnLeft();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.turnLeft();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.putBeeper();
      pete.turnLeft();
      pete.turnLeft();
      pete.move();
   }
    
}