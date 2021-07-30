/////////////////////////////
/*class: fiboniccrecursion
 *Input:enter the n
       10
 *Output:0 1 1 2 3 5 8 13 21 34     
 *Description:Display the fibonicc series using recursion
 *Date:30-July-2021
 *Author Name:Shruti Nahar
 *///////////////////////////////
package practiceset4;

import java.util.Scanner;

public class fiboniccrecursion {
	static int first=0;
	static int second=1;
	static int next=0;
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the n");
		int n=sc.nextInt();
		System.out.print(first+" "+second);
	fibonicc_rec(n-2);
	}
	static void fibonicc_rec(int n)
	{
		if(n>0)
		{
		next=first+second;
		first=second;
		second=next;
		System.out.print(" " + next);
		fibonicc_rec(n-1);
	}
	
}
}

