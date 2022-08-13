package Map;


import java.util.*;


public class Practice4 {
  public static void printKeys(Map<Integer, String> map1){

      Set<Integer> keys = map1.keySet();
      for(Integer key : keys){
          System.out.println(key);
      }




    }
    public static void printValues(Map<Integer, String> map1){

      for(String value : map1.values()){
          System.out.println(value);

      }

    }
    public static void printPairs(Map<Integer, String> map1){
      for(Map.Entry<Integer, String> pair :map1.entrySet()){
          System.out.println(pair);
      }
    }

    public static void main(String[] args) {
        HashMap<Integer, String> departments = new HashMap<>();
        departments.put(5, "HR");
        departments.put(4, "Main Office");
        departments.put(3, "IT");
        departments.put(2, "Security");

        printKeys(departments);
        System.out.println("---------------");
        printValues(departments);
        System.out.println("------------");
        printPairs(departments);

    }
}
