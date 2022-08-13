package Set;

import ArrayListPractice.ArrayToArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Practice4 {
    public static void main(String[] args) {

        String[] array = {"a", "b", "b", "c", "t", "a"};
       ArrayList<String> string = new ArrayList(List.of(array));
        System.out.println(string);
       HashSet<String> hashset = new HashSet(string);
        System.out.println(hashset);

        //second way of solution
        HashSet<String> secondSolution = new HashSet();
        for(String letter : array){
            secondSolution.add(letter);
        }
        System.out.println(secondSolution);

        // third solution
        HashSet<String> hashset2 = new HashSet(List.of(array));
        System.out.println(hashset2);
        String[] array2 = {"a", "b", "b", "c", "t", "a"};
        HashSet<String> set1 = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for (String element : array2 ){

            if( !set1.add(element)){
                System.out.println(set1.add(element));
                list.add(element);
                System.out.println("This element is repeating more than one: " + element);
            }

        }
        System.out.println("This is the list of repeating elements: " + list);
    }
}
