
public class arithmeticop {
	
	public void add()
	{
		String[] args = null;
		String str1=args[0];
		String str2=args[1];
		int n1=Integer.parseInt(str1);
		int n2=Integer.parseInt(str2);
		int add=n1+n2;
		System.out.println("Addition is "+add);
	}
	public void sub()
	{
		String[] args = null;
		String str1=args[0];
		String str2=args[1];
		int n1=Integer.parseInt(str1);
		int n2=Integer.parseInt(str2);
		int sub=n1-n2;
		System.out.println("substraction is "+sub);
	}
	public void mul()
	{
		String[] args = null;
		String str1=args[0];
		String str2=args[1];
		int n1=Integer.parseInt(str1);
		int n2=Integer.parseInt(str2);
		int mul=n1*n2;
		System.out.println("Multiplication is "+mul);
	}
	public void div()
	{
		String[] args = null;
		String str1=args[0];
		String str2=args[1];
		int n1=Integer.parseInt(str1);
		int n2=Integer.parseInt(str2);
		float div=n1/n2;
		System.out.println("Divsion is "+div);
	}
}
