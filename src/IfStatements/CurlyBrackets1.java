package IfStatements;

public class CurlyBrackets1 {
    public static void main(String[] args) {
        int x = 5, y = 10;

        if(x>y)
            ++y;
        ++x;
        y = x+y;
        System.out.println("this is value of y: " + y);

        if(y >= x)
            ++y; ++x; y = x+y;
        System.out.println("this is the value of y: " + y);
    }
}
