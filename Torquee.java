
////////////////////////////////////////////////////////
//Function Name:Torque
//Input:11 12
//Output:112.6
//Description:Program to Calculate torque
//Date:12-june-2021
//Author: Shruti Nahar
///////////////////////////////////////////////////////
import java.util.*;
class Torque
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);
		float m1,m2;
		final float g=9.81f;

		System.out.println("Value of m1");
		m1=sobj.nextFloat();

		System.out.println("Value of m2");
		m2=sobj.nextFloat();
        
       float torque=(2*m1*m2)/(m1+m2)*g;

       System.out.println("Torque is:"+torque);
	}
}
