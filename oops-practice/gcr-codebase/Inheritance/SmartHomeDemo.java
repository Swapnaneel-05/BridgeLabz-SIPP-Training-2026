class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String deviceId,
               String status,
               double temperatureSetting) {

        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature Setting: "
                           + temperatureSetting + "°C");
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {

        Thermostat t1 =
                new Thermostat("TH101", "ON", 24.5);

        t1.displayStatus();
    }
}
