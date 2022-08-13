package ArrayListPractice;

public class Flower {
    String name;
    String color;
    double price;

    public Flower(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
    @Override
    public String toString(){
        return "name: " + name + "color: " + color + "price" + price;
    }
}
