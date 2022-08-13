package MentoringWithAhmed;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    /*
    1. What is the difference between Array and ArrayList
    Arrays:
    1.  Array is a storage for primitives and objects(string)
    2. Array is a fixed size
    3. Array has multidimensional form
    4. Array has a length feature
    5.Array's elements cannot ba multiplicated (there is no methods of Array)
     */
    public static void main(String[] args) {
        String[] array = new String[5];//I have to provide size
        System.out.println(Arrays.toString(array));
        String[] array1 = {"1", "2", "ahmet", "mehmet", "ahmet1"};
        System.out.println(Arrays.toString(array1));


        int[] array2 = {1,2,3,8,12,65,76,5,22,17};
        int i = 0;
        int sumOfEven = 0;
        int SumOfOdd = 0;
    int difference = 0;
        for(int number:array2){
    if(number%2==0){
        sumOfEven += number;
    }else if(number%2!=0){
        SumOfOdd+=number++;
    }
            System.out.println("Even: " + sumOfEven);
            System.out.println("Odd: " + SumOfOdd);
    difference=sumOfEven-SumOfOdd;
            System.out.println("Difference: " + difference);
        }

    }
}
