package Primitives;

public class DataTypes {
    public static void main(String[] args) {
        byte number = 127;
        byte number1 = -13;
        number = number1;
        System.out.println(number);
        System.out.println(number1);

        short number2 = 55;
        short number3 = number;

        System.out.println("This is number3 -->" + number3);
        number = 99;
        int number4 = number;
        System.out.println(number4);

        float number8 = 3;
        float number9 = 2.99f;
        float num1 = number2;
        System.out.println(num1);

        double d = 5.6d;
        long longNum = 87653467;
        long longnum1 = 1_000_000_000;
        System.out.println(longnum1);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

            int x = 9;
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);


    }
}
