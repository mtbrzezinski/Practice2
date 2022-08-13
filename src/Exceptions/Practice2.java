package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.SocketException;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) throws FileNotFoundException, SocketException, InterruptedException {

        FileInputStream file = null;
        file = new FileInputStream("Test");
Scanner scanner = new Scanner(file);


        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
int money = 10000;
        int car$ = 200;
        if(money<car$){
            throw new NumberFormatException("You do not have enough money to buy a car");
        }
        System.out.println("This is the end");

        Thread.sleep(15000);

        System.out.println("Final was FINAL");
    }
}
