/////////////////////////////
/*class:insert_end_methods
*Input:--
*Output:[6, 56, 9, 5, 10]
*Description:Implementation of insertion methods at end in Array Deque
*Date:14-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
import java.util.*;
public class insert_end_methods extends Thread{
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addLast(5);
        ad1.offerLast(10);
        
        System.out.println(ad1);

    }
}
