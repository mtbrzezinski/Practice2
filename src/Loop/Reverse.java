package Loop;

public class Reverse {
    public static void main(String[] args) {
        String str = "Selenium";
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse = reverse + str.charAt(i);

        }
        System.out.println("Reversed string " + reverse.toUpperCase());
    }
}
