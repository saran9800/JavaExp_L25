```java
// Thread class approach
class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Class: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

// Runnable interface approach
class MyRunnable implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Interface: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Runnable thread interrupted.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        System.out.println("MULTITHREADING IN JAVA");
        System.out.println("----------------------");

        // Creating thread using Thread class
        MyThread t1 = new MyThread();

        // Creating thread using Runnable interface
        MyRunnable task = new MyRunnable();
        Thread t2 = new Thread(task);

        // Starting both threads
        t1.start();
        t2.start();

        // Waiting for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
            Thread.currentThread().interrupt();
        }

        System.out.println("Both threads completed.");
    }
}
```
