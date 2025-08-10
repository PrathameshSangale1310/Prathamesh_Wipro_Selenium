package Assignment7;

class Persons {
    String name;

    Persons(String name) {
        this.name = name;
    }
}


public class Q12 {
	public static void changeReference(Persons p) {
        p = new Persons("Changed");  // This changes the reference, not the original object
    }

	public static void main(String[] args) {
		Persons person = new Persons("Original");
        System.out.println("Before method call: " + person.name);
        changeReference(person);
        System.out.println("After method call: " + person.name);
	}

}
