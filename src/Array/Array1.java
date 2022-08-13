package Array;

import AccessModifiers.Animal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Array1 {
    public static void main(String[] args) {
        int [] number = new int[5];
        number [0] = 4;
        number [3] = 5;
        number [1] = 12;
        number [2] = 8;


        System.out.println(number.length);
        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
        System.out.println(Arrays.toString(number));
        String a = Arrays.toString(number);
        System.out.println(a.substring(3));
        System.out.println(number[6]);
        //Animal cat1 = new Animal("Fluffy", "white"); -> cannot reach from different classes.

    }
}
