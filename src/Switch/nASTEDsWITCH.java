package Switch;

import java.util.Locale;
import java.util.Scanner;

public class nASTEDsWITCH
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please chose the department from the following: \n 1 - IT\n 2 - HR \n 3 - Admin \n 4 - Help Desk ");
        int number = scan.nextInt();
        switch (number){
            case 1:
                System.out.println("Who do you want to speak with in" + number + "\n Sam \n for David \n Tina");
                String name = scan.next().toUpperCase();
                switch (name){
                    case "SAM":
                    case "DAVID":
                    case "TINA":
                        System.out.println("Hi, you are speaking with " + name+ " from IT department");
                        break;
                    default:
                        System.out.println("There's no such person in this department" + name);
                }break;
            case 2:
                System.out.println("Who do you want to speak with in " + number + "\n David \n Alex ");
                name = scan.next().toUpperCase();
                switch(name){
                    case "DAVID":
                    case "ALEX":
                        System.out.println("Hi, you are speaking with " + name+ " from HR department");

                }break;
            case 3:
                System.out.println("Who do you want to speak with in " + number + "\nJohn  \n Alan ");
                name = scan.next().toUpperCase();
                switch(name){
                    case "John":
                    case "Alan":
                        System.out.println("Hi, you are speaking with " + name+ " from Admin department");
                }




        }
        int i = 0;
        while (i<5){
            System.out.println("aaaa");
            i++;

        }

    }
}
