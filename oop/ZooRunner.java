public class ZooRunner{

//Add one NoisyHungryBird to your array
public static void main(String[] args){
   Animal dog = new Animal(4,"meat","arf");
   System.out.println(Animal.zooPopulation);
   Bird robin = new Bird("bug","chirp");
   System.out.println(Animal.zooPopulation);
   Snake boa = new Snake("rat","hiss");
   System.out.println(Animal.zooPopulation);
   Bird screech = new NoisyHungryBird("quengis","chirps",3);
   System.out.println(Animal.zooPopulation);
   Animal[] zoo = {robin,boa,dog,screech};
   for (Animal a:zoo){
      a.move();
      a.eat();
      a.noise();
      }
   //robin.sound = "tuk tuk";   
   robin.setNoise("tuk tuk");
      
      
   }
   }