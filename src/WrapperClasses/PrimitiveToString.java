package WrapperClasses;

import java.util.Locale;

public class PrimitiveToString {
    public static void main(String[] args) {
        int number = 45;
        String string =""+number;
       String strNumber =  String.valueOf(number);
        System.out.println(strNumber.concat(" now is a string"));

        String str1 = Integer.toString(number);
        System.out.println(str1.charAt(str1.length()-1) >= '0' &&
                str1.charAt(str1.length()-1)<='9');
        System.out.println(str1.charAt(str1.length()-1) == 5);
        System.out.println(str1.charAt(str1.length()-1) == '5');
    }
}
