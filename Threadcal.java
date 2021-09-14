
public class Threadcal extends Thread
{
	private int n1;
	private int n2;
	public Threadcal(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void run()
	{
		
		addData();
	}
	public void addData()
	{
		int sum;
		sum=n1+n2;
		System.out.println("Addition is "+sum);
	}

}
