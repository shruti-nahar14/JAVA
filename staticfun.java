///////////////////////////////////////////////////////
//Function Name:static void display()
//Class:staticfun 
//Input:--
//Output:STATIC BLOCK EXCUTE ONLY ONCE 
//DEFAULT BLOCK EXCUTE MULTPILY TIME BEFORE ALLOCATING MEMORY
//STATIC FUNCTION CANNOT INVOKE NON STATIC VAR SO CREATE OBJECT FOR ACCNO 
//DEFAULT BLOCK EXCUTE MULTPILY TIME BEFORE ALLOCATING MEMORY
//ACCOUNT NO: 101
//IFSCCODE: 1010
//Description:Display the use of Static Function ,static block and default block
//Date: 12-june-2021
//Author: Shruti Nahar
///////////////////////////////////////////////////////
package staticconcept;
public class staticfun {
	int accno;
    static int ifsccode;
	static
	{
		System.out.println("STATIC BLOCK EXCUTE ONLY ONCE ");
	}
	{
		System.out.println("DEFAULT BLOCK EXCUTE MULTPILY TIME BEFORE ALLOCATING MEMORY");
	}
    public staticfun()
    {
    	accno=101;
    	ifsccode=1010;
    }
    public static void display()
    {
    	System.out.println("STATIC FUNCTION CANNOT INVOKE NON STATIC VAR SO CREATE OBJECT FOR ACCNO ");
    	staticfun f=new staticfun();
    	System.out.println("ACCOUNT NO: "+f.accno);
    	System.out.println("IFSCCODE: "+ifsccode);
    }
    public static void main(String args[])
    {
    	staticfun f1=new staticfun();
    	f1.display();
    }
}
