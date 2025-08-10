package Assignment3;

public class Arrayq10 {

	public static void main(String[] args) {
		int[] arr = {45, 10, 13, 20, 7, 5};
		int n = arr.length;
		
		for(int i=0;i<n;i++)
		{
			int x = arr[i];
			if(x%2==0)
			{
				continue;
			}
			
			boolean isPrime=true;
			if (x < 2) {
				
                isPrime = false;
            } 
			else
			{
				for(int j=2;j*j<=(x);j++)
				{
					if(x%j==0)
					{
						isPrime=false;
						break;
					}
				}
			}
			
			if(isPrime)
			{
				System.out.println(x);
			}
		}

	}

}
