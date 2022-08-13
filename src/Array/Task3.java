package Array;

import java.util.Arrays;
import java.util.Locale;

public class Task3 {
    public static void main(String[] args) {
        String[] studentNames = {"Alex", "David", "John", "Mary", "Aba"};
        String[] emailStudent = new String [studentNames.length];
        int index = 0;
        for(String email : studentNames){
            System.out.println(email.toLowerCase().concat("@gmail.com"));
            emailStudent[index] = email.toLowerCase().concat("@gmail.com");
            index++;
        }

        System.out.println(Arrays.toString(emailStudent));
    }
}
