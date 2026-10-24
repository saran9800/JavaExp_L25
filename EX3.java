```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creating Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Reading student details
        System.out.println("STUDENT ADMISSION MANAGEMENT SYSTEM");
        System.out.println("-----------------------------------");

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter 12th Mark (out of 600): ");
        int mark = sc.nextInt();

        // Displaying admission details
        System.out.println("\nSTUDENT ADMISSION DETAILS");
        System.out.println("-------------------------");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course Name: " + course);
        System.out.println("12th Mark: " + mark + "/600");

        // Calculating percentage
        double percentage = (mark / 600.0) * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);

        // Checking admission eligibility
        if (age >= 17 && mark >= 300 && mark <= 600) {
            System.out.println("Admission Status: Eligible");
        } else {
            System.out.println("Admission Status: Not Eligible");
        }

        sc.close();
    }
}
```
