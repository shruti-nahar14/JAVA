/////////////////////////////
/*class:reversearr
 *Input:--
 *Output:67 34 5 4 3 21 1 
 *Description:Reversing the array
 *Date:29-July-2021
 *Author Name:Shruti Nahar
 *///////////////////////////////
package practiceset4;

public class reversearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	        // Practice Problem 5
		        int [] arr = {1, 21, 3, 4, 5, 34, 67};
		        int l = arr.length;
		        int n = Math.floorDiv(l, 2);
		        int temp;

		        for(int i=0; i<n; i++){
		            // Swap a[i] and a[l-1-i]
		            // a   b   temp
		            // |4| |3| ||
		            temp = arr[i];
		            arr[i] = arr[l-i-1];
		            arr[l-i-1] = temp;
		        }

		        for(int element: arr){
		            System.out.print(element + " ");
		        }
	}

}
