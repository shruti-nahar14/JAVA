/////////////////////////////
/*class:number
 *Input:Enter the Numbers 
  10
  0
 *Output:
1.Addition 
2.Substraction 
3.Multiplication 
4.Division
Enter the choice 
1
---------------------ADDITION---------------------
Addition is 10.0
Do you want to Continue!!!!!  
yes
1.Addition 
2.Substraction 
3.Multiplication 
4.Division
Enter the choice 
2
-------------------SUBSTRACTION---------------------
Substraction is 10.0
Do you want to Continue!!!!!  
yes
1.Addition 
2.Substraction 
3.Multiplication 
4.Division
Enter the choice 
3
-------------------MULTIPLICATION--------------------
Multiplication is 0.0
Do you want to Continue!!!!!  
yes
1.Addition 
2.Substraction 
3.Multiplication 
4.Division
Enter the choice 
4
-------------------DIVISION------------------------
Cannot Divide by zero 
Do you want to Continue!!!!!  
no
-----------------------THANKYOU----------------------------
 *Description:NumberFormatException() is throw for division if denominator is zero.  
 *Date:7-July-2021
 *Author Name:Shruti Nahar
 */
/////////////////////////////////////////////
import java.util.Scanner;

public class number {
	int num1,num2;
	double result;
	number(int x,int y)
	{
		num1=x;
		num2=y;
	}
	public void add()
	{
		result=num1+num2;
		System.out.println("Addition is "+result);
	}
	public void sub()
	{
		result=num1-num2;
		System.out.println("Substraction is "+result);
	}
	public void mul()
	{
		result=num1*num2;
		System.out.println("Multiplication is "+result);
	}
	public void div()
	{
		try
		{
			if(num2==0)
			{
				throw new NumberFormatException();
			}
			else
			{
			result=num1/num2;
			System.out.println("Division is "+result);
			}
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Cannot Divide by zero ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Numbers ");
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       number n=new number(n1,n2);
       do
       {
    	   System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.Division");
    	   System.out.println("Enter the choice ");
    	   int ch=sc.nextInt();
    	   switch(ch)
    	   {
    	   case 1:
    		   System.out.println("---------------------ADDITION---------------------");
    		   n.add();
    		   break;
    	   case 2:
    		   System.out.println("-------------------SUBSTRACTION---------------------");
    		   n.sub();
    		   break;
    	   case 3:
    		   System.out.println("-------------------MULTIPLICATION--------------------");
    		   n.mul();
    		   break;
    	   case 4:
    		   System.out.println("-------------------DIVISION------------------------");
    		   n.div();
    		   break;
    	   }
    	  System.out.println("Do you want to Continue!!!!!  "); 
       }while(sc.next().equals("yes"));
       System.out.println("-----------------------THANKYOU----------------------------");
	}

}
