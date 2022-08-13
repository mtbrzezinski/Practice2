package OOP.AbstractCases;

public class OnlineStudent extends Student {
    public OnlineStudent(){
        super("David", 23);
    }
    public void attend(){
        System.out.println("Online student is attending via Zoom meeting");
    }
    public void watch(){
        System.out.println("Online student is watching the lecture");
    }
    void study(){
        System.out.println("Online student studies more");
    }
}
