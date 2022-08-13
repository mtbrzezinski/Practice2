package MentoringWithAhmed;

import java.lang.reflect.Array;
import java.util.*;


public class SuperMarket {

    public static void main(String[] args) {
        SuperMarket superMarket = new SuperMarket();
        superMarket.printDairy();
        superMarket.printNames();
        superMarket.printChips();
        superMarket.printCookies();
        superMarket.printAllNameAndPrice();

    }


    String[] dairy = {"Milk", "Cheese", "Butter", "Yogurt", "Cream", "Casein"};
    String[] chips = {"Lays", "Fritos", "Cheetos", "Doritos", "Ruffles", "Pringles"};
    String[] cookies = {"Nabisco", "Oreo", "Nestle", "Amos", "SnackWell", "MaryLand"};

    double[] dairyPrice = {2.99, 1.99, 3.99, 2.49, 0.99, 1.69};
    double[] chipsPrice = {3.99, 2.99, 4.99, 3.49, 1.99, 2.69};
    double[] cookiesPrice = {4.99, 3.99, 5.99, 4.49, 2.99, 3.69};

    List<String> allDairyNames = new ArrayList<>();

    public void printDairy() {
        for (String dairyProduct : dairy) {
            allDairyNames.add(dairyProduct);
        }
        System.out.println(allDairyNames);
    }

    //shorter way
    public void printNames() {
        ArrayList<String> alldairyNames2 = new ArrayList<>(Arrays.asList(dairy));
        System.out.println(alldairyNames2);
    }

    List<String> allChipsNames = new ArrayList<>();

    public void printChips() {
        for (String chipsProduct : chips) {
            allChipsNames.add(chipsProduct);

        }
        System.out.println(allChipsNames);
    }
    List<String> allCookiesNames = new ArrayList<>();
    public void printCookies(){
        for(String cookie : cookies){
            allCookiesNames.add(cookie);
        }
        System.out.println(allCookiesNames);
    }
    Map<String, Double> dairyNameAndPrice = new Hashtable<>();
    public void printAllNameAndPrice(){
        for(int i = 0; i<dairy.length; i++){
            dairyNameAndPrice.put(dairy[i], dairyPrice[i]);
            dairyNameAndPrice.put(chips[i], chipsPrice[i]);
            dairyNameAndPrice.put(cookies[i], cookiesPrice[i]);
        }
        System.out.println(dairyNameAndPrice);
    }


}
