package OOP.AbstractCases;

public class John extends SelfLearner{

    public John(){
        super("John", 22);

    }

    public John(String name, int age) {
        super(name, age);
    }

    public void read() {
        System.out.println("John is reading");
    }

    public void attend() {
        System.out.println("John is attending");

    }

    void watch() {
        System.out.println("John is watching");
    }
}
