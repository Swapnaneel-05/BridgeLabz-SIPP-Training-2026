import java.util.*;

public class ParkingManager {

    ArrayList<String> vehicles = new ArrayList<>();

    // Add vehicle
    public void enterVehicle(String regNo) {
        vehicles.add(regNo);
        System.out.println("Vehicle Entered: " + regNo);
    }

    // Remove vehicle
    public void exitVehicle(String regNo) {
        if (vehicles.remove(regNo)) {
            System.out.println("Vehicle Exited: " + regNo);
        } else {
            System.out.println("Vehicle Not Found");
        }
    }

    // Search vehicle
    public void searchVehicle(String regNo) {
        if (vehicles.contains(regNo)) {
            System.out.println("Vehicle is Parked");
        } else {
            System.out.println("Vehicle Not Found");
        }
    }

    // Display all vehicles
    public void displayVehicles() {
        System.out.println("\nParked Vehicles:");
        for (String v : vehicles) {
            System.out.println(v);
        }
        System.out.println("Total Occupied Slots: " + vehicles.size());
    }

    public static void main(String[] args) {

        ParkingManager parking = new ParkingManager();

        parking.enterVehicle("UP85AB1234");
        parking.enterVehicle("DL01XY5678");
        parking.enterVehicle("HR26CD9876");

        System.out.println();

        parking.searchVehicle("DL01XY5678");

        System.out.println();

        parking.exitVehicle("UP85AB1234");

        System.out.println();

        parking.displayVehicles();
    }
}