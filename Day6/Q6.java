package Assignment6;
enum days{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

public class Q6 {

	public static void main(String[] args) {
		days d = days.MONDAY;
		
		switch(d)
		{
			case MONDAY: System.out.println("It is Monday");
			break;
			case TUESDAY: System.out.println("It is Tuesday");
			break;
			case WEDNESDAY: System.out.println("It is Wednesday");
			break;
			case THURSDAY: System.out.println("It is Thursday");
			break;
			case FRIDAY: System.out.println("It is Friday");
			break;
			case SATURDAY: System.out.println("It is Saturday");
			break;
			case SUNDAY: System.out.println("It is Sunday");
			break;
		}
		
		if(d==days.SUNDAY || d==days.SATURDAY)
		{
			System.out.println("Weekend");
		}
		else
		{
			System.out.println("Weekday");
		}

	}

}
