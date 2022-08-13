package IfStatements;

import java.util.Scanner;

public class IfStatements3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number between 1 to 12:  ");
        int number1 = scanner.nextInt();


        System.out.println("Please enter am or pm:");
        scanner.nextLine();
        String specify = scanner.nextLine();


        if(specify.equalsIgnoreCase("am")){

            System.out.println("Good morning! It is " + number1 + " am");


        }
        if(specify.equalsIgnoreCase("pm")){

            System.out.println("Good evening! It is " + number1 + " pm");


        }







    }
}

