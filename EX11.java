```java
// Thread lifecycle demonstration
class MyThread extends Thread {

    public void run() {
        try {
            System.out.println("Thread is running");

            Thread.sleep(1000);

            System.out.println("Thread execution resumed");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            Thread.currentThread().interrupt();
        }
    }
}

// Deadlock prevention using a fixed lock order
class Resource {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    void accessResource(String name) {
        synchronized (lock1) {
            System.out.println(name + " acquired Lock 1");

            synchronized (lock2) {
                System.out.println(name + " acquired Lock 2");
                System.out.println(name + " accessed resources");
            }
        }
    }
}

// Worker thread
class Worker extends Thread {
    private Resource resource;

    Worker(Resource resource, String name) {
        super(name);
        this.resource = resource;
    }

    public void run() {
        resource.accessResource(getName());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        System.out.println("THREAD LIFECYCLE MANAGEMENT");
        System.out.println("---------------------------");

        MyThread t1 = new MyThread();

        System.out.println("Initial State: " + t1.getState());

        t1.start();

        try {
            Thread.sleep(200);
            System.out.println("Current State: " + t1.getState());

            t1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        }

        System.out.println("Final State: " + t1.getState());

        System.out.println("\nDEADLOCK PREVENTION");
        System.out.println("-------------------");

        Resource resource = new Resource();

        Worker t2 = new Worker(resource, "Thread A");
        Worker t3 = new Worker(resource, "Thread B");

        t2.start();
        t3.start();

        try {
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        }

        System.out.println("All threads completed successfully.");
    }
}
```
