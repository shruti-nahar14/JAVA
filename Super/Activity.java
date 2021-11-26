package Super;

public class Activity extends Calculator {
	public Activity()
	{
		super();
	}
   public void add()
   {
	   
	   super.doCalculation(10d,200d);
	   System.out.println("Addition is "+super.doCalculation(10,20));
   }
}
