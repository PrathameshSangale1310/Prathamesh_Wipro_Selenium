package Assignment7;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Q10 {

	public static void updatePerson(Person p) {
        p.name = "Alice";
        p.age = 30;
    }
	public static void main(String[] args) {
		Person person = new Person("Bob", 25);
        System.out.println("Before method call: " + person.name + ", " + person.age);
        updatePerson(person);
        System.out.println("After method call: " + person.name + ", " + person.age);

	}

}
