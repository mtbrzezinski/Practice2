package Map;

import java.util.LinkedHashMap;

public class CountAndStore1 {
    public static void main(String[] args) {

        String[] colors = {"green", "yellow", "blue", "red", "red", "orange", "orange", "orange"};
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for(String color : colors){
       if(map.containsKey(color)){
           map.put(color, map.get(color)+1);

       }else {
          map.put(color,1);
       }
    }
        System.out.println(map);
    }
}
