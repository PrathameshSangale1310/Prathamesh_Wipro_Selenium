package Assignment3;

public class Arrayq12 {

	public static void main(String[] args) {
		int[] arr = {5, 10, 5, 20, 10, 25, 30, 5};
        int n = arr.length;
        int[] rev = new int[n];

        for(int i=0;i<n;i++)
        {
        	rev[i]=arr[n-i-1];

        }
        
        for(int x: rev)
        {
        	System.out.print(x+" ");        	
        }

	}

}
