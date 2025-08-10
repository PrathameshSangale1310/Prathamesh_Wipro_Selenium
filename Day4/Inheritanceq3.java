package Assignment4;

class Hospitals
{
	void name()
	{
		System.out.println("Hospital");
	}
	
}

class Patient extends Hospitals
{
	void patientname()
	{
		System.out.println("Patient");
	}
}
public class Inheritanceq3 {

	public static void main(String[] args) {
		Patient p=new Patient();
		p.patientname();
		p.name();

	}

}
