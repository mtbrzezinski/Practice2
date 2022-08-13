package OOP.Abstract.Interfaces.Interface2;

public class Test {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.swim();
        fish.makeNoise();
        // fish.eat(); static methods are not inherited in the child class from interface
        Owl owl = new Owl();
        owl.fly();
        owl.printInfo();
        owl.makeNoise();
        Duck duck = new Duck();
        duck.fly();
        duck.printInfo();
        duck.makeNoise();


    }
}
