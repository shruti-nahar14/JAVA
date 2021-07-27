/////////////////////////////
/*class:website
 *Input:Enter the Website name 
        w3school.com
 *Output:This is a Commercial website
 *Description:Displaying the type of the Website
 *Date:27-July-2021
 *Author Name:Shruti Nahar
 *////////////////////////
package a;

import java.util.Scanner;

public class website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Website name ");
      String website = sc.next();
      if(website.endsWith(".org")){
  	  System.out.println("This is an organizational website");
      }
     else if(website.endsWith(".com")){
          System.out.println("This is a Commercial website");
    }
      else if(website.endsWith(".in")){
          System.out.println("This is an Indian website");
  	}
	}

}
