package Assignment5;

import java.util.function.Predicate;

public class Lamdaq3 {

	public static void main(String[] args) {
		Predicate<String> isEmpty = s -> s.isEmpty();
        String str1 = "";
        String str2 = "Prathamesh";

        System.out.println("str1 empty? " + isEmpty.test(str1));
        System.out.println("str2 empty? " + isEmpty.test(str2));

	}

}
