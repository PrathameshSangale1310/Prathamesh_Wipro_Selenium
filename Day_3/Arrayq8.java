package Assignment3;

public class Arrayq8 {

	public static void main(String[] args) {
		int[] arr = {5, 10, 15, 20, 25, 10, 5, 30};
		int n = arr.length;
		int[] newarr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			newarr[i]=arr[i];
		}
		
		for (int num : newarr) {
            System.out.print(num + " ");
        }
	}

}
