
public class sorting {
public void selectionsort(int arr[],int size)
{
	for(int i=0;i<size;i++)
	{
	int min=i
	;
	for(int j=i+1;j<size;j++)
	{
	if(arr[min]>arr[j])
	{
	 min=j;
	}
	}
	//swap min with j
	int temp=arr[i];
	arr[i]=arr[min];
	arr[min]=temp;
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(arr[i]);
	}
	
}
public void bubblesort(int arr[],int size)
{
	for(int i=1;i<size;i++)
	{
	for(int j=0;j<size-i;j++)
	{
	if(arr[j]>arr[j+1])
	{
	arr[j]=arr[j]+arr[j+1];
	arr[j+1]=arr[j]-arr[j+1];
	arr[j]=arr[j]-arr[j+1];
	//temp=arr[j];
	//arr[j]=arr[j+1];
	//arr[j+1]=temp;
	}
	}
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(arr[i]);
	}
}
public void insertionsort(int arr[],int size)
{
	for(int i=1;i<size;i++)
    {
        int temp=arr[i];
        for(int j=i-1;j>=0;j--)
        {
            if(arr[j]>temp)
            {
            arr[j+1]=arr[j];

            }
          else
            {
                break;
            }
            arr[j+1]=temp;

        }
        for( i=0;i<size;i++)
        {
        	System.out.println(arr[i]);
        }

    }
	
}
}
