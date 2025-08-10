package Assignment7;

public class Q8 {
	public static void modifyValues(int a, double b, char c) {
        a = 100;
        b = 3.14;
        c = 'Z';
        System.out.println("Inside method: a = " + a + ", b = " + b + ", c = " + c);
    }

	public static void main(String[] args) {
		int x = 10;
        double y = 1.23;
        char z = 'A';

        System.out.println("Before method call: x = " + x + ", y = " + y + ", z = " + z);
        modifyValues(x, y, z);
        System.out.println("After method call: x = " + x + ", y = " + y + ", z = " + z);

	}

}
