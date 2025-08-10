	package Assignment5;
	
	interface Even_interface
	{
		boolean isEven(int num);
	}
	
	public class Lamdaq4 {
	
		public static void main(String[] args) {
			Even_interface e = (num)->num%2==0;
			System.out.println(e.isEven(2));
	
		}
	
	}
