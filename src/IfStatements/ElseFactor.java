package IfStatements;

import java.util.Scanner;

public class ElseFactor {
    public static void main(String[] args) {

        Scanner driver = new Scanner(System.in);
        System.out.println("Do you have a driver license? true/false");


      boolean driverLicense = driver.nextBoolean();

        if(driverLicense){
            System.out.println("You can drive in Illinois");
        }else{
            System.out.println("Please visit nearest DMV location");
        }
        System.out.println("Do you have drivers license? yes/no");
        String answer = driver.next();

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("You can drive in Illinois");
        }else{
            System.out.println("Please visit nearest DMV location");
        }
        }

    }

