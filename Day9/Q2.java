package Assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    public String toString() {
        return id + " - " + name + " - ₹" + price;
    }
}

public class Q2 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
        list.add(new Product(101, "Laptop", 55000));
        list.add(new Product(102, "Tablet", 25000));
        list.add(new Product(103, "Monitor", 15000));
        list.add(new Product(104, "Phone", 30000));

        Collections.sort(list);

        for (Product p : list) {
            System.out.println(p);
        }

	}

}
