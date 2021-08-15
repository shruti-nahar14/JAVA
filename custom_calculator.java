/////////////////////////////
/*class:custom_calculator
*Input:--
*Output:
*1.Addition 
2.Substraction 
3.Multiplication 
4.Division 
Enter the choice 
1
Enter the two numbers 
10
20
Addition is 30.0
Do want to continue!!!!!!! 
yes
1.Addition 
2.Substraction 
3.Multiplication 
4.Division 
Enter the choice 
2
Enter the two numbers 
10
700000
Input cant be greater than 100000
Do want to continue!!!!!!! 
yes
1.Addition 
2.Substraction 
3.Multiplication 
4.Division 
Enter the choice 
3
Enter the two numbers 
6000
7000
Multiplication is 4.2E7
Do want to continue!!!!!!! 
yes
1.Addition 
2.Substraction 
3.Multiplication 
4.Division 
Enter the choice 
4
Enter the two numbers 
10
0
cannot divide by 0
*Description:Implementation of customized calculator by implementing user defined Exception
*Date:15-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////
package custom_calculator;

import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Input cant be greater than 100000";
    }
}

class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by 0";
    }

}
class MaxMultiplyInputException extends Exception{
    @Override
    public String toString() {
        return "Input cant be greater than 7000 while multiplying";
    }
}

class CustomCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException{
    	try
    	{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==8 || b==9) {
            throw new InvalidInputException();
        }
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
        return a + b;
    }
    double subtract(double a, double b) throws MaxInputException{
    	try
    	{
        if(a>100000 || b>100000)
        {
            throw new MaxInputException();
        }
    	}
        catch(Exception e)
    	{
    		System.out.println(e);
    	}
        return a - b;
    }
    double multiply(double a, double b)throws MaxInputException, MaxMultiplyInputException{
    	try
    	{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        else if(a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	return a * b;
    }
    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

public class custom_calculator {
    public static void main(String[] args) throws InvalidInputException,
            CannotDivideByZeroException, MaxInputException, MaxMultiplyInputException {
        CustomCalculator c = new CustomCalculator();
        Scanner sc=new Scanner(System.in);
       do
       {
    	 System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.Division ");
    	System.out.println("Enter the choice ");
    	int ch=sc.nextInt();
       System.out.println("Enter the two numbers ");
       double num1,num2;
       num1=sc.nextDouble();
       num2=sc.nextDouble();
       switch(ch)
       {
       case 1:
    	    double ans= c.add(num1, num2) ; 
    	    System.out.println("Addition is "+ans);
             break;
       case 2:
    	 double sub= c.subtract(num1, num2);
    	 System.out.println("Substraction is "+sub);
    	   break;
       case 3:
    	   double mul=c.multiply(num1, num2);
    	   System.out.println("Multiplication is "+mul);
    	   break;
       case 4:
    	   double div= c.divide(num1, num2);
    	   System.out.println("division is "+div);
    	   break;
       }
         
       System.out.println("Do want to continue!!!!!!! ");
    }while(sc.next().equals("yes"));
       System.out.println("----------------------THANKYOU------------------");
    }
}
