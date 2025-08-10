package Assignment5;

public class Interfaceq1 implements CharSequence {
    final String s;

    Interfaceq1(String s) {
        this.s = s;
    }

    void display() {
        System.out.println(s.length());
    }

    
    public int length() {
        return s.length();
    }

    
    public char charAt(int index) {
        return s.charAt(s.length() - 1 - index);
    }

    
    public CharSequence subSequence(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = end - 1; i >= start; i--) {
            sb.append(charAt(i));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return new StringBuilder(s).reverse().toString();
    }


    public static void main(String[] args) {
    	Interfaceq1 bs = new Interfaceq1("hello");
        System.out.println(bs.toString());
        System.out.println(bs.length());
        System.out.println(bs.charAt(1));
        System.out.println(bs.subSequence(1, 4));
    }
}