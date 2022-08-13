package OOP.Inheritance;

public class Animal  {
    String name = "Animal";
    private int age;
    String eyeColor;

    public void sleep(){

        System.out.println("Animal is sleeping");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public Animal sound(){
        Animal animal = new Animal();
        System.out.println("Animal is making sound");
        return animal;
       // return new Animal;
    }
    @Override
    public String toString() {
        return eyeColor;
    }
}

