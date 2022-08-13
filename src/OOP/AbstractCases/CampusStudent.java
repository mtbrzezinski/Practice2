package OOP.AbstractCases;

public class CampusStudent extends Student {
    public CampusStudent(){
        super("John", 25);
    }
    public void attend(){
        System.out.println("Cmpus student is attending in person");
    }
    public void watch(){
        System.out.println("Campus students are watching in class");
    }
    public void study(){
        System.out.println("Campus student study a lot");
    }
}
