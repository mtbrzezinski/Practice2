package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        HashMap<String, String> studentInfo = new HashMap();
        studentInfo.put("21", "Candan");
        studentInfo.put("2", "Hacer");
        studentInfo.put("5", "Ahmed");
        studentInfo.put("8", "Alex");
        System.out.println(studentInfo);
        studentInfo.put("9", "Alex");
        System.out.println(studentInfo);
        studentInfo.put("2", "Bekjan");
        System.out.println(studentInfo);
        studentInfo.put("4", "");
        System.out.println(studentInfo);
        studentInfo.put("", "Lee");
        System.out.println(studentInfo);
        studentInfo.put("","");
        System.out.println(studentInfo);
        System.out.println(studentInfo.get("9"));
        studentInfo.put(null, "John");
        System.out.println(studentInfo);
     studentInfo.put("90", null);
        System.out.println(studentInfo);
        System.out.println(studentInfo.get("90"));
        System.out.println(studentInfo.get("8907"));

        HashMap<Integer, String> map = new HashMap<>();
        map.put(8, "a");
        map.put(11, "b");
        map.put(22, "c");
        System.out.println(map);
        System.out.println(map.get(5));

        //only keys

        System.out.println(map.keySet());
        Set<Integer> allKeys = map.keySet();
        System.out.println(allKeys);
        for(Integer key : allKeys){
            System.out.println(key);
        }
        for(Integer key : allKeys){
            System.out.println(map.get(key));
        }



        learn();
    }
    public static String learn(){
        return "study";
    }
}
