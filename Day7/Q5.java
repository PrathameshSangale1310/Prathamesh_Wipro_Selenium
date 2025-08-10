package Assignment7;

public class Q5 {

	public static void main(String[] args) {
		Integer num = null;
        Double dbl = null;
        Boolean bool = null;

        System.out.println("Integer: " + num);
        System.out.println("Double: " + dbl);
        System.out.println("Boolean: " + bool);

        try {
            int primitiveInt = num;
        } catch (NullPointerException e) {
            System.out.println("Null cannot be unboxed to primitive int");
        }

        try {
            boolean primitiveBool = bool;
        } catch (NullPointerException e) {
            System.out.println("Null cannot be unboxed to primitive boolean");
        }

	}

}
