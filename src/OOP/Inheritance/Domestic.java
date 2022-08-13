package OOP.Inheritance;

public class Domestic extends Animal {
    String eyeColor = "blue";

    @Override
    public void sleep() {

        System.out.println("Domestic is sleeping");
    }
    @Override

    public void eat(){
        System.out.println("Domestic is eating");
    }

    public void eat(int pounds){
        System.out.println("Domestic is eating " + pounds + " lbs of food");
    }

    @Override
    public String toString() {
        return eyeColor;
    }

    public Domestic sound(){
        System.out.println("Domestic is making sound");
    return new Cat();
    }

}
