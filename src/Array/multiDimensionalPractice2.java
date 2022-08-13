package Array;

import java.util.Arrays;

public class multiDimensionalPractice2 {
    public static void main(String[] args) {

        String[] ny = {"New York", "Brooklyn"};
        String[][] citiesOfStates = {{"chicago", "springfield", "rosemont", "rosemont", "naperville"},{"miami", "tampa" }, {"houston", "austin", "dallas"}, ny };

        for(int in = 0; in < citiesOfStates.length; in++){
            for (int ab = 0; ab < citiesOfStates[in].length; ab++ ){
                System.out.println(">>" + citiesOfStates[in][ab]);
            }

        }
        System.out.println("FOR EACH LOOP");
        for(String[] cities : citiesOfStates){
            for(String city : cities){
                System.out.println(city);
            }

        }
        String[][][] letters = {{ {"A", "B"},{"T"},{"X","Y","Z"},{"R"}}, {{"iii"}}, {}};
        System.out.println(letters[0][0][0]);
        System.out.println(Arrays.deepToString(letters));
        letters[0][1] = new String[]{"text", "java", "selenium","tired", "confusing", "is easy" };
        System.out.println(Arrays.deepToString(letters));


    }
}
