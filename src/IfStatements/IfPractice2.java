package IfStatements;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {



        System.out.println("Please enter a number from 1 to 7:");
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();

        System.out.println("Your number is:" + day);

        if(day == 1){
            System.out.println("Today is Monday");
        }
        if(day == 2){
            System.out.println("Today is Tuesday");
        }
        if(day == 3){
            System.out.println("Today is Wednesday");
        }
        if(day == 4){
            System.out.println("Today is Thursday");
        }
        if(day == 5){
            System.out.println("Today is Friday");
        }
        if(day == 6){
            System.out.println("Today is Saturday");
        }
        if(day == 7){
            System.out.println("Today is Sunday");
        }
        if(day <=0 || day >= 8){
            System.out.println("There is no such entry");
        }







    }
}
