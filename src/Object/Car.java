package Object;

public class Car {
    String brand;

    static void move(){
        System.out.println("Car is moving");

    }

    Car(String brand) {
        this.brand = brand;
    }

@Override
    protected void finalize(){
        System.out.println(brand + " is going to garbage");
    }

    @Override
    public String toString() {
        return brand + " is the best car" ;
    }

    public static void main(String[] args) {

        move();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Lexus");
        Car car3 = new Car("Tesla");
        Car car4 = new Car("Toyota");
        Car car5 = new Car("Mercedes");
        car3 = null;
       car5 = car2;
       car3 = null;
        System.out.println(car5);



        System.gc();

    }
}
