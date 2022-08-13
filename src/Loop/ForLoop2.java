package Loop;

public class ForLoop2 {
    public static void main(String[] args) {
        String str = "Today is the best day";
        str = str.replace(" ", "");

        for ( int i = 0; i < str.length() ; i++ ) {
            System.out.println(str.charAt(i));
        }
        for (int i = 0 ; i < str.length() ;  i++ ) {
            if (str.charAt(i) == 'e') {
                System.out.println(str.charAt(i));
            }
        }
            int counter = 0;
        for (int index = 0 ; index < str.length() ;  index++ ){
            if(str.charAt(index) == 't' || str.charAt(index) == 'T'){
                counter++;
        }}
        System.out.println("There are " + counter + " t's or T's in this sentence.");
    }
}

