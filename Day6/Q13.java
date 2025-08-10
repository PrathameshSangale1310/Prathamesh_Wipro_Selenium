package Assignment6;

enum Operation {
    PLUS {
        public double eval(double a, double b) { return a + b; }
    },
    MINUS {
        public double eval(double a, double b) { return a - b; }
    },
    TIMES {
        public double eval(double a, double b) { return a * b; }
    },
    DIVIDE {
        public double eval(double a, double b) {
            if (b == 0) throw new ArithmeticException("Cannot divide by zero");
            return a / b;
        }
    };

    public abstract double eval(double a, double b);
}

public class Q13 {

	public static void main(String[] args) {
		double x = 20, y = 5;

        for (Operation op : Operation.values()) {
            System.out.println(op + ": " + op.eval(x, y));
        }

	}

}
