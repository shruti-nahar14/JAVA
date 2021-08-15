package bankmain;

import java.util.Scanner;

public class bankoperation {
	public customer[] createacc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of customers to open the acc ");
		int n=sc.nextInt();
		customer custarr[]=new customer[n];
		Account1 acc=null;
		for(int i=0;i<custarr.length;i++)
		{
		System.out.println("1.SAVING \n2.CURRENT ");
		int che=sc.nextInt();
		if(che==1)
		{
			System.out.println("To open Acc in bank ");
			System.out.println("Enter the Acc no ");
			int accno=sc.nextInt();
			System.out.println("Enter Acc bal ");
			double accbal=sc.nextDouble();
			System.out.println("Enter the Interest Rate");
			double rate=sc.nextDouble();
			Account1 acc1=new Savingaccount(accno,"Saving",accbal,rate);
			acc=acc1;
		}
		else if(che==2)
		{
			System.out.println("To open Acc in bank ");
			System.out.println("Enter the Acc no ");
			int accno=sc.nextInt();
			System.out.println("Enter Acc bal ");
			double accbal=sc.nextDouble();
			System.out.println("Enter the Companyname");
			String name=sc.next();
		Account1 acc1=new currentacc(accno,"Current",accbal,name);
		acc=acc1;
		}
		System.out.println("Enter the custid ");
		int custid=sc.nextInt();
		System.out.println("Enter the custname ");
		String custname=sc.next();
		System.out.println("Enter the customer mobno ");
		int custmobno=sc.nextInt();
		customer c=new customer(custid,custname,custmobno,acc);
		acc.getAccbal();
		custarr[i]=c;
		
	}
		return custarr;
		
	}
	public void display(customer custarr[])
	{
		for(int i=0;i<custarr.length;i++)
		{
			System.out.println("---------------------CUSTOMER DETAILS----------------------------");
			System.out.println("custid: "+custarr[i].getCustid());
			System.out.println("custname: "+custarr[i].getCustname());
			System.out.println("custmobno: "+custarr[i].getCustmobno());
			System.out.println("--------------------------ACCOUNT DETAILS--------------------------");
			System.out.println("Accid: "+custarr[i].getAcc().getAccid());
			System.out.println("Acctype: "+custarr[i].getAcc().getAcctype());
			System.out.println("Accbal "+custarr[i].getAcc().getAccbal());
			if(custarr[i].getAcc() instanceof Savingaccount )
			{
				Savingaccount sa=(Savingaccount)custarr[i].getAcc();
				System.out.println("InterestRate: "+sa.getInterestrate());
			}
			else if(custarr[i].getAcc() instanceof currentacc )
			{
				currentacc ca=(currentacc)custarr[i].getAcc();
				System.out.println("Company Name: "+ca.getCompanyname());
			}
		}
	}
	public  void transaction(customer cust[])
	{
		
		Scanner sc=new Scanner(System.in);
		boolean b=false;
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Do you want to perform Transaction ");
		String str=sc.next();
		if(str.equals("yes"))
		{
			System.out.println("Enter the custid to perform transaction ");
			int ch=sc.nextInt();
			for(int k=0;k<cust.length;k++)
			{
				if(ch==cust[k].getCustid())
				{
					b=true;
				}
			}
		}
		else if(str.equals("no"))
		{
			b=false;

			System.out.println("NOT TO PREFORM TRANSACTION ");
		}
	if(b)
		{
		
		Transaction t=new Transaction();
do
		{
		System.out.println("1.deposite \n2.withdrawl");
		System.out.println("Enter your choice ");
		int ch1=sc.nextInt();
		if(ch1==1)
		{
			for(int k=0;k<cust.length;k++)
			{
			System.out.println("-------------------------------DEPOSITE----------------------------");
			System.out.println("enter the amount to be deposite ");
			t.deposit( cust[k].getAcc(),sc.nextInt());
			break;
		}
		}
		
		else if(ch1==2)
		{
			for(int k=0;k<cust.length;k++)
			{
			System.out.println("----------------------------WITHDRAWN------------------------------------");
			System.out.println("Enter the amount to be withdraw ");
			int amt=sc.nextInt();
			t.withdrawl(cust[k].getAcc(),amt);
			break;
	        }
	}
     else
     {
    	 System.out.println("INVALID ACCOUNT!!!!");
     }
		System.out.println("DO YOU WANT TO CONTINUE TRANSACTION ");
	}while(sc.next().equals("y"));
		System.out.println("---------------THANKYOU-------------");
}
}
	public int delete(customer cust[],int id)
	{
		int  index=0;
		for(int k=0;k<cust.length;k++)
		{
			if(id==cust[k].getAcc().getAccid())
			{
				index=k;
			    cust[k]=cust[k+1];
				continue;
			}
			else
			{
				System.out.println("ACCOUNT NOT FOUND ");
			}
		}
return index;
}
	public  void retrieve(customer cust[])
	{
		
		Scanner sc=new Scanner(System.in);
		boolean b=false;
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Enter the custid to be searched ");
			int ch=sc.nextInt();
			for(int k=0;k<cust.length;k++)
			{
				if(ch==cust[k].getCustid())
				{
					b=true;
					break;
				}
			}
		
	if(b)
		{
		System.out.println("Account Found");
		}
	else
	{
		System.out.println("Account not Found");
	}
}
}
