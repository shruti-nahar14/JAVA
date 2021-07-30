/////////////////////////////
/*class: evennumber
 *Input:--
 *Output:Even number: 0
         Even number: 2
         Even number: 4
         Even number: 6
         Sum of even numbers is: 12
 *Description:Display the n even numbers
 *Date:30-July-2021
 *Author Name:Shruti Nahar
 *///////////////////////////////
package practiceset4;

public class evennumber {

	public static void main(String[] args) {


		        // Practice Problem 2
		        int sum=0;
		        int n=4;
		        for(int i=0;i<n;i++){
		        	
		        	System.out.println("Even number: "+(2*i));
		            sum = sum + (2*i);
		        }
		        System.out.print("Sum of even numbers is: ");
		        System.out.println(sum);
		        // First 4 even numbers are - 0 2 4 6

	}

}
