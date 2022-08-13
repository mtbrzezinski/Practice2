package OOP.Inheritance;

import Loop.While1;

public class Wild extends Animal {
    String name;

    @Override
    public void sleep() {

        System.out.println("Wild is sleeping");

    }
    public Animal sound(){
        System.out.println("Wild is making sound");
       // return new Animal();
        return new Wild();
    }
}
