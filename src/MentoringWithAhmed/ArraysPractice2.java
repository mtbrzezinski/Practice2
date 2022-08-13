package MentoringWithAhmed;

public class ArraysPractice2 {
    public static void main(String[] args) {
        int[] numbers = {100, 300, 200, 450, 350};
        int smallest = numbers[0];
        int largest = numbers[1];

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            } else if (number > largest) {
                largest = number;
            }
        }
        System.out.println("The smallest number is: " + smallest + " The largest number is: " + largest);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            } else if (numbers[i] > largest) {
                largest = numbers[i];
            }

        } System.out.println("The smallest number is: " + smallest + " The largest number is: " + largest);
    }
}
