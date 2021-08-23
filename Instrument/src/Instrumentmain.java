
/////////////////////////////
/*class:Instrumentmain
 *Input:2
 *Output:Enter the number of object to be created 
         2
         1.GUITAR 
         2.FLUET 
         3.PIANIO 
         Enter the choice 
         1
         --------------------Guitar-----------------------
         tin tin tin
         1.GUITAR 
         2.FLUET 
         3.PIANIO 
         Enter the choice 
         2
         --------------------Fluet-----------------------
         toot toot toot
 *Description:Implementation of Inheritance and abstract class
 *Date:23-08-2021
 *Author Name:Shruti Nahar
 *///////////////////////////////
import java.util.Scanner;

public class Instrumentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of object to be created ");
		int n=sc.nextInt();
		Instrument arr[]=new Instrument[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("1.GUITAR \n2.FLUET \n3.PIANIO ");
		System.out.println("Enter the choice ");
		int ch=sc.nextInt();
		if(ch==1)
		{
		arr[i]=new Guitar();
		display(arr);
		}
		else if(ch==2)
		{
		arr[i]=new Fluet();
		display(arr);
		}
		else if(ch==3)
		{
		arr[i]=new Piaino();
		display(arr);
		}
		arr[i]=null;
		}

	}
	public static void display(Instrument arr[])
	{
		for(Instrument t:arr)
		{
			if(t instanceof Guitar)
			{
				System.out.println("--------------------Guitar-----------------------");
				t.play();
			}
			if(t instanceof Fluet)
			{
				System.out.println("--------------------Fluet-----------------------");
				t.play();
			}
			if(t instanceof Piaino)
			{
				System.out.println("--------------------Piaino"
						+ "-----------------------");
				t.play();
			}
		}

	}
}
