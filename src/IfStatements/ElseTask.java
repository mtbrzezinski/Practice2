package IfStatements;

import java.util.Scanner;

public class ElseTask {
    public static void main(String[] args) {
        double order = 99;

        if (order >= 100) {
            System.out.println("Final price will be equal to " + order * 0.8);
        } else {

            System.out.println("Final price will be equal to " + order * 0.95);
        }
    }
}
