package Map;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentInfo {
    public static void main(String[] args) {
        HashMap<String, String> student1 = new HashMap();
        student1.put("firstname", "David");
        student1.put("lastname", "Pena");
        student1.put("age", "25");
        student1.put("gender", "M");
        student1.put("city", "Chicago");

        HashMap<String, String> student2 = new HashMap();
        student2.put("firstname", "Jeremiah");
        student2.put("lastname", "Michaelson");
        student2.put("age", "15");
        student2.put("gender", "M");
        student2.put("city", "Lake Forest");

        HashMap<String, String> student3 = new HashMap();
        student3.put("firstname", "Michael");
        student3.put("lastname", "White");
        student3.put("age", "35");
        student3.put("gender", "M");
        student3.put("city", "Winnetka");

        HashMap<String, String> student4 = new HashMap();
        student4.put("firstname", "Sarah");
        student4.put("lastname", "Star");
        student4.put("age", "29");
        student4.put("gender", "F");
        student4.put("city", "Chicago");

        ArrayList<HashMap<String, String>> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        // System.out.println(student4);
        //System.out.println(studentList);

        for (HashMap<String, String> students : studentList) {
            System.out.println(students);
        }
        for (HashMap<String, String> students : studentList) {
            if (students.containsValue("Chicago")) {
                System.out.println(students.get("firstname") + " is living in Chicago");
            }
        }
        for (HashMap<String, String> students : studentList) {
            if (Integer.parseInt(students.get("age")) < 25) {
                System.out.println((students.get("firstname") + " " + students.get("lastname")).toUpperCase() + " is less than 25");


            }

        }
    }
}
