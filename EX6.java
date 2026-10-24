```java
// Interface
interface SmartDevice {
    void turnOn();
    void turnOff();
}

// Abstract class
abstract class Appliance implements SmartDevice {
    String applianceName;

    // Constructor
    Appliance(String name) {
        applianceName = name;
    }

    // Abstract method
    abstract void operate();

    // Concrete method
    void displayName() {
        System.out.println("Appliance: " + applianceName);
    }
}

// Child class 1
class SmartLight extends Appliance {

    SmartLight(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(applianceName + " is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(applianceName + " is turned OFF.");
    }

    @Override
    void operate() {
        System.out.println("Brightness is adjusted automatically.");
    }
}

// Child class 2
class SmartFan extends Appliance {

    SmartFan(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(applianceName + " is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(applianceName + " is turned OFF.");
    }

    @Override
    void operate() {
        System.out.println("Fan speed is controlled automatically.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        System.out.println("SMART HOME APPLIANCE SYSTEM");
        System.out.println("---------------------------");

        // Dynamic method dispatch
        Appliance device;

        device = new SmartLight("Smart Light");
        device.displayName();
        device.turnOn();
        device.operate();
        device.turnOff();

        System.out.println();

        device = new SmartFan("Smart Fan");
        device.displayName();
        device.turnOn();
        device.operate();
        device.turnOff();
    }
}
```
