package scanners;

import java.util.Scanner;

public class ScannerPractice1 {

    public static void main(String[] args) {

        Scanner age = new Scanner(System.in);

        System.out.println("Please enter your age: ");

        int old = age.nextInt();

        System.out.println("your current age is " + old);
        System.out.println("Your age was " + (old - 10) + "10 years ago");

        Scanner height = new Scanner(System.in);

        System.out.println("Please enter yout height:");
        double meters = height.nextDouble();
        double centimeters = meters * 100;
        System.out.println("Your height in meters is: " + meters);

        System.out.println("Your height in centimeters is" + centimeters);

        System.out.println("Please enter your weight in kg: ");
        Scanner weight = new Scanner(System.in);
        double kg = weight.nextInt();
        System.out.println("Your weight is: ");

        double BMI = kg/(meters * meters);
        System.out.println("Your BMI is: " +BMI);




    }

}
