package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>();

        //list.add(100);
       // list.add(300);
       // list.add(450);
      //  List<Object> numbers1 = Arrays.asList(111,222,333,444,555,666,777);
//list.addAll(Arrays.asList(1,2,3,4,5,6));
int[] numbers = {4,5,6,7};
    List<int[]> n1 = Arrays.asList(numbers);
    //n1.add(345);
        System.out.println(Arrays.toString(n1.get(0)));

    }
}
