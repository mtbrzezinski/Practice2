package Object;

public class cAT {
    String name;
    String color;
    int age;
    int foodAmount;
    /*
    create a run method
    that will take one parameter for destination
    this method will reduce the food amount by 1lbs
    everytime you call it
    print -> "<name> is running to <destination>"
     */

    public void run(String destination) {



        foodAmount -= 1;
        System.out.println(name + "is running to " + destination + " food amount is " + foodAmount);


    }
    public void setColor(String newColor){
        color = newColor;
    }
    public String getColor(String colors){
        return colors;
    }

    public static void main(String[] args) {
        cAT garfield = new cAT();
        garfield.name = "Garfield";
        garfield.foodAmount = 10;

        garfield.run("house");
        garfield.color = "black";
        System.out.println(garfield.color);
        garfield.setColor("red");
        System.out.println(garfield.color);

        System.out.println(garfield.getColor("green"));

    }
}
