package bankmain;
import java.util.Scanner;
public class bankmain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		customer custarr[]=null;
		bankoperation op=new bankoperation();
		int ch;
		System.out.println("-----------------------WELCOME TO BANK---------------------------");
		do
		{
			System.out.println("\n1.Create \n2.Display \n3.Transaction \n4.Retrieve \n5.Delete");
			 ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				custarr=op.createacc();
				break;
			case 2:
				op.display(custarr);
			    break;
			case 3:
				op.transaction(custarr);
				break;
			case 4:
				op.retrieve(custarr);
				break;
			case 5:
				int i;
				System.out.println("Enter the Custid to be Deleted ");
				int id=sc.nextInt();
				i=op.delete(custarr, id);
				if(i>0)
				{
					System.out.println("Account Deleted.......");
				}
			}
		}while(ch!=6);
		System.out.println("-----------------------THANKYOU----------------------");
	
}
	}
