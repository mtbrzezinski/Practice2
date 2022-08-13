package OOP.Abstract.Interfaces.Interface2;

public class Duck extends Animal implements CanFly, CanSwim{
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
    public void printInfo(){
       CanFly.super.printInfo();
    }
    public void makeNoise(){
        System.out.println("Quack, quack...");
    }
}
