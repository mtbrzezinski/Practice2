package ArrayListPractice;

import java.util.ArrayList;

public class Phone {
    String brand;
    double price;


    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;


    }
@Override
public String toString(){
        return "Brand: " + brand + " price: " + price;
}
    public static void main(String[] args) {
        Phone phone = new Phone("iPhone", 999);
        System.out.println(phone);

        Phone phone1 = new Phone("Samsung", 999);
        System.out.println(phone1);


    }
}
