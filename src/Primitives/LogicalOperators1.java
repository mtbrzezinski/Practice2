package Primitives;

public class LogicalOperators1 {
    public static void main(String[] args) {
        /* you are taking three exams for your math class to be able to pass the Math class
        your average score has to be 60 and class average has to be less than your average
         */

        int passScoreAverage = 60;
        int test1 = 0;
        int test2 = 55;
        int test3 = 78;
        int studentAverage = (test1+test2+test3)/3;
        System.out.println(studentAverage);

        int classAverage = 55;

        boolean results = studentAverage > passScoreAverage && studentAverage > classAverage;
        System.out.println(results);

    }
}
