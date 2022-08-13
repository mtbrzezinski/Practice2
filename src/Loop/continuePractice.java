package Loop;

public class continuePractice {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i > 5 && i <= 7) {
                    continue;
                    // if (i < 0 ) {
                    //  break;
                }
                System.out.println("j >>" + j);
            }
        }
    }
}
