public class Bird extends Animal{


public Bird(String f,String s){
   super(2,f,s);
   }
   
  public void move(){
    System.out.println("I fly through the air");
  }
  
  public void moveGround(){
    super.move();
  }
  
  public void eat() {
    
  }
  public static void main(String[] args){
     Animal wren = new Bird("spider","churr");
     //System.out.println(wren.food);
     Bird myWren = (Bird)wren;
     myWren.moveGround();
  }
  }
  