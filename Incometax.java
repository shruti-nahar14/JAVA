/////////////////////////////
/*class:Incometax
 *Input:Enter your income in Lakhs per annum
        250000
 *Output:percentage :The total tax paid by the employee is: 74998.125
 *Description:Display the tax paid by Employee
 *Date:27-July-2021
 *Author Name:Shruti Nahar
 *////////////////////////
package a;

import java.util.Scanner;

public class Incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
          else if(income>5f && income <= 10.0f){
           tax = tax + 0.05f * (5.0f - 2.5f);
           tax = tax + 0.2f * (income - 5f);
        }
           else if(income>10.0f){
           tax = tax + 0.05f * (5.0f - 2.5f);
           tax = tax + 0.2f * (10.0f - 5f);
           tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);


	}

}
