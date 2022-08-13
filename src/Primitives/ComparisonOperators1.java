package Primitives;

public class ComparisonOperators1 {
    public static void main(String[] args) {
        // there is an event for kids
        // requirement is >> child has to be 6 years old

        int ageChild = 4;
        int requiredAge = 6;
        boolean canAttend = ageChild == requiredAge;
        System.out.println(canAttend);

        //event if the child's age is 6 or more

        boolean canAttend1 = ageChild >= requiredAge;
        System.out.println(canAttend1);

        // event for kids is their age is less than 6

        boolean ageAttend2 = ageChild < requiredAge;
        System.out.println(ageAttend2);

        // event for kids only 6 years old cannot attend

        boolean notAttend = ageChild != requiredAge;
        System.out.println(notAttend);

        int miles = 10;
        int charge1 = 5;
        int charge2 = 10;

        boolean price = charge1 < miles;
        System.out.println(price);
        boolean price1 = charge1 > miles;
        System.out.println(price1);
        boolean price2 = charge2 < miles;
        System.out.println(price2);
        boolean price3 = charge2 > miles;
        System.out.println(price3);
    }
}
