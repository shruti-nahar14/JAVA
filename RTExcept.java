////////////////////////////
/*class: RTExcept
*Input:--
*Output:hello
        throw
        caught
        finally
        after
*Description:.Implementation of Exception
*Date:20-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
package a;

public class RTExcept {
	public static void throwit()
	{
		System.out.println("throw");
		throw new RuntimeException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("hello");
			throwit();
			
		}
		catch(Exception re)
		{
			System.out.println("caught");
		}
		finally
		{
			System.out.println("finally");
			
		}
		System.out.println("after");

	}

}
