package Strings;

import javax.print.DocFlavor;

public class EqualsMethod {
    public static void main(String[] args) {
        String name1 = "David";
        String name2 = "David";
        String name3 = new String("David");
        String name4 = new String ("David");
        String name5 = name1;
        String name6 = name3;

        System.out.println(name1 == name5);
        System.out.println(name3 == name6);
        System.out.println(name6 == name4);
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1 == name3);
        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));

        name2 = name6;
        System.out.println(name2 == name6);
    }
}
