package Assignment3;

public class Variableq1 {
	int empid;
	String name;
	static String cmpname="Wipro";
	static String loc="Pune";
	
	void details(int empid1, String name1) {
		empid = empid1;
		name=name1;
		

		
		System.out.println("Employee id ="+empid);
		System.out.println("Name        ="+name);
		System.out.println("Company Name="+cmpname);
		System.out.println("Location    ="+loc);
	}

	public static void main(String[] args) {
		
Variableq1 emp = new Variableq1();
		
		emp.details(111,"Prathamesh");
		System.out.println("*******");
		emp.details(124,"Om");
		

	}

}
