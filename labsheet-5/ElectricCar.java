interface Electric {
    void chargeBattery();
}

public class ElectricCar implements Electric {

    static class Vehicle {
        void start() {
            System.out.println("Vehicle started");
        }
    }

    static class Car extends Vehicle {
        void drive() {
            System.out.println("Car is driving");
        }
    }

    public void start() {
        new Vehicle().start();
    }

    public void drive() {
        new Car().drive();
    }

    @Override
    public void chargeBattery() {
        System.out.println("Battery is charging");
    }

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();

        e.start();
        e.drive();
        e.chargeBattery();
    }
}