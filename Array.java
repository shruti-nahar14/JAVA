/////////////////////////////
/*class:Array
 *Input:--
 *Output:The Array is not sorted
 *Description:Check whether the array is sorted or not
 *Date:29-July-2021
 *Author Name:Shruti Nahar
 *///////////////////////////////
package practiceset4;
public class Array {
		    public static void main(String[] args) {
		        
		        boolean isSorted = true;
		        int [] arr = {1, 12, 3, 4, 5, 34, 67};
		        for(int i=0;i<arr.length-1;i++){
		            if(arr[i] > arr[i+1]){
		                isSorted = false;
		                break;
		            }
		        }
		        if(isSorted){
		            System.out.println("The Array is sorted");
		        }
		        else{
		            System.out.println("The Array is not sorted");
		        }


		    }
		


	}
