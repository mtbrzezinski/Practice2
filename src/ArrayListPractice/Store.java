package ArrayListPractice;

import java.sql.Array;
import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        Computer c1 = new Computer("apple", "macPro",  2200, 16);
        Computer c2 = new Computer("Dell", "D5", 1800, 13);                Computer c3 = new Computer("HP", "Envy", 1300, 15);
Computer c4 = new Computer("Apple", "mcAir", 1100, 11);

        ArrayList<Object> list = new ArrayList();
        ArrayList<Computer> devices = new ArrayList();
        devices.add(c1);
        devices.add(c2);
        devices.add(c3);
        devices.add(c4);

        double total = 0;
        for(Computer computer: devices){
            total += computer.price;
        }
        System.out.println("Total amount of the price for computers is equal to: " + total);

        Flower f1 = new Flower("DAISY", "white", 2.50);

        list.add(c1);
        list.add(f1);
        ArrayList<Flower> flowers = new ArrayList();
        flowers.add(f1);

        System.out.println(flowers);
        System.out.println("*****************");
        System.out.println();
        System.out.println(devices);


    }

}
