package StaticPractice;

import java.util.Random;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void study(){
        System.out.println(name + " studies " + generateHour() + " hours");
    }
    public void sleep(){

        System.out.println(name + " sleeps " + generateHour() + " hours." );
    }
    public static int generateHour(){
       Random random = new Random();
       return random.nextInt(10);

    }

    public static void main(String[] args) {
        Student student1 = new Student("Sam", 23);

        student1.sleep();
        student1.study();
        System.out.println(student1.generateHour());

    }

}

