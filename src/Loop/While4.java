package Loop;

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number:");

        int number = scan.nextInt();
        int multi = 1;
        while (multi < 11){
            System.out.println(number + " * " + multi + " = " + number * multi);
            multi++;
        }
    }
}
