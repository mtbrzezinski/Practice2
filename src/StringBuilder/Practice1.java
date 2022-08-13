package StringBuilder;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(" Java");
        System.out.println(builder);
        builder.append(" and Selenium");
        System.out.println(builder);
        String str = " Test";
        System.out.println(str);

        str.concat(" is a word");
        System.out.println(str);


        builder.append(str);
        builder = builder.append(builder);
        System.out.println(builder);

        String string = (builder.append(builder).toString());
        System.out.println(string);

        builder = new StringBuilder("Testing ");
        System.out.println(builder);
        builder.append(true);
        System.out.println(builder);

        builder.append(3.4);
        builder.append("+++ ++").append(77777).append(false).append("a");
        System.out.println(builder);

        System.out.println(builder.charAt(0));
        System.out.println(builder.length()-1);
        System.out.println(builder.indexOf("T"));
        System.out.println(builder.indexOf("", 5));
        System.out.println(builder.indexOf("false"));
        System.out.println(builder.lastIndexOf("false"));
        System.out.println(builder.lastIndexOf("a"));
        System.out.println(builder.indexOf("a"));

        String substring = (builder.substring(builder.indexOf("f")));

        StringBuilder s = new StringBuilder(builder.substring(builder.indexOf("f")));
        System.out.println(builder);

        builder.insert(4, "Hello");
        System.out.println(builder);

        int[] numbers = {1,2,3,4,5};
        builder.insert(2, Arrays.toString(numbers));
        System.out.println(builder);
    }
}
