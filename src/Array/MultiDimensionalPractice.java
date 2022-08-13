package Array;

import java.util.Arrays;

public class MultiDimensionalPractice {
    public static void main(String[] args) {
        int[][] numbers = new int [3][5];
        System.out.println(Arrays.deepToString(numbers));
    numbers[0][0] = 11;
        System.out.println(Arrays.deepToString(numbers));
        numbers[0][4] = 22;
        System.out.println(Arrays.deepToString(numbers));
        numbers[2][4] = 50;
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(numbers[0][4]);

        numbers[1][4] = 77;
        System.out.println(Arrays.deepToString(numbers));
        numbers[0][0] = 200;
        System.out.println(numbers[0][0]);
        System.out.println(Arrays.toString(numbers[2]));
        System.out.println(numbers[2][4]);

    for(int i = 0; i < numbers.length; i++){
        for(int j = 0; j < numbers[i].length; j++){
            System.out.println(">>" + numbers[i][j]);
        }
    }


    }
}
