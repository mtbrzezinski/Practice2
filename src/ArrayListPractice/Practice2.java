package ArrayListPractice;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {


        ArrayList<String> fruit = new ArrayList();
        fruit.add("watermelon");
        fruit.add("apple");
        fruit.add("Strawberry");
        fruit.add("Lemon");
        fruit.add("blueberry");
        for (int i = fruit.size() - 1; i >= 0; i--) {
            fruit.get(i);
            System.out.println(fruit.get(i));

        }
        System.out.println(fruit);
        System.out.println("************************");
                Practice2 practice2 = new Practice2();
                practice2.printFruit(fruit);
    }

    public void printFruit(ArrayList<String> fruit) {
            for (String fruits : fruit) {
                if (fruits.length() <= 5) {
                    System.out.println(fruits);

            }
        }
       

    }
}
