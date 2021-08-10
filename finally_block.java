/////////////////////////////
/*class:finally_block
 *Input:--
 *Output:
Cleaning up resources...This is the end of this function
5
0
I am finally for value of b = 9
0
I am finally for value of b = 8
1
I am finally for value of b = 7
1
I am finally for value of b = 6
1
I am finally for value of b = 5
1
I am finally for value of b = 4
2
I am finally for value of b = 3
3
I am finally for value of b = 2
7
I am finally for value of b = 1
java.lang.ArithmeticException: / by zero
I am finally for value of b = 0
16
Yes this is finally
 *Description:Implementation of finally block
 *Date:10-08-2021
 *Author Name:Shruti Nahar
 *////////////////////////

public class finally_block {
    public static int greet(){
        try{
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources...This is the end of this function");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

        try{
            System.out.println(50/3);
        }
        finally {
            System.out.println("Yes this is finally");
        }
    }
}


