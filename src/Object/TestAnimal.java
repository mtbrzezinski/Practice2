package Object;

public class TestAnimal {
    public static void main(String[] args) {
        Animal cat = new Animal();

        System.out.println(cat.name);

        cat.name = "Leo";
        System.out.println(cat.name);

        cat.age = 2;
        cat.numOfLegs = 4;

        System.out.println(cat.color);
        cat.color = "orange";

        System.out.println(cat.color);
        Animal cat1 = new Animal();
        System.out.println(cat1.color);
        Animal dog = new Animal();
        dog.color = "black";
        dog.numOfLegs = 4;
        dog.age = 8;
        dog.name = "Buddy";
        System.out.println("Info of my dog: "+dog.color+" "+dog.name+" "+dog.age+" "+dog.numOfLegs);


        cat.run();
        cat1.run();
dog.run();

cat1.sleep();
dog.sleep();
        System.out.println(cat.energy);
        cat.sleep();
        cat.run();
       dog.run();
       dog.run();
       dog.run();
       dog.sleep();
   int result = cat.sum();
        System.out.println(cat.sum()*10);
        System.out.println(result);
        System.out.println(cat1.run());
    Animal elephant = new Animal();
    elephant.printInfo();
    elephant.color = "grey";
    elephant.name = "Dumbo";
    elephant.age = 12;
    elephant.numOfLegs = 4;
    elephant.energy = 200;
        elephant.printInfo();
    }




}
