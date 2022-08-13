package Map;

import java.util.Random;

public class Employee {
    String name;
    String city;
    int age;
    int id;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = generateId();


    }
    public int generateId(){
        int x = (int)(Math.random()*1000000);
        return x;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
