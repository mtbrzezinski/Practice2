package Loop;

public class ForNested {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++){
            System.out.println("i >> " + i);
            for (int k = 0; k < 3; k++){

                System.out.println("k>> " + k);
            }
        }
    }
}
