package OOP.Abstract.Interfaces.Interface2;

public class Fish extends Animal implements CanSwim{
    @Override
    public void swim() {
        System.out.println("Fish can swim");
    }
    public void makeNoise(){
        System.out.println("Blah, blah...");
    }

}
