package Primitives;

public class NumericPromotion {
    public static void main(String[] args) {
        byte b1 =3;
        byte b2 = 6;
        // byte r1 = b1 + b2
        // short r1 b1 + b2
        // smaller data types,
        // short automatically promoted to inst any time they're used with arithmetic operator
        int r1 = b1 + b2;

        float f1 = 2.5f;
        float f2 = 3.1f;
        float r2 = f1 + f2;

        // float r3 = 4.5 + 5; // compile time error

        float r3 = 4.5f + 5;

        double r4 = f1 + f2;
        // int i1 - f1 + f2;
    }
}
