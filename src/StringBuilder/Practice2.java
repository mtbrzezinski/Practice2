package StringBuilder;

public class Practice2 {
    public static void main(String[] args) {
        StringBuilder builder  = new StringBuilder("Wednesday");
        //builder.delete(2,4);
        //System.out.println(builder);
        builder.delete(builder.indexOf("day"), builder.length());
        System.out.println(builder);
    builder.deleteCharAt(builder.lastIndexOf("e"));
        System.out.println(builder);

        builder.append("  every other week");
        builder.deleteCharAt(builder.indexOf("e", builder.indexOf("w")));
        System.out.println(builder);

        //reverse
        StringBuilder builder1 = new StringBuilder("Interview");
        String reversed = "";
        for(int i = builder1.length()-1; i>+0; i--){
            reversed += builder1.charAt(i);

        }
        System.out.println(reversed);
        System.out.println("-----------");
        System.out.println(builder1);
        builder1.reverse();
        System.out.println(builder1);

        String str = builder1.toString();
        str.concat("Last Week");
        System.out.println(str);
    }

}
