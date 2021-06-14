////////////////////////////////////////////////////////
//Function Name:FileLength
//Input:--
//Output:--
//Description:Accept file name from user and Read all file
//Date: 14/06/2021
//Author: Shruti Nahar
//////////////////////////////////////////////////////


import java.util.*;
import java.io.*;

class ReadFile
{
  public static void main(String[] args) throws IOException
  {
    Scanner sobj=new Scanner(System.in);

    System.out.println("Enter File Name:");
    String str=sobj.nextLine(); 

    FileInputStream fin=new FileInputStream(str);

    int ch;
    while((ch=fin.read())!=-1)
     System.out.print((char)ch);
     fin.close(); 
  }
}