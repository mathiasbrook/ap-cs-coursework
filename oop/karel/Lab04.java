   //Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   import javax.swing.JOptionPane;
    public class Lab04
   {
       
      public static void takeTheField(Athlete arg)
      {
        arg.move();
        arg.move();
        arg.move();
        arg.move();
        arg.turnRight();
        arg.move();
        arg.move();
      }
      
      
      
      public static void main(String[] args) 
      {
         
         Display.openWorld("maps/arena.map");
         Display.setSize(10, 10);
         Display.setSpeed(5);
         
         // The coach should be the a Robot
         
        // Robot coach = new Robot(use 4-arg constructor);
         Robot coach = new Robot(2,6,Display.EAST,0);
        /*  Create six team members and have them take the field
         *  Then put them in position
         */
         Athlete player0 = new Athlete();
         Athlete player1 = new Athlete();
         Athlete player2 = new Athlete();
         Athlete player3 = new Athlete();
         Athlete player4 = new Athlete();
         Athlete player5 = new Athlete();
         takeTheField(player0);
         takeTheField(player1);
         takeTheField(player2);
         takeTheField(player3);
         takeTheField(player4);
         takeTheField(player5);
         player0.move();
         player0.turnLeft();
         player0.move();
         player0.turnLeft();
         player0.turnLeft();
         player1.move();
         player1.move();
         player1.turnRight();
         player2.move();
         player2.move();
         player2.move();
         player2.turnRight();
         player3.move();
         player3.move();
         player3.move();
         player3.move();
         player3.turnRight();
         player4.move();
         player4.move();
         player4.move();
         player4.move();
         player4.move();
         player4.turnLeft();
         player4.move();
         player4.turnLeft();
         player4.turnLeft();
         player5.move();
         player5.move();
         player5.move();
         player5.turnLeft();
         player5.move();
         player5.move();
         player5.turnLeft();
         player5.turnLeft();
         
         
         
         
         
           
      }
       
   }