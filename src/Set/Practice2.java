package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {
    public static void main(String[] args) {


        HashSet<String> colors = new HashSet<>();
        LinkedHashSet<String> colors2 = new LinkedHashSet();
        TreeSet<String> colors3 = new TreeSet();

        colors.add("green");    colors2.add("green");    colors3.add("green");
        colors.add("yellow");   colors2.add("yellow");   colors3.add("yellow");
        colors.add("blue");     colors2.add("blue");     colors3.add("blue");
        colors.add("black");    colors2.add("black");    colors3.add("black");
        colors.add(null); colors2.add(null); //colors3.add(null);
        System.out.println(colors); System.out.println(colors2); System.out.println(colors3);
        System.out.println(colors3.first());
        System.out.println(colors3.last());
        System.out.println(colors3.pollFirst());
        System.out.println(colors3);
        System.out.println(colors3.pollLast());
        System.out.println(colors3);
        colors3.add("yellow");
        colors3.add("red");
        System.out.println(colors3);
        colors3.descendingSet();
        System.out.println(colors3.descendingSet());

    }
}
