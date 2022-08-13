package Primitives;

public class CompoundAssignment {
    public static void main(String[] args) {


        int carNumber = 12;

        // adding 5 more cars to my initial carNumber

         carNumber = carNumber + 5;

        System.out.println(carNumber);

        carNumber += 5; // --> 22
        System.out.println(carNumber);

        carNumber /= 2;
        System.out.println(carNumber);

        double fee = carNumber * 100; // carNumber *= 100;
        System.out.println(fee);

        fee += (carNumber * 51);
        // fee *= 1.51;
        System.out.println(fee);

        int number = 21;
        number %= 5;
        System.out.println(number);

        fee %= carNumber;
        System.out.println(fee);

        number *= (number -=8);
        System.out.println(number);

    }
}
