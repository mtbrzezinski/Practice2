package MentoringWithAhmed;

import java.util.Scanner;

public class FirstAndLastLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a 3 word sentence below:");
        String sentence = scan.nextLine();


        String firstLetters = "";
        String lastLetters = "";
        firstLetters+=sentence.charAt(0);
        lastLetters+=sentence.charAt(sentence.length()-1);

       String firstLetterIndex = "";
        String lastLettersIndex = "";
        int firstLetterSum = 0;
        int LastLetterSum = 0;

       firstLetterIndex+=sentence.indexOf(sentence.charAt(0))+" ";

        for(int i = 0; i<sentence.length(); i++){
            if(sentence.charAt(i)==' '){
                firstLetters+=sentence.charAt(i+1);
                lastLetters+=sentence.charAt(i-1);
                firstLetterIndex+=(i+1)+" ";
                lastLettersIndex+=(i-1)+" ";
                firstLetterSum+=(i+1);
                LastLetterSum+=(i-1);


            }
        }
        lastLetters+=sentence.charAt(sentence.length()-1);
        lastLettersIndex+=sentence.length()-1;
        LastLetterSum+=sentence.length()-1;
        System.out.println(firstLetters);
        System.out.println(lastLetters);
        System.out.println(firstLetterIndex);
        System.out.println(lastLettersIndex);
        System.out.println(firstLetterSum);
        System.out.println(LastLetterSum);

    }
}
