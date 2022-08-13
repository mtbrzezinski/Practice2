package Object;

public class AnimalTest2 {
    //create and object and initialize energy of the object and
    //run the object and recharge the object
    //and show all information of the object
    public static void main(String[] args) {
        Animal fish = new Animal();
        fish.name = "Nemo";
        fish.energy = 50;
        int e = fish.run();

        fish.sleep();

        fish.numOfLegs = 0;
        fish.age = 1;
        fish.color = "gold";
        int ed = fish.energy;
        fish.printInfo();

        if(e==ed){
            System.out.println("Bird is happy");
        }else{
            System.out.println("Bird is tired");
        }





    }
}
