////////////////////////////
/*class:array2D
*Input:
Allocate memmory for 2d array 
enter the no of rows 
2
enter the no of column for each row 
enter the col for 1row
1
enter the col for 2row
2
enter the elements in 2d array 
2
9
7
*Output:
Elements of 2d array are 
2

9 7
*Description:Implementation of 2-D Array
*Date:19-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
package array2D;
import java.util.Scanner;
public class array2D {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=null;
		operation2d d=new operation2d();
		System.out.println("Allocate memmory for 2d array ");
		arr=d.createmat();
		System.out.println("enter the elements in 2d array ");
		d.Acceptmat(arr);
		System.out.println("Elements of 2d array are ");
		d.displaymat(arr);
	}
}
