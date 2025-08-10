package Assignment8;

import java.util.HashSet;

public class Q30 {

	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Kolkata");
        cities.add("Bangalore");

        System.out.println("Original HashSet: " + cities);

        cities.remove("Chennai");
        System.out.println("After removing 'Chennai': " + cities);

        String searchCity = "Delhi";
        if (cities.contains(searchCity)) {
            System.out.println(searchCity + " exists in the HashSet.");
        } else {
            System.out.println(searchCity + " does not exist in the HashSet.");
        }

        cities.clear();
        System.out.println("HashSet after clearing: " + cities);
        System.out.println("Is HashSet empty? " + cities.isEmpty());

	}

}
