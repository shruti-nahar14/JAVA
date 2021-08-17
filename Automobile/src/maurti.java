
public class maurti implements Automobile {

	@Override
	public String getmodel() {
		// TODO Auto-generated method stub
		return "abc";
	}

	@Override
	public String getcolour() {
		// TODO Auto-generated method stub
		return "black";
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 5000000;
	}
	@Override
	public String toString()
	{
		return "MAURTI MODEL: "+getmodel() +
				"\nMAURTI COLOUR: "+getcolour() + 
				"\nMAURTI PRICE: "+getprice();
	}
}
