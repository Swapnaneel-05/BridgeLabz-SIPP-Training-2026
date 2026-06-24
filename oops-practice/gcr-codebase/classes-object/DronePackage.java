class Drone{
    private String droneId;
    private int batteryPercentage;

    static String companyName = "Tesla"; 

    Drone(String droneId,int batteryPercentage){
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery(){
        if(batteryPercentage >= 30){
            System.out.println("Delivery started by: "+droneId);
        }else{
            System.out.println(droneId+ " Insufficient Battery");
        }
    }

    void displayStatus(){
        System.out.println("\nDroneID:  "+droneId);
        System.out.println("Battery Percentage:  "+batteryPercentage);
        System.out.println("Company:  "+companyName);
    }
}

public class DronePackage {
    public static void main(String[] args) {
        // Create multiple drones
        Drone d1 = new Drone("D101", 80);
        Drone d2 = new Drone("D102", 15);
        Drone d3 = new Drone("D103", 60);

        // Start deliveries
        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        // Display status
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        // Verify shared company name
        System.out.println("\nVerifying Static Variable:");
        System.out.println("d1 Company: " + Drone.companyName);
        System.out.println("d2 Company: " + Drone.companyName);
        System.out.println("d3 Company: " + Drone.companyName);
    }
}
