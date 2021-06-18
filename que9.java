/////////////////////////////
/*Output:
Elements of Array: 
3	2	4	5	6	4	5	7	3	2	3	4	7	1	2	0	0	0	
sum is 56
Average is 4
sorted array
1	2	2	2	3	3	3	4	4	4	5	5	6	7	7	56	4	
smallest value: 1
1	2	2	2	3	3	3	4	4	4	5	5	6	7	7	56	4	1	
*Description:Find sum,average,sort the array & smallest value
*Date:18-June-2021
*Author Name:Shruti Nahar
*///////////////////////////////////	
public class que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		int sum=0;
		int avg=0;
		int temp;
		System.out.println("Elements of Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +"\t");
		}
		for(int i=0;i<14;i++)
		{
			sum=sum+arr[i];
			avg=sum/14;
		}
		arr[15]=sum;
		arr[16]=avg;
		System.out.println("\nsum is "+sum);
		System.out.println("Average is "+avg);
		for(int i=1;i<16;i++)
		{
		for(int j=0;j<16-i;j++)
		{
		if(arr[j]>arr[j+1])
		{
		arr[j]=arr[j]+arr[j+1];
		arr[j+1]=arr[j]-arr[j+1];
		arr[j]=arr[j]-arr[j+1];
		}
		}
		}
		System.out.println("sorted array\n");
		for(int i=0;i<17;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		int small;
		small=arr[0];
		for(int i=0;i<17;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		arr[17]=small;
		System.out.println("\n smallest value: "+arr[17]+"\n");
		for(int i=0;i<18;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	
	}

}
