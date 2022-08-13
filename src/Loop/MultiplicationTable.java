package Loop;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            for (int multi = 1; multi < 11; multi++) {
                System.out.print(i + " * " + multi + " = ");
                int result = multi * i;
                System.out.println(result);
            }

        }
    }
}
