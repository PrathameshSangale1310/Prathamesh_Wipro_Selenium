package Assignment4;

class Bank
{
	void getInterestRate()
	{
		System.out.println("Interest rate");
	}
}

class SBI extends Bank
{
	void getInterestRate()
	{
		System.out.println("Returns 6.7%");
	}
}


class ICICI extends Bank
{
	void getInterestRate()
	{
		System.out.println("Returns 7.0%");
	}
}

class HDFC extends Bank
{
	void getInterestRate()
	{
		System.out.println("Returns 7.5%");
	}
}
public class Polyq3 {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.getInterestRate();
		
		SBI s = new SBI();
		s.getInterestRate();
		
		ICICI i = new ICICI();
		i.getInterestRate();
		
		HDFC h = new HDFC();
		h.getInterestRate();
		

	}

}
