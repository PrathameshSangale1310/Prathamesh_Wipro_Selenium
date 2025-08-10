package Assignment5;

import java.util.function.Function;

public class Lamdaq5 {

	public static void main(String[] args) {
		Function<String, String> toUpperCase = s -> s.toUpperCase();
        Function<String, String> toLowerCase = s -> s.toLowerCase();
        String input = "Hello how are you?";
        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + toUpperCase.apply(input));
        System.out.println("Lowercase: " + toLowerCase.apply(input));

	}

}
