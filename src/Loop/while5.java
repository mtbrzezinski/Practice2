package Loop;

import java.util.Locale;
import java.util.Scanner;

public class while5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence below: ");
        String s = scan.nextLine();
        System.out.println(s.charAt(s.length()-1));
        int index = 0;

        while (index < s.length()){
            System.out.print(s.charAt(index) + ", ");
            index++;

        }
    }
}
