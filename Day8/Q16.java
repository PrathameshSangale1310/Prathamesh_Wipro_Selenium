package Assignment8;

import java.util.LinkedList;
import java.util.ListIterator;

public class Q16 {

	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Chennai");

        System.out.println("Forward Direction:");
        ListIterator<String> iterator = cities.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nReverse Direction:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

	}

}
