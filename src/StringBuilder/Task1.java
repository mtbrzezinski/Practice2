package StringBuilder;

public class Task1 {
    public static StringBuilder deleteDash(String string) {
        StringBuilder builder = new StringBuilder(string);
        for (int i = 0; i < builder.length(); i++) {

            if (builder.charAt(i) == '-') {
                builder.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(builder);
        return new StringBuilder("x");
    }

    public static void main(String[] args) {

        String str = "-In-t-e---r-v-iew";
        deleteDash(str);

        StringBuilder bld = new StringBuilder("ASEF$T_4_LI_9_^GV_1");
        sumofdigits(bld);
    }

    public static StringBuilder sumofdigits(StringBuilder builder1) {
        StringBuilder build = new StringBuilder(builder1);
        for (int i = 0; i < build.length(); i++) {

            if (build.charAt(i) >= '0' && build.charAt(i) <= '9') {
                i += i;


            }System.out.println(i);

        }
        return new StringBuilder("x");
    }



}
