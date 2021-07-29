/////////////////////////////
/*class:searcharr
 *Input:--
 *Output:The value is not present in the array
 *Description:Searching the element in array
 *Date:28-July-2021
 *Author Name:Shruti Nahar
 *///////////////////////////////
package practiceset4;

public class searcharr {

	
		    public static void main(String[] args) {
		       
		        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
		        float num = 45.57f;
		        boolean isInArray = false;
		        for(float element:marks){
		            if(num==element){
		                isInArray = true;
		                break;
		            }
		        }
		        if(isInArray){
		            System.out.println("The value is present in the array");
		        }
		        else{
		            System.out.println("The value is not present in the array");
		        }


	}

}
