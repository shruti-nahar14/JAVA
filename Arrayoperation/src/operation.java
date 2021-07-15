import java.util.Scanner;

public class operation {
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

}
