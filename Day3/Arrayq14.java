package Assignment3;

public class Arrayq14 {

	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 2, 5};
		
		int n = arr.length;
		boolean isPalin=true;
		
		for(int i=0;i<n/2;i++)
		{
			if(arr[i]!=arr[n-i-1])
			{
				isPalin=false;
				break;
			}
		}
		
		if(isPalin)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
