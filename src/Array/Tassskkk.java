package Array;

public class Tassskkk {
    public static void main(String[] args) {
        int[] numbers = {12, 19, 5, 15, 18, 11, 21, 9, 7, 4, 13};

        for(int i = 0; i< numbers.length; i++){
           for(int k = i+1; k< numbers.length; k++){
               if(numbers[i] + numbers[k] == 30){
                   System.out.println(numbers[i] + " and " + numbers[k] + " makes 30");
               }
           }


        }
    }
}
