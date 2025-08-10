package Assignment7;

class Box {
    int length;

    Box(int length) {
        this.length = length;
    }
}

public class Q9 {
	public static void modifyLength(Box b) {
        b.length = 50;
    }

	public static void main(String[] args) {
		Box myBox = new Box(20);
        System.out.println("Before method call: length = " + myBox.length);
        modifyLength(myBox);
        System.out.println("After method call: length = " + myBox.length);

	}

}
