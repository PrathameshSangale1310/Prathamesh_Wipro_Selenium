package Assignment8;

import java.util.Vector;

public class Q22 {

	public static void main(String[] args) {
		Vector<String> names = new Vector<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("Original Vector: " + names);

        String searchName = "Charlie";
        if (names.contains(searchName)) {
            System.out.println(searchName + " exists in the vector.");
        } else {
            System.out.println(searchName + " does not exist in the vector.");
        }

        int index = names.indexOf("Bob");
        if (index != -1) {
            names.set(index, "Brian");
            System.out.println("After replacing 'Bob' with 'Brian': " + names);
        }

        names.clear();
        System.out.println("Vector after clearing: " + names);

	}

}
