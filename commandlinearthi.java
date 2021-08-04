/////////////////////////////
/*class:commandlinearthi
 *Input:--
 *Output:
1. + 
2. - 
3. * 
4. /
Enter your choice 
+
------------------------------------Addition-------------------------------
Addition is 30
do you want to continue 
1
Enter your choice 
-
--------------------------------Substraction --------------------------------
substraction is -10
do you want to continue 
1
Enter your choice 
*
--------------------------------Multiplication----------------------------------
Multiplication is 200
do you want to continue 
1
Enter your choice 
/
--------------------------------Division-----------------------------------------
Division is 0
do you want to continue 
2
---------------------------------------------------------------------------------
 *Description:Display the Arithmetic Operation using CommandLine Argument 
 *Date:4-august-2021
 *Author Name:Shruti Nahar
 *///////////////////////////////
import java.util.Scanner;

public class commandlinearthi {
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		String str1=args[0];
		String str2=args[1];
		int n1=Integer.parseInt(str1);
		int n2=Integer.parseInt(str2);
		System.out.println("\n1. + \n2. - \n3. * \n4. /");
		int s;
		do
		{
			System.out.println("Enter your choice ");
			 String c=sc.next();
             switch(c)
             {
             case "+":
            	 System.out.println("------------------------------------Addition-------------------------------");
            	 add(n1,n2);
            break;
             case "-":
            	 System.out.println("--------------------------------Substraction --------------------------------");
            	 sub(n1,n2);
            	 break;
             case "*":
            	 System.out.println("--------------------------------Multiplication----------------------------------");
            mul(n1,n2);
            	 break;
             case "/":
            	 System.out.println("--------------------------------Divison-----------------------------------------");
            	div(n1,n2);
            	 break;
            default :
            	System.out.println("Invalid choice ");
             }
             System.out.println("do you want to continue ");
              s=sc.nextInt();
		}while(s==1);
		
	}
	
	public static void add(int n1,int n2)
	{
		int add=n1+n2;
		System.out.println("Addition is "+add);
	}
	public static void sub(int n1,int n2)
	{
		
		int sub=n1-n2;
		System.out.println("substraction is "+sub);
	}
	public static void mul(int n1,int n2)
	{
		int mul=n1*n2;
		System.out.println("Multiplication is "+mul);
	}
	public static void div(int n1,int n2)

	{
		if(n2==0)
		{
			System.out.println("Division error ");
		}
		else
		{
		int div=n1/n2;
		
		System.out.println("Divsion is "+div);
		}
	}

}