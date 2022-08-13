package scanners;

import java.util.Scanner;

public class scannerPractice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter where you live: ");

       String city = sc.next();

        System.out.println("You are living in: " + city);

        System.out.println("I am loosing some part of your city name, please enter again");
        sc = new Scanner(System.in);
        city = sc.nextLine();

        System.out.println("You are living in "+ city + "correct?");

        System.out.println("What is the zipcode?");
        int zipcode = sc.nextInt();
        System.out.println("Zipcode is " + zipcode);

        System.out.println("Enter your first name: ");
        char firstLetter = sc.next().charAt(0);
        System.out.println("your first initial is " + firstLetter);
        System.out.println("Please enter your name again:");
        char secondLetter = sc.next().charAt(1);
        System.out.println("second letter is " + secondLetter);



    }




}
