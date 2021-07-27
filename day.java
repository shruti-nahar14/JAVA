/////////////////////////////
/*class: day
 *Input:Enter the day 
        4
 *Output:Thursday
 *Description:Displaying the day using switch case
 *Date:27-July-2021
 *Author Name:Shruti Nahar
 *////////////////////////
package a;

import java.util.Scanner;

public class day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the day "); 
	        int day = sc.nextInt();

	         switch (day){
	            case 1:
	            	System.out.println("Monday");
	            	break;
	            case 2 :
	            	System.out.println("Tuesday");
	            	break;
	            case 3:
	            	System.out.println("Wednesday");
	            	break;
	            case 4:
	            	System.out.println("Thursday");
	            	break;
	            case 5:
	            	System.out.println("Friday");
	            	break;
	            case 6:
	            	System.out.println("Saturday");
	            	break;
	            case 7:
	            	System.out.println("Sunday");
	            	break;
	         }
	        

	}

}
