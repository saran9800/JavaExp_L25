```java
import java.io.*;

// Class implementing Serializable
class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    int rollNo;
    String name;
    String department;
    double mark;

    // Constructor
    Student(int rollNo, String name,
            String department, double mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.mark = mark;
    }

    // Display student details
    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Mark: " + mark);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        String fileName = "student.ser";

        System.out.println("OBJECT PERSISTENCE IN JAVA");
        System.out.println("--------------------------");

        Student s1 = new Student(
                101, "Arun", "Information Technology", 89.5);

        // Serialization
        try (ObjectOutputStream out =
                     new ObjectOutputStream(
                             new FileOutputStream(fileName))) {

            out.writeObject(s1);

            System.out.println("Object serialized successfully.");

        } catch (IOException e) {
            System.out.println("Serialization error: "
                    + e.getMessage());
            return;
        }

        // Deserialization
        try (ObjectInputStream in =
                     new ObjectInputStream(
                             new FileInputStream(fileName))) {

            Student s2 = (Student) in.readObject();

            System.out.println("\nDeserialized Student Details:");
            s2.display();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: "
                    + e.getMessage());
        }

        System.out.println("\nObject persistence completed.");
    }
}
```
