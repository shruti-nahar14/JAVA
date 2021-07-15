
public class searching {
	public void linearsearch(int arr[],int size,int ele)
	{
		for(int i=0;i<size;i++)
        {
            if(arr[i]==ele)
            {
     
                  System.out.println(ele+" element found at index"+i);
            }
        }
 
	}
	public void binarysearch(int arr[],int size,int ele)
	{
		int lb=0,ub=size-1;
		int mid;
	    mid=(lb+ub)/2;
	    while(lb<=ub)
	    {
	        if(arr[mid]==ele)
	        {
	            System.out.println("element found is found at "+mid+1+"position");
	            break;
	        }
	        else if(arr[mid]>ele)
	        {
	            ub=mid-1;
	            mid=(lb+ub)/2;
	        }
	        else if(arr[mid]<ele)
	        {
	            lb=mid+1;
	            mid=(lb+ub)/2;
	        }
	        else
	        {
	            System.out.println("element not present in array");
	        }
	    }
	}

}
