package Assignment7;

public class Q16 extends Thread {

	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}

    public static void main(String[] args) {
        Q16 t = new Q16();
        
        t.start();
    }

}
