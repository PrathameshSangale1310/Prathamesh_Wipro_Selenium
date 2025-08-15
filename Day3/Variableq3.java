package Assignment3;

public class Variableq3 {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		System.out.println("Value of a before swapping is: "+a);
		System.out.println("Value of b before swapping is: "+b);
		
		int c=a;
		
		a=b;
		b=c;
		c=a;
		
		System.out.println("Value of a after swapping is: "+a);
		System.out.println("Value of b after swapping is: "+b);

	}

}
