package Object;

public class Animal {
    String color = "white";
    int numOfLegs;
    int age;
    String name;
    int energy;

public int run(){
energy-=10;
    System.out.println(name + " is running, energy is: " + energy);
    return energy;
}
public void sleep(){
    energy = 100;
        System.out.println(name + " is sleeping,energy is: " + energy);

}
    public int sum(){
    int x = 5;
    int y = 3;
    int total = x + y;
       // System.out.println(total);
    return total;

    }
    public void printInfo(){
        System.out.println("Info of my animal: " + name + ", " + color + ", " + numOfLegs + ", " + age + ", energy: " + energy );
    }

}
