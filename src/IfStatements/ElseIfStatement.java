package IfStatements;

import java.util.Scanner;

public class ElseIfStatement {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 20:");
        int input = number.nextInt();
        if(input >= 0 && input <= 5){
            System.out.println("Your range is 0 to 5");
        }
        else if(input >= 6 && input <= 10){
            System.out.println("Your range is 6 to 10");
        }
        else if (input >= 11 && input <= 15){
            System.out.println("Your range is equal to 11 to 15");
        }else if(input >= 16 && input <= 20){
            System.out.println("Your range is equal to 16 to 20");
        }else{
            System.out.println("You are out of range");
        }
    }
}
