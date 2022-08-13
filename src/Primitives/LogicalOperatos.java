package Primitives;

public class LogicalOperatos {
    public static void main(String[] args) {
        // passing a course
        // when your average score is 70 or more AND your attendance is 90% or more

        int score = 70, attendance = 90;

        int studentScore = 75, studentAttendance = 100;

        boolean passScore = studentScore >= score;
        boolean passAttendance = studentAttendance >= attendance;
        System.out.println(passScore && passAttendance);


        int studentScore1 = 75, studentAttendance1 = 50;

        boolean passScore1 = studentScore1 >= score;
        boolean passAttendance1 = studentAttendance1 >= attendance;
        System.out.println(passScore1 && passAttendance1);

        System.out.println(passScore1 || passAttendance1);
    }
}
