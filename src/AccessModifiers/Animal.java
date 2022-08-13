package AccessModifiers;

public class Animal {

   public String namePublic;
   protected String colorProtected;
   private int agePrivate;
    String genderDefault;


    public void sleepPublic(){
        System.out.println("Sleep is Public");
    }
    protected void sleepProtected(int hours){
        System.out.println("Sleep is Protected");
    }
    private void sleepPrivate(int hours){
        System.out.println("Sleep is Private");
    }

    void sleepDefault(int hours){
        System.out.println("Sleep is Default");
    }

    public Animal(){
        System.out.println("Public Constructor");

}
    protected Animal(String name) {
        System.out.println("Protected Constructonr");
    }
    Animal(String name, String color) {
        System.out.println("Constructor Default");
    }
    private Animal(String name, String color, String gender){
        System.out.println("Priate Constructor");
    }

    public static void main(String[] args) {
        Animal cat1 = new Animal("Fluffy", "white", "f");

    }
}
