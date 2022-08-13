package MentoringWithAhmed;

public class UnaryAndCompound {
    /*
    ++i --> preincrement, ir will immediately increase the number of the value
    i++ --> postincrement, it will increase the value in the next line

    COMPOUND OPERATORS:
    it is a way to make your arithmetic works shorter

    example:
    x=x+y --> x+=y
    x = x*y --> x*=y
    x=x/y --> x/=y

     */
    public static void main(String[] args) {
      int number = 6;
      int secondnumber = number++;//6
      int thirdnumber = ++number;//8
        System.out.println(number++ + thirdnumber);
        System.out.println(secondnumber);


    }
}
