package OOP.Inheritance1;

public class Rose extends Flower{

        String color;
     public Rose() {
        super(3, "yellow", 1.99, 10);
         System.out.println("Rose constructor with NO arguments");
    }
    public Rose(double price){
         this.price = price;
    }
    public Rose(String color){
         this.color = color;
    }

    public static void main(String[] args) {
        Flower flower = new Flower(4, "red", 2.54, 50);
        System.out.println(flower.color);
       Rose rose = new Rose();
        System.out.println(rose.color);

        Rose rose1 = new Rose(5.99);
        System.out.println(rose1.color);

        Rose rose2 = new Rose("white");
        System.out.println(rose2.color);
        rose2.color = "pink";
        System.out.println(rose2.color);

        rose.color = "purple";
        System.out.println(rose.color);

        System.out.println(rose.price );
        System.out.println(flower.price);
     }
}
