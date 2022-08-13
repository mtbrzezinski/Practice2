package Array;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        String[] studentNames = new String[10];
        System.out.println(Arrays.toString(studentNames));
        studentNames[1] = "Alex";
        studentNames[2] = "David";
        studentNames[8] = "***";
        studentNames[5] = "Tima";
        System.out.println(Arrays.toString(studentNames));
        studentNames[8] = "Ana";
        System.out.println(Arrays.toString(studentNames));
        System.out.print(Arrays.toString(studentNames));
        for(int index = studentNames.length-1; index >-1; index-- ){
            System.out.println(studentNames[index]);
        }
        studentNames[0] = "1234";
        studentNames[1] = "true";

    }
}
