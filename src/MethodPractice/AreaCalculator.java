package MethodPractice;

public class AreaCalculator {
    public double Area(double a, double b){
        double area = a * b;
        return area;
    }

        public double Area(double a){
            double area = a * a;
            return area;
        }
        public double Area(double a, String shape, double b){
        Area(a,b);
        Area(a);

            System.out.println("Area of: " + shape + " is " + (a*b));
            return a * b;
        }


    public static void main(String[] args) {
        AreaCalculator rectangle = new AreaCalculator();
        double areaOfRectangle = rectangle.Area(4.5,2.65);
        System.out.println(areaOfRectangle);
        AreaCalculator square = new AreaCalculator();
        double areaOfSquare = square.Area(5);
        System.out.println(areaOfSquare);

    }
}
