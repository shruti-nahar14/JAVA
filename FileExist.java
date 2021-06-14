////////////////////////////////////////////////////////
//Function Name:FileExist
//Input:--
//Output:--
//Description:Accept file name from user and check that file exists or not
//Date: 14/06/2021
//Author:Shruti Nahar
//////////////////////////////////////////////////////


import java.io.File;
import java.util.*;

public class FileExist
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Accept File Name from User");
		String str=sobj.nextLine();

		File myFile = new File(str);
		if (myFile.exists()) 

		    {
			System.out.println(myFile.getName() + " exists");
			}
			
		 else
			System.out.println("File does not exist");
	}
}