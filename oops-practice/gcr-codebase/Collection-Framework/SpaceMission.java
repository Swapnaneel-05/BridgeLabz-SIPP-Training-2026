import java.util.*;

class Astronaut {
    String astronautId;
    String name;
    String specialization;

    Astronaut(String astronautId, String name, String specialization) {
        this.astronautId = astronautId;
        this.name = name;
        this.specialization = specialization;
    }

    public String toString() {
        return astronautId + " - " + name + " (" + specialization + ")";
    }
}

public class SpaceMission {

    HashMap<String, List<Astronaut>> missions = new HashMap<>();
    HashMap<String, HashSet<String>> assigned = new HashMap<>();

    // Add Mission
    public void addMission(String missionName) {
        missions.putIfAbsent(missionName, new ArrayList<>());
        assigned.putIfAbsent(missionName, new HashSet<>());
        System.out.println("Mission Added: " + missionName);
    }

    // Assign Astronaut
    public void assignAstronaut(String missionName, Astronaut a) {

        if (!missions.containsKey(missionName)) {
            System.out.println("Mission not found.");
            return;
        }

        if (assigned.get(missionName).contains(a.astronautId)) {
            System.out.println("Duplicate assignment not allowed.");
            return;
        }

        missions.get(missionName).add(a);
        assigned.get(missionName).add(a.astronautId);

        System.out.println(a.name + " assigned to " + missionName);
    }

    // Display Missions
    public void displayMissions() {

        for (String mission : missions.keySet()) {

            System.out.println("\nMission: " + mission);

            for (Astronaut a : missions.get(mission)) {
                System.out.println(a);
            }

            System.out.println("Total Crew: " + missions.get(mission).size());
        }
    }

    public static void main(String[] args) {

        SpaceMission sm = new SpaceMission();

        sm.addMission("Mars Mission");
        sm.addMission("Moon Mission");

        Astronaut a1 = new Astronaut("A101", "Mayank", "Pilot");
        Astronaut a2 = new Astronaut("A102", "Rahul", "Engineer");
        Astronaut a3 = new Astronaut("A103", "Aman", "Scientist");

        sm.assignAstronaut("Mars Mission", a1);
        sm.assignAstronaut("Mars Mission", a2);
        sm.assignAstronaut("Mars Mission", a1); // Duplicate

        sm.assignAstronaut("Moon Mission", a3);

        sm.displayMissions();
    }
}