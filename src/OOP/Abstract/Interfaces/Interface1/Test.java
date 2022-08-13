package OOP.Abstract.Interfaces.Interface1;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        triangle.base = 2;
        triangle.height = 5;
        triangle.side1 = 8;
        triangle.side2 = 3;
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        Shape shape1 = new Triangle();
        Shape shape2 = new Rectangle();

    }
}
