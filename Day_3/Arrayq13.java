package Assignment3;
import java.util.Arrays;

public class Arrayq13 {

	public static void main(String[] args) {
		int[] arr1 = {5, 2, 8, 1};
        int[] arr2 = {7, 3, 6, 4};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        Arrays.sort(merged);

        System.out.println("Sorted Merged Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }

	}

}
