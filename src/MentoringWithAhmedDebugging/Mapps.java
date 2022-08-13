package MentoringWithAhmedDebugging;

import java.util.HashMap;
import java.util.Map;

public class Mapps {
    /*
    1 - Can you tell me about map and why do you use map in your project?
    Map is an awesome interface that I used in my ptoject to store
    my data as KEY-VALUE pairs.

    2 - What is the connection between Map and Collection?
    They are all useful for the project for different purposes.
    As I mentioned before set is all about uniqueness. List is all about duplication
    and efficiency. Map is all about key and value pair.

    SHOW OFF NOTES: Map is the combination of collections -
    As you know Key part of the map is unique which refers to SET
    value part of the map can be duplicate which refers to LIST

    3 - What is the type of map and differences between them?
    HashMap - put() random order
    LinkedHashMap - insertion order
    TreeMap - ascending key order
     */
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "peach", "apple", "orange", "strawberry", "banana", "apple", "cherry", "orange"};
        //Task: get the output of total items - "apple" = 3, "banana" - 2, etc
        //Step 1: I think you are asking me to find the numbers of each fruits right?
        //and want me to show them like this output that you shared, right?
        //I am going to use loops to access each of the fruits
        // then I am going to put if conditions for a specific element
        // and then I am going to print them out

        Map<String, Integer> fruitCounts = new HashMap<>();
        for(int i = 0; i<fruits.length; i++){
            if(!fruitCounts.containsKey(fruits[i])){
                fruitCounts.put(fruits[i], 1);
            }else{
                fruitCounts.put(fruits[i], fruitCounts.get(fruits[i])+1);
            }
        }
        System.out.println(fruitCounts);

    }
}
