package scanners;

import java.util.Scanner;

public class moneyTransaction {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("PLease enter the amount of money on the account:");
        double balance = 200;

        System.out.println("David has $: " + balance + " on his account");
        System.out.println("Please enter the amount from check 1: ");
            balance += money.nextDouble();
        System.out.println("Please enter the amount from check 2: ");
            balance += money.nextDouble();
        System.out.println("Please enter the amount from check 3:");
        balance += money.nextDouble();
        System.out.println("David has $: " + (balance)+ " after all deposits");
        System.out.println("Please, enter the phone price: ");
        balance -= money.nextDouble();
        System.out.println("Please, enter the headphone price: ");
        balance -= money.nextDouble();
        System.out.println("David has $ " + (balance) + " left on his account after all purchases made");

    }
}
