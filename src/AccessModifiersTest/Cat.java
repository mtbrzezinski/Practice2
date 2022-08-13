package AccessModifiersTest;

import AccessModifiers.Animal;

import java.awt.*;
import java.util.ArrayList;

public class Cat extends Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sleepPublic();


        Cat cat = new Cat();
        cat.colorProtected = "orange";


        Animal cat1 = new Cat();
        cat1.sleepPublic();


    }
}
