package OOP.AbstractCases;

public abstract class SelfLearner extends Student{

    public SelfLearner(String name, int age) {
        super("Self", 32);
    }
    public abstract void read();
}
