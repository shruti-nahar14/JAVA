/////////////////////////////
/*Input:Enter the no 
10
20
30
40
50
*Output:Numbers are: 
10
20
30
40
50
sum is 150
*Description: Implementation of sum of number
*Date:3-July-2021
*Author Name:Shruti Nahar
*///////////////////////////////////	
package functionmain;

import java.util.Scanner;

public class sumofdidgit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sumofdigit();

	}
	public static void sumofdigit()
	{
		Scanner sc=new Scanner(System.in);
	int sum=0;
	 int arr[]=new int[5];
	 System.out.println("Enter the no ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	 System.out.println("Numbers are ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			sum=sum+arr[i];
		}
		System.out.println("sum is "+sum);
	}

}
