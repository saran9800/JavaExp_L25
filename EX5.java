```java
// Parent class
class Payment {

    // Compile-time polymorphism: Method overloading
    void makePayment(double amount) {
        System.out.println("Payment Amount: Rs. " + amount);
    }

    void makePayment(double amount, String transactionId) {
        System.out.println("Payment Amount: Rs. " + amount);
        System.out.println("Transaction ID: " + transactionId);
    }

    // Method to be overridden
    void paymentMode() {
        System.out.println("General Payment Method");
    }
}

// Child class 1
class UpiPayment extends Payment {

    // Runtime polymorphism: Method overriding
    @Override
    void paymentMode() {
        System.out.println("Payment Mode: UPI");
        System.out.println("UPI Payment Successful");
    }
}

// Child class 2
class CardPayment extends Payment {

    @Override
    void paymentMode() {
        System.out.println("Payment Mode: Debit/Credit Card");
        System.out.println("Card Payment Successful");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        System.out.println("ONLINE PAYMENT SYSTEM");
        System.out.println("---------------------");

        // Method overloading
        Payment p1 = new Payment();

        System.out.println("\nCompile-Time Polymorphism:");
        p1.makePayment(1500.0);
        p1.makePayment(2500.0, "TXN101");

        // Runtime polymorphism
        System.out.println("\nRuntime Polymorphism:");

        Payment p2 = new UpiPayment();
        p2.paymentMode();

        System.out.println();

        Payment p3 = new CardPayment();
        p3.paymentMode();

        System.out.println("\nPayment processing completed.");
    }
}
```
