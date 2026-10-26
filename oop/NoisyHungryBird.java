public class NoisyHungryBird extends Bird{

//The NoisyHungryBird makes it's noise n times. Add this number as a class variable 
//You may not have any other new class variables 
private int noise = 0;
//Write the constructor for the NoisyHungryBird class
public NoisyHungryBird(String f,String s, int n) {
   super(f,s);
   noise = n;
}

//Write the noise method for NoisyHungryBird using your new class variable
public void noise() {
   for (int i = 0; i < noise; i++) {
      super.noise();
   }
}
//For the eat method in this class
//The NoisyHungryBird says
//"Give me lots of " whatever food it eats
//Write the eat method so it will say this instead
public void eat() {
   System.out.println("Give me lots of " + super.getFood());
}
   
//The NoisyHungryBird likes to change the food that he eats. 
//Add a method to a different class that will allow this
//Do not write a new eat method in this class
public void changeFood() {
   super.eat();
}
//main method
//Create a NoisyHungryBird and test the methods you wrote
public static void main(String[] args){
   Bird test = new NoisyHungryBird("mouse","screech",3);
   test.eat();
   test.noise();
}


}