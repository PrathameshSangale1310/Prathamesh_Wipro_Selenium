package Assignment8;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q45 {

	public static void main(String[] args) {
		Deque<String> orderQueue = new ArrayDeque<>();

        orderQueue.addFirst("ItemA");
        System.out.println("After addFirst(ItemA): " + orderQueue);

        orderQueue.addLast("ItemB");
        System.out.println("After addLast(ItemB): " + orderQueue);

        orderQueue.addFirst("ItemC");
        System.out.println("After addFirst(ItemC): " + orderQueue);

        orderQueue.addLast("ItemD");
        System.out.println("After addLast(ItemD): " + orderQueue);

        orderQueue.removeFirst();
        System.out.println("After removeFirst(): " + orderQueue);

        orderQueue.removeLast();
        System.out.println("After removeLast(): " + orderQueue);

	}

}
