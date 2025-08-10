package Assignment9;

import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("dog");
        words.add("cat");
        words.add("monkey");
        words.add("cow");
        words.add("hen");

        System.out.println("Before sorting:");
        for (String word : words) {
            System.out.println(word);
        }

        Collections.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        System.out.println("\nSorted by Length (Ascending):");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
