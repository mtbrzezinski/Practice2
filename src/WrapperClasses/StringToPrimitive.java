package WrapperClasses;

public class StringToPrimitive {
    public static void main(String[] args) {
        String a = "10";
        String b = "20";
        int numberA = Integer.parseInt(a);
        int numberB = Integer.parseInt(b);
        System.out.println(a + b);
        System.out.println(numberA + numberB);

        String c = "L";
       // int numberC = Integer.parseInt(c);
       // System.out.println(numberC);

        String d = "true";
       boolean bd = Boolean.parseBoolean(d);
        System.out.println(bd == false);
        System.out.println(bd);


    }

}
