package inheritance;
public class father extends grandfather
{
	private int fage;
	public  father(int fage)
	{
		super(fage+30);
		this.fage=fage;
	}
	public void showage()
	{
		super.showage();
		System.out.println("father age is "+fage);
    }
}
