package ArrayListPractice;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList();
        fruit.add("watermelon");
        fruit.add("apple");
        fruit.add("Strawberry");
        fruit.add("Lemon");
        fruit.add("blueberry");

        fruit.remove("apple");
        fruit.remove(2);
        System.out.println(fruit);

        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("coke");
        drinks.add("tea");
        drinks.add("water");

        fruit.addAll(drinks);
        System.out.println(fruit);
        fruit.removeAll(drinks);
        System.out.println(fruit);
        fruit.removeAll(fruit);
        System.out.println(fruit);
        ArrayList<Integer> zipCodes = new ArrayList<>();
        zipCodes.add(111);
        zipCodes.add(222);

        zipCodes.clear();
        System.out.println(zipCodes);

        String string = "Java";
        string = string.replace("a", "i");
        System.out.println(string);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        numbers.add(55);
        numbers.add(66);
        System.out.println(numbers);

        numbers.set(3,300);
        System.out.println(numbers);

       boolean b1 = numbers.isEmpty();
        System.out.println(b1);
        System.out.println(fruit.isEmpty());
        System.out.println(drinks.isEmpty());

        System.out.println(drinks.contains("water"));
        System.out.println(drinks.contains("WATER"));
        System.out.println(drinks.get(2).equalsIgnoreCase("WATER"));
        System.out.println(drinks.indexOf("tea"));

        Object name = drinks.clone();
        System.out.println(name);
        drinks.clone();






    }

}
