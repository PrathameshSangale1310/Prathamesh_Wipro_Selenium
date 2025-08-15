package Assignment3;

public class Arrayq3 {

	public static void main(String[] args) {
		int[] arr= {10,15,7,20,25,30};
		int max=arr[0];
		int min=arr[0];
		
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("Maximum elementof the array is: "+max);
		System.out.println("Minimum elementof the array is: "+min);
		
		

	}

}
