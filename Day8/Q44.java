package Assignment8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Q44 {
	
	public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                deque.addLast(Character.toLowerCase(ch));
            }
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String input = sc.nextLine();
        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
