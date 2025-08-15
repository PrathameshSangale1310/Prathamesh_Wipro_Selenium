package Assignment3;

public class Arrayq15 {

	public static void main(String[] args) {
		int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
        int n = arr.length;

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\n\nOdd Numbers:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
	}

}
