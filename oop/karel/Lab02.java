   //Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   import javax.swing.JOptionPane;
    public class Lab02
   {
       public static void main(String[] args) 
      {
         
         Display.openWorld("maps/maze.map");
         Display.setSize(8, 8);
         Display.setSpeed(5);
      
         Athlete lisa = new Athlete();
         lisa.putBeeper();
         lisa.breadCrumbs();
         lisa.turnRight();
         lisa.breadCrumbs();
         lisa.turnRight();
         lisa.breadCrumbs();
         lisa.turnLeft();
         lisa.breadCrumbs();
         lisa.turnLeft();
         lisa.breadCrumbs();
         lisa.turnRight();
         lisa.breadCrumbs();
         lisa.breadCrumbs();
         lisa.turnRight();
         lisa.breadCrumbs();
         lisa.turnLeft();
         lisa.breadCrumbs();
         lisa.turnLeft();
         lisa.breadCrumbs();
         lisa.breadCrumbs();
         lisa.breadCrumbs();
         lisa.breadCrumbs();
         lisa.turnRight();
         lisa.breadCrumbs();
         lisa.breadCrumbs();
      }
       
   }