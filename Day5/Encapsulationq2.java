package Assignment5;

public class Encapsulationq2 {

	private double width;
    private double height;

    public Encapsulationq2(double width, double height) {
        this.width = (width > 0) ? width : 1.0;
        this.height = (height > 0) ? height : 1.0;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void displayDetails() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
	public static void main(String[] args) {
		Encapsulationq2 r1 = new Encapsulationq2(10, 5);
        r1.displayDetails();

        Encapsulationq2 r2 = new Encapsulationq2(-8, 0);
        r2.displayDetails();

        r2.setWidth(6);
        r2.setHeight(4);
        r2.displayDetails();

	}

}
