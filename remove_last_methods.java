////////////////////////////
/*class:remove_last_methods
*Input:--
*Output:Before remove: [6, 56, 9, 10, 91, 19]
        After remove: [6, 56, 9, 10]
*Description:Implementation of remove methods at last in Array Deque
*Date:15-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////

import java.util.*;
public class remove_last_methods extends Thread{
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);
        System.out.println("Before remove: "+ad1);
        ad1.pollLast(); 
        ad1.removeLast();

        System.out.println("After remove: "+ad1);

    }
}
