/////////////////////////////
/*class:remove_1st_methods
*Input:--
*Output:Before remove: [6, 56, 9, 10, 91, 19]
        After remove: [9, 10, 91, 19]
*Description:Implementation of remove methods at first in Array Deque
*Date:14-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////

import java.util.*;
public class remove_1st_methods extends Thread{
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);
        System.out.println("Before remove: "+ad1);
        ad1.pollFirst(); //deletes 6
        ad1.removeFirst(); //deletes 56

        System.out.println("After remove: "+ad1);

    }
}
