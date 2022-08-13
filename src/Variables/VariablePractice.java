package Variables;

public class VariablePractice {
    public static void main(String[] args) {
        //declaring variable initializing variable
        int yellowApples = 4;
        int greenApples = 5;
        int oranges = 1;
        System.out.println(yellowApples+greenApples+oranges);

        int fruits = yellowApples+greenApples+oranges;
        System.out.println("total fruits" + fruits);

        yellowApples = 3;
        System.out.println(yellowApples);
        /* yellow apples 2 dollars ea
        green apples 3 dollars ea
        oranges 5 dollars ea
         */
        int yellowApple$ = 2;
        int greenApple$ = 3;
        int orange$ = 5;

        int totalCost = yellowApples * yellowApple$ + greenApples * greenApple$ + oranges * orange$;

        System.out.println("Total Cost $" + totalCost);
    }
}
