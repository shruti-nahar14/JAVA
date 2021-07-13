
public class invalidexception1 extends Exception
{
	private int age;
	 public  invalidexception1(int age)
	 {
		 this.age=age;
	 }
	 public String toString()
	 {
		 return "age is less than 18";
	 }

}
