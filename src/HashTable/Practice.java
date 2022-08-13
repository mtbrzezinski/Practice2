package HashTable;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();

        table.put("Java", 100);
        table.put("Selenium", 200);
        table.put("History", 300);
        table.put("Math", 400);


        System.out.println(table.get("History"));

      for(String key : table.keySet()){
          System.out.println(key + " is @ " + table.get(key));


        }
        for(Map.Entry<String, Integer> pairs : table.entrySet()){
            System.out.println(pairs);
            System.out.println("Keys: " + pairs.getKey());
            System.out.println("Value: " + pairs.getValue());


        }
    }
}
