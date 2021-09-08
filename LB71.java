
////////////////////////////////////////////////////////
//Function Name:LB71
//Input:15320
//Output:2
//Description:Write a program which accept number from user and return the count of even digits
//Date:08/09/2021
//Author: Shruti Nahar
//////////////////////////////////////////////////////


import java.util.*;

class LB71
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
			if(iDigit%2==0)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		System.out.println("Count of even Digits Are: "+iCnt);
	}
}


