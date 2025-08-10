package Assignment3;

public class Stringq5 {

	public static void main(String[] args) {
		String s = "Java";
		boolean istrue=false;
		String new_s=s.toLowerCase();
		
		
			char c1=new_s.charAt(0);
			char c2=new_s.charAt(s.length()-1);
			
			if(c1=='j' && c2=='a')
			{
				istrue=true;
			}
		

		System.out.println(istrue);
	}

}
