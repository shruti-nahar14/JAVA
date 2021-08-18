import java.util.Scanner;

public class operationAdd {
Scanner sc=new Scanner(System.in);
public int[][] createmat1()
{
	System.out.println("enter the no of rows ");
	int r=sc.nextInt();
	int mat1[][]=new int[r][];
	System.out.println("enter the no of column for each row ");
	for(int i=0;i<mat1.length;i++)
	{
		System.out.println("enter the col for "+(i+1)+"row");
		mat1[i]=new int[sc.nextInt()];
	}
	return mat1;
}
public int[][] createmat2()
{
	System.out.println("enter the no of rows ");
	int r=sc.nextInt();
	int mat2[][]=new int[r][];
	System.out.println("enter the no of column for each row ");
	for(int i=0;i<mat2.length;i++)
	{
		System.out.println("enter the col for "+(i+1)+"row");
		mat2[i]=new int[sc.nextInt()];
	}
	return mat2;
	
}
public void Acceptmat1(int mat1[][])
	{
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
	}
public void displaymat1(int mat1[][])
{
	for(int i=0;i<mat1.length;i++)
	{
		for(int j=0;j<mat1[i].length;j++)
		{
			System.out.print(mat1[i][j]+"\t");
		}
		System.out.println();
	}
}
	public void Acceptmat2(int mat2[][])
	{
		for(int i=0;i<mat2.length;i++)
		{
			for(int j=0;j<mat2[i].length;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
	}
	public void displaymat2(int mat2[][])
	{
		for(int i=0;i<mat2.length;i++)
		{
			for(int j=0;j<mat2[i].length;j++)
			{
				System.out.print(mat2[i][j]+"\t");
			}
			System.out.println();
		}
	}

public boolean validatearr(int mat1[][],int mat2[][])
{
	boolean b=true;
	if(mat1.length==mat2.length)
	{
		
		for(int i=0;i<mat1[i].length;i++)
		{
			if(mat1[i].length!=mat2[i].length)
			{
				b=false;
				break;
			}
				
		}
	}
	return b;
}
public int[][] addmat(int mat1[][],int mat2[][])
{
	int mat3[][]=new int[mat1.length][];
	
	for(int i=0;i<mat3.length;i++)
	{
		mat3[i]=new int[mat1[i].length];
	}
	for(int i=0;i<mat3.length;i++)
	{
		for(int j=0;j<mat3[i].length;j++)
		{
			mat3[i][j]=mat1[i][j] + mat2[i][j];
		}
	}
	return mat3;
	
}

public void displayadd(int mat3[][])
{
	for(int i=0;i<mat3.length;i++)
	{
		for(int j=0;j<mat3[i].length;j++)
		{
			System.out.print(mat3[i][j]+"\t");
		}
		System.out.println();
}
}
}