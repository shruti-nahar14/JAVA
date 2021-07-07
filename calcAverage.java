/////////////////////////////
/*class:calcAverage
 *Input:Enter the N Natural -1 
 *Output:-1 is not a Natural Number
 *Description:IllegalArgumentException() is throw if N pass as argument is not a natural number  
 *Date:7-July-2021
 *Author Name:Shruti Nahar
 */
////////////////////////////
import java.util.Scanner;

public class calcAverage {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N Natural Number ");
		int N=sc.nextInt();
		calcAverage a=new calcAverage();
		 a.avgFrist(N);
	}
	public static double avgFrist(int N)
	{
		int sum=0;
		float avg;
		try
		{
			if(N<=0)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				for(int i=1;i<N;i++)
				{
					sum=sum+i;
				}
				avg=sum/N;
				System.out.println("Sum is "+sum);
				System.out.println("Avg is "+avg);
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(N+" is not a Natural Number ");
		}
		return N;
	}

}
