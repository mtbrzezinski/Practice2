package MentoringWithAhmedDebugging;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    /*
    1 -  what is Wrapper class?
    Wrapper Class:
    it's a way(process) to convert data into different forms
    *Primitive to --> OBJECT
    *Object to - PRIMITIVE

    2 - How many type of wrapper class you know?
    I know two types of wrapper class
    FIRST TYPE: AUTOBOXING --> primitive to object
    SECOND TYPE: UNBOXING --> object to primitive

   3 - Where do you use wrapper class in your project?
   I use wrapper class mostly in Collections
     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int age = 30;//primitive data
        //numbers.add(age);//AUTOBOXING
        //numbers.get(0).equals();  -> it is a proof that your primitive data is converted to object form

        String example = String.valueOf(age);//autoboxing because it accepts primitive and returns object inside string object
String testNumber = "12";
        int test = Integer.parseInt(testNumber);//unobixng - accepts object and returns primitives






    }
}
