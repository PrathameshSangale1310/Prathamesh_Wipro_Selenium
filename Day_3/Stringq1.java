package Assignment3;

public class Stringq1 {

	public static void main(String[] args) {
		String str="Programming";
		
		int count=0;
		
		String s=str.toLowerCase();
		
		int n = s.length();
		
		for(int i=0;i<n;i++)
		{
			char c=s.charAt(i);
			if(c== 'a' ||  c== 'e' || c== 'i' || c== 'o' || c== 'u')
			{
				count++;
			}
		}
		
		System.out.println(count);
		}

}
