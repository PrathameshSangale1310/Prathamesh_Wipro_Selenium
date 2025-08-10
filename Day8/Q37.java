package Assignment8;

import java.util.TreeSet;

public class Q37 {

	public static void main(String[] args) {
		TreeSet<String> countries = new TreeSet<>((a, b) -> b.compareTo(a));

        countries.add("India");
        countries.add("Australia");
        countries.add("Germany");
        countries.add("Brazil");
        countries.add("Canada");

        System.out.println("Countries in reverse alphabetical order:");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}