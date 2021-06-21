////////////////////////////////////////////////////////
//class name:abstract class shape
//           class circle extends shape
//           class triangle extends shape
//           public class overridding
//Function Name:public abstract void findarea();
//              public circle(float r)
//              public triangle(float b,float h)
//Input:--
//Output:Area of triangle  is 14.43
//       Area of triangle  is 10.440001
//       Area of triangle  is 17.64
//       Area of circle is 40.694397
//       Area of circle is 191.03761
//Description:Implementation of Abstract class ,function and concept of function Overriding
//Date:21-june-2021
//Author: Shruti Nahar
///////////////////////////////////////////////////////
package overridding;
import java.util.Scanner;
abstract class shape
{
	public abstract void findarea();
}
class circle extends shape
{
	
	private float r;
	private float ca;
	public circle(float r)
	{
		this.r=r;
	}
	public void findarea()
	{
		ca=3.14f*r*r;
		System.out.println("Area of circle is "+ca);
	}
}
class triangle extends shape
{
	private float b;
	private float h;
	private float ta;
	public triangle(float b,float h)
	{
		this.b=b;
		this.h=h;
	}
	public void findarea()
	{
		ta=0.5f*b*h;
		System.out.println("Area of triangle  is "+ta);
	}
}
public class overridding
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		shape arr[]=new shape[5];
		arr[0]=new  triangle(3.7f,7.8f);
		arr[1]=new  triangle(3.6f,5.8f);
		arr[2]=new  triangle(3.6f,9.8f);
		arr[3]=new  circle(3.6f);
		arr[4]=new  circle(7.8f);
		display(arr);
		
	}
public static void display(shape arr[])
{
  for(shape s:arr)
  {
	  if(s instanceof circle)
	  {
		  s.findarea();
	  }
	  if(s instanceof triangle)
	  {
		  s.findarea();
	  }
  }
}
}