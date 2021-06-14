////////////////////////////////////////////////////////
//Function Name:FileLength
//Input:--
//Output:File Length is n bytes
//Description:Accept file name from user and return length
//Date: 14/06/2021
//Author: Shruti Nahar
//////////////////////////////////////////////////////

import java.io.File;
import java.util.*;

public class FileLength
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Accept File Name from User");
		String str=sobj.nextLine();

		File myFile = new File(str);
		if (myFile.exists()) 

		    {
			//System.out.println(myFile.getName() + " exists");
			System.out.println("The file is " + myFile.length() + " bytes long");
			}
			
		 else
			System.out.println("File does not exist");
	}
}