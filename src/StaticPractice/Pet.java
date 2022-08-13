package StaticPractice;

public class Pet {
    String name;
    String color;
    int age;
    static int food = 20;

    public Pet(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public Pet(){

    }

    public void run(){
        System.out.println("Pet is running");
        eat();


        }
        public static void eat(){
            food -= 1;
            System.out.println("This is the amount of food " + food);
            Pet pet6 = new Pet();
            pet6.sleep();
            //sleep(); sleep method cannot be called into static method by only it's name
            //in static eat(); method

    }
    public void sleep(){
        System.out.println("Pet is sleeping");

    }
}
