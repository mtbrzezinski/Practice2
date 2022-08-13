package Loop;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number below:");
        int number = scan.nextInt();
        int divisor = 1;
        while (divisor <= number) {

            if (number % divisor == 0){
                System.out.println(divisor + " is a divisor of " + number);
            }divisor++;
        }
    }
}
