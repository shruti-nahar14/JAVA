
public class synchronizedmain {
	public static void main(String[] args)
	{
		Mobile m=new Mobile();
		User u1=new User(m,"Shruti");
		User u2=new User(m,"Rahul");
		u1.start();
		u2.start();
	}

}
