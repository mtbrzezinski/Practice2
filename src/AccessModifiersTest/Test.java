package AccessModifiersTest;

import AccessModifiers.Animal;

public class Test {
    public static void main(String[] args) {
        Animal bird = new Animal();
        bird.namePublic = "Tweety";
        bird.sleepPublic();

    }

}
