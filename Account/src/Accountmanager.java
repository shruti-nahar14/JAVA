import java.util.Scanner;
public class Accountmanager {

		public static Account create()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the accno ");
			int accno=sc.nextInt();
			System.out.println("Enter the acctype ");
			String acctype=sc.next();
			System.out.println("Enter the accbal ");
			double accbal=sc.nextDouble();
			Account obj=new Account(accno,acctype,accbal);
			return obj;
		}
		public static void display(Account am)
		{
			System.out.println("Accno: "+am.getAccno());
			System.out.println("Acctype: "+am.getAcctype());
			System.out.println("Accbal: "+am.getAccbal());
		}

}
