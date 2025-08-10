package Assignment8;

import java.util.Stack;

public class Q25 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack after pushes: " + stack);

        int popped = stack.pop();
        System.out.println("Popped element: " + popped);

        int top = stack.peek();
        System.out.println("Top element after pop: " + top);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

	}

}
