package Variables;

import java.util.Random;
import java.util.Scanner;

public class HeadTail {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String answer = "";





        do{int randomNumber = random.nextInt(2);
           String flip = randomNumber == 0 ? "Head" : "Tail";
            System.out.println("Game is started, MAKE a GUESS! HEAD/TAIL");
            String guess = scanner.next();
            if(flip.equalsIgnoreCase(guess)){
                System.out.println("You are LUCKY!");
            }else{
                System.out.println("Sorry, it was not correct guess");
            }
            System.out.println("Do you want to play again? yes/no");
            answer = scanner.next();

        }while(answer.equalsIgnoreCase("yes"));
        System.out.println("See you next time!");


    }
}
