package MentoringWithAhmedDebugging;

public class Human {
    //instance variables -- belongs to the class
    int age = 30;
    String name = "Ahmet";
    double height = 6.2;
    String eyeColor = "brown";
    double amountOfMuscles = 45.5;
    double theWeightOfSkeleton = 53;
    String gender = "male";

    public Human(int age, String name, double height, String eyeColor, double amountOfMuscles, double theWeightOfSkeleton, String gender) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.eyeColor = eyeColor;
        this.amountOfMuscles = amountOfMuscles;
        this.theWeightOfSkeleton = theWeightOfSkeleton;
        this.gender = gender;
    }

    public void speak(String name){
        System.out.println(name);
        System.out.println(this.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printAge(){
        System.out.println("My age is " + this.getAge());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector is working");
    }

    public static void main(String[] args) {
        Human male = new Human(30, "Ahmet", 6.2, "brown", 55, 12,"male");
        Human female = new Human(25, "Leila", 5.5, "blue", 30, 10,"female");
        Human kids = new Human(2, "Ahle", 3, "green", 40, 11,"male");
        male.speak("Mehmet");
        male.printAge();
        male=kids;
        System.out.println(male.age);
        kids=null;
        female=kids;
        System.gc();

    }


}
