/////////////////////////////
/*class:countpostivenegativeinteger
 * Input:10 -2 -3 19 20 
 * Output:3 positive numbers
          2 negative numbers
 *Description:Count the Positive & Negative Integers in array
 *Date:7-June-2021
 *Author Name:Shruti Nahar
 */////////////////////////////////
package shubham;

import java.util.Scanner;

public class countpostivenegativeinteger {
	public static void main(String args[])
	{
Scanner sc= new Scanner(System.in);
    
    //int data;
    int count = 0;
    int negative=0;
    int positive =0;
    
    System.out.print("Enter an integer (Program ends if enter 0): ");
    int data[] = new int[5];
    for(int i=0;i<data.length;i++)
    {
    	data[i]=sc.nextInt();
    }
    for (int i=0;i<data.length;i++)
    {
    if (data[i] < 0){
    negative++;
    }else if (data[i] > 0){
    positive++;
    }
  }
    System.out.println(positive + " positive numbers");
    System.out.println(negative + " negative numbers");
	}
}
