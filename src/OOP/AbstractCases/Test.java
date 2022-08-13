package OOP.AbstractCases;

public class Test {
    public static void main(String[] args) {
        //Student student = new Student();
       // b12 B12 = new b12()
        CampusStudent campus = new CampusStudent();
        campus.watch();
        campus.study();

        OnlineStudent online = new OnlineStudent();
        online.watch();
        online.study();

        John john = new John();
        john.read();
john.sleep();
    }
}
