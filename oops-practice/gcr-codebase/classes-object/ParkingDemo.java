class Vehicle {
    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    Vehicle(String vehicleNumber,
            String ownerName,
            String vehicleType) {

        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    String getVehicleType() {
        return vehicleType;
    }

    void display() {
        System.out.println("Vehicle No : " + vehicleNumber);
        System.out.println("Owner      : " + ownerName);
        System.out.println("Type       : " + vehicleType);
        System.out.println();
    }
}

public class ParkingDemo {

    static void displayCars(Vehicle[] vehicles) {
        System.out.println("\n--- Cars ---");
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("\n--- Bikes ---");
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Vehicle("UP81A101", "Aman", "Car"),
            new Vehicle("UP81B102", "Rahul", "Bike"),
            new Vehicle("UP81C103", "Priya", "Car"),
            new Vehicle("UP81D104", "Rohit", "Bike"),
            new Vehicle("UP81E105", "Neha", "Car"),
            new Vehicle("UP81F106", "Karan", "Bike"),
            new Vehicle("UP81G107", "Ankit", "Car"),
            new Vehicle("UP81H108", "Pooja", "Bike"),
            new Vehicle("UP81I109", "Vikas", "Car"),
            new Vehicle("UP81J110", "Simran", "Bike")
        };

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}