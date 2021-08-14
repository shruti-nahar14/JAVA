/////////////////////////////
/*class:insert_1st_methods
*Input:--
*Output: [10, 5, 6, 56, 9]
*Description:Implementation of insertion methods at first in Array Deque
*Date:14-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
import java.util.*;
public class insert_1st_methods extends Thread{
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.offerFirst(10);
        System.out.println(ad1);

    }
}
