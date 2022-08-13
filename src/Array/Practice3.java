package Array;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        int[] studentNumbers = {3,4,6,8,2,11,12,0,9};
        System.out.println(studentNumbers[0]);
        System.out.println(studentNumbers.length);
        System.out.println(Arrays.toString(studentNumbers));

        studentNumbers[5] = 500;
        System.out.println(Arrays.toString(studentNumbers));

        for(int k = studentNumbers.length-1 ; k >= 0; k--){
            System.out.println(studentNumbers[k]);

            int[] ids = {1,2,3,4};
            //studentNumbers[5] = ids;
            ids[0] = studentNumbers[0];
            System.out.println(Arrays.toString(ids));

        }
    }
}
