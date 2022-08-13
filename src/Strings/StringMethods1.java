package Strings;

public class StringMethods1 {
    public static void main(String[] args) {
        String name = "Jennifer";
        name += " Lopez";
        System.out.println(name);

       name = name.concat(" is not here");
        System.out.println(name.concat("*****"));
        System.out.println(name);

        int number = 6;
        ++number;
        System.out.println(number);

        int count = name.length();
        System.out.println("There are " +count + " characters in the string name");
        String animal = "Monkey";
        System.out.println(animal.length());
        System.out.println(animal.charAt(2));
        System.out.println(animal.charAt(5));

        String sentence = "What the hell is going on in this world?";
        System.out.println(sentence.charAt(sentence.length()-1));

        System.out.println(animal.indexOf('o'));
        System.out.println(animal.indexOf('x'));
        System.out.println(animal.indexOf("nk"));
    }
}
