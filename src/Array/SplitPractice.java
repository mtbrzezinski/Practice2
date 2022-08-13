package Array;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {


        String str = "Java is easy";
        String[] words = str.split(" ");

        System.out.println(words[0]);
        System.out.println(Arrays.toString(words));

        String[] parts = str.split("a");
        System.out.println(Arrays.toString(parts));

        String date = "03-13-2022";
            String[] part2 = date.split("-");
        System.out.println(Arrays.toString(part2));

        String date2 = "03/13/2022";
        String[] part3 = date2.split("/");
        System.out.println(Arrays.toString(part3));

        String date3 = "03.13.2022";
        String[] part4 = date3.split("\\.");
        System.out.println(Arrays.toString(part4));





    }

}

