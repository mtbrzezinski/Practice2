package IfStatements;

public class IfPractice1 {
    public static void main(String[] args) {
        System.out.println("I am learning if statement today");

            int num1 = 5;
            int num2 =5;
            if ( num1 == num2 ) {
                System.out.println("I am happy!");
            }
        System.out.println("This is after if block");

            int apple = 20, orange = 10;
            double apple$ = .5, orange$ = .2;

            if(apple == orange || 2>1){
                double totalPrice = apple * apple$ + orange *orange$;
                System.out.println("This is total payment: " + totalPrice);
            }

    }
}
