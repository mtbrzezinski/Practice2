package StaticPractice;

public class TestPet {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Leo", "Orange", 5);
        pet1.run();
        String str = pet1.color;
        System.out.println(str);

        Pet pet2 = new Pet("Leo", "Orange", 5);
        System.out.println(pet2.color);

        Pet pet3 = new Pet();
        System.out.println(pet3.color);
        pet3.color = "brown";
        Pet pet4 = new Pet();
        System.out.println(pet4.color);
        System.out.println(pet1.food);
        pet1.eat();
        pet1.eat();
        System.out.println(pet1.food);

        pet2.eat();
        System.out.println("Pet2 food " + pet2.food);

        Pet.eat();
        Pet.food = 44;
    }
}
