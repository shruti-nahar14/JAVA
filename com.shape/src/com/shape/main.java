package com.shape;

class shape
{
 int dim1,dim2;
 shape(int dim1,int dim2)
 {
   this.dim1=dim1;
   this.dim2=dim2;
  }
       public int getDim1() {
		return dim1;
	}
	public void setDim1(int dim1) {
		this.dim1 = dim1;
	}
	public int getDim2() {
		return dim2;
	}
	public void setDim2(int dim2) {
		this.dim2 = dim2;
	}
}
class Rectangle extends shape
{
Rectangle(int dim1,int dim2)
  {
     super(dim1,dim2);
   }
   public double area()
   {
     double result=this.dim1*this.dim2;
     return result;
   }
}
class square extends shape
{
  square(int dim1)
  {
     super(dim1,-1);
   }
   public double area()
   {
     return this.dim1*this.dim1;
   }
}
class sphere extends shape
{
  sphere(int dim1)
  {
     super(dim1,-1);
   }
   public double area()
   {
     return 4*Math.PI*this.dim1*this.dim1;
   }
}
class circle extends shape
{
  circle(int dim1)
  {
     super(dim1,-1);
   }
   public double area()
   {
     return Math.PI*this.dim1*this.dim1;
   }
}
public class main {
public static void main(String[] args) {
  Rectangle t=new Rectangle(10,20);
  double result=t.area();
  System.out.println("Rectangle Area: "+result);
  square s =new square(10);
  double ans=s.area();
  System.out.println("Square Area: "+ans);
  sphere s1=new sphere(20);
  double ans1=s1.area();
  System.out.println("Sphere Area: "+ans1);
  circle c=new circle(87);
  double answer=c.area();
  System.out.println("Circle Area: "+answer);
}
}
