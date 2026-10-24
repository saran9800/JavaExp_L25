```java
// Shared resource class
class SharedResource {
    private int data;
    private boolean available = false;

    // Synchronized method to produce data
    synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        data = value;
        available = true;

        System.out.println("Produced: " + data);

        // Notify the waiting consumer
        notifyAll();
    }

    // Synchronized method to consume data
    synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Consumed: " + data);
        available = false;

        // Notify the waiting producer
        notifyAll();
    }
}

// Producer thread
class Producer extends Thread {
    private SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
        }
    }
}

// Consumer thread
class Consumer extends Thread {
    private SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        System.out.println("SYNCHRONIZATION AND INTER-THREAD COMMUNICATION");
        System.out.println("---------------------------------------------");

        SharedResource resource = new SharedResource();

        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Execution completed.");
    }
}
```
