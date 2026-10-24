```java
import java.util.Scanner;

// User-defined exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {

    // Method to check age
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(
                    "Age must be 18 or above.");
        } else {
            System.out.println("Eligible for registration.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("JAVA EXCEPTION HANDLING");
        System.out.println("-----------------------");

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // User-defined exception
            checkAge(age);

            // Built-in exception demonstration
            System.out.print("Enter a number to divide 100: ");
            int number = sc.nextInt();

            int result = 100 / number;
            System.out.println("Result: " + result);

        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: "
                    + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println(
                    "Built-in Exception: Division by zero is not allowed.");

        } catch (java.util.InputMismatchException e) {
            System.out.println(
                    "Built-in Exception: Please enter valid integers.");

        } finally {
            System.out.println("Exception handling completed.");
            sc.close();
        }
    }
}
```
