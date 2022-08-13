package ArrayListPractice;

public class Computer {
    String make;
    String model;
    double price;
    double screenSize;

    public Computer(String make, String model, double price, double screenSize) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
    }
    public String toString(){
        return "make: " + make + " model: " + model + " price: $" + price + " screen size: " + screenSize;
    }
}
