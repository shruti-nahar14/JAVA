package practiceset4;

public class starrecursion {

    public static void main(String[] args) {
     pattern1_rec(5);
    }
        
    	static void pattern1_rec(int n) 
    	{
	        if (n > 0) {
	            pattern1_rec(n - 1);
	            for (int i = 0; i < n; i++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
}
    