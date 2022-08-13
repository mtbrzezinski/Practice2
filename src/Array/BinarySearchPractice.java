package Array;

import java.util.Arrays;

public class BinarySearchPractice {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 8, 12, 1, 25, 300, 3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 12));
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 9));
    }
}
