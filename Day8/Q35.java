package Assignment8;

import java.util.TreeSet;

public class Q35 {

	public static void main(String[] args) {
		TreeSet<String> countries = new TreeSet<>();

        countries.add("India");
        countries.add("England");
        countries.add("Sri Lanka");
        countries.add("Australia");
        countries.add("West Indies");

        System.out.println("Sorted list of countries:");
        for (String country : countries) {
            System.out.println(country);
        }

	}

}
