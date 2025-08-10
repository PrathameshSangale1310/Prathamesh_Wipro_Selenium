package Assignment4;

class Vehicle
{
	void name(String name)
	{
		System.out.println("Name: "+name);
	}
}


class Four_wheeler extends Vehicle
{
	void typeofcar(String ty)
	{
		System.out.println("Type: "+ty);
	}
}

class Petrol_four_wheeler extends Four_wheeler
{
	void average_of_car(int av)
	{
		System.out.println("Average: "+av);
	}
}

class FiveSeater_Petrol_four_wheeler extends Petrol_four_wheeler
{
	void seater(int seats)
	{
		System.out.println("No of seats: "+seats);
	}
}

class Baleno_FiveSeater_Petrol_four_wheeler extends FiveSeater_Petrol_four_wheeler
{
	void color(String color)
	{
		System.out.println("Color of car is: "+color);
	}
}


public class Inheritanceq1 {

	public static void main(String[] args) {
		Baleno_FiveSeater_Petrol_four_wheeler b = new Baleno_FiveSeater_Petrol_four_wheeler();
		b.name("Baleno");
		b.typeofcar("Petrol");
		b.average_of_car(26);
		b.seater(5);
		b.color("Red");

	}

}
