package innerclass;

public class OuterTest {
   private int data=100;
   private String name="Shruti";
   private static void outershow()
   {
	   System.out.println("From Outer Class......");
   }
public class InnerTest
{
   public void show()
   {
	   System.out.println("Information Name is: "+name+"\nId is: "+data);
	   outershow();
   }
    public class SecondInnerTest
    {
    	public void innersecond()
    	{
    		show();
    	    System.out.println("From Inner second........");
    	}
    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       OuterTest ot=new OuterTest();
       OuterTest.InnerTest it=ot.new InnerTest(); //The object of innerclass is initiated by using outer class object
       //it.show();
       OuterTest.InnerTest.SecondInnerTest st=it.new SecondInnerTest();
       st.innersecond();
	}

}
