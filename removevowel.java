/////////////////////////////
/*class:removevowel
 * Input:shrutinahar
 * Output:Removing Vowels from The String [shrutinahar]
          All Vowels Removed Successfully..!!
          Now the String is shrtnhr
 *Description:Remove vowels from the String
 *Date:8-June-2021
 *Author Name:Shruti Nahar
 */
package shubham;


import java.util.Scanner;

public class removevowel
{
	
public static void main(String args[])
{
String strOrig, strNew;
Scanner scan = new Scanner(System.in);

System.out.print("Enter a String : ");
strOrig = scan.nextLine();

System.out.print("Removing Vowels from The String [" +strOrig+ "]\n");
strNew = strOrig.replaceAll("[aeiouAEIOU]", "");

System.out.print("All Vowels Removed Successfully..!!\nNow the String is :\n");
      
System.out.print(strNew);
}
}
