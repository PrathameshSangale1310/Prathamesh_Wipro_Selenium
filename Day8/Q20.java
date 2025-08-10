package Assignment8;

import java.util.LinkedList;

public class Q20 {

	public static void main(String[] args) {
		LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(30);
        originalList.add(40);
        originalList.add(50);

        LinkedList<Integer> clonedList = (LinkedList<Integer>) originalList.clone();

        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List: " + clonedList);

	}

}
