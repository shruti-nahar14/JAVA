import java.util.Scanner;
public class Exceptionhandling {

	public static void main(String[] args) {
		int n1,n2,ans;
		Scanner sc=new Scanner(System.in);
		try {
			n1=Integer.parseInt(args[0]);
			n2=Integer.parseInt(args[1]);
			System.out.println("Hello... ");
			ans=n1/n2;
			System.out.println("Answer is "+ans);
		} 
		catch (NumberFormatException  ex) 
		{
			System.out.println("Exception is "+ex);
			// TODO: handle exception
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception is "+ex);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("exception is "+ex);
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex);
		}
		finally
		{
			System.out.println("Thankyou");
		}

	}

}
