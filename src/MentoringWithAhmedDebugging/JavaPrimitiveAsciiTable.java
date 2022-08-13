package MentoringWithAhmedDebugging;

import java.util.Locale;

public class JavaPrimitiveAsciiTable {
    /*
    1) What is JAVA and what is JDK, JRE and JVM?
    2)What do you know about JAVA and JDK, JRE and JMV?

    1) Java is programming language.
    --> JDK(JAVA DEVELOPMENT KIT) --> is a software development kit required to
    DEVELOP application in Java with SPECIFIC LIBRARIES
    --> JRE(JAVA RUNTIME ENVIRONMENT) --> is a set of software tools responsible
    for EXECUTION
    --> JVM(JAVA VIRTUAL MACHINE) --> is responsible for CPNVERTING
    BYTE CODE TO BINARY CODE(0, 1)

    PRIMITIVE DATA(8 types of primitive data:)
    *Whole Numbers:
    -int
    -byte
    -short
    -long

    *DECIMAL NUMBER
    -float
    -double

    *CONDITION:
    -boolean--> TRUE/FALSE

    *CHAR
    -ASCII TABLE --> tha table that contains all the characters(numbers, letters, symbols)

    short a = 5;
    short b = 6;
    short c = a+b-2;
    sout(c)-->;? compile time error
*/
    public static void main(String[] args) {
        short a = 5;
        short b = 6;
        short c = (short) (a+b-2);
        c=(short)(a-2);
        int c1 = a+b-2;
        System.out.println(c);
        System.out.println(c1);

        char letter = 65;
        char letter2 = 'g';
        System.out.println(letter2-letter);
        System.out.println(letter);
        System.out.println(letter2);


        /*
        POSSIBLE INTERVIEW QUESTION:
        1)  Most of the technical questions are related with STRING.

        STRING: is an object.
        How can you declare it?
        String str = "ahmet loves java";
        String str1 = new String("Ahmet loves Java");

        METHODS:
        1. length()-->it counts the number of characters
        2. equals() --> it compares the value of the variables (it returns boolean condition)
        3. index of() --> it gives you the index number of character. It returns number
        4. charAt() --> it gives you the characters of the specific index. it returns character
        5. substring() --> it is a way to get a specific part of the string
        6. UpperTo90/lowerTo() --> it makes the characters upper to lower case. it returns String
        7. concat() --> it is a way to add the two or more separate String together. it returns String
        8. split() --> it is a way to split(separate) the string from specific spot. IT RETURN STRING ARRAY!
        9. replace() --> it replaces the characters/string for a specific new value
        10. contains() --> it is a way to check the specific character/characters inside the specific String(value). it returns boolean
        11. equalIgnoreCase() --> it is a way to compare the values (two values) without any sensitiviness (uper case/lower case). it returns boolean
        12. StartsWith() --> it checks the first character of the value(String) --> it returns boolean
        13. EndsWith() --> it checks the last character/characters of the value(String) --> it returns boolean
        14. trim() --> it is a way to delete the spaces from beginning and from end --> it returns String without space



         */
        String str = "Ahmet loves Java";
        String str1 = new String("Ahmet loves Java");
        String str2 = "Ahmet loves Java";
        String str3 = new String("Ahmet loves Java");
        System.out.println(str.equals(str1));
        System.out.println(str==str1);
        System.out.println(str==str2);
        System.out.println(str1==str3);
        System.out.println(str.equals(str3));

        //HOW TO APPROACH THIS QUESTION
        //KNOW THE DIFFERENCE BETWEEN .equals and ==
        //IN WHAT CONDITION YOU USE .equals and ==
        //WHENEVER YOU SEE .equals METHOD(IT ALWAYS COMPARE/CHECK THE ***VALUE*** OF THE VARIABLES
        //WHENEVER YOU SEE == IT ALWAYS CHECKS THE LOCATION OF THE VARIABLES(STRINGS) (HEAP/STUCK MEMORY)

        String example = "   Ahmet loveS JavA and jAvA likes you guys   ";
        System.out.println(example.length());
        String example2 = "   aHmEt LoVeS Java and Java Likes you guys   ";

        boolean result = example2.equals(example);



        System.out.println(result);
        boolean result2 = example2.equalsIgnoreCase(example);
        System.out.println(result2);
        System.out.println(example.indexOf("loveS"));
        System.out.println(example2.indexOf("loveS"));
        System.out.println(example.charAt(5));
        int number = example2.indexOf("v");
        String str5 = example.substring(0,number);
        System.out.println(number);
        System.out.println(str5);
        System.out.println(example.toUpperCase());
        System.out.println(example.toLowerCase());

        System.out.println(example.replace('a', '*'));
        System.out.println(example2.replace("Java", ""));
        System.out.println(example.replaceFirst("a","&"));

        //String example = "   Ahmet loVes Java and jAvA likes you guys   "
        System.out.println(example.startsWith("ahmet"));
        System.out.println(example.startsWith("Ahmet"));
        System.out.println(example2.endsWith("guys"));
        System.out.println(example2.endsWith(" "));
        System.out.println(example.trim().startsWith("Ahmet"));
        System.out.println(example2.trim().endsWith("   "));
        System.out.println(example.contains("guys"));

        //DEBUGGING: is a way to see all the executions step by step.
    }

}
