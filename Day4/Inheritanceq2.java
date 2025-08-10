package Assignment4;


class Vehiclenew
{
	int speed =70;
	
}

class carnew extends Vehiclenew
{
	int speed=100;
	void showspeed()
	{
		System.out.println("Car normal speed "+speed);
		System.out.println("Vehicle normal speed "+super.speed);
	}
}
public class Inheritanceq2 {

	public static void main(String[] args) {
		carnew c = new carnew();
		c.showspeed();

	}

}
