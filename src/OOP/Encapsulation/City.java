package OOP.Encapsulation;

public class City {
    private long population;
   private String name;
   private int yearFounded;
   String language;



           public void setPopulation(long population){
       this.population = population;
           }
           public long getPopulation(){
               return population;
           }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setYearFounded(int yearFounded){
        this.yearFounded = yearFounded;
    }
    public int getYearFounded(){
        return yearFounded;
    }
    private void grow(){
        System.out.println("This city is growing fast");
    }


}
