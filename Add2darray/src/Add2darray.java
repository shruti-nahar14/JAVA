////////////////////////////
/*class:Add2darray
*Input:
enter the no of rows 
3
enter the no of column for each row 
enter the col for 1row
2
enter the col for 2row
1
enter the col for 3row
3

enter the no of rows 
3
enter the no of column for each row 
enter the col for 1row
2
enter the col for 2row
1
enter the col for 3row
3

enter elements of matrix1 
1
2
3
4
5
6

enter elements of matrix2 
10
20
30
40
50
60

*Output:
Mat1 memory allocated 

Mat2 memory alloacted 

Display elements of matrix1 
1	2	
3	
4	5	6	

Display elements of matrix2 
10	20	
30	
40	50	60
	
check validity
 
Display addition 
11	22	
33	
44	55	66	

*Description:Implementation of Addition of 2-D Array
*Date:18-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
public class Add2darray {
	public static void main(String[] args)
	{
	int mat1[][], mat2[][], mat3[][];
	boolean b;
	operationAdd op=new operationAdd();
    mat1=op.createmat1();
	System.out.println("Mat1 memory allocated ");
	
	mat2=op.createmat2();
	System.out.println("Mat2 memory alloacted ");
	System.out.println("enter elements of matrix1 ");
	op.Acceptmat1(mat1);
	System.out.println("Display elements of matrix1 ");
	op.displaymat1(mat1);
	System.out.println("enter elements of matrix2 ");
	op.Acceptmat2(mat2);
	System.out.println("Display elements of matrix2 ");
	op.displaymat2(mat2);
	System.out.println("check validaty ");
	b=op.validatearr(mat1,mat2);
	if(b==true)
	{
		mat3=op.addmat(mat1, mat2);
		System.out.println("Dislpay adddtion ");
		op.displayadd(mat3);
	}
	else
	{
		System.out.println("Addition not possible ");
	}
}
}
