package Assignment7;

class IntWrapper {
    int value;
    IntWrapper(int value) {
        this.value = value;
    }
}

public class Q15 {
	public static void modify(IntWrapper w) {
        w.value = 99;
    }

    public static void main(String[] args) {
        IntWrapper wrapper = new IntWrapper(10);
        System.out.println("Before modify: " + wrapper.value);
        modify(wrapper);
        System.out.println("After modify: " + wrapper.value);
    }

}
