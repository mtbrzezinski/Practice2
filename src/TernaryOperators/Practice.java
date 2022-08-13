package TernaryOperators;

public class Practice {
    public static void main(String[] args) {
        int number1 = 5, number2 = 6;

       String result1 = number1 > number2 ? "first number" : "Hello";
        System.out.println(result1);

        int result2 = number1 != number2 ? 8+2 : 8*2;
        System.out.println(result2);

       char results3 =  number1 < number2 ? 't' : '&';
        System.out.println(results3);
        System.out.println(number1 > number2 ? 77 : "99");

       int result4 =  number1 != number2 ? number1++ + ++number2 : number2 * number1;
        System.out.println(result4);
    }
}
