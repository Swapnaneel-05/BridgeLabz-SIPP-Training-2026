class Vehicle {
    String vehicleNo;

    Vehicle(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {
    Car(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {
    Bus(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {
    Bike(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double fuelCost(int km) {
        return km * 3;
    }
}

// Added without modifying existing classes
class ElectricCar extends Vehicle {
    ElectricCar(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double fuelCost(int km) {
        return km * 2;
    }
}

public class FleetDemo {
    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("C101"),
                new Bus("B201"),
                new Bike("BK301"),
                new ElectricCar("E401")
        };

        int km = 50;

        for (Vehicle v : fleet) {

            if (v instanceof Car)
                System.out.println("Car Fuel Cost = " + ((Car) v).fuelCost(km));

            else if (v instanceof Bus)
                System.out.println("Bus Fuel Cost = " + ((Bus) v).fuelCost(km));

            else if (v instanceof Bike)
                System.out.println("Bike Fuel Cost = " + ((Bike) v).fuelCost(km));

            else if (v instanceof ElectricCar)
                System.out.println("Electric Car Cost = " + ((ElectricCar) v).fuelCost(km));
        }
    }
}