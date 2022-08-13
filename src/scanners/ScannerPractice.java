package scanners;


import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
      String myName = "Maria";
        System.out.println(myName);

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your last name:" );


         String lastName =  input.nextLine();
        System.out.println("is this your lasr name? " + lastName);

    }




}

