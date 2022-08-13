package IfStatements;

public class CurlyBrackets {
    public static void main(String[] args) {
      int number = 12;

      if(number == 12){
          System.out.println("This is first line");
          System.out.println("This is second line");

      }
        if(number != 12){
            System.out.println("This is first line 2");
            System.out.println("This is second line 2");

        }
        if (number == 12)
            System.out.println("this is first line -- no curly braces");
            System.out.println("this is second line -- no curly braces");
        if (number == 42)
            System.out.println("this is first line -- no curly braces 2");
        System.out.println("this is second line -- no curly braces 2");



    }
}
