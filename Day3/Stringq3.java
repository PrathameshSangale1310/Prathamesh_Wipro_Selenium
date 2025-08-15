package Assignment3;

public class Stringq3 {

	public static void main(String[] args) {
		String s="naman";
		
		String palindrome="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			palindrome+=s.charAt(i);
		}
		
		System.out.println(palindrome);
		
		if(s.equals(palindrome))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
