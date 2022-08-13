package Map;

import java.util.HashMap;

public class employeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Chicago", 32);
        Employee e2 = new Employee("Jack", "Los Angeles", 30);
        Employee e3 = new Employee("Jim", "Fox Lake", 25);
        Employee e4 = new Employee("Jake", "Evanston", 29);


        HashMap<Integer, Employee> map = new HashMap<>();

        map.put(e1.id, e1);
        map.put(e2.id, e2);
        map.put(e3.id, e3);
        map.put(e4.id, e4);


        printNames(map);
        System.out.println(e1);


    }

    public static void printNames(HashMap<Integer, Employee> employee) {

        for (Employee emp : employee.values()) {
            if (emp.age > 25) {
                System.out.println(emp.name);
            }

        }
    }
}