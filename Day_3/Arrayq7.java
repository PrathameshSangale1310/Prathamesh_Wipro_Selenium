package Assignment3;

public class Arrayq7 {

	public static void main(String[] args) {
		int[] arr = {5, 10, 15, 20, 25, 10, 5, 30};

        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
	}

}
