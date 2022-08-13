package Array;

public class Task56 {
    public static void main(String[] args) {
        String[] flowers = {"rose", "lily", "sunflowers", "daisy"};

        for(String flower : flowers){
            String reverse = "";
            for(int i = flower.length()-1; i>=0; i-- ){
                reverse += flower.charAt(i);


            }
            System.out.println(reverse);
        }
    }
}
