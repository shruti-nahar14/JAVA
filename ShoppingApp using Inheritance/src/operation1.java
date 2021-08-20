import java.sql.Date;
import java.util.Scanner;

public class operation1 {
		public customer[] create()
		{
		   Scanner sc=new Scanner(System.in);
		   customer cust[]=new customer[2];
		   for(int i=0;i<cust.length;i++)
		   {
			   System.out.println("--------------------WELCOME TO SHOPPING APPLICATION-----------------------");
			   System.out.println("How many products do you want to buy!!!!!");
		       int n=sc.nextInt();
			   Product prod[]=new Product[n];   
		   for(int j=0;j<prod.length;j++)
		   {
			   System.out.println("1.Electronics Section ");
			   System.out.println("2.Clothing Section");
			   System.out.println("Enter the Choice ");
			   int ch=sc.nextInt();
			if(ch==1)
			{
			System.out.println("-----------------Electronics----------------------");
			System.out.println("Enter the product id ");
			int prodid=sc.nextInt();
			System.out.println("Enter the product name ");
			String prodname=sc.next();
			System.out.println("Enter the price ");
			int price =sc.nextInt();
			System.out.println("Enter the Quantity of product ");
			int qty=sc.nextInt();
			System.out.println("Enter the Brand ");
			String brand=sc.next();
			System.out.println("Enter the Storage ");
			String stor=sc.next();
			System.out.println("Enter the Ram ");
			String ram=sc.next();
			 prod[j]= new Electronic(prodid,prodname,price,qty, brand, ram, stor);
			}
			
			else if(ch==2)
			{
				System.out.println("----------------------Clothing--------------------------");
				System.out.println("Enter the product id ");
				int prodid=sc.nextInt();
				System.out.println("Enter the product name ");
				String prodname=sc.next();
				System.out.println("Enter the price ");
				int price =sc.nextInt();
				System.out.println("Enter the Quantity of product ");
				int qty=sc.nextInt();
				System.out.println("Enter the Type of Fabric ");
				String fabric=sc.next();
				System.out.println("Enter the Size ");
				String size=sc.next();
				 prod[j]= new Clothing(prodid,prodname,price,qty,fabric,size);
				 
				 }
		   }
		   System.out.println("Enter the customer id ");
			int custid=sc.nextInt();
			System.out.println("Enter the customer name ");
			String custname =sc.next();
			System.out.println("Enter the customer mobno ");
			double mobno=sc.nextInt();
			System.out.println("Enter the city ");
			String city=sc.next();
			System.out.println("Enter the state ");
			String state=sc.next();
			System.out.println("Enter the pincode ");
			int pincode=sc.nextInt();
			address add=new address(city,state,pincode);
			customer c=new customer(custid,custname,mobno,add,prod);
			 cust[i]=c;
		   }
		   return cust;
		}
		public void display(customer cust[])
	    {
	    	for (int i=0;i<cust.length;i++)
	    	{
	    		System.out.println("-----------------------------CUSTOMER DETAILS--------------------------------");
	    		System.out.println("customer id:"+cust[i].getCustid());
	    		System.out.println("customer name: "+cust[i].getCustname());
	    		System.out.println("customer mobno: "+cust[i].getMobno());
	    		System.out.println("-----------------------------ADDRESS DETAIL-------------------------------");
	            System.out.println("city: "+cust[i].getAdd().getCity());
	            System.out.println("state: "+cust[i].getAdd().getState());
	            System.out.println("pincode: "+cust[i].getAdd().getPincode());
	            Product[] prod=cust[i].getProd();
	           
	    	for(int j=0;j<prod.length;j++)
	    	{ 
	    	System.out.println("----------------------------------PRODUCT DETAILS-----------------------------");
    		System.out.println("product id: "+cust[i].getProd()[j].getId());
    		System.out.println("product name: "+prod[j].getName());
    		System.out.println("product price: "+prod[j].getPrice());
    		System.out.println("product quantity: "+prod[j].getQty());
	    	}
	    		System.out.println("--------------------------------BILL DETAILS---------------------------------");
	            System.out.println("Bill No: "+cust[i].getB().getBillno());
	            System.out.println("Bill Date: "+cust[i].getB().getBilldate());
	            System.out.println("Total: "+cust[i].getB().getTotal());
	            System.out.println("GST: "+cust[i].getB().getGst());
	            System.out.println("FINAL BILL: "+cust[i].getB().getFinalbill());
	    	System.out.println("------------------------THANKYOU..VIST AGAIN..---------------------");
	    	}
	    	
	    }
		public void calculate(customer cust[])
		{
			  Scanner sc=new Scanner(System.in);
			for(int i=0;i<cust.length;i++)
			{
				int total=0;
				Product p[]=cust[i].getProd();
				for(int j=0;j<p.length;j++)
				{
				total=(int) (total+p[j].getPrice()*p[j].getQty());
				}
			System.out.println("Enter the bill No ");
			int no=sc.nextInt();
			System.out.println("Enter the Date ");
			int day=sc.nextInt();
			int month=sc.nextInt();
			int year=sc.nextInt();
			Date d=new Date(day, month, year);
			float gst=(float) (total*0.05);
			double finaltotal=total+gst;
			bill bo=new bill(no,total,gst,d,finaltotal);
			cust[i].setB(bo);
			
			}
		}
	}



