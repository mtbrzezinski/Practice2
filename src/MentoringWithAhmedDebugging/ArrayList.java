package MentoringWithAhmedDebugging;

import java.util.List;

public class ArrayList {
    /*
    1 - What is the difference between Array and ArrayList?

    ARRAY:
    Array has fixed size
    Arrays has multidimensional form
    Arrays store both Object and Primitives
    Arrays don't have methods if it has only primitive data inside or Strong
     and(it has only length) *except String[] methods
    Synthax is different -->
    int[] array = new int[3];
    int[] array = {3, 4, 5, 8, 9, 10};

    ARRAYLIST:
    ArrayList is dynamic size
    ArrayList doesn't have it
    ArrayList stores ONLY Objects
    ArrayList has methods(add, remove, replace, size).

   Synthax is different
        List<INTEGER> numbers = new ArrayList;

        COMMON POINTS ARRAY-ARRAYLIST:
        Both have indexing(it means you can iterate with index number)

        2 - What is the difference between ArrayList and LinkedList?
        I do not use LinkedList a lot but the efficiency of reaching out the element
        in ArrayList is faster than LinkedList - in summary the efficiency of
        ArrayList is better to reach out element data
        When you manipulate data LinkedList is faster
     */
    public static void main(String[] args) {
        List<Integer> numbers = new java.util.ArrayList<>();

    }
}
