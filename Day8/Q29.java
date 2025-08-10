package Assignment8;

import java.util.HashSet;
import java.util.Iterator;

public class Q29 {

	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Kolkata");
        cities.add("Bangalore");

        boolean added = cities.add("Delhi");

        if (!added) {
            System.out.println("Duplicate city 'Delhi' was not added.");
        }

        System.out.println("Cities in HashSet:");
        Iterator<String> itr = cities.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

	}

}
