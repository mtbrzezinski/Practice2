package OOP.Final;

public class Shirt {

    double price;
    final String COLOR = "blue";
    String size;

    public Shirt(double price,  String size){
        this.price = price;
        // this.COLOR = COLOR; will not compile
        this.size = size;
    }
   final public  boolean isCotton(){
        System.out.println("Shirt is cotton");
        return true;
    }
    final public  boolean isCotton(int percent){
        System.out.println("Shirt is cotton");
        return true;
    }
    public void discount(double percent){
        System.out.println("You are getting: " + percent + "discount");
    }

}
