////////////////////////////////////////////////////////
//Function Name:Swapping
//Input:10  20 
//Output:20   10 
//Description:take two arguments are command line arguments and swap them by using 3rd Variable.
//Date: 14/06/2021
//Author: Shruti Nahar
//////////////////////////////////////////////////////
class Swapping
{
	public static void main(String args[])
	{
		float i,j,temps;
		int count;
		count=args.length;
		System.out.println(count);
		i=float.parseFloat(args[0]);
		j=float.parseFloat(args[1]);
		
		System.out.println("The values are "+i+""+j);
		temps=i;
		i=j;
		j=temps;
		System.out.println("The Swapped Values are"+i+""+j);
	}
}