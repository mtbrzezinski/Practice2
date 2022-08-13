package WrapperClasses;

public class StringToWrapper {
    public static void main(String[] args) {
        String city = "5";
        System.out.println(city + 2);
        System.out.println(Integer.valueOf(city));
Integer cityNumber = Integer.valueOf(city);
        System.out.println(cityNumber + 2);

       int object = Integer.parseInt(city);
       int object1 = Integer.valueOf(city);


       String condition = "false";
       Boolean bl = Boolean.valueOf(condition);
        System.out.println(bl);

        boolean bl2 = Boolean.valueOf(condition);
        System.out.println("*********************");
        String test = "Today is April 2";
String[] test1 = test.split(" ");
        System.out.println(Integer.parseInt(test1[test1.length-1]) + 5);



    }
    public Integer sumInt(String test){
        String[] test1 = test.split(" ");
        System.out.println(Integer.parseInt(test1[test1.length-1]) + 5);
        return Integer.parseInt(test1[test1.length-1]) + 5;
    }
}
