/////////////////////////////
/*class:evennumber
 *Input:15
 *Output:Even number: 2
         Even number: 4
         Even number: 6
         Even number: 8
         Even number: 10
         Even number: 12
         Even number: 14
 *Description:Display the Even numbers
 *Date:8-June-2021
 *Author Name:Shruti Nahar
 */
import java.util.Scanner;
public class evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the no ");
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number: "+i);
			}
		}

	}

}
