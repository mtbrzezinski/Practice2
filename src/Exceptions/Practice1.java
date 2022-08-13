package Exceptions;

public class Practice1 {

    public static String getMessage(){
        return "Practice";
    }
    public static void main(String[] args) {
        try {
            String str = "B12";

            int a = Integer.parseInt(str);
            System.out.println(a);


        } catch (NumberFormatException exception) {
            System.out.println("I caught the number format exception!!");
            System.out.println(exception.getMessage());
            System.out.println(exception.getStackTrace());
            System.out.println(getMessage());
        } catch (RuntimeException exception) {
            System.out.println("This is the third catch");
        }
        System.out.println("I want to see this execution");
        study("Break");
    }

public static void study(String question){
        System.out.println("the question is not making sense " + question);
        try {
            int result = 12/0;
            System.out.println(result);
        }catch(ArithmeticException exception){
            System.out.println("This is ANOTHER TRY-CATCH");
        }finally {
            System.out.println("Finally block");
        }

        }
    }

