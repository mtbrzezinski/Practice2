package AccessModifiers;

public class Dog extends Animal{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.colorProtected = "black";
        Dog dog = new Dog();
        dog.genderDefault = "f";

    }
}
