```java
import java.util.*;

// Student class implementing Comparable
class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int marks;

    // Constructor
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Natural sorting by name
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    // Display student details
    void display() {
        System.out.println(rollNo + "\t" + name + "\t" + marks);
    }
}

// Comparator for sorting by marks
class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.marks, s2.marks);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(103, "Kumar", 85));
        students.add(new Student(101, "Arun", 92));
        students.add(new Student(102, "Priya", 78));

        System.out.println("STUDENT SORTING SYSTEM");
        System.out.println("----------------------");

        // Sorting using Comparable (by name)
        Collections.sort(students);

        System.out.println("\nSorting by Name (Comparable):");
        System.out.println("Roll No\tName\tMarks");

        for (Student s : students) {
            s.display();
        }

        // Sorting using Comparator (by marks)
        Collections.sort(students, new MarksComparator());

        System.out.println("\nSorting by Marks (Comparator):");
        System.out.println("Roll No\tName\tMarks");

        for (Student s : students) {
            s.display();
        }
    }
}
```
