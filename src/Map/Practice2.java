package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Practice2 {
    public static void main(String[] args) {
        HashMap<String, String> cityState = new HashMap();
        cityState.put("Chicago", "IL");
        cityState.put("Des Plaines", "IL");
        cityState.put("Lake Forest", "IL");
        cityState.put("Columbus", "OH");
        cityState.put("Miami", "Fl");
        System.out.println(cityState);
        //remove method
        cityState.remove("Des Plaines");
        System.out.println(cityState);
        cityState.replace("Miami", "Florida");
        System.out.println(cityState);

        cityState.replace("Miami", "Florida", "NewYork");
        System.out.println(cityState);

        System.out.println(cityState.containsValue("NewYork"));
        System.out.println(cityState.containsKey("Chicago"));
        System.out.println(cityState.containsKey("Des Plaines"));
        System.out.println(cityState.size());

        Double size = Double.valueOf(cityState.size());
        System.out.println(size);
        Double size1 = (double)cityState.size();
        System.out.println(size1);

        System.out.println(cityState.isEmpty());
        cityState.clear();
        System.out.println(cityState.isEmpty());

        cityState.put("Chicago", "IL");
        cityState.put("Des Plaines", "IL");
        cityState.put("Lake Forest", "IL");
        cityState.put("Columbus", "OH");
       // cityState.put("Miami", null);
        System.out.println(cityState);

        System.out.println(cityState.values());

        Collection<String> values = cityState.values();

        System.out.println(values);
        System.out.println("...................");

        for(String v : values){
            System.out.println(v.toLowerCase());
        }
       HashSet set = new HashSet(cityState.values());
        System.out.println(set);







    }
}
