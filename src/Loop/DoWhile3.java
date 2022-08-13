package Loop;

import scanners.ScannerPractice;

import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number below: ");
        int number = scan.nextInt();
    String star = "";
        do{
            star = star + "*";
            System.out.println(star);
            number--;
        }while(number >= 0);
    }
}
