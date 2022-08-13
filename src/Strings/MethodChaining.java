package Strings;

import java.util.Locale;

public class MethodChaining {
    public static void main(String[] args) {
        String str = "Sun day";
    short length = (short)(str.concat("is getting tough").length());
        System.out.println(length);
        System.out.println(str.length());

        String zero = "   Zero to Hero   ";
        System.out.println(zero.replace("Zero", "One").toUpperCase().trim().substring(0,3).length());
    }
}
