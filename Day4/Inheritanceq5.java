package Assignment4;

class Hospital
{
	void name(String name) {
		System.out.println("Name of the Hospital is: "+name);
	}
}

class Doctor extends Hospital
{
	void typeofdoc(String ty)
	{
		System.out.println("Type: "+ty);
	}
	
}

class Nurse extends Hospital
{
	void name(String name)
	{
		System.out.println("Name: "+name);
	}
	
}

class Accountant extends Hospital
{
	void name(String name)
	{
		System.out.println("Name of the accountant: "+name);
	}
}

class Cardiac extends Doctor
{
	void speciality(String name)
	{
		System.out.println("Cardiac");
	}
}
class Endo extends Doctor
{
	void endo(String name)
	{
		System.out.println("Endo");
	}
}
class Gyno extends Doctor
{
	void gyno(String name)
	{
		System.out.println("Gyno");
	}
}

class Operation extends Cardiac
{
	void sp(String name)
	{
		System.out.println("Speciality: "+name);
	}
}


class OPD extends Cardiac
{
	void sp(String name)
	{
		System.out.println("Speciality: "+name);
	}
}


class Payments extends Accountant
{
	void pay()
	{
		System.out.println("Payment");
	}
	
}

class Documentation extends Accountant
{
	void docs()
	{
		System.out.println("Documetation");
	}
	
}

public class Inheritanceq5 {

	public static void main(String[] args) {
		
		Hospital h = new Hospital();
		h.name("XYZ");
		
		Doctor d = new Doctor();
		d.typeofdoc("Cardiac");
		
		Cardiac c = new Cardiac();
		
		c.speciality("Cardiac Doctor");
		
		
		Payments p = new Payments();
		p.pay();
		
		
		Accountant a = new Accountant();
		a.name("ABC");
		
		
		

	}

}
