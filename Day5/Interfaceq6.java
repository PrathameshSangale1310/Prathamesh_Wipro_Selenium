package Assignment5;

interface Polygon {
    double getArea();

    default double getPerimeter(int... sides) {
        int sum = 0;
        for (int side : sides) {
            sum += side;
        }
        return sum;
    }

    static String shapeInfo() {
        return "Polygons are 2D shapes with straight sides.";
    }
}

class Rectangle implements Polygon {
    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    
    public double getArea() {
        return length * width;
    }
}

class Triangle implements Polygon {
    private int base, height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}


public class Interfaceq6 {

	public static void main(String[] args) {
		Polygon rect = new Rectangle(10, 5);
        Polygon tri = new Triangle(6, 4);

        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Rectangle Perimeter: " + rect.getPerimeter(10, 5, 10, 5));

        System.out.println("Triangle Area: " + tri.getArea());
        System.out.println("Triangle Perimeter: " + tri.getPerimeter(5, 6, 7));

        System.out.println("Polygon Info: " + Polygon.shapeInfo());

	}

}
