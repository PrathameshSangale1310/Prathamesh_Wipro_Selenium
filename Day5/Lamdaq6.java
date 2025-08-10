package Assignment5;

import java.util.Arrays;
import java.util.List;

public class Lamdaq6 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "kiwi", "grape", "orange");
        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Sorted by length: " + words);
        words.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted alphabetically: " + words);

	}

}
