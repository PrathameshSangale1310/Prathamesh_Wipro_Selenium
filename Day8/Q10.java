package Assignment8;

import java.util.LinkedList;

public class Q10 {

	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("List of Colors:");
        for (String color : colors) {
            System.out.println(color);
        }

	}

}
