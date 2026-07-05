class Subscription {

    String subscriberName;
    String subscriptionId;

    Subscription(String subscriberName, String subscriptionId) {
        this.subscriberName = subscriberName;
        this.subscriptionId = subscriptionId;
    }

    double calculateMonthlyCharge() {
        return 0;
    }

    void display() {
        System.out.println(subscriberName + "  " + subscriptionId);
    }
}

class BasicPlan extends Subscription {

    BasicPlan(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateMonthlyCharge() {
        return 199;
    }
}

class PremiumPlan extends Subscription {

    PremiumPlan(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateMonthlyCharge() {
        return 499;
    }
}

class FamilyPlan extends Subscription {

    FamilyPlan(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateMonthlyCharge() {
        return 799;
    }
}

public class SubscriptionAnalyzer {

    static void searchById(Subscription[] subs, String id) {

        for (Subscription s : subs) {

            if (s.subscriptionId.equals(id)) {
                System.out.println("Subscription Found");
                s.display();
                return;
            }
        }

        System.out.println("Subscription Not Found");
    }

    static void displayByLetter(Subscription[] subs, char letter) {

        System.out.println("\nSubscribers Starting with " + letter);

        for (Subscription s : subs) {

            if (s.subscriberName.startsWith(String.valueOf(letter)))
                s.display();
        }
    }

    static void totalRevenue(Subscription[] subs) {

        double total = 0;

        for (Subscription s : subs)
            total += s.calculateMonthlyCharge();

        System.out.println("\nTotal Monthly Revenue = Rs. " + total);
    }

    public static void main(String[] args) {

        Subscription[] subs = {
                new BasicPlan("Mayank", "S101"),
                new PremiumPlan("Rahul", "S102"),
                new FamilyPlan("Amit", "S103"),
                new PremiumPlan("Ankit", "S104")
        };

        searchById(subs, "S103");

        displayByLetter(subs, 'A');

        totalRevenue(subs);

        Subscription expensive = subs[0];

        for (Subscription s : subs) {

            if (s.calculateMonthlyCharge() > expensive.calculateMonthlyCharge())
                expensive = s;
        }

        System.out.println("\nMost Expensive Subscription");
        expensive.display();
        System.out.println("Charge = Rs. " + expensive.calculateMonthlyCharge());
    }
}