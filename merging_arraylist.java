/////////////////////////////
/*class:merging_arraylist
*Input:--
*Output: L1 Array list : [1, 2, 3, 4, 5, 6]
         L2 Array list : [11, 12, 13, 14]
         L1 Array list after merging: [1, 2, 3, 4, 5, 6, 11, 12, 13, 14]
         L2 Array list : [11, 12, 13, 14]
*Description:merging the array list 
*Date:13-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
import java.util.*;
public class merging_arraylist extends Thread{
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        System.out.println("L1 Array list : "+ l1);
        System.out.println("L2 Array list : " +l2);
        l1.addAll(l2);
        System.out.println("L1 Array list after merging: "+ l1);
        System.out.println("L2 Array list : " +l2);

        
    }
}
