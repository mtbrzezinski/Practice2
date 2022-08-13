package MentoringWithAhmed;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public double tax() {
        if (salary <= 1000) {
            return 0.0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        int extraHours = (workHours - 40);
        if (extraHours > 0) {
            return extraHours * 30;
        }
        return 0.0;
    }

    public double raise() {
        int yearsOfEmployment = (2015 - hireYear);

        if (yearsOfEmployment < 10) {
            return salary * 0.05;
        } else if (yearsOfEmployment < 20 && yearsOfEmployment > 9) {
            return salary * 0.1;
        } else if (yearsOfEmployment > 19) {
            return salary * 0.15;
        } else {
            return 0.0;
        }
    }
       public void information(){
            System.out.println("Name: " + name);
           System.out.println("Salary: " + salary);
           System.out.println("WorkHours: " + workHours);
           System.out.println("HireDate: " + hireYear);
           System.out.println("Tax: " + tax() + "$");
           System.out.println("Bonus: " + bonus() + "$");
           System.out.println("Raise: " + raise() + "$");
           double totalSalary = salary + bonus() - tax();
           System.out.println("Salary with Tax and Bonus: " + totalSalary + "$");
           System.out.println("Total salary with increase salary: " + (salary +raise()));
        }

}












