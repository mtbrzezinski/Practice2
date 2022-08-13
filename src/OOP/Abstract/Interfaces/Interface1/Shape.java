package OOP.Abstract.Interfaces.Interface1;

public interface Shape {
    int getArea();
    int getPerimeter();


    default int count(){ // "default" is a key word, not access modifier
        return 5;
    }
}
