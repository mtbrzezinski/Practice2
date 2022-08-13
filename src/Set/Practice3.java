package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Practice3 {
    public static void main(String[] args) {
        //ArrayList to hashSet

        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(7);
        numbers.add(3);
        numbers.add(6);
        numbers.add(1);
        numbers.add(77);
        numbers.add(78);
        numbers.add(7);
        numbers.add(3);
        System.out.println(numbers);
        HashSet<Integer> setOfNumbers = new HashSet<>(numbers);
        System.out.println(setOfNumbers);

        TreeSet<Integer> number = new TreeSet(setOfNumbers);
        System.out.println(number);
        number.add(2);
        System.out.println(number);
        ArrayList<Integer> integers = new ArrayList(number);
        System.out.println(integers);
        System.out.println(integers.get(0)*2);
        ArrayList<String> string= new ArrayList(number);
        System.out.println(string.get(1));
        //System.out.println((Integer.parseInt(string.get(0))*3));


    }
}
