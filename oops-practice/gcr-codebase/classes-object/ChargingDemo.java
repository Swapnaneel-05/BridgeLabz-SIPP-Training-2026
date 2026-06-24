class ChargingStation{
    static int totalStations=0;
    static double electricityRate = 0.7;   
    
    private String stationId;
    private double unitsConsumed;

    ChargingStation(String stationId, double unitsConsumed){
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill(){
        return electricityRate*unitsConsumed;
    }

    void displayStationDetails(){
        System.out.println("\nStation ID      : " + stationId);
        System.out.println("Units Consumed  : " + unitsConsumed);
        System.out.println("Rate per Unit   : " + electricityRate);
        System.out.println("Bill Amount     : " + calculateBill());
    }

}

public class ChargingDemo{
    public static void main(String[] args) {
        ChargingStation[] stations = {
            new ChargingStation("CS101", 120),
            new ChargingStation("CS102", 150),
            new ChargingStation("CS103", 90),
            new ChargingStation("CS104", 200),
            new ChargingStation("CS105", 175)
        };
        
        System.out.println("First Charging: ");

        for(ChargingStation station: stations){
            station.displayStationDetails();
        }
        
        ChargingStation.electricityRate = 0.11;
        
        System.out.println("\nAfter Rate Change: ");
        
        for(ChargingStation station: stations){
            station.displayStationDetails();
        }

        System.out.println("\nTotal Stations: "+ChargingStation.totalStations);
    }
}