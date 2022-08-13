package Loop;

public class PerfectNumber {
    public static void main(String[] args) {
        int i = 500;
        int divisor = 1;
        int sum = 0;

        for (; divisor <= i / 2; divisor++) {
            if (i % divisor == 0) {
                sum += divisor;

            }
        }
        if (i == sum) {
            System.out.println(i + " is perfect number");

        }else{
            System.out.println(i + " is NOT a perfect number");
        }
    }
}
