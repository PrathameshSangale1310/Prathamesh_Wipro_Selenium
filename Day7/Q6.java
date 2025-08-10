package Assignment7;

public class Q6 {
	public static void changeValue(int num) {
        num = 50;
    }
	public static void main(String[] args) {
		int original = 10;
        System.out.println("Before method call: " + original);
        changeValue(original);

	}

}
