package Array;

import java.util.Arrays;
import java.util.Locale;

public class SortPractice  {
    public static void main(String[] args) {
        int[] zipCodes = {-25, 23, 45, 12, 55, 100, 690, 33, 45, -1234};
        System.out.println(Arrays.toString(zipCodes));
        Arrays.sort(zipCodes);
        System.out.println(Arrays.toString(zipCodes));

        String[] color = {"Red", "blue", "black", "white", "Pink", "Violet", "green", "yellow", "BROWN"};
        System.out.println(Arrays.toString(color));
        Arrays.sort(color);
        System.out.println(Arrays.toString(color));

        String[] newColor = new String[color.length];
        for(int i =0; i< color.length; i++){
            newColor[i] = color[i].toLowerCase();
        }
        System.out.println(Arrays.toString(newColor));

    }


}
