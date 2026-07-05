class RescueTeam {

    String teamId;
    String location;

    RescueTeam(String teamId, String location) {
        this.teamId = teamId;
        this.location = location;
    }

    void performDuty() {
        System.out.println("Performing Rescue");
    }

    void display() {
        System.out.println(teamId + "  " + location);
    }
}

class MedicalTeam extends RescueTeam {

    MedicalTeam(String id, String location) {
        super(id, location);
    }

    @Override
    void performDuty() {
        System.out.println(teamId + " provides Medical Aid");
    }
}

class FireRescueTeam extends RescueTeam {

    FireRescueTeam(String id, String location) {
        super(id, location);
    }

    @Override
    void performDuty() {
        System.out.println(teamId + " performs Fire Rescue");
    }
}

class FoodSupplyTeam extends RescueTeam {

    FoodSupplyTeam(String id, String location) {
        super(id, location);
    }

    @Override
    void performDuty() {
        System.out.println(teamId + " distributes Food Supplies");
    }
}

public class DisasterManagement {

    static void findTeamByLocation(RescueTeam[] teams, String location) {

        for (RescueTeam t : teams) {

            if (t.location.equalsIgnoreCase(location)) {
                System.out.println("Team Found");
                t.display();
            }
        }
    }

    static void displayTeamsByPrefix(RescueTeam[] teams, String prefix) {

        System.out.println("\nTeams Starting With " + prefix);

        for (RescueTeam t : teams) {

            if (t.teamId.startsWith(prefix))
                t.display();
        }
    }

    public static void main(String[] args) {

        RescueTeam[] teams = {
                new MedicalTeam("M101", "Delhi"),
                new FireRescueTeam("F201", "Mumbai"),
                new FoodSupplyTeam("FS301", "Delhi"),
                new MedicalTeam("M102", "Lucknow"),
                new FireRescueTeam("F202", "Delhi")
        };

        System.out.println("Perform Duties\n");

        for (RescueTeam t : teams)
            t.performDuty();

        findTeamByLocation(teams, "Delhi");

        displayTeamsByPrefix(teams, "M");

        int medical = 0, fire = 0, food = 0;

        for (RescueTeam t : teams) {

            if (t instanceof MedicalTeam)
                medical++;
            else if (t instanceof FireRescueTeam)
                fire++;
            else if (t instanceof FoodSupplyTeam)
                food++;
        }

        System.out.println("\nDeployment Count");
        System.out.println("Medical Teams : " + medical);
        System.out.println("Fire Teams    : " + fire);
        System.out.println("Food Teams    : " + food);

        System.out.print("\nMaximum Deployment Category : ");

        if (medical >= fire && medical >= food)
            System.out.println("Medical Team");
        else if (fire >= medical && fire >= food)
            System.out.println("Fire Rescue Team");
        else
            System.out.println("Food Supply Team");
    }
}