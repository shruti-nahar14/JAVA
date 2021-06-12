///////////////////////////////////////////////////////
//Function Name: void display(int...n)
//               void display(Float f1,int...n)
//Class:varargs
//Input:--
//Output:10
//20
//30
//40
//50
//---------------------------------------
//1.2
//10
//20
//30
//Description:Display the use of VarArgs in Java
//Date: 12-june-2021
//Author: Shruti Nahar
///////////////////////////////////////////////////////
package varargs;
import java.util.Scanner;
public class varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varargs v=new varargs();
		v.display(10,20,30,40,50);
		v.display(1.2f,10,20,30);
   
	}
   public void display(int...n)
   {
	   Scanner sc=new Scanner(System.in);
	   for(int i:n)
	   {
		   System.out.println(i);
	   }
   }
   public void display(Float f1,int...n)
   {
	   System.out.println("---------------------------------------");
	   System.out.println(f1);
	   for(int i:n)
	   {
		   System.out.println(i);
	   }
   }

}
