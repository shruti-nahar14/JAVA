/////////////////////////////
/*class:contains_method
*Input:--
*Output: Array list : [1, 2, 3, 4, 5, 6]
         L1 list contains 7 : false
         L1 list contains 4 : true
*Description:Implementation of contains methods in Array list class
*Date:13-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
import java.util.*;
public class contains_method extends Thread{
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);

        System.out.println("Array list : "+ l1);
        System.out.println("L1 list contains 7 : " + l1.contains(7));
        System.out.println("L1 list contains 4 : " + l1.contains(4));


    }
}
