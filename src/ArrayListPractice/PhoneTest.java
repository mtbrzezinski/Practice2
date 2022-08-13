package ArrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("A", 100);
        Phone phone2 = new Phone("B", 200);
        Phone phone3 = new Phone("C", 300);

        ArrayList<Phone> storage = new ArrayList();


        storage.add(phone1);
        storage.add(phone2);
        storage.add(phone3);
        System.out.println(storage);
        storage.set(0, new Phone("Motorola", 10000));
        System.out.println(storage);

        List<Phone> list = new ArrayList<Phone>();
        list.addAll(storage);
        list.size();
        list.get(0);
        System.out.println(list.get(0));
        System.out.println(list.get(1));




    }
}
