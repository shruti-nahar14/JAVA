/////////////////////////////
/*Input:Enter the no 5
*Output:factorial is 120
*Description: Implementation of sum of number
*Date:3-July-2021
*Author Name:Shruti Nahar
*///////////////////////////////////	
package functionmain;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		factorial(n);
	}
	public static void factorial(int no)
	{
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is "+fact);
	}

}
