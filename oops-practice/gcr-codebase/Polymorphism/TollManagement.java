class Vehicle {

    String vehicleNumber;
    String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    double calculateToll() {
        return 0;
    }

    void display() {
        System.out.println(vehicleNumber + "  " + ownerName);
    }
}

class Car extends Vehicle {

    Car(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 100;
    }
}

class Bus extends Vehicle {

    Bus(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 250;
    }
}

class Truck extends Vehicle {

    Truck(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 400;
    }
}

public class TollManagement {

    static void calculateTotalRevenue(Vehicle[] vehicles) {

        double total = 0;

        for (Vehicle v : vehicles)
            total += v.calculateToll();

        System.out.println("Total Revenue = Rs. " + total);
    }

    static void searchVehicle(Vehicle[] vehicles, String number) {

        for (Vehicle v : vehicles) {

            if (v.vehicleNumber.equals(number)) {
                System.out.println("Vehicle Found");
                v.display();
                return;
            }
        }

        System.out.println("Vehicle Not Found");
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("UP80A1234", "Mayank"),
                new Bus("UP81B2222", "Rahul"),
                new Truck("UP85T3333", "Amit"),
                new Car("UP90C4444", "Rohan"),
                new Truck("UP91T5555", "Karan")
        };

        calculateTotalRevenue(vehicles);

        searchVehicle(vehicles, "UP85T3333");

        Vehicle highest = vehicles[0];

        int cars = 0, buses = 0, trucks = 0;

        for (Vehicle v : vehicles) {

            if (v.calculateToll() > highest.calculateToll())
                highest = v;

            if (v instanceof Car)
                cars++;
            else if (v instanceof Bus)
                buses++;
            else if (v instanceof Truck)
                trucks++;
        }

        System.out.println("\nHighest Toll Paid");
        highest.display();
        System.out.println("Toll = Rs. " + highest.calculateToll());

        System.out.println("\nVehicle Count");
        System.out.println("Cars = " + cars);
        System.out.println("Buses = " + buses);
        System.out.println("Trucks = " + trucks);
    }
}