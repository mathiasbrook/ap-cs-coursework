//Name: Mathias Brook
public class Time{

   private int hour; //declare hour (permanent)
   private int minute; //declare minute (permanent)
   //constructs time
   public Time(int h,int m){
      h = Math.max(h, 0); //turn negative hours into 0
      m = Math.max(m, 0); //turn negative minutes into 0
      hour = h; //set permanent hour to h
      increment(m); //increment time if minutes are over 59
   }
   
   public Time(){
      this(0,0); //calls two argument constuctor
   }

   //turn time to string
   public String toString(){
      String answer = ""; //declare answer string (temporary)
      answer += hour; //add hour into the answer string
      if (answer.length() == 1) { //if hour is a single digit
         answer = "0" + answer; //add a zero behind the answer string
      }
      if ((minute + answer).length() == 3) { //if minute is single digit
         answer = answer + "0" + minute; //add a zero and minute into the answer string
      } else { //if combined answer length is NOT 3
         answer += minute; //add minute into answer string
      }
      return answer; //return answer string
   }

   //convert military time to normal time
   public String convert(){
      String convert = ""; //declares convert string (temporary)
      String half = ""; //declares half string (temporary)
      int h; //declares hour integer (temporary)
      if (hour <= 11) { //if permanent hour is less than or equal to 11
         half = "am"; //set half string to am
      } else { //if permanent hour is not less than or equal to 11
         half = "pm"; //set half string to pm
      }
      h = hour % 12; //converts 24 hour format into 12 AM PM hour format
      if (h == 0) { //if hour is 0
      h = 12; //set hour to 12 (AM)
      }
      convert += h; //add hour into the convert string
      convert += ":"; //add a colon after hour in the convert string
      if (("" + minute).length() == 1) { //if minute is a single digit
         convert += "0" + minute; //add a zero and minute to the convert string
      } else { //if minute is not a single digit
        convert += minute; //add minute to the convert string
      }
      convert += half; //add half (am/pm) to convert string
      return convert; //return convert string
   }

   //increment numbers up
   public void increment(int m){
      m = Math.max(m, 0); //turn negative incremented minutes into 0
      hour = (minute + m) / 60 + hour; //get the quotient of the incremented minutes and the original minutes and add the quotient to hour
      minute = (minute + m) % 60; //reassign the permanent minutes to the remainder of the incremented minutes and the original minutes an
      hour = hour % 24; //reset time if hour is over 24 hours
   }

   public static void main(String[] args){
      Time t1 = new Time(0,0);
      System.out.println("Expected 0000 - Actual " + t1);
      System.out.println("Expected 12:00am - Actual " + t1.convert());
      Time t2 = new Time(-6,9);
      System.out.println("Expected 0009 - Actual " + t2);
      Time t3 = new Time(6,-9);
      System.out.println("Expected 0600 - Actual " + t3);
      Time t4 = new Time(7,15);
      System.out.println("Expected 7:15am - Actual " + t4.convert());
      Time t5 = new Time(23,125);
      System.out.println("Expected 0105 - Actual " + t5 + " ");
      System.out.println("Expected 1:05am - Actual " + t5.convert());
      Time t6 = new Time(14,9);
      System.out.println("Expected 2:09pm - Actual " + t6.convert());
      System.out.println("Expected 1409 - Actual " + t6);
      Time t7 = new Time(12,8);
      System.out.println("Expected 12:08pm - Actual " + t7.convert());
      Time t8 = new Time(23,40);
      t8.increment(30);
      System.out.println("Expected 0010 - Actual " + t8);
      Time t9 = new Time(7,15);
      t9.increment(150);
      System.out.println("Expected 0945 - Actual " + t9);
      Time t10 = new Time(23,40);
      t10.increment(-10);
      System.out.println("Expected 2340 - Actual " + t10);
   }
}