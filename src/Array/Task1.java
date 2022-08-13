package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many colors do you want to store? Enter a number");
        int size = scan.nextInt();
        String[] colors = new String[size];
        String[] longColorNames = new String[size];
        String[] shortColorNames = new String[size];
        scan.nextLine();
        for(int i = 0; i<size; i++){
            System.out.println("Please enter " +(i+1) + " color");
            //colors[i] = scan.next();
            String color = scan.nextLine();
            if(color.length()>3){
                longColorNames[i] = color;
            }else {
                shortColorNames[i] = color;
            }
        }

        System.out.println(Arrays.toString(longColorNames));
        System.out.println(Arrays.toString(shortColorNames));



    }
}
