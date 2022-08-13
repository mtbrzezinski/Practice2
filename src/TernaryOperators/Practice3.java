package TernaryOperators;

import java.util.Locale;

public class Practice3 {
    public static void main(String[] args) {
        String result = 5 > 6 ? "Saturday" : 6 > 10 ? "morning" : "afternoon";
        System.out.println("Result1 is " + result);
                String result2 = 5 > 6 ? "Saturday" : 6 > 10 ? "morning" : "tech".toUpperCase().contains("CH") ? "David" : "Alex";
        System.out.println("Result2 is " + result2);
        System.out.println(5 > 6 ? "Saturday" : 6 >10 ? "morning" : "tech".toUpperCase().contains("CL") ? "David" : (5 * 4 + 3));
        System.out.println( 5 <= 6 ? 7 <= 7 ? 5+1 : 3 : 9 > 10 ? "morning" : "tech".toUpperCase().contains("CL") ? "David" : (5 * 4 + 3));

        String result3 = 5 > 6 ? 7 <= 7 ? "Mary" : 2 == 2 ? "Zach" : "Amhed" : "Efe";
        System.out.println(result3);
    }
}
