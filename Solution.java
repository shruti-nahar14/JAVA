/////////////////////////////
/*Input:Enter the number to display table: 3
*Output:3 x 1 = 3
        3 x 2 = 6
        3 x 3 = 9
        3 x 4 = 12
        3 x 5 = 15
        3 x 6 = 18
        3 x 7 = 21
        3 x 8 = 24
        3 x 9 = 27
        3 x 10 = 30
*Description:Display the table of any number
*Date:1-July-2021
*Author Name:Shruti Nahar
*///////////////////////////////////	
package table;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number to display table: ");
       int N=sc.nextInt();
       for(int i = 1; i <= 10; i++)
       {
          System.out.printf("%d x %d = %d%n", N, i, N*i);
       }
    }
}
