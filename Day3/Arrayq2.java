package Assignment3;

public class Arrayq2 {

	public static void main(String[] args) {
		int[] arr= {10,15,20,25,30};
		int even_count=0;
		int odd_count=0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		}
		
		System.out.println("Even number count is: "+even_count);
		System.out.println("Odd number count is: "+odd_count);

	}

}
