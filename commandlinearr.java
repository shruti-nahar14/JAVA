////////////////////////////////////////////////////////
//Input:--
//Output:ADDITION IS 15
//Description:Use of CommandLine Argument to sum array elements
//Date:13-june-2021
//Author: Shruti Nahar
///////////////////////////////////////////////////////
package commandline2;

public class commandlinearr {
	public static void main(String[] args)
	{
		int sum=0;
		int arr[]=new int[args.length];
		for(int i=args.length-1;i>=0;i--)
		{
			System.out.println(args[i]);
			 sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("sum is "+sum);
	}

}
