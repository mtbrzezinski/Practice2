package MentoringWithAhmedDebugging;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
        Possible Interview Questions:
        1. may technical questions they require to use
        loops to solve the questions
        LOOPS: it is a way to interate(circles) the elements (values/variables)
        one by one. In other words --> is a cycle for repetitive actions

        TYPED OF LOOPS:
        Do WHILE
        WHILE
        For
        For Each

         */
        int input;
            do{
                Scanner scan = new Scanner(System.in);
                System.out.println("1-Continue\n2-Exit");
                input=scan.nextInt();
            }while(input!=2);
    /*
    Task 1:
    Ask the user to input a word and reverse it (for)
     */

        Scanner user = new Scanner(System.in);
        System.out.println("Please, enter any word below:");
        String reverse = user.nextLine();

        for(int i = reverse.length()-1; i>=0; i-- ){
            String word = "";
            word += reverse.charAt(i);
            System.out.print(word);
        }

    }
}
