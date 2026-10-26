//23105
public class City 
{
  
  private String state;
  private String name;
  private int population;
  private double noHealthInsurance;
  private double highBP;
  private double asthma;
  private double smoker;
  private double noLeisureExercise;
  private double obese;
  private double sleepDeprived;
  
  public City(String[] str)
  {
    state = str[0];
    name = str[1];
    population =Integer.parseInt(str[2]);
    noHealthInsurance = Double.parseDouble(str[3]);
    highBP = Double.parseDouble(str[4]);
    asthma = Double.parseDouble(str[5]);
    smoker = Double.parseDouble(str[6]);
    noLeisureExercise = Double.parseDouble(str[7]);
    obese = Double.parseDouble(str[8]);
    sleepDeprived = Double.parseDouble(str[9]);
  }
  
  public String getName()
  {
    return name;
  }
  
  public String getState()
  {   
    return state;
  }
  
  public int getPopulation()
  {
    return population;
  }
  
  public double getNoHealthInsurance()
  {
    return noHealthInsurance;
  }
  public double getHighBP()
  {
   return highBP;
  }
  public double getAsthma()
  {
   return asthma;
  }
  public double getSmoker()
  {
   return smoker;
  }
  public double getNoLeisureExercise()
  {
   return noLeisureExercise;
  }
  public double getObese()
  {
   return obese;
  }
  public double getSleepDeprived()
  {
    return sleepDeprived;
  }
  
  public String toString()
  {
    return "State: " + name + " City: " + state + " Population: " + population + " No Health Insurance: " + noHealthInsurance + " High BP: " + highBP + " Asthma: " + asthma + " Smoker: " + smoker + " No Leisure Exercise: " + noLeisureExercise + " Obese: " + obese + " Sleep Deprived: " + sleepDeprived;
  }
}
