////////////////////////////////////////////////////////
//Function Name:LB75
//Input:1532
//Output:2
//Description:Write a program which accept number from user and return difference between summation of even digits and summation of odd digits
//Author: Shruti Nahar
//////////////////////////////////////////////////////


import java.util.*;

class LB75
{
	public static void main(String[] args)
	{
		int iNo,iSum1=0,iSum2=0,iDigit;

		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter a Number");
		iNo=sobj.nextInt();
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit%2==0)
			{
				iSum1=iSum1+iDigit;
			}
			if(iDigit%2!=0)
			{
				iSum2=iSum2+iDigit;
			}
			iNo=iNo/10;
		}
		System.out.println("Difference between summation of even digits and summation of odd digits:"+(iSum1-iSum2));
	}
}


