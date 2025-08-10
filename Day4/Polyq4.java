package Assignment4;

class Vehiclesnew {
    Vehiclesnew() {
        System.out.println("Vehicle Created");
    }

    void run() {
        System.out.println("Vehicle is running");
    }
}


class Bike extends Vehiclesnew {
    Bike() {
        super();
        System.out.println("Bike Created");
    }

    void run() {
        System.out.println("Bike is running");
    }
}


public class Polyq4 {

	public static void main(String[] args) {
		Bike b = new Bike();
        b.run();

	}

}
