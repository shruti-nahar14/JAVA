/////////////////////////////
/*class:user_exception_class
 *Input:7
 *Output:
This is an exception
java.lang.ArithmeticException: This is an exception
	at user_exception_class.main(user_exception_class.java:41)
java.lang.ArithmeticException: This is an exception
Finished
Yes Finished
 *Description:Implementation of user defined exception
 *Date:10-08-2021
 *Author Name:Shruti Nahar
 *////////////////////////
import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}
public class user_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9){
            try{
                // throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}

