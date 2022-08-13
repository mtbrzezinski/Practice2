package OOP.Inheritance;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "King";
        System.out.println(animal);

        Domestic domestic = new Domestic();

        System.out.println(domestic.name);

        domestic.name = "Domestic";
        System.out.println(domestic.name);
        Cat cat = new Cat();
        System.out.println("Cat name is: " + cat.name);

        Wild wild = new Wild();
        System.out.println(wild.name);
        wild.name = "Wild2";
        System.out.println(wild.name);

        Wild wild1 = new Wild();
        System.out.println(wild1.name);

        cat.name = "Ginger";
        Cat cat1 = new Cat();
        System.out.println("Cat name is: " + cat.name);
        System.out.println("Cat1 name is: " + cat1.name);


        System.out.println(cat.eyeColor);
        System.out.println(domestic.eyeColor);

        animal.sleep();

        domestic.sleep();

        cat.sleep();
        wild.sleep();
        cat.eat();
        wild.eat();

        cat.eat(3);

        cat.eat("restaurant");

        Domestic d1 = cat.sound();
        Animal a1 = cat.sound();
        Domestic d2 = domestic.sound();
        Animal a2 = domestic.sound();
        // Cat c2 = domestic.sound();
        Cat c2 = (Cat)domestic.sound();// casting to Cat object
        System.out.println(c2);

    }

}
