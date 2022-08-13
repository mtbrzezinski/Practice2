package Map;

import java.util.*;

public class Practice3 {
    public static void main(String[] args) {
        HashMap<String, String> cityState = new HashMap();
        cityState.put("Chicago", "IL");
        cityState.put("Des Plaines", "IL");
        cityState.put("Lake Forest", "IL");
        cityState.put("Columbus", "OH");
        cityState.put("Miami", "Fl");
        System.out.println(cityState);

        System.out.println(cityState.get("Chicago"));
        System.out.println(cityState.keySet());
        System.out.println(cityState.values());

        //entrySet

        System.out.println(cityState.entrySet());

        Set<Map.Entry<String, String>> pairs = cityState.entrySet();
        System.out.println(pairs);
        for(Map.Entry<String, String> p  : pairs ){
            System.out.println(p);
        }





    }
}
