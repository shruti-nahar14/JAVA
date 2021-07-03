/////////////////////////////
/*Input:Enter the number to be reversed 123
*Output:Reversed number is: 321
*Description: Implementation of reversing the number
*Date:3-July-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
package functionmain;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed ");
		int n=sc.nextInt();
		reverse(n);

	}
	public static void reverse(int n)
	   {
		   int r;
		   System.out.println("Reversed number is: ");
		   while(n!=0)
		   {
			   r=n%10;
			   System.out.print(r);
			   n=n/10;
		   }
	   }


}
