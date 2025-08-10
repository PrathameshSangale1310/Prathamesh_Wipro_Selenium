package Assignment4;

class After_12th
{
	void show()
	{
		System.out.println("12th");
	}
}

class Engineering extends After_12th
{
	void eng()
	{
		System.out.println("Engineeering");
	}
}


class Medical extends After_12th
{
	void med()
	{
		System.out.println("Medical");
	}
}

class Other_courses extends After_12th
{
	void OC()
	{
		System.out.println("Other Courses");
	}
}


class IT extends Engineering
{
	void it()
	{
		System.out.println("IT");
	}
}

class Mechanical extends Engineering
{
	void mech()
	{
		System.out.println("Mechanical");
	}
}

class CS extends Engineering
{
	void cs()
	{
		System.out.println("Computer Science");
	}
}

class MBBS extends Medical
{
	void mbbs()
	{
		System.out.println("MBBS");
	}
}

class BDS extends Medical
{
	void bds()
	{
		System.out.println("BDS");
	}
}

class BBA extends Other_courses
{
	void bba()
	{
		System.out.println("BBA");
	}
}


class BCA extends Other_courses
{
	void bca()
	{
		System.out.println("BCA");
	}
}


public class Inheritanceq4 {

	public static void main(String[] args) {
		System.out.println("*****Engineering*****");
		CS c = new CS();
		c.eng();
		c.cs();
		System.out.println("*****Medical*****");
		MBBS mb = new MBBS();
		mb.med();
		mb.mbbs();
		System.out.println("*****BBA*****");
		BBA b=new BBA();
		b.OC();
		b.bba();

	}

}
