package Object;

public class MathPractice {
    //create a method that will add two integer numbers and show the result
    //create an object to call the method here in the same class

    public void sumCalculator(int a, int b){

        int sum = a + b;
        System.out.println("The total of " + a + " + " + b + " is equal to: " + sum) ;

    }
    public double square(int s){

        return s * s * 0;
    }

    public static void main(String[] args) {

        MathPractice obj = new MathPractice();
        obj.sumCalculator(4, 5);
        obj.sumCalculator(7, 9);
        obj.sumCalculator(10, 25);
        obj.sumCalculator(1089, 8769);

        Animal bird = new Animal();
        System.out.println(bird.sum());

        MathPractice math = new MathPractice();
        double wynik = math.square(9);
        System.out.println(wynik);


    }

}


