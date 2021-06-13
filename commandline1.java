////////////////////////////////////////////////////////
//Input:--
//Output:ADDITION IS 30
//Description:Use of CommandLine Argument addition of numbers
//Date:13-june-2021
//Author: Shruti Nahar
///////////////////////////////////////////////////////
package commandline;

public class commandline1 {
  public static void main(String[] args)
  {
	  System.out.println("welcome to java "+args[0]);
	  String str1= args[1];
	  String str2=args[2];
	  int n1=Integer.parseInt(str1);
	  int n2=Integer.parseInt(str2);
	  int add=n1+n2;
	  System.out.println("ADDITION IS "+add);
  }

}
