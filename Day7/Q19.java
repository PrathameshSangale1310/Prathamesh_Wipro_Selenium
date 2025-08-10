package Assignment7;

public class Q19 {

	public static void main(String[] args) {
		try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }

	}

}
