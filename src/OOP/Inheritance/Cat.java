package OOP.Inheritance;

public class Cat extends Domestic {
    String name = "Fluffy";
    String eyeColor = "Brown";
    @Override
    public void sleep() {

        System.out.println("Cat is sleeping");
    }
    public void eat(String location){
        System.out.println("Cat is eating at " + location);
    }
    @Override
    public String toString() {
        return eyeColor;
    }
}
