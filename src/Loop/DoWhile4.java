package Loop;

public class DoWhile4 {
    public static void main(String[] args) {
        String string = "Abc45L*7%#ht9";

        int index = 0;
        int letterCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        do {
            boolean letter = (string.charAt(index) >= 'A' && string.charAt(index) <= 'Z') || (string.charAt(index) >= 'a' && string.charAt(index) <= 'z');
            boolean number = (string.charAt(index) >= '0' && string.charAt(index) <= '9');
            boolean others = !letter && !number;
            if (letter) {
                letterCount++;
            }
            if (number) {

                numberCount++;
            }
            if (others) {
                otherCount++;
            }
            index++;

        } while (index < string.length());

        System.out.println("There are " + letterCount + " letters in " + string);
        System.out.println("There are " + numberCount + " numbers in " + string);
        System.out.println("There are " + otherCount + " other characters in " + string);
    }
}
