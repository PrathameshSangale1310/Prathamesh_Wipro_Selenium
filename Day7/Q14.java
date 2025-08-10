package Assignment7;

public class Q14 {

	public static void changeValue(int x) {
        x = 50;
    }
	
	public static void tryToModifyString(String s) {
        s = "Modified";
        System.out.println("Inside method: " + s);
    }

	public static void main(String[] args) {
		
		int a = 10;
        changeValue(a);
        System.out.println("After method call: " + a);
        
        String original = "Original";
        System.out.println("Before method call: " + original);
        tryToModifyString(original);
        System.out.println("After method call: " + original);
	}

}
