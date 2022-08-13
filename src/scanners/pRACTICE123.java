package scanners;

import java.util.Scanner;

public class pRACTICE123 {
    public static void main(String[] args) {
        Scanner practice1 = new Scanner(System.in);
        System.out.println("Please enter your information as in following format: F- Jenny Brown - 1999 ");
        String data = practice1.nextLine();

        System.out.println(data.startsWith("F"));
        System.out.println(data.startsWith("M"));
        System.out.println(data.contains("David"));

        System.out.println(data.endsWith("1999"));

        char lastChar = data.charAt(data.length()-1);
        System.out.println(lastChar);
        boolean isDigit = lastChar >= '0' && lastChar <= '9';
        System.out.println(isDigit);


    }
}
