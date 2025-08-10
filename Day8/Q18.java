package Assignment8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q18 {

	public static void main(String[] args) {
		 LinkedList<String> linkedList = new LinkedList<>();
	        linkedList.add("Red");
	        linkedList.add("Blue");
	        linkedList.add("Green");
	        linkedList.add("Yellow");
	        linkedList.add("Purple");

	        List<String> arrayList = new ArrayList<>(linkedList);

	        System.out.println("LinkedList: " + linkedList);

	        System.out.println("ArrayList: " + arrayList);

	}

}
