package MentoringWithAhmed;

public class ArraySplitInterviewQuestion {
    public static void main(String[] args) {
        String str = "Hello Java is so cool";
        String[] str1 = str.split( " ");
        String reverse = "";
        for (int i = 0; i<str1.length; i++){
            reverse="";
            for(int k = str1[i].length()-1; k>=0; k--){
                reverse+=str1[i].charAt(k);
            }
            System.out.println(reverse + ",");
        }

    }
}
