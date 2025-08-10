package Assignment5;

interface BaseVehicle {
    void start();
}

interface AdvancedVehicle extends BaseVehicle {
    void stop();
    boolean refuel(int amount);
}

class Car implements AdvancedVehicle {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    public void start() {
        if (fuel > 0) {
            System.out.println("Car started");
            fuel--;
        } else {
            System.out.println("Not enough fuel to start");
        }
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public boolean refuel(int amount) {
        if (amount > 0) {
            fuel += amount;
            return true;
        }
        return false;
    }
}

public class Interfaceq4 {

	public static void main(String[] args) {
		BaseVehicle base = new Car(1);
        base.start();

        AdvancedVehicle adv = new Car(0);
        adv.start();
        System.out.println(adv.refuel(5));
        adv.start();
        adv.stop();

	}

}
