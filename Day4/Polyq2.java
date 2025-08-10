package Assignment4;

class Shape
{
	void area()
	{
		System.out.println("This is area");
	}
}

class Circle extends Shape
{
	void area()
	{
		int l=5;
		System.out.println("Arae of Square is:"+(l*l));
	}
}

class Rectangle extends Shape
{
	void area()
	{
		int l=5;
		int b=10;
		System.out.println("Arae of Rectangle is:"+(l*b));
	}
}

public class Polyq2 {

	public static void main(String[] args) {
		Shape s= new Shape();
		s.area();
		Circle c = new Circle();
		c.area();
		Rectangle r = new Rectangle();
		r.area();
	}

}
