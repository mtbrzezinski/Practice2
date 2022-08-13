package Primitives;

public class Casting {
    public static void main(String[] args) {
        // implicit Casting
        short itemNumber = 11;
        int i1 = itemNumber;

                // Explicit casting

        long studentNumber = 245;

        int i2 = (int)studentNumber;

        System.out.println(i2);

        short sh1 = 128;
        byte bt1 = (byte) sh1;


        System.out.println(bt1);
        double tax = 50000000000.5;
        int tax1 = (int)tax; // Explicit casting

        System.out.println(tax1);

        //===================

        int tax2 = (short)tax;

        System.out.println(tax2); // 5

        studentNumber -= 4;

        tax += studentNumber;

        tax1 = (int)(tax1 + tax);

        tax1 = (int)tax;
        System.out.println(tax);

        // create two variables one is "double" type, other is "float" data type
        // multiply those two variable and store the  the result into "int" databtype


      double price = 99.9;
      float itemNumbers = 8.5f;
        System.out.println(price * itemNumbers);

        int result = (int)(price * itemNumbers);
        System.out.println(result);

        price *= itemNumbers;
        System.out.println(price);

        long l = 2;
        int i = (int) l;

        short s1 = 3, s2  = 2;

        short sresult = (short)(s1 +s2);




        float fl = 2.3f;
        float fl1 = 3;

        float flr = fl + fl1;





    }
}
