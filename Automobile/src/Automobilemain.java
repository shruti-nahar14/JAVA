////////////////////////////
/*class:Automobilemain
*Input:
1.CAR 
2.BIKE
Enter your choice 
1
WELCOME TO CAR SECTION 
1.MAURTI 
2.SWIFT 
3.BMW 
1
Do you want to continue with car section 
no
Do you want to continue!!!!!!!
yes
1.CAR 
2.BIKE
Enter your choice 
2
WELCOME TO BIKE SECTION 
1.HEROHONDA 
2.BAJAJ 
3.TVS 
1
Do you want to continue with bike section 
yes
WELCOME TO BIKE SECTION 
1.HEROHONDA 
2.BAJAJ 
3.TVS 
3
Do you want to continue with bike section 
no
Do you want to continue!!!!!!!
no
-------------------------THANKYOU-------------------------------


*Output:
---------------------------------------
MAURTI MODEL: abc
MAURTI COLOUR: black
MAURTI PRICE: 5000000.0
---------------------------------------
HEROHONDA MODEL: pqr
HEROHONDA COLOUR: blue
HEROHONDA PRICE: 200000.0
HEROHONDA NO-OF-CC: 5
---------------------------------------
TVS MODEL: xyx
TVS COLOUR: green
TVS PRICE: 80000.0
TVS NO-OF-CC: 4
   
*Description:Implementation of real time automobile interface model
*Date:17-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
import java.util.Scanner;

public class Automobilemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobile a=null;
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("1.CAR \n2.BIKE");
			System.out.println("Enter your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				do
				{
				System.out.println("WELCOME TO CAR SECTION ");
				System.out.println("1.MAURTI \n2.SWIFT \n3.BMW ");
				ch=sc.nextInt();
				if(ch==1)
				{
					a=new maurti();
				}
				if(ch==2)
				{
					a=new swift();
				}
				if(ch==3)
				{
					a=new BMW();
				}
				System.out.println("---------------------------------------");
				display(a);
				System.out.println("Do you want to continue with car section ");
			    }while(sc.next().equals("yes"));
			break;
			case 2:
			do
			{
				System.out.println("WELCOME TO BIKE SECTION ");
				System.out.println("1.HEROHONDA \n2.BAJAJ \n3.TVS ");
				ch=sc.nextInt();
				if(ch==1)
				{
					a=new Herohonda();
					
				}
				if(ch==2)
				{
					a=new Bajaj();
				}
				if(ch==3)
				{
				   a=new TVS();	
				}
				System.out.println("---------------------------------------");
				display(a);
				System.out.println("Do you want to continue with bike section ");
		        }while(sc.next().equals("yes"));
			break;
			}
			
		System.out.println("Do you want to continue!!!!!!!");
		}while(sc.next().equals("yes"));
	System.out.println("-------------------------THANKYOU-------------------------------");
	}
public static void display(Automobile a)
{
	System.out.println(a);
}
}