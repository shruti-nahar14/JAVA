
public class Mobile {
	public synchronized void calling(String str)
	{
		System.out.println("Start Call "+str);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End Call "+str);
	}
	public void message()
	{
		System.out.println("Send Msg ");
	}

}
