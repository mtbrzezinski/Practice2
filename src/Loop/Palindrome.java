package Loop;

public class Palindrome {
    public static void main(String[] args) {
        String str = "annnNA";
        String palindrome = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            palindrome = palindrome + str.charAt(i);}
            if (str.equalsIgnoreCase(palindrome)) {
                System.out.println("This is a palindrome");
            }else {
                System.out.println("This is not a palindrome");
            }
        }
    }

