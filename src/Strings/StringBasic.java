package Strings;

public class StringBasic {
    public static void main(String[] args) {

        String text = "Techtorial";
        System.out.println(text);
        System.out.println(text + 11);
        System.out.println(text + 11 + 8);
        System.out.println(3 + 2 + text);
        System.out.println(3 - 2 + text);
        System.out.println(text + (3-2));
        System.out.println(text + 3 * 2);
        System.out.println(text + "Academy");

        String word = new String( "Academy");
        System.out.println(word);
        System.out.println(text + word);

        text = text + "*******";
        System.out.println(text);
        System.out.println(word);

        System.out.println(word + true);
        String dayNumber = "2"+3;
        dayNumber += "is tomorrow";
        System.out.println(dayNumber);
        dayNumber += "4";
        System.out.println(dayNumber);

        String something = "";
        System.out.println(something);
        System.out.println("========");
        dayNumber = "today is monday";
        System.out.println(dayNumber);
    }
}
