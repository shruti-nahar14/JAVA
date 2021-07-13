
public class invalidbalexception extends Exception
{
 private double bal;

invalidbalexception(double bal)
 {
	 this.bal=bal;
 }

public String toString() {
		// TODO Auto-generated method stub
		return "your acc bal < 1000";
	}
}
