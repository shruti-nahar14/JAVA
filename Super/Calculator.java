package Super;

public class Calculator {
     
	public Calculator()
	{
		System.out.println("Parent Class Constructor....");
	}
	
	public int doCalculation(int x,int y)
	{
		int z=x+y;
		return z;
	}
	public float doCalculation(int x,float y)
	{
		float z=x+y;
		return z;
	}
	public void doCalculation(double x,double y)
	{
		double ans=x*y;
		System.out.println("Multiplication is "+ans);
	}
}
