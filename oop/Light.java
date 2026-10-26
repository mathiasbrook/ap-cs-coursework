/*
 * AP CS MOOC
 * Term 2, Assignment 1, Part 1 (Light)
 * 
 * Light - represents a single light bulb
 * 
 */
public class Light
{
 // Declare the variables boolean on, boolean burntOut, String color
 
 private boolean on;
 private boolean burntOut;
 private String color;
 
 // Default constructor that sets the bulb to on, not burnt out, and "white".
 public Light()
 {
   on = true;
   burntOut = false;
   color = "white";
 }

 // This constructor sets the variable "on" to the parameter o. The burntOut
 // variable is set to the parameter b. If burntOut
 // is true, on is set to false, no matter what value is stored in o.
 // The color variable is set to the parameter c only if c is "red", "green"
 // or "blue". The constructor ignores the case of the value in c. If c holds
 // any value other than "red", "green" or "blue", the constructor sets
 // color to "white".
 public Light(boolean o, boolean b, String c)
 {
   on = o;
   burntOut = b;
   if (burntOut == true) on = false;
   c = c.toLowerCase();
   if (c.equals("red") || c.equals("green") || c.equals("blue")) color = c;
   else color = "white";
 }
 // The setOn method sets on to a if the light is not Burnt Out:
 //If the light is burnt Out then on is set to off
 
 public void setOn(boolean a){
   if (burntOut == false) on = a;
   else on = false;
 }
 // The getBurntOut method returns the value of the burntOut variable
   public boolean getBurntOut(){
     return burntOut;
   }
 // The setBurntOut method sets BurntOut to a 
 //If burntOut is true, then on must be false
 //so if a is true, on is set to false
 
 
 public void setBurntOut(boolean a){
   burntOut = a;
   if (burntOut == true) on = false;
 }
 

 // The toString method returns a String with the Light in the format:
 // off red    Burnt Out
 // on green    not Burnt Out
 //
 // Notice there is one space between "off"/"on" and the value for color,
 // and a tab before the "Burnt Out" or "not Burnt Out".
 public String toString()
 {
   String str1 = "off";
   String str2 = "not Burnt Out";
   if (on == true) str1 = "on";
   if (burntOut == true) str2 = "Burnt Out";
   return str1 + " " + color + "\t" + str2;
 }

 // This method changes the bulb from on to off, or visa versa. If the
 // burntOut variable is true, then the on variable may only be set to false.
 public void flip()
 {
   if (on == true) on = false;
   else if (on == false && burntOut == false) on = true;
 }

 // The getColor method returns the color of the bulb.
 public String getColor()
 {
  return color;
 }

 // The setColor method sets the color of the Light. The color variable is
 // set to c only if c is "red", "green" or "blue". The method ignores the
 // case of the value in c. If c holds any value other than "red", "green"
 // or "blue", color will be set to "white".
 public void setColor(String c)
 {
   c = c.toLowerCase();
   if (c.equals("red") || c.equals("green") || c.equals("blue")) color = c;
   else color = "white";
 }

 // The isOn method returns true if on, false otherwise.
 public boolean isOn()
 {
   return on;
 }

 // The burntOut method sets the variable burntOut to true and on to false.
 public void burnOut()
 {
   burntOut = true;
   on = false;
 }

