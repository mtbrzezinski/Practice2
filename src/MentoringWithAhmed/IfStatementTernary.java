package MentoringWithAhmed;

public class IfStatementTernary {
    /*
    -->TRUE&&TRUE(AND)--> means both conditions must be TRUE to give you TRUE
    -->TRUE&&FALSE(AND)--> FALSE
    -->FALSE&&FALSE --> FALSE

    -->TRUE || TRUE (OR) --> TRUE
    --> TRUE || FALSE(OR) --> TRUE
    --> FALSE || FALSE (OR) --> FALSE
     */
    public static void main(String[] args) {
        boolean result = (5+7 == 12);
        System.out.println(result);
        int cat = 20;
        int dog = 10;
        int rabbit = 5;
        if(cat>dog&&rabbit<dog||cat<rabbit){
            System.out.println("I love the animals");
        }else{
            System.out.println("I don't love animals");
        }
        String results1 = cat>dog&&rabbit>dog||cat<rabbit ? "I love animals" : "I feed animals";
        String results2 = (cat>dog) ? "yes" : "no";
        System.out.println(cat>dog ? "yes" : 123);
        System.out.println(results1);
        System.out.println(results2);

        for(long count = 3, num = 1; count<5 && num <3; num ++, count ++){
            System.out.println(num);
        }
    }

}
