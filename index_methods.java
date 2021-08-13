/////////////////////////////
/*class:index_methods
*Input:--
*Output: L1 Array list : [1, 2, 3, 4, 5, 3, 6, 3]
         The first occurrence of 3 in l1 is at index : 2
         The last occurrence of 3 in l1 is at index : 7
*Description:Implementation of index methods in Array list class
*Date:13-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
import java.util.*;
public class index_methods extends Thread{
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(3);
        l1.add(6);
        l1.add(3);

        System.out.println("L1 Array list : "+ l1);
        System.out.println("The first occurrence of 3 in l1 is at index : " + l1.indexOf(3));
        System.out.println("The last occurrence of 3 in l1 is at index : " + l1.lastIndexOf(3));


    }
}
