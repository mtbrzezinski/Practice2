package Map;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Practice5 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap();
        map1.put("Chicago", "IL");
        map1.put("Des Plaines", "IL");
        map1.put("Lake Forest", "IL");
        map1.put("Columbus", "OH");
        map1.put("Miami", "Fl");
        //System.out.println(map1);
        //System.out.println("-------------");

        LinkedHashMap<String, String> map2 = new LinkedHashMap();
        map2.put("Chicago", "IL");
        map2.put("Des Plaines", "IL");
        map2.put("Lake Forest", "IL");
        map2.put("Columbus", "OH");
        map2.put("Miami", "Fl");
        //System.out.println(map2);
       // System.out.println("-----------");


        TreeMap<String, String> map3 = new TreeMap();
        map3.put("Chicago", "IL");
        map3.put("Des Plaines", "IL");
        map3.put("Lake Forest", "IL");
        map3.put("Columbus", "OH");
        map3.put("Miami", "Fl");
       // System.out.println(map3);

        map1.put(null, "Tx");

        map2.put(null, "Tx");
        //map3.put(null, "Tx");

        map1.put("Denver", null);
        map2.put("Denver", null);
        map3.put("Denver", null);
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
        System.out.println();
        System.out.println();


        System.out.println(map1);
map3.put("a", "a");
map3.put("b", "b");
        map1.putAll(map3);


        System.out.println("_______________________________");
        System.out.println(map1);

    }
}
