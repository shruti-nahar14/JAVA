////////////////////////////
/*class:clear
*Input:--
*Output:myHashSet before : [16, 33, 19, 10, 29, 78]
        myHashSet after  : []
*Description:Implementation of clear method in hash set class
*Date:16-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
import java.util.*;
public class clear extends Thread{
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(16);
        myHashSet.add(33);
        myHashSet.add(78);
        myHashSet.add(19);
        myHashSet.add(29);
        myHashSet.add(10); 

        System.out.println("myHashSet before : " + myHashSet);
        myHashSet.clear(); //deletes all the elements from the hashset
        System.out.println("myHashSet after  : " + myHashSet);
        
    }
}
