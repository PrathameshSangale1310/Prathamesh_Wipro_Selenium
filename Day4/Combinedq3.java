package Assignment4;

class Vehicle_interface {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle_interface {

    void start() {
        System.out.println("Car is starting");
    }
}

class Bikes extends Vehicle_interface {

    void start() {
        System.out.println("Bike is starting");
    }
}

class Truck extends Vehicle_interface {

    void start() {
        System.out.println("Truck is starting");
    }
}

public class Combinedq3 {

	static void startVehicle(Vehicle_interface v) {
        v.start();
    }

	public static void main(String[] args) {
		Vehicle_interface car = new Car();
		Vehicle_interface bike = new Bikes();
		Vehicle_interface truck = new Truck();

        startVehicle(car);
        startVehicle(bike);
        startVehicle(truck);

	}

}
