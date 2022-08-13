package Loop;

public class MultipleTermsForLoop {
    public static void main(String[] args) {

        int i = 0, c = 5, k = 15;
        for (i = 1, c = 6, k = 11; i < c && k > c; i++, c++, k--) {
            System.out.println("i>> " + i);
            System.out.println("c>> " + c);
            System.out.println("k>> " + k);
        }
        char ch = 'm';
        int o = 0;

        for (o = 10, ch = 'a' ; ch < 'h' || o < 2 ; ch++, o-- ){
            System.out.println("Break time is coming in" + o + "minutes");
        }
        for (char cha = 'a'; cha <= 'z'; cha++){
            System.out.println(cha);
        }
    }
}
