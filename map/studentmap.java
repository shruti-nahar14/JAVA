////////////////////////////
/*class:studentmap
*Input:
-----------------------------STUDENT DETAILS---------------------------------------
Enter the Studentid 
101
Enter the Student name 
shruti
Enter the math marks 
76
Enter the Science marks 
87
Enter the Socialscience marks 
56
Do you want add details press 1 
1
-----------------------------STUDENT DETAILS---------------------------------------
Enter the Studentid 
102
Enter the Student name 
shubham
Enter the math marks 
65
Enter the Science marks 
98
Enter the Socialscience marks 
76
Do you want add details press 1 
2

*Output:
ID	STUDENTNAME	SUB1	SUB2	SUB3	TOTAL	PERCENTAGE
101	 shruti		76	    87	     56	    219	     73.0
102	 shubham    65	    98	     76	    239	     79.0
 
*Description:Implementation of hashmap class in collection interface
*Date:18-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
package map;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class studentmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentinfo obj=new studentinfo();
		Map<String ,student> s=obj.create();
		obj.display(s);
		
	}
		
		}

	


