   //Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   import javax.swing.JOptionPane;
   
    /* Class Climber
    * A climber always faces north after moving
    * each move is up/down two and over left/right as specified
    */
    
    public class Climber extends Athlete
   {
       public Climber()
       {
         super();
       }
       public Climber(int x)
       {
         super(x,1,Display.NORTH,1);
       }
       /**
        * Moves a facing north robot up two and to
        * the right one.
        */ 
       public void climbUpRight()
       {
         move();
         move();
         turnRight();
         move();
         turnLeft();
       }
         
       /**
        * YOUR COMMENTS HERE
        */ 
       public void climbUpLeft()
       {
         move();
         move();
         turnLeft();
         move();
         turnRight();
       }
       
        /**
        * YOUR COMMENTS HERE
        */ 
       public void climbDownRight()
       {
         turnLeft();
         move();
         turnRight();
         move();
         move();
                
       }
       
        /**
        * YOUR COMMENTS HERE
        */ 
       public void climbDownLeft()
       {
         turnRight();
         move();
         turnLeft();
         move();
         move();
       }
   }