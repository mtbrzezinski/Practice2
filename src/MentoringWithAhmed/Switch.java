package MentoringWithAhmed;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int options = scan.nextInt();
        switch (options){
            case 1:
                System.out.println("You are talking to Ahmet");
                break;
            case 2:
                System.out.println("You are talking to Mehmet");
                break;
            case 3:
                System.out.println("You are talking to Beck");
                break;
            case 4:
                System.out.println("You are talking to Rima");
                break;
            case 5:
                System.out.println("You are talking to Ana");
                break;
        }
    }
}
