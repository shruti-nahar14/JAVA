import java.util.Scanner;

public class Arraymain {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("-----------------------------------WELCOME-------------------------------------------");
		System.out.println("1.create \n2.insert \n3.display \n4searching \n5sorting \n6 Even-Odd \n7Prime no \n8Divisible by 3and5");
		operation1 o=new operation1();
		int arr[]=null;
		do
		{
	     System.out.println("enter the choice ");
	     int ch=sc.nextInt();
	     if(ch==1)
	     {
	    	 arr=o.createarray(arr);
			System.out.println("memory allocated ");
	     }
	     
	     else if(ch==2)
		{
	    	 int size;
	    	 System.out.println("enter the size of array ");
			 size=sc.nextInt();
			o.insertarray(arr,size);
			System.out.println(size+"element insereted");	
		}
	     else if(ch==3)
	     {
	    	 System.out.println("enter the size of array ");
			int size=sc.nextInt();
			 System.out.println("----------------------------------------DISPLAY-------------------------------------");
	    	 o.display(arr, size);
	     }
	     else if(ch==4)
	  {
	    	 System.out.println("enter the size of array ");
			int size=sc.nextInt();
			searching s=new searching();
		System.out.println("\n1 linearsearch \n 2 binarysearch \n");
		int cho=sc.nextInt();
		if(cho==1)
		{
			System.out.println("--------------------------LINEARSEARCH---------------------------------------");
			System.out.println("enter the ele to be searched ");
			int elem= sc.nextInt();
			s.linearsearch(arr,size,elem);
		}
		else if(cho==2)
		{
			System.out.println("--------------------------BINARYSEARCH---------------------------------------");
			System.out.println("enter the ele to be searched ");
			int elem= sc.nextInt();
			s.binarysearch(arr,size,elem);
		}
		 else
   	  {
   		  System.out.println("Invalid choice ");
        }
		System.out.println("Do you want to conitue press 1 ");
		int i=sc.nextInt();
		
	}
	     else if(ch==5)
	     {
	    	 System.out.println("enter the size of array ");
		int	size=sc.nextInt();
	        	  System.out.println("\n1 selectionsort \n 2 bubblesort \n3insertionsort");
	        	  int choice=sc.nextInt();
	        	  sorting so=new sorting();
	        	  if(choice==1)
	        	  {
	        		  System.out.println("--------------------------SELECTIONSORT---------------------------------------");
	        		  so.selectionsort(arr,size);
	        	  }
	        	  else if(choice==2)
	        	  {
	        		  System.out.println("--------------------------BUBBLESORT---------------------------------------");
	        		so.bubblesort(arr, size);  
	        	  }
	        	  else if(choice==3)
	        	  {
	        		  System.out.println("--------------------------INSERTIONSORT---------------------------------------");
	        		  so.insertionsort(arr,size); 
	        	  }
	        	  else
	        	  {
	        		  System.out.println("Invalid choice ");
	             }
	        	 System.out.println("Do you want to conitue press 1 ");
	      		int y=sc.nextInt();
	     }
	     else if(ch==6)
	     {
	    	 System.out.println("------------------------------EVEN OR ODD---------------------------------");
	    	 o.evenodd(arr);
	    }
	     else if(ch==7)
	     {
	    	 System.out.println("-----------------------------PRIME NUMBER--------------------------------------------");
	    	 o.primeno(arr);
	     }
	     else if(ch==8)
	     {
	    	 System.out.println("------------------------------------DIVISIBLITY-----------------------------------");
	    	 o.divisiblity(arr);
	     }
	     else
	     {
	    	 System.out.println("Exit");
	     }
	     System.out.println("Do you want to continue ");
}while(sc.next().equals("yes"));
		System.out.println("-----------------------------------------THANKYOU------------------------------------------");
}
}