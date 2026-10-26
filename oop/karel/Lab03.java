   //Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   import javax.swing.JOptionPane;
    public class Lab03
   {
       public static void main(String[] args) 
      {
         
         Display.openWorld("maps/mountain.map");
         Display.setSize(16, 16);
         Display.setSpeed(5);
      
         Climber lisa = new Climber(8);
         lisa.putBeeper();
         lisa.turnRight();
         lisa.move();
         lisa.turnLeft();
         lisa.climbUpRight();
         lisa.climbUpRight();
         lisa.climbUpRight();
         lisa.turnLeft();
         lisa.turnLeft();
         lisa.climbDownRight();
         lisa.climbDownRight();
         lisa.pickBeeper();
         lisa.turnLeft();
         lisa.turnLeft();
         lisa.climbUpLeft();
         lisa.climbUpLeft();
         lisa.turnLeft();
         lisa.turnLeft();
         lisa.climbDownLeft();
         lisa.climbDownLeft();
         lisa.climbDownLeft();
         lisa.turnRight();
         lisa.move();
         lisa.putBeeper();
      }
       
   }