/////////////////////////////
/*class:sumrecursion
 *Input:--
 *Output:Sum is 15
 *Description:Display the sum of n numbers using recursion
 *Date:31-July-2021
 *Author Name:Shruti Nahar
 *///////////////////////////////
package practiceset4;

public class sumrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=sum_rec(5);
		System.out.println("Sum is "+sum);
	}
	static int sum_rec(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
		return n+ sum_rec(n-1);
		}
	}

}
