////////////////////////////
/*class:empty
*Input:--
*Output:false
        true
*Description:Implementation of empty method in hash set class
*Date:16-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
import java.util.*;
public class empty extends Thread{
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);

        HashSet<Integer> myHashSet1 = new HashSet<>();

        System.out.println(myHashSet.isEmpty());
        System.out.println(myHashSet1.isEmpty());


    }
}
