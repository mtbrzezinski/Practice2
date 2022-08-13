package Primitives;
import Object.Animal;

public class AreaOfTriangle {
    public static void main(String[] args) {
        /* find the area of a triangle if:
        base of the triangle is 6.8
        and height of the triangle is 4.9
         */
        float base = 6.8f;
        float height = 4.9f;
        float formula = 0.5f;
        float area = base * height * formula;
        System.out.println("The area of the triangle is:" + area);
        System.out.flush();
        Animal bird = new Animal();
        bird.sleep();

    }
}
