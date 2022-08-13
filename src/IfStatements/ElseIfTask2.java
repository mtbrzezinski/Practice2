package IfStatements;

import java.util.Scanner;

public class ElseIfTask2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please, provide a whole number: ");
        int whole = number.nextInt();
        if(whole > 0){
            System.out.println("it is positive number");
        }else if(whole < 0){
            System.out.println("it is negative number");
        }else{
            System.out.println("it is zero");
        }
    }
}
