package Strings;

public class sUBSTRING {
    public static void main(String[] args) {
        String item = "Flowers are beautiful";
        String part1 = item.substring(3);
        String part2 = item.substring(2,4);
        System.out.println(part1);
        System.out.println(part2);
        System.out.println(item.substring(3));
        System.out.println(item.substring(2,4));
        String partt2 = item.substring(item.indexOf('w'), item.indexOf(('t')+1));
        System.out.println(partt2);
        String part3 = item.substring(item. indexOf('w'), item.indexOf('b')+2);
        System.out.println(part3);
        System.out.println(item.substring(2,2));
        System.out.println(item.substring(5,21));
        System.out.println(item.replace('w', '#'));
        item = "Java";
        System.out.println(item.replace("a","****"));
        item = item.replace("Java", "Selenium!!!");
        System.out.println(item);
        item = item.replace("Selenium!!!", "");
        System.out.println(item);
        System.out.println("Too many replacement");




String school = " Academy      ";
        System.out.println(school);
        school = school.trim();
        System.out.println(school);
        school = "       Techtorial     Academy        ";
        System.out.println(school);
        school = school.trim();
        System.out.println(school);
    }
}
