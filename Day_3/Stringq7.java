package Assignment3;

public class Stringq7 {

    public static void main(String[] args) {
        String s = "Prathamesh";

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            freq[c]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}
