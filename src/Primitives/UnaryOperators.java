package Primitives;

public class UnaryOperators {
    public static void main(String[] args) {
        int studentNumber = 25;

        System.out.println(studentNumber);

        studentNumber++;
        System.out.println(studentNumber);
        System.out.println(studentNumber++);
        System.out.println(studentNumber);

        ++studentNumber;
        System.out.println(studentNumber);
        System.out.println(++studentNumber);
        System.out.println(studentNumber);

        int a = 5, i = a++, k = --i + ++a;
        System.out.println("Value of a >>" +a);
        System.out.println("Value of i >>" +i);
        System.out.println("Value of k >>" +k);

        System.out.println(--k);
        System.out.println(k--);
        System.out.println(k);

        int flower = 12;
        // increment ++, decrement --
        // preincrement, predecrement
        //postincrement, postdecrement

        ++flower;
        System.out.println(flower);
        flower++;
        System.out.println(flower);
        --flower;
        System.out.println(flower);
        flower--;
        System.out.println(flower);
        System.out.println(flower++);
        System.out.println(++flower);


        //=========
        int f = flower++;
        System.out.println("f is.." + f);
        System.out.println(++f);

        int m = f + ++f;
        System.out.println(m);
        System.out.println(m + ++m);
        int mr = (m + ++m);
        System.out.println(mr);




    }
}
