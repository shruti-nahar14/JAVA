import java.util.Scanner;
public class Accountshow {

	public static Account1 create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Accno ");
		int Accno=sc.nextInt();
		System.out.println("Enter the Accname ");
		String Accname=sc.next();
		System.out.println("Enter the Accbal ");
		int Accbal=sc.nextInt();
		Account1 a=new Account1(Accno,Accname,Accbal);
		display(a);
		return a;
	}
	public static void display(Account1 a)
	{
		System.out.println("-----------------------------Account Details---------------------------");
		System.out.println("Account No: "+a.getAccno());
		System.out.println("Account Name: "+a.getAccname());
		System.out.println("Account Bal: "+a.getAccbal());
		
	}

}
