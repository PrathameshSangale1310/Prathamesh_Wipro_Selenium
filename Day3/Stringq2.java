package Assignment3;

public class Stringq2 {

	public static void main(String[] args) {
		String str="Hello, my name is Prathamesh";
		String result="";
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			char sp=' ';
			
			
			
			if(c==sp)
			{
				result+="-";
			}
			else
			{
				result+=c;
			}
		}
		
		System.out.println(result);

	}

}
