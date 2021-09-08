////////////////////////////////////////////////////////
//Function Name:LB74
//Input:1532
//Output:30
//Description:Write a program which accept number from user and return multiplication of all digits
//Date:08/09/2021
//Author: Shruti Nahar
//////////////////////////////////////////////////////


import java.util.*;

class LB74
{
	public static void main(String[] args)
	{
		int iNo,iMult=1,iDigit;

		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter a Number");
		iNo=sobj.nextInt();
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			iNo=iNo/10;
		    iMult=iMult*iDigit;

		}
		System.out.println("Multiplications of all Digits is:"+iMult);
	}
}


