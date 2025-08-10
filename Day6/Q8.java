package Assignment6;

enum Shape {
    CIRCLE {
        double area(double... params) {
            if (params.length != 1) throw new IllegalArgumentException("CIRCLE needs 1 parameter: radius");
            double radius = params[0];
            return Math.PI * radius * radius;
        }
    },
    SQUARE {
        double area(double... params) {
            if (params.length != 1) throw new IllegalArgumentException("SQUARE needs 1 parameter: side");
            double side = params[0];
            return side * side;
        }
    },
    RECTANGLE {
        double area(double... params) {
            if (params.length != 2) throw new IllegalArgumentException("RECTANGLE needs 2 parameters: length and width");
            double length = params[0];
            double width = params[1];
            return length * width;
        }
    },
    TRIANGLE {
        double area(double... params) {
            if (params.length != 2) throw new IllegalArgumentException("TRIANGLE needs 2 parameters: base and height");
            double base = params[0];
            double height = params[1];
            return 0.5 * base * height;
        }
    };

    abstract double area(double... params);
}


public class Q8 {

	public static void main(String[] args) {
		for (Shape shape : Shape.values()) {
            double result = 0;
            switch (shape) {
                case CIRCLE:
                    result = shape.area(5);
                    break;
                case SQUARE:
                    result = shape.area(4);
                    break;
                case RECTANGLE:
                    result = shape.area(6, 3);
                    break;
                case TRIANGLE:
                    result = shape.area(5, 2);
                    break;
            }
            System.out.printf("%s area: %.2f%n", shape.name(), result);
        }

	}

}
