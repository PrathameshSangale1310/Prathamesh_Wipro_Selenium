package Assignment7;

public class Q4 {

	public static void main(String[] args) {
		Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("true");
        Boolean b3 = Boolean.valueOf("false");
        Boolean b4 = Boolean.valueOf("hello");

        boolean primitiveBool = b2.booleanValue();

        if (b1) {
            System.out.println("bool1 is true");
        }

        System.out.println("bool2: " + b2);
        System.out.println("bool3: " + b3);
        System.out.println("bool4: " + b4);
        System.out.println("primitiveBool: " + primitiveBool);

	}

}
