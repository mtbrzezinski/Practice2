package OOP.Abstract.Interfaces.Interface2;

public class Owl extends Animal implements CanFly{
    @Override
    public void fly() {
        System.out.println("Owl is flying");
    }
    public void printInfo(){
        CanFly.super.printInfo();
    }
    public void makeNoise(){
        System.out.println("Woohoo, woohoo...");
    }

}
