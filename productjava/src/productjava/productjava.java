package productjava;

import java.util.Scanner;

public class productjava {

	public static void main(String[] args) {
	customer cust = accept();
		display(cust);
		}
	public static customer accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id ");
		int prodid=sc.nextInt();
		System.out.println("Enter the product name ");
		String prodname=sc.next();
		System.out.println("Enter the product price ");
		int prodprice=sc.nextInt();
		System.out.println("Enter the product Qty ");
		int prodqty=sc.nextInt();
		productsupply prod=new productsupply(prodid,prodname,prodprice,prodqty);
		System.out.println("Enter customer id ");
		int custid=sc.nextInt();
		System.out.println("Enter customer name ");
		String custname=sc.next();
		System.out.println("Enter customer mobno ");
		int custmobno=sc.nextInt();
		customer cust=new  customer(custid,custname, custmobno, prod);

       return cust;
		
	}
	public static void display(customer cust)
	{
		productsupply p1=cust.getProd();
		System.out.println("----------------------------PRODUCT DETAILS--------------------------------");
		System.out.println("product id :"+p1.getProdid());
		System.out.println("product name: "+p1.getProdname());
		System.out.println("product price: "+p1.getProdprice());
		System.out.println("product qty: "+p1.getProdqty());
		System.out.println("--------------------------CUSTOMER DETAILS---------------------------------");
		System.out.println("Customer id: "+cust.getCustid());
		System.out.println("customer name: "+cust.getCustname());
		System.out.println("customer mobno: "+cust.getMobno());
	}

}
