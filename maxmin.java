/////////////////////////////
/*class: maxmin
 *Input:--
 *Output:maximum value is 90
         Minimum value is -999
 *Description:Display the maximum and minimum element of array
 *Date:30-July-2021
 *Author Name:Shruti Nahar
 *///////////////////////////////
package practiceset4;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {23,76,90,-324,65,-999};
     int max=Integer.MIN_VALUE;
     int min=Integer.MAX_VALUE;
     for(int e:arr)
     {
    	 if(e>max)
    	 {
    		 max=e;
    	 }
     }
     for(int e:arr)
     {
    	 if(e<min)
    	 {
    		 min=e;
    	 }
     }
     System.out.println("maximum value is "+max);
     System.out.println("Minimum value is "+min);
	}

}
