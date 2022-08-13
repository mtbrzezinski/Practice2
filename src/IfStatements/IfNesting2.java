package IfStatements;

import java.util.Scanner;

public class IfNesting2 {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Do you know java?");
        String candidate = java.nextLine();
        if (candidate.equalsIgnoreCase("yes")) {
            System.out.println("Do you know Selenium?");
            String selenium = java.nextLine();
            if (selenium.equalsIgnoreCase("yes")) {
                System.out.println("Do you know API?");
                String API = java.next();
                if (API.equalsIgnoreCase("yes")) {
                    System.out.println("Do you know SQL?");
                    String SQL = java.next();
                    if (SQL.equalsIgnoreCase("yes")) {
                        System.out.println("Congrats! You are hired!");

                    } else {
                        System.out.println("We need SQL knowledge");
                    }
                } else {
                    System.out.println("We need API knowledge");
                }
            } else {
                System.out.println("We need Selenium knowledge");
            }} else {
                System.out.println("please learn Java and try again");
            }

        }

}
