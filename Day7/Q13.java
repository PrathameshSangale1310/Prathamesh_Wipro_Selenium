package Assignment7;

class Car {
    String model;

    Car(String model) {
        this.model = model;
    }
}


public class Q13 {
	public static void assignNewObject(Car c) {
        c = new Car("Tesla");
    }
	public static void main(String[] args) {
		Car car = new Car("Honda");
        System.out.println("Before method call: " + car.model);
        assignNewObject(car);
        System.out.println("After method call: " + car.model);
	}

}
