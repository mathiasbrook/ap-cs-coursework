public class Animal{

   private int legs;
   private String food;
   private String sound;
   static int zooPopulation;
   private static final String Zoo_Name= "The Falls Church Zoo";
   
   
  
   public Animal(int l,String f,String s){
      legs = l;
      food = f;
      sound = s;
      zooPopulation++;
      
      //System.out.println("Welcome to the zoo");
      
      
   }
      
   public void eat(){
      System.out.println("My "+food+" is so good");
   } 
     
   public void move(){
      System.out.println("I walk on my "+legs+" legs");
   }
 
   public void noise(){
      System.out.println(sound);
   }
   
   public void setNoise(String s){
      sound =s;
   } 
   
   public String getFood(){
      return food;
   } 
     
   public static void main(String[] args){
      Animal fido = new Animal(4,"Alpo","arf");
      fido.food = "Dog Chow"; 
      fido.eat(); 
     
   } 
}   
 
