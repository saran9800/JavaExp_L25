```java
abstract class Employee {
    private int employeeId;
    private String name;
    private double salary;

    static String companyName = "ABC Technologies";

    // Constructor
    Employee(int id, String empName, double empSalary) {
        employeeId = id;
        name = empName;
        salary = empSalary;
    }

    // Encapsulation using getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Abstract method
    abstract void displayRole();

    // Non-static method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("Company: " + companyName);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    Developer(int id, String name, double salary, String language) {
        super(id, name, salary);
        programmingLanguage = language;
    }

    // Implementing abstract method
    @Override
    void displayRole() {
        System.out.println("Role: Software Developer");
        System.out.println("Programming Language: "
                + programmingLanguage);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating an employee object
        Developer emp1 = new Developer(
                101, "Arun", 35000, "Java");

        System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("---------------------------");

        emp1.displayDetails();
        emp1.displayRole();

        System.out.println("\nEmployee Name: " + emp1.getName());
        System.out.println("Employee ID: " + emp1.getEmployeeId());

        // Accessing static member using class name
        System.out.println("Company Name: " + Employee.companyName);
    }
}
```
