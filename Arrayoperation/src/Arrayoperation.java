
import java.util.Scanner;

public class Arrayoperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		operation o=new operation();
		int arr[]=null;
		int n=0,size=0;
		do
		{
		System.out.println("enter the choice ");
		 n=sc.nextInt();
		switch(n)
		{
		case 1:
			arr=o.createarray(arr);
			System.out.println("memory allocated ");
			break;
		case 2:
			System.out.println("enter the size of array ");
			 size=sc.nextInt();
			o.insertarray(arr,size);
			System.out.println(size+"element insereted");
			break;
		case 3:
			System.out.println("Element of array: ");
			o.display(arr,size);
		}
		System.out.println("Do you want to continue ");
		}while(sc.next().equals("yes"));

		}

}
