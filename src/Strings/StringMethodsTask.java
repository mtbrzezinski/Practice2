package Strings;

import java.util.Scanner;

public class StringMethodsTask {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println("Please enter a string value: ");
        String text = name.nextLine();
        System.out.println("Is this the string value? " + text);
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length()-1));
        System.out.println(text.indexOf('c'));
        System.out.println(text.indexOf('x'));
        System.out.println(text.length()/2);
        System.out.println(text.charAt(11));


    }
}
