package Loop;

public class While2 {
    public static void main(String[] args) {
        int age = 21;
        while (age <= 30){
            System.out.println("My age is " + age);
            age++;
        }
        int number = 12;
        int sum = 0;
        while (number < 19){
            sum = sum + number;
            number++;


        }
        System.out.println("Total is " + sum);
    }
}
