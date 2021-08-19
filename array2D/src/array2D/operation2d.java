package array2D;

import java.util.Scanner;

public class operation2d {
	Scanner sc=new Scanner(System.in);
	public int[][]createmat()
	{
		System.out.println("enter the no of rows ");
		int r=sc.nextInt();
		int arr[][]=new int[r][];
		System.out.println("enter the no of column for each row ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the col for "+(i+1)+"row");
			arr[i]=new int[sc.nextInt()];
		}
		return arr;
	}
  public void Acceptmat(int arr[][])
  {
	  for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
  }
  public void displaymat(int arr[][])
  {
	  for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
  }
}
