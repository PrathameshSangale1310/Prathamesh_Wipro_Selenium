package Assignment3;

public class Stringq10 {

	public static void main(String[] args) {
		String str = "Prathamesh";
		String s = str.toLowerCase()
;		
		char[] chars = s.toCharArray();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] > chars[i]) {
                char temp = chars[i - 1];
                chars[i - 1] = chars[i];
                chars[i] = temp;
                i = 0;
            }
        }

        String sorted = new String(chars);
        System.out.println("Sorted String: " + sorted);

	}

}
