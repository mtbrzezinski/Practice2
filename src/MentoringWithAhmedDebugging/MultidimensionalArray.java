package MentoringWithAhmedDebugging;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        String[] month = {"jan", "feb", "mar", "apr"};
        String[] cost = {"$23", "$45", "$32", "$18"};
        System.out.println(Arrays.toString(month));


        String[][] allTogether = new String[2][4];
        System.out.println(Arrays.deepToString(allTogether));
        for(int i = 0; i<month.length; i++){
            allTogether[0][i] = month[i];
            allTogether[1][i] = cost[i];
            System.out.println(allTogether[0][i] + " revenue cost is " + allTogether[1][i]);






        }
    }
}
