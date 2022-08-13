package StringBuilder;

public class AlphabetClass<so> {


    public static String printAlphabet(){
       String alphabet = "a";
      for(char ch = 'a'; ch <= 'z'; ch++){
          alphabet += ch;
          System.out.println(alphabet);
      }
      return alphabet;
    }

    public static void main(String[] args) {
        printAlphabet();

    }
}
