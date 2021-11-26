package Exception;

public class unchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a=100;
          int b=0;
          int arr[]=new int[5];
          try
          {
        	  System.out.println(arr[10]);
        	  int c=100/0;
        	  System.out.println("division is "+c);
          }
          catch(ArithmeticException e)
          {
        	  System.out.println(e.getMessage());
        	  System.out.println(e);
          }
          catch(ArrayIndexOutOfBoundsException  e)
          {
        	System.out.println("Array Out of Bound Exception Ocurr ");  
          }
          finally
          {
        	  System.out.println("We are now in finally block ");
          }
	}

}
