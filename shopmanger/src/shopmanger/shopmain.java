////////////////////////////
/*class:shopmain
*Input:
--------------------WELCOME TO SHOPPING APPLICATION-----------------------
How many products do you want to buy!!!!!
2
Enter the product id 
101
Enter the product name 
laptop
Enter the price 
90000
Enter the Quantity of product 
2
Enter the product id 
102
Enter the product name 
mobile
Enter the price 
50000
Enter the Quantity of product 
1
Enter the customer id 
101
Enter the customer name 
shruti
Enter the customer mobno 
866723
Enter the city 
rahuri
Enter the state 
maharshtra
Enter the pincode 
413705
--------------------WELCOME TO SHOPPING APPLICATION-----------------------
How many products do you want to buy!!!!!
1
Enter the product id 
103
Enter the product name 
pen
Enter the price 
30
Enter the Quantity of product 
4
Enter the customer id 
10002
Enter the customer name 
shubham
Enter the customer mobno 
2839
Enter the city 
pune
Enter the state 
maharshtra
Enter the pincode 
4234
Enter the bill No 
111
Enter the Date 
12
2
2021
Enter the bill No 
112
Enter the Date 
2
3
2021
*Output:
-----------------------------CUSTOMER DETAILS--------------------------------
customer id:101
customer name: shruti
customer mobno: 866723.0
-----------------------------ADDRESS DETAIL-------------------------------
city: rahuri
state: maharshtra
pincode: 413705
----------------------------------PRODUCT DETAILS-----------------------------
product id: 101
product name: laptop
product price: 90000
product quantity: 2
----------------------------------PRODUCT DETAILS-----------------------------
product id: 102
product name: mobile
product price: 50000
product quantity: 1
--------------------------------BILL DETAILS---------------------------------
Bill No: 111
Bill Date: 1917-09-11
Total: 230000
GST: 11500.0
FINAL BILL: 241500.0
------------------------THANKYOU..VIST AGAIN..---------------------
-----------------------------CUSTOMER DETAILS--------------------------------
customer id:10002
customer name: shubham
customer mobno: 2839.0
-----------------------------ADDRESS DETAIL-------------------------------
city: pune
state: maharshtra
pincode: 4234
----------------------------------PRODUCT DETAILS-----------------------------
product id: 103
product name: pen
product price: 30
product quantity: 4
--------------------------------BILL DETAILS---------------------------------
Bill No: 112
Bill Date: 1907-10-12
Total: 120
GST: 6.0
FINAL BILL: 126.0
------------------------THANKYOU..VIST AGAIN..---------------------
*Description:Implementation of real time  shopping application
*Date:20-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
package shopmanger;

public class shopmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      operation op=new operation();
     customer cust[]=op.create();
      op.calculate(cust);
     op.display(cust);
   
	}

}
