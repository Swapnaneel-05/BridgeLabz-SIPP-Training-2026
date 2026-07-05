import java.util.*;

public class EventSystem {

    HashSet<String> participants = new HashSet<>();

    // Register participant
    public void register(String email) {

        if (participants.add(email)) {
            System.out.println("Registered: " + email);
        } else {
            System.out.println("Duplicate Registration Rejected!");
        }
    }

    // Display participants
    public void displayParticipants() {

        System.out.println("\nRegistered Participants:");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("Total Participants: " + participants.size());
    }

    public static void main(String[] args) {

        EventSystem event = new EventSystem();

        event.register("mayank@gmail.com");
        event.register("rahul@gmail.com");
        event.register("aman@gmail.com");

        // Duplicate
        event.register("rahul@gmail.com");

        System.out.println();

        event.displayParticipants();
    }
}