package Assignment7;

public class Q7 {
	public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap method: a = " + a + ", b = " + b);
    }
	
	public static void main(String[] args) {
		int x = 5, y = 10;
        System.out.println("Before swap method: x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("After swap method: x = " + x + ", y = " + y);

	}

}
