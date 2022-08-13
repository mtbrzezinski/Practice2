package Switch;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter a number from 1 to 7:");
        byte number = scan.nextByte();
        final byte NUM = 1;
        switch(number){
            case NUM :
                System.out.printf("It is Monday, ");
                break;
            case 2:
                System.out.printf("It is Tuesday, ");
                break;
            case 3:
                System.out.printf("It is Wednesday, ");
                break;
            case 4:
                System.out.printf("It is Thursday, ");
                break;
            case 5:
                System.out.printf("It is Friday ");
                break;
            case 6:
            System.out.printf("It is Saturday, ");
            break;
            case 7:
            System.out.printf("It is Sunday, ");
            break;
            default:
                System.out.println("No matching entry");
                break;
        }

        switch(number){
            case 1 :
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                    System.out.println("not a valid entry");


        }


    }
}
