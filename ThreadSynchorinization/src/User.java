
public class User extends Thread { 
	private String str;
	private Mobile m;
	public User(Mobile m,String str)
	{
		this.str=str;
		this.m=m;
	}
	public void run()
	{
		synchronized(m)//syncornized block
		{
			m.calling(str);
			m.message();
		}
	}
	

}
