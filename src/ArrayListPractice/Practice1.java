package ArrayListPractice;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList(4);
        ArrayList <Integer> list2 = new ArrayList();
        ArrayList list3 = new ArrayList<Integer>();
        ArrayList <String> list4 = new ArrayList<String>();

        System.out.println(list);
        list.add(34);
        System.out.println(list);
        list.add(0, 12);
        System.out.println(list);
        list.add(45);
        list.add(234);
        System.out.println(list);
        list.add("Saturday");
        System.out.println(list);
        list.get(4);
        System.out.println(list.get(4));
        System.out.println(list.get(list.size()-1));

        System.out.println("++++++++++++++++");
        for(int i = 0; i < list.size(); i++){
            list.get(i);
            System.out.println(list.get(i));
        }
        System.out.println("===============");
        for(Object  element : list  ){
            System.out.println(element);
        }
    }
}
