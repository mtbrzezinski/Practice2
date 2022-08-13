package MethodPractice;

import java.util.Scanner;

public class BankAccount {
    String bankName;
    String accountHolderName;
    double balance;
    long accountNumber;
    String username = "efe";
    String password = "123";
    boolean isLoggedIn;
    /*
    -create a method that will display all account information
    -create a method that will be named as deposit, and it will update
    and show the new balance
    -create a method that will be named as withdraw and it will update
    and show the new balance
    -create a method that will check if the user is logged in or not and return true or false
     */

    public void Bank(){
        System.out.println("Bank name" + bankName +"\n Account holder name" + accountHolderName + "\n Balance" + balance + "\n Account number" + accountNumber + "\n is logged in: " + isLoggedIn);
    }
    public double Deposit(double money){
         balance += money;
        System.out.println("Your new balance is: " + balance);
        return balance ;

    }
    public double Withraw(double money){
        balance -= money;

        System.out.println("Your new balance after withdrawal is: " + balance);
        return balance;

    }
    public boolean isLoggedIn(String user, String pass){
        if(user.equals(username) && pass.equals(password)){
            isLoggedIn = true;
            System.out.println("You logged in successfully, " + isLoggedIn);
        }else {
            System.out.println("Your user and pass do not match " + isLoggedIn);
        }return isLoggedIn;

        }



    public static void main(String[] args) {
        BankAccount newBank = new BankAccount();
        newBank.Bank();
        newBank.Deposit(250.0);
        newBank.Withraw(66.9);
        newBank.isLoggedIn("efe", "123");

    }
}
