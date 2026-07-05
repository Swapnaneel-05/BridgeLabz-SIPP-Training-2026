import java.util.*;

public class TrafficMonitoring {

    HashMap<String, Integer> roads = new HashMap<>();

    // Add or Update Traffic
    public void addTraffic(String road, int count) {
        roads.put(road, roads.getOrDefault(road, 0) + count);
    }

    // Display Sorted Report
    public void displayReport() {

        TreeMap<String, Integer> sorted = new TreeMap<>(roads);

        System.out.println("\nTraffic Report:");

        for (String road : sorted.keySet()) {
            System.out.println(road + " : " + sorted.get(road));
        }

        String busiestRoad = "";
        int max = 0;

        for (String road : roads.keySet()) {
            if (roads.get(road) > max) {
                max = roads.get(road);
                busiestRoad = road;
            }
        }

        System.out.println("\nBusiest Road: " + busiestRoad);
        System.out.println("Vehicle Count: " + max);
        System.out.println("Total Roads: " + roads.size());
    }

    public static void main(String[] args) {

        TrafficMonitoring tm = new TrafficMonitoring();

        tm.addTraffic("MG Road", 120);
        tm.addTraffic("Ring Road", 250);
        tm.addTraffic("NH-44", 400);
        tm.addTraffic("MG Road", 80);

        tm.displayReport();
    }
}