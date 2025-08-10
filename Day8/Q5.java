package Assignment8;

import java.util.ArrayList;

public class Q5 {

	public static void main(String[] args) {
		ArrayList<String> subjects = new ArrayList<>();

        subjects.add("English");
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("History");
        subjects.add("Geography");

        System.out.println("Before update: " + subjects);

        int index = subjects.indexOf("Math");
        if (index != -1) {
            subjects.set(index, "Statistics");
        } else {
            System.out.println("\"Math\" not found in the list.");
        }

        System.out.println("After update: " + subjects);

	}

}
