package Primitives;

public class Remainder1 {
    public static void main(String[] args) {
        /* 222 find the product of digits of given number */

        int number = 358;
        int digit1 = number % 10;
        number = number/10;
        System.out.println(digit1);

        int digit2 = number%10;
        number = number/10;
        System.out.println(digit2);

        int digit3 = number % 10;
        System.out.println(digit3);

         int productOfDigits = digit1 * digit2 * digit3;
        System.out.println("Product of digits of 358 = " + productOfDigits);
    }
}