 public static void main(String[] args)
 {
  //*************************************************************************
  // 1. Test Light()
  //*************************************************************************
  Light light1 = new Light();
  System.out.println("1. Test Light()");
  testLight(light1, true, false, "white", "on white\tnot Burnt Out");

  //*************************************************************************
  // 2. Test Light(boolean b, boolean o, String c)
  //*************************************************************************
  System.out.println("\n2. Test Light(boolean b, boolean o, String c)");
  Light light2 = new Light(true, true, "GreeN");
  // Notice that since the light bulb is "burnt out", the value of "on"
  // gets set to false. Also, the color should get saved in all lower case
  // as "green", not "GreeN".
  testLight(light2, false, true, "green", "off green\tBurnt Out");  

  //*************************************************************************
  // 3. Test isBurntOut()
  //*************************************************************************
  System.out.println("\n3. Test isBurntOut()");
  // light1 is not burntOut, light2 is burntOut
  if (light1.burntOut)
  {
   System.out.println("*** FAIL: isBurntOut() returns true for light1 (which is not burnt out)");   
  }
  else
  {
   System.out.println("*** PASS: isBurntOut() returns false for light1 (which is burnt out)");
  }
  if (light2.burntOut)
  {
   System.out.println("*** PASS: isBurntOut() returns true for light2 (which is burnt out)");
  }
  else
  {
   System.out.println("*** FAIL: isBurntOut() returns false for light2 (which is burnt out)");   
  }
  

  //*************************************************************************
  // 4. Test burnOut()
  //*************************************************************************
  System.out.println("\n4. Test burnOut()");
  // light1 is not burnt out. Lets call burnOut on light1 and make sure it gets burnt out and turned off
  light1.burnOut();
  testLight(light1, false, true, "white", "off white\tBurnt Out");


  //*************************************************************************
  // 5. Test flip()
  //*************************************************************************
  System.out.println("\n5. Test flip()");
  Light light3 = new Light();
  // light3 is currently on and not burnt out.  Lets flip the light off and on and see if it works properly.
  System.out.println("light3 is on");
  testLight(light3, true, false, "white", "on white\tnot Burnt Out");
  light3.flip();
  System.out.println("now light3 should be off");
  testLight(light3, false, false, "white", "off white\tnot Burnt Out");
  light3.flip();
  System.out.println("now light3 should be back on");
  testLight(light3, true, false, "white", "on white\tnot Burnt Out");
  // Try to flip light1 on - this should fail since light1 is burnt out. light1 should stay off
  System.out.println("light1 is burned out and off, we can't flip it on");
  light1.flip();
  testLight(light1, false, true, "white", "off white\tBurnt Out");

  //*************************************************************************
  // 6. Test isOn()
  //*************************************************************************
  System.out.println("\n6. Test isOn()");  
  // We know light1 is off, and light3 is on.  Verify that the method isOn reports this correctly.
  if (!light1.isOn())
  {
   System.out.println("*** PASS: isOn() working properly");
  }
  else 
  {
   System.out.println("*** FAIL: isOn() not working properly");
  }
  if (light3.isOn())
  {
   System.out.println("*** PASS: isOn() working properly");
  }
  else 
  {
   System.out.println("*** FAIL: isOn() not working properly");
  }

  //*************************************************************************
  // 7. Test getColor()
  //*************************************************************************
  System.out.println("\n7. Test getColor()");
  if (light1.getColor().equals("white"))
  {
   System.out.println("*** PASS: getColor() working properly");
  }
  else 
  {
   System.out.println("*** FAIL: problem with getColor()");
  }
 
  //*************************************************************************
  // 8. Test setColor(String)
  //*************************************************************************
  System.out.println("\n8. Test setColor(String)");
  light1.setColor("red");  
  System.out.println("*** " + testLightColor(light1, "red"));
  light1.setColor("BLUE");  // should set light to blue
  System.out.println("*** " + testLightColor(light1, "blue"));
  light1.setColor("yellow"); // yellow is not allowed, should set light to white
  System.out.println("*** " + testLightColor(light1, "white"));  
 }

 // Private helper methods

 private static void testLight(Light light, boolean o, boolean b, String c,
   String string)
 {
  System.out.println("*** " + testLightOn(light, o));
  System.out.println("*** " + testLightBurntOut(light, b));
  System.out.println("*** " + testLightColor(light, c));
  System.out.println("*** " + testLightToString(light, string));
 }

 private static String testLightOn(Light bulb, boolean o)
 {
  if ((bulb.on && !o) || (!bulb.on && o))
  {
   return "FAIL: on is not set correctly. on should be set to "
     + o + ", but it is set to " + bulb.on + ".";
  }
  else
  {
   return "PASS: on is set correctly (" + bulb.on + ")";
  }
 }

 private static String testLightBurntOut(Light light, boolean b)
 {
  if ((light.burntOut && !b) || (!light.burntOut && b))
  {
   return "FAIL: burntOut is not set correctly (burntOut should be set to "
     + b + ", but it is set to " + light.burntOut + ")";
  }
  else
  {
   return "PASS: burntOut is set correctly (" + light.burntOut + ")";
  }
 }

 private static String testLightColor(Light light, String c)
 {
  if (!light.color.equals(c))
  {
   return "FAIL: color is not set correctly (color should be set to "
     + c + ", but it is set to " + light.color + ")";
  }
  else
  {
   return "PASS: color is set correctly (" + light.color + ")";
  }
 }

 private static String testLightToString(Light light, String string)
 {
  String output;
  
  if (light.toString().equals(string))
  {
   output = "PASS: toString produced the correct output";
  }
  else
  {
   output = "FAIL: toString does not work as expected";
  }
  return output + " (" + light.toString() + ")";
 }
}