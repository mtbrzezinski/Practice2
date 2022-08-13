package MethodPractice;

import java.util.Arrays;

public class VarArgsExample {
    public static void main(String[] args) {
        example("blue");
        String[] clrs = {"blue", "red", "black", "brown"};
        example1(clrs);
        example2("blue", "red", "green", "purple");
        sumCalculator(1, 2, 12, 23, 14, 12, 34);
    }

    public static void example(String color) {
        System.out.println(color);
    }

    public static void example1(String[] colors) {
        System.out.println(Arrays.toString(colors));
    }

    public static void example2(String... colors) {
        //System.out.println(Arrays.toString(colors));
        for (String element : colors) {
            System.out.println(element);
        }
    }

    public static int sumCalculator(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;

        }
        System.out.println(sum);
        return sum;
    }
    public static int sumCalculator(String color, int number, int... numbers) {

        int sum = 0;
        for (int num : numbers) {
            sum += num;

        }
        System.out.println(sum);
        return sum;
    }
}


