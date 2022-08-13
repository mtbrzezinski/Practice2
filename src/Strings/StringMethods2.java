package Strings;

import java.util.Locale;

public class StringMethods2 {
    public static void main(String[] args) {
        String quote = "Do whatever it takes!";

        System.out.println(quote.toUpperCase(Locale.ROOT));
        System.out.println(quote.toLowerCase(Locale.ROOT));
        quote = quote.concat(" For Your SUCCess!");
        quote = quote.toUpperCase(Locale.ROOT);
        System.out.println(quote);

       boolean start = quote.startsWith("DO");
        System.out.println(start);

        boolean ends = quote.endsWith("ESS!");
        System.out.println(ends);
        System.out.println(quote.endsWith("SUccEs!!"));
        System.out.println(quote.contains("IT"));
        boolean contain = (quote.contains("FOr"));
        System.out.println(contain);
    }
}
