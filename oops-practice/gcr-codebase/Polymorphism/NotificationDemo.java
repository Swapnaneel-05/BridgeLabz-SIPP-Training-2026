class Notification {
    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Sending Notification");
    }
}

class EmailNotification extends Notification {

    EmailNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    void sendNotification() {
        System.out.println("Email sent to " + recipientName + ": " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    void sendNotification() {
        System.out.println("SMS sent to " + recipientName + ": " + message);
    }
}

class PushNotification extends Notification {

    PushNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    void sendNotification() {
        System.out.println("Push Notification to " + recipientName + ": " + message);
    }
}

public class NotificationDemo {

    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Mayank", "Interview Tomorrow"),
                new SMSNotification("Rahul", "OTP is 1234"),
                new PushNotification("Aman", "New Assignment Uploaded")
        };

        System.out.println("Sent Notifications:");

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}