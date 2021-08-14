/////////////////////////////
/*class:access_methods
*Input:--
*Output: 6
         6
*Description:Implementation of access_methods in Array Deque
*Date:14-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
import java.util.*;
public class access_methods extends Thread{
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());

    }
}
