import java.util.Scanner;

public class operation1 {
	Scanner sc=new Scanner(System.in);
	public int[] createarray(int arr[])
	{
		arr=new int[5];
		return arr;
	}
	public void insertarray(int arr[],int size)
	{
		System.out.println("enter the elements in array ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public void display(int arr[],int size)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void evenodd(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			System.out.println(arr[i]+"is even number");
			}
			else
			{
				System.out.println(arr[i]+"is odd number ");
			}
		}
	}
	public void primeno(int arr[])
	{
		
		for(int j=0;j<arr.length;j++)
		{
			for(int i=2;i<=arr.length/2;i++)
			{
			if(arr[j]%i==0)
			{
				System.out.println(arr[j]+"is not prime number ");
			}
			else
			{
				System.out.println(arr[j]+"is prime number");
			}
			}
		}
	}
	public void divisiblity(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3==0 & arr[i]%5==0)
			{
				System.out.println(arr[i]+"divisible by 3 and 5");
			}
			else
			{
				System.out.println(arr[i]+"not divisible by 3 and 5");
			}
		}

	}

}
