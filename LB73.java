
////////////////////////////////////////////////////////
//Function Name:LB73
//Input:15320
//Output:2
//Description:Write a program which accept number from user and return the count of digits in between 3 and 7.
//Date:08/09/2021
//Author: Shruti Nahar
//////////////////////////////////////////////////////


import java.util.*;

class LB73
{
	public static void main(String[] args)
	{
		int iNo,iCnt=0,iDigit;

		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter a Number");
		iNo=sobj.nextInt();
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if((iDigit>2)&&(iDigit<8))
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		System.out.println("Count of digits in between 3 and 7 Are: "+iCnt);
	}
}


