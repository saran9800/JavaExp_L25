```java
import java.io.*;

public class Main {
    public static void main(String[] args) {

        String fileName = "student.txt";

        System.out.println("JAVA FILE PROCESSING");
        System.out.println("--------------------");

        // 1. Writing data using FileWriter and BufferedWriter
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Student Name: Arun");
            bw.newLine();
            bw.write("Roll Number: 101");
            bw.newLine();
            bw.write("Department: Information Technology");

            bw.close();
            fw.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file: "
                    + e.getMessage());
        }

        // 2. Reading data using FileReader and BufferedReader
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("\nReading file contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error reading file: "
                    + e.getMessage());
        }

        // 3. Writing bytes using FileOutputStream
        try {
            FileOutputStream fos =
                    new FileOutputStream("message.txt");

            String message = "Java I/O Stream Example";
            fos.write(message.getBytes());

            fos.close();

            System.out.println("\nByte data written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing byte data: "
                    + e.getMessage());
        }

        // 4. Reading bytes using FileInputStream
        try {
            FileInputStream fis =
                    new FileInputStream("message.txt");

            BufferedInputStream bis =
                    new BufferedInputStream(fis);

            int data;

            System.out.println("\nReading byte file:");

            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }

            bis.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("Error reading byte data: "
                    + e.getMessage());
        }

        System.out.println("\n\nFile processing completed.");
    }
}
```
