////////////////////////////
/*class:bookhash
*Input: 103	java	500
        102	oracle	600
        101 cpp     800
        101 cpp     800
*Output:101	cpp  	800
        102	oracle	600
        103	java	500    
*Description:Implementation of hash set class in collection interface
*Date:16-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
package hashset;

import java.util.Set;

public class bookhash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bookinfo bi=new bookinfo();
		  Set<book> hashset =bi.create();
		  bi.display(hashset);

	}

}
