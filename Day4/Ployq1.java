package Assignment4;

class Calculator
{
	void add(int a, int b)
	{
		System.out.println("Two integer sum: "+(a+b));
	}
	
	void add(int a, int b, int c)
	{
		System.out.println("Three integer sum: "+(a+b+c));
	}
	
	void add(double a, double b)
	{
		System.out.println("Two double integer sum: "+(a+b));
	}
}

public class Ployq1 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(5, 5);
		c.add(10,20,30);
		c.add(123.5d, 145.5d);
	}

}
