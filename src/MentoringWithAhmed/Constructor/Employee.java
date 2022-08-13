package MentoringWithAhmed.Constructor;

public class Employee {
    int id;
    String name;
    double companyBudget;
    final String companyName = "Java";

    public void budget(double salary) {
        companyBudget -= salary;
        System.out.println("New budget for company is now: " + companyBudget);
    }
public void budget(int income){
        companyBudget += income;
            System.out.println("New budget for the company is now: " + companyBudget);


        }
        public Employee(){

        }
        public Employee(String name){
        this.name = name;
        }

    public Employee(int id, String name, double companyBudget) {
        this.id = id;
        this.name = name;
        this.companyBudget = companyBudget;
    }

    public static void main(String[] args) {
    Employee e1 = new Employee();
    Employee e2 = new Employee("John");
    Employee e3 = new Employee(1234, "Joe", 18.5);
        System.out.println(e1.companyName);
        e2.budget(1000.0);
        System.out.println(e2.companyBudget);
        e1.name = "Jessi";
        System.out.println(e1.name);
        System.out.println(e2.name);
    }

}
