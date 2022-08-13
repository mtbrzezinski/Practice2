package Switch;

import java.util.Locale;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner fruit = new Scanner(System.in);
        System.out.println("PLease enter a fruit name:");
        String s = fruit.nextLine().toLowerCase();
        switch (s) {
            case "strawberry":

            case "kiwi":

            case "orange":
            case "pineapple":

            case "apple":
                System.out.println("We have your favorite " + s + " enjoy");
                break;
            default:
                System.out.println("Sorry, we do no have fruit in our store");
        }
    }
}