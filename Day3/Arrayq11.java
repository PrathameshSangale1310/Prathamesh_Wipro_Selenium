package Assignment3;

public class Arrayq11 {

	public static void main(String[] args) {
		int[] arr = {5, 10, 5, 20, 10, 25, 30, 5};
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println("Element " + arr[i] + " occurs " + count + " times.");
        }

	}

}
