////////////////////////////
/*class:insertion_method
*Input:--
*Output:[8, 3, 11, 6]
*Description:Implementation of insertion method in hash set class
*Date:16-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////

import java.util.*;
public class insertion_method extends Thread{
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored

        System.out.println(myHashSet);

    }
}
