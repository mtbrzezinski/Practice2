package Block;

public class Practice2 {
    String courseName;
    static int number;
    {

        courseName = "Test";
        System.out.println("INSTANCE BLOCK  " + courseName);
    }
    static{
        number = 25;
        System.out.println("STATIC BLOCK" + number);
    }

    public static void main(String[] args) {
        Practice2 o1 = new Practice2();
        System.out.println(o1.courseName);
        System.out.println(o1.number);
        o1.number = 100;
        Practice2 o2 = new Practice2();
        System.out.println(o2.number);

    }
}
