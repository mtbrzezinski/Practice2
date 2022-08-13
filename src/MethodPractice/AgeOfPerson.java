package MethodPractice;

import java.util.Scanner;

public class AgeOfPerson {

    public void Age(int birthYear){

        int age = 2022 - birthYear;
        System.out.println("You current age is: " + age);

    }
    public void Age(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
       String name = scan.nextLine();
        System.out.println("Please enter your birth year: ");
       int year = scan.nextInt();
        System.out.println("Your age is: " + (2022 - year));
    }

    public static void main(String[] args) {

        AgeOfPerson person = new AgeOfPerson();
        person.Age();
    }
}
