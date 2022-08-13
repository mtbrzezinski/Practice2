package IfStatements;

import java.util.Scanner;

public class ElseTask1 {
    public static void main(String[] args) {
        Scanner zip = new Scanner(System.in);
        System.out.println("Please enter our zipcode");
        int zipcode = zip.nextInt();
        if(zipcode %2 == 0){
            System.out.println("your zipcode is even number");
        }else {
            System.out.println("your zipcode is odd number");
        }
    }
}
