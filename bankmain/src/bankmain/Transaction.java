package bankmain;

public class Transaction {

	public void deposit(Account1 a,double amount)
	{
		  if(amount>0)
		  {
		double bal=a.getAccbal()+amount;
		a.setAccbal(bal);
		System.out.println("Upadated Balance is "+bal);
		}
		else
		{
			try
			{
				throw new NumberFormatException();
			}
			catch(NumberFormatException e)
			{
				System.out.println("Negative Amount is Invalid Cant be deposite ");
			}
		}
	}
	public void withdrawl(Account1 a,double amount)
	{
		if(a.getAcctype()=="Saving" )
		{
			if( amount>a.getAccbal())
			{
				try
				{
					throw new NumberFormatException();
				}
				catch(NumberFormatException e)
				{
					System.out.println("Insufficient Balance "+a.getAccbal());
				}
			}
		}
			else if(a.getAcctype()=="Current")
			{
				if(amount>a.getAccbal())
				{
					try
					{
						throw new NumberFormatException();
					}
					catch(NumberFormatException e)
					{
						System.out.println("Insufficient Balance "+a.getAccbal());
					}
				}
			}
		else
		{
			double bal=a.getAccbal()-amount;
			a.setAccbal(bal);
			System.out.println("Updated Balance is "+bal);
		}
	}
}
