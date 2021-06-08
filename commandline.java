/////////////////////////////
/*class:commandline
 *Input:shruti
 *Output:String is shruti
         Length of string is 6
         Reversed string is iturhs
         string is not palidrome 
 *Description:Check the String is palidrome or not using commanline argument
 *Date:8-June-2021
 *Author Name:Shruti Nahar
 */
public class commandline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string ");
		String str=args[0];
		String rev="";
		System.out.println("String is "+str);
		System.out.println("Length of string is "+str.length());
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed string is "+rev);
		if(str.equals(rev))
		{
			System.out.println("String is palidrome ");
		}
		else
		{
			System.out.println("string is not palidrome ");
		}
		

	}

}
