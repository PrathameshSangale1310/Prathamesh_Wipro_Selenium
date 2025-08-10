package Assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Products {
    int id;
    String name;
    double price;

    Products(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + " - " + name + " - ₹" + price;
    }
}

class PriceAscComparator implements Comparator<Products> {
    public int compare(Products p1, Products p2) {
        return Double.compare(p1.price, p2.price);
    }
}

class PriceDescComparator implements Comparator<Products> {
    public int compare(Products p1, Products p2) {
        return Double.compare(p2.price, p1.price);
    }
}

class NameComparator implements Comparator<Products> {
    public int compare(Products p1, Products p2) {
        return p1.name.compareToIgnoreCase(p2.name);
    }
}

public class Q7 {
    public static void main(String[] args) {
        List<Products> products = new ArrayList<>();
        products.add(new Products(101, "Mouse", 300.00));
        products.add(new Products(102, "Keyboard", 1000.00));
        products.add(new Products(103, "Monitor", 15000.00));
        products.add(new Products(104, "Laptop", 75000.00));

        System.out.println("Original list:");
        products.forEach(System.out::println);

        Collections.sort(products, new PriceAscComparator());
        System.out.println("\nSorted by Price (Ascending):");
        products.forEach(System.out::println);

        Collections.sort(products, new PriceDescComparator());
        System.out.println("\nSorted by Price (Descending):");
        products.forEach(System.out::println);

        Collections.sort(products, new NameComparator());
        System.out.println("\nSorted by Name (Alphabetical):");
        products.forEach(System.out::println);
    }
}