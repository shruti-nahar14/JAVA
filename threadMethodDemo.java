
public class threadMethodDemo extends Thread
{ 
	private String str;

	public threadMethodDemo(String str) {
		super();
		this.str = str;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Running "+str);
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
