package Assignment4;

interface Drawable {
    void draws();
}

abstract class Shapes implements Drawable {
    abstract double area();
}

class Circles extends Shapes {
    double radius;

    Circles(double radius) {
        this.radius = radius;
    }

    public void draws() {
        System.out.println("Drawing Circle");
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangles extends Shapes {
    double length, width;

    Rectangles(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void draws() {
        System.out.println("Drawing Rectangle");
    }

    double area() {
        return length * width;
    }
}

class Triangle extends Shapes {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void draws() {
        System.out.println("Drawing Triangle");
    }

    double area() {
        return 0.5 * base * height;
    }
}

public class Combinedq5 {

	public static void main(String[] args) {
		Shapes c = new Circles(5);
        Shapes r = new Rectangles(4, 6);
        Shapes t = new Triangle(3, 7);

        c.draws();
        System.out.println("Area: " + c.area());

        r.draws();
        System.out.println("Area: " + r.area());

        t.draws();
        System.out.println("Area: " + t.area());

	}

}
