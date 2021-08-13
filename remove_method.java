/////////////////////////////
/*class:remove_method
*Input:--
*Output: Array list before : [1, 2, 3, 4, 6, 5]
         ArrayList after removing the value at index 0 :[2, 3, 4, 6, 5]
*Description:Implementation of remove methods in Array list class
*Date:13-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
import java.util.*;
public class remove_method extends Thread{
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5,5);  // inserts 5 at the 5th index in l1

        System.out.println("Array list before : "+ l1);

        l1.remove(0);
        System.out.println("ArrayList after removing the value at index 0 :" + l1);

    }
}
