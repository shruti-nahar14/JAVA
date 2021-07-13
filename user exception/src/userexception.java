import java.util.Scanner;
public class userexception {
	public static void openAccount(int accno,String name,double accbal,int age,double mobno)
	{
		try
		{
			if(accbal<1000)
			{
			throw new invalidbalexception(accbal);
			}
			System.out.println("you can open new account ");
		try
		{
			if(age<18)
			{
			throw new invalidexception1( age);
			}
			System.out.println("you can recieve ATM CARD");
		}
		catch(invalidexception1 ex)
		{
			System.out.println("exception is "+ex);
		}
		try
		{
			if(mobno!=10)
			{
				throw new invalidmobexception();
			}
		}
		catch(invalidmobexception e)
		{
			System.out.println(e);
		}
		}
		catch(invalidbalexception ex)
		{
			System.out.println("exception is "+ex);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the accno ");
		int accno=sc.nextInt();
		System.out.println("Enter the name ");
		String name=sc.next();
		System.out.println("Enter the accbal ");
		double accbal=sc.nextDouble();
		System.out.println("Enter the age ");
		int age=sc.nextInt();
		System.out.println("Enter the mob no ");
		double mobno=sc.nextDouble();
		openAccount(accno,name,accbal,age,mobno);
		//System.out.println("Your acc is opened successfully....");
		System.out.println("THANKYOU------VISITAGAIN.....");
	}

}
