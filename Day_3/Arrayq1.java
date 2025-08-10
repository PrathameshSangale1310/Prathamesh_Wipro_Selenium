package Assignment3;

public class Arrayq1 {

	public static void main(String[] args) {
float[] per = {74.23f,87.58f,46.1f,37.7f,88.0f,65.21f,45.29f,58.4f,67.76f,76.42f};
		
		float sum=0;
		for(int i=0;i<per.length;i++)
		{
			sum+=per[i];
		}

		System.out.println(sum);
	}

}
