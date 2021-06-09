/////////////////////////////
/*class:commandline2
*Input:--
*Output:Fibonocii Series
Num1: 0
Num2: 1
1
2
3
5
8
13
21
34
55
89
144
233
377
*Description:Fibonocii series by using commandline Argument
*Date:9-June-2021
*Author Name:Shruti Nahar
*/
public class commandline2 {
	public static void main(String[] args)
	{
		String str1=args[0];
		String str2=args[1];
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		int first=n1;
		int second=n2;
		System.out.println("Fibonocii Series");
		System.out.println("Num1: "+n1);
		System.out.println("Num2: "+n2);
		int sum=0;
		for(int i=0;i<13;i++)
		{
			sum=first+second;
			System.out.println(sum);
			first=second;
			second=sum;
			
		}
		
	}

}
