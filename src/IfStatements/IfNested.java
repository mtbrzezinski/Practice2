package IfStatements;

import java.util.Scanner;

public class IfNested {
    public static void main(String[] args) {
        Scanner travel = new Scanner(System.in);

        System.out.println("Do you have passport?");
         String passport = travel.nextLine();
        if(passport.equalsIgnoreCase("yes")){
            System.out.println("Do you have a visa?");
           String visa = travel.nextLine();
            if (visa.equalsIgnoreCase("yes")) {
                System.out.println("Do you have ticket?");
                String ticket = travel.nextLine();

                if (ticket.equalsIgnoreCase("yes")) {
                    System.out.println("Do you have covid test results negative?");
                    String covid = travel.nextLine();
                    if (covid.equalsIgnoreCase("yes")) {
                        System.out.println("Welcome");


                    }
                }
            }

        }else{
            System.out.println("You can't go");
        }
    }
}
