package MentoringWithAhmed.Constructor;

public class Baby2 {

        String name;
        String gender;
        double height;
        double weight;
        String eyecolor;
        int brainCapacity;

    public Baby2(String name) {
        this.name = name;
    }

    public Baby2(String gender, String eyecolor) {
        this.gender = gender;
        this.eyecolor = eyecolor;
    }

    public Baby2(double height, double weight, String eyecolor) {
        this("Ahmet");
        this.height = height;
        this.weight = weight;
        this.eyecolor = eyecolor;
        System.out.println("you called 3 arguments contructor");
    }

    public Baby2(String name, String gender, double height, double weight, String eyecolor, int brainCapacity) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.eyecolor = eyecolor;
        this.brainCapacity = brainCapacity;
    }
}
