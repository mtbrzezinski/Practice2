package Loop;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter a number:");
        int number1 = scan.nextInt();
        System.out.println("Please, enter a second number:");
        int number2 = scan.nextInt();
        int total = 0;

        do{
           total = total + number1;
           number1++;
        }while(number1 <= number2);
        System.out.println(total);

    }
}
