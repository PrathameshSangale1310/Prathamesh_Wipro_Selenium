package Assignment5;

interface Printer {
    void print(String document);
}

class LaserPrinter implements Printer {
    public void print(String document) {
        System.out.println("LaserPrinter: " + document);
    }
}

class InkjetPrinter implements Printer {
    public void print(String document) {
        System.out.println("InkjetPrinter: " + document);
    }
}

public class Interfaceq3 {

	public static void main(String[] args) {
		Printer p;
        p = new LaserPrinter();
        p.print("Document A");

        p = new InkjetPrinter();
        p.print("Document B");

	}

}
