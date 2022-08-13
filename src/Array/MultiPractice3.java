package Array;

import java.util.Arrays;

public class MultiPractice3 {

    public static void main(String[] args) {
/*
Computers
Apple - 2500, Dell - 1900, HP-1800, Lenovo-1100, Acer-1600

TV's
Samsung - 2199, LG -1699, Sony-1599

Speakers
Alexa-79, Google-89, Siri-99, Logitec-69, JBL-69
 */

       String[][] brands = {{"Apple", "Dell", "HP", "Lenovo", "Acer"},{"Samsung","LG","Sony"},{"Alexa", "Google", "Siri", "Logitec", "JBL"}};
        double[][] prices = {{2500, 1900, 1800, 1100, 1600},{2199,1699,1599},{79, 89, 99, 69, 69}};
        System.out.println("The price for " + brands[0][0] + " is $" + prices[0][0]);
    for(int i = 0; i<brands.length; i++){
        for(int j = 0; j<prices[i].length; j++){
            System.out.println("The price for " + brands[i][j] + " is $" + prices[i][j]);
        }
    }
    }
}
