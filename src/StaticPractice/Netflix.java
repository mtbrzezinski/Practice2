package StaticPractice;

public class Netflix {
    static double data = 200;
    String accountName = "BOA";
    String userName;
    static int userCount = 1;


    public double streaming(double watchingCartoons) {
        String message = "Stop watching after 3 hours";
        data -= watchingCartoons;
        System.out.println("Your remaining data is: " + data);
        return data;

    }
    public Netflix(Netflix movie){
        movie.userName = "Bae";
    }

    public Netflix(String userName) {
        this.userName = userName;
        userCount++;
    }

    public static void main(String[] args) {
        Netflix flix = new Netflix("Kings");
        flix.streaming(5);
        Netflix netflix = new Netflix("Efe");
        netflix.streaming(1);
        Netflix user3 = new Netflix("Ajia");
        user3.streaming(10);

    }
}
