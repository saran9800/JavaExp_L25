```java
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("GENERIC COLLECTIONS IN JAVA");
        System.out.println("----------------------------");

        // 1. List Interface
        List<String> studentList = new ArrayList<>();

        studentList.add("Arun");
        studentList.add("Priya");
        studentList.add("Kumar");
        studentList.add("Priya");

        System.out.println("\n1. LIST COLLECTION:");
        System.out.println("Students: " + studentList);

        // 2. Set Interface
        Set<String> studentSet = new LinkedHashSet<>();

        studentSet.add("Arun");
        studentSet.add("Priya");
        studentSet.add("Kumar");
        studentSet.add("Priya");

        System.out.println("\n2. SET COLLECTION:");
        System.out.println("Unique Students: " + studentSet);

        // 3. Map Interface
        Map<Integer, String> studentMap = new LinkedHashMap<>();

        studentMap.put(101, "Arun");
        studentMap.put(102, "Priya");
        studentMap.put(103, "Kumar");

        System.out.println("\n3. MAP COLLECTION:");
        for (Map.Entry<Integer, String> entry
                : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey()
                    + ", Name: " + entry.getValue());
        }

        // 4. Queue Interface
        Queue<String> studentQueue = new LinkedList<>();

        studentQueue.offer("Arun");
        studentQueue.offer("Priya");
        studentQueue.offer("Kumar");

        System.out.println("\n4. QUEUE COLLECTION:");
        System.out.println("Queue: " + studentQueue);

        System.out.println("Next Student: "
                + studentQueue.peek());

        System.out.println("Removed Student: "
                + studentQueue.poll());

        System.out.println("Queue After Removal: "
                + studentQueue);

        System.out.println("\nCollection operations completed.");
    }
}
```
