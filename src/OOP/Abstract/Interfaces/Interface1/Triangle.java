package OOP.Abstract.Interfaces.Interface1;

public class Triangle implements  Shape{
int base, height, side1, side2;
    public int getArea() {
        return ((height * base) / 2);

    }


    public int getPerimeter() {
        return base + side1 + side2;

    }
}
