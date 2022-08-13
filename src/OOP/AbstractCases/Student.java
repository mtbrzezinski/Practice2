package OOP.AbstractCases;

public abstract class Student {
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;

    }
    public abstract void attend();
    abstract void watch();

    void sleep(){
        System.out.println("Everybody is going to sleep");
    }
}
