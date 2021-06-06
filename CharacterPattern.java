package shubham;

import java.util.Scanner;

public class CharacterPattern {
	public static void printCharacterPattern(int num)
	{
		int i,j,value=1;
	char ch;
for(i=0;i<num;i++)
{
		 ch='a';
		for(j=0;j<=i;j++)
		{
			System.out.print(ch);
			ch++;
		}
		
		System.out.println("");
	}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		CharacterPattern c=new CharacterPattern();
		c.printCharacterPattern(num);
	}

}
