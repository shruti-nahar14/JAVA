////////////////////////////
/*class:size
*Input:--
*Output: The size of myHashSet is : 6
*Description:Implementation of size method in hash set class
*Date:17-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
import java.util.*;
public class size extends Thread{
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(16);
        myHashSet.add(33);
        myHashSet.add(78);
        myHashSet.add(19);
        myHashSet.add(29);
        myHashSet.add(10); 

        System.out.println("The size of myHashSet is : " + myHashSet.size());

    }
}
