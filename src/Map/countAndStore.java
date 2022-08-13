package Map;

import WrapperClasses.StringToWrapper;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class countAndStore {
    public static void main(String[] args) {
        String str = "Spring will come soon!";

        /*
        s - 1
        p - 1
        r - 1
        i - 2
        n - 2
        o - 3
         */
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++){

           if(!map.containsKey(str.charAt(i))){
               map.put(str.charAt(i), 1);
           }else{
               int count = map.get(str.charAt(i));
               map.put(str.charAt(i), ++count);
              //map.put(str.charAt(i)+1, count++);
           }
            }
        System.out.println(map);
        }




    }

