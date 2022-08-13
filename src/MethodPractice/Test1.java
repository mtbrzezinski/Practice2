package MethodPractice;

public class Test1 {
    public static void main(String[] args) {
        Task1 object = new Task1();
        int[] nms = {1,2,3,5};
        System.out.println(object.sum(nms));
        System.out.println(object.sum(new int[] {1,2,3,5}));
    }
}
