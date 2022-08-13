package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("apple");
        list.add("orange");
        System.out.println(list);
        list.toArray();
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        //array[2] = "text";
        list.add("orange");
        System.out.println(list);


    }
}
