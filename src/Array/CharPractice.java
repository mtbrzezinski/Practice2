package Array;

public class CharPractice {
    public static void main(String[] args) {
        char[] chars = {'l', 'K', '7', '?', '2', 'a'};
        for (char numbers : chars) {
            if (numbers >= '0' && numbers <= '9') {
                System.out.println(numbers);
            }
        }
       for (char numbers : chars) {
           if (Character.isDigit(numbers)) {
               System.out.println(numbers);


            }
        }
        for (char numbers : chars) {
            if (Character.isAlphabetic(numbers)) {
                System.out.println(numbers);


            }


            } for (char question : chars) {
            if (!Character.isAlphabetic(question) && !Character.isDigit(question)) {
                System.out.println(question);


            }
        }
        }
    }
