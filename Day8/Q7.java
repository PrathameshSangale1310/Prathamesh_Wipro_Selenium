package Assignment8;

import java.util.ArrayList;
import java.util.Iterator;

public class Q7 {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Kolkata");

        Iterator<String> iterator = cities.iterator();

        System.out.println("List of Cities:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}

}
