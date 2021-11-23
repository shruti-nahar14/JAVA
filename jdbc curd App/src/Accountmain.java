import java.util.Scanner;

public class Accountmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Accountinfo info=new Accountinfo();
		int i=0;
		System.out.println("1.CREATEACC \n2.DELETEACC \n3.RETRIEVEACC \n4.UPDATEACC \n5.DISPLAYACC");
		do
		{
			System.out.println("Enter your choice ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Accno Custname Accbal ");
				Account a=new Account(sc.nextInt(),sc.next(),sc.nextInt());
				i=info.createacc(a);
				if(i>0)
				{
					System.out.println("RECORD SAVE ");
				}
				else
				{
					System.out.println("RECORD ABSENT ");
				}
				break;
		  case 2:
			  System.out.println("Enter the Accno to be deleted ");
			  int accno=sc.nextInt();
			  i=info.deleteacc(accno);
			  if(i>0)
			  {
				  System.out.println("RECORD DELETED ");
			  }
			  else
			  {
				  System.out.println("RECORD NOT DELETED ");
			  }
			break;
			}
			System.out.println("Do you want to continue ");
		}while(sc.next().equals("yes"));

	}

}
