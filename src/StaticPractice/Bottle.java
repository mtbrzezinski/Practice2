package StaticPractice;

public class Bottle {
    String color;
    double size;
    boolean isEmpty;
    double liquidAmount;

    public Bottle(String color, double size, boolean isEmpty, double liquidAmount) {
        this.color = color;
        this.size = size;
        this.isEmpty = isEmpty;
        this.liquidAmount = liquidAmount;
    }

    public Bottle(String color) {
        this.color = color;
    }

    public void drink(double drinkAmount) {
        liquidAmount -= drinkAmount;
        System.out.println("Liquid amount in the bottle is now " + liquidAmount);
        if (liquidAmount == 0) {
            isEmpty = true;
        }

    }

    @Override
    protected void finalize(){
        System.out.println("One object is garbage collected");
    }

    @Override
    public String toString() {
        System.out.println("This is overriding toString method");
        return "";
    }

    public static void main(String[] args) {
        Bottle b1 = new Bottle("red", 8, false, 8);
        Bottle b2 = new Bottle("red", 8, false, 8);
        Bottle b3 = new Bottle("red", 8, false, 8);
        Bottle b4 = new Bottle("red", 8, false, 8);
        Bottle b5 = new Bottle("red", 8, false, 8);
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
        Bottle b6 = new Bottle("White");
        Bottle b7 = new Bottle("White");

        System.out.println(b6 == b7);
        System.out.println(b6.equals(b7));

        b1 = null;
        b3 = b1;
       // System.out.println(b1.color);
        System.out.println(b5);
        System.out.println(b4);

        System.gc();

    }
}
