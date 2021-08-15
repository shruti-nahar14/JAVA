package bankmain;

public class Account1 {
	private int accid;
	private String acctype;
	private double accbal;
	public Account1(int accid, String acctype, double accbal) 
	{
		this.accid = accid;
		this.acctype = acctype;
		this.accbal = accbal;
	}
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public double getAccbal()
	{
		if(acctype=="Saving" )
		{
			if(accbal<1000 )
			{
				try
				{
					throw new NumberFormatException();
				}
				catch(NumberFormatException e)
				{
					System.out.println("Insufficient Balance "+accbal);
					System.out.println("You have to deposit Minimum 1000 to open acc/perform transaction");
				}
			}
		}
			else if(acctype=="Current" )
			{
				if(accbal<5000)
				{
					try
					{
						throw new NumberFormatException();
					}
					catch(NumberFormatException e)
					{
						System.out.println("Insufficient Balance "+accbal);
						System.out.println("You have to deposit Minimum 5000 to open acc/perform transaction ");
					}
				}
			}
		return accbal;
	}
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	
}
