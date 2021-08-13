/////////////////////////////
/*class:Add_method
*Input:--
*Output: [12, 13, 6, 1, 2, 3, 4, 6, 5]
*Description:Implementation of add methods in Array list class
*Date:13-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
import java.util.*;
public class Add_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        ArrayList<Integer> l1 = new ArrayList<>();
		        ArrayList<Integer> l2 = new ArrayList<>();
		        l2.add(12);
		        l2.add(13);
		        l2.add(6);
		        l1.add(1);
		        l1.add(2);
		        l1.add(3);
		        l1.add(4);
		        l1.add(6);
		        l1.add(5,5);  // inserts 5 at the 5th index in l1

		        l1.addAll(0, l2);
		       System.out.println(l1);
		    }

}
