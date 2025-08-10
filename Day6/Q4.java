package Assignment6;


class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching the ball...");
    }
}

public class Q4 {

	public static void main(String[] args) {
		Dog d = new Dog();
        Animal a = d;

        a.makeSound(); 
    

	}

}
